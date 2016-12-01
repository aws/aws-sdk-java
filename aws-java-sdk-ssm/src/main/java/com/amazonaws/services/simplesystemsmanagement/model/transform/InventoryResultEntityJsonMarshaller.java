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
 * InventoryResultEntityMarshaller
 */
public class InventoryResultEntityJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InventoryResultEntity inventoryResultEntity, StructuredJsonGenerator jsonGenerator) {

        if (inventoryResultEntity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (inventoryResultEntity.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(inventoryResultEntity.getId());
            }

            java.util.Map<String, InventoryResultItem> dataMap = inventoryResultEntity.getData();
            if (dataMap != null) {
                jsonGenerator.writeFieldName("Data");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, InventoryResultItem> dataMapValue : dataMap.entrySet()) {
                    if (dataMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(dataMapValue.getKey());

                        InventoryResultItemJsonMarshaller.getInstance().marshall(dataMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InventoryResultEntityJsonMarshaller instance;

    public static InventoryResultEntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryResultEntityJsonMarshaller();
        return instance;
    }

}
