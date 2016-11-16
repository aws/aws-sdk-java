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
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ecs.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://ecs.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
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
     */
    void setRegion(Region region);

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
    CreateServiceResult createService(CreateServiceRequest createServiceRequest);

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
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest);

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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DescribeClusters
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.DescribeServices
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.DescribeTaskDefinition
     */
    DescribeTaskDefinitionResult describeTaskDefinition(DescribeTaskDefinitionRequest describeTaskDefinitionRequest);

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
    DescribeTasksResult describeTasks(DescribeTasksRequest describeTasksRequest);

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
    DiscoverPollEndpointResult discoverPollEndpoint(DiscoverPollEndpointRequest discoverPollEndpointRequest);

    /**
     * Simplified method form for invoking the DiscoverPollEndpoint operation.
     *
     * @see #discoverPollEndpoint(DiscoverPollEndpointRequest)
     */
    DiscoverPollEndpointResult discoverPollEndpoint();

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
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClusters(ListClustersRequest)
     */
    ListClustersResult listClusters();

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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClusterNotFoundException
     *         The specified cluster could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon ECS clusters are region-specific.
     * @sample AmazonECS.ListServices
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
     *         user that doesn't have permission to use the action or resource, or specifying an identifier that is not
     *         valid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @sample AmazonECS.ListTaskDefinitions
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
    ListTasksResult listTasks(ListTasksRequest listTasksRequest);

    /**
     * Simplified method form for invoking the ListTasks operation.
     *
     * @see #listTasks(ListTasksRequest)
     */
    ListTasksResult listTasks();

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
    RegisterContainerInstanceResult registerContainerInstance(RegisterContainerInstanceRequest registerContainerInstanceRequest);

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
    RegisterTaskDefinitionResult registerTaskDefinition(RegisterTaskDefinitionRequest registerTaskDefinitionRequest);

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
    RunTaskResult runTask(RunTaskRequest runTaskRequest);

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
    StartTaskResult startTask(StartTaskRequest startTaskRequest);

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
    StopTaskResult stopTask(StopTaskRequest stopTaskRequest);

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
    SubmitTaskStateChangeResult submitTaskStateChange(SubmitTaskStateChangeRequest submitTaskStateChangeRequest);

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
    UpdateContainerAgentResult updateContainerAgent(UpdateContainerAgentRequest updateContainerAgentRequest);

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
    UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest);

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
