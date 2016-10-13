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

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GameSessionMarshaller
 */
public class GameSessionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GameSession gameSession, StructuredJsonGenerator jsonGenerator) {

        if (gameSession == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (gameSession.getGameSessionId() != null) {
                jsonGenerator.writeFieldName("GameSessionId").writeValue(gameSession.getGameSessionId());
            }
            if (gameSession.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(gameSession.getName());
            }
            if (gameSession.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(gameSession.getFleetId());
            }
            if (gameSession.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(gameSession.getCreationTime());
            }
            if (gameSession.getTerminationTime() != null) {
                jsonGenerator.writeFieldName("TerminationTime").writeValue(gameSession.getTerminationTime());
            }
            if (gameSession.getCurrentPlayerSessionCount() != null) {
                jsonGenerator.writeFieldName("CurrentPlayerSessionCount").writeValue(gameSession.getCurrentPlayerSessionCount());
            }
            if (gameSession.getMaximumPlayerSessionCount() != null) {
                jsonGenerator.writeFieldName("MaximumPlayerSessionCount").writeValue(gameSession.getMaximumPlayerSessionCount());
            }
            if (gameSession.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(gameSession.getStatus());
            }

            java.util.List<GameProperty> gamePropertiesList = gameSession.getGameProperties();
            if (gamePropertiesList != null) {
                jsonGenerator.writeFieldName("GameProperties");
                jsonGenerator.writeStartArray();
                for (GameProperty gamePropertiesListValue : gamePropertiesList) {
                    if (gamePropertiesListValue != null) {

                        GamePropertyJsonMarshaller.getInstance().marshall(gamePropertiesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (gameSession.getIpAddress() != null) {
                jsonGenerator.writeFieldName("IpAddress").writeValue(gameSession.getIpAddress());
            }
            if (gameSession.getPort() != null) {
                jsonGenerator.writeFieldName("Port").writeValue(gameSession.getPort());
            }
            if (gameSession.getPlayerSessionCreationPolicy() != null) {
                jsonGenerator.writeFieldName("PlayerSessionCreationPolicy").writeValue(gameSession.getPlayerSessionCreationPolicy());
            }
            if (gameSession.getCreatorId() != null) {
                jsonGenerator.writeFieldName("CreatorId").writeValue(gameSession.getCreatorId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GameSessionJsonMarshaller instance;

    public static GameSessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GameSessionJsonMarshaller();
        return instance;
    }

}
