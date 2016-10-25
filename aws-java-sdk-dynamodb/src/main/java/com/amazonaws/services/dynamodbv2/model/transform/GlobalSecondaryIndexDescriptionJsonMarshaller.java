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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GlobalSecondaryIndexDescriptionMarshaller
 */
public class GlobalSecondaryIndexDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GlobalSecondaryIndexDescription globalSecondaryIndexDescription, StructuredJsonGenerator jsonGenerator) {

        if (globalSecondaryIndexDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (globalSecondaryIndexDescription.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(globalSecondaryIndexDescription.getIndexName());
            }

            java.util.List<KeySchemaElement> keySchemaList = globalSecondaryIndexDescription.getKeySchema();
            if (keySchemaList != null) {
                jsonGenerator.writeFieldName("KeySchema");
                jsonGenerator.writeStartArray();
                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {

                        KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (globalSecondaryIndexDescription.getProjection() != null) {
                jsonGenerator.writeFieldName("Projection");
                ProjectionJsonMarshaller.getInstance().marshall(globalSecondaryIndexDescription.getProjection(), jsonGenerator);
            }
            if (globalSecondaryIndexDescription.getIndexStatus() != null) {
                jsonGenerator.writeFieldName("IndexStatus").writeValue(globalSecondaryIndexDescription.getIndexStatus());
            }
            if (globalSecondaryIndexDescription.getBackfilling() != null) {
                jsonGenerator.writeFieldName("Backfilling").writeValue(globalSecondaryIndexDescription.getBackfilling());
            }
            if (globalSecondaryIndexDescription.getProvisionedThroughput() != null) {
                jsonGenerator.writeFieldName("ProvisionedThroughput");
                ProvisionedThroughputDescriptionJsonMarshaller.getInstance()
                        .marshall(globalSecondaryIndexDescription.getProvisionedThroughput(), jsonGenerator);
            }
            if (globalSecondaryIndexDescription.getIndexSizeBytes() != null) {
                jsonGenerator.writeFieldName("IndexSizeBytes").writeValue(globalSecondaryIndexDescription.getIndexSizeBytes());
            }
            if (globalSecondaryIndexDescription.getItemCount() != null) {
                jsonGenerator.writeFieldName("ItemCount").writeValue(globalSecondaryIndexDescription.getItemCount());
            }
            if (globalSecondaryIndexDescription.getIndexArn() != null) {
                jsonGenerator.writeFieldName("IndexArn").writeValue(globalSecondaryIndexDescription.getIndexArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GlobalSecondaryIndexDescriptionJsonMarshaller instance;

    public static GlobalSecondaryIndexDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalSecondaryIndexDescriptionJsonMarshaller();
        return instance;
    }

}
