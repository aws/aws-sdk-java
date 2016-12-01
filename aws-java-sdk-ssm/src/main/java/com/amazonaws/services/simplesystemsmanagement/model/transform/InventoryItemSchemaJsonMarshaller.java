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
 * InventoryItemSchemaMarshaller
 */
public class InventoryItemSchemaJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InventoryItemSchema inventoryItemSchema, StructuredJsonGenerator jsonGenerator) {

        if (inventoryItemSchema == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (inventoryItemSchema.getTypeName() != null) {
                jsonGenerator.writeFieldName("TypeName").writeValue(inventoryItemSchema.getTypeName());
            }
            if (inventoryItemSchema.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(inventoryItemSchema.getVersion());
            }

            com.amazonaws.internal.SdkInternalList<InventoryItemAttribute> attributesList = (com.amazonaws.internal.SdkInternalList<InventoryItemAttribute>) inventoryItemSchema
                    .getAttributes();
            if (!attributesList.isEmpty() || !attributesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartArray();
                for (InventoryItemAttribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        InventoryItemAttributeJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InventoryItemSchemaJsonMarshaller instance;

    public static InventoryItemSchemaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryItemSchemaJsonMarshaller();
        return instance;
    }

}
