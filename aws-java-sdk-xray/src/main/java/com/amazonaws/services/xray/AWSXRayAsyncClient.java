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
package com.amazonaws.services.xray;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS X-Ray asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AWS X-Ray provides APIs for managing debug traces and retrieving service maps and other data created by processing
 * those traces.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSXRayAsyncClient extends AWSXRayClient implements AWSXRayAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray. A credentials provider chain will be
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
     * @deprecated use {@link AWSXRayAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSXRayAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray. A credentials provider chain will be
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
     *        The client configuration options controlling how this client connects to AWS X-Ray (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSXRayAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSXRayAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSXRayAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSXRayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSXRayAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSXRayAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the provided AWS account
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
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSXRayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSXRayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSXRayAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSXRayAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSXRayAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSXRayAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSXRayAsyncClientBuilder asyncBuilder() {
        return AWSXRayAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS X-Ray using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSXRayAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(BatchGetTracesRequest request) {

        return batchGetTracesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(final BatchGetTracesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetTracesRequest, BatchGetTracesResult> asyncHandler) {
        final BatchGetTracesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetTracesResult>() {
            @Override
            public BatchGetTracesResult call() throws Exception {
                BatchGetTracesResult result = null;

                try {
                    result = executeBatchGetTraces(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(final CreateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {
        final CreateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result = null;

                try {
                    result = executeCreateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSamplingRuleResult> createSamplingRuleAsync(CreateSamplingRuleRequest request) {

        return createSamplingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSamplingRuleResult> createSamplingRuleAsync(final CreateSamplingRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSamplingRuleRequest, CreateSamplingRuleResult> asyncHandler) {
        final CreateSamplingRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSamplingRuleResult>() {
            @Override
            public CreateSamplingRuleResult call() throws Exception {
                CreateSamplingRuleResult result = null;

                try {
                    result = executeCreateSamplingRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSamplingRuleResult> deleteSamplingRuleAsync(DeleteSamplingRuleRequest request) {

        return deleteSamplingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSamplingRuleResult> deleteSamplingRuleAsync(final DeleteSamplingRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSamplingRuleRequest, DeleteSamplingRuleResult> asyncHandler) {
        final DeleteSamplingRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSamplingRuleResult>() {
            @Override
            public DeleteSamplingRuleResult call() throws Exception {
                DeleteSamplingRuleResult result = null;

                try {
                    result = executeDeleteSamplingRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEncryptionConfigResult> getEncryptionConfigAsync(GetEncryptionConfigRequest request) {

        return getEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEncryptionConfigResult> getEncryptionConfigAsync(final GetEncryptionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEncryptionConfigRequest, GetEncryptionConfigResult> asyncHandler) {
        final GetEncryptionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEncryptionConfigResult>() {
            @Override
            public GetEncryptionConfigResult call() throws Exception {
                GetEncryptionConfigResult result = null;

                try {
                    result = executeGetEncryptionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(final GetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {
        final GetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupResult>() {
            @Override
            public GetGroupResult call() throws Exception {
                GetGroupResult result = null;

                try {
                    result = executeGetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupsResult> getGroupsAsync(GetGroupsRequest request) {

        return getGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupsResult> getGroupsAsync(final GetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupsRequest, GetGroupsResult> asyncHandler) {
        final GetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupsResult>() {
            @Override
            public GetGroupsResult call() throws Exception {
                GetGroupsResult result = null;

                try {
                    result = executeGetGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSamplingRulesResult> getSamplingRulesAsync(GetSamplingRulesRequest request) {

        return getSamplingRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSamplingRulesResult> getSamplingRulesAsync(final GetSamplingRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSamplingRulesRequest, GetSamplingRulesResult> asyncHandler) {
        final GetSamplingRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSamplingRulesResult>() {
            @Override
            public GetSamplingRulesResult call() throws Exception {
                GetSamplingRulesResult result = null;

                try {
                    result = executeGetSamplingRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSamplingStatisticSummariesResult> getSamplingStatisticSummariesAsync(GetSamplingStatisticSummariesRequest request) {

        return getSamplingStatisticSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSamplingStatisticSummariesResult> getSamplingStatisticSummariesAsync(
            final GetSamplingStatisticSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSamplingStatisticSummariesRequest, GetSamplingStatisticSummariesResult> asyncHandler) {
        final GetSamplingStatisticSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSamplingStatisticSummariesResult>() {
            @Override
            public GetSamplingStatisticSummariesResult call() throws Exception {
                GetSamplingStatisticSummariesResult result = null;

                try {
                    result = executeGetSamplingStatisticSummaries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSamplingTargetsResult> getSamplingTargetsAsync(GetSamplingTargetsRequest request) {

        return getSamplingTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSamplingTargetsResult> getSamplingTargetsAsync(final GetSamplingTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSamplingTargetsRequest, GetSamplingTargetsResult> asyncHandler) {
        final GetSamplingTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSamplingTargetsResult>() {
            @Override
            public GetSamplingTargetsResult call() throws Exception {
                GetSamplingTargetsResult result = null;

                try {
                    result = executeGetSamplingTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(GetServiceGraphRequest request) {

        return getServiceGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(final GetServiceGraphRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceGraphRequest, GetServiceGraphResult> asyncHandler) {
        final GetServiceGraphRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceGraphResult>() {
            @Override
            public GetServiceGraphResult call() throws Exception {
                GetServiceGraphResult result = null;

                try {
                    result = executeGetServiceGraph(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(GetTraceGraphRequest request) {

        return getTraceGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(final GetTraceGraphRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTraceGraphRequest, GetTraceGraphResult> asyncHandler) {
        final GetTraceGraphRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTraceGraphResult>() {
            @Override
            public GetTraceGraphResult call() throws Exception {
                GetTraceGraphResult result = null;

                try {
                    result = executeGetTraceGraph(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(GetTraceSummariesRequest request) {

        return getTraceSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(final GetTraceSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTraceSummariesRequest, GetTraceSummariesResult> asyncHandler) {
        final GetTraceSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTraceSummariesResult>() {
            @Override
            public GetTraceSummariesResult call() throws Exception {
                GetTraceSummariesResult result = null;

                try {
                    result = executeGetTraceSummaries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEncryptionConfigResult> putEncryptionConfigAsync(PutEncryptionConfigRequest request) {

        return putEncryptionConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEncryptionConfigResult> putEncryptionConfigAsync(final PutEncryptionConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEncryptionConfigRequest, PutEncryptionConfigResult> asyncHandler) {
        final PutEncryptionConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEncryptionConfigResult>() {
            @Override
            public PutEncryptionConfigResult call() throws Exception {
                PutEncryptionConfigResult result = null;

                try {
                    result = executePutEncryptionConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(PutTelemetryRecordsRequest request) {

        return putTelemetryRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(final PutTelemetryRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutTelemetryRecordsRequest, PutTelemetryRecordsResult> asyncHandler) {
        final PutTelemetryRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutTelemetryRecordsResult>() {
            @Override
            public PutTelemetryRecordsResult call() throws Exception {
                PutTelemetryRecordsResult result = null;

                try {
                    result = executePutTelemetryRecords(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(PutTraceSegmentsRequest request) {

        return putTraceSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(final PutTraceSegmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutTraceSegmentsRequest, PutTraceSegmentsResult> asyncHandler) {
        final PutTraceSegmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutTraceSegmentsResult>() {
            @Override
            public PutTraceSegmentsResult call() throws Exception {
                PutTraceSegmentsResult result = null;

                try {
                    result = executePutTraceSegments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(final UpdateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {
        final UpdateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupResult>() {
            @Override
            public UpdateGroupResult call() throws Exception {
                UpdateGroupResult result = null;

                try {
                    result = executeUpdateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSamplingRuleResult> updateSamplingRuleAsync(UpdateSamplingRuleRequest request) {

        return updateSamplingRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSamplingRuleResult> updateSamplingRuleAsync(final UpdateSamplingRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSamplingRuleRequest, UpdateSamplingRuleResult> asyncHandler) {
        final UpdateSamplingRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSamplingRuleResult>() {
            @Override
            public UpdateSamplingRuleResult call() throws Exception {
                UpdateSamplingRuleResult result = null;

                try {
                    result = executeUpdateSamplingRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
