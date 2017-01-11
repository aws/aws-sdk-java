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
package com.amazonaws.services.cognitoidp.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * CreateGroupRequest Marshaller
 */
public class CreateGroupRequestMarshaller implements Marshaller<Request<CreateGroupRequest>, CreateGroupRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateGroupRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateGroupRequest> marshall(CreateGroupRequest createGroupRequest) {

        if (createGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateGroupRequest> request = new DefaultRequest<CreateGroupRequest>(createGroupRequest, "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.CreateGroup");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createGroupRequest.getGroupName() != null) {
                jsonGenerator.writeFieldName("GroupName").writeValue(createGroupRequest.getGroupName());
            }
            if (createGroupRequest.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(createGroupRequest.getUserPoolId());
            }
            if (createGroupRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createGroupRequest.getDescription());
            }
            if (createGroupRequest.getRoleArn() != null) {
                jsonGenerator.writeFieldName("RoleArn").writeValue(createGroupRequest.getRoleArn());
            }
            if (createGroupRequest.getPrecedence() != null) {
                jsonGenerator.writeFieldName("Precedence").writeValue(createGroupRequest.getPrecedence());
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
