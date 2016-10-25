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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EndpointMarshaller
 */
public class EndpointJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Endpoint endpoint, StructuredJsonGenerator jsonGenerator) {

        if (endpoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (endpoint.getEndpointIdentifier() != null) {
                jsonGenerator.writeFieldName("EndpointIdentifier").writeValue(endpoint.getEndpointIdentifier());
            }
            if (endpoint.getEndpointType() != null) {
                jsonGenerator.writeFieldName("EndpointType").writeValue(endpoint.getEndpointType());
            }
            if (endpoint.getEngineName() != null) {
                jsonGenerator.writeFieldName("EngineName").writeValue(endpoint.getEngineName());
            }
            if (endpoint.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(endpoint.getUsername());
            }
            if (endpoint.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(endpoint.getServerName());
            }
            if (endpoint.getPort() != null) {
                jsonGenerator.writeFieldName("Port").writeValue(endpoint.getPort());
            }
            if (endpoint.getDatabaseName() != null) {
                jsonGenerator.writeFieldName("DatabaseName").writeValue(endpoint.getDatabaseName());
            }
            if (endpoint.getExtraConnectionAttributes() != null) {
                jsonGenerator.writeFieldName("ExtraConnectionAttributes").writeValue(endpoint.getExtraConnectionAttributes());
            }
            if (endpoint.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(endpoint.getStatus());
            }
            if (endpoint.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(endpoint.getKmsKeyId());
            }
            if (endpoint.getEndpointArn() != null) {
                jsonGenerator.writeFieldName("EndpointArn").writeValue(endpoint.getEndpointArn());
            }
            if (endpoint.getCertificateArn() != null) {
                jsonGenerator.writeFieldName("CertificateArn").writeValue(endpoint.getCertificateArn());
            }
            if (endpoint.getSslMode() != null) {
                jsonGenerator.writeFieldName("SslMode").writeValue(endpoint.getSslMode());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EndpointJsonMarshaller instance;

    public static EndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonMarshaller();
        return instance;
    }

}
