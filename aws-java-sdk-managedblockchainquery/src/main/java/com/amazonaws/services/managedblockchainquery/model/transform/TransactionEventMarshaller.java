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
 * TransactionEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransactionEventMarshaller {

    private static final MarshallingInfo<String> NETWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("network").build();
    private static final MarshallingInfo<String> TRANSACTIONHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionHash").build();
    private static final MarshallingInfo<String> EVENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventType").build();
    private static final MarshallingInfo<String> FROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("from").build();
    private static final MarshallingInfo<String> TO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("to").build();
    private static final MarshallingInfo<String> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("value").build();
    private static final MarshallingInfo<String> CONTRACTADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contractAddress").build();
    private static final MarshallingInfo<String> TOKENID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tokenId").build();
    private static final MarshallingInfo<String> TRANSACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionId").build();
    private static final MarshallingInfo<Integer> VOUTINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("voutIndex").build();
    private static final MarshallingInfo<Boolean> VOUTSPENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("voutSpent").build();
    private static final MarshallingInfo<String> SPENTVOUTTRANSACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spentVoutTransactionId").build();
    private static final MarshallingInfo<String> SPENTVOUTTRANSACTIONHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spentVoutTransactionHash").build();
    private static final MarshallingInfo<Integer> SPENTVOUTINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spentVoutIndex").build();
    private static final MarshallingInfo<StructuredPojo> BLOCKCHAININSTANT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockchainInstant").build();
    private static final MarshallingInfo<String> CONFIRMATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationStatus").build();

    private static final TransactionEventMarshaller instance = new TransactionEventMarshaller();

    public static TransactionEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransactionEvent transactionEvent, ProtocolMarshaller protocolMarshaller) {

        if (transactionEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transactionEvent.getNetwork(), NETWORK_BINDING);
            protocolMarshaller.marshall(transactionEvent.getTransactionHash(), TRANSACTIONHASH_BINDING);
            protocolMarshaller.marshall(transactionEvent.getEventType(), EVENTTYPE_BINDING);
            protocolMarshaller.marshall(transactionEvent.getFrom(), FROM_BINDING);
            protocolMarshaller.marshall(transactionEvent.getTo(), TO_BINDING);
            protocolMarshaller.marshall(transactionEvent.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(transactionEvent.getContractAddress(), CONTRACTADDRESS_BINDING);
            protocolMarshaller.marshall(transactionEvent.getTokenId(), TOKENID_BINDING);
            protocolMarshaller.marshall(transactionEvent.getTransactionId(), TRANSACTIONID_BINDING);
            protocolMarshaller.marshall(transactionEvent.getVoutIndex(), VOUTINDEX_BINDING);
            protocolMarshaller.marshall(transactionEvent.getVoutSpent(), VOUTSPENT_BINDING);
            protocolMarshaller.marshall(transactionEvent.getSpentVoutTransactionId(), SPENTVOUTTRANSACTIONID_BINDING);
            protocolMarshaller.marshall(transactionEvent.getSpentVoutTransactionHash(), SPENTVOUTTRANSACTIONHASH_BINDING);
            protocolMarshaller.marshall(transactionEvent.getSpentVoutIndex(), SPENTVOUTINDEX_BINDING);
            protocolMarshaller.marshall(transactionEvent.getBlockchainInstant(), BLOCKCHAININSTANT_BINDING);
            protocolMarshaller.marshall(transactionEvent.getConfirmationStatus(), CONFIRMATIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
