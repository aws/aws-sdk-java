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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DynamoDBActionMarshaller
 */
public class DynamoDBActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DynamoDBAction dynamoDBAction, StructuredJsonGenerator jsonGenerator) {

        if (dynamoDBAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (dynamoDBAction.getTableName() != null) {
                jsonGenerator.writeFieldName("tableName").writeValue(dynamoDBAction.getTableName());
            }
            if (dynamoDBAction.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(dynamoDBAction.getRoleArn());
            }
            if (dynamoDBAction.getOperation() != null) {
                jsonGenerator.writeFieldName("operation").writeValue(dynamoDBAction.getOperation());
            }
            if (dynamoDBAction.getHashKeyField() != null) {
                jsonGenerator.writeFieldName("hashKeyField").writeValue(dynamoDBAction.getHashKeyField());
            }
            if (dynamoDBAction.getHashKeyValue() != null) {
                jsonGenerator.writeFieldName("hashKeyValue").writeValue(dynamoDBAction.getHashKeyValue());
            }
            if (dynamoDBAction.getHashKeyType() != null) {
                jsonGenerator.writeFieldName("hashKeyType").writeValue(dynamoDBAction.getHashKeyType());
            }
            if (dynamoDBAction.getRangeKeyField() != null) {
                jsonGenerator.writeFieldName("rangeKeyField").writeValue(dynamoDBAction.getRangeKeyField());
            }
            if (dynamoDBAction.getRangeKeyValue() != null) {
                jsonGenerator.writeFieldName("rangeKeyValue").writeValue(dynamoDBAction.getRangeKeyValue());
            }
            if (dynamoDBAction.getRangeKeyType() != null) {
                jsonGenerator.writeFieldName("rangeKeyType").writeValue(dynamoDBAction.getRangeKeyType());
            }
            if (dynamoDBAction.getPayloadField() != null) {
                jsonGenerator.writeFieldName("payloadField").writeValue(dynamoDBAction.getPayloadField());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DynamoDBActionJsonMarshaller instance;

    public static DynamoDBActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDBActionJsonMarshaller();
        return instance;
    }

}
