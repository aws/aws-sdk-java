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
package com.amazonaws.services.pinpoint;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon Pinpoint asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
@ThreadSafe
public class AmazonPinpointAsyncClient extends AmazonPinpointClient implements AmazonPinpointAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint. A credentials provider chain
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
     */
    public AmazonPinpointAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonPinpointAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonPinpointAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonPinpointAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonPinpointAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonPinpointAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the provided AWS account
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
    public AmazonPinpointAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonPinpointAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonPinpointAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPinpointAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request) {

        return createCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(final CreateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateCampaignResult>() {
            @Override
            public CreateCampaignResult call() throws Exception {
                CreateCampaignResult result;

                try {
                    result = createCampaign(request);
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
    public java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest request) {

        return createImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(final CreateImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImportJobRequest, CreateImportJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateImportJobResult>() {
            @Override
            public CreateImportJobResult call() throws Exception {
                CreateImportJobResult result;

                try {
                    result = createImportJob(request);
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
    public java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest request) {

        return createSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(final CreateSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSegmentRequest, CreateSegmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSegmentResult>() {
            @Override
            public CreateSegmentResult call() throws Exception {
                CreateSegmentResult result;

                try {
                    result = createSegment(request);
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
    public java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(DeleteApnsChannelRequest request) {

        return deleteApnsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(final DeleteApnsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApnsChannelRequest, DeleteApnsChannelResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteApnsChannelResult>() {
            @Override
            public DeleteApnsChannelResult call() throws Exception {
                DeleteApnsChannelResult result;

                try {
                    result = deleteApnsChannel(request);
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
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request) {

        return deleteCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(final DeleteCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteCampaignResult>() {
            @Override
            public DeleteCampaignResult call() throws Exception {
                DeleteCampaignResult result;

                try {
                    result = deleteCampaign(request);
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
    public java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(DeleteGcmChannelRequest request) {

        return deleteGcmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(final DeleteGcmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGcmChannelRequest, DeleteGcmChannelResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteGcmChannelResult>() {
            @Override
            public DeleteGcmChannelResult call() throws Exception {
                DeleteGcmChannelResult result;

                try {
                    result = deleteGcmChannel(request);
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
    public java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest request) {

        return deleteSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(final DeleteSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSegmentRequest, DeleteSegmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSegmentResult>() {
            @Override
            public DeleteSegmentResult call() throws Exception {
                DeleteSegmentResult result;

                try {
                    result = deleteSegment(request);
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
    public java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(GetApnsChannelRequest request) {

        return getApnsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(final GetApnsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApnsChannelRequest, GetApnsChannelResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetApnsChannelResult>() {
            @Override
            public GetApnsChannelResult call() throws Exception {
                GetApnsChannelResult result;

                try {
                    result = getApnsChannel(request);
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
    public java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(GetApplicationSettingsRequest request) {

        return getApplicationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(final GetApplicationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationSettingsRequest, GetApplicationSettingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationSettingsResult>() {
            @Override
            public GetApplicationSettingsResult call() throws Exception {
                GetApplicationSettingsResult result;

                try {
                    result = getApplicationSettings(request);
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
    public java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest request) {

        return getCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(final GetCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignRequest, GetCampaignResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignResult>() {
            @Override
            public GetCampaignResult call() throws Exception {
                GetCampaignResult result;

                try {
                    result = getCampaign(request);
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
    public java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(GetCampaignActivitiesRequest request) {

        return getCampaignActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(final GetCampaignActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignActivitiesRequest, GetCampaignActivitiesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignActivitiesResult>() {
            @Override
            public GetCampaignActivitiesResult call() throws Exception {
                GetCampaignActivitiesResult result;

                try {
                    result = getCampaignActivities(request);
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
    public java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(GetCampaignVersionRequest request) {

        return getCampaignVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(final GetCampaignVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignVersionRequest, GetCampaignVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignVersionResult>() {
            @Override
            public GetCampaignVersionResult call() throws Exception {
                GetCampaignVersionResult result;

                try {
                    result = getCampaignVersion(request);
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
    public java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(GetCampaignVersionsRequest request) {

        return getCampaignVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(final GetCampaignVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignVersionsRequest, GetCampaignVersionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignVersionsResult>() {
            @Override
            public GetCampaignVersionsResult call() throws Exception {
                GetCampaignVersionsResult result;

                try {
                    result = getCampaignVersions(request);
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
    public java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(GetCampaignsRequest request) {

        return getCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(final GetCampaignsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignsRequest, GetCampaignsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignsResult>() {
            @Override
            public GetCampaignsResult call() throws Exception {
                GetCampaignsResult result;

                try {
                    result = getCampaigns(request);
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
    public java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(GetEndpointRequest request) {

        return getEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(final GetEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEndpointRequest, GetEndpointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetEndpointResult>() {
            @Override
            public GetEndpointResult call() throws Exception {
                GetEndpointResult result;

                try {
                    result = getEndpoint(request);
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
    public java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(GetGcmChannelRequest request) {

        return getGcmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(final GetGcmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGcmChannelRequest, GetGcmChannelResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetGcmChannelResult>() {
            @Override
            public GetGcmChannelResult call() throws Exception {
                GetGcmChannelResult result;

                try {
                    result = getGcmChannel(request);
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
    public java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest request) {

        return getImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(final GetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportJobRequest, GetImportJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetImportJobResult>() {
            @Override
            public GetImportJobResult call() throws Exception {
                GetImportJobResult result;

                try {
                    result = getImportJob(request);
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
    public java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(GetImportJobsRequest request) {

        return getImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(final GetImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportJobsRequest, GetImportJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetImportJobsResult>() {
            @Override
            public GetImportJobsResult call() throws Exception {
                GetImportJobsResult result;

                try {
                    result = getImportJobs(request);
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
    public java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest request) {

        return getSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(final GetSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentRequest, GetSegmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentResult>() {
            @Override
            public GetSegmentResult call() throws Exception {
                GetSegmentResult result;

                try {
                    result = getSegment(request);
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
    public java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(GetSegmentImportJobsRequest request) {

        return getSegmentImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(final GetSegmentImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentImportJobsRequest, GetSegmentImportJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentImportJobsResult>() {
            @Override
            public GetSegmentImportJobsResult call() throws Exception {
                GetSegmentImportJobsResult result;

                try {
                    result = getSegmentImportJobs(request);
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
    public java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(GetSegmentVersionRequest request) {

        return getSegmentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(final GetSegmentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentVersionRequest, GetSegmentVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentVersionResult>() {
            @Override
            public GetSegmentVersionResult call() throws Exception {
                GetSegmentVersionResult result;

                try {
                    result = getSegmentVersion(request);
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
    public java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(GetSegmentVersionsRequest request) {

        return getSegmentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(final GetSegmentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentVersionsRequest, GetSegmentVersionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentVersionsResult>() {
            @Override
            public GetSegmentVersionsResult call() throws Exception {
                GetSegmentVersionsResult result;

                try {
                    result = getSegmentVersions(request);
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
    public java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(GetSegmentsRequest request) {

        return getSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(final GetSegmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentsRequest, GetSegmentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentsResult>() {
            @Override
            public GetSegmentsResult call() throws Exception {
                GetSegmentsResult result;

                try {
                    result = getSegments(request);
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
    public java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(UpdateApnsChannelRequest request) {

        return updateApnsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(final UpdateApnsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApnsChannelRequest, UpdateApnsChannelResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateApnsChannelResult>() {
            @Override
            public UpdateApnsChannelResult call() throws Exception {
                UpdateApnsChannelResult result;

                try {
                    result = updateApnsChannel(request);
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
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(UpdateApplicationSettingsRequest request) {

        return updateApplicationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(final UpdateApplicationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationSettingsResult>() {
            @Override
            public UpdateApplicationSettingsResult call() throws Exception {
                UpdateApplicationSettingsResult result;

                try {
                    result = updateApplicationSettings(request);
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
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest request) {

        return updateCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(final UpdateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateCampaignResult>() {
            @Override
            public UpdateCampaignResult call() throws Exception {
                UpdateCampaignResult result;

                try {
                    result = updateCampaign(request);
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
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest request) {

        return updateEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(final UpdateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointResult>() {
            @Override
            public UpdateEndpointResult call() throws Exception {
                UpdateEndpointResult result;

                try {
                    result = updateEndpoint(request);
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
    public java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(UpdateEndpointsBatchRequest request) {

        return updateEndpointsBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(final UpdateEndpointsBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointsBatchRequest, UpdateEndpointsBatchResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointsBatchResult>() {
            @Override
            public UpdateEndpointsBatchResult call() throws Exception {
                UpdateEndpointsBatchResult result;

                try {
                    result = updateEndpointsBatch(request);
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
    public java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(UpdateGcmChannelRequest request) {

        return updateGcmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(final UpdateGcmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGcmChannelRequest, UpdateGcmChannelResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateGcmChannelResult>() {
            @Override
            public UpdateGcmChannelResult call() throws Exception {
                UpdateGcmChannelResult result;

                try {
                    result = updateGcmChannel(request);
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
    public java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(UpdateSegmentRequest request) {

        return updateSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(final UpdateSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSegmentRequest, UpdateSegmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSegmentResult>() {
            @Override
            public UpdateSegmentResult call() throws Exception {
                UpdateSegmentResult result;

                try {
                    result = updateSegment(request);
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
