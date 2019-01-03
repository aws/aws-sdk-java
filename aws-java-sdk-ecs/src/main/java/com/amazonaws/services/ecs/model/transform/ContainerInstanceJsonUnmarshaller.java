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
 * ContainerInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerInstanceJsonUnmarshaller implements Unmarshaller<ContainerInstance, JsonUnmarshallerContext> {

    public ContainerInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerInstance containerInstance = new ContainerInstance();

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
                if (context.testExpression("containerInstanceArn", targetDepth)) {
                    context.nextToken();
                    containerInstance.setContainerInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2InstanceId", targetDepth)) {
                    context.nextToken();
                    containerInstance.setEc2InstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    containerInstance.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("versionInfo", targetDepth)) {
                    context.nextToken();
                    containerInstance.setVersionInfo(VersionInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("remainingResources", targetDepth)) {
                    context.nextToken();
                    containerInstance.setRemainingResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("registeredResources", targetDepth)) {
                    context.nextToken();
                    containerInstance.setRegisteredResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    containerInstance.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("agentConnected", targetDepth)) {
                    context.nextToken();
                    containerInstance.setAgentConnected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("runningTasksCount", targetDepth)) {
                    context.nextToken();
                    containerInstance.setRunningTasksCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pendingTasksCount", targetDepth)) {
                    context.nextToken();
                    containerInstance.setPendingTasksCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("agentUpdateStatus", targetDepth)) {
                    context.nextToken();
                    containerInstance.setAgentUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    context.nextToken();
                    containerInstance.setAttributes(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("registeredAt", targetDepth)) {
                    context.nextToken();
                    containerInstance.setRegisteredAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("attachments", targetDepth)) {
                    context.nextToken();
                    containerInstance.setAttachments(new ListUnmarshaller<Attachment>(AttachmentJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    containerInstance.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return containerInstance;
    }

    private static ContainerInstanceJsonUnmarshaller instance;

    public static ContainerInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerInstanceJsonUnmarshaller();
        return instance;
    }
}
