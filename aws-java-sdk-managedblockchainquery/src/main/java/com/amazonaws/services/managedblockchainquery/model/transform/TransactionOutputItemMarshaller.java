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
 * TransactionOutputItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransactionOutputItemMarshaller {

    private static final MarshallingInfo<String> TRANSACTIONHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionHash").build();
    private static final MarshallingInfo<String> TRANSACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionId").build();
    private static final MarshallingInfo<String> NETWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("network").build();
    private static final MarshallingInfo<java.util.Date> TRANSACTIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CONFIRMATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationStatus").build();

    private static final TransactionOutputItemMarshaller instance = new TransactionOutputItemMarshaller();

    public static TransactionOutputItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransactionOutputItem transactionOutputItem, ProtocolMarshaller protocolMarshaller) {

        if (transactionOutputItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transactionOutputItem.getTransactionHash(), TRANSACTIONHASH_BINDING);
            protocolMarshaller.marshall(transactionOutputItem.getTransactionId(), TRANSACTIONID_BINDING);
            protocolMarshaller.marshall(transactionOutputItem.getNetwork(), NETWORK_BINDING);
            protocolMarshaller.marshall(transactionOutputItem.getTransactionTimestamp(), TRANSACTIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(transactionOutputItem.getConfirmationStatus(), CONFIRMATIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
