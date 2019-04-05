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
package com.amazonaws.services.ecs;

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

import com.amazonaws.services.ecs.AmazonECSClientBuilder;
import com.amazonaws.services.ecs.waiters.AmazonECSWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.services.ecs.model.transform.*;

/**
 * Client for accessing Amazon ECS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Elastic Container Service</fullname>
 * <p>
 * Amazon Elastic Container Service (Amazon ECS) is a highly scalable, fast, container management service that makes it
 * easy to run, stop, and manage Docker containers on a cluster. You can host your cluster on a serverless
 * infrastructure that is managed by Amazon ECS by launching your services or tasks using the Fargate launch type. For
 * more control, you can host your tasks on a cluster of Amazon Elastic Compute Cloud (Amazon EC2) instances that you
 * manage by using the EC2 launch type. For more information about launch types, see <a
 * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>.
 * </p>
 * <p>
 * Amazon ECS lets you launch and stop container-based applications with simple API calls, allows you to get the state
 * of your cluster from a centralized service, and gives you access to many familiar Amazon EC2 features.
 * </p>
 * <p>
 * You can use Amazon ECS to schedule the placement of containers across your cluster based on your resource needs,
 * isolation policies, and availability requirements. Amazon ECS eliminates the need for you to operate your own cluster
 * management and configuration management systems or worry about scaling your management infrastructure.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonECSClient extends AmazonWebServiceClient implements AmazonECS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonECS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ecs";

    private volatile AmazonECSWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BlockedException").withModeledClass(
                                    com.amazonaws.services.ecs.model.BlockedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterContainsServicesException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ClusterContainsServicesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedFeatureException").withModeledClass(
                                    com.amazonaws.services.ecs.model.UnsupportedFeatureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterNotFoundException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ClusterNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ClientException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PlatformUnknownException").withModeledClass(
                                    com.amazonaws.services.ecs.model.PlatformUnknownException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpdateInProgressException").withModeledClass(
                                    com.amazonaws.services.ecs.model.UpdateInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterContainsTasksException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ClusterContainsTasksException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.ecs.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoUpdateAvailableException").withModeledClass(
                                    com.amazonaws.services.ecs.model.NoUpdateAvailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PlatformTaskDefinitionIncompatibilityException").withModeledClass(
                                    com.amazonaws.services.ecs.model.PlatformTaskDefinitionIncompatibilityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingVersionException").withModeledClass(
                                    com.amazonaws.services.ecs.model.MissingVersionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterContainsContainerInstancesException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ClusterContainsContainerInstancesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceNotFoundException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ServiceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TaskSetNotFoundException").withModeledClass(
                                    com.amazonaws.services.ecs.model.TaskSetNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AttributeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.ecs.model.AttributeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.ecs.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceNotActiveException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ServiceNotActiveException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerException").withModeledClass(
                                    com.amazonaws.services.ecs.model.ServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TargetNotFoundException").withModeledClass(
                                    com.amazonaws.services.ecs.model.TargetNotFoundException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ecs.model.AmazonECSException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon ECS. A credentials provider chain will be used that
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
     * @deprecated use {@link AmazonECSClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonECSClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Amazon ECS (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonECSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonECSClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonECSClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonECSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonECSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ECS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonECSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonECSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonECSClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonECSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ECS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonECSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonECSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon ECS (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonECSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonECSClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonECSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonECSClientBuilder builder() {
        return AmazonECSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonECSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon ECS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonECSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://ecs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ecs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ecs/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account receives a <code>default</code> cluster when you
     * launch your first container instance. However, you can create your own cluster with a unique name with the
     * <code>CreateCluster</code> action.
     * </p>
     * <note>
     * <p>
     * When you call the <a>CreateCluster</a> API operation, Amazon ECS attempts to create the service-linked role for
     * your account so that required resources in other AWS services can be managed on your behalf. However, if the IAM
     * user that makes the call does not have permissions to create the service-linked role, it is not created. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
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

    @Override
    public CreateClusterResult createCluster() {
        return createCluster(new CreateClusterRequest());
    }

    /**
     * <p>
     * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in
     * a service drops below the <code>desiredCount</code>, Amazon ECS spawns another copy of the task in the specified
     * cluster. To update an existing service, see <a>UpdateService</a>.
     * </p>
     * <p>
     * In addition to maintaining the desired count of tasks in your service, you can optionally run your service behind
     * a load balancer. The load balancer distributes traffic across the tasks that are associated with the service. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html">Service Load
     * Balancing</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * Tasks for services that <i>do not</i> use a load balancer are considered healthy if they're in the
     * <code>RUNNING</code> state. Tasks for services that <i>do</i> use a load balancer are considered healthy if
     * they're in the <code>RUNNING</code> state and the container instance that they're hosted on is reported as
     * healthy by the load balancer.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code> - The replica scheduling strategy places and maintains the desired number of tasks across
     * your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task
     * placement strategies and constraints to customize task placement decisions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Service Scheduler
     * Concepts</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code> - The daemon scheduling strategy deploys exactly one task on each active container instance
     * that meets all of the task placement constraints that you specify in your cluster. When using this strategy, you
     * don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto Scaling policies.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Service Scheduler
     * Concepts</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can optionally specify a deployment configuration for your service. The deployment is triggered by changing
     * properties, such as the task definition or the desired count of a service, with an <a>UpdateService</a>
     * operation. The default value for a replica service for <code>minimumHealthyPercent</code> is 100%. The default
     * value for a daemon service for <code>minimumHealthyPercent</code> is 0%.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the minimum healthy percent represents a lower
     * limit on the number of tasks in a service that must remain in the <code>RUNNING</code> state during a deployment,
     * as a percentage of the desired number of tasks (rounded up to the nearest integer), and while any container
     * instances are in the <code>DRAINING</code> state if the service contains tasks using the EC2 launch type. This
     * parameter enables you to deploy without using additional cluster capacity. For example, if your service has a
     * desired number of four tasks and a minimum healthy percent of 50%, the scheduler might stop two existing tasks to
     * free up cluster capacity before starting two new tasks. Tasks for services that <i>do not</i> use a load balancer
     * are considered healthy if they're in the <code>RUNNING</code> state. Tasks for services that <i>do</i> use a load
     * balancer are considered healthy if they're in the <code>RUNNING</code> state and they're reported as healthy by
     * the load balancer. The default value for minimum healthy percent is 100%.
     * </p>
     * <p>
     * If a service is using the <code>ECS</code> deployment controller, the <b>maximum percent</b> parameter represents
     * an upper limit on the number of tasks in a service that are allowed in the <code>RUNNING</code> or
     * <code>PENDING</code> state during a deployment, as a percentage of the desired number of tasks (rounded down to
     * the nearest integer), and while any container instances are in the <code>DRAINING</code> state if the service
     * contains tasks using the EC2 launch type. This parameter enables you to define the deployment batch size. For
     * example, if your service has a desired number of four tasks and a maximum percent value of 200%, the scheduler
     * may start four new tasks before stopping the four older tasks (provided that the cluster resources required to do
     * this are available). The default value for maximum percent is 200%.
     * </p>
     * <p>
     * If a service is using either the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment controller types
     * and tasks that use the EC2 launch type, the <b>minimum healthy percent</b> and <b>maximum percent</b> values are
     * used only to define the lower and upper limit on the number of the tasks in the service that remain in the
     * <code>RUNNING</code> state while the container instances are in the <code>DRAINING</code> state. If the tasks in
     * the service use the Fargate launch type, the minimum healthy percent and maximum percent values aren't used,
     * although they're currently visible when describing your service.
     * </p>
     * <p>
     * When creating a service that uses the <code>EXTERNAL</code> deployment controller, you can specify only
     * parameters that aren't controlled at the task set level. The only required parameter is the service name. You
     * control your services using the <a>CreateTaskSet</a> operation. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html">Amazon ECS Deployment
     * Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * When the service scheduler launches new tasks, it determines task placement in your cluster using the following
     * logic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Determine which of the container instances in your cluster can support your service's task definition (for
     * example, they have the required CPU, memory, ports, and container instance attributes).
     * </p>
     * </li>
     * <li>
     * <p>
     * By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although
     * you can choose a different placement strategy) with the <code>placementStrategy</code> parameter):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sort the valid container instances, giving priority to instances that have the fewest number of running tasks for
     * this service in their respective Availability Zone. For example, if zone A has one running service task and zones
     * B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous
     * steps), favoring container instances with the fewest number of running tasks for this service.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UnsupportedFeatureException
     *         The specified task is not supported in this Region.
     * @throws PlatformUnknownException
     *         The specified platform version does not exist.
     * @throws PlatformTaskDefinitionIncompatibilityException
     *         The specified platform version does not satisfy the task definition's required capabilities.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @sample AmazonECS.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateServiceResult createService(CreateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateService(request);
    }

    @SdkInternalApi
    final CreateServiceResult executeCreateService(CreateServiceRequest createServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a task set in the specified cluster and service. This is used when a service uses the
     * <code>EXTERNAL</code> deployment controller type. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html">Amazon ECS Deployment
     * Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param createTaskSetRequest
     * @return Result of the CreateTaskSet operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UnsupportedFeatureException
     *         The specified task is not supported in this Region.
     * @throws PlatformUnknownException
     *         The specified platform version does not exist.
     * @throws PlatformTaskDefinitionIncompatibilityException
     *         The specified platform version does not satisfy the task definition's required capabilities.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @throws ServiceNotActiveException
     *         The specified service is not active. You can't update a service that is inactive. If you have previously
     *         deleted a service, you can re-create it with <a>CreateService</a>.
     * @sample AmazonECS.CreateTaskSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateTaskSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTaskSetResult createTaskSet(CreateTaskSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTaskSet(request);
    }

    @SdkInternalApi
    final CreateTaskSetResult executeCreateTaskSet(CreateTaskSetRequest createTaskSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTaskSetRequest> request = null;
        Response<CreateTaskSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTaskSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTaskSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTaskSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTaskSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTaskSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the ARN and resource ID format of a resource for a specified IAM user, IAM role, or the root user for an
     * account. You can specify whether the new ARN and resource ID format are disabled for new resources that are
     * created.
     * </p>
     * 
     * @param deleteAccountSettingRequest
     * @return Result of the DeleteAccountSetting operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DeleteAccountSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteAccountSetting" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAccountSettingResult deleteAccountSetting(DeleteAccountSettingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountSetting(request);
    }

    @SdkInternalApi
    final DeleteAccountSettingResult executeDeleteAccountSetting(DeleteAccountSettingRequest deleteAccountSettingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccountSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountSettingRequest> request = null;
        Response<DeleteAccountSettingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountSettingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAccountSettingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountSetting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccountSettingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAccountSettingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one or more custom attributes from an Amazon ECS resource.
     * </p>
     * 
     * @param deleteAttributesRequest
     * @return Result of the DeleteAttributes operation returned by the service.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws TargetNotFoundException
     *         The specified target could not be found. You can view your available container instances with
     *         <a>ListContainerInstances</a>. Amazon ECS container instances are cluster-specific and Region-specific.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DeleteAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAttributesResult deleteAttributes(DeleteAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAttributes(request);
    }

    @SdkInternalApi
    final DeleteAttributesResult executeDeleteAttributes(DeleteAttributesRequest deleteAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttributesRequest> request = null;
        Response<DeleteAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified cluster. You must deregister all container instances from this cluster before you may
     * delete it. You can list the container instances in a cluster with <a>ListContainerInstances</a> and deregister
     * them with <a>DeregisterContainerInstance</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws ClusterContainsContainerInstancesException
     *         You cannot delete a cluster that has registered container instances. First, deregister the container
     *         instances before you can delete the cluster. For more information, see
     *         <a>DeregisterContainerInstance</a>.
     * @throws ClusterContainsServicesException
     *         You cannot delete a cluster that contains services. First, update the service to reduce its desired task
     *         count to 0 and then delete the service. For more information, see <a>UpdateService</a> and
     *         <a>DeleteService</a>.
     * @throws ClusterContainsTasksException
     *         You cannot delete a cluster that has active tasks.
     * @sample AmazonECS.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCluster(request);
    }

    @SdkInternalApi
    final DeleteClusterResult executeDeleteCluster(DeleteClusterRequest deleteClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified service within a cluster. You can delete a service if you have no running tasks in it and the
     * desired task count is zero. If the service is actively maintaining tasks, you cannot delete it, and you must
     * update the service to a desired task count of zero. For more information, see <a>UpdateService</a>.
     * </p>
     * <note>
     * <p>
     * When you delete a service, if there are still running tasks that require cleanup, the service status moves from
     * <code>ACTIVE</code> to <code>DRAINING</code>, and the service is no longer visible in the console or in the
     * <a>ListServices</a> API operation. After the tasks have stopped, then the service status moves from
     * <code>DRAINING</code> to <code>INACTIVE</code>. Services in the <code>DRAINING</code> or <code>INACTIVE</code>
     * status can still be viewed with the <a>DescribeServices</a> API operation. However, in the future,
     * <code>INACTIVE</code> services may be cleaned up and purged from Amazon ECS record keeping, and
     * <a>DescribeServices</a> calls on those services return a <code>ServiceNotFoundException</code> error.
     * </p>
     * </note> <important>
     * <p>
     * If you attempt to create a new service with the same name as an existing service in either <code>ACTIVE</code> or
     * <code>DRAINING</code> status, you receive an error.
     * </p>
     * </important>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @sample AmazonECS.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteService(request);
    }

    @SdkInternalApi
    final DeleteServiceResult executeDeleteService(DeleteServiceRequest deleteServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified task set within a service. This is used when a service uses the <code>EXTERNAL</code>
     * deployment controller type. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html">Amazon ECS Deployment
     * Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param deleteTaskSetRequest
     * @return Result of the DeleteTaskSet operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UnsupportedFeatureException
     *         The specified task is not supported in this Region.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @throws ServiceNotActiveException
     *         The specified service is not active. You can't update a service that is inactive. If you have previously
     *         deleted a service, you can re-create it with <a>CreateService</a>.
     * @throws TaskSetNotFoundException
     *         The specified task set could not be found. You can view your available container instances with
     *         <a>DescribeTaskSets</a>. Task sets are specific to each cluster, service and Region.
     * @sample AmazonECS.DeleteTaskSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteTaskSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTaskSetResult deleteTaskSet(DeleteTaskSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTaskSet(request);
    }

    @SdkInternalApi
    final DeleteTaskSetResult executeDeleteTaskSet(DeleteTaskSetRequest deleteTaskSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTaskSetRequest> request = null;
        Response<DeleteTaskSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTaskSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTaskSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTaskSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTaskSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTaskSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters an Amazon ECS container instance from the specified cluster. This instance is no longer available to
     * run tasks.
     * </p>
     * <p>
     * If you intend to use the container instance for some other purpose after deregistration, you should stop all of
     * the tasks running on the container instance before deregistration. That prevents any orphaned tasks from
     * consuming resources.
     * </p>
     * <p>
     * Deregistering a container instance removes the instance from a cluster, but it does not terminate the EC2
     * instance. If you are finished using the instance, be sure to terminate it in the Amazon EC2 console to stop
     * billing.
     * </p>
     * <note>
     * <p>
     * If you terminate a running container instance, Amazon ECS automatically deregisters the instance from your
     * cluster (stopped container instances or instances with disconnected agents are not automatically deregistered
     * when terminated).
     * </p>
     * </note>
     * 
     * @param deregisterContainerInstanceRequest
     * @return Result of the DeregisterContainerInstance operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.DeregisterContainerInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeregisterContainerInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterContainerInstanceResult deregisterContainerInstance(DeregisterContainerInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterContainerInstance(request);
    }

    @SdkInternalApi
    final DeregisterContainerInstanceResult executeDeregisterContainerInstance(DeregisterContainerInstanceRequest deregisterContainerInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterContainerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterContainerInstanceRequest> request = null;
        Response<DeregisterContainerInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterContainerInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterContainerInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterContainerInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterContainerInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterContainerInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters the specified task definition by family and revision. Upon deregistration, the task definition is
     * marked as <code>INACTIVE</code>. Existing tasks and services that reference an <code>INACTIVE</code> task
     * definition continue to run without disruption. Existing services that reference an <code>INACTIVE</code> task
     * definition can still scale up or down by modifying the service's desired count.
     * </p>
     * <p>
     * You cannot use an <code>INACTIVE</code> task definition to run new tasks or create new services, and you cannot
     * update an existing service to reference an <code>INACTIVE</code> task definition. However, there may be up to a
     * 10-minute window following deregistration where these restrictions have not yet taken effect.
     * </p>
     * <note>
     * <p>
     * At this time, <code>INACTIVE</code> task definitions remain discoverable in your account indefinitely. However,
     * this behavior is subject to change in the future, so you should not rely on <code>INACTIVE</code> task
     * definitions persisting beyond the lifecycle of any associated tasks and services.
     * </p>
     * </note>
     * 
     * @param deregisterTaskDefinitionRequest
     * @return Result of the DeregisterTaskDefinition operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DeregisterTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeregisterTaskDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterTaskDefinitionResult deregisterTaskDefinition(DeregisterTaskDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterTaskDefinition(request);
    }

    @SdkInternalApi
    final DeregisterTaskDefinitionResult executeDeregisterTaskDefinition(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTaskDefinitionRequest> request = null;
        Response<DeregisterTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTaskDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterTaskDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterTaskDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterTaskDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     * 
     * @param describeClustersRequest
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeClustersResult describeClusters(DescribeClustersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusters(request);
    }

    @SdkInternalApi
    final DescribeClustersResult executeDescribeClusters(DescribeClustersRequest describeClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClustersRequest> request = null;
        Response<DescribeClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeClustersResult describeClusters() {
        return describeClusters(new DescribeClustersRequest());
    }

    /**
     * <p>
     * Describes Amazon Elastic Container Service container instances. Returns metadata about registered and remaining
     * resources on each container instance requested.
     * </p>
     * 
     * @param describeContainerInstancesRequest
     * @return Result of the DescribeContainerInstances operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.DescribeContainerInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeContainerInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeContainerInstancesResult describeContainerInstances(DescribeContainerInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContainerInstances(request);
    }

    @SdkInternalApi
    final DescribeContainerInstancesResult executeDescribeContainerInstances(DescribeContainerInstancesRequest describeContainerInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContainerInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContainerInstancesRequest> request = null;
        Response<DescribeContainerInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContainerInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeContainerInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContainerInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContainerInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeContainerInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified services running in your cluster.
     * </p>
     * 
     * @param describeServicesRequest
     * @return Result of the DescribeServices operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeServicesResult describeServices(DescribeServicesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServices(request);
    }

    @SdkInternalApi
    final DescribeServicesResult executeDescribeServices(DescribeServicesRequest describeServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServicesRequest> request = null;
        Response<DescribeServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a task definition. You can specify a <code>family</code> and <code>revision</code> to find information
     * about a specific task definition, or you can simply specify the family to find the latest <code>ACTIVE</code>
     * revision in that family.
     * </p>
     * <note>
     * <p>
     * You can only describe <code>INACTIVE</code> task definitions while an active task or service references them.
     * </p>
     * </note>
     * 
     * @param describeTaskDefinitionRequest
     * @return Result of the DescribeTaskDefinition operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DescribeTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTaskDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTaskDefinitionResult describeTaskDefinition(DescribeTaskDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTaskDefinition(request);
    }

    @SdkInternalApi
    final DescribeTaskDefinitionResult executeDescribeTaskDefinition(DescribeTaskDefinitionRequest describeTaskDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskDefinitionRequest> request = null;
        Response<DescribeTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTaskDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTaskDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTaskDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the task sets in the specified cluster and service. This is used when a service uses the
     * <code>EXTERNAL</code> deployment controller type. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html">Amazon ECS Deployment
     * Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param describeTaskSetsRequest
     * @return Result of the DescribeTaskSets operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UnsupportedFeatureException
     *         The specified task is not supported in this Region.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @throws ServiceNotActiveException
     *         The specified service is not active. You can't update a service that is inactive. If you have previously
     *         deleted a service, you can re-create it with <a>CreateService</a>.
     * @sample AmazonECS.DescribeTaskSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTaskSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTaskSetsResult describeTaskSets(DescribeTaskSetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTaskSets(request);
    }

    @SdkInternalApi
    final DescribeTaskSetsResult executeDescribeTaskSets(DescribeTaskSetsRequest describeTaskSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTaskSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskSetsRequest> request = null;
        Response<DescribeTaskSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTaskSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTaskSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTaskSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTaskSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a specified task or tasks.
     * </p>
     * 
     * @param describeTasksRequest
     * @return Result of the DescribeTasks operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.DescribeTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTasksResult describeTasks(DescribeTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTasks(request);
    }

    @SdkInternalApi
    final DescribeTasksResult executeDescribeTasks(DescribeTasksRequest describeTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTasksRequest> request = null;
        Response<DescribeTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Returns an endpoint for the Amazon ECS agent to poll for updates.
     * </p>
     * 
     * @param discoverPollEndpointRequest
     * @return Result of the DiscoverPollEndpoint operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @sample AmazonECS.DiscoverPollEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DiscoverPollEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DiscoverPollEndpointResult discoverPollEndpoint(DiscoverPollEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDiscoverPollEndpoint(request);
    }

    @SdkInternalApi
    final DiscoverPollEndpointResult executeDiscoverPollEndpoint(DiscoverPollEndpointRequest discoverPollEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(discoverPollEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DiscoverPollEndpointRequest> request = null;
        Response<DiscoverPollEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DiscoverPollEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(discoverPollEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DiscoverPollEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DiscoverPollEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DiscoverPollEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DiscoverPollEndpointResult discoverPollEndpoint() {
        return discoverPollEndpoint(new DiscoverPollEndpointRequest());
    }

    /**
     * <p>
     * Lists the account settings for an Amazon ECS resource for a specified principal.
     * </p>
     * 
     * @param listAccountSettingsRequest
     * @return Result of the ListAccountSettings operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAccountSettingsResult listAccountSettings(ListAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountSettings(request);
    }

    @SdkInternalApi
    final ListAccountSettingsResult executeListAccountSettings(ListAccountSettingsRequest listAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountSettingsRequest> request = null;
        Response<ListAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the attributes for Amazon ECS resources within a specified target type and cluster. When you specify a
     * target type and cluster, <code>ListAttributes</code> returns a list of attribute objects, one for each attribute
     * on each resource. You can filter the list of results to a single attribute name to only return results that have
     * that name. You can also filter the results by attribute name and value, for example, to see which container
     * instances in a cluster are running a Linux AMI (<code>ecs.os-type=linux</code>).
     * </p>
     * 
     * @param listAttributesRequest
     * @return Result of the ListAttributes operation returned by the service.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAttributesResult listAttributes(ListAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeListAttributes(request);
    }

    @SdkInternalApi
    final ListAttributesResult executeListAttributes(ListAttributesRequest listAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttributesRequest> request = null;
        Response<ListAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListClusters" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
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
     * Returns a list of container instances in a specified cluster. You can filter the results of a
     * <code>ListContainerInstances</code> operation with cluster query language statements inside the
     * <code>filter</code> parameter. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param listContainerInstancesRequest
     * @return Result of the ListContainerInstances operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.ListContainerInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListContainerInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListContainerInstancesResult listContainerInstances(ListContainerInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListContainerInstances(request);
    }

    @SdkInternalApi
    final ListContainerInstancesResult executeListContainerInstances(ListContainerInstancesRequest listContainerInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listContainerInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContainerInstancesRequest> request = null;
        Response<ListContainerInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContainerInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContainerInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContainerInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContainerInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListContainerInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListContainerInstancesResult listContainerInstances() {
        return listContainerInstances(new ListContainerInstancesRequest());
    }

    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListServices(request);
    }

    @SdkInternalApi
    final ListServicesResult executeListServices(ListServicesRequest listServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListServicesResult listServices() {
        return listServices(new ListServicesRequest());
    }

    /**
     * <p>
     * List the tags for an Amazon ECS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
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
     * Returns a list of task definition families that are registered to your account (which may include task definition
     * families that no longer have any <code>ACTIVE</code> task definition revisions).
     * </p>
     * <p>
     * You can filter out task definition families that do not contain any <code>ACTIVE</code> task definition revisions
     * by setting the <code>status</code> parameter to <code>ACTIVE</code>. You can also filter the results with the
     * <code>familyPrefix</code> parameter.
     * </p>
     * 
     * @param listTaskDefinitionFamiliesRequest
     * @return Result of the ListTaskDefinitionFamilies operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListTaskDefinitionFamilies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTaskDefinitionFamilies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest request) {
        request = beforeClientExecution(request);
        return executeListTaskDefinitionFamilies(request);
    }

    @SdkInternalApi
    final ListTaskDefinitionFamiliesResult executeListTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTaskDefinitionFamiliesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskDefinitionFamiliesRequest> request = null;
        Response<ListTaskDefinitionFamiliesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskDefinitionFamiliesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTaskDefinitionFamiliesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTaskDefinitionFamilies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTaskDefinitionFamiliesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTaskDefinitionFamiliesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies() {
        return listTaskDefinitionFamilies(new ListTaskDefinitionFamiliesRequest());
    }

    /**
     * <p>
     * Returns a list of task definitions that are registered to your account. You can filter the results by family name
     * with the <code>familyPrefix</code> parameter or by status with the <code>status</code> parameter.
     * </p>
     * 
     * @param listTaskDefinitionsRequest
     * @return Result of the ListTaskDefinitions operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListTaskDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTaskDefinitions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTaskDefinitionsResult listTaskDefinitions(ListTaskDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListTaskDefinitions(request);
    }

    @SdkInternalApi
    final ListTaskDefinitionsResult executeListTaskDefinitions(ListTaskDefinitionsRequest listTaskDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTaskDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskDefinitionsRequest> request = null;
        Response<ListTaskDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTaskDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTaskDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTaskDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTaskDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTaskDefinitionsResult listTaskDefinitions() {
        return listTaskDefinitions(new ListTaskDefinitionsRequest());
    }

    /**
     * <p>
     * Returns a list of tasks for a specified cluster. You can filter the results by family name, by a particular
     * container instance, or by the desired status of the task with the <code>family</code>,
     * <code>containerInstance</code>, and <code>desiredStatus</code> parameters.
     * </p>
     * <p>
     * Recently stopped tasks might appear in the returned results. Currently, stopped tasks appear in the returned
     * results for at least one hour.
     * </p>
     * 
     * @param listTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @sample AmazonECS.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTasksResult listTasks(ListTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListTasks(request);
    }

    @SdkInternalApi
    final ListTasksResult executeListTasks(ListTasksRequest listTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTasksRequest> request = null;
        Response<ListTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTasksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTasksResult listTasks() {
        return listTasks(new ListTasksRequest());
    }

    /**
     * <p>
     * Modifies the ARN and resource ID format of a resource type for a specified IAM user, IAM role, or the root user
     * for an account. If the account setting for the root user is changed, it sets the default setting for all of the
     * IAM users and roles for which no individual account setting has been set. The opt-in and opt-out account setting
     * can be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource will be defined
     * by the opt-in status of the IAM user or role that created the resource. Enabling this setting is required to use
     * new Amazon ECS features such as resource tagging. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-resource-ids.html">Amazon Resource Names
     * (ARNs) and IDs</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param putAccountSettingRequest
     * @return Result of the PutAccountSetting operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.PutAccountSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAccountSetting" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutAccountSettingResult putAccountSetting(PutAccountSettingRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountSetting(request);
    }

    @SdkInternalApi
    final PutAccountSettingResult executePutAccountSetting(PutAccountSettingRequest putAccountSettingRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountSettingRequest> request = null;
        Response<PutAccountSettingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountSettingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAccountSettingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountSetting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountSettingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAccountSettingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the ARN and resource ID format of a resource type for all IAM users on an account for which no
     * individual account setting has been set. Enabling this setting is required to use new Amazon ECS features such as
     * resource tagging.
     * </p>
     * 
     * @param putAccountSettingDefaultRequest
     * @return Result of the PutAccountSettingDefault operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.PutAccountSettingDefault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAccountSettingDefault" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAccountSettingDefaultResult putAccountSettingDefault(PutAccountSettingDefaultRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountSettingDefault(request);
    }

    @SdkInternalApi
    final PutAccountSettingDefaultResult executePutAccountSettingDefault(PutAccountSettingDefaultRequest putAccountSettingDefaultRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountSettingDefaultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountSettingDefaultRequest> request = null;
        Response<PutAccountSettingDefaultResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountSettingDefaultRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAccountSettingDefaultRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountSettingDefault");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountSettingDefaultResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAccountSettingDefaultResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create or update an attribute on an Amazon ECS resource. If the attribute does not exist, it is created. If the
     * attribute exists, its value is replaced with the specified value. To delete an attribute, use
     * <a>DeleteAttributes</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html#attributes"
     * >Attributes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param putAttributesRequest
     * @return Result of the PutAttributes operation returned by the service.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws TargetNotFoundException
     *         The specified target could not be found. You can view your available container instances with
     *         <a>ListContainerInstances</a>. Amazon ECS container instances are cluster-specific and Region-specific.
     * @throws AttributeLimitExceededException
     *         You can apply up to 10 custom attributes per resource. You can view the attributes of a resource with
     *         <a>ListAttributes</a>. You can remove existing attributes on a resource with <a>DeleteAttributes</a>.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.PutAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutAttributesResult putAttributes(PutAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutAttributes(request);
    }

    @SdkInternalApi
    final PutAttributesResult executePutAttributes(PutAttributesRequest putAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAttributesRequest> request = null;
        Response<PutAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Registers an EC2 instance into the specified cluster. This instance becomes available to place containers on.
     * </p>
     * 
     * @param registerContainerInstanceRequest
     * @return Result of the RegisterContainerInstance operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.RegisterContainerInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RegisterContainerInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterContainerInstanceResult registerContainerInstance(RegisterContainerInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterContainerInstance(request);
    }

    @SdkInternalApi
    final RegisterContainerInstanceResult executeRegisterContainerInstance(RegisterContainerInstanceRequest registerContainerInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerContainerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterContainerInstanceRequest> request = null;
        Response<RegisterContainerInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterContainerInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerContainerInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterContainerInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterContainerInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterContainerInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a new task definition from the supplied <code>family</code> and <code>containerDefinitions</code>.
     * Optionally, you can add data volumes to your containers with the <code>volumes</code> parameter. For more
     * information about task definition parameters and defaults, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * You can specify an IAM role for your task with the <code>taskRoleArn</code> parameter. When you specify an IAM
     * role for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API requests to
     * the AWS services that are specified in the IAM policy associated with the role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * You can specify a Docker networking mode for the containers in your task definition with the
     * <code>networkMode</code> parameter. The available network modes correspond to those described in <a
     * href="https://docs.docker.com/engine/reference/run/#/network-settings">Network settings</a> in the Docker run
     * reference. If you specify the <code>awsvpc</code> network mode, the task is allocated an elastic network
     * interface, and you must specify a <a>NetworkConfiguration</a> when you create a service or run a task with the
     * task definition. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param registerTaskDefinitionRequest
     * @return Result of the RegisterTaskDefinition operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.RegisterTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RegisterTaskDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RegisterTaskDefinitionResult registerTaskDefinition(RegisterTaskDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterTaskDefinition(request);
    }

    @SdkInternalApi
    final RegisterTaskDefinitionResult executeRegisterTaskDefinition(RegisterTaskDefinitionRequest registerTaskDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(registerTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTaskDefinitionRequest> request = null;
        Response<RegisterTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTaskDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterTaskDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterTaskDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterTaskDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a new task using the specified task definition.
     * </p>
     * <p>
     * You can allow Amazon ECS to place tasks for you, or you can customize how Amazon ECS places tasks using placement
     * constraints and placement strategies. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html">Scheduling Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * Alternatively, you can use <a>StartTask</a> to use your own scheduler or place tasks manually on specific
     * container instances.
     * </p>
     * <p>
     * The Amazon ECS API follows an eventual consistency model, due to the distributed nature of the system supporting
     * the API. This means that the result of an API command you run that affects your Amazon ECS resources might not be
     * immediately visible to all subsequent commands you run. Keep this in mind when you carry out an API command that
     * immediately follows a previous API command.
     * </p>
     * <p>
     * To manage eventual consistency, you can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Confirm the state of the resource before you run a command to modify it. Run the DescribeTasks command using an
     * exponential backoff algorithm to ensure that you allow enough time for the previous command to propagate through
     * the system. To do this, run the DescribeTasks command repeatedly, starting with a couple of seconds of wait time
     * and increasing gradually up to five minutes of wait time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add wait time between subsequent commands, even if the DescribeTasks command returns an accurate response. Apply
     * an exponential backoff algorithm starting with a couple of seconds of wait time, and increase gradually up to
     * about five minutes of wait time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param runTaskRequest
     * @return Result of the RunTask operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UnsupportedFeatureException
     *         The specified task is not supported in this Region.
     * @throws PlatformUnknownException
     *         The specified platform version does not exist.
     * @throws PlatformTaskDefinitionIncompatibilityException
     *         The specified platform version does not satisfy the task definition's required capabilities.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @throws BlockedException
     *         Your AWS account has been blocked. For more information, contact <a
     *         href="http://aws.amazon.com/contact-us/">AWS Support</a>.
     * @sample AmazonECS.RunTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RunTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RunTaskResult runTask(RunTaskRequest request) {
        request = beforeClientExecution(request);
        return executeRunTask(request);
    }

    @SdkInternalApi
    final RunTaskResult executeRunTask(RunTaskRequest runTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(runTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunTaskRequest> request = null;
        Response<RunTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(runTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RunTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RunTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RunTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a new task from the specified task definition on the specified container instance or instances.
     * </p>
     * <p>
     * Alternatively, you can use <a>RunTask</a> to place tasks for you. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html">Scheduling Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param startTaskRequest
     * @return Result of the StartTask operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.StartTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/StartTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartTaskResult startTask(StartTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartTask(request);
    }

    @SdkInternalApi
    final StartTaskResult executeStartTask(StartTaskRequest startTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTaskRequest> request = null;
        Response<StartTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a running task. Any tags associated with the task will be deleted.
     * </p>
     * <p>
     * When <a>StopTask</a> is called on a task, the equivalent of <code>docker stop</code> is issued to the containers
     * running in the task. This results in a <code>SIGTERM</code> value and a default 30-second timeout, after which
     * the <code>SIGKILL</code> value is sent and the containers are forcibly stopped. If the container handles the
     * <code>SIGTERM</code> value gracefully and exits within 30 seconds from receiving it, no <code>SIGKILL</code>
     * value is sent.
     * </p>
     * <note>
     * <p>
     * The default 30-second timeout can be configured on the Amazon ECS container agent with the
     * <code>ECS_CONTAINER_STOP_TIMEOUT</code> variable. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html">Amazon ECS Container
     * Agent Configuration</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param stopTaskRequest
     * @return Result of the StopTask operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.StopTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/StopTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopTaskResult stopTask(StopTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStopTask(request);
    }

    @SdkInternalApi
    final StopTaskResult executeStopTask(StopTaskRequest stopTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(stopTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTaskRequest> request = null;
        Response<StopTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Sent to acknowledge that a container changed states.
     * </p>
     * 
     * @param submitContainerStateChangeRequest
     * @return Result of the SubmitContainerStateChange operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @sample AmazonECS.SubmitContainerStateChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/SubmitContainerStateChange" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SubmitContainerStateChangeResult submitContainerStateChange(SubmitContainerStateChangeRequest request) {
        request = beforeClientExecution(request);
        return executeSubmitContainerStateChange(request);
    }

    @SdkInternalApi
    final SubmitContainerStateChangeResult executeSubmitContainerStateChange(SubmitContainerStateChangeRequest submitContainerStateChangeRequest) {

        ExecutionContext executionContext = createExecutionContext(submitContainerStateChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitContainerStateChangeRequest> request = null;
        Response<SubmitContainerStateChangeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitContainerStateChangeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(submitContainerStateChangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubmitContainerStateChange");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubmitContainerStateChangeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SubmitContainerStateChangeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SubmitContainerStateChangeResult submitContainerStateChange() {
        return submitContainerStateChange(new SubmitContainerStateChangeRequest());
    }

    /**
     * <note>
     * <p>
     * This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.
     * </p>
     * </note>
     * <p>
     * Sent to acknowledge that a task changed states.
     * </p>
     * 
     * @param submitTaskStateChangeRequest
     * @return Result of the SubmitTaskStateChange operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @sample AmazonECS.SubmitTaskStateChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/SubmitTaskStateChange" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SubmitTaskStateChangeResult submitTaskStateChange(SubmitTaskStateChangeRequest request) {
        request = beforeClientExecution(request);
        return executeSubmitTaskStateChange(request);
    }

    @SdkInternalApi
    final SubmitTaskStateChangeResult executeSubmitTaskStateChange(SubmitTaskStateChangeRequest submitTaskStateChangeRequest) {

        ExecutionContext executionContext = createExecutionContext(submitTaskStateChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitTaskStateChangeRequest> request = null;
        Response<SubmitTaskStateChangeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitTaskStateChangeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(submitTaskStateChangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubmitTaskStateChange");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubmitTaskStateChangeResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SubmitTaskStateChangeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
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
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
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
     * Updates the Amazon ECS container agent on a specified container instance. Updating the Amazon ECS container agent
     * does not interrupt running tasks or services on the container instance. The process for updating the agent
     * differs depending on whether your container instance was launched with the Amazon ECS-optimized AMI or another
     * operating system.
     * </p>
     * <p>
     * <code>UpdateContainerAgent</code> requires the Amazon ECS-optimized AMI or Amazon Linux with the
     * <code>ecs-init</code> service installed and running. For help updating the Amazon ECS container agent on other
     * operating systems, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html#manually_update_agent"
     * >Manually Updating the Amazon ECS Container Agent</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param updateContainerAgentRequest
     * @return Result of the UpdateContainerAgent operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UpdateInProgressException
     *         There is already a current Amazon ECS container agent update in progress on the specified container
     *         instance. If the container agent becomes disconnected while it is in a transitional stage, such as
     *         <code>PENDING</code> or <code>STAGING</code>, the update process can get stuck in that state. However,
     *         when the agent reconnects, it resumes where it stopped previously.
     * @throws NoUpdateAvailableException
     *         There is no update available for this Amazon ECS container agent. This could be because the agent is
     *         already running the latest version, or it is so old that there is no update path to the current version.
     * @throws MissingVersionException
     *         Amazon ECS is unable to determine the current version of the Amazon ECS container agent on the container
     *         instance and does not have enough information to proceed with an update. This could be because the agent
     *         running on the container instance is an older or custom version that does not use our version
     *         information.
     * @sample AmazonECS.UpdateContainerAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateContainerAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateContainerAgentResult updateContainerAgent(UpdateContainerAgentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContainerAgent(request);
    }

    @SdkInternalApi
    final UpdateContainerAgentResult executeUpdateContainerAgent(UpdateContainerAgentRequest updateContainerAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContainerAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContainerAgentRequest> request = null;
        Response<UpdateContainerAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContainerAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContainerAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContainerAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContainerAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateContainerAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the status of an Amazon ECS container instance.
     * </p>
     * <p>
     * You can change the status of a container instance to <code>DRAINING</code> to manually remove an instance from a
     * cluster, for example to perform system updates, update the Docker daemon, or scale down the cluster size.
     * </p>
     * <p>
     * When you set a container instance to <code>DRAINING</code>, Amazon ECS prevents new tasks from being scheduled
     * for placement on the container instance and replacement service tasks are started on other container instances in
     * the cluster if the resources are available. Service tasks on the container instance that are in the
     * <code>PENDING</code> state are stopped immediately.
     * </p>
     * <p>
     * Service tasks on the container instance that are in the <code>RUNNING</code> state are stopped and replaced
     * according to the service's deployment configuration parameters, <code>minimumHealthyPercent</code> and
     * <code>maximumPercent</code>. You can change the deployment configuration of your service using
     * <a>UpdateService</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>minimumHealthyPercent</code> is below 100%, the scheduler can ignore <code>desiredCount</code>
     * temporarily during task replacement. For example, <code>desiredCount</code> is four tasks, a minimum of 50%
     * allows the scheduler to stop two existing tasks before starting two new tasks. If the minimum is 100%, the
     * service scheduler can't remove existing tasks until the replacement tasks are considered healthy. Tasks for
     * services that do not use a load balancer are considered healthy if they are in the <code>RUNNING</code> state.
     * Tasks for services that use a load balancer are considered healthy if they are in the <code>RUNNING</code> state
     * and the container instance they are hosted on is reported as healthy by the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on the number of running tasks during task
     * replacement, which enables you to define the replacement batch size. For example, if <code>desiredCount</code> is
     * four tasks, a maximum of 200% starts four new tasks before stopping the four tasks to be drained, provided that
     * the cluster resources required to do this are available. If the maximum is 100%, then replacement tasks can't
     * start until the draining tasks have stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Any <code>PENDING</code> or <code>RUNNING</code> tasks that do not belong to a service are not affected. You must
     * wait for them to finish or stop them manually.
     * </p>
     * <p>
     * A container instance has completed draining when it has no more <code>RUNNING</code> tasks. You can verify this
     * using <a>ListTasks</a>.
     * </p>
     * <p>
     * When you set a container instance to <code>ACTIVE</code>, the Amazon ECS scheduler can begin scheduling tasks on
     * the instance again.
     * </p>
     * 
     * @param updateContainerInstancesStateRequest
     * @return Result of the UpdateContainerInstancesState operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @sample AmazonECS.UpdateContainerInstancesState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateContainerInstancesState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContainerInstancesStateResult updateContainerInstancesState(UpdateContainerInstancesStateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContainerInstancesState(request);
    }

    @SdkInternalApi
    final UpdateContainerInstancesStateResult executeUpdateContainerInstancesState(UpdateContainerInstancesStateRequest updateContainerInstancesStateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContainerInstancesStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContainerInstancesStateRequest> request = null;
        Response<UpdateContainerInstancesStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContainerInstancesStateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContainerInstancesStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContainerInstancesState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContainerInstancesStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContainerInstancesStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a service.
     * </p>
     * <p>
     * For services using the rolling update (<code>ECS</code>) deployment controller, the desired count, deployment
     * configuration, network configuration, or task definition used can be updated.
     * </p>
     * <p>
     * For services using the blue/green (<code>CODE_DEPLOY</code>) deployment controller, only the desired count,
     * deployment configuration, and health check grace period can be updated using this API. If the network
     * configuration, platform version, or task definition need to be updated, a new AWS CodeDeploy deployment should be
     * created. For more information, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateDeployment.html">CreateDeployment</a>
     * in the <i>AWS CodeDeploy API Reference</i>.
     * </p>
     * <p>
     * For services using an external deployment controller, you can update only the desired count and health check
     * grace period using this API. If the launch type, load balancer, network configuration, platform version, or task
     * definition need to be updated, you should create a new task set. For more information, see <a>CreateTaskSet</a>.
     * </p>
     * <p>
     * You can add to or subtract from the number of instantiations of a task definition in a service by specifying the
     * cluster that the service is running in and a new <code>desiredCount</code> parameter.
     * </p>
     * <p>
     * If you have updated the Docker image of your application, you can create a new task definition with that image
     * and deploy it to your service. The service scheduler uses the minimum healthy percent and maximum percent
     * parameters (in the service's deployment configuration) to determine the deployment strategy.
     * </p>
     * <note>
     * <p>
     * If your updated Docker image uses the same tag as what is in the existing task definition for your service (for
     * example, <code>my_image:latest</code>), you do not need to create a new revision of your task definition. You can
     * update the service using the <code>forceNewDeployment</code> option. The new tasks launched by the deployment
     * pull the current image/tag combination from your repository when they start.
     * </p>
     * </note>
     * <p>
     * You can also update the deployment configuration of a service. When a deployment is triggered by updating the
     * task definition of a service, the service scheduler uses the deployment configuration parameters,
     * <code>minimumHealthyPercent</code> and <code>maximumPercent</code>, to determine the deployment strategy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>minimumHealthyPercent</code> is below 100%, the scheduler can ignore <code>desiredCount</code>
     * temporarily during a deployment. For example, if <code>desiredCount</code> is four tasks, a minimum of 50% allows
     * the scheduler to stop two existing tasks before starting two new tasks. Tasks for services that do not use a load
     * balancer are considered healthy if they are in the <code>RUNNING</code> state. Tasks for services that use a load
     * balancer are considered healthy if they are in the <code>RUNNING</code> state and the container instance they are
     * hosted on is reported as healthy by the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on the number of running tasks during a
     * deployment, which enables you to define the deployment batch size. For example, if <code>desiredCount</code> is
     * four tasks, a maximum of 200% starts four new tasks before stopping the four older tasks (provided that the
     * cluster resources required to do this are available).
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <a>UpdateService</a> stops a task during a deployment, the equivalent of <code>docker stop</code> is issued
     * to the containers running in the task. This results in a <code>SIGTERM</code> and a 30-second timeout, after
     * which <code>SIGKILL</code> is sent and the containers are forcibly stopped. If the container handles the
     * <code>SIGTERM</code> gracefully and exits within 30 seconds from receiving it, no <code>SIGKILL</code> is sent.
     * </p>
     * <p>
     * When the service scheduler launches new tasks, it determines task placement in your cluster with the following
     * logic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Determine which of the container instances in your cluster can support your service's task definition (for
     * example, they have the required CPU, memory, ports, and container instance attributes).
     * </p>
     * </li>
     * <li>
     * <p>
     * By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although
     * you can choose a different placement strategy):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sort the valid container instances by the fewest number of running tasks for this service in the same
     * Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each
     * have zero, valid container instances in either zone B or C are considered optimal for placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous
     * steps), favoring container instances with the fewest number of running tasks for this service.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * When the service scheduler stops running tasks, it attempts to maintain balance across the Availability Zones in
     * your cluster using the following logic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sort the container instances by the largest number of running tasks for this service in the same Availability
     * Zone as the instance. For example, if zone A has one running service task and zones B and C each have two,
     * container instances in either zone B or C are considered optimal for termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Stop the task on a container instance in an optimal Availability Zone (based on the previous steps), favoring
     * container instances with the largest number of running tasks for this service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @throws ServiceNotActiveException
     *         The specified service is not active. You can't update a service that is inactive. If you have previously
     *         deleted a service, you can re-create it with <a>CreateService</a>.
     * @throws PlatformUnknownException
     *         The specified platform version does not exist.
     * @throws PlatformTaskDefinitionIncompatibilityException
     *         The specified platform version does not satisfy the task definition's required capabilities.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @sample AmazonECS.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateServiceResult updateService(UpdateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateService(request);
    }

    @SdkInternalApi
    final UpdateServiceResult executeUpdateService(UpdateServiceRequest updateServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceRequest> request = null;
        Response<UpdateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies which task set in a service is the primary task set. Any parameters that are updated on the primary task
     * set in a service will transition to the service. This is used when a service uses the <code>EXTERNAL</code>
     * deployment controller type. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html">Amazon ECS Deployment
     * Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param updateServicePrimaryTaskSetRequest
     * @return Result of the UpdateServicePrimaryTaskSet operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UnsupportedFeatureException
     *         The specified task is not supported in this Region.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @throws ServiceNotActiveException
     *         The specified service is not active. You can't update a service that is inactive. If you have previously
     *         deleted a service, you can re-create it with <a>CreateService</a>.
     * @throws TaskSetNotFoundException
     *         The specified task set could not be found. You can view your available container instances with
     *         <a>DescribeTaskSets</a>. Task sets are specific to each cluster, service and Region.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @sample AmazonECS.UpdateServicePrimaryTaskSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateServicePrimaryTaskSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServicePrimaryTaskSetResult updateServicePrimaryTaskSet(UpdateServicePrimaryTaskSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServicePrimaryTaskSet(request);
    }

    @SdkInternalApi
    final UpdateServicePrimaryTaskSetResult executeUpdateServicePrimaryTaskSet(UpdateServicePrimaryTaskSetRequest updateServicePrimaryTaskSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServicePrimaryTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServicePrimaryTaskSetRequest> request = null;
        Response<UpdateServicePrimaryTaskSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServicePrimaryTaskSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateServicePrimaryTaskSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServicePrimaryTaskSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServicePrimaryTaskSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateServicePrimaryTaskSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a task set. This is used when a service uses the <code>EXTERNAL</code> deployment controller type. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html">Amazon ECS Deployment
     * Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param updateTaskSetRequest
     * @return Result of the UpdateTaskSet operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are Region-specific.
     * @throws UnsupportedFeatureException
     *         The specified task is not supported in this Region.
     * @throws AccessDeniedException
     *         You do not have authorization to perform the requested action.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and Region-specific.
     * @throws ServiceNotActiveException
     *         The specified service is not active. You can't update a service that is inactive. If you have previously
     *         deleted a service, you can re-create it with <a>CreateService</a>.
     * @throws TaskSetNotFoundException
     *         The specified task set could not be found. You can view your available container instances with
     *         <a>DescribeTaskSets</a>. Task sets are specific to each cluster, service and Region.
     * @sample AmazonECS.UpdateTaskSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateTaskSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTaskSetResult updateTaskSet(UpdateTaskSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTaskSet(request);
    }

    @SdkInternalApi
    final UpdateTaskSetResult executeUpdateTaskSet(UpdateTaskSetRequest updateTaskSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTaskSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTaskSetRequest> request = null;
        Response<UpdateTaskSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTaskSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTaskSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ECS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTaskSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTaskSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTaskSetResultJsonUnmarshaller());
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
    public AmazonECSWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonECSWaiters(this);
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
