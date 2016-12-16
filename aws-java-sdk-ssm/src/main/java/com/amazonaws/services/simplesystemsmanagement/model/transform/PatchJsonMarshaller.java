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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * PatchMarshaller
 */
public class PatchJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Patch patch, StructuredJsonGenerator jsonGenerator) {

        if (patch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (patch.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(patch.getId());
            }
            if (patch.getReleaseDate() != null) {
                jsonGenerator.writeFieldName("ReleaseDate").writeValue(patch.getReleaseDate());
            }
            if (patch.getTitle() != null) {
                jsonGenerator.writeFieldName("Title").writeValue(patch.getTitle());
            }
            if (patch.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(patch.getDescription());
            }
            if (patch.getContentUrl() != null) {
                jsonGenerator.writeFieldName("ContentUrl").writeValue(patch.getContentUrl());
            }
            if (patch.getVendor() != null) {
                jsonGenerator.writeFieldName("Vendor").writeValue(patch.getVendor());
            }
            if (patch.getProductFamily() != null) {
                jsonGenerator.writeFieldName("ProductFamily").writeValue(patch.getProductFamily());
            }
            if (patch.getProduct() != null) {
                jsonGenerator.writeFieldName("Product").writeValue(patch.getProduct());
            }
            if (patch.getClassification() != null) {
                jsonGenerator.writeFieldName("Classification").writeValue(patch.getClassification());
            }
            if (patch.getMsrcSeverity() != null) {
                jsonGenerator.writeFieldName("MsrcSeverity").writeValue(patch.getMsrcSeverity());
            }
            if (patch.getKbNumber() != null) {
                jsonGenerator.writeFieldName("KbNumber").writeValue(patch.getKbNumber());
            }
            if (patch.getMsrcNumber() != null) {
                jsonGenerator.writeFieldName("MsrcNumber").writeValue(patch.getMsrcNumber());
            }
            if (patch.getLanguage() != null) {
                jsonGenerator.writeFieldName("Language").writeValue(patch.getLanguage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PatchJsonMarshaller instance;

    public static PatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchJsonMarshaller();
        return instance;
    }

}
