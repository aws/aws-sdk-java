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
package com.amazonaws.services.cloudwatch;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing CloudWatch asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the applications you run on AWS in real-time.
 * You can use CloudWatch to collect and track metrics, which are the variables you want to measure for your resources
 * and applications.
 * </p>
 * <p>
 * CloudWatch alarms send notifications or automatically make changes to the resources you are monitoring based on rules
 * that you define. For example, you can monitor the CPU usage and disk reads and writes of your Amazon Elastic Compute
 * Cloud (Amazon EC2) instances and then use this data to determine whether you should launch additional instances to
 * handle increased load. You can also use this data to stop under-used instances to save money.
 * </p>
 * <p>
 * In addition to monitoring the built-in metrics that come with AWS, you can monitor your own custom metrics. With
 * CloudWatch, you gain system-wide visibility into resource utilization, application performance, and operational
 * health.
 * </p>
 */
@ThreadSafe
public class AmazonCloudWatchAsyncClient extends AmazonCloudWatchClient implements AmazonCloudWatchAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch. A credentials provider chain will
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
    public AmazonCloudWatchAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to CloudWatch (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCloudWatchAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCloudWatchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCloudWatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the provided AWS account
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
    public AmazonCloudWatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCloudWatchAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudWatch using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudWatchAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DeleteAlarmsResult> deleteAlarmsAsync(DeleteAlarmsRequest request) {

        return deleteAlarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlarmsResult> deleteAlarmsAsync(final DeleteAlarmsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAlarmsRequest, DeleteAlarmsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAlarmsResult>() {
            @Override
            public DeleteAlarmsResult call() throws Exception {
                DeleteAlarmsResult result;

                try {
                    result = deleteAlarms(request);
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
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest request) {

        return describeAlarmHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(final DescribeAlarmHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlarmHistoryResult>() {
            @Override
            public DescribeAlarmHistoryResult call() throws Exception {
                DescribeAlarmHistoryResult result;

                try {
                    result = describeAlarmHistory(request);
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
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync() {

        return describeAlarmHistoryAsync(new DescribeAlarmHistoryRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation with an AsyncHandler.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {

        return describeAlarmHistoryAsync(new DescribeAlarmHistoryRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest request) {

        return describeAlarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(final DescribeAlarmsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlarmsResult>() {
            @Override
            public DescribeAlarmsResult call() throws Exception {
                DescribeAlarmsResult result;

                try {
                    result = describeAlarms(request);
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
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync() {

        return describeAlarmsAsync(new DescribeAlarmsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAlarms operation with an AsyncHandler.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {

        return describeAlarmsAsync(new DescribeAlarmsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest request) {

        return describeAlarmsForMetricAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(final DescribeAlarmsForMetricRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlarmsForMetricResult>() {
            @Override
            public DescribeAlarmsForMetricResult call() throws Exception {
                DescribeAlarmsForMetricResult result;

                try {
                    result = describeAlarmsForMetric(request);
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
    public java.util.concurrent.Future<DisableAlarmActionsResult> disableAlarmActionsAsync(DisableAlarmActionsRequest request) {

        return disableAlarmActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableAlarmActionsResult> disableAlarmActionsAsync(final DisableAlarmActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableAlarmActionsRequest, DisableAlarmActionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableAlarmActionsResult>() {
            @Override
            public DisableAlarmActionsResult call() throws Exception {
                DisableAlarmActionsResult result;

                try {
                    result = disableAlarmActions(request);
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
    public java.util.concurrent.Future<EnableAlarmActionsResult> enableAlarmActionsAsync(EnableAlarmActionsRequest request) {

        return enableAlarmActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableAlarmActionsResult> enableAlarmActionsAsync(final EnableAlarmActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableAlarmActionsRequest, EnableAlarmActionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableAlarmActionsResult>() {
            @Override
            public EnableAlarmActionsResult call() throws Exception {
                EnableAlarmActionsResult result;

                try {
                    result = enableAlarmActions(request);
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
    public java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest request) {

        return getMetricStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(final GetMetricStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetricStatisticsRequest, GetMetricStatisticsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetMetricStatisticsResult>() {
            @Override
            public GetMetricStatisticsResult call() throws Exception {
                GetMetricStatisticsResult result;

                try {
                    result = getMetricStatistics(request);
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
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest request) {

        return listMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(final ListMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListMetricsResult>() {
            @Override
            public ListMetricsResult call() throws Exception {
                ListMetricsResult result;

                try {
                    result = listMetrics(request);
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
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetricsAsync(ListMetricsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync() {

        return listMetricsAsync(new ListMetricsRequest());
    }

    /**
     * Simplified method form for invoking the ListMetrics operation with an AsyncHandler.
     *
     * @see #listMetricsAsync(ListMetricsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {

        return listMetricsAsync(new ListMetricsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutMetricAlarmResult> putMetricAlarmAsync(PutMetricAlarmRequest request) {

        return putMetricAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetricAlarmResult> putMetricAlarmAsync(final PutMetricAlarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMetricAlarmRequest, PutMetricAlarmResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutMetricAlarmResult>() {
            @Override
            public PutMetricAlarmResult call() throws Exception {
                PutMetricAlarmResult result;

                try {
                    result = putMetricAlarm(request);
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
    public java.util.concurrent.Future<PutMetricDataResult> putMetricDataAsync(PutMetricDataRequest request) {

        return putMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetricDataResult> putMetricDataAsync(final PutMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMetricDataRequest, PutMetricDataResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutMetricDataResult>() {
            @Override
            public PutMetricDataResult call() throws Exception {
                PutMetricDataResult result;

                try {
                    result = putMetricData(request);
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
    public java.util.concurrent.Future<SetAlarmStateResult> setAlarmStateAsync(SetAlarmStateRequest request) {

        return setAlarmStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetAlarmStateResult> setAlarmStateAsync(final SetAlarmStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetAlarmStateRequest, SetAlarmStateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetAlarmStateResult>() {
            @Override
            public SetAlarmStateResult call() throws Exception {
                SetAlarmStateResult result;

                try {
                    result = setAlarmState(request);
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
