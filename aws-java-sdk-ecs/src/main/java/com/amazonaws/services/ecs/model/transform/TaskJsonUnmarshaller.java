/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Task JSON Unmarshaller
 */
public class TaskJsonUnmarshaller implements Unmarshaller<Task, JsonUnmarshallerContext> {

    public Task unmarshall(JsonUnmarshallerContext context) throws Exception {
        Task task = new Task();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskArn", targetDepth)) {
                    context.nextToken();
                    task.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    task.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskDefinitionArn", targetDepth)) {
                    context.nextToken();
                    task.setTaskDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containerInstanceArn", targetDepth)) {
                    context.nextToken();
                    task.setContainerInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("overrides", targetDepth)) {
                    context.nextToken();
                    task.setOverrides(TaskOverrideJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastStatus", targetDepth)) {
                    context.nextToken();
                    task.setLastStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredStatus", targetDepth)) {
                    context.nextToken();
                    task.setDesiredStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containers", targetDepth)) {
                    context.nextToken();
                    task.setContainers(new ListUnmarshaller<Container>(ContainerJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    context.nextToken();
                    task.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    task.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("stoppedReason", targetDepth)) {
                    context.nextToken();
                    task.setStoppedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    task.setCreatedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    task.setStartedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("stoppedAt", targetDepth)) {
                    context.nextToken();
                    task.setStoppedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return task;
    }

    private static TaskJsonUnmarshaller instance;

    public static TaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskJsonUnmarshaller();
        return instance;
    }
}
