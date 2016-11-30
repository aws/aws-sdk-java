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
package com.amazonaws.services.lightsail.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DiskMarshaller
 */
public class DiskJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Disk disk, StructuredJsonGenerator jsonGenerator) {

        if (disk == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (disk.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(disk.getName());
            }
            if (disk.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(disk.getArn());
            }
            if (disk.getSupportCode() != null) {
                jsonGenerator.writeFieldName("supportCode").writeValue(disk.getSupportCode());
            }
            if (disk.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(disk.getCreatedAt());
            }
            if (disk.getLocation() != null) {
                jsonGenerator.writeFieldName("location");
                ResourceLocationJsonMarshaller.getInstance().marshall(disk.getLocation(), jsonGenerator);
            }
            if (disk.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(disk.getResourceType());
            }
            if (disk.getSizeInGb() != null) {
                jsonGenerator.writeFieldName("sizeInGb").writeValue(disk.getSizeInGb());
            }
            if (disk.getGbInUse() != null) {
                jsonGenerator.writeFieldName("gbInUse").writeValue(disk.getGbInUse());
            }
            if (disk.getIsSystemDisk() != null) {
                jsonGenerator.writeFieldName("isSystemDisk").writeValue(disk.getIsSystemDisk());
            }
            if (disk.getIops() != null) {
                jsonGenerator.writeFieldName("iops").writeValue(disk.getIops());
            }
            if (disk.getPath() != null) {
                jsonGenerator.writeFieldName("path").writeValue(disk.getPath());
            }
            if (disk.getAttachedTo() != null) {
                jsonGenerator.writeFieldName("attachedTo").writeValue(disk.getAttachedTo());
            }
            if (disk.getIsAttached() != null) {
                jsonGenerator.writeFieldName("isAttached").writeValue(disk.getIsAttached());
            }
            if (disk.getAttachmentState() != null) {
                jsonGenerator.writeFieldName("attachmentState").writeValue(disk.getAttachmentState());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DiskJsonMarshaller instance;

    public static DiskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiskJsonMarshaller();
        return instance;
    }

}
