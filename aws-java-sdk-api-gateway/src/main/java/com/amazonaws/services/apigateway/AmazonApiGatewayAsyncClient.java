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
package com.amazonaws.services.apigateway;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon API Gateway asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon API Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure, and scalable mobile and web application back ends. API
 * Gateway allows developers to securely connect mobile and web applications to APIs that run on AWS Lambda, Amazon EC2,
 * or other publicly addressable web services that are hosted outside of AWS.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonApiGatewayAsyncClient extends AmazonApiGatewayClient implements AmazonApiGatewayAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway. A credentials provider
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
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway. A credentials provider
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
     *        The client configuration options controlling how this client connects to Amazon API Gateway (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonApiGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the provided AWS
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
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonApiGatewayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonApiGatewayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonApiGatewayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonApiGatewayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonApiGatewayAsyncClientBuilder asyncBuilder() {
        return AmazonApiGatewayAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon API Gateway using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonApiGatewayAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(CreateApiKeyRequest request) {

        return createApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(final CreateApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResult> asyncHandler) {
        final CreateApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApiKeyResult>() {
            @Override
            public CreateApiKeyResult call() throws Exception {
                CreateApiKeyResult result = null;

                try {
                    result = executeCreateApiKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest request) {

        return createAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(final CreateAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAuthorizerRequest, CreateAuthorizerResult> asyncHandler) {
        final CreateAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAuthorizerResult>() {
            @Override
            public CreateAuthorizerResult call() throws Exception {
                CreateAuthorizerResult result = null;

                try {
                    result = executeCreateAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(CreateBasePathMappingRequest request) {

        return createBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(final CreateBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBasePathMappingRequest, CreateBasePathMappingResult> asyncHandler) {
        final CreateBasePathMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBasePathMappingResult>() {
            @Override
            public CreateBasePathMappingResult call() throws Exception {
                CreateBasePathMappingResult result = null;

                try {
                    result = executeCreateBasePathMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentationPartResult> createDocumentationPartAsync(CreateDocumentationPartRequest request) {

        return createDocumentationPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentationPartResult> createDocumentationPartAsync(final CreateDocumentationPartRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDocumentationPartRequest, CreateDocumentationPartResult> asyncHandler) {
        final CreateDocumentationPartRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDocumentationPartResult>() {
            @Override
            public CreateDocumentationPartResult call() throws Exception {
                CreateDocumentationPartResult result = null;

                try {
                    result = executeCreateDocumentationPart(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentationVersionResult> createDocumentationVersionAsync(CreateDocumentationVersionRequest request) {

        return createDocumentationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentationVersionResult> createDocumentationVersionAsync(final CreateDocumentationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDocumentationVersionRequest, CreateDocumentationVersionResult> asyncHandler) {
        final CreateDocumentationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDocumentationVersionResult>() {
            @Override
            public CreateDocumentationVersionResult call() throws Exception {
                CreateDocumentationVersionResult result = null;

                try {
                    result = executeCreateDocumentationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest request) {

        return createDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(final CreateDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler) {
        final CreateDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainNameResult>() {
            @Override
            public CreateDomainNameResult call() throws Exception {
                CreateDomainNameResult result = null;

                try {
                    result = executeCreateDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(final CreateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {
        final CreateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelResult>() {
            @Override
            public CreateModelResult call() throws Exception {
                CreateModelResult result = null;

                try {
                    result = executeCreateModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRequestValidatorResult> createRequestValidatorAsync(CreateRequestValidatorRequest request) {

        return createRequestValidatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRequestValidatorResult> createRequestValidatorAsync(final CreateRequestValidatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRequestValidatorRequest, CreateRequestValidatorResult> asyncHandler) {
        final CreateRequestValidatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRequestValidatorResult>() {
            @Override
            public CreateRequestValidatorResult call() throws Exception {
                CreateRequestValidatorResult result = null;

                try {
                    result = executeCreateRequestValidator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest request) {

        return createResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceResult> createResourceAsync(final CreateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler) {
        final CreateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceResult>() {
            @Override
            public CreateResourceResult call() throws Exception {
                CreateResourceResult result = null;

                try {
                    result = executeCreateResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(CreateRestApiRequest request) {

        return createRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(final CreateRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRestApiRequest, CreateRestApiResult> asyncHandler) {
        final CreateRestApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRestApiResult>() {
            @Override
            public CreateRestApiResult call() throws Exception {
                CreateRestApiResult result = null;

                try {
                    result = executeCreateRestApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest request) {

        return createStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(final CreateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler) {
        final CreateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStageResult>() {
            @Override
            public CreateStageResult call() throws Exception {
                CreateStageResult result = null;

                try {
                    result = executeCreateStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUsagePlanResult> createUsagePlanAsync(CreateUsagePlanRequest request) {

        return createUsagePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUsagePlanResult> createUsagePlanAsync(final CreateUsagePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUsagePlanRequest, CreateUsagePlanResult> asyncHandler) {
        final CreateUsagePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUsagePlanResult>() {
            @Override
            public CreateUsagePlanResult call() throws Exception {
                CreateUsagePlanResult result = null;

                try {
                    result = executeCreateUsagePlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUsagePlanKeyResult> createUsagePlanKeyAsync(CreateUsagePlanKeyRequest request) {

        return createUsagePlanKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUsagePlanKeyResult> createUsagePlanKeyAsync(final CreateUsagePlanKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUsagePlanKeyRequest, CreateUsagePlanKeyResult> asyncHandler) {
        final CreateUsagePlanKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUsagePlanKeyResult>() {
            @Override
            public CreateUsagePlanKeyResult call() throws Exception {
                CreateUsagePlanKeyResult result = null;

                try {
                    result = executeCreateUsagePlanKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVpcLinkResult> createVpcLinkAsync(CreateVpcLinkRequest request) {

        return createVpcLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcLinkResult> createVpcLinkAsync(final CreateVpcLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcLinkRequest, CreateVpcLinkResult> asyncHandler) {
        final CreateVpcLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcLinkResult>() {
            @Override
            public CreateVpcLinkResult call() throws Exception {
                CreateVpcLinkResult result = null;

                try {
                    result = executeCreateVpcLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(DeleteApiKeyRequest request) {

        return deleteApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(final DeleteApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResult> asyncHandler) {
        final DeleteApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApiKeyResult>() {
            @Override
            public DeleteApiKeyResult call() throws Exception {
                DeleteApiKeyResult result = null;

                try {
                    result = executeDeleteApiKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest request) {

        return deleteAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(final DeleteAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAuthorizerRequest, DeleteAuthorizerResult> asyncHandler) {
        final DeleteAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAuthorizerResult>() {
            @Override
            public DeleteAuthorizerResult call() throws Exception {
                DeleteAuthorizerResult result = null;

                try {
                    result = executeDeleteAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBasePathMappingResult> deleteBasePathMappingAsync(DeleteBasePathMappingRequest request) {

        return deleteBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBasePathMappingResult> deleteBasePathMappingAsync(final DeleteBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBasePathMappingRequest, DeleteBasePathMappingResult> asyncHandler) {
        final DeleteBasePathMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBasePathMappingResult>() {
            @Override
            public DeleteBasePathMappingResult call() throws Exception {
                DeleteBasePathMappingResult result = null;

                try {
                    result = executeDeleteBasePathMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteClientCertificateResult> deleteClientCertificateAsync(DeleteClientCertificateRequest request) {

        return deleteClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClientCertificateResult> deleteClientCertificateAsync(final DeleteClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClientCertificateRequest, DeleteClientCertificateResult> asyncHandler) {
        final DeleteClientCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClientCertificateResult>() {
            @Override
            public DeleteClientCertificateResult call() throws Exception {
                DeleteClientCertificateResult result = null;

                try {
                    result = executeDeleteClientCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest request) {

        return deleteDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(final DeleteDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResult> asyncHandler) {
        final DeleteDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentResult>() {
            @Override
            public DeleteDeploymentResult call() throws Exception {
                DeleteDeploymentResult result = null;

                try {
                    result = executeDeleteDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentationPartResult> deleteDocumentationPartAsync(DeleteDocumentationPartRequest request) {

        return deleteDocumentationPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentationPartResult> deleteDocumentationPartAsync(final DeleteDocumentationPartRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDocumentationPartRequest, DeleteDocumentationPartResult> asyncHandler) {
        final DeleteDocumentationPartRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDocumentationPartResult>() {
            @Override
            public DeleteDocumentationPartResult call() throws Exception {
                DeleteDocumentationPartResult result = null;

                try {
                    result = executeDeleteDocumentationPart(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentationVersionResult> deleteDocumentationVersionAsync(DeleteDocumentationVersionRequest request) {

        return deleteDocumentationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentationVersionResult> deleteDocumentationVersionAsync(final DeleteDocumentationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDocumentationVersionRequest, DeleteDocumentationVersionResult> asyncHandler) {
        final DeleteDocumentationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDocumentationVersionResult>() {
            @Override
            public DeleteDocumentationVersionResult call() throws Exception {
                DeleteDocumentationVersionResult result = null;

                try {
                    result = executeDeleteDocumentationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest request) {

        return deleteDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(final DeleteDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, DeleteDomainNameResult> asyncHandler) {
        final DeleteDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainNameResult>() {
            @Override
            public DeleteDomainNameResult call() throws Exception {
                DeleteDomainNameResult result = null;

                try {
                    result = executeDeleteDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResponseResult> deleteGatewayResponseAsync(DeleteGatewayResponseRequest request) {

        return deleteGatewayResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResponseResult> deleteGatewayResponseAsync(final DeleteGatewayResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGatewayResponseRequest, DeleteGatewayResponseResult> asyncHandler) {
        final DeleteGatewayResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGatewayResponseResult>() {
            @Override
            public DeleteGatewayResponseResult call() throws Exception {
                DeleteGatewayResponseResult result = null;

                try {
                    result = executeDeleteGatewayResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest request) {

        return deleteIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(final DeleteIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler) {
        final DeleteIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntegrationResult>() {
            @Override
            public DeleteIntegrationResult call() throws Exception {
                DeleteIntegrationResult result = null;

                try {
                    result = executeDeleteIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(DeleteIntegrationResponseRequest request) {

        return deleteIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(final DeleteIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationResponseRequest, DeleteIntegrationResponseResult> asyncHandler) {
        final DeleteIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntegrationResponseResult>() {
            @Override
            public DeleteIntegrationResponseResult call() throws Exception {
                DeleteIntegrationResponseResult result = null;

                try {
                    result = executeDeleteIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMethodResult> deleteMethodAsync(DeleteMethodRequest request) {

        return deleteMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMethodResult> deleteMethodAsync(final DeleteMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMethodRequest, DeleteMethodResult> asyncHandler) {
        final DeleteMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMethodResult>() {
            @Override
            public DeleteMethodResult call() throws Exception {
                DeleteMethodResult result = null;

                try {
                    result = executeDeleteMethod(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMethodResponseResult> deleteMethodResponseAsync(DeleteMethodResponseRequest request) {

        return deleteMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMethodResponseResult> deleteMethodResponseAsync(final DeleteMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMethodResponseRequest, DeleteMethodResponseResult> asyncHandler) {
        final DeleteMethodResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMethodResponseResult>() {
            @Override
            public DeleteMethodResponseResult call() throws Exception {
                DeleteMethodResponseResult result = null;

                try {
                    result = executeDeleteMethodResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(final DeleteModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler) {
        final DeleteModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelResult>() {
            @Override
            public DeleteModelResult call() throws Exception {
                DeleteModelResult result = null;

                try {
                    result = executeDeleteModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRequestValidatorResult> deleteRequestValidatorAsync(DeleteRequestValidatorRequest request) {

        return deleteRequestValidatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRequestValidatorResult> deleteRequestValidatorAsync(final DeleteRequestValidatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRequestValidatorRequest, DeleteRequestValidatorResult> asyncHandler) {
        final DeleteRequestValidatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRequestValidatorResult>() {
            @Override
            public DeleteRequestValidatorResult call() throws Exception {
                DeleteRequestValidatorResult result = null;

                try {
                    result = executeDeleteRequestValidator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest request) {

        return deleteResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(final DeleteResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler) {
        final DeleteResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceResult>() {
            @Override
            public DeleteResourceResult call() throws Exception {
                DeleteResourceResult result = null;

                try {
                    result = executeDeleteResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRestApiResult> deleteRestApiAsync(DeleteRestApiRequest request) {

        return deleteRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRestApiResult> deleteRestApiAsync(final DeleteRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRestApiRequest, DeleteRestApiResult> asyncHandler) {
        final DeleteRestApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRestApiResult>() {
            @Override
            public DeleteRestApiResult call() throws Exception {
                DeleteRestApiResult result = null;

                try {
                    result = executeDeleteRestApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest request) {

        return deleteStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(final DeleteStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler) {
        final DeleteStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStageResult>() {
            @Override
            public DeleteStageResult call() throws Exception {
                DeleteStageResult result = null;

                try {
                    result = executeDeleteStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUsagePlanResult> deleteUsagePlanAsync(DeleteUsagePlanRequest request) {

        return deleteUsagePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUsagePlanResult> deleteUsagePlanAsync(final DeleteUsagePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUsagePlanRequest, DeleteUsagePlanResult> asyncHandler) {
        final DeleteUsagePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUsagePlanResult>() {
            @Override
            public DeleteUsagePlanResult call() throws Exception {
                DeleteUsagePlanResult result = null;

                try {
                    result = executeDeleteUsagePlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUsagePlanKeyResult> deleteUsagePlanKeyAsync(DeleteUsagePlanKeyRequest request) {

        return deleteUsagePlanKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUsagePlanKeyResult> deleteUsagePlanKeyAsync(final DeleteUsagePlanKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUsagePlanKeyRequest, DeleteUsagePlanKeyResult> asyncHandler) {
        final DeleteUsagePlanKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUsagePlanKeyResult>() {
            @Override
            public DeleteUsagePlanKeyResult call() throws Exception {
                DeleteUsagePlanKeyResult result = null;

                try {
                    result = executeDeleteUsagePlanKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcLinkResult> deleteVpcLinkAsync(DeleteVpcLinkRequest request) {

        return deleteVpcLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcLinkResult> deleteVpcLinkAsync(final DeleteVpcLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcLinkRequest, DeleteVpcLinkResult> asyncHandler) {
        final DeleteVpcLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcLinkResult>() {
            @Override
            public DeleteVpcLinkResult call() throws Exception {
                DeleteVpcLinkResult result = null;

                try {
                    result = executeDeleteVpcLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<FlushStageAuthorizersCacheResult> flushStageAuthorizersCacheAsync(FlushStageAuthorizersCacheRequest request) {

        return flushStageAuthorizersCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FlushStageAuthorizersCacheResult> flushStageAuthorizersCacheAsync(final FlushStageAuthorizersCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<FlushStageAuthorizersCacheRequest, FlushStageAuthorizersCacheResult> asyncHandler) {
        final FlushStageAuthorizersCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<FlushStageAuthorizersCacheResult>() {
            @Override
            public FlushStageAuthorizersCacheResult call() throws Exception {
                FlushStageAuthorizersCacheResult result = null;

                try {
                    result = executeFlushStageAuthorizersCache(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<FlushStageCacheResult> flushStageCacheAsync(FlushStageCacheRequest request) {

        return flushStageCacheAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FlushStageCacheResult> flushStageCacheAsync(final FlushStageCacheRequest request,
            final com.amazonaws.handlers.AsyncHandler<FlushStageCacheRequest, FlushStageCacheResult> asyncHandler) {
        final FlushStageCacheRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<FlushStageCacheResult>() {
            @Override
            public FlushStageCacheResult call() throws Exception {
                FlushStageCacheResult result = null;

                try {
                    result = executeFlushStageCache(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(GenerateClientCertificateRequest request) {

        return generateClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(final GenerateClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateClientCertificateRequest, GenerateClientCertificateResult> asyncHandler) {
        final GenerateClientCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateClientCertificateResult>() {
            @Override
            public GenerateClientCertificateResult call() throws Exception {
                GenerateClientCertificateResult result = null;

                try {
                    result = executeGenerateClientCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest request) {

        return getAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(final GetAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler) {
        final GetAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountResult>() {
            @Override
            public GetAccountResult call() throws Exception {
                GetAccountResult result = null;

                try {
                    result = executeGetAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(GetApiKeyRequest request) {

        return getApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(final GetApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApiKeyRequest, GetApiKeyResult> asyncHandler) {
        final GetApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApiKeyResult>() {
            @Override
            public GetApiKeyResult call() throws Exception {
                GetApiKeyResult result = null;

                try {
                    result = executeGetApiKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(GetApiKeysRequest request) {

        return getApiKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(final GetApiKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApiKeysRequest, GetApiKeysResult> asyncHandler) {
        final GetApiKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApiKeysResult>() {
            @Override
            public GetApiKeysResult call() throws Exception {
                GetApiKeysResult result = null;

                try {
                    result = executeGetApiKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(GetAuthorizerRequest request) {

        return getAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(final GetAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthorizerRequest, GetAuthorizerResult> asyncHandler) {
        final GetAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAuthorizerResult>() {
            @Override
            public GetAuthorizerResult call() throws Exception {
                GetAuthorizerResult result = null;

                try {
                    result = executeGetAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(GetAuthorizersRequest request) {

        return getAuthorizersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(final GetAuthorizersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthorizersRequest, GetAuthorizersResult> asyncHandler) {
        final GetAuthorizersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAuthorizersResult>() {
            @Override
            public GetAuthorizersResult call() throws Exception {
                GetAuthorizersResult result = null;

                try {
                    result = executeGetAuthorizers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(GetBasePathMappingRequest request) {

        return getBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(final GetBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBasePathMappingRequest, GetBasePathMappingResult> asyncHandler) {
        final GetBasePathMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBasePathMappingResult>() {
            @Override
            public GetBasePathMappingResult call() throws Exception {
                GetBasePathMappingResult result = null;

                try {
                    result = executeGetBasePathMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(GetBasePathMappingsRequest request) {

        return getBasePathMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(final GetBasePathMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBasePathMappingsRequest, GetBasePathMappingsResult> asyncHandler) {
        final GetBasePathMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBasePathMappingsResult>() {
            @Override
            public GetBasePathMappingsResult call() throws Exception {
                GetBasePathMappingsResult result = null;

                try {
                    result = executeGetBasePathMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(GetClientCertificateRequest request) {

        return getClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(final GetClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClientCertificateRequest, GetClientCertificateResult> asyncHandler) {
        final GetClientCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClientCertificateResult>() {
            @Override
            public GetClientCertificateResult call() throws Exception {
                GetClientCertificateResult result = null;

                try {
                    result = executeGetClientCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(GetClientCertificatesRequest request) {

        return getClientCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(final GetClientCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClientCertificatesRequest, GetClientCertificatesResult> asyncHandler) {
        final GetClientCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClientCertificatesResult>() {
            @Override
            public GetClientCertificatesResult call() throws Exception {
                GetClientCertificatesResult result = null;

                try {
                    result = executeGetClientCertificates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {
        final GetDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result = null;

                try {
                    result = executeGetDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(GetDeploymentsRequest request) {

        return getDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(final GetDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentsRequest, GetDeploymentsResult> asyncHandler) {
        final GetDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentsResult>() {
            @Override
            public GetDeploymentsResult call() throws Exception {
                GetDeploymentsResult result = null;

                try {
                    result = executeGetDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationPartResult> getDocumentationPartAsync(GetDocumentationPartRequest request) {

        return getDocumentationPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationPartResult> getDocumentationPartAsync(final GetDocumentationPartRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentationPartRequest, GetDocumentationPartResult> asyncHandler) {
        final GetDocumentationPartRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentationPartResult>() {
            @Override
            public GetDocumentationPartResult call() throws Exception {
                GetDocumentationPartResult result = null;

                try {
                    result = executeGetDocumentationPart(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationPartsResult> getDocumentationPartsAsync(GetDocumentationPartsRequest request) {

        return getDocumentationPartsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationPartsResult> getDocumentationPartsAsync(final GetDocumentationPartsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentationPartsRequest, GetDocumentationPartsResult> asyncHandler) {
        final GetDocumentationPartsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentationPartsResult>() {
            @Override
            public GetDocumentationPartsResult call() throws Exception {
                GetDocumentationPartsResult result = null;

                try {
                    result = executeGetDocumentationParts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationVersionResult> getDocumentationVersionAsync(GetDocumentationVersionRequest request) {

        return getDocumentationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationVersionResult> getDocumentationVersionAsync(final GetDocumentationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentationVersionRequest, GetDocumentationVersionResult> asyncHandler) {
        final GetDocumentationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentationVersionResult>() {
            @Override
            public GetDocumentationVersionResult call() throws Exception {
                GetDocumentationVersionResult result = null;

                try {
                    result = executeGetDocumentationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationVersionsResult> getDocumentationVersionsAsync(GetDocumentationVersionsRequest request) {

        return getDocumentationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentationVersionsResult> getDocumentationVersionsAsync(final GetDocumentationVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentationVersionsRequest, GetDocumentationVersionsResult> asyncHandler) {
        final GetDocumentationVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentationVersionsResult>() {
            @Override
            public GetDocumentationVersionsResult call() throws Exception {
                GetDocumentationVersionsResult result = null;

                try {
                    result = executeGetDocumentationVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest request) {

        return getDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(final GetDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler) {
        final GetDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainNameResult>() {
            @Override
            public GetDomainNameResult call() throws Exception {
                GetDomainNameResult result = null;

                try {
                    result = executeGetDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(GetDomainNamesRequest request) {

        return getDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(final GetDomainNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainNamesRequest, GetDomainNamesResult> asyncHandler) {
        final GetDomainNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainNamesResult>() {
            @Override
            public GetDomainNamesResult call() throws Exception {
                GetDomainNamesResult result = null;

                try {
                    result = executeGetDomainNames(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest request) {

        return getExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExportResult> getExportAsync(final GetExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExportRequest, GetExportResult> asyncHandler) {
        final GetExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExportResult>() {
            @Override
            public GetExportResult call() throws Exception {
                GetExportResult result = null;

                try {
                    result = executeGetExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResponseResult> getGatewayResponseAsync(GetGatewayResponseRequest request) {

        return getGatewayResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResponseResult> getGatewayResponseAsync(final GetGatewayResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGatewayResponseRequest, GetGatewayResponseResult> asyncHandler) {
        final GetGatewayResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGatewayResponseResult>() {
            @Override
            public GetGatewayResponseResult call() throws Exception {
                GetGatewayResponseResult result = null;

                try {
                    result = executeGetGatewayResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResponsesResult> getGatewayResponsesAsync(GetGatewayResponsesRequest request) {

        return getGatewayResponsesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResponsesResult> getGatewayResponsesAsync(final GetGatewayResponsesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGatewayResponsesRequest, GetGatewayResponsesResult> asyncHandler) {
        final GetGatewayResponsesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGatewayResponsesResult>() {
            @Override
            public GetGatewayResponsesResult call() throws Exception {
                GetGatewayResponsesResult result = null;

                try {
                    result = executeGetGatewayResponses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest request) {

        return getIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(final GetIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler) {
        final GetIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntegrationResult>() {
            @Override
            public GetIntegrationResult call() throws Exception {
                GetIntegrationResult result = null;

                try {
                    result = executeGetIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(GetIntegrationResponseRequest request) {

        return getIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(final GetIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationResponseRequest, GetIntegrationResponseResult> asyncHandler) {
        final GetIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntegrationResponseResult>() {
            @Override
            public GetIntegrationResponseResult call() throws Exception {
                GetIntegrationResponseResult result = null;

                try {
                    result = executeGetIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMethodResult> getMethodAsync(GetMethodRequest request) {

        return getMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMethodResult> getMethodAsync(final GetMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMethodRequest, GetMethodResult> asyncHandler) {
        final GetMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMethodResult>() {
            @Override
            public GetMethodResult call() throws Exception {
                GetMethodResult result = null;

                try {
                    result = executeGetMethod(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(GetMethodResponseRequest request) {

        return getMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(final GetMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMethodResponseRequest, GetMethodResponseResult> asyncHandler) {
        final GetMethodResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMethodResponseResult>() {
            @Override
            public GetMethodResponseResult call() throws Exception {
                GetMethodResponseResult result = null;

                try {
                    result = executeGetMethodResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelResult> getModelAsync(GetModelRequest request) {

        return getModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelResult> getModelAsync(final GetModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelRequest, GetModelResult> asyncHandler) {
        final GetModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelResult>() {
            @Override
            public GetModelResult call() throws Exception {
                GetModelResult result = null;

                try {
                    result = executeGetModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(GetModelTemplateRequest request) {

        return getModelTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(final GetModelTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelTemplateRequest, GetModelTemplateResult> asyncHandler) {
        final GetModelTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelTemplateResult>() {
            @Override
            public GetModelTemplateResult call() throws Exception {
                GetModelTemplateResult result = null;

                try {
                    result = executeGetModelTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest request) {

        return getModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(final GetModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler) {
        final GetModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelsResult>() {
            @Override
            public GetModelsResult call() throws Exception {
                GetModelsResult result = null;

                try {
                    result = executeGetModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRequestValidatorResult> getRequestValidatorAsync(GetRequestValidatorRequest request) {

        return getRequestValidatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRequestValidatorResult> getRequestValidatorAsync(final GetRequestValidatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRequestValidatorRequest, GetRequestValidatorResult> asyncHandler) {
        final GetRequestValidatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRequestValidatorResult>() {
            @Override
            public GetRequestValidatorResult call() throws Exception {
                GetRequestValidatorResult result = null;

                try {
                    result = executeGetRequestValidator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRequestValidatorsResult> getRequestValidatorsAsync(GetRequestValidatorsRequest request) {

        return getRequestValidatorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRequestValidatorsResult> getRequestValidatorsAsync(final GetRequestValidatorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRequestValidatorsRequest, GetRequestValidatorsResult> asyncHandler) {
        final GetRequestValidatorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRequestValidatorsResult>() {
            @Override
            public GetRequestValidatorsResult call() throws Exception {
                GetRequestValidatorsResult result = null;

                try {
                    result = executeGetRequestValidators(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest request) {

        return getResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceResult> getResourceAsync(final GetResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler) {
        final GetResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceResult>() {
            @Override
            public GetResourceResult call() throws Exception {
                GetResourceResult result = null;

                try {
                    result = executeGetResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest request) {

        return getResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(final GetResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler) {
        final GetResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcesResult>() {
            @Override
            public GetResourcesResult call() throws Exception {
                GetResourcesResult result = null;

                try {
                    result = executeGetResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(GetRestApiRequest request) {

        return getRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(final GetRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRestApiRequest, GetRestApiResult> asyncHandler) {
        final GetRestApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRestApiResult>() {
            @Override
            public GetRestApiResult call() throws Exception {
                GetRestApiResult result = null;

                try {
                    result = executeGetRestApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(GetRestApisRequest request) {

        return getRestApisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(final GetRestApisRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRestApisRequest, GetRestApisResult> asyncHandler) {
        final GetRestApisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRestApisResult>() {
            @Override
            public GetRestApisResult call() throws Exception {
                GetRestApisResult result = null;

                try {
                    result = executeGetRestApis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSdkResult> getSdkAsync(GetSdkRequest request) {

        return getSdkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSdkResult> getSdkAsync(final GetSdkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSdkRequest, GetSdkResult> asyncHandler) {
        final GetSdkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSdkResult>() {
            @Override
            public GetSdkResult call() throws Exception {
                GetSdkResult result = null;

                try {
                    result = executeGetSdk(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSdkTypeResult> getSdkTypeAsync(GetSdkTypeRequest request) {

        return getSdkTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSdkTypeResult> getSdkTypeAsync(final GetSdkTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSdkTypeRequest, GetSdkTypeResult> asyncHandler) {
        final GetSdkTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSdkTypeResult>() {
            @Override
            public GetSdkTypeResult call() throws Exception {
                GetSdkTypeResult result = null;

                try {
                    result = executeGetSdkType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSdkTypesResult> getSdkTypesAsync(GetSdkTypesRequest request) {

        return getSdkTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSdkTypesResult> getSdkTypesAsync(final GetSdkTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSdkTypesRequest, GetSdkTypesResult> asyncHandler) {
        final GetSdkTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSdkTypesResult>() {
            @Override
            public GetSdkTypesResult call() throws Exception {
                GetSdkTypesResult result = null;

                try {
                    result = executeGetSdkTypes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest request) {

        return getStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(final GetStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler) {
        final GetStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStageResult>() {
            @Override
            public GetStageResult call() throws Exception {
                GetStageResult result = null;

                try {
                    result = executeGetStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(GetStagesRequest request) {

        return getStagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(final GetStagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStagesRequest, GetStagesResult> asyncHandler) {
        final GetStagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStagesResult>() {
            @Override
            public GetStagesResult call() throws Exception {
                GetStagesResult result = null;

                try {
                    result = executeGetStages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest request) {

        return getTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagsResult> getTagsAsync(final GetTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler) {
        final GetTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTagsResult>() {
            @Override
            public GetTagsResult call() throws Exception {
                GetTagsResult result = null;

                try {
                    result = executeGetTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUsageResult> getUsageAsync(GetUsageRequest request) {

        return getUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageResult> getUsageAsync(final GetUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsageRequest, GetUsageResult> asyncHandler) {
        final GetUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsageResult>() {
            @Override
            public GetUsageResult call() throws Exception {
                GetUsageResult result = null;

                try {
                    result = executeGetUsage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlanResult> getUsagePlanAsync(GetUsagePlanRequest request) {

        return getUsagePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlanResult> getUsagePlanAsync(final GetUsagePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsagePlanRequest, GetUsagePlanResult> asyncHandler) {
        final GetUsagePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsagePlanResult>() {
            @Override
            public GetUsagePlanResult call() throws Exception {
                GetUsagePlanResult result = null;

                try {
                    result = executeGetUsagePlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlanKeyResult> getUsagePlanKeyAsync(GetUsagePlanKeyRequest request) {

        return getUsagePlanKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlanKeyResult> getUsagePlanKeyAsync(final GetUsagePlanKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsagePlanKeyRequest, GetUsagePlanKeyResult> asyncHandler) {
        final GetUsagePlanKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsagePlanKeyResult>() {
            @Override
            public GetUsagePlanKeyResult call() throws Exception {
                GetUsagePlanKeyResult result = null;

                try {
                    result = executeGetUsagePlanKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlanKeysResult> getUsagePlanKeysAsync(GetUsagePlanKeysRequest request) {

        return getUsagePlanKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlanKeysResult> getUsagePlanKeysAsync(final GetUsagePlanKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsagePlanKeysRequest, GetUsagePlanKeysResult> asyncHandler) {
        final GetUsagePlanKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsagePlanKeysResult>() {
            @Override
            public GetUsagePlanKeysResult call() throws Exception {
                GetUsagePlanKeysResult result = null;

                try {
                    result = executeGetUsagePlanKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlansResult> getUsagePlansAsync(GetUsagePlansRequest request) {

        return getUsagePlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsagePlansResult> getUsagePlansAsync(final GetUsagePlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsagePlansRequest, GetUsagePlansResult> asyncHandler) {
        final GetUsagePlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsagePlansResult>() {
            @Override
            public GetUsagePlansResult call() throws Exception {
                GetUsagePlansResult result = null;

                try {
                    result = executeGetUsagePlans(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVpcLinkResult> getVpcLinkAsync(GetVpcLinkRequest request) {

        return getVpcLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVpcLinkResult> getVpcLinkAsync(final GetVpcLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVpcLinkRequest, GetVpcLinkResult> asyncHandler) {
        final GetVpcLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVpcLinkResult>() {
            @Override
            public GetVpcLinkResult call() throws Exception {
                GetVpcLinkResult result = null;

                try {
                    result = executeGetVpcLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVpcLinksResult> getVpcLinksAsync(GetVpcLinksRequest request) {

        return getVpcLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVpcLinksResult> getVpcLinksAsync(final GetVpcLinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVpcLinksRequest, GetVpcLinksResult> asyncHandler) {
        final GetVpcLinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVpcLinksResult>() {
            @Override
            public GetVpcLinksResult call() throws Exception {
                GetVpcLinksResult result = null;

                try {
                    result = executeGetVpcLinks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportApiKeysResult> importApiKeysAsync(ImportApiKeysRequest request) {

        return importApiKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportApiKeysResult> importApiKeysAsync(final ImportApiKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportApiKeysRequest, ImportApiKeysResult> asyncHandler) {
        final ImportApiKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportApiKeysResult>() {
            @Override
            public ImportApiKeysResult call() throws Exception {
                ImportApiKeysResult result = null;

                try {
                    result = executeImportApiKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportDocumentationPartsResult> importDocumentationPartsAsync(ImportDocumentationPartsRequest request) {

        return importDocumentationPartsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportDocumentationPartsResult> importDocumentationPartsAsync(final ImportDocumentationPartsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportDocumentationPartsRequest, ImportDocumentationPartsResult> asyncHandler) {
        final ImportDocumentationPartsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportDocumentationPartsResult>() {
            @Override
            public ImportDocumentationPartsResult call() throws Exception {
                ImportDocumentationPartsResult result = null;

                try {
                    result = executeImportDocumentationParts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportRestApiResult> importRestApiAsync(ImportRestApiRequest request) {

        return importRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportRestApiResult> importRestApiAsync(final ImportRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportRestApiRequest, ImportRestApiResult> asyncHandler) {
        final ImportRestApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportRestApiResult>() {
            @Override
            public ImportRestApiResult call() throws Exception {
                ImportRestApiResult result = null;

                try {
                    result = executeImportRestApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutGatewayResponseResult> putGatewayResponseAsync(PutGatewayResponseRequest request) {

        return putGatewayResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutGatewayResponseResult> putGatewayResponseAsync(final PutGatewayResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutGatewayResponseRequest, PutGatewayResponseResult> asyncHandler) {
        final PutGatewayResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutGatewayResponseResult>() {
            @Override
            public PutGatewayResponseResult call() throws Exception {
                PutGatewayResponseResult result = null;

                try {
                    result = executePutGatewayResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest request) {

        return putIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(final PutIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler) {
        final PutIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutIntegrationResult>() {
            @Override
            public PutIntegrationResult call() throws Exception {
                PutIntegrationResult result = null;

                try {
                    result = executePutIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(PutIntegrationResponseRequest request) {

        return putIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(final PutIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutIntegrationResponseRequest, PutIntegrationResponseResult> asyncHandler) {
        final PutIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutIntegrationResponseResult>() {
            @Override
            public PutIntegrationResponseResult call() throws Exception {
                PutIntegrationResponseResult result = null;

                try {
                    result = executePutIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutMethodResult> putMethodAsync(PutMethodRequest request) {

        return putMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMethodResult> putMethodAsync(final PutMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMethodRequest, PutMethodResult> asyncHandler) {
        final PutMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMethodResult>() {
            @Override
            public PutMethodResult call() throws Exception {
                PutMethodResult result = null;

                try {
                    result = executePutMethod(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(PutMethodResponseRequest request) {

        return putMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(final PutMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMethodResponseRequest, PutMethodResponseResult> asyncHandler) {
        final PutMethodResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMethodResponseResult>() {
            @Override
            public PutMethodResponseResult call() throws Exception {
                PutMethodResponseResult result = null;

                try {
                    result = executePutMethodResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRestApiResult> putRestApiAsync(PutRestApiRequest request) {

        return putRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRestApiResult> putRestApiAsync(final PutRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRestApiRequest, PutRestApiResult> asyncHandler) {
        final PutRestApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRestApiResult>() {
            @Override
            public PutRestApiResult call() throws Exception {
                PutRestApiResult result = null;

                try {
                    result = executePutRestApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(TestInvokeAuthorizerRequest request) {

        return testInvokeAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(final TestInvokeAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestInvokeAuthorizerRequest, TestInvokeAuthorizerResult> asyncHandler) {
        final TestInvokeAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestInvokeAuthorizerResult>() {
            @Override
            public TestInvokeAuthorizerResult call() throws Exception {
                TestInvokeAuthorizerResult result = null;

                try {
                    result = executeTestInvokeAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(TestInvokeMethodRequest request) {

        return testInvokeMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(final TestInvokeMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestInvokeMethodRequest, TestInvokeMethodResult> asyncHandler) {
        final TestInvokeMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestInvokeMethodResult>() {
            @Override
            public TestInvokeMethodResult call() throws Exception {
                TestInvokeMethodResult result = null;

                try {
                    result = executeTestInvokeMethod(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest request) {

        return updateAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(final UpdateAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler) {
        final UpdateAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountResult>() {
            @Override
            public UpdateAccountResult call() throws Exception {
                UpdateAccountResult result = null;

                try {
                    result = executeUpdateAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(UpdateApiKeyRequest request) {

        return updateApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(final UpdateApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResult> asyncHandler) {
        final UpdateApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApiKeyResult>() {
            @Override
            public UpdateApiKeyResult call() throws Exception {
                UpdateApiKeyResult result = null;

                try {
                    result = executeUpdateApiKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest request) {

        return updateAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(final UpdateAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAuthorizerRequest, UpdateAuthorizerResult> asyncHandler) {
        final UpdateAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAuthorizerResult>() {
            @Override
            public UpdateAuthorizerResult call() throws Exception {
                UpdateAuthorizerResult result = null;

                try {
                    result = executeUpdateAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(UpdateBasePathMappingRequest request) {

        return updateBasePathMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(final UpdateBasePathMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBasePathMappingRequest, UpdateBasePathMappingResult> asyncHandler) {
        final UpdateBasePathMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBasePathMappingResult>() {
            @Override
            public UpdateBasePathMappingResult call() throws Exception {
                UpdateBasePathMappingResult result = null;

                try {
                    result = executeUpdateBasePathMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(UpdateClientCertificateRequest request) {

        return updateClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(final UpdateClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClientCertificateRequest, UpdateClientCertificateResult> asyncHandler) {
        final UpdateClientCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClientCertificateResult>() {
            @Override
            public UpdateClientCertificateResult call() throws Exception {
                UpdateClientCertificateResult result = null;

                try {
                    result = executeUpdateClientCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(UpdateDeploymentRequest request) {

        return updateDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(final UpdateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResult> asyncHandler) {
        final UpdateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeploymentResult>() {
            @Override
            public UpdateDeploymentResult call() throws Exception {
                UpdateDeploymentResult result = null;

                try {
                    result = executeUpdateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentationPartResult> updateDocumentationPartAsync(UpdateDocumentationPartRequest request) {

        return updateDocumentationPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentationPartResult> updateDocumentationPartAsync(final UpdateDocumentationPartRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentationPartRequest, UpdateDocumentationPartResult> asyncHandler) {
        final UpdateDocumentationPartRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentationPartResult>() {
            @Override
            public UpdateDocumentationPartResult call() throws Exception {
                UpdateDocumentationPartResult result = null;

                try {
                    result = executeUpdateDocumentationPart(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentationVersionResult> updateDocumentationVersionAsync(UpdateDocumentationVersionRequest request) {

        return updateDocumentationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentationVersionResult> updateDocumentationVersionAsync(final UpdateDocumentationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentationVersionRequest, UpdateDocumentationVersionResult> asyncHandler) {
        final UpdateDocumentationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentationVersionResult>() {
            @Override
            public UpdateDocumentationVersionResult call() throws Exception {
                UpdateDocumentationVersionResult result = null;

                try {
                    result = executeUpdateDocumentationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest request) {

        return updateDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(final UpdateDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler) {
        final UpdateDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainNameResult>() {
            @Override
            public UpdateDomainNameResult call() throws Exception {
                UpdateDomainNameResult result = null;

                try {
                    result = executeUpdateDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayResponseResult> updateGatewayResponseAsync(UpdateGatewayResponseRequest request) {

        return updateGatewayResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayResponseResult> updateGatewayResponseAsync(final UpdateGatewayResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayResponseRequest, UpdateGatewayResponseResult> asyncHandler) {
        final UpdateGatewayResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayResponseResult>() {
            @Override
            public UpdateGatewayResponseResult call() throws Exception {
                UpdateGatewayResponseResult result = null;

                try {
                    result = executeUpdateGatewayResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest request) {

        return updateIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(final UpdateIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler) {
        final UpdateIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIntegrationResult>() {
            @Override
            public UpdateIntegrationResult call() throws Exception {
                UpdateIntegrationResult result = null;

                try {
                    result = executeUpdateIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(UpdateIntegrationResponseRequest request) {

        return updateIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(final UpdateIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIntegrationResponseRequest, UpdateIntegrationResponseResult> asyncHandler) {
        final UpdateIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIntegrationResponseResult>() {
            @Override
            public UpdateIntegrationResponseResult call() throws Exception {
                UpdateIntegrationResponseResult result = null;

                try {
                    result = executeUpdateIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(UpdateMethodRequest request) {

        return updateMethodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(final UpdateMethodRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMethodRequest, UpdateMethodResult> asyncHandler) {
        final UpdateMethodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMethodResult>() {
            @Override
            public UpdateMethodResult call() throws Exception {
                UpdateMethodResult result = null;

                try {
                    result = executeUpdateMethod(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(UpdateMethodResponseRequest request) {

        return updateMethodResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(final UpdateMethodResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMethodResponseRequest, UpdateMethodResponseResult> asyncHandler) {
        final UpdateMethodResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMethodResponseResult>() {
            @Override
            public UpdateMethodResponseResult call() throws Exception {
                UpdateMethodResponseResult result = null;

                try {
                    result = executeUpdateMethodResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest request) {

        return updateModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(final UpdateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler) {
        final UpdateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateModelResult>() {
            @Override
            public UpdateModelResult call() throws Exception {
                UpdateModelResult result = null;

                try {
                    result = executeUpdateModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRequestValidatorResult> updateRequestValidatorAsync(UpdateRequestValidatorRequest request) {

        return updateRequestValidatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRequestValidatorResult> updateRequestValidatorAsync(final UpdateRequestValidatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRequestValidatorRequest, UpdateRequestValidatorResult> asyncHandler) {
        final UpdateRequestValidatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRequestValidatorResult>() {
            @Override
            public UpdateRequestValidatorResult call() throws Exception {
                UpdateRequestValidatorResult result = null;

                try {
                    result = executeUpdateRequestValidator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest request) {

        return updateResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(final UpdateResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler) {
        final UpdateResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceResult>() {
            @Override
            public UpdateResourceResult call() throws Exception {
                UpdateResourceResult result = null;

                try {
                    result = executeUpdateResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(UpdateRestApiRequest request) {

        return updateRestApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(final UpdateRestApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRestApiRequest, UpdateRestApiResult> asyncHandler) {
        final UpdateRestApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRestApiResult>() {
            @Override
            public UpdateRestApiResult call() throws Exception {
                UpdateRestApiResult result = null;

                try {
                    result = executeUpdateRestApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest request) {

        return updateStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(final UpdateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler) {
        final UpdateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStageResult>() {
            @Override
            public UpdateStageResult call() throws Exception {
                UpdateStageResult result = null;

                try {
                    result = executeUpdateStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUsageResult> updateUsageAsync(UpdateUsageRequest request) {

        return updateUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUsageResult> updateUsageAsync(final UpdateUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUsageRequest, UpdateUsageResult> asyncHandler) {
        final UpdateUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUsageResult>() {
            @Override
            public UpdateUsageResult call() throws Exception {
                UpdateUsageResult result = null;

                try {
                    result = executeUpdateUsage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUsagePlanResult> updateUsagePlanAsync(UpdateUsagePlanRequest request) {

        return updateUsagePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUsagePlanResult> updateUsagePlanAsync(final UpdateUsagePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUsagePlanRequest, UpdateUsagePlanResult> asyncHandler) {
        final UpdateUsagePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUsagePlanResult>() {
            @Override
            public UpdateUsagePlanResult call() throws Exception {
                UpdateUsagePlanResult result = null;

                try {
                    result = executeUpdateUsagePlan(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVpcLinkResult> updateVpcLinkAsync(UpdateVpcLinkRequest request) {

        return updateVpcLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVpcLinkResult> updateVpcLinkAsync(final UpdateVpcLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVpcLinkRequest, UpdateVpcLinkResult> asyncHandler) {
        final UpdateVpcLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVpcLinkResult>() {
            @Override
            public UpdateVpcLinkResult call() throws Exception {
                UpdateVpcLinkResult result = null;

                try {
                    result = executeUpdateVpcLink(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
