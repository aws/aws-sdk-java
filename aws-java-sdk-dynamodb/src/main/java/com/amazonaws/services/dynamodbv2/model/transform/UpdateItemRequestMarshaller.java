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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateItemRequest Marshaller
 */
public class UpdateItemRequestMarshaller implements
        Marshaller<Request<UpdateItemRequest>, UpdateItemRequest> {

    public Request<UpdateItemRequest> marshall(
            UpdateItemRequest updateItemRequest) {

        if (updateItemRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateItemRequest> request = new DefaultRequest<UpdateItemRequest>(
                updateItemRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.UpdateItem");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (updateItemRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(
                        updateItemRequest.getTableName());
            }

            java.util.Map<String, AttributeValue> keyMap = updateItemRequest
                    .getKey();
            if (keyMap != null) {
                jsonWriter.key("Key");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValue> keyMapValue : keyMap
                        .entrySet()) {
                    if (keyMapValue.getValue() != null) {
                        jsonWriter.key(keyMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                keyMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, AttributeValueUpdate> attributeUpdatesMap = updateItemRequest
                    .getAttributeUpdates();
            if (attributeUpdatesMap != null) {
                jsonWriter.key("AttributeUpdates");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValueUpdate> attributeUpdatesMapValue : attributeUpdatesMap
                        .entrySet()) {
                    if (attributeUpdatesMapValue.getValue() != null) {
                        jsonWriter.key(attributeUpdatesMapValue.getKey());

                        AttributeValueUpdateJsonMarshaller.getInstance()
                                .marshall(attributeUpdatesMapValue.getValue(),
                                        jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, ExpectedAttributeValue> expectedMap = updateItemRequest
                    .getExpected();
            if (expectedMap != null) {
                jsonWriter.key("Expected");
                jsonWriter.object();

                for (Map.Entry<String, ExpectedAttributeValue> expectedMapValue : expectedMap
                        .entrySet()) {
                    if (expectedMapValue.getValue() != null) {
                        jsonWriter.key(expectedMapValue.getKey());

                        ExpectedAttributeValueJsonMarshaller.getInstance()
                                .marshall(expectedMapValue.getValue(),
                                        jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            if (updateItemRequest.getConditionalOperator() != null) {
                jsonWriter.key("ConditionalOperator").value(
                        updateItemRequest.getConditionalOperator());
            }

            if (updateItemRequest.getReturnValues() != null) {
                jsonWriter.key("ReturnValues").value(
                        updateItemRequest.getReturnValues());
            }

            if (updateItemRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.key("ReturnConsumedCapacity").value(
                        updateItemRequest.getReturnConsumedCapacity());
            }

            if (updateItemRequest.getReturnItemCollectionMetrics() != null) {
                jsonWriter.key("ReturnItemCollectionMetrics").value(
                        updateItemRequest.getReturnItemCollectionMetrics());
            }

            if (updateItemRequest.getUpdateExpression() != null) {
                jsonWriter.key("UpdateExpression").value(
                        updateItemRequest.getUpdateExpression());
            }

            if (updateItemRequest.getConditionExpression() != null) {
                jsonWriter.key("ConditionExpression").value(
                        updateItemRequest.getConditionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = updateItemRequest
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

            java.util.Map<String, AttributeValue> expressionAttributeValuesMap = updateItemRequest
                    .getExpressionAttributeValues();
            if (expressionAttributeValuesMap != null) {
                jsonWriter.key("ExpressionAttributeValues");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValue> expressionAttributeValuesMapValue : expressionAttributeValuesMap
                        .entrySet()) {
                    if (expressionAttributeValuesMapValue.getValue() != null) {
                        jsonWriter.key(expressionAttributeValuesMapValue
                                .getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                expressionAttributeValuesMapValue.getValue(),
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
