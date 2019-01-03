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
 * Workspace JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceJsonUnmarshaller implements Unmarshaller<Workspace, JsonUnmarshallerContext> {

    public Workspace unmarshall(JsonUnmarshallerContext context) throws Exception {
        Workspace workspace = new Workspace();

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
                if (context.testExpression("WorkspaceId", targetDepth)) {
                    context.nextToken();
                    workspace.setWorkspaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectoryId", targetDepth)) {
                    context.nextToken();
                    workspace.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserName", targetDepth)) {
                    context.nextToken();
                    workspace.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    workspace.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    workspace.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BundleId", targetDepth)) {
                    context.nextToken();
                    workspace.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    workspace.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    workspace.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCode", targetDepth)) {
                    context.nextToken();
                    workspace.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputerName", targetDepth)) {
                    context.nextToken();
                    workspace.setComputerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeEncryptionKey", targetDepth)) {
                    context.nextToken();
                    workspace.setVolumeEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserVolumeEncryptionEnabled", targetDepth)) {
                    context.nextToken();
                    workspace.setUserVolumeEncryptionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RootVolumeEncryptionEnabled", targetDepth)) {
                    context.nextToken();
                    workspace.setRootVolumeEncryptionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("WorkspaceProperties", targetDepth)) {
                    context.nextToken();
                    workspace.setWorkspaceProperties(WorkspacePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModificationStates", targetDepth)) {
                    context.nextToken();
                    workspace.setModificationStates(new ListUnmarshaller<ModificationState>(ModificationStateJsonUnmarshaller.getInstance())
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

        return workspace;
    }

    private static WorkspaceJsonUnmarshaller instance;

    public static WorkspaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceJsonUnmarshaller();
        return instance;
    }
}
