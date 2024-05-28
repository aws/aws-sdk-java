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
 * TransactionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransactionMarshaller {

    private static final MarshallingInfo<String> NETWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("network").build();
    private static final MarshallingInfo<String> BLOCKHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("blockHash").build();
    private static final MarshallingInfo<String> TRANSACTIONHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionHash").build();
    private static final MarshallingInfo<String> BLOCKNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockNumber").build();
    private static final MarshallingInfo<java.util.Date> TRANSACTIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> TRANSACTIONINDEX_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionIndex").build();
    private static final MarshallingInfo<Long> NUMBEROFTRANSACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfTransactions").build();
    private static final MarshallingInfo<String> TO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("to").build();
    private static final MarshallingInfo<String> FROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("from").build();
    private static final MarshallingInfo<String> CONTRACTADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contractAddress").build();
    private static final MarshallingInfo<String> GASUSED_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("gasUsed").build();
    private static final MarshallingInfo<String> CUMULATIVEGASUSED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cumulativeGasUsed").build();
    private static final MarshallingInfo<String> EFFECTIVEGASPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("effectiveGasPrice").build();
    private static final MarshallingInfo<Integer> SIGNATUREV_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signatureV").build();
    private static final MarshallingInfo<String> SIGNATURER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signatureR").build();
    private static final MarshallingInfo<String> SIGNATURES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signatureS").build();
    private static final MarshallingInfo<String> TRANSACTIONFEE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionFee").build();
    private static final MarshallingInfo<String> TRANSACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionId").build();
    private static final MarshallingInfo<String> CONFIRMATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationStatus").build();
    private static final MarshallingInfo<String> EXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionStatus").build();

    private static final TransactionMarshaller instance = new TransactionMarshaller();

    public static TransactionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Transaction transaction, ProtocolMarshaller protocolMarshaller) {

        if (transaction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transaction.getNetwork(), NETWORK_BINDING);
            protocolMarshaller.marshall(transaction.getBlockHash(), BLOCKHASH_BINDING);
            protocolMarshaller.marshall(transaction.getTransactionHash(), TRANSACTIONHASH_BINDING);
            protocolMarshaller.marshall(transaction.getBlockNumber(), BLOCKNUMBER_BINDING);
            protocolMarshaller.marshall(transaction.getTransactionTimestamp(), TRANSACTIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(transaction.getTransactionIndex(), TRANSACTIONINDEX_BINDING);
            protocolMarshaller.marshall(transaction.getNumberOfTransactions(), NUMBEROFTRANSACTIONS_BINDING);
            protocolMarshaller.marshall(transaction.getTo(), TO_BINDING);
            protocolMarshaller.marshall(transaction.getFrom(), FROM_BINDING);
            protocolMarshaller.marshall(transaction.getContractAddress(), CONTRACTADDRESS_BINDING);
            protocolMarshaller.marshall(transaction.getGasUsed(), GASUSED_BINDING);
            protocolMarshaller.marshall(transaction.getCumulativeGasUsed(), CUMULATIVEGASUSED_BINDING);
            protocolMarshaller.marshall(transaction.getEffectiveGasPrice(), EFFECTIVEGASPRICE_BINDING);
            protocolMarshaller.marshall(transaction.getSignatureV(), SIGNATUREV_BINDING);
            protocolMarshaller.marshall(transaction.getSignatureR(), SIGNATURER_BINDING);
            protocolMarshaller.marshall(transaction.getSignatureS(), SIGNATURES_BINDING);
            protocolMarshaller.marshall(transaction.getTransactionFee(), TRANSACTIONFEE_BINDING);
            protocolMarshaller.marshall(transaction.getTransactionId(), TRANSACTIONID_BINDING);
            protocolMarshaller.marshall(transaction.getConfirmationStatus(), CONFIRMATIONSTATUS_BINDING);
            protocolMarshaller.marshall(transaction.getExecutionStatus(), EXECUTIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
