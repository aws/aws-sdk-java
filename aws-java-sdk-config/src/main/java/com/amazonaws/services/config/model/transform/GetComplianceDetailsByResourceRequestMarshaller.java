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
package com.amazonaws.services.config.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GetComplianceDetailsByResourceRequest Marshaller
 */
public class GetComplianceDetailsByResourceRequestMarshaller implements
        Marshaller<Request<GetComplianceDetailsByResourceRequest>, GetComplianceDetailsByResourceRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetComplianceDetailsByResourceRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetComplianceDetailsByResourceRequest> marshall(GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest) {

        if (getComplianceDetailsByResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetComplianceDetailsByResourceRequest> request = new DefaultRequest<GetComplianceDetailsByResourceRequest>(
                getComplianceDetailsByResourceRequest, "AmazonConfig");
        request.addHeader("X-Amz-Target", "StarlingDoveService.GetComplianceDetailsByResource");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getComplianceDetailsByResourceRequest.getResourceType() != null) {
                jsonGenerator.writeFieldName("ResourceType").writeValue(getComplianceDetailsByResourceRequest.getResourceType());
            }
            if (getComplianceDetailsByResourceRequest.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(getComplianceDetailsByResourceRequest.getResourceId());
            }

            com.amazonaws.internal.SdkInternalList<String> complianceTypesList = (com.amazonaws.internal.SdkInternalList<String>) getComplianceDetailsByResourceRequest
                    .getComplianceTypes();
            if (!complianceTypesList.isEmpty() || !complianceTypesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ComplianceTypes");
                jsonGenerator.writeStartArray();
                for (String complianceTypesListValue : complianceTypesList) {
                    if (complianceTypesListValue != null) {
                        jsonGenerator.writeValue(complianceTypesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (getComplianceDetailsByResourceRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(getComplianceDetailsByResourceRequest.getNextToken());
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
