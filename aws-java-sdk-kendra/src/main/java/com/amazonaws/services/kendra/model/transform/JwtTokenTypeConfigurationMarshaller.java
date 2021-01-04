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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JwtTokenTypeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JwtTokenTypeConfigurationMarshaller {

    private static final MarshallingInfo<String> KEYLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyLocation").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("URL").build();
    private static final MarshallingInfo<String> SECRETMANAGERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretManagerArn").build();
    private static final MarshallingInfo<String> USERNAMEATTRIBUTEFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserNameAttributeField").build();
    private static final MarshallingInfo<String> GROUPATTRIBUTEFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupAttributeField").build();
    private static final MarshallingInfo<String> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Issuer").build();
    private static final MarshallingInfo<String> CLAIMREGEX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClaimRegex").build();

    private static final JwtTokenTypeConfigurationMarshaller instance = new JwtTokenTypeConfigurationMarshaller();

    public static JwtTokenTypeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JwtTokenTypeConfiguration jwtTokenTypeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (jwtTokenTypeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jwtTokenTypeConfiguration.getKeyLocation(), KEYLOCATION_BINDING);
            protocolMarshaller.marshall(jwtTokenTypeConfiguration.getURL(), URL_BINDING);
            protocolMarshaller.marshall(jwtTokenTypeConfiguration.getSecretManagerArn(), SECRETMANAGERARN_BINDING);
            protocolMarshaller.marshall(jwtTokenTypeConfiguration.getUserNameAttributeField(), USERNAMEATTRIBUTEFIELD_BINDING);
            protocolMarshaller.marshall(jwtTokenTypeConfiguration.getGroupAttributeField(), GROUPATTRIBUTEFIELD_BINDING);
            protocolMarshaller.marshall(jwtTokenTypeConfiguration.getIssuer(), ISSUER_BINDING);
            protocolMarshaller.marshall(jwtTokenTypeConfiguration.getClaimRegex(), CLAIMREGEX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
