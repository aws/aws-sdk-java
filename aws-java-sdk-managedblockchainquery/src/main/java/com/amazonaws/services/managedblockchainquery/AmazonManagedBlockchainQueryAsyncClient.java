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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Managed Blockchain Query asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Managed Blockchain (AMB) Query provides you with convenient access to multi-blockchain network data, which
 * makes it easier for you to extract contextual data related to blockchain activity. You can use AMB Query to read data
 * from public blockchain networks, such as Bitcoin Mainnet and Ethereum Mainnet. You can also get information such as
 * the current and historical balances of addresses, or you can get a list of blockchain transactions for a given time
 * period. Additionally, you can get details of a given transaction, such as transaction events, which you can further
 * analyze or use in business logic for your applications.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonManagedBlockchainQueryAsyncClient extends AmazonManagedBlockchainQueryClient implements AmazonManagedBlockchainQueryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonManagedBlockchainQueryAsyncClientBuilder asyncBuilder() {
        return AmazonManagedBlockchainQueryAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Managed Blockchain Query using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonManagedBlockchainQueryAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Managed Blockchain Query using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonManagedBlockchainQueryAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<BatchGetTokenBalanceResult> batchGetTokenBalanceAsync(BatchGetTokenBalanceRequest request) {

        return batchGetTokenBalanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetTokenBalanceResult> batchGetTokenBalanceAsync(final BatchGetTokenBalanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetTokenBalanceRequest, BatchGetTokenBalanceResult> asyncHandler) {
        final BatchGetTokenBalanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetTokenBalanceResult>() {
            @Override
            public BatchGetTokenBalanceResult call() throws Exception {
                BatchGetTokenBalanceResult result = null;

                try {
                    result = executeBatchGetTokenBalance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssetContractResult> getAssetContractAsync(GetAssetContractRequest request) {

        return getAssetContractAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssetContractResult> getAssetContractAsync(final GetAssetContractRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssetContractRequest, GetAssetContractResult> asyncHandler) {
        final GetAssetContractRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssetContractResult>() {
            @Override
            public GetAssetContractResult call() throws Exception {
                GetAssetContractResult result = null;

                try {
                    result = executeGetAssetContract(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTokenBalanceResult> getTokenBalanceAsync(GetTokenBalanceRequest request) {

        return getTokenBalanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTokenBalanceResult> getTokenBalanceAsync(final GetTokenBalanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTokenBalanceRequest, GetTokenBalanceResult> asyncHandler) {
        final GetTokenBalanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTokenBalanceResult>() {
            @Override
            public GetTokenBalanceResult call() throws Exception {
                GetTokenBalanceResult result = null;

                try {
                    result = executeGetTokenBalance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTransactionResult> getTransactionAsync(GetTransactionRequest request) {

        return getTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransactionResult> getTransactionAsync(final GetTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransactionRequest, GetTransactionResult> asyncHandler) {
        final GetTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransactionResult>() {
            @Override
            public GetTransactionResult call() throws Exception {
                GetTransactionResult result = null;

                try {
                    result = executeGetTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssetContractsResult> listAssetContractsAsync(ListAssetContractsRequest request) {

        return listAssetContractsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetContractsResult> listAssetContractsAsync(final ListAssetContractsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssetContractsRequest, ListAssetContractsResult> asyncHandler) {
        final ListAssetContractsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssetContractsResult>() {
            @Override
            public ListAssetContractsResult call() throws Exception {
                ListAssetContractsResult result = null;

                try {
                    result = executeListAssetContracts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFilteredTransactionEventsResult> listFilteredTransactionEventsAsync(ListFilteredTransactionEventsRequest request) {

        return listFilteredTransactionEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFilteredTransactionEventsResult> listFilteredTransactionEventsAsync(
            final ListFilteredTransactionEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFilteredTransactionEventsRequest, ListFilteredTransactionEventsResult> asyncHandler) {
        final ListFilteredTransactionEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFilteredTransactionEventsResult>() {
            @Override
            public ListFilteredTransactionEventsResult call() throws Exception {
                ListFilteredTransactionEventsResult result = null;

                try {
                    result = executeListFilteredTransactionEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTokenBalancesResult> listTokenBalancesAsync(ListTokenBalancesRequest request) {

        return listTokenBalancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTokenBalancesResult> listTokenBalancesAsync(final ListTokenBalancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTokenBalancesRequest, ListTokenBalancesResult> asyncHandler) {
        final ListTokenBalancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTokenBalancesResult>() {
            @Override
            public ListTokenBalancesResult call() throws Exception {
                ListTokenBalancesResult result = null;

                try {
                    result = executeListTokenBalances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTransactionEventsResult> listTransactionEventsAsync(ListTransactionEventsRequest request) {

        return listTransactionEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransactionEventsResult> listTransactionEventsAsync(final ListTransactionEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTransactionEventsRequest, ListTransactionEventsResult> asyncHandler) {
        final ListTransactionEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTransactionEventsResult>() {
            @Override
            public ListTransactionEventsResult call() throws Exception {
                ListTransactionEventsResult result = null;

                try {
                    result = executeListTransactionEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest request) {

        return listTransactionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(final ListTransactionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTransactionsRequest, ListTransactionsResult> asyncHandler) {
        final ListTransactionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTransactionsResult>() {
            @Override
            public ListTransactionsResult call() throws Exception {
                ListTransactionsResult result = null;

                try {
                    result = executeListTransactions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
