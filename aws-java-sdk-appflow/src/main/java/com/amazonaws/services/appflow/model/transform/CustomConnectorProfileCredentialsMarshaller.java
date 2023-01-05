/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CustomConnectorProfileCredentialsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomConnectorProfileCredentialsMarshaller {

    private static final MarshallingInfo<String> AUTHENTICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authenticationType").build();
    private static final MarshallingInfo<StructuredPojo> BASIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basic").build();
    private static final MarshallingInfo<StructuredPojo> OAUTH2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oauth2").build();
    private static final MarshallingInfo<StructuredPojo> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiKey").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("custom").build();

    private static final CustomConnectorProfileCredentialsMarshaller instance = new CustomConnectorProfileCredentialsMarshaller();

    public static CustomConnectorProfileCredentialsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomConnectorProfileCredentials customConnectorProfileCredentials, ProtocolMarshaller protocolMarshaller) {

        if (customConnectorProfileCredentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customConnectorProfileCredentials.getAuthenticationType(), AUTHENTICATIONTYPE_BINDING);
            protocolMarshaller.marshall(customConnectorProfileCredentials.getBasic(), BASIC_BINDING);
            protocolMarshaller.marshall(customConnectorProfileCredentials.getOauth2(), OAUTH2_BINDING);
            protocolMarshaller.marshall(customConnectorProfileCredentials.getApiKey(), APIKEY_BINDING);
            protocolMarshaller.marshall(customConnectorProfileCredentials.getCustom(), CUSTOM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
