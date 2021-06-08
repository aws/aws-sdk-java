/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * SlackConnectorProfileCredentialsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlackConnectorProfileCredentialsMarshaller {

    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientId").build();
    private static final MarshallingInfo<String> CLIENTSECRET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientSecret").build();
    private static final MarshallingInfo<String> ACCESSTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessToken").build();
    private static final MarshallingInfo<StructuredPojo> OAUTHREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuthRequest").build();

    private static final SlackConnectorProfileCredentialsMarshaller instance = new SlackConnectorProfileCredentialsMarshaller();

    public static SlackConnectorProfileCredentialsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlackConnectorProfileCredentials slackConnectorProfileCredentials, ProtocolMarshaller protocolMarshaller) {

        if (slackConnectorProfileCredentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slackConnectorProfileCredentials.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(slackConnectorProfileCredentials.getClientSecret(), CLIENTSECRET_BINDING);
            protocolMarshaller.marshall(slackConnectorProfileCredentials.getAccessToken(), ACCESSTOKEN_BINDING);
            protocolMarshaller.marshall(slackConnectorProfileCredentials.getOAuthRequest(), OAUTHREQUEST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
