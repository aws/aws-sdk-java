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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.services.ecs.waiters.AmazonECSWaiters;

/**
 * Interface for accessing Amazon ECS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ecs.AbstractAmazonECS} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonECS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ecs";

    /**
     * Overrides the default endpoint for this client ("https://ecs.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ecs.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://ecs.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ecs.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://ecs.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonECS#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * Simplified method form for invoking the CreateCluster operation.
     *
     * @see #createCluster(CreateClusterRequest)
     */
    CreateClusterResult createCluster();

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
    CreateServiceResult createService(CreateServiceRequest createServiceRequest);

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
    CreateTaskSetResult createTaskSet(CreateTaskSetRequest createTaskSetRequest);

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
    DeleteAccountSettingResult deleteAccountSetting(DeleteAccountSettingRequest deleteAccountSettingRequest);

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
    DeleteAttributesResult deleteAttributes(DeleteAttributesRequest deleteAttributesRequest);

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
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

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
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest);

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
    DeleteTaskSetResult deleteTaskSet(DeleteTaskSetRequest deleteTaskSetRequest);

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
    DeregisterContainerInstanceResult deregisterContainerInstance(DeregisterContainerInstanceRequest deregisterContainerInstanceRequest);

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
    DeregisterTaskDefinitionResult deregisterTaskDefinition(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest);

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
    DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest);

    /**
     * Simplified method form for invoking the DescribeClusters operation.
     *
     * @see #describeClusters(DescribeClustersRequest)
     */
    DescribeClustersResult describeClusters();

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
    DescribeContainerInstancesResult describeContainerInstances(DescribeContainerInstancesRequest describeContainerInstancesRequest);

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
    DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest);

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
    DescribeTaskDefinitionResult describeTaskDefinition(DescribeTaskDefinitionRequest describeTaskDefinitionRequest);

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
    DescribeTaskSetsResult describeTaskSets(DescribeTaskSetsRequest describeTaskSetsRequest);

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
    DescribeTasksResult describeTasks(DescribeTasksRequest describeTasksRequest);

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
    DiscoverPollEndpointResult discoverPollEndpoint(DiscoverPollEndpointRequest discoverPollEndpointRequest);

    /**
     * Simplified method form for invoking the DiscoverPollEndpoint operation.
     *
     * @see #discoverPollEndpoint(DiscoverPollEndpointRequest)
     */
    DiscoverPollEndpointResult discoverPollEndpoint();

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
    ListAccountSettingsResult listAccountSettings(ListAccountSettingsRequest listAccountSettingsRequest);

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
    ListAttributesResult listAttributes(ListAttributesRequest listAttributesRequest);

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
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClusters(ListClustersRequest)
     */
    ListClustersResult listClusters();

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
    ListContainerInstancesResult listContainerInstances(ListContainerInstancesRequest listContainerInstancesRequest);

    /**
     * Simplified method form for invoking the ListContainerInstances operation.
     *
     * @see #listContainerInstances(ListContainerInstancesRequest)
     */
    ListContainerInstancesResult listContainerInstances();

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
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

    /**
     * Simplified method form for invoking the ListServices operation.
     *
     * @see #listServices(ListServicesRequest)
     */
    ListServicesResult listServices();

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
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
    ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest);

    /**
     * Simplified method form for invoking the ListTaskDefinitionFamilies operation.
     *
     * @see #listTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest)
     */
    ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies();

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
    ListTaskDefinitionsResult listTaskDefinitions(ListTaskDefinitionsRequest listTaskDefinitionsRequest);

    /**
     * Simplified method form for invoking the ListTaskDefinitions operation.
     *
     * @see #listTaskDefinitions(ListTaskDefinitionsRequest)
     */
    ListTaskDefinitionsResult listTaskDefinitions();

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
    ListTasksResult listTasks(ListTasksRequest listTasksRequest);

    /**
     * Simplified method form for invoking the ListTasks operation.
     *
     * @see #listTasks(ListTasksRequest)
     */
    ListTasksResult listTasks();

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
    PutAccountSettingResult putAccountSetting(PutAccountSettingRequest putAccountSettingRequest);

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
    PutAccountSettingDefaultResult putAccountSettingDefault(PutAccountSettingDefaultRequest putAccountSettingDefaultRequest);

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
    PutAttributesResult putAttributes(PutAttributesRequest putAttributesRequest);

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
    RegisterContainerInstanceResult registerContainerInstance(RegisterContainerInstanceRequest registerContainerInstanceRequest);

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
    RegisterTaskDefinitionResult registerTaskDefinition(RegisterTaskDefinitionRequest registerTaskDefinitionRequest);

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
    RunTaskResult runTask(RunTaskRequest runTaskRequest);

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
    StartTaskResult startTask(StartTaskRequest startTaskRequest);

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
    StopTaskResult stopTask(StopTaskRequest stopTaskRequest);

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
    SubmitContainerStateChangeResult submitContainerStateChange(SubmitContainerStateChangeRequest submitContainerStateChangeRequest);

    /**
     * Simplified method form for invoking the SubmitContainerStateChange operation.
     *
     * @see #submitContainerStateChange(SubmitContainerStateChangeRequest)
     */
    SubmitContainerStateChangeResult submitContainerStateChange();

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
    SubmitTaskStateChangeResult submitTaskStateChange(SubmitTaskStateChangeRequest submitTaskStateChangeRequest);

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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
    UpdateContainerAgentResult updateContainerAgent(UpdateContainerAgentRequest updateContainerAgentRequest);

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
    UpdateContainerInstancesStateResult updateContainerInstancesState(UpdateContainerInstancesStateRequest updateContainerInstancesStateRequest);

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
    UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest);

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
    UpdateServicePrimaryTaskSetResult updateServicePrimaryTaskSet(UpdateServicePrimaryTaskSetRequest updateServicePrimaryTaskSetRequest);

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
    UpdateTaskSetResult updateTaskSet(UpdateTaskSetRequest updateTaskSetRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonECSWaiters waiters();

}
