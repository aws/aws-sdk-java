/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs;

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

import com.amazonaws.services.drs.AWSdrsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.services.drs.model.transform.*;

/**
 * Client for accessing drs. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * AWS Elastic Disaster Recovery Service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSdrsClient extends AmazonWebServiceClient implements AWSdrs {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSdrs.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "drs";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UninitializedAccountException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.UninitializedAccountExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.drs.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.drs.model.AWSdrsException.class));

    public static AWSdrsClientBuilder builder() {
        return AWSdrsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on drs using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSdrsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on drs using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSdrsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("drs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/drs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/drs/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create an extended source server in the target Account based on the source server in staging account.
     * </p>
     * 
     * @param createExtendedSourceServerRequest
     * @return Result of the CreateExtendedSourceServer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.CreateExtendedSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateExtendedSourceServer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateExtendedSourceServerResult createExtendedSourceServer(CreateExtendedSourceServerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExtendedSourceServer(request);
    }

    @SdkInternalApi
    final CreateExtendedSourceServerResult executeCreateExtendedSourceServer(CreateExtendedSourceServerRequest createExtendedSourceServerRequest) {

        ExecutionContext executionContext = createExecutionContext(createExtendedSourceServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExtendedSourceServerRequest> request = null;
        Response<CreateExtendedSourceServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExtendedSourceServerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createExtendedSourceServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExtendedSourceServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExtendedSourceServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateExtendedSourceServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new ReplicationConfigurationTemplate.
     * </p>
     * 
     * @param createReplicationConfigurationTemplateRequest
     * @return Result of the CreateReplicationConfigurationTemplate operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateReplicationConfigurationTemplateResult createReplicationConfigurationTemplate(CreateReplicationConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReplicationConfigurationTemplate(request);
    }

    @SdkInternalApi
    final CreateReplicationConfigurationTemplateResult executeCreateReplicationConfigurationTemplate(
            CreateReplicationConfigurationTemplateRequest createReplicationConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createReplicationConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationConfigurationTemplateRequest> request = null;
        Response<CreateReplicationConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationConfigurationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createReplicationConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReplicationConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReplicationConfigurationTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateReplicationConfigurationTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a single Job by ID.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobResult deleteJob(DeleteJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJob(request);
    }

    @SdkInternalApi
    final DeleteJobResult executeDeleteJob(DeleteJobRequest deleteJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobRequest> request = null;
        Response<DeleteJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a single Recovery Instance by ID. This deletes the Recovery Instance resource from Elastic Disaster
     * Recovery. The Recovery Instance must be disconnected first in order to delete it.
     * </p>
     * 
     * @param deleteRecoveryInstanceRequest
     * @return Result of the DeleteRecoveryInstance operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteRecoveryInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRecoveryInstanceResult deleteRecoveryInstance(DeleteRecoveryInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRecoveryInstance(request);
    }

    @SdkInternalApi
    final DeleteRecoveryInstanceResult executeDeleteRecoveryInstance(DeleteRecoveryInstanceRequest deleteRecoveryInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRecoveryInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRecoveryInstanceRequest> request = null;
        Response<DeleteRecoveryInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRecoveryInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRecoveryInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRecoveryInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRecoveryInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRecoveryInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a single Replication Configuration Template by ID
     * </p>
     * 
     * @param deleteReplicationConfigurationTemplateRequest
     * @return Result of the DeleteReplicationConfigurationTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteReplicationConfigurationTemplateResult deleteReplicationConfigurationTemplate(DeleteReplicationConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReplicationConfigurationTemplate(request);
    }

    @SdkInternalApi
    final DeleteReplicationConfigurationTemplateResult executeDeleteReplicationConfigurationTemplate(
            DeleteReplicationConfigurationTemplateRequest deleteReplicationConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReplicationConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationConfigurationTemplateRequest> request = null;
        Response<DeleteReplicationConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationConfigurationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteReplicationConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReplicationConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReplicationConfigurationTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteReplicationConfigurationTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a single Source Server by ID. The Source Server must be disconnected first.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @return Result of the DeleteSourceServer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSourceServerResult deleteSourceServer(DeleteSourceServerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSourceServer(request);
    }

    @SdkInternalApi
    final DeleteSourceServerResult executeDeleteSourceServer(DeleteSourceServerRequest deleteSourceServerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSourceServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSourceServerRequest> request = null;
        Response<DeleteSourceServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSourceServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSourceServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSourceServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSourceServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSourceServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a detailed Job log with pagination.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @return Result of the DescribeJobLogItems operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobLogItems" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobLogItemsResult describeJobLogItems(DescribeJobLogItemsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobLogItems(request);
    }

    @SdkInternalApi
    final DescribeJobLogItemsResult executeDescribeJobLogItems(DescribeJobLogItemsRequest describeJobLogItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobLogItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobLogItemsRequest> request = null;
        Response<DescribeJobLogItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobLogItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobLogItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobLogItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobLogItemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobLogItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Jobs. Use the JobsID and fromDate and toDate filters to limit which jobs are returned. The
     * response is sorted by creationDataTime - latest date first. Jobs are created by the StartRecovery,
     * TerminateRecoveryInstances and StartFailbackLaunch APIs. Jobs are also created by DiagnosticLaunch and
     * TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant
     * support tickets.
     * </p>
     * 
     * @param describeJobsRequest
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobsResult describeJobs(DescribeJobsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobs(request);
    }

    @SdkInternalApi
    final DescribeJobsResult executeDescribeJobs(DescribeJobsRequest describeJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobsRequest> request = null;
        Response<DescribeJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Recovery Instances or multiple Recovery Instances by ID.
     * </p>
     * 
     * @param describeRecoveryInstancesRequest
     * @return Result of the DescribeRecoveryInstances operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRecoveryInstancesResult describeRecoveryInstances(DescribeRecoveryInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecoveryInstances(request);
    }

    @SdkInternalApi
    final DescribeRecoveryInstancesResult executeDescribeRecoveryInstances(DescribeRecoveryInstancesRequest describeRecoveryInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecoveryInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecoveryInstancesRequest> request = null;
        Response<DescribeRecoveryInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecoveryInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRecoveryInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecoveryInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecoveryInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRecoveryInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Recovery Snapshots for a single Source Server.
     * </p>
     * 
     * @param describeRecoverySnapshotsRequest
     * @return Result of the DescribeRecoverySnapshots operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeRecoverySnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoverySnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRecoverySnapshotsResult describeRecoverySnapshots(DescribeRecoverySnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecoverySnapshots(request);
    }

    @SdkInternalApi
    final DescribeRecoverySnapshotsResult executeDescribeRecoverySnapshots(DescribeRecoverySnapshotsRequest describeRecoverySnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecoverySnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecoverySnapshotsRequest> request = null;
        Response<DescribeRecoverySnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecoverySnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRecoverySnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecoverySnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecoverySnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRecoverySnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
     * </p>
     * 
     * @param describeReplicationConfigurationTemplatesRequest
     * @return Result of the DescribeReplicationConfigurationTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeReplicationConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReplicationConfigurationTemplatesResult describeReplicationConfigurationTemplates(DescribeReplicationConfigurationTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReplicationConfigurationTemplates(request);
    }

    @SdkInternalApi
    final DescribeReplicationConfigurationTemplatesResult executeDescribeReplicationConfigurationTemplates(
            DescribeReplicationConfigurationTemplatesRequest describeReplicationConfigurationTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReplicationConfigurationTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationConfigurationTemplatesRequest> request = null;
        Response<DescribeReplicationConfigurationTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationConfigurationTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReplicationConfigurationTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReplicationConfigurationTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReplicationConfigurationTemplatesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeReplicationConfigurationTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Source Servers or multiple Source Servers filtered by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @return Result of the DescribeSourceServers operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSourceServersResult describeSourceServers(DescribeSourceServersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSourceServers(request);
    }

    @SdkInternalApi
    final DescribeSourceServersResult executeDescribeSourceServers(DescribeSourceServersRequest describeSourceServersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSourceServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSourceServersRequest> request = null;
        Response<DescribeSourceServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSourceServersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSourceServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSourceServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSourceServersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeSourceServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnect a Recovery Instance from Elastic Disaster Recovery. Data replication is stopped immediately. All AWS
     * resources created by Elastic Disaster Recovery for enabling the replication of the Recovery Instance will be
     * terminated / deleted within 90 minutes. If the agent on the Recovery Instance has not been prevented from
     * communicating with the Elastic Disaster Recovery service, then it will receive a command to uninstall itself
     * (within approximately 10 minutes). The following properties of the Recovery Instance will be changed immediately:
     * dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of
     * dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and
     * dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectRecoveryInstanceRequest
     * @return Result of the DisconnectRecoveryInstance operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DisconnectRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectRecoveryInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisconnectRecoveryInstanceResult disconnectRecoveryInstance(DisconnectRecoveryInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectRecoveryInstance(request);
    }

    @SdkInternalApi
    final DisconnectRecoveryInstanceResult executeDisconnectRecoveryInstance(DisconnectRecoveryInstanceRequest disconnectRecoveryInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectRecoveryInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectRecoveryInstanceRequest> request = null;
        Response<DisconnectRecoveryInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectRecoveryInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disconnectRecoveryInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectRecoveryInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectRecoveryInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisconnectRecoveryInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnects a specific Source Server from Elastic Disaster Recovery. Data replication is stopped immediately. All
     * AWS resources created by Elastic Disaster Recovery for enabling the replication of the Source Server will be
     * terminated / deleted within 90 minutes. You cannot disconnect a Source Server if it has a Recovery Instance. If
     * the agent on the Source Server has not been prevented from communicating with the Elastic Disaster Recovery
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectSourceServerRequest
     * @return Result of the DisconnectSourceServer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DisconnectSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisconnectSourceServerResult disconnectSourceServer(DisconnectSourceServerRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectSourceServer(request);
    }

    @SdkInternalApi
    final DisconnectSourceServerResult executeDisconnectSourceServer(DisconnectSourceServerRequest disconnectSourceServerRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectSourceServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectSourceServerRequest> request = null;
        Response<DisconnectSourceServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectSourceServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disconnectSourceServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectSourceServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectSourceServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisconnectSourceServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Failback ReplicationConfigurations, filtered by Recovery Instance ID.
     * </p>
     * 
     * @param getFailbackReplicationConfigurationRequest
     * @return Result of the GetFailbackReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.GetFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFailbackReplicationConfigurationResult getFailbackReplicationConfiguration(GetFailbackReplicationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetFailbackReplicationConfiguration(request);
    }

    @SdkInternalApi
    final GetFailbackReplicationConfigurationResult executeGetFailbackReplicationConfiguration(
            GetFailbackReplicationConfigurationRequest getFailbackReplicationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getFailbackReplicationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFailbackReplicationConfigurationRequest> request = null;
        Response<GetFailbackReplicationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFailbackReplicationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getFailbackReplicationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFailbackReplicationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFailbackReplicationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFailbackReplicationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a LaunchConfiguration, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @return Result of the GetLaunchConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLaunchConfigurationResult getLaunchConfiguration(GetLaunchConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLaunchConfiguration(request);
    }

    @SdkInternalApi
    final GetLaunchConfigurationResult executeGetLaunchConfiguration(GetLaunchConfigurationRequest getLaunchConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLaunchConfigurationRequest> request = null;
        Response<GetLaunchConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLaunchConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLaunchConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLaunchConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLaunchConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLaunchConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a ReplicationConfiguration, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @return Result of the GetReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReplicationConfigurationResult getReplicationConfiguration(GetReplicationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetReplicationConfiguration(request);
    }

    @SdkInternalApi
    final GetReplicationConfigurationResult executeGetReplicationConfiguration(GetReplicationConfigurationRequest getReplicationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getReplicationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReplicationConfigurationRequest> request = null;
        Response<GetReplicationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReplicationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReplicationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReplicationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReplicationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReplicationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initialize Elastic Disaster Recovery.
     * </p>
     * 
     * @param initializeServiceRequest
     * @return Result of the InitializeService operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/InitializeService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InitializeServiceResult initializeService(InitializeServiceRequest request) {
        request = beforeClientExecution(request);
        return executeInitializeService(request);
    }

    @SdkInternalApi
    final InitializeServiceResult executeInitializeService(InitializeServiceRequest initializeServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(initializeServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitializeServiceRequest> request = null;
        Response<InitializeServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitializeServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(initializeServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitializeService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitializeServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InitializeServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of source servers on a staging account that are extensible, which means that: a. The source server
     * is not already extended into this Account. b. The source server on the Account we’re reading from is not an
     * extension of another source server.
     * </p>
     * 
     * @param listExtensibleSourceServersRequest
     * @return Result of the ListExtensibleSourceServers operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.ListExtensibleSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListExtensibleSourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListExtensibleSourceServersResult listExtensibleSourceServers(ListExtensibleSourceServersRequest request) {
        request = beforeClientExecution(request);
        return executeListExtensibleSourceServers(request);
    }

    @SdkInternalApi
    final ListExtensibleSourceServersResult executeListExtensibleSourceServers(ListExtensibleSourceServersRequest listExtensibleSourceServersRequest) {

        ExecutionContext executionContext = createExecutionContext(listExtensibleSourceServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExtensibleSourceServersRequest> request = null;
        Response<ListExtensibleSourceServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExtensibleSourceServersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listExtensibleSourceServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExtensibleSourceServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExtensibleSourceServersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListExtensibleSourceServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of staging accounts for existing extended source servers.
     * </p>
     * 
     * @param listStagingAccountsRequest
     * @return Result of the ListStagingAccounts operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.ListStagingAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListStagingAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStagingAccountsResult listStagingAccounts(ListStagingAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListStagingAccounts(request);
    }

    @SdkInternalApi
    final ListStagingAccountsResult executeListStagingAccounts(ListStagingAccountsRequest listStagingAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStagingAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStagingAccountsRequest> request = null;
        Response<ListStagingAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStagingAccountsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStagingAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStagingAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStagingAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStagingAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all tags for your Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
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
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for the specified Source
     * Server ID, regardless of when the previous initiation started. This command will work only if the Source Server
     * is stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @return Result of the RetryDataReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RetryDataReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RetryDataReplicationResult retryDataReplication(RetryDataReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeRetryDataReplication(request);
    }

    @SdkInternalApi
    final RetryDataReplicationResult executeRetryDataReplication(RetryDataReplicationRequest retryDataReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(retryDataReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetryDataReplicationRequest> request = null;
        Response<RetryDataReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetryDataReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(retryDataReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetryDataReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetryDataReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RetryDataReplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Start replication to origin / target region - applies only to protected instances that originated in EC2. For
     * recovery instances on target region - starts replication back to origin region. For failback instances on origin
     * region - starts replication to target region to re-protect them.
     * </p>
     * 
     * @param reverseReplicationRequest
     * @return Result of the ReverseReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.ReverseReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ReverseReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReverseReplicationResult reverseReplication(ReverseReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeReverseReplication(request);
    }

    @SdkInternalApi
    final ReverseReplicationResult executeReverseReplication(ReverseReplicationRequest reverseReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(reverseReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReverseReplicationRequest> request = null;
        Response<ReverseReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReverseReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(reverseReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReverseReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReverseReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReverseReplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a Job for launching the machine that is being failed back to from the specified Recovery Instance. This
     * will run conversion on the failback client and will reboot your machine, thus completing the failback process.
     * </p>
     * 
     * @param startFailbackLaunchRequest
     * @return Result of the StartFailbackLaunch operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StartFailbackLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartFailbackLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartFailbackLaunchResult startFailbackLaunch(StartFailbackLaunchRequest request) {
        request = beforeClientExecution(request);
        return executeStartFailbackLaunch(request);
    }

    @SdkInternalApi
    final StartFailbackLaunchResult executeStartFailbackLaunch(StartFailbackLaunchRequest startFailbackLaunchRequest) {

        ExecutionContext executionContext = createExecutionContext(startFailbackLaunchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFailbackLaunchRequest> request = null;
        Response<StartFailbackLaunchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFailbackLaunchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFailbackLaunchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFailbackLaunch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFailbackLaunchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFailbackLaunchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Launches Recovery Instances for the specified Source Servers. For each Source Server you may choose a point in
     * time snapshot to launch from, or use an on demand snapshot.
     * </p>
     * 
     * @param startRecoveryRequest
     * @return Result of the StartRecovery operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StartRecovery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartRecovery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartRecoveryResult startRecovery(StartRecoveryRequest request) {
        request = beforeClientExecution(request);
        return executeStartRecovery(request);
    }

    @SdkInternalApi
    final StartRecoveryResult executeStartRecovery(StartRecoveryRequest startRecoveryRequest) {

        ExecutionContext executionContext = createExecutionContext(startRecoveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRecoveryRequest> request = null;
        Response<StartRecoveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRecoveryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startRecoveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRecovery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRecoveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartRecoveryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts replication for a stopped Source Server. This action would make the Source Server protected again and
     * restart billing for it.
     * </p>
     * 
     * @param startReplicationRequest
     * @return Result of the StartReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartReplicationResult startReplication(StartReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStartReplication(request);
    }

    @SdkInternalApi
    final StartReplicationResult executeStartReplication(StartReplicationRequest startReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(startReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationRequest> request = null;
        Response<StartReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartReplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the failback process for a specified Recovery Instance. This changes the Failback State of the Recovery
     * Instance back to FAILBACK_NOT_STARTED.
     * </p>
     * 
     * @param stopFailbackRequest
     * @return Result of the StopFailback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StopFailback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopFailback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopFailbackResult stopFailback(StopFailbackRequest request) {
        request = beforeClientExecution(request);
        return executeStopFailback(request);
    }

    @SdkInternalApi
    final StopFailbackResult executeStopFailback(StopFailbackRequest stopFailbackRequest) {

        ExecutionContext executionContext = createExecutionContext(stopFailbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopFailbackRequest> request = null;
        Response<StopFailbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopFailbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopFailbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopFailback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopFailbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopFailbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops replication for a Source Server. This action would make the Source Server unprotected, delete its existing
     * snapshots and stop billing for it.
     * </p>
     * 
     * @param stopReplicationRequest
     * @return Result of the StopReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StopReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopReplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopReplicationResult stopReplication(StopReplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStopReplication(request);
    }

    @SdkInternalApi
    final StopReplicationResult executeStopReplication(StopReplicationRequest stopReplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(stopReplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopReplicationRequest> request = null;
        Response<StopReplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopReplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopReplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopReplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopReplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopReplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Elastic Disaster Recovery resource or resources.
     * When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
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
     * Initiates a Job for terminating the EC2 resources associated with the specified Recovery Instances, and then will
     * delete the Recovery Instances from the Elastic Disaster Recovery service.
     * </p>
     * 
     * @param terminateRecoveryInstancesRequest
     * @return Result of the TerminateRecoveryInstances operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.TerminateRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TerminateRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TerminateRecoveryInstancesResult terminateRecoveryInstances(TerminateRecoveryInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateRecoveryInstances(request);
    }

    @SdkInternalApi
    final TerminateRecoveryInstancesResult executeTerminateRecoveryInstances(TerminateRecoveryInstancesRequest terminateRecoveryInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateRecoveryInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateRecoveryInstancesRequest> request = null;
        Response<TerminateRecoveryInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateRecoveryInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(terminateRecoveryInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateRecoveryInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateRecoveryInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TerminateRecoveryInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
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
     * Allows you to update the failback replication configuration of a Recovery Instance by ID.
     * </p>
     * 
     * @param updateFailbackReplicationConfigurationRequest
     * @return Result of the UpdateFailbackReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFailbackReplicationConfigurationResult updateFailbackReplicationConfiguration(UpdateFailbackReplicationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFailbackReplicationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateFailbackReplicationConfigurationResult executeUpdateFailbackReplicationConfiguration(
            UpdateFailbackReplicationConfigurationRequest updateFailbackReplicationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFailbackReplicationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFailbackReplicationConfigurationRequest> request = null;
        Response<UpdateFailbackReplicationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFailbackReplicationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFailbackReplicationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFailbackReplicationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFailbackReplicationConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateFailbackReplicationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a LaunchConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @return Result of the UpdateLaunchConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateLaunchConfigurationResult updateLaunchConfiguration(UpdateLaunchConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLaunchConfiguration(request);
    }

    @SdkInternalApi
    final UpdateLaunchConfigurationResult executeUpdateLaunchConfiguration(UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLaunchConfigurationRequest> request = null;
        Response<UpdateLaunchConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLaunchConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLaunchConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLaunchConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLaunchConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLaunchConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to update a ReplicationConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @return Result of the UpdateReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateReplicationConfigurationResult updateReplicationConfiguration(UpdateReplicationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReplicationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateReplicationConfigurationResult executeUpdateReplicationConfiguration(UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReplicationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReplicationConfigurationRequest> request = null;
        Response<UpdateReplicationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReplicationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateReplicationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReplicationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReplicationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateReplicationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a ReplicationConfigurationTemplate by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @return Result of the UpdateReplicationConfigurationTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateReplicationConfigurationTemplateResult updateReplicationConfigurationTemplate(UpdateReplicationConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReplicationConfigurationTemplate(request);
    }

    @SdkInternalApi
    final UpdateReplicationConfigurationTemplateResult executeUpdateReplicationConfigurationTemplate(
            UpdateReplicationConfigurationTemplateRequest updateReplicationConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReplicationConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReplicationConfigurationTemplateRequest> request = null;
        Response<UpdateReplicationConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReplicationConfigurationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateReplicationConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "drs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReplicationConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReplicationConfigurationTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateReplicationConfigurationTemplateResultJsonUnmarshaller());
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
