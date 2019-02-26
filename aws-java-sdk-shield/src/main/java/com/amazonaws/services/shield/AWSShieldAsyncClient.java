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
package com.amazonaws.services.shield;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Shield asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Shield Advanced</fullname>
 * <p>
 * This is the <i>AWS Shield Advanced API Reference</i>. This guide is for developers who need detailed information
 * about the AWS Shield Advanced API actions, data types, and errors. For detailed information about AWS WAF and AWS
 * Shield Advanced features and an overview of how to use the AWS WAF and AWS Shield Advanced APIs, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSShieldAsyncClient extends AWSShieldClient implements AWSShieldAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield. A credentials provider chain will
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
     * @deprecated use {@link AWSShieldAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSShieldAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to AWS Shield (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSShieldAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSShieldAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSShieldAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSShieldAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSShieldAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSShieldAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the provided AWS account
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
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSShieldAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSShieldAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSShieldAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSShieldAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSShieldAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSShieldAsyncClientBuilder asyncBuilder() {
        return AWSShieldAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Shield using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSShieldAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateDRTLogBucketResult> associateDRTLogBucketAsync(AssociateDRTLogBucketRequest request) {

        return associateDRTLogBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDRTLogBucketResult> associateDRTLogBucketAsync(final AssociateDRTLogBucketRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDRTLogBucketRequest, AssociateDRTLogBucketResult> asyncHandler) {
        final AssociateDRTLogBucketRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDRTLogBucketResult>() {
            @Override
            public AssociateDRTLogBucketResult call() throws Exception {
                AssociateDRTLogBucketResult result = null;

                try {
                    result = executeAssociateDRTLogBucket(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateDRTRoleResult> associateDRTRoleAsync(AssociateDRTRoleRequest request) {

        return associateDRTRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDRTRoleResult> associateDRTRoleAsync(final AssociateDRTRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDRTRoleRequest, AssociateDRTRoleResult> asyncHandler) {
        final AssociateDRTRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDRTRoleResult>() {
            @Override
            public AssociateDRTRoleResult call() throws Exception {
                AssociateDRTRoleResult result = null;

                try {
                    result = executeAssociateDRTRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(CreateProtectionRequest request) {

        return createProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(final CreateProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProtectionRequest, CreateProtectionResult> asyncHandler) {
        final CreateProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProtectionResult>() {
            @Override
            public CreateProtectionResult call() throws Exception {
                CreateProtectionResult result = null;

                try {
                    result = executeCreateProtection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(CreateSubscriptionRequest request) {

        return createSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(final CreateSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriptionRequest, CreateSubscriptionResult> asyncHandler) {
        final CreateSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriptionResult>() {
            @Override
            public CreateSubscriptionResult call() throws Exception {
                CreateSubscriptionResult result = null;

                try {
                    result = executeCreateSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(DeleteProtectionRequest request) {

        return deleteProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(final DeleteProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProtectionRequest, DeleteProtectionResult> asyncHandler) {
        final DeleteProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProtectionResult>() {
            @Override
            public DeleteProtectionResult call() throws Exception {
                DeleteProtectionResult result = null;

                try {
                    result = executeDeleteProtection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(DeleteSubscriptionRequest request) {

        return deleteSubscriptionAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(final DeleteSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionRequest, DeleteSubscriptionResult> asyncHandler) {
        final DeleteSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriptionResult>() {
            @Override
            public DeleteSubscriptionResult call() throws Exception {
                DeleteSubscriptionResult result = null;

                try {
                    result = executeDeleteSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(DescribeAttackRequest request) {

        return describeAttackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(final DescribeAttackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAttackRequest, DescribeAttackResult> asyncHandler) {
        final DescribeAttackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAttackResult>() {
            @Override
            public DescribeAttackResult call() throws Exception {
                DescribeAttackResult result = null;

                try {
                    result = executeDescribeAttack(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDRTAccessResult> describeDRTAccessAsync(DescribeDRTAccessRequest request) {

        return describeDRTAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDRTAccessResult> describeDRTAccessAsync(final DescribeDRTAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDRTAccessRequest, DescribeDRTAccessResult> asyncHandler) {
        final DescribeDRTAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDRTAccessResult>() {
            @Override
            public DescribeDRTAccessResult call() throws Exception {
                DescribeDRTAccessResult result = null;

                try {
                    result = executeDescribeDRTAccess(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEmergencyContactSettingsResult> describeEmergencyContactSettingsAsync(
            DescribeEmergencyContactSettingsRequest request) {

        return describeEmergencyContactSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEmergencyContactSettingsResult> describeEmergencyContactSettingsAsync(
            final DescribeEmergencyContactSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEmergencyContactSettingsRequest, DescribeEmergencyContactSettingsResult> asyncHandler) {
        final DescribeEmergencyContactSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEmergencyContactSettingsResult>() {
            @Override
            public DescribeEmergencyContactSettingsResult call() throws Exception {
                DescribeEmergencyContactSettingsResult result = null;

                try {
                    result = executeDescribeEmergencyContactSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(DescribeProtectionRequest request) {

        return describeProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(final DescribeProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProtectionRequest, DescribeProtectionResult> asyncHandler) {
        final DescribeProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProtectionResult>() {
            @Override
            public DescribeProtectionResult call() throws Exception {
                DescribeProtectionResult result = null;

                try {
                    result = executeDescribeProtection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(DescribeSubscriptionRequest request) {

        return describeSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(final DescribeSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionRequest, DescribeSubscriptionResult> asyncHandler) {
        final DescribeSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubscriptionResult>() {
            @Override
            public DescribeSubscriptionResult call() throws Exception {
                DescribeSubscriptionResult result = null;

                try {
                    result = executeDescribeSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTLogBucketResult> disassociateDRTLogBucketAsync(DisassociateDRTLogBucketRequest request) {

        return disassociateDRTLogBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTLogBucketResult> disassociateDRTLogBucketAsync(final DisassociateDRTLogBucketRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDRTLogBucketRequest, DisassociateDRTLogBucketResult> asyncHandler) {
        final DisassociateDRTLogBucketRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDRTLogBucketResult>() {
            @Override
            public DisassociateDRTLogBucketResult call() throws Exception {
                DisassociateDRTLogBucketResult result = null;

                try {
                    result = executeDisassociateDRTLogBucket(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTRoleResult> disassociateDRTRoleAsync(DisassociateDRTRoleRequest request) {

        return disassociateDRTRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDRTRoleResult> disassociateDRTRoleAsync(final DisassociateDRTRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDRTRoleRequest, DisassociateDRTRoleResult> asyncHandler) {
        final DisassociateDRTRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDRTRoleResult>() {
            @Override
            public DisassociateDRTRoleResult call() throws Exception {
                DisassociateDRTRoleResult result = null;

                try {
                    result = executeDisassociateDRTRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionStateResult> getSubscriptionStateAsync(GetSubscriptionStateRequest request) {

        return getSubscriptionStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionStateResult> getSubscriptionStateAsync(final GetSubscriptionStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionStateRequest, GetSubscriptionStateResult> asyncHandler) {
        final GetSubscriptionStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionStateResult>() {
            @Override
            public GetSubscriptionStateResult call() throws Exception {
                GetSubscriptionStateResult result = null;

                try {
                    result = executeGetSubscriptionState(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(ListAttacksRequest request) {

        return listAttacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(final ListAttacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttacksRequest, ListAttacksResult> asyncHandler) {
        final ListAttacksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttacksResult>() {
            @Override
            public ListAttacksResult call() throws Exception {
                ListAttacksResult result = null;

                try {
                    result = executeListAttacks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(ListProtectionsRequest request) {

        return listProtectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(final ListProtectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProtectionsRequest, ListProtectionsResult> asyncHandler) {
        final ListProtectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProtectionsResult>() {
            @Override
            public ListProtectionsResult call() throws Exception {
                ListProtectionsResult result = null;

                try {
                    result = executeListProtections(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEmergencyContactSettingsResult> updateEmergencyContactSettingsAsync(UpdateEmergencyContactSettingsRequest request) {

        return updateEmergencyContactSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmergencyContactSettingsResult> updateEmergencyContactSettingsAsync(
            final UpdateEmergencyContactSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEmergencyContactSettingsRequest, UpdateEmergencyContactSettingsResult> asyncHandler) {
        final UpdateEmergencyContactSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEmergencyContactSettingsResult>() {
            @Override
            public UpdateEmergencyContactSettingsResult call() throws Exception {
                UpdateEmergencyContactSettingsResult result = null;

                try {
                    result = executeUpdateEmergencyContactSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionResult> updateSubscriptionAsync(UpdateSubscriptionRequest request) {

        return updateSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionResult> updateSubscriptionAsync(final UpdateSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionRequest, UpdateSubscriptionResult> asyncHandler) {
        final UpdateSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriptionResult>() {
            @Override
            public UpdateSubscriptionResult call() throws Exception {
                UpdateSubscriptionResult result = null;

                try {
                    result = executeUpdateSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
