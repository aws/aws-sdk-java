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
 * VolumeConfigurationMarshaller
 */
public class VolumeConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(VolumeConfiguration volumeConfiguration,
            JSONWriter jsonWriter) {
        if (volumeConfiguration == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (volumeConfiguration.getMountPoint() != null) {
                jsonWriter.key("MountPoint").value(
                        volumeConfiguration.getMountPoint());
            }

            if (volumeConfiguration.getRaidLevel() != null) {
                jsonWriter.key("RaidLevel").value(
                        volumeConfiguration.getRaidLevel());
            }

            if (volumeConfiguration.getNumberOfDisks() != null) {
                jsonWriter.key("NumberOfDisks").value(
                        volumeConfiguration.getNumberOfDisks());
            }

            if (volumeConfiguration.getSize() != null) {
                jsonWriter.key("Size").value(volumeConfiguration.getSize());
            }

            if (volumeConfiguration.getVolumeType() != null) {
                jsonWriter.key("VolumeType").value(
                        volumeConfiguration.getVolumeType());
            }

            if (volumeConfiguration.getIops() != null) {
                jsonWriter.key("Iops").value(volumeConfiguration.getIops());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VolumeConfigurationJsonMarshaller instance;

    public static VolumeConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeConfigurationJsonMarshaller();
        return instance;
    }

}
