/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * ModifyReplicationTaskRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReplicationTaskRequestMarshaller implements Marshaller<Request<ModifyReplicationTaskRequest>, ModifyReplicationTaskRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ModifyReplicationTaskRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ModifyReplicationTaskRequest> marshall(ModifyReplicationTaskRequest modifyReplicationTaskRequest) {

        if (modifyReplicationTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyReplicationTaskRequest> request = new DefaultRequest<ModifyReplicationTaskRequest>(modifyReplicationTaskRequest,
                "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target", "AmazonDMSv20160101.ModifyReplicationTask");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (modifyReplicationTaskRequest.getReplicationTaskArn() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskArn").writeValue(modifyReplicationTaskRequest.getReplicationTaskArn());
            }
            if (modifyReplicationTaskRequest.getReplicationTaskIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskIdentifier").writeValue(modifyReplicationTaskRequest.getReplicationTaskIdentifier());
            }
            if (modifyReplicationTaskRequest.getMigrationType() != null) {
                jsonGenerator.writeFieldName("MigrationType").writeValue(modifyReplicationTaskRequest.getMigrationType());
            }
            if (modifyReplicationTaskRequest.getTableMappings() != null) {
                jsonGenerator.writeFieldName("TableMappings").writeValue(modifyReplicationTaskRequest.getTableMappings());
            }
            if (modifyReplicationTaskRequest.getReplicationTaskSettings() != null) {
                jsonGenerator.writeFieldName("ReplicationTaskSettings").writeValue(modifyReplicationTaskRequest.getReplicationTaskSettings());
            }
            if (modifyReplicationTaskRequest.getCdcStartTime() != null) {
                jsonGenerator.writeFieldName("CdcStartTime").writeValue(modifyReplicationTaskRequest.getCdcStartTime());
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
