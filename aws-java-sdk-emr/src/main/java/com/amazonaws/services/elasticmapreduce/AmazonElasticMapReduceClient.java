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
package com.amazonaws.services.elasticmapreduce;

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

import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduceClientBuilder;
import com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.services.elasticmapreduce.model.transform.*;

/**
 * Client for accessing Amazon EMR. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon EMR is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
 * processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis,
 * machine learning, scientific simulation, and data warehousing.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticMapReduceClient extends AmazonWebServiceClient implements AmazonElasticMapReduce {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonElasticMapReduce.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticmapreduce";

    private volatile AmazonElasticMapReduceWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.elasticmapreduce.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withModeledClass(
                                    com.amazonaws.services.elasticmapreduce.model.InternalServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.elasticmapreduce.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.elasticmapreduce.model.AmazonElasticMapReduceException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon EMR. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AmazonElasticMapReduceClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticMapReduceClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon EMR (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonElasticMapReduceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticMapReduceClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonElasticMapReduceClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonElasticMapReduceClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon EMR (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonElasticMapReduceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticMapReduceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonElasticMapReduceClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon EMR (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonElasticMapReduceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon EMR (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonElasticMapReduceClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticMapReduceClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticMapReduceClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonElasticMapReduceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonElasticMapReduceClientBuilder builder() {
        return AmazonElasticMapReduceClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticMapReduceClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonElasticMapReduceClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://elasticmapreduce.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticmapreduce/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticmapreduce/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds an instance fleet to a running cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x.
     * </p>
     * </note>
     * 
     * @param addInstanceFleetRequest
     * @return Result of the AddInstanceFleet operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.AddInstanceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddInstanceFleetResult addInstanceFleet(AddInstanceFleetRequest request) {
        request = beforeClientExecution(request);
        return executeAddInstanceFleet(request);
    }

    @SdkInternalApi
    final AddInstanceFleetResult executeAddInstanceFleet(AddInstanceFleetRequest addInstanceFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(addInstanceFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddInstanceFleetRequest> request = null;
        Response<AddInstanceFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddInstanceFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addInstanceFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddInstanceFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddInstanceFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddInstanceFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more instance groups to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest
     *        Input to an AddInstanceGroups call.
     * @return Result of the AddInstanceGroups operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.AddInstanceGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddInstanceGroupsResult addInstanceGroups(AddInstanceGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeAddInstanceGroups(request);
    }

    @SdkInternalApi
    final AddInstanceGroupsResult executeAddInstanceGroups(AddInstanceGroupsRequest addInstanceGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(addInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddInstanceGroupsRequest> request = null;
        Response<AddInstanceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddInstanceGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addInstanceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddInstanceGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddInstanceGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddInstanceGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to
     * the master node and submitting queries directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html">Add More than 256 Steps to
     * a Cluster</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each
     * step is performed by the main function of the main class of the JAR file. The main class can be specified either
     * in the manifest of the JAR or by using the MainFunction parameter of the step.
     * </p>
     * <p>
     * Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must
     * exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run
     * successfully.
     * </p>
     * <p>
     * You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or
     * WAITING.
     * </p>
     * 
     * @param addJobFlowStepsRequest
     *        The input argument to the <a>AddJobFlowSteps</a> operation.
     * @return Result of the AddJobFlowSteps operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.AddJobFlowSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddJobFlowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddJobFlowStepsResult addJobFlowSteps(AddJobFlowStepsRequest request) {
        request = beforeClientExecution(request);
        return executeAddJobFlowSteps(request);
    }

    @SdkInternalApi
    final AddJobFlowStepsResult executeAddJobFlowSteps(AddJobFlowStepsRequest addJobFlowStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(addJobFlowStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddJobFlowStepsRequest> request = null;
        Response<AddJobFlowStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddJobFlowStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addJobFlowStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddJobFlowSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddJobFlowStepsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddJobFlowStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
     * clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html">Tag Clusters</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        This input identifies a cluster and a list of tags to attach.
     * @return Result of the AddTags operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        request = beforeClientExecution(request);
        return executeAddTags(request);
    }

    @SdkInternalApi
    final AddTagsResult executeAddTags(AddTagsRequest addTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later,
     * excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is
     * idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully
     * submitted. You can only cancel steps that are in a <code>PENDING</code> state.
     * </p>
     * 
     * @param cancelStepsRequest
     *        The input argument to the <a>CancelSteps</a> operation.
     * @return Result of the CancelSteps operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.CancelSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CancelSteps" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelStepsResult cancelSteps(CancelStepsRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSteps(request);
    }

    @SdkInternalApi
    final CancelStepsResult executeCancelSteps(CancelStepsRequest cancelStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelStepsRequest> request = null;
        Response<CancelStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelStepsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return Result of the CreateSecurityConfiguration operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.CreateSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CreateSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSecurityConfiguration(request);
    }

    @SdkInternalApi
    final CreateSecurityConfigurationResult executeCreateSecurityConfiguration(CreateSecurityConfigurationRequest createSecurityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityConfigurationRequest> request = null;
        Response<CreateSecurityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSecurityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSecurityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSecurityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSecurityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return Result of the DeleteSecurityConfiguration operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DeleteSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DeleteSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSecurityConfigurationResult deleteSecurityConfiguration(DeleteSecurityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSecurityConfiguration(request);
    }

    @SdkInternalApi
    final DeleteSecurityConfigurationResult executeDeleteSecurityConfiguration(DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecurityConfigurationRequest> request = null;
        Response<DeleteSecurityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecurityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSecurityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSecurityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSecurityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSecurityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
     * </p>
     * 
     * @param describeClusterRequest
     *        This input determines which cluster to describe.
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeCluster"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
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
     * This API is deprecated and will eventually be removed. We recommend you use <a>ListClusters</a>,
     * <a>DescribeCluster</a>, <a>ListSteps</a>, <a>ListInstanceGroups</a> and <a>ListBootstrapActions</a> instead.
     * </p>
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can
     * include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the following criteria are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Job flows created and completed in the last two weeks
     * </p>
     * </li>
     * <li>
     * <p>
     * Job flows created within the last two months that are in one of the following states: <code>RUNNING</code>,
     * <code>WAITING</code>, <code>SHUTTING_DOWN</code>, <code>STARTING</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon EMR can return a maximum of 512 job flow descriptions.
     * </p>
     * 
     * @param describeJobFlowsRequest
     *        The input for the <a>DescribeJobFlows</a> operation.
     * @return Result of the DescribeJobFlows operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.DescribeJobFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeJobFlows"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobFlows(request);
    }

    @SdkInternalApi
    final DescribeJobFlowsResult executeDescribeJobFlows(DescribeJobFlowsRequest describeJobFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobFlowsRequest> request = null;
        Response<DescribeJobFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobFlowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobFlowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    @Deprecated
    public DescribeJobFlowsResult describeJobFlows() {
        return describeJobFlows(new DescribeJobFlowsRequest());
    }

    /**
     * <p>
     * Provides the details of a security configuration by returning the configuration JSON.
     * </p>
     * 
     * @param describeSecurityConfigurationRequest
     * @return Result of the DescribeSecurityConfiguration operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DescribeSecurityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSecurityConfigurationResult describeSecurityConfiguration(DescribeSecurityConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSecurityConfiguration(request);
    }

    @SdkInternalApi
    final DescribeSecurityConfigurationResult executeDescribeSecurityConfiguration(DescribeSecurityConfigurationRequest describeSecurityConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecurityConfigurationRequest> request = null;
        Response<DescribeSecurityConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSecurityConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSecurityConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSecurityConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSecurityConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @param describeStepRequest
     *        This input determines which step to describe.
     * @return Result of the DescribeStep operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DescribeStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeStep" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStepResult describeStep(DescribeStepRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStep(request);
    }

    @SdkInternalApi
    final DescribeStepResult executeDescribeStep(DescribeStepRequest describeStepRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStepRequest> request = null;
        Response<DescribeStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a cluster.
     * </p>
     * 
     * @param listBootstrapActionsRequest
     *        This input determines which bootstrap actions to retrieve.
     * @return Result of the ListBootstrapActions operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListBootstrapActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListBootstrapActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBootstrapActionsResult listBootstrapActions(ListBootstrapActionsRequest request) {
        request = beforeClientExecution(request);
        return executeListBootstrapActions(request);
    }

    @SdkInternalApi
    final ListBootstrapActionsResult executeListBootstrapActions(ListBootstrapActionsRequest listBootstrapActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBootstrapActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBootstrapActionsRequest> request = null;
        Response<ListBootstrapActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBootstrapActionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBootstrapActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBootstrapActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBootstrapActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBootstrapActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based
     * on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a
     * maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple
     * ListClusters calls.
     * </p>
     * 
     * @param listClustersRequest
     *        This input determines how the ListClusters action filters the list of clusters that it returns.
     * @return Result of the ListClusters operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListClusters" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
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

    @Override
    public ListClustersResult listClusters() {
        return listClusters(new ListClustersRequest());
    }

    /**
     * <p>
     * Lists all available details about the instance fleets in a cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param listInstanceFleetsRequest
     * @return Result of the ListInstanceFleets operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListInstanceFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstanceFleets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInstanceFleetsResult listInstanceFleets(ListInstanceFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceFleets(request);
    }

    @SdkInternalApi
    final ListInstanceFleetsResult executeListInstanceFleets(ListInstanceFleetsRequest listInstanceFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstanceFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceFleetsRequest> request = null;
        Response<ListInstanceFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstanceFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceFleets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstanceFleetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstanceFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest
     *        This input determines which instance groups to retrieve.
     * @return Result of the ListInstanceGroups operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListInstanceGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstanceGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInstanceGroupsResult listInstanceGroups(ListInstanceGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceGroups(request);
    }

    @SdkInternalApi
    final ListInstanceGroupsResult executeListInstanceGroups(ListInstanceGroupsRequest listInstanceGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceGroupsRequest> request = null;
        Response<ListInstanceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstanceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstanceGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstanceGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a
     * maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT,
     * PROVISIONING, BOOTSTRAPPING, RUNNING.
     * </p>
     * 
     * @param listInstancesRequest
     *        This input determines which instances to list.
     * @return Result of the ListInstances operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstances(request);
    }

    @SdkInternalApi
    final ListInstancesResult executeListInstances(ListInstancesRequest listInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the security configurations visible to this account, providing their creation dates and times, and
     * their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the
     * cluster list across multiple ListSecurityConfigurations calls.
     * </p>
     * 
     * @param listSecurityConfigurationsRequest
     * @return Result of the ListSecurityConfigurations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListSecurityConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSecurityConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSecurityConfigurationsResult listSecurityConfigurations(ListSecurityConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityConfigurations(request);
    }

    @SdkInternalApi
    final ListSecurityConfigurationsResult executeListSecurityConfigurations(ListSecurityConfigurationsRequest listSecurityConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityConfigurationsRequest> request = null;
        Response<ListSecurityConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSecurityConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSecurityConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
     * </p>
     * 
     * @param listStepsRequest
     *        This input determines which steps to list.
     * @return Result of the ListSteps operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSteps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStepsResult listSteps(ListStepsRequest request) {
        request = beforeClientExecution(request);
        return executeListSteps(request);
    }

    @SdkInternalApi
    final ListStepsResult executeListSteps(ListStepsRequest listStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStepsRequest> request = null;
        Response<ListStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStepsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified
     * InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param modifyInstanceFleetRequest
     * @return Result of the ModifyInstanceFleet operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ModifyInstanceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyInstanceFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyInstanceFleetResult modifyInstanceFleet(ModifyInstanceFleetRequest request) {
        request = beforeClientExecution(request);
        return executeModifyInstanceFleet(request);
    }

    @SdkInternalApi
    final ModifyInstanceFleetResult executeModifyInstanceFleet(ModifyInstanceFleetRequest modifyInstanceFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyInstanceFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyInstanceFleetRequest> request = null;
        Response<ModifyInstanceFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyInstanceFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyInstanceFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyInstanceFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyInstanceFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ModifyInstanceFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input
     * parameters include the new target instance count for the group and the instance group ID. The call will either
     * succeed or fail atomically.
     * </p>
     * 
     * @param modifyInstanceGroupsRequest
     *        Change the size of some instance groups.
     * @return Result of the ModifyInstanceGroups operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.ModifyInstanceGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyInstanceGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyInstanceGroupsResult modifyInstanceGroups(ModifyInstanceGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeModifyInstanceGroups(request);
    }

    @SdkInternalApi
    final ModifyInstanceGroupsResult executeModifyInstanceGroups(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyInstanceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyInstanceGroupsRequest> request = null;
        Response<ModifyInstanceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyInstanceGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(modifyInstanceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyInstanceGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyInstanceGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ModifyInstanceGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ModifyInstanceGroupsResult modifyInstanceGroups() {
        return modifyInstanceGroups(new ModifyInstanceGroupsRequest());
    }

    /**
     * <p>
     * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR
     * cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
     * in response to the value of a CloudWatch metric.
     * </p>
     * 
     * @param putAutoScalingPolicyRequest
     * @return Result of the PutAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduce.PutAutoScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PutAutoScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAutoScalingPolicyResult putAutoScalingPolicy(PutAutoScalingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutAutoScalingPolicy(request);
    }

    @SdkInternalApi
    final PutAutoScalingPolicyResult executePutAutoScalingPolicy(PutAutoScalingPolicyRequest putAutoScalingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putAutoScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAutoScalingPolicyRequest> request = null;
        Response<PutAutoScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAutoScalingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAutoScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAutoScalingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAutoScalingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAutoScalingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
     * </p>
     * 
     * @param removeAutoScalingPolicyRequest
     * @return Result of the RemoveAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduce.RemoveAutoScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveAutoScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveAutoScalingPolicyResult removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveAutoScalingPolicy(request);
    }

    @SdkInternalApi
    final RemoveAutoScalingPolicyResult executeRemoveAutoScalingPolicy(RemoveAutoScalingPolicyRequest removeAutoScalingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(removeAutoScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAutoScalingPolicyRequest> request = null;
        Response<RemoveAutoScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAutoScalingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeAutoScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveAutoScalingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveAutoScalingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveAutoScalingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
     * grouping clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html">Tag Clusters</a>.
     * </p>
     * <p>
     * The following example removes the stack tag with value Prod from a cluster:
     * </p>
     * 
     * @param removeTagsRequest
     *        This input identifies a cluster and a list of tags to remove.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTags(request);
    }

    @SdkInternalApi
    final RemoveTagsResult executeRemoveTags(RemoveTagsRequest removeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the
     * steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last
     * step of the job flow to store results in Amazon S3. If the <a>JobFlowInstancesConfig</a>
     * <code>KeepJobFlowAliveWhenNoSteps</code> parameter is set to <code>TRUE</code>, the cluster transitions to the
     * WAITING state rather than shutting down after the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a> <code>TerminationProtected</code>
     * parameter to <code>TRUE</code> to lock the cluster and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
     * connect to the master node and submitting queries directly to the software running on the master node, such as
     * Hive and Hadoop. For more information on how to do this, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html">Add More than 256 Steps to
     * a Cluster</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * For long running clusters, we recommend that you periodically store your results.
     * </p>
     * <note>
     * <p>
     * The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not
     * both.
     * </p>
     * </note>
     * 
     * @param runJobFlowRequest
     *        Input to the <a>RunJobFlow</a> operation.
     * @return Result of the RunJobFlow operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.RunJobFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RunJobFlow" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RunJobFlowResult runJobFlow(RunJobFlowRequest request) {
        request = beforeClientExecution(request);
        return executeRunJobFlow(request);
    }

    @SdkInternalApi
    final RunJobFlowResult executeRunJobFlow(RunJobFlowRequest runJobFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(runJobFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunJobFlowRequest> request = null;
        Response<RunJobFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunJobFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(runJobFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RunJobFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RunJobFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RunJobFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by
     * user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful
     * completion of the job flow. Calling <code>SetTerminationProtection</code> on a cluster is similar to calling the
     * Amazon EC2 <code>DisableAPITermination</code> API on all EC2 instances in a cluster.
     * </p>
     * <p>
     * <code>SetTerminationProtection</code> is used to prevent accidental termination of a cluster and to ensure that
     * in the event of an error, the instances persist so that you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a cluster that has been locked by setting <code>SetTerminationProtection</code> to <code>true</code>
     * , you must first unlock the job flow by a subsequent call to <code>SetTerminationProtection</code> in which you
     * set the value to <code>false</code>.
     * </p>
     * <p>
     * For more information, see<a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/UsingEMR_TerminationProtection.html">Managing
     * Cluster Termination</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * 
     * @param setTerminationProtectionRequest
     *        The input argument to the <a>TerminationProtection</a> operation.
     * @return Result of the SetTerminationProtection operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.SetTerminationProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetTerminationProtection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeSetTerminationProtection(request);
    }

    @SdkInternalApi
    final SetTerminationProtectionResult executeSetTerminationProtection(SetTerminationProtectionRequest setTerminationProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(setTerminationProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTerminationProtectionRequest> request = null;
        Response<SetTerminationProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTerminationProtectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setTerminationProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetTerminationProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetTerminationProtectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetTerminationProtectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified
     * clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of <a>RunJobFlow</a>. The SetVisibleToAllUsers
     * action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
     * </p>
     * 
     * @param setVisibleToAllUsersRequest
     *        The input to the SetVisibleToAllUsers action.
     * @return Result of the SetVisibleToAllUsers operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.SetVisibleToAllUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetVisibleToAllUsers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetVisibleToAllUsersResult setVisibleToAllUsers(SetVisibleToAllUsersRequest request) {
        request = beforeClientExecution(request);
        return executeSetVisibleToAllUsers(request);
    }

    @SdkInternalApi
    final SetVisibleToAllUsersResult executeSetVisibleToAllUsers(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(setVisibleToAllUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetVisibleToAllUsersRequest> request = null;
        Response<SetVisibleToAllUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetVisibleToAllUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setVisibleToAllUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetVisibleToAllUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetVisibleToAllUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetVisibleToAllUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet
     * completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not
     * already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created.
     * </p>
     * <p>
     * The maximum number of clusters allowed is 10. The call to <code>TerminateJobFlows</code> is asynchronous.
     * Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely
     * terminate and release allocated resources, such as Amazon EC2 instances.
     * </p>
     * 
     * @param terminateJobFlowsRequest
     *        Input to the <a>TerminateJobFlows</a> operation.
     * @return Result of the TerminateJobFlows operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.TerminateJobFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/TerminateJobFlows"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TerminateJobFlowsResult terminateJobFlows(TerminateJobFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateJobFlows(request);
    }

    @SdkInternalApi
    final TerminateJobFlowsResult executeTerminateJobFlows(TerminateJobFlowsRequest terminateJobFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateJobFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateJobFlowsRequest> request = null;
        Response<TerminateJobFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateJobFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateJobFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateJobFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateJobFlowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TerminateJobFlowsResultJsonUnmarshaller());
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
    public AmazonElasticMapReduceWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonElasticMapReduceWaiters(this);
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
