/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces;

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
import com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.services.workspaces.model.transform.*;

/**
 * Client for accessing Amazon WorkSpaces. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows desktops for your users.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkspacesClient extends AmazonWebServiceClient implements AmazonWorkspaces {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkspaces.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "workspaces";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedWorkspaceConfigurationException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.UnsupportedWorkspaceConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceStateException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.InvalidResourceStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValuesException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.InvalidParameterValuesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationInProgressException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.OperationInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.ResourceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withModeledClass(
                                    com.amazonaws.services.workspaces.model.ResourceLimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.workspaces.model.AmazonWorkspacesException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces. A credentials provider chain will be used
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
     * @deprecated use {@link AmazonWorkspacesClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonWorkspacesClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonWorkspacesClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon WorkSpaces (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonWorkspacesClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonWorkspacesClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonWorkspacesClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AmazonWorkspacesClientBuilder builder() {
        return AmazonWorkspacesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon WorkSpaces using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkspacesClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://workspaces.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/workspaces/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/workspaces/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates tags for the specified WorkSpace.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AmazonWorkspaces.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTags(request);
    }

    @SdkInternalApi
    final CreateTagsResult executeCreateTags(CreateTagsRequest createTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * 
     * @param createWorkspacesRequest
     * @return Result of the CreateWorkspaces operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspaces(request);
    }

    @SdkInternalApi
    final CreateWorkspacesResult executeCreateWorkspaces(CreateWorkspacesRequest createWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspacesRequest> request = null;
        Response<CreateWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified tags from a WorkSpace.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the tags for the specified WorkSpace.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @return Result of the DescribeWorkspaceBundles operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceBundles(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceBundlesResult executeDescribeWorkspaceBundles(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceBundlesRequest> request = null;
        Response<DescribeWorkspaceBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceBundlesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceBundlesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles() {
        return describeWorkspaceBundles(new DescribeWorkspaceBundlesRequest());
    }

    /**
     * <p>
     * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @return Result of the DescribeWorkspaceDirectories operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceDirectories(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceDirectoriesResult executeDescribeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceDirectoriesRequest> request = null;
        Response<DescribeWorkspaceDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceDirectoriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceDirectoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceDirectoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories() {
        return describeWorkspaceDirectories(new DescribeWorkspaceDirectoriesRequest());
    }

    /**
     * <p>
     * Describes the specified WorkSpaces.
     * </p>
     * <p>
     * You can filter the results using bundle ID, directory ID, or owner, but you can specify only one filter at a
     * time.
     * </p>
     * 
     * @param describeWorkspacesRequest
     * @return Result of the DescribeWorkspaces operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaces(request);
    }

    @SdkInternalApi
    final DescribeWorkspacesResult executeDescribeWorkspaces(DescribeWorkspacesRequest describeWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspacesRequest> request = null;
        Response<DescribeWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeWorkspacesResult describeWorkspaces() {
        return describeWorkspaces(new DescribeWorkspacesRequest());
    }

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return Result of the DescribeWorkspacesConnectionStatus operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(DescribeWorkspacesConnectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspacesConnectionStatus(request);
    }

    @SdkInternalApi
    final DescribeWorkspacesConnectionStatusResult executeDescribeWorkspacesConnectionStatus(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspacesConnectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspacesConnectionStatusRequest> request = null;
        Response<DescribeWorkspacesConnectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspacesConnectionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspacesConnectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspacesConnectionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspacesConnectionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the specified WorkSpace properties.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return Result of the ModifyWorkspaceProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the WorkSpace is not valid for this operation.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws UnsupportedWorkspaceConfigurationException
     *         The configuration of this WorkSpace is not supported for this operation. For more information, see the <a
     *         href="http://docs.aws.amazon.com/workspaces/latest/adminguide/">Amazon WorkSpaces Administration
     *         Guide</a>.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyWorkspaceProperties(request);
    }

    @SdkInternalApi
    final ModifyWorkspacePropertiesResult executeModifyWorkspaceProperties(ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyWorkspacePropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyWorkspacePropertiesRequest> request = null;
        Response<ModifyWorkspacePropertiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyWorkspacePropertiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyWorkspacePropertiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyWorkspacePropertiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyWorkspacePropertiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot reboot a WorkSpace unless its state is <code>AVAILABLE</code>, <code>IMPAIRED</code>, or
     * <code>INOPERABLE</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have rebooted.
     * </p>
     * 
     * @param rebootWorkspacesRequest
     * @return Result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeRebootWorkspaces(request);
    }

    @SdkInternalApi
    final RebootWorkspacesResult executeRebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootWorkspacesRequest> request = null;
        Response<RebootWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebootWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebootWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code> or <code>ERROR</code>.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a href="http://docs.aws.amazon.com/workspaces/latest/adminguide/reset-workspace.html">Rebuild a
     * WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
     * </p>
     * 
     * @param rebuildWorkspacesRequest
     * @return Result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeRebuildWorkspaces(request);
    }

    @SdkInternalApi
    final RebuildWorkspacesResult executeRebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(rebuildWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebuildWorkspacesRequest> request = null;
        Response<RebuildWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebuildWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebuildWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebuildWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebuildWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot start a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>STOPPED</code>.
     * </p>
     * 
     * @param startWorkspacesRequest
     * @return Result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartWorkspacesResult startWorkspaces(StartWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeStartWorkspaces(request);
    }

    @SdkInternalApi
    final StartWorkspacesResult executeStartWorkspaces(StartWorkspacesRequest startWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(startWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartWorkspacesRequest> request = null;
        Response<StartWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot stop a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>AVAILABLE</code>, <code>IMPAIRED</code>, <code>UNHEALTHY</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @return Result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeStopWorkspaces(request);
    }

    @SdkInternalApi
    final StopWorkspacesResult executeStopWorkspaces(StopWorkspacesRequest stopWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(stopWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopWorkspacesRequest> request = null;
        Response<StopWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact Amazon Web Services before terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
     * </p>
     * 
     * @param terminateWorkspacesRequest
     * @return Result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateWorkspaces(request);
    }

    @SdkInternalApi
    final TerminateWorkspacesResult executeTerminateWorkspaces(TerminateWorkspacesRequest terminateWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateWorkspacesRequest> request = null;
        Response<TerminateWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TerminateWorkspacesResultJsonUnmarshaller());
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

}
