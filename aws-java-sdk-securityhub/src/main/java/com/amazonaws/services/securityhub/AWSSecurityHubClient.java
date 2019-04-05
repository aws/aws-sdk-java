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
package com.amazonaws.services.securityhub;

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

import com.amazonaws.services.securityhub.AWSSecurityHubClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.services.securityhub.model.transform.*;

/**
 * Client for accessing AWS SecurityHub. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Security Hub provides you with a comprehensive view of your security state within AWS and your compliance with
 * the security industry standards and best practices. Security Hub collects security data from across AWS accounts,
 * services, and supported third-party partners and helps you analyze your security trends and identify the highest
 * priority security issues. For more information, see <a
 * href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">AWS Security Hub User
 * Guide</a>.
 * </p>
 * <important>
 * <p>
 * Currently, AWS Security Hub is in Preview release.
 * </p>
 * </important>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecurityHubClient extends AmazonWebServiceClient implements AWSSecurityHub {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSecurityHub.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "securityhub";

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
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.securityhub.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.securityhub.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAccessException").withModeledClass(
                                    com.amazonaws.services.securityhub.model.InvalidAccessException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.securityhub.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.securityhub.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withModeledClass(
                                    com.amazonaws.services.securityhub.model.ResourceConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withModeledClass(
                                    com.amazonaws.services.securityhub.model.InternalException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.securityhub.model.AWSSecurityHubException.class));

    public static AWSSecurityHubClientBuilder builder() {
        return AWSSecurityHubClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS SecurityHub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecurityHubClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS SecurityHub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecurityHubClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("securityhub.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/securityhub/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/securityhub/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts the invitation to be monitored by a master SecurityHub account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported
     * standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your
     * compliance status against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return Result of the BatchDisableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisableStandardsResult batchDisableStandards(BatchDisableStandardsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisableStandards(request);
    }

    @SdkInternalApi
    final BatchDisableStandardsResult executeBatchDisableStandards(BatchDisableStandardsRequest batchDisableStandardsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisableStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisableStandardsRequest> request = null;
        Response<BatchDisableStandardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisableStandardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDisableStandardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisableStandards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisableStandardsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDisableStandardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for
     * example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status
     * against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return Result of the BatchEnableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchEnableStandardsResult batchEnableStandards(BatchEnableStandardsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchEnableStandards(request);
    }

    @SdkInternalApi
    final BatchEnableStandardsResult executeBatchEnableStandards(BatchEnableStandardsRequest batchEnableStandardsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchEnableStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchEnableStandardsRequest> request = null;
        Response<BatchEnableStandardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchEnableStandardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchEnableStandardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchEnableStandards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchEnableStandardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchEnableStandardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports security findings that are generated by the integrated third-party products into Security Hub.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @return Result of the BatchImportFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchImportFindingsResult batchImportFindings(BatchImportFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchImportFindings(request);
    }

    @SdkInternalApi
    final BatchImportFindingsResult executeBatchImportFindings(BatchImportFindingsRequest batchImportFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchImportFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchImportFindingsRequest> request = null;
        Response<BatchImportFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchImportFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchImportFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchImportFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchImportFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchImportFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention
     * or intervention.
     * </p>
     * 
     * @param createInsightRequest
     * @return Result of the CreateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInsightResult createInsight(CreateInsightRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInsight(request);
    }

    @SdkInternalApi
    final CreateInsightResult executeCreateInsight(CreateInsightRequest createInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(createInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInsightRequest> request = null;
        Response<CreateInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account)
     * that has Security Hub enabled.
     * </p>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are
     * specified by the account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeDeclineInvitations(request);
    }

    @SdkInternalApi
    final DeclineInvitationsResult executeDeclineInvitations(DeclineInvitationsRequest declineInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(declineInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeclineInvitationsRequest> request = null;
        Response<DeclineInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeclineInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(declineInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeclineInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeclineInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeclineInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an insight that is specified by the insight ARN.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return Result of the DeleteInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInsightResult deleteInsight(DeleteInsightRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInsight(request);
    }

    @SdkInternalApi
    final DeleteInsightResult executeDeleteInsight(DeleteInsightRequest deleteInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInsightRequest> request = null;
        Response<DeleteInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified
     * by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInvitations(request);
    }

    @SdkInternalApi
    final DeleteInvitationsResult executeDeleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInvitationsRequest> request = null;
        Response<DeleteInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Cancels the subscription that allows a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return Result of the DisableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableImportFindingsForProductResult disableImportFindingsForProduct(DisableImportFindingsForProductRequest request) {
        request = beforeClientExecution(request);
        return executeDisableImportFindingsForProduct(request);
    }

    @SdkInternalApi
    final DisableImportFindingsForProductResult executeDisableImportFindingsForProduct(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest) {

        ExecutionContext executionContext = createExecutionContext(disableImportFindingsForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableImportFindingsForProductRequest> request = null;
        Response<DisableImportFindingsForProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableImportFindingsForProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableImportFindingsForProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableImportFindingsForProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableImportFindingsForProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableImportFindingsForProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the AWS Security Hub Service.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return Result of the DisableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableSecurityHubResult disableSecurityHub(DisableSecurityHubRequest request) {
        request = beforeClientExecution(request);
        return executeDisableSecurityHub(request);
    }

    @SdkInternalApi
    final DisableSecurityHubResult executeDisableSecurityHub(DisableSecurityHubRequest disableSecurityHubRequest) {

        ExecutionContext executionContext = createExecutionContext(disableSecurityHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSecurityHubRequest> request = null;
        Response<DisableSecurityHubResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSecurityHubRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableSecurityHubRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableSecurityHub");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableSecurityHubResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableSecurityHubResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the current Security Hub member account from its master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFromMasterAccount(request);
    }

    @SdkInternalApi
    final DisassociateFromMasterAccountResult executeDisassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFromMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFromMasterAccountRequest> request = null;
        Response<DisassociateFromMasterAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFromMasterAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateFromMasterAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateFromMasterAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFromMasterAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateFromMasterAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMembersResult disassociateMembers(DisassociateMembersRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMembers(request);
    }

    @SdkInternalApi
    final DisassociateMembersResult executeDisassociateMembers(DisassociateMembersRequest disassociateMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMembersRequest> request = null;
        Response<DisassociateMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets up the subscription that enables a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return Result of the EnableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableImportFindingsForProductResult enableImportFindingsForProduct(EnableImportFindingsForProductRequest request) {
        request = beforeClientExecution(request);
        return executeEnableImportFindingsForProduct(request);
    }

    @SdkInternalApi
    final EnableImportFindingsForProductResult executeEnableImportFindingsForProduct(EnableImportFindingsForProductRequest enableImportFindingsForProductRequest) {

        ExecutionContext executionContext = createExecutionContext(enableImportFindingsForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableImportFindingsForProductRequest> request = null;
        Response<EnableImportFindingsForProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableImportFindingsForProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableImportFindingsForProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableImportFindingsForProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableImportFindingsForProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableImportFindingsForProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the AWS Security Hub service.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return Result of the EnableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws AccessDeniedException
     *         You do not have permission to to perform the action specified in the request.
     * @sample AWSSecurityHub.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EnableSecurityHubResult enableSecurityHub(EnableSecurityHubRequest request) {
        request = beforeClientExecution(request);
        return executeEnableSecurityHub(request);
    }

    @SdkInternalApi
    final EnableSecurityHubResult executeEnableSecurityHub(EnableSecurityHubRequest enableSecurityHubRequest) {

        ExecutionContext executionContext = createExecutionContext(enableSecurityHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSecurityHubRequest> request = null;
        Response<EnableSecurityHubResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSecurityHubRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableSecurityHubRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableSecurityHub");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableSecurityHubResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableSecurityHubResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists and describes enabled standards.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return Result of the GetEnabledStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnabledStandardsResult getEnabledStandards(GetEnabledStandardsRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnabledStandards(request);
    }

    @SdkInternalApi
    final GetEnabledStandardsResult executeGetEnabledStandards(GetEnabledStandardsRequest getEnabledStandardsRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnabledStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnabledStandardsRequest> request = null;
        Response<GetEnabledStandardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnabledStandardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnabledStandardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnabledStandards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnabledStandardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnabledStandardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFindingsResult getFindings(GetFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindings(request);
    }

    @SdkInternalApi
    final GetFindingsResult executeGetFindings(GetFindingsRequest getFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsRequest> request = null;
        Response<GetFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return Result of the GetInsightResults operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInsightResultsResult getInsightResults(GetInsightResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInsightResults(request);
    }

    @SdkInternalApi
    final GetInsightResultsResult executeGetInsightResults(GetInsightResultsRequest getInsightResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInsightResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightResultsRequest> request = null;
        Response<GetInsightResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInsightResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInsightResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInsightResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInsightResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists and describes insights that are specified by insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return Result of the GetInsights operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInsightsResult getInsights(GetInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInsights(request);
    }

    @SdkInternalApi
    final GetInsightsResult executeGetInsights(GetInsightsRequest getInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightsRequest> request = null;
        Response<GetInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest request) {
        request = beforeClientExecution(request);
        return executeGetInvitationsCount(request);
    }

    @SdkInternalApi
    final GetInvitationsCountResult executeGetInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest) {

        ExecutionContext executionContext = createExecutionContext(getInvitationsCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvitationsCountRequest> request = null;
        Response<GetInvitationsCountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInvitationsCountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInvitationsCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInvitationsCount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInvitationsCountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInvitationsCountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the details for the Security Hub master account to the current member account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMasterAccountResult getMasterAccount(GetMasterAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetMasterAccount(request);
    }

    @SdkInternalApi
    final GetMasterAccountResult executeGetMasterAccount(GetMasterAccountRequest getMasterAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMasterAccountRequest> request = null;
        Response<GetMasterAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMasterAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMasterAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMasterAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMasterAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMasterAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details on the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account
     * accepts the invitation and becomes a member account, the master account can view Security Hub findings of the
     * member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return Result of the InviteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InviteMembersResult inviteMembers(InviteMembersRequest request) {
        request = beforeClientExecution(request);
        return executeInviteMembers(request);
    }

    @SdkInternalApi
    final InviteMembersResult executeInviteMembers(InviteMembersRequest inviteMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(inviteMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InviteMembersRequest> request = null;
        Response<InviteMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InviteMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(inviteMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InviteMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InviteMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InviteMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all findings-generating solutions (products) whose findings you've subscribed to receive in Security Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return Result of the ListEnabledProductsForImport operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnabledProductsForImportResult listEnabledProductsForImport(ListEnabledProductsForImportRequest request) {
        request = beforeClientExecution(request);
        return executeListEnabledProductsForImport(request);
    }

    @SdkInternalApi
    final ListEnabledProductsForImportResult executeListEnabledProductsForImport(ListEnabledProductsForImportRequest listEnabledProductsForImportRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnabledProductsForImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnabledProductsForImportRequest> request = null;
        Response<ListEnabledProductsForImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnabledProductsForImportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnabledProductsForImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnabledProductsForImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnabledProductsForImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnabledProductsForImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Lists details about all member accounts for the current Security Hub master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return Result of the UpdateFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFindingsResult updateFindings(UpdateFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFindings(request);
    }

    @SdkInternalApi
    final UpdateFindingsResult executeUpdateFindings(UpdateFindingsRequest updateFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFindingsRequest> request = null;
        Response<UpdateFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the AWS Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return Result of the UpdateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateInsightResult updateInsight(UpdateInsightRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInsight(request);
    }

    @SdkInternalApi
    final UpdateInsightResult executeUpdateInsight(UpdateInsightRequest updateInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInsightRequest> request = null;
        Response<UpdateInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInsightResultJsonUnmarshaller());
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
