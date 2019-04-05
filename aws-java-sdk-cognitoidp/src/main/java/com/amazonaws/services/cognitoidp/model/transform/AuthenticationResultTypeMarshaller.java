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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuthenticationResultTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthenticationResultTypeMarshaller {

    private static final MarshallingInfo<String> ACCESSTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessToken").build();
    private static final MarshallingInfo<Integer> EXPIRESIN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiresIn").build();
    private static final MarshallingInfo<String> TOKENTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TokenType").build();
    private static final MarshallingInfo<String> REFRESHTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshToken").build();
    private static final MarshallingInfo<String> IDTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IdToken").build();
    private static final MarshallingInfo<StructuredPojo> NEWDEVICEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewDeviceMetadata").build();

    private static final AuthenticationResultTypeMarshaller instance = new AuthenticationResultTypeMarshaller();

    public static AuthenticationResultTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuthenticationResultType authenticationResultType, ProtocolMarshaller protocolMarshaller) {

        if (authenticationResultType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authenticationResultType.getAccessToken(), ACCESSTOKEN_BINDING);
            protocolMarshaller.marshall(authenticationResultType.getExpiresIn(), EXPIRESIN_BINDING);
            protocolMarshaller.marshall(authenticationResultType.getTokenType(), TOKENTYPE_BINDING);
            protocolMarshaller.marshall(authenticationResultType.getRefreshToken(), REFRESHTOKEN_BINDING);
            protocolMarshaller.marshall(authenticationResultType.getIdToken(), IDTOKEN_BINDING);
            protocolMarshaller.marshall(authenticationResultType.getNewDeviceMetadata(), NEWDEVICEMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
