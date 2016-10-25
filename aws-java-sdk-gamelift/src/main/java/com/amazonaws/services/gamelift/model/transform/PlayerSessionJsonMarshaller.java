/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PlayerSessionMarshaller
 */
public class PlayerSessionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PlayerSession playerSession, StructuredJsonGenerator jsonGenerator) {

        if (playerSession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (playerSession.getPlayerSessionId() != null) {
                jsonGenerator.writeFieldName("PlayerSessionId").writeValue(playerSession.getPlayerSessionId());
            }
            if (playerSession.getPlayerId() != null) {
                jsonGenerator.writeFieldName("PlayerId").writeValue(playerSession.getPlayerId());
            }
            if (playerSession.getGameSessionId() != null) {
                jsonGenerator.writeFieldName("GameSessionId").writeValue(playerSession.getGameSessionId());
            }
            if (playerSession.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(playerSession.getFleetId());
            }
            if (playerSession.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(playerSession.getCreationTime());
            }
            if (playerSession.getTerminationTime() != null) {
                jsonGenerator.writeFieldName("TerminationTime").writeValue(playerSession.getTerminationTime());
            }
            if (playerSession.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(playerSession.getStatus());
            }
            if (playerSession.getIpAddress() != null) {
                jsonGenerator.writeFieldName("IpAddress").writeValue(playerSession.getIpAddress());
            }
            if (playerSession.getPort() != null) {
                jsonGenerator.writeFieldName("Port").writeValue(playerSession.getPort());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PlayerSessionJsonMarshaller instance;

    public static PlayerSessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlayerSessionJsonMarshaller();
        return instance;
    }

}
