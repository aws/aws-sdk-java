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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * AssociateConfigurationItemsToApplicationRequest Marshaller
 */
public class AssociateConfigurationItemsToApplicationRequestMarshaller implements
        Marshaller<Request<AssociateConfigurationItemsToApplicationRequest>, AssociateConfigurationItemsToApplicationRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public AssociateConfigurationItemsToApplicationRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AssociateConfigurationItemsToApplicationRequest> marshall(
            AssociateConfigurationItemsToApplicationRequest associateConfigurationItemsToApplicationRequest) {

        if (associateConfigurationItemsToApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateConfigurationItemsToApplicationRequest> request = new DefaultRequest<AssociateConfigurationItemsToApplicationRequest>(
                associateConfigurationItemsToApplicationRequest, "AWSApplicationDiscovery");
        request.addHeader("X-Amz-Target", "AWSPoseidonService_V2015_11_01.AssociateConfigurationItemsToApplication");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (associateConfigurationItemsToApplicationRequest.getApplicationConfigurationId() != null) {
                jsonGenerator.writeFieldName("applicationConfigurationId").writeValue(
                        associateConfigurationItemsToApplicationRequest.getApplicationConfigurationId());
            }

            java.util.List<String> configurationIdsList = associateConfigurationItemsToApplicationRequest.getConfigurationIds();
            if (configurationIdsList != null) {
                jsonGenerator.writeFieldName("configurationIds");
                jsonGenerator.writeStartArray();
                for (String configurationIdsListValue : configurationIdsList) {
                    if (configurationIdsListValue != null) {
                        jsonGenerator.writeValue(configurationIdsListValue);
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
