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
package com.amazonaws.services.cognitoidentity.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateIdentityPoolRequest Marshaller
 */
public class CreateIdentityPoolRequestMarshaller implements Marshaller<Request<CreateIdentityPoolRequest>, CreateIdentityPoolRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateIdentityPoolRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateIdentityPoolRequest> marshall(CreateIdentityPoolRequest createIdentityPoolRequest) {

        if (createIdentityPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateIdentityPoolRequest> request = new DefaultRequest<CreateIdentityPoolRequest>(createIdentityPoolRequest, "AmazonCognitoIdentity");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityService.CreateIdentityPool");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createIdentityPoolRequest.getIdentityPoolName() != null) {
                jsonGenerator.writeFieldName("IdentityPoolName").writeValue(createIdentityPoolRequest.getIdentityPoolName());
            }
            if (createIdentityPoolRequest.getAllowUnauthenticatedIdentities() != null) {
                jsonGenerator.writeFieldName("AllowUnauthenticatedIdentities").writeValue(createIdentityPoolRequest.getAllowUnauthenticatedIdentities());
            }

            java.util.Map<String, String> supportedLoginProvidersMap = createIdentityPoolRequest.getSupportedLoginProviders();
            if (supportedLoginProvidersMap != null) {
                jsonGenerator.writeFieldName("SupportedLoginProviders");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> supportedLoginProvidersMapValue : supportedLoginProvidersMap.entrySet()) {
                    if (supportedLoginProvidersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(supportedLoginProvidersMapValue.getKey());

                        jsonGenerator.writeValue(supportedLoginProvidersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (createIdentityPoolRequest.getDeveloperProviderName() != null) {
                jsonGenerator.writeFieldName("DeveloperProviderName").writeValue(createIdentityPoolRequest.getDeveloperProviderName());
            }

            java.util.List<String> openIdConnectProviderARNsList = createIdentityPoolRequest.getOpenIdConnectProviderARNs();
            if (openIdConnectProviderARNsList != null) {
                jsonGenerator.writeFieldName("OpenIdConnectProviderARNs");
                jsonGenerator.writeStartArray();
                for (String openIdConnectProviderARNsListValue : openIdConnectProviderARNsList) {
                    if (openIdConnectProviderARNsListValue != null) {
                        jsonGenerator.writeValue(openIdConnectProviderARNsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<CognitoIdentityProvider> cognitoIdentityProvidersList = createIdentityPoolRequest.getCognitoIdentityProviders();
            if (cognitoIdentityProvidersList != null) {
                jsonGenerator.writeFieldName("CognitoIdentityProviders");
                jsonGenerator.writeStartArray();
                for (CognitoIdentityProvider cognitoIdentityProvidersListValue : cognitoIdentityProvidersList) {
                    if (cognitoIdentityProvidersListValue != null) {

                        CognitoIdentityProviderJsonMarshaller.getInstance().marshall(cognitoIdentityProvidersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> samlProviderARNsList = createIdentityPoolRequest.getSamlProviderARNs();
            if (samlProviderARNsList != null) {
                jsonGenerator.writeFieldName("SamlProviderARNs");
                jsonGenerator.writeStartArray();
                for (String samlProviderARNsListValue : samlProviderARNsList) {
                    if (samlProviderARNsListValue != null) {
                        jsonGenerator.writeValue(samlProviderARNsListValue);
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
