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
 * WorkspaceBundle JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceBundleJsonUnmarshaller implements Unmarshaller<WorkspaceBundle, JsonUnmarshallerContext> {

    public WorkspaceBundle unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkspaceBundle workspaceBundle = new WorkspaceBundle();

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
                if (context.testExpression("BundleId", targetDepth)) {
                    context.nextToken();
                    workspaceBundle.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    workspaceBundle.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    context.nextToken();
                    workspaceBundle.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    workspaceBundle.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootStorage", targetDepth)) {
                    context.nextToken();
                    workspaceBundle.setRootStorage(RootStorageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UserStorage", targetDepth)) {
                    context.nextToken();
                    workspaceBundle.setUserStorage(UserStorageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ComputeType", targetDepth)) {
                    context.nextToken();
                    workspaceBundle.setComputeType(ComputeTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workspaceBundle;
    }

    private static WorkspaceBundleJsonUnmarshaller instance;

    public static WorkspaceBundleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceBundleJsonUnmarshaller();
        return instance;
    }
}
