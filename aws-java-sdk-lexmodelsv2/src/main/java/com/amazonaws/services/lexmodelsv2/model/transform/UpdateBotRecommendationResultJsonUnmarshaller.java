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
 * UpdateBotRecommendationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotRecommendationResultJsonUnmarshaller implements Unmarshaller<UpdateBotRecommendationResult, JsonUnmarshallerContext> {

    public UpdateBotRecommendationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateBotRecommendationResult updateBotRecommendationResult = new UpdateBotRecommendationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateBotRecommendationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botRecommendationStatus", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setBotRecommendationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botRecommendationId", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setBotRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("transcriptSourceSetting", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setTranscriptSourceSetting(TranscriptSourceSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryptionSetting", targetDepth)) {
                    context.nextToken();
                    updateBotRecommendationResult.setEncryptionSetting(EncryptionSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateBotRecommendationResult;
    }

    private static UpdateBotRecommendationResultJsonUnmarshaller instance;

    public static UpdateBotRecommendationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateBotRecommendationResultJsonUnmarshaller();
        return instance;
    }
}
