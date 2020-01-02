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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
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
                if (context.testExpression("afdSignaling", targetDepth)) {
                    context.nextToken();
                    h265Settings.setAfdSignaling(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alternativeTransferFunction", targetDepth)) {
                    context.nextToken();
                    h265Settings.setAlternativeTransferFunction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    h265Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bufSize", targetDepth)) {
                    context.nextToken();
                    h265Settings.setBufSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("colorMetadata", targetDepth)) {
                    context.nextToken();
                    h265Settings.setColorMetadata(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("colorSpaceSettings", targetDepth)) {
                    context.nextToken();
                    h265Settings.setColorSpaceSettings(H265ColorSpaceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fixedAfd", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFixedAfd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flickerAq", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFlickerAq(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
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
                if (context.testExpression("level", targetDepth)) {
                    context.nextToken();
                    h265Settings.setLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lookAheadRateControl", targetDepth)) {
                    context.nextToken();
                    h265Settings.setLookAheadRateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    context.nextToken();
                    h265Settings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minIInterval", targetDepth)) {
                    context.nextToken();
                    h265Settings.setMinIInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parDenominator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setParDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parNumerator", targetDepth)) {
                    context.nextToken();
                    h265Settings.setParNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("profile", targetDepth)) {
                    context.nextToken();
                    h265Settings.setProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("qvbrQualityLevel", targetDepth)) {
                    context.nextToken();
                    h265Settings.setQvbrQualityLevel(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("rateControlMode", targetDepth)) {
                    context.nextToken();
                    h265Settings.setRateControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanType", targetDepth)) {
                    context.nextToken();
                    h265Settings.setScanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sceneChangeDetect", targetDepth)) {
                    context.nextToken();
                    h265Settings.setSceneChangeDetect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slices", targetDepth)) {
                    context.nextToken();
                    h265Settings.setSlices(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tier", targetDepth)) {
                    context.nextToken();
                    h265Settings.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timecodeInsertion", targetDepth)) {
                    context.nextToken();
                    h265Settings.setTimecodeInsertion(context.getUnmarshaller(String.class).unmarshall(context));
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
