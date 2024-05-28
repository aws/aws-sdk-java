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
 * Interface for accessing Amazon Managed Blockchain Query asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.managedblockchainquery.AbstractAmazonManagedBlockchainQueryAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonManagedBlockchainQueryAsync extends AmazonManagedBlockchainQuery {

    /**
     * <p>
     * Gets the token balance for a batch of tokens by using the <code>BatchGetTokenBalance</code> action for every
     * token in the request.
     * </p>
     * <note>
     * <p>
     * Only the native tokens BTC and ETH, and the ERC-20, ERC-721, and ERC 1155 token standards are supported.
     * </p>
     * </note>
     * 
     * @param batchGetTokenBalanceRequest
     * @return A Java Future containing the result of the BatchGetTokenBalance operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.BatchGetTokenBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/BatchGetTokenBalance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetTokenBalanceResult> batchGetTokenBalanceAsync(BatchGetTokenBalanceRequest batchGetTokenBalanceRequest);

    /**
     * <p>
     * Gets the token balance for a batch of tokens by using the <code>BatchGetTokenBalance</code> action for every
     * token in the request.
     * </p>
     * <note>
     * <p>
     * Only the native tokens BTC and ETH, and the ERC-20, ERC-721, and ERC 1155 token standards are supported.
     * </p>
     * </note>
     * 
     * @param batchGetTokenBalanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetTokenBalance operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.BatchGetTokenBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/BatchGetTokenBalance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetTokenBalanceResult> batchGetTokenBalanceAsync(BatchGetTokenBalanceRequest batchGetTokenBalanceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetTokenBalanceRequest, BatchGetTokenBalanceResult> asyncHandler);

    /**
     * <p>
     * Gets the information about a specific contract deployed on the blockchain.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The Bitcoin blockchain networks do not support this operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Metadata is currently only available for some <code>ERC-20</code> contracts. Metadata will be available for
     * additional contracts in the future.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getAssetContractRequest
     * @return A Java Future containing the result of the GetAssetContract operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.GetAssetContract
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetAssetContract"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetContractResult> getAssetContractAsync(GetAssetContractRequest getAssetContractRequest);

    /**
     * <p>
     * Gets the information about a specific contract deployed on the blockchain.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The Bitcoin blockchain networks do not support this operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Metadata is currently only available for some <code>ERC-20</code> contracts. Metadata will be available for
     * additional contracts in the future.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getAssetContractRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssetContract operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.GetAssetContract
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetAssetContract"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetContractResult> getAssetContractAsync(GetAssetContractRequest getAssetContractRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssetContractRequest, GetAssetContractResult> asyncHandler);

    /**
     * <p>
     * Gets the balance of a specific token, including native tokens, for a given address (wallet or contract) on the
     * blockchain.
     * </p>
     * <note>
     * <p>
     * Only the native tokens BTC and ETH, and the ERC-20, ERC-721, and ERC 1155 token standards are supported.
     * </p>
     * </note>
     * 
     * @param getTokenBalanceRequest
     * @return A Java Future containing the result of the GetTokenBalance operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.GetTokenBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetTokenBalance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTokenBalanceResult> getTokenBalanceAsync(GetTokenBalanceRequest getTokenBalanceRequest);

    /**
     * <p>
     * Gets the balance of a specific token, including native tokens, for a given address (wallet or contract) on the
     * blockchain.
     * </p>
     * <note>
     * <p>
     * Only the native tokens BTC and ETH, and the ERC-20, ERC-721, and ERC 1155 token standards are supported.
     * </p>
     * </note>
     * 
     * @param getTokenBalanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTokenBalance operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.GetTokenBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetTokenBalance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTokenBalanceResult> getTokenBalanceAsync(GetTokenBalanceRequest getTokenBalanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetTokenBalanceRequest, GetTokenBalanceResult> asyncHandler);

    /**
     * <p>
     * Gets the details of a transaction.
     * </p>
     * <note>
     * <p>
     * This action will return transaction details for all transactions that are <i>confirmed</i> on the blockchain,
     * even if they have not reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">finality</a>.
     * </p>
     * </note>
     * 
     * @param getTransactionRequest
     * @return A Java Future containing the result of the GetTransaction operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.GetTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransactionResult> getTransactionAsync(GetTransactionRequest getTransactionRequest);

    /**
     * <p>
     * Gets the details of a transaction.
     * </p>
     * <note>
     * <p>
     * This action will return transaction details for all transactions that are <i>confirmed</i> on the blockchain,
     * even if they have not reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">finality</a>.
     * </p>
     * </note>
     * 
     * @param getTransactionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTransaction operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.GetTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransactionResult> getTransactionAsync(GetTransactionRequest getTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<GetTransactionRequest, GetTransactionResult> asyncHandler);

    /**
     * <p>
     * Lists all the contracts for a given contract type deployed by an address (either a contract address or a wallet
     * address).
     * </p>
     * <p>
     * The Bitcoin blockchain networks do not support this operation.
     * </p>
     * 
     * @param listAssetContractsRequest
     * @return A Java Future containing the result of the ListAssetContracts operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.ListAssetContracts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListAssetContracts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetContractsResult> listAssetContractsAsync(ListAssetContractsRequest listAssetContractsRequest);

    /**
     * <p>
     * Lists all the contracts for a given contract type deployed by an address (either a contract address or a wallet
     * address).
     * </p>
     * <p>
     * The Bitcoin blockchain networks do not support this operation.
     * </p>
     * 
     * @param listAssetContractsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssetContracts operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.ListAssetContracts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListAssetContracts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetContractsResult> listAssetContractsAsync(ListAssetContractsRequest listAssetContractsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetContractsRequest, ListAssetContractsResult> asyncHandler);

    /**
     * <p>
     * Lists all the transaction events for an address on the blockchain.
     * </p>
     * <note>
     * <p>
     * This operation is only supported on the Bitcoin networks.
     * </p>
     * </note>
     * 
     * @param listFilteredTransactionEventsRequest
     * @return A Java Future containing the result of the ListFilteredTransactionEvents operation returned by the
     *         service.
     * @sample AmazonManagedBlockchainQueryAsync.ListFilteredTransactionEvents
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListFilteredTransactionEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFilteredTransactionEventsResult> listFilteredTransactionEventsAsync(
            ListFilteredTransactionEventsRequest listFilteredTransactionEventsRequest);

    /**
     * <p>
     * Lists all the transaction events for an address on the blockchain.
     * </p>
     * <note>
     * <p>
     * This operation is only supported on the Bitcoin networks.
     * </p>
     * </note>
     * 
     * @param listFilteredTransactionEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFilteredTransactionEvents operation returned by the
     *         service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.ListFilteredTransactionEvents
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListFilteredTransactionEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFilteredTransactionEventsResult> listFilteredTransactionEventsAsync(
            ListFilteredTransactionEventsRequest listFilteredTransactionEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFilteredTransactionEventsRequest, ListFilteredTransactionEventsResult> asyncHandler);

    /**
     * <p>
     * This action returns the following for a given blockchain network:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Lists all token balances owned by an address (either a contract address or a wallet address).
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists all token balances for all tokens created by a contract.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists all token balances for a given token.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You must always specify the network property of the <code>tokenFilter</code> when using this operation.
     * </p>
     * </note>
     * 
     * @param listTokenBalancesRequest
     * @return A Java Future containing the result of the ListTokenBalances operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.ListTokenBalances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTokenBalances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTokenBalancesResult> listTokenBalancesAsync(ListTokenBalancesRequest listTokenBalancesRequest);

    /**
     * <p>
     * This action returns the following for a given blockchain network:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Lists all token balances owned by an address (either a contract address or a wallet address).
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists all token balances for all tokens created by a contract.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists all token balances for a given token.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You must always specify the network property of the <code>tokenFilter</code> when using this operation.
     * </p>
     * </note>
     * 
     * @param listTokenBalancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTokenBalances operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.ListTokenBalances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTokenBalances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTokenBalancesResult> listTokenBalancesAsync(ListTokenBalancesRequest listTokenBalancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTokenBalancesRequest, ListTokenBalancesResult> asyncHandler);

    /**
     * <p>
     * Lists all the transaction events for a transaction
     * </p>
     * <note>
     * <p>
     * This action will return transaction details for all transactions that are <i>confirmed</i> on the blockchain,
     * even if they have not reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">finality</a>.
     * </p>
     * </note>
     * 
     * @param listTransactionEventsRequest
     * @return A Java Future containing the result of the ListTransactionEvents operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.ListTransactionEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactionEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTransactionEventsResult> listTransactionEventsAsync(ListTransactionEventsRequest listTransactionEventsRequest);

    /**
     * <p>
     * Lists all the transaction events for a transaction
     * </p>
     * <note>
     * <p>
     * This action will return transaction details for all transactions that are <i>confirmed</i> on the blockchain,
     * even if they have not reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">finality</a>.
     * </p>
     * </note>
     * 
     * @param listTransactionEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTransactionEvents operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.ListTransactionEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactionEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTransactionEventsResult> listTransactionEventsAsync(ListTransactionEventsRequest listTransactionEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTransactionEventsRequest, ListTransactionEventsResult> asyncHandler);

    /**
     * <p>
     * Lists all the transaction events for a transaction.
     * </p>
     * 
     * @param listTransactionsRequest
     * @return A Java Future containing the result of the ListTransactions operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsync.ListTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest listTransactionsRequest);

    /**
     * <p>
     * Lists all the transaction events for a transaction.
     * </p>
     * 
     * @param listTransactionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTransactions operation returned by the service.
     * @sample AmazonManagedBlockchainQueryAsyncHandler.ListTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest listTransactionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTransactionsRequest, ListTransactionsResult> asyncHandler);

}
