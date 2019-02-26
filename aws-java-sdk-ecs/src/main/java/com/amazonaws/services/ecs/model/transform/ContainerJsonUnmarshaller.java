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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Container JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerJsonUnmarshaller implements Unmarshaller<Container, JsonUnmarshallerContext> {

    public Container unmarshall(JsonUnmarshallerContext context) throws Exception {
        Container container = new Container();

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
                if (context.testExpression("containerArn", targetDepth)) {
                    context.nextToken();
                    container.setContainerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskArn", targetDepth)) {
                    context.nextToken();
                    container.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    container.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStatus", targetDepth)) {
                    context.nextToken();
                    container.setLastStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("exitCode", targetDepth)) {
                    context.nextToken();
                    container.setExitCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    container.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkBindings", targetDepth)) {
                    context.nextToken();
                    container.setNetworkBindings(new ListUnmarshaller<NetworkBinding>(NetworkBindingJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("networkInterfaces", targetDepth)) {
                    context.nextToken();
                    container.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("healthStatus", targetDepth)) {
                    context.nextToken();
                    container.setHealthStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    context.nextToken();
                    container.setCpu(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    context.nextToken();
                    container.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("memoryReservation", targetDepth)) {
                    context.nextToken();
                    container.setMemoryReservation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gpuIds", targetDepth)) {
                    context.nextToken();
                    container.setGpuIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return container;
    }

    private static ContainerJsonUnmarshaller instance;

    public static ContainerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerJsonUnmarshaller();
        return instance;
    }
}
