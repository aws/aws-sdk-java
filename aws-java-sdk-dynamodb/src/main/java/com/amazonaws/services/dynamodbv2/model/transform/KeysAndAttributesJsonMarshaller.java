/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * KeysAndAttributesMarshaller
 */
public class KeysAndAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(KeysAndAttributes keysAndAttributes,
            JSONWriter jsonWriter) {
        if (keysAndAttributes == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            java.util.List<java.util.Map<String, AttributeValue>> keysList = keysAndAttributes
                    .getKeys();
            if (keysList != null) {
                jsonWriter.key("Keys");
                jsonWriter.array();
                for (java.util.Map<String, AttributeValue> keysListValue : keysList) {
                    if (keysListValue != null) {

                        jsonWriter.object();
                        for (Map.Entry<String, AttributeValue> KeysListMapEntry : keysListValue
                                .entrySet()) {
                            if (KeysListMapEntry.getValue() != null) {
                                jsonWriter.key(KeysListMapEntry.getKey());
                                AttributeValueJsonMarshaller.getInstance()
                                        .marshall(KeysListMapEntry.getValue(),
                                                jsonWriter);
                            }
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<String> attributesToGetList = keysAndAttributes
                    .getAttributesToGet();
            if (attributesToGetList != null) {
                jsonWriter.key("AttributesToGet");
                jsonWriter.array();
                for (String attributesToGetListValue : attributesToGetList) {
                    if (attributesToGetListValue != null) {
                        jsonWriter.value(attributesToGetListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (keysAndAttributes.getConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(
                        keysAndAttributes.getConsistentRead());
            }

            if (keysAndAttributes.getProjectionExpression() != null) {
                jsonWriter.key("ProjectionExpression").value(
                        keysAndAttributes.getProjectionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = keysAndAttributes
                    .getExpressionAttributeNames();
            if (expressionAttributeNamesMap != null) {
                jsonWriter.key("ExpressionAttributeNames");
                jsonWriter.object();

                for (Map.Entry<String, String> expressionAttributeNamesMapValue : expressionAttributeNamesMap
                        .entrySet()) {
                    if (expressionAttributeNamesMapValue.getValue() != null) {
                        jsonWriter.key(expressionAttributeNamesMapValue
                                .getKey());

                        jsonWriter.value(expressionAttributeNamesMapValue
                                .getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KeysAndAttributesJsonMarshaller instance;

    public static KeysAndAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeysAndAttributesJsonMarshaller();
        return instance;
    }

}
