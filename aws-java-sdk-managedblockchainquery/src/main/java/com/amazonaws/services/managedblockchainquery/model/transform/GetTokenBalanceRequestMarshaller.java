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
package com.amazonaws.services.managedblockchainquery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedblockchainquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetTokenBalanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetTokenBalanceRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> TOKENIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tokenIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> OWNERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> ATBLOCKCHAININSTANT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("atBlockchainInstant").build();

    private static final GetTokenBalanceRequestMarshaller instance = new GetTokenBalanceRequestMarshaller();

    public static GetTokenBalanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetTokenBalanceRequest getTokenBalanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (getTokenBalanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getTokenBalanceRequest.getTokenIdentifier(), TOKENIDENTIFIER_BINDING);
            protocolMarshaller.marshall(getTokenBalanceRequest.getOwnerIdentifier(), OWNERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(getTokenBalanceRequest.getAtBlockchainInstant(), ATBLOCKCHAININSTANT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
