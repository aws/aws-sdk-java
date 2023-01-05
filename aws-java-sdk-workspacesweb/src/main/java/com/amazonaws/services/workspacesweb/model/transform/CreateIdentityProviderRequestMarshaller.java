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
package com.amazonaws.services.workspacesweb.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateIdentityProviderRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateIdentityProviderRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> IDENTITYPROVIDERDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityProviderDetails").build();
    private static final MarshallingInfo<String> IDENTITYPROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityProviderName").build();
    private static final MarshallingInfo<String> IDENTITYPROVIDERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityProviderType").build();
    private static final MarshallingInfo<String> PORTALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("portalArn").build();

    private static final CreateIdentityProviderRequestMarshaller instance = new CreateIdentityProviderRequestMarshaller();

    public static CreateIdentityProviderRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateIdentityProviderRequest createIdentityProviderRequest, ProtocolMarshaller protocolMarshaller) {

        if (createIdentityProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createIdentityProviderRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createIdentityProviderRequest.getIdentityProviderDetails(), IDENTITYPROVIDERDETAILS_BINDING);
            protocolMarshaller.marshall(createIdentityProviderRequest.getIdentityProviderName(), IDENTITYPROVIDERNAME_BINDING);
            protocolMarshaller.marshall(createIdentityProviderRequest.getIdentityProviderType(), IDENTITYPROVIDERTYPE_BINDING);
            protocolMarshaller.marshall(createIdentityProviderRequest.getPortalArn(), PORTALARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
