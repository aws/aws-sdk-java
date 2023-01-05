/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing CloudTrail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>CloudTrail</fullname>
 * <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common
 * errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records Amazon Web Services API calls for your Amazon Web Services account and
 * delivers log files to an Amazon S3 bucket. The recorded information includes the identity of the user, the start time
 * of the Amazon Web Services API call, the source IP address, the request parameters, and the response elements
 * returned by the service.
 * </p>
 * <note>
 * <p>
 * As an alternative to the API, you can use one of the Amazon Web Services SDKs, which consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide
 * programmatic access to CloudTrail. For example, the SDKs handle cryptographically signing requests, managing errors,
 * and retrying requests automatically. For more information about the Amazon Web Services SDKs, including how to
 * download and install them, see <a href="http://aws.amazon.com/tools/">Tools to Build on Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * See the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html">CloudTrail
 * User Guide</a> for information about the data that is included with each Amazon Web Services API call listed in the
 * log files.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudTrailAsyncClient extends AWSCloudTrailClient implements AWSCloudTrailAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail. A credentials provider chain will
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
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to CloudTrail (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCloudTrailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the provided AWS account
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
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSCloudTrailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCloudTrailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSCloudTrailAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSCloudTrailAsyncClientBuilder asyncBuilder() {
        return AWSCloudTrailAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCloudTrailAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudTrail using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCloudTrailAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(final AddTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {
        final AddTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsResult>() {
            @Override
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;

                try {
                    result = executeAddTags(finalRequest);
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
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request) {

        return cancelQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(final CancelQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelQueryRequest, CancelQueryResult> asyncHandler) {
        final CancelQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelQueryResult>() {
            @Override
            public CancelQueryResult call() throws Exception {
                CancelQueryResult result = null;

                try {
                    result = executeCancelQuery(finalRequest);
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
    public java.util.concurrent.Future<CreateEventDataStoreResult> createEventDataStoreAsync(CreateEventDataStoreRequest request) {

        return createEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventDataStoreResult> createEventDataStoreAsync(final CreateEventDataStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventDataStoreRequest, CreateEventDataStoreResult> asyncHandler) {
        final CreateEventDataStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventDataStoreResult>() {
            @Override
            public CreateEventDataStoreResult call() throws Exception {
                CreateEventDataStoreResult result = null;

                try {
                    result = executeCreateEventDataStore(finalRequest);
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
    public java.util.concurrent.Future<CreateTrailResult> createTrailAsync(CreateTrailRequest request) {

        return createTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrailResult> createTrailAsync(final CreateTrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrailRequest, CreateTrailResult> asyncHandler) {
        final CreateTrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrailResult>() {
            @Override
            public CreateTrailResult call() throws Exception {
                CreateTrailResult result = null;

                try {
                    result = executeCreateTrail(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventDataStoreResult> deleteEventDataStoreAsync(DeleteEventDataStoreRequest request) {

        return deleteEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventDataStoreResult> deleteEventDataStoreAsync(final DeleteEventDataStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventDataStoreRequest, DeleteEventDataStoreResult> asyncHandler) {
        final DeleteEventDataStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventDataStoreResult>() {
            @Override
            public DeleteEventDataStoreResult call() throws Exception {
                DeleteEventDataStoreResult result = null;

                try {
                    result = executeDeleteEventDataStore(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(DeleteTrailRequest request) {

        return deleteTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(final DeleteTrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrailRequest, DeleteTrailResult> asyncHandler) {
        final DeleteTrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrailResult>() {
            @Override
            public DeleteTrailResult call() throws Exception {
                DeleteTrailResult result = null;

                try {
                    result = executeDeleteTrail(finalRequest);
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
    public java.util.concurrent.Future<DeregisterOrganizationDelegatedAdminResult> deregisterOrganizationDelegatedAdminAsync(
            DeregisterOrganizationDelegatedAdminRequest request) {

        return deregisterOrganizationDelegatedAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterOrganizationDelegatedAdminResult> deregisterOrganizationDelegatedAdminAsync(
            final DeregisterOrganizationDelegatedAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterOrganizationDelegatedAdminRequest, DeregisterOrganizationDelegatedAdminResult> asyncHandler) {
        final DeregisterOrganizationDelegatedAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterOrganizationDelegatedAdminResult>() {
            @Override
            public DeregisterOrganizationDelegatedAdminResult call() throws Exception {
                DeregisterOrganizationDelegatedAdminResult result = null;

                try {
                    result = executeDeregisterOrganizationDelegatedAdmin(finalRequest);
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
    public java.util.concurrent.Future<DescribeQueryResult> describeQueryAsync(DescribeQueryRequest request) {

        return describeQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQueryResult> describeQueryAsync(final DescribeQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQueryRequest, DescribeQueryResult> asyncHandler) {
        final DescribeQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQueryResult>() {
            @Override
            public DescribeQueryResult call() throws Exception {
                DescribeQueryResult result = null;

                try {
                    result = executeDescribeQuery(finalRequest);
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
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(DescribeTrailsRequest request) {

        return describeTrailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(final DescribeTrailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler) {
        final DescribeTrailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrailsResult>() {
            @Override
            public DescribeTrailsResult call() throws Exception {
                DescribeTrailsResult result = null;

                try {
                    result = executeDescribeTrails(finalRequest);
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
     * Simplified method form for invoking the DescribeTrails operation.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync() {

        return describeTrailsAsync(new DescribeTrailsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTrails operation with an AsyncHandler.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler) {

        return describeTrailsAsync(new DescribeTrailsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest request) {

        return getChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(final GetChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler) {
        final GetChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelResult>() {
            @Override
            public GetChannelResult call() throws Exception {
                GetChannelResult result = null;

                try {
                    result = executeGetChannel(finalRequest);
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
    public java.util.concurrent.Future<GetEventDataStoreResult> getEventDataStoreAsync(GetEventDataStoreRequest request) {

        return getEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventDataStoreResult> getEventDataStoreAsync(final GetEventDataStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventDataStoreRequest, GetEventDataStoreResult> asyncHandler) {
        final GetEventDataStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventDataStoreResult>() {
            @Override
            public GetEventDataStoreResult call() throws Exception {
                GetEventDataStoreResult result = null;

                try {
                    result = executeGetEventDataStore(finalRequest);
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
    public java.util.concurrent.Future<GetEventSelectorsResult> getEventSelectorsAsync(GetEventSelectorsRequest request) {

        return getEventSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventSelectorsResult> getEventSelectorsAsync(final GetEventSelectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventSelectorsRequest, GetEventSelectorsResult> asyncHandler) {
        final GetEventSelectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventSelectorsResult>() {
            @Override
            public GetEventSelectorsResult call() throws Exception {
                GetEventSelectorsResult result = null;

                try {
                    result = executeGetEventSelectors(finalRequest);
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
    public java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest request) {

        return getImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportResult> getImportAsync(final GetImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportRequest, GetImportResult> asyncHandler) {
        final GetImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImportResult>() {
            @Override
            public GetImportResult call() throws Exception {
                GetImportResult result = null;

                try {
                    result = executeGetImport(finalRequest);
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
    public java.util.concurrent.Future<GetInsightSelectorsResult> getInsightSelectorsAsync(GetInsightSelectorsRequest request) {

        return getInsightSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInsightSelectorsResult> getInsightSelectorsAsync(final GetInsightSelectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInsightSelectorsRequest, GetInsightSelectorsResult> asyncHandler) {
        final GetInsightSelectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInsightSelectorsResult>() {
            @Override
            public GetInsightSelectorsResult call() throws Exception {
                GetInsightSelectorsResult result = null;

                try {
                    result = executeGetInsightSelectors(finalRequest);
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
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(final GetQueryResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {
        final GetQueryResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryResultsResult>() {
            @Override
            public GetQueryResultsResult call() throws Exception {
                GetQueryResultsResult result = null;

                try {
                    result = executeGetQueryResults(finalRequest);
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
    public java.util.concurrent.Future<GetTrailResult> getTrailAsync(GetTrailRequest request) {

        return getTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrailResult> getTrailAsync(final GetTrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrailRequest, GetTrailResult> asyncHandler) {
        final GetTrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrailResult>() {
            @Override
            public GetTrailResult call() throws Exception {
                GetTrailResult result = null;

                try {
                    result = executeGetTrail(finalRequest);
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
    public java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(GetTrailStatusRequest request) {

        return getTrailStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(final GetTrailStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrailStatusRequest, GetTrailStatusResult> asyncHandler) {
        final GetTrailStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrailStatusResult>() {
            @Override
            public GetTrailStatusResult call() throws Exception {
                GetTrailStatusResult result = null;

                try {
                    result = executeGetTrailStatus(finalRequest);
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
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(final ListChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {
        final ListChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelsResult>() {
            @Override
            public ListChannelsResult call() throws Exception {
                ListChannelsResult result = null;

                try {
                    result = executeListChannels(finalRequest);
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
    public java.util.concurrent.Future<ListEventDataStoresResult> listEventDataStoresAsync(ListEventDataStoresRequest request) {

        return listEventDataStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventDataStoresResult> listEventDataStoresAsync(final ListEventDataStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventDataStoresRequest, ListEventDataStoresResult> asyncHandler) {
        final ListEventDataStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventDataStoresResult>() {
            @Override
            public ListEventDataStoresResult call() throws Exception {
                ListEventDataStoresResult result = null;

                try {
                    result = executeListEventDataStores(finalRequest);
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
    public java.util.concurrent.Future<ListImportFailuresResult> listImportFailuresAsync(ListImportFailuresRequest request) {

        return listImportFailuresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportFailuresResult> listImportFailuresAsync(final ListImportFailuresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImportFailuresRequest, ListImportFailuresResult> asyncHandler) {
        final ListImportFailuresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImportFailuresResult>() {
            @Override
            public ListImportFailuresResult call() throws Exception {
                ListImportFailuresResult result = null;

                try {
                    result = executeListImportFailures(finalRequest);
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
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest request) {

        return listPublicKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(final ListPublicKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler) {
        final ListPublicKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPublicKeysResult>() {
            @Override
            public ListPublicKeysResult call() throws Exception {
                ListPublicKeysResult result = null;

                try {
                    result = executeListPublicKeys(finalRequest);
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
     * Simplified method form for invoking the ListPublicKeys operation.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync() {

        return listPublicKeysAsync(new ListPublicKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListPublicKeys operation with an AsyncHandler.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler) {

        return listPublicKeysAsync(new ListPublicKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListQueriesResult> listQueriesAsync(ListQueriesRequest request) {

        return listQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueriesResult> listQueriesAsync(final ListQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueriesRequest, ListQueriesResult> asyncHandler) {
        final ListQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueriesResult>() {
            @Override
            public ListQueriesResult call() throws Exception {
                ListQueriesResult result = null;

                try {
                    result = executeListQueries(finalRequest);
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
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
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
    public java.util.concurrent.Future<ListTrailsResult> listTrailsAsync(ListTrailsRequest request) {

        return listTrailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrailsResult> listTrailsAsync(final ListTrailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrailsRequest, ListTrailsResult> asyncHandler) {
        final ListTrailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrailsResult>() {
            @Override
            public ListTrailsResult call() throws Exception {
                ListTrailsResult result = null;

                try {
                    result = executeListTrails(finalRequest);
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
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(LookupEventsRequest request) {

        return lookupEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(final LookupEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler) {
        final LookupEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LookupEventsResult>() {
            @Override
            public LookupEventsResult call() throws Exception {
                LookupEventsResult result = null;

                try {
                    result = executeLookupEvents(finalRequest);
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
     * Simplified method form for invoking the LookupEvents operation.
     *
     * @see #lookupEventsAsync(LookupEventsRequest)
     */
    @Override
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync() {

        return lookupEventsAsync(new LookupEventsRequest());
    }

    /**
     * Simplified method form for invoking the LookupEvents operation with an AsyncHandler.
     *
     * @see #lookupEventsAsync(LookupEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(
            com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler) {

        return lookupEventsAsync(new LookupEventsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutEventSelectorsResult> putEventSelectorsAsync(PutEventSelectorsRequest request) {

        return putEventSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventSelectorsResult> putEventSelectorsAsync(final PutEventSelectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventSelectorsRequest, PutEventSelectorsResult> asyncHandler) {
        final PutEventSelectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEventSelectorsResult>() {
            @Override
            public PutEventSelectorsResult call() throws Exception {
                PutEventSelectorsResult result = null;

                try {
                    result = executePutEventSelectors(finalRequest);
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
    public java.util.concurrent.Future<PutInsightSelectorsResult> putInsightSelectorsAsync(PutInsightSelectorsRequest request) {

        return putInsightSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutInsightSelectorsResult> putInsightSelectorsAsync(final PutInsightSelectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutInsightSelectorsRequest, PutInsightSelectorsResult> asyncHandler) {
        final PutInsightSelectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutInsightSelectorsResult>() {
            @Override
            public PutInsightSelectorsResult call() throws Exception {
                PutInsightSelectorsResult result = null;

                try {
                    result = executePutInsightSelectors(finalRequest);
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
    public java.util.concurrent.Future<RegisterOrganizationDelegatedAdminResult> registerOrganizationDelegatedAdminAsync(
            RegisterOrganizationDelegatedAdminRequest request) {

        return registerOrganizationDelegatedAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterOrganizationDelegatedAdminResult> registerOrganizationDelegatedAdminAsync(
            final RegisterOrganizationDelegatedAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterOrganizationDelegatedAdminRequest, RegisterOrganizationDelegatedAdminResult> asyncHandler) {
        final RegisterOrganizationDelegatedAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterOrganizationDelegatedAdminResult>() {
            @Override
            public RegisterOrganizationDelegatedAdminResult call() throws Exception {
                RegisterOrganizationDelegatedAdminResult result = null;

                try {
                    result = executeRegisterOrganizationDelegatedAdmin(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {
        final RemoveTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsResult>() {
            @Override
            public RemoveTagsResult call() throws Exception {
                RemoveTagsResult result = null;

                try {
                    result = executeRemoveTags(finalRequest);
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
    public java.util.concurrent.Future<RestoreEventDataStoreResult> restoreEventDataStoreAsync(RestoreEventDataStoreRequest request) {

        return restoreEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreEventDataStoreResult> restoreEventDataStoreAsync(final RestoreEventDataStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreEventDataStoreRequest, RestoreEventDataStoreResult> asyncHandler) {
        final RestoreEventDataStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreEventDataStoreResult>() {
            @Override
            public RestoreEventDataStoreResult call() throws Exception {
                RestoreEventDataStoreResult result = null;

                try {
                    result = executeRestoreEventDataStore(finalRequest);
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
    public java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest request) {

        return startImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImportResult> startImportAsync(final StartImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartImportRequest, StartImportResult> asyncHandler) {
        final StartImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartImportResult>() {
            @Override
            public StartImportResult call() throws Exception {
                StartImportResult result = null;

                try {
                    result = executeStartImport(finalRequest);
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
    public java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(StartLoggingRequest request) {

        return startLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(final StartLoggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartLoggingRequest, StartLoggingResult> asyncHandler) {
        final StartLoggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartLoggingResult>() {
            @Override
            public StartLoggingResult call() throws Exception {
                StartLoggingResult result = null;

                try {
                    result = executeStartLogging(finalRequest);
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
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request) {

        return startQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(final StartQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler) {
        final StartQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartQueryResult>() {
            @Override
            public StartQueryResult call() throws Exception {
                StartQueryResult result = null;

                try {
                    result = executeStartQuery(finalRequest);
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
    public java.util.concurrent.Future<StopImportResult> stopImportAsync(StopImportRequest request) {

        return stopImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopImportResult> stopImportAsync(final StopImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopImportRequest, StopImportResult> asyncHandler) {
        final StopImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopImportResult>() {
            @Override
            public StopImportResult call() throws Exception {
                StopImportResult result = null;

                try {
                    result = executeStopImport(finalRequest);
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
    public java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(StopLoggingRequest request) {

        return stopLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(final StopLoggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopLoggingRequest, StopLoggingResult> asyncHandler) {
        final StopLoggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopLoggingResult>() {
            @Override
            public StopLoggingResult call() throws Exception {
                StopLoggingResult result = null;

                try {
                    result = executeStopLogging(finalRequest);
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
    public java.util.concurrent.Future<UpdateEventDataStoreResult> updateEventDataStoreAsync(UpdateEventDataStoreRequest request) {

        return updateEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventDataStoreResult> updateEventDataStoreAsync(final UpdateEventDataStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventDataStoreRequest, UpdateEventDataStoreResult> asyncHandler) {
        final UpdateEventDataStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventDataStoreResult>() {
            @Override
            public UpdateEventDataStoreResult call() throws Exception {
                UpdateEventDataStoreResult result = null;

                try {
                    result = executeUpdateEventDataStore(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(UpdateTrailRequest request) {

        return updateTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(final UpdateTrailRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrailRequest, UpdateTrailResult> asyncHandler) {
        final UpdateTrailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrailResult>() {
            @Override
            public UpdateTrailResult call() throws Exception {
                UpdateTrailResult result = null;

                try {
                    result = executeUpdateTrail(finalRequest);
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
