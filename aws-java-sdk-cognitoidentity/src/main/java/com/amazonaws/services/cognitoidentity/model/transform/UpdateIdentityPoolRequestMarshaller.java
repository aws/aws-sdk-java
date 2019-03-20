/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidentity.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateIdentityPoolRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateIdentityPoolRequestMarshaller {

    private static final MarshallingInfo<String> IDENTITYPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityPoolId").build();
    private static final MarshallingInfo<String> IDENTITYPOOLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityPoolName").build();
    private static final MarshallingInfo<Boolean> ALLOWUNAUTHENTICATEDIDENTITIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowUnauthenticatedIdentities").build();
    private static final MarshallingInfo<Map> SUPPORTEDLOGINPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedLoginProviders").build();
    private static final MarshallingInfo<String> DEVELOPERPROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeveloperProviderName").build();
    private static final MarshallingInfo<List> OPENIDCONNECTPROVIDERARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenIdConnectProviderARNs").build();
    private static final MarshallingInfo<List> COGNITOIDENTITYPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CognitoIdentityProviders").build();
    private static final MarshallingInfo<List> SAMLPROVIDERARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SamlProviderARNs").build();
    private static final MarshallingInfo<Map> IDENTITYPOOLTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityPoolTags").build();

    private static final UpdateIdentityPoolRequestMarshaller instance = new UpdateIdentityPoolRequestMarshaller();

    public static UpdateIdentityPoolRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateIdentityPoolRequest updateIdentityPoolRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateIdentityPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateIdentityPoolRequest.getIdentityPoolId(), IDENTITYPOOLID_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getIdentityPoolName(), IDENTITYPOOLNAME_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getAllowUnauthenticatedIdentities(), ALLOWUNAUTHENTICATEDIDENTITIES_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getSupportedLoginProviders(), SUPPORTEDLOGINPROVIDERS_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getDeveloperProviderName(), DEVELOPERPROVIDERNAME_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getOpenIdConnectProviderARNs(), OPENIDCONNECTPROVIDERARNS_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getCognitoIdentityProviders(), COGNITOIDENTITYPROVIDERS_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getSamlProviderARNs(), SAMLPROVIDERARNS_BINDING);
            protocolMarshaller.marshall(updateIdentityPoolRequest.getIdentityPoolTags(), IDENTITYPOOLTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
