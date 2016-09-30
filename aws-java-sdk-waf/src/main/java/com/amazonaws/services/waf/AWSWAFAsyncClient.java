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
package com.amazonaws.services.waf;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing WAF asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>AWS WAF API Reference</i>. This guide is for developers who need detailed information about the AWS
 * WAF API actions, data types, and errors. For detailed information about AWS WAF features and an overview of how to
 * use the AWS WAF API, see the <a href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer
 * Guide</a>.
 * </p>
 */
@ThreadSafe
public class AWSWAFAsyncClient extends AWSWAFClient implements AWSWAFAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF. A credentials provider chain will be used
     * that searches for credentials in this order:
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
    public AWSWAFAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to WAF (ex: proxy settings, retry
     *        counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSWAFAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSWAFAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSWAFAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSWAFAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account credentials
     * provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSWAFAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the provided AWS account credentials
     * provider and client configuration options.
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
    public AWSWAFAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSWAFAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSWAFAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSWAFAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest request) {

        return createByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(final CreateByteMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateByteMatchSetRequest, CreateByteMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateByteMatchSetResult>() {
            @Override
            public CreateByteMatchSetResult call() throws Exception {
                CreateByteMatchSetResult result;

                try {
                    result = createByteMatchSet(request);
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
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest request) {

        return createIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(final CreateIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateIPSetResult>() {
            @Override
            public CreateIPSetResult call() throws Exception {
                CreateIPSetResult result;

                try {
                    result = createIPSet(request);
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
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request) {

        return createRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(final CreateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleResult>() {
            @Override
            public CreateRuleResult call() throws Exception {
                CreateRuleResult result;

                try {
                    result = createRule(request);
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
    public java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(CreateSizeConstraintSetRequest request) {

        return createSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(final CreateSizeConstraintSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSizeConstraintSetRequest, CreateSizeConstraintSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSizeConstraintSetResult>() {
            @Override
            public CreateSizeConstraintSetResult call() throws Exception {
                CreateSizeConstraintSetResult result;

                try {
                    result = createSizeConstraintSet(request);
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
    public java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(CreateSqlInjectionMatchSetRequest request) {

        return createSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(final CreateSqlInjectionMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSqlInjectionMatchSetRequest, CreateSqlInjectionMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSqlInjectionMatchSetResult>() {
            @Override
            public CreateSqlInjectionMatchSetResult call() throws Exception {
                CreateSqlInjectionMatchSetResult result;

                try {
                    result = createSqlInjectionMatchSet(request);
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
    public java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest request) {

        return createWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(final CreateWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWebACLRequest, CreateWebACLResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateWebACLResult>() {
            @Override
            public CreateWebACLResult call() throws Exception {
                CreateWebACLResult result;

                try {
                    result = createWebACL(request);
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
    public java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(CreateXssMatchSetRequest request) {

        return createXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(final CreateXssMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateXssMatchSetRequest, CreateXssMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateXssMatchSetResult>() {
            @Override
            public CreateXssMatchSetResult call() throws Exception {
                CreateXssMatchSetResult result;

                try {
                    result = createXssMatchSet(request);
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
    public java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(DeleteByteMatchSetRequest request) {

        return deleteByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(final DeleteByteMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteByteMatchSetRequest, DeleteByteMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteByteMatchSetResult>() {
            @Override
            public DeleteByteMatchSetResult call() throws Exception {
                DeleteByteMatchSetResult result;

                try {
                    result = deleteByteMatchSet(request);
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
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest request) {

        return deleteIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(final DeleteIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteIPSetResult>() {
            @Override
            public DeleteIPSetResult call() throws Exception {
                DeleteIPSetResult result;

                try {
                    result = deleteIPSet(request);
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
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result;

                try {
                    result = deleteRule(request);
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
    public java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(DeleteSizeConstraintSetRequest request) {

        return deleteSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(final DeleteSizeConstraintSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSizeConstraintSetRequest, DeleteSizeConstraintSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSizeConstraintSetResult>() {
            @Override
            public DeleteSizeConstraintSetResult call() throws Exception {
                DeleteSizeConstraintSetResult result;

                try {
                    result = deleteSizeConstraintSet(request);
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
    public java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(DeleteSqlInjectionMatchSetRequest request) {

        return deleteSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(final DeleteSqlInjectionMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSqlInjectionMatchSetRequest, DeleteSqlInjectionMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSqlInjectionMatchSetResult>() {
            @Override
            public DeleteSqlInjectionMatchSetResult call() throws Exception {
                DeleteSqlInjectionMatchSetResult result;

                try {
                    result = deleteSqlInjectionMatchSet(request);
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
    public java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest request) {

        return deleteWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(final DeleteWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWebACLRequest, DeleteWebACLResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteWebACLResult>() {
            @Override
            public DeleteWebACLResult call() throws Exception {
                DeleteWebACLResult result;

                try {
                    result = deleteWebACL(request);
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
    public java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(DeleteXssMatchSetRequest request) {

        return deleteXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(final DeleteXssMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteXssMatchSetRequest, DeleteXssMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteXssMatchSetResult>() {
            @Override
            public DeleteXssMatchSetResult call() throws Exception {
                DeleteXssMatchSetResult result;

                try {
                    result = deleteXssMatchSet(request);
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
    public java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(GetByteMatchSetRequest request) {

        return getByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(final GetByteMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetByteMatchSetRequest, GetByteMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetByteMatchSetResult>() {
            @Override
            public GetByteMatchSetResult call() throws Exception {
                GetByteMatchSetResult result;

                try {
                    result = getByteMatchSet(request);
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
    public java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(GetChangeTokenRequest request) {

        return getChangeTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(final GetChangeTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChangeTokenRequest, GetChangeTokenResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetChangeTokenResult>() {
            @Override
            public GetChangeTokenResult call() throws Exception {
                GetChangeTokenResult result;

                try {
                    result = getChangeToken(request);
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
    public java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(GetChangeTokenStatusRequest request) {

        return getChangeTokenStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(final GetChangeTokenStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChangeTokenStatusRequest, GetChangeTokenStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetChangeTokenStatusResult>() {
            @Override
            public GetChangeTokenStatusResult call() throws Exception {
                GetChangeTokenStatusResult result;

                try {
                    result = getChangeTokenStatus(request);
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
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest request) {

        return getIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(final GetIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetIPSetResult>() {
            @Override
            public GetIPSetResult call() throws Exception {
                GetIPSetResult result;

                try {
                    result = getIPSet(request);
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
    public java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest request) {

        return getRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRuleResult> getRuleAsync(final GetRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRuleRequest, GetRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRuleResult>() {
            @Override
            public GetRuleResult call() throws Exception {
                GetRuleResult result;

                try {
                    result = getRule(request);
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
    public java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest request) {

        return getSampledRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(final GetSampledRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSampledRequestsRequest, GetSampledRequestsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSampledRequestsResult>() {
            @Override
            public GetSampledRequestsResult call() throws Exception {
                GetSampledRequestsResult result;

                try {
                    result = getSampledRequests(request);
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
    public java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(GetSizeConstraintSetRequest request) {

        return getSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(final GetSizeConstraintSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSizeConstraintSetRequest, GetSizeConstraintSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSizeConstraintSetResult>() {
            @Override
            public GetSizeConstraintSetResult call() throws Exception {
                GetSizeConstraintSetResult result;

                try {
                    result = getSizeConstraintSet(request);
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
    public java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(GetSqlInjectionMatchSetRequest request) {

        return getSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(final GetSqlInjectionMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSqlInjectionMatchSetRequest, GetSqlInjectionMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSqlInjectionMatchSetResult>() {
            @Override
            public GetSqlInjectionMatchSetResult call() throws Exception {
                GetSqlInjectionMatchSetResult result;

                try {
                    result = getSqlInjectionMatchSet(request);
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
    public java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest request) {

        return getWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(final GetWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWebACLRequest, GetWebACLResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetWebACLResult>() {
            @Override
            public GetWebACLResult call() throws Exception {
                GetWebACLResult result;

                try {
                    result = getWebACL(request);
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
    public java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(GetXssMatchSetRequest request) {

        return getXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(final GetXssMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetXssMatchSetRequest, GetXssMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetXssMatchSetResult>() {
            @Override
            public GetXssMatchSetResult call() throws Exception {
                GetXssMatchSetResult result;

                try {
                    result = getXssMatchSet(request);
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
    public java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(ListByteMatchSetsRequest request) {

        return listByteMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(final ListByteMatchSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListByteMatchSetsRequest, ListByteMatchSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListByteMatchSetsResult>() {
            @Override
            public ListByteMatchSetsResult call() throws Exception {
                ListByteMatchSetsResult result;

                try {
                    result = listByteMatchSets(request);
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
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest request) {

        return listIPSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(final ListIPSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListIPSetsResult>() {
            @Override
            public ListIPSetsResult call() throws Exception {
                ListIPSetsResult result;

                try {
                    result = listIPSets(request);
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
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(final ListRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result;

                try {
                    result = listRules(request);
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
    public java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(ListSizeConstraintSetsRequest request) {

        return listSizeConstraintSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(final ListSizeConstraintSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSizeConstraintSetsRequest, ListSizeConstraintSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListSizeConstraintSetsResult>() {
            @Override
            public ListSizeConstraintSetsResult call() throws Exception {
                ListSizeConstraintSetsResult result;

                try {
                    result = listSizeConstraintSets(request);
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
    public java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(ListSqlInjectionMatchSetsRequest request) {

        return listSqlInjectionMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(final ListSqlInjectionMatchSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSqlInjectionMatchSetsRequest, ListSqlInjectionMatchSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListSqlInjectionMatchSetsResult>() {
            @Override
            public ListSqlInjectionMatchSetsResult call() throws Exception {
                ListSqlInjectionMatchSetsResult result;

                try {
                    result = listSqlInjectionMatchSets(request);
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
    public java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest request) {

        return listWebACLsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(final ListWebACLsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWebACLsRequest, ListWebACLsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListWebACLsResult>() {
            @Override
            public ListWebACLsResult call() throws Exception {
                ListWebACLsResult result;

                try {
                    result = listWebACLs(request);
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
    public java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(ListXssMatchSetsRequest request) {

        return listXssMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(final ListXssMatchSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListXssMatchSetsRequest, ListXssMatchSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListXssMatchSetsResult>() {
            @Override
            public ListXssMatchSetsResult call() throws Exception {
                ListXssMatchSetsResult result;

                try {
                    result = listXssMatchSets(request);
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
    public java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(UpdateByteMatchSetRequest request) {

        return updateByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(final UpdateByteMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateByteMatchSetRequest, UpdateByteMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateByteMatchSetResult>() {
            @Override
            public UpdateByteMatchSetResult call() throws Exception {
                UpdateByteMatchSetResult result;

                try {
                    result = updateByteMatchSet(request);
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
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest request) {

        return updateIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(final UpdateIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateIPSetResult>() {
            @Override
            public UpdateIPSetResult call() throws Exception {
                UpdateIPSetResult result;

                try {
                    result = updateIPSet(request);
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
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest request) {

        return updateRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(final UpdateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleResult>() {
            @Override
            public UpdateRuleResult call() throws Exception {
                UpdateRuleResult result;

                try {
                    result = updateRule(request);
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
    public java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(UpdateSizeConstraintSetRequest request) {

        return updateSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(final UpdateSizeConstraintSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSizeConstraintSetRequest, UpdateSizeConstraintSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSizeConstraintSetResult>() {
            @Override
            public UpdateSizeConstraintSetResult call() throws Exception {
                UpdateSizeConstraintSetResult result;

                try {
                    result = updateSizeConstraintSet(request);
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
    public java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(UpdateSqlInjectionMatchSetRequest request) {

        return updateSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(final UpdateSqlInjectionMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSqlInjectionMatchSetRequest, UpdateSqlInjectionMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSqlInjectionMatchSetResult>() {
            @Override
            public UpdateSqlInjectionMatchSetResult call() throws Exception {
                UpdateSqlInjectionMatchSetResult result;

                try {
                    result = updateSqlInjectionMatchSet(request);
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
    public java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest request) {

        return updateWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(final UpdateWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWebACLRequest, UpdateWebACLResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateWebACLResult>() {
            @Override
            public UpdateWebACLResult call() throws Exception {
                UpdateWebACLResult result;

                try {
                    result = updateWebACL(request);
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
    public java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(UpdateXssMatchSetRequest request) {

        return updateXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(final UpdateXssMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateXssMatchSetRequest, UpdateXssMatchSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateXssMatchSetResult>() {
            @Override
            public UpdateXssMatchSetResult call() throws Exception {
                UpdateXssMatchSetResult result;

                try {
                    result = updateXssMatchSet(request);
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
