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
package com.amazonaws.services.elasticfilesystem.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MountTargetDescriptionMarshaller
 */
public class MountTargetDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MountTargetDescription mountTargetDescription, StructuredJsonGenerator jsonGenerator) {

        if (mountTargetDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (mountTargetDescription.getOwnerId() != null) {
                jsonGenerator.writeFieldName("OwnerId").writeValue(mountTargetDescription.getOwnerId());
            }
            if (mountTargetDescription.getMountTargetId() != null) {
                jsonGenerator.writeFieldName("MountTargetId").writeValue(mountTargetDescription.getMountTargetId());
            }
            if (mountTargetDescription.getFileSystemId() != null) {
                jsonGenerator.writeFieldName("FileSystemId").writeValue(mountTargetDescription.getFileSystemId());
            }
            if (mountTargetDescription.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(mountTargetDescription.getSubnetId());
            }
            if (mountTargetDescription.getLifeCycleState() != null) {
                jsonGenerator.writeFieldName("LifeCycleState").writeValue(mountTargetDescription.getLifeCycleState());
            }
            if (mountTargetDescription.getIpAddress() != null) {
                jsonGenerator.writeFieldName("IpAddress").writeValue(mountTargetDescription.getIpAddress());
            }
            if (mountTargetDescription.getNetworkInterfaceId() != null) {
                jsonGenerator.writeFieldName("NetworkInterfaceId").writeValue(mountTargetDescription.getNetworkInterfaceId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MountTargetDescriptionJsonMarshaller instance;

    public static MountTargetDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MountTargetDescriptionJsonMarshaller();
        return instance;
    }

}
