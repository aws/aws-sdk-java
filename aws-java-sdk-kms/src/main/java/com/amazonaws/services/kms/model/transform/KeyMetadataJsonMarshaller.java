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

package com.amazonaws.services.kms.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * KeyMetadataMarshaller
 */
public class KeyMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(KeyMetadata keyMetadata, JSONWriter jsonWriter) {
        if (keyMetadata == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (keyMetadata.getAWSAccountId() != null) {
                jsonWriter.key("AWSAccountId").value(
                        keyMetadata.getAWSAccountId());
            }

            if (keyMetadata.getKeyId() != null) {
                jsonWriter.key("KeyId").value(keyMetadata.getKeyId());
            }

            if (keyMetadata.getArn() != null) {
                jsonWriter.key("Arn").value(keyMetadata.getArn());
            }

            if (keyMetadata.getCreationDate() != null) {
                jsonWriter.key("CreationDate").value(
                        keyMetadata.getCreationDate());
            }

            if (keyMetadata.getEnabled() != null) {
                jsonWriter.key("Enabled").value(keyMetadata.getEnabled());
            }

            if (keyMetadata.getDescription() != null) {
                jsonWriter.key("Description").value(
                        keyMetadata.getDescription());
            }

            if (keyMetadata.getKeyUsage() != null) {
                jsonWriter.key("KeyUsage").value(keyMetadata.getKeyUsage());
            }

            if (keyMetadata.getKeyState() != null) {
                jsonWriter.key("KeyState").value(keyMetadata.getKeyState());
            }

            if (keyMetadata.getDeletionDate() != null) {
                jsonWriter.key("DeletionDate").value(
                        keyMetadata.getDeletionDate());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KeyMetadataJsonMarshaller instance;

    public static KeyMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyMetadataJsonMarshaller();
        return instance;
    }

}
