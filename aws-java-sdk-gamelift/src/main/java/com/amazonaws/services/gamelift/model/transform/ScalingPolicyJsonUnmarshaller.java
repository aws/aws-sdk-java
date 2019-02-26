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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScalingPolicy JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicyJsonUnmarshaller implements Unmarshaller<ScalingPolicy, JsonUnmarshallerContext> {

    public ScalingPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScalingPolicy scalingPolicy = new ScalingPolicy();

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
                if (context.testExpression("FleetId", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalingAdjustment", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setScalingAdjustment(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ScalingAdjustmentType", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setScalingAdjustmentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComparisonOperator", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setComparisonOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Threshold", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationPeriods", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setEvaluationPeriods(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyType", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setPolicyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetConfiguration", targetDepth)) {
                    context.nextToken();
                    scalingPolicy.setTargetConfiguration(TargetConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scalingPolicy;
    }

    private static ScalingPolicyJsonUnmarshaller instance;

    public static ScalingPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalingPolicyJsonUnmarshaller();
        return instance;
    }
}
