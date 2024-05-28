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
 * MediaInsightsPipelineConfigurationElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaInsightsPipelineConfigurationElementJsonUnmarshaller implements
        Unmarshaller<MediaInsightsPipelineConfigurationElement, JsonUnmarshallerContext> {

    public MediaInsightsPipelineConfigurationElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        MediaInsightsPipelineConfigurationElement mediaInsightsPipelineConfigurationElement = new MediaInsightsPipelineConfigurationElement();

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
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmazonTranscribeCallAnalyticsProcessorConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement
                            .setAmazonTranscribeCallAnalyticsProcessorConfiguration(AmazonTranscribeCallAnalyticsProcessorConfigurationJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("AmazonTranscribeProcessorConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setAmazonTranscribeProcessorConfiguration(AmazonTranscribeProcessorConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisDataStreamSinkConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setKinesisDataStreamSinkConfiguration(KinesisDataStreamSinkConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("S3RecordingSinkConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setS3RecordingSinkConfiguration(S3RecordingSinkConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("VoiceAnalyticsProcessorConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setVoiceAnalyticsProcessorConfiguration(VoiceAnalyticsProcessorConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("LambdaFunctionSinkConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setLambdaFunctionSinkConfiguration(LambdaFunctionSinkConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("SqsQueueSinkConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setSqsQueueSinkConfiguration(SqsQueueSinkConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("SnsTopicSinkConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setSnsTopicSinkConfiguration(SnsTopicSinkConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("VoiceEnhancementSinkConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipelineConfigurationElement.setVoiceEnhancementSinkConfiguration(VoiceEnhancementSinkConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mediaInsightsPipelineConfigurationElement;
    }

    private static MediaInsightsPipelineConfigurationElementJsonUnmarshaller instance;

    public static MediaInsightsPipelineConfigurationElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaInsightsPipelineConfigurationElementJsonUnmarshaller();
        return instance;
    }
}
