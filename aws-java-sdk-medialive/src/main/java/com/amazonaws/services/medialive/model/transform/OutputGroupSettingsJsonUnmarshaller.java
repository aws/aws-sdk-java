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
 * OutputGroupSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputGroupSettingsJsonUnmarshaller implements Unmarshaller<OutputGroupSettings, JsonUnmarshallerContext> {

    public OutputGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        OutputGroupSettings outputGroupSettings = new OutputGroupSettings();

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
                if (context.testExpression("archiveGroupSettings", targetDepth)) {
                    context.nextToken();
                    outputGroupSettings.setArchiveGroupSettings(ArchiveGroupSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("frameCaptureGroupSettings", targetDepth)) {
                    context.nextToken();
                    outputGroupSettings.setFrameCaptureGroupSettings(FrameCaptureGroupSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hlsGroupSettings", targetDepth)) {
                    context.nextToken();
                    outputGroupSettings.setHlsGroupSettings(HlsGroupSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mediaPackageGroupSettings", targetDepth)) {
                    context.nextToken();
                    outputGroupSettings.setMediaPackageGroupSettings(MediaPackageGroupSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("msSmoothGroupSettings", targetDepth)) {
                    context.nextToken();
                    outputGroupSettings.setMsSmoothGroupSettings(MsSmoothGroupSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rtmpGroupSettings", targetDepth)) {
                    context.nextToken();
                    outputGroupSettings.setRtmpGroupSettings(RtmpGroupSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("udpGroupSettings", targetDepth)) {
                    context.nextToken();
                    outputGroupSettings.setUdpGroupSettings(UdpGroupSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return outputGroupSettings;
    }

    private static OutputGroupSettingsJsonUnmarshaller instance;

    public static OutputGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutputGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
