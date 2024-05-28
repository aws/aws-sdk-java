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

/**
 * Abstract implementation of {@code AmazonManagedBlockchainQueryAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonManagedBlockchainQueryAsync extends AbstractAmazonManagedBlockchainQuery implements AmazonManagedBlockchainQueryAsync {

    protected AbstractAmazonManagedBlockchainQueryAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetTokenBalanceResult> batchGetTokenBalanceAsync(BatchGetTokenBalanceRequest request) {

        return batchGetTokenBalanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetTokenBalanceResult> batchGetTokenBalanceAsync(BatchGetTokenBalanceRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetTokenBalanceRequest, BatchGetTokenBalanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssetContractResult> getAssetContractAsync(GetAssetContractRequest request) {

        return getAssetContractAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetContractResult> getAssetContractAsync(GetAssetContractRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssetContractRequest, GetAssetContractResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTokenBalanceResult> getTokenBalanceAsync(GetTokenBalanceRequest request) {

        return getTokenBalanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTokenBalanceResult> getTokenBalanceAsync(GetTokenBalanceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTokenBalanceRequest, GetTokenBalanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTransactionResult> getTransactionAsync(GetTransactionRequest request) {

        return getTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransactionResult> getTransactionAsync(GetTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTransactionRequest, GetTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssetContractsResult> listAssetContractsAsync(ListAssetContractsRequest request) {

        return listAssetContractsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetContractsResult> listAssetContractsAsync(ListAssetContractsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssetContractsRequest, ListAssetContractsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFilteredTransactionEventsResult> listFilteredTransactionEventsAsync(ListFilteredTransactionEventsRequest request) {

        return listFilteredTransactionEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFilteredTransactionEventsResult> listFilteredTransactionEventsAsync(ListFilteredTransactionEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFilteredTransactionEventsRequest, ListFilteredTransactionEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTokenBalancesResult> listTokenBalancesAsync(ListTokenBalancesRequest request) {

        return listTokenBalancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTokenBalancesResult> listTokenBalancesAsync(ListTokenBalancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTokenBalancesRequest, ListTokenBalancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTransactionEventsResult> listTransactionEventsAsync(ListTransactionEventsRequest request) {

        return listTransactionEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransactionEventsResult> listTransactionEventsAsync(ListTransactionEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTransactionEventsRequest, ListTransactionEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest request) {

        return listTransactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTransactionsRequest, ListTransactionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
