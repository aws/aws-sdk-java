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
package com.amazonaws.services.workspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkspaceRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceRequestJsonUnmarshaller implements Unmarshaller<WorkspaceRequest, JsonUnmarshallerContext> {

    public WorkspaceRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkspaceRequest workspaceRequest = new WorkspaceRequest();

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
                if (context.testExpression("DirectoryId", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserName", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BundleId", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeEncryptionKey", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setVolumeEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserVolumeEncryptionEnabled", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setUserVolumeEncryptionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RootVolumeEncryptionEnabled", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setRootVolumeEncryptionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("WorkspaceProperties", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setWorkspaceProperties(WorkspacePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    workspaceRequest.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workspaceRequest;
    }

    private static WorkspaceRequestJsonUnmarshaller instance;

    public static WorkspaceRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceRequestJsonUnmarshaller();
        return instance;
    }
}
