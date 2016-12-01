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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GetParameterHistoryRequest Marshaller
 */
public class GetParameterHistoryRequestMarshaller implements Marshaller<Request<GetParameterHistoryRequest>, GetParameterHistoryRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetParameterHistoryRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetParameterHistoryRequest> marshall(GetParameterHistoryRequest getParameterHistoryRequest) {

        if (getParameterHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetParameterHistoryRequest> request = new DefaultRequest<GetParameterHistoryRequest>(getParameterHistoryRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.GetParameterHistory");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (getParameterHistoryRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(getParameterHistoryRequest.getName());
            }
            if (getParameterHistoryRequest.getWithDecryption() != null) {
                jsonGenerator.writeFieldName("WithDecryption").writeValue(getParameterHistoryRequest.getWithDecryption());
            }
            if (getParameterHistoryRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(getParameterHistoryRequest.getMaxResults());
            }
            if (getParameterHistoryRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(getParameterHistoryRequest.getNextToken());
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
