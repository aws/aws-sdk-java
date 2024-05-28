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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutoScalingConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingConfigurationJsonUnmarshaller implements Unmarshaller<AutoScalingConfiguration, JsonUnmarshallerContext> {

    public AutoScalingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutoScalingConfiguration autoScalingConfiguration = new AutoScalingConfiguration();

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
                if (context.testExpression("minNodeCount", targetDepth)) {
                    context.nextToken();
                    autoScalingConfiguration.setMinNodeCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxNodeCount", targetDepth)) {
                    context.nextToken();
                    autoScalingConfiguration.setMaxNodeCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("autoScalingMetric", targetDepth)) {
                    context.nextToken();
                    autoScalingConfiguration.setAutoScalingMetric(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metricTarget", targetDepth)) {
                    context.nextToken();
                    autoScalingConfiguration.setMetricTarget(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("scaleInCooldownSeconds", targetDepth)) {
                    context.nextToken();
                    autoScalingConfiguration.setScaleInCooldownSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("scaleOutCooldownSeconds", targetDepth)) {
                    context.nextToken();
                    autoScalingConfiguration.setScaleOutCooldownSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return autoScalingConfiguration;
    }

    private static AutoScalingConfigurationJsonUnmarshaller instance;

    public static AutoScalingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingConfigurationJsonUnmarshaller();
        return instance;
    }
}
