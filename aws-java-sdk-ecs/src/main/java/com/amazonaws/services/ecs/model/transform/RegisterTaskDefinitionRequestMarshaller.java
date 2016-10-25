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
package com.amazonaws.services.ecs.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RegisterTaskDefinitionRequest Marshaller
 */
public class RegisterTaskDefinitionRequestMarshaller implements Marshaller<Request<RegisterTaskDefinitionRequest>, RegisterTaskDefinitionRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RegisterTaskDefinitionRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterTaskDefinitionRequest> marshall(RegisterTaskDefinitionRequest registerTaskDefinitionRequest) {

        if (registerTaskDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterTaskDefinitionRequest> request = new DefaultRequest<RegisterTaskDefinitionRequest>(registerTaskDefinitionRequest, "AmazonECS");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerServiceV20141113.RegisterTaskDefinition");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (registerTaskDefinitionRequest.getFamily() != null) {
                jsonGenerator.writeFieldName("family").writeValue(registerTaskDefinitionRequest.getFamily());
            }
            if (registerTaskDefinitionRequest.getTaskRoleArn() != null) {
                jsonGenerator.writeFieldName("taskRoleArn").writeValue(registerTaskDefinitionRequest.getTaskRoleArn());
            }
            if (registerTaskDefinitionRequest.getNetworkMode() != null) {
                jsonGenerator.writeFieldName("networkMode").writeValue(registerTaskDefinitionRequest.getNetworkMode());
            }

            com.amazonaws.internal.SdkInternalList<ContainerDefinition> containerDefinitionsList = (com.amazonaws.internal.SdkInternalList<ContainerDefinition>) registerTaskDefinitionRequest
                    .getContainerDefinitions();
            if (!containerDefinitionsList.isEmpty() || !containerDefinitionsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("containerDefinitions");
                jsonGenerator.writeStartArray();
                for (ContainerDefinition containerDefinitionsListValue : containerDefinitionsList) {
                    if (containerDefinitionsListValue != null) {

                        ContainerDefinitionJsonMarshaller.getInstance().marshall(containerDefinitionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<Volume> volumesList = (com.amazonaws.internal.SdkInternalList<Volume>) registerTaskDefinitionRequest
                    .getVolumes();
            if (!volumesList.isEmpty() || !volumesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("volumes");
                jsonGenerator.writeStartArray();
                for (Volume volumesListValue : volumesList) {
                    if (volumesListValue != null) {

                        VolumeJsonMarshaller.getInstance().marshall(volumesListValue, jsonGenerator);
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
