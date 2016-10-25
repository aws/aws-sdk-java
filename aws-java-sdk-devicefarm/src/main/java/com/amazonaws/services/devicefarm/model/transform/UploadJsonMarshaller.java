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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UploadMarshaller
 */
public class UploadJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Upload upload, StructuredJsonGenerator jsonGenerator) {

        if (upload == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (upload.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(upload.getArn());
            }
            if (upload.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(upload.getName());
            }
            if (upload.getCreated() != null) {
                jsonGenerator.writeFieldName("created").writeValue(upload.getCreated());
            }
            if (upload.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(upload.getType());
            }
            if (upload.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(upload.getStatus());
            }
            if (upload.getUrl() != null) {
                jsonGenerator.writeFieldName("url").writeValue(upload.getUrl());
            }
            if (upload.getMetadata() != null) {
                jsonGenerator.writeFieldName("metadata").writeValue(upload.getMetadata());
            }
            if (upload.getContentType() != null) {
                jsonGenerator.writeFieldName("contentType").writeValue(upload.getContentType());
            }
            if (upload.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(upload.getMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UploadJsonMarshaller instance;

    public static UploadJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UploadJsonMarshaller();
        return instance;
    }

}
