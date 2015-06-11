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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.ecs.model.*;

/**
 * Interface for accessing AmazonECS.
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
public interface AmazonECS {

    /**
     * Overrides the default endpoint for this client ("https://ecs.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ecs.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ecs.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "ecs.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ecs.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonECS#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Deletes the specified cluster. You must deregister all container
     * instances from this cluster before you may delete it. You can list the
     * container instances in a cluster with ListContainerInstances and
     * deregister them with DeregisterContainerInstance.
     * </p>
     *
     * @param deleteClusterRequest Container for the necessary parameters to
     *           execute the DeleteCluster service method on AmazonECS.
     * 
     * @return The response from the DeleteCluster service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterContainsContainerInstancesException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     * @throws ClusterContainsServicesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest) 
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
     *           parameters to execute the SubmitContainerStateChange service method on
     *           AmazonECS.
     * 
     * @return The response from the SubmitContainerStateChange service
     *         method, as returned by AmazonECS.
     * 
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SubmitContainerStateChangeResult submitContainerStateChange(SubmitContainerStateChangeRequest submitContainerStateChangeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified service within a cluster.
     * </p>
     *
     * @param deleteServiceRequest Container for the necessary parameters to
     *           execute the DeleteService service method on AmazonECS.
     * 
     * @return The response from the DeleteService service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     * @throws ServiceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of task definitions that are registered to your
     * account. You can filter the results by family name with the
     * <code>familyPrefix</code> parameter.
     * </p>
     *
     * @param listTaskDefinitionsRequest Container for the necessary
     *           parameters to execute the ListTaskDefinitions service method on
     *           AmazonECS.
     * 
     * @return The response from the ListTaskDefinitions service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTaskDefinitionsResult listTaskDefinitions(ListTaskDefinitionsRequest listTaskDefinitionsRequest) 
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
     *           execute the RunTask service method on AmazonECS.
     * 
     * @return The response from the RunTask service method, as returned by
     *         AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RunTaskResult runTask(RunTaskRequest runTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     *
     * @param listClustersRequest Container for the necessary parameters to
     *           execute the ListClusters service method on AmazonECS.
     * 
     * @return The response from the ListClusters service method, as returned
     *         by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListClustersResult listClusters(ListClustersRequest listClustersRequest) 
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
     *           execute the CreateCluster service method on AmazonECS.
     * 
     * @return The response from the CreateCluster service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateClusterResult createCluster(CreateClusterRequest createClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     *
     * @param describeClustersRequest Container for the necessary parameters
     *           to execute the DescribeClusters service method on AmazonECS.
     * 
     * @return The response from the DescribeClusters service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters an Amazon ECS container instance from the specified
     * cluster. This instance will no longer be available to run tasks.
     * </p>
     *
     * @param deregisterContainerInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterContainerInstance service method
     *           on AmazonECS.
     * 
     * @return The response from the DeregisterContainerInstance service
     *         method, as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeregisterContainerInstanceResult deregisterContainerInstance(DeregisterContainerInstanceRequest deregisterContainerInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of container instances in a specified cluster.
     * </p>
     *
     * @param listContainerInstancesRequest Container for the necessary
     *           parameters to execute the ListContainerInstances service method on
     *           AmazonECS.
     * 
     * @return The response from the ListContainerInstances service method,
     *         as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListContainerInstancesResult listContainerInstances(ListContainerInstancesRequest listContainerInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * NOT YET IMPLEMENTED.
     * </p>
     * <p>
     * Deregisters the specified task definition. You will no longer be able
     * to run tasks from this definition after deregistration.
     * </p>
     *
     * @param deregisterTaskDefinitionRequest Container for the necessary
     *           parameters to execute the DeregisterTaskDefinition service method on
     *           AmazonECS.
     * 
     * @return The response from the DeregisterTaskDefinition service method,
     *         as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeregisterTaskDefinitionResult deregisterTaskDefinition(DeregisterTaskDefinitionRequest deregisterTaskDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the Amazon ECS container agent on a specified container
     * instance.
     * </p>
     *
     * @param updateContainerAgentRequest Container for the necessary
     *           parameters to execute the UpdateContainerAgent service method on
     *           AmazonECS.
     * 
     * @return The response from the UpdateContainerAgent service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws NoUpdateAvailableException
     * @throws ClientException
     * @throws MissingVersionException
     * @throws UpdateInProgressException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateContainerAgentResult updateContainerAgent(UpdateContainerAgentRequest updateContainerAgentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a task definition. You can specify a <code>family</code>
     * and <code>revision</code> to find information on a specific task
     * definition, or you can simply specify the family to find the latest
     * revision in that family.
     * </p>
     *
     * @param describeTaskDefinitionRequest Container for the necessary
     *           parameters to execute the DescribeTaskDefinition service method on
     *           AmazonECS.
     * 
     * @return The response from the DescribeTaskDefinition service method,
     *         as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTaskDefinitionResult describeTaskDefinition(DescribeTaskDefinitionRequest describeTaskDefinitionRequest) 
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
     *           parameters to execute the RegisterTaskDefinition service method on
     *           AmazonECS.
     * 
     * @return The response from the RegisterTaskDefinition service method,
     *         as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterTaskDefinitionResult registerTaskDefinition(RegisterTaskDefinitionRequest registerTaskDefinitionRequest) 
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
     *           parameters to execute the SubmitTaskStateChange service method on
     *           AmazonECS.
     * 
     * @return The response from the SubmitTaskStateChange service method, as
     *         returned by AmazonECS.
     * 
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SubmitTaskStateChangeResult submitTaskStateChange(SubmitTaskStateChangeRequest submitTaskStateChangeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Amazon EC2 Container Service container instances. Returns
     * metadata about registered and remaining resources on each container
     * instance requested.
     * </p>
     *
     * @param describeContainerInstancesRequest Container for the necessary
     *           parameters to execute the DescribeContainerInstances service method on
     *           AmazonECS.
     * 
     * @return The response from the DescribeContainerInstances service
     *         method, as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeContainerInstancesResult describeContainerInstances(DescribeContainerInstancesRequest describeContainerInstancesRequest) 
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
     *           parameters to execute the RegisterContainerInstance service method on
     *           AmazonECS.
     * 
     * @return The response from the RegisterContainerInstance service
     *         method, as returned by AmazonECS.
     * 
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterContainerInstanceResult registerContainerInstance(RegisterContainerInstanceRequest registerContainerInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified services running in your cluster.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices service method on AmazonECS.
     * 
     * @return The response from the DescribeServices service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest) 
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
     *           execute the CreateService service method on AmazonECS.
     * 
     * @return The response from the CreateService service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateServiceResult createService(CreateServiceRequest createServiceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     *
     * @param listServicesRequest Container for the necessary parameters to
     *           execute the ListServices service method on AmazonECS.
     * 
     * @return The response from the ListServices service method, as returned
     *         by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListServicesResult listServices(ListServicesRequest listServicesRequest) 
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
     *           execute the UpdateService service method on AmazonECS.
     * 
     * @return The response from the UpdateService service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServiceNotActiveException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     * @throws ServiceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of task definition families that are registered to
     * your account. You can filter the results with the
     * <code>familyPrefix</code> parameter.
     * </p>
     *
     * @param listTaskDefinitionFamiliesRequest Container for the necessary
     *           parameters to execute the ListTaskDefinitionFamilies service method on
     *           AmazonECS.
     * 
     * @return The response from the ListTaskDefinitionFamilies service
     *         method, as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(ListTaskDefinitionFamiliesRequest listTaskDefinitionFamiliesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a specified task or tasks.
     * </p>
     *
     * @param describeTasksRequest Container for the necessary parameters to
     *           execute the DescribeTasks service method on AmazonECS.
     * 
     * @return The response from the DescribeTasks service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTasksResult describeTasks(DescribeTasksRequest describeTasksRequest) 
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
     *           parameters to execute the DiscoverPollEndpoint service method on
     *           AmazonECS.
     * 
     * @return The response from the DiscoverPollEndpoint service method, as
     *         returned by AmazonECS.
     * 
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DiscoverPollEndpointResult discoverPollEndpoint(DiscoverPollEndpointRequest discoverPollEndpointRequest) 
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
     *           execute the StartTask service method on AmazonECS.
     * 
     * @return The response from the StartTask service method, as returned by
     *         AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StartTaskResult startTask(StartTaskRequest startTaskRequest) 
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
     *           execute the ListTasks service method on AmazonECS.
     * 
     * @return The response from the ListTasks service method, as returned by
     *         AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTasksResult listTasks(ListTasksRequest listTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a running task.
     * </p>
     *
     * @param stopTaskRequest Container for the necessary parameters to
     *           execute the StopTask service method on AmazonECS.
     * 
     * @return The response from the StopTask service method, as returned by
     *         AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StopTaskResult stopTask(StopTaskRequest stopTaskRequest) 
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
     * @return The response from the SubmitContainerStateChange service
     *         method, as returned by AmazonECS.
     * 
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SubmitContainerStateChangeResult submitContainerStateChange() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of task definitions that are registered to your
     * account. You can filter the results by family name with the
     * <code>familyPrefix</code> parameter.
     * </p>
     * 
     * @return The response from the ListTaskDefinitions service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTaskDefinitionsResult listTaskDefinitions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of existing clusters.
     * </p>
     * 
     * @return The response from the ListClusters service method, as returned
     *         by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListClustersResult listClusters() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Creates a new Amazon ECS cluster. By default, your account will
     * receive a <code>default</code> cluster when you launch your first
     * container instance. However, you can create your own cluster with a
     * unique name with the <code>CreateCluster</code> action.
     * </p>
     * 
     * @return The response from the CreateCluster service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateClusterResult createCluster() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your clusters.
     * </p>
     * 
     * @return The response from the DescribeClusters service method, as
     *         returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClustersResult describeClusters() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of container instances in a specified cluster.
     * </p>
     * 
     * @return The response from the ListContainerInstances service method,
     *         as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListContainerInstancesResult listContainerInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the services that are running in a specified cluster.
     * </p>
     * 
     * @return The response from the ListServices service method, as returned
     *         by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListServicesResult listServices() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of task definition families that are registered to
     * your account. You can filter the results with the
     * <code>familyPrefix</code> parameter.
     * </p>
     * 
     * @return The response from the ListTaskDefinitionFamilies service
     *         method, as returned by AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DiscoverPollEndpoint service method, as
     *         returned by AmazonECS.
     * 
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DiscoverPollEndpointResult discoverPollEndpoint() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of tasks for a specified cluster. You can filter the
     * results by family name, by a particular container instance, or by the
     * desired status of the task with the <code>family</code> ,
     * <code>containerInstance</code> , and <code>desiredStatus</code>
     * parameters.
     * </p>
     * 
     * @return The response from the ListTasks service method, as returned by
     *         AmazonECS.
     * 
     * @throws InvalidParameterException
     * @throws ClusterNotFoundException
     * @throws ServerException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonECS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTasksResult listTasks() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        