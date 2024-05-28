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
 * DeleteWorkspaceServiceAccountTokenResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkspaceServiceAccountTokenResultJsonUnmarshaller implements
        Unmarshaller<DeleteWorkspaceServiceAccountTokenResult, JsonUnmarshallerContext> {

    public DeleteWorkspaceServiceAccountTokenResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteWorkspaceServiceAccountTokenResult deleteWorkspaceServiceAccountTokenResult = new DeleteWorkspaceServiceAccountTokenResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteWorkspaceServiceAccountTokenResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("serviceAccountId", targetDepth)) {
                    context.nextToken();
                    deleteWorkspaceServiceAccountTokenResult.setServiceAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tokenId", targetDepth)) {
                    context.nextToken();
                    deleteWorkspaceServiceAccountTokenResult.setTokenId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workspaceId", targetDepth)) {
                    context.nextToken();
                    deleteWorkspaceServiceAccountTokenResult.setWorkspaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deleteWorkspaceServiceAccountTokenResult;
    }

    private static DeleteWorkspaceServiceAccountTokenResultJsonUnmarshaller instance;

    public static DeleteWorkspaceServiceAccountTokenResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteWorkspaceServiceAccountTokenResultJsonUnmarshaller();
        return instance;
    }
}
