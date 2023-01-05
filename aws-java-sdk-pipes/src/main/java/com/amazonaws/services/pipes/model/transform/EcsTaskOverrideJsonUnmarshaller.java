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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EcsTaskOverride JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsTaskOverrideJsonUnmarshaller implements Unmarshaller<EcsTaskOverride, JsonUnmarshallerContext> {

    public EcsTaskOverride unmarshall(JsonUnmarshallerContext context) throws Exception {
        EcsTaskOverride ecsTaskOverride = new EcsTaskOverride();

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
                if (context.testExpression("ContainerOverrides", targetDepth)) {
                    context.nextToken();
                    ecsTaskOverride.setContainerOverrides(new ListUnmarshaller<EcsContainerOverride>(EcsContainerOverrideJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    context.nextToken();
                    ecsTaskOverride.setCpu(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EphemeralStorage", targetDepth)) {
                    context.nextToken();
                    ecsTaskOverride.setEphemeralStorage(EcsEphemeralStorageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    ecsTaskOverride.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceAcceleratorOverrides", targetDepth)) {
                    context.nextToken();
                    ecsTaskOverride.setInferenceAcceleratorOverrides(new ListUnmarshaller<EcsInferenceAcceleratorOverride>(
                            EcsInferenceAcceleratorOverrideJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Memory", targetDepth)) {
                    context.nextToken();
                    ecsTaskOverride.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskRoleArn", targetDepth)) {
                    context.nextToken();
                    ecsTaskOverride.setTaskRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ecsTaskOverride;
    }

    private static EcsTaskOverrideJsonUnmarshaller instance;

    public static EcsTaskOverrideJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EcsTaskOverrideJsonUnmarshaller();
        return instance;
    }
}
