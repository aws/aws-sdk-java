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
package com.amazonaws.services.directconnect.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AllocatePrivateVirtualInterfaceRequest Marshaller
 */
public class AllocatePrivateVirtualInterfaceRequestMarshaller implements
        Marshaller<Request<AllocatePrivateVirtualInterfaceRequest>, AllocatePrivateVirtualInterfaceRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public AllocatePrivateVirtualInterfaceRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AllocatePrivateVirtualInterfaceRequest> marshall(AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest) {

        if (allocatePrivateVirtualInterfaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AllocatePrivateVirtualInterfaceRequest> request = new DefaultRequest<AllocatePrivateVirtualInterfaceRequest>(
                allocatePrivateVirtualInterfaceRequest, "AmazonDirectConnect");
        request.addHeader("X-Amz-Target", "OvertureService.AllocatePrivateVirtualInterface");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (allocatePrivateVirtualInterfaceRequest.getConnectionId() != null) {
                jsonGenerator.writeFieldName("connectionId").writeValue(allocatePrivateVirtualInterfaceRequest.getConnectionId());
            }
            if (allocatePrivateVirtualInterfaceRequest.getOwnerAccount() != null) {
                jsonGenerator.writeFieldName("ownerAccount").writeValue(allocatePrivateVirtualInterfaceRequest.getOwnerAccount());
            }
            if (allocatePrivateVirtualInterfaceRequest.getNewPrivateVirtualInterfaceAllocation() != null) {
                jsonGenerator.writeFieldName("newPrivateVirtualInterfaceAllocation");
                NewPrivateVirtualInterfaceAllocationJsonMarshaller.getInstance().marshall(
                        allocatePrivateVirtualInterfaceRequest.getNewPrivateVirtualInterfaceAllocation(), jsonGenerator);
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
