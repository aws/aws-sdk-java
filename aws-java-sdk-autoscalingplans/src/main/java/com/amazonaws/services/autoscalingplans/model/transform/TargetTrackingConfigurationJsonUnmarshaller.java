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
package com.amazonaws.services.autoscalingplans.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.autoscalingplans.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TargetTrackingConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingConfigurationJsonUnmarshaller implements Unmarshaller<TargetTrackingConfiguration, JsonUnmarshallerContext> {

    public TargetTrackingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        TargetTrackingConfiguration targetTrackingConfiguration = new TargetTrackingConfiguration();

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
                if (context.testExpression("PredefinedScalingMetricSpecification", targetDepth)) {
                    context.nextToken();
                    targetTrackingConfiguration.setPredefinedScalingMetricSpecification(PredefinedScalingMetricSpecificationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("CustomizedScalingMetricSpecification", targetDepth)) {
                    context.nextToken();
                    targetTrackingConfiguration.setCustomizedScalingMetricSpecification(CustomizedScalingMetricSpecificationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("TargetValue", targetDepth)) {
                    context.nextToken();
                    targetTrackingConfiguration.setTargetValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("DisableScaleIn", targetDepth)) {
                    context.nextToken();
                    targetTrackingConfiguration.setDisableScaleIn(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ScaleOutCooldown", targetDepth)) {
                    context.nextToken();
                    targetTrackingConfiguration.setScaleOutCooldown(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ScaleInCooldown", targetDepth)) {
                    context.nextToken();
                    targetTrackingConfiguration.setScaleInCooldown(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedInstanceWarmup", targetDepth)) {
                    context.nextToken();
                    targetTrackingConfiguration.setEstimatedInstanceWarmup(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return targetTrackingConfiguration;
    }

    private static TargetTrackingConfigurationJsonUnmarshaller instance;

    public static TargetTrackingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetTrackingConfigurationJsonUnmarshaller();
        return instance;
    }
}
