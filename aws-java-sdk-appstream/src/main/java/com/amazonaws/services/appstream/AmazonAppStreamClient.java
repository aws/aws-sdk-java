/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream;

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
import com.amazonaws.services.appstream.AmazonAppStreamClientBuilder;
import com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.services.appstream.model.transform.*;

/**
 * Client for accessing Amazon AppStream. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon AppStream 2.0</fullname>
 * <p>
 * You can use Amazon AppStream 2.0 to stream desktop applications to any device running a web browser, without
 * rewriting them.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAppStreamClient extends AmazonWebServiceClient implements AmazonAppStream {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAppStream.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "appstream";

    private volatile AmazonAppStreamWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleImageException").withModeledClass(
                                    com.amazonaws.services.appstream.model.IncompatibleImageException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotAvailableException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceNotAvailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                                    com.amazonaws.services.appstream.model.OperationNotPermittedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.appstream.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRoleException").withModeledClass(
                                    com.amazonaws.services.appstream.model.InvalidRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterCombinationException").withModeledClass(
                                    com.amazonaws.services.appstream.model.InvalidParameterCombinationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceAlreadyExistsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appstream.model.AmazonAppStreamException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream. A credentials provider chain will be used
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
     * @deprecated use {@link AmazonAppStreamClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonAppStreamClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to Amazon AppStream (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonAppStreamClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAppStreamClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonAppStreamClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonAppStreamClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonAppStreamClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon AppStream (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonAppStreamClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAppStreamClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonAppStreamClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonAppStreamClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon AppStream (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonAppStreamClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAppStreamClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon AppStream (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonAppStreamClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonAppStreamClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonAppStreamClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AmazonAppStreamClientBuilder builder() {
        return AmazonAppStreamClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon AppStream using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAppStreamClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("appstream2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appstream/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appstream/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates the specified fleet with the specified stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @return Result of the AssociateFleet operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateFleetResult associateFleet(AssociateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateFleet(request);
    }

    @SdkInternalApi
    final AssociateFleetResult executeAssociateFleet(AssociateFleetRequest associateFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(associateFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateFleetRequest> request = null;
        Response<AssociateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a directory configuration.
     * </p>
     * 
     * @param createDirectoryConfigRequest
     * @return Result of the CreateDirectoryConfig operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @sample AmazonAppStream.CreateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDirectoryConfigResult createDirectoryConfig(CreateDirectoryConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDirectoryConfig(request);
    }

    @SdkInternalApi
    final CreateDirectoryConfigResult executeCreateDirectoryConfig(CreateDirectoryConfigRequest createDirectoryConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createDirectoryConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectoryConfigRequest> request = null;
        Response<CreateDirectoryConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectoryConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDirectoryConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDirectoryConfigResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDirectoryConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a fleet.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFleet(request);
    }

    @SdkInternalApi
    final CreateFleetResult executeCreateFleet(CreateFleetRequest createFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an image builder.
     * </p>
     * <p>
     * The initial state of the builder is <code>PENDING</code>. When it is ready, the state is <code>RUNNING</code>.
     * </p>
     * 
     * @param createImageBuilderRequest
     * @return Result of the CreateImageBuilder operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.CreateImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateImageBuilderResult createImageBuilder(CreateImageBuilderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImageBuilder(request);
    }

    @SdkInternalApi
    final CreateImageBuilderResult executeCreateImageBuilder(CreateImageBuilderRequest createImageBuilderRequest) {

        ExecutionContext executionContext = createExecutionContext(createImageBuilderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImageBuilderRequest> request = null;
        Response<CreateImageBuilderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImageBuilderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createImageBuilderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImageBuilderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateImageBuilderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a URL to start an image builder streaming session.
     * </p>
     * 
     * @param createImageBuilderStreamingURLRequest
     * @return Result of the CreateImageBuilderStreamingURL operation returned by the service.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.CreateImageBuilderStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilderStreamingURL"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateImageBuilderStreamingURLResult createImageBuilderStreamingURL(CreateImageBuilderStreamingURLRequest request) {
        request = beforeClientExecution(request);
        return executeCreateImageBuilderStreamingURL(request);
    }

    @SdkInternalApi
    final CreateImageBuilderStreamingURLResult executeCreateImageBuilderStreamingURL(CreateImageBuilderStreamingURLRequest createImageBuilderStreamingURLRequest) {

        ExecutionContext executionContext = createExecutionContext(createImageBuilderStreamingURLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImageBuilderStreamingURLRequest> request = null;
        Response<CreateImageBuilderStreamingURLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImageBuilderStreamingURLRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createImageBuilderStreamingURLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateImageBuilderStreamingURLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateImageBuilderStreamingURLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a stack.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStack(request);
    }

    @SdkInternalApi
    final CreateStackResult executeCreateStack(CreateStackRequest createStackRequest) {

        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a URL to start a streaming session for the specified user.
     * </p>
     * 
     * @param createStreamingURLRequest
     * @return Result of the CreateStreamingURL operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateStreamingURLResult createStreamingURL(CreateStreamingURLRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamingURL(request);
    }

    @SdkInternalApi
    final CreateStreamingURLResult executeCreateStreamingURL(CreateStreamingURLRequest createStreamingURLRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamingURLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingURLRequest> request = null;
        Response<CreateStreamingURLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamingURLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamingURLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamingURLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStreamingURLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified directory configuration.
     * </p>
     * 
     * @param deleteDirectoryConfigRequest
     * @return Result of the DeleteDirectoryConfig operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DeleteDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDirectoryConfigResult deleteDirectoryConfig(DeleteDirectoryConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDirectoryConfig(request);
    }

    @SdkInternalApi
    final DeleteDirectoryConfigResult executeDeleteDirectoryConfig(DeleteDirectoryConfigRequest deleteDirectoryConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDirectoryConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectoryConfigRequest> request = null;
        Response<DeleteDirectoryConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectoryConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDirectoryConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDirectoryConfigResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDirectoryConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleet(request);
    }

    @SdkInternalApi
    final DeleteFleetResult executeDeleteFleet(DeleteFleetRequest deleteFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<DeleteFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified image. You cannot delete an image that is currently in use. After you delete an image, you
     * cannot provision new capacity using the image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return Result of the DeleteImage operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteImageResult deleteImage(DeleteImageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImage(request);
    }

    @SdkInternalApi
    final DeleteImageResult executeDeleteImage(DeleteImageRequest deleteImageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImageRequest> request = null;
        Response<DeleteImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified image builder and releases the capacity.
     * </p>
     * 
     * @param deleteImageBuilderRequest
     * @return Result of the DeleteImageBuilder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteImageBuilderResult deleteImageBuilder(DeleteImageBuilderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImageBuilder(request);
    }

    @SdkInternalApi
    final DeleteImageBuilderResult executeDeleteImageBuilder(DeleteImageBuilderRequest deleteImageBuilderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImageBuilderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImageBuilderRequest> request = null;
        Response<DeleteImageBuilderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImageBuilderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteImageBuilderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImageBuilderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteImageBuilderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified stack. After this operation completes, the environment can no longer be activated and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @return Result of the DeleteStack operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStack(request);
    }

    @SdkInternalApi
    final DeleteStackResult executeDeleteStack(DeleteStackRequest deleteStackRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackRequest> request = null;
        Response<DeleteStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified directory configurations.
     * </p>
     * 
     * @param describeDirectoryConfigsRequest
     * @return Result of the DescribeDirectoryConfigs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeDirectoryConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeDirectoryConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDirectoryConfigsResult describeDirectoryConfigs(DescribeDirectoryConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDirectoryConfigs(request);
    }

    @SdkInternalApi
    final DescribeDirectoryConfigsResult executeDescribeDirectoryConfigs(DescribeDirectoryConfigsRequest describeDirectoryConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDirectoryConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectoryConfigsRequest> request = null;
        Response<DescribeDirectoryConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectoryConfigsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDirectoryConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDirectoryConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDirectoryConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified fleets or all fleets in the account.
     * </p>
     * 
     * @param describeFleetsRequest
     * @return Result of the DescribeFleets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFleetsResult describeFleets(DescribeFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleets(request);
    }

    @SdkInternalApi
    final DescribeFleetsResult executeDescribeFleets(DescribeFleetsRequest describeFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetsRequest> request = null;
        Response<DescribeFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified image builders or all image builders in the account.
     * </p>
     * 
     * @param describeImageBuildersRequest
     * @return Result of the DescribeImageBuilders operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeImageBuilders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImageBuilders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeImageBuildersResult describeImageBuilders(DescribeImageBuildersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeImageBuilders(request);
    }

    @SdkInternalApi
    final DescribeImageBuildersResult executeDescribeImageBuilders(DescribeImageBuildersRequest describeImageBuildersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeImageBuildersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImageBuildersRequest> request = null;
        Response<DescribeImageBuildersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImageBuildersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeImageBuildersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeImageBuildersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeImageBuildersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified images or all images in the account.
     * </p>
     * 
     * @param describeImagesRequest
     * @return Result of the DescribeImages operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeImagesResult describeImages(DescribeImagesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeImages(request);
    }

    @SdkInternalApi
    final DescribeImagesResult executeDescribeImages(DescribeImagesRequest describeImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImagesRequest> request = null;
        Response<DescribeImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the streaming sessions for the specified stack and fleet. If a user ID is provided, only the streaming
     * sessions for only that user are returned. If an authentication type is not provided, the default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return Result of the DescribeSessions operation returned by the service.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSessionsResult describeSessions(DescribeSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSessions(request);
    }

    @SdkInternalApi
    final DescribeSessionsResult executeDescribeSessions(DescribeSessionsRequest describeSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSessionsRequest> request = null;
        Response<DescribeSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified stacks or all stacks in the account.
     * </p>
     * 
     * @param describeStacksRequest
     * @return Result of the DescribeStacks operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStacks(request);
    }

    @SdkInternalApi
    final DescribeStacksResult executeDescribeStacks(DescribeStacksRequest describeStacksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStacksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStacksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStacksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified fleet from the specified stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @return Result of the DisassociateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateFleetResult disassociateFleet(DisassociateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFleet(request);
    }

    @SdkInternalApi
    final DisassociateFleetResult executeDisassociateFleet(DisassociateFleetRequest disassociateFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFleetRequest> request = null;
        Response<DisassociateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the specified streaming session.
     * </p>
     * 
     * @param expireSessionRequest
     * @return Result of the ExpireSession operation returned by the service.
     * @sample AmazonAppStream.ExpireSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ExpireSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExpireSessionResult expireSession(ExpireSessionRequest request) {
        request = beforeClientExecution(request);
        return executeExpireSession(request);
    }

    @SdkInternalApi
    final ExpireSessionResult executeExpireSession(ExpireSessionRequest expireSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(expireSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExpireSessionRequest> request = null;
        Response<ExpireSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExpireSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(expireSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExpireSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExpireSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the fleets associated with the specified stack.
     * </p>
     * 
     * @param listAssociatedFleetsRequest
     * @return Result of the ListAssociatedFleets operation returned by the service.
     * @sample AmazonAppStream.ListAssociatedFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedFleets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssociatedFleetsResult listAssociatedFleets(ListAssociatedFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociatedFleets(request);
    }

    @SdkInternalApi
    final ListAssociatedFleetsResult executeListAssociatedFleets(ListAssociatedFleetsRequest listAssociatedFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociatedFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedFleetsRequest> request = null;
        Response<ListAssociatedFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssociatedFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociatedFleetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssociatedFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the stacks associated with the specified fleet.
     * </p>
     * 
     * @param listAssociatedStacksRequest
     * @return Result of the ListAssociatedStacks operation returned by the service.
     * @sample AmazonAppStream.ListAssociatedStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedStacks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociatedStacks(request);
    }

    @SdkInternalApi
    final ListAssociatedStacksResult executeListAssociatedStacks(ListAssociatedStacksRequest listAssociatedStacksRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociatedStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedStacksRequest> request = null;
        Response<ListAssociatedStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedStacksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssociatedStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociatedStacksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssociatedStacksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images,
     * fleets, and stacks.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListTagsForResource" target="_top">AWS
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
     * Starts the specified fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @return Result of the StartFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartFleetResult startFleet(StartFleetRequest request) {
        request = beforeClientExecution(request);
        return executeStartFleet(request);
    }

    @SdkInternalApi
    final StartFleetResult executeStartFleet(StartFleetRequest startFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(startFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFleetRequest> request = null;
        Response<StartFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFleetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the specified image builder.
     * </p>
     * 
     * @param startImageBuilderRequest
     * @return Result of the StartImageBuilder operation returned by the service.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.StartImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartImageBuilderResult startImageBuilder(StartImageBuilderRequest request) {
        request = beforeClientExecution(request);
        return executeStartImageBuilder(request);
    }

    @SdkInternalApi
    final StartImageBuilderResult executeStartImageBuilder(StartImageBuilderRequest startImageBuilderRequest) {

        ExecutionContext executionContext = createExecutionContext(startImageBuilderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImageBuilderRequest> request = null;
        Response<StartImageBuilderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImageBuilderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startImageBuilderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartImageBuilderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartImageBuilderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the specified fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @return Result of the StopFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopFleetResult stopFleet(StopFleetRequest request) {
        request = beforeClientExecution(request);
        return executeStopFleet(request);
    }

    @SdkInternalApi
    final StopFleetResult executeStopFleet(StopFleetRequest stopFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(stopFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopFleetRequest> request = null;
        Response<StopFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopFleetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the specified image builder.
     * </p>
     * 
     * @param stopImageBuilderRequest
     * @return Result of the StopImageBuilder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StopImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopImageBuilder" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopImageBuilderResult stopImageBuilder(StopImageBuilderRequest request) {
        request = beforeClientExecution(request);
        return executeStopImageBuilder(request);
    }

    @SdkInternalApi
    final StopImageBuilderResult executeStopImageBuilder(StopImageBuilderRequest stopImageBuilderRequest) {

        ExecutionContext executionContext = createExecutionContext(stopImageBuilderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopImageBuilderRequest> request = null;
        Response<StopImageBuilderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopImageBuilderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopImageBuilderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopImageBuilderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopImageBuilderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
     * builders, images, fleets, and stacks.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
     * operation updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>. To disassociate tags from your
     * resources, use <a>UntagResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/TagResource" target="_top">AWS API
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
     * Disassociates the specified tags from the specified AppStream 2.0 resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UntagResource" target="_top">AWS API
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
     * Updates the specified directory configuration.
     * </p>
     * 
     * @param updateDirectoryConfigRequest
     * @return Result of the UpdateDirectoryConfig operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.UpdateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDirectoryConfigResult updateDirectoryConfig(UpdateDirectoryConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDirectoryConfig(request);
    }

    @SdkInternalApi
    final UpdateDirectoryConfigResult executeUpdateDirectoryConfig(UpdateDirectoryConfigRequest updateDirectoryConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDirectoryConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDirectoryConfigRequest> request = null;
        Response<UpdateDirectoryConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDirectoryConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDirectoryConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDirectoryConfigResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateDirectoryConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified fleet.
     * </p>
     * <p>
     * If the fleet is in the <code>STOPPED</code> state, you can update any attribute except the fleet name. If the
     * fleet is in the <code>RUNNING</code> state, you can update the <code>DisplayName</code> and
     * <code>ComputeCapacity</code> attributes. If the fleet is in the <code>STARTING</code> or <code>STOPPING</code>
     * state, you can't update it.
     * </p>
     * 
     * @param updateFleetRequest
     * @return Result of the UpdateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFleetResult updateFleet(UpdateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFleet(request);
    }

    @SdkInternalApi
    final UpdateFleetResult executeUpdateFleet(UpdateFleetRequest updateFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetRequest> request = null;
        Response<UpdateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified stack.
     * </p>
     * 
     * @param updateStackRequest
     * @return Result of the UpdateStack operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStack(request);
    }

    @SdkInternalApi
    final UpdateStackResult executeUpdateStack(UpdateStackRequest updateStackRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackRequest> request = null;
        Response<UpdateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStackResultJsonUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public AmazonAppStreamWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonAppStreamWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
