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
package com.amazonaws.services.cognitoidp.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateUserPoolClientRequest Marshaller
 */
public class CreateUserPoolClientRequestMarshaller implements Marshaller<Request<CreateUserPoolClientRequest>, CreateUserPoolClientRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateUserPoolClientRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateUserPoolClientRequest> marshall(CreateUserPoolClientRequest createUserPoolClientRequest) {

        if (createUserPoolClientRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateUserPoolClientRequest> request = new DefaultRequest<CreateUserPoolClientRequest>(createUserPoolClientRequest,
                "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.CreateUserPoolClient");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createUserPoolClientRequest.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(createUserPoolClientRequest.getUserPoolId());
            }
            if (createUserPoolClientRequest.getClientName() != null) {
                jsonGenerator.writeFieldName("ClientName").writeValue(createUserPoolClientRequest.getClientName());
            }
            if (createUserPoolClientRequest.getGenerateSecret() != null) {
                jsonGenerator.writeFieldName("GenerateSecret").writeValue(createUserPoolClientRequest.getGenerateSecret());
            }
            if (createUserPoolClientRequest.getRefreshTokenValidity() != null) {
                jsonGenerator.writeFieldName("RefreshTokenValidity").writeValue(createUserPoolClientRequest.getRefreshTokenValidity());
            }

            java.util.List<String> readAttributesList = createUserPoolClientRequest.getReadAttributes();
            if (readAttributesList != null) {
                jsonGenerator.writeFieldName("ReadAttributes");
                jsonGenerator.writeStartArray();
                for (String readAttributesListValue : readAttributesList) {
                    if (readAttributesListValue != null) {
                        jsonGenerator.writeValue(readAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> writeAttributesList = createUserPoolClientRequest.getWriteAttributes();
            if (writeAttributesList != null) {
                jsonGenerator.writeFieldName("WriteAttributes");
                jsonGenerator.writeStartArray();
                for (String writeAttributesListValue : writeAttributesList) {
                    if (writeAttributesListValue != null) {
                        jsonGenerator.writeValue(writeAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> explicitAuthFlowsList = createUserPoolClientRequest.getExplicitAuthFlows();
            if (explicitAuthFlowsList != null) {
                jsonGenerator.writeFieldName("ExplicitAuthFlows");
                jsonGenerator.writeStartArray();
                for (String explicitAuthFlowsListValue : explicitAuthFlowsList) {
                    if (explicitAuthFlowsListValue != null) {
                        jsonGenerator.writeValue(explicitAuthFlowsListValue);
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
