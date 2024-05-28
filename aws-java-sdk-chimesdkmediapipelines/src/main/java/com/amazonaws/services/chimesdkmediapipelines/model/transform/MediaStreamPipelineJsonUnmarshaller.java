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
 * MediaStreamPipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaStreamPipelineJsonUnmarshaller implements Unmarshaller<MediaStreamPipeline, JsonUnmarshallerContext> {

    public MediaStreamPipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        MediaStreamPipeline mediaStreamPipeline = new MediaStreamPipeline();

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
                    mediaStreamPipeline.setMediaPipelineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaPipelineArn", targetDepth)) {
                    context.nextToken();
                    mediaStreamPipeline.setMediaPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    mediaStreamPipeline.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    mediaStreamPipeline.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    mediaStreamPipeline.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sources", targetDepth)) {
                    context.nextToken();
                    mediaStreamPipeline.setSources(new ListUnmarshaller<MediaStreamSource>(MediaStreamSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Sinks", targetDepth)) {
                    context.nextToken();
                    mediaStreamPipeline.setSinks(new ListUnmarshaller<MediaStreamSink>(MediaStreamSinkJsonUnmarshaller.getInstance())

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

        return mediaStreamPipeline;
    }

    private static MediaStreamPipelineJsonUnmarshaller instance;

    public static MediaStreamPipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaStreamPipelineJsonUnmarshaller();
        return instance;
    }
}
