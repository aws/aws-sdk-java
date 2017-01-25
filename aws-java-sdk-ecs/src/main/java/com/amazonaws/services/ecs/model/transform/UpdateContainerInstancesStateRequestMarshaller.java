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
package com.amazonaws.services.ecs.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * UpdateContainerInstancesStateRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContainerInstancesStateRequestMarshaller implements
        Marshaller<Request<UpdateContainerInstancesStateRequest>, UpdateContainerInstancesStateRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateContainerInstancesStateRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateContainerInstancesStateRequest> marshall(UpdateContainerInstancesStateRequest updateContainerInstancesStateRequest) {

        if (updateContainerInstancesStateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateContainerInstancesStateRequest> request = new DefaultRequest<UpdateContainerInstancesStateRequest>(updateContainerInstancesStateRequest,
                "AmazonECS");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerServiceV20141113.UpdateContainerInstancesState");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateContainerInstancesStateRequest.getCluster() != null) {
                jsonGenerator.writeFieldName("cluster").writeValue(updateContainerInstancesStateRequest.getCluster());
            }

            com.amazonaws.internal.SdkInternalList<String> containerInstancesList = (com.amazonaws.internal.SdkInternalList<String>) updateContainerInstancesStateRequest
                    .getContainerInstances();
            if (!containerInstancesList.isEmpty() || !containerInstancesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("containerInstances");
                jsonGenerator.writeStartArray();
                for (String containerInstancesListValue : containerInstancesList) {
                    if (containerInstancesListValue != null) {
                        jsonGenerator.writeValue(containerInstancesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updateContainerInstancesStateRequest.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(updateContainerInstancesStateRequest.getStatus());
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
