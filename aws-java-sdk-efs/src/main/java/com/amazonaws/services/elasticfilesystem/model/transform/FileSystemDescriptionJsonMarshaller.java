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
 * FileSystemDescriptionMarshaller
 */
public class FileSystemDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FileSystemDescription fileSystemDescription, StructuredJsonGenerator jsonGenerator) {

        if (fileSystemDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (fileSystemDescription.getOwnerId() != null) {
                jsonGenerator.writeFieldName("OwnerId").writeValue(fileSystemDescription.getOwnerId());
            }
            if (fileSystemDescription.getCreationToken() != null) {
                jsonGenerator.writeFieldName("CreationToken").writeValue(fileSystemDescription.getCreationToken());
            }
            if (fileSystemDescription.getFileSystemId() != null) {
                jsonGenerator.writeFieldName("FileSystemId").writeValue(fileSystemDescription.getFileSystemId());
            }
            if (fileSystemDescription.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(fileSystemDescription.getCreationTime());
            }
            if (fileSystemDescription.getLifeCycleState() != null) {
                jsonGenerator.writeFieldName("LifeCycleState").writeValue(fileSystemDescription.getLifeCycleState());
            }
            if (fileSystemDescription.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(fileSystemDescription.getName());
            }
            if (fileSystemDescription.getNumberOfMountTargets() != null) {
                jsonGenerator.writeFieldName("NumberOfMountTargets").writeValue(fileSystemDescription.getNumberOfMountTargets());
            }
            if (fileSystemDescription.getSizeInBytes() != null) {
                jsonGenerator.writeFieldName("SizeInBytes");
                FileSystemSizeJsonMarshaller.getInstance().marshall(fileSystemDescription.getSizeInBytes(), jsonGenerator);
            }
            if (fileSystemDescription.getPerformanceMode() != null) {
                jsonGenerator.writeFieldName("PerformanceMode").writeValue(fileSystemDescription.getPerformanceMode());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FileSystemDescriptionJsonMarshaller instance;

    public static FileSystemDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemDescriptionJsonMarshaller();
        return instance;
    }

}
