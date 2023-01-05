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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuthenticationConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthenticationConfigMarshaller {

    private static final MarshallingInfo<Boolean> ISBASICAUTHSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isBasicAuthSupported").build();
    private static final MarshallingInfo<Boolean> ISAPIKEYAUTHSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isApiKeyAuthSupported").build();
    private static final MarshallingInfo<Boolean> ISOAUTH2SUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isOAuth2Supported").build();
    private static final MarshallingInfo<Boolean> ISCUSTOMAUTHSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isCustomAuthSupported").build();
    private static final MarshallingInfo<StructuredPojo> OAUTH2DEFAULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuth2Defaults").build();
    private static final MarshallingInfo<List> CUSTOMAUTHCONFIGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customAuthConfigs").build();

    private static final AuthenticationConfigMarshaller instance = new AuthenticationConfigMarshaller();

    public static AuthenticationConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuthenticationConfig authenticationConfig, ProtocolMarshaller protocolMarshaller) {

        if (authenticationConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authenticationConfig.getIsBasicAuthSupported(), ISBASICAUTHSUPPORTED_BINDING);
            protocolMarshaller.marshall(authenticationConfig.getIsApiKeyAuthSupported(), ISAPIKEYAUTHSUPPORTED_BINDING);
            protocolMarshaller.marshall(authenticationConfig.getIsOAuth2Supported(), ISOAUTH2SUPPORTED_BINDING);
            protocolMarshaller.marshall(authenticationConfig.getIsCustomAuthSupported(), ISCUSTOMAUTHSUPPORTED_BINDING);
            protocolMarshaller.marshall(authenticationConfig.getOAuth2Defaults(), OAUTH2DEFAULTS_BINDING);
            protocolMarshaller.marshall(authenticationConfig.getCustomAuthConfigs(), CUSTOMAUTHCONFIGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
