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
 * MediaInsightsPipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaInsightsPipelineJsonUnmarshaller implements Unmarshaller<MediaInsightsPipeline, JsonUnmarshallerContext> {

    public MediaInsightsPipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        MediaInsightsPipeline mediaInsightsPipeline = new MediaInsightsPipeline();

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
                if (context.testExpression("MediaPipelineId", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setMediaPipelineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaPipelineArn", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setMediaPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaInsightsPipelineConfigurationArn", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setMediaInsightsPipelineConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KinesisVideoStreamSourceRuntimeConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setKinesisVideoStreamSourceRuntimeConfiguration(KinesisVideoStreamSourceRuntimeConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("MediaInsightsRuntimeMetadata", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setMediaInsightsRuntimeMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("KinesisVideoStreamRecordingSourceRuntimeConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline
                            .setKinesisVideoStreamRecordingSourceRuntimeConfiguration(KinesisVideoStreamRecordingSourceRuntimeConfigurationJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("S3RecordingSinkRuntimeConfiguration", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setS3RecordingSinkRuntimeConfiguration(S3RecordingSinkRuntimeConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ElementStatuses", targetDepth)) {
                    context.nextToken();
                    mediaInsightsPipeline.setElementStatuses(new ListUnmarshaller<MediaInsightsPipelineElementStatus>(
                            MediaInsightsPipelineElementStatusJsonUnmarshaller.getInstance())

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

        return mediaInsightsPipeline;
    }

    private static MediaInsightsPipelineJsonUnmarshaller instance;

    public static MediaInsightsPipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaInsightsPipelineJsonUnmarshaller();
        return instance;
    }
}
