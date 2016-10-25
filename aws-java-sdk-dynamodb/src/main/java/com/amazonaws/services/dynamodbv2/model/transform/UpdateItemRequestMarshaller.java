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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UpdateItemRequest Marshaller
 */
public class UpdateItemRequestMarshaller implements Marshaller<Request<UpdateItemRequest>, UpdateItemRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateItemRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateItemRequest> marshall(UpdateItemRequest updateItemRequest) {

        if (updateItemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateItemRequest> request = new DefaultRequest<UpdateItemRequest>(updateItemRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.UpdateItem");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateItemRequest.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(updateItemRequest.getTableName());
            }

            java.util.Map<String, AttributeValue> keyMap = updateItemRequest.getKey();
            if (keyMap != null) {
                jsonGenerator.writeFieldName("Key");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> keyMapValue : keyMap.entrySet()) {
                    if (keyMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(keyMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(keyMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, AttributeValueUpdate> attributeUpdatesMap = updateItemRequest.getAttributeUpdates();
            if (attributeUpdatesMap != null) {
                jsonGenerator.writeFieldName("AttributeUpdates");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValueUpdate> attributeUpdatesMapValue : attributeUpdatesMap.entrySet()) {
                    if (attributeUpdatesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(attributeUpdatesMapValue.getKey());

                        AttributeValueUpdateJsonMarshaller.getInstance().marshall(attributeUpdatesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, ExpectedAttributeValue> expectedMap = updateItemRequest.getExpected();
            if (expectedMap != null) {
                jsonGenerator.writeFieldName("Expected");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, ExpectedAttributeValue> expectedMapValue : expectedMap.entrySet()) {
                    if (expectedMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(expectedMapValue.getKey());

                        ExpectedAttributeValueJsonMarshaller.getInstance().marshall(expectedMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (updateItemRequest.getConditionalOperator() != null) {
                jsonGenerator.writeFieldName("ConditionalOperator").writeValue(updateItemRequest.getConditionalOperator());
            }
            if (updateItemRequest.getReturnValues() != null) {
                jsonGenerator.writeFieldName("ReturnValues").writeValue(updateItemRequest.getReturnValues());
            }
            if (updateItemRequest.getReturnConsumedCapacity() != null) {
                jsonGenerator.writeFieldName("ReturnConsumedCapacity").writeValue(updateItemRequest.getReturnConsumedCapacity());
            }
            if (updateItemRequest.getReturnItemCollectionMetrics() != null) {
                jsonGenerator.writeFieldName("ReturnItemCollectionMetrics").writeValue(updateItemRequest.getReturnItemCollectionMetrics());
            }
            if (updateItemRequest.getUpdateExpression() != null) {
                jsonGenerator.writeFieldName("UpdateExpression").writeValue(updateItemRequest.getUpdateExpression());
            }
            if (updateItemRequest.getConditionExpression() != null) {
                jsonGenerator.writeFieldName("ConditionExpression").writeValue(updateItemRequest.getConditionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = updateItemRequest.getExpressionAttributeNames();
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

            java.util.Map<String, AttributeValue> expressionAttributeValuesMap = updateItemRequest.getExpressionAttributeValues();
            if (expressionAttributeValuesMap != null) {
                jsonGenerator.writeFieldName("ExpressionAttributeValues");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> expressionAttributeValuesMapValue : expressionAttributeValuesMap.entrySet()) {
                    if (expressionAttributeValuesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(expressionAttributeValuesMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(expressionAttributeValuesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
