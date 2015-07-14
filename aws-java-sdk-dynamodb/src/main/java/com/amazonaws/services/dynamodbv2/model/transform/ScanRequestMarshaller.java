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
 * ScanRequest Marshaller
 */
public class ScanRequestMarshaller implements
        Marshaller<Request<ScanRequest>, ScanRequest> {

    public Request<ScanRequest> marshall(ScanRequest scanRequest) {

        if (scanRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ScanRequest> request = new DefaultRequest<ScanRequest>(
                scanRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.Scan");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (scanRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(scanRequest.getTableName());
            }

            if (scanRequest.getIndexName() != null) {
                jsonWriter.key("IndexName").value(scanRequest.getIndexName());
            }

            java.util.List<String> attributesToGetList = scanRequest
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

            if (scanRequest.getLimit() != null) {
                jsonWriter.key("Limit").value(scanRequest.getLimit());
            }

            if (scanRequest.getSelect() != null) {
                jsonWriter.key("Select").value(scanRequest.getSelect());
            }

            java.util.Map<String, Condition> scanFilterMap = scanRequest
                    .getScanFilter();
            if (scanFilterMap != null) {
                jsonWriter.key("ScanFilter");
                jsonWriter.object();

                for (Map.Entry<String, Condition> scanFilterMapValue : scanFilterMap
                        .entrySet()) {
                    if (scanFilterMapValue.getValue() != null) {
                        jsonWriter.key(scanFilterMapValue.getKey());

                        ConditionJsonMarshaller.getInstance().marshall(
                                scanFilterMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            if (scanRequest.getConditionalOperator() != null) {
                jsonWriter.key("ConditionalOperator").value(
                        scanRequest.getConditionalOperator());
            }

            java.util.Map<String, AttributeValue> exclusiveStartKeyMap = scanRequest
                    .getExclusiveStartKey();
            if (exclusiveStartKeyMap != null) {
                jsonWriter.key("ExclusiveStartKey");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValue> exclusiveStartKeyMapValue : exclusiveStartKeyMap
                        .entrySet()) {
                    if (exclusiveStartKeyMapValue.getValue() != null) {
                        jsonWriter.key(exclusiveStartKeyMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                exclusiveStartKeyMapValue.getValue(),
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            if (scanRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.key("ReturnConsumedCapacity").value(
                        scanRequest.getReturnConsumedCapacity());
            }

            if (scanRequest.getTotalSegments() != null) {
                jsonWriter.key("TotalSegments").value(
                        scanRequest.getTotalSegments());
            }

            if (scanRequest.getSegment() != null) {
                jsonWriter.key("Segment").value(scanRequest.getSegment());
            }

            if (scanRequest.getProjectionExpression() != null) {
                jsonWriter.key("ProjectionExpression").value(
                        scanRequest.getProjectionExpression());
            }

            if (scanRequest.getFilterExpression() != null) {
                jsonWriter.key("FilterExpression").value(
                        scanRequest.getFilterExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = scanRequest
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

            java.util.Map<String, AttributeValue> expressionAttributeValuesMap = scanRequest
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

            if (scanRequest.getConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(
                        scanRequest.getConsistentRead());
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
