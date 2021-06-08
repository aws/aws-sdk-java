/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeTrackerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrackerResultJsonUnmarshaller implements Unmarshaller<DescribeTrackerResult, JsonUnmarshallerContext> {

    public DescribeTrackerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTrackerResult describeTrackerResult = new DescribeTrackerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTrackerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PricingPlan", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setPricingPlan(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PricingPlanDataSource", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setPricingPlanDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TrackerArn", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setTrackerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrackerName", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setTrackerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    context.nextToken();
                    describeTrackerResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTrackerResult;
    }

    private static DescribeTrackerResultJsonUnmarshaller instance;

    public static DescribeTrackerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrackerResultJsonUnmarshaller();
        return instance;
    }
}
