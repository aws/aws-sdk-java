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
 * ScanRequest Marshaller
 */
public class ScanRequestMarshaller implements Marshaller<Request<ScanRequest>, ScanRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ScanRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ScanRequest> marshall(ScanRequest scanRequest) {

        if (scanRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ScanRequest> request = new DefaultRequest<ScanRequest>(scanRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.Scan");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (scanRequest.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(scanRequest.getTableName());
            }
            if (scanRequest.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(scanRequest.getIndexName());
            }

            java.util.List<String> attributesToGetList = scanRequest.getAttributesToGet();
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
            if (scanRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(scanRequest.getLimit());
            }
            if (scanRequest.getSelect() != null) {
                jsonGenerator.writeFieldName("Select").writeValue(scanRequest.getSelect());
            }

            java.util.Map<String, Condition> scanFilterMap = scanRequest.getScanFilter();
            if (scanFilterMap != null) {
                jsonGenerator.writeFieldName("ScanFilter");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Condition> scanFilterMapValue : scanFilterMap.entrySet()) {
                    if (scanFilterMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(scanFilterMapValue.getKey());

                        ConditionJsonMarshaller.getInstance().marshall(scanFilterMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (scanRequest.getConditionalOperator() != null) {
                jsonGenerator.writeFieldName("ConditionalOperator").writeValue(scanRequest.getConditionalOperator());
            }

            java.util.Map<String, AttributeValue> exclusiveStartKeyMap = scanRequest.getExclusiveStartKey();
            if (exclusiveStartKeyMap != null) {
                jsonGenerator.writeFieldName("ExclusiveStartKey");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> exclusiveStartKeyMapValue : exclusiveStartKeyMap.entrySet()) {
                    if (exclusiveStartKeyMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(exclusiveStartKeyMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(exclusiveStartKeyMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (scanRequest.getReturnConsumedCapacity() != null) {
                jsonGenerator.writeFieldName("ReturnConsumedCapacity").writeValue(scanRequest.getReturnConsumedCapacity());
            }
            if (scanRequest.getTotalSegments() != null) {
                jsonGenerator.writeFieldName("TotalSegments").writeValue(scanRequest.getTotalSegments());
            }
            if (scanRequest.getSegment() != null) {
                jsonGenerator.writeFieldName("Segment").writeValue(scanRequest.getSegment());
            }
            if (scanRequest.getProjectionExpression() != null) {
                jsonGenerator.writeFieldName("ProjectionExpression").writeValue(scanRequest.getProjectionExpression());
            }
            if (scanRequest.getFilterExpression() != null) {
                jsonGenerator.writeFieldName("FilterExpression").writeValue(scanRequest.getFilterExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = scanRequest.getExpressionAttributeNames();
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

            java.util.Map<String, AttributeValue> expressionAttributeValuesMap = scanRequest.getExpressionAttributeValues();
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
            if (scanRequest.getConsistentRead() != null) {
                jsonGenerator.writeFieldName("ConsistentRead").writeValue(scanRequest.getConsistentRead());
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
