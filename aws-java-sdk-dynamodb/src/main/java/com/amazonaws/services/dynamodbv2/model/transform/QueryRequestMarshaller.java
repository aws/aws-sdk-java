/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Query Request Marshaller
 */
public class QueryRequestMarshaller implements Marshaller<Request<QueryRequest>, QueryRequest> {

    public Request<QueryRequest> marshall(QueryRequest queryRequest) {
        if (queryRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<QueryRequest> request = new DefaultRequest<QueryRequest>(queryRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.Query";
        request.addHeader("X-Amz-Target", target);

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

            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(queryRequest.getAttributesToGet());
            if (attributesToGetList != null && !(attributesToGetList.isAutoConstruct() && attributesToGetList.isEmpty())) {

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
            if (queryRequest.isConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(queryRequest.isConsistentRead());
            }
            if (queryRequest.getKeyConditions() != null) {
                jsonWriter.key("KeyConditions");
                jsonWriter.object();
                for (Map.Entry<String, Condition> keyConditionsListValue : queryRequest.getKeyConditions().entrySet()) {
                    if (keyConditionsListValue.getValue() != null) {
                        jsonWriter.key(keyConditionsListValue.getKey());

                        jsonWriter.object();

                        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>)(keyConditionsListValue.getValue().getAttributeValueList());
                        if (attributeValueListList != null && !(attributeValueListList.isAutoConstruct() && attributeValueListList.isEmpty())) {

                            jsonWriter.key("AttributeValueList");
                            jsonWriter.array();

                            for (AttributeValue attributeValueListListValue : attributeValueListList) {
                                if (attributeValueListListValue != null) {
                                    AttributeValueJsonMarshaller.getInstance().marshall(attributeValueListListValue, jsonWriter);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        if (keyConditionsListValue.getValue().getComparisonOperator() != null) {
                            jsonWriter.key("ComparisonOperator").value(keyConditionsListValue.getValue().getComparisonOperator());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getQueryFilter() != null) {
                jsonWriter.key("QueryFilter");
                jsonWriter.object();
                for (Map.Entry<String, Condition> queryFilterListValue : queryRequest.getQueryFilter().entrySet()) {
                    if (queryFilterListValue.getValue() != null) {
                        jsonWriter.key(queryFilterListValue.getKey());

                        jsonWriter.object();

                        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>)(queryFilterListValue.getValue().getAttributeValueList());
                        if (attributeValueListList != null && !(attributeValueListList.isAutoConstruct() && attributeValueListList.isEmpty())) {

                            jsonWriter.key("AttributeValueList");
                            jsonWriter.array();

                            for (AttributeValue attributeValueListListValue : attributeValueListList) {
                                if (attributeValueListListValue != null) {
                                    AttributeValueJsonMarshaller.getInstance().marshall(attributeValueListListValue, jsonWriter);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        if (queryFilterListValue.getValue().getComparisonOperator() != null) {
                            jsonWriter.key("ComparisonOperator").value(queryFilterListValue.getValue().getComparisonOperator());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getConditionalOperator() != null) {
                jsonWriter.key("ConditionalOperator").value(queryRequest.getConditionalOperator());
            }
            if (queryRequest.isScanIndexForward() != null) {
                jsonWriter.key("ScanIndexForward").value(queryRequest.isScanIndexForward());
            }
            if (queryRequest.getExclusiveStartKey() != null) {
                jsonWriter.key("ExclusiveStartKey");
                jsonWriter.object();
                for (Map.Entry<String, AttributeValue> exclusiveStartKeyListValue : queryRequest.getExclusiveStartKey().entrySet()) {
                    if (exclusiveStartKeyListValue.getValue() != null) {
                        jsonWriter.key(exclusiveStartKeyListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(exclusiveStartKeyListValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.key("ReturnConsumedCapacity").value(queryRequest.getReturnConsumedCapacity());
            }
            if (queryRequest.getProjectionExpression() != null) {
                jsonWriter.key("ProjectionExpression").value(queryRequest.getProjectionExpression());
            }
            if (queryRequest.getFilterExpression() != null) {
                jsonWriter.key("FilterExpression").value(queryRequest.getFilterExpression());
            }
            if (queryRequest.getExpressionAttributeNames() != null) {
                jsonWriter.key("ExpressionAttributeNames");
                jsonWriter.object();
                for (Map.Entry<String, String> expressionAttributeNamesListValue : queryRequest.getExpressionAttributeNames().entrySet()) {
                    if (expressionAttributeNamesListValue.getValue() != null) {
                        jsonWriter.key(expressionAttributeNamesListValue.getKey());

                        jsonWriter.value(expressionAttributeNamesListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }
            if (queryRequest.getExpressionAttributeValues() != null) {
                jsonWriter.key("ExpressionAttributeValues");
                jsonWriter.object();
                for (Map.Entry<String, AttributeValue> expressionAttributeValuesListValue : queryRequest.getExpressionAttributeValues().entrySet()) {
                    if (expressionAttributeValuesListValue.getValue() != null) {
                        jsonWriter.key(expressionAttributeValuesListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(expressionAttributeValuesListValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
