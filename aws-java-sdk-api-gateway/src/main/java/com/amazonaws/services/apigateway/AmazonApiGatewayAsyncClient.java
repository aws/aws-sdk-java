/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.apigateway;

import com.amazonaws.services.apigateway.model.*;

/**
 * Interface for accessing Amazon API Gateway asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon API Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure and scalable
 * mobile and web application backends. Amazon API Gateway allows developers to
 * securely connect mobile and web applications to APIs that run on AWS Lambda,
 * Amazon EC2, or other publicly addressable web services that are hosted
 * outside of AWS.
 * </p>
 */
public class AmazonApiGatewayAsyncClient extends AmazonApiGatewayClient
        implements AmazonApiGatewayAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonApiGatewayAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon API Gateway (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway using the specified AWS account credentials, executor
     * service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway using the specified AWS account credentials provider. Default
     * client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway using the provided AWS account credentials provider and
     * client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * API Gateway using the specified AWS account credentials provider,
     * executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonApiGatewayAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(
            CreateApiKeyRequest request) {

        return createApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(
            final CreateApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateApiKeyResult>() {
                    @Override
                    public CreateApiKeyResult call() throws Exception {
                        CreateApiKeyResult result;

                        try {
                            result = createApiKey(request);
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
    public java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(
            CreateBasePathMappingRequest request) {

        return createBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(
            final CreateBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBasePathMappingRequest, CreateBasePathMappingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateBasePathMappingResult>() {
                    @Override
                    public CreateBasePathMappingResult call() throws Exception {
                        CreateBasePathMappingResult result;

                        try {
                            result = createBasePathMapping(request);
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
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
                    @Override
                    public CreateDeploymentResult call() throws Exception {
                        CreateDeploymentResult result;

                        try {
                            result = createDeployment(request);
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
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(
            CreateDomainNameRequest request) {

        return createDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(
            final CreateDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDomainNameResult>() {
                    @Override
                    public CreateDomainNameResult call() throws Exception {
                        CreateDomainNameResult result;

                        try {
                            result = createDomainName(request);
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
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(
            CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(
            final CreateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateModelResult>() {
                    @Override
                    public CreateModelResult call() throws Exception {
                        CreateModelResult result;

                        try {
                            result = createModel(request);
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
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(
            CreateResourceRequest request) {

        return createResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(
            final CreateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateResourceResult>() {
                    @Override
                    public CreateResourceResult call() throws Exception {
                        CreateResourceResult result;

                        try {
                            result = createResource(request);
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
    public java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(
            CreateRestApiRequest request) {

        return createRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(
            final CreateRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRestApiRequest, CreateRestApiResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateRestApiResult>() {
                    @Override
                    public CreateRestApiResult call() throws Exception {
                        CreateRestApiResult result;

                        try {
                            result = createRestApi(request);
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
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(
            CreateStageRequest request) {

        return createStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(
            final CreateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateStageResult>() {
                    @Override
                    public CreateStageResult call() throws Exception {
                        CreateStageResult result;

                        try {
                            result = createStage(request);
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
    public java.util.concurrent.Future<Void> deleteApiKeyAsync(
            DeleteApiKeyRequest request) {

        return deleteApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApiKeyAsync(
            final DeleteApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApiKeyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteApiKey(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteBasePathMappingAsync(
            DeleteBasePathMappingRequest request) {

        return deleteBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteBasePathMappingAsync(
            final DeleteBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBasePathMappingRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteBasePathMapping(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteClientCertificateAsync(
            DeleteClientCertificateRequest request) {

        return deleteClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteClientCertificateAsync(
            final DeleteClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClientCertificateRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteClientCertificate(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteDeploymentAsync(
            DeleteDeploymentRequest request) {

        return deleteDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeploymentAsync(
            final DeleteDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteDeployment(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteDomainNameAsync(
            DeleteDomainNameRequest request) {

        return deleteDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDomainNameAsync(
            final DeleteDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteDomainName(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteIntegrationAsync(
            DeleteIntegrationRequest request) {

        return deleteIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIntegrationAsync(
            final DeleteIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteIntegration(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest request) {

        return deleteIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIntegrationResponseAsync(
            final DeleteIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationResponseRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteIntegrationResponse(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteMethodAsync(
            DeleteMethodRequest request) {

        return deleteMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMethodAsync(
            final DeleteMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMethodRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteMethod(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteMethodResponseAsync(
            DeleteMethodResponseRequest request) {

        return deleteMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMethodResponseAsync(
            final DeleteMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMethodResponseRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteMethodResponse(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteModelAsync(
            DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteModelAsync(
            final DeleteModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteModel(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteResourceAsync(
            DeleteResourceRequest request) {

        return deleteResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteResourceAsync(
            final DeleteResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteResource(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteRestApiAsync(
            DeleteRestApiRequest request) {

        return deleteRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRestApiAsync(
            final DeleteRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRestApiRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteRestApi(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteStageAsync(
            DeleteStageRequest request) {

        return deleteStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStageAsync(
            final DeleteStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteStage(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> flushStageCacheAsync(
            FlushStageCacheRequest request) {

        return flushStageCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> flushStageCacheAsync(
            final FlushStageCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<FlushStageCacheRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            flushStageCache(request);
                            result = null;
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
    public java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(
            GenerateClientCertificateRequest request) {

        return generateClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(
            final GenerateClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateClientCertificateRequest, GenerateClientCertificateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GenerateClientCertificateResult>() {
                    @Override
                    public GenerateClientCertificateResult call()
                            throws Exception {
                        GenerateClientCertificateResult result;

                        try {
                            result = generateClientCertificate(request);
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
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(
            GetAccountRequest request) {

        return getAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(
            final GetAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetAccountResult>() {
                    @Override
                    public GetAccountResult call() throws Exception {
                        GetAccountResult result;

                        try {
                            result = getAccount(request);
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
    public java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(
            GetApiKeyRequest request) {

        return getApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(
            final GetApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApiKeyRequest, GetApiKeyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetApiKeyResult>() {
                    @Override
                    public GetApiKeyResult call() throws Exception {
                        GetApiKeyResult result;

                        try {
                            result = getApiKey(request);
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
    public java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(
            GetApiKeysRequest request) {

        return getApiKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(
            final GetApiKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApiKeysRequest, GetApiKeysResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetApiKeysResult>() {
                    @Override
                    public GetApiKeysResult call() throws Exception {
                        GetApiKeysResult result;

                        try {
                            result = getApiKeys(request);
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
    public java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(
            GetBasePathMappingRequest request) {

        return getBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(
            final GetBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBasePathMappingRequest, GetBasePathMappingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetBasePathMappingResult>() {
                    @Override
                    public GetBasePathMappingResult call() throws Exception {
                        GetBasePathMappingResult result;

                        try {
                            result = getBasePathMapping(request);
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
    public java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(
            GetBasePathMappingsRequest request) {

        return getBasePathMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(
            final GetBasePathMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBasePathMappingsRequest, GetBasePathMappingsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetBasePathMappingsResult>() {
                    @Override
                    public GetBasePathMappingsResult call() throws Exception {
                        GetBasePathMappingsResult result;

                        try {
                            result = getBasePathMappings(request);
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
    public java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(
            GetClientCertificateRequest request) {

        return getClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(
            final GetClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClientCertificateRequest, GetClientCertificateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetClientCertificateResult>() {
                    @Override
                    public GetClientCertificateResult call() throws Exception {
                        GetClientCertificateResult result;

                        try {
                            result = getClientCertificate(request);
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
    public java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(
            GetClientCertificatesRequest request) {

        return getClientCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(
            final GetClientCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClientCertificatesRequest, GetClientCertificatesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetClientCertificatesResult>() {
                    @Override
                    public GetClientCertificatesResult call() throws Exception {
                        GetClientCertificatesResult result;

                        try {
                            result = getClientCertificates(request);
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
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
                    @Override
                    public GetDeploymentResult call() throws Exception {
                        GetDeploymentResult result;

                        try {
                            result = getDeployment(request);
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
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(
            GetDeploymentsRequest request) {

        return getDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(
            final GetDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentsRequest, GetDeploymentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentsResult>() {
                    @Override
                    public GetDeploymentsResult call() throws Exception {
                        GetDeploymentsResult result;

                        try {
                            result = getDeployments(request);
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
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(
            GetDomainNameRequest request) {

        return getDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(
            final GetDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDomainNameResult>() {
                    @Override
                    public GetDomainNameResult call() throws Exception {
                        GetDomainNameResult result;

                        try {
                            result = getDomainName(request);
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
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(
            GetDomainNamesRequest request) {

        return getDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(
            final GetDomainNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainNamesRequest, GetDomainNamesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDomainNamesResult>() {
                    @Override
                    public GetDomainNamesResult call() throws Exception {
                        GetDomainNamesResult result;

                        try {
                            result = getDomainNames(request);
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
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(
            GetIntegrationRequest request) {

        return getIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(
            final GetIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetIntegrationResult>() {
                    @Override
                    public GetIntegrationResult call() throws Exception {
                        GetIntegrationResult result;

                        try {
                            result = getIntegration(request);
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
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(
            GetIntegrationResponseRequest request) {

        return getIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(
            final GetIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationResponseRequest, GetIntegrationResponseResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetIntegrationResponseResult>() {
                    @Override
                    public GetIntegrationResponseResult call() throws Exception {
                        GetIntegrationResponseResult result;

                        try {
                            result = getIntegrationResponse(request);
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
    public java.util.concurrent.Future<GetMethodResult> getMethodAsync(
            GetMethodRequest request) {

        return getMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMethodResult> getMethodAsync(
            final GetMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMethodRequest, GetMethodResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetMethodResult>() {
                    @Override
                    public GetMethodResult call() throws Exception {
                        GetMethodResult result;

                        try {
                            result = getMethod(request);
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
    public java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(
            GetMethodResponseRequest request) {

        return getMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(
            final GetMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMethodResponseRequest, GetMethodResponseResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetMethodResponseResult>() {
                    @Override
                    public GetMethodResponseResult call() throws Exception {
                        GetMethodResponseResult result;

                        try {
                            result = getMethodResponse(request);
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
    public java.util.concurrent.Future<GetModelResult> getModelAsync(
            GetModelRequest request) {

        return getModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelResult> getModelAsync(
            final GetModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelRequest, GetModelResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetModelResult>() {
                    @Override
                    public GetModelResult call() throws Exception {
                        GetModelResult result;

                        try {
                            result = getModel(request);
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
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(
            GetModelTemplateRequest request) {

        return getModelTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(
            final GetModelTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelTemplateRequest, GetModelTemplateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetModelTemplateResult>() {
                    @Override
                    public GetModelTemplateResult call() throws Exception {
                        GetModelTemplateResult result;

                        try {
                            result = getModelTemplate(request);
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
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(
            GetModelsRequest request) {

        return getModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(
            final GetModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetModelsResult>() {
                    @Override
                    public GetModelsResult call() throws Exception {
                        GetModelsResult result;

                        try {
                            result = getModels(request);
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
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(
            GetResourceRequest request) {

        return getResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(
            final GetResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetResourceResult>() {
                    @Override
                    public GetResourceResult call() throws Exception {
                        GetResourceResult result;

                        try {
                            result = getResource(request);
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
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(
            GetResourcesRequest request) {

        return getResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(
            final GetResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetResourcesResult>() {
                    @Override
                    public GetResourcesResult call() throws Exception {
                        GetResourcesResult result;

                        try {
                            result = getResources(request);
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
    public java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(
            GetRestApiRequest request) {

        return getRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(
            final GetRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRestApiRequest, GetRestApiResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetRestApiResult>() {
                    @Override
                    public GetRestApiResult call() throws Exception {
                        GetRestApiResult result;

                        try {
                            result = getRestApi(request);
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
    public java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(
            GetRestApisRequest request) {

        return getRestApisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(
            final GetRestApisRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRestApisRequest, GetRestApisResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetRestApisResult>() {
                    @Override
                    public GetRestApisResult call() throws Exception {
                        GetRestApisResult result;

                        try {
                            result = getRestApis(request);
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
    public java.util.concurrent.Future<GetSdkResult> getSdkAsync(
            GetSdkRequest request) {

        return getSdkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSdkResult> getSdkAsync(
            final GetSdkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSdkRequest, GetSdkResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetSdkResult>() {
                    @Override
                    public GetSdkResult call() throws Exception {
                        GetSdkResult result;

                        try {
                            result = getSdk(request);
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
    public java.util.concurrent.Future<GetStageResult> getStageAsync(
            GetStageRequest request) {

        return getStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(
            final GetStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetStageResult>() {
                    @Override
                    public GetStageResult call() throws Exception {
                        GetStageResult result;

                        try {
                            result = getStage(request);
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
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(
            GetStagesRequest request) {

        return getStagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(
            final GetStagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStagesRequest, GetStagesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetStagesResult>() {
                    @Override
                    public GetStagesResult call() throws Exception {
                        GetStagesResult result;

                        try {
                            result = getStages(request);
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
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(
            PutIntegrationRequest request) {

        return putIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(
            final PutIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutIntegrationResult>() {
                    @Override
                    public PutIntegrationResult call() throws Exception {
                        PutIntegrationResult result;

                        try {
                            result = putIntegration(request);
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
    public java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(
            PutIntegrationResponseRequest request) {

        return putIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(
            final PutIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutIntegrationResponseRequest, PutIntegrationResponseResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutIntegrationResponseResult>() {
                    @Override
                    public PutIntegrationResponseResult call() throws Exception {
                        PutIntegrationResponseResult result;

                        try {
                            result = putIntegrationResponse(request);
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
    public java.util.concurrent.Future<PutMethodResult> putMethodAsync(
            PutMethodRequest request) {

        return putMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMethodResult> putMethodAsync(
            final PutMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMethodRequest, PutMethodResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutMethodResult>() {
                    @Override
                    public PutMethodResult call() throws Exception {
                        PutMethodResult result;

                        try {
                            result = putMethod(request);
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
    public java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(
            PutMethodResponseRequest request) {

        return putMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(
            final PutMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMethodResponseRequest, PutMethodResponseResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutMethodResponseResult>() {
                    @Override
                    public PutMethodResponseResult call() throws Exception {
                        PutMethodResponseResult result;

                        try {
                            result = putMethodResponse(request);
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
    public java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(
            TestInvokeMethodRequest request) {

        return testInvokeMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(
            final TestInvokeMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestInvokeMethodRequest, TestInvokeMethodResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<TestInvokeMethodResult>() {
                    @Override
                    public TestInvokeMethodResult call() throws Exception {
                        TestInvokeMethodResult result;

                        try {
                            result = testInvokeMethod(request);
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
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(
            UpdateAccountRequest request) {

        return updateAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(
            final UpdateAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateAccountResult>() {
                    @Override
                    public UpdateAccountResult call() throws Exception {
                        UpdateAccountResult result;

                        try {
                            result = updateAccount(request);
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
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(
            UpdateApiKeyRequest request) {

        return updateApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(
            final UpdateApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateApiKeyResult>() {
                    @Override
                    public UpdateApiKeyResult call() throws Exception {
                        UpdateApiKeyResult result;

                        try {
                            result = updateApiKey(request);
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
    public java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(
            UpdateBasePathMappingRequest request) {

        return updateBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(
            final UpdateBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBasePathMappingRequest, UpdateBasePathMappingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateBasePathMappingResult>() {
                    @Override
                    public UpdateBasePathMappingResult call() throws Exception {
                        UpdateBasePathMappingResult result;

                        try {
                            result = updateBasePathMapping(request);
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
    public java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(
            UpdateClientCertificateRequest request) {

        return updateClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(
            final UpdateClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClientCertificateRequest, UpdateClientCertificateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateClientCertificateResult>() {
                    @Override
                    public UpdateClientCertificateResult call()
                            throws Exception {
                        UpdateClientCertificateResult result;

                        try {
                            result = updateClientCertificate(request);
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
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(
            UpdateDeploymentRequest request) {

        return updateDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(
            final UpdateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateDeploymentResult>() {
                    @Override
                    public UpdateDeploymentResult call() throws Exception {
                        UpdateDeploymentResult result;

                        try {
                            result = updateDeployment(request);
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
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(
            UpdateDomainNameRequest request) {

        return updateDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(
            final UpdateDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateDomainNameResult>() {
                    @Override
                    public UpdateDomainNameResult call() throws Exception {
                        UpdateDomainNameResult result;

                        try {
                            result = updateDomainName(request);
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
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(
            UpdateIntegrationRequest request) {

        return updateIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(
            final UpdateIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateIntegrationResult>() {
                    @Override
                    public UpdateIntegrationResult call() throws Exception {
                        UpdateIntegrationResult result;

                        try {
                            result = updateIntegration(request);
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
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            UpdateIntegrationResponseRequest request) {

        return updateIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            final UpdateIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIntegrationResponseRequest, UpdateIntegrationResponseResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateIntegrationResponseResult>() {
                    @Override
                    public UpdateIntegrationResponseResult call()
                            throws Exception {
                        UpdateIntegrationResponseResult result;

                        try {
                            result = updateIntegrationResponse(request);
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
    public java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(
            UpdateMethodRequest request) {

        return updateMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(
            final UpdateMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMethodRequest, UpdateMethodResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateMethodResult>() {
                    @Override
                    public UpdateMethodResult call() throws Exception {
                        UpdateMethodResult result;

                        try {
                            result = updateMethod(request);
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
    public java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(
            UpdateMethodResponseRequest request) {

        return updateMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(
            final UpdateMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMethodResponseRequest, UpdateMethodResponseResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateMethodResponseResult>() {
                    @Override
                    public UpdateMethodResponseResult call() throws Exception {
                        UpdateMethodResponseResult result;

                        try {
                            result = updateMethodResponse(request);
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
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(
            UpdateModelRequest request) {

        return updateModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(
            final UpdateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateModelResult>() {
                    @Override
                    public UpdateModelResult call() throws Exception {
                        UpdateModelResult result;

                        try {
                            result = updateModel(request);
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
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(
            UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(
            final UpdateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateResourceResult>() {
                    @Override
                    public UpdateResourceResult call() throws Exception {
                        UpdateResourceResult result;

                        try {
                            result = updateResource(request);
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
    public java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(
            UpdateRestApiRequest request) {

        return updateRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(
            final UpdateRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRestApiRequest, UpdateRestApiResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateRestApiResult>() {
                    @Override
                    public UpdateRestApiResult call() throws Exception {
                        UpdateRestApiResult result;

                        try {
                            result = updateRestApi(request);
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
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(
            UpdateStageRequest request) {

        return updateStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(
            final UpdateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateStageResult>() {
                    @Override
                    public UpdateStageResult call() throws Exception {
                        UpdateStageResult result;

                        try {
                            result = updateStage(request);
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
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
