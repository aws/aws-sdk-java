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
package com.amazonaws.services.eks.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OidcIdentityProviderConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OidcIdentityProviderConfigRequestMarshaller {

    private static final MarshallingInfo<String> IDENTITYPROVIDERCONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityProviderConfigName").build();
    private static final MarshallingInfo<String> ISSUERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issuerUrl").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientId").build();
    private static final MarshallingInfo<String> USERNAMECLAIM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usernameClaim").build();
    private static final MarshallingInfo<String> USERNAMEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usernamePrefix").build();
    private static final MarshallingInfo<String> GROUPSCLAIM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groupsClaim").build();
    private static final MarshallingInfo<String> GROUPSPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groupsPrefix").build();
    private static final MarshallingInfo<Map> REQUIREDCLAIMS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requiredClaims").build();

    private static final OidcIdentityProviderConfigRequestMarshaller instance = new OidcIdentityProviderConfigRequestMarshaller();

    public static OidcIdentityProviderConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OidcIdentityProviderConfigRequest oidcIdentityProviderConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (oidcIdentityProviderConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getIdentityProviderConfigName(), IDENTITYPROVIDERCONFIGNAME_BINDING);
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getIssuerUrl(), ISSUERURL_BINDING);
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getUsernameClaim(), USERNAMECLAIM_BINDING);
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getUsernamePrefix(), USERNAMEPREFIX_BINDING);
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getGroupsClaim(), GROUPSCLAIM_BINDING);
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getGroupsPrefix(), GROUPSPREFIX_BINDING);
            protocolMarshaller.marshall(oidcIdentityProviderConfigRequest.getRequiredClaims(), REQUIREDCLAIMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
