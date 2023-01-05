/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateExtensionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExtensionResultJsonUnmarshaller implements Unmarshaller<UpdateExtensionResult, JsonUnmarshallerContext> {

    public UpdateExtensionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateExtensionResult updateExtensionResult = new UpdateExtensionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateExtensionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    updateExtensionResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    updateExtensionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionNumber", targetDepth)) {
                    context.nextToken();
                    updateExtensionResult.setVersionNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    updateExtensionResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updateExtensionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Actions", targetDepth)) {
                    context.nextToken();
                    updateExtensionResult.setActions(new MapUnmarshaller<String, java.util.List<Action>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<Action>(ActionJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    updateExtensionResult.setParameters(new MapUnmarshaller<String, Parameter>(context.getUnmarshaller(String.class), ParameterJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateExtensionResult;
    }

    private static UpdateExtensionResultJsonUnmarshaller instance;

    public static UpdateExtensionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateExtensionResultJsonUnmarshaller();
        return instance;
    }
}
