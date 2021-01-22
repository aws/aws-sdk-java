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
 * UpdateBotLocaleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotLocaleResultJsonUnmarshaller implements Unmarshaller<UpdateBotLocaleResult, JsonUnmarshallerContext> {

    public UpdateBotLocaleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateBotLocaleResult updateBotLocaleResult = new UpdateBotLocaleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateBotLocaleResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeName", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setLocaleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nluIntentConfidenceThreshold", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setNluIntentConfidenceThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("voiceSettings", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setVoiceSettings(VoiceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botLocaleStatus", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setBotLocaleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    updateBotLocaleResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateBotLocaleResult;
    }

    private static UpdateBotLocaleResultJsonUnmarshaller instance;

    public static UpdateBotLocaleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateBotLocaleResultJsonUnmarshaller();
        return instance;
    }
}
