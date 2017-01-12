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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.io.ByteArrayInputStream;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * ListServerNeighborsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServerNeighborsRequestMarshaller implements Marshaller<Request<ListServerNeighborsRequest>, ListServerNeighborsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListServerNeighborsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListServerNeighborsRequest> marshall(ListServerNeighborsRequest listServerNeighborsRequest) {

        if (listServerNeighborsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListServerNeighborsRequest> request = new DefaultRequest<ListServerNeighborsRequest>(listServerNeighborsRequest, "AWSApplicationDiscovery");
        request.addHeader("X-Amz-Target", "AWSPoseidonService_V2015_11_01.ListServerNeighbors");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listServerNeighborsRequest.getConfigurationId() != null) {
                jsonGenerator.writeFieldName("configurationId").writeValue(listServerNeighborsRequest.getConfigurationId());
            }
            if (listServerNeighborsRequest.getPortInformationNeeded() != null) {
                jsonGenerator.writeFieldName("portInformationNeeded").writeValue(listServerNeighborsRequest.getPortInformationNeeded());
            }

            java.util.List<String> neighborConfigurationIdsList = listServerNeighborsRequest.getNeighborConfigurationIds();
            if (neighborConfigurationIdsList != null) {
                jsonGenerator.writeFieldName("neighborConfigurationIds");
                jsonGenerator.writeStartArray();
                for (String neighborConfigurationIdsListValue : neighborConfigurationIdsList) {
                    if (neighborConfigurationIdsListValue != null) {
                        jsonGenerator.writeValue(neighborConfigurationIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (listServerNeighborsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("maxResults").writeValue(listServerNeighborsRequest.getMaxResults());
            }
            if (listServerNeighborsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(listServerNeighborsRequest.getNextToken());
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
