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
 * ConsumedCapacityMarshaller
 */
public class ConsumedCapacityJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ConsumedCapacity consumedCapacity, StructuredJsonGenerator jsonGenerator) {

        if (consumedCapacity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (consumedCapacity.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(consumedCapacity.getTableName());
            }
            if (consumedCapacity.getCapacityUnits() != null) {
                jsonGenerator.writeFieldName("CapacityUnits").writeValue(consumedCapacity.getCapacityUnits());
            }
            if (consumedCapacity.getTable() != null) {
                jsonGenerator.writeFieldName("Table");
                CapacityJsonMarshaller.getInstance().marshall(consumedCapacity.getTable(), jsonGenerator);
            }

            java.util.Map<String, Capacity> localSecondaryIndexesMap = consumedCapacity.getLocalSecondaryIndexes();
            if (localSecondaryIndexesMap != null) {
                jsonGenerator.writeFieldName("LocalSecondaryIndexes");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Capacity> localSecondaryIndexesMapValue : localSecondaryIndexesMap.entrySet()) {
                    if (localSecondaryIndexesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(localSecondaryIndexesMapValue.getKey());

                        CapacityJsonMarshaller.getInstance().marshall(localSecondaryIndexesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, Capacity> globalSecondaryIndexesMap = consumedCapacity.getGlobalSecondaryIndexes();
            if (globalSecondaryIndexesMap != null) {
                jsonGenerator.writeFieldName("GlobalSecondaryIndexes");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Capacity> globalSecondaryIndexesMapValue : globalSecondaryIndexesMap.entrySet()) {
                    if (globalSecondaryIndexesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(globalSecondaryIndexesMapValue.getKey());

                        CapacityJsonMarshaller.getInstance().marshall(globalSecondaryIndexesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConsumedCapacityJsonMarshaller instance;

    public static ConsumedCapacityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConsumedCapacityJsonMarshaller();
        return instance;
    }

}
