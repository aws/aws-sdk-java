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
 * ContainerDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinitionJsonUnmarshaller implements Unmarshaller<ContainerDefinition, JsonUnmarshallerContext> {

    public ContainerDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerDefinition containerDefinition = new ContainerDefinition();

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
                    containerDefinition.setContainerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUri", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setImageUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResolvedImageDigest", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setResolvedImageDigest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MemoryLimits", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setMemoryLimits(ContainerMemoryLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PortConfiguration", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setPortConfiguration(ContainerPortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setHealthCheck(ContainerHealthCheckJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Command", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Essential", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setEssential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EntryPoint", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setEntryPoint(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("WorkingDirectory", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setEnvironment(new ListUnmarshaller<ContainerEnvironment>(ContainerEnvironmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DependsOn", targetDepth)) {
                    context.nextToken();
                    containerDefinition.setDependsOn(new ListUnmarshaller<ContainerDependency>(ContainerDependencyJsonUnmarshaller.getInstance())

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

        return containerDefinition;
    }

    private static ContainerDefinitionJsonUnmarshaller instance;

    public static ContainerDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonUnmarshaller();
        return instance;
    }
}
