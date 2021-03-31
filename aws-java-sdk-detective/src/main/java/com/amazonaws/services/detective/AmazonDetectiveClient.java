/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective;

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

import com.amazonaws.services.detective.AmazonDetectiveClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.detective.model.*;
import com.amazonaws.services.detective.model.transform.*;

/**
 * Client for accessing Amazon Detective. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Detective uses machine learning and purpose-built visualizations to help you analyze and investigate security issues
 * across your Amazon Web Services (AWS) workloads. Detective automatically extracts time-based events such as login
 * attempts, API calls, and network traffic from AWS CloudTrail and Amazon Virtual Private Cloud (Amazon VPC) flow logs.
 * It also extracts findings detected by Amazon GuardDuty.
 * </p>
 * <p>
 * The Detective API primarily supports the creation and management of behavior graphs. A behavior graph contains the
 * extracted data from a set of member accounts, and is created and managed by an administrator account.
 * </p>
 * <p>
 * Every behavior graph is specific to a Region. You can only use the API to manage graphs that belong to the Region
 * that is associated with the currently selected endpoint.
 * </p>
 * <p>
 * A Detective administrator account can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Enable and disable Detective. Enabling Detective creates a new behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * View the list of member accounts in a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Add member accounts to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove member accounts from a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * A member account can use the Detective API to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * View the list of behavior graphs that they are invited to.
 * </p>
 * </li>
 * <li>
 * <p>
 * Accept an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Decline an invitation to contribute to a behavior graph.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove their account from a behavior graph.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All API actions are logged as CloudTrail events. See <a
 * href="https://docs.aws.amazon.com/detective/latest/adminguide/logging-using-cloudtrail.html">Logging Detective API
 * Calls with CloudTrail</a>.
 * </p>
 * <note>
 * <p>
 * We replaced the term "master account" with the term "administrator account." An administrator account is used to
 * centrally manage multiple accounts. In the case of Detective, the administrator account manages the accounts in their
 * behavior graph.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDetectiveClient extends AmazonWebServiceClient implements AmazonDetective {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDetective.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "detective";

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
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.detective.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.detective.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.detective.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.detective.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.detective.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.detective.model.AmazonDetectiveException.class));

    public static AmazonDetectiveClientBuilder builder() {
        return AmazonDetectiveClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Detective using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDetectiveClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Detective using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDetectiveClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("api.detective.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/detective/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/detective/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts an invitation for the member account to contribute data to a behavior graph. This operation can only be
     * called by an invited member account.
     * </p>
     * <p>
     * The request provides the ARN of behavior graph.
     * </p>
     * <p>
     * The member account status in the graph must be <code>INVITED</code>.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AcceptInvitationResult acceptInvitation(AcceptInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptInvitation(request);
    }

    @SdkInternalApi
    final AcceptInvitationResult executeAcceptInvitation(AcceptInvitationRequest acceptInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInvitationRequest> request = null;
        Response<AcceptInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new behavior graph for the calling account, and sets that account as the administrator account. This
     * operation is called by the account that is enabling Detective.
     * </p>
     * <p>
     * Before you try to enable Detective, make sure that your account has been enrolled in Amazon GuardDuty for at
     * least 48 hours. If you do not meet this requirement, you cannot enable Detective. If you do meet the GuardDuty
     * prerequisite, then when you make the request to enable Detective, it checks whether your data volume is within
     * the Detective quota. If it exceeds the quota, then you cannot enable Detective.
     * </p>
     * <p>
     * The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN
     * of the new behavior graph.
     * </p>
     * <p>
     * <code>CreateGraph</code> triggers a process to create the corresponding data tables for the new behavior graph.
     * </p>
     * <p>
     * An account can only be the administrator account for one behavior graph within a Region. If the same account
     * calls <code>CreateGraph</code> with the same administrator account, it always returns the same behavior graph
     * ARN. It does not create a new behavior graph.
     * </p>
     * 
     * @param createGraphRequest
     * @return Result of the CreateGraph operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ServiceQuotaExceededException
     *         This request cannot be completed for one of the following reasons.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The request would cause the number of member accounts in the behavior graph to exceed the maximum
     *         allowed. A behavior graph cannot have more than 1000 member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The request would cause the data rate for the behavior graph to exceed the maximum allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Detective is unable to verify the data rate for the member account. This is usually because the member
     *         account is not enrolled in Amazon GuardDuty.
     *         </p>
     *         </li>
     * @sample AmazonDetective.CreateGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateGraph" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGraphResult createGraph(CreateGraphRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGraph(request);
    }

    @SdkInternalApi
    final CreateGraphResult executeCreateGraph(CreateGraphRequest createGraphRequest) {

        ExecutionContext executionContext = createExecutionContext(createGraphRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGraphRequest> request = null;
        Response<CreateGraphResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGraphRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGraphRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGraph");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGraphResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGraphResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a request to invite the specified AWS accounts to be member accounts in the behavior graph. This operation
     * can only be called by the administrator account for a behavior graph.
     * </p>
     * <p>
     * <code>CreateMembers</code> verifies the accounts and then invites the verified accounts. The administrator can
     * optionally specify to not send invitation emails to the member accounts. This would be used when the
     * administrator manages their member accounts centrally.
     * </p>
     * <p>
     * The request provides the behavior graph ARN and the list of accounts to invite.
     * </p>
     * <p>
     * The response separates the requested accounts into two lists:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was able to start the verification for. This list includes member
     * accounts that are being verified, that have passed verification and are to be invited, and that have failed
     * verification.
     * </p>
     * </li>
     * <li>
     * <p>
     * The accounts that <code>CreateMembers</code> was unable to process. This list includes accounts that were already
     * invited to be member accounts in the behavior graph.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ServiceQuotaExceededException
     *         This request cannot be completed for one of the following reasons.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The request would cause the number of member accounts in the behavior graph to exceed the maximum
     *         allowed. A behavior graph cannot have more than 1000 member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The request would cause the data rate for the behavior graph to exceed the maximum allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Detective is unable to verify the data rate for the member account. This is usually because the member
     *         account is not enrolled in Amazon GuardDuty.
     *         </p>
     *         </li>
     * @sample AmazonDetective.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMembersResult createMembers(CreateMembersRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMembers(request);
    }

    @SdkInternalApi
    final CreateMembersResult executeCreateMembers(CreateMembersRequest createMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(createMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMembersRequest> request = null;
        Response<CreateMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the specified behavior graph and queues it to be deleted. This operation removes the graph from each
     * member account's list of behavior graphs.
     * </p>
     * <p>
     * <code>DeleteGraph</code> can only be called by the administrator account for a behavior graph.
     * </p>
     * 
     * @param deleteGraphRequest
     * @return Result of the DeleteGraph operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DeleteGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteGraph" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGraphResult deleteGraph(DeleteGraphRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGraph(request);
    }

    @SdkInternalApi
    final DeleteGraphResult executeDeleteGraph(DeleteGraphRequest deleteGraphRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGraphRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGraphRequest> request = null;
        Response<DeleteGraphResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGraphRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGraphRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGraph");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGraphResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGraphResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one or more member accounts from the administrator account's behavior graph. This operation can only be
     * called by a Detective administrator account. That account cannot use <code>DeleteMembers</code> to delete their
     * own account from the behavior graph. To disable a behavior graph, the administrator account uses the
     * <code>DeleteGraph</code> API method.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMembersResult deleteMembers(DeleteMembersRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMembers(request);
    }

    @SdkInternalApi
    final DeleteMembersResult executeDeleteMembers(DeleteMembersRequest deleteMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMembersRequest> request = null;
        Response<DeleteMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the member account from the specified behavior graph. This operation can only be called by a member
     * account that has the <code>ENABLED</code> status.
     * </p>
     * 
     * @param disassociateMembershipRequest
     * @return Result of the DisassociateMembership operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.DisassociateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DisassociateMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMembershipResult disassociateMembership(DisassociateMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMembership(request);
    }

    @SdkInternalApi
    final DisassociateMembershipResult executeDisassociateMembership(DisassociateMembershipRequest disassociateMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMembershipRequest> request = null;
        Response<DisassociateMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the membership details for specified member accounts for a behavior graph.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMembersResult getMembers(GetMembersRequest request) {
        request = beforeClientExecution(request);
        return executeGetMembers(request);
    }

    @SdkInternalApi
    final GetMembersResult executeGetMembers(GetMembersRequest getMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(getMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMembersRequest> request = null;
        Response<GetMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMembersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of behavior graphs that the calling account is an administrator account of. This operation can
     * only be called by an administrator account.
     * </p>
     * <p>
     * Because an account can currently only be the administrator of one behavior graph within a Region, the results
     * always contain a single behavior graph.
     * </p>
     * 
     * @param listGraphsRequest
     * @return Result of the ListGraphs operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListGraphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListGraphs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGraphsResult listGraphs(ListGraphsRequest request) {
        request = beforeClientExecution(request);
        return executeListGraphs(request);
    }

    @SdkInternalApi
    final ListGraphsResult executeListGraphs(ListGraphsRequest listGraphsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGraphsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGraphsRequest> request = null;
        Response<ListGraphsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGraphsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGraphsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGraphs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGraphsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGraphsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can
     * only be called by a member account.
     * </p>
     * <p>
     * Open invitations are invitations that the member account has not responded to.
     * </p>
     * <p>
     * The results do not include behavior graphs for which the member account declined the invitation. The results also
     * do not include behavior graphs that the member account resigned from or was removed from.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvitations" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
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
     * Retrieves the list of member accounts for a behavior graph. Does not return member accounts that were removed
     * from the behavior graph.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
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
     * Returns the tag values that are assigned to a behavior graph.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @sample AmazonDetective.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by a
     * member account that has the <code>INVITED</code> status.
     * </p>
     * 
     * @param rejectInvitationRequest
     * @return Result of the RejectInvitation operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.RejectInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/RejectInvitation" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
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
     * Sends a request to enable data ingest for a member account that has a status of
     * <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * <p>
     * For valid member accounts, the status is updated as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Detective enabled the member account, then the new status is <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If Detective cannot enable the member account, the status remains <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMonitoringMemberRequest
     * @return Result of the StartMonitoringMember operation returned by the service.
     * @throws ConflictException
     *         The request attempted an invalid action.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @throws ServiceQuotaExceededException
     *         This request cannot be completed for one of the following reasons.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The request would cause the number of member accounts in the behavior graph to exceed the maximum
     *         allowed. A behavior graph cannot have more than 1000 member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The request would cause the data rate for the behavior graph to exceed the maximum allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Detective is unable to verify the data rate for the member account. This is usually because the member
     *         account is not enrolled in Amazon GuardDuty.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         The request parameters are invalid.
     * @sample AmazonDetective.StartMonitoringMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/StartMonitoringMember"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMonitoringMemberResult startMonitoringMember(StartMonitoringMemberRequest request) {
        request = beforeClientExecution(request);
        return executeStartMonitoringMember(request);
    }

    @SdkInternalApi
    final StartMonitoringMemberResult executeStartMonitoringMember(StartMonitoringMemberRequest startMonitoringMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(startMonitoringMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMonitoringMemberRequest> request = null;
        Response<StartMonitoringMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMonitoringMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMonitoringMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMonitoringMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMonitoringMemberResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartMonitoringMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies tag values to a behavior graph.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @sample AmazonDetective.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from a behavior graph.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request was valid but failed because of a problem with the service.
     * @throws ValidationException
     *         The request parameters are invalid.
     * @throws ResourceNotFoundException
     *         The request refers to a nonexistent resource.
     * @sample AmazonDetective.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Detective");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
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
