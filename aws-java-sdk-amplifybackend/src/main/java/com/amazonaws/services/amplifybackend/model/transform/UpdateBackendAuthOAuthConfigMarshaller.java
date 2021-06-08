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
package com.amazonaws.services.amplifybackend.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateBackendAuthOAuthConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateBackendAuthOAuthConfigMarshaller {

    private static final MarshallingInfo<String> DOMAINPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainPrefix").build();
    private static final MarshallingInfo<String> OAUTHGRANTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuthGrantType").build();
    private static final MarshallingInfo<List> OAUTHSCOPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("oAuthScopes").build();
    private static final MarshallingInfo<List> REDIRECTSIGNINURIS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redirectSignInURIs").build();
    private static final MarshallingInfo<List> REDIRECTSIGNOUTURIS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redirectSignOutURIs").build();
    private static final MarshallingInfo<StructuredPojo> SOCIALPROVIDERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("socialProviderSettings").build();

    private static final UpdateBackendAuthOAuthConfigMarshaller instance = new UpdateBackendAuthOAuthConfigMarshaller();

    public static UpdateBackendAuthOAuthConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateBackendAuthOAuthConfig updateBackendAuthOAuthConfig, ProtocolMarshaller protocolMarshaller) {

        if (updateBackendAuthOAuthConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateBackendAuthOAuthConfig.getDomainPrefix(), DOMAINPREFIX_BINDING);
            protocolMarshaller.marshall(updateBackendAuthOAuthConfig.getOAuthGrantType(), OAUTHGRANTTYPE_BINDING);
            protocolMarshaller.marshall(updateBackendAuthOAuthConfig.getOAuthScopes(), OAUTHSCOPES_BINDING);
            protocolMarshaller.marshall(updateBackendAuthOAuthConfig.getRedirectSignInURIs(), REDIRECTSIGNINURIS_BINDING);
            protocolMarshaller.marshall(updateBackendAuthOAuthConfig.getRedirectSignOutURIs(), REDIRECTSIGNOUTURIS_BINDING);
            protocolMarshaller.marshall(updateBackendAuthOAuthConfig.getSocialProviderSettings(), SOCIALPROVIDERSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
