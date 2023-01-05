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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartBotRecommendationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBotRecommendationResultJsonUnmarshaller implements Unmarshaller<StartBotRecommendationResult, JsonUnmarshallerContext> {

    public StartBotRecommendationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartBotRecommendationResult startBotRecommendationResult = new StartBotRecommendationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startBotRecommendationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botRecommendationStatus", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setBotRecommendationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botRecommendationId", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setBotRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("transcriptSourceSetting", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setTranscriptSourceSetting(TranscriptSourceSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryptionSetting", targetDepth)) {
                    context.nextToken();
                    startBotRecommendationResult.setEncryptionSetting(EncryptionSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startBotRecommendationResult;
    }

    private static StartBotRecommendationResultJsonUnmarshaller instance;

    public static StartBotRecommendationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartBotRecommendationResultJsonUnmarshaller();
        return instance;
    }
}
