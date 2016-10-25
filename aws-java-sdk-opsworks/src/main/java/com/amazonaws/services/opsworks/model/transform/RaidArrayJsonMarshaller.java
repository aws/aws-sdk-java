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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RaidArrayMarshaller
 */
public class RaidArrayJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RaidArray raidArray, StructuredJsonGenerator jsonGenerator) {

        if (raidArray == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (raidArray.getRaidArrayId() != null) {
                jsonGenerator.writeFieldName("RaidArrayId").writeValue(raidArray.getRaidArrayId());
            }
            if (raidArray.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(raidArray.getInstanceId());
            }
            if (raidArray.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(raidArray.getName());
            }
            if (raidArray.getRaidLevel() != null) {
                jsonGenerator.writeFieldName("RaidLevel").writeValue(raidArray.getRaidLevel());
            }
            if (raidArray.getNumberOfDisks() != null) {
                jsonGenerator.writeFieldName("NumberOfDisks").writeValue(raidArray.getNumberOfDisks());
            }
            if (raidArray.getSize() != null) {
                jsonGenerator.writeFieldName("Size").writeValue(raidArray.getSize());
            }
            if (raidArray.getDevice() != null) {
                jsonGenerator.writeFieldName("Device").writeValue(raidArray.getDevice());
            }
            if (raidArray.getMountPoint() != null) {
                jsonGenerator.writeFieldName("MountPoint").writeValue(raidArray.getMountPoint());
            }
            if (raidArray.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("AvailabilityZone").writeValue(raidArray.getAvailabilityZone());
            }
            if (raidArray.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(raidArray.getCreatedAt());
            }
            if (raidArray.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(raidArray.getStackId());
            }
            if (raidArray.getVolumeType() != null) {
                jsonGenerator.writeFieldName("VolumeType").writeValue(raidArray.getVolumeType());
            }
            if (raidArray.getIops() != null) {
                jsonGenerator.writeFieldName("Iops").writeValue(raidArray.getIops());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RaidArrayJsonMarshaller instance;

    public static RaidArrayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RaidArrayJsonMarshaller();
        return instance;
    }

}
