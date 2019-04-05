/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VideoParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoParametersJsonUnmarshaller implements Unmarshaller<VideoParameters, JsonUnmarshallerContext> {

    public VideoParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        VideoParameters videoParameters = new VideoParameters();

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
                if (context.testExpression("Codec", targetDepth)) {
                    context.nextToken();
                    videoParameters.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodecOptions", targetDepth)) {
                    context.nextToken();
                    videoParameters.setCodecOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("KeyframesMaxDist", targetDepth)) {
                    context.nextToken();
                    videoParameters.setKeyframesMaxDist(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FixedGOP", targetDepth)) {
                    context.nextToken();
                    videoParameters.setFixedGOP(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BitRate", targetDepth)) {
                    context.nextToken();
                    videoParameters.setBitRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FrameRate", targetDepth)) {
                    context.nextToken();
                    videoParameters.setFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxFrameRate", targetDepth)) {
                    context.nextToken();
                    videoParameters.setMaxFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resolution", targetDepth)) {
                    context.nextToken();
                    videoParameters.setResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AspectRatio", targetDepth)) {
                    context.nextToken();
                    videoParameters.setAspectRatio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxWidth", targetDepth)) {
                    context.nextToken();
                    videoParameters.setMaxWidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxHeight", targetDepth)) {
                    context.nextToken();
                    videoParameters.setMaxHeight(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayAspectRatio", targetDepth)) {
                    context.nextToken();
                    videoParameters.setDisplayAspectRatio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizingPolicy", targetDepth)) {
                    context.nextToken();
                    videoParameters.setSizingPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaddingPolicy", targetDepth)) {
                    context.nextToken();
                    videoParameters.setPaddingPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Watermarks", targetDepth)) {
                    context.nextToken();
                    videoParameters.setWatermarks(new ListUnmarshaller<PresetWatermark>(PresetWatermarkJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return videoParameters;
    }

    private static VideoParametersJsonUnmarshaller instance;

    public static VideoParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VideoParametersJsonUnmarshaller();
        return instance;
    }
}
