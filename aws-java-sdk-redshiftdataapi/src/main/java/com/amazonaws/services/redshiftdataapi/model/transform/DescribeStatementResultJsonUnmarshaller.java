/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftdataapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftdataapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeStatementResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStatementResultJsonUnmarshaller implements Unmarshaller<DescribeStatementResult, JsonUnmarshallerContext> {

    public DescribeStatementResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeStatementResult describeStatementResult = new DescribeStatementResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeStatementResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbUser", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setDbUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Error", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RedshiftPid", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setRedshiftPid(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("RedshiftQueryId", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setRedshiftQueryId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ResultRows", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setResultRows(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ResultSize", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setResultSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    describeStatementResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeStatementResult;
    }

    private static DescribeStatementResultJsonUnmarshaller instance;

    public static DescribeStatementResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeStatementResultJsonUnmarshaller();
        return instance;
    }
}
