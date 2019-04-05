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
 * ActionTypeSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeSettingsJsonUnmarshaller implements Unmarshaller<ActionTypeSettings, JsonUnmarshallerContext> {

    public ActionTypeSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionTypeSettings actionTypeSettings = new ActionTypeSettings();

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
                if (context.testExpression("thirdPartyConfigurationUrl", targetDepth)) {
                    context.nextToken();
                    actionTypeSettings.setThirdPartyConfigurationUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityUrlTemplate", targetDepth)) {
                    context.nextToken();
                    actionTypeSettings.setEntityUrlTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionUrlTemplate", targetDepth)) {
                    context.nextToken();
                    actionTypeSettings.setExecutionUrlTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revisionUrlTemplate", targetDepth)) {
                    context.nextToken();
                    actionTypeSettings.setRevisionUrlTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionTypeSettings;
    }

    private static ActionTypeSettingsJsonUnmarshaller instance;

    public static ActionTypeSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionTypeSettingsJsonUnmarshaller();
        return instance;
    }
}
