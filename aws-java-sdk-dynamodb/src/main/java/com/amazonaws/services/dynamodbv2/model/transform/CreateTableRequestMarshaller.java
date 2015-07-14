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
 * CreateTableRequest Marshaller
 */
public class CreateTableRequestMarshaller implements
        Marshaller<Request<CreateTableRequest>, CreateTableRequest> {

    public Request<CreateTableRequest> marshall(
            CreateTableRequest createTableRequest) {

        if (createTableRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateTableRequest> request = new DefaultRequest<CreateTableRequest>(
                createTableRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.CreateTable");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            java.util.List<AttributeDefinition> attributeDefinitionsList = createTableRequest
                    .getAttributeDefinitions();
            if (attributeDefinitionsList != null) {
                jsonWriter.key("AttributeDefinitions");
                jsonWriter.array();
                for (AttributeDefinition attributeDefinitionsListValue : attributeDefinitionsList) {
                    if (attributeDefinitionsListValue != null) {

                        AttributeDefinitionJsonMarshaller.getInstance()
                                .marshall(attributeDefinitionsListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (createTableRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(
                        createTableRequest.getTableName());
            }

            java.util.List<KeySchemaElement> keySchemaList = createTableRequest
                    .getKeySchema();
            if (keySchemaList != null) {
                jsonWriter.key("KeySchema");
                jsonWriter.array();
                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {

                        KeySchemaElementJsonMarshaller.getInstance().marshall(
                                keySchemaListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<LocalSecondaryIndex> localSecondaryIndexesList = createTableRequest
                    .getLocalSecondaryIndexes();
            if (localSecondaryIndexesList != null) {
                jsonWriter.key("LocalSecondaryIndexes");
                jsonWriter.array();
                for (LocalSecondaryIndex localSecondaryIndexesListValue : localSecondaryIndexesList) {
                    if (localSecondaryIndexesListValue != null) {

                        LocalSecondaryIndexJsonMarshaller.getInstance()
                                .marshall(localSecondaryIndexesListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<GlobalSecondaryIndex> globalSecondaryIndexesList = createTableRequest
                    .getGlobalSecondaryIndexes();
            if (globalSecondaryIndexesList != null) {
                jsonWriter.key("GlobalSecondaryIndexes");
                jsonWriter.array();
                for (GlobalSecondaryIndex globalSecondaryIndexesListValue : globalSecondaryIndexesList) {
                    if (globalSecondaryIndexesListValue != null) {

                        GlobalSecondaryIndexJsonMarshaller.getInstance()
                                .marshall(globalSecondaryIndexesListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (createTableRequest.getProvisionedThroughput() != null) {
                jsonWriter.key("ProvisionedThroughput");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(
                        createTableRequest.getProvisionedThroughput(),
                        jsonWriter);
            }

            if (createTableRequest.getStreamSpecification() != null) {
                jsonWriter.key("StreamSpecification");
                StreamSpecificationJsonMarshaller.getInstance()
                        .marshall(createTableRequest.getStreamSpecification(),
                                jsonWriter);
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
