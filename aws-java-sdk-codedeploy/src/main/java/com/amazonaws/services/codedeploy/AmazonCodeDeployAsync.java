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
package com.amazonaws.services.codedeploy;

import com.amazonaws.services.codedeploy.model.*;

/**
 * Interface for accessing CodeDeploy asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codedeploy.AbstractAmazonCodeDeployAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS CodeDeploy</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This reference guide provides descriptions of the AWS CodeDeploy APIs. For more information about AWS CodeDeploy, see
 * the <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy User Guide</a>.
 * </p>
 * <p>
 * <b>Using the APIs</b>
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to work with the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Applications are unique identifiers used by AWS CodeDeploy to ensure the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update applications.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment configurations are sets of deployment rules and success and failure conditions used by AWS CodeDeploy
 * during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, and list deployment configurations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment groups are groups of instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update deployment groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * Instances represent Amazon EC2 instances to which application revisions are deployed. Instances are identified by
 * their Amazon EC2 tags or Auto Scaling group names. Instances belong to deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get and list instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployments represent the process of deploying revisions to instances.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, get, list, and stop deployments.
 * </p>
 * </li>
 * <li>
 * <p>
 * Application revisions are archive files stored in Amazon S3 buckets or GitHub repositories. These revisions contain
 * source content (such as source code, web pages, executable files, and deployment scripts) along with an application
 * specification (AppSpec) file. (The AppSpec file is unique to AWS CodeDeploy; it defines the deployment actions you
 * want AWS CodeDeploy to execute.) For application revisions stored in Amazon S3 buckets, an application revision is
 * uniquely identified by its Amazon S3 object key and its ETag, version, or both. For application revisions stored in
 * GitHub repositories, an application revision is uniquely identified by its repository name and commit ID. Application
 * revisions are deployed through deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get, list, and register application revisions.
 * </p>
 * </li>
 * </ul>
 */
public interface AmazonCodeDeployAsync extends AmazonCodeDeploy {

    /**
     * <p>
     * Adds tags to on-premises instances.
     * </p>
     * 
     * @param addTagsToOnPremisesInstancesRequest
     *        Represents the input of, and adds tags to, an on-premises instance operation.
     * @return A Java Future containing the result of the AddTagsToOnPremisesInstances operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsync.AddTagsToOnPremisesInstances
     */
    java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(
            AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest);

    /**
     * <p>
     * Adds tags to on-premises instances.
     * </p>
     * 
     * @param addTagsToOnPremisesInstancesRequest
     *        Represents the input of, and adds tags to, an on-premises instance operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToOnPremisesInstances operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsyncHandler.AddTagsToOnPremisesInstances
     */
    java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(
            AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToOnPremisesInstancesRequest, AddTagsToOnPremisesInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more application revisions.
     * </p>
     * 
     * @param batchGetApplicationRevisionsRequest
     *        Represents the input of a batch get application revisions operation.
     * @return A Java Future containing the result of the BatchGetApplicationRevisions operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsync.BatchGetApplicationRevisions
     */
    java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(
            BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest);

    /**
     * <p>
     * Gets information about one or more application revisions.
     * </p>
     * 
     * @param batchGetApplicationRevisionsRequest
     *        Represents the input of a batch get application revisions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetApplicationRevisions operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetApplicationRevisions
     */
    java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(
            BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationRevisionsRequest, BatchGetApplicationRevisionsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     * 
     * @param batchGetApplicationsRequest
     *        Represents the input of a batch get applications operation.
     * @return A Java Future containing the result of the BatchGetApplications operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetApplications
     */
    java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest batchGetApplicationsRequest);

    /**
     * <p>
     * Gets information about one or more applications.
     * </p>
     * 
     * @param batchGetApplicationsRequest
     *        Represents the input of a batch get applications operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetApplications operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetApplications
     */
    java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest batchGetApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the BatchGetApplications operation.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest)
     */
    java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync();

    /**
     * Simplified method form for invoking the BatchGetApplications operation with an AsyncHandler.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler);

    /**
     * <p>
     * Get information about one or more deployment groups.
     * </p>
     * 
     * @param batchGetDeploymentGroupsRequest
     *        Represents the input of a batch get deployment groups operation.
     * @return A Java Future containing the result of the BatchGetDeploymentGroups operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetDeploymentGroups
     */
    java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest);

    /**
     * <p>
     * Get information about one or more deployment groups.
     * </p>
     * 
     * @param batchGetDeploymentGroupsRequest
     *        Represents the input of a batch get deployment groups operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDeploymentGroups operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetDeploymentGroups
     */
    java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentGroupsRequest, BatchGetDeploymentGroupsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more instance that are part of a deployment group.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest
     *        Represents the input of a batch get deployment instances operation.
     * @return A Java Future containing the result of the BatchGetDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetDeploymentInstances
     */
    java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(
            BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest);

    /**
     * <p>
     * Gets information about one or more instance that are part of a deployment group.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest
     *        Represents the input of a batch get deployment instances operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetDeploymentInstances
     */
    java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(
            BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentInstancesRequest, BatchGetDeploymentInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     * 
     * @param batchGetDeploymentsRequest
     *        Represents the input of a batch get deployments operation.
     * @return A Java Future containing the result of the BatchGetDeployments operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetDeployments
     */
    java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest batchGetDeploymentsRequest);

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     * 
     * @param batchGetDeploymentsRequest
     *        Represents the input of a batch get deployments operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDeployments operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetDeployments
     */
    java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest batchGetDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler);

    /**
     * Simplified method form for invoking the BatchGetDeployments operation.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest)
     */
    java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync();

    /**
     * Simplified method form for invoking the BatchGetDeployments operation with an AsyncHandler.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more on-premises instances.
     * </p>
     * 
     * @param batchGetOnPremisesInstancesRequest
     *        Represents the input of a batch get on-premises instances operation.
     * @return A Java Future containing the result of the BatchGetOnPremisesInstances operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetOnPremisesInstances
     */
    java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest);

    /**
     * <p>
     * Gets information about one or more on-premises instances.
     * </p>
     * 
     * @param batchGetOnPremisesInstancesRequest
     *        Represents the input of a batch get on-premises instances operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetOnPremisesInstances operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetOnPremisesInstances
     */
    java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest)
     */
    java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync();

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     *        Represents the input of a create application operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonCodeDeployAsync.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     *        Represents the input of a create application operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Deploys an application revision through the specified deployment group.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Represents the input of a create deployment operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsync.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Deploys an application revision through the specified deployment group.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Represents the input of a create deployment operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates a deployment configuration.
     * </p>
     * 
     * @param createDeploymentConfigRequest
     *        Represents the input of a create deployment configuration operation.
     * @return A Java Future containing the result of the CreateDeploymentConfig operation returned by the service.
     * @sample AmazonCodeDeployAsync.CreateDeploymentConfig
     */
    java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest createDeploymentConfigRequest);

    /**
     * <p>
     * Creates a deployment configuration.
     * </p>
     * 
     * @param createDeploymentConfigRequest
     *        Represents the input of a create deployment configuration operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeploymentConfig operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.CreateDeploymentConfig
     */
    java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest createDeploymentConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentConfigRequest, CreateDeploymentConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a deployment group to which application revisions will be deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest
     *        Represents the input of a create deployment group operation.
     * @return A Java Future containing the result of the CreateDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsync.CreateDeploymentGroup
     */
    java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest createDeploymentGroupRequest);

    /**
     * <p>
     * Creates a deployment group to which application revisions will be deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest
     *        Represents the input of a create deployment group operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.CreateDeploymentGroup
     */
    java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest createDeploymentGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentGroupRequest, CreateDeploymentGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteApplicationRequest
     *        Represents the input of a delete application operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonCodeDeployAsync.DeleteApplication
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteApplicationRequest
     *        Represents the input of a delete application operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.DeleteApplication
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <note>
     * <p>
     * A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be
     * deleted.
     * </p>
     * </note>
     * 
     * @param deleteDeploymentConfigRequest
     *        Represents the input of a delete deployment configuration operation.
     * @return A Java Future containing the result of the DeleteDeploymentConfig operation returned by the service.
     * @sample AmazonCodeDeployAsync.DeleteDeploymentConfig
     */
    java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest);

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <note>
     * <p>
     * A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be
     * deleted.
     * </p>
     * </note>
     * 
     * @param deleteDeploymentConfigRequest
     *        Represents the input of a delete deployment configuration operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeploymentConfig operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.DeleteDeploymentConfig
     */
    java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentConfigRequest, DeleteDeploymentConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     * 
     * @param deleteDeploymentGroupRequest
     *        Represents the input of a delete deployment group operation.
     * @return A Java Future containing the result of the DeleteDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsync.DeleteDeploymentGroup
     */
    java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest);

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     * 
     * @param deleteDeploymentGroupRequest
     *        Represents the input of a delete deployment group operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.DeleteDeploymentGroup
     */
    java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest deleteDeploymentGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResult> asyncHandler);

    /**
     * <p>
     * Deregisters an on-premises instance.
     * </p>
     * 
     * @param deregisterOnPremisesInstanceRequest
     *        Represents the input of a deregister on-premises instance operation.
     * @return A Java Future containing the result of the DeregisterOnPremisesInstance operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsync.DeregisterOnPremisesInstance
     */
    java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(
            DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest);

    /**
     * <p>
     * Deregisters an on-premises instance.
     * </p>
     * 
     * @param deregisterOnPremisesInstanceRequest
     *        Represents the input of a deregister on-premises instance operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterOnPremisesInstance operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsyncHandler.DeregisterOnPremisesInstance
     */
    java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(
            DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterOnPremisesInstanceRequest, DeregisterOnPremisesInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     *        Represents the input of a get application operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetApplication
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     *        Represents the input of a get application operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetApplication
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     * 
     * @param getApplicationRevisionRequest
     *        Represents the input of a get application revision operation.
     * @return A Java Future containing the result of the GetApplicationRevision operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetApplicationRevision
     */
    java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest getApplicationRevisionRequest);

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     * 
     * @param getApplicationRevisionRequest
     *        Represents the input of a get application revision operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationRevision operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetApplicationRevision
     */
    java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest getApplicationRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRevisionRequest, GetApplicationRevisionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Represents the input of a get deployment operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Represents the input of a get deployment operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     * 
     * @param getDeploymentConfigRequest
     *        Represents the input of a get deployment configuration operation.
     * @return A Java Future containing the result of the GetDeploymentConfig operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetDeploymentConfig
     */
    java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest getDeploymentConfigRequest);

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     * 
     * @param getDeploymentConfigRequest
     *        Represents the input of a get deployment configuration operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeploymentConfig operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetDeploymentConfig
     */
    java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest getDeploymentConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentConfigRequest, GetDeploymentConfigResult> asyncHandler);

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     * 
     * @param getDeploymentGroupRequest
     *        Represents the input of a get deployment group operation.
     * @return A Java Future containing the result of the GetDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetDeploymentGroup
     */
    java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest getDeploymentGroupRequest);

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     * 
     * @param getDeploymentGroupRequest
     *        Represents the input of a get deployment group operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetDeploymentGroup
     */
    java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest getDeploymentGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentGroupRequest, GetDeploymentGroupResult> asyncHandler);

    /**
     * <p>
     * Gets information about an instance as part of a deployment.
     * </p>
     * 
     * @param getDeploymentInstanceRequest
     *        Represents the input of a get deployment instance operation.
     * @return A Java Future containing the result of the GetDeploymentInstance operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetDeploymentInstance
     */
    java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest getDeploymentInstanceRequest);

    /**
     * <p>
     * Gets information about an instance as part of a deployment.
     * </p>
     * 
     * @param getDeploymentInstanceRequest
     *        Represents the input of a get deployment instance operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeploymentInstance operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetDeploymentInstance
     */
    java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest getDeploymentInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets information about an on-premises instance.
     * </p>
     * 
     * @param getOnPremisesInstanceRequest
     *        Represents the input of a get on-premises instance operation.
     * @return A Java Future containing the result of the GetOnPremisesInstance operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetOnPremisesInstance
     */
    java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(GetOnPremisesInstanceRequest getOnPremisesInstanceRequest);

    /**
     * <p>
     * Gets information about an on-premises instance.
     * </p>
     * 
     * @param getOnPremisesInstanceRequest
     *        Represents the input of a get on-premises instance operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOnPremisesInstance operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetOnPremisesInstance
     */
    java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(GetOnPremisesInstanceRequest getOnPremisesInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetOnPremisesInstanceRequest, GetOnPremisesInstanceResult> asyncHandler);

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     * 
     * @param listApplicationRevisionsRequest
     *        Represents the input of a list application revisions operation.
     * @return A Java Future containing the result of the ListApplicationRevisions operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListApplicationRevisions
     */
    java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest listApplicationRevisionsRequest);

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     * 
     * @param listApplicationRevisionsRequest
     *        Represents the input of a list application revisions operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationRevisions operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListApplicationRevisions
     */
    java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest listApplicationRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationRevisionsRequest, ListApplicationRevisionsResult> asyncHandler);

    /**
     * <p>
     * Lists the applications registered with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     *        Represents the input of a list applications operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListApplications
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the applications registered with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     *        Represents the input of a list applications operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListApplications
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListApplications operation.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest)
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync();

    /**
     * Simplified method form for invoking the ListApplications operation with an AsyncHandler.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists the deployment configurations with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest
     *        Represents the input of a list deployment configurations operation.
     * @return A Java Future containing the result of the ListDeploymentConfigs operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeploymentConfigs
     */
    java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest listDeploymentConfigsRequest);

    /**
     * <p>
     * Lists the deployment configurations with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest
     *        Represents the input of a list deployment configurations operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentConfigs operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListDeploymentConfigs
     */
    java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest listDeploymentConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest)
     */
    java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync();

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation with an AsyncHandler.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists the deployment groups for an application registered with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest
     *        Represents the input of a list deployment groups operation.
     * @return A Java Future containing the result of the ListDeploymentGroups operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeploymentGroups
     */
    java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest listDeploymentGroupsRequest);

    /**
     * <p>
     * Lists the deployment groups for an application registered with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest
     *        Represents the input of a list deployment groups operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentGroups operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListDeploymentGroups
     */
    java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest listDeploymentGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentGroupsRequest, ListDeploymentGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the instance for a deployment associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest
     *        Represents the input of a list deployment instances operation.
     * @return A Java Future containing the result of the ListDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeploymentInstances
     */
    java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest listDeploymentInstancesRequest);

    /**
     * <p>
     * Lists the instance for a deployment associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest
     *        Represents the input of a list deployment instances operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListDeploymentInstances
     */
    java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest listDeploymentInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS
     * account.
     * </p>
     * 
     * @param listDeploymentsRequest
     *        Represents the input of a list deployments operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeployments
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS
     * account.
     * </p>
     * 
     * @param listDeploymentsRequest
     *        Represents the input of a list deployments operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListDeployments
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDeployments operation.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest)
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync();

    /**
     * Simplified method form for invoking the ListDeployments operation with an AsyncHandler.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of names for one or more on-premises instances.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises instance names will be listed. To list
     * only registered or deregistered on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest
     *        Represents the input of a list on-premises instances operation.
     * @return A Java Future containing the result of the ListOnPremisesInstances operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListOnPremisesInstances
     */
    java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest listOnPremisesInstancesRequest);

    /**
     * <p>
     * Gets a list of names for one or more on-premises instances.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises instance names will be listed. To list
     * only registered or deregistered on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest
     *        Represents the input of a list on-premises instances operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOnPremisesInstances operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListOnPremisesInstances
     */
    java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest listOnPremisesInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest)
     */
    java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync();

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler);

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest
     *        Represents the input of a register application revision operation.
     * @return A Java Future containing the result of the RegisterApplicationRevision operation returned by the service.
     * @sample AmazonCodeDeployAsync.RegisterApplicationRevision
     */
    java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(
            RegisterApplicationRevisionRequest registerApplicationRevisionRequest);

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest
     *        Represents the input of a register application revision operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterApplicationRevision operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.RegisterApplicationRevision
     */
    java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(
            RegisterApplicationRevisionRequest registerApplicationRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterApplicationRevisionRequest, RegisterApplicationRevisionResult> asyncHandler);

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * 
     * @param registerOnPremisesInstanceRequest
     *        Represents the input of the register on-premises instance operation.
     * @return A Java Future containing the result of the RegisterOnPremisesInstance operation returned by the service.
     * @sample AmazonCodeDeployAsync.RegisterOnPremisesInstance
     */
    java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(
            RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest);

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * 
     * @param registerOnPremisesInstanceRequest
     *        Represents the input of the register on-premises instance operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterOnPremisesInstance operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.RegisterOnPremisesInstance
     */
    java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(
            RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterOnPremisesInstanceRequest, RegisterOnPremisesInstanceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from one or more on-premises instances.
     * </p>
     * 
     * @param removeTagsFromOnPremisesInstancesRequest
     *        Represents the input of a remove tags from on-premises instances operation.
     * @return A Java Future containing the result of the RemoveTagsFromOnPremisesInstances operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsync.RemoveTagsFromOnPremisesInstances
     */
    java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest);

    /**
     * <p>
     * Removes one or more tags from one or more on-premises instances.
     * </p>
     * 
     * @param removeTagsFromOnPremisesInstancesRequest
     *        Represents the input of a remove tags from on-premises instances operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromOnPremisesInstances operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsyncHandler.RemoveTagsFromOnPremisesInstances
     */
    java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromOnPremisesInstancesRequest, RemoveTagsFromOnPremisesInstancesResult> asyncHandler);

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest
     *        Represents the input of a stop deployment operation.
     * @return A Java Future containing the result of the StopDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsync.StopDeployment
     */
    java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest stopDeploymentRequest);

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest
     *        Represents the input of a stop deployment operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.StopDeployment
     */
    java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest stopDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler);

    /**
     * <p>
     * Changes the name of an application.
     * </p>
     * 
     * @param updateApplicationRequest
     *        Represents the input of an update application operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonCodeDeployAsync.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Changes the name of an application.
     * </p>
     * 
     * @param updateApplicationRequest
     *        Represents the input of an update application operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * Simplified method form for invoking the UpdateApplication operation.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest)
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync();

    /**
     * Simplified method form for invoking the UpdateApplication operation with an AsyncHandler.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Changes information about a deployment group.
     * </p>
     * 
     * @param updateDeploymentGroupRequest
     *        Represents the input of an update deployment group operation.
     * @return A Java Future containing the result of the UpdateDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsync.UpdateDeploymentGroup
     */
    java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest updateDeploymentGroupRequest);

    /**
     * <p>
     * Changes information about a deployment group.
     * </p>
     * 
     * @param updateDeploymentGroupRequest
     *        Represents the input of an update deployment group operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.UpdateDeploymentGroup
     */
    java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest updateDeploymentGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler);

}
