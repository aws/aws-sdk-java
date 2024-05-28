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
package com.amazonaws.services.managedblockchainquery;

import javax.annotation.Generated;

import com.amazonaws.services.managedblockchainquery.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonManagedBlockchainQuery}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonManagedBlockchainQuery implements AmazonManagedBlockchainQuery {

    protected AbstractAmazonManagedBlockchainQuery() {
    }

    @Override
    public BatchGetTokenBalanceResult batchGetTokenBalance(BatchGetTokenBalanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAssetContractResult getAssetContract(GetAssetContractRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTokenBalanceResult getTokenBalance(GetTokenBalanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTransactionResult getTransaction(GetTransactionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssetContractsResult listAssetContracts(ListAssetContractsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFilteredTransactionEventsResult listFilteredTransactionEvents(ListFilteredTransactionEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTokenBalancesResult listTokenBalances(ListTokenBalancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTransactionEventsResult listTransactionEvents(ListTransactionEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTransactionsResult listTransactions(ListTransactionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
