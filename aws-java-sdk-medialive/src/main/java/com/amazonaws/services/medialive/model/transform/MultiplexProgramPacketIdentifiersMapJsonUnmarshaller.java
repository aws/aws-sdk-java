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
 * MultiplexProgramPacketIdentifiersMap JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexProgramPacketIdentifiersMapJsonUnmarshaller implements Unmarshaller<MultiplexProgramPacketIdentifiersMap, JsonUnmarshallerContext> {

    public MultiplexProgramPacketIdentifiersMap unmarshall(JsonUnmarshallerContext context) throws Exception {
        MultiplexProgramPacketIdentifiersMap multiplexProgramPacketIdentifiersMap = new MultiplexProgramPacketIdentifiersMap();

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
                if (context.testExpression("audioPids", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap
                            .setAudioPids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("dvbSubPids", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setDvbSubPids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))
                            .unmarshall(context));
                }
                if (context.testExpression("dvbTeletextPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setDvbTeletextPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("etvPlatformPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setEtvPlatformPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("etvSignalPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setEtvSignalPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("klvDataPids", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setKlvDataPids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))
                            .unmarshall(context));
                }
                if (context.testExpression("pcrPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setPcrPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pmtPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setPmtPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("privateMetadataPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setPrivateMetadataPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scte27Pids", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setScte27Pids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))
                            .unmarshall(context));
                }
                if (context.testExpression("scte35Pid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setScte35Pid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setTimedMetadataPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("videoPid", targetDepth)) {
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setVideoPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return multiplexProgramPacketIdentifiersMap;
    }

    private static MultiplexProgramPacketIdentifiersMapJsonUnmarshaller instance;

    public static MultiplexProgramPacketIdentifiersMapJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexProgramPacketIdentifiersMapJsonUnmarshaller();
        return instance;
    }
}
