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
package com.amazonaws.services.batch;

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

import com.amazonaws.services.batch.AWSBatchClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.services.batch.model.transform.*;

/**
 * Client for accessing AWS Batch. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Batch</fullname>
 * <p>
 * Using Batch, you can run batch computing workloads on the Amazon Web Services Cloud. Batch computing is a common
 * means for developers, scientists, and engineers to access large amounts of compute resources. Batch uses the
 * advantages of the batch computing to remove the undifferentiated heavy lifting of configuring and managing required
 * infrastructure. At the same time, it also adopts a familiar batch computing software approach. You can use Batch to
 * efficiently provision resources d, and work toward eliminating capacity constraints, reducing your overall compute
 * costs, and delivering results more quickly.
 * </p>
 * <p>
 * As a fully managed service, Batch can run batch computing workloads of any scale. Batch automatically provisions
 * compute resources and optimizes workload distribution based on the quantity and scale of your specific workloads.
 * With Batch, there's no need to install or manage batch computing software. This means that you can focus on analyzing
 * results and solving your specific problems instead.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSBatchClient extends AmazonWebServiceClient implements AWSBatch {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSBatch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "batch";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.batch.model.transform.ServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.batch.model.transform.ClientExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.batch.model.AWSBatchException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Batch. A credentials provider chain will be used that
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
     * @deprecated use {@link AWSBatchClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSBatchClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to AWS Batch (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSBatchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSBatchClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSBatchClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSBatchClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSBatchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Batch (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSBatchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSBatchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSBatchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSBatchClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSBatchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Batch (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSBatchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSBatchClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSBatchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Batch (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSBatchClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSBatchClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSBatchClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSBatchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSBatchClientBuilder builder() {
        return AWSBatchClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBatchClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Batch using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSBatchClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("batch.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/batch/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/batch/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a job in an Batch job queue. Jobs that are in the <code>SUBMITTED</code>, <code>PENDING</code>, or
     * <code>RUNNABLE</code> state are canceled. Jobs that progressed to the <code>STARTING</code> or
     * <code>RUNNING</code> state aren't canceled. However, the API operation still succeeds, even if no job is
     * canceled. These jobs must be terminated with the <a>TerminateJob</a> operation.
     * </p>
     * 
     * @param cancelJobRequest
     *        Contains the parameters for <code>CancelJob</code>.
     * @return Result of the CancelJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CancelJob" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
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
     * Creates an Batch compute environment. You can create <code>MANAGED</code> or <code>UNMANAGED</code> compute
     * environments. <code>MANAGED</code> compute environments can use Amazon EC2 or Fargate resources.
     * <code>UNMANAGED</code> compute environments can only use EC2 resources.
     * </p>
     * <p>
     * In a managed compute environment, Batch manages the capacity and instance types of the compute resources within
     * the environment. This is based on the compute resource specification that you define or the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">launch template</a> that you
     * specify when you create the compute environment. Either, you can choose to use EC2 On-Demand Instances and EC2
     * Spot Instances. Or, you can use Fargate and Fargate Spot capacity in your managed compute environment. You can
     * optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is less than a
     * specified percentage of the On-Demand price.
     * </p>
     * <note>
     * <p>
     * Multi-node parallel jobs aren't supported on Spot Instances.
     * </p>
     * </note>
     * <p>
     * In an unmanaged compute environment, you can manage your own EC2 compute resources and have flexibility with how
     * you configure your compute resources. For example, you can use custom AMIs. However, you must verify that each of
     * your AMIs meet the Amazon ECS container instance AMI specification. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html">container
     * instance AMIs</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. After you created your
     * unmanaged compute environment, you can use the <a>DescribeComputeEnvironments</a> operation to find the Amazon
     * ECS cluster that's associated with it. Then, launch your container instances into that Amazon ECS cluster. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html">Launching an
     * Amazon ECS container instance</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * To create a compute environment that uses EKS resources, the caller must have permissions to call
     * <code>eks:DescribeCluster</code>.
     * </p>
     * </note> <note>
     * <p>
     * Batch doesn't automatically upgrade the AMIs in a compute environment after it's created. For example, it also
     * doesn't update the AMIs in your compute environment when a newer version of the Amazon ECS optimized AMI is
     * available. You're responsible for the management of the guest operating system. This includes any updates and
     * security patches. You're also responsible for any additional application software or utilities that you install
     * on the compute resources. There are two ways to use a new AMI for your Batch jobs. The original method is to
     * complete these steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a new compute environment with the new AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add the compute environment to an existing job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove the earlier compute environment from your job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete the earlier compute environment.
     * </p>
     * </li>
     * </ol>
     * <p>
     * In April 2022, Batch added enhanced support for updating compute environments. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html">Updating compute
     * environments</a>. To use the enhanced updating of compute environments to update AMIs, follow these rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Either don't set the service role (<code>serviceRole</code>) parameter or set it to the
     * <b>AWSBatchServiceRole</b> service-linked role.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set the allocation strategy (<code>allocationStrategy</code>) parameter to <code>BEST_FIT_PROGRESSIVE</code> or
     * <code>SPOT_CAPACITY_OPTIMIZED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set the update to latest image version (<code>updateToLatestImageVersion</code>) parameter to <code>true</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't specify an AMI ID in <code>imageId</code>, <code>imageIdOverride</code> (in <a
     * href="https://docs.aws.amazon.com/batch/latest/APIReference/API_Ec2Configuration.html">
     * <code>ec2Configuration</code> </a>), or in the launch template (<code>launchTemplate</code>). In that case, Batch
     * selects the latest Amazon ECS optimized AMI that's supported by Batch at the time the infrastructure update is
     * initiated. Alternatively, you can specify the AMI ID in the <code>imageId</code> or <code>imageIdOverride</code>
     * parameters, or the launch template identified by the <code>LaunchTemplate</code> properties. Changing any of
     * these properties starts an infrastructure update. If the AMI ID is specified in the launch template, it can't be
     * replaced by specifying an AMI ID in either the <code>imageId</code> or <code>imageIdOverride</code> parameters.
     * It can only be replaced by specifying a different launch template, or if the launch template version is set to
     * <code>$Default</code> or <code>$Latest</code>, by setting either a new default version for the launch template
     * (if <code>$Default</code>) or by adding a new version to the launch template (if <code>$Latest</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If these rules are followed, any update that starts an infrastructure update causes the AMI ID to be re-selected.
     * If the <code>version</code> setting in the launch template (<code>launchTemplate</code>) is set to
     * <code>$Latest</code> or <code>$Default</code>, the latest or default version of the launch template is evaluated
     * up at the time of the infrastructure update, even if the <code>launchTemplate</code> wasn't updated.
     * </p>
     * </note>
     * 
     * @param createComputeEnvironmentRequest
     *        Contains the parameters for <code>CreateComputeEnvironment</code>.
     * @return Result of the CreateComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CreateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateComputeEnvironmentResult createComputeEnvironment(CreateComputeEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateComputeEnvironment(request);
    }

    @SdkInternalApi
    final CreateComputeEnvironmentResult executeCreateComputeEnvironment(CreateComputeEnvironmentRequest createComputeEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createComputeEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComputeEnvironmentRequest> request = null;
        Response<CreateComputeEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComputeEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createComputeEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateComputeEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateComputeEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateComputeEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Batch job queue. When you create a job queue, you associate one or more compute environments to the
     * queue and assign an order of preference for the compute environments.
     * </p>
     * <p>
     * You also set a priority to the job queue that determines the order that the Batch scheduler places jobs onto its
     * associated compute environments. For example, if a compute environment is associated with more than one job
     * queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
     * </p>
     * 
     * @param createJobQueueRequest
     *        Contains the parameters for <code>CreateJobQueue</code>.
     * @return Result of the CreateJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CreateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateJobQueueResult createJobQueue(CreateJobQueueRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJobQueue(request);
    }

    @SdkInternalApi
    final CreateJobQueueResult executeCreateJobQueue(CreateJobQueueRequest createJobQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobQueueRequest> request = null;
        Response<CreateJobQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJobQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Batch scheduling policy.
     * </p>
     * 
     * @param createSchedulingPolicyRequest
     *        Contains the parameters for <code>CreateSchedulingPolicy</code>.
     * @return Result of the CreateSchedulingPolicy operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CreateSchedulingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateSchedulingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSchedulingPolicyResult createSchedulingPolicy(CreateSchedulingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSchedulingPolicy(request);
    }

    @SdkInternalApi
    final CreateSchedulingPolicyResult executeCreateSchedulingPolicy(CreateSchedulingPolicyRequest createSchedulingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createSchedulingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSchedulingPolicyRequest> request = null;
        Response<CreateSchedulingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSchedulingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSchedulingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSchedulingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSchedulingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSchedulingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Batch compute environment.
     * </p>
     * <p>
     * Before you can delete a compute environment, you must set its state to <code>DISABLED</code> with the
     * <a>UpdateComputeEnvironment</a> API operation and disassociate it from any job queues with the
     * <a>UpdateJobQueue</a> API operation. Compute environments that use Fargate resources must terminate all active
     * jobs on that compute environment before deleting the compute environment. If this isn't done, the compute
     * environment enters an invalid state.
     * </p>
     * 
     * @param deleteComputeEnvironmentRequest
     *        Contains the parameters for <code>DeleteComputeEnvironment</code>.
     * @return Result of the DeleteComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeleteComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteComputeEnvironmentResult deleteComputeEnvironment(DeleteComputeEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteComputeEnvironment(request);
    }

    @SdkInternalApi
    final DeleteComputeEnvironmentResult executeDeleteComputeEnvironment(DeleteComputeEnvironmentRequest deleteComputeEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteComputeEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteComputeEnvironmentRequest> request = null;
        Response<DeleteComputeEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteComputeEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteComputeEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteComputeEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteComputeEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteComputeEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified job queue. You must first disable submissions for a queue with the <a>UpdateJobQueue</a>
     * operation. All jobs in the queue are eventually terminated when you delete a job queue. The jobs are terminated
     * at a rate of about 16 jobs each second.
     * </p>
     * <p>
     * It's not necessary to disassociate compute environments from a queue before submitting a
     * <code>DeleteJobQueue</code> request.
     * </p>
     * 
     * @param deleteJobQueueRequest
     *        Contains the parameters for <code>DeleteJobQueue</code>.
     * @return Result of the DeleteJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeleteJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobQueueResult deleteJobQueue(DeleteJobQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJobQueue(request);
    }

    @SdkInternalApi
    final DeleteJobQueueResult executeDeleteJobQueue(DeleteJobQueueRequest deleteJobQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobQueueRequest> request = null;
        Response<DeleteJobQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJobQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified scheduling policy.
     * </p>
     * <p>
     * You can't delete a scheduling policy that's used in any job queues.
     * </p>
     * 
     * @param deleteSchedulingPolicyRequest
     *        Contains the parameters for <code>DeleteSchedulingPolicy</code>.
     * @return Result of the DeleteSchedulingPolicy operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeleteSchedulingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteSchedulingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSchedulingPolicyResult deleteSchedulingPolicy(DeleteSchedulingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchedulingPolicy(request);
    }

    @SdkInternalApi
    final DeleteSchedulingPolicyResult executeDeleteSchedulingPolicy(DeleteSchedulingPolicyRequest deleteSchedulingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSchedulingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchedulingPolicyRequest> request = null;
        Response<DeleteSchedulingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchedulingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSchedulingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchedulingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSchedulingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSchedulingPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters an Batch job definition. Job definitions are permanently deleted after 180 days.
     * </p>
     * 
     * @param deregisterJobDefinitionRequest
     * @return Result of the DeregisterJobDefinition operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeregisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeregisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterJobDefinitionResult deregisterJobDefinition(DeregisterJobDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterJobDefinition(request);
    }

    @SdkInternalApi
    final DeregisterJobDefinitionResult executeDeregisterJobDefinition(DeregisterJobDefinitionRequest deregisterJobDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterJobDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterJobDefinitionRequest> request = null;
        Response<DeregisterJobDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterJobDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterJobDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterJobDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterJobDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterJobDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your compute environments.
     * </p>
     * <p>
     * If you're using an unmanaged compute environment, you can use the <code>DescribeComputeEnvironment</code>
     * operation to determine the <code>ecsClusterArn</code> that you launch your Amazon ECS container instances into.
     * </p>
     * 
     * @param describeComputeEnvironmentsRequest
     *        Contains the parameters for <code>DescribeComputeEnvironments</code>.
     * @return Result of the DescribeComputeEnvironments operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeComputeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeComputeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeComputeEnvironmentsResult describeComputeEnvironments(DescribeComputeEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeComputeEnvironments(request);
    }

    @SdkInternalApi
    final DescribeComputeEnvironmentsResult executeDescribeComputeEnvironments(DescribeComputeEnvironmentsRequest describeComputeEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeComputeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeComputeEnvironmentsRequest> request = null;
        Response<DescribeComputeEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeComputeEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeComputeEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeComputeEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeComputeEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeComputeEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a list of job definitions. You can specify a <code>status</code> (such as <code>ACTIVE</code>) to only
     * return job definitions that match that status.
     * </p>
     * 
     * @param describeJobDefinitionsRequest
     *        Contains the parameters for <code>DescribeJobDefinitions</code>.
     * @return Result of the DescribeJobDefinitions operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeJobDefinitionsResult describeJobDefinitions(DescribeJobDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobDefinitions(request);
    }

    @SdkInternalApi
    final DescribeJobDefinitionsResult executeDescribeJobDefinitions(DescribeJobDefinitionsRequest describeJobDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobDefinitionsRequest> request = null;
        Response<DescribeJobDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeJobDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your job queues.
     * </p>
     * 
     * @param describeJobQueuesRequest
     *        Contains the parameters for <code>DescribeJobQueues</code>.
     * @return Result of the DescribeJobQueues operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobQueues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeJobQueuesResult describeJobQueues(DescribeJobQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobQueues(request);
    }

    @SdkInternalApi
    final DescribeJobQueuesResult executeDescribeJobQueues(DescribeJobQueuesRequest describeJobQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobQueuesRequest> request = null;
        Response<DescribeJobQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobQueuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a list of Batch jobs.
     * </p>
     * 
     * @param describeJobsRequest
     *        Contains the parameters for <code>DescribeJobs</code>.
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobs" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
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
     * Describes one or more of your scheduling policies.
     * </p>
     * 
     * @param describeSchedulingPoliciesRequest
     *        Contains the parameters for <code>DescribeSchedulingPolicies</code>.
     * @return Result of the DescribeSchedulingPolicies operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeSchedulingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeSchedulingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSchedulingPoliciesResult describeSchedulingPolicies(DescribeSchedulingPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSchedulingPolicies(request);
    }

    @SdkInternalApi
    final DescribeSchedulingPoliciesResult executeDescribeSchedulingPolicies(DescribeSchedulingPoliciesRequest describeSchedulingPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSchedulingPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchedulingPoliciesRequest> request = null;
        Response<DescribeSchedulingPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchedulingPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSchedulingPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSchedulingPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSchedulingPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSchedulingPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Batch jobs.
     * </p>
     * <p>
     * You must specify only one of the following items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A job queue ID to return a list of jobs in that job queue
     * </p>
     * </li>
     * <li>
     * <p>
     * A multi-node parallel job ID to return a list of nodes for that job
     * </p>
     * </li>
     * <li>
     * <p>
     * An array job ID to return a list of the children for that job
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can filter the results by job status with the <code>jobStatus</code> parameter. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param listJobsRequest
     *        Contains the parameters for <code>ListJobs</code>.
     * @return Result of the ListJobs operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListJobs" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
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
     * Returns a list of Batch scheduling policies.
     * </p>
     * 
     * @param listSchedulingPoliciesRequest
     *        Contains the parameters for <code>ListSchedulingPolicies</code>.
     * @return Result of the ListSchedulingPolicies operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.ListSchedulingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListSchedulingPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSchedulingPoliciesResult listSchedulingPolicies(ListSchedulingPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListSchedulingPolicies(request);
    }

    @SdkInternalApi
    final ListSchedulingPoliciesResult executeListSchedulingPolicies(ListSchedulingPoliciesRequest listSchedulingPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchedulingPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchedulingPoliciesRequest> request = null;
        Response<ListSchedulingPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchedulingPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchedulingPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchedulingPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchedulingPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSchedulingPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for an Batch resource. Batch resources that support tags are compute environments, jobs, job
     * definitions, job queues, and scheduling policies. ARNs for child jobs of array and multi-node parallel (MNP) jobs
     * aren't supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Contains the parameters for <code>ListTagsForResource</code>.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
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
     * Registers an Batch job definition.
     * </p>
     * 
     * @param registerJobDefinitionRequest
     *        Contains the parameters for <code>RegisterJobDefinition</code>.
     * @return Result of the RegisterJobDefinition operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.RegisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/RegisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterJobDefinitionResult registerJobDefinition(RegisterJobDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterJobDefinition(request);
    }

    @SdkInternalApi
    final RegisterJobDefinitionResult executeRegisterJobDefinition(RegisterJobDefinitionRequest registerJobDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(registerJobDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterJobDefinitionRequest> request = null;
        Response<RegisterJobDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterJobDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerJobDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterJobDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterJobDefinitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RegisterJobDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Submits an Batch job from a job definition. Parameters that are specified during <a>SubmitJob</a> override
     * parameters defined in the job definition. vCPU and memory requirements that are specified in the
     * <code>resourceRequirements</code> objects in the job definition are the exception. They can't be overridden this
     * way using the <code>memory</code> and <code>vcpus</code> parameters. Rather, you must specify updates to job
     * definition parameters in a <code>resourceRequirements</code> object that's included in the
     * <code>containerOverrides</code> parameter.
     * </p>
     * <note>
     * <p>
     * Job queues with a scheduling policy are limited to 500 active fair share identifiers at a time.
     * </p>
     * </note> <important>
     * <p>
     * Jobs that run on Fargate resources can't be guaranteed to run for more than 14 days. This is because, after 14
     * days, Fargate resources might become unavailable and job might be terminated.
     * </p>
     * </important>
     * 
     * @param submitJobRequest
     *        Contains the parameters for <code>SubmitJob</code>.
     * @return Result of the SubmitJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.SubmitJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/SubmitJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SubmitJobResult submitJob(SubmitJobRequest request) {
        request = beforeClientExecution(request);
        return executeSubmitJob(request);
    }

    @SdkInternalApi
    final SubmitJobResult executeSubmitJob(SubmitJobRequest submitJobRequest) {

        ExecutionContext executionContext = createExecutionContext(submitJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitJobRequest> request = null;
        Response<SubmitJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(submitJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubmitJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubmitJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SubmitJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * that are associated with that resource are deleted as well. Batch resources that support tags are compute
     * environments, jobs, job definitions, job queues, and scheduling policies. ARNs for child jobs of array and
     * multi-node parallel (MNP) jobs aren't supported.
     * </p>
     * 
     * @param tagResourceRequest
     *        Contains the parameters for <code>TagResource</code>.
     * @return Result of the TagResource operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
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
     * Terminates a job in a job queue. Jobs that are in the <code>STARTING</code> or <code>RUNNING</code> state are
     * terminated, which causes them to transition to <code>FAILED</code>. Jobs that have not progressed to the
     * <code>STARTING</code> state are cancelled.
     * </p>
     * 
     * @param terminateJobRequest
     *        Contains the parameters for <code>TerminateJob</code>.
     * @return Result of the TerminateJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.TerminateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TerminateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TerminateJobResult terminateJob(TerminateJobRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateJob(request);
    }

    @SdkInternalApi
    final TerminateJobResult executeTerminateJob(TerminateJobRequest terminateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateJobRequest> request = null;
        Response<TerminateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TerminateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes specified tags from an Batch resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Contains the parameters for <code>UntagResource</code>.
     * @return Result of the UntagResource operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
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
     * Updates an Batch compute environment.
     * </p>
     * 
     * @param updateComputeEnvironmentRequest
     *        Contains the parameters for <code>UpdateComputeEnvironment</code>.
     * @return Result of the UpdateComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UpdateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateComputeEnvironmentResult updateComputeEnvironment(UpdateComputeEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateComputeEnvironment(request);
    }

    @SdkInternalApi
    final UpdateComputeEnvironmentResult executeUpdateComputeEnvironment(UpdateComputeEnvironmentRequest updateComputeEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateComputeEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateComputeEnvironmentRequest> request = null;
        Response<UpdateComputeEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateComputeEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateComputeEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateComputeEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateComputeEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateComputeEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a job queue.
     * </p>
     * 
     * @param updateJobQueueRequest
     *        Contains the parameters for <code>UpdateJobQueue</code>.
     * @return Result of the UpdateJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UpdateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateJobQueueResult updateJobQueue(UpdateJobQueueRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJobQueue(request);
    }

    @SdkInternalApi
    final UpdateJobQueueResult executeUpdateJobQueue(UpdateJobQueueRequest updateJobQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobQueueRequest> request = null;
        Response<UpdateJobQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJobQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a scheduling policy.
     * </p>
     * 
     * @param updateSchedulingPolicyRequest
     *        Contains the parameters for <code>UpdateSchedulingPolicy</code>.
     * @return Result of the UpdateSchedulingPolicy operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action. One example cause is using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource. Another cause is specifying
     *         an identifier that's not valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UpdateSchedulingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateSchedulingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSchedulingPolicyResult updateSchedulingPolicy(UpdateSchedulingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSchedulingPolicy(request);
    }

    @SdkInternalApi
    final UpdateSchedulingPolicyResult executeUpdateSchedulingPolicy(UpdateSchedulingPolicyRequest updateSchedulingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSchedulingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSchedulingPolicyRequest> request = null;
        Response<UpdateSchedulingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSchedulingPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSchedulingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Batch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSchedulingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSchedulingPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSchedulingPolicyResultJsonUnmarshaller());
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
