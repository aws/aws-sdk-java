/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Eac3AtmosSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Eac3AtmosSettingsJsonUnmarshaller implements Unmarshaller<Eac3AtmosSettings, JsonUnmarshallerContext> {

    public Eac3AtmosSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Eac3AtmosSettings eac3AtmosSettings = new Eac3AtmosSettings();

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
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bitstreamMode", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setBitstreamMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codingMode", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setCodingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dialogueIntelligence", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setDialogueIntelligence(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamicRangeCompressionLine", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setDynamicRangeCompressionLine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamicRangeCompressionRf", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setDynamicRangeCompressionRf(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loRoCenterMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setLoRoCenterMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("loRoSurroundMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setLoRoSurroundMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ltRtCenterMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setLtRtCenterMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ltRtSurroundMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setLtRtSurroundMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("meteringMode", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setMeteringMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleRate", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setSampleRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("speechThreshold", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setSpeechThreshold(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stereoDownmix", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setStereoDownmix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("surroundExMode", targetDepth)) {
                    context.nextToken();
                    eac3AtmosSettings.setSurroundExMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eac3AtmosSettings;
    }

    private static Eac3AtmosSettingsJsonUnmarshaller instance;

    public static Eac3AtmosSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Eac3AtmosSettingsJsonUnmarshaller();
        return instance;
    }
}
