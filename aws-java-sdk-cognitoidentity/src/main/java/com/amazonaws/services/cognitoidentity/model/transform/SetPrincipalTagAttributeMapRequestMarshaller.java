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
package com.amazonaws.services.cognitoidentity.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidentity.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SetPrincipalTagAttributeMapRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SetPrincipalTagAttributeMapRequestMarshaller {

    private static final MarshallingInfo<String> IDENTITYPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityPoolId").build();
    private static final MarshallingInfo<String> IDENTITYPROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityProviderName").build();
    private static final MarshallingInfo<Boolean> USEDEFAULTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseDefaults").build();
    private static final MarshallingInfo<Map> PRINCIPALTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PrincipalTags").build();

    private static final SetPrincipalTagAttributeMapRequestMarshaller instance = new SetPrincipalTagAttributeMapRequestMarshaller();

    public static SetPrincipalTagAttributeMapRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SetPrincipalTagAttributeMapRequest setPrincipalTagAttributeMapRequest, ProtocolMarshaller protocolMarshaller) {

        if (setPrincipalTagAttributeMapRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(setPrincipalTagAttributeMapRequest.getIdentityPoolId(), IDENTITYPOOLID_BINDING);
            protocolMarshaller.marshall(setPrincipalTagAttributeMapRequest.getIdentityProviderName(), IDENTITYPROVIDERNAME_BINDING);
            protocolMarshaller.marshall(setPrincipalTagAttributeMapRequest.getUseDefaults(), USEDEFAULTS_BINDING);
            protocolMarshaller.marshall(setPrincipalTagAttributeMapRequest.getPrincipalTags(), PRINCIPALTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
