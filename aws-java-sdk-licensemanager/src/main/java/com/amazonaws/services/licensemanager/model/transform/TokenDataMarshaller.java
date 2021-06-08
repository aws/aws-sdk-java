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
package com.amazonaws.services.licensemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TokenDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TokenDataMarshaller {

    private static final MarshallingInfo<String> TOKENID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TokenId").build();
    private static final MarshallingInfo<String> TOKENTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TokenType").build();
    private static final MarshallingInfo<String> LICENSEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseArn").build();
    private static final MarshallingInfo<String> EXPIRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationTime").build();
    private static final MarshallingInfo<List> TOKENPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TokenProperties").build();
    private static final MarshallingInfo<List> ROLEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArns").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final TokenDataMarshaller instance = new TokenDataMarshaller();

    public static TokenDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TokenData tokenData, ProtocolMarshaller protocolMarshaller) {

        if (tokenData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tokenData.getTokenId(), TOKENID_BINDING);
            protocolMarshaller.marshall(tokenData.getTokenType(), TOKENTYPE_BINDING);
            protocolMarshaller.marshall(tokenData.getLicenseArn(), LICENSEARN_BINDING);
            protocolMarshaller.marshall(tokenData.getExpirationTime(), EXPIRATIONTIME_BINDING);
            protocolMarshaller.marshall(tokenData.getTokenProperties(), TOKENPROPERTIES_BINDING);
            protocolMarshaller.marshall(tokenData.getRoleArns(), ROLEARNS_BINDING);
            protocolMarshaller.marshall(tokenData.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
