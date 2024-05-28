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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssoadmin.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuthorizedTokenIssuerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthorizedTokenIssuerMarshaller {

    private static final MarshallingInfo<List> AUTHORIZEDAUDIENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthorizedAudiences").build();
    private static final MarshallingInfo<String> TRUSTEDTOKENISSUERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrustedTokenIssuerArn").build();

    private static final AuthorizedTokenIssuerMarshaller instance = new AuthorizedTokenIssuerMarshaller();

    public static AuthorizedTokenIssuerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuthorizedTokenIssuer authorizedTokenIssuer, ProtocolMarshaller protocolMarshaller) {

        if (authorizedTokenIssuer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authorizedTokenIssuer.getAuthorizedAudiences(), AUTHORIZEDAUDIENCES_BINDING);
            protocolMarshaller.marshall(authorizedTokenIssuer.getTrustedTokenIssuerArn(), TRUSTEDTOKENISSUERARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
