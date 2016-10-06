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
 * UpdateUserPoolRequest Marshaller
 */
public class UpdateUserPoolRequestMarshaller implements Marshaller<Request<UpdateUserPoolRequest>, UpdateUserPoolRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateUserPoolRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateUserPoolRequest> marshall(UpdateUserPoolRequest updateUserPoolRequest) {

        if (updateUserPoolRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateUserPoolRequest> request = new DefaultRequest<UpdateUserPoolRequest>(updateUserPoolRequest, "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.UpdateUserPool");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateUserPoolRequest.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(updateUserPoolRequest.getUserPoolId());
            }
            if (updateUserPoolRequest.getPolicies() != null) {
                jsonGenerator.writeFieldName("Policies");
                UserPoolPolicyTypeJsonMarshaller.getInstance().marshall(updateUserPoolRequest.getPolicies(), jsonGenerator);
            }
            if (updateUserPoolRequest.getLambdaConfig() != null) {
                jsonGenerator.writeFieldName("LambdaConfig");
                LambdaConfigTypeJsonMarshaller.getInstance().marshall(updateUserPoolRequest.getLambdaConfig(), jsonGenerator);
            }

            java.util.List<String> autoVerifiedAttributesList = updateUserPoolRequest.getAutoVerifiedAttributes();
            if (autoVerifiedAttributesList != null) {
                jsonGenerator.writeFieldName("AutoVerifiedAttributes");
                jsonGenerator.writeStartArray();
                for (String autoVerifiedAttributesListValue : autoVerifiedAttributesList) {
                    if (autoVerifiedAttributesListValue != null) {
                        jsonGenerator.writeValue(autoVerifiedAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updateUserPoolRequest.getSmsVerificationMessage() != null) {
                jsonGenerator.writeFieldName("SmsVerificationMessage").writeValue(updateUserPoolRequest.getSmsVerificationMessage());
            }
            if (updateUserPoolRequest.getEmailVerificationMessage() != null) {
                jsonGenerator.writeFieldName("EmailVerificationMessage").writeValue(updateUserPoolRequest.getEmailVerificationMessage());
            }
            if (updateUserPoolRequest.getEmailVerificationSubject() != null) {
                jsonGenerator.writeFieldName("EmailVerificationSubject").writeValue(updateUserPoolRequest.getEmailVerificationSubject());
            }
            if (updateUserPoolRequest.getSmsAuthenticationMessage() != null) {
                jsonGenerator.writeFieldName("SmsAuthenticationMessage").writeValue(updateUserPoolRequest.getSmsAuthenticationMessage());
            }
            if (updateUserPoolRequest.getMfaConfiguration() != null) {
                jsonGenerator.writeFieldName("MfaConfiguration").writeValue(updateUserPoolRequest.getMfaConfiguration());
            }
            if (updateUserPoolRequest.getDeviceConfiguration() != null) {
                jsonGenerator.writeFieldName("DeviceConfiguration");
                DeviceConfigurationTypeJsonMarshaller.getInstance().marshall(updateUserPoolRequest.getDeviceConfiguration(), jsonGenerator);
            }
            if (updateUserPoolRequest.getEmailConfiguration() != null) {
                jsonGenerator.writeFieldName("EmailConfiguration");
                EmailConfigurationTypeJsonMarshaller.getInstance().marshall(updateUserPoolRequest.getEmailConfiguration(), jsonGenerator);
            }
            if (updateUserPoolRequest.getSmsConfiguration() != null) {
                jsonGenerator.writeFieldName("SmsConfiguration");
                SmsConfigurationTypeJsonMarshaller.getInstance().marshall(updateUserPoolRequest.getSmsConfiguration(), jsonGenerator);
            }
            if (updateUserPoolRequest.getAdminCreateUserConfig() != null) {
                jsonGenerator.writeFieldName("AdminCreateUserConfig");
                AdminCreateUserConfigTypeJsonMarshaller.getInstance().marshall(updateUserPoolRequest.getAdminCreateUserConfig(), jsonGenerator);
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
