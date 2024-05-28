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
 * AmazonTranscribeCallAnalyticsProcessorConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTranscribeCallAnalyticsProcessorConfigurationJsonUnmarshaller implements
        Unmarshaller<AmazonTranscribeCallAnalyticsProcessorConfiguration, JsonUnmarshallerContext> {

    public AmazonTranscribeCallAnalyticsProcessorConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AmazonTranscribeCallAnalyticsProcessorConfiguration amazonTranscribeCallAnalyticsProcessorConfiguration = new AmazonTranscribeCallAnalyticsProcessorConfiguration();

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
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyName", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setVocabularyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterName", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setVocabularyFilterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VocabularyFilterMethod", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setVocabularyFilterMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageModelName", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setLanguageModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnablePartialResultsStabilization", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setEnablePartialResultsStabilization(context.getUnmarshaller(Boolean.class).unmarshall(
                            context));
                }
                if (context.testExpression("PartialResultsStability", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setPartialResultsStability(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentIdentificationType", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setContentIdentificationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentRedactionType", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setContentRedactionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PiiEntityTypes", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setPiiEntityTypes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterPartialResults", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setFilterPartialResults(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PostCallAnalyticsSettings", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setPostCallAnalyticsSettings(PostCallAnalyticsSettingsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("CallAnalyticsStreamCategories", targetDepth)) {
                    context.nextToken();
                    amazonTranscribeCallAnalyticsProcessorConfiguration.setCallAnalyticsStreamCategories(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return amazonTranscribeCallAnalyticsProcessorConfiguration;
    }

    private static AmazonTranscribeCallAnalyticsProcessorConfigurationJsonUnmarshaller instance;

    public static AmazonTranscribeCallAnalyticsProcessorConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AmazonTranscribeCallAnalyticsProcessorConfigurationJsonUnmarshaller();
        return instance;
    }
}
