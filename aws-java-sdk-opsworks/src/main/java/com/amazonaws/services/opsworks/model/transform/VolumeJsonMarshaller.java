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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * VolumeMarshaller
 */
public class VolumeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Volume volume, JSONWriter jsonWriter) {
        if (volume == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (volume.getVolumeId() != null) {
                jsonWriter.key("VolumeId").value(volume.getVolumeId());
            }

            if (volume.getEc2VolumeId() != null) {
                jsonWriter.key("Ec2VolumeId").value(volume.getEc2VolumeId());
            }

            if (volume.getName() != null) {
                jsonWriter.key("Name").value(volume.getName());
            }

            if (volume.getRaidArrayId() != null) {
                jsonWriter.key("RaidArrayId").value(volume.getRaidArrayId());
            }

            if (volume.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(volume.getInstanceId());
            }

            if (volume.getStatus() != null) {
                jsonWriter.key("Status").value(volume.getStatus());
            }

            if (volume.getSize() != null) {
                jsonWriter.key("Size").value(volume.getSize());
            }

            if (volume.getDevice() != null) {
                jsonWriter.key("Device").value(volume.getDevice());
            }

            if (volume.getMountPoint() != null) {
                jsonWriter.key("MountPoint").value(volume.getMountPoint());
            }

            if (volume.getRegion() != null) {
                jsonWriter.key("Region").value(volume.getRegion());
            }

            if (volume.getAvailabilityZone() != null) {
                jsonWriter.key("AvailabilityZone").value(
                        volume.getAvailabilityZone());
            }

            if (volume.getVolumeType() != null) {
                jsonWriter.key("VolumeType").value(volume.getVolumeType());
            }

            if (volume.getIops() != null) {
                jsonWriter.key("Iops").value(volume.getIops());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VolumeJsonMarshaller instance;

    public static VolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeJsonMarshaller();
        return instance;
    }

}
