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
 * H265Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H265SettingsJsonUnmarshaller implements Unmarshaller<H265Settings, JsonUnmarshallerContext> {

    public H265Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        H265Settings h265Settings = new H265Settings();

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
                    h265Settings.setAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alternateTransferFunctionSei", targetDepth)) {
                    context.nextToken();
                    h265Settings.setAlternateTransferFunctionSei(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    h265Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("codecLevel", targetDepth)) {
                    context.nextToken();
                    h265Settings.setCodecLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codecProfile", targetDepth)) {
                    context.nextToken();
                    h265Settings.setCodecProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamicSubGop", targetDepth)) {
                    context.nextToken();
                    h265Settings.setDynamicSubGop(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flickerAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFlickerAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopBReference", targetDepth)) {
                    context.nextToken();
                    h265Settings.setGopBReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gopClosedCadence", targetDepth)) {
                    context.nextToken();
                    h265Settings.setGopClosedCadence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopSize", targetDepth)) {
                    context.nextToken();
                    h265Settings.setGopSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("gopSizeUnits", targetDepth)) {
                    context.nextToken();
                    h265Settings.setGopSizeUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferInitialFillPercentage", targetDepth)) {
                    context.nextToken();
                    h265Settings.setHrdBufferInitialFillPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferSize", targetDepth)) {
                    context.nextToken();
                    h265Settings.setHrdBufferSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    context.nextToken();
                    h265Settings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    context.nextToken();
                    h265Settings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minIInterval", targetDepth)) {
                    context.nextToken();
                    h265Settings.setMinIInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberBFramesBetweenReferenceFrames", targetDepth)) {
                    context.nextToken();
                    h265Settings.setNumberBFramesBetweenReferenceFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberReferenceFrames", targetDepth)) {
                    context.nextToken();
                    h265Settings.setNumberReferenceFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parControl", targetDepth)) {
                    context.nextToken();
                    h265Settings.setParControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parDenominator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setParDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parNumerator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setParNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("qualityTuningLevel", targetDepth)) {
                    context.nextToken();
                    h265Settings.setQualityTuningLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("qvbrSettings", targetDepth)) {
                    context.nextToken();
                    h265Settings.setQvbrSettings(H265QvbrSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rateControlMode", targetDepth)) {
                    context.nextToken();
                    h265Settings.setRateControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleAdaptiveOffsetFilterMode", targetDepth)) {
                    context.nextToken();
                    h265Settings.setSampleAdaptiveOffsetFilterMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sceneChangeDetect", targetDepth)) {
                    context.nextToken();
                    h265Settings.setSceneChangeDetect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slices", targetDepth)) {
                    context.nextToken();
                    h265Settings.setSlices(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    context.nextToken();
                    h265Settings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spatialAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    h265Settings.setSpatialAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    context.nextToken();
                    h265Settings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("temporalAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    h265Settings.setTemporalAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("temporalIds", targetDepth)) {
                    context.nextToken();
                    h265Settings.setTemporalIds(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tiles", targetDepth)) {
                    context.nextToken();
                    h265Settings.setTiles(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unregisteredSeiTimecode", targetDepth)) {
                    context.nextToken();
                    h265Settings.setUnregisteredSeiTimecode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("writeMp4PackagingType", targetDepth)) {
                    context.nextToken();
                    h265Settings.setWriteMp4PackagingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return h265Settings;
    }

    private static H265SettingsJsonUnmarshaller instance;

    public static H265SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new H265SettingsJsonUnmarshaller();
        return instance;
    }
}
