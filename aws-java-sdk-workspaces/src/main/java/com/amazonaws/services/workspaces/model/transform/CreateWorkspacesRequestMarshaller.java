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
package com.amazonaws.services.workspaces.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * CreateWorkspacesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspacesRequestMarshaller implements Marshaller<Request<CreateWorkspacesRequest>, CreateWorkspacesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateWorkspacesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateWorkspacesRequest> marshall(CreateWorkspacesRequest createWorkspacesRequest) {

        if (createWorkspacesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateWorkspacesRequest> request = new DefaultRequest<CreateWorkspacesRequest>(createWorkspacesRequest, "AmazonWorkspaces");
        request.addHeader("X-Amz-Target", "WorkspacesService.CreateWorkspaces");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<WorkspaceRequest> workspacesList = (com.amazonaws.internal.SdkInternalList<WorkspaceRequest>) createWorkspacesRequest
                    .getWorkspaces();
            if (!workspacesList.isEmpty() || !workspacesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Workspaces");
                jsonGenerator.writeStartArray();
                for (WorkspaceRequest workspacesListValue : workspacesList) {
                    if (workspacesListValue != null) {

                        WorkspaceRequestJsonMarshaller.getInstance().marshall(workspacesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
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
