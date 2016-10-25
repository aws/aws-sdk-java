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
 * CreateTableRequest Marshaller
 */
public class CreateTableRequestMarshaller implements Marshaller<Request<CreateTableRequest>, CreateTableRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateTableRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateTableRequest> marshall(CreateTableRequest createTableRequest) {

        if (createTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTableRequest> request = new DefaultRequest<CreateTableRequest>(createTableRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.CreateTable");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<AttributeDefinition> attributeDefinitionsList = createTableRequest.getAttributeDefinitions();
            if (attributeDefinitionsList != null) {
                jsonGenerator.writeFieldName("AttributeDefinitions");
                jsonGenerator.writeStartArray();
                for (AttributeDefinition attributeDefinitionsListValue : attributeDefinitionsList) {
                    if (attributeDefinitionsListValue != null) {

                        AttributeDefinitionJsonMarshaller.getInstance().marshall(attributeDefinitionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createTableRequest.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(createTableRequest.getTableName());
            }

            java.util.List<KeySchemaElement> keySchemaList = createTableRequest.getKeySchema();
            if (keySchemaList != null) {
                jsonGenerator.writeFieldName("KeySchema");
                jsonGenerator.writeStartArray();
                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {

                        KeySchemaElementJsonMarshaller.getInstance().marshall(keySchemaListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<LocalSecondaryIndex> localSecondaryIndexesList = createTableRequest.getLocalSecondaryIndexes();
            if (localSecondaryIndexesList != null) {
                jsonGenerator.writeFieldName("LocalSecondaryIndexes");
                jsonGenerator.writeStartArray();
                for (LocalSecondaryIndex localSecondaryIndexesListValue : localSecondaryIndexesList) {
                    if (localSecondaryIndexesListValue != null) {

                        LocalSecondaryIndexJsonMarshaller.getInstance().marshall(localSecondaryIndexesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<GlobalSecondaryIndex> globalSecondaryIndexesList = createTableRequest.getGlobalSecondaryIndexes();
            if (globalSecondaryIndexesList != null) {
                jsonGenerator.writeFieldName("GlobalSecondaryIndexes");
                jsonGenerator.writeStartArray();
                for (GlobalSecondaryIndex globalSecondaryIndexesListValue : globalSecondaryIndexesList) {
                    if (globalSecondaryIndexesListValue != null) {

                        GlobalSecondaryIndexJsonMarshaller.getInstance().marshall(globalSecondaryIndexesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createTableRequest.getProvisionedThroughput() != null) {
                jsonGenerator.writeFieldName("ProvisionedThroughput");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(createTableRequest.getProvisionedThroughput(), jsonGenerator);
            }
            if (createTableRequest.getStreamSpecification() != null) {
                jsonGenerator.writeFieldName("StreamSpecification");
                StreamSpecificationJsonMarshaller.getInstance().marshall(createTableRequest.getStreamSpecification(), jsonGenerator);
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
