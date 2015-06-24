/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticfilesystem.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * MountTargetDescriptionMarshaller
 */
public class MountTargetDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(MountTargetDescription mountTargetDescription,
            JSONWriter jsonWriter) {
        if (mountTargetDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (mountTargetDescription.getOwnerId() != null) {
                jsonWriter.key("OwnerId").value(
                        mountTargetDescription.getOwnerId());
            }

            if (mountTargetDescription.getMountTargetId() != null) {
                jsonWriter.key("MountTargetId").value(
                        mountTargetDescription.getMountTargetId());
            }

            if (mountTargetDescription.getFileSystemId() != null) {
                jsonWriter.key("FileSystemId").value(
                        mountTargetDescription.getFileSystemId());
            }

            if (mountTargetDescription.getSubnetId() != null) {
                jsonWriter.key("SubnetId").value(
                        mountTargetDescription.getSubnetId());
            }

            if (mountTargetDescription.getLifeCycleState() != null) {
                jsonWriter.key("LifeCycleState").value(
                        mountTargetDescription.getLifeCycleState());
            }

            if (mountTargetDescription.getIpAddress() != null) {
                jsonWriter.key("IpAddress").value(
                        mountTargetDescription.getIpAddress());
            }

            if (mountTargetDescription.getNetworkInterfaceId() != null) {
                jsonWriter.key("NetworkInterfaceId").value(
                        mountTargetDescription.getNetworkInterfaceId());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MountTargetDescriptionJsonMarshaller instance;

    public static MountTargetDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MountTargetDescriptionJsonMarshaller();
        return instance;
    }

}
