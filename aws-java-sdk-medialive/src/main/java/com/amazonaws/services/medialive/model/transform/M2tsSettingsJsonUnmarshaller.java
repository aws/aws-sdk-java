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
 * M2tsSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2tsSettingsJsonUnmarshaller implements Unmarshaller<M2tsSettings, JsonUnmarshallerContext> {

    public M2tsSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        M2tsSettings m2tsSettings = new M2tsSettings();

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
                if (context.testExpression("absentInputAudioBehavior", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setAbsentInputAudioBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arib", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setArib(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("aribCaptionsPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setAribCaptionsPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("aribCaptionsPidControl", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setAribCaptionsPidControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioBufferModel", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setAudioBufferModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioFramesPerPes", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setAudioFramesPerPes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("audioPids", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setAudioPids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioStreamType", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setAudioStreamType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bufferModel", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setBufferModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ccDescriptor", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setCcDescriptor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dvbNitSettings", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setDvbNitSettings(DvbNitSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dvbSdtSettings", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setDvbSdtSettings(DvbSdtSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dvbSubPids", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setDvbSubPids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dvbTdtSettings", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setDvbTdtSettings(DvbTdtSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dvbTeletextPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setDvbTeletextPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebif", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEbif(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebpAudioInterval", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEbpAudioInterval(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebpLookaheadMs", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEbpLookaheadMs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ebpPlacement", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEbpPlacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ecmPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEcmPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("esRateInPes", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEsRateInPes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("etvPlatformPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEtvPlatformPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("etvSignalPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setEtvSignalPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fragmentTime", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setFragmentTime(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("klv", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setKlv(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("klvDataPids", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setKlvDataPids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nullPacketBitrate", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setNullPacketBitrate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("patInterval", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setPatInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pcrControl", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setPcrControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pcrPeriod", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setPcrPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pcrPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setPcrPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pmtInterval", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setPmtInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pmtPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setPmtPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("programNum", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setProgramNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("rateMode", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setRateMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte27Pids", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setScte27Pids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35Control", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setScte35Control(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35Pid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setScte35Pid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationMarkers", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setSegmentationMarkers(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationStyle", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setSegmentationStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationTime", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setSegmentationTime(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataBehavior", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setTimedMetadataBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setTimedMetadataPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transportStreamId", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setTransportStreamId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("videoPid", targetDepth)) {
                    context.nextToken();
                    m2tsSettings.setVideoPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return m2tsSettings;
    }

    private static M2tsSettingsJsonUnmarshaller instance;

    public static M2tsSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M2tsSettingsJsonUnmarshaller();
        return instance;
    }
}
