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
 * GetItemRequest Marshaller
 */
public class GetItemRequestMarshaller implements Marshaller<Request<GetItemRequest>, GetItemRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetItemRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetItemRequest> marshall(GetItemRequest getItemRequest) {

        if (getItemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetItemRequest> request = new DefaultRequest<GetItemRequest>(getItemRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.GetItem");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getItemRequest.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(getItemRequest.getTableName());
            }

            java.util.Map<String, AttributeValue> keyMap = getItemRequest.getKey();
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

            java.util.List<String> attributesToGetList = getItemRequest.getAttributesToGet();
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
            if (getItemRequest.getConsistentRead() != null) {
                jsonGenerator.writeFieldName("ConsistentRead").writeValue(getItemRequest.getConsistentRead());
            }
            if (getItemRequest.getReturnConsumedCapacity() != null) {
                jsonGenerator.writeFieldName("ReturnConsumedCapacity").writeValue(getItemRequest.getReturnConsumedCapacity());
            }
            if (getItemRequest.getProjectionExpression() != null) {
                jsonGenerator.writeFieldName("ProjectionExpression").writeValue(getItemRequest.getProjectionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = getItemRequest.getExpressionAttributeNames();
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
