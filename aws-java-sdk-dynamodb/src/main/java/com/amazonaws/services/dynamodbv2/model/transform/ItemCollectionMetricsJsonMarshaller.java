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
 * ItemCollectionMetricsMarshaller
 */
public class ItemCollectionMetricsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ItemCollectionMetrics itemCollectionMetrics, StructuredJsonGenerator jsonGenerator) {

        if (itemCollectionMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.Map<String, AttributeValue> itemCollectionKeyMap = itemCollectionMetrics.getItemCollectionKey();
            if (itemCollectionKeyMap != null) {
                jsonGenerator.writeFieldName("ItemCollectionKey");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> itemCollectionKeyMapValue : itemCollectionKeyMap.entrySet()) {
                    if (itemCollectionKeyMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(itemCollectionKeyMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(itemCollectionKeyMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.List<Double> sizeEstimateRangeGBList = itemCollectionMetrics.getSizeEstimateRangeGB();
            if (sizeEstimateRangeGBList != null) {
                jsonGenerator.writeFieldName("SizeEstimateRangeGB");
                jsonGenerator.writeStartArray();
                for (Double sizeEstimateRangeGBListValue : sizeEstimateRangeGBList) {
                    if (sizeEstimateRangeGBListValue != null) {
                        jsonGenerator.writeValue(sizeEstimateRangeGBListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ItemCollectionMetricsJsonMarshaller instance;

    public static ItemCollectionMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ItemCollectionMetricsJsonMarshaller();
        return instance;
    }

}
