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
 * RegisterContainerInstanceRequest Marshaller
 */
public class RegisterContainerInstanceRequestMarshaller implements Marshaller<Request<RegisterContainerInstanceRequest>, RegisterContainerInstanceRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RegisterContainerInstanceRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterContainerInstanceRequest> marshall(RegisterContainerInstanceRequest registerContainerInstanceRequest) {

        if (registerContainerInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterContainerInstanceRequest> request = new DefaultRequest<RegisterContainerInstanceRequest>(registerContainerInstanceRequest, "AmazonECS");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerServiceV20141113.RegisterContainerInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (registerContainerInstanceRequest.getCluster() != null) {
                jsonGenerator.writeFieldName("cluster").writeValue(registerContainerInstanceRequest.getCluster());
            }
            if (registerContainerInstanceRequest.getInstanceIdentityDocument() != null) {
                jsonGenerator.writeFieldName("instanceIdentityDocument").writeValue(registerContainerInstanceRequest.getInstanceIdentityDocument());
            }
            if (registerContainerInstanceRequest.getInstanceIdentityDocumentSignature() != null) {
                jsonGenerator.writeFieldName("instanceIdentityDocumentSignature").writeValue(
                        registerContainerInstanceRequest.getInstanceIdentityDocumentSignature());
            }

            com.amazonaws.internal.SdkInternalList<Resource> totalResourcesList = (com.amazonaws.internal.SdkInternalList<Resource>) registerContainerInstanceRequest
                    .getTotalResources();
            if (!totalResourcesList.isEmpty() || !totalResourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("totalResources");
                jsonGenerator.writeStartArray();
                for (Resource totalResourcesListValue : totalResourcesList) {
                    if (totalResourcesListValue != null) {

                        ResourceJsonMarshaller.getInstance().marshall(totalResourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (registerContainerInstanceRequest.getVersionInfo() != null) {
                jsonGenerator.writeFieldName("versionInfo");
                VersionInfoJsonMarshaller.getInstance().marshall(registerContainerInstanceRequest.getVersionInfo(), jsonGenerator);
            }
            if (registerContainerInstanceRequest.getContainerInstanceArn() != null) {
                jsonGenerator.writeFieldName("containerInstanceArn").writeValue(registerContainerInstanceRequest.getContainerInstanceArn());
            }

            com.amazonaws.internal.SdkInternalList<Attribute> attributesList = (com.amazonaws.internal.SdkInternalList<Attribute>) registerContainerInstanceRequest
                    .getAttributes();
            if (!attributesList.isEmpty() || !attributesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("attributes");
                jsonGenerator.writeStartArray();
                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(attributesListValue, jsonGenerator);
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
