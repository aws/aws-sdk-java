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
package com.amazonaws.services.budgets;

import com.amazonaws.services.budgets.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing AWSBudgets asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * All public APIs for AWS Budgets
 */
@ThreadSafe
public class AWSBudgetsAsyncClient extends AWSBudgetsClient implements AWSBudgetsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets. A credentials provider chain will
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
     */
    public AWSBudgetsAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to AWSBudgets (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBudgetsAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBudgetsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBudgetsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBudgetsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSBudgetsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the provided AWS account
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
     */
    public AWSBudgetsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBudgetsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSBudgetsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSBudgets using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSBudgetsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest request) {

        return createBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(final CreateBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBudgetRequest, CreateBudgetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateBudgetResult>() {
            @Override
            public CreateBudgetResult call() throws Exception {
                CreateBudgetResult result;

                try {
                    result = createBudget(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(CreateNotificationRequest request) {

        return createNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationResult> createNotificationAsync(final CreateNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotificationRequest, CreateNotificationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateNotificationResult>() {
            @Override
            public CreateNotificationResult call() throws Exception {
                CreateNotificationResult result;

                try {
                    result = createNotification(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(CreateSubscriberRequest request) {

        return createSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriberResult> createSubscriberAsync(final CreateSubscriberRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriberRequest, CreateSubscriberResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriberResult>() {
            @Override
            public CreateSubscriberResult call() throws Exception {
                CreateSubscriberResult result;

                try {
                    result = createSubscriber(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest request) {

        return deleteBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(final DeleteBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteBudgetResult>() {
            @Override
            public DeleteBudgetResult call() throws Exception {
                DeleteBudgetResult result;

                try {
                    result = deleteBudget(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(DeleteNotificationRequest request) {

        return deleteNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationResult> deleteNotificationAsync(final DeleteNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotificationRequest, DeleteNotificationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotificationResult>() {
            @Override
            public DeleteNotificationResult call() throws Exception {
                DeleteNotificationResult result;

                try {
                    result = deleteNotification(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(DeleteSubscriberRequest request) {

        return deleteSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriberResult> deleteSubscriberAsync(final DeleteSubscriberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriberRequest, DeleteSubscriberResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriberResult>() {
            @Override
            public DeleteSubscriberResult call() throws Exception {
                DeleteSubscriberResult result;

                try {
                    result = deleteSubscriber(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(DescribeBudgetRequest request) {

        return describeBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetResult> describeBudgetAsync(final DescribeBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBudgetRequest, DescribeBudgetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeBudgetResult>() {
            @Override
            public DescribeBudgetResult call() throws Exception {
                DescribeBudgetResult result;

                try {
                    result = describeBudget(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(DescribeBudgetsRequest request) {

        return describeBudgetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBudgetsResult> describeBudgetsAsync(final DescribeBudgetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBudgetsRequest, DescribeBudgetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeBudgetsResult>() {
            @Override
            public DescribeBudgetsResult call() throws Exception {
                DescribeBudgetsResult result;

                try {
                    result = describeBudgets(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(DescribeNotificationsForBudgetRequest request) {

        return describeNotificationsForBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationsForBudgetResult> describeNotificationsForBudgetAsync(
            final DescribeNotificationsForBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotificationsForBudgetRequest, DescribeNotificationsForBudgetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotificationsForBudgetResult>() {
            @Override
            public DescribeNotificationsForBudgetResult call() throws Exception {
                DescribeNotificationsForBudgetResult result;

                try {
                    result = describeNotificationsForBudget(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            DescribeSubscribersForNotificationRequest request) {

        return describeSubscribersForNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscribersForNotificationResult> describeSubscribersForNotificationAsync(
            final DescribeSubscribersForNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubscribersForNotificationRequest, DescribeSubscribersForNotificationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubscribersForNotificationResult>() {
            @Override
            public DescribeSubscribersForNotificationResult call() throws Exception {
                DescribeSubscribersForNotificationResult result;

                try {
                    result = describeSubscribersForNotification(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest request) {

        return updateBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(final UpdateBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateBudgetResult>() {
            @Override
            public UpdateBudgetResult call() throws Exception {
                UpdateBudgetResult result;

                try {
                    result = updateBudget(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(UpdateNotificationRequest request) {

        return updateNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationResult> updateNotificationAsync(final UpdateNotificationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotificationRequest, UpdateNotificationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotificationResult>() {
            @Override
            public UpdateNotificationResult call() throws Exception {
                UpdateNotificationResult result;

                try {
                    result = updateNotification(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(UpdateSubscriberRequest request) {

        return updateSubscriberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriberResult> updateSubscriberAsync(final UpdateSubscriberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriberRequest, UpdateSubscriberResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriberResult>() {
            @Override
            public UpdateSubscriberResult call() throws Exception {
                UpdateSubscriberResult result;

                try {
                    result = updateSubscriber(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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
