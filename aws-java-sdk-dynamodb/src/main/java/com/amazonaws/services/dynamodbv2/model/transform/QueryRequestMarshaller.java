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
 * QueryRequest Marshaller
 */
public class QueryRequestMarshaller implements Marshaller<Request<QueryRequest>, QueryRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public QueryRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<QueryRequest> marshall(QueryRequest queryRequest) {

        if (queryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<QueryRequest> request = new DefaultRequest<QueryRequest>(queryRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.Query");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (queryRequest.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(queryRequest.getTableName());
            }
            if (queryRequest.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(queryRequest.getIndexName());
            }
            if (queryRequest.getSelect() != null) {
                jsonGenerator.writeFieldName("Select").writeValue(queryRequest.getSelect());
            }

            java.util.List<String> attributesToGetList = queryRequest.getAttributesToGet();
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
            if (queryRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(queryRequest.getLimit());
            }
            if (queryRequest.getConsistentRead() != null) {
                jsonGenerator.writeFieldName("ConsistentRead").writeValue(queryRequest.getConsistentRead());
            }

            java.util.Map<String, Condition> keyConditionsMap = queryRequest.getKeyConditions();
            if (keyConditionsMap != null) {
                jsonGenerator.writeFieldName("KeyConditions");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Condition> keyConditionsMapValue : keyConditionsMap.entrySet()) {
                    if (keyConditionsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(keyConditionsMapValue.getKey());

                        ConditionJsonMarshaller.getInstance().marshall(keyConditionsMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, Condition> queryFilterMap = queryRequest.getQueryFilter();
            if (queryFilterMap != null) {
                jsonGenerator.writeFieldName("QueryFilter");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Condition> queryFilterMapValue : queryFilterMap.entrySet()) {
                    if (queryFilterMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(queryFilterMapValue.getKey());

                        ConditionJsonMarshaller.getInstance().marshall(queryFilterMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (queryRequest.getConditionalOperator() != null) {
                jsonGenerator.writeFieldName("ConditionalOperator").writeValue(queryRequest.getConditionalOperator());
            }
            if (queryRequest.getScanIndexForward() != null) {
                jsonGenerator.writeFieldName("ScanIndexForward").writeValue(queryRequest.getScanIndexForward());
            }

            java.util.Map<String, AttributeValue> exclusiveStartKeyMap = queryRequest.getExclusiveStartKey();
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
            if (queryRequest.getReturnConsumedCapacity() != null) {
                jsonGenerator.writeFieldName("ReturnConsumedCapacity").writeValue(queryRequest.getReturnConsumedCapacity());
            }
            if (queryRequest.getProjectionExpression() != null) {
                jsonGenerator.writeFieldName("ProjectionExpression").writeValue(queryRequest.getProjectionExpression());
            }
            if (queryRequest.getFilterExpression() != null) {
                jsonGenerator.writeFieldName("FilterExpression").writeValue(queryRequest.getFilterExpression());
            }
            if (queryRequest.getKeyConditionExpression() != null) {
                jsonGenerator.writeFieldName("KeyConditionExpression").writeValue(queryRequest.getKeyConditionExpression());
            }

            java.util.Map<String, String> expressionAttributeNamesMap = queryRequest.getExpressionAttributeNames();
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

            java.util.Map<String, AttributeValue> expressionAttributeValuesMap = queryRequest.getExpressionAttributeValues();
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
