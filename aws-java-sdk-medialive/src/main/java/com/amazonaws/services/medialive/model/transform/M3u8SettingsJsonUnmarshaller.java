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
 * M3u8Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M3u8SettingsJsonUnmarshaller implements Unmarshaller<M3u8Settings, JsonUnmarshallerContext> {

    public M3u8Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        M3u8Settings m3u8Settings = new M3u8Settings();

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
                if (context.testExpression("audioFramesPerPes", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setAudioFramesPerPes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("audioPids", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setAudioPids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ecmPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setEcmPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("patInterval", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPatInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pcrControl", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPcrControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pcrPeriod", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPcrPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pcrPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPcrPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pmtInterval", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPmtInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pmtPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPmtPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("programNum", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setProgramNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scte35Behavior", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setScte35Behavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35Pid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setScte35Pid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataBehavior", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setTimedMetadataBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setTimedMetadataPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transportStreamId", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setTransportStreamId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("videoPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setVideoPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return m3u8Settings;
    }

    private static M3u8SettingsJsonUnmarshaller instance;

    public static M3u8SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M3u8SettingsJsonUnmarshaller();
        return instance;
    }
}
