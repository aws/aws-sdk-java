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
 * FleetUtilizationMarshaller
 */
public class FleetUtilizationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FleetUtilization fleetUtilization, StructuredJsonGenerator jsonGenerator) {

        if (fleetUtilization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (fleetUtilization.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(fleetUtilization.getFleetId());
            }
            if (fleetUtilization.getActiveServerProcessCount() != null) {
                jsonGenerator.writeFieldName("ActiveServerProcessCount").writeValue(fleetUtilization.getActiveServerProcessCount());
            }
            if (fleetUtilization.getActiveGameSessionCount() != null) {
                jsonGenerator.writeFieldName("ActiveGameSessionCount").writeValue(fleetUtilization.getActiveGameSessionCount());
            }
            if (fleetUtilization.getCurrentPlayerSessionCount() != null) {
                jsonGenerator.writeFieldName("CurrentPlayerSessionCount").writeValue(fleetUtilization.getCurrentPlayerSessionCount());
            }
            if (fleetUtilization.getMaximumPlayerSessionCount() != null) {
                jsonGenerator.writeFieldName("MaximumPlayerSessionCount").writeValue(fleetUtilization.getMaximumPlayerSessionCount());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FleetUtilizationJsonMarshaller instance;

    public static FleetUtilizationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetUtilizationJsonMarshaller();
        return instance;
    }

}
