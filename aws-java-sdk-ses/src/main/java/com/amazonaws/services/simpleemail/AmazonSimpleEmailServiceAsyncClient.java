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
package com.amazonaws.services.simpleemail;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon SES asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon SES). This documentation is intended to be used in
 * conjunction with the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html">Regions and Amazon SES</a> in the Amazon SES
 * Developer Guide.
 * </p>
 * </note>
 */
@ThreadSafe
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
     */
    public AmazonSimpleEmailServiceAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SES using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonSimpleEmailServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(CloneReceiptRuleSetRequest request) {

        return cloneReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(final CloneReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CloneReceiptRuleSetRequest, CloneReceiptRuleSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CloneReceiptRuleSetResult>() {
            @Override
            public CloneReceiptRuleSetResult call() throws Exception {
                CloneReceiptRuleSetResult result;

                try {
                    result = cloneReceiptRuleSet(request);
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
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(CreateConfigurationSetRequest request) {

        return createConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetResult> createConfigurationSetAsync(final CreateConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetResult>() {
            @Override
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result;

                try {
                    result = createConfigurationSet(request);
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
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            CreateConfigurationSetEventDestinationRequest request) {

        return createConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            final CreateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationSetEventDestinationResult>() {
            @Override
            public CreateConfigurationSetEventDestinationResult call() throws Exception {
                CreateConfigurationSetEventDestinationResult result;

                try {
                    result = createConfigurationSetEventDestination(request);
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
    public java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(CreateReceiptFilterRequest request) {

        return createReceiptFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(final CreateReceiptFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReceiptFilterRequest, CreateReceiptFilterResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReceiptFilterResult>() {
            @Override
            public CreateReceiptFilterResult call() throws Exception {
                CreateReceiptFilterResult result;

                try {
                    result = createReceiptFilter(request);
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
    public java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(CreateReceiptRuleRequest request) {

        return createReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(final CreateReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleRequest, CreateReceiptRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReceiptRuleResult>() {
            @Override
            public CreateReceiptRuleResult call() throws Exception {
                CreateReceiptRuleResult result;

                try {
                    result = createReceiptRule(request);
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
    public java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(CreateReceiptRuleSetRequest request) {

        return createReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(final CreateReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReceiptRuleSetResult>() {
            @Override
            public CreateReceiptRuleSetResult call() throws Exception {
                CreateReceiptRuleSetResult result;

                try {
                    result = createReceiptRuleSet(request);
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
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(DeleteConfigurationSetRequest request) {

        return deleteConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(final DeleteConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetResult>() {
            @Override
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result;

                try {
                    result = deleteConfigurationSet(request);
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
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            DeleteConfigurationSetEventDestinationRequest request) {

        return deleteConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            final DeleteConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationSetEventDestinationResult>() {
            @Override
            public DeleteConfigurationSetEventDestinationResult call() throws Exception {
                DeleteConfigurationSetEventDestinationResult result;

                try {
                    result = deleteConfigurationSetEventDestination(request);
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
    public java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(DeleteIdentityRequest request) {

        return deleteIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(final DeleteIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentityResult>() {
            @Override
            public DeleteIdentityResult call() throws Exception {
                DeleteIdentityResult result;

                try {
                    result = deleteIdentity(request);
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
    public java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(DeleteIdentityPolicyRequest request) {

        return deleteIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(final DeleteIdentityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentityPolicyResult>() {
            @Override
            public DeleteIdentityPolicyResult call() throws Exception {
                DeleteIdentityPolicyResult result;

                try {
                    result = deleteIdentityPolicy(request);
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
    public java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(DeleteReceiptFilterRequest request) {

        return deleteReceiptFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(final DeleteReceiptFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReceiptFilterRequest, DeleteReceiptFilterResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReceiptFilterResult>() {
            @Override
            public DeleteReceiptFilterResult call() throws Exception {
                DeleteReceiptFilterResult result;

                try {
                    result = deleteReceiptFilter(request);
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
    public java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(DeleteReceiptRuleRequest request) {

        return deleteReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(final DeleteReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleRequest, DeleteReceiptRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReceiptRuleResult>() {
            @Override
            public DeleteReceiptRuleResult call() throws Exception {
                DeleteReceiptRuleResult result;

                try {
                    result = deleteReceiptRule(request);
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
    public java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(DeleteReceiptRuleSetRequest request) {

        return deleteReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(final DeleteReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReceiptRuleSetResult>() {
            @Override
            public DeleteReceiptRuleSetResult call() throws Exception {
                DeleteReceiptRuleSetResult result;

                try {
                    result = deleteReceiptRuleSet(request);
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
    public java.util.concurrent.Future<DeleteVerifiedEmailAddressResult> deleteVerifiedEmailAddressAsync(DeleteVerifiedEmailAddressRequest request) {

        return deleteVerifiedEmailAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVerifiedEmailAddressResult> deleteVerifiedEmailAddressAsync(final DeleteVerifiedEmailAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVerifiedEmailAddressRequest, DeleteVerifiedEmailAddressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteVerifiedEmailAddressResult>() {
            @Override
            public DeleteVerifiedEmailAddressResult call() throws Exception {
                DeleteVerifiedEmailAddressResult result;

                try {
                    result = deleteVerifiedEmailAddress(request);
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
    public java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(DescribeActiveReceiptRuleSetRequest request) {

        return describeActiveReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(final DescribeActiveReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeActiveReceiptRuleSetResult>() {
            @Override
            public DescribeActiveReceiptRuleSetResult call() throws Exception {
                DescribeActiveReceiptRuleSetResult result;

                try {
                    result = describeActiveReceiptRuleSet(request);
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
    public java.util.concurrent.Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(DescribeConfigurationSetRequest request) {

        return describeConfigurationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(final DescribeConfigurationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSetRequest, DescribeConfigurationSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeConfigurationSetResult>() {
            @Override
            public DescribeConfigurationSetResult call() throws Exception {
                DescribeConfigurationSetResult result;

                try {
                    result = describeConfigurationSet(request);
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
    public java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(DescribeReceiptRuleRequest request) {

        return describeReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(final DescribeReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleRequest, DescribeReceiptRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReceiptRuleResult>() {
            @Override
            public DescribeReceiptRuleResult call() throws Exception {
                DescribeReceiptRuleResult result;

                try {
                    result = describeReceiptRule(request);
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
    public java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(DescribeReceiptRuleSetRequest request) {

        return describeReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(final DescribeReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReceiptRuleSetResult>() {
            @Override
            public DescribeReceiptRuleSetResult call() throws Exception {
                DescribeReceiptRuleSetResult result;

                try {
                    result = describeReceiptRuleSet(request);
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
    public java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(GetIdentityDkimAttributesRequest request) {

        return getIdentityDkimAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(final GetIdentityDkimAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityDkimAttributesResult>() {
            @Override
            public GetIdentityDkimAttributesResult call() throws Exception {
                GetIdentityDkimAttributesResult result;

                try {
                    result = getIdentityDkimAttributes(request);
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
    public java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest request) {

        return getIdentityMailFromDomainAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            final GetIdentityMailFromDomainAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityMailFromDomainAttributesRequest, GetIdentityMailFromDomainAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityMailFromDomainAttributesResult>() {
            @Override
            public GetIdentityMailFromDomainAttributesResult call() throws Exception {
                GetIdentityMailFromDomainAttributesResult result;

                try {
                    result = getIdentityMailFromDomainAttributes(request);
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
    public java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest request) {

        return getIdentityNotificationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            final GetIdentityNotificationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityNotificationAttributesResult>() {
            @Override
            public GetIdentityNotificationAttributesResult call() throws Exception {
                GetIdentityNotificationAttributesResult result;

                try {
                    result = getIdentityNotificationAttributes(request);
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
    public java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(GetIdentityPoliciesRequest request) {

        return getIdentityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(final GetIdentityPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityPoliciesResult>() {
            @Override
            public GetIdentityPoliciesResult call() throws Exception {
                GetIdentityPoliciesResult result;

                try {
                    result = getIdentityPolicies(request);
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
    public java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest request) {

        return getIdentityVerificationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            final GetIdentityVerificationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityVerificationAttributesResult>() {
            @Override
            public GetIdentityVerificationAttributesResult call() throws Exception {
                GetIdentityVerificationAttributesResult result;

                try {
                    result = getIdentityVerificationAttributes(request);
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
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(GetSendQuotaRequest request) {

        return getSendQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(final GetSendQuotaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSendQuotaResult>() {
            @Override
            public GetSendQuotaResult call() throws Exception {
                GetSendQuotaResult result;

                try {
                    result = getSendQuota(request);
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

        return executorService.submit(new java.util.concurrent.Callable<GetSendStatisticsResult>() {
            @Override
            public GetSendStatisticsResult call() throws Exception {
                GetSendStatisticsResult result;

                try {
                    result = getSendStatistics(request);
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
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler) {

        return getSendStatisticsAsync(new GetSendStatisticsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(ListConfigurationSetsRequest request) {

        return listConfigurationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationSetsResult> listConfigurationSetsAsync(final ListConfigurationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationSetsResult>() {
            @Override
            public ListConfigurationSetsResult call() throws Exception {
                ListConfigurationSetsResult result;

                try {
                    result = listConfigurationSets(request);
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
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest request) {

        return listIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(final ListIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListIdentitiesResult>() {
            @Override
            public ListIdentitiesResult call() throws Exception {
                ListIdentitiesResult result;

                try {
                    result = listIdentities(request);
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

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityPoliciesResult>() {
            @Override
            public ListIdentityPoliciesResult call() throws Exception {
                ListIdentityPoliciesResult result;

                try {
                    result = listIdentityPolicies(request);
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
    public java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(ListReceiptFiltersRequest request) {

        return listReceiptFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(final ListReceiptFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListReceiptFiltersResult>() {
            @Override
            public ListReceiptFiltersResult call() throws Exception {
                ListReceiptFiltersResult result;

                try {
                    result = listReceiptFilters(request);
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
    public java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(ListReceiptRuleSetsRequest request) {

        return listReceiptRuleSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(final ListReceiptRuleSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListReceiptRuleSetsResult>() {
            @Override
            public ListReceiptRuleSetsResult call() throws Exception {
                ListReceiptRuleSetsResult result;

                try {
                    result = listReceiptRuleSets(request);
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
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest request) {

        return listVerifiedEmailAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(final ListVerifiedEmailAddressesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListVerifiedEmailAddressesResult>() {
            @Override
            public ListVerifiedEmailAddressesResult call() throws Exception {
                ListVerifiedEmailAddressesResult result;

                try {
                    result = listVerifiedEmailAddresses(request);
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

        return executorService.submit(new java.util.concurrent.Callable<PutIdentityPolicyResult>() {
            @Override
            public PutIdentityPolicyResult call() throws Exception {
                PutIdentityPolicyResult result;

                try {
                    result = putIdentityPolicy(request);
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
    public java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(ReorderReceiptRuleSetRequest request) {

        return reorderReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(final ReorderReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReorderReceiptRuleSetRequest, ReorderReceiptRuleSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReorderReceiptRuleSetResult>() {
            @Override
            public ReorderReceiptRuleSetResult call() throws Exception {
                ReorderReceiptRuleSetResult result;

                try {
                    result = reorderReceiptRuleSet(request);
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
    public java.util.concurrent.Future<SendBounceResult> sendBounceAsync(SendBounceRequest request) {

        return sendBounceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBounceResult> sendBounceAsync(final SendBounceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendBounceResult>() {
            @Override
            public SendBounceResult call() throws Exception {
                SendBounceResult result;

                try {
                    result = sendBounce(request);
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
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(SendEmailRequest request) {

        return sendEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(final SendEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendEmailResult>() {
            @Override
            public SendEmailResult call() throws Exception {
                SendEmailResult result;

                try {
                    result = sendEmail(request);
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
    public java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(SendRawEmailRequest request) {

        return sendRawEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(final SendRawEmailRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendRawEmailResult>() {
            @Override
            public SendRawEmailResult call() throws Exception {
                SendRawEmailResult result;

                try {
                    result = sendRawEmail(request);
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
    public java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(SetActiveReceiptRuleSetRequest request) {

        return setActiveReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(final SetActiveReceiptRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetActiveReceiptRuleSetRequest, SetActiveReceiptRuleSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetActiveReceiptRuleSetResult>() {
            @Override
            public SetActiveReceiptRuleSetResult call() throws Exception {
                SetActiveReceiptRuleSetResult result;

                try {
                    result = setActiveReceiptRuleSet(request);
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
    public java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(SetIdentityDkimEnabledRequest request) {

        return setIdentityDkimEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(final SetIdentityDkimEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityDkimEnabledResult>() {
            @Override
            public SetIdentityDkimEnabledResult call() throws Exception {
                SetIdentityDkimEnabledResult result;

                try {
                    result = setIdentityDkimEnabled(request);
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
    public java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest request) {

        return setIdentityFeedbackForwardingEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            final SetIdentityFeedbackForwardingEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityFeedbackForwardingEnabledResult>() {
            @Override
            public SetIdentityFeedbackForwardingEnabledResult call() throws Exception {
                SetIdentityFeedbackForwardingEnabledResult result;

                try {
                    result = setIdentityFeedbackForwardingEnabled(request);
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
    public java.util.concurrent.Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            SetIdentityHeadersInNotificationsEnabledRequest request) {

        return setIdentityHeadersInNotificationsEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            final SetIdentityHeadersInNotificationsEnabledRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityHeadersInNotificationsEnabledRequest, SetIdentityHeadersInNotificationsEnabledResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityHeadersInNotificationsEnabledResult>() {
            @Override
            public SetIdentityHeadersInNotificationsEnabledResult call() throws Exception {
                SetIdentityHeadersInNotificationsEnabledResult result;

                try {
                    result = setIdentityHeadersInNotificationsEnabled(request);
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
    public java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(SetIdentityMailFromDomainRequest request) {

        return setIdentityMailFromDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(final SetIdentityMailFromDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityMailFromDomainRequest, SetIdentityMailFromDomainResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityMailFromDomainResult>() {
            @Override
            public SetIdentityMailFromDomainResult call() throws Exception {
                SetIdentityMailFromDomainResult result;

                try {
                    result = setIdentityMailFromDomain(request);
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
    public java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(SetIdentityNotificationTopicRequest request) {

        return setIdentityNotificationTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(final SetIdentityNotificationTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityNotificationTopicResult>() {
            @Override
            public SetIdentityNotificationTopicResult call() throws Exception {
                SetIdentityNotificationTopicResult result;

                try {
                    result = setIdentityNotificationTopic(request);
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
    public java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(SetReceiptRulePositionRequest request) {

        return setReceiptRulePositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(final SetReceiptRulePositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetReceiptRulePositionResult>() {
            @Override
            public SetReceiptRulePositionResult call() throws Exception {
                SetReceiptRulePositionResult result;

                try {
                    result = setReceiptRulePosition(request);
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
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            UpdateConfigurationSetEventDestinationRequest request) {

        return updateConfigurationSetEventDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            final UpdateConfigurationSetEventDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationSetEventDestinationResult>() {
            @Override
            public UpdateConfigurationSetEventDestinationResult call() throws Exception {
                UpdateConfigurationSetEventDestinationResult result;

                try {
                    result = updateConfigurationSetEventDestination(request);
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
    public java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(UpdateReceiptRuleRequest request) {

        return updateReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(final UpdateReceiptRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateReceiptRuleResult>() {
            @Override
            public UpdateReceiptRuleResult call() throws Exception {
                UpdateReceiptRuleResult result;

                try {
                    result = updateReceiptRule(request);
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
    public java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(VerifyDomainDkimRequest request) {

        return verifyDomainDkimAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(final VerifyDomainDkimRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<VerifyDomainDkimResult>() {
            @Override
            public VerifyDomainDkimResult call() throws Exception {
                VerifyDomainDkimResult result;

                try {
                    result = verifyDomainDkim(request);
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
    public java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(VerifyDomainIdentityRequest request) {

        return verifyDomainIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(final VerifyDomainIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<VerifyDomainIdentityResult>() {
            @Override
            public VerifyDomainIdentityResult call() throws Exception {
                VerifyDomainIdentityResult result;

                try {
                    result = verifyDomainIdentity(request);
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
    public java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(VerifyEmailAddressRequest request) {

        return verifyEmailAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailAddressResult> verifyEmailAddressAsync(final VerifyEmailAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyEmailAddressRequest, VerifyEmailAddressResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<VerifyEmailAddressResult>() {
            @Override
            public VerifyEmailAddressResult call() throws Exception {
                VerifyEmailAddressResult result;

                try {
                    result = verifyEmailAddress(request);
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
    public java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(VerifyEmailIdentityRequest request) {

        return verifyEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(final VerifyEmailIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<VerifyEmailIdentityResult>() {
            @Override
            public VerifyEmailIdentityResult call() throws Exception {
                VerifyEmailIdentityResult result;

                try {
                    result = verifyEmailIdentity(request);
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
