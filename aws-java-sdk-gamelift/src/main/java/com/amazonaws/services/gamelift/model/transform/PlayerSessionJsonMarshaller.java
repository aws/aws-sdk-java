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
 * PlayerSessionMarshaller
 */
public class PlayerSessionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(PlayerSession playerSession, JSONWriter jsonWriter) {
        if (playerSession == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (playerSession.getPlayerSessionId() != null) {
                jsonWriter.key("PlayerSessionId").value(
                        playerSession.getPlayerSessionId());
            }

            if (playerSession.getPlayerId() != null) {
                jsonWriter.key("PlayerId").value(playerSession.getPlayerId());
            }

            if (playerSession.getGameSessionId() != null) {
                jsonWriter.key("GameSessionId").value(
                        playerSession.getGameSessionId());
            }

            if (playerSession.getFleetId() != null) {
                jsonWriter.key("FleetId").value(playerSession.getFleetId());
            }

            if (playerSession.getCreationTime() != null) {
                jsonWriter.key("CreationTime").value(
                        playerSession.getCreationTime());
            }

            if (playerSession.getTerminationTime() != null) {
                jsonWriter.key("TerminationTime").value(
                        playerSession.getTerminationTime());
            }

            if (playerSession.getStatus() != null) {
                jsonWriter.key("Status").value(playerSession.getStatus());
            }

            if (playerSession.getIpAddress() != null) {
                jsonWriter.key("IpAddress").value(playerSession.getIpAddress());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PlayerSessionJsonMarshaller instance;

    public static PlayerSessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlayerSessionJsonMarshaller();
        return instance;
    }

}
