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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmediapipelines.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MediaLiveConnectorPipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaLiveConnectorPipelineJsonUnmarshaller implements Unmarshaller<MediaLiveConnectorPipeline, JsonUnmarshallerContext> {

    public MediaLiveConnectorPipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        MediaLiveConnectorPipeline mediaLiveConnectorPipeline = new MediaLiveConnectorPipeline();

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
                if (context.testExpression("Sources", targetDepth)) {
                    context.nextToken();
                    mediaLiveConnectorPipeline.setSources(new ListUnmarshaller<LiveConnectorSourceConfiguration>(
                            LiveConnectorSourceConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Sinks", targetDepth)) {
                    context.nextToken();
                    mediaLiveConnectorPipeline.setSinks(new ListUnmarshaller<LiveConnectorSinkConfiguration>(LiveConnectorSinkConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MediaPipelineId", targetDepth)) {
                    context.nextToken();
                    mediaLiveConnectorPipeline.setMediaPipelineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaPipelineArn", targetDepth)) {
                    context.nextToken();
                    mediaLiveConnectorPipeline.setMediaPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    mediaLiveConnectorPipeline.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    mediaLiveConnectorPipeline.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    mediaLiveConnectorPipeline.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mediaLiveConnectorPipeline;
    }

    private static MediaLiveConnectorPipelineJsonUnmarshaller instance;

    public static MediaLiveConnectorPipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaLiveConnectorPipelineJsonUnmarshaller();
        return instance;
    }
}
