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
package com.amazonaws.services.appsync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceJsonUnmarshaller implements Unmarshaller<DataSource, JsonUnmarshallerContext> {

    public DataSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataSource dataSource = new DataSource();

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
                if (context.testExpression("dataSourceArn", targetDepth)) {
                    context.nextToken();
                    dataSource.setDataSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    dataSource.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    dataSource.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    dataSource.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceRoleArn", targetDepth)) {
                    context.nextToken();
                    dataSource.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamodbConfig", targetDepth)) {
                    context.nextToken();
                    dataSource.setDynamodbConfig(DynamodbDataSourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaConfig", targetDepth)) {
                    context.nextToken();
                    dataSource.setLambdaConfig(LambdaDataSourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("elasticsearchConfig", targetDepth)) {
                    context.nextToken();
                    dataSource.setElasticsearchConfig(ElasticsearchDataSourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("httpConfig", targetDepth)) {
                    context.nextToken();
                    dataSource.setHttpConfig(HttpDataSourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("relationalDatabaseConfig", targetDepth)) {
                    context.nextToken();
                    dataSource.setRelationalDatabaseConfig(RelationalDatabaseDataSourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataSource;
    }

    private static DataSourceJsonUnmarshaller instance;

    public static DataSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceJsonUnmarshaller();
        return instance;
    }
}
