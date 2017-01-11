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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DescribeInstancePatchStatesRequest Marshaller
 */
public class DescribeInstancePatchStatesRequestMarshaller implements
        Marshaller<Request<DescribeInstancePatchStatesRequest>, DescribeInstancePatchStatesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeInstancePatchStatesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeInstancePatchStatesRequest> marshall(DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest) {

        if (describeInstancePatchStatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstancePatchStatesRequest> request = new DefaultRequest<DescribeInstancePatchStatesRequest>(describeInstancePatchStatesRequest,
                "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.DescribeInstancePatchStates");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeInstancePatchStatesRequest
                    .getInstanceIds();
            if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceIds");
                jsonGenerator.writeStartArray();
                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonGenerator.writeValue(instanceIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeInstancePatchStatesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeInstancePatchStatesRequest.getNextToken());
            }
            if (describeInstancePatchStatesRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(describeInstancePatchStatesRequest.getMaxResults());
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
