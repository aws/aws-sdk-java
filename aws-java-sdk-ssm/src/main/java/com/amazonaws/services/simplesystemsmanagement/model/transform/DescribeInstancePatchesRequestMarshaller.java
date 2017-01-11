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
 * DescribeInstancePatchesRequest Marshaller
 */
public class DescribeInstancePatchesRequestMarshaller implements Marshaller<Request<DescribeInstancePatchesRequest>, DescribeInstancePatchesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeInstancePatchesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeInstancePatchesRequest> marshall(DescribeInstancePatchesRequest describeInstancePatchesRequest) {

        if (describeInstancePatchesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstancePatchesRequest> request = new DefaultRequest<DescribeInstancePatchesRequest>(describeInstancePatchesRequest,
                "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.DescribeInstancePatches");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeInstancePatchesRequest.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(describeInstancePatchesRequest.getInstanceId());
            }

            com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter> filtersList = (com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>) describeInstancePatchesRequest
                    .getFilters();
            if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Filters");
                jsonGenerator.writeStartArray();
                for (PatchOrchestratorFilter filtersListValue : filtersList) {
                    if (filtersListValue != null) {

                        PatchOrchestratorFilterJsonMarshaller.getInstance().marshall(filtersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeInstancePatchesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeInstancePatchesRequest.getNextToken());
            }
            if (describeInstancePatchesRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(describeInstancePatchesRequest.getMaxResults());
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
