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
package com.amazonaws.services.kinesisanalytics;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Kinesis Analytics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisAnalyticsAsyncClient extends AmazonKinesisAnalyticsClient implements AmazonKinesisAnalyticsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Kinesis Analytics (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisAnalyticsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the provided AWS
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
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAnalyticsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAnalyticsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisAnalyticsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAnalyticsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonKinesisAnalyticsAsyncClientBuilder asyncBuilder() {
        return AmazonKinesisAnalyticsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis Analytics using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKinesisAnalyticsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddApplicationCloudWatchLoggingOptionResult> addApplicationCloudWatchLoggingOptionAsync(
            AddApplicationCloudWatchLoggingOptionRequest request) {

        return addApplicationCloudWatchLoggingOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationCloudWatchLoggingOptionResult> addApplicationCloudWatchLoggingOptionAsync(
            final AddApplicationCloudWatchLoggingOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationCloudWatchLoggingOptionRequest, AddApplicationCloudWatchLoggingOptionResult> asyncHandler) {
        final AddApplicationCloudWatchLoggingOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationCloudWatchLoggingOptionResult>() {
            @Override
            public AddApplicationCloudWatchLoggingOptionResult call() throws Exception {
                AddApplicationCloudWatchLoggingOptionResult result = null;

                try {
                    result = executeAddApplicationCloudWatchLoggingOption(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(AddApplicationInputRequest request) {

        return addApplicationInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(final AddApplicationInputRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationInputRequest, AddApplicationInputResult> asyncHandler) {
        final AddApplicationInputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationInputResult>() {
            @Override
            public AddApplicationInputResult call() throws Exception {
                AddApplicationInputResult result = null;

                try {
                    result = executeAddApplicationInput(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationInputProcessingConfigurationResult> addApplicationInputProcessingConfigurationAsync(
            AddApplicationInputProcessingConfigurationRequest request) {

        return addApplicationInputProcessingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationInputProcessingConfigurationResult> addApplicationInputProcessingConfigurationAsync(
            final AddApplicationInputProcessingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationInputProcessingConfigurationRequest, AddApplicationInputProcessingConfigurationResult> asyncHandler) {
        final AddApplicationInputProcessingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationInputProcessingConfigurationResult>() {
            @Override
            public AddApplicationInputProcessingConfigurationResult call() throws Exception {
                AddApplicationInputProcessingConfigurationResult result = null;

                try {
                    result = executeAddApplicationInputProcessingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(AddApplicationOutputRequest request) {

        return addApplicationOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(final AddApplicationOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationOutputRequest, AddApplicationOutputResult> asyncHandler) {
        final AddApplicationOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationOutputResult>() {
            @Override
            public AddApplicationOutputResult call() throws Exception {
                AddApplicationOutputResult result = null;

                try {
                    result = executeAddApplicationOutput(finalRequest);
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
    public java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            AddApplicationReferenceDataSourceRequest request) {

        return addApplicationReferenceDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            final AddApplicationReferenceDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddApplicationReferenceDataSourceRequest, AddApplicationReferenceDataSourceResult> asyncHandler) {
        final AddApplicationReferenceDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddApplicationReferenceDataSourceResult>() {
            @Override
            public AddApplicationReferenceDataSourceResult call() throws Exception {
                AddApplicationReferenceDataSourceResult result = null;

                try {
                    result = executeAddApplicationReferenceDataSource(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationCloudWatchLoggingOptionResult> deleteApplicationCloudWatchLoggingOptionAsync(
            DeleteApplicationCloudWatchLoggingOptionRequest request) {

        return deleteApplicationCloudWatchLoggingOptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationCloudWatchLoggingOptionResult> deleteApplicationCloudWatchLoggingOptionAsync(
            final DeleteApplicationCloudWatchLoggingOptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationCloudWatchLoggingOptionRequest, DeleteApplicationCloudWatchLoggingOptionResult> asyncHandler) {
        final DeleteApplicationCloudWatchLoggingOptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationCloudWatchLoggingOptionResult>() {
            @Override
            public DeleteApplicationCloudWatchLoggingOptionResult call() throws Exception {
                DeleteApplicationCloudWatchLoggingOptionResult result = null;

                try {
                    result = executeDeleteApplicationCloudWatchLoggingOption(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationInputProcessingConfigurationResult> deleteApplicationInputProcessingConfigurationAsync(
            DeleteApplicationInputProcessingConfigurationRequest request) {

        return deleteApplicationInputProcessingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationInputProcessingConfigurationResult> deleteApplicationInputProcessingConfigurationAsync(
            final DeleteApplicationInputProcessingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationInputProcessingConfigurationRequest, DeleteApplicationInputProcessingConfigurationResult> asyncHandler) {
        final DeleteApplicationInputProcessingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationInputProcessingConfigurationResult>() {
            @Override
            public DeleteApplicationInputProcessingConfigurationResult call() throws Exception {
                DeleteApplicationInputProcessingConfigurationResult result = null;

                try {
                    result = executeDeleteApplicationInputProcessingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(DeleteApplicationOutputRequest request) {

        return deleteApplicationOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(final DeleteApplicationOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationOutputRequest, DeleteApplicationOutputResult> asyncHandler) {
        final DeleteApplicationOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationOutputResult>() {
            @Override
            public DeleteApplicationOutputResult call() throws Exception {
                DeleteApplicationOutputResult result = null;

                try {
                    result = executeDeleteApplicationOutput(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            DeleteApplicationReferenceDataSourceRequest request) {

        return deleteApplicationReferenceDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            final DeleteApplicationReferenceDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationReferenceDataSourceRequest, DeleteApplicationReferenceDataSourceResult> asyncHandler) {
        final DeleteApplicationReferenceDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationReferenceDataSourceResult>() {
            @Override
            public DeleteApplicationReferenceDataSourceResult call() throws Exception {
                DeleteApplicationReferenceDataSourceResult result = null;

                try {
                    result = executeDeleteApplicationReferenceDataSource(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest request) {

        return describeApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(final DescribeApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler) {
        final DescribeApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicationResult>() {
            @Override
            public DescribeApplicationResult call() throws Exception {
                DescribeApplicationResult result = null;

                try {
                    result = executeDescribeApplication(finalRequest);
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
    public java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(DiscoverInputSchemaRequest request) {

        return discoverInputSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(final DiscoverInputSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DiscoverInputSchemaRequest, DiscoverInputSchemaResult> asyncHandler) {
        final DiscoverInputSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DiscoverInputSchemaResult>() {
            @Override
            public DiscoverInputSchemaResult call() throws Exception {
                DiscoverInputSchemaResult result = null;

                try {
                    result = executeDiscoverInputSchema(finalRequest);
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

    @Override
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest request) {

        return startApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(final StartApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler) {
        final StartApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartApplicationResult>() {
            @Override
            public StartApplicationResult call() throws Exception {
                StartApplicationResult result = null;

                try {
                    result = executeStartApplication(finalRequest);
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
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest request) {

        return stopApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(final StopApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler) {
        final StopApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopApplicationResult>() {
            @Override
            public StopApplicationResult call() throws Exception {
                StopApplicationResult result = null;

                try {
                    result = executeStopApplication(finalRequest);
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
