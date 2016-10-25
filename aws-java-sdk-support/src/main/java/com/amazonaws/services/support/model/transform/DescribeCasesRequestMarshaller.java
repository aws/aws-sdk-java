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
package com.amazonaws.services.support.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeCasesRequest Marshaller
 */
public class DescribeCasesRequestMarshaller implements Marshaller<Request<DescribeCasesRequest>, DescribeCasesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeCasesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeCasesRequest> marshall(DescribeCasesRequest describeCasesRequest) {

        if (describeCasesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCasesRequest> request = new DefaultRequest<DescribeCasesRequest>(describeCasesRequest, "AWSSupport");
        request.addHeader("X-Amz-Target", "AWSSupport_20130415.DescribeCases");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> caseIdListList = (com.amazonaws.internal.SdkInternalList<String>) describeCasesRequest
                    .getCaseIdList();
            if (!caseIdListList.isEmpty() || !caseIdListList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("caseIdList");
                jsonGenerator.writeStartArray();
                for (String caseIdListListValue : caseIdListList) {
                    if (caseIdListListValue != null) {
                        jsonGenerator.writeValue(caseIdListListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeCasesRequest.getDisplayId() != null) {
                jsonGenerator.writeFieldName("displayId").writeValue(describeCasesRequest.getDisplayId());
            }
            if (describeCasesRequest.getAfterTime() != null) {
                jsonGenerator.writeFieldName("afterTime").writeValue(describeCasesRequest.getAfterTime());
            }
            if (describeCasesRequest.getBeforeTime() != null) {
                jsonGenerator.writeFieldName("beforeTime").writeValue(describeCasesRequest.getBeforeTime());
            }
            if (describeCasesRequest.getIncludeResolvedCases() != null) {
                jsonGenerator.writeFieldName("includeResolvedCases").writeValue(describeCasesRequest.getIncludeResolvedCases());
            }
            if (describeCasesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(describeCasesRequest.getNextToken());
            }
            if (describeCasesRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("maxResults").writeValue(describeCasesRequest.getMaxResults());
            }
            if (describeCasesRequest.getLanguage() != null) {
                jsonGenerator.writeFieldName("language").writeValue(describeCasesRequest.getLanguage());
            }
            if (describeCasesRequest.getIncludeCommunications() != null) {
                jsonGenerator.writeFieldName("includeCommunications").writeValue(describeCasesRequest.getIncludeCommunications());
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
