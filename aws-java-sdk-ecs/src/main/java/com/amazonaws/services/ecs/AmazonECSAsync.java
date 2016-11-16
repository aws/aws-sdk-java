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

import com.amazonaws.services.ecs.model.*;

/**
 * Interface for accessing Amazon ECS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ecs.AbstractAmazonECSAsync} instead.
 * </p>
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
public interface AmazonECSAsync extends AmazonECS {

    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account receives a <code>default</code> cluster when you
     * launch your first container instance. However, you can create your own cluster with a unique name with the
     * <code>CreateCluster</code> action.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonECSAsync.CreateCluster
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account receives a <code>default</code> cluster when you
     * launch your first container instance. However, you can create your own cluster with a unique name with the
     * <code>CreateCluster</code> action.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonECSAsyncHandler.CreateCluster
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateCluster operation.
     *
     * @see #createClusterAsync(CreateClusterRequest)
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync();

    /**
     * Simplified method form for invoking the CreateCluster operation with an AsyncHandler.
     *
     * @see #createClusterAsync(CreateClusterRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in
     * a service drops below <code>desiredCount</code>, Amazon ECS spawns another copy of the task in the specified
     * cluster. To update an existing service, see <a>UpdateService</a>.
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
     * by changing the task definition or the desired count of a service with an <a>UpdateService</a> operation), the
     * service scheduler uses the <code>minimumHealthyPercent</code> and <code>maximumPercent</code> parameters to
     * determine the deployment strategy.
     * </p>
     * <p>
     * The <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that must
     * remain in the <code>RUNNING</code> state during a deployment, as a percentage of the <code>desiredCount</code>
     * (rounded up to the nearest integer). This parameter enables you to deploy without using additional cluster
     * capacity. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>minimumHealthyPercent</code> of 50%, the scheduler may stop two existing tasks to free up cluster capacity
     * before starting two new tasks. Tasks for services that <i>do not</i> use a load balancer are considered healthy
     * if they are in the <code>RUNNING</code> state; tasks for services that <i>do</i> use a load balancer are
     * considered healthy if they are in the <code>RUNNING</code> state and the container instance it is hosted on is
     * reported as healthy by the load balancer. The default value for <code>minimumHealthyPercent</code> is 50% in the
     * console and 100% for the AWS CLI, the AWS SDKs, and the APIs.
     * </p>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on the number of your service's tasks that
     * are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage of the
     * <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to define the
     * deployment batch size. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>maximumPercent</code> value of 200%, the scheduler may start four new tasks before stopping the four older
     * tasks (provided that the cluster resources required to do this are available). The default value for
     * <code>maximumPercent</code> is 200%.
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
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AmazonECSAsync.CreateService
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in
     * a service drops below <code>desiredCount</code>, Amazon ECS spawns another copy of the task in the specified
     * cluster. To update an existing service, see <a>UpdateService</a>.
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
     * by changing the task definition or the desired count of a service with an <a>UpdateService</a> operation), the
     * service scheduler uses the <code>minimumHealthyPercent</code> and <code>maximumPercent</code> parameters to
     * determine the deployment strategy.
     * </p>
     * <p>
     * The <code>minimumHealthyPercent</code> represents a lower limit on the number of your service's tasks that must
     * remain in the <code>RUNNING</code> state during a deployment, as a percentage of the <code>desiredCount</code>
     * (rounded up to the nearest integer). This parameter enables you to deploy without using additional cluster
     * capacity. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>minimumHealthyPercent</code> of 50%, the scheduler may stop two existing tasks to free up cluster capacity
     * before starting two new tasks. Tasks for services that <i>do not</i> use a load balancer are considered healthy
     * if they are in the <code>RUNNING</code> state; tasks for services that <i>do</i> use a load balancer are
     * considered healthy if they are in the <code>RUNNING</code> state and the container instance it is hosted on is
     * reported as healthy by the load balancer. The default value for <code>minimumHealthyPercent</code> is 50% in the
     * console and 100% for the AWS CLI, the AWS SDKs, and the APIs.
     * </p>
     * <p>
     * The <code>maximumPercent</code> parameter represents an upper limit on the number of your service's tasks that
     * are allowed in the <code>RUNNING</code> or <code>PENDING</code> state during a deployment, as a percentage of the
     * <code>desiredCount</code> (rounded down to the nearest integer). This parameter enables you to define the
     * deployment batch size. For example, if your service has a <code>desiredCount</code> of four tasks and a
     * <code>maximumPercent</code> value of 200%, the scheduler may start four new tasks before stopping the four older
     * tasks (provided that the cluster resources required to do this are available). The default value for
     * <code>maximumPercent</code> is 200%.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AmazonECSAsyncHandler.CreateService
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified cluster. You must deregister all container instances from this cluster before you may
     * delete it. You can list the container instances in a cluster with <a>ListContainerInstances</a> and deregister
     * them with <a>DeregisterContainerInstance</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonECSAsync.DeleteCluster
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes the specified cluster. You must deregister all container instances from this cluster before you may
     * delete it. You can list the container instances in a cluster with <a>ListContainerInstances</a> and deregister
     * them with <a>DeregisterContainerInstance</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonECSAsyncHandler.DeleteCluster
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AmazonECSAsync.DeleteService
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AmazonECSAsyncHandler.DeleteService
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler);

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
     * If you terminate a running container instance, Amazon ECS automatically deregisters the instance from your
     * cluster (stopped container instances or instances with disconnected agents are not automatically deregistered
     * when terminated).
     * </p>
     * </note>
     * 
     * @param deregisterContainerInstanceRequest
     * @return A Java Future containing the result of the DeregisterContainerInstance operation returned by the service.
     * @sample AmazonECSAsync.DeregisterContainerInstance
     */
    java.util.concurrent.Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(
            DeregisterContainerInstanceRequest deregisterContainerInstanceRequest);

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
     * If you terminate a running container instance, Amazon ECS automatically deregisters the instance from your
     * cluster (stopped container instances or instances with disconnected agents are not automatically deregistered
     * when terminated).
     * </p>
     * </note>
     * 
     * @param deregisterContainerInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterContainerInstance operation returned by the service.
     * @sample AmazonECSAsyncHandler.DeregisterContainerInstance
     */
    java.util.concurrent.Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(
            DeregisterContainerInstanceRequest deregisterContainerInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterContainerInstanceRequest, DeregisterContainerInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeregisterTaskDefinition operation returned by the service.
     * @sample AmazonECSAsync.DeregisterTaskDefinition
     */
    java.util.concurrent.Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTaskDefinition operation returned by the service.
     * @sample AmazonECSAsyncHandler.DeregisterTaskDefinition
     */
    java.util.concurrent.Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTaskDefinitionRequest, DeregisterTaskDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     * 
     * @param describeClustersRequest
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonECSAsync.DescribeClusters
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     * 
     * @param describeClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AmazonECSAsyncHandler.DescribeClusters
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeClusters operation.
     *
     * @see #describeClustersAsync(DescribeClustersRequest)
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync();

    /**
     * Simplified method form for invoking the DescribeClusters operation with an AsyncHandler.
     *
     * @see #describeClustersAsync(DescribeClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * <p>
     * Describes Amazon EC2 Container Service container instances. Returns metadata about registered and remaining
     * resources on each container instance requested.
     * </p>
     * 
     * @param describeContainerInstancesRequest
     * @return A Java Future containing the result of the DescribeContainerInstances operation returned by the service.
     * @sample AmazonECSAsync.DescribeContainerInstances
     */
    java.util.concurrent.Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(
            DescribeContainerInstancesRequest describeContainerInstancesRequest);

    /**
     * <p>
     * Describes Amazon EC2 Container Service container instances. Returns metadata about registered and remaining
     * resources on each container instance requested.
     * </p>
     * 
     * @param describeContainerInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContainerInstances operation returned by the service.
     * @sample AmazonECSAsyncHandler.DescribeContainerInstances
     */
    java.util.concurrent.Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(
            DescribeContainerInstancesRequest describeContainerInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContainerInstancesRequest, DescribeContainerInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified services running in your cluster.
     * </p>
     * 
     * @param describeServicesRequest
     * @return A Java Future containing the result of the DescribeServices operation returned by the service.
     * @sample AmazonECSAsync.DescribeServices
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest);

    /**
     * <p>
     * Describes the specified services running in your cluster.
     * </p>
     * 
     * @param describeServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServices operation returned by the service.
     * @sample AmazonECSAsyncHandler.DescribeServices
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeTaskDefinition operation returned by the service.
     * @sample AmazonECSAsync.DescribeTaskDefinition
     */
    java.util.concurrent.Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(DescribeTaskDefinitionRequest describeTaskDefinitionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTaskDefinition operation returned by the service.
     * @sample AmazonECSAsyncHandler.DescribeTaskDefinition
     */
    java.util.concurrent.Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(DescribeTaskDefinitionRequest describeTaskDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTaskDefinitionRequest, DescribeTaskDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes a specified task or tasks.
     * </p>
     * 
     * @param describeTasksRequest
     * @return A Java Future containing the result of the DescribeTasks operation returned by the service.
     * @sample AmazonECSAsync.DescribeTasks
     */
    java.util.concurrent.Future<DescribeTasksResult> describeTasksAsync(DescribeTasksRequest describeTasksRequest);

    /**
     * <p>
     * Describes a specified task or tasks.
     * </p>
     * 
     * @param describeTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTasks operation returned by the service.
     * @sample AmazonECSAsyncHandler.DescribeTasks
     */
    java.util.concurrent.Future<DescribeTasksResult> describeTasksAsync(DescribeTasksRequest describeTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTasksRequest, DescribeTasksResult> asyncHandler);

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
     * @return A Java Future containing the result of the DiscoverPollEndpoint operation returned by the service.
     * @sample AmazonECSAsync.DiscoverPollEndpoint
     */
    java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(DiscoverPollEndpointRequest discoverPollEndpointRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DiscoverPollEndpoint operation returned by the service.
     * @sample AmazonECSAsyncHandler.DiscoverPollEndpoint
     */
    java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(DiscoverPollEndpointRequest discoverPollEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DiscoverPollEndpointRequest, DiscoverPollEndpointResult> asyncHandler);

    /**
     * Simplified method form for invoking the DiscoverPollEndpoint operation.
     *
     * @see #discoverPollEndpointAsync(DiscoverPollEndpointRequest)
     */
    java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync();

    /**
     * Simplified method form for invoking the DiscoverPollEndpoint operation with an AsyncHandler.
     *
     * @see #discoverPollEndpointAsync(DiscoverPollEndpointRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(
            com.amazonaws.handlers.AsyncHandler<DiscoverPollEndpointRequest, DiscoverPollEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonECSAsync.ListClusters
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonECSAsyncHandler.ListClusters
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClustersAsync(ListClustersRequest)
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync();

    /**
     * Simplified method form for invoking the ListClusters operation with an AsyncHandler.
     *
     * @see #listClustersAsync(ListClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of container instances in a specified cluster.
     * </p>
     * 
     * @param listContainerInstancesRequest
     * @return A Java Future containing the result of the ListContainerInstances operation returned by the service.
     * @sample AmazonECSAsync.ListContainerInstances
     */
    java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(ListContainerInstancesRequest listContainerInstancesRequest);

    /**
     * <p>
     * Returns a list of container instances in a specified cluster.
     * </p>
     * 
     * @param listContainerInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContainerInstances operation returned by the service.
     * @sample AmazonECSAsyncHandler.ListContainerInstances
     */
    java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(ListContainerInstancesRequest listContainerInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListContainerInstancesRequest, ListContainerInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListContainerInstances operation.
     *
     * @see #listContainerInstancesAsync(ListContainerInstancesRequest)
     */
    java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync();

    /**
     * Simplified method form for invoking the ListContainerInstances operation with an AsyncHandler.
     *
     * @see #listContainerInstancesAsync(ListContainerInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListContainerInstancesRequest, ListContainerInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AmazonECSAsync.ListServices
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AmazonECSAsyncHandler.ListServices
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListServices operation.
     *
     * @see #listServicesAsync(ListServicesRequest)
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync();

    /**
     * Simplified method form for invoking the ListServices operation with an AsyncHandler.
     *
     * @see #listServicesAsync(ListServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTaskDefinitionFamilies operation returned by the service.
     * @sample AmazonECSAsync.ListTaskDefinitionFamilies
     */
    java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(
            ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTaskDefinitionFamilies operation returned by the service.
     * @sample AmazonECSAsyncHandler.ListTaskDefinitionFamilies
     */
    java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(
            ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTaskDefinitionFamilies operation.
     *
     * @see #listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest)
     */
    java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync();

    /**
     * Simplified method form for invoking the ListTaskDefinitionFamilies operation with an AsyncHandler.
     *
     * @see #listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of task definitions that are registered to your account. You can filter the results by family name
     * with the <code>familyPrefix</code> parameter or by status with the <code>status</code> parameter.
     * </p>
     * 
     * @param listTaskDefinitionsRequest
     * @return A Java Future containing the result of the ListTaskDefinitions operation returned by the service.
     * @sample AmazonECSAsync.ListTaskDefinitions
     */
    java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(ListTaskDefinitionsRequest listTaskDefinitionsRequest);

    /**
     * <p>
     * Returns a list of task definitions that are registered to your account. You can filter the results by family name
     * with the <code>familyPrefix</code> parameter or by status with the <code>status</code> parameter.
     * </p>
     * 
     * @param listTaskDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTaskDefinitions operation returned by the service.
     * @sample AmazonECSAsyncHandler.ListTaskDefinitions
     */
    java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(ListTaskDefinitionsRequest listTaskDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionsRequest, ListTaskDefinitionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTaskDefinitions operation.
     *
     * @see #listTaskDefinitionsAsync(ListTaskDefinitionsRequest)
     */
    java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync();

    /**
     * Simplified method form for invoking the ListTaskDefinitions operation with an AsyncHandler.
     *
     * @see #listTaskDefinitionsAsync(ListTaskDefinitionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionsRequest, ListTaskDefinitionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AmazonECSAsync.ListTasks
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AmazonECSAsyncHandler.ListTasks
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTasks operation.
     *
     * @see #listTasksAsync(ListTasksRequest)
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync();

    /**
     * Simplified method form for invoking the ListTasks operation with an AsyncHandler.
     *
     * @see #listTasksAsync(ListTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterContainerInstance operation returned by the service.
     * @sample AmazonECSAsync.RegisterContainerInstance
     */
    java.util.concurrent.Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(
            RegisterContainerInstanceRequest registerContainerInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterContainerInstance operation returned by the service.
     * @sample AmazonECSAsyncHandler.RegisterContainerInstance
     */
    java.util.concurrent.Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(
            RegisterContainerInstanceRequest registerContainerInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterContainerInstanceRequest, RegisterContainerInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterTaskDefinition operation returned by the service.
     * @sample AmazonECSAsync.RegisterTaskDefinition
     */
    java.util.concurrent.Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(RegisterTaskDefinitionRequest registerTaskDefinitionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTaskDefinition operation returned by the service.
     * @sample AmazonECSAsyncHandler.RegisterTaskDefinition
     */
    java.util.concurrent.Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(RegisterTaskDefinitionRequest registerTaskDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTaskDefinitionRequest, RegisterTaskDefinitionResult> asyncHandler);

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
     * @return A Java Future containing the result of the RunTask operation returned by the service.
     * @sample AmazonECSAsync.RunTask
     */
    java.util.concurrent.Future<RunTaskResult> runTaskAsync(RunTaskRequest runTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RunTask operation returned by the service.
     * @sample AmazonECSAsyncHandler.RunTask
     */
    java.util.concurrent.Future<RunTaskResult> runTaskAsync(RunTaskRequest runTaskRequest,
            com.amazonaws.handlers.AsyncHandler<RunTaskRequest, RunTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartTask operation returned by the service.
     * @sample AmazonECSAsync.StartTask
     */
    java.util.concurrent.Future<StartTaskResult> startTaskAsync(StartTaskRequest startTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTask operation returned by the service.
     * @sample AmazonECSAsyncHandler.StartTask
     */
    java.util.concurrent.Future<StartTaskResult> startTaskAsync(StartTaskRequest startTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartTaskRequest, StartTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopTask operation returned by the service.
     * @sample AmazonECSAsync.StopTask
     */
    java.util.concurrent.Future<StopTaskResult> stopTaskAsync(StopTaskRequest stopTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopTask operation returned by the service.
     * @sample AmazonECSAsyncHandler.StopTask
     */
    java.util.concurrent.Future<StopTaskResult> stopTaskAsync(StopTaskRequest stopTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StopTaskRequest, StopTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the SubmitContainerStateChange operation returned by the service.
     * @sample AmazonECSAsync.SubmitContainerStateChange
     */
    java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(
            SubmitContainerStateChangeRequest submitContainerStateChangeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubmitContainerStateChange operation returned by the service.
     * @sample AmazonECSAsyncHandler.SubmitContainerStateChange
     */
    java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(
            SubmitContainerStateChangeRequest submitContainerStateChangeRequest,
            com.amazonaws.handlers.AsyncHandler<SubmitContainerStateChangeRequest, SubmitContainerStateChangeResult> asyncHandler);

    /**
     * Simplified method form for invoking the SubmitContainerStateChange operation.
     *
     * @see #submitContainerStateChangeAsync(SubmitContainerStateChangeRequest)
     */
    java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync();

    /**
     * Simplified method form for invoking the SubmitContainerStateChange operation with an AsyncHandler.
     *
     * @see #submitContainerStateChangeAsync(SubmitContainerStateChangeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(
            com.amazonaws.handlers.AsyncHandler<SubmitContainerStateChangeRequest, SubmitContainerStateChangeResult> asyncHandler);

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
     * @return A Java Future containing the result of the SubmitTaskStateChange operation returned by the service.
     * @sample AmazonECSAsync.SubmitTaskStateChange
     */
    java.util.concurrent.Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(SubmitTaskStateChangeRequest submitTaskStateChangeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubmitTaskStateChange operation returned by the service.
     * @sample AmazonECSAsyncHandler.SubmitTaskStateChange
     */
    java.util.concurrent.Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(SubmitTaskStateChangeRequest submitTaskStateChangeRequest,
            com.amazonaws.handlers.AsyncHandler<SubmitTaskStateChangeRequest, SubmitTaskStateChangeResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateContainerAgent operation returned by the service.
     * @sample AmazonECSAsync.UpdateContainerAgent
     */
    java.util.concurrent.Future<UpdateContainerAgentResult> updateContainerAgentAsync(UpdateContainerAgentRequest updateContainerAgentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContainerAgent operation returned by the service.
     * @sample AmazonECSAsyncHandler.UpdateContainerAgent
     */
    java.util.concurrent.Future<UpdateContainerAgentResult> updateContainerAgentAsync(UpdateContainerAgentRequest updateContainerAgentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContainerAgentRequest, UpdateContainerAgentResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AmazonECSAsync.UpdateService
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AmazonECSAsyncHandler.UpdateService
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler);

}
