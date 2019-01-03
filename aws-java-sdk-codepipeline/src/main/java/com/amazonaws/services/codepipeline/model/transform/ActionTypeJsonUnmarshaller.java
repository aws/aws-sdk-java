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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActionType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeJsonUnmarshaller implements Unmarshaller<ActionType, JsonUnmarshallerContext> {

    public ActionType unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionType actionType = new ActionType();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    actionType.setId(ActionTypeIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("settings", targetDepth)) {
                    context.nextToken();
                    actionType.setSettings(ActionTypeSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("actionConfigurationProperties", targetDepth)) {
                    context.nextToken();
                    actionType.setActionConfigurationProperties(new ListUnmarshaller<ActionConfigurationProperty>(ActionConfigurationPropertyJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("inputArtifactDetails", targetDepth)) {
                    context.nextToken();
                    actionType.setInputArtifactDetails(ArtifactDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputArtifactDetails", targetDepth)) {
                    context.nextToken();
                    actionType.setOutputArtifactDetails(ArtifactDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionType;
    }

    private static ActionTypeJsonUnmarshaller instance;

    public static ActionTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionTypeJsonUnmarshaller();
        return instance;
    }
}
