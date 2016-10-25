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
 * CreateEndpointRequest Marshaller
 */
public class CreateEndpointRequestMarshaller implements Marshaller<Request<CreateEndpointRequest>, CreateEndpointRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateEndpointRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateEndpointRequest> marshall(CreateEndpointRequest createEndpointRequest) {

        if (createEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateEndpointRequest> request = new DefaultRequest<CreateEndpointRequest>(createEndpointRequest, "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target", "AmazonDMSv20160101.CreateEndpoint");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createEndpointRequest.getEndpointIdentifier() != null) {
                jsonGenerator.writeFieldName("EndpointIdentifier").writeValue(createEndpointRequest.getEndpointIdentifier());
            }
            if (createEndpointRequest.getEndpointType() != null) {
                jsonGenerator.writeFieldName("EndpointType").writeValue(createEndpointRequest.getEndpointType());
            }
            if (createEndpointRequest.getEngineName() != null) {
                jsonGenerator.writeFieldName("EngineName").writeValue(createEndpointRequest.getEngineName());
            }
            if (createEndpointRequest.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(createEndpointRequest.getUsername());
            }
            if (createEndpointRequest.getPassword() != null) {
                jsonGenerator.writeFieldName("Password").writeValue(createEndpointRequest.getPassword());
            }
            if (createEndpointRequest.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(createEndpointRequest.getServerName());
            }
            if (createEndpointRequest.getPort() != null) {
                jsonGenerator.writeFieldName("Port").writeValue(createEndpointRequest.getPort());
            }
            if (createEndpointRequest.getDatabaseName() != null) {
                jsonGenerator.writeFieldName("DatabaseName").writeValue(createEndpointRequest.getDatabaseName());
            }
            if (createEndpointRequest.getExtraConnectionAttributes() != null) {
                jsonGenerator.writeFieldName("ExtraConnectionAttributes").writeValue(createEndpointRequest.getExtraConnectionAttributes());
            }
            if (createEndpointRequest.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(createEndpointRequest.getKmsKeyId());
            }

            java.util.List<Tag> tagsList = createEndpointRequest.getTags();
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
            if (createEndpointRequest.getCertificateArn() != null) {
                jsonGenerator.writeFieldName("CertificateArn").writeValue(createEndpointRequest.getCertificateArn());
            }
            if (createEndpointRequest.getSslMode() != null) {
                jsonGenerator.writeFieldName("SslMode").writeValue(createEndpointRequest.getSslMode());
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
