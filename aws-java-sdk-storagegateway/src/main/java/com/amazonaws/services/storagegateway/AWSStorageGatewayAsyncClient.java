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
package com.amazonaws.services.storagegateway;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing AWS Storage Gateway asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software appliance with cloud-based storage to
 * provide seamless and secure integration between an organization's on-premises IT environment and AWS's storage
 * infrastructure. The service enables you to securely upload data to the AWS cloud for cost effective backup and rapid
 * disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayHTTPRequestsHeaders.html">AWS
 * Storage Gateway Required Request Headers</a>: Describes the required headers that you must send with every POST
 * request to AWS Storage Gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewaySigningRequests.html">Signing
 * Requests</a>: AWS Storage Gateway requires that you authenticate every request you send; this topic describes how
 * sign such a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/APIErrorResponses.html">Error Responses</a>:
 * Provides reference information about AWS Storage Gateway errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPIOperations.html">Operations
 * in AWS Storage Gateway</a>: Contains detailed descriptions of all AWS Storage Gateway operations, their request
 * parameters, response elements, possible errors, and examples of requests and responses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html">AWS Storage Gateway Regions and
 * Endpoints</a>: Provides a list of each of the s and endpoints available for use with AWS Storage Gateway.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * AWS Storage Gateway resource IDs are in uppercase. When you use these resource IDs with the Amazon EC2 API, EC2
 * expects resource IDs in lowercase. You must change your resource ID to lowercase to use it with the EC2 API. For
 * example, in Storage Gateway the ID for a volume might be <code>vol-1122AABB</code>. When you use this ID with the EC2
 * API, you must change it to <code>vol-1122aabb</code>. Otherwise, the EC2 API might not behave as expected.
 * </p>
 * </note> <important>
 * <p>
 * IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway volumes are changing to a longer
 * format. Starting in December 2016, all new volumes and snapshots will be created with a 17-character string. Starting
 * in April 2016, you will be able to use these longer IDs so you can test your systems with the new format. For more
 * information, see <a href="https://aws.amazon.com/ec2/faqs/#longer-ids">Longer EC2 and EBS Resource IDs</a>.
 * </p>
 * <p>
 * For example, a volume ARN with the longer volume ID format will look like this:
 * </p>
 * <p>
 * <code>arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG</code>.
 * </p>
 * <p>
 * A snapshot ID with the longer ID format will look like this: <code>snap-78e226633445566ee</code>.
 * </p>
 * <p>
 * For more information, see <a href="https://forums.aws.amazon.com/ann.jspa?annID=3557">Announcement: Heads-up – Longer
 * AWS Storage Gateway volume and snapshot IDs coming in 2016</a>.
 * </p>
 * </important>
 */
@ThreadSafe
public class AWSStorageGatewayAsyncClient extends AWSStorageGatewayClient implements AWSStorageGatewayAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway. A credentials provider
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
     */
    public AWSStorageGatewayAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway. A credentials provider
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
     *        The client configuration options controlling how this client connects to AWS Storage Gateway (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the provided AWS
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
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSStorageGatewayAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSStorageGatewayAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(ActivateGatewayRequest request) {

        return activateGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(final ActivateGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateGatewayRequest, ActivateGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ActivateGatewayResult>() {
            @Override
            public ActivateGatewayResult call() throws Exception {
                ActivateGatewayResult result;

                try {
                    result = activateGateway(request);
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
    public java.util.concurrent.Future<AddCacheResult> addCacheAsync(AddCacheRequest request) {

        return addCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddCacheResult> addCacheAsync(final AddCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddCacheRequest, AddCacheResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddCacheResult>() {
            @Override
            public AddCacheResult call() throws Exception {
                AddCacheResult result;

                try {
                    result = addCache(request);
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result;

                try {
                    result = addTagsToResource(request);
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
    public java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(AddUploadBufferRequest request) {

        return addUploadBufferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(final AddUploadBufferRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddUploadBufferRequest, AddUploadBufferResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddUploadBufferResult>() {
            @Override
            public AddUploadBufferResult call() throws Exception {
                AddUploadBufferResult result;

                try {
                    result = addUploadBuffer(request);
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
    public java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(AddWorkingStorageRequest request) {

        return addWorkingStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(final AddWorkingStorageRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddWorkingStorageRequest, AddWorkingStorageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddWorkingStorageResult>() {
            @Override
            public AddWorkingStorageResult call() throws Exception {
                AddWorkingStorageResult result;

                try {
                    result = addWorkingStorage(request);
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
    public java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(CancelArchivalRequest request) {

        return cancelArchivalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(final CancelArchivalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelArchivalRequest, CancelArchivalResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelArchivalResult>() {
            @Override
            public CancelArchivalResult call() throws Exception {
                CancelArchivalResult result;

                try {
                    result = cancelArchival(request);
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
    public java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(CancelRetrievalRequest request) {

        return cancelRetrievalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(final CancelRetrievalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelRetrievalRequest, CancelRetrievalResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelRetrievalResult>() {
            @Override
            public CancelRetrievalResult call() throws Exception {
                CancelRetrievalResult result;

                try {
                    result = cancelRetrieval(request);
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
    public java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(CreateCachediSCSIVolumeRequest request) {

        return createCachediSCSIVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(final CreateCachediSCSIVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCachediSCSIVolumeRequest, CreateCachediSCSIVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateCachediSCSIVolumeResult>() {
            @Override
            public CreateCachediSCSIVolumeResult call() throws Exception {
                CreateCachediSCSIVolumeResult result;

                try {
                    result = createCachediSCSIVolume(request);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result;

                try {
                    result = createSnapshot(request);
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
    public java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            CreateSnapshotFromVolumeRecoveryPointRequest request) {

        return createSnapshotFromVolumeRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            final CreateSnapshotFromVolumeRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotFromVolumeRecoveryPointRequest, CreateSnapshotFromVolumeRecoveryPointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotFromVolumeRecoveryPointResult>() {
            @Override
            public CreateSnapshotFromVolumeRecoveryPointResult call() throws Exception {
                CreateSnapshotFromVolumeRecoveryPointResult result;

                try {
                    result = createSnapshotFromVolumeRecoveryPoint(request);
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
    public java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(CreateStorediSCSIVolumeRequest request) {

        return createStorediSCSIVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(final CreateStorediSCSIVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStorediSCSIVolumeRequest, CreateStorediSCSIVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateStorediSCSIVolumeResult>() {
            @Override
            public CreateStorediSCSIVolumeResult call() throws Exception {
                CreateStorediSCSIVolumeResult result;

                try {
                    result = createStorediSCSIVolume(request);
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
    public java.util.concurrent.Future<CreateTapeWithBarcodeResult> createTapeWithBarcodeAsync(CreateTapeWithBarcodeRequest request) {

        return createTapeWithBarcodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTapeWithBarcodeResult> createTapeWithBarcodeAsync(final CreateTapeWithBarcodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTapeWithBarcodeRequest, CreateTapeWithBarcodeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTapeWithBarcodeResult>() {
            @Override
            public CreateTapeWithBarcodeResult call() throws Exception {
                CreateTapeWithBarcodeResult result;

                try {
                    result = createTapeWithBarcode(request);
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
    public java.util.concurrent.Future<CreateTapesResult> createTapesAsync(CreateTapesRequest request) {

        return createTapesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTapesResult> createTapesAsync(final CreateTapesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTapesRequest, CreateTapesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTapesResult>() {
            @Override
            public CreateTapesResult call() throws Exception {
                CreateTapesResult result;

                try {
                    result = createTapes(request);
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
    public java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(DeleteBandwidthRateLimitRequest request) {

        return deleteBandwidthRateLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(final DeleteBandwidthRateLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBandwidthRateLimitRequest, DeleteBandwidthRateLimitResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteBandwidthRateLimitResult>() {
            @Override
            public DeleteBandwidthRateLimitResult call() throws Exception {
                DeleteBandwidthRateLimitResult result;

                try {
                    result = deleteBandwidthRateLimit(request);
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
    public java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(DeleteChapCredentialsRequest request) {

        return deleteChapCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(final DeleteChapCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChapCredentialsRequest, DeleteChapCredentialsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteChapCredentialsResult>() {
            @Override
            public DeleteChapCredentialsResult call() throws Exception {
                DeleteChapCredentialsResult result;

                try {
                    result = deleteChapCredentials(request);
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
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest request) {

        return deleteGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(final DeleteGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteGatewayResult>() {
            @Override
            public DeleteGatewayResult call() throws Exception {
                DeleteGatewayResult result;

                try {
                    result = deleteGateway(request);
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
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest request) {

        return deleteSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(final DeleteSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotScheduleResult>() {
            @Override
            public DeleteSnapshotScheduleResult call() throws Exception {
                DeleteSnapshotScheduleResult result;

                try {
                    result = deleteSnapshotSchedule(request);
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
    public java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(DeleteTapeRequest request) {

        return deleteTapeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(final DeleteTapeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTapeRequest, DeleteTapeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTapeResult>() {
            @Override
            public DeleteTapeResult call() throws Exception {
                DeleteTapeResult result;

                try {
                    result = deleteTape(request);
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
    public java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(DeleteTapeArchiveRequest request) {

        return deleteTapeArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(final DeleteTapeArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTapeArchiveRequest, DeleteTapeArchiveResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTapeArchiveResult>() {
            @Override
            public DeleteTapeArchiveResult call() throws Exception {
                DeleteTapeArchiveResult result;

                try {
                    result = deleteTapeArchive(request);
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
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request) {

        return deleteVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(final DeleteVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVolumeResult>() {
            @Override
            public DeleteVolumeResult call() throws Exception {
                DeleteVolumeResult result;

                try {
                    result = deleteVolume(request);
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
    public java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(DescribeBandwidthRateLimitRequest request) {

        return describeBandwidthRateLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(final DescribeBandwidthRateLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBandwidthRateLimitRequest, DescribeBandwidthRateLimitResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeBandwidthRateLimitResult>() {
            @Override
            public DescribeBandwidthRateLimitResult call() throws Exception {
                DescribeBandwidthRateLimitResult result;

                try {
                    result = describeBandwidthRateLimit(request);
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
    public java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(DescribeCacheRequest request) {

        return describeCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(final DescribeCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCacheRequest, DescribeCacheResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeCacheResult>() {
            @Override
            public DescribeCacheResult call() throws Exception {
                DescribeCacheResult result;

                try {
                    result = describeCache(request);
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
    public java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(DescribeCachediSCSIVolumesRequest request) {

        return describeCachediSCSIVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(final DescribeCachediSCSIVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCachediSCSIVolumesRequest, DescribeCachediSCSIVolumesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeCachediSCSIVolumesResult>() {
            @Override
            public DescribeCachediSCSIVolumesResult call() throws Exception {
                DescribeCachediSCSIVolumesResult result;

                try {
                    result = describeCachediSCSIVolumes(request);
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
    public java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(DescribeChapCredentialsRequest request) {

        return describeChapCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(final DescribeChapCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChapCredentialsRequest, DescribeChapCredentialsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeChapCredentialsResult>() {
            @Override
            public DescribeChapCredentialsResult call() throws Exception {
                DescribeChapCredentialsResult result;

                try {
                    result = describeChapCredentials(request);
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
    public java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(DescribeGatewayInformationRequest request) {

        return describeGatewayInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(final DescribeGatewayInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGatewayInformationRequest, DescribeGatewayInformationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeGatewayInformationResult>() {
            @Override
            public DescribeGatewayInformationResult call() throws Exception {
                DescribeGatewayInformationResult result;

                try {
                    result = describeGatewayInformation(request);
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
    public java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(DescribeMaintenanceStartTimeRequest request) {

        return describeMaintenanceStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(final DescribeMaintenanceStartTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceStartTimeRequest, DescribeMaintenanceStartTimeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceStartTimeResult>() {
            @Override
            public DescribeMaintenanceStartTimeResult call() throws Exception {
                DescribeMaintenanceStartTimeResult result;

                try {
                    result = describeMaintenanceStartTime(request);
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
    public java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(DescribeSnapshotScheduleRequest request) {

        return describeSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(final DescribeSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotScheduleRequest, DescribeSnapshotScheduleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotScheduleResult>() {
            @Override
            public DescribeSnapshotScheduleResult call() throws Exception {
                DescribeSnapshotScheduleResult result;

                try {
                    result = describeSnapshotSchedule(request);
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
    public java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(DescribeStorediSCSIVolumesRequest request) {

        return describeStorediSCSIVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(final DescribeStorediSCSIVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStorediSCSIVolumesRequest, DescribeStorediSCSIVolumesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeStorediSCSIVolumesResult>() {
            @Override
            public DescribeStorediSCSIVolumesResult call() throws Exception {
                DescribeStorediSCSIVolumesResult result;

                try {
                    result = describeStorediSCSIVolumes(request);
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
    public java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(DescribeTapeArchivesRequest request) {

        return describeTapeArchivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(final DescribeTapeArchivesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTapeArchivesResult>() {
            @Override
            public DescribeTapeArchivesResult call() throws Exception {
                DescribeTapeArchivesResult result;

                try {
                    result = describeTapeArchives(request);
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
     * Simplified method form for invoking the DescribeTapeArchives operation.
     *
     * @see #describeTapeArchivesAsync(DescribeTapeArchivesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync() {

        return describeTapeArchivesAsync(new DescribeTapeArchivesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTapeArchives operation with an AsyncHandler.
     *
     * @see #describeTapeArchivesAsync(DescribeTapeArchivesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler) {

        return describeTapeArchivesAsync(new DescribeTapeArchivesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(DescribeTapeRecoveryPointsRequest request) {

        return describeTapeRecoveryPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTapeRecoveryPointsResult> describeTapeRecoveryPointsAsync(final DescribeTapeRecoveryPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTapeRecoveryPointsRequest, DescribeTapeRecoveryPointsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTapeRecoveryPointsResult>() {
            @Override
            public DescribeTapeRecoveryPointsResult call() throws Exception {
                DescribeTapeRecoveryPointsResult result;

                try {
                    result = describeTapeRecoveryPoints(request);
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
    public java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(DescribeTapesRequest request) {

        return describeTapesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(final DescribeTapesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTapesRequest, DescribeTapesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTapesResult>() {
            @Override
            public DescribeTapesResult call() throws Exception {
                DescribeTapesResult result;

                try {
                    result = describeTapes(request);
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
    public java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(DescribeUploadBufferRequest request) {

        return describeUploadBufferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(final DescribeUploadBufferRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUploadBufferRequest, DescribeUploadBufferResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeUploadBufferResult>() {
            @Override
            public DescribeUploadBufferResult call() throws Exception {
                DescribeUploadBufferResult result;

                try {
                    result = describeUploadBuffer(request);
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
    public java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(DescribeVTLDevicesRequest request) {

        return describeVTLDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(final DescribeVTLDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVTLDevicesRequest, DescribeVTLDevicesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeVTLDevicesResult>() {
            @Override
            public DescribeVTLDevicesResult call() throws Exception {
                DescribeVTLDevicesResult result;

                try {
                    result = describeVTLDevices(request);
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
    public java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(DescribeWorkingStorageRequest request) {

        return describeWorkingStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(final DescribeWorkingStorageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkingStorageRequest, DescribeWorkingStorageResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkingStorageResult>() {
            @Override
            public DescribeWorkingStorageResult call() throws Exception {
                DescribeWorkingStorageResult result;

                try {
                    result = describeWorkingStorage(request);
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
    public java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(DisableGatewayRequest request) {

        return disableGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(final DisableGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableGatewayRequest, DisableGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableGatewayResult>() {
            @Override
            public DisableGatewayResult call() throws Exception {
                DisableGatewayResult result;

                try {
                    result = disableGateway(request);
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
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request) {

        return listGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(final ListGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListGatewaysResult>() {
            @Override
            public ListGatewaysResult call() throws Exception {
                ListGatewaysResult result;

                try {
                    result = listGateways(request);
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
     * Simplified method form for invoking the ListGateways operation.
     *
     * @see #listGatewaysAsync(ListGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync() {

        return listGatewaysAsync(new ListGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the ListGateways operation with an AsyncHandler.
     *
     * @see #listGatewaysAsync(ListGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {

        return listGatewaysAsync(new ListGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListLocalDisksResult> listLocalDisksAsync(ListLocalDisksRequest request) {

        return listLocalDisksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLocalDisksResult> listLocalDisksAsync(final ListLocalDisksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLocalDisksRequest, ListLocalDisksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListLocalDisksResult>() {
            @Override
            public ListLocalDisksResult call() throws Exception {
                ListLocalDisksResult result;

                try {
                    result = listLocalDisks(request);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result;

                try {
                    result = listTagsForResource(request);
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
     * Simplified method form for invoking the ListTagsForResource operation.
     *
     * @see #listTagsForResourceAsync(ListTagsForResourceRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync() {

        return listTagsForResourceAsync(new ListTagsForResourceRequest());
    }

    /**
     * Simplified method form for invoking the ListTagsForResource operation with an AsyncHandler.
     *
     * @see #listTagsForResourceAsync(ListTagsForResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        return listTagsForResourceAsync(new ListTagsForResourceRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTapesResult> listTapesAsync(ListTapesRequest request) {

        return listTapesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTapesResult> listTapesAsync(final ListTapesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTapesRequest, ListTapesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTapesResult>() {
            @Override
            public ListTapesResult call() throws Exception {
                ListTapesResult result;

                try {
                    result = listTapes(request);
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
    public java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(ListVolumeInitiatorsRequest request) {

        return listVolumeInitiatorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(final ListVolumeInitiatorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVolumeInitiatorsRequest, ListVolumeInitiatorsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListVolumeInitiatorsResult>() {
            @Override
            public ListVolumeInitiatorsResult call() throws Exception {
                ListVolumeInitiatorsResult result;

                try {
                    result = listVolumeInitiators(request);
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
    public java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(ListVolumeRecoveryPointsRequest request) {

        return listVolumeRecoveryPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(final ListVolumeRecoveryPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVolumeRecoveryPointsRequest, ListVolumeRecoveryPointsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListVolumeRecoveryPointsResult>() {
            @Override
            public ListVolumeRecoveryPointsResult call() throws Exception {
                ListVolumeRecoveryPointsResult result;

                try {
                    result = listVolumeRecoveryPoints(request);
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
    public java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(ListVolumesRequest request) {

        return listVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(final ListVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVolumesRequest, ListVolumesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListVolumesResult>() {
            @Override
            public ListVolumesResult call() throws Exception {
                ListVolumesResult result;

                try {
                    result = listVolumes(request);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result;

                try {
                    result = removeTagsFromResource(request);
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
     * Simplified method form for invoking the RemoveTagsFromResource operation.
     *
     * @see #removeTagsFromResourceAsync(RemoveTagsFromResourceRequest)
     */
    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync() {

        return removeTagsFromResourceAsync(new RemoveTagsFromResourceRequest());
    }

    /**
     * Simplified method form for invoking the RemoveTagsFromResource operation with an AsyncHandler.
     *
     * @see #removeTagsFromResourceAsync(RemoveTagsFromResourceRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        return removeTagsFromResourceAsync(new RemoveTagsFromResourceRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ResetCacheResult> resetCacheAsync(ResetCacheRequest request) {

        return resetCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetCacheResult> resetCacheAsync(final ResetCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetCacheRequest, ResetCacheResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetCacheResult>() {
            @Override
            public ResetCacheResult call() throws Exception {
                ResetCacheResult result;

                try {
                    result = resetCache(request);
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
    public java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(RetrieveTapeArchiveRequest request) {

        return retrieveTapeArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(final RetrieveTapeArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetrieveTapeArchiveRequest, RetrieveTapeArchiveResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RetrieveTapeArchiveResult>() {
            @Override
            public RetrieveTapeArchiveResult call() throws Exception {
                RetrieveTapeArchiveResult result;

                try {
                    result = retrieveTapeArchive(request);
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
    public java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(RetrieveTapeRecoveryPointRequest request) {

        return retrieveTapeRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(final RetrieveTapeRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetrieveTapeRecoveryPointRequest, RetrieveTapeRecoveryPointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RetrieveTapeRecoveryPointResult>() {
            @Override
            public RetrieveTapeRecoveryPointResult call() throws Exception {
                RetrieveTapeRecoveryPointResult result;

                try {
                    result = retrieveTapeRecoveryPoint(request);
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
    public java.util.concurrent.Future<SetLocalConsolePasswordResult> setLocalConsolePasswordAsync(SetLocalConsolePasswordRequest request) {

        return setLocalConsolePasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetLocalConsolePasswordResult> setLocalConsolePasswordAsync(final SetLocalConsolePasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetLocalConsolePasswordRequest, SetLocalConsolePasswordResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetLocalConsolePasswordResult>() {
            @Override
            public SetLocalConsolePasswordResult call() throws Exception {
                SetLocalConsolePasswordResult result;

                try {
                    result = setLocalConsolePassword(request);
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
    public java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(ShutdownGatewayRequest request) {

        return shutdownGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(final ShutdownGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<ShutdownGatewayRequest, ShutdownGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ShutdownGatewayResult>() {
            @Override
            public ShutdownGatewayResult call() throws Exception {
                ShutdownGatewayResult result;

                try {
                    result = shutdownGateway(request);
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
    public java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(StartGatewayRequest request) {

        return startGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(final StartGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartGatewayRequest, StartGatewayResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartGatewayResult>() {
            @Override
            public StartGatewayResult call() throws Exception {
                StartGatewayResult result;

                try {
                    result = startGateway(request);
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
    public java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(UpdateBandwidthRateLimitRequest request) {

        return updateBandwidthRateLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(final UpdateBandwidthRateLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBandwidthRateLimitRequest, UpdateBandwidthRateLimitResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateBandwidthRateLimitResult>() {
            @Override
            public UpdateBandwidthRateLimitResult call() throws Exception {
                UpdateBandwidthRateLimitResult result;

                try {
                    result = updateBandwidthRateLimit(request);
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
    public java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(UpdateChapCredentialsRequest request) {

        return updateChapCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(final UpdateChapCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChapCredentialsRequest, UpdateChapCredentialsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateChapCredentialsResult>() {
            @Override
            public UpdateChapCredentialsResult call() throws Exception {
                UpdateChapCredentialsResult result;

                try {
                    result = updateChapCredentials(request);
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
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest request) {

        return updateGatewayInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(final UpdateGatewayInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayInformationResult>() {
            @Override
            public UpdateGatewayInformationResult call() throws Exception {
                UpdateGatewayInformationResult result;

                try {
                    result = updateGatewayInformation(request);
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
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest request) {

        return updateGatewaySoftwareNowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(final UpdateGatewaySoftwareNowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewaySoftwareNowResult>() {
            @Override
            public UpdateGatewaySoftwareNowResult call() throws Exception {
                UpdateGatewaySoftwareNowResult result;

                try {
                    result = updateGatewaySoftwareNow(request);
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
    public java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(UpdateMaintenanceStartTimeRequest request) {

        return updateMaintenanceStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(final UpdateMaintenanceStartTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceStartTimeRequest, UpdateMaintenanceStartTimeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateMaintenanceStartTimeResult>() {
            @Override
            public UpdateMaintenanceStartTimeResult call() throws Exception {
                UpdateMaintenanceStartTimeResult result;

                try {
                    result = updateMaintenanceStartTime(request);
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
    public java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(UpdateSnapshotScheduleRequest request) {

        return updateSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(final UpdateSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSnapshotScheduleRequest, UpdateSnapshotScheduleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSnapshotScheduleResult>() {
            @Override
            public UpdateSnapshotScheduleResult call() throws Exception {
                UpdateSnapshotScheduleResult result;

                try {
                    result = updateSnapshotSchedule(request);
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
    public java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(UpdateVTLDeviceTypeRequest request) {

        return updateVTLDeviceTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(final UpdateVTLDeviceTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVTLDeviceTypeRequest, UpdateVTLDeviceTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateVTLDeviceTypeResult>() {
            @Override
            public UpdateVTLDeviceTypeResult call() throws Exception {
                UpdateVTLDeviceTypeResult result;

                try {
                    result = updateVTLDeviceType(request);
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
