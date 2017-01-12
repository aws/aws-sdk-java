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

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * ListUsersRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersRequestMarshaller implements Marshaller<Request<ListUsersRequest>, ListUsersRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListUsersRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListUsersRequest> marshall(ListUsersRequest listUsersRequest) {

        if (listUsersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListUsersRequest> request = new DefaultRequest<ListUsersRequest>(listUsersRequest, "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.ListUsers");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listUsersRequest.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(listUsersRequest.getUserPoolId());
            }

            java.util.List<String> attributesToGetList = listUsersRequest.getAttributesToGet();
            if (attributesToGetList != null) {
                jsonGenerator.writeFieldName("AttributesToGet");
                jsonGenerator.writeStartArray();
                for (String attributesToGetListValue : attributesToGetList) {
                    if (attributesToGetListValue != null) {
                        jsonGenerator.writeValue(attributesToGetListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (listUsersRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(listUsersRequest.getLimit());
            }
            if (listUsersRequest.getPaginationToken() != null) {
                jsonGenerator.writeFieldName("PaginationToken").writeValue(listUsersRequest.getPaginationToken());
            }
            if (listUsersRequest.getFilter() != null) {
                jsonGenerator.writeFieldName("Filter").writeValue(listUsersRequest.getFilter());
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
