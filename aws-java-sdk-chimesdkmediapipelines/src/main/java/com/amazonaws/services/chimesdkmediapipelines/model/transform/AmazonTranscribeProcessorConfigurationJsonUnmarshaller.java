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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmediapipelines.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AmazonTranscribeProcessorConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranscribeProcessorConfigurationJsonUnmarshaller implements Unmarshaller<AmazonTranscribeProcessorConfiguration, JsonUnmarshallerContext> {

    public AmazonTranscribeProcessorConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AmazonTranscribeProcessorConfiguration amazonTranscribeProcessorConfiguration = new AmazonTranscribeProcessorConfiguration();

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
                    amazonTranscribeProcessorConfiguration.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyName", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setVocabularyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterName", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setVocabularyFilterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterMethod", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setVocabularyFilterMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShowSpeakerLabel", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setShowSpeakerLabel(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnablePartialResultsStabilization", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setEnablePartialResultsStabilization(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PartialResultsStability", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setPartialResultsStability(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentIdentificationType", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setContentIdentificationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentRedactionType", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setContentRedactionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PiiEntityTypes", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setPiiEntityTypes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageModelName", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setLanguageModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterPartialResults", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setFilterPartialResults(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IdentifyLanguage", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setIdentifyLanguage(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LanguageOptions", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setLanguageOptions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredLanguage", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setPreferredLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyNames", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setVocabularyNames(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterNames", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeProcessorConfiguration.setVocabularyFilterNames(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return amazonTranscribeProcessorConfiguration;
    }

    private static AmazonTranscribeProcessorConfigurationJsonUnmarshaller instance;

    public static AmazonTranscribeProcessorConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AmazonTranscribeProcessorConfigurationJsonUnmarshaller();
        return instance;
    }
}
