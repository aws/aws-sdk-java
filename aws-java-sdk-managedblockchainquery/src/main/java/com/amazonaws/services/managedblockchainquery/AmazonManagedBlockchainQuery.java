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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.managedblockchainquery.model.*;

/**
 * Interface for accessing Amazon Managed Blockchain Query.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.managedblockchainquery.AbstractAmazonManagedBlockchainQuery} instead.
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
public interface AmazonManagedBlockchainQuery {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "managedblockchain-query";

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
     * @return Result of the BatchGetTokenBalance operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.BatchGetTokenBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/BatchGetTokenBalance"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetTokenBalanceResult batchGetTokenBalance(BatchGetTokenBalanceRequest batchGetTokenBalanceRequest);

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
     * @return Result of the GetAssetContract operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.GetAssetContract
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetAssetContract"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssetContractResult getAssetContract(GetAssetContractRequest getAssetContractRequest);

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
     * @return Result of the GetTokenBalance operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.GetTokenBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetTokenBalance"
     *      target="_top">AWS API Documentation</a>
     */
    GetTokenBalanceResult getTokenBalance(GetTokenBalanceRequest getTokenBalanceRequest);

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
     * @return Result of the GetTransaction operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.GetTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransactionResult getTransaction(GetTransactionRequest getTransactionRequest);

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
     * @return Result of the ListAssetContracts operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.ListAssetContracts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListAssetContracts"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssetContractsResult listAssetContracts(ListAssetContractsRequest listAssetContractsRequest);

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
     * @return Result of the ListFilteredTransactionEvents operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.ListFilteredTransactionEvents
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListFilteredTransactionEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListFilteredTransactionEventsResult listFilteredTransactionEvents(ListFilteredTransactionEventsRequest listFilteredTransactionEventsRequest);

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
     * @return Result of the ListTokenBalances operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.ListTokenBalances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTokenBalances"
     *      target="_top">AWS API Documentation</a>
     */
    ListTokenBalancesResult listTokenBalances(ListTokenBalancesRequest listTokenBalancesRequest);

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
     * @return Result of the ListTransactionEvents operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.ListTransactionEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactionEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListTransactionEventsResult listTransactionEvents(ListTransactionEventsRequest listTransactionEventsRequest);

    /**
     * <p>
     * Lists all the transaction events for a transaction.
     * </p>
     * 
     * @param listTransactionsRequest
     * @return Result of the ListTransactions operation returned by the service.
     * @throws ThrottlingException
     *         The request or operation couldn't be performed because a service is throttling requests. The most common
     *         source of throttling errors is when you create resources that exceed your service limit for this resource
     *         type. Request a limit increase or delete unused resources, if possible.
     * @throws ValidationException
     *         The resource passed is invalid.
     * @throws AccessDeniedException
     *         The Amazon Web Services account doesn’t have access to this resource.
     * @throws InternalServerException
     *         The request processing has failed because of an internal error in the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded for this resource.
     * @sample AmazonManagedBlockchainQuery.ListTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactions"
     *      target="_top">AWS API Documentation</a>
     */
    ListTransactionsResult listTransactions(ListTransactionsRequest listTransactionsRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
