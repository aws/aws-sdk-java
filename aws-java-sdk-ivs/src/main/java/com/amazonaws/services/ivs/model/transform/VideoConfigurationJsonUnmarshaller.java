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
package com.amazonaws.services.ivs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ivs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VideoConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoConfigurationJsonUnmarshaller implements Unmarshaller<VideoConfiguration, JsonUnmarshallerContext> {

    public VideoConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        VideoConfiguration videoConfiguration = new VideoConfiguration();

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
                if (context.testExpression("avcLevel", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setAvcLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("avcProfile", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setAvcProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codec", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encoder", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setEncoder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetBitrate", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setTargetBitrate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("targetFramerate", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setTargetFramerate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("videoHeight", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setVideoHeight(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("videoWidth", targetDepth)) {
                    context.nextToken();
                    videoConfiguration.setVideoWidth(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return videoConfiguration;
    }

    private static VideoConfigurationJsonUnmarshaller instance;

    public static VideoConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VideoConfigurationJsonUnmarshaller();
        return instance;
    }
}
