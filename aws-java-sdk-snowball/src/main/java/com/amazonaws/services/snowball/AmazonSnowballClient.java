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
package com.amazonaws.services.snowball;

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

import com.amazonaws.services.snowball.AmazonSnowballClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.services.snowball.model.transform.*;

/**
 * Client for accessing Amazon Snowball. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Snowball is a petabyte-scale data transport solution that uses secure devices to transfer large amounts of data
 * between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The commands described here
 * provide access to the same functionality that is available in the AWS Snowball Management Console, which enables you
 * to create and manage jobs for Snowball and Snowball Edge devices. To transfer data locally with a device, you'll need
 * to use the Snowball client or the Amazon S3 API adapter for Snowball.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSnowballClient extends AmazonWebServiceClient implements AmazonSnowball {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonSnowball.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "snowball";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidJobStateException").withModeledClass(
                                    com.amazonaws.services.snowball.model.InvalidJobStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceException").withModeledClass(
                                    com.amazonaws.services.snowball.model.InvalidResourceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSRequestFailedException").withModeledClass(
                                    com.amazonaws.services.snowball.model.KMSRequestFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedAddressException").withModeledClass(
                                    com.amazonaws.services.snowball.model.UnsupportedAddressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterLimitExceededException").withModeledClass(
                                    com.amazonaws.services.snowball.model.ClusterLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputCombinationException").withModeledClass(
                                    com.amazonaws.services.snowball.model.InvalidInputCombinationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("Ec2RequestFailedException").withModeledClass(
                                    com.amazonaws.services.snowball.model.Ec2RequestFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.snowball.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAddressException").withModeledClass(
                                    com.amazonaws.services.snowball.model.InvalidAddressException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.snowball.model.AmazonSnowballException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball. A credentials provider chain will be used
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
     * @deprecated use {@link AmazonSnowballClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSnowballClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball. A credentials provider chain will be used
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
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonSnowballClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSnowballClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonSnowballClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonSnowballClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonSnowballClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonSnowballClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSnowballClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSnowballClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonSnowballClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSnowballClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonSnowballClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSnowballClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSnowballClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Snowball (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonSnowballClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSnowballClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSnowballClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonSnowballClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonSnowballClientBuilder builder() {
        return AmazonSnowballClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSnowballClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Snowball using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonSnowballClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("snowball.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/snowball/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/snowball/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a cluster job. You can only cancel a cluster job while it's in the <code>AwaitingQuorum</code> status.
     * You'll have at least an hour after creating a cluster job to cancel it.
     * </p>
     * 
     * @param cancelClusterRequest
     * @return Result of the CancelCluster operation returned by the service.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.CancelCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CancelCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelClusterResult cancelCluster(CancelClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCancelCluster(request);
    }

    @SdkInternalApi
    final CancelClusterResult executeCancelCluster(CancelClusterRequest cancelClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelClusterRequest> request = null;
        Response<CancelClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the specified job. You can only cancel a job before its <code>JobState</code> value changes to
     * <code>PreparingAppliance</code>. Requesting the <code>ListJobs</code> or <code>DescribeJob</code> action returns
     * a job's <code>JobState</code> as part of the response element data returned.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @sample AmazonSnowball.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelJobResult cancelJob(CancelJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelJob(request);
    }

    @SdkInternalApi
    final CancelJobResult executeCancelJob(CancelJobRequest cancelJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of
     * creation. The address you provide must be located within the serviceable area of your region. If the address is
     * invalid or unsupported, then an exception is thrown.
     * </p>
     * 
     * @param createAddressRequest
     * @return Result of the CreateAddress operation returned by the service.
     * @throws InvalidAddressException
     *         The address provided was invalid. Check the address with your region's carrier, and try again.
     * @throws UnsupportedAddressException
     *         The address is either outside the serviceable area for your region, or an error occurred. Check the
     *         address with your region's carrier and try again. If the issue persists, contact AWS Support.
     * @sample AmazonSnowball.CreateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAddressResult createAddress(CreateAddressRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAddress(request);
    }

    @SdkInternalApi
    final CreateAddressResult executeCreateAddress(CreateAddressRequest createAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(createAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddressRequest> request = null;
        Response<CreateAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddressRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty cluster. Each cluster supports five nodes. You use the <a>CreateJob</a> action separately to
     * create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCluster(request);
    }

    @SdkInternalApi
    final CreateClusterResult executeCreateCluster(CreateClusterRequest createClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a job to the other job attributes are inherited from the cluster.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws ClusterLimitExceededException
     *         Job creation failed. Currently, clusters support five nodes. If you have less than five nodes for your
     *         cluster and you have more nodes to create for this cluster, try again and create jobs until your cluster
     *         has exactly five notes.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJob(request);
    }

    @SdkInternalApi
    final CreateJobResult executeCreateJob(CreateJobRequest createJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Takes an <code>AddressId</code> and returns specific details about that address in the form of an
     * <code>Address</code> object.
     * </p>
     * 
     * @param describeAddressRequest
     * @return Result of the DescribeAddress operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeAddress" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAddressResult describeAddress(DescribeAddressRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAddress(request);
    }

    @SdkInternalApi
    final DescribeAddressResult executeDescribeAddress(DescribeAddressRequest describeAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAddressRequest> request = null;
        Response<DescribeAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAddressRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a specified number of <code>ADDRESS</code> objects. Calling this API in one of the US regions will return
     * addresses from the list of all addresses associated with this account in all US regions.
     * </p>
     * 
     * @param describeAddressesRequest
     * @return Result of the DescribeAddresses operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.DescribeAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeAddresses" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAddresses(request);
    }

    @SdkInternalApi
    final DescribeAddressesResult executeDescribeAddresses(DescribeAddressesRequest describeAddressesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAddressesRequest> request = null;
        Response<DescribeAddressesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAddressesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAddressesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAddresses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAddressesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAddressesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific cluster including shipping information, cluster status, and other important
     * metadata.
     * </p>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCluster(request);
    }

    @SdkInternalApi
    final DescribeClusterResult executeDescribeCluster(DescribeClusterRequest describeClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific job including shipping information, job status, and other important
     * metadata.
     * </p>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJob(request);
    }

    @SdkInternalApi
    final DescribeJobResult executeDescribeJob(DescribeJobRequest describeJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified
     * <code>JobId</code> value. You can access the manifest file for up to 60 minutes after this request has been made.
     * To access the manifest file after 60 minutes have passed, you'll have to make another call to the
     * <code>GetJobManifest</code> action.
     * </p>
     * <p>
     * The manifest is an encrypted file that you can download after your job enters the <code>WithCustomer</code>
     * status. The manifest is decrypted by using the <code>UnlockCode</code> code value, when you pass both values to
     * the Snowball through the Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of an <code>UnlockCode</code> value in the same
     * location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from
     * gaining access to the Snowball associated with that job.
     * </p>
     * <p>
     * The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is
     * created.
     * </p>
     * 
     * @param getJobManifestRequest
     * @return Result of the GetJobManifest operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @sample AmazonSnowball.GetJobManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetJobManifest" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobManifestResult getJobManifest(GetJobManifestRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobManifest(request);
    }

    @SdkInternalApi
    final GetJobManifestResult executeGetJobManifest(GetJobManifestRequest getJobManifestRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobManifestRequest> request = null;
        Response<GetJobManifestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobManifestRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobManifestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobManifest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobManifestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobManifestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <code>UnlockCode</code> code value for the specified job. A particular <code>UnlockCode</code> value
     * can be accessed for up to 90 days after the associated job has been created.
     * </p>
     * <p>
     * The <code>UnlockCode</code> value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code
     * is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the
     * Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of the <code>UnlockCode</code> in the same location
     * as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access
     * to the Snowball associated with that job.
     * </p>
     * 
     * @param getJobUnlockCodeRequest
     * @return Result of the GetJobUnlockCode operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @sample AmazonSnowball.GetJobUnlockCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetJobUnlockCode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobUnlockCode(request);
    }

    @SdkInternalApi
    final GetJobUnlockCodeResult executeGetJobUnlockCode(GetJobUnlockCodeRequest getJobUnlockCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobUnlockCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobUnlockCodeRequest> request = null;
        Response<GetJobUnlockCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobUnlockCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobUnlockCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobUnlockCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobUnlockCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobUnlockCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your
     * account has in use.
     * </p>
     * <p>
     * The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase
     * your service limit, contact AWS Support.
     * </p>
     * 
     * @param getSnowballUsageRequest
     * @return Result of the GetSnowballUsage operation returned by the service.
     * @sample AmazonSnowball.GetSnowballUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetSnowballUsage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSnowballUsageResult getSnowballUsage(GetSnowballUsageRequest request) {
        request = beforeClientExecution(request);
        return executeGetSnowballUsage(request);
    }

    @SdkInternalApi
    final GetSnowballUsageResult executeGetSnowballUsage(GetSnowballUsageRequest getSnowballUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(getSnowballUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnowballUsageRequest> request = null;
        Response<GetSnowballUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnowballUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSnowballUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSnowballUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSnowballUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSnowballUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     * </p>
     * 
     * @param listClusterJobsRequest
     * @return Result of the ListClusterJobs operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.ListClusterJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListClusterJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListClusterJobsResult listClusterJobs(ListClusterJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListClusterJobs(request);
    }

    @SdkInternalApi
    final ListClusterJobsResult executeListClusterJobs(ListClusterJobsRequest listClusterJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listClusterJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClusterJobsRequest> request = null;
        Response<ListClusterJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClusterJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClusterJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusterJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClusterJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListClusterJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>ClusterListEntry</code> objects of the specified length. Each
     * <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        request = beforeClientExecution(request);
        return executeListClusters(request);
    }

    @SdkInternalApi
    final ListClustersResult executeListClusters(ListClustersRequest listClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS
     * account that would be supported for use on <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>
     * devices. For more information on compatible AMIs, see <a
     * href="http://docs.aws.amazon.com/snowball/latest/developer-guide/using-ec2.html">Using Amazon EC2 Compute
     * Instances</a> in the <i>AWS Snowball Developer Guide</i>.
     * </p>
     * 
     * @param listCompatibleImagesRequest
     * @return Result of the ListCompatibleImages operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.ListCompatibleImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListCompatibleImages" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCompatibleImagesResult listCompatibleImages(ListCompatibleImagesRequest request) {
        request = beforeClientExecution(request);
        return executeListCompatibleImages(request);
    }

    @SdkInternalApi
    final ListCompatibleImagesResult executeListCompatibleImages(ListCompatibleImagesRequest listCompatibleImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCompatibleImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCompatibleImagesRequest> request = null;
        Response<ListCompatibleImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCompatibleImagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCompatibleImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCompatibleImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCompatibleImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCompatibleImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
     * of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
     * associated with this account in all US regions.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListJobs" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
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
     * While a cluster's <code>ClusterState</code> value is in the <code>AwaitingQuorum</code> state, you can update
     * some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60
     * minutes after the cluster being created, this action is no longer available.
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateClusterResult updateCluster(UpdateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCluster(request);
    }

    @SdkInternalApi
    final UpdateClusterResult executeUpdateCluster(UpdateClusterRequest updateClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterRequest> request = null;
        Response<UpdateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * While a job's <code>JobState</code> value is <code>New</code>, you can update some of the information associated
     * with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
     * this action is no longer available.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws ClusterLimitExceededException
     *         Job creation failed. Currently, clusters support five nodes. If you have less than five nodes for your
     *         cluster and you have more nodes to create for this cluster, try again and create jobs until your cluster
     *         has exactly five notes.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateJobResult updateJob(UpdateJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJob(request);
    }

    @SdkInternalApi
    final UpdateJobResult executeUpdateJob(UpdateJobRequest updateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Snowball");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobResultJsonUnmarshaller());
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
