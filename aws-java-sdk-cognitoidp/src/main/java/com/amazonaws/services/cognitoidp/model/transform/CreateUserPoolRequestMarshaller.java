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
 * CreateUserPoolRequest Marshaller
 */
public class CreateUserPoolRequestMarshaller implements Marshaller<Request<CreateUserPoolRequest>, CreateUserPoolRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateUserPoolRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateUserPoolRequest> marshall(CreateUserPoolRequest createUserPoolRequest) {

        if (createUserPoolRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateUserPoolRequest> request = new DefaultRequest<CreateUserPoolRequest>(createUserPoolRequest, "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.CreateUserPool");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createUserPoolRequest.getPoolName() != null) {
                jsonGenerator.writeFieldName("PoolName").writeValue(createUserPoolRequest.getPoolName());
            }
            if (createUserPoolRequest.getPolicies() != null) {
                jsonGenerator.writeFieldName("Policies");
                UserPoolPolicyTypeJsonMarshaller.getInstance().marshall(createUserPoolRequest.getPolicies(), jsonGenerator);
            }
            if (createUserPoolRequest.getLambdaConfig() != null) {
                jsonGenerator.writeFieldName("LambdaConfig");
                LambdaConfigTypeJsonMarshaller.getInstance().marshall(createUserPoolRequest.getLambdaConfig(), jsonGenerator);
            }

            java.util.List<String> autoVerifiedAttributesList = createUserPoolRequest.getAutoVerifiedAttributes();
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

            java.util.List<String> aliasAttributesList = createUserPoolRequest.getAliasAttributes();
            if (aliasAttributesList != null) {
                jsonGenerator.writeFieldName("AliasAttributes");
                jsonGenerator.writeStartArray();
                for (String aliasAttributesListValue : aliasAttributesList) {
                    if (aliasAttributesListValue != null) {
                        jsonGenerator.writeValue(aliasAttributesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createUserPoolRequest.getSmsVerificationMessage() != null) {
                jsonGenerator.writeFieldName("SmsVerificationMessage").writeValue(createUserPoolRequest.getSmsVerificationMessage());
            }
            if (createUserPoolRequest.getEmailVerificationMessage() != null) {
                jsonGenerator.writeFieldName("EmailVerificationMessage").writeValue(createUserPoolRequest.getEmailVerificationMessage());
            }
            if (createUserPoolRequest.getEmailVerificationSubject() != null) {
                jsonGenerator.writeFieldName("EmailVerificationSubject").writeValue(createUserPoolRequest.getEmailVerificationSubject());
            }
            if (createUserPoolRequest.getSmsAuthenticationMessage() != null) {
                jsonGenerator.writeFieldName("SmsAuthenticationMessage").writeValue(createUserPoolRequest.getSmsAuthenticationMessage());
            }
            if (createUserPoolRequest.getMfaConfiguration() != null) {
                jsonGenerator.writeFieldName("MfaConfiguration").writeValue(createUserPoolRequest.getMfaConfiguration());
            }
            if (createUserPoolRequest.getDeviceConfiguration() != null) {
                jsonGenerator.writeFieldName("DeviceConfiguration");
                DeviceConfigurationTypeJsonMarshaller.getInstance().marshall(createUserPoolRequest.getDeviceConfiguration(), jsonGenerator);
            }
            if (createUserPoolRequest.getEmailConfiguration() != null) {
                jsonGenerator.writeFieldName("EmailConfiguration");
                EmailConfigurationTypeJsonMarshaller.getInstance().marshall(createUserPoolRequest.getEmailConfiguration(), jsonGenerator);
            }
            if (createUserPoolRequest.getSmsConfiguration() != null) {
                jsonGenerator.writeFieldName("SmsConfiguration");
                SmsConfigurationTypeJsonMarshaller.getInstance().marshall(createUserPoolRequest.getSmsConfiguration(), jsonGenerator);
            }
            if (createUserPoolRequest.getAdminCreateUserConfig() != null) {
                jsonGenerator.writeFieldName("AdminCreateUserConfig");
                AdminCreateUserConfigTypeJsonMarshaller.getInstance().marshall(createUserPoolRequest.getAdminCreateUserConfig(), jsonGenerator);
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
