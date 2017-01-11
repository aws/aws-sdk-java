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
 * DescribeDocumentPermissionRequest Marshaller
 */
public class DescribeDocumentPermissionRequestMarshaller implements Marshaller<Request<DescribeDocumentPermissionRequest>, DescribeDocumentPermissionRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeDocumentPermissionRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeDocumentPermissionRequest> marshall(DescribeDocumentPermissionRequest describeDocumentPermissionRequest) {

        if (describeDocumentPermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDocumentPermissionRequest> request = new DefaultRequest<DescribeDocumentPermissionRequest>(describeDocumentPermissionRequest,
                "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.DescribeDocumentPermission");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeDocumentPermissionRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(describeDocumentPermissionRequest.getName());
            }
            if (describeDocumentPermissionRequest.getPermissionType() != null) {
                jsonGenerator.writeFieldName("PermissionType").writeValue(describeDocumentPermissionRequest.getPermissionType());
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
