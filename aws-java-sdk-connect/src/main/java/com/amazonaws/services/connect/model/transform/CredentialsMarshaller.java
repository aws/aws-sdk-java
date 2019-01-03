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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CredentialsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CredentialsMarshaller {

    private static final MarshallingInfo<String> ACCESSTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessToken").build();
    private static final MarshallingInfo<java.util.Date> ACCESSTOKENEXPIRATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessTokenExpiration").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REFRESHTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshToken").build();
    private static final MarshallingInfo<java.util.Date> REFRESHTOKENEXPIRATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshTokenExpiration").timestampFormat("unixTimestamp").build();

    private static final CredentialsMarshaller instance = new CredentialsMarshaller();

    public static CredentialsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Credentials credentials, ProtocolMarshaller protocolMarshaller) {

        if (credentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(credentials.getAccessToken(), ACCESSTOKEN_BINDING);
            protocolMarshaller.marshall(credentials.getAccessTokenExpiration(), ACCESSTOKENEXPIRATION_BINDING);
            protocolMarshaller.marshall(credentials.getRefreshToken(), REFRESHTOKEN_BINDING);
            protocolMarshaller.marshall(credentials.getRefreshTokenExpiration(), REFRESHTOKENEXPIRATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
