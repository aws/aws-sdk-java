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
 * KeysAndAttributesMarshaller
 */
public class KeysAndAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(KeysAndAttributes keysAndAttributes, StructuredJsonGenerator jsonGenerator) {

        if (keysAndAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<java.util.Map<String, AttributeValue>> keysList = keysAndAttributes.getKeys();
            if (keysList != null) {
                jsonGenerator.writeFieldName("Keys");
                jsonGenerator.writeStartArray();
                for (java.util.Map<String, AttributeValue> keysListValue : keysList) {
                    if (keysListValue != null) {

                        jsonGenerator.writeStartObject();
                        for (Map.Entry<String, AttributeValue> KeysListMapEntry : keysListValue.entrySet()) {
                            if (KeysListMapEntry.getValue() != null) {
                                jsonGenerator.writeFieldName(KeysListMapEntry.getKey());
                                AttributeValueJsonMarshaller.getInstance().marshall(KeysListMapEntry.getValue(), jsonGenerator);
                            }
                        }
                        jsonGenerator.writeEndObject();
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> attributesToGetList = keysAndAttributes.getAttributesToGet();
            if (attributesToGetList != null) {
                jsonGenerator.writeFieldName("AttributesToGet");
                jsonGenerator.writeStartArray();
                for (String attributesToGetListValue : attributesToGetList) {
                    if (attributesToGetListValue != null) {
                        jsonGenerator.writeValue(attributesToGetListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (keysAndAttributes.getConsistentRead() != null) {
                jsonGenerator.writeFieldName("ConsistentRead").writeValue(keysAndAttributes.getConsistentRead());
            }
            if (keysAndAttributes.getProjectionExpression() != null) {
                jsonGenerator.writeFieldName("ProjectionExpression").writeValue(keysAndAttributes.getProjectionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = keysAndAttributes.getExpressionAttributeNames();
            if (expressionAttributeNamesMap != null) {
                jsonGenerator.writeFieldName("ExpressionAttributeNames");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> expressionAttributeNamesMapValue : expressionAttributeNamesMap.entrySet()) {
                    if (expressionAttributeNamesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(expressionAttributeNamesMapValue.getKey());

                        jsonGenerator.writeValue(expressionAttributeNamesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KeysAndAttributesJsonMarshaller instance;

    public static KeysAndAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeysAndAttributesJsonMarshaller();
        return instance;
    }

}
