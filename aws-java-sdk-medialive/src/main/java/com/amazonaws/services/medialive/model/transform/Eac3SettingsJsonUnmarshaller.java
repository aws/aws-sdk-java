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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Eac3Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Eac3SettingsJsonUnmarshaller implements Unmarshaller<Eac3Settings, JsonUnmarshallerContext> {

    public Eac3Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Eac3Settings eac3Settings = new Eac3Settings();

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
                if (context.testExpression("attenuationControl", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setAttenuationControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setBitrate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("bitstreamMode", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setBitstreamMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codingMode", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setCodingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dcFilter", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setDcFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dialnorm", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setDialnorm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("drcLine", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setDrcLine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("drcRf", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setDrcRf(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lfeControl", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setLfeControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lfeFilter", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setLfeFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loRoCenterMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setLoRoCenterMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("loRoSurroundMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setLoRoSurroundMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ltRtCenterMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setLtRtCenterMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ltRtSurroundMixLevel", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setLtRtSurroundMixLevel(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("metadataControl", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setMetadataControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("passthroughControl", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setPassthroughControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phaseControl", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setPhaseControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stereoDownmix", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setStereoDownmix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("surroundExMode", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setSurroundExMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("surroundMode", targetDepth)) {
                    context.nextToken();
                    eac3Settings.setSurroundMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eac3Settings;
    }

    private static Eac3SettingsJsonUnmarshaller instance;

    public static Eac3SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Eac3SettingsJsonUnmarshaller();
        return instance;
    }
}
