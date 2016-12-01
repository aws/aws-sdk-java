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
package com.amazonaws.services.appstream.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * FleetMarshaller
 */
public class FleetJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Fleet fleet, StructuredJsonGenerator jsonGenerator) {

        if (fleet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (fleet.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(fleet.getArn());
            }
            if (fleet.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(fleet.getName());
            }
            if (fleet.getDisplayName() != null) {
                jsonGenerator.writeFieldName("DisplayName").writeValue(fleet.getDisplayName());
            }
            if (fleet.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(fleet.getDescription());
            }
            if (fleet.getImageName() != null) {
                jsonGenerator.writeFieldName("ImageName").writeValue(fleet.getImageName());
            }
            if (fleet.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(fleet.getInstanceType());
            }
            if (fleet.getComputeCapacityStatus() != null) {
                jsonGenerator.writeFieldName("ComputeCapacityStatus");
                ComputeCapacityStatusJsonMarshaller.getInstance().marshall(fleet.getComputeCapacityStatus(), jsonGenerator);
            }
            if (fleet.getMaxUserDurationInSeconds() != null) {
                jsonGenerator.writeFieldName("MaxUserDurationInSeconds").writeValue(fleet.getMaxUserDurationInSeconds());
            }
            if (fleet.getDisconnectTimeoutInSeconds() != null) {
                jsonGenerator.writeFieldName("DisconnectTimeoutInSeconds").writeValue(fleet.getDisconnectTimeoutInSeconds());
            }
            if (fleet.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(fleet.getState());
            }
            if (fleet.getVpcConfig() != null) {
                jsonGenerator.writeFieldName("VpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(fleet.getVpcConfig(), jsonGenerator);
            }
            if (fleet.getCreatedTime() != null) {
                jsonGenerator.writeFieldName("CreatedTime").writeValue(fleet.getCreatedTime());
            }

            java.util.List<FleetError> fleetErrorsList = fleet.getFleetErrors();
            if (fleetErrorsList != null) {
                jsonGenerator.writeFieldName("FleetErrors");
                jsonGenerator.writeStartArray();
                for (FleetError fleetErrorsListValue : fleetErrorsList) {
                    if (fleetErrorsListValue != null) {

                        FleetErrorJsonMarshaller.getInstance().marshall(fleetErrorsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FleetJsonMarshaller instance;

    public static FleetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetJsonMarshaller();
        return instance;
    }

}
