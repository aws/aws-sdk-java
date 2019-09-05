/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain;

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

import com.amazonaws.services.managedblockchain.AmazonManagedBlockchainClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.managedblockchain.model.*;
import com.amazonaws.services.managedblockchain.model.transform.*;

/**
 * Client for accessing ManagedBlockchain. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p/>
 * <p>
 * Amazon Managed Blockchain is a fully managed service for creating and managing blockchain networks using open source
 * frameworks. Blockchain allows you to build applications where multiple parties can securely and transparently run
 * transactions and share data without the need for a trusted, central authority. Currently, Managed Blockchain supports
 * the Hyperledger Fabric open source framework.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonManagedBlockchainClient extends AmazonWebServiceClient implements AmazonManagedBlockchain {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonManagedBlockchain.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "managedblockchain";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotReadyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.ResourceNotReadyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IllegalActionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.IllegalActionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedblockchain.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.managedblockchain.model.AmazonManagedBlockchainException.class));

    public static AmazonManagedBlockchainClientBuilder builder() {
        return AmazonManagedBlockchainClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ManagedBlockchain using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonManagedBlockchainClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ManagedBlockchain using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonManagedBlockchainClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("managedblockchain.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/managedblockchain/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/managedblockchain/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a member within a Managed Blockchain network.
     * </p>
     * 
     * @param createMemberRequest
     * @return Result of the CreateMember operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ResourceAlreadyExistsException
     *         A resource request is issued for a resource that already exists.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateMember" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateMemberResult createMember(CreateMemberRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMember(request);
    }

    @SdkInternalApi
    final CreateMemberResult executeCreateMember(CreateMemberRequest createMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(createMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMemberRequest> request = null;
        Response<CreateMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new blockchain network using Amazon Managed Blockchain.
     * </p>
     * 
     * @param createNetworkRequest
     * @return Result of the CreateNetwork operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceAlreadyExistsException
     *         A resource request is issued for a resource that already exists.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNetworkResult createNetwork(CreateNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNetwork(request);
    }

    @SdkInternalApi
    final CreateNetworkResult executeCreateNetwork(CreateNetworkRequest createNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkRequest> request = null;
        Response<CreateNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a peer node in a member.
     * </p>
     * 
     * @param createNodeRequest
     * @return Result of the CreateNode operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ResourceAlreadyExistsException
     *         A resource request is issued for a resource that already exists.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.CreateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNode" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateNodeResult createNode(CreateNodeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNode(request);
    }

    @SdkInternalApi
    final CreateNodeResult executeCreateNode(CreateNodeRequest createNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(createNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNodeRequest> request = null;
        Response<CreateNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNodeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a proposal for a change to the network that other members of the network can vote on, for example, a
     * proposal to add a new member to the network. Any member can create a proposal.
     * </p>
     * 
     * @param createProposalRequest
     * @return Result of the CreateProposal operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.CreateProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateProposal"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProposalResult createProposal(CreateProposalRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProposal(request);
    }

    @SdkInternalApi
    final CreateProposalResult executeCreateProposal(CreateProposalRequest createProposalRequest) {

        ExecutionContext executionContext = createExecutionContext(createProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProposalRequest> request = null;
        Response<CreateProposalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProposalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProposalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProposal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProposalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProposalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a member. Deleting a member removes the member and all associated resources from the network.
     * <code>DeleteMember</code> can only be called for a specified <code>MemberId</code> if the principal performing
     * the action is associated with the AWS account that owns the member. In all other cases, the
     * <code>DeleteMember</code> action is carried out as the result of an approved proposal to remove a member. If
     * <code>MemberId</code> is the last member in a network specified by the last AWS account, the network is deleted
     * also.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return Result of the DeleteMember operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteMember" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteMemberResult deleteMember(DeleteMemberRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMember(request);
    }

    @SdkInternalApi
    final DeleteMemberResult executeDeleteMember(DeleteMemberRequest deleteMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMemberRequest> request = null;
        Response<DeleteMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be
     * recovered.
     * </p>
     * 
     * @param deleteNodeRequest
     * @return Result of the DeleteNode operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ResourceNotReadyException
     *         The requested resource exists but is not in a status that can complete the operation.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.DeleteNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteNode" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteNodeResult deleteNode(DeleteNodeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNode(request);
    }

    @SdkInternalApi
    final DeleteNodeResult executeDeleteNode(DeleteNodeRequest deleteNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNodeRequest> request = null;
        Response<DeleteNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNodeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about a member.
     * </p>
     * 
     * @param getMemberRequest
     * @return Result of the GetMember operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetMember" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMemberResult getMember(GetMemberRequest request) {
        request = beforeClientExecution(request);
        return executeGetMember(request);
    }

    @SdkInternalApi
    final GetMemberResult executeGetMember(GetMemberRequest getMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(getMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMemberRequest> request = null;
        Response<GetMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMemberResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about a network.
     * </p>
     * 
     * @param getNetworkRequest
     * @return Result of the GetNetwork operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetNetworkResult getNetwork(GetNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetwork(request);
    }

    @SdkInternalApi
    final GetNetworkResult executeGetNetwork(GetNetworkRequest getNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkRequest> request = null;
        Response<GetNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about a peer node.
     * </p>
     * 
     * @param getNodeRequest
     * @return Result of the GetNode operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetNode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetNodeResult getNode(GetNodeRequest request) {
        request = beforeClientExecution(request);
        return executeGetNode(request);
    }

    @SdkInternalApi
    final GetNodeResult executeGetNode(GetNodeRequest getNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(getNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNodeRequest> request = null;
        Response<GetNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNodeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about a proposal.
     * </p>
     * 
     * @param getProposalRequest
     * @return Result of the GetProposal operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.GetProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetProposal" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetProposalResult getProposal(GetProposalRequest request) {
        request = beforeClientExecution(request);
        return executeGetProposal(request);
    }

    @SdkInternalApi
    final GetProposalResult executeGetProposal(GetProposalRequest getProposalRequest) {

        ExecutionContext executionContext = createExecutionContext(getProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProposalRequest> request = null;
        Response<GetProposalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProposalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProposalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProposal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProposalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProposalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a listing of all invitations made on the specified network.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws ResourceLimitExceededException
     *         The maximum number of resources of that type already exist. Ensure the resources requested are within the
     *         boundaries of the service edition and your account limits.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInvitationsResult listInvitations(ListInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeListInvitations(request);
    }

    @SdkInternalApi
    final ListInvitationsResult executeListInvitations(ListInvitationsRequest listInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInvitationsRequest> request = null;
        Response<ListInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a listing of the members in a network and properties of their configurations.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListMembers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListMembersResult listMembers(ListMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListMembers(request);
    }

    @SdkInternalApi
    final ListMembersResult executeListMembers(ListMembersRequest listMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMembersRequest> request = null;
        Response<ListMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the networks in which the current AWS account has members.
     * </p>
     * 
     * @param listNetworksRequest
     * @return Result of the ListNetworks operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListNetworksResult listNetworks(ListNetworksRequest request) {
        request = beforeClientExecution(request);
        return executeListNetworks(request);
    }

    @SdkInternalApi
    final ListNetworksResult executeListNetworks(ListNetworksRequest listNetworksRequest) {

        ExecutionContext executionContext = createExecutionContext(listNetworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNetworksRequest> request = null;
        Response<ListNetworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNetworksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNetworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNetworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNetworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNetworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the nodes within a network.
     * </p>
     * 
     * @param listNodesRequest
     * @return Result of the ListNodes operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNodes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListNodesResult listNodes(ListNodesRequest request) {
        request = beforeClientExecution(request);
        return executeListNodes(request);
    }

    @SdkInternalApi
    final ListNodesResult executeListNodes(ListNodesRequest listNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNodesRequest> request = null;
        Response<ListNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNodesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier
     * of the member that cast the vote.
     * </p>
     * 
     * @param listProposalVotesRequest
     * @return Result of the ListProposalVotes operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListProposalVotes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposalVotes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProposalVotesResult listProposalVotes(ListProposalVotesRequest request) {
        request = beforeClientExecution(request);
        return executeListProposalVotes(request);
    }

    @SdkInternalApi
    final ListProposalVotesResult executeListProposalVotes(ListProposalVotesRequest listProposalVotesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProposalVotesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProposalVotesRequest> request = null;
        Response<ListProposalVotesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProposalVotesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProposalVotesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProposalVotes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProposalVotesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProposalVotesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a listing of proposals for the network.
     * </p>
     * 
     * @param listProposalsRequest
     * @return Result of the ListProposals operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.ListProposals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposals"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProposalsResult listProposals(ListProposalsRequest request) {
        request = beforeClientExecution(request);
        return executeListProposals(request);
    }

    @SdkInternalApi
    final ListProposalsResult executeListProposals(ListProposalsRequest listProposalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProposalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProposalsRequest> request = null;
        Response<ListProposalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProposalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProposalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProposals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProposalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProposalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has
     * received an invitation to create a member and join a network.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @return Result of the RejectInvitation operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws IllegalActionException
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/RejectInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectInvitationResult rejectInvitation(RejectInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeRejectInvitation(request);
    }

    @SdkInternalApi
    final RejectInvitationResult executeRejectInvitation(RejectInvitationRequest rejectInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectInvitationRequest> request = null;
        Response<RejectInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Casts a vote for a specified <code>ProposalId</code> on behalf of a member. The member to vote as, specified by
     * <code>VoterMemberId</code>, must be in the same AWS account as the principal that calls the action.
     * </p>
     * 
     * @param voteOnProposalRequest
     * @return Result of the VoteOnProposal operation returned by the service.
     * @throws InvalidRequestException
     *         The action or operation requested is invalid. Verify that the action is typed correctly.
     * @throws IllegalActionException
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         A requested resource does not exist on the network. It may have been deleted or referenced inaccurately.
     * @throws ThrottlingException
     *         The request or operation could not be performed because a service is throttling requests. The most common
     *         source of throttling errors is launching EC2 instances such that your service limit for EC2 instances is
     *         exceeded. Request a limit increase or delete unused resources if possible.
     * @throws InternalServiceErrorException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonManagedBlockchain.VoteOnProposal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/VoteOnProposal"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public VoteOnProposalResult voteOnProposal(VoteOnProposalRequest request) {
        request = beforeClientExecution(request);
        return executeVoteOnProposal(request);
    }

    @SdkInternalApi
    final VoteOnProposalResult executeVoteOnProposal(VoteOnProposalRequest voteOnProposalRequest) {

        ExecutionContext executionContext = createExecutionContext(voteOnProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VoteOnProposalRequest> request = null;
        Response<VoteOnProposalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VoteOnProposalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(voteOnProposalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ManagedBlockchain");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VoteOnProposal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<VoteOnProposalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new VoteOnProposalResultJsonUnmarshaller());
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

}
