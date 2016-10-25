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
package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * CreateAuthorizerRequest Marshaller
 */
public class CreateAuthorizerRequestMarshaller implements Marshaller<Request<CreateAuthorizerRequest>, CreateAuthorizerRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateAuthorizerRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateAuthorizerRequest> marshall(CreateAuthorizerRequest createAuthorizerRequest) {

        if (createAuthorizerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAuthorizerRequest> request = new DefaultRequest<CreateAuthorizerRequest>(createAuthorizerRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis/{restapi_id}/authorizers";

        uriResourcePath = uriResourcePath
                .replace(
                        "{restapi_id}",
                        (createAuthorizerRequest.getRestApiId() != null) ? SdkHttpUtils.urlEncode(
                                StringUtils.fromString(createAuthorizerRequest.getRestApiId()), false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createAuthorizerRequest.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(createAuthorizerRequest.getName());
            }
            if (createAuthorizerRequest.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(createAuthorizerRequest.getType());
            }

            java.util.List<String> providerARNsList = createAuthorizerRequest.getProviderARNs();
            if (providerARNsList != null) {
                jsonGenerator.writeFieldName("providerARNs");
                jsonGenerator.writeStartArray();
                for (String providerARNsListValue : providerARNsList) {
                    if (providerARNsListValue != null) {
                        jsonGenerator.writeValue(providerARNsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createAuthorizerRequest.getAuthType() != null) {
                jsonGenerator.writeFieldName("authType").writeValue(createAuthorizerRequest.getAuthType());
            }
            if (createAuthorizerRequest.getAuthorizerUri() != null) {
                jsonGenerator.writeFieldName("authorizerUri").writeValue(createAuthorizerRequest.getAuthorizerUri());
            }
            if (createAuthorizerRequest.getAuthorizerCredentials() != null) {
                jsonGenerator.writeFieldName("authorizerCredentials").writeValue(createAuthorizerRequest.getAuthorizerCredentials());
            }
            if (createAuthorizerRequest.getIdentitySource() != null) {
                jsonGenerator.writeFieldName("identitySource").writeValue(createAuthorizerRequest.getIdentitySource());
            }
            if (createAuthorizerRequest.getIdentityValidationExpression() != null) {
                jsonGenerator.writeFieldName("identityValidationExpression").writeValue(createAuthorizerRequest.getIdentityValidationExpression());
            }
            if (createAuthorizerRequest.getAuthorizerResultTtlInSeconds() != null) {
                jsonGenerator.writeFieldName("authorizerResultTtlInSeconds").writeValue(createAuthorizerRequest.getAuthorizerResultTtlInSeconds());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
