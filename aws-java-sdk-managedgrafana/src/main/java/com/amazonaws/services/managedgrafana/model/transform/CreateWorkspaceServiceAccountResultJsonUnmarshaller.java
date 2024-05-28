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
package com.amazonaws.services.managedgrafana.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateWorkspaceServiceAccountResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceServiceAccountResultJsonUnmarshaller implements Unmarshaller<CreateWorkspaceServiceAccountResult, JsonUnmarshallerContext> {

    public CreateWorkspaceServiceAccountResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateWorkspaceServiceAccountResult createWorkspaceServiceAccountResult = new CreateWorkspaceServiceAccountResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createWorkspaceServiceAccountResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("grafanaRole", targetDepth)) {
                    context.nextToken();
                    createWorkspaceServiceAccountResult.setGrafanaRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createWorkspaceServiceAccountResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createWorkspaceServiceAccountResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workspaceId", targetDepth)) {
                    context.nextToken();
                    createWorkspaceServiceAccountResult.setWorkspaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createWorkspaceServiceAccountResult;
    }

    private static CreateWorkspaceServiceAccountResultJsonUnmarshaller instance;

    public static CreateWorkspaceServiceAccountResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateWorkspaceServiceAccountResultJsonUnmarshaller();
        return instance;
    }
}
