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
 * The AWS Health API provides programmatic access to the AWS Health information that is presented in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">AWS Personal Health Dashboard</a>. You can get information about events
 * that affect your AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEvents</a>: Summary information about events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventDetails</a>: Detailed information about one or more events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedEntities</a>: Information about AWS resources that are affected by one or more events.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In addition, these operations provide information about event types and summary counts of events or affected
 * entities:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEventTypes</a>: Information about the kinds of events that AWS Health tracks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventAggregates</a>: A count of the number of events that meet specified criteria.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEntityAggregates</a>: A count of the number of affected entities that meet specified criteria.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Health API requires a Business or Enterprise support plan from <a
 * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>. Calling the Health API from an account that does not
 * have a Business or Enterprise support plan causes a <code>SubscriptionRequiredException</code>.
 * </p>
 * <p>
 * For authentication of requests, AWS Health uses the <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * See the <a href="http://docs.aws.amazon.com/health/latest/ug/what-is-aws-health.html">AWS Health User Guide</a> for
 * information about how to use the API.
 * </p>
 * <p>
 * <b>Service Endpoint</b>
 * </p>
 * <p>
 * The HTTP endpoint for the AWS Health API is:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://health.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
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
