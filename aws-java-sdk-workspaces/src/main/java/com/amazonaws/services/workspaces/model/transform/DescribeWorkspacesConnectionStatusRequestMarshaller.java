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
package com.amazonaws.services.workspaces.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeWorkspacesConnectionStatusRequest Marshaller
 */
public class DescribeWorkspacesConnectionStatusRequestMarshaller implements
        Marshaller<Request<DescribeWorkspacesConnectionStatusRequest>, DescribeWorkspacesConnectionStatusRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeWorkspacesConnectionStatusRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeWorkspacesConnectionStatusRequest> marshall(DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest) {

        if (describeWorkspacesConnectionStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeWorkspacesConnectionStatusRequest> request = new DefaultRequest<DescribeWorkspacesConnectionStatusRequest>(
                describeWorkspacesConnectionStatusRequest, "AmazonWorkspaces");
        request.addHeader("X-Amz-Target", "WorkspacesService.DescribeWorkspacesConnectionStatus");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> workspaceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeWorkspacesConnectionStatusRequest
                    .getWorkspaceIds();
            if (!workspaceIdsList.isEmpty() || !workspaceIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("WorkspaceIds");
                jsonGenerator.writeStartArray();
                for (String workspaceIdsListValue : workspaceIdsList) {
                    if (workspaceIdsListValue != null) {
                        jsonGenerator.writeValue(workspaceIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeWorkspacesConnectionStatusRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeWorkspacesConnectionStatusRequest.getNextToken());
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
