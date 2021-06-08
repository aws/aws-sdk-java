/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.health.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWSHealth asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS Health</fullname>
 * <p>
 * The AWS Health API provides programmatic access to the AWS Health information that appears in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">AWS Personal Health Dashboard</a>. You can use the API operations to get
 * information about AWS Health events that affect your AWS services and resources.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise Support plan from <a href="http://aws.amazon.com/premiumsupport/">AWS
 * Support</a> to use the AWS Health API. If you call the AWS Health API from an AWS account that doesn't have a
 * Business or Enterprise Support plan, you receive a <code>SubscriptionRequiredException</code> error.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can use the AWS Health endpoint health.us-east-1.amazonaws.com (HTTPS) to call the AWS Health API operations. AWS
 * Health supports a multi-Region application architecture and has two regional endpoints in an active-passive
 * configuration. You can use the high availability endpoint example to determine which AWS Region is active, so that
 * you can get the latest information from the API. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/health-api.html">Accessing the AWS Health API</a> in the <i>AWS
 * Health User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * For authentication of requests, AWS Health uses the <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * If your AWS account is part of AWS Organizations, you can use the AWS Health organizational view feature. This
 * feature provides a centralized view of AWS Health events across all accounts in your organization. You can aggregate
 * AWS Health events in real time to identify accounts in your organization that are affected by an operational event or
 * get notified of security vulnerabilities. Use the organizational view API operations to enable this feature and
 * return event information. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in the
 * <i>AWS Health User Guide</i>.
 * </p>
 * <note>
 * <p>
 * When you use the AWS Health API operations to return AWS Health events, see the following recommendations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <a
 * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html#AWSHealth-Type-Event-eventScopeCode"
 * >eventScopeCode</a> parameter to specify whether to return AWS Health events that are public or account-specific.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use pagination to view all events from the response. For example, if you call the
 * <code>DescribeEventsForOrganization</code> operation to get all events in your organization, you might receive
 * several page results. Specify the <code>nextToken</code> in the next request to return more results.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSHealthAsyncClient extends AWSHealthClient implements AWSHealthAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AWSHealthAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSHealthAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWSHealth (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSHealthAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSHealthAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSHealthAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSHealthAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSHealthAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSHealthAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the provided AWS account
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
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSHealthAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSHealthAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSHealthAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSHealthAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSHealthAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSHealthAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSHealthAsyncClientBuilder asyncBuilder() {
        return AWSHealthAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSHealthAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSHealth using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSHealthAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<DescribeAffectedAccountsForOrganizationResult> describeAffectedAccountsForOrganizationAsync(
            DescribeAffectedAccountsForOrganizationRequest request) {

        return describeAffectedAccountsForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedAccountsForOrganizationResult> describeAffectedAccountsForOrganizationAsync(
            final DescribeAffectedAccountsForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAffectedAccountsForOrganizationRequest, DescribeAffectedAccountsForOrganizationResult> asyncHandler) {
        final DescribeAffectedAccountsForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAffectedAccountsForOrganizationResult>() {
            @Override
            public DescribeAffectedAccountsForOrganizationResult call() throws Exception {
                DescribeAffectedAccountsForOrganizationResult result = null;

                try {
                    result = executeDescribeAffectedAccountsForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesResult> describeAffectedEntitiesAsync(DescribeAffectedEntitiesRequest request) {

        return describeAffectedEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesResult> describeAffectedEntitiesAsync(final DescribeAffectedEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAffectedEntitiesRequest, DescribeAffectedEntitiesResult> asyncHandler) {
        final DescribeAffectedEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAffectedEntitiesResult>() {
            @Override
            public DescribeAffectedEntitiesResult call() throws Exception {
                DescribeAffectedEntitiesResult result = null;

                try {
                    result = executeDescribeAffectedEntities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesForOrganizationResult> describeAffectedEntitiesForOrganizationAsync(
            DescribeAffectedEntitiesForOrganizationRequest request) {

        return describeAffectedEntitiesForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAffectedEntitiesForOrganizationResult> describeAffectedEntitiesForOrganizationAsync(
            final DescribeAffectedEntitiesForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAffectedEntitiesForOrganizationRequest, DescribeAffectedEntitiesForOrganizationResult> asyncHandler) {
        final DescribeAffectedEntitiesForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAffectedEntitiesForOrganizationResult>() {
            @Override
            public DescribeAffectedEntitiesForOrganizationResult call() throws Exception {
                DescribeAffectedEntitiesForOrganizationResult result = null;

                try {
                    result = executeDescribeAffectedEntitiesForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityAggregatesResult> describeEntityAggregatesAsync(DescribeEntityAggregatesRequest request) {

        return describeEntityAggregatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEntityAggregatesResult> describeEntityAggregatesAsync(final DescribeEntityAggregatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEntityAggregatesRequest, DescribeEntityAggregatesResult> asyncHandler) {
        final DescribeEntityAggregatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEntityAggregatesResult>() {
            @Override
            public DescribeEntityAggregatesResult call() throws Exception {
                DescribeEntityAggregatesResult result = null;

                try {
                    result = executeDescribeEntityAggregates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventAggregatesResult> describeEventAggregatesAsync(DescribeEventAggregatesRequest request) {

        return describeEventAggregatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventAggregatesResult> describeEventAggregatesAsync(final DescribeEventAggregatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventAggregatesRequest, DescribeEventAggregatesResult> asyncHandler) {
        final DescribeEventAggregatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventAggregatesResult>() {
            @Override
            public DescribeEventAggregatesResult call() throws Exception {
                DescribeEventAggregatesResult result = null;

                try {
                    result = executeDescribeEventAggregates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsResult> describeEventDetailsAsync(DescribeEventDetailsRequest request) {

        return describeEventDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsResult> describeEventDetailsAsync(final DescribeEventDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventDetailsRequest, DescribeEventDetailsResult> asyncHandler) {
        final DescribeEventDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventDetailsResult>() {
            @Override
            public DescribeEventDetailsResult call() throws Exception {
                DescribeEventDetailsResult result = null;

                try {
                    result = executeDescribeEventDetails(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsForOrganizationResult> describeEventDetailsForOrganizationAsync(
            DescribeEventDetailsForOrganizationRequest request) {

        return describeEventDetailsForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventDetailsForOrganizationResult> describeEventDetailsForOrganizationAsync(
            final DescribeEventDetailsForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventDetailsForOrganizationRequest, DescribeEventDetailsForOrganizationResult> asyncHandler) {
        final DescribeEventDetailsForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventDetailsForOrganizationResult>() {
            @Override
            public DescribeEventDetailsForOrganizationResult call() throws Exception {
                DescribeEventDetailsForOrganizationResult result = null;

                try {
                    result = executeDescribeEventDetailsForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTypesResult> describeEventTypesAsync(DescribeEventTypesRequest request) {

        return describeEventTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTypesResult> describeEventTypesAsync(final DescribeEventTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventTypesRequest, DescribeEventTypesResult> asyncHandler) {
        final DescribeEventTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventTypesResult>() {
            @Override
            public DescribeEventTypesResult call() throws Exception {
                DescribeEventTypesResult result = null;

                try {
                    result = executeDescribeEventTypes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {
        final DescribeEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventsResult>() {
            @Override
            public DescribeEventsResult call() throws Exception {
                DescribeEventsResult result = null;

                try {
                    result = executeDescribeEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsForOrganizationResult> describeEventsForOrganizationAsync(DescribeEventsForOrganizationRequest request) {

        return describeEventsForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsForOrganizationResult> describeEventsForOrganizationAsync(
            final DescribeEventsForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventsForOrganizationRequest, DescribeEventsForOrganizationResult> asyncHandler) {
        final DescribeEventsForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventsForOrganizationResult>() {
            @Override
            public DescribeEventsForOrganizationResult call() throws Exception {
                DescribeEventsForOrganizationResult result = null;

                try {
                    result = executeDescribeEventsForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeHealthServiceStatusForOrganizationResult> describeHealthServiceStatusForOrganizationAsync(
            DescribeHealthServiceStatusForOrganizationRequest request) {

        return describeHealthServiceStatusForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHealthServiceStatusForOrganizationResult> describeHealthServiceStatusForOrganizationAsync(
            final DescribeHealthServiceStatusForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHealthServiceStatusForOrganizationRequest, DescribeHealthServiceStatusForOrganizationResult> asyncHandler) {
        final DescribeHealthServiceStatusForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHealthServiceStatusForOrganizationResult>() {
            @Override
            public DescribeHealthServiceStatusForOrganizationResult call() throws Exception {
                DescribeHealthServiceStatusForOrganizationResult result = null;

                try {
                    result = executeDescribeHealthServiceStatusForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableHealthServiceAccessForOrganizationResult> disableHealthServiceAccessForOrganizationAsync(
            DisableHealthServiceAccessForOrganizationRequest request) {

        return disableHealthServiceAccessForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableHealthServiceAccessForOrganizationResult> disableHealthServiceAccessForOrganizationAsync(
            final DisableHealthServiceAccessForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableHealthServiceAccessForOrganizationRequest, DisableHealthServiceAccessForOrganizationResult> asyncHandler) {
        final DisableHealthServiceAccessForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableHealthServiceAccessForOrganizationResult>() {
            @Override
            public DisableHealthServiceAccessForOrganizationResult call() throws Exception {
                DisableHealthServiceAccessForOrganizationResult result = null;

                try {
                    result = executeDisableHealthServiceAccessForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableHealthServiceAccessForOrganizationResult> enableHealthServiceAccessForOrganizationAsync(
            EnableHealthServiceAccessForOrganizationRequest request) {

        return enableHealthServiceAccessForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableHealthServiceAccessForOrganizationResult> enableHealthServiceAccessForOrganizationAsync(
            final EnableHealthServiceAccessForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableHealthServiceAccessForOrganizationRequest, EnableHealthServiceAccessForOrganizationResult> asyncHandler) {
        final EnableHealthServiceAccessForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableHealthServiceAccessForOrganizationResult>() {
            @Override
            public EnableHealthServiceAccessForOrganizationResult call() throws Exception {
                EnableHealthServiceAccessForOrganizationResult result = null;

                try {
                    result = executeEnableHealthServiceAccessForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
