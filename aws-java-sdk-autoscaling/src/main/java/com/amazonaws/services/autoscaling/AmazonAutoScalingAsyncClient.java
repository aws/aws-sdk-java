/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.autoscaling;

import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing Auto Scaling asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Auto Scaling</fullname>
 * <p>
 * Auto Scaling is designed to automatically launch or terminate EC2 instances
 * based on user-defined policies, schedules, and health checks. Use this
 * service in conjunction with the Amazon CloudWatch and Elastic Load Balancing
 * services.
 * </p>
 */
public class AmazonAutoScalingAsyncClient extends AmazonAutoScalingClient
        implements AmazonAutoScalingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonAutoScalingAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Auto Scaling (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling using the specified AWS account credentials and executor service.
     * Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling using the specified AWS account credentials, executor service,
     * and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling using the specified AWS account credentials provider. Default
     * client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling using the provided AWS account credentials provider and client
     * configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Auto
     * Scaling using the specified AWS account credentials provider, executor
     * service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonAutoScalingAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<Void> attachInstancesAsync(
            AttachInstancesRequest request) {

        return attachInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachInstancesAsync(
            final AttachInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachInstancesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            attachInstances(request);
                            result = null;
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
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            AttachLoadBalancersRequest request) {

        return attachLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            final AttachLoadBalancersRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AttachLoadBalancersResult>() {
                    @Override
                    public AttachLoadBalancersResult call() throws Exception {
                        AttachLoadBalancersResult result;

                        try {
                            result = attachLoadBalancers(request);
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
     * Simplified method form for invoking the AttachLoadBalancers operation.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest)
     */
    @Override
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync() {

        return attachLoadBalancersAsync(new AttachLoadBalancersRequest());
    }

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation
     * with an AsyncHandler.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler) {

        return attachLoadBalancersAsync(new AttachLoadBalancersRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            CompleteLifecycleActionRequest request) {

        return completeLifecycleActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(
            final CompleteLifecycleActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CompleteLifecycleActionResult>() {
                    @Override
                    public CompleteLifecycleActionResult call()
                            throws Exception {
                        CompleteLifecycleActionResult result;

                        try {
                            result = completeLifecycleAction(request);
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
    public java.util.concurrent.Future<Void> createAutoScalingGroupAsync(
            CreateAutoScalingGroupRequest request) {

        return createAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createAutoScalingGroupAsync(
            final CreateAutoScalingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAutoScalingGroupRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createAutoScalingGroup(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest request) {

        return createLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createLaunchConfigurationAsync(
            final CreateLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createLaunchConfiguration(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> createOrUpdateTagsAsync(
            CreateOrUpdateTagsRequest request) {

        return createOrUpdateTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createOrUpdateTagsAsync(
            final CreateOrUpdateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOrUpdateTagsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createOrUpdateTags(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteAutoScalingGroupAsync(
            DeleteAutoScalingGroupRequest request) {

        return deleteAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAutoScalingGroupAsync(
            final DeleteAutoScalingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAutoScalingGroupRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteAutoScalingGroup(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest request) {

        return deleteLaunchConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLaunchConfigurationAsync(
            final DeleteLaunchConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteLaunchConfiguration(request);
                            result = null;
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
    public java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            DeleteLifecycleHookRequest request) {

        return deleteLifecycleHookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(
            final DeleteLifecycleHookRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteLifecycleHookResult>() {
                    @Override
                    public DeleteLifecycleHookResult call() throws Exception {
                        DeleteLifecycleHookResult result;

                        try {
                            result = deleteLifecycleHook(request);
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
    public java.util.concurrent.Future<Void> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest request) {

        return deleteNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteNotificationConfigurationAsync(
            final DeleteNotificationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotificationConfigurationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteNotificationConfiguration(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deletePolicy(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteScheduledActionAsync(
            DeleteScheduledActionRequest request) {

        return deleteScheduledActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteScheduledActionAsync(
            final DeleteScheduledActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteScheduledAction(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteTagsAsync(
            DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTagsAsync(
            final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteTags(request);
                            result = null;
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
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            final DescribeAccountLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAccountLimitsResult>() {
                    @Override
                    public DescribeAccountLimitsResult call() throws Exception {
                        DescribeAccountLimitsResult result;

                        try {
                            result = describeAccountLimits(request);
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
     * Simplified method form for invoking the DescribeAccountLimits operation.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync() {

        return describeAccountLimitsAsync(new DescribeAccountLimitsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation
     * with an AsyncHandler.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {

        return describeAccountLimitsAsync(new DescribeAccountLimitsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            DescribeAdjustmentTypesRequest request) {

        return describeAdjustmentTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            final DescribeAdjustmentTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAdjustmentTypesResult>() {
                    @Override
                    public DescribeAdjustmentTypesResult call()
                            throws Exception {
                        DescribeAdjustmentTypesResult result;

                        try {
                            result = describeAdjustmentTypes(request);
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
     * Simplified method form for invoking the DescribeAdjustmentTypes
     * operation.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync() {

        return describeAdjustmentTypesAsync(new DescribeAdjustmentTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation
     * with an AsyncHandler.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler) {

        return describeAdjustmentTypesAsync(
                new DescribeAdjustmentTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest request) {

        return describeAutoScalingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            final DescribeAutoScalingGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAutoScalingGroupsResult>() {
                    @Override
                    public DescribeAutoScalingGroupsResult call()
                            throws Exception {
                        DescribeAutoScalingGroupsResult result;

                        try {
                            result = describeAutoScalingGroups(request);
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
     * Simplified method form for invoking the DescribeAutoScalingGroups
     * operation.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync() {

        return describeAutoScalingGroupsAsync(new DescribeAutoScalingGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups
     * operation with an AsyncHandler.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler) {

        return describeAutoScalingGroupsAsync(
                new DescribeAutoScalingGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest request) {

        return describeAutoScalingInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            final DescribeAutoScalingInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAutoScalingInstancesResult>() {
                    @Override
                    public DescribeAutoScalingInstancesResult call()
                            throws Exception {
                        DescribeAutoScalingInstancesResult result;

                        try {
                            result = describeAutoScalingInstances(request);
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
     * Simplified method form for invoking the DescribeAutoScalingInstances
     * operation.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync() {

        return describeAutoScalingInstancesAsync(new DescribeAutoScalingInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances
     * operation with an AsyncHandler.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler) {

        return describeAutoScalingInstancesAsync(
                new DescribeAutoScalingInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest request) {

        return describeAutoScalingNotificationTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            final DescribeAutoScalingNotificationTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAutoScalingNotificationTypesResult>() {
                    @Override
                    public DescribeAutoScalingNotificationTypesResult call()
                            throws Exception {
                        DescribeAutoScalingNotificationTypesResult result;

                        try {
                            result = describeAutoScalingNotificationTypes(request);
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
     * Simplified method form for invoking the
     * DescribeAutoScalingNotificationTypes operation.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync() {

        return describeAutoScalingNotificationTypesAsync(new DescribeAutoScalingNotificationTypesRequest());
    }

    /**
     * Simplified method form for invoking the
     * DescribeAutoScalingNotificationTypes operation with an AsyncHandler.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler) {

        return describeAutoScalingNotificationTypesAsync(
                new DescribeAutoScalingNotificationTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest request) {

        return describeLaunchConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            final DescribeLaunchConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLaunchConfigurationsResult>() {
                    @Override
                    public DescribeLaunchConfigurationsResult call()
                            throws Exception {
                        DescribeLaunchConfigurationsResult result;

                        try {
                            result = describeLaunchConfigurations(request);
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
     * Simplified method form for invoking the DescribeLaunchConfigurations
     * operation.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync() {

        return describeLaunchConfigurationsAsync(new DescribeLaunchConfigurationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations
     * operation with an AsyncHandler.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler) {

        return describeLaunchConfigurationsAsync(
                new DescribeLaunchConfigurationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest request) {

        return describeLifecycleHookTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            final DescribeLifecycleHookTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLifecycleHookTypesResult>() {
                    @Override
                    public DescribeLifecycleHookTypesResult call()
                            throws Exception {
                        DescribeLifecycleHookTypesResult result;

                        try {
                            result = describeLifecycleHookTypes(request);
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
     * Simplified method form for invoking the DescribeLifecycleHookTypes
     * operation.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync() {

        return describeLifecycleHookTypesAsync(new DescribeLifecycleHookTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes
     * operation with an AsyncHandler.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler) {

        return describeLifecycleHookTypesAsync(
                new DescribeLifecycleHookTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            DescribeLifecycleHooksRequest request) {

        return describeLifecycleHooksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(
            final DescribeLifecycleHooksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLifecycleHooksResult>() {
                    @Override
                    public DescribeLifecycleHooksResult call() throws Exception {
                        DescribeLifecycleHooksResult result;

                        try {
                            result = describeLifecycleHooks(request);
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
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            DescribeLoadBalancersRequest request) {

        return describeLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(
            final DescribeLoadBalancersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLoadBalancersResult>() {
                    @Override
                    public DescribeLoadBalancersResult call() throws Exception {
                        DescribeLoadBalancersResult result;

                        try {
                            result = describeLoadBalancers(request);
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
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest request) {

        return describeMetricCollectionTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            final DescribeMetricCollectionTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMetricCollectionTypesResult>() {
                    @Override
                    public DescribeMetricCollectionTypesResult call()
                            throws Exception {
                        DescribeMetricCollectionTypesResult result;

                        try {
                            result = describeMetricCollectionTypes(request);
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
     * Simplified method form for invoking the DescribeMetricCollectionTypes
     * operation.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync() {

        return describeMetricCollectionTypesAsync(new DescribeMetricCollectionTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes
     * operation with an AsyncHandler.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler) {

        return describeMetricCollectionTypesAsync(
                new DescribeMetricCollectionTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest request) {

        return describeNotificationConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            final DescribeNotificationConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeNotificationConfigurationsResult>() {
                    @Override
                    public DescribeNotificationConfigurationsResult call()
                            throws Exception {
                        DescribeNotificationConfigurationsResult result;

                        try {
                            result = describeNotificationConfigurations(request);
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
     * Simplified method form for invoking the
     * DescribeNotificationConfigurations operation.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync() {

        return describeNotificationConfigurationsAsync(new DescribeNotificationConfigurationsRequest());
    }

    /**
     * Simplified method form for invoking the
     * DescribeNotificationConfigurations operation with an AsyncHandler.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler) {

        return describeNotificationConfigurationsAsync(
                new DescribeNotificationConfigurationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            DescribePoliciesRequest request) {

        return describePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            final DescribePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribePoliciesResult>() {
                    @Override
                    public DescribePoliciesResult call() throws Exception {
                        DescribePoliciesResult result;

                        try {
                            result = describePolicies(request);
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
     * Simplified method form for invoking the DescribePolicies operation.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync() {

        return describePoliciesAsync(new DescribePoliciesRequest());
    }

    /**
     * Simplified method form for invoking the DescribePolicies operation with
     * an AsyncHandler.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler) {

        return describePoliciesAsync(new DescribePoliciesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest request) {

        return describeScalingActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            final DescribeScalingActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeScalingActivitiesResult>() {
                    @Override
                    public DescribeScalingActivitiesResult call()
                            throws Exception {
                        DescribeScalingActivitiesResult result;

                        try {
                            result = describeScalingActivities(request);
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
     * Simplified method form for invoking the DescribeScalingActivities
     * operation.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync() {

        return describeScalingActivitiesAsync(new DescribeScalingActivitiesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeScalingActivities
     * operation with an AsyncHandler.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler) {

        return describeScalingActivitiesAsync(
                new DescribeScalingActivitiesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest request) {

        return describeScalingProcessTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            final DescribeScalingProcessTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeScalingProcessTypesResult>() {
                    @Override
                    public DescribeScalingProcessTypesResult call()
                            throws Exception {
                        DescribeScalingProcessTypesResult result;

                        try {
                            result = describeScalingProcessTypes(request);
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
     * Simplified method form for invoking the DescribeScalingProcessTypes
     * operation.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync() {

        return describeScalingProcessTypesAsync(new DescribeScalingProcessTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes
     * operation with an AsyncHandler.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler) {

        return describeScalingProcessTypesAsync(
                new DescribeScalingProcessTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            DescribeScheduledActionsRequest request) {

        return describeScheduledActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            final DescribeScheduledActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeScheduledActionsResult>() {
                    @Override
                    public DescribeScheduledActionsResult call()
                            throws Exception {
                        DescribeScheduledActionsResult result;

                        try {
                            result = describeScheduledActions(request);
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
     * Simplified method form for invoking the DescribeScheduledActions
     * operation.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync() {

        return describeScheduledActionsAsync(new DescribeScheduledActionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeScheduledActions
     * operation with an AsyncHandler.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler) {

        return describeScheduledActionsAsync(
                new DescribeScheduledActionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
                    @Override
                    public DescribeTagsResult call() throws Exception {
                        DescribeTagsResult result;

                        try {
                            result = describeTags(request);
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
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync() {

        return describeTagsAsync(new DescribeTagsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTags operation with an
     * AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return describeTagsAsync(new DescribeTagsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest request) {

        return describeTerminationPolicyTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            final DescribeTerminationPolicyTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeTerminationPolicyTypesResult>() {
                    @Override
                    public DescribeTerminationPolicyTypesResult call()
                            throws Exception {
                        DescribeTerminationPolicyTypesResult result;

                        try {
                            result = describeTerminationPolicyTypes(request);
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
     * Simplified method form for invoking the DescribeTerminationPolicyTypes
     * operation.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync() {

        return describeTerminationPolicyTypesAsync(new DescribeTerminationPolicyTypesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes
     * operation with an AsyncHandler.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler) {

        return describeTerminationPolicyTypesAsync(
                new DescribeTerminationPolicyTypesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(
            DetachInstancesRequest request) {

        return detachInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(
            final DetachInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DetachInstancesResult>() {
                    @Override
                    public DetachInstancesResult call() throws Exception {
                        DetachInstancesResult result;

                        try {
                            result = detachInstances(request);
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
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            DetachLoadBalancersRequest request) {

        return detachLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            final DetachLoadBalancersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DetachLoadBalancersResult>() {
                    @Override
                    public DetachLoadBalancersResult call() throws Exception {
                        DetachLoadBalancersResult result;

                        try {
                            result = detachLoadBalancers(request);
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
     * Simplified method form for invoking the DetachLoadBalancers operation.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest)
     */
    @Override
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync() {

        return detachLoadBalancersAsync(new DetachLoadBalancersRequest());
    }

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation
     * with an AsyncHandler.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler) {

        return detachLoadBalancersAsync(new DetachLoadBalancersRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> disableMetricsCollectionAsync(
            DisableMetricsCollectionRequest request) {

        return disableMetricsCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disableMetricsCollectionAsync(
            final DisableMetricsCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableMetricsCollectionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            disableMetricsCollection(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> enableMetricsCollectionAsync(
            EnableMetricsCollectionRequest request) {

        return enableMetricsCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> enableMetricsCollectionAsync(
            final EnableMetricsCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableMetricsCollectionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            enableMetricsCollection(request);
                            result = null;
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
    public java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(
            EnterStandbyRequest request) {

        return enterStandbyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(
            final EnterStandbyRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<EnterStandbyResult>() {
                    @Override
                    public EnterStandbyResult call() throws Exception {
                        EnterStandbyResult result;

                        try {
                            result = enterStandby(request);
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
    public java.util.concurrent.Future<Void> executePolicyAsync(
            ExecutePolicyRequest request) {

        return executePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> executePolicyAsync(
            final ExecutePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecutePolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            executePolicy(request);
                            result = null;
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
    public java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(
            ExitStandbyRequest request) {

        return exitStandbyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(
            final ExitStandbyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ExitStandbyResult>() {
                    @Override
                    public ExitStandbyResult call() throws Exception {
                        ExitStandbyResult result;

                        try {
                            result = exitStandby(request);
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
    public java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(
            PutLifecycleHookRequest request) {

        return putLifecycleHookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(
            final PutLifecycleHookRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutLifecycleHookResult>() {
                    @Override
                    public PutLifecycleHookResult call() throws Exception {
                        PutLifecycleHookResult result;

                        try {
                            result = putLifecycleHook(request);
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
    public java.util.concurrent.Future<Void> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest request) {

        return putNotificationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putNotificationConfigurationAsync(
            final PutNotificationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutNotificationConfigurationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putNotificationConfiguration(request);
                            result = null;
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
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(
            PutScalingPolicyRequest request) {

        return putScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(
            final PutScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutScalingPolicyResult>() {
                    @Override
                    public PutScalingPolicyResult call() throws Exception {
                        PutScalingPolicyResult result;

                        try {
                            result = putScalingPolicy(request);
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
    public java.util.concurrent.Future<Void> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest request) {

        return putScheduledUpdateGroupActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putScheduledUpdateGroupActionAsync(
            final PutScheduledUpdateGroupActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutScheduledUpdateGroupActionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putScheduledUpdateGroupAction(request);
                            result = null;
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
    public java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest request) {

        return recordLifecycleActionHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            final RecordLifecycleActionHeartbeatRequest request,
            final com.amazonaws.handlers.AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RecordLifecycleActionHeartbeatResult>() {
                    @Override
                    public RecordLifecycleActionHeartbeatResult call()
                            throws Exception {
                        RecordLifecycleActionHeartbeatResult result;

                        try {
                            result = recordLifecycleActionHeartbeat(request);
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
    public java.util.concurrent.Future<Void> resumeProcessesAsync(
            ResumeProcessesRequest request) {

        return resumeProcessesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> resumeProcessesAsync(
            final ResumeProcessesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeProcessesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            resumeProcesses(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> setDesiredCapacityAsync(
            SetDesiredCapacityRequest request) {

        return setDesiredCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setDesiredCapacityAsync(
            final SetDesiredCapacityRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDesiredCapacityRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setDesiredCapacity(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> setInstanceHealthAsync(
            SetInstanceHealthRequest request) {

        return setInstanceHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setInstanceHealthAsync(
            final SetInstanceHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetInstanceHealthRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setInstanceHealth(request);
                            result = null;
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
    public java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            SetInstanceProtectionRequest request) {

        return setInstanceProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(
            final SetInstanceProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetInstanceProtectionRequest, SetInstanceProtectionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<SetInstanceProtectionResult>() {
                    @Override
                    public SetInstanceProtectionResult call() throws Exception {
                        SetInstanceProtectionResult result;

                        try {
                            result = setInstanceProtection(request);
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
    public java.util.concurrent.Future<Void> suspendProcessesAsync(
            SuspendProcessesRequest request) {

        return suspendProcessesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> suspendProcessesAsync(
            final SuspendProcessesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SuspendProcessesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            suspendProcesses(request);
                            result = null;
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
    public java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest request) {

        return terminateInstanceInAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            final TerminateInstanceInAutoScalingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<TerminateInstanceInAutoScalingGroupResult>() {
                    @Override
                    public TerminateInstanceInAutoScalingGroupResult call()
                            throws Exception {
                        TerminateInstanceInAutoScalingGroupResult result;

                        try {
                            result = terminateInstanceInAutoScalingGroup(request);
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
    public java.util.concurrent.Future<Void> updateAutoScalingGroupAsync(
            UpdateAutoScalingGroupRequest request) {

        return updateAutoScalingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAutoScalingGroupAsync(
            final UpdateAutoScalingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAutoScalingGroupRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateAutoScalingGroup(request);
                            result = null;
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
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
