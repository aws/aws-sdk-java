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
package com.amazonaws.services.lightsail;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon Lightsail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
 * Lightsail includes everything you need to launch your project quickly - a virtual machine, SSD-based storage, data
 * transfer, DNS management, and a static IP - for a low, predictable price. You manage those Lightsail servers through
 * the Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="http://lightsail.aws.amazon.com/ls/docs">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
 * keys. For details about how to set this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
@ThreadSafe
public class AmazonLightsailAsyncClient extends AmazonLightsailClient implements AmazonLightsailAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail. A credentials provider chain
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
    public AmazonLightsailAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonLightsailAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonLightsailAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonLightsailAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonLightsailAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonLightsailAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the provided AWS account
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
    public AmazonLightsailAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonLightsailAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonLightsailAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLightsailAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest request) {

        return allocateStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(final AllocateStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateStaticIpRequest, AllocateStaticIpResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AllocateStaticIpResult>() {
            @Override
            public AllocateStaticIpResult call() throws Exception {
                AllocateStaticIpResult result;

                try {
                    result = allocateStaticIp(request);
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
    public java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest request) {

        return attachStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(final AttachStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachStaticIpRequest, AttachStaticIpResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachStaticIpResult>() {
            @Override
            public AttachStaticIpResult call() throws Exception {
                AttachStaticIpResult result;

                try {
                    result = attachStaticIp(request);
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
    public java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest request) {

        return closeInstancePublicPortsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(final CloseInstancePublicPortsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CloseInstancePublicPortsRequest, CloseInstancePublicPortsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CloseInstancePublicPortsResult>() {
            @Override
            public CloseInstancePublicPortsResult call() throws Exception {
                CloseInstancePublicPortsResult result;

                try {
                    result = closeInstancePublicPorts(request);
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result;

                try {
                    result = createDomain(request);
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
    public java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest request) {

        return createDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(final CreateDomainEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainEntryRequest, CreateDomainEntryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainEntryResult>() {
            @Override
            public CreateDomainEntryResult call() throws Exception {
                CreateDomainEntryResult result;

                try {
                    result = createDomainEntry(request);
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
    public java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest request) {

        return createInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(final CreateInstanceSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceSnapshotRequest, CreateInstanceSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceSnapshotResult>() {
            @Override
            public CreateInstanceSnapshotResult call() throws Exception {
                CreateInstanceSnapshotResult result;

                try {
                    result = createInstanceSnapshot(request);
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
    public java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest request) {

        return createInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(final CreateInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstancesRequest, CreateInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateInstancesResult>() {
            @Override
            public CreateInstancesResult call() throws Exception {
                CreateInstancesResult result;

                try {
                    result = createInstances(request);
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
    public java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(CreateInstancesFromSnapshotRequest request) {

        return createInstancesFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(final CreateInstancesFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstancesFromSnapshotRequest, CreateInstancesFromSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateInstancesFromSnapshotResult>() {
            @Override
            public CreateInstancesFromSnapshotResult call() throws Exception {
                CreateInstancesFromSnapshotResult result;

                try {
                    result = createInstancesFromSnapshot(request);
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
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request) {

        return createKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(final CreateKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyPairResult>() {
            @Override
            public CreateKeyPairResult call() throws Exception {
                CreateKeyPairResult result;

                try {
                    result = createKeyPair(request);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result;

                try {
                    result = deleteDomain(request);
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
    public java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest request) {

        return deleteDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(final DeleteDomainEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainEntryRequest, DeleteDomainEntryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainEntryResult>() {
            @Override
            public DeleteDomainEntryResult call() throws Exception {
                DeleteDomainEntryResult result;

                try {
                    result = deleteDomainEntry(request);
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
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(final DeleteInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceResult>() {
            @Override
            public DeleteInstanceResult call() throws Exception {
                DeleteInstanceResult result;

                try {
                    result = deleteInstance(request);
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
    public java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest request) {

        return deleteInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(final DeleteInstanceSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceSnapshotRequest, DeleteInstanceSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceSnapshotResult>() {
            @Override
            public DeleteInstanceSnapshotResult call() throws Exception {
                DeleteInstanceSnapshotResult result;

                try {
                    result = deleteInstanceSnapshot(request);
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
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request) {

        return deleteKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(final DeleteKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyPairResult>() {
            @Override
            public DeleteKeyPairResult call() throws Exception {
                DeleteKeyPairResult result;

                try {
                    result = deleteKeyPair(request);
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
    public java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest request) {

        return detachStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(final DetachStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachStaticIpRequest, DetachStaticIpResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachStaticIpResult>() {
            @Override
            public DetachStaticIpResult call() throws Exception {
                DetachStaticIpResult result;

                try {
                    result = detachStaticIp(request);
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
    public java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest request) {

        return downloadDefaultKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(final DownloadDefaultKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<DownloadDefaultKeyPairRequest, DownloadDefaultKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DownloadDefaultKeyPairResult>() {
            @Override
            public DownloadDefaultKeyPairResult call() throws Exception {
                DownloadDefaultKeyPairResult result;

                try {
                    result = downloadDefaultKeyPair(request);
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
    public java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest request) {

        return getActiveNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(final GetActiveNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetActiveNamesRequest, GetActiveNamesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetActiveNamesResult>() {
            @Override
            public GetActiveNamesResult call() throws Exception {
                GetActiveNamesResult result;

                try {
                    result = getActiveNames(request);
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
    public java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest request) {

        return getBlueprintsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(final GetBlueprintsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBlueprintsRequest, GetBlueprintsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetBlueprintsResult>() {
            @Override
            public GetBlueprintsResult call() throws Exception {
                GetBlueprintsResult result;

                try {
                    result = getBlueprints(request);
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
    public java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest request) {

        return getBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(final GetBundlesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBundlesRequest, GetBundlesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetBundlesResult>() {
            @Override
            public GetBundlesResult call() throws Exception {
                GetBundlesResult result;

                try {
                    result = getBundles(request);
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
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request) {

        return getDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(final GetDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDomainResult>() {
            @Override
            public GetDomainResult call() throws Exception {
                GetDomainResult result;

                try {
                    result = getDomain(request);
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
    public java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest request) {

        return getDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(final GetDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainsRequest, GetDomainsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDomainsResult>() {
            @Override
            public GetDomainsResult call() throws Exception {
                GetDomainsResult result;

                try {
                    result = getDomains(request);
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
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest request) {

        return getInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(final GetInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceResult>() {
            @Override
            public GetInstanceResult call() throws Exception {
                GetInstanceResult result;

                try {
                    result = getInstance(request);
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
    public java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest request) {

        return getInstanceAccessDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(final GetInstanceAccessDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceAccessDetailsRequest, GetInstanceAccessDetailsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceAccessDetailsResult>() {
            @Override
            public GetInstanceAccessDetailsResult call() throws Exception {
                GetInstanceAccessDetailsResult result;

                try {
                    result = getInstanceAccessDetails(request);
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
    public java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest request) {

        return getInstanceMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(final GetInstanceMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceMetricDataRequest, GetInstanceMetricDataResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceMetricDataResult>() {
            @Override
            public GetInstanceMetricDataResult call() throws Exception {
                GetInstanceMetricDataResult result;

                try {
                    result = getInstanceMetricData(request);
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
    public java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest request) {

        return getInstancePortStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(final GetInstancePortStatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstancePortStatesRequest, GetInstancePortStatesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstancePortStatesResult>() {
            @Override
            public GetInstancePortStatesResult call() throws Exception {
                GetInstancePortStatesResult result;

                try {
                    result = getInstancePortStates(request);
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
    public java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest request) {

        return getInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(final GetInstanceSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotRequest, GetInstanceSnapshotResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceSnapshotResult>() {
            @Override
            public GetInstanceSnapshotResult call() throws Exception {
                GetInstanceSnapshotResult result;

                try {
                    result = getInstanceSnapshot(request);
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
    public java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest request) {

        return getInstanceSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(final GetInstanceSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotsRequest, GetInstanceSnapshotsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceSnapshotsResult>() {
            @Override
            public GetInstanceSnapshotsResult call() throws Exception {
                GetInstanceSnapshotsResult result;

                try {
                    result = getInstanceSnapshots(request);
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
    public java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest request) {

        return getInstanceStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(final GetInstanceStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceStateRequest, GetInstanceStateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceStateResult>() {
            @Override
            public GetInstanceStateResult call() throws Exception {
                GetInstanceStateResult result;

                try {
                    result = getInstanceState(request);
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
    public java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest request) {

        return getInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(final GetInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstancesRequest, GetInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInstancesResult>() {
            @Override
            public GetInstancesResult call() throws Exception {
                GetInstancesResult result;

                try {
                    result = getInstances(request);
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
    public java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest request) {

        return getKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(final GetKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyPairRequest, GetKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetKeyPairResult>() {
            @Override
            public GetKeyPairResult call() throws Exception {
                GetKeyPairResult result;

                try {
                    result = getKeyPair(request);
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
    public java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest request) {

        return getKeyPairsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(final GetKeyPairsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyPairsRequest, GetKeyPairsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetKeyPairsResult>() {
            @Override
            public GetKeyPairsResult call() throws Exception {
                GetKeyPairsResult result;

                try {
                    result = getKeyPairs(request);
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
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request) {

        return getOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(final GetOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetOperationResult>() {
            @Override
            public GetOperationResult call() throws Exception {
                GetOperationResult result;

                try {
                    result = getOperation(request);
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
    public java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest request) {

        return getOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(final GetOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationsRequest, GetOperationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetOperationsResult>() {
            @Override
            public GetOperationsResult call() throws Exception {
                GetOperationsResult result;

                try {
                    result = getOperations(request);
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
    public java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest request) {

        return getOperationsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(final GetOperationsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationsForResourceRequest, GetOperationsForResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetOperationsForResourceResult>() {
            @Override
            public GetOperationsForResourceResult call() throws Exception {
                GetOperationsForResourceResult result;

                try {
                    result = getOperationsForResource(request);
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
    public java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest request) {

        return getRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(final GetRegionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegionsRequest, GetRegionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRegionsResult>() {
            @Override
            public GetRegionsResult call() throws Exception {
                GetRegionsResult result;

                try {
                    result = getRegions(request);
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
    public java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest request) {

        return getStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(final GetStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStaticIpRequest, GetStaticIpResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetStaticIpResult>() {
            @Override
            public GetStaticIpResult call() throws Exception {
                GetStaticIpResult result;

                try {
                    result = getStaticIp(request);
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
    public java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest request) {

        return getStaticIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(final GetStaticIpsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStaticIpsRequest, GetStaticIpsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetStaticIpsResult>() {
            @Override
            public GetStaticIpsResult call() throws Exception {
                GetStaticIpsResult result;

                try {
                    result = getStaticIps(request);
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
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request) {

        return importKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(final ImportKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportKeyPairResult>() {
            @Override
            public ImportKeyPairResult call() throws Exception {
                ImportKeyPairResult result;

                try {
                    result = importKeyPair(request);
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
    public java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest request) {

        return isVpcPeeredAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(final IsVpcPeeredRequest request,
            final com.amazonaws.handlers.AsyncHandler<IsVpcPeeredRequest, IsVpcPeeredResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<IsVpcPeeredResult>() {
            @Override
            public IsVpcPeeredResult call() throws Exception {
                IsVpcPeeredResult result;

                try {
                    result = isVpcPeered(request);
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
    public java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest request) {

        return openInstancePublicPortsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(final OpenInstancePublicPortsRequest request,
            final com.amazonaws.handlers.AsyncHandler<OpenInstancePublicPortsRequest, OpenInstancePublicPortsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<OpenInstancePublicPortsResult>() {
            @Override
            public OpenInstancePublicPortsResult call() throws Exception {
                OpenInstancePublicPortsResult result;

                try {
                    result = openInstancePublicPorts(request);
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
    public java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest request) {

        return peerVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(final PeerVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<PeerVpcRequest, PeerVpcResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PeerVpcResult>() {
            @Override
            public PeerVpcResult call() throws Exception {
                PeerVpcResult result;

                try {
                    result = peerVpc(request);
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
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest request) {

        return rebootInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(final RebootInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RebootInstanceResult>() {
            @Override
            public RebootInstanceResult call() throws Exception {
                RebootInstanceResult result;

                try {
                    result = rebootInstance(request);
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
    public java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest request) {

        return releaseStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(final ReleaseStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseStaticIpRequest, ReleaseStaticIpResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReleaseStaticIpResult>() {
            @Override
            public ReleaseStaticIpResult call() throws Exception {
                ReleaseStaticIpResult result;

                try {
                    result = releaseStaticIp(request);
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
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest request) {

        return startInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(final StartInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartInstanceResult>() {
            @Override
            public StartInstanceResult call() throws Exception {
                StartInstanceResult result;

                try {
                    result = startInstance(request);
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
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest request) {

        return stopInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(final StopInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopInstanceResult>() {
            @Override
            public StopInstanceResult call() throws Exception {
                StopInstanceResult result;

                try {
                    result = stopInstance(request);
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
    public java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest request) {

        return unpeerVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(final UnpeerVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnpeerVpcRequest, UnpeerVpcResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UnpeerVpcResult>() {
            @Override
            public UnpeerVpcResult call() throws Exception {
                UnpeerVpcResult result;

                try {
                    result = unpeerVpc(request);
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
    public java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest request) {

        return updateDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(final UpdateDomainEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainEntryRequest, UpdateDomainEntryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainEntryResult>() {
            @Override
            public UpdateDomainEntryResult call() throws Exception {
                UpdateDomainEntryResult result;

                try {
                    result = updateDomainEntry(request);
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
