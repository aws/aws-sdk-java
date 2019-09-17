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
 * ScalingInstruction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingInstructionJsonUnmarshaller implements Unmarshaller<ScalingInstruction, JsonUnmarshallerContext> {

    public ScalingInstruction unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScalingInstruction scalingInstruction = new ScalingInstruction();

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
                if (context.testExpression("ServiceNamespace", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setServiceNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalableDimension", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setScalableDimension(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinCapacity", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setMinCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setMaxCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetTrackingConfigurations", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setTargetTrackingConfigurations(new ListUnmarshaller<TargetTrackingConfiguration>(
                            TargetTrackingConfigurationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("PredefinedLoadMetricSpecification", targetDepth)) {
                    context.nextToken();
                    scalingInstruction
                            .setPredefinedLoadMetricSpecification(PredefinedLoadMetricSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomizedLoadMetricSpecification", targetDepth)) {
                    context.nextToken();
                    scalingInstruction
                            .setCustomizedLoadMetricSpecification(CustomizedLoadMetricSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ScheduledActionBufferTime", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setScheduledActionBufferTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PredictiveScalingMaxCapacityBehavior", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setPredictiveScalingMaxCapacityBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictiveScalingMaxCapacityBuffer", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setPredictiveScalingMaxCapacityBuffer(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PredictiveScalingMode", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setPredictiveScalingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalingPolicyUpdateBehavior", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setScalingPolicyUpdateBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisableDynamicScaling", targetDepth)) {
                    context.nextToken();
                    scalingInstruction.setDisableDynamicScaling(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scalingInstruction;
    }

    private static ScalingInstructionJsonUnmarshaller instance;

    public static ScalingInstructionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalingInstructionJsonUnmarshaller();
        return instance;
    }
}
