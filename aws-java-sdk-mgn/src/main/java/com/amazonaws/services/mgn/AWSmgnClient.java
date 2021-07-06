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
package com.amazonaws.services.mgn;

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

import com.amazonaws.services.mgn.AWSmgnClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.services.mgn.model.transform.*;

/**
 * Client for accessing mgn. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * The Application Migration Service service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSmgnClient extends AmazonWebServiceClient implements AWSmgn {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSmgn.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mgn";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UninitializedAccountException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.UninitializedAccountExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mgn.model.AWSmgnException.class));

    public static AWSmgnClientBuilder builder() {
        return AWSmgnClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on mgn using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSmgnClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on mgn using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSmgnClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mgn.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mgn/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mgn/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Allows the user to set the SourceServer.LifeCycle.state property for specific Source Server IDs to one of the
     * following: READY_FOR_TEST or READY_FOR_CUTOVER. This command only works if the Source Server is already
     * launchable (dataReplicationInfo.lagDuration is not null.)
     * </p>
     * 
     * @param changeServerLifeCycleStateRequest
     * @return Result of the ChangeServerLifeCycleState operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.ChangeServerLifeCycleState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ChangeServerLifeCycleState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ChangeServerLifeCycleStateResult changeServerLifeCycleState(ChangeServerLifeCycleStateRequest request) {
        request = beforeClientExecution(request);
        return executeChangeServerLifeCycleState(request);
    }

    @SdkInternalApi
    final ChangeServerLifeCycleStateResult executeChangeServerLifeCycleState(ChangeServerLifeCycleStateRequest changeServerLifeCycleStateRequest) {

        ExecutionContext executionContext = createExecutionContext(changeServerLifeCycleStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeServerLifeCycleStateRequest> request = null;
        Response<ChangeServerLifeCycleStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangeServerLifeCycleStateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(changeServerLifeCycleStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ChangeServerLifeCycleState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ChangeServerLifeCycleStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ChangeServerLifeCycleStateResultJsonUnmarshaller());
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
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateReplicationConfigurationTemplate"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteJob" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Deletes a single Replication Configuration Template by ID
     * </p>
     * 
     * @param deleteReplicationConfigurationTemplateRequest
     * @return Result of the DeleteReplicationConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteReplicationConfigurationTemplate"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Deletes a single source server by ID.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @return Result of the DeleteSourceServer operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteSourceServer" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Retrieves detailed Job log with paging.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @return Result of the DescribeJobLogItems operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobLogItems" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Returns a list of Jobs. Use the JobsID and fromDate and toData filters to limit which jobs are returned. The
     * response is sorted by creationDataTime - latest date first. Jobs are normaly created by the StartTest,
     * StartCutover, and TerminateTargetInstances APIs. Jobs are also created by DiagnosticLaunch and
     * TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant
     * support tickets.
     * </p>
     * 
     * @param describeJobsRequest
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobs" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
     * </p>
     * 
     * @param describeReplicationConfigurationTemplatesRequest
     * @return Result of the DescribeReplicationConfigurationTemplates operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeReplicationConfigurationTemplates"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Retrieves all SourceServers or multiple SourceServers by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @return Result of the DescribeSourceServers operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeSourceServers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Disconnects specific Source Servers from Application Migration Service. Data replication is stopped immediately.
     * All AWS resources created by Application Migration Service for enabling the replication of these source servers
     * will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. If the
     * agent on the source server has not been prevented from communciating with the Application Migration Service
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDurationwill be nullified.
     * </p>
     * 
     * @param disconnectFromServiceRequest
     * @return Result of the DisconnectFromService operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DisconnectFromService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisconnectFromService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisconnectFromServiceResult disconnectFromService(DisconnectFromServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectFromService(request);
    }

    @SdkInternalApi
    final DisconnectFromServiceResult executeDisconnectFromService(DisconnectFromServiceRequest disconnectFromServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectFromServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectFromServiceRequest> request = null;
        Response<DisconnectFromServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectFromServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disconnectFromServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectFromService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectFromServiceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisconnectFromServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Finalizes the cutover immediately for specific Source Servers. All AWS resources created by Application Migration
     * Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes.
     * Launched Test or Cutover instances will NOT be terminated. The AWS Replication Agent will receive a command to
     * uninstall itself (within 10 minutes). The following properties of the SourceServer will be changed immediately:
     * dataReplicationInfo.dataReplicationState will be to DISCONNECTED; The SourceServer.lifeCycle.state will be
     * changed to CUTOVER; The totalStorageBytes property fo each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDurationwill be nullified.
     * </p>
     * 
     * @param finalizeCutoverRequest
     * @return Result of the FinalizeCutover operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.FinalizeCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/FinalizeCutover" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public FinalizeCutoverResult finalizeCutover(FinalizeCutoverRequest request) {
        request = beforeClientExecution(request);
        return executeFinalizeCutover(request);
    }

    @SdkInternalApi
    final FinalizeCutoverResult executeFinalizeCutover(FinalizeCutoverRequest finalizeCutoverRequest) {

        ExecutionContext executionContext = createExecutionContext(finalizeCutoverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FinalizeCutoverRequest> request = null;
        Response<FinalizeCutoverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FinalizeCutoverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(finalizeCutoverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FinalizeCutover");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<FinalizeCutoverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new FinalizeCutoverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all LaunchConfigurations available, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @return Result of the GetLaunchConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @sample AWSmgn.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Lists all ReplicationConfigurations, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @return Result of the GetReplicationConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @sample AWSmgn.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetReplicationConfiguration"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Initialize Application Migration Service.
     * </p>
     * 
     * @param initializeServiceRequest
     * @return Result of the InitializeService operation returned by the service.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/InitializeService" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * List all tags for your Application Migration Service resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ThrottlingException
     *         Reached throttling quota exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws InternalServerException
     *         The server encountered an unexpected condition that prevented it from fulfilling the request.
     * @sample AWSmgn.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Archives specific Source Servers by setting the SourceServer.isArchived property to true for specified
     * SourceServers by ID. This command only works for SourceServers with a lifecycle.state which equals DISCONNECTED
     * or CUTOVER.
     * </p>
     * 
     * @param markAsArchivedRequest
     * @return Result of the MarkAsArchived operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.MarkAsArchived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/MarkAsArchived" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public MarkAsArchivedResult markAsArchived(MarkAsArchivedRequest request) {
        request = beforeClientExecution(request);
        return executeMarkAsArchived(request);
    }

    @SdkInternalApi
    final MarkAsArchivedResult executeMarkAsArchived(MarkAsArchivedRequest markAsArchivedRequest) {

        ExecutionContext executionContext = createExecutionContext(markAsArchivedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MarkAsArchivedRequest> request = null;
        Response<MarkAsArchivedResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MarkAsArchivedRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(markAsArchivedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MarkAsArchived");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MarkAsArchivedResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new MarkAsArchivedResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for specified
     * SourceServer IDs, regardless of when the previous initiation started. This command will not work if the
     * SourceServer is not stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @return Result of the RetryDataReplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RetryDataReplication" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Launches a Cutover Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy
     * property is StartCutover and changes the SourceServer.lifeCycle.state property to CUTTING_OVER.
     * </p>
     * 
     * @param startCutoverRequest
     * @return Result of the StartCutover operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.StartCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartCutover" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartCutoverResult startCutover(StartCutoverRequest request) {
        request = beforeClientExecution(request);
        return executeStartCutover(request);
    }

    @SdkInternalApi
    final StartCutoverResult executeStartCutover(StartCutoverRequest startCutoverRequest) {

        ExecutionContext executionContext = createExecutionContext(startCutoverRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCutoverRequest> request = null;
        Response<StartCutoverResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCutoverRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCutoverRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCutover");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCutoverResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCutoverResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lauches a Test Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property
     * is StartTest and changes the SourceServer.lifeCycle.state property to TESTING.
     * </p>
     * 
     * @param startTestRequest
     * @return Result of the StartTest operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.StartTest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartTest" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartTestResult startTest(StartTestRequest request) {
        request = beforeClientExecution(request);
        return executeStartTest(request);
    }

    @SdkInternalApi
    final StartTestResult executeStartTest(StartTestRequest startTestRequest) {

        ExecutionContext executionContext = createExecutionContext(startTestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTestRequest> request = null;
        Response<StartTestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTestResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Application Migration Service resource or resources.
     * When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ThrottlingException
     *         Reached throttling quota exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws InternalServerException
     *         The server encountered an unexpected condition that prevented it from fulfilling the request.
     * @sample AWSmgn.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Starts a job that terminates specific launched EC2 Test and Cutover instances. This command will not work for any
     * Source Server with a lifecycle.state of TESTING, CUTTING_OVER, or CUTOVER.
     * </p>
     * 
     * @param terminateTargetInstancesRequest
     * @return Result of the TerminateTargetInstances operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.TerminateTargetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TerminateTargetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TerminateTargetInstancesResult terminateTargetInstances(TerminateTargetInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateTargetInstances(request);
    }

    @SdkInternalApi
    final TerminateTargetInstancesResult executeTerminateTargetInstances(TerminateTargetInstancesRequest terminateTargetInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateTargetInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateTargetInstancesRequest> request = null;
        Response<TerminateTargetInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateTargetInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(terminateTargetInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateTargetInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateTargetInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new TerminateTargetInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Application Migration Service resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ThrottlingException
     *         Reached throttling quota exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws InternalServerException
     *         The server encountered an unexpected condition that prevented it from fulfilling the request.
     * @sample AWSmgn.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Updates multiple LaunchConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @return Result of the UpdateLaunchConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Allows you to update multiple ReplicationConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @return Result of the UpdateReplicationConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfiguration"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Updates multiple ReplicationConfigurationTemplates by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @return Result of the UpdateReplicationConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfigurationTemplate"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
