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
 * InventoryItemMarshaller
 */
public class InventoryItemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InventoryItem inventoryItem, StructuredJsonGenerator jsonGenerator) {

        if (inventoryItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (inventoryItem.getTypeName() != null) {
                jsonGenerator.writeFieldName("TypeName").writeValue(inventoryItem.getTypeName());
            }
            if (inventoryItem.getSchemaVersion() != null) {
                jsonGenerator.writeFieldName("SchemaVersion").writeValue(inventoryItem.getSchemaVersion());
            }
            if (inventoryItem.getCaptureTime() != null) {
                jsonGenerator.writeFieldName("CaptureTime").writeValue(inventoryItem.getCaptureTime());
            }
            if (inventoryItem.getContentHash() != null) {
                jsonGenerator.writeFieldName("ContentHash").writeValue(inventoryItem.getContentHash());
            }

            com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>> contentList = (com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>) inventoryItem
                    .getContent();
            if (!contentList.isEmpty() || !contentList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Content");
                jsonGenerator.writeStartArray();
                for (java.util.Map<String, String> contentListValue : contentList) {
                    if (contentListValue != null) {

                        jsonGenerator.writeStartObject();
                        for (Map.Entry<String, String> ContentListMapEntry : contentListValue.entrySet()) {
                            if (ContentListMapEntry.getValue() != null) {
                                jsonGenerator.writeFieldName(ContentListMapEntry.getKey());
                                jsonGenerator.writeValue(ContentListMapEntry.getValue());
                            }
                        }
                        jsonGenerator.writeEndObject();
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InventoryItemJsonMarshaller instance;

    public static InventoryItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryItemJsonMarshaller();
        return instance;
    }

}
