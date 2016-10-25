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
 * UpdateTableRequest Marshaller
 */
public class UpdateTableRequestMarshaller implements Marshaller<Request<UpdateTableRequest>, UpdateTableRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateTableRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateTableRequest> marshall(UpdateTableRequest updateTableRequest) {

        if (updateTableRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateTableRequest> request = new DefaultRequest<UpdateTableRequest>(updateTableRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.UpdateTable");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<AttributeDefinition> attributeDefinitionsList = updateTableRequest.getAttributeDefinitions();
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
            if (updateTableRequest.getTableName() != null) {
                jsonGenerator.writeFieldName("TableName").writeValue(updateTableRequest.getTableName());
            }
            if (updateTableRequest.getProvisionedThroughput() != null) {
                jsonGenerator.writeFieldName("ProvisionedThroughput");
                ProvisionedThroughputJsonMarshaller.getInstance().marshall(updateTableRequest.getProvisionedThroughput(), jsonGenerator);
            }

            java.util.List<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdatesList = updateTableRequest.getGlobalSecondaryIndexUpdates();
            if (globalSecondaryIndexUpdatesList != null) {
                jsonGenerator.writeFieldName("GlobalSecondaryIndexUpdates");
                jsonGenerator.writeStartArray();
                for (GlobalSecondaryIndexUpdate globalSecondaryIndexUpdatesListValue : globalSecondaryIndexUpdatesList) {
                    if (globalSecondaryIndexUpdatesListValue != null) {

                        GlobalSecondaryIndexUpdateJsonMarshaller.getInstance().marshall(globalSecondaryIndexUpdatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updateTableRequest.getStreamSpecification() != null) {
                jsonGenerator.writeFieldName("StreamSpecification");
                StreamSpecificationJsonMarshaller.getInstance().marshall(updateTableRequest.getStreamSpecification(), jsonGenerator);
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
