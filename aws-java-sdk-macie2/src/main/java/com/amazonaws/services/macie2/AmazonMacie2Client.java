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
package com.amazonaws.services.macie2;

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

import com.amazonaws.services.macie2.AmazonMacie2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.services.macie2.model.transform.*;

/**
 * Client for accessing Amazon Macie 2. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Macie is a fully managed data security and data privacy service that uses machine learning and pattern
 * matching to discover and protect your sensitive data in AWS. Macie automates the discovery of sensitive data, such as
 * PII and intellectual property, to provide you with insight into the data that your organization stores in AWS. Macie
 * also provides an inventory of your Amazon S3 buckets, which it continually monitors for you. If Macie detects
 * sensitive data or potential data access issues, it generates detailed findings for you to review and act upon as
 * necessary.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMacie2Client extends AmazonWebServiceClient implements AmazonMacie2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMacie2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "macie2";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.macie2.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.macie2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.macie2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.macie2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.macie2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.macie2.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.macie2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.macie2.model.AmazonMacie2Exception.class));

    public static AmazonMacie2ClientBuilder builder() {
        return AmazonMacie2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Macie 2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMacie2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Macie 2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMacie2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("macie2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/macie2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/macie2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts an Amazon Macie membership invitation that was received from a specific account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AcceptInvitation" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves information about one or more custom data identifiers.
     * </p>
     * 
     * @param batchGetCustomDataIdentifiersRequest
     * @return Result of the BatchGetCustomDataIdentifiers operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.BatchGetCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BatchGetCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetCustomDataIdentifiersResult batchGetCustomDataIdentifiers(BatchGetCustomDataIdentifiersRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetCustomDataIdentifiers(request);
    }

    @SdkInternalApi
    final BatchGetCustomDataIdentifiersResult executeBatchGetCustomDataIdentifiers(BatchGetCustomDataIdentifiersRequest batchGetCustomDataIdentifiersRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetCustomDataIdentifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCustomDataIdentifiersRequest> request = null;
        Response<BatchGetCustomDataIdentifiersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCustomDataIdentifiersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetCustomDataIdentifiersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetCustomDataIdentifiers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetCustomDataIdentifiersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetCustomDataIdentifiersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and defines the settings for a classification job.
     * </p>
     * 
     * @param createClassificationJobRequest
     * @return Result of the CreateClassificationJob operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateClassificationJobResult createClassificationJob(CreateClassificationJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateClassificationJob(request);
    }

    @SdkInternalApi
    final CreateClassificationJobResult executeCreateClassificationJob(CreateClassificationJobRequest createClassificationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClassificationJobRequest> request = null;
        Response<CreateClassificationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClassificationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createClassificationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateClassificationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClassificationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateClassificationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and defines the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param createCustomDataIdentifierRequest
     * @return Result of the CreateCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomDataIdentifierResult createCustomDataIdentifier(CreateCustomDataIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomDataIdentifier(request);
    }

    @SdkInternalApi
    final CreateCustomDataIdentifierResult executeCreateCustomDataIdentifier(CreateCustomDataIdentifierRequest createCustomDataIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomDataIdentifierRequest> request = null;
        Response<CreateCustomDataIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomDataIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCustomDataIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomDataIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomDataIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCustomDataIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and defines the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param createFindingsFilterRequest
     * @return Result of the CreateFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateFindingsFilterResult createFindingsFilter(CreateFindingsFilterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFindingsFilter(request);
    }

    @SdkInternalApi
    final CreateFindingsFilterResult executeCreateFindingsFilter(CreateFindingsFilterRequest createFindingsFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(createFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFindingsFilterRequest> request = null;
        Response<CreateFindingsFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFindingsFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFindingsFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFindingsFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFindingsFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFindingsFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an Amazon Macie membership invitation to one or more accounts.
     * </p>
     * 
     * @param createInvitationsRequest
     * @return Result of the CreateInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInvitationsResult createInvitations(CreateInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInvitations(request);
    }

    @SdkInternalApi
    final CreateInvitationsResult executeCreateInvitations(CreateInvitationsRequest createInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(createInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInvitationsRequest> request = null;
        Response<CreateInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an account with an Amazon Macie administrator account.
     * </p>
     * 
     * @param createMemberRequest
     * @return Result of the CreateMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateMember" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Creates sample findings.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return Result of the CreateSampleFindings operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSampleFindingsResult createSampleFindings(CreateSampleFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSampleFindings(request);
    }

    @SdkInternalApi
    final CreateSampleFindingsResult executeCreateSampleFindings(CreateSampleFindingsRequest createSampleFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(createSampleFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSampleFindingsRequest> request = null;
        Response<CreateSampleFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSampleFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSampleFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSampleFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSampleFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSampleFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Declines Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeclineInvitations" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Soft deletes a custom data identifier.
     * </p>
     * 
     * @param deleteCustomDataIdentifierRequest
     * @return Result of the DeleteCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomDataIdentifierResult deleteCustomDataIdentifier(DeleteCustomDataIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomDataIdentifier(request);
    }

    @SdkInternalApi
    final DeleteCustomDataIdentifierResult executeDeleteCustomDataIdentifier(DeleteCustomDataIdentifierRequest deleteCustomDataIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomDataIdentifierRequest> request = null;
        Response<DeleteCustomDataIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomDataIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCustomDataIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomDataIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomDataIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCustomDataIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a findings filter.
     * </p>
     * 
     * @param deleteFindingsFilterRequest
     * @return Result of the DeleteFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteFindingsFilterResult deleteFindingsFilter(DeleteFindingsFilterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFindingsFilter(request);
    }

    @SdkInternalApi
    final DeleteFindingsFilterResult executeDeleteFindingsFilter(DeleteFindingsFilterRequest deleteFindingsFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFindingsFilterRequest> request = null;
        Response<DeleteFindingsFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFindingsFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFindingsFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFindingsFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFindingsFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFindingsFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteInvitations" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Deletes the association between an Amazon Macie administrator account and an account.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return Result of the DeleteMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteMember" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves (queries) statistical data and other information about one or more S3 buckets that Amazon Macie
     * monitors and analyzes.
     * </p>
     * 
     * @param describeBucketsRequest
     * @return Result of the DescribeBuckets operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DescribeBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBucketsResult describeBuckets(DescribeBucketsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBuckets(request);
    }

    @SdkInternalApi
    final DescribeBucketsResult executeDescribeBuckets(DescribeBucketsRequest describeBucketsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBucketsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBucketsRequest> request = null;
        Response<DescribeBucketsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBucketsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBucketsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBuckets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBucketsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBucketsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the status and settings for a classification job.
     * </p>
     * 
     * @param describeClassificationJobRequest
     * @return Result of the DescribeClassificationJob operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DescribeClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClassificationJobResult describeClassificationJob(DescribeClassificationJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClassificationJob(request);
    }

    @SdkInternalApi
    final DescribeClassificationJobResult executeDescribeClassificationJob(DescribeClassificationJobRequest describeClassificationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClassificationJobRequest> request = null;
        Response<DescribeClassificationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClassificationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeClassificationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClassificationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClassificationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeClassificationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Amazon Macie configuration settings for an AWS organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final DescribeOrganizationConfigurationResult executeDescribeOrganizationConfiguration(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConfigurationRequest> request = null;
        Response<DescribeOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOrganizationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables an Amazon Macie account and deletes Macie resources for the account.
     * </p>
     * 
     * @param disableMacieRequest
     * @return Result of the DisableMacie operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableMacieResult disableMacie(DisableMacieRequest request) {
        request = beforeClientExecution(request);
        return executeDisableMacie(request);
    }

    @SdkInternalApi
    final DisableMacieResult executeDisableMacie(DisableMacieRequest disableMacieRequest) {

        ExecutionContext executionContext = createExecutionContext(disableMacieRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableMacieRequest> request = null;
        Response<DisableMacieResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableMacieRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableMacieRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableMacie");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableMacieResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableMacieResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables an account as the delegated Amazon Macie administrator account for an AWS organization.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return Result of the DisableOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisableOrganizationAdminAccount(request);
    }

    @SdkInternalApi
    final DisableOrganizationAdminAccountResult executeDisableOrganizationAdminAccount(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disableOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableOrganizationAdminAccountRequest> request = null;
        Response<DisableOrganizationAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableOrganizationAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableOrganizationAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableOrganizationAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableOrganizationAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableOrganizationAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a member account from its Amazon Macie administrator account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @return Result of the DisassociateFromAdministratorAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateFromAdministratorAccountResult disassociateFromAdministratorAccount(DisassociateFromAdministratorAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFromAdministratorAccount(request);
    }

    @SdkInternalApi
    final DisassociateFromAdministratorAccountResult executeDisassociateFromAdministratorAccount(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFromAdministratorAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFromAdministratorAccountRequest> request = null;
        Response<DisassociateFromAdministratorAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFromAdministratorAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateFromAdministratorAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateFromAdministratorAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFromAdministratorAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateFromAdministratorAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * (Deprecated) Disassociates a member account from its Amazon Macie administrator account. This operation has been
     * replaced by the <link linkend="DisassociateFromAdministratorAccount">DisassociateFromAdministratorAccount</link>
     * operation.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromMasterAccount"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Disassociates an Amazon Macie administrator account from a member account.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return Result of the DisassociateMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateMemberResult disassociateMember(DisassociateMemberRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMember(request);
    }

    @SdkInternalApi
    final DisassociateMemberResult executeDisassociateMember(DisassociateMemberRequest disassociateMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberRequest> request = null;
        Response<DisassociateMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables Amazon Macie and specifies the configuration settings for a Macie account.
     * </p>
     * 
     * @param enableMacieRequest
     * @return Result of the EnableMacie operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.EnableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableMacieResult enableMacie(EnableMacieRequest request) {
        request = beforeClientExecution(request);
        return executeEnableMacie(request);
    }

    @SdkInternalApi
    final EnableMacieResult executeEnableMacie(EnableMacieRequest enableMacieRequest) {

        ExecutionContext executionContext = createExecutionContext(enableMacieRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableMacieRequest> request = null;
        Response<EnableMacieResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableMacieRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableMacieRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableMacie");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableMacieResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableMacieResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Designates an account as the delegated Amazon Macie administrator account for an AWS organization.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return Result of the EnableOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeEnableOrganizationAdminAccount(request);
    }

    @SdkInternalApi
    final EnableOrganizationAdminAccountResult executeEnableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(enableOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableOrganizationAdminAccountRequest> request = null;
        Response<EnableOrganizationAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableOrganizationAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableOrganizationAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableOrganizationAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableOrganizationAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableOrganizationAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the Amazon Macie administrator account for an account.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @return Result of the GetAdministratorAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAdministratorAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAdministratorAccountResult getAdministratorAccount(GetAdministratorAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetAdministratorAccount(request);
    }

    @SdkInternalApi
    final GetAdministratorAccountResult executeGetAdministratorAccount(GetAdministratorAccountRequest getAdministratorAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getAdministratorAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAdministratorAccountRequest> request = null;
        Response<GetAdministratorAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAdministratorAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAdministratorAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAdministratorAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAdministratorAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAdministratorAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data for all the S3 buckets that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @param getBucketStatisticsRequest
     * @return Result of the GetBucketStatistics operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetBucketStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetBucketStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBucketStatisticsResult getBucketStatistics(GetBucketStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBucketStatistics(request);
    }

    @SdkInternalApi
    final GetBucketStatisticsResult executeGetBucketStatistics(GetBucketStatisticsRequest getBucketStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBucketStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBucketStatisticsRequest> request = null;
        Response<GetBucketStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBucketStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBucketStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBucketStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBucketStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBucketStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the configuration settings for storing data classification results.
     * </p>
     * 
     * @param getClassificationExportConfigurationRequest
     * @return Result of the GetClassificationExportConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetClassificationExportConfigurationResult getClassificationExportConfiguration(GetClassificationExportConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetClassificationExportConfiguration(request);
    }

    @SdkInternalApi
    final GetClassificationExportConfigurationResult executeGetClassificationExportConfiguration(
            GetClassificationExportConfigurationRequest getClassificationExportConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getClassificationExportConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClassificationExportConfigurationRequest> request = null;
        Response<GetClassificationExportConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClassificationExportConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getClassificationExportConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetClassificationExportConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetClassificationExportConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetClassificationExportConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param getCustomDataIdentifierRequest
     * @return Result of the GetCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetCustomDataIdentifier" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCustomDataIdentifierResult getCustomDataIdentifier(GetCustomDataIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeGetCustomDataIdentifier(request);
    }

    @SdkInternalApi
    final GetCustomDataIdentifierResult executeGetCustomDataIdentifier(GetCustomDataIdentifierRequest getCustomDataIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(getCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCustomDataIdentifierRequest> request = null;
        Response<GetCustomDataIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCustomDataIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCustomDataIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCustomDataIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCustomDataIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCustomDataIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about findings.
     * </p>
     * 
     * @param getFindingStatisticsRequest
     * @return Result of the GetFindingStatistics operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetFindingStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetFindingStatisticsResult getFindingStatistics(GetFindingStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindingStatistics(request);
    }

    @SdkInternalApi
    final GetFindingStatisticsResult executeGetFindingStatistics(GetFindingStatisticsRequest getFindingStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingStatisticsRequest> request = null;
        Response<GetFindingStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindingStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of one or more findings.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindings" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param getFindingsFilterRequest
     * @return Result of the GetFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFindingsFilterResult getFindingsFilter(GetFindingsFilterRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindingsFilter(request);
    }

    @SdkInternalApi
    final GetFindingsFilterResult executeGetFindingsFilter(GetFindingsFilterRequest getFindingsFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsFilterRequest> request = null;
        Response<GetFindingsFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingsFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindingsFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingsFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingsFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the count of Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetInvitationsCount" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves the current status and configuration settings for an Amazon Macie account.
     * </p>
     * 
     * @param getMacieSessionRequest
     * @return Result of the GetMacieSession operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMacieSessionResult getMacieSession(GetMacieSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetMacieSession(request);
    }

    @SdkInternalApi
    final GetMacieSessionResult executeGetMacieSession(GetMacieSessionRequest getMacieSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getMacieSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMacieSessionRequest> request = null;
        Response<GetMacieSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMacieSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMacieSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMacieSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMacieSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMacieSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * (Deprecated) Retrieves information about the Amazon Macie administrator account for an account. This operation
     * has been replaced by the <link linkend="GetAdministratorAccount">GetAdministratorAccount</link> operation.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves information about an account that's associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param getMemberRequest
     * @return Result of the GetMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMember" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves (queries) quotas and aggregated usage data for one or more accounts.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @return Result of the GetUsageStatistics operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUsageStatisticsResult getUsageStatistics(GetUsageStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsageStatistics(request);
    }

    @SdkInternalApi
    final GetUsageStatisticsResult executeGetUsageStatistics(GetUsageStatisticsRequest getUsageStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsageStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageStatisticsRequest> request = null;
        Response<GetUsageStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsageStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsageStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsageStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsageStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves (queries) aggregated usage data for an account.
     * </p>
     * 
     * @param getUsageTotalsRequest
     * @return Result of the GetUsageTotals operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUsageTotalsResult getUsageTotals(GetUsageTotalsRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsageTotals(request);
    }

    @SdkInternalApi
    final GetUsageTotalsResult executeGetUsageTotals(GetUsageTotalsRequest getUsageTotalsRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsageTotalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageTotalsRequest> request = null;
        Response<GetUsageTotalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageTotalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsageTotalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsageTotals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsageTotalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsageTotalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a subset of information about one or more classification jobs.
     * </p>
     * 
     * @param listClassificationJobsRequest
     * @return Result of the ListClassificationJobs operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListClassificationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListClassificationJobsResult listClassificationJobs(ListClassificationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListClassificationJobs(request);
    }

    @SdkInternalApi
    final ListClassificationJobsResult executeListClassificationJobs(ListClassificationJobsRequest listClassificationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listClassificationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClassificationJobsRequest> request = null;
        Response<ListClassificationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClassificationJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClassificationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClassificationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClassificationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListClassificationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a subset of information about all the custom data identifiers for an account.
     * </p>
     * 
     * @param listCustomDataIdentifiersRequest
     * @return Result of the ListCustomDataIdentifiers operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomDataIdentifiersResult listCustomDataIdentifiers(ListCustomDataIdentifiersRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomDataIdentifiers(request);
    }

    @SdkInternalApi
    final ListCustomDataIdentifiersResult executeListCustomDataIdentifiers(ListCustomDataIdentifiersRequest listCustomDataIdentifiersRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomDataIdentifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomDataIdentifiersRequest> request = null;
        Response<ListCustomDataIdentifiersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomDataIdentifiersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomDataIdentifiersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomDataIdentifiers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomDataIdentifiersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCustomDataIdentifiersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a subset of information about one or more findings.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFindingsResult listFindings(ListFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeListFindings(request);
    }

    @SdkInternalApi
    final ListFindingsResult executeListFindings(ListFindingsRequest listFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsRequest> request = null;
        Response<ListFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a subset of information about all the findings filters for an account.
     * </p>
     * 
     * @param listFindingsFiltersRequest
     * @return Result of the ListFindingsFilters operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListFindingsFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindingsFilters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFindingsFiltersResult listFindingsFilters(ListFindingsFiltersRequest request) {
        request = beforeClientExecution(request);
        return executeListFindingsFilters(request);
    }

    @SdkInternalApi
    final ListFindingsFiltersResult executeListFindingsFilters(ListFindingsFiltersRequest listFindingsFiltersRequest) {

        ExecutionContext executionContext = createExecutionContext(listFindingsFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsFiltersRequest> request = null;
        Response<ListFindingsFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsFiltersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFindingsFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFindingsFilters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingsFiltersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFindingsFiltersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about all the Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListInvitations" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves information about the accounts that are associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListMembers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Retrieves information about the delegated Amazon Macie administrator account for an AWS organization.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return Result of the ListOrganizationAdminAccounts operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationAdminAccounts(request);
    }

    @SdkInternalApi
    final ListOrganizationAdminAccountsResult executeListOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationAdminAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationAdminAccountsRequest> request = null;
        Response<ListOrganizationAdminAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationAdminAccountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationAdminAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationAdminAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationAdminAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOrganizationAdminAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with a classification job, custom data identifier,
     * findings filter, or member account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AmazonMacie2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Creates or updates the configuration settings for storing data classification results.
     * </p>
     * 
     * @param putClassificationExportConfigurationRequest
     * @return Result of the PutClassificationExportConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.PutClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutClassificationExportConfigurationResult putClassificationExportConfiguration(PutClassificationExportConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutClassificationExportConfiguration(request);
    }

    @SdkInternalApi
    final PutClassificationExportConfigurationResult executePutClassificationExportConfiguration(
            PutClassificationExportConfigurationRequest putClassificationExportConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putClassificationExportConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutClassificationExportConfigurationRequest> request = null;
        Response<PutClassificationExportConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutClassificationExportConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putClassificationExportConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutClassificationExportConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutClassificationExportConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutClassificationExportConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates one or more tags (keys and values) that are associated with a classification job, custom data
     * identifier, findings filter, or member account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AmazonMacie2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * Tests a custom data identifier.
     * </p>
     * 
     * @param testCustomDataIdentifierRequest
     * @return Result of the TestCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.TestCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TestCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TestCustomDataIdentifierResult testCustomDataIdentifier(TestCustomDataIdentifierRequest request) {
        request = beforeClientExecution(request);
        return executeTestCustomDataIdentifier(request);
    }

    @SdkInternalApi
    final TestCustomDataIdentifierResult executeTestCustomDataIdentifier(TestCustomDataIdentifierRequest testCustomDataIdentifierRequest) {

        ExecutionContext executionContext = createExecutionContext(testCustomDataIdentifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestCustomDataIdentifierRequest> request = null;
        Response<TestCustomDataIdentifierResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestCustomDataIdentifierRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(testCustomDataIdentifierRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestCustomDataIdentifier");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestCustomDataIdentifierResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TestCustomDataIdentifierResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags (keys and values) from a classification job, custom data identifier, findings filter, or
     * member account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AmazonMacie2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
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
     * <p>
     * Changes the status of a classification job.
     * </p>
     * 
     * @param updateClassificationJobRequest
     * @return Result of the UpdateClassificationJob operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateClassificationJobResult updateClassificationJob(UpdateClassificationJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateClassificationJob(request);
    }

    @SdkInternalApi
    final UpdateClassificationJobResult executeUpdateClassificationJob(UpdateClassificationJobRequest updateClassificationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClassificationJobRequest> request = null;
        Response<UpdateClassificationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClassificationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateClassificationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateClassificationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClassificationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateClassificationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param updateFindingsFilterRequest
     * @return Result of the UpdateFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFindingsFilterResult updateFindingsFilter(UpdateFindingsFilterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFindingsFilter(request);
    }

    @SdkInternalApi
    final UpdateFindingsFilterResult executeUpdateFindingsFilter(UpdateFindingsFilterRequest updateFindingsFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFindingsFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFindingsFilterRequest> request = null;
        Response<UpdateFindingsFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFindingsFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFindingsFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFindingsFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFindingsFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFindingsFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Suspends or re-enables an Amazon Macie account, or updates the configuration settings for a Macie account.
     * </p>
     * 
     * @param updateMacieSessionRequest
     * @return Result of the UpdateMacieSession operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMacieSessionResult updateMacieSession(UpdateMacieSessionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMacieSession(request);
    }

    @SdkInternalApi
    final UpdateMacieSessionResult executeUpdateMacieSession(UpdateMacieSessionRequest updateMacieSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMacieSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMacieSessionRequest> request = null;
        Response<UpdateMacieSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMacieSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMacieSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMacieSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMacieSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMacieSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables an Amazon Macie administrator to suspend or re-enable a member account.
     * </p>
     * 
     * @param updateMemberSessionRequest
     * @return Result of the UpdateMemberSession operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateMemberSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMemberSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMemberSessionResult updateMemberSession(UpdateMemberSessionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMemberSession(request);
    }

    @SdkInternalApi
    final UpdateMemberSessionResult executeUpdateMemberSession(UpdateMemberSessionRequest updateMemberSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMemberSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMemberSessionRequest> request = null;
        Response<UpdateMemberSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMemberSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMemberSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMemberSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMemberSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMemberSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Amazon Macie configuration settings for an AWS organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateOrganizationConfigurationResult executeUpdateOrganizationConfiguration(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrganizationConfigurationRequest> request = null;
        Response<UpdateOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Macie2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOrganizationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateOrganizationConfigurationResultJsonUnmarshaller());
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
