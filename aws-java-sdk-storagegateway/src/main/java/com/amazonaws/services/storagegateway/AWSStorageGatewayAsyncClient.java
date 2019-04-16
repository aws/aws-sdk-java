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
package com.amazonaws.services.storagegateway;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Storage Gateway asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Storage Gateway Service</fullname>
 * <p>
 * AWS Storage Gateway is the service that connects an on-premises software appliance with cloud-based storage to
 * provide seamless and secure integration between an organization's on-premises IT environment and the AWS storage
 * infrastructure. The service enables you to securely upload data to the AWS cloud for cost effective backup and rapid
 * disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewayHTTPRequestsHeaders"
 * >AWS Storage Gateway Required Request Headers</a>: Describes the required headers that you must send with every POST
 * request to AWS Storage Gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#AWSStorageGatewaySigningRequests"
 * >Signing Requests</a>: AWS Storage Gateway requires that you authenticate every request you send; this topic
 * describes how sign such a request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway/latest/userguide/AWSStorageGatewayAPI.html#APIErrorResponses">
 * Error Responses</a>: Provides reference information about AWS Storage Gateway errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_Operations.html">Operations in AWS
 * Storage Gateway</a>: Contains detailed descriptions of all AWS Storage Gateway operations, their request parameters,
 * response elements, possible errors, and examples of requests and responses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region">AWS Storage Gateway Regions and
 * Endpoints:</a> Provides a list of each AWS region and endpoints available for use with AWS Storage Gateway.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * AWS Storage Gateway resource IDs are in uppercase. When you use these resource IDs with the Amazon EC2 API, EC2
 * expects resource IDs in lowercase. You must change your resource ID to lowercase to use it with the EC2 API. For
 * example, in Storage Gateway the ID for a volume might be <code>vol-AA22BB012345DAF670</code>. When you use this ID
 * with the EC2 API, you must change it to <code>vol-aa22bb012345daf670</code>. Otherwise, the EC2 API might not behave
 * as expected.
 * </p>
 * </note> <important>
 * <p>
 * IDs for Storage Gateway volumes and Amazon EBS snapshots created from gateway volumes are changing to a longer
 * format. Starting in December 2016, all new volumes and snapshots will be created with a 17-character string. Starting
 * in April 2016, you will be able to use these longer IDs so you can test your systems with the new format. For more
 * information, see <a href="https://aws.amazon.com/ec2/faqs/#longer-ids">Longer EC2 and EBS Resource IDs</a>.
 * </p>
 * <p>
 * For example, a volume Amazon Resource Name (ARN) with the longer volume ID format looks like the following:
 * </p>
 * <p>
 * <code>arn:aws:storagegateway:us-west-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABBCCDDEEFFG</code>.
 * </p>
 * <p>
 * A snapshot ID with the longer ID format looks like the following: <code>snap-78e226633445566ee</code>.
 * </p>
 * <p>
 * For more information, see <a href="https://forums.aws.amazon.com/ann.jspa?annID=3557">Announcement: Heads-up – Longer
 * AWS Storage Gateway volume and snapshot IDs coming in 2016</a>.
 * </p>
 * </important>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
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
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

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
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSStorageGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
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
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Storage Gateway using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
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
     * @deprecated use {@link AWSStorageGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStorageGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSStorageGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStorageGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSStorageGatewayAsyncClientBuilder asyncBuilder() {
        return AWSStorageGatewayAsyncClientBuilder.standard();
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
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(ActivateGatewayRequest request) {

        return activateGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateGatewayResult> activateGatewayAsync(final ActivateGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateGatewayRequest, ActivateGatewayResult> asyncHandler) {
        final ActivateGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateGatewayResult>() {
            @Override
            public ActivateGatewayResult call() throws Exception {
                ActivateGatewayResult result = null;

                try {
                    result = executeActivateGateway(finalRequest);
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
    public java.util.concurrent.Future<AddCacheResult> addCacheAsync(AddCacheRequest request) {

        return addCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddCacheResult> addCacheAsync(final AddCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddCacheRequest, AddCacheResult> asyncHandler) {
        final AddCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddCacheResult>() {
            @Override
            public AddCacheResult call() throws Exception {
                AddCacheResult result = null;

                try {
                    result = executeAddCache(finalRequest);
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {
        final AddTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result = null;

                try {
                    result = executeAddTagsToResource(finalRequest);
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
    public java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(AddUploadBufferRequest request) {

        return addUploadBufferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddUploadBufferResult> addUploadBufferAsync(final AddUploadBufferRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddUploadBufferRequest, AddUploadBufferResult> asyncHandler) {
        final AddUploadBufferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddUploadBufferResult>() {
            @Override
            public AddUploadBufferResult call() throws Exception {
                AddUploadBufferResult result = null;

                try {
                    result = executeAddUploadBuffer(finalRequest);
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
    public java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(AddWorkingStorageRequest request) {

        return addWorkingStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddWorkingStorageResult> addWorkingStorageAsync(final AddWorkingStorageRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddWorkingStorageRequest, AddWorkingStorageResult> asyncHandler) {
        final AddWorkingStorageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddWorkingStorageResult>() {
            @Override
            public AddWorkingStorageResult call() throws Exception {
                AddWorkingStorageResult result = null;

                try {
                    result = executeAddWorkingStorage(finalRequest);
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
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest request) {

        return attachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachVolumeResult> attachVolumeAsync(final AttachVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachVolumeRequest, AttachVolumeResult> asyncHandler) {
        final AttachVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachVolumeResult>() {
            @Override
            public AttachVolumeResult call() throws Exception {
                AttachVolumeResult result = null;

                try {
                    result = executeAttachVolume(finalRequest);
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
    public java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(CancelArchivalRequest request) {

        return cancelArchivalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelArchivalResult> cancelArchivalAsync(final CancelArchivalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelArchivalRequest, CancelArchivalResult> asyncHandler) {
        final CancelArchivalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelArchivalResult>() {
            @Override
            public CancelArchivalResult call() throws Exception {
                CancelArchivalResult result = null;

                try {
                    result = executeCancelArchival(finalRequest);
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
    public java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(CancelRetrievalRequest request) {

        return cancelRetrievalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelRetrievalResult> cancelRetrievalAsync(final CancelRetrievalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelRetrievalRequest, CancelRetrievalResult> asyncHandler) {
        final CancelRetrievalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelRetrievalResult>() {
            @Override
            public CancelRetrievalResult call() throws Exception {
                CancelRetrievalResult result = null;

                try {
                    result = executeCancelRetrieval(finalRequest);
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
    public java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(CreateCachediSCSIVolumeRequest request) {

        return createCachediSCSIVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(final CreateCachediSCSIVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCachediSCSIVolumeRequest, CreateCachediSCSIVolumeResult> asyncHandler) {
        final CreateCachediSCSIVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCachediSCSIVolumeResult>() {
            @Override
            public CreateCachediSCSIVolumeResult call() throws Exception {
                CreateCachediSCSIVolumeResult result = null;

                try {
                    result = executeCreateCachediSCSIVolume(finalRequest);
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
    public java.util.concurrent.Future<CreateNFSFileShareResult> createNFSFileShareAsync(CreateNFSFileShareRequest request) {

        return createNFSFileShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNFSFileShareResult> createNFSFileShareAsync(final CreateNFSFileShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNFSFileShareRequest, CreateNFSFileShareResult> asyncHandler) {
        final CreateNFSFileShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNFSFileShareResult>() {
            @Override
            public CreateNFSFileShareResult call() throws Exception {
                CreateNFSFileShareResult result = null;

                try {
                    result = executeCreateNFSFileShare(finalRequest);
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
    public java.util.concurrent.Future<CreateSMBFileShareResult> createSMBFileShareAsync(CreateSMBFileShareRequest request) {

        return createSMBFileShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSMBFileShareResult> createSMBFileShareAsync(final CreateSMBFileShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSMBFileShareRequest, CreateSMBFileShareResult> asyncHandler) {
        final CreateSMBFileShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSMBFileShareResult>() {
            @Override
            public CreateSMBFileShareResult call() throws Exception {
                CreateSMBFileShareResult result = null;

                try {
                    result = executeCreateSMBFileShare(finalRequest);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {
        final CreateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result = null;

                try {
                    result = executeCreateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            CreateSnapshotFromVolumeRecoveryPointRequest request) {

        return createSnapshotFromVolumeRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(
            final CreateSnapshotFromVolumeRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotFromVolumeRecoveryPointRequest, CreateSnapshotFromVolumeRecoveryPointResult> asyncHandler) {
        final CreateSnapshotFromVolumeRecoveryPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotFromVolumeRecoveryPointResult>() {
            @Override
            public CreateSnapshotFromVolumeRecoveryPointResult call() throws Exception {
                CreateSnapshotFromVolumeRecoveryPointResult result = null;

                try {
                    result = executeCreateSnapshotFromVolumeRecoveryPoint(finalRequest);
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
    public java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(CreateStorediSCSIVolumeRequest request) {

        return createStorediSCSIVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(final CreateStorediSCSIVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStorediSCSIVolumeRequest, CreateStorediSCSIVolumeResult> asyncHandler) {
        final CreateStorediSCSIVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStorediSCSIVolumeResult>() {
            @Override
            public CreateStorediSCSIVolumeResult call() throws Exception {
                CreateStorediSCSIVolumeResult result = null;

                try {
                    result = executeCreateStorediSCSIVolume(finalRequest);
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
    public java.util.concurrent.Future<CreateTapeWithBarcodeResult> createTapeWithBarcodeAsync(CreateTapeWithBarcodeRequest request) {

        return createTapeWithBarcodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTapeWithBarcodeResult> createTapeWithBarcodeAsync(final CreateTapeWithBarcodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTapeWithBarcodeRequest, CreateTapeWithBarcodeResult> asyncHandler) {
        final CreateTapeWithBarcodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTapeWithBarcodeResult>() {
            @Override
            public CreateTapeWithBarcodeResult call() throws Exception {
                CreateTapeWithBarcodeResult result = null;

                try {
                    result = executeCreateTapeWithBarcode(finalRequest);
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
    public java.util.concurrent.Future<CreateTapesResult> createTapesAsync(CreateTapesRequest request) {

        return createTapesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTapesResult> createTapesAsync(final CreateTapesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTapesRequest, CreateTapesResult> asyncHandler) {
        final CreateTapesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTapesResult>() {
            @Override
            public CreateTapesResult call() throws Exception {
                CreateTapesResult result = null;

                try {
                    result = executeCreateTapes(finalRequest);
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
    public java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(DeleteBandwidthRateLimitRequest request) {

        return deleteBandwidthRateLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(final DeleteBandwidthRateLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBandwidthRateLimitRequest, DeleteBandwidthRateLimitResult> asyncHandler) {
        final DeleteBandwidthRateLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBandwidthRateLimitResult>() {
            @Override
            public DeleteBandwidthRateLimitResult call() throws Exception {
                DeleteBandwidthRateLimitResult result = null;

                try {
                    result = executeDeleteBandwidthRateLimit(finalRequest);
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
    public java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(DeleteChapCredentialsRequest request) {

        return deleteChapCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(final DeleteChapCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChapCredentialsRequest, DeleteChapCredentialsResult> asyncHandler) {
        final DeleteChapCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChapCredentialsResult>() {
            @Override
            public DeleteChapCredentialsResult call() throws Exception {
                DeleteChapCredentialsResult result = null;

                try {
                    result = executeDeleteChapCredentials(finalRequest);
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
    public java.util.concurrent.Future<DeleteFileShareResult> deleteFileShareAsync(DeleteFileShareRequest request) {

        return deleteFileShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileShareResult> deleteFileShareAsync(final DeleteFileShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileShareRequest, DeleteFileShareResult> asyncHandler) {
        final DeleteFileShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFileShareResult>() {
            @Override
            public DeleteFileShareResult call() throws Exception {
                DeleteFileShareResult result = null;

                try {
                    result = executeDeleteFileShare(finalRequest);
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
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest request) {

        return deleteGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(final DeleteGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler) {
        final DeleteGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGatewayResult>() {
            @Override
            public DeleteGatewayResult call() throws Exception {
                DeleteGatewayResult result = null;

                try {
                    result = executeDeleteGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest request) {

        return deleteSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(final DeleteSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler) {
        final DeleteSnapshotScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotScheduleResult>() {
            @Override
            public DeleteSnapshotScheduleResult call() throws Exception {
                DeleteSnapshotScheduleResult result = null;

                try {
                    result = executeDeleteSnapshotSchedule(finalRequest);
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
    public java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(DeleteTapeRequest request) {

        return deleteTapeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTapeResult> deleteTapeAsync(final DeleteTapeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTapeRequest, DeleteTapeResult> asyncHandler) {
        final DeleteTapeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTapeResult>() {
            @Override
            public DeleteTapeResult call() throws Exception {
                DeleteTapeResult result = null;

                try {
                    result = executeDeleteTape(finalRequest);
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
    public java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(DeleteTapeArchiveRequest request) {

        return deleteTapeArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTapeArchiveResult> deleteTapeArchiveAsync(final DeleteTapeArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTapeArchiveRequest, DeleteTapeArchiveResult> asyncHandler) {
        final DeleteTapeArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTapeArchiveResult>() {
            @Override
            public DeleteTapeArchiveResult call() throws Exception {
                DeleteTapeArchiveResult result = null;

                try {
                    result = executeDeleteTapeArchive(finalRequest);
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
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest request) {

        return deleteVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVolumeResult> deleteVolumeAsync(final DeleteVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler) {
        final DeleteVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVolumeResult>() {
            @Override
            public DeleteVolumeResult call() throws Exception {
                DeleteVolumeResult result = null;

                try {
                    result = executeDeleteVolume(finalRequest);
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
    public java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(DescribeBandwidthRateLimitRequest request) {

        return describeBandwidthRateLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(final DescribeBandwidthRateLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBandwidthRateLimitRequest, DescribeBandwidthRateLimitResult> asyncHandler) {
        final DescribeBandwidthRateLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBandwidthRateLimitResult>() {
            @Override
            public DescribeBandwidthRateLimitResult call() throws Exception {
                DescribeBandwidthRateLimitResult result = null;

                try {
                    result = executeDescribeBandwidthRateLimit(finalRequest);
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
    public java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(DescribeCacheRequest request) {

        return describeCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheResult> describeCacheAsync(final DescribeCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCacheRequest, DescribeCacheResult> asyncHandler) {
        final DescribeCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCacheResult>() {
            @Override
            public DescribeCacheResult call() throws Exception {
                DescribeCacheResult result = null;

                try {
                    result = executeDescribeCache(finalRequest);
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
    public java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(DescribeCachediSCSIVolumesRequest request) {

        return describeCachediSCSIVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(final DescribeCachediSCSIVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCachediSCSIVolumesRequest, DescribeCachediSCSIVolumesResult> asyncHandler) {
        final DescribeCachediSCSIVolumesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCachediSCSIVolumesResult>() {
            @Override
            public DescribeCachediSCSIVolumesResult call() throws Exception {
                DescribeCachediSCSIVolumesResult result = null;

                try {
                    result = executeDescribeCachediSCSIVolumes(finalRequest);
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
    public java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(DescribeChapCredentialsRequest request) {

        return describeChapCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(final DescribeChapCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChapCredentialsRequest, DescribeChapCredentialsResult> asyncHandler) {
        final DescribeChapCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChapCredentialsResult>() {
            @Override
            public DescribeChapCredentialsResult call() throws Exception {
                DescribeChapCredentialsResult result = null;

                try {
                    result = executeDescribeChapCredentials(finalRequest);
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
    public java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(DescribeGatewayInformationRequest request) {

        return describeGatewayInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(final DescribeGatewayInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGatewayInformationRequest, DescribeGatewayInformationResult> asyncHandler) {
        final DescribeGatewayInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGatewayInformationResult>() {
            @Override
            public DescribeGatewayInformationResult call() throws Exception {
                DescribeGatewayInformationResult result = null;

                try {
                    result = executeDescribeGatewayInformation(finalRequest);
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
    public java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(DescribeMaintenanceStartTimeRequest request) {

        return describeMaintenanceStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(final DescribeMaintenanceStartTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceStartTimeRequest, DescribeMaintenanceStartTimeResult> asyncHandler) {
        final DescribeMaintenanceStartTimeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceStartTimeResult>() {
            @Override
            public DescribeMaintenanceStartTimeResult call() throws Exception {
                DescribeMaintenanceStartTimeResult result = null;

                try {
                    result = executeDescribeMaintenanceStartTime(finalRequest);
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
    public java.util.concurrent.Future<DescribeNFSFileSharesResult> describeNFSFileSharesAsync(DescribeNFSFileSharesRequest request) {

        return describeNFSFileSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNFSFileSharesResult> describeNFSFileSharesAsync(final DescribeNFSFileSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNFSFileSharesRequest, DescribeNFSFileSharesResult> asyncHandler) {
        final DescribeNFSFileSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNFSFileSharesResult>() {
            @Override
            public DescribeNFSFileSharesResult call() throws Exception {
                DescribeNFSFileSharesResult result = null;

                try {
                    result = executeDescribeNFSFileShares(finalRequest);
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
    public java.util.concurrent.Future<DescribeSMBFileSharesResult> describeSMBFileSharesAsync(DescribeSMBFileSharesRequest request) {

        return describeSMBFileSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSMBFileSharesResult> describeSMBFileSharesAsync(final DescribeSMBFileSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSMBFileSharesRequest, DescribeSMBFileSharesResult> asyncHandler) {
        final DescribeSMBFileSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSMBFileSharesResult>() {
            @Override
            public DescribeSMBFileSharesResult call() throws Exception {
                DescribeSMBFileSharesResult result = null;

                try {
                    result = executeDescribeSMBFileShares(finalRequest);
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
    public java.util.concurrent.Future<DescribeSMBSettingsResult> describeSMBSettingsAsync(DescribeSMBSettingsRequest request) {

        return describeSMBSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSMBSettingsResult> describeSMBSettingsAsync(final DescribeSMBSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSMBSettingsRequest, DescribeSMBSettingsResult> asyncHandler) {
        final DescribeSMBSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSMBSettingsResult>() {
            @Override
            public DescribeSMBSettingsResult call() throws Exception {
                DescribeSMBSettingsResult result = null;

                try {
                    result = executeDescribeSMBSettings(finalRequest);
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
    public java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(DescribeSnapshotScheduleRequest request) {

        return describeSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(final DescribeSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotScheduleRequest, DescribeSnapshotScheduleResult> asyncHandler) {
        final DescribeSnapshotScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotScheduleResult>() {
            @Override
            public DescribeSnapshotScheduleResult call() throws Exception {
                DescribeSnapshotScheduleResult result = null;

                try {
                    result = executeDescribeSnapshotSchedule(finalRequest);
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
    public java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(DescribeStorediSCSIVolumesRequest request) {

        return describeStorediSCSIVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(final DescribeStorediSCSIVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStorediSCSIVolumesRequest, DescribeStorediSCSIVolumesResult> asyncHandler) {
        final DescribeStorediSCSIVolumesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStorediSCSIVolumesResult>() {
            @Override
            public DescribeStorediSCSIVolumesResult call() throws Exception {
                DescribeStorediSCSIVolumesResult result = null;

                try {
                    result = executeDescribeStorediSCSIVolumes(finalRequest);
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
    public java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(DescribeTapeArchivesRequest request) {

        return describeTapeArchivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTapeArchivesResult> describeTapeArchivesAsync(final DescribeTapeArchivesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTapeArchivesRequest, DescribeTapeArchivesResult> asyncHandler) {
        final DescribeTapeArchivesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTapeArchivesResult>() {
            @Override
            public DescribeTapeArchivesResult call() throws Exception {
                DescribeTapeArchivesResult result = null;

                try {
                    result = executeDescribeTapeArchives(finalRequest);
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
    @Override
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
        final DescribeTapeRecoveryPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTapeRecoveryPointsResult>() {
            @Override
            public DescribeTapeRecoveryPointsResult call() throws Exception {
                DescribeTapeRecoveryPointsResult result = null;

                try {
                    result = executeDescribeTapeRecoveryPoints(finalRequest);
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
    public java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(DescribeTapesRequest request) {

        return describeTapesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTapesResult> describeTapesAsync(final DescribeTapesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTapesRequest, DescribeTapesResult> asyncHandler) {
        final DescribeTapesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTapesResult>() {
            @Override
            public DescribeTapesResult call() throws Exception {
                DescribeTapesResult result = null;

                try {
                    result = executeDescribeTapes(finalRequest);
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
    public java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(DescribeUploadBufferRequest request) {

        return describeUploadBufferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUploadBufferResult> describeUploadBufferAsync(final DescribeUploadBufferRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUploadBufferRequest, DescribeUploadBufferResult> asyncHandler) {
        final DescribeUploadBufferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUploadBufferResult>() {
            @Override
            public DescribeUploadBufferResult call() throws Exception {
                DescribeUploadBufferResult result = null;

                try {
                    result = executeDescribeUploadBuffer(finalRequest);
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
    public java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(DescribeVTLDevicesRequest request) {

        return describeVTLDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVTLDevicesResult> describeVTLDevicesAsync(final DescribeVTLDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVTLDevicesRequest, DescribeVTLDevicesResult> asyncHandler) {
        final DescribeVTLDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVTLDevicesResult>() {
            @Override
            public DescribeVTLDevicesResult call() throws Exception {
                DescribeVTLDevicesResult result = null;

                try {
                    result = executeDescribeVTLDevices(finalRequest);
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
    public java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(DescribeWorkingStorageRequest request) {

        return describeWorkingStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(final DescribeWorkingStorageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkingStorageRequest, DescribeWorkingStorageResult> asyncHandler) {
        final DescribeWorkingStorageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeWorkingStorageResult>() {
            @Override
            public DescribeWorkingStorageResult call() throws Exception {
                DescribeWorkingStorageResult result = null;

                try {
                    result = executeDescribeWorkingStorage(finalRequest);
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
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest request) {

        return detachVolumeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachVolumeResult> detachVolumeAsync(final DetachVolumeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachVolumeRequest, DetachVolumeResult> asyncHandler) {
        final DetachVolumeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachVolumeResult>() {
            @Override
            public DetachVolumeResult call() throws Exception {
                DetachVolumeResult result = null;

                try {
                    result = executeDetachVolume(finalRequest);
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
    public java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(DisableGatewayRequest request) {

        return disableGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableGatewayResult> disableGatewayAsync(final DisableGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableGatewayRequest, DisableGatewayResult> asyncHandler) {
        final DisableGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableGatewayResult>() {
            @Override
            public DisableGatewayResult call() throws Exception {
                DisableGatewayResult result = null;

                try {
                    result = executeDisableGateway(finalRequest);
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
    public java.util.concurrent.Future<JoinDomainResult> joinDomainAsync(JoinDomainRequest request) {

        return joinDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<JoinDomainResult> joinDomainAsync(final JoinDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<JoinDomainRequest, JoinDomainResult> asyncHandler) {
        final JoinDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<JoinDomainResult>() {
            @Override
            public JoinDomainResult call() throws Exception {
                JoinDomainResult result = null;

                try {
                    result = executeJoinDomain(finalRequest);
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
    public java.util.concurrent.Future<ListFileSharesResult> listFileSharesAsync(ListFileSharesRequest request) {

        return listFileSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFileSharesResult> listFileSharesAsync(final ListFileSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFileSharesRequest, ListFileSharesResult> asyncHandler) {
        final ListFileSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFileSharesResult>() {
            @Override
            public ListFileSharesResult call() throws Exception {
                ListFileSharesResult result = null;

                try {
                    result = executeListFileShares(finalRequest);
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
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request) {

        return listGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(final ListGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {
        final ListGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGatewaysResult>() {
            @Override
            public ListGatewaysResult call() throws Exception {
                ListGatewaysResult result = null;

                try {
                    result = executeListGateways(finalRequest);
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
    @Override
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
        final ListLocalDisksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLocalDisksResult>() {
            @Override
            public ListLocalDisksResult call() throws Exception {
                ListLocalDisksResult result = null;

                try {
                    result = executeListLocalDisks(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    @Override
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
        final ListTapesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTapesResult>() {
            @Override
            public ListTapesResult call() throws Exception {
                ListTapesResult result = null;

                try {
                    result = executeListTapes(finalRequest);
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
    public java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(ListVolumeInitiatorsRequest request) {

        return listVolumeInitiatorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVolumeInitiatorsResult> listVolumeInitiatorsAsync(final ListVolumeInitiatorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVolumeInitiatorsRequest, ListVolumeInitiatorsResult> asyncHandler) {
        final ListVolumeInitiatorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVolumeInitiatorsResult>() {
            @Override
            public ListVolumeInitiatorsResult call() throws Exception {
                ListVolumeInitiatorsResult result = null;

                try {
                    result = executeListVolumeInitiators(finalRequest);
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
    public java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(ListVolumeRecoveryPointsRequest request) {

        return listVolumeRecoveryPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(final ListVolumeRecoveryPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVolumeRecoveryPointsRequest, ListVolumeRecoveryPointsResult> asyncHandler) {
        final ListVolumeRecoveryPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVolumeRecoveryPointsResult>() {
            @Override
            public ListVolumeRecoveryPointsResult call() throws Exception {
                ListVolumeRecoveryPointsResult result = null;

                try {
                    result = executeListVolumeRecoveryPoints(finalRequest);
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
    public java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(ListVolumesRequest request) {

        return listVolumesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVolumesResult> listVolumesAsync(final ListVolumesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVolumesRequest, ListVolumesResult> asyncHandler) {
        final ListVolumesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVolumesResult>() {
            @Override
            public ListVolumesResult call() throws Exception {
                ListVolumesResult result = null;

                try {
                    result = executeListVolumes(finalRequest);
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
    public java.util.concurrent.Future<NotifyWhenUploadedResult> notifyWhenUploadedAsync(NotifyWhenUploadedRequest request) {

        return notifyWhenUploadedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyWhenUploadedResult> notifyWhenUploadedAsync(final NotifyWhenUploadedRequest request,
            final com.amazonaws.handlers.AsyncHandler<NotifyWhenUploadedRequest, NotifyWhenUploadedResult> asyncHandler) {
        final NotifyWhenUploadedRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<NotifyWhenUploadedResult>() {
            @Override
            public NotifyWhenUploadedResult call() throws Exception {
                NotifyWhenUploadedResult result = null;

                try {
                    result = executeNotifyWhenUploaded(finalRequest);
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
    public java.util.concurrent.Future<RefreshCacheResult> refreshCacheAsync(RefreshCacheRequest request) {

        return refreshCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RefreshCacheResult> refreshCacheAsync(final RefreshCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<RefreshCacheRequest, RefreshCacheResult> asyncHandler) {
        final RefreshCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RefreshCacheResult>() {
            @Override
            public RefreshCacheResult call() throws Exception {
                RefreshCacheResult result = null;

                try {
                    result = executeRefreshCache(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {
        final RemoveTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result = null;

                try {
                    result = executeRemoveTagsFromResource(finalRequest);
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
    @Override
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
        final ResetCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetCacheResult>() {
            @Override
            public ResetCacheResult call() throws Exception {
                ResetCacheResult result = null;

                try {
                    result = executeResetCache(finalRequest);
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
    public java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(RetrieveTapeArchiveRequest request) {

        return retrieveTapeArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveTapeArchiveResult> retrieveTapeArchiveAsync(final RetrieveTapeArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetrieveTapeArchiveRequest, RetrieveTapeArchiveResult> asyncHandler) {
        final RetrieveTapeArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetrieveTapeArchiveResult>() {
            @Override
            public RetrieveTapeArchiveResult call() throws Exception {
                RetrieveTapeArchiveResult result = null;

                try {
                    result = executeRetrieveTapeArchive(finalRequest);
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
    public java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(RetrieveTapeRecoveryPointRequest request) {

        return retrieveTapeRecoveryPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveTapeRecoveryPointResult> retrieveTapeRecoveryPointAsync(final RetrieveTapeRecoveryPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetrieveTapeRecoveryPointRequest, RetrieveTapeRecoveryPointResult> asyncHandler) {
        final RetrieveTapeRecoveryPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetrieveTapeRecoveryPointResult>() {
            @Override
            public RetrieveTapeRecoveryPointResult call() throws Exception {
                RetrieveTapeRecoveryPointResult result = null;

                try {
                    result = executeRetrieveTapeRecoveryPoint(finalRequest);
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
    public java.util.concurrent.Future<SetLocalConsolePasswordResult> setLocalConsolePasswordAsync(SetLocalConsolePasswordRequest request) {

        return setLocalConsolePasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetLocalConsolePasswordResult> setLocalConsolePasswordAsync(final SetLocalConsolePasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetLocalConsolePasswordRequest, SetLocalConsolePasswordResult> asyncHandler) {
        final SetLocalConsolePasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetLocalConsolePasswordResult>() {
            @Override
            public SetLocalConsolePasswordResult call() throws Exception {
                SetLocalConsolePasswordResult result = null;

                try {
                    result = executeSetLocalConsolePassword(finalRequest);
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
    public java.util.concurrent.Future<SetSMBGuestPasswordResult> setSMBGuestPasswordAsync(SetSMBGuestPasswordRequest request) {

        return setSMBGuestPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetSMBGuestPasswordResult> setSMBGuestPasswordAsync(final SetSMBGuestPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetSMBGuestPasswordRequest, SetSMBGuestPasswordResult> asyncHandler) {
        final SetSMBGuestPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetSMBGuestPasswordResult>() {
            @Override
            public SetSMBGuestPasswordResult call() throws Exception {
                SetSMBGuestPasswordResult result = null;

                try {
                    result = executeSetSMBGuestPassword(finalRequest);
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
    public java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(ShutdownGatewayRequest request) {

        return shutdownGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ShutdownGatewayResult> shutdownGatewayAsync(final ShutdownGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<ShutdownGatewayRequest, ShutdownGatewayResult> asyncHandler) {
        final ShutdownGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ShutdownGatewayResult>() {
            @Override
            public ShutdownGatewayResult call() throws Exception {
                ShutdownGatewayResult result = null;

                try {
                    result = executeShutdownGateway(finalRequest);
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
    public java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(StartGatewayRequest request) {

        return startGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartGatewayResult> startGatewayAsync(final StartGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartGatewayRequest, StartGatewayResult> asyncHandler) {
        final StartGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartGatewayResult>() {
            @Override
            public StartGatewayResult call() throws Exception {
                StartGatewayResult result = null;

                try {
                    result = executeStartGateway(finalRequest);
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
    public java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(UpdateBandwidthRateLimitRequest request) {

        return updateBandwidthRateLimitAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(final UpdateBandwidthRateLimitRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBandwidthRateLimitRequest, UpdateBandwidthRateLimitResult> asyncHandler) {
        final UpdateBandwidthRateLimitRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBandwidthRateLimitResult>() {
            @Override
            public UpdateBandwidthRateLimitResult call() throws Exception {
                UpdateBandwidthRateLimitResult result = null;

                try {
                    result = executeUpdateBandwidthRateLimit(finalRequest);
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
    public java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(UpdateChapCredentialsRequest request) {

        return updateChapCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(final UpdateChapCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChapCredentialsRequest, UpdateChapCredentialsResult> asyncHandler) {
        final UpdateChapCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChapCredentialsResult>() {
            @Override
            public UpdateChapCredentialsResult call() throws Exception {
                UpdateChapCredentialsResult result = null;

                try {
                    result = executeUpdateChapCredentials(finalRequest);
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
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest request) {

        return updateGatewayInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(final UpdateGatewayInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler) {
        final UpdateGatewayInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayInformationResult>() {
            @Override
            public UpdateGatewayInformationResult call() throws Exception {
                UpdateGatewayInformationResult result = null;

                try {
                    result = executeUpdateGatewayInformation(finalRequest);
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
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest request) {

        return updateGatewaySoftwareNowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(final UpdateGatewaySoftwareNowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler) {
        final UpdateGatewaySoftwareNowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewaySoftwareNowResult>() {
            @Override
            public UpdateGatewaySoftwareNowResult call() throws Exception {
                UpdateGatewaySoftwareNowResult result = null;

                try {
                    result = executeUpdateGatewaySoftwareNow(finalRequest);
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
    public java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(UpdateMaintenanceStartTimeRequest request) {

        return updateMaintenanceStartTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(final UpdateMaintenanceStartTimeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceStartTimeRequest, UpdateMaintenanceStartTimeResult> asyncHandler) {
        final UpdateMaintenanceStartTimeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMaintenanceStartTimeResult>() {
            @Override
            public UpdateMaintenanceStartTimeResult call() throws Exception {
                UpdateMaintenanceStartTimeResult result = null;

                try {
                    result = executeUpdateMaintenanceStartTime(finalRequest);
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
    public java.util.concurrent.Future<UpdateNFSFileShareResult> updateNFSFileShareAsync(UpdateNFSFileShareRequest request) {

        return updateNFSFileShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNFSFileShareResult> updateNFSFileShareAsync(final UpdateNFSFileShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNFSFileShareRequest, UpdateNFSFileShareResult> asyncHandler) {
        final UpdateNFSFileShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNFSFileShareResult>() {
            @Override
            public UpdateNFSFileShareResult call() throws Exception {
                UpdateNFSFileShareResult result = null;

                try {
                    result = executeUpdateNFSFileShare(finalRequest);
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
    public java.util.concurrent.Future<UpdateSMBFileShareResult> updateSMBFileShareAsync(UpdateSMBFileShareRequest request) {

        return updateSMBFileShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSMBFileShareResult> updateSMBFileShareAsync(final UpdateSMBFileShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSMBFileShareRequest, UpdateSMBFileShareResult> asyncHandler) {
        final UpdateSMBFileShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSMBFileShareResult>() {
            @Override
            public UpdateSMBFileShareResult call() throws Exception {
                UpdateSMBFileShareResult result = null;

                try {
                    result = executeUpdateSMBFileShare(finalRequest);
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
    public java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(UpdateSnapshotScheduleRequest request) {

        return updateSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(final UpdateSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSnapshotScheduleRequest, UpdateSnapshotScheduleResult> asyncHandler) {
        final UpdateSnapshotScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSnapshotScheduleResult>() {
            @Override
            public UpdateSnapshotScheduleResult call() throws Exception {
                UpdateSnapshotScheduleResult result = null;

                try {
                    result = executeUpdateSnapshotSchedule(finalRequest);
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
    public java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(UpdateVTLDeviceTypeRequest request) {

        return updateVTLDeviceTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVTLDeviceTypeResult> updateVTLDeviceTypeAsync(final UpdateVTLDeviceTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVTLDeviceTypeRequest, UpdateVTLDeviceTypeResult> asyncHandler) {
        final UpdateVTLDeviceTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVTLDeviceTypeResult>() {
            @Override
            public UpdateVTLDeviceTypeResult call() throws Exception {
                UpdateVTLDeviceTypeResult result = null;

                try {
                    result = executeUpdateVTLDeviceType(finalRequest);
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
