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

import com.amazonaws.AmazonClientException;
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
 * AdminCreateUserRequest Marshaller
 */
public class AdminCreateUserRequestMarshaller implements Marshaller<Request<AdminCreateUserRequest>, AdminCreateUserRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public AdminCreateUserRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AdminCreateUserRequest> marshall(AdminCreateUserRequest adminCreateUserRequest) {

        if (adminCreateUserRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<AdminCreateUserRequest> request = new DefaultRequest<AdminCreateUserRequest>(adminCreateUserRequest, "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.AdminCreateUser");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (adminCreateUserRequest.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(adminCreateUserRequest.getUserPoolId());
            }
            if (adminCreateUserRequest.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(adminCreateUserRequest.getUsername());
            }

            java.util.List<AttributeType> userAttributesList = adminCreateUserRequest.getUserAttributes();
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

            java.util.List<AttributeType> validationDataList = adminCreateUserRequest.getValidationData();
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
            if (adminCreateUserRequest.getTemporaryPassword() != null) {
                jsonGenerator.writeFieldName("TemporaryPassword").writeValue(adminCreateUserRequest.getTemporaryPassword());
            }
            if (adminCreateUserRequest.getForceAliasCreation() != null) {
                jsonGenerator.writeFieldName("ForceAliasCreation").writeValue(adminCreateUserRequest.getForceAliasCreation());
            }
            if (adminCreateUserRequest.getMessageAction() != null) {
                jsonGenerator.writeFieldName("MessageAction").writeValue(adminCreateUserRequest.getMessageAction());
            }

            java.util.List<String> desiredDeliveryMediumsList = adminCreateUserRequest.getDesiredDeliveryMediums();
            if (desiredDeliveryMediumsList != null) {
                jsonGenerator.writeFieldName("DesiredDeliveryMediums");
                jsonGenerator.writeStartArray();
                for (String desiredDeliveryMediumsListValue : desiredDeliveryMediumsList) {
                    if (desiredDeliveryMediumsListValue != null) {
                        jsonGenerator.writeValue(desiredDeliveryMediumsListValue);
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
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
