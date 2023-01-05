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
 * EcsContainerOverride JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsContainerOverrideJsonUnmarshaller implements Unmarshaller<EcsContainerOverride, JsonUnmarshallerContext> {

    public EcsContainerOverride unmarshall(JsonUnmarshallerContext context) throws Exception {
        EcsContainerOverride ecsContainerOverride = new EcsContainerOverride();

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
                if (context.testExpression("Command", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setEnvironment(new ListUnmarshaller<EcsEnvironmentVariable>(EcsEnvironmentVariableJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnvironmentFiles", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setEnvironmentFiles(new ListUnmarshaller<EcsEnvironmentFile>(EcsEnvironmentFileJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Memory", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MemoryReservation", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setMemoryReservation(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceRequirements", targetDepth)) {
                    context.nextToken();
                    ecsContainerOverride.setResourceRequirements(new ListUnmarshaller<EcsResourceRequirement>(EcsResourceRequirementJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ecsContainerOverride;
    }

    private static EcsContainerOverrideJsonUnmarshaller instance;

    public static EcsContainerOverrideJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EcsContainerOverrideJsonUnmarshaller();
        return instance;
    }
}
