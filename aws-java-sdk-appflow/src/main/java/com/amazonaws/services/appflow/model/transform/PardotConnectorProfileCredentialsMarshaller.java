/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PardotConnectorProfileCredentialsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PardotConnectorProfileCredentialsMarshaller {

    private static final MarshallingInfo<String> ACCESSTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessToken").build();
    private static final MarshallingInfo<String> REFRESHTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("refreshToken").build();
    private static final MarshallingInfo<StructuredPojo> OAUTHREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuthRequest").build();
    private static final MarshallingInfo<String> CLIENTCREDENTIALSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientCredentialsArn").build();

    private static final PardotConnectorProfileCredentialsMarshaller instance = new PardotConnectorProfileCredentialsMarshaller();

    public static PardotConnectorProfileCredentialsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PardotConnectorProfileCredentials pardotConnectorProfileCredentials, ProtocolMarshaller protocolMarshaller) {

        if (pardotConnectorProfileCredentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pardotConnectorProfileCredentials.getAccessToken(), ACCESSTOKEN_BINDING);
            protocolMarshaller.marshall(pardotConnectorProfileCredentials.getRefreshToken(), REFRESHTOKEN_BINDING);
            protocolMarshaller.marshall(pardotConnectorProfileCredentials.getOAuthRequest(), OAUTHREQUEST_BINDING);
            protocolMarshaller.marshall(pardotConnectorProfileCredentials.getClientCredentialsArn(), CLIENTCREDENTIALSARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
