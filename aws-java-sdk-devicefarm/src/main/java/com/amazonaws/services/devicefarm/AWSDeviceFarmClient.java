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
package com.amazonaws.services.devicefarm;

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

import com.amazonaws.services.devicefarm.AWSDeviceFarmClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.services.devicefarm.model.transform.*;

/**
 * Client for accessing AWS Device Farm. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Device Farm is a service that enables mobile app developers to test Android, iOS, and Fire OS apps on physical
 * phones, tablets, and other devices in the cloud.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDeviceFarmClient extends AmazonWebServiceClient implements AWSDeviceFarm {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDeviceFarm.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "devicefarm";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotEligibleException").withModeledClass(
                                    com.amazonaws.services.devicefarm.model.NotEligibleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withModeledClass(
                                    com.amazonaws.services.devicefarm.model.InvalidOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ArgumentException").withModeledClass(
                                    com.amazonaws.services.devicefarm.model.ArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.devicefarm.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.devicefarm.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceAccountException").withModeledClass(
                                    com.amazonaws.services.devicefarm.model.ServiceAccountException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotencyException").withModeledClass(
                                    com.amazonaws.services.devicefarm.model.IdempotencyException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.devicefarm.model.AWSDeviceFarmException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSDeviceFarmClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSDeviceFarmClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Device Farm (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSDeviceFarmClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDeviceFarmClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSDeviceFarmClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSDeviceFarmClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSDeviceFarmClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Device Farm (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSDeviceFarmClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDeviceFarmClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSDeviceFarmClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDeviceFarmClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Device Farm (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSDeviceFarmClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDeviceFarmClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Device Farm (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSDeviceFarmClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDeviceFarmClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSDeviceFarmClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSDeviceFarmClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSDeviceFarmClientBuilder builder() {
        return AWSDeviceFarmClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDeviceFarmClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Device Farm using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDeviceFarmClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://devicefarm.us-west-2.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/devicefarm/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/devicefarm/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a device pool.
     * </p>
     * 
     * @param createDevicePoolRequest
     *        Represents a request to the create device pool operation.
     * @return Result of the CreateDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDevicePoolResult createDevicePool(CreateDevicePoolRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDevicePool(request);
    }

    @SdkInternalApi
    final CreateDevicePoolResult executeCreateDevicePool(CreateDevicePoolRequest createDevicePoolRequest) {

        ExecutionContext executionContext = createExecutionContext(createDevicePoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDevicePoolRequest> request = null;
        Response<CreateDevicePoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDevicePoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDevicePoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDevicePool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDevicePoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDevicePoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a profile that can be applied to one or more private fleet device instances.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return Result of the CreateInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstanceProfile(request);
    }

    @SdkInternalApi
    final CreateInstanceProfileResult executeCreateInstanceProfile(CreateInstanceProfileRequest createInstanceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceProfileRequest> request = null;
        Response<CreateInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateInstanceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a network profile.
     * </p>
     * 
     * @param createNetworkProfileRequest
     * @return Result of the CreateNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateNetworkProfileResult createNetworkProfile(CreateNetworkProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNetworkProfile(request);
    }

    @SdkInternalApi
    final CreateNetworkProfileResult executeCreateNetworkProfile(CreateNetworkProfileRequest createNetworkProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkProfileRequest> request = null;
        Response<CreateNetworkProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNetworkProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNetworkProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNetworkProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNetworkProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new project.
     * </p>
     * 
     * @param createProjectRequest
     *        Represents a request to the create project operation.
     * @return Result of the CreateProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies and starts a remote access session.
     * </p>
     * 
     * @param createRemoteAccessSessionRequest
     *        Creates and submits a request to start a remote access session.
     * @return Result of the CreateRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRemoteAccessSessionResult createRemoteAccessSession(CreateRemoteAccessSessionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRemoteAccessSession(request);
    }

    @SdkInternalApi
    final CreateRemoteAccessSessionResult executeCreateRemoteAccessSession(CreateRemoteAccessSessionRequest createRemoteAccessSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(createRemoteAccessSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRemoteAccessSessionRequest> request = null;
        Response<CreateRemoteAccessSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRemoteAccessSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRemoteAccessSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRemoteAccessSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRemoteAccessSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRemoteAccessSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads an app or test scripts.
     * </p>
     * 
     * @param createUploadRequest
     *        Represents a request to the create upload operation.
     * @return Result of the CreateUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateUpload" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUploadResult createUpload(CreateUploadRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUpload(request);
    }

    @SdkInternalApi
    final CreateUploadResult executeCreateUpload(CreateUploadRequest createUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(createUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUploadRequest> request = null;
        Response<CreateUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param createVPCEConfigurationRequest
     * @return Result of the CreateVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.CreateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVPCEConfigurationResult createVPCEConfiguration(CreateVPCEConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVPCEConfiguration(request);
    }

    @SdkInternalApi
    final CreateVPCEConfigurationResult executeCreateVPCEConfiguration(CreateVPCEConfigurationRequest createVPCEConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createVPCEConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVPCEConfigurationRequest> request = null;
        Response<CreateVPCEConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVPCEConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createVPCEConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVPCEConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVPCEConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVPCEConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     * </p>
     * 
     * @param deleteDevicePoolRequest
     *        Represents a request to the delete device pool operation.
     * @return Result of the DeleteDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDevicePoolResult deleteDevicePool(DeleteDevicePoolRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDevicePool(request);
    }

    @SdkInternalApi
    final DeleteDevicePoolResult executeDeleteDevicePool(DeleteDevicePoolRequest deleteDevicePoolRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDevicePoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDevicePoolRequest> request = null;
        Response<DeleteDevicePoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDevicePoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDevicePoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDevicePool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDevicePoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDevicePoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a profile that can be applied to one or more private device instances.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @return Result of the DeleteInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInstanceProfileResult deleteInstanceProfile(DeleteInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstanceProfile(request);
    }

    @SdkInternalApi
    final DeleteInstanceProfileResult executeDeleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceProfileRequest> request = null;
        Response<DeleteInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteInstanceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a network profile.
     * </p>
     * 
     * @param deleteNetworkProfileRequest
     * @return Result of the DeleteNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNetworkProfileResult deleteNetworkProfile(DeleteNetworkProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNetworkProfile(request);
    }

    @SdkInternalApi
    final DeleteNetworkProfileResult executeDeleteNetworkProfile(DeleteNetworkProfileRequest deleteNetworkProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNetworkProfileRequest> request = null;
        Response<DeleteNetworkProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNetworkProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNetworkProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNetworkProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNetworkProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNetworkProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS Device Farm project, given the project ARN.
     * </p>
     * <p>
     * <b>Note</b> Deleting this resource does not stop an in-progress run.
     * </p>
     * 
     * @param deleteProjectRequest
     *        Represents a request to the delete project operation.
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a completed remote access session and its results.
     * </p>
     * 
     * @param deleteRemoteAccessSessionRequest
     *        Represents the request to delete the specified remote access session.
     * @return Result of the DeleteRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRemoteAccessSessionResult deleteRemoteAccessSession(DeleteRemoteAccessSessionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRemoteAccessSession(request);
    }

    @SdkInternalApi
    final DeleteRemoteAccessSessionResult executeDeleteRemoteAccessSession(DeleteRemoteAccessSessionRequest deleteRemoteAccessSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRemoteAccessSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRemoteAccessSessionRequest> request = null;
        Response<DeleteRemoteAccessSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRemoteAccessSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRemoteAccessSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRemoteAccessSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRemoteAccessSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRemoteAccessSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the run, given the run ARN.
     * </p>
     * <p>
     * <b>Note</b> Deleting this resource does not stop an in-progress run.
     * </p>
     * 
     * @param deleteRunRequest
     *        Represents a request to the delete run operation.
     * @return Result of the DeleteRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRunResult deleteRun(DeleteRunRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRun(request);
    }

    @SdkInternalApi
    final DeleteRunResult executeDeleteRun(DeleteRunRequest deleteRunRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRunRequest> request = null;
        Response<DeleteRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an upload given the upload ARN.
     * </p>
     * 
     * @param deleteUploadRequest
     *        Represents a request to the delete upload operation.
     * @return Result of the DeleteUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.DeleteUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteUpload" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUploadResult deleteUpload(DeleteUploadRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUpload(request);
    }

    @SdkInternalApi
    final DeleteUploadResult executeDeleteUpload(DeleteUploadRequest deleteUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUploadRequest> request = null;
        Response<DeleteUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param deleteVPCEConfigurationRequest
     * @return Result of the DeleteVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @throws InvalidOperationException
     *         There was an error with the update request, or you do not have sufficient permissions to update this VPC
     *         endpoint configuration.
     * @sample AWSDeviceFarm.DeleteVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeleteVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVPCEConfigurationResult deleteVPCEConfiguration(DeleteVPCEConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVPCEConfiguration(request);
    }

    @SdkInternalApi
    final DeleteVPCEConfigurationResult executeDeleteVPCEConfiguration(DeleteVPCEConfigurationRequest deleteVPCEConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVPCEConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVPCEConfigurationRequest> request = null;
        Response<DeleteVPCEConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVPCEConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVPCEConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVPCEConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVPCEConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVPCEConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     * </p>
     * 
     * @param getAccountSettingsRequest
     *        Represents the request sent to retrieve the account settings.
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSettings(request);
    }

    @SdkInternalApi
    final GetAccountSettingsResult executeGetAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a unique device type.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents a request to the get device request.
     * @return Result of the GetDevice operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeviceResult getDevice(GetDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevice(request);
    }

    @SdkInternalApi
    final GetDeviceResult executeGetDevice(GetDeviceRequest getDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceRequest> request = null;
        Response<GetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a device instance belonging to a private device fleet.
     * </p>
     * 
     * @param getDeviceInstanceRequest
     * @return Result of the GetDeviceInstance operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDeviceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDeviceInstanceResult getDeviceInstance(GetDeviceInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeviceInstance(request);
    }

    @SdkInternalApi
    final GetDeviceInstanceResult executeGetDeviceInstance(GetDeviceInstanceRequest getDeviceInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceInstanceRequest> request = null;
        Response<GetDeviceInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeviceInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a device pool.
     * </p>
     * 
     * @param getDevicePoolRequest
     *        Represents a request to the get device pool operation.
     * @return Result of the GetDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePool" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDevicePoolResult getDevicePool(GetDevicePoolRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevicePool(request);
    }

    @SdkInternalApi
    final GetDevicePoolResult executeGetDevicePool(GetDevicePoolRequest getDevicePoolRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevicePoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicePoolRequest> request = null;
        Response<GetDevicePoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicePoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDevicePoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevicePool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevicePoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDevicePoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about compatibility with a device pool.
     * </p>
     * 
     * @param getDevicePoolCompatibilityRequest
     *        Represents a request to the get device pool compatibility operation.
     * @return Result of the GetDevicePoolCompatibility operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetDevicePoolCompatibility
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetDevicePoolCompatibility"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDevicePoolCompatibilityResult getDevicePoolCompatibility(GetDevicePoolCompatibilityRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevicePoolCompatibility(request);
    }

    @SdkInternalApi
    final GetDevicePoolCompatibilityResult executeGetDevicePoolCompatibility(GetDevicePoolCompatibilityRequest getDevicePoolCompatibilityRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevicePoolCompatibilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicePoolCompatibilityRequest> request = null;
        Response<GetDevicePoolCompatibilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicePoolCompatibilityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDevicePoolCompatibilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevicePoolCompatibility");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevicePoolCompatibilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDevicePoolCompatibilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified instance profile.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return Result of the GetInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetInstanceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceProfile(request);
    }

    @SdkInternalApi
    final GetInstanceProfileResult executeGetInstanceProfile(GetInstanceProfileRequest getInstanceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceProfileRequest> request = null;
        Response<GetInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a job.
     * </p>
     * 
     * @param getJobRequest
     *        Represents a request to the get job operation.
     * @return Result of the GetJob operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobResult getJob(GetJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetJob(request);
    }

    @SdkInternalApi
    final GetJobResult executeGetJob(GetJobRequest getJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a network profile.
     * </p>
     * 
     * @param getNetworkProfileRequest
     * @return Result of the GetNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetNetworkProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetNetworkProfileResult getNetworkProfile(GetNetworkProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkProfile(request);
    }

    @SdkInternalApi
    final GetNetworkProfileResult executeGetNetworkProfile(GetNetworkProfileRequest getNetworkProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkProfileRequest> request = null;
        Response<GetNetworkProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates
     * how many offerings are currently available and the offerings that will be available in the next period. The API
     * returns a <code>NotEligible</code> error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param getOfferingStatusRequest
     *        Represents the request to retrieve the offering status for the specified customer or account.
     * @return Result of the GetOfferingStatus operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetOfferingStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetOfferingStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetOfferingStatusResult getOfferingStatus(GetOfferingStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetOfferingStatus(request);
    }

    @SdkInternalApi
    final GetOfferingStatusResult executeGetOfferingStatus(GetOfferingStatusRequest getOfferingStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getOfferingStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOfferingStatusRequest> request = null;
        Response<GetOfferingStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOfferingStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOfferingStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOfferingStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOfferingStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOfferingStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a project.
     * </p>
     * 
     * @param getProjectRequest
     *        Represents a request to the get project operation.
     * @return Result of the GetProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProjectResult getProject(GetProjectRequest request) {
        request = beforeClientExecution(request);
        return executeGetProject(request);
    }

    @SdkInternalApi
    final GetProjectResult executeGetProject(GetProjectRequest getProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(getProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProjectRequest> request = null;
        Response<GetProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a link to a currently running remote access session.
     * </p>
     * 
     * @param getRemoteAccessSessionRequest
     *        Represents the request to get information about the specified remote access session.
     * @return Result of the GetRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRemoteAccessSessionResult getRemoteAccessSession(GetRemoteAccessSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetRemoteAccessSession(request);
    }

    @SdkInternalApi
    final GetRemoteAccessSessionResult executeGetRemoteAccessSession(GetRemoteAccessSessionRequest getRemoteAccessSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getRemoteAccessSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRemoteAccessSessionRequest> request = null;
        Response<GetRemoteAccessSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRemoteAccessSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRemoteAccessSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRemoteAccessSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRemoteAccessSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRemoteAccessSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a run.
     * </p>
     * 
     * @param getRunRequest
     *        Represents a request to the get run operation.
     * @return Result of the GetRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRunResult getRun(GetRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetRun(request);
    }

    @SdkInternalApi
    final GetRunResult executeGetRun(GetRunRequest getRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRunRequest> request = null;
        Response<GetRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a suite.
     * </p>
     * 
     * @param getSuiteRequest
     *        Represents a request to the get suite operation.
     * @return Result of the GetSuite operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetSuite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSuiteResult getSuite(GetSuiteRequest request) {
        request = beforeClientExecution(request);
        return executeGetSuite(request);
    }

    @SdkInternalApi
    final GetSuiteResult executeGetSuite(GetSuiteRequest getSuiteRequest) {

        ExecutionContext executionContext = createExecutionContext(getSuiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSuiteRequest> request = null;
        Response<GetSuiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSuiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSuiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSuite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSuiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSuiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a test.
     * </p>
     * 
     * @param getTestRequest
     *        Represents a request to the get test operation.
     * @return Result of the GetTest operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetTest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetTest" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTestResult getTest(GetTestRequest request) {
        request = beforeClientExecution(request);
        return executeGetTest(request);
    }

    @SdkInternalApi
    final GetTestResult executeGetTest(GetTestRequest getTestRequest) {

        ExecutionContext executionContext = createExecutionContext(getTestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTestRequest> request = null;
        Response<GetTestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTestResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an upload.
     * </p>
     * 
     * @param getUploadRequest
     *        Represents a request to the get upload operation.
     * @return Result of the GetUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetUpload" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUploadResult getUpload(GetUploadRequest request) {
        request = beforeClientExecution(request);
        return executeGetUpload(request);
    }

    @SdkInternalApi
    final GetUploadResult executeGetUpload(GetUploadRequest getUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(getUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUploadRequest> request = null;
        Response<GetUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUploadResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     * </p>
     * 
     * @param getVPCEConfigurationRequest
     * @return Result of the GetVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.GetVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVPCEConfigurationResult getVPCEConfiguration(GetVPCEConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVPCEConfiguration(request);
    }

    @SdkInternalApi
    final GetVPCEConfigurationResult executeGetVPCEConfiguration(GetVPCEConfigurationRequest getVPCEConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVPCEConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVPCEConfigurationRequest> request = null;
        Response<GetVPCEConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVPCEConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVPCEConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVPCEConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVPCEConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVPCEConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Installs an application to the device in a remote access session. For Android applications, the file must be in
     * .apk format. For iOS applications, the file must be in .ipa format.
     * </p>
     * 
     * @param installToRemoteAccessSessionRequest
     *        Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa
     *        format) as part of a remote access session.
     * @return Result of the InstallToRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.InstallToRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/InstallToRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public InstallToRemoteAccessSessionResult installToRemoteAccessSession(InstallToRemoteAccessSessionRequest request) {
        request = beforeClientExecution(request);
        return executeInstallToRemoteAccessSession(request);
    }

    @SdkInternalApi
    final InstallToRemoteAccessSessionResult executeInstallToRemoteAccessSession(InstallToRemoteAccessSessionRequest installToRemoteAccessSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(installToRemoteAccessSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InstallToRemoteAccessSessionRequest> request = null;
        Response<InstallToRemoteAccessSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InstallToRemoteAccessSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(installToRemoteAccessSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InstallToRemoteAccessSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InstallToRemoteAccessSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new InstallToRemoteAccessSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about artifacts.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Represents a request to the list artifacts operation.
     * @return Result of the ListArtifacts operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListArtifactsResult listArtifacts(ListArtifactsRequest request) {
        request = beforeClientExecution(request);
        return executeListArtifacts(request);
    }

    @SdkInternalApi
    final ListArtifactsResult executeListArtifacts(ListArtifactsRequest listArtifactsRequest) {

        ExecutionContext executionContext = createExecutionContext(listArtifactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListArtifactsRequest> request = null;
        Response<ListArtifactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListArtifactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listArtifactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListArtifacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListArtifactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListArtifactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the private device instances associated with one or more AWS accounts.
     * </p>
     * 
     * @param listDeviceInstancesRequest
     * @return Result of the ListDeviceInstances operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListDeviceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDeviceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDeviceInstancesResult listDeviceInstances(ListDeviceInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListDeviceInstances(request);
    }

    @SdkInternalApi
    final ListDeviceInstancesResult executeListDeviceInstances(ListDeviceInstancesRequest listDeviceInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeviceInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceInstancesRequest> request = null;
        Response<ListDeviceInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeviceInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeviceInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeviceInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeviceInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about device pools.
     * </p>
     * 
     * @param listDevicePoolsRequest
     *        Represents the result of a list device pools request.
     * @return Result of the ListDevicePools operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListDevicePools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevicePools" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDevicePoolsResult listDevicePools(ListDevicePoolsRequest request) {
        request = beforeClientExecution(request);
        return executeListDevicePools(request);
    }

    @SdkInternalApi
    final ListDevicePoolsResult executeListDevicePools(ListDevicePoolsRequest listDevicePoolsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicePoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicePoolsRequest> request = null;
        Response<ListDevicePoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicePoolsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicePoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevicePools");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicePoolsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicePoolsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about unique device types.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the result of a list devices request.
     * @return Result of the ListDevices operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListDevices(request);
    }

    @SdkInternalApi
    final ListDevicesResult executeListDevices(ListDevicesRequest listDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all the instance profiles in an AWS account.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @return Result of the ListInstanceProfiles operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListInstanceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListInstanceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInstanceProfilesResult listInstanceProfiles(ListInstanceProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceProfiles(request);
    }

    @SdkInternalApi
    final ListInstanceProfilesResult executeListInstanceProfiles(ListInstanceProfilesRequest listInstanceProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstanceProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceProfilesRequest> request = null;
        Response<ListInstanceProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstanceProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstanceProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstanceProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about jobs for a given test run.
     * </p>
     * 
     * @param listJobsRequest
     *        Represents a request to the list jobs operation.
     * @return Result of the ListJobs operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of available network profiles.
     * </p>
     * 
     * @param listNetworkProfilesRequest
     * @return Result of the ListNetworkProfiles operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListNetworkProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListNetworkProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListNetworkProfilesResult listNetworkProfiles(ListNetworkProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListNetworkProfiles(request);
    }

    @SdkInternalApi
    final ListNetworkProfilesResult executeListNetworkProfiles(ListNetworkProfilesRequest listNetworkProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listNetworkProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNetworkProfilesRequest> request = null;
        Response<ListNetworkProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNetworkProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNetworkProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNetworkProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNetworkProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNetworkProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the
     * promotion. The API returns a <code>NotEligible</code> error if the caller is not permitted to invoke the
     * operation. Contact <a href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if
     * you believe that you should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingPromotionsRequest
     * @return Result of the ListOfferingPromotions operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListOfferingPromotions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingPromotions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOfferingPromotionsResult listOfferingPromotions(ListOfferingPromotionsRequest request) {
        request = beforeClientExecution(request);
        return executeListOfferingPromotions(request);
    }

    @SdkInternalApi
    final ListOfferingPromotionsResult executeListOfferingPromotions(ListOfferingPromotionsRequest listOfferingPromotionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOfferingPromotionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOfferingPromotionsRequest> request = null;
        Response<ListOfferingPromotionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOfferingPromotionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOfferingPromotionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOfferingPromotions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOfferingPromotionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOfferingPromotionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The
     * list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a
     * <code>NotEligible</code> error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingTransactionsRequest
     *        Represents the request to list the offering transaction history.
     * @return Result of the ListOfferingTransactions operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListOfferingTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferingTransactions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOfferingTransactionsResult listOfferingTransactions(ListOfferingTransactionsRequest request) {
        request = beforeClientExecution(request);
        return executeListOfferingTransactions(request);
    }

    @SdkInternalApi
    final ListOfferingTransactionsResult executeListOfferingTransactions(ListOfferingTransactionsRequest listOfferingTransactionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOfferingTransactionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOfferingTransactionsRequest> request = null;
        Response<ListOfferingTransactionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOfferingTransactionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOfferingTransactionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOfferingTransactions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOfferingTransactionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOfferingTransactionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates
     * the recurring price per unit and the frequency for that offering. The API returns a <code>NotEligible</code>
     * error if the user is not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param listOfferingsRequest
     *        Represents the request to list all offerings.
     * @return Result of the ListOfferings operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListOfferingsResult listOfferings(ListOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeListOfferings(request);
    }

    @SdkInternalApi
    final ListOfferingsResult executeListOfferings(ListOfferingsRequest listOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOfferingsRequest> request = null;
        Response<ListOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOfferingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOfferingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOfferingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about projects.
     * </p>
     * 
     * @param listProjectsRequest
     *        Represents a request to the list projects operation.
     * @return Result of the ListProjects operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all currently running remote access sessions.
     * </p>
     * 
     * @param listRemoteAccessSessionsRequest
     *        Represents the request to return information about the remote access session.
     * @return Result of the ListRemoteAccessSessions operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListRemoteAccessSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRemoteAccessSessions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRemoteAccessSessionsResult listRemoteAccessSessions(ListRemoteAccessSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeListRemoteAccessSessions(request);
    }

    @SdkInternalApi
    final ListRemoteAccessSessionsResult executeListRemoteAccessSessions(ListRemoteAccessSessionsRequest listRemoteAccessSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRemoteAccessSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRemoteAccessSessionsRequest> request = null;
        Response<ListRemoteAccessSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRemoteAccessSessionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRemoteAccessSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRemoteAccessSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRemoteAccessSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRemoteAccessSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about runs, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listRunsRequest
     *        Represents a request to the list runs operation.
     * @return Result of the ListRuns operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRunsResult listRuns(ListRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListRuns(request);
    }

    @SdkInternalApi
    final ListRunsResult executeListRuns(ListRunsRequest listRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRunsRequest> request = null;
        Response<ListRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRunsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about samples, given an AWS Device Farm job ARN.
     * </p>
     * 
     * @param listSamplesRequest
     *        Represents a request to the list samples operation.
     * @return Result of the ListSamples operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListSamples
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSamples" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSamplesResult listSamples(ListSamplesRequest request) {
        request = beforeClientExecution(request);
        return executeListSamples(request);
    }

    @SdkInternalApi
    final ListSamplesResult executeListSamples(ListSamplesRequest listSamplesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSamplesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSamplesRequest> request = null;
        Response<ListSamplesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSamplesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSamplesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSamples");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSamplesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSamplesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about test suites for a given job.
     * </p>
     * 
     * @param listSuitesRequest
     *        Represents a request to the list suites operation.
     * @return Result of the ListSuites operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListSuites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListSuites" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSuitesResult listSuites(ListSuitesRequest request) {
        request = beforeClientExecution(request);
        return executeListSuites(request);
    }

    @SdkInternalApi
    final ListSuitesResult executeListSuites(ListSuitesRequest listSuitesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSuitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSuitesRequest> request = null;
        Response<ListSuitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSuitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSuitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSuites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSuitesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSuitesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about tests in a given test suite.
     * </p>
     * 
     * @param listTestsRequest
     *        Represents a request to the list tests operation.
     * @return Result of the ListTests operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListTests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListTests" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTestsResult listTests(ListTestsRequest request) {
        request = beforeClientExecution(request);
        return executeListTests(request);
    }

    @SdkInternalApi
    final ListTestsResult executeListTests(ListTestsRequest listTestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestsRequest> request = null;
        Response<ListTestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about unique problems.
     * </p>
     * 
     * @param listUniqueProblemsRequest
     *        Represents a request to the list unique problems operation.
     * @return Result of the ListUniqueProblems operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListUniqueProblems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUniqueProblems" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListUniqueProblemsResult listUniqueProblems(ListUniqueProblemsRequest request) {
        request = beforeClientExecution(request);
        return executeListUniqueProblems(request);
    }

    @SdkInternalApi
    final ListUniqueProblemsResult executeListUniqueProblems(ListUniqueProblemsRequest listUniqueProblemsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUniqueProblemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUniqueProblemsRequest> request = null;
        Response<ListUniqueProblemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUniqueProblemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUniqueProblemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUniqueProblems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUniqueProblemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUniqueProblemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about uploads, given an AWS Device Farm project ARN.
     * </p>
     * 
     * @param listUploadsRequest
     *        Represents a request to the list uploads operation.
     * @return Result of the ListUploads operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListUploads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUploads" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUploadsResult listUploads(ListUploadsRequest request) {
        request = beforeClientExecution(request);
        return executeListUploads(request);
    }

    @SdkInternalApi
    final ListUploadsResult executeListUploads(ListUploadsRequest listUploadsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUploadsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUploadsRequest> request = null;
        Response<ListUploadsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUploadsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUploadsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUploads");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUploadsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUploadsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     * </p>
     * 
     * @param listVPCEConfigurationsRequest
     * @return Result of the ListVPCEConfigurations operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ListVPCEConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListVPCEConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVPCEConfigurationsResult listVPCEConfigurations(ListVPCEConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListVPCEConfigurations(request);
    }

    @SdkInternalApi
    final ListVPCEConfigurationsResult executeListVPCEConfigurations(ListVPCEConfigurationsRequest listVPCEConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVPCEConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVPCEConfigurationsRequest> request = null;
        Response<ListVPCEConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVPCEConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVPCEConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVPCEConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVPCEConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVPCEConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for
     * an offering, unless the renewal was overridden. The API returns a <code>NotEligible</code> error if the user is
     * not permitted to invoke the operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param purchaseOfferingRequest
     *        Represents a request for a purchase offering.
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseOffering(request);
    }

    @SdkInternalApi
    final PurchaseOfferingResult executePurchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseOfferingRequest> request = null;
        Response<PurchaseOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseOfferingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(purchaseOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PurchaseOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Explicitly sets the quantity of devices to renew for an offering, starting from the <code>effectiveDate</code> of
     * the next period. The API returns a <code>NotEligible</code> error if the user is not permitted to invoke the
     * operation. Please contact <a
     * href="mailto:aws-devicefarm-support@amazon.com">aws-devicefarm-support@amazon.com</a> if you believe that you
     * should be able to invoke this operation.
     * </p>
     * 
     * @param renewOfferingRequest
     *        A request representing an offering renewal.
     * @return Result of the RenewOffering operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws NotEligibleException
     *         Exception gets thrown when a user is not eligible to perform the specified transaction.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.RenewOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/RenewOffering" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RenewOfferingResult renewOffering(RenewOfferingRequest request) {
        request = beforeClientExecution(request);
        return executeRenewOffering(request);
    }

    @SdkInternalApi
    final RenewOfferingResult executeRenewOffering(RenewOfferingRequest renewOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(renewOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RenewOfferingRequest> request = null;
        Response<RenewOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RenewOfferingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(renewOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RenewOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RenewOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RenewOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Schedules a run.
     * </p>
     * 
     * @param scheduleRunRequest
     *        Represents a request to the schedule run operation.
     * @return Result of the ScheduleRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.ScheduleRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ScheduleRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ScheduleRunResult scheduleRun(ScheduleRunRequest request) {
        request = beforeClientExecution(request);
        return executeScheduleRun(request);
    }

    @SdkInternalApi
    final ScheduleRunResult executeScheduleRun(ScheduleRunRequest scheduleRunRequest) {

        ExecutionContext executionContext = createExecutionContext(scheduleRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScheduleRunRequest> request = null;
        Response<ScheduleRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScheduleRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(scheduleRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ScheduleRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ScheduleRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ScheduleRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where
     * tests have not started executing, and you will not be billed for this device. On the device where tests have
     * started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the
     * device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     * </p>
     * 
     * @param stopJobRequest
     * @return Result of the StopJob operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopJobResult stopJob(StopJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopJob(request);
    }

    @SdkInternalApi
    final StopJobResult executeStopJob(StopJobRequest stopJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopJobRequest> request = null;
        Response<StopJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Ends a specified remote access session.
     * </p>
     * 
     * @param stopRemoteAccessSessionRequest
     *        Represents the request to stop the remote access session.
     * @return Result of the StopRemoteAccessSession operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.StopRemoteAccessSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRemoteAccessSession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopRemoteAccessSessionResult stopRemoteAccessSession(StopRemoteAccessSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStopRemoteAccessSession(request);
    }

    @SdkInternalApi
    final StopRemoteAccessSessionResult executeStopRemoteAccessSession(StopRemoteAccessSessionRequest stopRemoteAccessSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopRemoteAccessSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopRemoteAccessSessionRequest> request = null;
        Response<StopRemoteAccessSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopRemoteAccessSessionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopRemoteAccessSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopRemoteAccessSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopRemoteAccessSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopRemoteAccessSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where
     * tests have not started executing, and you will not be billed for these devices. On devices where tests have
     * started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those
     * devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     * </p>
     * 
     * @param stopRunRequest
     *        Represents the request to stop a specific run.
     * @return Result of the StopRun operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.StopRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/StopRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopRunResult stopRun(StopRunRequest request) {
        request = beforeClientExecution(request);
        return executeStopRun(request);
    }

    @SdkInternalApi
    final StopRunResult executeStopRun(StopRunRequest stopRunRequest) {

        ExecutionContext executionContext = createExecutionContext(stopRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopRunRequest> request = null;
        Response<StopRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates information about an existing private device instance.
     * </p>
     * 
     * @param updateDeviceInstanceRequest
     * @return Result of the UpdateDeviceInstance operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateDeviceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDeviceInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDeviceInstanceResult updateDeviceInstance(UpdateDeviceInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDeviceInstance(request);
    }

    @SdkInternalApi
    final UpdateDeviceInstanceResult executeUpdateDeviceInstance(UpdateDeviceInstanceRequest updateDeviceInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceInstanceRequest> request = null;
        Response<UpdateDeviceInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDeviceInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates
     * are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     * </p>
     * 
     * @param updateDevicePoolRequest
     *        Represents a request to the update device pool operation.
     * @return Result of the UpdateDevicePool operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateDevicePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateDevicePool" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDevicePoolResult updateDevicePool(UpdateDevicePoolRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDevicePool(request);
    }

    @SdkInternalApi
    final UpdateDevicePoolResult executeUpdateDevicePool(UpdateDevicePoolRequest updateDevicePoolRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDevicePoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDevicePoolRequest> request = null;
        Response<UpdateDevicePoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDevicePoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDevicePoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDevicePool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDevicePoolResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDevicePoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates information about an existing private device instance profile.
     * </p>
     * 
     * @param updateInstanceProfileRequest
     * @return Result of the UpdateInstanceProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateInstanceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateInstanceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInstanceProfileResult updateInstanceProfile(UpdateInstanceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInstanceProfile(request);
    }

    @SdkInternalApi
    final UpdateInstanceProfileResult executeUpdateInstanceProfile(UpdateInstanceProfileRequest updateInstanceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInstanceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceProfileRequest> request = null;
        Response<UpdateInstanceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInstanceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInstanceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInstanceProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateInstanceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the network profile with specific settings.
     * </p>
     * 
     * @param updateNetworkProfileRequest
     * @return Result of the UpdateNetworkProfile operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateNetworkProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateNetworkProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNetworkProfileResult updateNetworkProfile(UpdateNetworkProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNetworkProfile(request);
    }

    @SdkInternalApi
    final UpdateNetworkProfileResult executeUpdateNetworkProfile(UpdateNetworkProfileRequest updateNetworkProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNetworkProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNetworkProfileRequest> request = null;
        Response<UpdateNetworkProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNetworkProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNetworkProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNetworkProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNetworkProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateNetworkProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified project name, given the project ARN and a new name.
     * </p>
     * 
     * @param updateProjectRequest
     *        Represents a request to the update project operation.
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an uploaded test specification (test spec).
     * </p>
     * 
     * @param updateUploadRequest
     * @return Result of the UpdateUpload operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws LimitExceededException
     *         A limit was exceeded.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @sample AWSDeviceFarm.UpdateUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateUpload" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUploadResult updateUpload(UpdateUploadRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUpload(request);
    }

    @SdkInternalApi
    final UpdateUploadResult executeUpdateUpload(UpdateUploadRequest updateUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUploadRequest> request = null;
        Response<UpdateUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUploadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     * </p>
     * 
     * @param updateVPCEConfigurationRequest
     * @return Result of the UpdateVPCEConfiguration operation returned by the service.
     * @throws ArgumentException
     *         An invalid argument was specified.
     * @throws NotFoundException
     *         The specified entity was not found.
     * @throws ServiceAccountException
     *         There was a problem with the service account.
     * @throws InvalidOperationException
     *         There was an error with the update request, or you do not have sufficient permissions to update this VPC
     *         endpoint configuration.
     * @sample AWSDeviceFarm.UpdateVPCEConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateVPCEConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVPCEConfigurationResult updateVPCEConfiguration(UpdateVPCEConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVPCEConfiguration(request);
    }

    @SdkInternalApi
    final UpdateVPCEConfigurationResult executeUpdateVPCEConfiguration(UpdateVPCEConfigurationRequest updateVPCEConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVPCEConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVPCEConfigurationRequest> request = null;
        Response<UpdateVPCEConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVPCEConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateVPCEConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Device Farm");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVPCEConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVPCEConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateVPCEConfigurationResultJsonUnmarshaller());
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
