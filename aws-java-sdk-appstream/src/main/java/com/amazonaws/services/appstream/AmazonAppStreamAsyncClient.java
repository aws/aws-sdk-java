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
package com.amazonaws.services.appstream;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon AppStream asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon AppStream 2.0</fullname>
 * <p>
 * This is the <i>Amazon AppStream 2.0 API Reference</i>. This reference provides descriptions and syntax for each of
 * the actions and data types in AppStream 2.0. AppStream 2.0 is a fully managed application streaming service. You
 * centrally manage your desktop applications on AppStream 2.0 and securely deliver them to any computer. AppStream 2.0
 * manages the AWS resources required to host and run your applications, scales automatically, and provides access to
 * your users on demand.
 * </p>
 * <p>
 * To learn more about AppStream 2.0, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/appstream2">Amazon AppStream 2.0 product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/appstream2">Amazon AppStream 2.0 documentation</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAppStreamAsyncClient extends AmazonAppStreamClient implements AmazonAppStreamAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream. A credentials provider chain
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
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon AppStream (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonAppStreamAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the provided AWS account
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
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonAppStreamAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAppStreamAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonAppStreamAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonAppStreamAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonAppStreamAsyncClientBuilder asyncBuilder() {
        return AmazonAppStreamAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon AppStream using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonAppStreamAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(AssociateFleetRequest request) {

        return associateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(final AssociateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateFleetRequest, AssociateFleetResult> asyncHandler) {
        final AssociateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateFleetResult>() {
            @Override
            public AssociateFleetResult call() throws Exception {
                AssociateFleetResult result = null;

                try {
                    result = executeAssociateFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateUserStackResult> batchAssociateUserStackAsync(BatchAssociateUserStackRequest request) {

        return batchAssociateUserStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateUserStackResult> batchAssociateUserStackAsync(final BatchAssociateUserStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateUserStackRequest, BatchAssociateUserStackResult> asyncHandler) {
        final BatchAssociateUserStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateUserStackResult>() {
            @Override
            public BatchAssociateUserStackResult call() throws Exception {
                BatchAssociateUserStackResult result = null;

                try {
                    result = executeBatchAssociateUserStack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateUserStackResult> batchDisassociateUserStackAsync(BatchDisassociateUserStackRequest request) {

        return batchDisassociateUserStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateUserStackResult> batchDisassociateUserStackAsync(final BatchDisassociateUserStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateUserStackRequest, BatchDisassociateUserStackResult> asyncHandler) {
        final BatchDisassociateUserStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateUserStackResult>() {
            @Override
            public BatchDisassociateUserStackResult call() throws Exception {
                BatchDisassociateUserStackResult result = null;

                try {
                    result = executeBatchDisassociateUserStack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest request) {

        return copyImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyImageResult> copyImageAsync(final CopyImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyImageRequest, CopyImageResult> asyncHandler) {
        final CopyImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyImageResult>() {
            @Override
            public CopyImageResult call() throws Exception {
                CopyImageResult result = null;

                try {
                    result = executeCopyImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryConfigResult> createDirectoryConfigAsync(CreateDirectoryConfigRequest request) {

        return createDirectoryConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryConfigResult> createDirectoryConfigAsync(final CreateDirectoryConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectoryConfigRequest, CreateDirectoryConfigResult> asyncHandler) {
        final CreateDirectoryConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectoryConfigResult>() {
            @Override
            public CreateDirectoryConfigResult call() throws Exception {
                CreateDirectoryConfigResult result = null;

                try {
                    result = executeCreateDirectoryConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {
        final CreateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result = null;

                try {
                    result = executeCreateFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateImageBuilderResult> createImageBuilderAsync(CreateImageBuilderRequest request) {

        return createImageBuilderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageBuilderResult> createImageBuilderAsync(final CreateImageBuilderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageBuilderRequest, CreateImageBuilderResult> asyncHandler) {
        final CreateImageBuilderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImageBuilderResult>() {
            @Override
            public CreateImageBuilderResult call() throws Exception {
                CreateImageBuilderResult result = null;

                try {
                    result = executeCreateImageBuilder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateImageBuilderStreamingURLResult> createImageBuilderStreamingURLAsync(CreateImageBuilderStreamingURLRequest request) {

        return createImageBuilderStreamingURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImageBuilderStreamingURLResult> createImageBuilderStreamingURLAsync(
            final CreateImageBuilderStreamingURLRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImageBuilderStreamingURLRequest, CreateImageBuilderStreamingURLResult> asyncHandler) {
        final CreateImageBuilderStreamingURLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImageBuilderStreamingURLResult>() {
            @Override
            public CreateImageBuilderStreamingURLResult call() throws Exception {
                CreateImageBuilderStreamingURLResult result = null;

                try {
                    result = executeCreateImageBuilderStreamingURL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(final CreateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {
        final CreateStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStackResult>() {
            @Override
            public CreateStackResult call() throws Exception {
                CreateStackResult result = null;

                try {
                    result = executeCreateStack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(CreateStreamingURLRequest request) {

        return createStreamingURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(final CreateStreamingURLRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingURLRequest, CreateStreamingURLResult> asyncHandler) {
        final CreateStreamingURLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingURLResult>() {
            @Override
            public CreateStreamingURLResult call() throws Exception {
                CreateStreamingURLResult result = null;

                try {
                    result = executeCreateStreamingURL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryConfigResult> deleteDirectoryConfigAsync(DeleteDirectoryConfigRequest request) {

        return deleteDirectoryConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryConfigResult> deleteDirectoryConfigAsync(final DeleteDirectoryConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectoryConfigRequest, DeleteDirectoryConfigResult> asyncHandler) {
        final DeleteDirectoryConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectoryConfigResult>() {
            @Override
            public DeleteDirectoryConfigResult call() throws Exception {
                DeleteDirectoryConfigResult result = null;

                try {
                    result = executeDeleteDirectoryConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(final DeleteFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {
        final DeleteFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetResult>() {
            @Override
            public DeleteFleetResult call() throws Exception {
                DeleteFleetResult result = null;

                try {
                    result = executeDeleteFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest request) {

        return deleteImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(final DeleteImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImageRequest, DeleteImageResult> asyncHandler) {
        final DeleteImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImageResult>() {
            @Override
            public DeleteImageResult call() throws Exception {
                DeleteImageResult result = null;

                try {
                    result = executeDeleteImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImageBuilderResult> deleteImageBuilderAsync(DeleteImageBuilderRequest request) {

        return deleteImageBuilderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageBuilderResult> deleteImageBuilderAsync(final DeleteImageBuilderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImageBuilderRequest, DeleteImageBuilderResult> asyncHandler) {
        final DeleteImageBuilderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImageBuilderResult>() {
            @Override
            public DeleteImageBuilderResult call() throws Exception {
                DeleteImageBuilderResult result = null;

                try {
                    result = executeDeleteImageBuilder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImagePermissionsResult> deleteImagePermissionsAsync(DeleteImagePermissionsRequest request) {

        return deleteImagePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImagePermissionsResult> deleteImagePermissionsAsync(final DeleteImagePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImagePermissionsRequest, DeleteImagePermissionsResult> asyncHandler) {
        final DeleteImagePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImagePermissionsResult>() {
            @Override
            public DeleteImagePermissionsResult call() throws Exception {
                DeleteImagePermissionsResult result = null;

                try {
                    result = executeDeleteImagePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(final DeleteStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler) {
        final DeleteStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStackResult>() {
            @Override
            public DeleteStackResult call() throws Exception {
                DeleteStackResult result = null;

                try {
                    result = executeDeleteStack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectoryConfigsResult> describeDirectoryConfigsAsync(DescribeDirectoryConfigsRequest request) {

        return describeDirectoryConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectoryConfigsResult> describeDirectoryConfigsAsync(final DescribeDirectoryConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDirectoryConfigsRequest, DescribeDirectoryConfigsResult> asyncHandler) {
        final DescribeDirectoryConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDirectoryConfigsResult>() {
            @Override
            public DescribeDirectoryConfigsResult call() throws Exception {
                DescribeDirectoryConfigsResult result = null;

                try {
                    result = executeDescribeDirectoryConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest request) {

        return describeFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(final DescribeFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetsRequest, DescribeFleetsResult> asyncHandler) {
        final DescribeFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetsResult>() {
            @Override
            public DescribeFleetsResult call() throws Exception {
                DescribeFleetsResult result = null;

                try {
                    result = executeDescribeFleets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImageBuildersResult> describeImageBuildersAsync(DescribeImageBuildersRequest request) {

        return describeImageBuildersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImageBuildersResult> describeImageBuildersAsync(final DescribeImageBuildersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImageBuildersRequest, DescribeImageBuildersResult> asyncHandler) {
        final DescribeImageBuildersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImageBuildersResult>() {
            @Override
            public DescribeImageBuildersResult call() throws Exception {
                DescribeImageBuildersResult result = null;

                try {
                    result = executeDescribeImageBuilders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImagePermissionsResult> describeImagePermissionsAsync(DescribeImagePermissionsRequest request) {

        return describeImagePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagePermissionsResult> describeImagePermissionsAsync(final DescribeImagePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImagePermissionsRequest, DescribeImagePermissionsResult> asyncHandler) {
        final DescribeImagePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImagePermissionsResult>() {
            @Override
            public DescribeImagePermissionsResult call() throws Exception {
                DescribeImagePermissionsResult result = null;

                try {
                    result = executeDescribeImagePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request) {

        return describeImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(final DescribeImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {
        final DescribeImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImagesResult>() {
            @Override
            public DescribeImagesResult call() throws Exception {
                DescribeImagesResult result = null;

                try {
                    result = executeDescribeImages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest request) {

        return describeSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(final DescribeSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler) {
        final DescribeSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSessionsResult>() {
            @Override
            public DescribeSessionsResult call() throws Exception {
                DescribeSessionsResult result = null;

                try {
                    result = executeDescribeSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(final DescribeStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {
        final DescribeStacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStacksResult>() {
            @Override
            public DescribeStacksResult call() throws Exception {
                DescribeStacksResult result = null;

                try {
                    result = executeDescribeStacks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserStackAssociationsResult> describeUserStackAssociationsAsync(DescribeUserStackAssociationsRequest request) {

        return describeUserStackAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserStackAssociationsResult> describeUserStackAssociationsAsync(
            final DescribeUserStackAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserStackAssociationsRequest, DescribeUserStackAssociationsResult> asyncHandler) {
        final DescribeUserStackAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserStackAssociationsResult>() {
            @Override
            public DescribeUserStackAssociationsResult call() throws Exception {
                DescribeUserStackAssociationsResult result = null;

                try {
                    result = executeDescribeUserStackAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest request) {

        return describeUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(final DescribeUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUsersRequest, DescribeUsersResult> asyncHandler) {
        final DescribeUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUsersResult>() {
            @Override
            public DescribeUsersResult call() throws Exception {
                DescribeUsersResult result = null;

                try {
                    result = executeDescribeUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableUserResult> disableUserAsync(DisableUserRequest request) {

        return disableUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableUserResult> disableUserAsync(final DisableUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableUserRequest, DisableUserResult> asyncHandler) {
        final DisableUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableUserResult>() {
            @Override
            public DisableUserResult call() throws Exception {
                DisableUserResult result = null;

                try {
                    result = executeDisableUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(DisassociateFleetRequest request) {

        return disassociateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(final DisassociateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFleetRequest, DisassociateFleetResult> asyncHandler) {
        final DisassociateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFleetResult>() {
            @Override
            public DisassociateFleetResult call() throws Exception {
                DisassociateFleetResult result = null;

                try {
                    result = executeDisassociateFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableUserResult> enableUserAsync(EnableUserRequest request) {

        return enableUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableUserResult> enableUserAsync(final EnableUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableUserRequest, EnableUserResult> asyncHandler) {
        final EnableUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableUserResult>() {
            @Override
            public EnableUserResult call() throws Exception {
                EnableUserResult result = null;

                try {
                    result = executeEnableUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(ExpireSessionRequest request) {

        return expireSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(final ExpireSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExpireSessionRequest, ExpireSessionResult> asyncHandler) {
        final ExpireSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExpireSessionResult>() {
            @Override
            public ExpireSessionResult call() throws Exception {
                ExpireSessionResult result = null;

                try {
                    result = executeExpireSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(ListAssociatedFleetsRequest request) {

        return listAssociatedFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(final ListAssociatedFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociatedFleetsRequest, ListAssociatedFleetsResult> asyncHandler) {
        final ListAssociatedFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociatedFleetsResult>() {
            @Override
            public ListAssociatedFleetsResult call() throws Exception {
                ListAssociatedFleetsResult result = null;

                try {
                    result = executeListAssociatedFleets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(ListAssociatedStacksRequest request) {

        return listAssociatedStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(final ListAssociatedStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociatedStacksRequest, ListAssociatedStacksResult> asyncHandler) {
        final ListAssociatedStacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociatedStacksResult>() {
            @Override
            public ListAssociatedStacksResult call() throws Exception {
                ListAssociatedStacksResult result = null;

                try {
                    result = executeListAssociatedStacks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<StartFleetResult> startFleetAsync(StartFleetRequest request) {

        return startFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFleetResult> startFleetAsync(final StartFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFleetRequest, StartFleetResult> asyncHandler) {
        final StartFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFleetResult>() {
            @Override
            public StartFleetResult call() throws Exception {
                StartFleetResult result = null;

                try {
                    result = executeStartFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartImageBuilderResult> startImageBuilderAsync(StartImageBuilderRequest request) {

        return startImageBuilderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImageBuilderResult> startImageBuilderAsync(final StartImageBuilderRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartImageBuilderRequest, StartImageBuilderResult> asyncHandler) {
        final StartImageBuilderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartImageBuilderResult>() {
            @Override
            public StartImageBuilderResult call() throws Exception {
                StartImageBuilderResult result = null;

                try {
                    result = executeStartImageBuilder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopFleetResult> stopFleetAsync(StopFleetRequest request) {

        return stopFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFleetResult> stopFleetAsync(final StopFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopFleetRequest, StopFleetResult> asyncHandler) {
        final StopFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopFleetResult>() {
            @Override
            public StopFleetResult call() throws Exception {
                StopFleetResult result = null;

                try {
                    result = executeStopFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopImageBuilderResult> stopImageBuilderAsync(StopImageBuilderRequest request) {

        return stopImageBuilderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopImageBuilderResult> stopImageBuilderAsync(final StopImageBuilderRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopImageBuilderRequest, StopImageBuilderResult> asyncHandler) {
        final StopImageBuilderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopImageBuilderResult>() {
            @Override
            public StopImageBuilderResult call() throws Exception {
                StopImageBuilderResult result = null;

                try {
                    result = executeStopImageBuilder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDirectoryConfigResult> updateDirectoryConfigAsync(UpdateDirectoryConfigRequest request) {

        return updateDirectoryConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDirectoryConfigResult> updateDirectoryConfigAsync(final UpdateDirectoryConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDirectoryConfigRequest, UpdateDirectoryConfigResult> asyncHandler) {
        final UpdateDirectoryConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDirectoryConfigResult>() {
            @Override
            public UpdateDirectoryConfigResult call() throws Exception {
                UpdateDirectoryConfigResult result = null;

                try {
                    result = executeUpdateDirectoryConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest request) {

        return updateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(final UpdateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler) {
        final UpdateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetResult>() {
            @Override
            public UpdateFleetResult call() throws Exception {
                UpdateFleetResult result = null;

                try {
                    result = executeUpdateFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateImagePermissionsResult> updateImagePermissionsAsync(UpdateImagePermissionsRequest request) {

        return updateImagePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateImagePermissionsResult> updateImagePermissionsAsync(final UpdateImagePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateImagePermissionsRequest, UpdateImagePermissionsResult> asyncHandler) {
        final UpdateImagePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateImagePermissionsResult>() {
            @Override
            public UpdateImagePermissionsResult call() throws Exception {
                UpdateImagePermissionsResult result = null;

                try {
                    result = executeUpdateImagePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(final UpdateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler) {
        final UpdateStackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStackResult>() {
            @Override
            public UpdateStackResult call() throws Exception {
                UpdateStackResult result = null;

                try {
                    result = executeUpdateStack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
