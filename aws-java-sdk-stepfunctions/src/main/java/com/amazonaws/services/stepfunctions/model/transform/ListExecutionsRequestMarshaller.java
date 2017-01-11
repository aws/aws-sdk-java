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
package com.amazonaws.services.stepfunctions.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * ListExecutionsRequest Marshaller
 */
public class ListExecutionsRequestMarshaller implements Marshaller<Request<ListExecutionsRequest>, ListExecutionsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListExecutionsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListExecutionsRequest> marshall(ListExecutionsRequest listExecutionsRequest) {

        if (listExecutionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListExecutionsRequest> request = new DefaultRequest<ListExecutionsRequest>(listExecutionsRequest, "AWSStepFunctions");
        request.addHeader("X-Amz-Target", "AWSStepFunctions.ListExecutions");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listExecutionsRequest.getStateMachineArn() != null) {
                jsonGenerator.writeFieldName("stateMachineArn").writeValue(listExecutionsRequest.getStateMachineArn());
            }
            if (listExecutionsRequest.getStatusFilter() != null) {
                jsonGenerator.writeFieldName("statusFilter").writeValue(listExecutionsRequest.getStatusFilter());
            }
            if (listExecutionsRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("maxResults").writeValue(listExecutionsRequest.getMaxResults());
            }
            if (listExecutionsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(listExecutionsRequest.getNextToken());
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
