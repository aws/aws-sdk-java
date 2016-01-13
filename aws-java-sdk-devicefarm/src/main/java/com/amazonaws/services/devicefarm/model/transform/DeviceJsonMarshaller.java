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

package com.amazonaws.services.devicefarm.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DeviceMarshaller
 */
public class DeviceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Device device, JSONWriter jsonWriter) {
        if (device == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (device.getArn() != null) {
                jsonWriter.key("arn").value(device.getArn());
            }

            if (device.getName() != null) {
                jsonWriter.key("name").value(device.getName());
            }

            if (device.getManufacturer() != null) {
                jsonWriter.key("manufacturer").value(device.getManufacturer());
            }

            if (device.getModel() != null) {
                jsonWriter.key("model").value(device.getModel());
            }

            if (device.getFormFactor() != null) {
                jsonWriter.key("formFactor").value(device.getFormFactor());
            }

            if (device.getPlatform() != null) {
                jsonWriter.key("platform").value(device.getPlatform());
            }

            if (device.getOs() != null) {
                jsonWriter.key("os").value(device.getOs());
            }

            if (device.getCpu() != null) {
                jsonWriter.key("cpu");
                CPUJsonMarshaller.getInstance().marshall(device.getCpu(),
                        jsonWriter);
            }

            if (device.getResolution() != null) {
                jsonWriter.key("resolution");
                ResolutionJsonMarshaller.getInstance().marshall(
                        device.getResolution(), jsonWriter);
            }

            if (device.getHeapSize() != null) {
                jsonWriter.key("heapSize").value(device.getHeapSize());
            }

            if (device.getMemory() != null) {
                jsonWriter.key("memory").value(device.getMemory());
            }

            if (device.getImage() != null) {
                jsonWriter.key("image").value(device.getImage());
            }

            if (device.getCarrier() != null) {
                jsonWriter.key("carrier").value(device.getCarrier());
            }

            if (device.getRadio() != null) {
                jsonWriter.key("radio").value(device.getRadio());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeviceJsonMarshaller instance;

    public static DeviceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceJsonMarshaller();
        return instance;
    }

}
