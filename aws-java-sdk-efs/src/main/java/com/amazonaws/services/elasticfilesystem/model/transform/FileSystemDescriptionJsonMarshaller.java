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
 * FileSystemDescriptionMarshaller
 */
public class FileSystemDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(FileSystemDescription fileSystemDescription,
            JSONWriter jsonWriter) {
        if (fileSystemDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (fileSystemDescription.getOwnerId() != null) {
                jsonWriter.key("OwnerId").value(
                        fileSystemDescription.getOwnerId());
            }

            if (fileSystemDescription.getCreationToken() != null) {
                jsonWriter.key("CreationToken").value(
                        fileSystemDescription.getCreationToken());
            }

            if (fileSystemDescription.getFileSystemId() != null) {
                jsonWriter.key("FileSystemId").value(
                        fileSystemDescription.getFileSystemId());
            }

            if (fileSystemDescription.getCreationTime() != null) {
                jsonWriter.key("CreationTime").value(
                        fileSystemDescription.getCreationTime());
            }

            if (fileSystemDescription.getLifeCycleState() != null) {
                jsonWriter.key("LifeCycleState").value(
                        fileSystemDescription.getLifeCycleState());
            }

            if (fileSystemDescription.getName() != null) {
                jsonWriter.key("Name").value(fileSystemDescription.getName());
            }

            if (fileSystemDescription.getNumberOfMountTargets() != null) {
                jsonWriter.key("NumberOfMountTargets").value(
                        fileSystemDescription.getNumberOfMountTargets());
            }

            if (fileSystemDescription.getSizeInBytes() != null) {
                jsonWriter.key("SizeInBytes");
                FileSystemSizeJsonMarshaller.getInstance().marshall(
                        fileSystemDescription.getSizeInBytes(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FileSystemDescriptionJsonMarshaller instance;

    public static FileSystemDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemDescriptionJsonMarshaller();
        return instance;
    }

}
