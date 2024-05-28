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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.managedblockchainquery.AmazonManagedBlockchainQueryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.managedblockchainquery.model.*;

import com.amazonaws.services.managedblockchainquery.model.transform.*;

/**
 * Client for accessing Amazon Managed Blockchain Query. All service calls made using this client are blocking, and will
 * not return until the service call completes.
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
public class AmazonManagedBlockchainQueryClient extends AmazonWebServiceClient implements AmazonManagedBlockchainQuery {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonManagedBlockchainQuery.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "managedblockchain-query";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchainquery.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchainquery.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchainquery.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchainquery.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchainquery.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchainquery.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.managedblockchainquery.model.AmazonManagedBlockchainQueryException.class));

    public static AmazonManagedBlockchainQueryClientBuilder builder() {
        return AmazonManagedBlockchainQueryClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Managed Blockchain Query using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonManagedBlockchainQueryClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Managed Blockchain Query using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonManagedBlockchainQueryClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("managedblockchain-query.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/managedblockchainquery/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/managedblockchainquery/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public BatchGetTokenBalanceResult batchGetTokenBalance(BatchGetTokenBalanceRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetTokenBalance(request);
    }

    @SdkInternalApi
    final BatchGetTokenBalanceResult executeBatchGetTokenBalance(BatchGetTokenBalanceRequest batchGetTokenBalanceRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetTokenBalanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetTokenBalanceRequest> request = null;
        Response<BatchGetTokenBalanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetTokenBalanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetTokenBalanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetTokenBalance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetTokenBalanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetTokenBalanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetAssetContractResult getAssetContract(GetAssetContractRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssetContract(request);
    }

    @SdkInternalApi
    final GetAssetContractResult executeGetAssetContract(GetAssetContractRequest getAssetContractRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssetContractRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetContractRequest> request = null;
        Response<GetAssetContractResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetContractRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssetContractRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssetContract");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssetContractResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssetContractResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTokenBalanceResult getTokenBalance(GetTokenBalanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetTokenBalance(request);
    }

    @SdkInternalApi
    final GetTokenBalanceResult executeGetTokenBalance(GetTokenBalanceRequest getTokenBalanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getTokenBalanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTokenBalanceRequest> request = null;
        Response<GetTokenBalanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTokenBalanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTokenBalanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTokenBalance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTokenBalanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTokenBalanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTransactionResult getTransaction(GetTransactionRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransaction(request);
    }

    @SdkInternalApi
    final GetTransactionResult executeGetTransaction(GetTransactionRequest getTransactionRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransactionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransactionRequest> request = null;
        Response<GetTransactionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransactionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTransactionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransaction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransactionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTransactionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListAssetContractsResult listAssetContracts(ListAssetContractsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssetContracts(request);
    }

    @SdkInternalApi
    final ListAssetContractsResult executeListAssetContracts(ListAssetContractsRequest listAssetContractsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssetContractsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssetContractsRequest> request = null;
        Response<ListAssetContractsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssetContractsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssetContractsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssetContracts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssetContractsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssetContractsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListFilteredTransactionEventsResult listFilteredTransactionEvents(ListFilteredTransactionEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListFilteredTransactionEvents(request);
    }

    @SdkInternalApi
    final ListFilteredTransactionEventsResult executeListFilteredTransactionEvents(ListFilteredTransactionEventsRequest listFilteredTransactionEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFilteredTransactionEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFilteredTransactionEventsRequest> request = null;
        Response<ListFilteredTransactionEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFilteredTransactionEventsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listFilteredTransactionEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFilteredTransactionEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFilteredTransactionEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListFilteredTransactionEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTokenBalancesResult listTokenBalances(ListTokenBalancesRequest request) {
        request = beforeClientExecution(request);
        return executeListTokenBalances(request);
    }

    @SdkInternalApi
    final ListTokenBalancesResult executeListTokenBalances(ListTokenBalancesRequest listTokenBalancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTokenBalancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTokenBalancesRequest> request = null;
        Response<ListTokenBalancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTokenBalancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTokenBalancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTokenBalances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTokenBalancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTokenBalancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTransactionEventsResult listTransactionEvents(ListTransactionEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListTransactionEvents(request);
    }

    @SdkInternalApi
    final ListTransactionEventsResult executeListTransactionEvents(ListTransactionEventsRequest listTransactionEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTransactionEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTransactionEventsRequest> request = null;
        Response<ListTransactionEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTransactionEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTransactionEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTransactionEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTransactionEventsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListTransactionEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTransactionsResult listTransactions(ListTransactionsRequest request) {
        request = beforeClientExecution(request);
        return executeListTransactions(request);
    }

    @SdkInternalApi
    final ListTransactionsResult executeListTransactions(ListTransactionsRequest listTransactionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTransactionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTransactionsRequest> request = null;
        Response<ListTransactionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTransactionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTransactionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTransactions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTransactionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTransactionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
