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
 * GlobalSecondaryIndexMarshaller
 */
public class GlobalSecondaryIndexJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GlobalSecondaryIndex globalSecondaryIndex, StructuredJsonGenerator jsonGenerator) {

        if (globalSecondaryIndex == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (globalSecondaryIndex.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(globalSecondaryIndex.getIndexName());
            }

            java.util.List<KeySchemaElement> keySchemaList = globalSecondaryIndex.getKeySchema();
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
            if (globalSecondaryIndex.getProjection() != null) {
                jsonGenerator.writeFieldName("Projection");
                ProjectionJsonMarshaller.getInstance().marshall(globalSecondaryIndex.getProjection(), jsonGenerator);
            }
            if (globalSecondaryIndex.getProvisionedThroughput() != null) {
                jsonGenerator.writeFieldName("ProvisionedThroughput");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(globalSecondaryIndex.getProvisionedThroughput(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GlobalSecondaryIndexJsonMarshaller instance;

    public static GlobalSecondaryIndexJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalSecondaryIndexJsonMarshaller();
        return instance;
    }

}
