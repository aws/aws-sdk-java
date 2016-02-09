/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.gamelift.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * GameSessionMarshaller
 */
public class GameSessionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(GameSession gameSession, JSONWriter jsonWriter) {
        if (gameSession == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (gameSession.getGameSessionId() != null) {
                jsonWriter.key("GameSessionId").value(
                        gameSession.getGameSessionId());
            }

            if (gameSession.getName() != null) {
                jsonWriter.key("Name").value(gameSession.getName());
            }

            if (gameSession.getFleetId() != null) {
                jsonWriter.key("FleetId").value(gameSession.getFleetId());
            }

            if (gameSession.getCreationTime() != null) {
                jsonWriter.key("CreationTime").value(
                        gameSession.getCreationTime());
            }

            if (gameSession.getTerminationTime() != null) {
                jsonWriter.key("TerminationTime").value(
                        gameSession.getTerminationTime());
            }

            if (gameSession.getCurrentPlayerSessionCount() != null) {
                jsonWriter.key("CurrentPlayerSessionCount").value(
                        gameSession.getCurrentPlayerSessionCount());
            }

            if (gameSession.getMaximumPlayerSessionCount() != null) {
                jsonWriter.key("MaximumPlayerSessionCount").value(
                        gameSession.getMaximumPlayerSessionCount());
            }

            if (gameSession.getStatus() != null) {
                jsonWriter.key("Status").value(gameSession.getStatus());
            }

            java.util.List<GameProperty> gamePropertiesList = gameSession
                    .getGameProperties();
            if (gamePropertiesList != null) {
                jsonWriter.key("GameProperties");
                jsonWriter.array();
                for (GameProperty gamePropertiesListValue : gamePropertiesList) {
                    if (gamePropertiesListValue != null) {

                        GamePropertyJsonMarshaller.getInstance().marshall(
                                gamePropertiesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (gameSession.getIpAddress() != null) {
                jsonWriter.key("IpAddress").value(gameSession.getIpAddress());
            }

            if (gameSession.getPlayerSessionCreationPolicy() != null) {
                jsonWriter.key("PlayerSessionCreationPolicy").value(
                        gameSession.getPlayerSessionCreationPolicy());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GameSessionJsonMarshaller instance;

    public static GameSessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GameSessionJsonMarshaller();
        return instance;
    }

}
