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
 * OAuth2DefaultsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OAuth2DefaultsMarshaller {

    private static final MarshallingInfo<List> OAUTHSCOPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("oauthScopes").build();
    private static final MarshallingInfo<List> TOKENURLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tokenUrls").build();
    private static final MarshallingInfo<List> AUTHCODEURLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authCodeUrls").build();
    private static final MarshallingInfo<List> OAUTH2GRANTTYPESSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oauth2GrantTypesSupported").build();
    private static final MarshallingInfo<List> OAUTH2CUSTOMPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oauth2CustomProperties").build();

    private static final OAuth2DefaultsMarshaller instance = new OAuth2DefaultsMarshaller();

    public static OAuth2DefaultsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OAuth2Defaults oAuth2Defaults, ProtocolMarshaller protocolMarshaller) {

        if (oAuth2Defaults == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oAuth2Defaults.getOauthScopes(), OAUTHSCOPES_BINDING);
            protocolMarshaller.marshall(oAuth2Defaults.getTokenUrls(), TOKENURLS_BINDING);
            protocolMarshaller.marshall(oAuth2Defaults.getAuthCodeUrls(), AUTHCODEURLS_BINDING);
            protocolMarshaller.marshall(oAuth2Defaults.getOauth2GrantTypesSupported(), OAUTH2GRANTTYPESSUPPORTED_BINDING);
            protocolMarshaller.marshall(oAuth2Defaults.getOauth2CustomProperties(), OAUTH2CUSTOMPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
