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
 * H264Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H264SettingsJsonUnmarshaller implements Unmarshaller<H264Settings, JsonUnmarshallerContext> {

    public H264Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        H264Settings h264Settings = new H264Settings();

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
                if (context.testExpression("adaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    h264Settings.setAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    h264Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("codecLevel", targetDepth)) {
                    context.nextToken();
                    h264Settings.setCodecLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codecProfile", targetDepth)) {
                    context.nextToken();
                    h264Settings.setCodecProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamicSubGop", targetDepth)) {
                    context.nextToken();
                    h264Settings.setDynamicSubGop(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entropyEncoding", targetDepth)) {
                    context.nextToken();
                    h264Settings.setEntropyEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fieldEncoding", targetDepth)) {
                    context.nextToken();
                    h264Settings.setFieldEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flickerAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    h264Settings.setFlickerAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    h264Settings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    h264Settings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    h264Settings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    h264Settings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopBReference", targetDepth)) {
                    context.nextToken();
                    h264Settings.setGopBReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gopClosedCadence", targetDepth)) {
                    context.nextToken();
                    h264Settings.setGopClosedCadence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopSize", targetDepth)) {
                    context.nextToken();
                    h264Settings.setGopSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("gopSizeUnits", targetDepth)) {
                    context.nextToken();
                    h264Settings.setGopSizeUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferInitialFillPercentage", targetDepth)) {
                    context.nextToken();
                    h264Settings.setHrdBufferInitialFillPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferSize", targetDepth)) {
                    context.nextToken();
                    h264Settings.setHrdBufferSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    context.nextToken();
                    h264Settings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    context.nextToken();
                    h264Settings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minIInterval", targetDepth)) {
                    context.nextToken();
                    h264Settings.setMinIInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberBFramesBetweenReferenceFrames", targetDepth)) {
                    context.nextToken();
                    h264Settings.setNumberBFramesBetweenReferenceFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberReferenceFrames", targetDepth)) {
                    context.nextToken();
                    h264Settings.setNumberReferenceFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parControl", targetDepth)) {
                    context.nextToken();
                    h264Settings.setParControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parDenominator", targetDepth)) {
                    context.nextToken();
                    h264Settings.setParDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parNumerator", targetDepth)) {
                    context.nextToken();
                    h264Settings.setParNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("qualityTuningLevel", targetDepth)) {
                    context.nextToken();
                    h264Settings.setQualityTuningLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("qvbrSettings", targetDepth)) {
                    context.nextToken();
                    h264Settings.setQvbrSettings(H264QvbrSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rateControlMode", targetDepth)) {
                    context.nextToken();
                    h264Settings.setRateControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repeatPps", targetDepth)) {
                    context.nextToken();
                    h264Settings.setRepeatPps(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sceneChangeDetect", targetDepth)) {
                    context.nextToken();
                    h264Settings.setSceneChangeDetect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slices", targetDepth)) {
                    context.nextToken();
                    h264Settings.setSlices(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    context.nextToken();
                    h264Settings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softness", targetDepth)) {
                    context.nextToken();
                    h264Settings.setSoftness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("spatialAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    h264Settings.setSpatialAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syntax", targetDepth)) {
                    context.nextToken();
                    h264Settings.setSyntax(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    context.nextToken();
                    h264Settings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("temporalAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    h264Settings.setTemporalAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unregisteredSeiTimecode", targetDepth)) {
                    context.nextToken();
                    h264Settings.setUnregisteredSeiTimecode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return h264Settings;
    }

    private static H264SettingsJsonUnmarshaller instance;

    public static H264SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new H264SettingsJsonUnmarshaller();
        return instance;
    }
}
