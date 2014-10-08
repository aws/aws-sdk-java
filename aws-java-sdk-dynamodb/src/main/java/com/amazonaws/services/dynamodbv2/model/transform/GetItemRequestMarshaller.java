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
 * Get Item Request Marshaller
 */
public class GetItemRequestMarshaller implements Marshaller<Request<GetItemRequest>, GetItemRequest> {

    public Request<GetItemRequest> marshall(GetItemRequest getItemRequest) {
        if (getItemRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetItemRequest> request = new DefaultRequest<GetItemRequest>(getItemRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.GetItem";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (getItemRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(getItemRequest.getTableName());
            }
            if (getItemRequest.getKey() != null) {
                jsonWriter.key("Key");
                jsonWriter.object();
                for (Map.Entry<String, AttributeValue> keyListValue : getItemRequest.getKey().entrySet()) {
                    if (keyListValue.getValue() != null) {
                        jsonWriter.key(keyListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(keyListValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(getItemRequest.getAttributesToGet());
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
            if (getItemRequest.isConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(getItemRequest.isConsistentRead());
            }
            if (getItemRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.key("ReturnConsumedCapacity").value(getItemRequest.getReturnConsumedCapacity());
            }
            if (getItemRequest.getProjectionExpression() != null) {
                jsonWriter.key("ProjectionExpression").value(getItemRequest.getProjectionExpression());
            }
            if (getItemRequest.getExpressionAttributeNames() != null) {
                jsonWriter.key("ExpressionAttributeNames");
                jsonWriter.object();
                for (Map.Entry<String, String> expressionAttributeNamesListValue : getItemRequest.getExpressionAttributeNames().entrySet()) {
                    if (expressionAttributeNamesListValue.getValue() != null) {
                        jsonWriter.key(expressionAttributeNamesListValue.getKey());

                        jsonWriter.value(expressionAttributeNamesListValue.getValue());
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
