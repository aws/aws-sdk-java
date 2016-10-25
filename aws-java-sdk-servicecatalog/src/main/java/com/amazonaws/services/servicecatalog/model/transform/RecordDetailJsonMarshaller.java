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
 * RecordDetailMarshaller
 */
public class RecordDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RecordDetail recordDetail, StructuredJsonGenerator jsonGenerator) {

        if (recordDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (recordDetail.getRecordId() != null) {
                jsonGenerator.writeFieldName("RecordId").writeValue(recordDetail.getRecordId());
            }
            if (recordDetail.getProvisionedProductName() != null) {
                jsonGenerator.writeFieldName("ProvisionedProductName").writeValue(recordDetail.getProvisionedProductName());
            }
            if (recordDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(recordDetail.getStatus());
            }
            if (recordDetail.getCreatedTime() != null) {
                jsonGenerator.writeFieldName("CreatedTime").writeValue(recordDetail.getCreatedTime());
            }
            if (recordDetail.getUpdatedTime() != null) {
                jsonGenerator.writeFieldName("UpdatedTime").writeValue(recordDetail.getUpdatedTime());
            }
            if (recordDetail.getProvisionedProductType() != null) {
                jsonGenerator.writeFieldName("ProvisionedProductType").writeValue(recordDetail.getProvisionedProductType());
            }
            if (recordDetail.getRecordType() != null) {
                jsonGenerator.writeFieldName("RecordType").writeValue(recordDetail.getRecordType());
            }
            if (recordDetail.getProvisionedProductId() != null) {
                jsonGenerator.writeFieldName("ProvisionedProductId").writeValue(recordDetail.getProvisionedProductId());
            }
            if (recordDetail.getProductId() != null) {
                jsonGenerator.writeFieldName("ProductId").writeValue(recordDetail.getProductId());
            }
            if (recordDetail.getProvisioningArtifactId() != null) {
                jsonGenerator.writeFieldName("ProvisioningArtifactId").writeValue(recordDetail.getProvisioningArtifactId());
            }
            if (recordDetail.getPathId() != null) {
                jsonGenerator.writeFieldName("PathId").writeValue(recordDetail.getPathId());
            }

            java.util.List<RecordError> recordErrorsList = recordDetail.getRecordErrors();
            if (recordErrorsList != null) {
                jsonGenerator.writeFieldName("RecordErrors");
                jsonGenerator.writeStartArray();
                for (RecordError recordErrorsListValue : recordErrorsList) {
                    if (recordErrorsListValue != null) {

                        RecordErrorJsonMarshaller.getInstance().marshall(recordErrorsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<RecordTag> recordTagsList = recordDetail.getRecordTags();
            if (recordTagsList != null) {
                jsonGenerator.writeFieldName("RecordTags");
                jsonGenerator.writeStartArray();
                for (RecordTag recordTagsListValue : recordTagsList) {
                    if (recordTagsListValue != null) {

                        RecordTagJsonMarshaller.getInstance().marshall(recordTagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RecordDetailJsonMarshaller instance;

    public static RecordDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordDetailJsonMarshaller();
        return instance;
    }

}
