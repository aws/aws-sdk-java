/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.ecs.model.*;

/**
 * Interface for accessing AmazonECS asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * <p>
 * </p>
 * <p>
 * Amazon EC2 Container Service (Amazon ECS) is a highly scalable, fast,
 * container management service that makes it easy to run, stop, and
 * manage Docker containers on a cluster of Amazon EC2 instances. Amazon
 * ECS lets you launch and stop container-enabled applications with
 * simple API calls, allows you to get the state of your cluster from a
 * centralized service, and gives you access to many familiar Amazon EC2
 * features like security groups, Amazon EBS volumes, and IAM roles.
 * </p>
 * <p>
 * You can use Amazon ECS to schedule the placement of containers across
 * your cluster based on your resource needs, isolation policies, and
 * availability requirements. Amazon EC2 Container Service eliminates the
 * need for you to operate your own cluster management and configuration
 * management systems or worry about scaling your management
 * infrastructure.
 * </p>
 */
public interface AmazonECSAsync extends AmazonECS {
    /**
     * <p>
     * Deletes the specified cluster. You must deregister all container
     * instances from this cluster before you may delete it. You can list the
     * container instances in a cluster with ListContainerInstances and
     * deregister them with DeregisterContainerInstance.
     * </p>
     *
     * @param deleteClusterRequest Container for the necessary parameters to
     *           execute the DeleteCluster operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCluster service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified cluster. You must deregister all container
     * instances from this cluster before you may delete it. You can list the
     * container instances in a cluster with ListContainerInstances and
     * deregister them with DeregisterContainerInstance.
     * </p>
     *
     * @param deleteClusterRequest Container for the necessary parameters to
     *           execute the DeleteCluster operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCluster service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Sent to acknowledge that a container changed states.
     * </p>
     *
     * @param submitContainerStateChangeRequest Container for the necessary
     *           parameters to execute the SubmitContainerStateChange operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         SubmitContainerStateChange service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(SubmitContainerStateChangeRequest submitContainerStateChangeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Sent to acknowledge that a container changed states.
     * </p>
     *
     * @param submitContainerStateChangeRequest Container for the necessary
     *           parameters to execute the SubmitContainerStateChange operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SubmitContainerStateChange service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(SubmitContainerStateChangeRequest submitContainerStateChangeRequest,
            AsyncHandler<SubmitContainerStateChangeRequest, SubmitContainerStateChangeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified service within a cluster.
     * </p>
     *
     * @param deleteServiceRequest Container for the necessary parameters to
     *           execute the DeleteService operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteService service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified service within a cluster.
     * </p>
     *
     * @param deleteServiceRequest Container for the necessary parameters to
     *           execute the DeleteService operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteService service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest,
            AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of task definitions that are registered to your
     * account. You can filter the results by family name with the
     * <code>familyPrefix</code> parameter or by status with the
     * <code>status</code> parameter.
     * </p>
     *
     * @param listTaskDefinitionsRequest Container for the necessary
     *           parameters to execute the ListTaskDefinitions operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         ListTaskDefinitions service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(ListTaskDefinitionsRequest listTaskDefinitionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of task definitions that are registered to your
     * account. You can filter the results by family name with the
     * <code>familyPrefix</code> parameter or by status with the
     * <code>status</code> parameter.
     * </p>
     *
     * @param listTaskDefinitionsRequest Container for the necessary
     *           parameters to execute the ListTaskDefinitions operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTaskDefinitions service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(ListTaskDefinitionsRequest listTaskDefinitionsRequest,
            AsyncHandler<ListTaskDefinitionsRequest, ListTaskDefinitionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Start a task using random placement and the default Amazon ECS
     * scheduler. If you want to use your own scheduler or place a task on a
     * specific container instance, use <code>StartTask</code> instead.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The count parameter is limited to 10 tasks per
     * call.
     * </p>
     *
     * @param runTaskRequest Container for the necessary parameters to
     *           execute the RunTask operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the RunTask
     *         service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunTaskResult> runTaskAsync(RunTaskRequest runTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Start a task using random placement and the default Amazon ECS
     * scheduler. If you want to use your own scheduler or place a task on a
     * specific container instance, use <code>StartTask</code> instead.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The count parameter is limited to 10 tasks per
     * call.
     * </p>
     *
     * @param runTaskRequest Container for the necessary parameters to
     *           execute the RunTask operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the RunTask
     *         service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunTaskResult> runTaskAsync(RunTaskRequest runTaskRequest,
            AsyncHandler<RunTaskRequest, RunTaskResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     *
     * @param listClustersRequest Container for the necessary parameters to
     *           execute the ListClusters operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         ListClusters service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     *
     * @param listClustersRequest Container for the necessary parameters to
     *           execute the ListClusters operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListClusters service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account will
     * receive a <code>default</code> cluster when you launch your first
     * container instance. However, you can create your own cluster with a
     * unique name with the <code>CreateCluster</code> action.
     * </p>
     *
     * @param createClusterRequest Container for the necessary parameters to
     *           execute the CreateCluster operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCluster service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account will
     * receive a <code>default</code> cluster when you launch your first
     * container instance. However, you can create your own cluster with a
     * unique name with the <code>CreateCluster</code> action.
     * </p>
     *
     * @param createClusterRequest Container for the necessary parameters to
     *           execute the CreateCluster operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCluster service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     *
     * @param describeClustersRequest Container for the necessary parameters
     *           to execute the DescribeClusters operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusters service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     *
     * @param describeClustersRequest Container for the necessary parameters
     *           to execute the DescribeClusters operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeClusters service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified task definition by family and revision.
     * Upon deregistration, the task definition is marked as
     * <code>INACTIVE</code> . Existing tasks and services that reference an
     * <code>INACTIVE</code> task definition continue to run without
     * disruption. Existing services that reference an <code>INACTIVE</code>
     * task definition can still scale up or down by modifying the service's
     * desired count.
     * </p>
     * <p>
     * You cannot use an <code>INACTIVE</code> task definition to run new
     * tasks or create new services, and you cannot update an existing
     * service to reference an <code>INACTIVE</code> task definition
     * (although there may be up to a 10 minute window following
     * deregistration where these restrictions have not yet taken effect).
     * </p>
     *
     * @param deregisterTaskDefinitionRequest Container for the necessary
     *           parameters to execute the DeregisterTaskDefinition operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterTaskDefinition service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified task definition by family and revision.
     * Upon deregistration, the task definition is marked as
     * <code>INACTIVE</code> . Existing tasks and services that reference an
     * <code>INACTIVE</code> task definition continue to run without
     * disruption. Existing services that reference an <code>INACTIVE</code>
     * task definition can still scale up or down by modifying the service's
     * desired count.
     * </p>
     * <p>
     * You cannot use an <code>INACTIVE</code> task definition to run new
     * tasks or create new services, and you cannot update an existing
     * service to reference an <code>INACTIVE</code> task definition
     * (although there may be up to a 10 minute window following
     * deregistration where these restrictions have not yet taken effect).
     * </p>
     *
     * @param deregisterTaskDefinitionRequest Container for the necessary
     *           parameters to execute the DeregisterTaskDefinition operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterTaskDefinition service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest,
            AsyncHandler<DeregisterTaskDefinitionRequest, DeregisterTaskDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters an Amazon ECS container instance from the specified
     * cluster. This instance will no longer be available to run tasks.
     * </p>
     * <p>
     * If you intend to use the container instance for some other purpose
     * after deregistration, you should stop all of the tasks running on the
     * container instance before deregistration to avoid any orphaned tasks
     * from consuming resources.
     * </p>
     * <p>
     * Deregistering a container instance removes the instance from a
     * cluster, but it does not terminate the EC2 instance; if you are
     * finished using the instance, be sure to terminate it in the Amazon EC2
     * console to stop billing.
     * </p>
     * <p>
     * <b>NOTE:</b> When you terminate a container instance, it is
     * automatically deregistered from your cluster.
     * </p>
     *
     * @param deregisterContainerInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterContainerInstance operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterContainerInstance service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(DeregisterContainerInstanceRequest deregisterContainerInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters an Amazon ECS container instance from the specified
     * cluster. This instance will no longer be available to run tasks.
     * </p>
     * <p>
     * If you intend to use the container instance for some other purpose
     * after deregistration, you should stop all of the tasks running on the
     * container instance before deregistration to avoid any orphaned tasks
     * from consuming resources.
     * </p>
     * <p>
     * Deregistering a container instance removes the instance from a
     * cluster, but it does not terminate the EC2 instance; if you are
     * finished using the instance, be sure to terminate it in the Amazon EC2
     * console to stop billing.
     * </p>
     * <p>
     * <b>NOTE:</b> When you terminate a container instance, it is
     * automatically deregistered from your cluster.
     * </p>
     *
     * @param deregisterContainerInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterContainerInstance operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterContainerInstance service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(DeregisterContainerInstanceRequest deregisterContainerInstanceRequest,
            AsyncHandler<DeregisterContainerInstanceRequest, DeregisterContainerInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of container instances in a specified cluster.
     * </p>
     *
     * @param listContainerInstancesRequest Container for the necessary
     *           parameters to execute the ListContainerInstances operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         ListContainerInstances service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListContainerInstancesResult> listContainerInstancesAsync(ListContainerInstancesRequest listContainerInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of container instances in a specified cluster.
     * </p>
     *
     * @param listContainerInstancesRequest Container for the necessary
     *           parameters to execute the ListContainerInstances operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListContainerInstances service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListContainerInstancesResult> listContainerInstancesAsync(ListContainerInstancesRequest listContainerInstancesRequest,
            AsyncHandler<ListContainerInstancesRequest, ListContainerInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the Amazon ECS container agent on a specified container
     * instance. Updating the Amazon ECS container agent does not interrupt
     * running tasks or services on the container instance. The process for
     * updating the agent differs depending on whether your container
     * instance was launched with the Amazon ECS-optimized AMI or another
     * operating system.
     * </p>
     * <p>
     * <code>UpdateContainerAgent</code> requires the Amazon ECS-optimized
     * AMI or Amazon Linux with the <code>ecs-init</code> service installed
     * and running. For help updating the Amazon ECS container agent on other
     * operating systems, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html#manually_update_agent"> Manually Updating the Amazon ECS Container Agent </a>
     * in the <i>Amazon EC2 Container Service Developer Guide</i> .
     * </p>
     *
     * @param updateContainerAgentRequest Container for the necessary
     *           parameters to execute the UpdateContainerAgent operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateContainerAgent service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateContainerAgentResult> updateContainerAgentAsync(UpdateContainerAgentRequest updateContainerAgentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the Amazon ECS container agent on a specified container
     * instance. Updating the Amazon ECS container agent does not interrupt
     * running tasks or services on the container instance. The process for
     * updating the agent differs depending on whether your container
     * instance was launched with the Amazon ECS-optimized AMI or another
     * operating system.
     * </p>
     * <p>
     * <code>UpdateContainerAgent</code> requires the Amazon ECS-optimized
     * AMI or Amazon Linux with the <code>ecs-init</code> service installed
     * and running. For help updating the Amazon ECS container agent on other
     * operating systems, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html#manually_update_agent"> Manually Updating the Amazon ECS Container Agent </a>
     * in the <i>Amazon EC2 Container Service Developer Guide</i> .
     * </p>
     *
     * @param updateContainerAgentRequest Container for the necessary
     *           parameters to execute the UpdateContainerAgent operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateContainerAgent service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateContainerAgentResult> updateContainerAgentAsync(UpdateContainerAgentRequest updateContainerAgentRequest,
            AsyncHandler<UpdateContainerAgentRequest, UpdateContainerAgentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a task definition. You can specify a <code>family</code>
     * and <code>revision</code> to find information on a specific task
     * definition, or you can simply specify the family to find the latest
     * <code>ACTIVE</code> revision in that family.
     * </p>
     * <p>
     * <b>NOTE:</b> You can only describe INACTIVE task definitions while an
     * active task or service references them.
     * </p>
     *
     * @param describeTaskDefinitionRequest Container for the necessary
     *           parameters to execute the DescribeTaskDefinition operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTaskDefinition service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(DescribeTaskDefinitionRequest describeTaskDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a task definition. You can specify a <code>family</code>
     * and <code>revision</code> to find information on a specific task
     * definition, or you can simply specify the family to find the latest
     * <code>ACTIVE</code> revision in that family.
     * </p>
     * <p>
     * <b>NOTE:</b> You can only describe INACTIVE task definitions while an
     * active task or service references them.
     * </p>
     *
     * @param describeTaskDefinitionRequest Container for the necessary
     *           parameters to execute the DescribeTaskDefinition operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTaskDefinition service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(DescribeTaskDefinitionRequest describeTaskDefinitionRequest,
            AsyncHandler<DescribeTaskDefinitionRequest, DescribeTaskDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a new task definition from the supplied <code>family</code>
     * and <code>containerDefinitions</code> . Optionally, you can add data
     * volumes to your containers with the <code>volumes</code> parameter.
     * For more information on task definition parameters and defaults, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"> Amazon ECS Task Definitions </a>
     * in the <i>Amazon EC2 Container Service Developer Guide</i> .
     * </p>
     *
     * @param registerTaskDefinitionRequest Container for the necessary
     *           parameters to execute the RegisterTaskDefinition operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterTaskDefinition service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(RegisterTaskDefinitionRequest registerTaskDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a new task definition from the supplied <code>family</code>
     * and <code>containerDefinitions</code> . Optionally, you can add data
     * volumes to your containers with the <code>volumes</code> parameter.
     * For more information on task definition parameters and defaults, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"> Amazon ECS Task Definitions </a>
     * in the <i>Amazon EC2 Container Service Developer Guide</i> .
     * </p>
     *
     * @param registerTaskDefinitionRequest Container for the necessary
     *           parameters to execute the RegisterTaskDefinition operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterTaskDefinition service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(RegisterTaskDefinitionRequest registerTaskDefinitionRequest,
            AsyncHandler<RegisterTaskDefinitionRequest, RegisterTaskDefinitionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Sent to acknowledge that a task changed states.
     * </p>
     *
     * @param submitTaskStateChangeRequest Container for the necessary
     *           parameters to execute the SubmitTaskStateChange operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         SubmitTaskStateChange service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(SubmitTaskStateChangeRequest submitTaskStateChangeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Sent to acknowledge that a task changed states.
     * </p>
     *
     * @param submitTaskStateChangeRequest Container for the necessary
     *           parameters to execute the SubmitTaskStateChange operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SubmitTaskStateChange service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(SubmitTaskStateChangeRequest submitTaskStateChangeRequest,
            AsyncHandler<SubmitTaskStateChangeRequest, SubmitTaskStateChangeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Runs and maintains a desired number of tasks from a specified task
     * definition. If the number of tasks running in a service drops below
     * <code>desiredCount</code> , Amazon ECS will spawn another
     * instantiation of the task in the specified cluster.
     * </p>
     *
     * @param createServiceRequest Container for the necessary parameters to
     *           execute the CreateService operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateService service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Runs and maintains a desired number of tasks from a specified task
     * definition. If the number of tasks running in a service drops below
     * <code>desiredCount</code> , Amazon ECS will spawn another
     * instantiation of the task in the specified cluster.
     * </p>
     *
     * @param createServiceRequest Container for the necessary parameters to
     *           execute the CreateService operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateService service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest,
            AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Amazon EC2 Container Service container instances. Returns
     * metadata about registered and remaining resources on each container
     * instance requested.
     * </p>
     *
     * @param describeContainerInstancesRequest Container for the necessary
     *           parameters to execute the DescribeContainerInstances operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeContainerInstances service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(DescribeContainerInstancesRequest describeContainerInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Amazon EC2 Container Service container instances. Returns
     * metadata about registered and remaining resources on each container
     * instance requested.
     * </p>
     *
     * @param describeContainerInstancesRequest Container for the necessary
     *           parameters to execute the DescribeContainerInstances operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeContainerInstances service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(DescribeContainerInstancesRequest describeContainerInstancesRequest,
            AsyncHandler<DescribeContainerInstancesRequest, DescribeContainerInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Registers an Amazon EC2 instance into the specified cluster. This
     * instance will become available to place containers on.
     * </p>
     *
     * @param registerContainerInstanceRequest Container for the necessary
     *           parameters to execute the RegisterContainerInstance operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterContainerInstance service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(RegisterContainerInstanceRequest registerContainerInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Registers an Amazon EC2 instance into the specified cluster. This
     * instance will become available to place containers on.
     * </p>
     *
     * @param registerContainerInstanceRequest Container for the necessary
     *           parameters to execute the RegisterContainerInstance operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterContainerInstance service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(RegisterContainerInstanceRequest registerContainerInstanceRequest,
            AsyncHandler<RegisterContainerInstanceRequest, RegisterContainerInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified services running in your cluster.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServices service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified services running in your cluster.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServices service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest,
            AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     *
     * @param listServicesRequest Container for the necessary parameters to
     *           execute the ListServices operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         ListServices service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     *
     * @param listServicesRequest Container for the necessary parameters to
     *           execute the ListServices operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListServices service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modify the desired count or task definition used in a service.
     * </p>
     * <p>
     * You can add to or subtract from the number of instantiations of a
     * task definition in a service by specifying the cluster that the
     * service is running in and a new <code>desiredCount</code> parameter.
     * </p>
     * <p>
     * You can use <code>UpdateService</code> to modify your task definition
     * and deploy a new version of your service, one task at a time. If you
     * modify the task definition with <code>UpdateService</code> , Amazon
     * ECS spawns a task with the new version of the task definition and then
     * stops an old task after the new version is running. Because
     * <code>UpdateService</code> starts a new version of the task before
     * stopping an old version, your cluster must have capacity to support
     * one more instantiation of the task when <code>UpdateService</code> is
     * run. If your cluster cannot support another instantiation of the task
     * used in your service, you can reduce the desired count of your service
     * by one before modifying the task definition.
     * </p>
     *
     * @param updateServiceRequest Container for the necessary parameters to
     *           execute the UpdateService operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateService service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modify the desired count or task definition used in a service.
     * </p>
     * <p>
     * You can add to or subtract from the number of instantiations of a
     * task definition in a service by specifying the cluster that the
     * service is running in and a new <code>desiredCount</code> parameter.
     * </p>
     * <p>
     * You can use <code>UpdateService</code> to modify your task definition
     * and deploy a new version of your service, one task at a time. If you
     * modify the task definition with <code>UpdateService</code> , Amazon
     * ECS spawns a task with the new version of the task definition and then
     * stops an old task after the new version is running. Because
     * <code>UpdateService</code> starts a new version of the task before
     * stopping an old version, your cluster must have capacity to support
     * one more instantiation of the task when <code>UpdateService</code> is
     * run. If your cluster cannot support another instantiation of the task
     * used in your service, you can reduce the desired count of your service
     * by one before modifying the task definition.
     * </p>
     *
     * @param updateServiceRequest Container for the necessary parameters to
     *           execute the UpdateService operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateService service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest,
            AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of task definition families that are registered to
     * your account (which may include task definition families that no
     * longer have any <code>ACTIVE</code> task definitions). You can filter
     * the results with the <code>familyPrefix</code> parameter.
     * </p>
     *
     * @param listTaskDefinitionFamiliesRequest Container for the necessary
     *           parameters to execute the ListTaskDefinitionFamilies operation on
     *           AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         ListTaskDefinitionFamilies service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of task definition families that are registered to
     * your account (which may include task definition families that no
     * longer have any <code>ACTIVE</code> task definitions). You can filter
     * the results with the <code>familyPrefix</code> parameter.
     * </p>
     *
     * @param listTaskDefinitionFamiliesRequest Container for the necessary
     *           parameters to execute the ListTaskDefinitionFamilies operation on
     *           AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTaskDefinitionFamilies service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest,
            AsyncHandler<ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a specified task or tasks.
     * </p>
     *
     * @param describeTasksRequest Container for the necessary parameters to
     *           execute the DescribeTasks operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTasks service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTasksResult> describeTasksAsync(DescribeTasksRequest describeTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a specified task or tasks.
     * </p>
     *
     * @param describeTasksRequest Container for the necessary parameters to
     *           execute the DescribeTasks operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTasks service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTasksResult> describeTasksAsync(DescribeTasksRequest describeTasksRequest,
            AsyncHandler<DescribeTasksRequest, DescribeTasksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Returns an endpoint for the Amazon EC2 Container Service agent to
     * poll for updates.
     * </p>
     *
     * @param discoverPollEndpointRequest Container for the necessary
     *           parameters to execute the DiscoverPollEndpoint operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         DiscoverPollEndpoint service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(DiscoverPollEndpointRequest discoverPollEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b> This action is only used by the Amazon EC2 Container
     * Service agent, and it is not intended for use outside of the agent.
     * </p>
     * <p>
     * Returns an endpoint for the Amazon EC2 Container Service agent to
     * poll for updates.
     * </p>
     *
     * @param discoverPollEndpointRequest Container for the necessary
     *           parameters to execute the DiscoverPollEndpoint operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DiscoverPollEndpoint service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(DiscoverPollEndpointRequest discoverPollEndpointRequest,
            AsyncHandler<DiscoverPollEndpointRequest, DiscoverPollEndpointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a new task from the specified task definition on the specified
     * container instance or instances. If you want to use the default Amazon
     * ECS scheduler to place your task, use <code>RunTask</code> instead.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The list of container instances to start tasks on
     * is limited to 10.
     * </p>
     *
     * @param startTaskRequest Container for the necessary parameters to
     *           execute the StartTask operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         StartTask service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartTaskResult> startTaskAsync(StartTaskRequest startTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a new task from the specified task definition on the specified
     * container instance or instances. If you want to use the default Amazon
     * ECS scheduler to place your task, use <code>RunTask</code> instead.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The list of container instances to start tasks on
     * is limited to 10.
     * </p>
     *
     * @param startTaskRequest Container for the necessary parameters to
     *           execute the StartTask operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartTask service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartTaskResult> startTaskAsync(StartTaskRequest startTaskRequest,
            AsyncHandler<StartTaskRequest, StartTaskResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of tasks for a specified cluster. You can filter the
     * results by family name, by a particular container instance, or by the
     * desired status of the task with the <code>family</code> ,
     * <code>containerInstance</code> , and <code>desiredStatus</code>
     * parameters.
     * </p>
     *
     * @param listTasksRequest Container for the necessary parameters to
     *           execute the ListTasks operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the
     *         ListTasks service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of tasks for a specified cluster. You can filter the
     * results by family name, by a particular container instance, or by the
     * desired status of the task with the <code>family</code> ,
     * <code>containerInstance</code> , and <code>desiredStatus</code>
     * parameters.
     * </p>
     *
     * @param listTasksRequest Container for the necessary parameters to
     *           execute the ListTasks operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTasks service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest,
            AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a running task.
     * </p>
     *
     * @param stopTaskRequest Container for the necessary parameters to
     *           execute the StopTask operation on AmazonECS.
     * 
     * @return A Java Future object containing the response from the StopTask
     *         service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopTaskResult> stopTaskAsync(StopTaskRequest stopTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a running task.
     * </p>
     *
     * @param stopTaskRequest Container for the necessary parameters to
     *           execute the StopTask operation on AmazonECS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the StopTask
     *         service method, as returned by AmazonECS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopTaskResult> stopTaskAsync(StopTaskRequest stopTaskRequest,
            AsyncHandler<StopTaskRequest, StopTaskResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        