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
 * LocalSecondaryIndexDescriptionMarshaller
 */
public class LocalSecondaryIndexDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LocalSecondaryIndexDescription localSecondaryIndexDescription, StructuredJsonGenerator jsonGenerator) {

        if (localSecondaryIndexDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (localSecondaryIndexDescription.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(localSecondaryIndexDescription.getIndexName());
            }

            java.util.List<KeySchemaElement> keySchemaList = localSecondaryIndexDescription.getKeySchema();
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
            if (localSecondaryIndexDescription.getProjection() != null) {
                jsonGenerator.writeFieldName("Projection");
                ProjectionJsonMarshaller.getInstance().marshall(localSecondaryIndexDescription.getProjection(), jsonGenerator);
            }
            if (localSecondaryIndexDescription.getIndexSizeBytes() != null) {
                jsonGenerator.writeFieldName("IndexSizeBytes").writeValue(localSecondaryIndexDescription.getIndexSizeBytes());
            }
            if (localSecondaryIndexDescription.getItemCount() != null) {
                jsonGenerator.writeFieldName("ItemCount").writeValue(localSecondaryIndexDescription.getItemCount());
            }
            if (localSecondaryIndexDescription.getIndexArn() != null) {
                jsonGenerator.writeFieldName("IndexArn").writeValue(localSecondaryIndexDescription.getIndexArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LocalSecondaryIndexDescriptionJsonMarshaller instance;

    public static LocalSecondaryIndexDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalSecondaryIndexDescriptionJsonMarshaller();
        return instance;
    }

}
