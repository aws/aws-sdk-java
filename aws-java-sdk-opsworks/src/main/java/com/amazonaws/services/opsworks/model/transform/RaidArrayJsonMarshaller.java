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
 * RaidArrayMarshaller
 */
public class RaidArrayJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RaidArray raidArray, JSONWriter jsonWriter) {
        if (raidArray == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (raidArray.getRaidArrayId() != null) {
                jsonWriter.key("RaidArrayId").value(raidArray.getRaidArrayId());
            }

            if (raidArray.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(raidArray.getInstanceId());
            }

            if (raidArray.getName() != null) {
                jsonWriter.key("Name").value(raidArray.getName());
            }

            if (raidArray.getRaidLevel() != null) {
                jsonWriter.key("RaidLevel").value(raidArray.getRaidLevel());
            }

            if (raidArray.getNumberOfDisks() != null) {
                jsonWriter.key("NumberOfDisks").value(
                        raidArray.getNumberOfDisks());
            }

            if (raidArray.getSize() != null) {
                jsonWriter.key("Size").value(raidArray.getSize());
            }

            if (raidArray.getDevice() != null) {
                jsonWriter.key("Device").value(raidArray.getDevice());
            }

            if (raidArray.getMountPoint() != null) {
                jsonWriter.key("MountPoint").value(raidArray.getMountPoint());
            }

            if (raidArray.getAvailabilityZone() != null) {
                jsonWriter.key("AvailabilityZone").value(
                        raidArray.getAvailabilityZone());
            }

            if (raidArray.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(raidArray.getCreatedAt());
            }

            if (raidArray.getStackId() != null) {
                jsonWriter.key("StackId").value(raidArray.getStackId());
            }

            if (raidArray.getVolumeType() != null) {
                jsonWriter.key("VolumeType").value(raidArray.getVolumeType());
            }

            if (raidArray.getIops() != null) {
                jsonWriter.key("Iops").value(raidArray.getIops());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RaidArrayJsonMarshaller instance;

    public static RaidArrayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RaidArrayJsonMarshaller();
        return instance;
    }

}
