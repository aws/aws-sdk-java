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
package com.amazonaws.services.ecr.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ImageDetailMarshaller
 */
public class ImageDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ImageDetail imageDetail, StructuredJsonGenerator jsonGenerator) {

        if (imageDetail == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (imageDetail.getRegistryId() != null) {
                jsonGenerator.writeFieldName("registryId").writeValue(imageDetail.getRegistryId());
            }
            if (imageDetail.getRepositoryName() != null) {
                jsonGenerator.writeFieldName("repositoryName").writeValue(imageDetail.getRepositoryName());
            }
            if (imageDetail.getImageDigest() != null) {
                jsonGenerator.writeFieldName("imageDigest").writeValue(imageDetail.getImageDigest());
            }

            java.util.List<String> imageTagsList = imageDetail.getImageTags();
            if (imageTagsList != null) {
                jsonGenerator.writeFieldName("imageTags");
                jsonGenerator.writeStartArray();
                for (String imageTagsListValue : imageTagsList) {
                    if (imageTagsListValue != null) {
                        jsonGenerator.writeValue(imageTagsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (imageDetail.getImageSizeInBytes() != null) {
                jsonGenerator.writeFieldName("imageSizeInBytes").writeValue(imageDetail.getImageSizeInBytes());
            }
            if (imageDetail.getImagePushedAt() != null) {
                jsonGenerator.writeFieldName("imagePushedAt").writeValue(imageDetail.getImagePushedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ImageDetailJsonMarshaller instance;

    public static ImageDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageDetailJsonMarshaller();
        return instance;
    }

}
