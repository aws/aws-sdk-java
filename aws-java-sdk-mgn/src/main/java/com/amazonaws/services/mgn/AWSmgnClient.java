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
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UninitializedAccountException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.UninitializedAccountExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mgn.model.transform.ConflictExceptionUnmarshaller.getInstance()))
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
     * Archive application.
     * </p>
     * 
     * @param archiveApplicationRequest
     * @return Result of the ArchiveApplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.ArchiveApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ArchiveApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ArchiveApplicationResult archiveApplication(ArchiveApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeArchiveApplication(request);
    }

    @SdkInternalApi
    final ArchiveApplicationResult executeArchiveApplication(ArchiveApplicationRequest archiveApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(archiveApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ArchiveApplicationRequest> request = null;
        Response<ArchiveApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ArchiveApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(archiveApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ArchiveApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ArchiveApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ArchiveApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Archive wave.
     * </p>
     * 
     * @param archiveWaveRequest
     * @return Result of the ArchiveWave operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.ArchiveWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ArchiveWave" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ArchiveWaveResult archiveWave(ArchiveWaveRequest request) {
        request = beforeClientExecution(request);
        return executeArchiveWave(request);
    }

    @SdkInternalApi
    final ArchiveWaveResult executeArchiveWave(ArchiveWaveRequest archiveWaveRequest) {

        ExecutionContext executionContext = createExecutionContext(archiveWaveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ArchiveWaveRequest> request = null;
        Response<ArchiveWaveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ArchiveWaveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(archiveWaveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ArchiveWave");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ArchiveWaveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ArchiveWaveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate applications to wave.
     * </p>
     * 
     * @param associateApplicationsRequest
     * @return Result of the AssociateApplications operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.AssociateApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/AssociateApplications" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateApplicationsResult associateApplications(AssociateApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateApplications(request);
    }

    @SdkInternalApi
    final AssociateApplicationsResult executeAssociateApplications(AssociateApplicationsRequest associateApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateApplicationsRequest> request = null;
        Response<AssociateApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateApplicationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate source servers to application.
     * </p>
     * 
     * @param associateSourceServersRequest
     * @return Result of the AssociateSourceServers operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.AssociateSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/AssociateSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateSourceServersResult associateSourceServers(AssociateSourceServersRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSourceServers(request);
    }

    @SdkInternalApi
    final AssociateSourceServersResult executeAssociateSourceServers(AssociateSourceServersRequest associateSourceServersRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSourceServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSourceServersRequest> request = null;
        Response<AssociateSourceServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSourceServersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateSourceServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSourceServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSourceServersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateSourceServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *         Uninitialized account exception.
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
     * Create application.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Launch Configuration Template.
     * </p>
     * 
     * @param createLaunchConfigurationTemplateRequest
     * @return Result of the CreateLaunchConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.CreateLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLaunchConfigurationTemplateResult createLaunchConfigurationTemplate(CreateLaunchConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLaunchConfigurationTemplate(request);
    }

    @SdkInternalApi
    final CreateLaunchConfigurationTemplateResult executeCreateLaunchConfigurationTemplate(
            CreateLaunchConfigurationTemplateRequest createLaunchConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createLaunchConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLaunchConfigurationTemplateRequest> request = null;
        Response<CreateLaunchConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLaunchConfigurationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLaunchConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLaunchConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLaunchConfigurationTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLaunchConfigurationTemplateResultJsonUnmarshaller());
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
     *         Uninitialized account exception.
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
     * Create wave.
     * </p>
     * 
     * @param createWaveRequest
     * @return Result of the CreateWave operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.CreateWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateWave" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWaveResult createWave(CreateWaveRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWave(request);
    }

    @SdkInternalApi
    final CreateWaveResult executeCreateWave(CreateWaveRequest createWaveRequest) {

        ExecutionContext executionContext = createExecutionContext(createWaveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWaveRequest> request = null;
        Response<CreateWaveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWaveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWaveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWave");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWaveResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWaveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
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
     *         Uninitialized account exception.
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
     * Deletes a single Launch Configuration Template by ID.
     * </p>
     * 
     * @param deleteLaunchConfigurationTemplateRequest
     * @return Result of the DeleteLaunchConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLaunchConfigurationTemplateResult deleteLaunchConfigurationTemplate(DeleteLaunchConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLaunchConfigurationTemplate(request);
    }

    @SdkInternalApi
    final DeleteLaunchConfigurationTemplateResult executeDeleteLaunchConfigurationTemplate(
            DeleteLaunchConfigurationTemplateRequest deleteLaunchConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLaunchConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLaunchConfigurationTemplateRequest> request = null;
        Response<DeleteLaunchConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLaunchConfigurationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLaunchConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLaunchConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLaunchConfigurationTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLaunchConfigurationTemplateResultJsonUnmarshaller());
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
     *         Uninitialized account exception.
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
     *         Uninitialized account exception.
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
     * Deletes a given vCenter client by ID.
     * </p>
     * 
     * @param deleteVcenterClientRequest
     * @return Result of the DeleteVcenterClient operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DeleteVcenterClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteVcenterClient" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVcenterClientResult deleteVcenterClient(DeleteVcenterClientRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVcenterClient(request);
    }

    @SdkInternalApi
    final DeleteVcenterClientResult executeDeleteVcenterClient(DeleteVcenterClientRequest deleteVcenterClientRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVcenterClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVcenterClientRequest> request = null;
        Response<DeleteVcenterClientResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVcenterClientRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVcenterClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVcenterClient");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVcenterClientResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVcenterClientResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete wave.
     * </p>
     * 
     * @param deleteWaveRequest
     * @return Result of the DeleteWave operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteWave" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWaveResult deleteWave(DeleteWaveRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWave(request);
    }

    @SdkInternalApi
    final DeleteWaveResult executeDeleteWave(DeleteWaveRequest deleteWaveRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWaveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWaveRequest> request = null;
        Response<DeleteWaveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWaveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWaveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWave");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWaveResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWaveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves detailed job log items with paging.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @return Result of the DescribeJobLogItems operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
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
     * response is sorted by creationDataTime - latest date first. Jobs are normally created by the StartTest,
     * StartCutover, and TerminateTargetInstances APIs. Jobs are also created by DiagnosticLaunch and
     * TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant
     * support tickets.
     * </p>
     * 
     * @param describeJobsRequest
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
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
     * Lists all Launch Configuration Templates, filtered by Launch Configuration Template IDs
     * </p>
     * 
     * @param describeLaunchConfigurationTemplatesRequest
     * @return Result of the DescribeLaunchConfigurationTemplates operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeLaunchConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeLaunchConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLaunchConfigurationTemplatesResult describeLaunchConfigurationTemplates(DescribeLaunchConfigurationTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLaunchConfigurationTemplates(request);
    }

    @SdkInternalApi
    final DescribeLaunchConfigurationTemplatesResult executeDescribeLaunchConfigurationTemplates(
            DescribeLaunchConfigurationTemplatesRequest describeLaunchConfigurationTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLaunchConfigurationTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLaunchConfigurationTemplatesRequest> request = null;
        Response<DescribeLaunchConfigurationTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLaunchConfigurationTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLaunchConfigurationTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLaunchConfigurationTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLaunchConfigurationTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLaunchConfigurationTemplatesResultJsonUnmarshaller());
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
     *         Uninitialized account exception.
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
     *         Uninitialized account exception.
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
     * Returns a list of the installed vCenter clients.
     * </p>
     * 
     * @param describeVcenterClientsRequest
     * @return Result of the DescribeVcenterClients operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeVcenterClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeVcenterClients" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeVcenterClientsResult describeVcenterClients(DescribeVcenterClientsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVcenterClients(request);
    }

    @SdkInternalApi
    final DescribeVcenterClientsResult executeDescribeVcenterClients(DescribeVcenterClientsRequest describeVcenterClientsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVcenterClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVcenterClientsRequest> request = null;
        Response<DescribeVcenterClientsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVcenterClientsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVcenterClientsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVcenterClients");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVcenterClientsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeVcenterClientsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociate applications from wave.
     * </p>
     * 
     * @param disassociateApplicationsRequest
     * @return Result of the DisassociateApplications operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DisassociateApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisassociateApplications" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateApplicationsResult disassociateApplications(DisassociateApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateApplications(request);
    }

    @SdkInternalApi
    final DisassociateApplicationsResult executeDisassociateApplications(DisassociateApplicationsRequest disassociateApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateApplicationsRequest> request = null;
        Response<DisassociateApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociate source servers from application.
     * </p>
     * 
     * @param disassociateSourceServersRequest
     * @return Result of the DisassociateSourceServers operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DisassociateSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisassociateSourceServers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateSourceServersResult disassociateSourceServers(DisassociateSourceServersRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSourceServers(request);
    }

    @SdkInternalApi
    final DisassociateSourceServersResult executeDisassociateSourceServers(DisassociateSourceServersRequest disassociateSourceServersRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSourceServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSourceServersRequest> request = null;
        Response<DisassociateSourceServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSourceServersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateSourceServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSourceServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSourceServersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateSourceServersResultJsonUnmarshaller());
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
     * agent on the source server has not been prevented from communicating with the Application Migration Service
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectFromServiceRequest
     * @return Result of the DisconnectFromService operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
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
     * dataReplicationInfo.dataReplicationState will be changed to DISCONNECTED; The SourceServer.lifeCycle.state will
     * be changed to CUTOVER; The totalStorageBytes property fo each of dataReplicationInfo.replicatedDisks will be set
     * to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param finalizeCutoverRequest
     * @return Result of the FinalizeCutover operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
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
     *         Uninitialized account exception.
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
     *         Uninitialized account exception.
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
     * Retrieves all applications or multiple applications by ID.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @sample AWSmgn.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List source server post migration custom actions.
     * </p>
     * 
     * @param listSourceServerActionsRequest
     * @return Result of the ListSourceServerActions operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @sample AWSmgn.ListSourceServerActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListSourceServerActions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSourceServerActionsResult listSourceServerActions(ListSourceServerActionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSourceServerActions(request);
    }

    @SdkInternalApi
    final ListSourceServerActionsResult executeListSourceServerActions(ListSourceServerActionsRequest listSourceServerActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSourceServerActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSourceServerActionsRequest> request = null;
        Response<ListSourceServerActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSourceServerActionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSourceServerActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSourceServerActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSourceServerActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSourceServerActionsResultJsonUnmarshaller());
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
     * List template post migration custom actions.
     * </p>
     * 
     * @param listTemplateActionsRequest
     * @return Result of the ListTemplateActions operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @sample AWSmgn.ListTemplateActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTemplateActions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTemplateActionsResult listTemplateActions(ListTemplateActionsRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateActions(request);
    }

    @SdkInternalApi
    final ListTemplateActionsResult executeListTemplateActions(ListTemplateActionsRequest listTemplateActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateActionsRequest> request = null;
        Response<ListTemplateActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateActionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplateActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplateActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all waves or multiple waves by ID.
     * </p>
     * 
     * @param listWavesRequest
     * @return Result of the ListWaves operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @sample AWSmgn.ListWaves
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListWaves" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWavesResult listWaves(ListWavesRequest request) {
        request = beforeClientExecution(request);
        return executeListWaves(request);
    }

    @SdkInternalApi
    final ListWavesResult executeListWaves(ListWavesRequest listWavesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWavesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWavesRequest> request = null;
        Response<ListWavesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWavesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWavesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWaves");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWavesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWavesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Archives specific Source Servers by setting the SourceServer.isArchived property to true for specified
     * SourceServers by ID. This command only works for SourceServers with a lifecycle. state which equals DISCONNECTED
     * or CUTOVER.
     * </p>
     * 
     * @param markAsArchivedRequest
     * @return Result of the MarkAsArchived operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
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
     * Put source server post migration custom action.
     * </p>
     * 
     * @param putSourceServerActionRequest
     * @return Result of the PutSourceServerAction operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.PutSourceServerAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PutSourceServerAction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutSourceServerActionResult putSourceServerAction(PutSourceServerActionRequest request) {
        request = beforeClientExecution(request);
        return executePutSourceServerAction(request);
    }

    @SdkInternalApi
    final PutSourceServerActionResult executePutSourceServerAction(PutSourceServerActionRequest putSourceServerActionRequest) {

        ExecutionContext executionContext = createExecutionContext(putSourceServerActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSourceServerActionRequest> request = null;
        Response<PutSourceServerActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSourceServerActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSourceServerActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSourceServerAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSourceServerActionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutSourceServerActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Put template post migration custom action.
     * </p>
     * 
     * @param putTemplateActionRequest
     * @return Result of the PutTemplateAction operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.PutTemplateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PutTemplateAction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutTemplateActionResult putTemplateAction(PutTemplateActionRequest request) {
        request = beforeClientExecution(request);
        return executePutTemplateAction(request);
    }

    @SdkInternalApi
    final PutTemplateActionResult executePutTemplateAction(PutTemplateActionRequest putTemplateActionRequest) {

        ExecutionContext executionContext = createExecutionContext(putTemplateActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutTemplateActionRequest> request = null;
        Response<PutTemplateActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutTemplateActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putTemplateActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutTemplateAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutTemplateActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutTemplateActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove source server post migration custom action.
     * </p>
     * 
     * @param removeSourceServerActionRequest
     * @return Result of the RemoveSourceServerAction operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.RemoveSourceServerAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RemoveSourceServerAction" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveSourceServerActionResult removeSourceServerAction(RemoveSourceServerActionRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveSourceServerAction(request);
    }

    @SdkInternalApi
    final RemoveSourceServerActionResult executeRemoveSourceServerAction(RemoveSourceServerActionRequest removeSourceServerActionRequest) {

        ExecutionContext executionContext = createExecutionContext(removeSourceServerActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveSourceServerActionRequest> request = null;
        Response<RemoveSourceServerActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveSourceServerActionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeSourceServerActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveSourceServerAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveSourceServerActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveSourceServerActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove template post migration custom action.
     * </p>
     * 
     * @param removeTemplateActionRequest
     * @return Result of the RemoveTemplateAction operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.RemoveTemplateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RemoveTemplateAction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveTemplateActionResult removeTemplateAction(RemoveTemplateActionRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTemplateAction(request);
    }

    @SdkInternalApi
    final RemoveTemplateActionResult executeRemoveTemplateAction(RemoveTemplateActionRequest removeTemplateActionRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTemplateActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTemplateActionRequest> request = null;
        Response<RemoveTemplateActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTemplateActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTemplateActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTemplateAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTemplateActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTemplateActionResultJsonUnmarshaller());
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
     *         Uninitialized account exception.
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
     *         Uninitialized account exception.
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
     * Starts replication for SNAPSHOT_SHIPPING agents.
     * </p>
     * 
     * @param startReplicationRequest
     * @return Result of the StartReplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartReplication" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
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
     * Launches a Test Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property
     * is StartTest and changes the SourceServer.lifeCycle.state property to TESTING.
     * </p>
     * 
     * @param startTestRequest
     * @return Result of the StartTest operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
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
     *         Uninitialized account exception.
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
     * Unarchive application.
     * </p>
     * 
     * @param unarchiveApplicationRequest
     * @return Result of the UnarchiveApplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @sample AWSmgn.UnarchiveApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UnarchiveApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnarchiveApplicationResult unarchiveApplication(UnarchiveApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUnarchiveApplication(request);
    }

    @SdkInternalApi
    final UnarchiveApplicationResult executeUnarchiveApplication(UnarchiveApplicationRequest unarchiveApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(unarchiveApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnarchiveApplicationRequest> request = null;
        Response<UnarchiveApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnarchiveApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unarchiveApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnarchiveApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnarchiveApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnarchiveApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unarchive wave.
     * </p>
     * 
     * @param unarchiveWaveRequest
     * @return Result of the UnarchiveWave operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @sample AWSmgn.UnarchiveWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UnarchiveWave" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnarchiveWaveResult unarchiveWave(UnarchiveWaveRequest request) {
        request = beforeClientExecution(request);
        return executeUnarchiveWave(request);
    }

    @SdkInternalApi
    final UnarchiveWaveResult executeUnarchiveWave(UnarchiveWaveRequest unarchiveWaveRequest) {

        ExecutionContext executionContext = createExecutionContext(unarchiveWaveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnarchiveWaveRequest> request = null;
        Response<UnarchiveWaveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnarchiveWaveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unarchiveWaveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UnarchiveWave");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnarchiveWaveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnarchiveWaveResultJsonUnmarshaller());
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
     * Update application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
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
     *         Uninitialized account exception.
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
     * Updates an existing Launch Configuration Template by ID.
     * </p>
     * 
     * @param updateLaunchConfigurationTemplateRequest
     * @return Result of the UpdateLaunchConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.UpdateLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLaunchConfigurationTemplateResult updateLaunchConfigurationTemplate(UpdateLaunchConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLaunchConfigurationTemplate(request);
    }

    @SdkInternalApi
    final UpdateLaunchConfigurationTemplateResult executeUpdateLaunchConfigurationTemplate(
            UpdateLaunchConfigurationTemplateRequest updateLaunchConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLaunchConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLaunchConfigurationTemplateRequest> request = null;
        Response<UpdateLaunchConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLaunchConfigurationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLaunchConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLaunchConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLaunchConfigurationTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLaunchConfigurationTemplateResultJsonUnmarshaller());
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
     *         Uninitialized account exception.
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
     *         Uninitialized account exception.
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
     * <p>
     * Allows you to change between the AGENT_BASED replication type and the SNAPSHOT_SHIPPING replication type.
     * </p>
     * 
     * @param updateSourceServerReplicationTypeRequest
     * @return Result of the UpdateSourceServerReplicationType operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.UpdateSourceServerReplicationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateSourceServerReplicationType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSourceServerReplicationTypeResult updateSourceServerReplicationType(UpdateSourceServerReplicationTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSourceServerReplicationType(request);
    }

    @SdkInternalApi
    final UpdateSourceServerReplicationTypeResult executeUpdateSourceServerReplicationType(
            UpdateSourceServerReplicationTypeRequest updateSourceServerReplicationTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSourceServerReplicationTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSourceServerReplicationTypeRequest> request = null;
        Response<UpdateSourceServerReplicationTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSourceServerReplicationTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSourceServerReplicationTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSourceServerReplicationType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSourceServerReplicationTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSourceServerReplicationTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update wave.
     * </p>
     * 
     * @param updateWaveRequest
     * @return Result of the UpdateWave operation returned by the service.
     * @throws UninitializedAccountException
     *         Uninitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.UpdateWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateWave" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWaveResult updateWave(UpdateWaveRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWave(request);
    }

    @SdkInternalApi
    final UpdateWaveResult executeUpdateWave(UpdateWaveRequest updateWaveRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWaveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWaveRequest> request = null;
        Response<UpdateWaveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWaveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWaveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "mgn");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWave");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWaveResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWaveResultJsonUnmarshaller());
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
