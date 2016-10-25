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
package com.amazonaws.services.directory.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateTrustRequest Marshaller
 */
public class CreateTrustRequestMarshaller implements Marshaller<Request<CreateTrustRequest>, CreateTrustRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateTrustRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateTrustRequest> marshall(CreateTrustRequest createTrustRequest) {

        if (createTrustRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTrustRequest> request = new DefaultRequest<CreateTrustRequest>(createTrustRequest, "AWSDirectoryService");
        request.addHeader("X-Amz-Target", "DirectoryService_20150416.CreateTrust");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createTrustRequest.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(createTrustRequest.getDirectoryId());
            }
            if (createTrustRequest.getRemoteDomainName() != null) {
                jsonGenerator.writeFieldName("RemoteDomainName").writeValue(createTrustRequest.getRemoteDomainName());
            }
            if (createTrustRequest.getTrustPassword() != null) {
                jsonGenerator.writeFieldName("TrustPassword").writeValue(createTrustRequest.getTrustPassword());
            }
            if (createTrustRequest.getTrustDirection() != null) {
                jsonGenerator.writeFieldName("TrustDirection").writeValue(createTrustRequest.getTrustDirection());
            }
            if (createTrustRequest.getTrustType() != null) {
                jsonGenerator.writeFieldName("TrustType").writeValue(createTrustRequest.getTrustType());
            }

            com.amazonaws.internal.SdkInternalList<String> conditionalForwarderIpAddrsList = (com.amazonaws.internal.SdkInternalList<String>) createTrustRequest
                    .getConditionalForwarderIpAddrs();
            if (!conditionalForwarderIpAddrsList.isEmpty() || !conditionalForwarderIpAddrsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ConditionalForwarderIpAddrs");
                jsonGenerator.writeStartArray();
                for (String conditionalForwarderIpAddrsListValue : conditionalForwarderIpAddrsList) {
                    if (conditionalForwarderIpAddrsListValue != null) {
                        jsonGenerator.writeValue(conditionalForwarderIpAddrsListValue);
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
