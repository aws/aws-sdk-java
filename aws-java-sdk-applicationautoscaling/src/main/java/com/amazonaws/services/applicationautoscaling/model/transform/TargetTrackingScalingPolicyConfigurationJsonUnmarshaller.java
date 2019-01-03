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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TargetTrackingScalingPolicyConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingScalingPolicyConfigurationJsonUnmarshaller implements
        Unmarshaller<TargetTrackingScalingPolicyConfiguration, JsonUnmarshallerContext> {

    public TargetTrackingScalingPolicyConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration = new TargetTrackingScalingPolicyConfiguration();

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
                if (context.testExpression("TargetValue", targetDepth)) {
                    context.nextToken();
                    targetTrackingScalingPolicyConfiguration.setTargetValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("PredefinedMetricSpecification", targetDepth)) {
                    context.nextToken();
                    targetTrackingScalingPolicyConfiguration.setPredefinedMetricSpecification(PredefinedMetricSpecificationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("CustomizedMetricSpecification", targetDepth)) {
                    context.nextToken();
                    targetTrackingScalingPolicyConfiguration.setCustomizedMetricSpecification(CustomizedMetricSpecificationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ScaleOutCooldown", targetDepth)) {
                    context.nextToken();
                    targetTrackingScalingPolicyConfiguration.setScaleOutCooldown(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ScaleInCooldown", targetDepth)) {
                    context.nextToken();
                    targetTrackingScalingPolicyConfiguration.setScaleInCooldown(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DisableScaleIn", targetDepth)) {
                    context.nextToken();
                    targetTrackingScalingPolicyConfiguration.setDisableScaleIn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return targetTrackingScalingPolicyConfiguration;
    }

    private static TargetTrackingScalingPolicyConfigurationJsonUnmarshaller instance;

    public static TargetTrackingScalingPolicyConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetTrackingScalingPolicyConfigurationJsonUnmarshaller();
        return instance;
    }
}
