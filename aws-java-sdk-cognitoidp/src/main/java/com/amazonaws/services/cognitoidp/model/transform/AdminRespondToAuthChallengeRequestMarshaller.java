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
 * AdminRespondToAuthChallengeRequest Marshaller
 */
public class AdminRespondToAuthChallengeRequestMarshaller implements
        Marshaller<Request<AdminRespondToAuthChallengeRequest>, AdminRespondToAuthChallengeRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public AdminRespondToAuthChallengeRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<AdminRespondToAuthChallengeRequest> marshall(AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest) {

        if (adminRespondToAuthChallengeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AdminRespondToAuthChallengeRequest> request = new DefaultRequest<AdminRespondToAuthChallengeRequest>(adminRespondToAuthChallengeRequest,
                "AWSCognitoIdentityProvider");
        request.addHeader("X-Amz-Target", "AWSCognitoIdentityProviderService.AdminRespondToAuthChallenge");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (adminRespondToAuthChallengeRequest.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(adminRespondToAuthChallengeRequest.getUserPoolId());
            }
            if (adminRespondToAuthChallengeRequest.getClientId() != null) {
                jsonGenerator.writeFieldName("ClientId").writeValue(adminRespondToAuthChallengeRequest.getClientId());
            }
            if (adminRespondToAuthChallengeRequest.getChallengeName() != null) {
                jsonGenerator.writeFieldName("ChallengeName").writeValue(adminRespondToAuthChallengeRequest.getChallengeName());
            }

            java.util.Map<String, String> challengeResponsesMap = adminRespondToAuthChallengeRequest.getChallengeResponses();
            if (challengeResponsesMap != null) {
                jsonGenerator.writeFieldName("ChallengeResponses");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> challengeResponsesMapValue : challengeResponsesMap.entrySet()) {
                    if (challengeResponsesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(challengeResponsesMapValue.getKey());

                        jsonGenerator.writeValue(challengeResponsesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (adminRespondToAuthChallengeRequest.getSession() != null) {
                jsonGenerator.writeFieldName("Session").writeValue(adminRespondToAuthChallengeRequest.getSession());
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
