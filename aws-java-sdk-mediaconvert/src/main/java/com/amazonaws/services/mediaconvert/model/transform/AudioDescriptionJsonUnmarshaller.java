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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AudioDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioDescriptionJsonUnmarshaller implements Unmarshaller<AudioDescription, JsonUnmarshallerContext> {

    public AudioDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AudioDescription audioDescription = new AudioDescription();

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
                if (context.testExpression("audioNormalizationSettings", targetDepth)) {
                    context.nextToken();
                    audioDescription.setAudioNormalizationSettings(AudioNormalizationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("audioSourceName", targetDepth)) {
                    context.nextToken();
                    audioDescription.setAudioSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioType", targetDepth)) {
                    context.nextToken();
                    audioDescription.setAudioType(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("audioTypeControl", targetDepth)) {
                    context.nextToken();
                    audioDescription.setAudioTypeControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codecSettings", targetDepth)) {
                    context.nextToken();
                    audioDescription.setCodecSettings(AudioCodecSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customLanguageCode", targetDepth)) {
                    context.nextToken();
                    audioDescription.setCustomLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("languageCode", targetDepth)) {
                    context.nextToken();
                    audioDescription.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("languageCodeControl", targetDepth)) {
                    context.nextToken();
                    audioDescription.setLanguageCodeControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remixSettings", targetDepth)) {
                    context.nextToken();
                    audioDescription.setRemixSettings(RemixSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("streamName", targetDepth)) {
                    context.nextToken();
                    audioDescription.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return audioDescription;
    }

    private static AudioDescriptionJsonUnmarshaller instance;

    public static AudioDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AudioDescriptionJsonUnmarshaller();
        return instance;
    }
}
