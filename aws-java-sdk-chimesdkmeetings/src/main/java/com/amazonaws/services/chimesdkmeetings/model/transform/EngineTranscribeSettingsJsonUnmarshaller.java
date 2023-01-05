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
package com.amazonaws.services.chimesdkmeetings.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmeetings.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EngineTranscribeSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineTranscribeSettingsJsonUnmarshaller implements Unmarshaller<EngineTranscribeSettings, JsonUnmarshallerContext> {

    public EngineTranscribeSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        EngineTranscribeSettings engineTranscribeSettings = new EngineTranscribeSettings();

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
                if (context.testExpression("LanguageCode", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterMethod", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setVocabularyFilterMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterName", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setVocabularyFilterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyName", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setVocabularyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnablePartialResultsStabilization", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setEnablePartialResultsStabilization(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PartialResultsStability", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setPartialResultsStability(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentIdentificationType", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setContentIdentificationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentRedactionType", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setContentRedactionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PiiEntityTypes", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setPiiEntityTypes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageModelName", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setLanguageModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentifyLanguage", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setIdentifyLanguage(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LanguageOptions", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setLanguageOptions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredLanguage", targetDepth)) {
                    context.nextToken();
                    engineTranscribeSettings.setPreferredLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return engineTranscribeSettings;
    }

    private static EngineTranscribeSettingsJsonUnmarshaller instance;

    public static EngineTranscribeSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EngineTranscribeSettingsJsonUnmarshaller();
        return instance;
    }
}
