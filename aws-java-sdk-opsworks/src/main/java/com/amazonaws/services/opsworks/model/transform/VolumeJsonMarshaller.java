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
 * VolumeMarshaller
 */
public class VolumeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Volume volume, StructuredJsonGenerator jsonGenerator) {

        if (volume == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (volume.getVolumeId() != null) {
                jsonGenerator.writeFieldName("VolumeId").writeValue(volume.getVolumeId());
            }
            if (volume.getEc2VolumeId() != null) {
                jsonGenerator.writeFieldName("Ec2VolumeId").writeValue(volume.getEc2VolumeId());
            }
            if (volume.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(volume.getName());
            }
            if (volume.getRaidArrayId() != null) {
                jsonGenerator.writeFieldName("RaidArrayId").writeValue(volume.getRaidArrayId());
            }
            if (volume.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(volume.getInstanceId());
            }
            if (volume.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(volume.getStatus());
            }
            if (volume.getSize() != null) {
                jsonGenerator.writeFieldName("Size").writeValue(volume.getSize());
            }
            if (volume.getDevice() != null) {
                jsonGenerator.writeFieldName("Device").writeValue(volume.getDevice());
            }
            if (volume.getMountPoint() != null) {
                jsonGenerator.writeFieldName("MountPoint").writeValue(volume.getMountPoint());
            }
            if (volume.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(volume.getRegion());
            }
            if (volume.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("AvailabilityZone").writeValue(volume.getAvailabilityZone());
            }
            if (volume.getVolumeType() != null) {
                jsonGenerator.writeFieldName("VolumeType").writeValue(volume.getVolumeType());
            }
            if (volume.getIops() != null) {
                jsonGenerator.writeFieldName("Iops").writeValue(volume.getIops());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VolumeJsonMarshaller instance;

    public static VolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeJsonMarshaller();
        return instance;
    }

}
