/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
                if (context.testExpression("afdSignaling", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setAfdSignaling(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("colorMetadata", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setColorMetadata(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("colorSpace", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setColorSpace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayAspectRatio", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setDisplayAspectRatio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterSettings", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setFilterSettings(Mpeg2FilterSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fixedAfd", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setFixedAfd(context.getUnmarshaller(String.class).unmarshall(context));
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
                if (context.testExpression("gopNumBFrames", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setGopNumBFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopSize", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setGopSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("gopSizeUnits", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setGopSizeUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanType", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setScanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subgopLength", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setSubgopLength(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timecodeInsertion", targetDepth)) {
                    context.nextToken();
                    mpeg2Settings.setTimecodeInsertion(context.getUnmarshaller(String.class).unmarshall(context));
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
