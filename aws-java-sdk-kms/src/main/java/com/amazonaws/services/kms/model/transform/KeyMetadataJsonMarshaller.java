/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.json.*;

/**
 * KeyMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(KeyMetadata keyMetadata, StructuredJsonGenerator jsonGenerator) {

        if (keyMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (keyMetadata.getAWSAccountId() != null) {
                jsonGenerator.writeFieldName("AWSAccountId").writeValue(keyMetadata.getAWSAccountId());
            }
            if (keyMetadata.getKeyId() != null) {
                jsonGenerator.writeFieldName("KeyId").writeValue(keyMetadata.getKeyId());
            }
            if (keyMetadata.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(keyMetadata.getArn());
            }
            if (keyMetadata.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(keyMetadata.getCreationDate());
            }
            if (keyMetadata.getEnabled() != null) {
                jsonGenerator.writeFieldName("Enabled").writeValue(keyMetadata.getEnabled());
            }
            if (keyMetadata.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(keyMetadata.getDescription());
            }
            if (keyMetadata.getKeyUsage() != null) {
                jsonGenerator.writeFieldName("KeyUsage").writeValue(keyMetadata.getKeyUsage());
            }
            if (keyMetadata.getKeyState() != null) {
                jsonGenerator.writeFieldName("KeyState").writeValue(keyMetadata.getKeyState());
            }
            if (keyMetadata.getDeletionDate() != null) {
                jsonGenerator.writeFieldName("DeletionDate").writeValue(keyMetadata.getDeletionDate());
            }
            if (keyMetadata.getValidTo() != null) {
                jsonGenerator.writeFieldName("ValidTo").writeValue(keyMetadata.getValidTo());
            }
            if (keyMetadata.getOrigin() != null) {
                jsonGenerator.writeFieldName("Origin").writeValue(keyMetadata.getOrigin());
            }
            if (keyMetadata.getExpirationModel() != null) {
                jsonGenerator.writeFieldName("ExpirationModel").writeValue(keyMetadata.getExpirationModel());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KeyMetadataJsonMarshaller instance;

    public static KeyMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyMetadataJsonMarshaller();
        return instance;
    }

}
