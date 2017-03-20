/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * API documentation for Amazon AppStream 2.0.
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

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRoleException").withModeledClass(
                                    com.amazonaws.services.appstream.model.InvalidRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotAvailableException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceNotAvailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                                    com.amazonaws.services.appstream.model.OperationNotPermittedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.appstream.model.ResourceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.appstream.model.LimitExceededException.class))
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
     * Associate a fleet to a stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @return Result of the AssociateFleet operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
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
     * Creates a new fleet.
     * </p>
     * 
     * @param createFleetRequest
     *        Contains the parameters for the new fleet to create.
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
     * Create a new stack.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
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
     * Creates a URL to start an AppStream 2.0 streaming session for a user. By default, the URL is valid only for 1
     * minute from the time that it is generated.
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
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
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
     * Deletes the stack. After this operation completes, the environment can no longer be activated, and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @return Result of the DeleteStack operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
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
     * If fleet names are provided, this operation describes the specified fleets; otherwise, all the fleets in the
     * account are described.
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
     * Describes the images. If a list of names is not provided, all images in your account are returned. This operation
     * does not return a paginated result.
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
     * Describes the streaming sessions for a stack and a fleet. If a user ID is provided, this operation returns
     * streaming sessions for only that user. Pass this value for the <code>nextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return Result of the DescribeSessions operation returned by the service.
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
     * If stack names are not provided, this operation describes the specified stacks; otherwise, all stacks in the
     * account are described. Pass the <code>nextToken</code> value in a subsequent call to this operation to retrieve
     * the next set of items.
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
     * Disassociates a fleet from a stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @return Result of the DisassociateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
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
     * This operation immediately stops a streaming session.
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
     * Lists all fleets associated with the stack.
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
     * Lists all stacks to which the specified fleet is associated.
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
     * Starts a fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @return Result of the StartFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
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
     * Stops a fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @return Result of the StopFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
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
     * Updates an existing fleet. All the attributes except the fleet name can be updated in the <b>STOPPED</b> state.
     * Only <b>ComputeCapacity</b> and <b>ImageName</b> can be updated in any other state.
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
     * Updates the specified fields in the stack with the specified name.
     * </p>
     * 
     * @param updateStackRequest
     * @return Result of the UpdateStack operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The specified resource is in use.
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
