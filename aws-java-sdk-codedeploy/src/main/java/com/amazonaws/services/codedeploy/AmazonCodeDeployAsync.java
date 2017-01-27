/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AddTagsToOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AddTagsToOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplicationRevisions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplicationRevisions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplications"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplications"
     *      target="_top">AWS API Documentation</a>
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
     * Gets information about one or more deployment groups.
     * </p>
     * 
     * @param batchGetDeploymentGroupsRequest
     *        Represents the input of a batch get deployment groups operation.
     * @return A Java Future containing the result of the BatchGetDeploymentGroups operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetDeploymentGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest);

    /**
     * <p>
     * Gets information about one or more deployment groups.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentGroups"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeployments" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeployments" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * Starts the process of rerouting traffic from instances in the original environment to instances in thereplacement
     * environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by
     * registering instances in the replacement environment with the load balancer, can start as soon as all instances
     * have a status of Ready.)
     * </p>
     * 
     * @param continueDeploymentRequest
     * @return A Java Future containing the result of the ContinueDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsync.ContinueDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ContinueDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ContinueDeploymentResult> continueDeploymentAsync(ContinueDeploymentRequest continueDeploymentRequest);

    /**
     * <p>
     * Starts the process of rerouting traffic from instances in the original environment to instances in thereplacement
     * environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by
     * registering instances in the replacement environment with the load balancer, can start as soon as all instances
     * have a status of Ready.)
     * </p>
     * 
     * @param continueDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ContinueDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ContinueDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ContinueDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ContinueDeploymentResult> continueDeploymentAsync(ContinueDeploymentRequest continueDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<ContinueDeploymentRequest, ContinueDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     *        Represents the input of a create application operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonCodeDeployAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateApplication" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateApplication" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentConfig"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentConfig"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteDeploymentConfig"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteDeploymentConfig"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeregisterOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeregisterOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetApplication" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetApplication" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetApplicationRevision"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetApplicationRevision"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeployment" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeployment" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentConfig" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentConfig" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentGroup" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentGroup" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentInstance"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentInstance"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplicationRevisions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplicationRevisions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplications" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplications" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentConfigs"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentConfigs"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentGroups"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentGroups"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeployments" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeployments" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterApplicationRevision"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterApplicationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(
            RegisterApplicationRevisionRequest registerApplicationRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterApplicationRevisionRequest, RegisterApplicationRevisionResult> asyncHandler);

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * <note>
     * <p>
     * Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both.
     * </p>
     * </note>
     * 
     * @param registerOnPremisesInstanceRequest
     *        Represents the input of the register on-premises instance operation.
     * @return A Java Future containing the result of the RegisterOnPremisesInstance operation returned by the service.
     * @sample AmazonCodeDeployAsync.RegisterOnPremisesInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(
            RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest);

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * <note>
     * <p>
     * Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both.
     * </p>
     * </note>
     * 
     * @param registerOnPremisesInstanceRequest
     *        Represents the input of the register on-premises instance operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterOnPremisesInstance operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.RegisterOnPremisesInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterOnPremisesInstance"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RemoveTagsFromOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RemoveTagsFromOnPremisesInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromOnPremisesInstancesRequest, RemoveTagsFromOnPremisesInstancesResult> asyncHandler);

    /**
     * <p>
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after
     * the traffic routing is completed.
     * </p>
     * 
     * @param skipWaitTimeForInstanceTerminationRequest
     * @return A Java Future containing the result of the SkipWaitTimeForInstanceTermination operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsync.SkipWaitTimeForInstanceTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/SkipWaitTimeForInstanceTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest);

    /**
     * <p>
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after
     * the traffic routing is completed.
     * </p>
     * 
     * @param skipWaitTimeForInstanceTerminationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SkipWaitTimeForInstanceTermination operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsyncHandler.SkipWaitTimeForInstanceTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/SkipWaitTimeForInstanceTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<SkipWaitTimeForInstanceTerminationRequest, SkipWaitTimeForInstanceTerminationResult> asyncHandler);

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest
     *        Represents the input of a stop deployment operation.
     * @return A Java Future containing the result of the StopDeployment operation returned by the service.
     * @sample AmazonCodeDeployAsync.StopDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/StopDeployment" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/StopDeployment" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest updateDeploymentGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler);

}
