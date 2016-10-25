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
 * DescribeCommunicationsRequest Marshaller
 */
public class DescribeCommunicationsRequestMarshaller implements Marshaller<Request<DescribeCommunicationsRequest>, DescribeCommunicationsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeCommunicationsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeCommunicationsRequest> marshall(DescribeCommunicationsRequest describeCommunicationsRequest) {

        if (describeCommunicationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCommunicationsRequest> request = new DefaultRequest<DescribeCommunicationsRequest>(describeCommunicationsRequest, "AWSSupport");
        request.addHeader("X-Amz-Target", "AWSSupport_20130415.DescribeCommunications");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeCommunicationsRequest.getCaseId() != null) {
                jsonGenerator.writeFieldName("caseId").writeValue(describeCommunicationsRequest.getCaseId());
            }
            if (describeCommunicationsRequest.getBeforeTime() != null) {
                jsonGenerator.writeFieldName("beforeTime").writeValue(describeCommunicationsRequest.getBeforeTime());
            }
            if (describeCommunicationsRequest.getAfterTime() != null) {
                jsonGenerator.writeFieldName("afterTime").writeValue(describeCommunicationsRequest.getAfterTime());
            }
            if (describeCommunicationsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(describeCommunicationsRequest.getNextToken());
            }
            if (describeCommunicationsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("maxResults").writeValue(describeCommunicationsRequest.getMaxResults());
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
