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
 * DescribeWorkspaceDirectoriesRequest Marshaller
 */
public class DescribeWorkspaceDirectoriesRequestMarshaller implements
        Marshaller<Request<DescribeWorkspaceDirectoriesRequest>, DescribeWorkspaceDirectoriesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeWorkspaceDirectoriesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeWorkspaceDirectoriesRequest> marshall(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest) {

        if (describeWorkspaceDirectoriesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeWorkspaceDirectoriesRequest> request = new DefaultRequest<DescribeWorkspaceDirectoriesRequest>(describeWorkspaceDirectoriesRequest,
                "AmazonWorkspaces");
        request.addHeader("X-Amz-Target", "WorkspacesService.DescribeWorkspaceDirectories");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> directoryIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeWorkspaceDirectoriesRequest
                    .getDirectoryIds();
            if (!directoryIdsList.isEmpty() || !directoryIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DirectoryIds");
                jsonGenerator.writeStartArray();
                for (String directoryIdsListValue : directoryIdsList) {
                    if (directoryIdsListValue != null) {
                        jsonGenerator.writeValue(directoryIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeWorkspaceDirectoriesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeWorkspaceDirectoriesRequest.getNextToken());
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
