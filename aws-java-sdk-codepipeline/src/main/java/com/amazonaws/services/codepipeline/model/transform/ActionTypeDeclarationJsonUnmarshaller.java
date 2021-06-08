/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActionTypeDeclaration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeDeclarationJsonUnmarshaller implements Unmarshaller<ActionTypeDeclaration, JsonUnmarshallerContext> {

    public ActionTypeDeclaration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionTypeDeclaration actionTypeDeclaration = new ActionTypeDeclaration();

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
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executor", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setExecutor(ActionTypeExecutorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setId(ActionTypeIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputArtifactDetails", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setInputArtifactDetails(ActionTypeArtifactDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputArtifactDetails", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setOutputArtifactDetails(ActionTypeArtifactDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("permissions", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setPermissions(ActionTypePermissionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("properties", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setProperties(new ListUnmarshaller<ActionTypeProperty>(ActionTypePropertyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("urls", targetDepth)) {
                    context.nextToken();
                    actionTypeDeclaration.setUrls(ActionTypeUrlsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionTypeDeclaration;
    }

    private static ActionTypeDeclarationJsonUnmarshaller instance;

    public static ActionTypeDeclarationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionTypeDeclarationJsonUnmarshaller();
        return instance;
    }
}
