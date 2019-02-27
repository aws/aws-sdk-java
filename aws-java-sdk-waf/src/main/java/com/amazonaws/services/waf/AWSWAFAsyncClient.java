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
package com.amazonaws.services.waf;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing WAF asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * This is the <i>AWS WAF API Reference</i> for using AWS WAF with Amazon CloudFront. The AWS WAF actions and data types
 * listed in the reference are available for protecting Amazon CloudFront distributions. You can use these actions and
 * data types via the endpoint <i>waf.amazonaws.com</i>. This guide is for developers who need detailed information
 * about the AWS WAF API actions, data types, and errors. For detailed information about AWS WAF features and an
 * overview of how to use the AWS WAF API, see the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS
 * WAF Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @deprecated use {@link AWSWAFAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSWAFAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
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
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSWAFAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSWAFAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSWAFAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

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
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSWAFAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSWAFAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
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
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSWAFAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSWAFAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAF using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSWAFAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
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
     * @deprecated use {@link AWSWAFAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSWAFAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSWAFAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSWAFAsyncClientBuilder asyncBuilder() {
        return AWSWAFAsyncClientBuilder.standard();
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
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest request) {

        return createByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(final CreateByteMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateByteMatchSetRequest, CreateByteMatchSetResult> asyncHandler) {
        final CreateByteMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateByteMatchSetResult>() {
            @Override
            public CreateByteMatchSetResult call() throws Exception {
                CreateByteMatchSetResult result = null;

                try {
                    result = executeCreateByteMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(CreateGeoMatchSetRequest request) {

        return createGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(final CreateGeoMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGeoMatchSetRequest, CreateGeoMatchSetResult> asyncHandler) {
        final CreateGeoMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGeoMatchSetResult>() {
            @Override
            public CreateGeoMatchSetResult call() throws Exception {
                CreateGeoMatchSetResult result = null;

                try {
                    result = executeCreateGeoMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final CreateIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIPSetResult>() {
            @Override
            public CreateIPSetResult call() throws Exception {
                CreateIPSetResult result = null;

                try {
                    result = executeCreateIPSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(CreateRateBasedRuleRequest request) {

        return createRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(final CreateRateBasedRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRateBasedRuleRequest, CreateRateBasedRuleResult> asyncHandler) {
        final CreateRateBasedRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRateBasedRuleResult>() {
            @Override
            public CreateRateBasedRuleResult call() throws Exception {
                CreateRateBasedRuleResult result = null;

                try {
                    result = executeCreateRateBasedRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(CreateRegexMatchSetRequest request) {

        return createRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(final CreateRegexMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegexMatchSetRequest, CreateRegexMatchSetResult> asyncHandler) {
        final CreateRegexMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegexMatchSetResult>() {
            @Override
            public CreateRegexMatchSetResult call() throws Exception {
                CreateRegexMatchSetResult result = null;

                try {
                    result = executeCreateRegexMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest request) {

        return createRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(final CreateRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegexPatternSetRequest, CreateRegexPatternSetResult> asyncHandler) {
        final CreateRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegexPatternSetResult>() {
            @Override
            public CreateRegexPatternSetResult call() throws Exception {
                CreateRegexPatternSetResult result = null;

                try {
                    result = executeCreateRegexPatternSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final CreateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleResult>() {
            @Override
            public CreateRuleResult call() throws Exception {
                CreateRuleResult result = null;

                try {
                    result = executeCreateRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest request) {

        return createRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(final CreateRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler) {
        final CreateRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleGroupResult>() {
            @Override
            public CreateRuleGroupResult call() throws Exception {
                CreateRuleGroupResult result = null;

                try {
                    result = executeCreateRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final CreateSizeConstraintSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSizeConstraintSetResult>() {
            @Override
            public CreateSizeConstraintSetResult call() throws Exception {
                CreateSizeConstraintSetResult result = null;

                try {
                    result = executeCreateSizeConstraintSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final CreateSqlInjectionMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSqlInjectionMatchSetResult>() {
            @Override
            public CreateSqlInjectionMatchSetResult call() throws Exception {
                CreateSqlInjectionMatchSetResult result = null;

                try {
                    result = executeCreateSqlInjectionMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final CreateWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWebACLResult>() {
            @Override
            public CreateWebACLResult call() throws Exception {
                CreateWebACLResult result = null;

                try {
                    result = executeCreateWebACL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final CreateXssMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateXssMatchSetResult>() {
            @Override
            public CreateXssMatchSetResult call() throws Exception {
                CreateXssMatchSetResult result = null;

                try {
                    result = executeCreateXssMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteByteMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteByteMatchSetResult>() {
            @Override
            public DeleteByteMatchSetResult call() throws Exception {
                DeleteByteMatchSetResult result = null;

                try {
                    result = executeDeleteByteMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(DeleteGeoMatchSetRequest request) {

        return deleteGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(final DeleteGeoMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGeoMatchSetRequest, DeleteGeoMatchSetResult> asyncHandler) {
        final DeleteGeoMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGeoMatchSetResult>() {
            @Override
            public DeleteGeoMatchSetResult call() throws Exception {
                DeleteGeoMatchSetResult result = null;

                try {
                    result = executeDeleteGeoMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIPSetResult>() {
            @Override
            public DeleteIPSetResult call() throws Exception {
                DeleteIPSetResult result = null;

                try {
                    result = executeDeleteIPSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request) {

        return deleteLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(final DeleteLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler) {
        final DeleteLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoggingConfigurationResult>() {
            @Override
            public DeleteLoggingConfigurationResult call() throws Exception {
                DeleteLoggingConfigurationResult result = null;

                try {
                    result = executeDeleteLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest request) {

        return deletePermissionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(final DeletePermissionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePermissionPolicyRequest, DeletePermissionPolicyResult> asyncHandler) {
        final DeletePermissionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePermissionPolicyResult>() {
            @Override
            public DeletePermissionPolicyResult call() throws Exception {
                DeletePermissionPolicyResult result = null;

                try {
                    result = executeDeletePermissionPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(DeleteRateBasedRuleRequest request) {

        return deleteRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(final DeleteRateBasedRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRateBasedRuleRequest, DeleteRateBasedRuleResult> asyncHandler) {
        final DeleteRateBasedRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRateBasedRuleResult>() {
            @Override
            public DeleteRateBasedRuleResult call() throws Exception {
                DeleteRateBasedRuleResult result = null;

                try {
                    result = executeDeleteRateBasedRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(DeleteRegexMatchSetRequest request) {

        return deleteRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(final DeleteRegexMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegexMatchSetRequest, DeleteRegexMatchSetResult> asyncHandler) {
        final DeleteRegexMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegexMatchSetResult>() {
            @Override
            public DeleteRegexMatchSetResult call() throws Exception {
                DeleteRegexMatchSetResult result = null;

                try {
                    result = executeDeleteRegexMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest request) {

        return deleteRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(final DeleteRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegexPatternSetRequest, DeleteRegexPatternSetResult> asyncHandler) {
        final DeleteRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegexPatternSetResult>() {
            @Override
            public DeleteRegexPatternSetResult call() throws Exception {
                DeleteRegexPatternSetResult result = null;

                try {
                    result = executeDeleteRegexPatternSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result = null;

                try {
                    result = executeDeleteRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest request) {

        return deleteRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(final DeleteRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler) {
        final DeleteRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleGroupResult>() {
            @Override
            public DeleteRuleGroupResult call() throws Exception {
                DeleteRuleGroupResult result = null;

                try {
                    result = executeDeleteRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteSizeConstraintSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSizeConstraintSetResult>() {
            @Override
            public DeleteSizeConstraintSetResult call() throws Exception {
                DeleteSizeConstraintSetResult result = null;

                try {
                    result = executeDeleteSizeConstraintSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteSqlInjectionMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSqlInjectionMatchSetResult>() {
            @Override
            public DeleteSqlInjectionMatchSetResult call() throws Exception {
                DeleteSqlInjectionMatchSetResult result = null;

                try {
                    result = executeDeleteSqlInjectionMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWebACLResult>() {
            @Override
            public DeleteWebACLResult call() throws Exception {
                DeleteWebACLResult result = null;

                try {
                    result = executeDeleteWebACL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final DeleteXssMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteXssMatchSetResult>() {
            @Override
            public DeleteXssMatchSetResult call() throws Exception {
                DeleteXssMatchSetResult result = null;

                try {
                    result = executeDeleteXssMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetByteMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetByteMatchSetResult>() {
            @Override
            public GetByteMatchSetResult call() throws Exception {
                GetByteMatchSetResult result = null;

                try {
                    result = executeGetByteMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetChangeTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChangeTokenResult>() {
            @Override
            public GetChangeTokenResult call() throws Exception {
                GetChangeTokenResult result = null;

                try {
                    result = executeGetChangeToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetChangeTokenStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChangeTokenStatusResult>() {
            @Override
            public GetChangeTokenStatusResult call() throws Exception {
                GetChangeTokenStatusResult result = null;

                try {
                    result = executeGetChangeTokenStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(GetGeoMatchSetRequest request) {

        return getGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(final GetGeoMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGeoMatchSetRequest, GetGeoMatchSetResult> asyncHandler) {
        final GetGeoMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGeoMatchSetResult>() {
            @Override
            public GetGeoMatchSetResult call() throws Exception {
                GetGeoMatchSetResult result = null;

                try {
                    result = executeGetGeoMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIPSetResult>() {
            @Override
            public GetIPSetResult call() throws Exception {
                GetIPSetResult result = null;

                try {
                    result = executeGetIPSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest request) {

        return getLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(final GetLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler) {
        final GetLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoggingConfigurationResult>() {
            @Override
            public GetLoggingConfigurationResult call() throws Exception {
                GetLoggingConfigurationResult result = null;

                try {
                    result = executeGetLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest request) {

        return getPermissionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(final GetPermissionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPermissionPolicyRequest, GetPermissionPolicyResult> asyncHandler) {
        final GetPermissionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPermissionPolicyResult>() {
            @Override
            public GetPermissionPolicyResult call() throws Exception {
                GetPermissionPolicyResult result = null;

                try {
                    result = executeGetPermissionPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(GetRateBasedRuleRequest request) {

        return getRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(final GetRateBasedRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleRequest, GetRateBasedRuleResult> asyncHandler) {
        final GetRateBasedRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRateBasedRuleResult>() {
            @Override
            public GetRateBasedRuleResult call() throws Exception {
                GetRateBasedRuleResult result = null;

                try {
                    result = executeGetRateBasedRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(GetRateBasedRuleManagedKeysRequest request) {

        return getRateBasedRuleManagedKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(final GetRateBasedRuleManagedKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleManagedKeysRequest, GetRateBasedRuleManagedKeysResult> asyncHandler) {
        final GetRateBasedRuleManagedKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRateBasedRuleManagedKeysResult>() {
            @Override
            public GetRateBasedRuleManagedKeysResult call() throws Exception {
                GetRateBasedRuleManagedKeysResult result = null;

                try {
                    result = executeGetRateBasedRuleManagedKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(GetRegexMatchSetRequest request) {

        return getRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(final GetRegexMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegexMatchSetRequest, GetRegexMatchSetResult> asyncHandler) {
        final GetRegexMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegexMatchSetResult>() {
            @Override
            public GetRegexMatchSetResult call() throws Exception {
                GetRegexMatchSetResult result = null;

                try {
                    result = executeGetRegexMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest request) {

        return getRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(final GetRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegexPatternSetRequest, GetRegexPatternSetResult> asyncHandler) {
        final GetRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegexPatternSetResult>() {
            @Override
            public GetRegexPatternSetResult call() throws Exception {
                GetRegexPatternSetResult result = null;

                try {
                    result = executeGetRegexPatternSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRuleResult>() {
            @Override
            public GetRuleResult call() throws Exception {
                GetRuleResult result = null;

                try {
                    result = executeGetRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest request) {

        return getRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(final GetRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRuleGroupRequest, GetRuleGroupResult> asyncHandler) {
        final GetRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRuleGroupResult>() {
            @Override
            public GetRuleGroupResult call() throws Exception {
                GetRuleGroupResult result = null;

                try {
                    result = executeGetRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetSampledRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSampledRequestsResult>() {
            @Override
            public GetSampledRequestsResult call() throws Exception {
                GetSampledRequestsResult result = null;

                try {
                    result = executeGetSampledRequests(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetSizeConstraintSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSizeConstraintSetResult>() {
            @Override
            public GetSizeConstraintSetResult call() throws Exception {
                GetSizeConstraintSetResult result = null;

                try {
                    result = executeGetSizeConstraintSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetSqlInjectionMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSqlInjectionMatchSetResult>() {
            @Override
            public GetSqlInjectionMatchSetResult call() throws Exception {
                GetSqlInjectionMatchSetResult result = null;

                try {
                    result = executeGetSqlInjectionMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWebACLResult>() {
            @Override
            public GetWebACLResult call() throws Exception {
                GetWebACLResult result = null;

                try {
                    result = executeGetWebACL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetXssMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetXssMatchSetResult>() {
            @Override
            public GetXssMatchSetResult call() throws Exception {
                GetXssMatchSetResult result = null;

                try {
                    result = executeGetXssMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(ListActivatedRulesInRuleGroupRequest request) {

        return listActivatedRulesInRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(
            final ListActivatedRulesInRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListActivatedRulesInRuleGroupRequest, ListActivatedRulesInRuleGroupResult> asyncHandler) {
        final ListActivatedRulesInRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListActivatedRulesInRuleGroupResult>() {
            @Override
            public ListActivatedRulesInRuleGroupResult call() throws Exception {
                ListActivatedRulesInRuleGroupResult result = null;

                try {
                    result = executeListActivatedRulesInRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListByteMatchSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListByteMatchSetsResult>() {
            @Override
            public ListByteMatchSetsResult call() throws Exception {
                ListByteMatchSetsResult result = null;

                try {
                    result = executeListByteMatchSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(ListGeoMatchSetsRequest request) {

        return listGeoMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(final ListGeoMatchSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGeoMatchSetsRequest, ListGeoMatchSetsResult> asyncHandler) {
        final ListGeoMatchSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGeoMatchSetsResult>() {
            @Override
            public ListGeoMatchSetsResult call() throws Exception {
                ListGeoMatchSetsResult result = null;

                try {
                    result = executeListGeoMatchSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListIPSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIPSetsResult>() {
            @Override
            public ListIPSetsResult call() throws Exception {
                ListIPSetsResult result = null;

                try {
                    result = executeListIPSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(ListLoggingConfigurationsRequest request) {

        return listLoggingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(final ListLoggingConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler) {
        final ListLoggingConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLoggingConfigurationsResult>() {
            @Override
            public ListLoggingConfigurationsResult call() throws Exception {
                ListLoggingConfigurationsResult result = null;

                try {
                    result = executeListLoggingConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(ListRateBasedRulesRequest request) {

        return listRateBasedRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(final ListRateBasedRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRateBasedRulesRequest, ListRateBasedRulesResult> asyncHandler) {
        final ListRateBasedRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRateBasedRulesResult>() {
            @Override
            public ListRateBasedRulesResult call() throws Exception {
                ListRateBasedRulesResult result = null;

                try {
                    result = executeListRateBasedRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(ListRegexMatchSetsRequest request) {

        return listRegexMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(final ListRegexMatchSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRegexMatchSetsRequest, ListRegexMatchSetsResult> asyncHandler) {
        final ListRegexMatchSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRegexMatchSetsResult>() {
            @Override
            public ListRegexMatchSetsResult call() throws Exception {
                ListRegexMatchSetsResult result = null;

                try {
                    result = executeListRegexMatchSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest request) {

        return listRegexPatternSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(final ListRegexPatternSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRegexPatternSetsRequest, ListRegexPatternSetsResult> asyncHandler) {
        final ListRegexPatternSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRegexPatternSetsResult>() {
            @Override
            public ListRegexPatternSetsResult call() throws Exception {
                ListRegexPatternSetsResult result = null;

                try {
                    result = executeListRegexPatternSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest request) {

        return listRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(final ListRuleGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler) {
        final ListRuleGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRuleGroupsResult>() {
            @Override
            public ListRuleGroupsResult call() throws Exception {
                ListRuleGroupsResult result = null;

                try {
                    result = executeListRuleGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result = null;

                try {
                    result = executeListRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListSizeConstraintSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSizeConstraintSetsResult>() {
            @Override
            public ListSizeConstraintSetsResult call() throws Exception {
                ListSizeConstraintSetsResult result = null;

                try {
                    result = executeListSizeConstraintSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListSqlInjectionMatchSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSqlInjectionMatchSetsResult>() {
            @Override
            public ListSqlInjectionMatchSetsResult call() throws Exception {
                ListSqlInjectionMatchSetsResult result = null;

                try {
                    result = executeListSqlInjectionMatchSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(ListSubscribedRuleGroupsRequest request) {

        return listSubscribedRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(final ListSubscribedRuleGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscribedRuleGroupsRequest, ListSubscribedRuleGroupsResult> asyncHandler) {
        final ListSubscribedRuleGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscribedRuleGroupsResult>() {
            @Override
            public ListSubscribedRuleGroupsResult call() throws Exception {
                ListSubscribedRuleGroupsResult result = null;

                try {
                    result = executeListSubscribedRuleGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListWebACLsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWebACLsResult>() {
            @Override
            public ListWebACLsResult call() throws Exception {
                ListWebACLsResult result = null;

                try {
                    result = executeListWebACLs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final ListXssMatchSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListXssMatchSetsResult>() {
            @Override
            public ListXssMatchSetsResult call() throws Exception {
                ListXssMatchSetsResult result = null;

                try {
                    result = executeListXssMatchSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest request) {

        return putLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(final PutLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLoggingConfigurationRequest, PutLoggingConfigurationResult> asyncHandler) {
        final PutLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLoggingConfigurationResult>() {
            @Override
            public PutLoggingConfigurationResult call() throws Exception {
                PutLoggingConfigurationResult result = null;

                try {
                    result = executePutLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest request) {

        return putPermissionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(final PutPermissionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPermissionPolicyRequest, PutPermissionPolicyResult> asyncHandler) {
        final PutPermissionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPermissionPolicyResult>() {
            @Override
            public PutPermissionPolicyResult call() throws Exception {
                PutPermissionPolicyResult result = null;

                try {
                    result = executePutPermissionPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateByteMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateByteMatchSetResult>() {
            @Override
            public UpdateByteMatchSetResult call() throws Exception {
                UpdateByteMatchSetResult result = null;

                try {
                    result = executeUpdateByteMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(UpdateGeoMatchSetRequest request) {

        return updateGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(final UpdateGeoMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGeoMatchSetRequest, UpdateGeoMatchSetResult> asyncHandler) {
        final UpdateGeoMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGeoMatchSetResult>() {
            @Override
            public UpdateGeoMatchSetResult call() throws Exception {
                UpdateGeoMatchSetResult result = null;

                try {
                    result = executeUpdateGeoMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIPSetResult>() {
            @Override
            public UpdateIPSetResult call() throws Exception {
                UpdateIPSetResult result = null;

                try {
                    result = executeUpdateIPSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(UpdateRateBasedRuleRequest request) {

        return updateRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(final UpdateRateBasedRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRateBasedRuleRequest, UpdateRateBasedRuleResult> asyncHandler) {
        final UpdateRateBasedRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRateBasedRuleResult>() {
            @Override
            public UpdateRateBasedRuleResult call() throws Exception {
                UpdateRateBasedRuleResult result = null;

                try {
                    result = executeUpdateRateBasedRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(UpdateRegexMatchSetRequest request) {

        return updateRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(final UpdateRegexMatchSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRegexMatchSetRequest, UpdateRegexMatchSetResult> asyncHandler) {
        final UpdateRegexMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRegexMatchSetResult>() {
            @Override
            public UpdateRegexMatchSetResult call() throws Exception {
                UpdateRegexMatchSetResult result = null;

                try {
                    result = executeUpdateRegexMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest request) {

        return updateRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(final UpdateRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRegexPatternSetRequest, UpdateRegexPatternSetResult> asyncHandler) {
        final UpdateRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRegexPatternSetResult>() {
            @Override
            public UpdateRegexPatternSetResult call() throws Exception {
                UpdateRegexPatternSetResult result = null;

                try {
                    result = executeUpdateRegexPatternSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleResult>() {
            @Override
            public UpdateRuleResult call() throws Exception {
                UpdateRuleResult result = null;

                try {
                    result = executeUpdateRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest request) {

        return updateRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(final UpdateRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler) {
        final UpdateRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleGroupResult>() {
            @Override
            public UpdateRuleGroupResult call() throws Exception {
                UpdateRuleGroupResult result = null;

                try {
                    result = executeUpdateRuleGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateSizeConstraintSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSizeConstraintSetResult>() {
            @Override
            public UpdateSizeConstraintSetResult call() throws Exception {
                UpdateSizeConstraintSetResult result = null;

                try {
                    result = executeUpdateSizeConstraintSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateSqlInjectionMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSqlInjectionMatchSetResult>() {
            @Override
            public UpdateSqlInjectionMatchSetResult call() throws Exception {
                UpdateSqlInjectionMatchSetResult result = null;

                try {
                    result = executeUpdateSqlInjectionMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWebACLResult>() {
            @Override
            public UpdateWebACLResult call() throws Exception {
                UpdateWebACLResult result = null;

                try {
                    result = executeUpdateWebACL(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final UpdateXssMatchSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateXssMatchSetResult>() {
            @Override
            public UpdateXssMatchSetResult call() throws Exception {
                UpdateXssMatchSetResult result = null;

                try {
                    result = executeUpdateXssMatchSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
