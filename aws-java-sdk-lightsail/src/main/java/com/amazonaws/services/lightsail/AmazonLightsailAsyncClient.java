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
package com.amazonaws.services.lightsail;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Lightsail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
 * Lightsail includes everything you need to launch your project quickly - a virtual machine, a managed database,
 * SSD-based storage, data transfer, DNS management, and a static IP - for a low, predictable price. You manage those
 * Lightsail servers through the Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="https://lightsail.aws.amazon.com/ls/docs/all">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
 * keys. For details about how to set this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/article/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonLightsailAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
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
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

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
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonLightsailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
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
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Lightsail using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
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
     * @deprecated use {@link AmazonLightsailAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonLightsailAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonLightsailAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonLightsailAsyncClientBuilder asyncBuilder() {
        return AmazonLightsailAsyncClientBuilder.standard();
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
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest request) {

        return allocateStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(final AllocateStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateStaticIpRequest, AllocateStaticIpResult> asyncHandler) {
        final AllocateStaticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllocateStaticIpResult>() {
            @Override
            public AllocateStaticIpResult call() throws Exception {
                AllocateStaticIpResult result = null;

                try {
                    result = executeAllocateStaticIp(finalRequest);
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
    public java.util.concurrent.Future<AttachDiskResult> attachDiskAsync(AttachDiskRequest request) {

        return attachDiskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachDiskResult> attachDiskAsync(final AttachDiskRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachDiskRequest, AttachDiskResult> asyncHandler) {
        final AttachDiskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachDiskResult>() {
            @Override
            public AttachDiskResult call() throws Exception {
                AttachDiskResult result = null;

                try {
                    result = executeAttachDisk(finalRequest);
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
    public java.util.concurrent.Future<AttachInstancesToLoadBalancerResult> attachInstancesToLoadBalancerAsync(AttachInstancesToLoadBalancerRequest request) {

        return attachInstancesToLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachInstancesToLoadBalancerResult> attachInstancesToLoadBalancerAsync(
            final AttachInstancesToLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachInstancesToLoadBalancerRequest, AttachInstancesToLoadBalancerResult> asyncHandler) {
        final AttachInstancesToLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachInstancesToLoadBalancerResult>() {
            @Override
            public AttachInstancesToLoadBalancerResult call() throws Exception {
                AttachInstancesToLoadBalancerResult result = null;

                try {
                    result = executeAttachInstancesToLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<AttachLoadBalancerTlsCertificateResult> attachLoadBalancerTlsCertificateAsync(
            AttachLoadBalancerTlsCertificateRequest request) {

        return attachLoadBalancerTlsCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancerTlsCertificateResult> attachLoadBalancerTlsCertificateAsync(
            final AttachLoadBalancerTlsCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerTlsCertificateRequest, AttachLoadBalancerTlsCertificateResult> asyncHandler) {
        final AttachLoadBalancerTlsCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachLoadBalancerTlsCertificateResult>() {
            @Override
            public AttachLoadBalancerTlsCertificateResult call() throws Exception {
                AttachLoadBalancerTlsCertificateResult result = null;

                try {
                    result = executeAttachLoadBalancerTlsCertificate(finalRequest);
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
    public java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest request) {

        return attachStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(final AttachStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachStaticIpRequest, AttachStaticIpResult> asyncHandler) {
        final AttachStaticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachStaticIpResult>() {
            @Override
            public AttachStaticIpResult call() throws Exception {
                AttachStaticIpResult result = null;

                try {
                    result = executeAttachStaticIp(finalRequest);
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
    public java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest request) {

        return closeInstancePublicPortsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(final CloseInstancePublicPortsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CloseInstancePublicPortsRequest, CloseInstancePublicPortsResult> asyncHandler) {
        final CloseInstancePublicPortsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CloseInstancePublicPortsResult>() {
            @Override
            public CloseInstancePublicPortsResult call() throws Exception {
                CloseInstancePublicPortsResult result = null;

                try {
                    result = executeCloseInstancePublicPorts(finalRequest);
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
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request) {

        return copySnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(final CopySnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler) {
        final CopySnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopySnapshotResult>() {
            @Override
            public CopySnapshotResult call() throws Exception {
                CopySnapshotResult result = null;

                try {
                    result = executeCopySnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateCloudFormationStackResult> createCloudFormationStackAsync(CreateCloudFormationStackRequest request) {

        return createCloudFormationStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudFormationStackResult> createCloudFormationStackAsync(final CreateCloudFormationStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCloudFormationStackRequest, CreateCloudFormationStackResult> asyncHandler) {
        final CreateCloudFormationStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCloudFormationStackResult>() {
            @Override
            public CreateCloudFormationStackResult call() throws Exception {
                CreateCloudFormationStackResult result = null;

                try {
                    result = executeCreateCloudFormationStack(finalRequest);
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
    public java.util.concurrent.Future<CreateDiskResult> createDiskAsync(CreateDiskRequest request) {

        return createDiskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDiskResult> createDiskAsync(final CreateDiskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDiskRequest, CreateDiskResult> asyncHandler) {
        final CreateDiskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDiskResult>() {
            @Override
            public CreateDiskResult call() throws Exception {
                CreateDiskResult result = null;

                try {
                    result = executeCreateDisk(finalRequest);
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
    public java.util.concurrent.Future<CreateDiskFromSnapshotResult> createDiskFromSnapshotAsync(CreateDiskFromSnapshotRequest request) {

        return createDiskFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDiskFromSnapshotResult> createDiskFromSnapshotAsync(final CreateDiskFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDiskFromSnapshotRequest, CreateDiskFromSnapshotResult> asyncHandler) {
        final CreateDiskFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDiskFromSnapshotResult>() {
            @Override
            public CreateDiskFromSnapshotResult call() throws Exception {
                CreateDiskFromSnapshotResult result = null;

                try {
                    result = executeCreateDiskFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateDiskSnapshotResult> createDiskSnapshotAsync(CreateDiskSnapshotRequest request) {

        return createDiskSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDiskSnapshotResult> createDiskSnapshotAsync(final CreateDiskSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDiskSnapshotRequest, CreateDiskSnapshotResult> asyncHandler) {
        final CreateDiskSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDiskSnapshotResult>() {
            @Override
            public CreateDiskSnapshotResult call() throws Exception {
                CreateDiskSnapshotResult result = null;

                try {
                    result = executeCreateDiskSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
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
    public java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest request) {

        return createDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(final CreateDomainEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainEntryRequest, CreateDomainEntryResult> asyncHandler) {
        final CreateDomainEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainEntryResult>() {
            @Override
            public CreateDomainEntryResult call() throws Exception {
                CreateDomainEntryResult result = null;

                try {
                    result = executeCreateDomainEntry(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest request) {

        return createInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(final CreateInstanceSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceSnapshotRequest, CreateInstanceSnapshotResult> asyncHandler) {
        final CreateInstanceSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceSnapshotResult>() {
            @Override
            public CreateInstanceSnapshotResult call() throws Exception {
                CreateInstanceSnapshotResult result = null;

                try {
                    result = executeCreateInstanceSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest request) {

        return createInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(final CreateInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstancesRequest, CreateInstancesResult> asyncHandler) {
        final CreateInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstancesResult>() {
            @Override
            public CreateInstancesResult call() throws Exception {
                CreateInstancesResult result = null;

                try {
                    result = executeCreateInstances(finalRequest);
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
    public java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(CreateInstancesFromSnapshotRequest request) {

        return createInstancesFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(final CreateInstancesFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstancesFromSnapshotRequest, CreateInstancesFromSnapshotResult> asyncHandler) {
        final CreateInstancesFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstancesFromSnapshotResult>() {
            @Override
            public CreateInstancesFromSnapshotResult call() throws Exception {
                CreateInstancesFromSnapshotResult result = null;

                try {
                    result = executeCreateInstancesFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest request) {

        return createKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(final CreateKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler) {
        final CreateKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyPairResult>() {
            @Override
            public CreateKeyPairResult call() throws Exception {
                CreateKeyPairResult result = null;

                try {
                    result = executeCreateKeyPair(finalRequest);
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
    public java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest request) {

        return createLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(final CreateLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler) {
        final CreateLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLoadBalancerResult>() {
            @Override
            public CreateLoadBalancerResult call() throws Exception {
                CreateLoadBalancerResult result = null;

                try {
                    result = executeCreateLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<CreateLoadBalancerTlsCertificateResult> createLoadBalancerTlsCertificateAsync(
            CreateLoadBalancerTlsCertificateRequest request) {

        return createLoadBalancerTlsCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoadBalancerTlsCertificateResult> createLoadBalancerTlsCertificateAsync(
            final CreateLoadBalancerTlsCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerTlsCertificateRequest, CreateLoadBalancerTlsCertificateResult> asyncHandler) {
        final CreateLoadBalancerTlsCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLoadBalancerTlsCertificateResult>() {
            @Override
            public CreateLoadBalancerTlsCertificateResult call() throws Exception {
                CreateLoadBalancerTlsCertificateResult result = null;

                try {
                    result = executeCreateLoadBalancerTlsCertificate(finalRequest);
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
    public java.util.concurrent.Future<CreateRelationalDatabaseResult> createRelationalDatabaseAsync(CreateRelationalDatabaseRequest request) {

        return createRelationalDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRelationalDatabaseResult> createRelationalDatabaseAsync(final CreateRelationalDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseRequest, CreateRelationalDatabaseResult> asyncHandler) {
        final CreateRelationalDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRelationalDatabaseResult>() {
            @Override
            public CreateRelationalDatabaseResult call() throws Exception {
                CreateRelationalDatabaseResult result = null;

                try {
                    result = executeCreateRelationalDatabase(finalRequest);
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
    public java.util.concurrent.Future<CreateRelationalDatabaseFromSnapshotResult> createRelationalDatabaseFromSnapshotAsync(
            CreateRelationalDatabaseFromSnapshotRequest request) {

        return createRelationalDatabaseFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRelationalDatabaseFromSnapshotResult> createRelationalDatabaseFromSnapshotAsync(
            final CreateRelationalDatabaseFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseFromSnapshotRequest, CreateRelationalDatabaseFromSnapshotResult> asyncHandler) {
        final CreateRelationalDatabaseFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRelationalDatabaseFromSnapshotResult>() {
            @Override
            public CreateRelationalDatabaseFromSnapshotResult call() throws Exception {
                CreateRelationalDatabaseFromSnapshotResult result = null;

                try {
                    result = executeCreateRelationalDatabaseFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateRelationalDatabaseSnapshotResult> createRelationalDatabaseSnapshotAsync(
            CreateRelationalDatabaseSnapshotRequest request) {

        return createRelationalDatabaseSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRelationalDatabaseSnapshotResult> createRelationalDatabaseSnapshotAsync(
            final CreateRelationalDatabaseSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRelationalDatabaseSnapshotRequest, CreateRelationalDatabaseSnapshotResult> asyncHandler) {
        final CreateRelationalDatabaseSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRelationalDatabaseSnapshotResult>() {
            @Override
            public CreateRelationalDatabaseSnapshotResult call() throws Exception {
                CreateRelationalDatabaseSnapshotResult result = null;

                try {
                    result = executeCreateRelationalDatabaseSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteDiskResult> deleteDiskAsync(DeleteDiskRequest request) {

        return deleteDiskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiskResult> deleteDiskAsync(final DeleteDiskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDiskRequest, DeleteDiskResult> asyncHandler) {
        final DeleteDiskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDiskResult>() {
            @Override
            public DeleteDiskResult call() throws Exception {
                DeleteDiskResult result = null;

                try {
                    result = executeDeleteDisk(finalRequest);
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
    public java.util.concurrent.Future<DeleteDiskSnapshotResult> deleteDiskSnapshotAsync(DeleteDiskSnapshotRequest request) {

        return deleteDiskSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDiskSnapshotResult> deleteDiskSnapshotAsync(final DeleteDiskSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDiskSnapshotRequest, DeleteDiskSnapshotResult> asyncHandler) {
        final DeleteDiskSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDiskSnapshotResult>() {
            @Override
            public DeleteDiskSnapshotResult call() throws Exception {
                DeleteDiskSnapshotResult result = null;

                try {
                    result = executeDeleteDiskSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {
        final DeleteDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result = null;

                try {
                    result = executeDeleteDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest request) {

        return deleteDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(final DeleteDomainEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainEntryRequest, DeleteDomainEntryResult> asyncHandler) {
        final DeleteDomainEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainEntryResult>() {
            @Override
            public DeleteDomainEntryResult call() throws Exception {
                DeleteDomainEntryResult result = null;

                try {
                    result = executeDeleteDomainEntry(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(final DeleteInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler) {
        final DeleteInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceResult>() {
            @Override
            public DeleteInstanceResult call() throws Exception {
                DeleteInstanceResult result = null;

                try {
                    result = executeDeleteInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest request) {

        return deleteInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(final DeleteInstanceSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceSnapshotRequest, DeleteInstanceSnapshotResult> asyncHandler) {
        final DeleteInstanceSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceSnapshotResult>() {
            @Override
            public DeleteInstanceSnapshotResult call() throws Exception {
                DeleteInstanceSnapshotResult result = null;

                try {
                    result = executeDeleteInstanceSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest request) {

        return deleteKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(final DeleteKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler) {
        final DeleteKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyPairResult>() {
            @Override
            public DeleteKeyPairResult call() throws Exception {
                DeleteKeyPairResult result = null;

                try {
                    result = executeDeleteKeyPair(finalRequest);
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
    public java.util.concurrent.Future<DeleteKnownHostKeysResult> deleteKnownHostKeysAsync(DeleteKnownHostKeysRequest request) {

        return deleteKnownHostKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKnownHostKeysResult> deleteKnownHostKeysAsync(final DeleteKnownHostKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKnownHostKeysRequest, DeleteKnownHostKeysResult> asyncHandler) {
        final DeleteKnownHostKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKnownHostKeysResult>() {
            @Override
            public DeleteKnownHostKeysResult call() throws Exception {
                DeleteKnownHostKeysResult result = null;

                try {
                    result = executeDeleteKnownHostKeys(finalRequest);
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
    public java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request) {

        return deleteLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(final DeleteLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler) {
        final DeleteLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoadBalancerResult>() {
            @Override
            public DeleteLoadBalancerResult call() throws Exception {
                DeleteLoadBalancerResult result = null;

                try {
                    result = executeDeleteLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<DeleteLoadBalancerTlsCertificateResult> deleteLoadBalancerTlsCertificateAsync(
            DeleteLoadBalancerTlsCertificateRequest request) {

        return deleteLoadBalancerTlsCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoadBalancerTlsCertificateResult> deleteLoadBalancerTlsCertificateAsync(
            final DeleteLoadBalancerTlsCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerTlsCertificateRequest, DeleteLoadBalancerTlsCertificateResult> asyncHandler) {
        final DeleteLoadBalancerTlsCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoadBalancerTlsCertificateResult>() {
            @Override
            public DeleteLoadBalancerTlsCertificateResult call() throws Exception {
                DeleteLoadBalancerTlsCertificateResult result = null;

                try {
                    result = executeDeleteLoadBalancerTlsCertificate(finalRequest);
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
    public java.util.concurrent.Future<DeleteRelationalDatabaseResult> deleteRelationalDatabaseAsync(DeleteRelationalDatabaseRequest request) {

        return deleteRelationalDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRelationalDatabaseResult> deleteRelationalDatabaseAsync(final DeleteRelationalDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRelationalDatabaseRequest, DeleteRelationalDatabaseResult> asyncHandler) {
        final DeleteRelationalDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRelationalDatabaseResult>() {
            @Override
            public DeleteRelationalDatabaseResult call() throws Exception {
                DeleteRelationalDatabaseResult result = null;

                try {
                    result = executeDeleteRelationalDatabase(finalRequest);
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
    public java.util.concurrent.Future<DeleteRelationalDatabaseSnapshotResult> deleteRelationalDatabaseSnapshotAsync(
            DeleteRelationalDatabaseSnapshotRequest request) {

        return deleteRelationalDatabaseSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRelationalDatabaseSnapshotResult> deleteRelationalDatabaseSnapshotAsync(
            final DeleteRelationalDatabaseSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRelationalDatabaseSnapshotRequest, DeleteRelationalDatabaseSnapshotResult> asyncHandler) {
        final DeleteRelationalDatabaseSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRelationalDatabaseSnapshotResult>() {
            @Override
            public DeleteRelationalDatabaseSnapshotResult call() throws Exception {
                DeleteRelationalDatabaseSnapshotResult result = null;

                try {
                    result = executeDeleteRelationalDatabaseSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DetachDiskResult> detachDiskAsync(DetachDiskRequest request) {

        return detachDiskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachDiskResult> detachDiskAsync(final DetachDiskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachDiskRequest, DetachDiskResult> asyncHandler) {
        final DetachDiskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachDiskResult>() {
            @Override
            public DetachDiskResult call() throws Exception {
                DetachDiskResult result = null;

                try {
                    result = executeDetachDisk(finalRequest);
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
    public java.util.concurrent.Future<DetachInstancesFromLoadBalancerResult> detachInstancesFromLoadBalancerAsync(
            DetachInstancesFromLoadBalancerRequest request) {

        return detachInstancesFromLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachInstancesFromLoadBalancerResult> detachInstancesFromLoadBalancerAsync(
            final DetachInstancesFromLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachInstancesFromLoadBalancerRequest, DetachInstancesFromLoadBalancerResult> asyncHandler) {
        final DetachInstancesFromLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachInstancesFromLoadBalancerResult>() {
            @Override
            public DetachInstancesFromLoadBalancerResult call() throws Exception {
                DetachInstancesFromLoadBalancerResult result = null;

                try {
                    result = executeDetachInstancesFromLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest request) {

        return detachStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(final DetachStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachStaticIpRequest, DetachStaticIpResult> asyncHandler) {
        final DetachStaticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachStaticIpResult>() {
            @Override
            public DetachStaticIpResult call() throws Exception {
                DetachStaticIpResult result = null;

                try {
                    result = executeDetachStaticIp(finalRequest);
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
    public java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest request) {

        return downloadDefaultKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(final DownloadDefaultKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<DownloadDefaultKeyPairRequest, DownloadDefaultKeyPairResult> asyncHandler) {
        final DownloadDefaultKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DownloadDefaultKeyPairResult>() {
            @Override
            public DownloadDefaultKeyPairResult call() throws Exception {
                DownloadDefaultKeyPairResult result = null;

                try {
                    result = executeDownloadDefaultKeyPair(finalRequest);
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
    public java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest request) {

        return exportSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(final ExportSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportSnapshotRequest, ExportSnapshotResult> asyncHandler) {
        final ExportSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportSnapshotResult>() {
            @Override
            public ExportSnapshotResult call() throws Exception {
                ExportSnapshotResult result = null;

                try {
                    result = executeExportSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest request) {

        return getActiveNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(final GetActiveNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetActiveNamesRequest, GetActiveNamesResult> asyncHandler) {
        final GetActiveNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetActiveNamesResult>() {
            @Override
            public GetActiveNamesResult call() throws Exception {
                GetActiveNamesResult result = null;

                try {
                    result = executeGetActiveNames(finalRequest);
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
    public java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest request) {

        return getBlueprintsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(final GetBlueprintsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBlueprintsRequest, GetBlueprintsResult> asyncHandler) {
        final GetBlueprintsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBlueprintsResult>() {
            @Override
            public GetBlueprintsResult call() throws Exception {
                GetBlueprintsResult result = null;

                try {
                    result = executeGetBlueprints(finalRequest);
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
    public java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest request) {

        return getBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(final GetBundlesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBundlesRequest, GetBundlesResult> asyncHandler) {
        final GetBundlesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBundlesResult>() {
            @Override
            public GetBundlesResult call() throws Exception {
                GetBundlesResult result = null;

                try {
                    result = executeGetBundles(finalRequest);
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
    public java.util.concurrent.Future<GetCloudFormationStackRecordsResult> getCloudFormationStackRecordsAsync(GetCloudFormationStackRecordsRequest request) {

        return getCloudFormationStackRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudFormationStackRecordsResult> getCloudFormationStackRecordsAsync(
            final GetCloudFormationStackRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudFormationStackRecordsRequest, GetCloudFormationStackRecordsResult> asyncHandler) {
        final GetCloudFormationStackRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudFormationStackRecordsResult>() {
            @Override
            public GetCloudFormationStackRecordsResult call() throws Exception {
                GetCloudFormationStackRecordsResult result = null;

                try {
                    result = executeGetCloudFormationStackRecords(finalRequest);
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
    public java.util.concurrent.Future<GetDiskResult> getDiskAsync(GetDiskRequest request) {

        return getDiskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiskResult> getDiskAsync(final GetDiskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDiskRequest, GetDiskResult> asyncHandler) {
        final GetDiskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDiskResult>() {
            @Override
            public GetDiskResult call() throws Exception {
                GetDiskResult result = null;

                try {
                    result = executeGetDisk(finalRequest);
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
    public java.util.concurrent.Future<GetDiskSnapshotResult> getDiskSnapshotAsync(GetDiskSnapshotRequest request) {

        return getDiskSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiskSnapshotResult> getDiskSnapshotAsync(final GetDiskSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDiskSnapshotRequest, GetDiskSnapshotResult> asyncHandler) {
        final GetDiskSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDiskSnapshotResult>() {
            @Override
            public GetDiskSnapshotResult call() throws Exception {
                GetDiskSnapshotResult result = null;

                try {
                    result = executeGetDiskSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetDiskSnapshotsResult> getDiskSnapshotsAsync(GetDiskSnapshotsRequest request) {

        return getDiskSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDiskSnapshotsResult> getDiskSnapshotsAsync(final GetDiskSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDiskSnapshotsRequest, GetDiskSnapshotsResult> asyncHandler) {
        final GetDiskSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDiskSnapshotsResult>() {
            @Override
            public GetDiskSnapshotsResult call() throws Exception {
                GetDiskSnapshotsResult result = null;

                try {
                    result = executeGetDiskSnapshots(finalRequest);
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
    public java.util.concurrent.Future<GetDisksResult> getDisksAsync(GetDisksRequest request) {

        return getDisksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDisksResult> getDisksAsync(final GetDisksRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDisksRequest, GetDisksResult> asyncHandler) {
        final GetDisksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDisksResult>() {
            @Override
            public GetDisksResult call() throws Exception {
                GetDisksResult result = null;

                try {
                    result = executeGetDisks(finalRequest);
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
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest request) {

        return getDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainResult> getDomainAsync(final GetDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler) {
        final GetDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainResult>() {
            @Override
            public GetDomainResult call() throws Exception {
                GetDomainResult result = null;

                try {
                    result = executeGetDomain(finalRequest);
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
    public java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest request) {

        return getDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(final GetDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainsRequest, GetDomainsResult> asyncHandler) {
        final GetDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainsResult>() {
            @Override
            public GetDomainsResult call() throws Exception {
                GetDomainsResult result = null;

                try {
                    result = executeGetDomains(finalRequest);
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
    public java.util.concurrent.Future<GetExportSnapshotRecordsResult> getExportSnapshotRecordsAsync(GetExportSnapshotRecordsRequest request) {

        return getExportSnapshotRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExportSnapshotRecordsResult> getExportSnapshotRecordsAsync(final GetExportSnapshotRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExportSnapshotRecordsRequest, GetExportSnapshotRecordsResult> asyncHandler) {
        final GetExportSnapshotRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExportSnapshotRecordsResult>() {
            @Override
            public GetExportSnapshotRecordsResult call() throws Exception {
                GetExportSnapshotRecordsResult result = null;

                try {
                    result = executeGetExportSnapshotRecords(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest request) {

        return getInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(final GetInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler) {
        final GetInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceResult>() {
            @Override
            public GetInstanceResult call() throws Exception {
                GetInstanceResult result = null;

                try {
                    result = executeGetInstance(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest request) {

        return getInstanceAccessDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(final GetInstanceAccessDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceAccessDetailsRequest, GetInstanceAccessDetailsResult> asyncHandler) {
        final GetInstanceAccessDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceAccessDetailsResult>() {
            @Override
            public GetInstanceAccessDetailsResult call() throws Exception {
                GetInstanceAccessDetailsResult result = null;

                try {
                    result = executeGetInstanceAccessDetails(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest request) {

        return getInstanceMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(final GetInstanceMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceMetricDataRequest, GetInstanceMetricDataResult> asyncHandler) {
        final GetInstanceMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceMetricDataResult>() {
            @Override
            public GetInstanceMetricDataResult call() throws Exception {
                GetInstanceMetricDataResult result = null;

                try {
                    result = executeGetInstanceMetricData(finalRequest);
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
    public java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest request) {

        return getInstancePortStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(final GetInstancePortStatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstancePortStatesRequest, GetInstancePortStatesResult> asyncHandler) {
        final GetInstancePortStatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstancePortStatesResult>() {
            @Override
            public GetInstancePortStatesResult call() throws Exception {
                GetInstancePortStatesResult result = null;

                try {
                    result = executeGetInstancePortStates(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest request) {

        return getInstanceSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(final GetInstanceSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotRequest, GetInstanceSnapshotResult> asyncHandler) {
        final GetInstanceSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceSnapshotResult>() {
            @Override
            public GetInstanceSnapshotResult call() throws Exception {
                GetInstanceSnapshotResult result = null;

                try {
                    result = executeGetInstanceSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest request) {

        return getInstanceSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(final GetInstanceSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotsRequest, GetInstanceSnapshotsResult> asyncHandler) {
        final GetInstanceSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceSnapshotsResult>() {
            @Override
            public GetInstanceSnapshotsResult call() throws Exception {
                GetInstanceSnapshotsResult result = null;

                try {
                    result = executeGetInstanceSnapshots(finalRequest);
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
    public java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest request) {

        return getInstanceStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(final GetInstanceStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceStateRequest, GetInstanceStateResult> asyncHandler) {
        final GetInstanceStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceStateResult>() {
            @Override
            public GetInstanceStateResult call() throws Exception {
                GetInstanceStateResult result = null;

                try {
                    result = executeGetInstanceState(finalRequest);
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
    public java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest request) {

        return getInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(final GetInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstancesRequest, GetInstancesResult> asyncHandler) {
        final GetInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstancesResult>() {
            @Override
            public GetInstancesResult call() throws Exception {
                GetInstancesResult result = null;

                try {
                    result = executeGetInstances(finalRequest);
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
    public java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest request) {

        return getKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(final GetKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyPairRequest, GetKeyPairResult> asyncHandler) {
        final GetKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyPairResult>() {
            @Override
            public GetKeyPairResult call() throws Exception {
                GetKeyPairResult result = null;

                try {
                    result = executeGetKeyPair(finalRequest);
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
    public java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest request) {

        return getKeyPairsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(final GetKeyPairsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyPairsRequest, GetKeyPairsResult> asyncHandler) {
        final GetKeyPairsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyPairsResult>() {
            @Override
            public GetKeyPairsResult call() throws Exception {
                GetKeyPairsResult result = null;

                try {
                    result = executeGetKeyPairs(finalRequest);
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
    public java.util.concurrent.Future<GetLoadBalancerResult> getLoadBalancerAsync(GetLoadBalancerRequest request) {

        return getLoadBalancerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoadBalancerResult> getLoadBalancerAsync(final GetLoadBalancerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoadBalancerRequest, GetLoadBalancerResult> asyncHandler) {
        final GetLoadBalancerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoadBalancerResult>() {
            @Override
            public GetLoadBalancerResult call() throws Exception {
                GetLoadBalancerResult result = null;

                try {
                    result = executeGetLoadBalancer(finalRequest);
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
    public java.util.concurrent.Future<GetLoadBalancerMetricDataResult> getLoadBalancerMetricDataAsync(GetLoadBalancerMetricDataRequest request) {

        return getLoadBalancerMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoadBalancerMetricDataResult> getLoadBalancerMetricDataAsync(final GetLoadBalancerMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoadBalancerMetricDataRequest, GetLoadBalancerMetricDataResult> asyncHandler) {
        final GetLoadBalancerMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoadBalancerMetricDataResult>() {
            @Override
            public GetLoadBalancerMetricDataResult call() throws Exception {
                GetLoadBalancerMetricDataResult result = null;

                try {
                    result = executeGetLoadBalancerMetricData(finalRequest);
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
    public java.util.concurrent.Future<GetLoadBalancerTlsCertificatesResult> getLoadBalancerTlsCertificatesAsync(GetLoadBalancerTlsCertificatesRequest request) {

        return getLoadBalancerTlsCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoadBalancerTlsCertificatesResult> getLoadBalancerTlsCertificatesAsync(
            final GetLoadBalancerTlsCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoadBalancerTlsCertificatesRequest, GetLoadBalancerTlsCertificatesResult> asyncHandler) {
        final GetLoadBalancerTlsCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoadBalancerTlsCertificatesResult>() {
            @Override
            public GetLoadBalancerTlsCertificatesResult call() throws Exception {
                GetLoadBalancerTlsCertificatesResult result = null;

                try {
                    result = executeGetLoadBalancerTlsCertificates(finalRequest);
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
    public java.util.concurrent.Future<GetLoadBalancersResult> getLoadBalancersAsync(GetLoadBalancersRequest request) {

        return getLoadBalancersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoadBalancersResult> getLoadBalancersAsync(final GetLoadBalancersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoadBalancersRequest, GetLoadBalancersResult> asyncHandler) {
        final GetLoadBalancersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoadBalancersResult>() {
            @Override
            public GetLoadBalancersResult call() throws Exception {
                GetLoadBalancersResult result = null;

                try {
                    result = executeGetLoadBalancers(finalRequest);
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
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest request) {

        return getOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationResult> getOperationAsync(final GetOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler) {
        final GetOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOperationResult>() {
            @Override
            public GetOperationResult call() throws Exception {
                GetOperationResult result = null;

                try {
                    result = executeGetOperation(finalRequest);
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
    public java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest request) {

        return getOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(final GetOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationsRequest, GetOperationsResult> asyncHandler) {
        final GetOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOperationsResult>() {
            @Override
            public GetOperationsResult call() throws Exception {
                GetOperationsResult result = null;

                try {
                    result = executeGetOperations(finalRequest);
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
    public java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest request) {

        return getOperationsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(final GetOperationsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOperationsForResourceRequest, GetOperationsForResourceResult> asyncHandler) {
        final GetOperationsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOperationsForResourceResult>() {
            @Override
            public GetOperationsForResourceResult call() throws Exception {
                GetOperationsForResourceResult result = null;

                try {
                    result = executeGetOperationsForResource(finalRequest);
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
    public java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest request) {

        return getRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(final GetRegionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegionsRequest, GetRegionsResult> asyncHandler) {
        final GetRegionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegionsResult>() {
            @Override
            public GetRegionsResult call() throws Exception {
                GetRegionsResult result = null;

                try {
                    result = executeGetRegions(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseResult> getRelationalDatabaseAsync(GetRelationalDatabaseRequest request) {

        return getRelationalDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseResult> getRelationalDatabaseAsync(final GetRelationalDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseRequest, GetRelationalDatabaseResult> asyncHandler) {
        final GetRelationalDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseResult>() {
            @Override
            public GetRelationalDatabaseResult call() throws Exception {
                GetRelationalDatabaseResult result = null;

                try {
                    result = executeGetRelationalDatabase(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseBlueprintsResult> getRelationalDatabaseBlueprintsAsync(
            GetRelationalDatabaseBlueprintsRequest request) {

        return getRelationalDatabaseBlueprintsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseBlueprintsResult> getRelationalDatabaseBlueprintsAsync(
            final GetRelationalDatabaseBlueprintsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseBlueprintsRequest, GetRelationalDatabaseBlueprintsResult> asyncHandler) {
        final GetRelationalDatabaseBlueprintsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseBlueprintsResult>() {
            @Override
            public GetRelationalDatabaseBlueprintsResult call() throws Exception {
                GetRelationalDatabaseBlueprintsResult result = null;

                try {
                    result = executeGetRelationalDatabaseBlueprints(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseBundlesResult> getRelationalDatabaseBundlesAsync(GetRelationalDatabaseBundlesRequest request) {

        return getRelationalDatabaseBundlesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseBundlesResult> getRelationalDatabaseBundlesAsync(final GetRelationalDatabaseBundlesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseBundlesRequest, GetRelationalDatabaseBundlesResult> asyncHandler) {
        final GetRelationalDatabaseBundlesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseBundlesResult>() {
            @Override
            public GetRelationalDatabaseBundlesResult call() throws Exception {
                GetRelationalDatabaseBundlesResult result = null;

                try {
                    result = executeGetRelationalDatabaseBundles(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseEventsResult> getRelationalDatabaseEventsAsync(GetRelationalDatabaseEventsRequest request) {

        return getRelationalDatabaseEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseEventsResult> getRelationalDatabaseEventsAsync(final GetRelationalDatabaseEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseEventsRequest, GetRelationalDatabaseEventsResult> asyncHandler) {
        final GetRelationalDatabaseEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseEventsResult>() {
            @Override
            public GetRelationalDatabaseEventsResult call() throws Exception {
                GetRelationalDatabaseEventsResult result = null;

                try {
                    result = executeGetRelationalDatabaseEvents(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseLogEventsResult> getRelationalDatabaseLogEventsAsync(GetRelationalDatabaseLogEventsRequest request) {

        return getRelationalDatabaseLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseLogEventsResult> getRelationalDatabaseLogEventsAsync(
            final GetRelationalDatabaseLogEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseLogEventsRequest, GetRelationalDatabaseLogEventsResult> asyncHandler) {
        final GetRelationalDatabaseLogEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseLogEventsResult>() {
            @Override
            public GetRelationalDatabaseLogEventsResult call() throws Exception {
                GetRelationalDatabaseLogEventsResult result = null;

                try {
                    result = executeGetRelationalDatabaseLogEvents(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseLogStreamsResult> getRelationalDatabaseLogStreamsAsync(
            GetRelationalDatabaseLogStreamsRequest request) {

        return getRelationalDatabaseLogStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseLogStreamsResult> getRelationalDatabaseLogStreamsAsync(
            final GetRelationalDatabaseLogStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseLogStreamsRequest, GetRelationalDatabaseLogStreamsResult> asyncHandler) {
        final GetRelationalDatabaseLogStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseLogStreamsResult>() {
            @Override
            public GetRelationalDatabaseLogStreamsResult call() throws Exception {
                GetRelationalDatabaseLogStreamsResult result = null;

                try {
                    result = executeGetRelationalDatabaseLogStreams(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseMasterUserPasswordResult> getRelationalDatabaseMasterUserPasswordAsync(
            GetRelationalDatabaseMasterUserPasswordRequest request) {

        return getRelationalDatabaseMasterUserPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseMasterUserPasswordResult> getRelationalDatabaseMasterUserPasswordAsync(
            final GetRelationalDatabaseMasterUserPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseMasterUserPasswordRequest, GetRelationalDatabaseMasterUserPasswordResult> asyncHandler) {
        final GetRelationalDatabaseMasterUserPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseMasterUserPasswordResult>() {
            @Override
            public GetRelationalDatabaseMasterUserPasswordResult call() throws Exception {
                GetRelationalDatabaseMasterUserPasswordResult result = null;

                try {
                    result = executeGetRelationalDatabaseMasterUserPassword(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseMetricDataResult> getRelationalDatabaseMetricDataAsync(
            GetRelationalDatabaseMetricDataRequest request) {

        return getRelationalDatabaseMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseMetricDataResult> getRelationalDatabaseMetricDataAsync(
            final GetRelationalDatabaseMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseMetricDataRequest, GetRelationalDatabaseMetricDataResult> asyncHandler) {
        final GetRelationalDatabaseMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseMetricDataResult>() {
            @Override
            public GetRelationalDatabaseMetricDataResult call() throws Exception {
                GetRelationalDatabaseMetricDataResult result = null;

                try {
                    result = executeGetRelationalDatabaseMetricData(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseParametersResult> getRelationalDatabaseParametersAsync(
            GetRelationalDatabaseParametersRequest request) {

        return getRelationalDatabaseParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseParametersResult> getRelationalDatabaseParametersAsync(
            final GetRelationalDatabaseParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseParametersRequest, GetRelationalDatabaseParametersResult> asyncHandler) {
        final GetRelationalDatabaseParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseParametersResult>() {
            @Override
            public GetRelationalDatabaseParametersResult call() throws Exception {
                GetRelationalDatabaseParametersResult result = null;

                try {
                    result = executeGetRelationalDatabaseParameters(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseSnapshotResult> getRelationalDatabaseSnapshotAsync(GetRelationalDatabaseSnapshotRequest request) {

        return getRelationalDatabaseSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseSnapshotResult> getRelationalDatabaseSnapshotAsync(
            final GetRelationalDatabaseSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseSnapshotRequest, GetRelationalDatabaseSnapshotResult> asyncHandler) {
        final GetRelationalDatabaseSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseSnapshotResult>() {
            @Override
            public GetRelationalDatabaseSnapshotResult call() throws Exception {
                GetRelationalDatabaseSnapshotResult result = null;

                try {
                    result = executeGetRelationalDatabaseSnapshot(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabaseSnapshotsResult> getRelationalDatabaseSnapshotsAsync(GetRelationalDatabaseSnapshotsRequest request) {

        return getRelationalDatabaseSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabaseSnapshotsResult> getRelationalDatabaseSnapshotsAsync(
            final GetRelationalDatabaseSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabaseSnapshotsRequest, GetRelationalDatabaseSnapshotsResult> asyncHandler) {
        final GetRelationalDatabaseSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabaseSnapshotsResult>() {
            @Override
            public GetRelationalDatabaseSnapshotsResult call() throws Exception {
                GetRelationalDatabaseSnapshotsResult result = null;

                try {
                    result = executeGetRelationalDatabaseSnapshots(finalRequest);
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
    public java.util.concurrent.Future<GetRelationalDatabasesResult> getRelationalDatabasesAsync(GetRelationalDatabasesRequest request) {

        return getRelationalDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelationalDatabasesResult> getRelationalDatabasesAsync(final GetRelationalDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelationalDatabasesRequest, GetRelationalDatabasesResult> asyncHandler) {
        final GetRelationalDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelationalDatabasesResult>() {
            @Override
            public GetRelationalDatabasesResult call() throws Exception {
                GetRelationalDatabasesResult result = null;

                try {
                    result = executeGetRelationalDatabases(finalRequest);
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
    public java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest request) {

        return getStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(final GetStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStaticIpRequest, GetStaticIpResult> asyncHandler) {
        final GetStaticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStaticIpResult>() {
            @Override
            public GetStaticIpResult call() throws Exception {
                GetStaticIpResult result = null;

                try {
                    result = executeGetStaticIp(finalRequest);
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
    public java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest request) {

        return getStaticIpsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(final GetStaticIpsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStaticIpsRequest, GetStaticIpsResult> asyncHandler) {
        final GetStaticIpsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStaticIpsResult>() {
            @Override
            public GetStaticIpsResult call() throws Exception {
                GetStaticIpsResult result = null;

                try {
                    result = executeGetStaticIps(finalRequest);
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
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest request) {

        return importKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(final ImportKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler) {
        final ImportKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportKeyPairResult>() {
            @Override
            public ImportKeyPairResult call() throws Exception {
                ImportKeyPairResult result = null;

                try {
                    result = executeImportKeyPair(finalRequest);
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
    public java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest request) {

        return isVpcPeeredAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(final IsVpcPeeredRequest request,
            final com.amazonaws.handlers.AsyncHandler<IsVpcPeeredRequest, IsVpcPeeredResult> asyncHandler) {
        final IsVpcPeeredRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IsVpcPeeredResult>() {
            @Override
            public IsVpcPeeredResult call() throws Exception {
                IsVpcPeeredResult result = null;

                try {
                    result = executeIsVpcPeered(finalRequest);
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
    public java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest request) {

        return openInstancePublicPortsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(final OpenInstancePublicPortsRequest request,
            final com.amazonaws.handlers.AsyncHandler<OpenInstancePublicPortsRequest, OpenInstancePublicPortsResult> asyncHandler) {
        final OpenInstancePublicPortsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<OpenInstancePublicPortsResult>() {
            @Override
            public OpenInstancePublicPortsResult call() throws Exception {
                OpenInstancePublicPortsResult result = null;

                try {
                    result = executeOpenInstancePublicPorts(finalRequest);
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
    public java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest request) {

        return peerVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(final PeerVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<PeerVpcRequest, PeerVpcResult> asyncHandler) {
        final PeerVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PeerVpcResult>() {
            @Override
            public PeerVpcResult call() throws Exception {
                PeerVpcResult result = null;

                try {
                    result = executePeerVpc(finalRequest);
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
    public java.util.concurrent.Future<PutInstancePublicPortsResult> putInstancePublicPortsAsync(PutInstancePublicPortsRequest request) {

        return putInstancePublicPortsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutInstancePublicPortsResult> putInstancePublicPortsAsync(final PutInstancePublicPortsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutInstancePublicPortsRequest, PutInstancePublicPortsResult> asyncHandler) {
        final PutInstancePublicPortsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutInstancePublicPortsResult>() {
            @Override
            public PutInstancePublicPortsResult call() throws Exception {
                PutInstancePublicPortsResult result = null;

                try {
                    result = executePutInstancePublicPorts(finalRequest);
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
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest request) {

        return rebootInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(final RebootInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler) {
        final RebootInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootInstanceResult>() {
            @Override
            public RebootInstanceResult call() throws Exception {
                RebootInstanceResult result = null;

                try {
                    result = executeRebootInstance(finalRequest);
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
    public java.util.concurrent.Future<RebootRelationalDatabaseResult> rebootRelationalDatabaseAsync(RebootRelationalDatabaseRequest request) {

        return rebootRelationalDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootRelationalDatabaseResult> rebootRelationalDatabaseAsync(final RebootRelationalDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootRelationalDatabaseRequest, RebootRelationalDatabaseResult> asyncHandler) {
        final RebootRelationalDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootRelationalDatabaseResult>() {
            @Override
            public RebootRelationalDatabaseResult call() throws Exception {
                RebootRelationalDatabaseResult result = null;

                try {
                    result = executeRebootRelationalDatabase(finalRequest);
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
    public java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest request) {

        return releaseStaticIpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(final ReleaseStaticIpRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleaseStaticIpRequest, ReleaseStaticIpResult> asyncHandler) {
        final ReleaseStaticIpRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleaseStaticIpResult>() {
            @Override
            public ReleaseStaticIpResult call() throws Exception {
                ReleaseStaticIpResult result = null;

                try {
                    result = executeReleaseStaticIp(finalRequest);
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
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest request) {

        return startInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(final StartInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler) {
        final StartInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartInstanceResult>() {
            @Override
            public StartInstanceResult call() throws Exception {
                StartInstanceResult result = null;

                try {
                    result = executeStartInstance(finalRequest);
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
    public java.util.concurrent.Future<StartRelationalDatabaseResult> startRelationalDatabaseAsync(StartRelationalDatabaseRequest request) {

        return startRelationalDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRelationalDatabaseResult> startRelationalDatabaseAsync(final StartRelationalDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRelationalDatabaseRequest, StartRelationalDatabaseResult> asyncHandler) {
        final StartRelationalDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRelationalDatabaseResult>() {
            @Override
            public StartRelationalDatabaseResult call() throws Exception {
                StartRelationalDatabaseResult result = null;

                try {
                    result = executeStartRelationalDatabase(finalRequest);
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
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest request) {

        return stopInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(final StopInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler) {
        final StopInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopInstanceResult>() {
            @Override
            public StopInstanceResult call() throws Exception {
                StopInstanceResult result = null;

                try {
                    result = executeStopInstance(finalRequest);
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
    public java.util.concurrent.Future<StopRelationalDatabaseResult> stopRelationalDatabaseAsync(StopRelationalDatabaseRequest request) {

        return stopRelationalDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopRelationalDatabaseResult> stopRelationalDatabaseAsync(final StopRelationalDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopRelationalDatabaseRequest, StopRelationalDatabaseResult> asyncHandler) {
        final StopRelationalDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopRelationalDatabaseResult>() {
            @Override
            public StopRelationalDatabaseResult call() throws Exception {
                StopRelationalDatabaseResult result = null;

                try {
                    result = executeStopRelationalDatabase(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest request) {

        return unpeerVpcAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(final UnpeerVpcRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnpeerVpcRequest, UnpeerVpcResult> asyncHandler) {
        final UnpeerVpcRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnpeerVpcResult>() {
            @Override
            public UnpeerVpcResult call() throws Exception {
                UnpeerVpcResult result = null;

                try {
                    result = executeUnpeerVpc(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest request) {

        return updateDomainEntryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(final UpdateDomainEntryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainEntryRequest, UpdateDomainEntryResult> asyncHandler) {
        final UpdateDomainEntryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainEntryResult>() {
            @Override
            public UpdateDomainEntryResult call() throws Exception {
                UpdateDomainEntryResult result = null;

                try {
                    result = executeUpdateDomainEntry(finalRequest);
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
    public java.util.concurrent.Future<UpdateLoadBalancerAttributeResult> updateLoadBalancerAttributeAsync(UpdateLoadBalancerAttributeRequest request) {

        return updateLoadBalancerAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoadBalancerAttributeResult> updateLoadBalancerAttributeAsync(final UpdateLoadBalancerAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLoadBalancerAttributeRequest, UpdateLoadBalancerAttributeResult> asyncHandler) {
        final UpdateLoadBalancerAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLoadBalancerAttributeResult>() {
            @Override
            public UpdateLoadBalancerAttributeResult call() throws Exception {
                UpdateLoadBalancerAttributeResult result = null;

                try {
                    result = executeUpdateLoadBalancerAttribute(finalRequest);
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
    public java.util.concurrent.Future<UpdateRelationalDatabaseResult> updateRelationalDatabaseAsync(UpdateRelationalDatabaseRequest request) {

        return updateRelationalDatabaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRelationalDatabaseResult> updateRelationalDatabaseAsync(final UpdateRelationalDatabaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRelationalDatabaseRequest, UpdateRelationalDatabaseResult> asyncHandler) {
        final UpdateRelationalDatabaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRelationalDatabaseResult>() {
            @Override
            public UpdateRelationalDatabaseResult call() throws Exception {
                UpdateRelationalDatabaseResult result = null;

                try {
                    result = executeUpdateRelationalDatabase(finalRequest);
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
    public java.util.concurrent.Future<UpdateRelationalDatabaseParametersResult> updateRelationalDatabaseParametersAsync(
            UpdateRelationalDatabaseParametersRequest request) {

        return updateRelationalDatabaseParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRelationalDatabaseParametersResult> updateRelationalDatabaseParametersAsync(
            final UpdateRelationalDatabaseParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRelationalDatabaseParametersRequest, UpdateRelationalDatabaseParametersResult> asyncHandler) {
        final UpdateRelationalDatabaseParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRelationalDatabaseParametersResult>() {
            @Override
            public UpdateRelationalDatabaseParametersResult call() throws Exception {
                UpdateRelationalDatabaseParametersResult result = null;

                try {
                    result = executeUpdateRelationalDatabaseParameters(finalRequest);
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
