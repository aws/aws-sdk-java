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
 * ModifyEndpointRequest Marshaller
 */
public class ModifyEndpointRequestMarshaller implements Marshaller<Request<ModifyEndpointRequest>, ModifyEndpointRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ModifyEndpointRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ModifyEndpointRequest> marshall(ModifyEndpointRequest modifyEndpointRequest) {

        if (modifyEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyEndpointRequest> request = new DefaultRequest<ModifyEndpointRequest>(modifyEndpointRequest, "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target", "AmazonDMSv20160101.ModifyEndpoint");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (modifyEndpointRequest.getEndpointArn() != null) {
                jsonGenerator.writeFieldName("EndpointArn").writeValue(modifyEndpointRequest.getEndpointArn());
            }
            if (modifyEndpointRequest.getEndpointIdentifier() != null) {
                jsonGenerator.writeFieldName("EndpointIdentifier").writeValue(modifyEndpointRequest.getEndpointIdentifier());
            }
            if (modifyEndpointRequest.getEndpointType() != null) {
                jsonGenerator.writeFieldName("EndpointType").writeValue(modifyEndpointRequest.getEndpointType());
            }
            if (modifyEndpointRequest.getEngineName() != null) {
                jsonGenerator.writeFieldName("EngineName").writeValue(modifyEndpointRequest.getEngineName());
            }
            if (modifyEndpointRequest.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(modifyEndpointRequest.getUsername());
            }
            if (modifyEndpointRequest.getPassword() != null) {
                jsonGenerator.writeFieldName("Password").writeValue(modifyEndpointRequest.getPassword());
            }
            if (modifyEndpointRequest.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(modifyEndpointRequest.getServerName());
            }
            if (modifyEndpointRequest.getPort() != null) {
                jsonGenerator.writeFieldName("Port").writeValue(modifyEndpointRequest.getPort());
            }
            if (modifyEndpointRequest.getDatabaseName() != null) {
                jsonGenerator.writeFieldName("DatabaseName").writeValue(modifyEndpointRequest.getDatabaseName());
            }
            if (modifyEndpointRequest.getExtraConnectionAttributes() != null) {
                jsonGenerator.writeFieldName("ExtraConnectionAttributes").writeValue(modifyEndpointRequest.getExtraConnectionAttributes());
            }
            if (modifyEndpointRequest.getCertificateArn() != null) {
                jsonGenerator.writeFieldName("CertificateArn").writeValue(modifyEndpointRequest.getCertificateArn());
            }
            if (modifyEndpointRequest.getSslMode() != null) {
                jsonGenerator.writeFieldName("SslMode").writeValue(modifyEndpointRequest.getSslMode());
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
