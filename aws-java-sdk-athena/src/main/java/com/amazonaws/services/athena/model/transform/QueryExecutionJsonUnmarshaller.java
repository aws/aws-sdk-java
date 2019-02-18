/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QueryExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecutionJsonUnmarshaller implements Unmarshaller<QueryExecution, JsonUnmarshallerContext> {

    public QueryExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        QueryExecution queryExecution = new QueryExecution();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("QueryExecutionId", targetDepth)) {
                    context.nextToken();
                    queryExecution.setQueryExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Query", targetDepth)) {
                    context.nextToken();
                    queryExecution.setQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatementType", targetDepth)) {
                    context.nextToken();
                    queryExecution.setStatementType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultConfiguration", targetDepth)) {
                    context.nextToken();
                    queryExecution.setResultConfiguration(ResultConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QueryExecutionContext", targetDepth)) {
                    context.nextToken();
                    queryExecution.setQueryExecutionContext(QueryExecutionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    queryExecution.setStatus(QueryExecutionStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Statistics", targetDepth)) {
                    context.nextToken();
                    queryExecution.setStatistics(QueryExecutionStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WorkGroup", targetDepth)) {
                    context.nextToken();
                    queryExecution.setWorkGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return queryExecution;
    }

    private static QueryExecutionJsonUnmarshaller instance;

    public static QueryExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QueryExecutionJsonUnmarshaller();
        return instance;
    }
}
