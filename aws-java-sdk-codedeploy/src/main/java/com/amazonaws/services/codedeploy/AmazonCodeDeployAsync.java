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
 * AWS CodeDeploy is a deployment service that automates application deployments to Amazon EC2 instances, on-premises
 * instances running in your own facility, serverless AWS Lambda functions, or applications in an Amazon ECS service.
 * </p>
 * <p>
 * You can deploy a nearly unlimited variety of application content, such as an updated Lambda function, updated
 * applications in an Amazon ECS service, code, web and configuration files, executables, packages, scripts, multimedia
 * files, and so on. AWS CodeDeploy can deploy application content stored in Amazon S3 buckets, GitHub repositories, or
 * Bitbucket repositories. You do not need to make changes to your existing code before you can use AWS CodeDeploy.
 * </p>
 * <p>
 * AWS CodeDeploy makes it easier for you to rapidly release new features, helps you avoid downtime during application
 * deployment, and handles the complexity of updating your applications, without many of the risks associated with
 * error-prone manual deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Components</b>
 * </p>
 * <p>
 * Use the information in this guide to help you work with the following AWS CodeDeploy components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application</b>: A name that uniquely identifies the application you want to deploy. AWS CodeDeploy uses this
 * name, which functions as a container, to ensure the correct combination of revision, deployment configuration, and
 * deployment group are referenced during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment group</b>: A set of individual instances, CodeDeploy Lambda deployment configuration settings, or an
 * Amazon ECS service and network details. A Lambda deployment group specifies how to route traffic to a new version of
 * a Lambda function. An Amazon ECS deployment group specifies the service created in Amazon ECS to deploy, a load
 * balancer, and a listener to reroute production traffic to an updated containerized application. An EC2/On-premises
 * deployment group contains individually tagged instances, Amazon EC2 instances in Amazon EC2 Auto Scaling groups, or
 * both. All deployment groups can specify optional trigger, alarm, and rollback settings.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment configuration</b>: A set of deployment rules and deployment success and failure conditions used by AWS
 * CodeDeploy during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment</b>: The process and the components used when updating a Lambda function, a containerized application
 * in an Amazon ECS service, or of installing content on one or more instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Application revisions</b>: For an AWS Lambda deployment, this is an AppSpec file that specifies the Lambda
 * function to be updated and one or more functions to validate deployment lifecycle events. For an Amazon ECS
 * deployment, this is an AppSpec file that specifies the Amazon ECS task definition, container, and port where
 * production traffic is rerouted. For an EC2/On-premises deployment, this is an archive file that contains source
 * content—source code, webpages, executable files, and deployment scripts—along with an AppSpec file. Revisions are
 * stored in Amazon S3 buckets or GitHub repositories. For Amazon S3, a revision is uniquely identified by its Amazon S3
 * object key and its ETag, version, or both. For GitHub, a revision is uniquely identified by its commit ID.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This guide also contains information to help you get details about the instances in your deployments, to make
 * on-premises instances available for AWS CodeDeploy deployments, to get details about a Lambda function deployment,
 * and to get details about Amazon ECS service deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Information Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy User Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/APIReference/">AWS CodeDeploy API Reference Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cli/latest/reference/deploy/index.html">AWS CLI Reference for AWS CodeDeploy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://forums.aws.amazon.com/forum.jspa?forumID=179">AWS CodeDeploy Developer Forum</a>
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
     *        Represents the input of a BatchGetApplicationRevisions operation.
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
     *        Represents the input of a BatchGetApplicationRevisions operation.
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
     *        Represents the input of a BatchGetApplications operation.
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
     *        Represents the input of a BatchGetApplications operation.
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
     *        Represents the input of a BatchGetDeploymentGroups operation.
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
     *        Represents the input of a BatchGetDeploymentGroups operation.
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
     * <note>
     * <p>
     * This method works, but is deprecated. Use <code>BatchGetDeploymentTargets</code> instead.
     * </p>
     * </note>
     * <p>
     * Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda
     * compute platforms. The newer <code>BatchGetDeploymentTargets</code> works with all compute platforms.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest
     *        Represents the input of a BatchGetDeploymentInstances operation.
     * @return A Java Future containing the result of the BatchGetDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetDeploymentInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(
            BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest);

    /**
     * <note>
     * <p>
     * This method works, but is deprecated. Use <code>BatchGetDeploymentTargets</code> instead.
     * </p>
     * </note>
     * <p>
     * Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda
     * compute platforms. The newer <code>BatchGetDeploymentTargets</code> works with all compute platforms.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest
     *        Represents the input of a BatchGetDeploymentInstances operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetDeploymentInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(
            BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentInstancesRequest, BatchGetDeploymentInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of targets associated with a deployment. This method works with all compute types and should be
     * used instead of the deprecated <code>BatchGetDeploymentInstances</code>.
     * </p>
     * <p>
     * The type of targets returned depends on the deployment's compute platform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Information about EC2 instance targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: Information about Lambda functions targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: Information about Amazon ECS service targets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchGetDeploymentTargetsRequest
     * @return A Java Future containing the result of the BatchGetDeploymentTargets operation returned by the service.
     * @sample AmazonCodeDeployAsync.BatchGetDeploymentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDeploymentTargetsResult> batchGetDeploymentTargetsAsync(
            BatchGetDeploymentTargetsRequest batchGetDeploymentTargetsRequest);

    /**
     * <p>
     * Returns an array of targets associated with a deployment. This method works with all compute types and should be
     * used instead of the deprecated <code>BatchGetDeploymentInstances</code>.
     * </p>
     * <p>
     * The type of targets returned depends on the deployment's compute platform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Information about EC2 instance targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: Information about Lambda functions targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: Information about Amazon ECS service targets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchGetDeploymentTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDeploymentTargets operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.BatchGetDeploymentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDeploymentTargetsResult> batchGetDeploymentTargetsAsync(
            BatchGetDeploymentTargetsRequest batchGetDeploymentTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentTargetsRequest, BatchGetDeploymentTargetsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more deployments.
     * </p>
     * 
     * @param batchGetDeploymentsRequest
     *        Represents the input of a BatchGetDeployments operation.
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
     *        Represents the input of a BatchGetDeployments operation.
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
     *        Represents the input of a BatchGetOnPremisesInstances operation.
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
     *        Represents the input of a BatchGetOnPremisesInstances operation.
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
     * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment
     * to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic
     * rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can
     * start as soon as all instances have a status of Ready.)
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
     * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment
     * to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic
     * rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can
     * start as soon as all instances have a status of Ready.)
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
     *        Represents the input of a CreateApplication operation.
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
     *        Represents the input of a CreateApplication operation.
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
     *        Represents the input of a CreateDeployment operation.
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
     *        Represents the input of a CreateDeployment operation.
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
     *        Represents the input of a CreateDeploymentConfig operation.
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
     *        Represents the input of a CreateDeploymentConfig operation.
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
     * Creates a deployment group to which application revisions are deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest
     *        Represents the input of a CreateDeploymentGroup operation.
     * @return A Java Future containing the result of the CreateDeploymentGroup operation returned by the service.
     * @sample AmazonCodeDeployAsync.CreateDeploymentGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest createDeploymentGroupRequest);

    /**
     * <p>
     * Creates a deployment group to which application revisions are deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest
     *        Represents the input of a CreateDeploymentGroup operation.
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
     *        Represents the input of a DeleteApplication operation.
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
     *        Represents the input of a DeleteApplication operation.
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
     *        Represents the input of a DeleteDeploymentConfig operation.
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
     *        Represents the input of a DeleteDeploymentConfig operation.
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
     *        Represents the input of a DeleteDeploymentGroup operation.
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
     *        Represents the input of a DeleteDeploymentGroup operation.
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
     * Deletes a GitHub account connection.
     * </p>
     * 
     * @param deleteGitHubAccountTokenRequest
     *        Represents the input of a DeleteGitHubAccount operation.
     * @return A Java Future containing the result of the DeleteGitHubAccountToken operation returned by the service.
     * @sample AmazonCodeDeployAsync.DeleteGitHubAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteGitHubAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGitHubAccountTokenResult> deleteGitHubAccountTokenAsync(DeleteGitHubAccountTokenRequest deleteGitHubAccountTokenRequest);

    /**
     * <p>
     * Deletes a GitHub account connection.
     * </p>
     * 
     * @param deleteGitHubAccountTokenRequest
     *        Represents the input of a DeleteGitHubAccount operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGitHubAccountToken operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.DeleteGitHubAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeleteGitHubAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGitHubAccountTokenResult> deleteGitHubAccountTokenAsync(DeleteGitHubAccountTokenRequest deleteGitHubAccountTokenRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGitHubAccountTokenRequest, DeleteGitHubAccountTokenResult> asyncHandler);

    /**
     * <p>
     * Deregisters an on-premises instance.
     * </p>
     * 
     * @param deregisterOnPremisesInstanceRequest
     *        Represents the input of a DeregisterOnPremisesInstance operation.
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
     *        Represents the input of a DeregisterOnPremisesInstance operation.
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
     *        Represents the input of a GetApplication operation.
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
     *        Represents the input of a GetApplication operation.
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
     *        Represents the input of a GetApplicationRevision operation.
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
     *        Represents the input of a GetApplicationRevision operation.
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
     * <note>
     * <p>
     * The <code>content</code> property of the <code>appSpecContent</code> object in the returned revision is always
     * null. Use <code>GetApplicationRevision</code> and the <code>sha256</code> property of the returned
     * <code>appSpecContent</code> object to get the content of the deployment’s AppSpec file.
     * </p>
     * </note>
     * 
     * @param getDeploymentRequest
     *        Represents the input of a GetDeployment operation.
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
     * <note>
     * <p>
     * The <code>content</code> property of the <code>appSpecContent</code> object in the returned revision is always
     * null. Use <code>GetApplicationRevision</code> and the <code>sha256</code> property of the returned
     * <code>appSpecContent</code> object to get the content of the deployment’s AppSpec file.
     * </p>
     * </note>
     * 
     * @param getDeploymentRequest
     *        Represents the input of a GetDeployment operation.
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
     *        Represents the input of a GetDeploymentConfig operation.
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
     *        Represents the input of a GetDeploymentConfig operation.
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
     *        Represents the input of a GetDeploymentGroup operation.
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
     *        Represents the input of a GetDeploymentGroup operation.
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
     *        Represents the input of a GetDeploymentInstance operation.
     * @return A Java Future containing the result of the GetDeploymentInstance operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetDeploymentInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest getDeploymentInstanceRequest);

    /**
     * <p>
     * Gets information about an instance as part of a deployment.
     * </p>
     * 
     * @param getDeploymentInstanceRequest
     *        Represents the input of a GetDeploymentInstance operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeploymentInstance operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetDeploymentInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest getDeploymentInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns information about a deployment target.
     * </p>
     * 
     * @param getDeploymentTargetRequest
     * @return A Java Future containing the result of the GetDeploymentTarget operation returned by the service.
     * @sample AmazonCodeDeployAsync.GetDeploymentTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentTargetResult> getDeploymentTargetAsync(GetDeploymentTargetRequest getDeploymentTargetRequest);

    /**
     * <p>
     * Returns information about a deployment target.
     * </p>
     * 
     * @param getDeploymentTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeploymentTarget operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.GetDeploymentTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentTargetResult> getDeploymentTargetAsync(GetDeploymentTargetRequest getDeploymentTargetRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentTargetRequest, GetDeploymentTargetResult> asyncHandler);

    /**
     * <p>
     * Gets information about an on-premises instance.
     * </p>
     * 
     * @param getOnPremisesInstanceRequest
     *        Represents the input of a GetOnPremisesInstance operation.
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
     *        Represents the input of a GetOnPremisesInstance operation.
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
     *        Represents the input of a ListApplicationRevisions operation.
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
     *        Represents the input of a ListApplicationRevisions operation.
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
     * Lists the applications registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     *        Represents the input of a ListApplications operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the applications registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     *        Represents the input of a ListApplications operation.
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
     * Lists the deployment configurations with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest
     *        Represents the input of a ListDeploymentConfigs operation.
     * @return A Java Future containing the result of the ListDeploymentConfigs operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeploymentConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest listDeploymentConfigsRequest);

    /**
     * <p>
     * Lists the deployment configurations with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest
     *        Represents the input of a ListDeploymentConfigs operation.
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
     * Lists the deployment groups for an application registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest
     *        Represents the input of a ListDeploymentGroups operation.
     * @return A Java Future containing the result of the ListDeploymentGroups operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeploymentGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest listDeploymentGroupsRequest);

    /**
     * <p>
     * Lists the deployment groups for an application registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest
     *        Represents the input of a ListDeploymentGroups operation.
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
     * <note>
     * <p>
     * The newer BatchGetDeploymentTargets should be used instead because it works with all compute types.
     * <code>ListDeploymentInstances</code> throws an exception if it is used with a compute platform other than
     * EC2/On-premises or AWS Lambda.
     * </p>
     * </note>
     * <p>
     * Lists the instance for a deployment associated with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest
     *        Represents the input of a ListDeploymentInstances operation.
     * @return A Java Future containing the result of the ListDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeploymentInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest listDeploymentInstancesRequest);

    /**
     * <note>
     * <p>
     * The newer BatchGetDeploymentTargets should be used instead because it works with all compute types.
     * <code>ListDeploymentInstances</code> throws an exception if it is used with a compute platform other than
     * EC2/On-premises or AWS Lambda.
     * </p>
     * </note>
     * <p>
     * Lists the instance for a deployment associated with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest
     *        Represents the input of a ListDeploymentInstances operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentInstances operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListDeploymentInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest listDeploymentInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of target IDs that are associated a deployment.
     * </p>
     * 
     * @param listDeploymentTargetsRequest
     * @return A Java Future containing the result of the ListDeploymentTargets operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeploymentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentTargetsResult> listDeploymentTargetsAsync(ListDeploymentTargetsRequest listDeploymentTargetsRequest);

    /**
     * <p>
     * Returns an array of target IDs that are associated a deployment.
     * </p>
     * 
     * @param listDeploymentTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentTargets operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListDeploymentTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentTargetsResult> listDeploymentTargetsAsync(ListDeploymentTargetsRequest listDeploymentTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentTargetsRequest, ListDeploymentTargetsResult> asyncHandler);

    /**
     * <p>
     * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentsRequest
     *        Represents the input of a ListDeployments operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentsRequest
     *        Represents the input of a ListDeployments operation.
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
     * Lists the names of stored connections to GitHub accounts.
     * </p>
     * 
     * @param listGitHubAccountTokenNamesRequest
     *        Represents the input of a ListGitHubAccountTokenNames operation.
     * @return A Java Future containing the result of the ListGitHubAccountTokenNames operation returned by the service.
     * @sample AmazonCodeDeployAsync.ListGitHubAccountTokenNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListGitHubAccountTokenNames"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGitHubAccountTokenNamesResult> listGitHubAccountTokenNamesAsync(
            ListGitHubAccountTokenNamesRequest listGitHubAccountTokenNamesRequest);

    /**
     * <p>
     * Lists the names of stored connections to GitHub accounts.
     * </p>
     * 
     * @param listGitHubAccountTokenNamesRequest
     *        Represents the input of a ListGitHubAccountTokenNames operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGitHubAccountTokenNames operation returned by the service.
     * @sample AmazonCodeDeployAsyncHandler.ListGitHubAccountTokenNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListGitHubAccountTokenNames"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGitHubAccountTokenNamesResult> listGitHubAccountTokenNamesAsync(
            ListGitHubAccountTokenNamesRequest listGitHubAccountTokenNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGitHubAccountTokenNamesRequest, ListGitHubAccountTokenNamesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of names for one or more on-premises instances.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only
     * registered or deregistered on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest
     *        Represents the input of a ListOnPremisesInstances operation.
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
     * Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only
     * registered or deregistered on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest
     *        Represents the input of a ListOnPremisesInstances operation.
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
     * Sets the result of a Lambda validation function. The function validates one or both lifecycle events (
     * <code>BeforeAllowTraffic</code> and <code>AfterAllowTraffic</code>) and returns <code>Succeeded</code> or
     * <code>Failed</code>.
     * </p>
     * 
     * @param putLifecycleEventHookExecutionStatusRequest
     * @return A Java Future containing the result of the PutLifecycleEventHookExecutionStatus operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsync.PutLifecycleEventHookExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/PutLifecycleEventHookExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecycleEventHookExecutionStatusResult> putLifecycleEventHookExecutionStatusAsync(
            PutLifecycleEventHookExecutionStatusRequest putLifecycleEventHookExecutionStatusRequest);

    /**
     * <p>
     * Sets the result of a Lambda validation function. The function validates one or both lifecycle events (
     * <code>BeforeAllowTraffic</code> and <code>AfterAllowTraffic</code>) and returns <code>Succeeded</code> or
     * <code>Failed</code>.
     * </p>
     * 
     * @param putLifecycleEventHookExecutionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLifecycleEventHookExecutionStatus operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsyncHandler.PutLifecycleEventHookExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/PutLifecycleEventHookExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecycleEventHookExecutionStatusResult> putLifecycleEventHookExecutionStatusAsync(
            PutLifecycleEventHookExecutionStatusRequest putLifecycleEventHookExecutionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleEventHookExecutionStatusRequest, PutLifecycleEventHookExecutionStatusResult> asyncHandler);

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest
     *        Represents the input of a RegisterApplicationRevision operation.
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
     *        Represents the input of a RegisterApplicationRevision operation.
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
     *        Represents the input of a RemoveTagsFromOnPremisesInstances operation.
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
     *        Represents the input of a RemoveTagsFromOnPremisesInstances operation.
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
     * the traffic routing is complete.
     * </p>
     * 
     * @param skipWaitTimeForInstanceTerminationRequest
     * @return A Java Future containing the result of the SkipWaitTimeForInstanceTermination operation returned by the
     *         service.
     * @sample AmazonCodeDeployAsync.SkipWaitTimeForInstanceTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/SkipWaitTimeForInstanceTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest);

    /**
     * <p>
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after
     * the traffic routing is complete.
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
    @Deprecated
    java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<SkipWaitTimeForInstanceTerminationRequest, SkipWaitTimeForInstanceTerminationResult> asyncHandler);

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest
     *        Represents the input of a StopDeployment operation.
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
     *        Represents the input of a StopDeployment operation.
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
     *        Represents the input of an UpdateApplication operation.
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
     *        Represents the input of an UpdateApplication operation.
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
     *        Represents the input of an UpdateDeploymentGroup operation.
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
     *        Represents the input of an UpdateDeploymentGroup operation.
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
