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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;
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

            if (disk.getDiskId() != null) {
                jsonGenerator.writeFieldName("DiskId").writeValue(disk.getDiskId());
            }
            if (disk.getDiskPath() != null) {
                jsonGenerator.writeFieldName("DiskPath").writeValue(disk.getDiskPath());
            }
            if (disk.getDiskNode() != null) {
                jsonGenerator.writeFieldName("DiskNode").writeValue(disk.getDiskNode());
            }
            if (disk.getDiskStatus() != null) {
                jsonGenerator.writeFieldName("DiskStatus").writeValue(disk.getDiskStatus());
            }
            if (disk.getDiskSizeInBytes() != null) {
                jsonGenerator.writeFieldName("DiskSizeInBytes").writeValue(disk.getDiskSizeInBytes());
            }
            if (disk.getDiskAllocationType() != null) {
                jsonGenerator.writeFieldName("DiskAllocationType").writeValue(disk.getDiskAllocationType());
            }
            if (disk.getDiskAllocationResource() != null) {
                jsonGenerator.writeFieldName("DiskAllocationResource").writeValue(disk.getDiskAllocationResource());
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
