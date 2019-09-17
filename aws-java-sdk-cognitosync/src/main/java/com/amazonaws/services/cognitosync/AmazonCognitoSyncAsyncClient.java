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
package com.amazonaws.services.cognitosync;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Cognito Sync asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Cognito Sync</fullname>
 * <p>
 * Amazon Cognito Sync provides an AWS service and client library that enable cross-device syncing of
 * application-related user data. High-level client libraries are available for both iOS and Android. You can use these
 * libraries to persist data locally so that it's available even if the device is offline. Developer credentials don't
 * need to be stored on the mobile device to access the service. You can use Amazon Cognito to obtain a normalized user
 * ID and credentials. User data is persisted in a dataset that can store up to 1 MB of key-value pairs, and you can
 * have up to 20 datasets per user identity.
 * </p>
 * <p>
 * With Amazon Cognito Sync, the data stored for each identity is accessible only to credentials assigned to that
 * identity. In order to use the Cognito Sync service, you need to make API calls using credentials retrieved with <a
 * href="http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/Welcome.html">Amazon Cognito Identity
 * service</a>.
 * </p>
 * <p>
 * If you want to use Cognito Sync in an Android or iOS application, you will probably want to make API calls via the
 * AWS Mobile SDK. To learn more, see the <a
 * href="http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-sync.html">Developer Guide for
 * Android</a> and the <a href="http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-sync.html">Developer
 * Guide for iOS</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCognitoSyncAsyncClient extends AmazonCognitoSyncClient implements AmazonCognitoSyncAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync. A credentials provider
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
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync. A credentials provider
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
     *        The client configuration options controlling how this client connects to Amazon Cognito Sync (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCognitoSyncAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the provided AWS
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
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoSyncAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoSyncAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCognitoSyncAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCognitoSyncAsyncClientBuilder asyncBuilder() {
        return AmazonCognitoSyncAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Sync using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCognitoSyncAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BulkPublishResult> bulkPublishAsync(BulkPublishRequest request) {

        return bulkPublishAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BulkPublishResult> bulkPublishAsync(final BulkPublishRequest request,
            final com.amazonaws.handlers.AsyncHandler<BulkPublishRequest, BulkPublishResult> asyncHandler) {
        final BulkPublishRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BulkPublishResult>() {
            @Override
            public BulkPublishResult call() throws Exception {
                BulkPublishResult result = null;

                try {
                    result = executeBulkPublish(finalRequest);
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
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest request) {

        return deleteDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(final DeleteDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler) {
        final DeleteDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatasetResult>() {
            @Override
            public DeleteDatasetResult call() throws Exception {
                DeleteDatasetResult result = null;

                try {
                    result = executeDeleteDataset(finalRequest);
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
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest request) {

        return describeDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(final DescribeDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler) {
        final DescribeDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDatasetResult>() {
            @Override
            public DescribeDatasetResult call() throws Exception {
                DescribeDatasetResult result = null;

                try {
                    result = executeDescribeDataset(finalRequest);
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
    public java.util.concurrent.Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(DescribeIdentityPoolUsageRequest request) {

        return describeIdentityPoolUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(final DescribeIdentityPoolUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityPoolUsageRequest, DescribeIdentityPoolUsageResult> asyncHandler) {
        final DescribeIdentityPoolUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityPoolUsageResult>() {
            @Override
            public DescribeIdentityPoolUsageResult call() throws Exception {
                DescribeIdentityPoolUsageResult result = null;

                try {
                    result = executeDescribeIdentityPoolUsage(finalRequest);
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
    public java.util.concurrent.Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest request) {

        return describeIdentityUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(final DescribeIdentityUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityUsageRequest, DescribeIdentityUsageResult> asyncHandler) {
        final DescribeIdentityUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityUsageResult>() {
            @Override
            public DescribeIdentityUsageResult call() throws Exception {
                DescribeIdentityUsageResult result = null;

                try {
                    result = executeDescribeIdentityUsage(finalRequest);
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
    public java.util.concurrent.Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(GetBulkPublishDetailsRequest request) {

        return getBulkPublishDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBulkPublishDetailsResult> getBulkPublishDetailsAsync(final GetBulkPublishDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBulkPublishDetailsRequest, GetBulkPublishDetailsResult> asyncHandler) {
        final GetBulkPublishDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBulkPublishDetailsResult>() {
            @Override
            public GetBulkPublishDetailsResult call() throws Exception {
                GetBulkPublishDetailsResult result = null;

                try {
                    result = executeGetBulkPublishDetails(finalRequest);
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
    public java.util.concurrent.Future<GetCognitoEventsResult> getCognitoEventsAsync(GetCognitoEventsRequest request) {

        return getCognitoEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCognitoEventsResult> getCognitoEventsAsync(final GetCognitoEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCognitoEventsRequest, GetCognitoEventsResult> asyncHandler) {
        final GetCognitoEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCognitoEventsResult>() {
            @Override
            public GetCognitoEventsResult call() throws Exception {
                GetCognitoEventsResult result = null;

                try {
                    result = executeGetCognitoEvents(finalRequest);
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
    public java.util.concurrent.Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(GetIdentityPoolConfigurationRequest request) {

        return getIdentityPoolConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoolConfigurationResult> getIdentityPoolConfigurationAsync(final GetIdentityPoolConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityPoolConfigurationRequest, GetIdentityPoolConfigurationResult> asyncHandler) {
        final GetIdentityPoolConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityPoolConfigurationResult>() {
            @Override
            public GetIdentityPoolConfigurationResult call() throws Exception {
                GetIdentityPoolConfigurationResult result = null;

                try {
                    result = executeGetIdentityPoolConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest request) {

        return listDatasetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(final ListDatasetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler) {
        final ListDatasetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatasetsResult>() {
            @Override
            public ListDatasetsResult call() throws Exception {
                ListDatasetsResult result = null;

                try {
                    result = executeListDatasets(finalRequest);
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
    public java.util.concurrent.Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest request) {

        return listIdentityPoolUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(final ListIdentityPoolUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityPoolUsageRequest, ListIdentityPoolUsageResult> asyncHandler) {
        final ListIdentityPoolUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityPoolUsageResult>() {
            @Override
            public ListIdentityPoolUsageResult call() throws Exception {
                ListIdentityPoolUsageResult result = null;

                try {
                    result = executeListIdentityPoolUsage(finalRequest);
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
    public java.util.concurrent.Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest request) {

        return listRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordsResult> listRecordsAsync(final ListRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecordsRequest, ListRecordsResult> asyncHandler) {
        final ListRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecordsResult>() {
            @Override
            public ListRecordsResult call() throws Exception {
                ListRecordsResult result = null;

                try {
                    result = executeListRecords(finalRequest);
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
    public java.util.concurrent.Future<RegisterDeviceResult> registerDeviceAsync(RegisterDeviceRequest request) {

        return registerDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDeviceResult> registerDeviceAsync(final RegisterDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterDeviceRequest, RegisterDeviceResult> asyncHandler) {
        final RegisterDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterDeviceResult>() {
            @Override
            public RegisterDeviceResult call() throws Exception {
                RegisterDeviceResult result = null;

                try {
                    result = executeRegisterDevice(finalRequest);
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
    public java.util.concurrent.Future<SetCognitoEventsResult> setCognitoEventsAsync(SetCognitoEventsRequest request) {

        return setCognitoEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetCognitoEventsResult> setCognitoEventsAsync(final SetCognitoEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetCognitoEventsRequest, SetCognitoEventsResult> asyncHandler) {
        final SetCognitoEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetCognitoEventsResult>() {
            @Override
            public SetCognitoEventsResult call() throws Exception {
                SetCognitoEventsResult result = null;

                try {
                    result = executeSetCognitoEvents(finalRequest);
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
    public java.util.concurrent.Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(SetIdentityPoolConfigurationRequest request) {

        return setIdentityPoolConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityPoolConfigurationResult> setIdentityPoolConfigurationAsync(final SetIdentityPoolConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityPoolConfigurationRequest, SetIdentityPoolConfigurationResult> asyncHandler) {
        final SetIdentityPoolConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityPoolConfigurationResult>() {
            @Override
            public SetIdentityPoolConfigurationResult call() throws Exception {
                SetIdentityPoolConfigurationResult result = null;

                try {
                    result = executeSetIdentityPoolConfiguration(finalRequest);
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
    public java.util.concurrent.Future<SubscribeToDatasetResult> subscribeToDatasetAsync(SubscribeToDatasetRequest request) {

        return subscribeToDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeToDatasetResult> subscribeToDatasetAsync(final SubscribeToDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubscribeToDatasetRequest, SubscribeToDatasetResult> asyncHandler) {
        final SubscribeToDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubscribeToDatasetResult>() {
            @Override
            public SubscribeToDatasetResult call() throws Exception {
                SubscribeToDatasetResult result = null;

                try {
                    result = executeSubscribeToDataset(finalRequest);
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
    public java.util.concurrent.Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(UnsubscribeFromDatasetRequest request) {

        return unsubscribeFromDatasetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeFromDatasetResult> unsubscribeFromDatasetAsync(final UnsubscribeFromDatasetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnsubscribeFromDatasetRequest, UnsubscribeFromDatasetResult> asyncHandler) {
        final UnsubscribeFromDatasetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnsubscribeFromDatasetResult>() {
            @Override
            public UnsubscribeFromDatasetResult call() throws Exception {
                UnsubscribeFromDatasetResult result = null;

                try {
                    result = executeUnsubscribeFromDataset(finalRequest);
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
    public java.util.concurrent.Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest request) {

        return updateRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecordsResult> updateRecordsAsync(final UpdateRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRecordsRequest, UpdateRecordsResult> asyncHandler) {
        final UpdateRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRecordsResult>() {
            @Override
            public UpdateRecordsResult call() throws Exception {
                UpdateRecordsResult result = null;

                try {
                    result = executeUpdateRecords(finalRequest);
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
