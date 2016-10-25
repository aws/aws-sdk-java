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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ProvisionedProductDetailMarshaller
 */
public class ProvisionedProductDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ProvisionedProductDetail provisionedProductDetail, StructuredJsonGenerator jsonGenerator) {

        if (provisionedProductDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (provisionedProductDetail.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(provisionedProductDetail.getName());
            }
            if (provisionedProductDetail.getArn() != null) {
                jsonGenerator.writeFieldName("Arn").writeValue(provisionedProductDetail.getArn());
            }
            if (provisionedProductDetail.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(provisionedProductDetail.getType());
            }
            if (provisionedProductDetail.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(provisionedProductDetail.getId());
            }
            if (provisionedProductDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(provisionedProductDetail.getStatus());
            }
            if (provisionedProductDetail.getStatusMessage() != null) {
                jsonGenerator.writeFieldName("StatusMessage").writeValue(provisionedProductDetail.getStatusMessage());
            }
            if (provisionedProductDetail.getCreatedTime() != null) {
                jsonGenerator.writeFieldName("CreatedTime").writeValue(provisionedProductDetail.getCreatedTime());
            }
            if (provisionedProductDetail.getIdempotencyToken() != null) {
                jsonGenerator.writeFieldName("IdempotencyToken").writeValue(provisionedProductDetail.getIdempotencyToken());
            }
            if (provisionedProductDetail.getLastRecordId() != null) {
                jsonGenerator.writeFieldName("LastRecordId").writeValue(provisionedProductDetail.getLastRecordId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProvisionedProductDetailJsonMarshaller instance;

    public static ProvisionedProductDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductDetailJsonMarshaller();
        return instance;
    }

}
