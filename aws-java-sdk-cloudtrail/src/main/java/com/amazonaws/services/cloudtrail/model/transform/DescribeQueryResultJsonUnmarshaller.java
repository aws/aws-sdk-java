/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeQueryResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQueryResultJsonUnmarshaller implements Unmarshaller<DescribeQueryResult, JsonUnmarshallerContext> {

    public DescribeQueryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeQueryResult describeQueryResult = new DescribeQueryResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeQueryResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("QueryId", targetDepth)) {
                    context.nextToken();
                    describeQueryResult.setQueryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    context.nextToken();
                    describeQueryResult.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryStatus", targetDepth)) {
                    context.nextToken();
                    describeQueryResult.setQueryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryStatistics", targetDepth)) {
                    context.nextToken();
                    describeQueryResult.setQueryStatistics(QueryStatisticsForDescribeQueryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    describeQueryResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryS3Uri", targetDepth)) {
                    context.nextToken();
                    describeQueryResult.setDeliveryS3Uri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryStatus", targetDepth)) {
                    context.nextToken();
                    describeQueryResult.setDeliveryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeQueryResult;
    }

    private static DescribeQueryResultJsonUnmarshaller instance;

    public static DescribeQueryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeQueryResultJsonUnmarshaller();
        return instance;
    }
}
