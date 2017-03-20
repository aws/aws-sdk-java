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
package com.amazonaws.services.cloudformation;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS CloudFormation asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation allows you to create and manage AWS infrastructure deployments predictably and repeatedly. You can
 * use AWS CloudFormation to leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic Block Store,
 * Amazon Simple Notification Service, Elastic Load Balancing, and Auto Scaling to build highly-reliable, highly
 * scalable, cost-effective applications without creating or configuring the underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines
 * a collection of resources as a single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the resources for you.
 * </p>
 * <p>
 * For more information about AWS CloudFormation, see the <a href="http://aws.amazon.com/cloudformation/">AWS
 * CloudFormation Product Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. For additional technical information about a specific AWS
 * product, see its <a href="http://docs.aws.amazon.com/">technical documentation</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFormationAsyncClient extends AmazonCloudFormationClient implements AmazonCloudFormationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS CloudFormation (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFormationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the provided AWS
     * account credentials provider and client configuration options.
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
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFormationAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFormationAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFormationAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCloudFormationAsyncClientBuilder asyncBuilder() {
        return AmazonCloudFormationAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudFormation using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudFormationAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelUpdateStackResult> cancelUpdateStackAsync(CancelUpdateStackRequest request) {

        return cancelUpdateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelUpdateStackResult> cancelUpdateStackAsync(final CancelUpdateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelUpdateStackRequest, CancelUpdateStackResult> asyncHandler) {
        final CancelUpdateStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelUpdateStackResult>() {
            @Override
            public CancelUpdateStackResult call() throws Exception {
                CancelUpdateStackResult result = null;

                try {
                    result = executeCancelUpdateStack(finalRequest);
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
    public java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(ContinueUpdateRollbackRequest request) {

        return continueUpdateRollbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(final ContinueUpdateRollbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<ContinueUpdateRollbackRequest, ContinueUpdateRollbackResult> asyncHandler) {
        final ContinueUpdateRollbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ContinueUpdateRollbackResult>() {
            @Override
            public ContinueUpdateRollbackResult call() throws Exception {
                ContinueUpdateRollbackResult result = null;

                try {
                    result = executeContinueUpdateRollback(finalRequest);
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
    public java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(CreateChangeSetRequest request) {

        return createChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(final CreateChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChangeSetRequest, CreateChangeSetResult> asyncHandler) {
        final CreateChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChangeSetResult>() {
            @Override
            public CreateChangeSetResult call() throws Exception {
                CreateChangeSetResult result = null;

                try {
                    result = executeCreateChangeSet(finalRequest);
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
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(final CreateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {
        final CreateStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStackResult>() {
            @Override
            public CreateStackResult call() throws Exception {
                CreateStackResult result = null;

                try {
                    result = executeCreateStack(finalRequest);
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
    public java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(DeleteChangeSetRequest request) {

        return deleteChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(final DeleteChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChangeSetRequest, DeleteChangeSetResult> asyncHandler) {
        final DeleteChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChangeSetResult>() {
            @Override
            public DeleteChangeSetResult call() throws Exception {
                DeleteChangeSetResult result = null;

                try {
                    result = executeDeleteChangeSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(final DeleteStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler) {
        final DeleteStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStackResult>() {
            @Override
            public DeleteStackResult call() throws Exception {
                DeleteStackResult result = null;

                try {
                    result = executeDeleteStack(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(final DescribeAccountLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {
        final DescribeAccountLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountLimitsResult>() {
            @Override
            public DescribeAccountLimitsResult call() throws Exception {
                DescribeAccountLimitsResult result = null;

                try {
                    result = executeDescribeAccountLimits(finalRequest);
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
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest request) {

        return describeChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(final DescribeChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChangeSetRequest, DescribeChangeSetResult> asyncHandler) {
        final DescribeChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChangeSetResult>() {
            @Override
            public DescribeChangeSetResult call() throws Exception {
                DescribeChangeSetResult result = null;

                try {
                    result = executeDescribeChangeSet(finalRequest);
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
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest request) {

        return describeStackEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(final DescribeStackEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler) {
        final DescribeStackEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStackEventsResult>() {
            @Override
            public DescribeStackEventsResult call() throws Exception {
                DescribeStackEventsResult result = null;

                try {
                    result = executeDescribeStackEvents(finalRequest);
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
    public java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest request) {

        return describeStackResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(final DescribeStackResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackResourceRequest, DescribeStackResourceResult> asyncHandler) {
        final DescribeStackResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStackResourceResult>() {
            @Override
            public DescribeStackResourceResult call() throws Exception {
                DescribeStackResourceResult result = null;

                try {
                    result = executeDescribeStackResource(finalRequest);
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
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest request) {

        return describeStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(final DescribeStackResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler) {
        final DescribeStackResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStackResourcesResult>() {
            @Override
            public DescribeStackResourcesResult call() throws Exception {
                DescribeStackResourcesResult result = null;

                try {
                    result = executeDescribeStackResources(finalRequest);
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
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(final DescribeStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {
        final DescribeStacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStacksResult>() {
            @Override
            public DescribeStacksResult call() throws Exception {
                DescribeStacksResult result = null;

                try {
                    result = executeDescribeStacks(finalRequest);
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
     * Simplified method form for invoking the DescribeStacks operation.
     *
     * @see #describeStacksAsync(DescribeStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync() {

        return describeStacksAsync(new DescribeStacksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeStacks operation with an AsyncHandler.
     *
     * @see #describeStacksAsync(DescribeStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        return describeStacksAsync(new DescribeStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest request) {

        return estimateTemplateCostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(final EstimateTemplateCostRequest request,
            final com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler) {
        final EstimateTemplateCostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EstimateTemplateCostResult>() {
            @Override
            public EstimateTemplateCostResult call() throws Exception {
                EstimateTemplateCostResult result = null;

                try {
                    result = executeEstimateTemplateCost(finalRequest);
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
     * Simplified method form for invoking the EstimateTemplateCost operation.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest)
     */
    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync() {

        return estimateTemplateCostAsync(new EstimateTemplateCostRequest());
    }

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation with an AsyncHandler.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler) {

        return estimateTemplateCostAsync(new EstimateTemplateCostRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(ExecuteChangeSetRequest request) {

        return executeChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(final ExecuteChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteChangeSetRequest, ExecuteChangeSetResult> asyncHandler) {
        final ExecuteChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteChangeSetResult>() {
            @Override
            public ExecuteChangeSetResult call() throws Exception {
                ExecuteChangeSetResult result = null;

                try {
                    result = executeExecuteChangeSet(finalRequest);
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
    public java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(GetStackPolicyRequest request) {

        return getStackPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(final GetStackPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStackPolicyRequest, GetStackPolicyResult> asyncHandler) {
        final GetStackPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStackPolicyResult>() {
            @Override
            public GetStackPolicyResult call() throws Exception {
                GetStackPolicyResult result = null;

                try {
                    result = executeGetStackPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request) {

        return getTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(final GetTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler) {
        final GetTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateResult>() {
            @Override
            public GetTemplateResult call() throws Exception {
                GetTemplateResult result = null;

                try {
                    result = executeGetTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(GetTemplateSummaryRequest request) {

        return getTemplateSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(final GetTemplateSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler) {
        final GetTemplateSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateSummaryResult>() {
            @Override
            public GetTemplateSummaryResult call() throws Exception {
                GetTemplateSummaryResult result = null;

                try {
                    result = executeGetTemplateSummary(finalRequest);
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
     * Simplified method form for invoking the GetTemplateSummary operation.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest)
     */
    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync() {

        return getTemplateSummaryAsync(new GetTemplateSummaryRequest());
    }

    /**
     * Simplified method form for invoking the GetTemplateSummary operation with an AsyncHandler.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler) {

        return getTemplateSummaryAsync(new GetTemplateSummaryRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest request) {

        return listChangeSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(final ListChangeSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChangeSetsRequest, ListChangeSetsResult> asyncHandler) {
        final ListChangeSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChangeSetsResult>() {
            @Override
            public ListChangeSetsResult call() throws Exception {
                ListChangeSetsResult result = null;

                try {
                    result = executeListChangeSets(finalRequest);
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
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest request) {

        return listExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExportsResult> listExportsAsync(final ListExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler) {
        final ListExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExportsResult>() {
            @Override
            public ListExportsResult call() throws Exception {
                ListExportsResult result = null;

                try {
                    result = executeListExports(finalRequest);
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
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest request) {

        return listImportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(final ListImportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImportsRequest, ListImportsResult> asyncHandler) {
        final ListImportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImportsResult>() {
            @Override
            public ListImportsResult call() throws Exception {
                ListImportsResult result = null;

                try {
                    result = executeListImports(finalRequest);
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
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest request) {

        return listStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(final ListStackResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler) {
        final ListStackResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStackResourcesResult>() {
            @Override
            public ListStackResourcesResult call() throws Exception {
                ListStackResourcesResult result = null;

                try {
                    result = executeListStackResources(finalRequest);
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
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(ListStacksRequest request) {

        return listStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(final ListStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler) {
        final ListStacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStacksResult>() {
            @Override
            public ListStacksResult call() throws Exception {
                ListStacksResult result = null;

                try {
                    result = executeListStacks(finalRequest);
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
     * Simplified method form for invoking the ListStacks operation.
     *
     * @see #listStacksAsync(ListStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync() {

        return listStacksAsync(new ListStacksRequest());
    }

    /**
     * Simplified method form for invoking the ListStacks operation with an AsyncHandler.
     *
     * @see #listStacksAsync(ListStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler) {

        return listStacksAsync(new ListStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetStackPolicyResult> setStackPolicyAsync(SetStackPolicyRequest request) {

        return setStackPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetStackPolicyResult> setStackPolicyAsync(final SetStackPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetStackPolicyRequest, SetStackPolicyResult> asyncHandler) {
        final SetStackPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetStackPolicyResult>() {
            @Override
            public SetStackPolicyResult call() throws Exception {
                SetStackPolicyResult result = null;

                try {
                    result = executeSetStackPolicy(finalRequest);
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
    public java.util.concurrent.Future<SignalResourceResult> signalResourceAsync(SignalResourceRequest request) {

        return signalResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SignalResourceResult> signalResourceAsync(final SignalResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SignalResourceRequest, SignalResourceResult> asyncHandler) {
        final SignalResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SignalResourceResult>() {
            @Override
            public SignalResourceResult call() throws Exception {
                SignalResourceResult result = null;

                try {
                    result = executeSignalResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(final UpdateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler) {
        final UpdateStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStackResult>() {
            @Override
            public UpdateStackResult call() throws Exception {
                UpdateStackResult result = null;

                try {
                    result = executeUpdateStack(finalRequest);
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
    public java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest request) {

        return validateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(final ValidateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateTemplateRequest, ValidateTemplateResult> asyncHandler) {
        final ValidateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateTemplateResult>() {
            @Override
            public ValidateTemplateResult call() throws Exception {
                ValidateTemplateResult result = null;

                try {
                    result = executeValidateTemplate(finalRequest);
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
