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
 * ScalingPlan JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPlanJsonUnmarshaller implements Unmarshaller<ScalingPlan, JsonUnmarshallerContext> {

    public ScalingPlan unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScalingPlan scalingPlan = new ScalingPlan();

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
                if (context.testExpression("ScalingPlanName", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setScalingPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalingPlanVersion", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setScalingPlanVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationSource", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setApplicationSource(ApplicationSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ScalingInstructions", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setScalingInstructions(new ListUnmarshaller<ScalingInstruction>(ScalingInstructionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("StatusCode", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusStartTime", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setStatusStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    scalingPlan.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scalingPlan;
    }

    private static ScalingPlanJsonUnmarshaller instance;

    public static ScalingPlanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalingPlanJsonUnmarshaller();
        return instance;
    }
}
