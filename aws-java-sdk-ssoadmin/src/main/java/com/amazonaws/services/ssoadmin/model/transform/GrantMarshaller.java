/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssoadmin.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssoadmin.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GrantMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GrantMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUTHORIZATIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthorizationCode").build();
    private static final MarshallingInfo<StructuredPojo> JWTBEARER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JwtBearer").build();
    private static final MarshallingInfo<StructuredPojo> REFRESHTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshToken").build();
    private static final MarshallingInfo<StructuredPojo> TOKENEXCHANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TokenExchange").build();

    private static final GrantMarshaller instance = new GrantMarshaller();

    public static GrantMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Grant grant, ProtocolMarshaller protocolMarshaller) {

        if (grant == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(grant.getAuthorizationCode(), AUTHORIZATIONCODE_BINDING);
            protocolMarshaller.marshall(grant.getJwtBearer(), JWTBEARER_BINDING);
            protocolMarshaller.marshall(grant.getRefreshToken(), REFRESHTOKEN_BINDING);
            protocolMarshaller.marshall(grant.getTokenExchange(), TOKENEXCHANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
