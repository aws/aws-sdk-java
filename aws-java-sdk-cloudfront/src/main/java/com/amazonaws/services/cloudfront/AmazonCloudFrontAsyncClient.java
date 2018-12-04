/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing CloudFront asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about
 * CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon
 * CloudFront Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFrontAsyncClient extends AmazonCloudFrontClient implements AmazonCloudFrontAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront. A credentials provider chain will
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
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to CloudFront (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the provided AWS account
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
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudFrontAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFrontAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudFrontAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCloudFrontAsyncClientBuilder asyncBuilder() {
        return AmazonCloudFrontAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CloudFront using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudFrontAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            CreateCloudFrontOriginAccessIdentityRequest request) {

        return createCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(
            final CreateCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCloudFrontOriginAccessIdentityRequest, CreateCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final CreateCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCloudFrontOriginAccessIdentityResult>() {
            @Override
            public CreateCloudFrontOriginAccessIdentityResult call() throws Exception {
                CreateCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeCreateCloudFrontOriginAccessIdentity(finalRequest);
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
    public java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest request) {

        return createDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionResult> createDistributionAsync(final CreateDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDistributionRequest, CreateDistributionResult> asyncHandler) {
        final CreateDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDistributionResult>() {
            @Override
            public CreateDistributionResult call() throws Exception {
                CreateDistributionResult result = null;

                try {
                    result = executeCreateDistribution(finalRequest);
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
    public java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(CreateDistributionWithTagsRequest request) {

        return createDistributionWithTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDistributionWithTagsResult> createDistributionWithTagsAsync(final CreateDistributionWithTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDistributionWithTagsRequest, CreateDistributionWithTagsResult> asyncHandler) {
        final CreateDistributionWithTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDistributionWithTagsResult>() {
            @Override
            public CreateDistributionWithTagsResult call() throws Exception {
                CreateDistributionWithTagsResult result = null;

                try {
                    result = executeCreateDistributionWithTags(finalRequest);
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
    public java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(CreateInvalidationRequest request) {

        return createInvalidationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInvalidationResult> createInvalidationAsync(final CreateInvalidationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInvalidationRequest, CreateInvalidationResult> asyncHandler) {
        final CreateInvalidationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInvalidationResult>() {
            @Override
            public CreateInvalidationResult call() throws Exception {
                CreateInvalidationResult result = null;

                try {
                    result = executeCreateInvalidation(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(CreateStreamingDistributionRequest request) {

        return createStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(final CreateStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionRequest, CreateStreamingDistributionResult> asyncHandler) {
        final CreateStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingDistributionResult>() {
            @Override
            public CreateStreamingDistributionResult call() throws Exception {
                CreateStreamingDistributionResult result = null;

                try {
                    result = executeCreateStreamingDistribution(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            CreateStreamingDistributionWithTagsRequest request) {

        return createStreamingDistributionWithTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingDistributionWithTagsResult> createStreamingDistributionWithTagsAsync(
            final CreateStreamingDistributionWithTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingDistributionWithTagsRequest, CreateStreamingDistributionWithTagsResult> asyncHandler) {
        final CreateStreamingDistributionWithTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingDistributionWithTagsResult>() {
            @Override
            public CreateStreamingDistributionWithTagsResult call() throws Exception {
                CreateStreamingDistributionWithTagsResult result = null;

                try {
                    result = executeCreateStreamingDistributionWithTags(finalRequest);
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
    public java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            DeleteCloudFrontOriginAccessIdentityRequest request) {

        return deleteCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudFrontOriginAccessIdentityResult> deleteCloudFrontOriginAccessIdentityAsync(
            final DeleteCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCloudFrontOriginAccessIdentityRequest, DeleteCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final DeleteCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCloudFrontOriginAccessIdentityResult>() {
            @Override
            public DeleteCloudFrontOriginAccessIdentityResult call() throws Exception {
                DeleteCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeDeleteCloudFrontOriginAccessIdentity(finalRequest);
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
    public java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(DeleteDistributionRequest request) {

        return deleteDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDistributionResult> deleteDistributionAsync(final DeleteDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDistributionRequest, DeleteDistributionResult> asyncHandler) {
        final DeleteDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDistributionResult>() {
            @Override
            public DeleteDistributionResult call() throws Exception {
                DeleteDistributionResult result = null;

                try {
                    result = executeDeleteDistribution(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceLinkedRoleResult> deleteServiceLinkedRoleAsync(DeleteServiceLinkedRoleRequest request) {

        return deleteServiceLinkedRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceLinkedRoleResult> deleteServiceLinkedRoleAsync(final DeleteServiceLinkedRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceLinkedRoleRequest, DeleteServiceLinkedRoleResult> asyncHandler) {
        final DeleteServiceLinkedRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceLinkedRoleResult>() {
            @Override
            public DeleteServiceLinkedRoleResult call() throws Exception {
                DeleteServiceLinkedRoleResult result = null;

                try {
                    result = executeDeleteServiceLinkedRole(finalRequest);
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
    public java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(DeleteStreamingDistributionRequest request) {

        return deleteStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamingDistributionResult> deleteStreamingDistributionAsync(final DeleteStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamingDistributionRequest, DeleteStreamingDistributionResult> asyncHandler) {
        final DeleteStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamingDistributionResult>() {
            @Override
            public DeleteStreamingDistributionResult call() throws Exception {
                DeleteStreamingDistributionResult result = null;

                try {
                    result = executeDeleteStreamingDistribution(finalRequest);
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
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            GetCloudFrontOriginAccessIdentityRequest request) {

        return getCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(
            final GetCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityRequest, GetCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final GetCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudFrontOriginAccessIdentityResult>() {
            @Override
            public GetCloudFrontOriginAccessIdentityResult call() throws Exception {
                GetCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeGetCloudFrontOriginAccessIdentity(finalRequest);
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
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            GetCloudFrontOriginAccessIdentityConfigRequest request) {

        return getCloudFrontOriginAccessIdentityConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(
            final GetCloudFrontOriginAccessIdentityConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudFrontOriginAccessIdentityConfigRequest, GetCloudFrontOriginAccessIdentityConfigResult> asyncHandler) {
        final GetCloudFrontOriginAccessIdentityConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudFrontOriginAccessIdentityConfigResult>() {
            @Override
            public GetCloudFrontOriginAccessIdentityConfigResult call() throws Exception {
                GetCloudFrontOriginAccessIdentityConfigResult result = null;

                try {
                    result = executeGetCloudFrontOriginAccessIdentityConfig(finalRequest);
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
    public java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(GetDistributionRequest request) {

        return getDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDistributionResult> getDistributionAsync(final GetDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDistributionRequest, GetDistributionResult> asyncHandler) {
        final GetDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDistributionResult>() {
            @Override
            public GetDistributionResult call() throws Exception {
                GetDistributionResult result = null;

                try {
                    result = executeGetDistribution(finalRequest);
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
    public java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(GetDistributionConfigRequest request) {

        return getDistributionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDistributionConfigResult> getDistributionConfigAsync(final GetDistributionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDistributionConfigRequest, GetDistributionConfigResult> asyncHandler) {
        final GetDistributionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDistributionConfigResult>() {
            @Override
            public GetDistributionConfigResult call() throws Exception {
                GetDistributionConfigResult result = null;

                try {
                    result = executeGetDistributionConfig(finalRequest);
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
    public java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(GetInvalidationRequest request) {

        return getInvalidationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInvalidationResult> getInvalidationAsync(final GetInvalidationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInvalidationRequest, GetInvalidationResult> asyncHandler) {
        final GetInvalidationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInvalidationResult>() {
            @Override
            public GetInvalidationResult call() throws Exception {
                GetInvalidationResult result = null;

                try {
                    result = executeGetInvalidation(finalRequest);
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
    public java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(GetStreamingDistributionRequest request) {

        return getStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamingDistributionResult> getStreamingDistributionAsync(final GetStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionRequest, GetStreamingDistributionResult> asyncHandler) {
        final GetStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamingDistributionResult>() {
            @Override
            public GetStreamingDistributionResult call() throws Exception {
                GetStreamingDistributionResult result = null;

                try {
                    result = executeGetStreamingDistribution(finalRequest);
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
    public java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(GetStreamingDistributionConfigRequest request) {

        return getStreamingDistributionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(
            final GetStreamingDistributionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamingDistributionConfigRequest, GetStreamingDistributionConfigResult> asyncHandler) {
        final GetStreamingDistributionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamingDistributionConfigResult>() {
            @Override
            public GetStreamingDistributionConfigResult call() throws Exception {
                GetStreamingDistributionConfigResult result = null;

                try {
                    result = executeGetStreamingDistributionConfig(finalRequest);
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
    public java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            ListCloudFrontOriginAccessIdentitiesRequest request) {

        return listCloudFrontOriginAccessIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(
            final ListCloudFrontOriginAccessIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCloudFrontOriginAccessIdentitiesRequest, ListCloudFrontOriginAccessIdentitiesResult> asyncHandler) {
        final ListCloudFrontOriginAccessIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCloudFrontOriginAccessIdentitiesResult>() {
            @Override
            public ListCloudFrontOriginAccessIdentitiesResult call() throws Exception {
                ListCloudFrontOriginAccessIdentitiesResult result = null;

                try {
                    result = executeListCloudFrontOriginAccessIdentities(finalRequest);
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
    public java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(ListDistributionsRequest request) {

        return listDistributionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsResult> listDistributionsAsync(final ListDistributionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsRequest, ListDistributionsResult> asyncHandler) {
        final ListDistributionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsResult>() {
            @Override
            public ListDistributionsResult call() throws Exception {
                ListDistributionsResult result = null;

                try {
                    result = executeListDistributions(finalRequest);
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
    public java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(ListDistributionsByWebACLIdRequest request) {

        return listDistributionsByWebACLIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDistributionsByWebACLIdResult> listDistributionsByWebACLIdAsync(final ListDistributionsByWebACLIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDistributionsByWebACLIdRequest, ListDistributionsByWebACLIdResult> asyncHandler) {
        final ListDistributionsByWebACLIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDistributionsByWebACLIdResult>() {
            @Override
            public ListDistributionsByWebACLIdResult call() throws Exception {
                ListDistributionsByWebACLIdResult result = null;

                try {
                    result = executeListDistributionsByWebACLId(finalRequest);
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
    public java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(ListInvalidationsRequest request) {

        return listInvalidationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvalidationsResult> listInvalidationsAsync(final ListInvalidationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInvalidationsRequest, ListInvalidationsResult> asyncHandler) {
        final ListInvalidationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInvalidationsResult>() {
            @Override
            public ListInvalidationsResult call() throws Exception {
                ListInvalidationsResult result = null;

                try {
                    result = executeListInvalidations(finalRequest);
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
    public java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(ListStreamingDistributionsRequest request) {

        return listStreamingDistributionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(final ListStreamingDistributionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamingDistributionsRequest, ListStreamingDistributionsResult> asyncHandler) {
        final ListStreamingDistributionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamingDistributionsResult>() {
            @Override
            public ListStreamingDistributionsResult call() throws Exception {
                ListStreamingDistributionsResult result = null;

                try {
                    result = executeListStreamingDistributions(finalRequest);
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
    public java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            UpdateCloudFrontOriginAccessIdentityRequest request) {

        return updateCloudFrontOriginAccessIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(
            final UpdateCloudFrontOriginAccessIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCloudFrontOriginAccessIdentityRequest, UpdateCloudFrontOriginAccessIdentityResult> asyncHandler) {
        final UpdateCloudFrontOriginAccessIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCloudFrontOriginAccessIdentityResult>() {
            @Override
            public UpdateCloudFrontOriginAccessIdentityResult call() throws Exception {
                UpdateCloudFrontOriginAccessIdentityResult result = null;

                try {
                    result = executeUpdateCloudFrontOriginAccessIdentity(finalRequest);
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
    public java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest request) {

        return updateDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDistributionResult> updateDistributionAsync(final UpdateDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDistributionRequest, UpdateDistributionResult> asyncHandler) {
        final UpdateDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDistributionResult>() {
            @Override
            public UpdateDistributionResult call() throws Exception {
                UpdateDistributionResult result = null;

                try {
                    result = executeUpdateDistribution(finalRequest);
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
    public java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(UpdateStreamingDistributionRequest request) {

        return updateStreamingDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(final UpdateStreamingDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStreamingDistributionRequest, UpdateStreamingDistributionResult> asyncHandler) {
        final UpdateStreamingDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStreamingDistributionResult>() {
            @Override
            public UpdateStreamingDistributionResult call() throws Exception {
                UpdateStreamingDistributionResult result = null;

                try {
                    result = executeUpdateStreamingDistribution(finalRequest);
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
