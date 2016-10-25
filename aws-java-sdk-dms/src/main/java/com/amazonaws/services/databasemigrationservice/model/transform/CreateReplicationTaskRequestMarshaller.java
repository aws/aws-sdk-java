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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateReplicationTaskRequest Marshaller
 */
public class CreateReplicationTaskRequestMarshaller implements Marshaller<Request<CreateReplicationTaskRequest>, CreateReplicationTaskRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateReplicationTaskRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateReplicationTaskRequest> marshall(CreateReplicationTaskRequest createReplicationTaskRequest) {

        if (createReplicationTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReplicationTaskRequest> request = new DefaultRequest<CreateReplicationTaskRequest>(createReplicationTaskRequest,
                "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target", "AmazonDMSv20160101.CreateReplicationTask");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createReplicationTaskRequest.getReplicationTaskIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskIdentifier").writeValue(createReplicationTaskRequest.getReplicationTaskIdentifier());
            }
            if (createReplicationTaskRequest.getSourceEndpointArn() != null) {
                jsonGenerator.writeFieldName("SourceEndpointArn").writeValue(createReplicationTaskRequest.getSourceEndpointArn());
            }
            if (createReplicationTaskRequest.getTargetEndpointArn() != null) {
                jsonGenerator.writeFieldName("TargetEndpointArn").writeValue(createReplicationTaskRequest.getTargetEndpointArn());
            }
            if (createReplicationTaskRequest.getReplicationInstanceArn() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceArn").writeValue(createReplicationTaskRequest.getReplicationInstanceArn());
            }
            if (createReplicationTaskRequest.getMigrationType() != null) {
                jsonGenerator.writeFieldName("MigrationType").writeValue(createReplicationTaskRequest.getMigrationType());
            }
            if (createReplicationTaskRequest.getTableMappings() != null) {
                jsonGenerator.writeFieldName("TableMappings").writeValue(createReplicationTaskRequest.getTableMappings());
            }
            if (createReplicationTaskRequest.getReplicationTaskSettings() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskSettings").writeValue(createReplicationTaskRequest.getReplicationTaskSettings());
            }
            if (createReplicationTaskRequest.getCdcStartTime() != null) {
                jsonGenerator.writeFieldName("CdcStartTime").writeValue(createReplicationTaskRequest.getCdcStartTime());
            }

            java.util.List<Tag> tagsList = createReplicationTaskRequest.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
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
