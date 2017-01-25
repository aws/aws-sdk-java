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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.json.*;

/**
 * BlobMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlobMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BlobMetadata blobMetadata, StructuredJsonGenerator jsonGenerator) {

        if (blobMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (blobMetadata.getBlobId() != null) {
                jsonGenerator.writeFieldName("blobId").writeValue(blobMetadata.getBlobId());
            }
            if (blobMetadata.getPath() != null) {
                jsonGenerator.writeFieldName("path").writeValue(blobMetadata.getPath());
            }
            if (blobMetadata.getMode() != null) {
                jsonGenerator.writeFieldName("mode").writeValue(blobMetadata.getMode());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BlobMetadataJsonMarshaller instance;

    public static BlobMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlobMetadataJsonMarshaller();
        return instance;
    }

}
