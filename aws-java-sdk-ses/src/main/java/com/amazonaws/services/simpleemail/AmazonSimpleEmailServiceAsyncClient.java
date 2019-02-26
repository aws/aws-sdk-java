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
package com.amazonaws.services.simpleemail;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon SES asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This document contains reference information for the <a href="https://aws.amazon.com/ses/">Amazon Simple Email
 * Service</a> (Amazon SES) API, version 2010-12-01. This document is best used in conjunction with the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html">Regions and Amazon SES</a> in the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer Guide</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSimpleEmailServiceAsyncClient extends AmazonSimpleEmailServiceClient implements AmazonSimpleEmailServiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES. A credentials provider chain will
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
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon SES (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSimpleEmailServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the provided AWS account
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
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSimpleEmailServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSimpleEmailServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSimpleEmailServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonSimpleEmailServiceAsyncClientBuilder asyncBuilder() {
        return AmazonSimpleEmailServiceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSimpleEmailServiceAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(CloneReceiptRuleSetRequest request) {

        return cloneReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(final CloneReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CloneReceiptRuleSetRequest, CloneReceiptRuleSetResult> asyncHandler) {
        final CloneReceiptRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CloneReceiptRuleSetResult>() {
            @Override
            public CloneReceiptRuleSetResult call() throws Exception {
                CloneReceiptRuleSetResult result = null;

                try {
                    result = executeCloneReceiptRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest request) {

        return createConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(final CreateConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler) {
        final CreateConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetResult>() {
            @Override
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result = null;

                try {
                    result = executeCreateConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest request) {

        return createConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            final CreateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler) {
        final CreateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetEventDestinationResult>() {
            @Override
            public CreateConfigurationSetEventDestinationResult call() throws Exception {
                CreateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeCreateConfigurationSetEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetTrackingOptionsResult> createConfigurationSetTrackingOptionsAsync(
            CreateConfigurationSetTrackingOptionsRequest request) {

        return createConfigurationSetTrackingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetTrackingOptionsResult> createConfigurationSetTrackingOptionsAsync(
            final CreateConfigurationSetTrackingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetTrackingOptionsRequest, CreateConfigurationSetTrackingOptionsResult> asyncHandler) {
        final CreateConfigurationSetTrackingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetTrackingOptionsResult>() {
            @Override
            public CreateConfigurationSetTrackingOptionsResult call() throws Exception {
                CreateConfigurationSetTrackingOptionsResult result = null;

                try {
                    result = executeCreateConfigurationSetTrackingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCustomVerificationEmailTemplateResult> createCustomVerificationEmailTemplateAsync(
            CreateCustomVerificationEmailTemplateRequest request) {

        return createCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomVerificationEmailTemplateResult> createCustomVerificationEmailTemplateAsync(
            final CreateCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomVerificationEmailTemplateRequest, CreateCustomVerificationEmailTemplateResult> asyncHandler) {
        final CreateCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomVerificationEmailTemplateResult>() {
            @Override
            public CreateCustomVerificationEmailTemplateResult call() throws Exception {
                CreateCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeCreateCustomVerificationEmailTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(CreateReceiptFilterRequest request) {

        return createReceiptFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(final CreateReceiptFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReceiptFilterRequest, CreateReceiptFilterResult> asyncHandler) {
        final CreateReceiptFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReceiptFilterResult>() {
            @Override
            public CreateReceiptFilterResult call() throws Exception {
                CreateReceiptFilterResult result = null;

                try {
                    result = executeCreateReceiptFilter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(CreateReceiptRuleRequest request) {

        return createReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(final CreateReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleRequest, CreateReceiptRuleResult> asyncHandler) {
        final CreateReceiptRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReceiptRuleResult>() {
            @Override
            public CreateReceiptRuleResult call() throws Exception {
                CreateReceiptRuleResult result = null;

                try {
                    result = executeCreateReceiptRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(CreateReceiptRuleSetRequest request) {

        return createReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(final CreateReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler) {
        final CreateReceiptRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReceiptRuleSetResult>() {
            @Override
            public CreateReceiptRuleSetResult call() throws Exception {
                CreateReceiptRuleSetResult result = null;

                try {
                    result = executeCreateReceiptRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest request) {

        return createTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(final CreateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler) {
        final CreateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTemplateResult>() {
            @Override
            public CreateTemplateResult call() throws Exception {
                CreateTemplateResult result = null;

                try {
                    result = executeCreateTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest request) {

        return deleteConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(final DeleteConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler) {
        final DeleteConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetResult>() {
            @Override
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result = null;

                try {
                    result = executeDeleteConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest request) {

        return deleteConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            final DeleteConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler) {
        final DeleteConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetEventDestinationResult>() {
            @Override
            public DeleteConfigurationSetEventDestinationResult call() throws Exception {
                DeleteConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeDeleteConfigurationSetEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetTrackingOptionsResult> deleteConfigurationSetTrackingOptionsAsync(
            DeleteConfigurationSetTrackingOptionsRequest request) {

        return deleteConfigurationSetTrackingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetTrackingOptionsResult> deleteConfigurationSetTrackingOptionsAsync(
            final DeleteConfigurationSetTrackingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetTrackingOptionsRequest, DeleteConfigurationSetTrackingOptionsResult> asyncHandler) {
        final DeleteConfigurationSetTrackingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetTrackingOptionsResult>() {
            @Override
            public DeleteConfigurationSetTrackingOptionsResult call() throws Exception {
                DeleteConfigurationSetTrackingOptionsResult result = null;

                try {
                    result = executeDeleteConfigurationSetTrackingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomVerificationEmailTemplateResult> deleteCustomVerificationEmailTemplateAsync(
            DeleteCustomVerificationEmailTemplateRequest request) {

        return deleteCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomVerificationEmailTemplateResult> deleteCustomVerificationEmailTemplateAsync(
            final DeleteCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomVerificationEmailTemplateRequest, DeleteCustomVerificationEmailTemplateResult> asyncHandler) {
        final DeleteCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomVerificationEmailTemplateResult>() {
            @Override
            public DeleteCustomVerificationEmailTemplateResult call() throws Exception {
                DeleteCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeDeleteCustomVerificationEmailTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest request) {

        return deleteIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(final DeleteIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler) {
        final DeleteIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentityResult>() {
            @Override
            public DeleteIdentityResult call() throws Exception {
                DeleteIdentityResult result = null;

                try {
                    result = executeDeleteIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(DeleteIdentityPolicyRequest request) {

        return deleteIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(final DeleteIdentityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler) {
        final DeleteIdentityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentityPolicyResult>() {
            @Override
            public DeleteIdentityPolicyResult call() throws Exception {
                DeleteIdentityPolicyResult result = null;

                try {
                    result = executeDeleteIdentityPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(DeleteReceiptFilterRequest request) {

        return deleteReceiptFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(final DeleteReceiptFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReceiptFilterRequest, DeleteReceiptFilterResult> asyncHandler) {
        final DeleteReceiptFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReceiptFilterResult>() {
            @Override
            public DeleteReceiptFilterResult call() throws Exception {
                DeleteReceiptFilterResult result = null;

                try {
                    result = executeDeleteReceiptFilter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(DeleteReceiptRuleRequest request) {

        return deleteReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(final DeleteReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleRequest, DeleteReceiptRuleResult> asyncHandler) {
        final DeleteReceiptRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReceiptRuleResult>() {
            @Override
            public DeleteReceiptRuleResult call() throws Exception {
                DeleteReceiptRuleResult result = null;

                try {
                    result = executeDeleteReceiptRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(DeleteReceiptRuleSetRequest request) {

        return deleteReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(final DeleteReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler) {
        final DeleteReceiptRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReceiptRuleSetResult>() {
            @Override
            public DeleteReceiptRuleSetResult call() throws Exception {
                DeleteReceiptRuleSetResult result = null;

                try {
                    result = executeDeleteReceiptRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest request) {

        return deleteTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(final DeleteTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResult> asyncHandler) {
        final DeleteTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTemplateResult>() {
            @Override
            public DeleteTemplateResult call() throws Exception {
                DeleteTemplateResult result = null;

                try {
                    result = executeDeleteTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVerifiedEmailAddressResult> deleteVerifiedEmailAddressAsync(DeleteVerifiedEmailAddressRequest request) {

        return deleteVerifiedEmailAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVerifiedEmailAddressResult> deleteVerifiedEmailAddressAsync(final DeleteVerifiedEmailAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVerifiedEmailAddressRequest, DeleteVerifiedEmailAddressResult> asyncHandler) {
        final DeleteVerifiedEmailAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVerifiedEmailAddressResult>() {
            @Override
            public DeleteVerifiedEmailAddressResult call() throws Exception {
                DeleteVerifiedEmailAddressResult result = null;

                try {
                    result = executeDeleteVerifiedEmailAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(DescribeActiveReceiptRuleSetRequest request) {

        return describeActiveReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(final DescribeActiveReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler) {
        final DescribeActiveReceiptRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeActiveReceiptRuleSetResult>() {
            @Override
            public DescribeActiveReceiptRuleSetResult call() throws Exception {
                DescribeActiveReceiptRuleSetResult result = null;

                try {
                    result = executeDescribeActiveReceiptRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(DescribeConfigurationSetRequest request) {

        return describeConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(final DescribeConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSetRequest, DescribeConfigurationSetResult> asyncHandler) {
        final DescribeConfigurationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationSetResult>() {
            @Override
            public DescribeConfigurationSetResult call() throws Exception {
                DescribeConfigurationSetResult result = null;

                try {
                    result = executeDescribeConfigurationSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(DescribeReceiptRuleRequest request) {

        return describeReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(final DescribeReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleRequest, DescribeReceiptRuleResult> asyncHandler) {
        final DescribeReceiptRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReceiptRuleResult>() {
            @Override
            public DescribeReceiptRuleResult call() throws Exception {
                DescribeReceiptRuleResult result = null;

                try {
                    result = executeDescribeReceiptRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(DescribeReceiptRuleSetRequest request) {

        return describeReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(final DescribeReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler) {
        final DescribeReceiptRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReceiptRuleSetResult>() {
            @Override
            public DescribeReceiptRuleSetResult call() throws Exception {
                DescribeReceiptRuleSetResult result = null;

                try {
                    result = executeDescribeReceiptRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountSendingEnabledResult> getAccountSendingEnabledAsync(GetAccountSendingEnabledRequest request) {

        return getAccountSendingEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSendingEnabledResult> getAccountSendingEnabledAsync(final GetAccountSendingEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSendingEnabledRequest, GetAccountSendingEnabledResult> asyncHandler) {
        final GetAccountSendingEnabledRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSendingEnabledResult>() {
            @Override
            public GetAccountSendingEnabledResult call() throws Exception {
                GetAccountSendingEnabledResult result = null;

                try {
                    result = executeGetAccountSendingEnabled(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            GetCustomVerificationEmailTemplateRequest request) {

        return getCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            final GetCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCustomVerificationEmailTemplateRequest, GetCustomVerificationEmailTemplateResult> asyncHandler) {
        final GetCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCustomVerificationEmailTemplateResult>() {
            @Override
            public GetCustomVerificationEmailTemplateResult call() throws Exception {
                GetCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeGetCustomVerificationEmailTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(GetIdentityDkimAttributesRequest request) {

        return getIdentityDkimAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(final GetIdentityDkimAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler) {
        final GetIdentityDkimAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityDkimAttributesResult>() {
            @Override
            public GetIdentityDkimAttributesResult call() throws Exception {
                GetIdentityDkimAttributesResult result = null;

                try {
                    result = executeGetIdentityDkimAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest request) {

        return getIdentityMailFromDomainAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            final GetIdentityMailFromDomainAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityMailFromDomainAttributesRequest, GetIdentityMailFromDomainAttributesResult> asyncHandler) {
        final GetIdentityMailFromDomainAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityMailFromDomainAttributesResult>() {
            @Override
            public GetIdentityMailFromDomainAttributesResult call() throws Exception {
                GetIdentityMailFromDomainAttributesResult result = null;

                try {
                    result = executeGetIdentityMailFromDomainAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest request) {

        return getIdentityNotificationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            final GetIdentityNotificationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler) {
        final GetIdentityNotificationAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityNotificationAttributesResult>() {
            @Override
            public GetIdentityNotificationAttributesResult call() throws Exception {
                GetIdentityNotificationAttributesResult result = null;

                try {
                    result = executeGetIdentityNotificationAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(GetIdentityPoliciesRequest request) {

        return getIdentityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(final GetIdentityPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler) {
        final GetIdentityPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityPoliciesResult>() {
            @Override
            public GetIdentityPoliciesResult call() throws Exception {
                GetIdentityPoliciesResult result = null;

                try {
                    result = executeGetIdentityPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest request) {

        return getIdentityVerificationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            final GetIdentityVerificationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler) {
        final GetIdentityVerificationAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityVerificationAttributesResult>() {
            @Override
            public GetIdentityVerificationAttributesResult call() throws Exception {
                GetIdentityVerificationAttributesResult result = null;

                try {
                    result = executeGetIdentityVerificationAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest request) {

        return getSendQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(final GetSendQuotaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler) {
        final GetSendQuotaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSendQuotaResult>() {
            @Override
            public GetSendQuotaResult call() throws Exception {
                GetSendQuotaResult result = null;

                try {
                    result = executeGetSendQuota(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the GetSendQuota operation.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync() {

        return getSendQuotaAsync(new GetSendQuotaRequest());
    }

    /**
     * Simplified method form for invoking the GetSendQuota operation with an AsyncHandler.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler) {

        return getSendQuotaAsync(new GetSendQuotaRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(GetSendStatisticsRequest request) {

        return getSendStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(final GetSendStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler) {
        final GetSendStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSendStatisticsResult>() {
            @Override
            public GetSendStatisticsResult call() throws Exception {
                GetSendStatisticsResult result = null;

                try {
                    result = executeGetSendStatistics(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the GetSendStatistics operation.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync() {

        return getSendStatisticsAsync(new GetSendStatisticsRequest());
    }

    /**
     * Simplified method form for invoking the GetSendStatistics operation with an AsyncHandler.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler) {

        return getSendStatisticsAsync(new GetSendStatisticsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest request) {

        return getTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(final GetTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler) {
        final GetTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTemplateResult>() {
            @Override
            public GetTemplateResult call() throws Exception {
                GetTemplateResult result = null;

                try {
                    result = executeGetTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest request) {

        return listConfigurationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(final ListConfigurationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler) {
        final ListConfigurationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationSetsResult>() {
            @Override
            public ListConfigurationSetsResult call() throws Exception {
                ListConfigurationSetsResult result = null;

                try {
                    result = executeListConfigurationSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            ListCustomVerificationEmailTemplatesRequest request) {

        return listCustomVerificationEmailTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            final ListCustomVerificationEmailTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomVerificationEmailTemplatesRequest, ListCustomVerificationEmailTemplatesResult> asyncHandler) {
        final ListCustomVerificationEmailTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomVerificationEmailTemplatesResult>() {
            @Override
            public ListCustomVerificationEmailTemplatesResult call() throws Exception {
                ListCustomVerificationEmailTemplatesResult result = null;

                try {
                    result = executeListCustomVerificationEmailTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest request) {

        return listIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(final ListIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler) {
        final ListIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentitiesResult>() {
            @Override
            public ListIdentitiesResult call() throws Exception {
                ListIdentitiesResult result = null;

                try {
                    result = executeListIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the ListIdentities operation.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync() {

        return listIdentitiesAsync(new ListIdentitiesRequest());
    }

    /**
     * Simplified method form for invoking the ListIdentities operation with an AsyncHandler.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler) {

        return listIdentitiesAsync(new ListIdentitiesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(ListIdentityPoliciesRequest request) {

        return listIdentityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(final ListIdentityPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler) {
        final ListIdentityPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityPoliciesResult>() {
            @Override
            public ListIdentityPoliciesResult call() throws Exception {
                ListIdentityPoliciesResult result = null;

                try {
                    result = executeListIdentityPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(ListReceiptFiltersRequest request) {

        return listReceiptFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(final ListReceiptFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler) {
        final ListReceiptFiltersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReceiptFiltersResult>() {
            @Override
            public ListReceiptFiltersResult call() throws Exception {
                ListReceiptFiltersResult result = null;

                try {
                    result = executeListReceiptFilters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(ListReceiptRuleSetsRequest request) {

        return listReceiptRuleSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(final ListReceiptRuleSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler) {
        final ListReceiptRuleSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReceiptRuleSetsResult>() {
            @Override
            public ListReceiptRuleSetsResult call() throws Exception {
                ListReceiptRuleSetsResult result = null;

                try {
                    result = executeListReceiptRuleSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest request) {

        return listTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(final ListTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler) {
        final ListTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplatesResult>() {
            @Override
            public ListTemplatesResult call() throws Exception {
                ListTemplatesResult result = null;

                try {
                    result = executeListTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest request) {

        return listVerifiedEmailAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(final ListVerifiedEmailAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler) {
        final ListVerifiedEmailAddressesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVerifiedEmailAddressesResult>() {
            @Override
            public ListVerifiedEmailAddressesResult call() throws Exception {
                ListVerifiedEmailAddressesResult result = null;

                try {
                    result = executeListVerifiedEmailAddresses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the ListVerifiedEmailAddresses operation.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync() {

        return listVerifiedEmailAddressesAsync(new ListVerifiedEmailAddressesRequest());
    }

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses operation with an AsyncHandler.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler) {

        return listVerifiedEmailAddressesAsync(new ListVerifiedEmailAddressesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(PutIdentityPolicyRequest request) {

        return putIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(final PutIdentityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutIdentityPolicyRequest, PutIdentityPolicyResult> asyncHandler) {
        final PutIdentityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutIdentityPolicyResult>() {
            @Override
            public PutIdentityPolicyResult call() throws Exception {
                PutIdentityPolicyResult result = null;

                try {
                    result = executePutIdentityPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(ReorderReceiptRuleSetRequest request) {

        return reorderReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(final ReorderReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReorderReceiptRuleSetRequest, ReorderReceiptRuleSetResult> asyncHandler) {
        final ReorderReceiptRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReorderReceiptRuleSetResult>() {
            @Override
            public ReorderReceiptRuleSetResult call() throws Exception {
                ReorderReceiptRuleSetResult result = null;

                try {
                    result = executeReorderReceiptRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendBounceResult> sendBounceAsync(SendBounceRequest request) {

        return sendBounceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBounceResult> sendBounceAsync(final SendBounceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler) {
        final SendBounceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendBounceResult>() {
            @Override
            public SendBounceResult call() throws Exception {
                SendBounceResult result = null;

                try {
                    result = executeSendBounce(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendBulkTemplatedEmailResult> sendBulkTemplatedEmailAsync(SendBulkTemplatedEmailRequest request) {

        return sendBulkTemplatedEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBulkTemplatedEmailResult> sendBulkTemplatedEmailAsync(final SendBulkTemplatedEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendBulkTemplatedEmailRequest, SendBulkTemplatedEmailResult> asyncHandler) {
        final SendBulkTemplatedEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendBulkTemplatedEmailResult>() {
            @Override
            public SendBulkTemplatedEmailResult call() throws Exception {
                SendBulkTemplatedEmailResult result = null;

                try {
                    result = executeSendBulkTemplatedEmail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(SendCustomVerificationEmailRequest request) {

        return sendCustomVerificationEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(final SendCustomVerificationEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCustomVerificationEmailRequest, SendCustomVerificationEmailResult> asyncHandler) {
        final SendCustomVerificationEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendCustomVerificationEmailResult>() {
            @Override
            public SendCustomVerificationEmailResult call() throws Exception {
                SendCustomVerificationEmailResult result = null;

                try {
                    result = executeSendCustomVerificationEmail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest request) {

        return sendEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(final SendEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler) {
        final SendEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendEmailResult>() {
            @Override
            public SendEmailResult call() throws Exception {
                SendEmailResult result = null;

                try {
                    result = executeSendEmail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest request) {

        return sendRawEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(final SendRawEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler) {
        final SendRawEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendRawEmailResult>() {
            @Override
            public SendRawEmailResult call() throws Exception {
                SendRawEmailResult result = null;

                try {
                    result = executeSendRawEmail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendTemplatedEmailResult> sendTemplatedEmailAsync(SendTemplatedEmailRequest request) {

        return sendTemplatedEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTemplatedEmailResult> sendTemplatedEmailAsync(final SendTemplatedEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTemplatedEmailRequest, SendTemplatedEmailResult> asyncHandler) {
        final SendTemplatedEmailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendTemplatedEmailResult>() {
            @Override
            public SendTemplatedEmailResult call() throws Exception {
                SendTemplatedEmailResult result = null;

                try {
                    result = executeSendTemplatedEmail(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(SetActiveReceiptRuleSetRequest request) {

        return setActiveReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(final SetActiveReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetActiveReceiptRuleSetRequest, SetActiveReceiptRuleSetResult> asyncHandler) {
        final SetActiveReceiptRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetActiveReceiptRuleSetResult>() {
            @Override
            public SetActiveReceiptRuleSetResult call() throws Exception {
                SetActiveReceiptRuleSetResult result = null;

                try {
                    result = executeSetActiveReceiptRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(SetIdentityDkimEnabledRequest request) {

        return setIdentityDkimEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(final SetIdentityDkimEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler) {
        final SetIdentityDkimEnabledRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityDkimEnabledResult>() {
            @Override
            public SetIdentityDkimEnabledResult call() throws Exception {
                SetIdentityDkimEnabledResult result = null;

                try {
                    result = executeSetIdentityDkimEnabled(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest request) {

        return setIdentityFeedbackForwardingEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            final SetIdentityFeedbackForwardingEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler) {
        final SetIdentityFeedbackForwardingEnabledRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityFeedbackForwardingEnabledResult>() {
            @Override
            public SetIdentityFeedbackForwardingEnabledResult call() throws Exception {
                SetIdentityFeedbackForwardingEnabledResult result = null;

                try {
                    result = executeSetIdentityFeedbackForwardingEnabled(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            SetIdentityHeadersInNotificationsEnabledRequest request) {

        return setIdentityHeadersInNotificationsEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            final SetIdentityHeadersInNotificationsEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityHeadersInNotificationsEnabledRequest, SetIdentityHeadersInNotificationsEnabledResult> asyncHandler) {
        final SetIdentityHeadersInNotificationsEnabledRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityHeadersInNotificationsEnabledResult>() {
            @Override
            public SetIdentityHeadersInNotificationsEnabledResult call() throws Exception {
                SetIdentityHeadersInNotificationsEnabledResult result = null;

                try {
                    result = executeSetIdentityHeadersInNotificationsEnabled(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(SetIdentityMailFromDomainRequest request) {

        return setIdentityMailFromDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(final SetIdentityMailFromDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityMailFromDomainRequest, SetIdentityMailFromDomainResult> asyncHandler) {
        final SetIdentityMailFromDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityMailFromDomainResult>() {
            @Override
            public SetIdentityMailFromDomainResult call() throws Exception {
                SetIdentityMailFromDomainResult result = null;

                try {
                    result = executeSetIdentityMailFromDomain(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(SetIdentityNotificationTopicRequest request) {

        return setIdentityNotificationTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(final SetIdentityNotificationTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler) {
        final SetIdentityNotificationTopicRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityNotificationTopicResult>() {
            @Override
            public SetIdentityNotificationTopicResult call() throws Exception {
                SetIdentityNotificationTopicResult result = null;

                try {
                    result = executeSetIdentityNotificationTopic(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(SetReceiptRulePositionRequest request) {

        return setReceiptRulePositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(final SetReceiptRulePositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler) {
        final SetReceiptRulePositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetReceiptRulePositionResult>() {
            @Override
            public SetReceiptRulePositionResult call() throws Exception {
                SetReceiptRulePositionResult result = null;

                try {
                    result = executeSetReceiptRulePosition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TestRenderTemplateResult> testRenderTemplateAsync(TestRenderTemplateRequest request) {

        return testRenderTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestRenderTemplateResult> testRenderTemplateAsync(final TestRenderTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestRenderTemplateRequest, TestRenderTemplateResult> asyncHandler) {
        final TestRenderTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestRenderTemplateResult>() {
            @Override
            public TestRenderTemplateResult call() throws Exception {
                TestRenderTemplateResult result = null;

                try {
                    result = executeTestRenderTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSendingEnabledResult> updateAccountSendingEnabledAsync(UpdateAccountSendingEnabledRequest request) {

        return updateAccountSendingEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSendingEnabledResult> updateAccountSendingEnabledAsync(final UpdateAccountSendingEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountSendingEnabledRequest, UpdateAccountSendingEnabledResult> asyncHandler) {
        final UpdateAccountSendingEnabledRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountSendingEnabledResult>() {
            @Override
            public UpdateAccountSendingEnabledResult call() throws Exception {
                UpdateAccountSendingEnabledResult result = null;

                try {
                    result = executeUpdateAccountSendingEnabled(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest request) {

        return updateConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            final UpdateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler) {
        final UpdateConfigurationSetEventDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetEventDestinationResult>() {
            @Override
            public UpdateConfigurationSetEventDestinationResult call() throws Exception {
                UpdateConfigurationSetEventDestinationResult result = null;

                try {
                    result = executeUpdateConfigurationSetEventDestination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetReputationMetricsEnabledResult> updateConfigurationSetReputationMetricsEnabledAsync(
            UpdateConfigurationSetReputationMetricsEnabledRequest request) {

        return updateConfigurationSetReputationMetricsEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetReputationMetricsEnabledResult> updateConfigurationSetReputationMetricsEnabledAsync(
            final UpdateConfigurationSetReputationMetricsEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetReputationMetricsEnabledRequest, UpdateConfigurationSetReputationMetricsEnabledResult> asyncHandler) {
        final UpdateConfigurationSetReputationMetricsEnabledRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetReputationMetricsEnabledResult>() {
            @Override
            public UpdateConfigurationSetReputationMetricsEnabledResult call() throws Exception {
                UpdateConfigurationSetReputationMetricsEnabledResult result = null;

                try {
                    result = executeUpdateConfigurationSetReputationMetricsEnabled(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetSendingEnabledResult> updateConfigurationSetSendingEnabledAsync(
            UpdateConfigurationSetSendingEnabledRequest request) {

        return updateConfigurationSetSendingEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetSendingEnabledResult> updateConfigurationSetSendingEnabledAsync(
            final UpdateConfigurationSetSendingEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetSendingEnabledRequest, UpdateConfigurationSetSendingEnabledResult> asyncHandler) {
        final UpdateConfigurationSetSendingEnabledRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetSendingEnabledResult>() {
            @Override
            public UpdateConfigurationSetSendingEnabledResult call() throws Exception {
                UpdateConfigurationSetSendingEnabledResult result = null;

                try {
                    result = executeUpdateConfigurationSetSendingEnabled(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetTrackingOptionsResult> updateConfigurationSetTrackingOptionsAsync(
            UpdateConfigurationSetTrackingOptionsRequest request) {

        return updateConfigurationSetTrackingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetTrackingOptionsResult> updateConfigurationSetTrackingOptionsAsync(
            final UpdateConfigurationSetTrackingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetTrackingOptionsRequest, UpdateConfigurationSetTrackingOptionsResult> asyncHandler) {
        final UpdateConfigurationSetTrackingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetTrackingOptionsResult>() {
            @Override
            public UpdateConfigurationSetTrackingOptionsResult call() throws Exception {
                UpdateConfigurationSetTrackingOptionsResult result = null;

                try {
                    result = executeUpdateConfigurationSetTrackingOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomVerificationEmailTemplateResult> updateCustomVerificationEmailTemplateAsync(
            UpdateCustomVerificationEmailTemplateRequest request) {

        return updateCustomVerificationEmailTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomVerificationEmailTemplateResult> updateCustomVerificationEmailTemplateAsync(
            final UpdateCustomVerificationEmailTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCustomVerificationEmailTemplateRequest, UpdateCustomVerificationEmailTemplateResult> asyncHandler) {
        final UpdateCustomVerificationEmailTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCustomVerificationEmailTemplateResult>() {
            @Override
            public UpdateCustomVerificationEmailTemplateResult call() throws Exception {
                UpdateCustomVerificationEmailTemplateResult result = null;

                try {
                    result = executeUpdateCustomVerificationEmailTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(UpdateReceiptRuleRequest request) {

        return updateReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(final UpdateReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler) {
        final UpdateReceiptRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReceiptRuleResult>() {
            @Override
            public UpdateReceiptRuleResult call() throws Exception {
                UpdateReceiptRuleResult result = null;

                try {
                    result = executeUpdateReceiptRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest request) {

        return updateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(final UpdateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler) {
        final UpdateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTemplateResult>() {
            @Override
            public UpdateTemplateResult call() throws Exception {
                UpdateTemplateResult result = null;

                try {
                    result = executeUpdateTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(VerifyDomainDkimRequest request) {

        return verifyDomainDkimAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(final VerifyDomainDkimRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler) {
        final VerifyDomainDkimRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyDomainDkimResult>() {
            @Override
            public VerifyDomainDkimResult call() throws Exception {
                VerifyDomainDkimResult result = null;

                try {
                    result = executeVerifyDomainDkim(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest request) {

        return verifyDomainIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(final VerifyDomainIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler) {
        final VerifyDomainIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyDomainIdentityResult>() {
            @Override
            public VerifyDomainIdentityResult call() throws Exception {
                VerifyDomainIdentityResult result = null;

                try {
                    result = executeVerifyDomainIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(VerifyEmailAddressRequest request) {

        return verifyEmailAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(final VerifyEmailAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyEmailAddressRequest, VerifyEmailAddressResult> asyncHandler) {
        final VerifyEmailAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyEmailAddressResult>() {
            @Override
            public VerifyEmailAddressResult call() throws Exception {
                VerifyEmailAddressResult result = null;

                try {
                    result = executeVerifyEmailAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest request) {

        return verifyEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(final VerifyEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler) {
        final VerifyEmailIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyEmailIdentityResult>() {
            @Override
            public VerifyEmailIdentityResult call() throws Exception {
                VerifyEmailIdentityResult result = null;

                try {
                    result = executeVerifyEmailIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
