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
 * FleetAttributesMarshaller
 */
public class FleetAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FleetAttributes fleetAttributes, StructuredJsonGenerator jsonGenerator) {

        if (fleetAttributes == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (fleetAttributes.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(fleetAttributes.getFleetId());
            }
            if (fleetAttributes.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(fleetAttributes.getDescription());
            }
            if (fleetAttributes.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(fleetAttributes.getName());
            }
            if (fleetAttributes.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(fleetAttributes.getCreationTime());
            }
            if (fleetAttributes.getTerminationTime() != null) {
                jsonGenerator.writeFieldName("TerminationTime").writeValue(fleetAttributes.getTerminationTime());
            }
            if (fleetAttributes.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(fleetAttributes.getStatus());
            }
            if (fleetAttributes.getBuildId() != null) {
                jsonGenerator.writeFieldName("BuildId").writeValue(fleetAttributes.getBuildId());
            }
            if (fleetAttributes.getServerLaunchPath() != null) {
                jsonGenerator.writeFieldName("ServerLaunchPath").writeValue(fleetAttributes.getServerLaunchPath());
            }
            if (fleetAttributes.getServerLaunchParameters() != null) {
                jsonGenerator.writeFieldName("ServerLaunchParameters").writeValue(fleetAttributes.getServerLaunchParameters());
            }

            java.util.List<String> logPathsList = fleetAttributes.getLogPaths();
            if (logPathsList != null) {
                jsonGenerator.writeFieldName("LogPaths");
                jsonGenerator.writeStartArray();
                for (String logPathsListValue : logPathsList) {
                    if (logPathsListValue != null) {
                        jsonGenerator.writeValue(logPathsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (fleetAttributes.getNewGameSessionProtectionPolicy() != null) {
                jsonGenerator.writeFieldName("NewGameSessionProtectionPolicy").writeValue(fleetAttributes.getNewGameSessionProtectionPolicy());
            }
            if (fleetAttributes.getOperatingSystem() != null) {
                jsonGenerator.writeFieldName("OperatingSystem").writeValue(fleetAttributes.getOperatingSystem());
            }
            if (fleetAttributes.getResourceCreationLimitPolicy() != null) {
                jsonGenerator.writeFieldName("ResourceCreationLimitPolicy");
                ResourceCreationLimitPolicyJsonMarshaller.getInstance().marshall(fleetAttributes.getResourceCreationLimitPolicy(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FleetAttributesJsonMarshaller instance;

    public static FleetAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetAttributesJsonMarshaller();
        return instance;
    }

}
