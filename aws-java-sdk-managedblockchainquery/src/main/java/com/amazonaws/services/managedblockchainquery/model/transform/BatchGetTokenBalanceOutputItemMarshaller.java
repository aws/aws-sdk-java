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
 * BatchGetTokenBalanceOutputItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchGetTokenBalanceOutputItemMarshaller {

    private static final MarshallingInfo<StructuredPojo> OWNERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> TOKENIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tokenIdentifier").build();
    private static final MarshallingInfo<String> BALANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("balance").build();
    private static final MarshallingInfo<StructuredPojo> ATBLOCKCHAININSTANT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("atBlockchainInstant").build();
    private static final MarshallingInfo<StructuredPojo> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").build();

    private static final BatchGetTokenBalanceOutputItemMarshaller instance = new BatchGetTokenBalanceOutputItemMarshaller();

    public static BatchGetTokenBalanceOutputItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchGetTokenBalanceOutputItem batchGetTokenBalanceOutputItem, ProtocolMarshaller protocolMarshaller) {

        if (batchGetTokenBalanceOutputItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchGetTokenBalanceOutputItem.getOwnerIdentifier(), OWNERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(batchGetTokenBalanceOutputItem.getTokenIdentifier(), TOKENIDENTIFIER_BINDING);
            protocolMarshaller.marshall(batchGetTokenBalanceOutputItem.getBalance(), BALANCE_BINDING);
            protocolMarshaller.marshall(batchGetTokenBalanceOutputItem.getAtBlockchainInstant(), ATBLOCKCHAININSTANT_BINDING);
            protocolMarshaller.marshall(batchGetTokenBalanceOutputItem.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
