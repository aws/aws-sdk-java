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
 * FleetAttributesMarshaller
 */
public class FleetAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(FleetAttributes fleetAttributes, JSONWriter jsonWriter) {
        if (fleetAttributes == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (fleetAttributes.getFleetId() != null) {
                jsonWriter.key("FleetId").value(fleetAttributes.getFleetId());
            }

            if (fleetAttributes.getDescription() != null) {
                jsonWriter.key("Description").value(
                        fleetAttributes.getDescription());
            }

            if (fleetAttributes.getName() != null) {
                jsonWriter.key("Name").value(fleetAttributes.getName());
            }

            if (fleetAttributes.getCreationTime() != null) {
                jsonWriter.key("CreationTime").value(
                        fleetAttributes.getCreationTime());
            }

            if (fleetAttributes.getTerminationTime() != null) {
                jsonWriter.key("TerminationTime").value(
                        fleetAttributes.getTerminationTime());
            }

            if (fleetAttributes.getStatus() != null) {
                jsonWriter.key("Status").value(fleetAttributes.getStatus());
            }

            if (fleetAttributes.getBuildId() != null) {
                jsonWriter.key("BuildId").value(fleetAttributes.getBuildId());
            }

            if (fleetAttributes.getServerLaunchPath() != null) {
                jsonWriter.key("ServerLaunchPath").value(
                        fleetAttributes.getServerLaunchPath());
            }

            if (fleetAttributes.getServerLaunchParameters() != null) {
                jsonWriter.key("ServerLaunchParameters").value(
                        fleetAttributes.getServerLaunchParameters());
            }

            java.util.List<String> logPathsList = fleetAttributes.getLogPaths();
            if (logPathsList != null) {
                jsonWriter.key("LogPaths");
                jsonWriter.array();
                for (String logPathsListValue : logPathsList) {
                    if (logPathsListValue != null) {
                        jsonWriter.value(logPathsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (fleetAttributes.getNewGameSessionProtectionPolicy() != null) {
                jsonWriter.key("NewGameSessionProtectionPolicy").value(
                        fleetAttributes.getNewGameSessionProtectionPolicy());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FleetAttributesJsonMarshaller instance;

    public static FleetAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetAttributesJsonMarshaller();
        return instance;
    }

}
