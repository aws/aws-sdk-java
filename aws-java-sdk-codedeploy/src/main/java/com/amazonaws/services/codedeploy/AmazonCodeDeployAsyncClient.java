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

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing CodeDeploy asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeDeployAsyncClient extends AmazonCodeDeployClient implements AmazonCodeDeployAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy. A credentials provider chain will
     * be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CodeDeploy (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCodeDeployAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCodeDeployAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCodeDeployAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCodeDeployAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCodeDeployAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCodeDeployAsyncClientBuilder asyncBuilder() {
        return AmazonCodeDeployAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCodeDeployAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(AddTagsToOnPremisesInstancesRequest request) {

        return addTagsToOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(final AddTagsToOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToOnPremisesInstancesRequest, AddTagsToOnPremisesInstancesResult> asyncHandler) {
        final AddTagsToOnPremisesInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToOnPremisesInstancesResult>() {
            @Override
            public AddTagsToOnPremisesInstancesResult call() throws Exception {
                AddTagsToOnPremisesInstancesResult result = null;

                try {
                    result = executeAddTagsToOnPremisesInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(BatchGetApplicationRevisionsRequest request) {

        return batchGetApplicationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(final BatchGetApplicationRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetApplicationRevisionsRequest, BatchGetApplicationRevisionsResult> asyncHandler) {
        final BatchGetApplicationRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetApplicationRevisionsResult>() {
            @Override
            public BatchGetApplicationRevisionsResult call() throws Exception {
                BatchGetApplicationRevisionsResult result = null;

                try {
                    result = executeBatchGetApplicationRevisions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest request) {

        return batchGetApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(final BatchGetApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {
        final BatchGetApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetApplicationsResult>() {
            @Override
            public BatchGetApplicationsResult call() throws Exception {
                BatchGetApplicationsResult result = null;

                try {
                    result = executeBatchGetApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the BatchGetApplications operation.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync() {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetApplications operation with an AsyncHandler.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(BatchGetDeploymentGroupsRequest request) {

        return batchGetDeploymentGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(final BatchGetDeploymentGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentGroupsRequest, BatchGetDeploymentGroupsResult> asyncHandler) {
        final BatchGetDeploymentGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDeploymentGroupsResult>() {
            @Override
            public BatchGetDeploymentGroupsResult call() throws Exception {
                BatchGetDeploymentGroupsResult result = null;

                try {
                    result = executeBatchGetDeploymentGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(BatchGetDeploymentInstancesRequest request) {

        return batchGetDeploymentInstancesAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(final BatchGetDeploymentInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentInstancesRequest, BatchGetDeploymentInstancesResult> asyncHandler) {
        final BatchGetDeploymentInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDeploymentInstancesResult>() {
            @Override
            public BatchGetDeploymentInstancesResult call() throws Exception {
                BatchGetDeploymentInstancesResult result = null;

                try {
                    result = executeBatchGetDeploymentInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentTargetsResult> batchGetDeploymentTargetsAsync(BatchGetDeploymentTargetsRequest request) {

        return batchGetDeploymentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentTargetsResult> batchGetDeploymentTargetsAsync(final BatchGetDeploymentTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentTargetsRequest, BatchGetDeploymentTargetsResult> asyncHandler) {
        final BatchGetDeploymentTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDeploymentTargetsResult>() {
            @Override
            public BatchGetDeploymentTargetsResult call() throws Exception {
                BatchGetDeploymentTargetsResult result = null;

                try {
                    result = executeBatchGetDeploymentTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest request) {

        return batchGetDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(final BatchGetDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {
        final BatchGetDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDeploymentsResult>() {
            @Override
            public BatchGetDeploymentsResult call() throws Exception {
                BatchGetDeploymentsResult result = null;

                try {
                    result = executeBatchGetDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the BatchGetDeployments operation.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync() {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetDeployments operation with an AsyncHandler.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest request) {

        return batchGetOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(final BatchGetOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {
        final BatchGetOnPremisesInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetOnPremisesInstancesResult>() {
            @Override
            public BatchGetOnPremisesInstancesResult call() throws Exception {
                BatchGetOnPremisesInstancesResult result = null;

                try {
                    result = executeBatchGetOnPremisesInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync() {

        return batchGetOnPremisesInstancesAsync(new BatchGetOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {

        return batchGetOnPremisesInstancesAsync(new BatchGetOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ContinueDeploymentResult> continueDeploymentAsync(ContinueDeploymentRequest request) {

        return continueDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ContinueDeploymentResult> continueDeploymentAsync(final ContinueDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ContinueDeploymentRequest, ContinueDeploymentResult> asyncHandler) {
        final ContinueDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ContinueDeploymentResult>() {
            @Override
            public ContinueDeploymentResult call() throws Exception {
                ContinueDeploymentResult result = null;

                try {
                    result = executeContinueDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest request) {

        return createDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(final CreateDeploymentConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentConfigRequest, CreateDeploymentConfigResult> asyncHandler) {
        final CreateDeploymentConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentConfigResult>() {
            @Override
            public CreateDeploymentConfigResult call() throws Exception {
                CreateDeploymentConfigResult result = null;

                try {
                    result = executeCreateDeploymentConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest request) {

        return createDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(final CreateDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentGroupRequest, CreateDeploymentGroupResult> asyncHandler) {
        final CreateDeploymentGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentGroupResult>() {
            @Override
            public CreateDeploymentGroupResult call() throws Exception {
                CreateDeploymentGroupResult result = null;

                try {
                    result = executeCreateDeploymentGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest request) {

        return deleteDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(final DeleteDeploymentConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentConfigRequest, DeleteDeploymentConfigResult> asyncHandler) {
        final DeleteDeploymentConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentConfigResult>() {
            @Override
            public DeleteDeploymentConfigResult call() throws Exception {
                DeleteDeploymentConfigResult result = null;

                try {
                    result = executeDeleteDeploymentConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest request) {

        return deleteDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(final DeleteDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResult> asyncHandler) {
        final DeleteDeploymentGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentGroupResult>() {
            @Override
            public DeleteDeploymentGroupResult call() throws Exception {
                DeleteDeploymentGroupResult result = null;

                try {
                    result = executeDeleteDeploymentGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGitHubAccountTokenResult> deleteGitHubAccountTokenAsync(DeleteGitHubAccountTokenRequest request) {

        return deleteGitHubAccountTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGitHubAccountTokenResult> deleteGitHubAccountTokenAsync(final DeleteGitHubAccountTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGitHubAccountTokenRequest, DeleteGitHubAccountTokenResult> asyncHandler) {
        final DeleteGitHubAccountTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGitHubAccountTokenResult>() {
            @Override
            public DeleteGitHubAccountTokenResult call() throws Exception {
                DeleteGitHubAccountTokenResult result = null;

                try {
                    result = executeDeleteGitHubAccountToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(DeregisterOnPremisesInstanceRequest request) {

        return deregisterOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(final DeregisterOnPremisesInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterOnPremisesInstanceRequest, DeregisterOnPremisesInstanceResult> asyncHandler) {
        final DeregisterOnPremisesInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterOnPremisesInstanceResult>() {
            @Override
            public DeregisterOnPremisesInstanceResult call() throws Exception {
                DeregisterOnPremisesInstanceResult result = null;

                try {
                    result = executeDeregisterOnPremisesInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest request) {

        return getApplicationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(final GetApplicationRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRevisionRequest, GetApplicationRevisionResult> asyncHandler) {
        final GetApplicationRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationRevisionResult>() {
            @Override
            public GetApplicationRevisionResult call() throws Exception {
                GetApplicationRevisionResult result = null;

                try {
                    result = executeGetApplicationRevision(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {
        final GetDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result = null;

                try {
                    result = executeGetDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest request) {

        return getDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(final GetDeploymentConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentConfigRequest, GetDeploymentConfigResult> asyncHandler) {
        final GetDeploymentConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentConfigResult>() {
            @Override
            public GetDeploymentConfigResult call() throws Exception {
                GetDeploymentConfigResult result = null;

                try {
                    result = executeGetDeploymentConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest request) {

        return getDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(final GetDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentGroupRequest, GetDeploymentGroupResult> asyncHandler) {
        final GetDeploymentGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentGroupResult>() {
            @Override
            public GetDeploymentGroupResult call() throws Exception {
                GetDeploymentGroupResult result = null;

                try {
                    result = executeGetDeploymentGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest request) {

        return getDeploymentInstanceAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(final GetDeploymentInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler) {
        final GetDeploymentInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentInstanceResult>() {
            @Override
            public GetDeploymentInstanceResult call() throws Exception {
                GetDeploymentInstanceResult result = null;

                try {
                    result = executeGetDeploymentInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentTargetResult> getDeploymentTargetAsync(GetDeploymentTargetRequest request) {

        return getDeploymentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentTargetResult> getDeploymentTargetAsync(final GetDeploymentTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentTargetRequest, GetDeploymentTargetResult> asyncHandler) {
        final GetDeploymentTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentTargetResult>() {
            @Override
            public GetDeploymentTargetResult call() throws Exception {
                GetDeploymentTargetResult result = null;

                try {
                    result = executeGetDeploymentTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(GetOnPremisesInstanceRequest request) {

        return getOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(final GetOnPremisesInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOnPremisesInstanceRequest, GetOnPremisesInstanceResult> asyncHandler) {
        final GetOnPremisesInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOnPremisesInstanceResult>() {
            @Override
            public GetOnPremisesInstanceResult call() throws Exception {
                GetOnPremisesInstanceResult result = null;

                try {
                    result = executeGetOnPremisesInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest request) {

        return listApplicationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(final ListApplicationRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationRevisionsRequest, ListApplicationRevisionsResult> asyncHandler) {
        final ListApplicationRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationRevisionsResult>() {
            @Override
            public ListApplicationRevisionsResult call() throws Exception {
                ListApplicationRevisionsResult result = null;

                try {
                    result = executeListApplicationRevisions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListApplications operation.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync() {

        return listApplicationsAsync(new ListApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the ListApplications operation with an AsyncHandler.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        return listApplicationsAsync(new ListApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest request) {

        return listDeploymentConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(final ListDeploymentConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {
        final ListDeploymentConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentConfigsResult>() {
            @Override
            public ListDeploymentConfigsResult call() throws Exception {
                ListDeploymentConfigsResult result = null;

                try {
                    result = executeListDeploymentConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync() {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation with an AsyncHandler.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest request) {

        return listDeploymentGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(final ListDeploymentGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentGroupsRequest, ListDeploymentGroupsResult> asyncHandler) {
        final ListDeploymentGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentGroupsResult>() {
            @Override
            public ListDeploymentGroupsResult call() throws Exception {
                ListDeploymentGroupsResult result = null;

                try {
                    result = executeListDeploymentGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest request) {

        return listDeploymentInstancesAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(final ListDeploymentInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler) {
        final ListDeploymentInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentInstancesResult>() {
            @Override
            public ListDeploymentInstancesResult call() throws Exception {
                ListDeploymentInstancesResult result = null;

                try {
                    result = executeListDeploymentInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentTargetsResult> listDeploymentTargetsAsync(ListDeploymentTargetsRequest request) {

        return listDeploymentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentTargetsResult> listDeploymentTargetsAsync(final ListDeploymentTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentTargetsRequest, ListDeploymentTargetsResult> asyncHandler) {
        final ListDeploymentTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentTargetsResult>() {
            @Override
            public ListDeploymentTargetsResult call() throws Exception {
                ListDeploymentTargetsResult result = null;

                try {
                    result = executeListDeploymentTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {
        final ListDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
            @Override
            public ListDeploymentsResult call() throws Exception {
                ListDeploymentsResult result = null;

                try {
                    result = executeListDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListDeployments operation.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync() {

        return listDeploymentsAsync(new ListDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeployments operation with an AsyncHandler.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        return listDeploymentsAsync(new ListDeploymentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGitHubAccountTokenNamesResult> listGitHubAccountTokenNamesAsync(ListGitHubAccountTokenNamesRequest request) {

        return listGitHubAccountTokenNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGitHubAccountTokenNamesResult> listGitHubAccountTokenNamesAsync(final ListGitHubAccountTokenNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGitHubAccountTokenNamesRequest, ListGitHubAccountTokenNamesResult> asyncHandler) {
        final ListGitHubAccountTokenNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGitHubAccountTokenNamesResult>() {
            @Override
            public ListGitHubAccountTokenNamesResult call() throws Exception {
                ListGitHubAccountTokenNamesResult result = null;

                try {
                    result = executeListGitHubAccountTokenNames(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest request) {

        return listOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(final ListOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {
        final ListOnPremisesInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOnPremisesInstancesResult>() {
            @Override
            public ListOnPremisesInstancesResult call() throws Exception {
                ListOnPremisesInstancesResult result = null;

                try {
                    result = executeListOnPremisesInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync() {

        return listOnPremisesInstancesAsync(new ListOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {

        return listOnPremisesInstancesAsync(new ListOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleEventHookExecutionStatusResult> putLifecycleEventHookExecutionStatusAsync(
            PutLifecycleEventHookExecutionStatusRequest request) {

        return putLifecycleEventHookExecutionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleEventHookExecutionStatusResult> putLifecycleEventHookExecutionStatusAsync(
            final PutLifecycleEventHookExecutionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLifecycleEventHookExecutionStatusRequest, PutLifecycleEventHookExecutionStatusResult> asyncHandler) {
        final PutLifecycleEventHookExecutionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLifecycleEventHookExecutionStatusResult>() {
            @Override
            public PutLifecycleEventHookExecutionStatusResult call() throws Exception {
                PutLifecycleEventHookExecutionStatusResult result = null;

                try {
                    result = executePutLifecycleEventHookExecutionStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(RegisterApplicationRevisionRequest request) {

        return registerApplicationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(final RegisterApplicationRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterApplicationRevisionRequest, RegisterApplicationRevisionResult> asyncHandler) {
        final RegisterApplicationRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterApplicationRevisionResult>() {
            @Override
            public RegisterApplicationRevisionResult call() throws Exception {
                RegisterApplicationRevisionResult result = null;

                try {
                    result = executeRegisterApplicationRevision(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(RegisterOnPremisesInstanceRequest request) {

        return registerOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(final RegisterOnPremisesInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterOnPremisesInstanceRequest, RegisterOnPremisesInstanceResult> asyncHandler) {
        final RegisterOnPremisesInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterOnPremisesInstanceResult>() {
            @Override
            public RegisterOnPremisesInstanceResult call() throws Exception {
                RegisterOnPremisesInstanceResult result = null;

                try {
                    result = executeRegisterOnPremisesInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            RemoveTagsFromOnPremisesInstancesRequest request) {

        return removeTagsFromOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            final RemoveTagsFromOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromOnPremisesInstancesRequest, RemoveTagsFromOnPremisesInstancesResult> asyncHandler) {
        final RemoveTagsFromOnPremisesInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromOnPremisesInstancesResult>() {
            @Override
            public RemoveTagsFromOnPremisesInstancesResult call() throws Exception {
                RemoveTagsFromOnPremisesInstancesResult result = null;

                try {
                    result = executeRemoveTagsFromOnPremisesInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            SkipWaitTimeForInstanceTerminationRequest request) {

        return skipWaitTimeForInstanceTerminationAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<SkipWaitTimeForInstanceTerminationResult> skipWaitTimeForInstanceTerminationAsync(
            final SkipWaitTimeForInstanceTerminationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SkipWaitTimeForInstanceTerminationRequest, SkipWaitTimeForInstanceTerminationResult> asyncHandler) {
        final SkipWaitTimeForInstanceTerminationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SkipWaitTimeForInstanceTerminationResult>() {
            @Override
            public SkipWaitTimeForInstanceTerminationResult call() throws Exception {
                SkipWaitTimeForInstanceTerminationResult result = null;

                try {
                    result = executeSkipWaitTimeForInstanceTermination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest request) {

        return stopDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(final StopDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler) {
        final StopDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDeploymentResult>() {
            @Override
            public StopDeploymentResult call() throws Exception {
                StopDeploymentResult result = null;

                try {
                    result = executeStopDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the UpdateApplication operation.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync() {

        return updateApplicationAsync(new UpdateApplicationRequest());
    }

    /**
     * Simplified method form for invoking the UpdateApplication operation with an AsyncHandler.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        return updateApplicationAsync(new UpdateApplicationRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest request) {

        return updateDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(final UpdateDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler) {
        final UpdateDeploymentGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeploymentGroupResult>() {
            @Override
            public UpdateDeploymentGroupResult call() throws Exception {
                UpdateDeploymentGroupResult result = null;

                try {
                    result = executeUpdateDeploymentGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
