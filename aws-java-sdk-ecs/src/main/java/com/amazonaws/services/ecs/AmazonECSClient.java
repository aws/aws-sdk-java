/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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
import com.amazonaws.services.ecs.waiters.AmazonECSWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.services.ecs.model.transform.*;

/**
 * Client for accessing Amazon ECS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon EC2 Container Service (Amazon ECS) is a highly scalable, fast, container management service that makes it easy
 * to run, stop, and manage Docker containers on a cluster of EC2 instances. Amazon ECS lets you launch and stop
 * container-enabled applications with simple API calls, allows you to get the state of your cluster from a centralized
 * service, and gives you access to many familiar Amazon EC2 features like security groups, Amazon EBS volumes, and IAM
 * roles.
 * </p>
 * <p>
 * You can use Amazon ECS to schedule the placement of containers across your cluster based on your resource needs,
 * isolation policies, and availability requirements. Amazon EC2 Container Service eliminates the need for you to
 * operate your own cluster management and configuration management systems or worry about scaling your management
 * infrastructure.
 * </p>
 */
@ThreadSafe
public class AmazonECSClient extends AmazonWebServiceClient implements AmazonECS {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonECS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ecs";

    private volatile AmazonECSWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                            com.amazonaws.services.ecs.model.InvalidParameterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("NoUpdateAvailableException").withModeledClass(
                            com.amazonaws.services.ecs.model.NoUpdateAvailableException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ClusterContainsServicesException").withModeledClass(
                            com.amazonaws.services.ecs.model.ClusterContainsServicesException.class))
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
                    new JsonErrorShapeMetadata().withErrorCode("ServiceNotActiveException").withModeledClass(
                            com.amazonaws.services.ecs.model.ServiceNotActiveException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ClusterNotFoundException").withModeledClass(
                            com.amazonaws.services.ecs.model.ClusterNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ServerException").withModeledClass(com.amazonaws.services.ecs.model.ServerException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ClientException").withModeledClass(com.amazonaws.services.ecs.model.ClientException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("UpdateInProgressException").withModeledClass(
                            com.amazonaws.services.ecs.model.UpdateInProgressException.class))
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
     */
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
     */
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
     */
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
     */
    public AmazonECSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonECSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
    }

    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account receives a <code>default</code> cluster when you
     * launch your first container instance. However, you can create your own cluster with a unique name with the
     * <code>CreateCluster</code> action.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.CreateCluster
     */
    @Override
    public CreateClusterResult createCluster(CreateClusterRequest createClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * a service drops below <code>desiredCount</code>, Amazon ECS spawns another instantiation of the task in the
     * specified cluster. To update an existing service, see <a>UpdateService</a>.
     * </p>
     * <p>
     * In addition to maintaining the desired count of tasks in your service, you can optionally run your service behind
     * a load balancer. The load balancer distributes traffic across the tasks that are associated with the service. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html">Service Load
     * Balancing</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * <p>
     * You can optionally specify a deployment configuration for your service. During a deployment (which is triggered
     * by changing the task definition of a service with an <a>UpdateService</a> operation), the service scheduler uses
     * the <code>minimumHealthyPercent</code> and <code>maximumPercent</code> parameters to determine the deployment
     * strategy.
     * </p>
     * <p>
     * If the <code>minimumHealthyPercent</code> is below 100%, the scheduler can ignore the <code>desiredCount</code>
     * temporarily during a deployment. For example, if your service has a <code>desiredCount</code> of four tasks, a
     * <code>minimumHealthyPercent</code> of 50% allows the scheduler to stop two existing tasks before starting two new
     * tasks. Tasks for services that <i>do not</i> use a load balancer are considered healthy if they are in the
     * <code>RUNNING</code> state; tasks for services that <i>do</i> use a load balancer are considered healthy if they
     * are in the <code>RUNNING</code> state and the container instance it is hosted on is reported as healthy by the
     * load balancer. The default value for <code>minimumHealthyPercent</code> is 50% in the console and 100% for the
     * AWS CLI, the AWS SDKs, and the APIs.
     * </p>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on the number of running tasks during a
     * deployment, which enables you to define the deployment batch size. For example, if your service has a
     * <code>desiredCount</code> of four tasks, a <code>maximumPercent</code> value of 200% starts four new tasks before
     * stopping the four older tasks (provided that the cluster resources required to do this are available). The
     * default value for <code>maximumPercent</code> is 200%.
     * </p>
     * <p>
     * When the service scheduler launches new tasks, it attempts to balance them across the Availability Zones in your
     * cluster with the following logic:
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
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.CreateService
     */
    @Override
    public CreateServiceResult createService(CreateServiceRequest createServiceRequest) {
        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @throws ClusterContainsContainerInstancesException
     *         You cannot delete a cluster that has registered container instances. You must first deregister the
     *         container instances before you can delete the cluster. For more information, see
     *         <a>DeregisterContainerInstance</a>.
     * @throws ClusterContainsServicesException
     *         You cannot delete a cluster that contains services. You must first update the service to reduce its
     *         desired task count to 0 and then delete the service. For more information, see <a>UpdateService</a> and
     *         <a>DeleteService</a>.
     * @sample AmazonECS.DeleteCluster
     */
    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * <code>ACTIVE</code> to <code>DRAINING</code>, and the service is no longer visible in the console or in
     * <a>ListServices</a> API operations. After the tasks have stopped, then the service status moves from
     * <code>DRAINING</code> to <code>INACTIVE</code>. Services in the <code>DRAINING</code> or <code>INACTIVE</code>
     * status can still be viewed with <a>DescribeServices</a> API operations; however, in the future,
     * <code>INACTIVE</code> services may be cleaned up and purged from Amazon ECS record keeping, and
     * <a>DescribeServices</a> API operations on those services will return a <code>ServiceNotFoundException</code>
     * error.
     * </p>
     * </note>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and region-specific.
     * @sample AmazonECS.DeleteService
     */
    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deregisters an Amazon ECS container instance from the specified cluster. This instance is no longer available to
     * run tasks.
     * </p>
     * <p>
     * If you intend to use the container instance for some other purpose after deregistration, you should stop all of
     * the tasks running on the container instance before deregistration to avoid any orphaned tasks from consuming
     * resources.
     * </p>
     * <p>
     * Deregistering a container instance removes the instance from a cluster, but it does not terminate the EC2
     * instance; if you are finished using the instance, be sure to terminate it in the Amazon EC2 console to stop
     * billing.
     * </p>
     * <note>
     * <p>
     * If you terminate a running container instance with a connected Amazon ECS container agent, the agent
     * automatically deregisters the instance from your cluster (stopped container instances or instances with
     * disconnected agents are not automatically deregistered when terminated).
     * </p>
     * </note>
     * 
     * @param deregisterContainerInstanceRequest
     * @return Result of the DeregisterContainerInstance operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.DeregisterContainerInstance
     */
    @Override
    public DeregisterContainerInstanceResult deregisterContainerInstance(DeregisterContainerInstanceRequest deregisterContainerInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterContainerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterContainerInstanceRequest> request = null;
        Response<DeregisterContainerInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterContainerInstanceRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterContainerInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * update an existing service to reference an <code>INACTIVE</code> task definition (although there may be up to a
     * 10 minute window following deregistration where these restrictions have not yet taken effect).
     * </p>
     * 
     * @param deregisterTaskDefinitionRequest
     * @return Result of the DeregisterTaskDefinition operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DeregisterTaskDefinition
     */
    @Override
    public DeregisterTaskDefinitionResult deregisterTaskDefinition(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTaskDefinitionRequest> request = null;
        Response<DeregisterTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTaskDefinitionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DescribeClusters
     */
    @Override
    public DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClustersRequest> request = null;
        Response<DescribeClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClustersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Describes Amazon EC2 Container Service container instances. Returns metadata about registered and remaining
     * resources on each container instance requested.
     * </p>
     * 
     * @param describeContainerInstancesRequest
     * @return Result of the DescribeContainerInstances operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.DescribeContainerInstances
     */
    @Override
    public DescribeContainerInstancesResult describeContainerInstances(DescribeContainerInstancesRequest describeContainerInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeContainerInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContainerInstancesRequest> request = null;
        Response<DescribeContainerInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContainerInstancesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeContainerInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.DescribeServices
     */
    @Override
    public DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServicesRequest> request = null;
        Response<DescribeServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServicesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DescribeTaskDefinition
     */
    @Override
    public DescribeTaskDefinitionResult describeTaskDefinition(DescribeTaskDefinitionRequest describeTaskDefinitionRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskDefinitionRequest> request = null;
        Response<DescribeTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskDefinitionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Describes a specified task or tasks.
     * </p>
     * 
     * @param describeTasksRequest
     * @return Result of the DescribeTasks operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.DescribeTasks
     */
    @Override
    public DescribeTasksResult describeTasks(DescribeTasksRequest describeTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTasksRequest> request = null;
        Response<DescribeTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTasksRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * This action is only used by the Amazon EC2 Container Service agent, and it is not intended for use outside of the
     * agent.
     * </p>
     * </note>
     * <p>
     * Returns an endpoint for the Amazon EC2 Container Service agent to poll for updates.
     * </p>
     * 
     * @param discoverPollEndpointRequest
     * @return Result of the DiscoverPollEndpoint operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @sample AmazonECS.DiscoverPollEndpoint
     */
    @Override
    public DiscoverPollEndpointResult discoverPollEndpoint(DiscoverPollEndpointRequest discoverPollEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(discoverPollEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DiscoverPollEndpointRequest> request = null;
        Response<DiscoverPollEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DiscoverPollEndpointRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(discoverPollEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns a list of existing clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListClusters
     */
    @Override
    public ListClustersResult listClusters(ListClustersRequest listClustersRequest) {
        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns a list of container instances in a specified cluster.
     * </p>
     * 
     * @param listContainerInstancesRequest
     * @return Result of the ListContainerInstances operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.ListContainerInstances
     */
    @Override
    public ListContainerInstancesResult listContainerInstances(ListContainerInstancesRequest listContainerInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listContainerInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContainerInstancesRequest> request = null;
        Response<ListContainerInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContainerInstancesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContainerInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.ListServices
     */
    @Override
    public ListServicesResult listServices(ListServicesRequest listServicesRequest) {
        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListTaskDefinitionFamilies
     */
    @Override
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTaskDefinitionFamiliesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskDefinitionFamiliesRequest> request = null;
        Response<ListTaskDefinitionFamiliesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskDefinitionFamiliesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTaskDefinitionFamiliesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListTaskDefinitions
     */
    @Override
    public ListTaskDefinitionsResult listTaskDefinitions(ListTaskDefinitionsRequest listTaskDefinitionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listTaskDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskDefinitionsRequest> request = null;
        Response<ListTaskDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskDefinitionsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTaskDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Recently-stopped tasks might appear in the returned results. Currently, stopped tasks appear in the returned
     * results for at least one hour.
     * </p>
     * 
     * @param listTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and region-specific.
     * @sample AmazonECS.ListTasks
     */
    @Override
    public ListTasksResult listTasks(ListTasksRequest listTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(listTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTasksRequest> request = null;
        Response<ListTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTasksRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * <note>
     * <p>
     * This action is only used by the Amazon EC2 Container Service agent, and it is not intended for use outside of the
     * agent.
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @sample AmazonECS.RegisterContainerInstance
     */
    @Override
    public RegisterContainerInstanceResult registerContainerInstance(RegisterContainerInstanceRequest registerContainerInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(registerContainerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterContainerInstanceRequest> request = null;
        Response<RegisterContainerInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterContainerInstanceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerContainerInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Amazon ECS Task
     * Definitions</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * <p>
     * You can specify an IAM role for your task with the <code>taskRoleArn</code> parameter. When you specify an IAM
     * role for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API requests to
     * the AWS services that are specified in the IAM policy associated with the role. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Roles for Tasks</a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * <p>
     * You can specify a Docker networking mode for the containers in your task definition with the
     * <code>networkMode</code> parameter. The available network modes correspond to those described in <a
     * href="https://docs.docker.com/engine/reference/run/#/network-settings">Network settings</a> in the Docker run
     * reference.
     * </p>
     * 
     * @param registerTaskDefinitionRequest
     * @return Result of the RegisterTaskDefinition operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.RegisterTaskDefinition
     */
    @Override
    public RegisterTaskDefinitionResult registerTaskDefinition(RegisterTaskDefinitionRequest registerTaskDefinitionRequest) {
        ExecutionContext executionContext = createExecutionContext(registerTaskDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTaskDefinitionRequest> request = null;
        Response<RegisterTaskDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTaskDefinitionRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerTaskDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Start a task using random placement and the default Amazon ECS scheduler. To use your own scheduler or place a
     * task on a specific container instance, use <code>StartTask</code> instead.
     * </p>
     * <important>
     * <p>
     * The <code>count</code> parameter is limited to 10 tasks per call.
     * </p>
     * </important>
     * 
     * @param runTaskRequest
     * @return Result of the RunTask operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.RunTask
     */
    @Override
    public RunTaskResult runTask(RunTaskRequest runTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(runTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunTaskRequest> request = null;
        Response<RunTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(runTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Starts a new task from the specified task definition on the specified container instance or instances. To use the
     * default Amazon ECS scheduler to place your task, use <code>RunTask</code> instead.
     * </p>
     * <important>
     * <p>
     * The list of container instances to start tasks on is limited to 10.
     * </p>
     * </important>
     * 
     * @param startTaskRequest
     * @return Result of the StartTask operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.StartTask
     */
    @Override
    public StartTaskResult startTask(StartTaskRequest startTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(startTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTaskRequest> request = null;
        Response<StartTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Stops a running task.
     * </p>
     * <p>
     * When <a>StopTask</a> is called on a task, the equivalent of <code>docker stop</code> is issued to the containers
     * running in the task. This results in a <code>SIGTERM</code> and a 30-second timeout, after which
     * <code>SIGKILL</code> is sent and the containers are forcibly stopped. If the container handles the
     * <code>SIGTERM</code> gracefully and exits within 30 seconds from receiving it, no <code>SIGKILL</code> is sent.
     * </p>
     * 
     * @param stopTaskRequest
     * @return Result of the StopTask operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.StopTask
     */
    @Override
    public StopTaskResult stopTask(StopTaskRequest stopTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(stopTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTaskRequest> request = null;
        Response<StopTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * This action is only used by the Amazon EC2 Container Service agent, and it is not intended for use outside of the
     * agent.
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @sample AmazonECS.SubmitContainerStateChange
     */
    @Override
    public SubmitContainerStateChangeResult submitContainerStateChange(SubmitContainerStateChangeRequest submitContainerStateChangeRequest) {
        ExecutionContext executionContext = createExecutionContext(submitContainerStateChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitContainerStateChangeRequest> request = null;
        Response<SubmitContainerStateChangeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitContainerStateChangeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(submitContainerStateChangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * This action is only used by the Amazon EC2 Container Service agent, and it is not intended for use outside of the
     * agent.
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @sample AmazonECS.SubmitTaskStateChange
     */
    @Override
    public SubmitTaskStateChangeResult submitTaskStateChange(SubmitTaskStateChangeRequest submitTaskStateChangeRequest) {
        ExecutionContext executionContext = createExecutionContext(submitTaskStateChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitTaskStateChangeRequest> request = null;
        Response<SubmitTaskStateChangeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitTaskStateChangeRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(submitTaskStateChangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Updates the Amazon ECS container agent on a specified container instance. Updating the Amazon ECS container agent
     * does not interrupt running tasks or services on the container instance. The process for updating the agent
     * differs depending on whether your container instance was launched with the Amazon ECS-optimized AMI or another
     * operating system.
     * </p>
     * <p>
     * <code>UpdateContainerAgent</code> requires the Amazon ECS-optimized AMI or Amazon Linux with the
     * <code>ecs-init</code> service installed and running. For help updating the Amazon ECS container agent on other
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html#manually_update_agent"
     * >Manually Updating the Amazon ECS Container Agent</a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param updateContainerAgentRequest
     * @return Result of the UpdateContainerAgent operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
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
     */
    @Override
    public UpdateContainerAgentResult updateContainerAgent(UpdateContainerAgentRequest updateContainerAgentRequest) {
        ExecutionContext executionContext = createExecutionContext(updateContainerAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContainerAgentRequest> request = null;
        Response<UpdateContainerAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContainerAgentRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContainerAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Modifies the desired count, deployment configuration, or task definition used in a service.
     * </p>
     * <p>
     * You can add to or subtract from the number of instantiations of a task definition in a service by specifying the
     * cluster that the service is running in and a new <code>desiredCount</code> parameter.
     * </p>
     * <p>
     * You can use <a>UpdateService</a> to modify your task definition and deploy a new version of your service.
     * </p>
     * <p>
     * You can also update the deployment configuration of a service. When a deployment is triggered by updating the
     * task definition of a service, the service scheduler uses the deployment configuration parameters,
     * <code>minimumHealthyPercent</code> and <code>maximumPercent</code>, to determine the deployment strategy.
     * </p>
     * <p>
     * If the <code>minimumHealthyPercent</code> is below 100%, the scheduler can ignore the <code>desiredCount</code>
     * temporarily during a deployment. For example, if your service has a <code>desiredCount</code> of four tasks, a
     * <code>minimumHealthyPercent</code> of 50% allows the scheduler to stop two existing tasks before starting two new
     * tasks. Tasks for services that <i>do not</i> use a load balancer are considered healthy if they are in the
     * <code>RUNNING</code> state; tasks for services that <i>do</i> use a load balancer are considered healthy if they
     * are in the <code>RUNNING</code> state and the container instance it is hosted on is reported as healthy by the
     * load balancer.
     * </p>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on the number of running tasks during a
     * deployment, which enables you to define the deployment batch size. For example, if your service has a
     * <code>desiredCount</code> of four tasks, a <code>maximumPercent</code> value of 200% starts four new tasks before
     * stopping the four older tasks (provided that the cluster resources required to do this are available).
     * </p>
     * <p>
     * When <a>UpdateService</a> stops a task during a deployment, the equivalent of <code>docker stop</code> is issued
     * to the containers running in the task. This results in a <code>SIGTERM</code> and a 30-second timeout, after
     * which <code>SIGKILL</code> is sent and the containers are forcibly stopped. If the container handles the
     * <code>SIGTERM</code> gracefully and exits within 30 seconds from receiving it, no <code>SIGKILL</code> is sent.
     * </p>
     * <p>
     * When the service scheduler launches new tasks, it attempts to balance them across the Availability Zones in your
     * cluster with the following logic:
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
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @throws ServiceNotFoundException
     *         The specified service could not be found. You can view your available services with <a>ListServices</a>.
     *         Amazon ECS services are cluster-specific and region-specific.
     * @throws ServiceNotActiveException
     *         The specified service is not active. You cannot update a service that is not active. If you have
     *         previously deleted a service, you can re-create it with <a>CreateService</a>.
     * @sample AmazonECS.UpdateService
     */
    @Override
    public UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest) {
        ExecutionContext executionContext = createExecutionContext(updateServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceRequest> request = null;
        Response<UpdateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

}
