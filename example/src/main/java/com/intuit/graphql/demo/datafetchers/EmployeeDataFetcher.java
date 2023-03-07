package com.intuit.graphql.demo.datafetchers;

import com.intuit.graphql.demo.service.AddressService;
import com.intuit.graphql.filter.client.ExpressionFormat;
import com.intuit.graphql.filter.client.FilterExpression;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

/**
 * This data fetcher demonstrate the n+1 problem.
 */
@Component
public class EmployeeDataFetcher {

    @Autowired
    private AddressService addressService;

    private static ThreadLocal<String> dataFetcherContext = new ThreadLocal<>();

    public DataFetcher searchAccounts() {

        return new DataFetcher() {
            @Override
            public Object get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {
                FilterExpression.FilterExpressionBuilder builder = FilterExpression.newFilterExpressionBuilder();
                FilterExpression filterExpression = builder.args(dataFetchingEnvironment.getArguments())
                        .build();
                Criteria expression = filterExpression.getExpression(ExpressionFormat.MONGO);

                return  addressService.searchAccount(expression);

            }
        };
    }


}
