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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DeviceMarshaller
 */
public class DeviceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Device device, StructuredJsonGenerator jsonGenerator) {

        if (device == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (device.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(device.getArn());
            }
            if (device.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(device.getName());
            }
            if (device.getManufacturer() != null) {
                jsonGenerator.writeFieldName("manufacturer").writeValue(device.getManufacturer());
            }
            if (device.getModel() != null) {
                jsonGenerator.writeFieldName("model").writeValue(device.getModel());
            }
            if (device.getFormFactor() != null) {
                jsonGenerator.writeFieldName("formFactor").writeValue(device.getFormFactor());
            }
            if (device.getPlatform() != null) {
                jsonGenerator.writeFieldName("platform").writeValue(device.getPlatform());
            }
            if (device.getOs() != null) {
                jsonGenerator.writeFieldName("os").writeValue(device.getOs());
            }
            if (device.getCpu() != null) {
                jsonGenerator.writeFieldName("cpu");
                CPUJsonMarshaller.getInstance().marshall(device.getCpu(), jsonGenerator);
            }
            if (device.getResolution() != null) {
                jsonGenerator.writeFieldName("resolution");
                ResolutionJsonMarshaller.getInstance().marshall(device.getResolution(), jsonGenerator);
            }
            if (device.getHeapSize() != null) {
                jsonGenerator.writeFieldName("heapSize").writeValue(device.getHeapSize());
            }
            if (device.getMemory() != null) {
                jsonGenerator.writeFieldName("memory").writeValue(device.getMemory());
            }
            if (device.getImage() != null) {
                jsonGenerator.writeFieldName("image").writeValue(device.getImage());
            }
            if (device.getCarrier() != null) {
                jsonGenerator.writeFieldName("carrier").writeValue(device.getCarrier());
            }
            if (device.getRadio() != null) {
                jsonGenerator.writeFieldName("radio").writeValue(device.getRadio());
            }
            if (device.getRemoteAccessEnabled() != null) {
                jsonGenerator.writeFieldName("remoteAccessEnabled").writeValue(device.getRemoteAccessEnabled());
            }
            if (device.getFleetType() != null) {
                jsonGenerator.writeFieldName("fleetType").writeValue(device.getFleetType());
            }
            if (device.getFleetName() != null) {
                jsonGenerator.writeFieldName("fleetName").writeValue(device.getFleetName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeviceJsonMarshaller instance;

    public static DeviceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceJsonMarshaller();
        return instance;
    }

}
