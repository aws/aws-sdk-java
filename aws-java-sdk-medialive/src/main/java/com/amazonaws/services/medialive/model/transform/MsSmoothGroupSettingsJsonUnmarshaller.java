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
 * MsSmoothGroupSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MsSmoothGroupSettingsJsonUnmarshaller implements Unmarshaller<MsSmoothGroupSettings, JsonUnmarshallerContext> {

    public MsSmoothGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        MsSmoothGroupSettings msSmoothGroupSettings = new MsSmoothGroupSettings();

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
                if (context.testExpression("acquisitionPointId", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setAcquisitionPointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioOnlyTimecodeControl", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setAudioOnlyTimecodeControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateMode", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setCertificateMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionRetryInterval", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setConnectionRetryInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setDestination(OutputLocationRefJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("eventId", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventIdMode", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setEventIdMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventStopBehavior", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setEventStopBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filecacheDuration", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setFilecacheDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fragmentLength", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setFragmentLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("inputLossAction", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setInputLossAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numRetries", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setNumRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("restartDelay", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setRestartDelay(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentationMode", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setSegmentationMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sendDelayMs", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setSendDelayMs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sparseTrackType", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setSparseTrackType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("streamManifestBehavior", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setStreamManifestBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timestampOffset", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setTimestampOffset(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timestampOffsetMode", targetDepth)) {
                    context.nextToken();
                    msSmoothGroupSettings.setTimestampOffsetMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return msSmoothGroupSettings;
    }

    private static MsSmoothGroupSettingsJsonUnmarshaller instance;

    public static MsSmoothGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MsSmoothGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
