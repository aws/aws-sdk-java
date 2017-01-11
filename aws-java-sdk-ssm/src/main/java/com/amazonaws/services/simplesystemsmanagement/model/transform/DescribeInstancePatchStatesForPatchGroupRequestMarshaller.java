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
 * DescribeInstancePatchStatesForPatchGroupRequest Marshaller
 */
public class DescribeInstancePatchStatesForPatchGroupRequestMarshaller implements
        Marshaller<Request<DescribeInstancePatchStatesForPatchGroupRequest>, DescribeInstancePatchStatesForPatchGroupRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeInstancePatchStatesForPatchGroupRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeInstancePatchStatesForPatchGroupRequest> marshall(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest) {

        if (describeInstancePatchStatesForPatchGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstancePatchStatesForPatchGroupRequest> request = new DefaultRequest<DescribeInstancePatchStatesForPatchGroupRequest>(
                describeInstancePatchStatesForPatchGroupRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.DescribeInstancePatchStatesForPatchGroup");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeInstancePatchStatesForPatchGroupRequest.getPatchGroup() != null) {
                jsonGenerator.writeFieldName("PatchGroup").writeValue(describeInstancePatchStatesForPatchGroupRequest.getPatchGroup());
            }

            com.amazonaws.internal.SdkInternalList<InstancePatchStateFilter> filtersList = (com.amazonaws.internal.SdkInternalList<InstancePatchStateFilter>) describeInstancePatchStatesForPatchGroupRequest
                    .getFilters();
            if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Filters");
                jsonGenerator.writeStartArray();
                for (InstancePatchStateFilter filtersListValue : filtersList) {
                    if (filtersListValue != null) {

                        InstancePatchStateFilterJsonMarshaller.getInstance().marshall(filtersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeInstancePatchStatesForPatchGroupRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeInstancePatchStatesForPatchGroupRequest.getNextToken());
            }
            if (describeInstancePatchStatesForPatchGroupRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("MaxResults").writeValue(describeInstancePatchStatesForPatchGroupRequest.getMaxResults());
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
