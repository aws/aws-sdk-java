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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerDefinitionInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinitionInputJsonUnmarshaller implements Unmarshaller<ContainerDefinitionInput, JsonUnmarshallerContext> {

    public ContainerDefinitionInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerDefinitionInput containerDefinitionInput = new ContainerDefinitionInput();

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
                if (context.testExpression("ContainerName", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setContainerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUri", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setImageUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MemoryLimits", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setMemoryLimits(ContainerMemoryLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PortConfiguration", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setPortConfiguration(ContainerPortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setHealthCheck(ContainerHealthCheckJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Command", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Essential", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setEssential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EntryPoint", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setEntryPoint(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("WorkingDirectory", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setEnvironment(new ListUnmarshaller<ContainerEnvironment>(ContainerEnvironmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DependsOn", targetDepth)) {
                    context.nextToken();
                    containerDefinitionInput.setDependsOn(new ListUnmarshaller<ContainerDependency>(ContainerDependencyJsonUnmarshaller.getInstance())

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

        return containerDefinitionInput;
    }

    private static ContainerDefinitionInputJsonUnmarshaller instance;

    public static ContainerDefinitionInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionInputJsonUnmarshaller();
        return instance;
    }
}
