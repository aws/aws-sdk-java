/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeRetrainingSchedulerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRetrainingSchedulerResultJsonUnmarshaller implements Unmarshaller<DescribeRetrainingSchedulerResult, JsonUnmarshallerContext> {

    public DescribeRetrainingSchedulerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRetrainingSchedulerResult describeRetrainingSchedulerResult = new DescribeRetrainingSchedulerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeRetrainingSchedulerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetrainingStartDate", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setRetrainingStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RetrainingFrequency", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setRetrainingFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LookbackWindow", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setLookbackWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PromoteMode", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setPromoteMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    describeRetrainingSchedulerResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeRetrainingSchedulerResult;
    }

    private static DescribeRetrainingSchedulerResultJsonUnmarshaller instance;

    public static DescribeRetrainingSchedulerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRetrainingSchedulerResultJsonUnmarshaller();
        return instance;
    }
}
