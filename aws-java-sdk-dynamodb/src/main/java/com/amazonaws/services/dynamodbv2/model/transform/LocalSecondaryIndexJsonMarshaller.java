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
 * LocalSecondaryIndexMarshaller
 */
public class LocalSecondaryIndexJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LocalSecondaryIndex localSecondaryIndex, StructuredJsonGenerator jsonGenerator) {

        if (localSecondaryIndex == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (localSecondaryIndex.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(localSecondaryIndex.getIndexName());
            }

            java.util.List<KeySchemaElement> keySchemaList = localSecondaryIndex.getKeySchema();
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
            if (localSecondaryIndex.getProjection() != null) {
                jsonGenerator.writeFieldName("Projection");
                ProjectionJsonMarshaller.getInstance().marshall(localSecondaryIndex.getProjection(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LocalSecondaryIndexJsonMarshaller instance;

    public static LocalSecondaryIndexJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalSecondaryIndexJsonMarshaller();
        return instance;
    }

}
