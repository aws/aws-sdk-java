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
 * SignUpRequest Marshaller
 */
public class SignUpRequestMarshaller implements Marshaller<Request<SignUpRequest>, SignUpRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SignUpRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SignUpRequest> marshall(SignUpRequest signUpRequest) {

        if (signUpRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SignUpRequest> request = new DefaultRequest<SignUpRequest>(signUpRequest, "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.SignUp");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (signUpRequest.getClientId() != null) {
                jsonGenerator.writeFieldName("ClientId").writeValue(signUpRequest.getClientId());
            }
            if (signUpRequest.getSecretHash() != null) {
                jsonGenerator.writeFieldName("SecretHash").writeValue(signUpRequest.getSecretHash());
            }
            if (signUpRequest.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(signUpRequest.getUsername());
            }
            if (signUpRequest.getPassword() != null) {
                jsonGenerator.writeFieldName("Password").writeValue(signUpRequest.getPassword());
            }

            java.util.List<AttributeType> userAttributesList = signUpRequest.getUserAttributes();
            if (userAttributesList != null) {
                jsonGenerator.writeFieldName("UserAttributes");
                jsonGenerator.writeStartArray();
                for (AttributeType userAttributesListValue : userAttributesList) {
                    if (userAttributesListValue != null) {

                        AttributeTypeJsonMarshaller.getInstance().marshall(userAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<AttributeType> validationDataList = signUpRequest.getValidationData();
            if (validationDataList != null) {
                jsonGenerator.writeFieldName("ValidationData");
                jsonGenerator.writeStartArray();
                for (AttributeType validationDataListValue : validationDataList) {
                    if (validationDataListValue != null) {

                        AttributeTypeJsonMarshaller.getInstance().marshall(validationDataListValue, jsonGenerator);
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
