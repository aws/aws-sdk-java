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
 * QueryRequest Marshaller
 */
public class QueryRequestMarshaller implements
        Marshaller<Request<QueryRequest>, QueryRequest> {

    public Request<QueryRequest> marshall(QueryRequest queryRequest) {

        if (queryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<QueryRequest> request = new DefaultRequest<QueryRequest>(
                queryRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.Query");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (queryRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(queryRequest.getTableName());
            }

            if (queryRequest.getIndexName() != null) {
                jsonWriter.key("IndexName").value(queryRequest.getIndexName());
            }

            if (queryRequest.getSelect() != null) {
                jsonWriter.key("Select").value(queryRequest.getSelect());
            }

            java.util.List<String> attributesToGetList = queryRequest
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

            if (queryRequest.getLimit() != null) {
                jsonWriter.key("Limit").value(queryRequest.getLimit());
            }

            if (queryRequest.getConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(
                        queryRequest.getConsistentRead());
            }

            java.util.Map<String, Condition> keyConditionsMap = queryRequest
                    .getKeyConditions();
            if (keyConditionsMap != null) {
                jsonWriter.key("KeyConditions");
                jsonWriter.object();

                for (Map.Entry<String, Condition> keyConditionsMapValue : keyConditionsMap
                        .entrySet()) {
                    if (keyConditionsMapValue.getValue() != null) {
                        jsonWriter.key(keyConditionsMapValue.getKey());

                        ConditionJsonMarshaller.getInstance().marshall(
                                keyConditionsMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, Condition> queryFilterMap = queryRequest
                    .getQueryFilter();
            if (queryFilterMap != null) {
                jsonWriter.key("QueryFilter");
                jsonWriter.object();

                for (Map.Entry<String, Condition> queryFilterMapValue : queryFilterMap
                        .entrySet()) {
                    if (queryFilterMapValue.getValue() != null) {
                        jsonWriter.key(queryFilterMapValue.getKey());

                        ConditionJsonMarshaller.getInstance().marshall(
                                queryFilterMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            if (queryRequest.getConditionalOperator() != null) {
                jsonWriter.key("ConditionalOperator").value(
                        queryRequest.getConditionalOperator());
            }

            if (queryRequest.getScanIndexForward() != null) {
                jsonWriter.key("ScanIndexForward").value(
                        queryRequest.getScanIndexForward());
            }

            java.util.Map<String, AttributeValue> exclusiveStartKeyMap = queryRequest
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

            if (queryRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.key("ReturnConsumedCapacity").value(
                        queryRequest.getReturnConsumedCapacity());
            }

            if (queryRequest.getProjectionExpression() != null) {
                jsonWriter.key("ProjectionExpression").value(
                        queryRequest.getProjectionExpression());
            }

            if (queryRequest.getFilterExpression() != null) {
                jsonWriter.key("FilterExpression").value(
                        queryRequest.getFilterExpression());
            }

            if (queryRequest.getKeyConditionExpression() != null) {
                jsonWriter.key("KeyConditionExpression").value(
                        queryRequest.getKeyConditionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = queryRequest
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

            java.util.Map<String, AttributeValue> expressionAttributeValuesMap = queryRequest
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
