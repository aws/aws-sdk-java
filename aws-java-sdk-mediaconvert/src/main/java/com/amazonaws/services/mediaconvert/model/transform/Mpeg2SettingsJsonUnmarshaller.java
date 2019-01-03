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
 * Mpeg2Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mpeg2SettingsJsonUnmarshaller implements Unmarshaller<Mpeg2Settings, JsonUnmarshallerContext> {

    public Mpeg2Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Mpeg2Settings mpeg2Settings = new Mpeg2Settings();

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
                    mpeg2Settings.setAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("codecLevel", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setCodecLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codecProfile", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setCodecProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamicSubGop", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setDynamicSubGop(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopClosedCadence", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setGopClosedCadence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopSize", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setGopSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("gopSizeUnits", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setGopSizeUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferInitialFillPercentage", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setHrdBufferInitialFillPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferSize", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setHrdBufferSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intraDcPrecision", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setIntraDcPrecision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minIInterval", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setMinIInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberBFramesBetweenReferenceFrames", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setNumberBFramesBetweenReferenceFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parControl", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setParControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parDenominator", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setParDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parNumerator", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setParNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("qualityTuningLevel", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setQualityTuningLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rateControlMode", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setRateControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sceneChangeDetect", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setSceneChangeDetect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softness", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setSoftness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("spatialAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setSpatialAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syntax", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setSyntax(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("temporalAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setTemporalAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mpeg2Settings;
    }

    private static Mpeg2SettingsJsonUnmarshaller instance;

    public static Mpeg2SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Mpeg2SettingsJsonUnmarshaller();
        return instance;
    }
}
