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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateBotLocaleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotLocaleResultJsonUnmarshaller implements Unmarshaller<CreateBotLocaleResult, JsonUnmarshallerContext> {

    public CreateBotLocaleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateBotLocaleResult createBotLocaleResult = new CreateBotLocaleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createBotLocaleResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeName", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setLocaleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nluIntentConfidenceThreshold", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setNluIntentConfidenceThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("voiceSettings", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setVoiceSettings(VoiceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botLocaleStatus", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setBotLocaleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    createBotLocaleResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createBotLocaleResult;
    }

    private static CreateBotLocaleResultJsonUnmarshaller instance;

    public static CreateBotLocaleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateBotLocaleResultJsonUnmarshaller();
        return instance;
    }
}
