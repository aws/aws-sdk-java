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
package com.amazonaws.services.inspector;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Inspector asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"> Amazon Inspector User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonInspectorAsyncClient extends AmazonInspectorClient implements AmazonInspectorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonInspectorAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonInspectorAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the provided AWS account
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
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonInspectorAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonInspectorAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonInspectorAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonInspectorAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonInspectorAsyncClientBuilder asyncBuilder() {
        return AmazonInspectorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonInspectorAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(AddAttributesToFindingsRequest request) {

        return addAttributesToFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(final AddAttributesToFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddAttributesToFindingsRequest, AddAttributesToFindingsResult> asyncHandler) {
        final AddAttributesToFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddAttributesToFindingsResult>() {
            @Override
            public AddAttributesToFindingsResult call() throws Exception {
                AddAttributesToFindingsResult result = null;

                try {
                    result = executeAddAttributesToFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTargetResult> createAssessmentTargetAsync(CreateAssessmentTargetRequest request) {

        return createAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTargetResult> createAssessmentTargetAsync(final CreateAssessmentTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentTargetRequest, CreateAssessmentTargetResult> asyncHandler) {
        final CreateAssessmentTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssessmentTargetResult>() {
            @Override
            public CreateAssessmentTargetResult call() throws Exception {
                CreateAssessmentTargetResult result = null;

                try {
                    result = executeCreateAssessmentTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTemplateResult> createAssessmentTemplateAsync(CreateAssessmentTemplateRequest request) {

        return createAssessmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTemplateResult> createAssessmentTemplateAsync(final CreateAssessmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentTemplateRequest, CreateAssessmentTemplateResult> asyncHandler) {
        final CreateAssessmentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssessmentTemplateResult>() {
            @Override
            public CreateAssessmentTemplateResult call() throws Exception {
                CreateAssessmentTemplateResult result = null;

                try {
                    result = executeCreateAssessmentTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateExclusionsPreviewResult> createExclusionsPreviewAsync(CreateExclusionsPreviewRequest request) {

        return createExclusionsPreviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExclusionsPreviewResult> createExclusionsPreviewAsync(final CreateExclusionsPreviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExclusionsPreviewRequest, CreateExclusionsPreviewResult> asyncHandler) {
        final CreateExclusionsPreviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExclusionsPreviewResult>() {
            @Override
            public CreateExclusionsPreviewResult call() throws Exception {
                CreateExclusionsPreviewResult result = null;

                try {
                    result = executeCreateExclusionsPreview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(CreateResourceGroupRequest request) {

        return createResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(final CreateResourceGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceGroupRequest, CreateResourceGroupResult> asyncHandler) {
        final CreateResourceGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceGroupResult>() {
            @Override
            public CreateResourceGroupResult call() throws Exception {
                CreateResourceGroupResult result = null;

                try {
                    result = executeCreateResourceGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentRunResult> deleteAssessmentRunAsync(DeleteAssessmentRunRequest request) {

        return deleteAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentRunResult> deleteAssessmentRunAsync(final DeleteAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRunRequest, DeleteAssessmentRunResult> asyncHandler) {
        final DeleteAssessmentRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentRunResult>() {
            @Override
            public DeleteAssessmentRunResult call() throws Exception {
                DeleteAssessmentRunResult result = null;

                try {
                    result = executeDeleteAssessmentRun(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentTargetResult> deleteAssessmentTargetAsync(DeleteAssessmentTargetRequest request) {

        return deleteAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentTargetResult> deleteAssessmentTargetAsync(final DeleteAssessmentTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentTargetRequest, DeleteAssessmentTargetResult> asyncHandler) {
        final DeleteAssessmentTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentTargetResult>() {
            @Override
            public DeleteAssessmentTargetResult call() throws Exception {
                DeleteAssessmentTargetResult result = null;

                try {
                    result = executeDeleteAssessmentTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentTemplateResult> deleteAssessmentTemplateAsync(DeleteAssessmentTemplateRequest request) {

        return deleteAssessmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentTemplateResult> deleteAssessmentTemplateAsync(final DeleteAssessmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentTemplateRequest, DeleteAssessmentTemplateResult> asyncHandler) {
        final DeleteAssessmentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentTemplateResult>() {
            @Override
            public DeleteAssessmentTemplateResult call() throws Exception {
                DeleteAssessmentTemplateResult result = null;

                try {
                    result = executeDeleteAssessmentTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentRunsResult> describeAssessmentRunsAsync(DescribeAssessmentRunsRequest request) {

        return describeAssessmentRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentRunsResult> describeAssessmentRunsAsync(final DescribeAssessmentRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssessmentRunsRequest, DescribeAssessmentRunsResult> asyncHandler) {
        final DescribeAssessmentRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssessmentRunsResult>() {
            @Override
            public DescribeAssessmentRunsResult call() throws Exception {
                DescribeAssessmentRunsResult result = null;

                try {
                    result = executeDescribeAssessmentRuns(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTargetsResult> describeAssessmentTargetsAsync(DescribeAssessmentTargetsRequest request) {

        return describeAssessmentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTargetsResult> describeAssessmentTargetsAsync(final DescribeAssessmentTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssessmentTargetsRequest, DescribeAssessmentTargetsResult> asyncHandler) {
        final DescribeAssessmentTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssessmentTargetsResult>() {
            @Override
            public DescribeAssessmentTargetsResult call() throws Exception {
                DescribeAssessmentTargetsResult result = null;

                try {
                    result = executeDescribeAssessmentTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTemplatesResult> describeAssessmentTemplatesAsync(DescribeAssessmentTemplatesRequest request) {

        return describeAssessmentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTemplatesResult> describeAssessmentTemplatesAsync(final DescribeAssessmentTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssessmentTemplatesRequest, DescribeAssessmentTemplatesResult> asyncHandler) {
        final DescribeAssessmentTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssessmentTemplatesResult>() {
            @Override
            public DescribeAssessmentTemplatesResult call() throws Exception {
                DescribeAssessmentTemplatesResult result = null;

                try {
                    result = executeDescribeAssessmentTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(DescribeCrossAccountAccessRoleRequest request) {

        return describeCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            final DescribeCrossAccountAccessRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCrossAccountAccessRoleRequest, DescribeCrossAccountAccessRoleResult> asyncHandler) {
        final DescribeCrossAccountAccessRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCrossAccountAccessRoleResult>() {
            @Override
            public DescribeCrossAccountAccessRoleResult call() throws Exception {
                DescribeCrossAccountAccessRoleResult result = null;

                try {
                    result = executeDescribeCrossAccountAccessRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeExclusionsResult> describeExclusionsAsync(DescribeExclusionsRequest request) {

        return describeExclusionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExclusionsResult> describeExclusionsAsync(final DescribeExclusionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExclusionsRequest, DescribeExclusionsResult> asyncHandler) {
        final DescribeExclusionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExclusionsResult>() {
            @Override
            public DescribeExclusionsResult call() throws Exception {
                DescribeExclusionsResult result = null;

                try {
                    result = executeDescribeExclusions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingsResult> describeFindingsAsync(DescribeFindingsRequest request) {

        return describeFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingsResult> describeFindingsAsync(final DescribeFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFindingsRequest, DescribeFindingsResult> asyncHandler) {
        final DescribeFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFindingsResult>() {
            @Override
            public DescribeFindingsResult call() throws Exception {
                DescribeFindingsResult result = null;

                try {
                    result = executeDescribeFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupsResult> describeResourceGroupsAsync(DescribeResourceGroupsRequest request) {

        return describeResourceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupsResult> describeResourceGroupsAsync(final DescribeResourceGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceGroupsRequest, DescribeResourceGroupsResult> asyncHandler) {
        final DescribeResourceGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourceGroupsResult>() {
            @Override
            public DescribeResourceGroupsResult call() throws Exception {
                DescribeResourceGroupsResult result = null;

                try {
                    result = executeDescribeResourceGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackagesResult> describeRulesPackagesAsync(DescribeRulesPackagesRequest request) {

        return describeRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackagesResult> describeRulesPackagesAsync(final DescribeRulesPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRulesPackagesRequest, DescribeRulesPackagesResult> asyncHandler) {
        final DescribeRulesPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRulesPackagesResult>() {
            @Override
            public DescribeRulesPackagesResult call() throws Exception {
                DescribeRulesPackagesResult result = null;

                try {
                    result = executeDescribeRulesPackages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentReportResult> getAssessmentReportAsync(GetAssessmentReportRequest request) {

        return getAssessmentReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentReportResult> getAssessmentReportAsync(final GetAssessmentReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssessmentReportRequest, GetAssessmentReportResult> asyncHandler) {
        final GetAssessmentReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssessmentReportResult>() {
            @Override
            public GetAssessmentReportResult call() throws Exception {
                GetAssessmentReportResult result = null;

                try {
                    result = executeGetAssessmentReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetExclusionsPreviewResult> getExclusionsPreviewAsync(GetExclusionsPreviewRequest request) {

        return getExclusionsPreviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExclusionsPreviewResult> getExclusionsPreviewAsync(final GetExclusionsPreviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExclusionsPreviewRequest, GetExclusionsPreviewResult> asyncHandler) {
        final GetExclusionsPreviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExclusionsPreviewResult>() {
            @Override
            public GetExclusionsPreviewResult call() throws Exception {
                GetExclusionsPreviewResult result = null;

                try {
                    result = executeGetExclusionsPreview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTelemetryMetadataResult> getTelemetryMetadataAsync(GetTelemetryMetadataRequest request) {

        return getTelemetryMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTelemetryMetadataResult> getTelemetryMetadataAsync(final GetTelemetryMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTelemetryMetadataRequest, GetTelemetryMetadataResult> asyncHandler) {
        final GetTelemetryMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTelemetryMetadataResult>() {
            @Override
            public GetTelemetryMetadataResult call() throws Exception {
                GetTelemetryMetadataResult result = null;

                try {
                    result = executeGetTelemetryMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunAgentsResult> listAssessmentRunAgentsAsync(ListAssessmentRunAgentsRequest request) {

        return listAssessmentRunAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunAgentsResult> listAssessmentRunAgentsAsync(final ListAssessmentRunAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentRunAgentsRequest, ListAssessmentRunAgentsResult> asyncHandler) {
        final ListAssessmentRunAgentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentRunAgentsResult>() {
            @Override
            public ListAssessmentRunAgentsResult call() throws Exception {
                ListAssessmentRunAgentsResult result = null;

                try {
                    result = executeListAssessmentRunAgents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunsResult> listAssessmentRunsAsync(ListAssessmentRunsRequest request) {

        return listAssessmentRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunsResult> listAssessmentRunsAsync(final ListAssessmentRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentRunsRequest, ListAssessmentRunsResult> asyncHandler) {
        final ListAssessmentRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentRunsResult>() {
            @Override
            public ListAssessmentRunsResult call() throws Exception {
                ListAssessmentRunsResult result = null;

                try {
                    result = executeListAssessmentRuns(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTargetsResult> listAssessmentTargetsAsync(ListAssessmentTargetsRequest request) {

        return listAssessmentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTargetsResult> listAssessmentTargetsAsync(final ListAssessmentTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentTargetsRequest, ListAssessmentTargetsResult> asyncHandler) {
        final ListAssessmentTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentTargetsResult>() {
            @Override
            public ListAssessmentTargetsResult call() throws Exception {
                ListAssessmentTargetsResult result = null;

                try {
                    result = executeListAssessmentTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTemplatesResult> listAssessmentTemplatesAsync(ListAssessmentTemplatesRequest request) {

        return listAssessmentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTemplatesResult> listAssessmentTemplatesAsync(final ListAssessmentTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentTemplatesRequest, ListAssessmentTemplatesResult> asyncHandler) {
        final ListAssessmentTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentTemplatesResult>() {
            @Override
            public ListAssessmentTemplatesResult call() throws Exception {
                ListAssessmentTemplatesResult result = null;

                try {
                    result = executeListAssessmentTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEventSubscriptionsResult> listEventSubscriptionsAsync(ListEventSubscriptionsRequest request) {

        return listEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSubscriptionsResult> listEventSubscriptionsAsync(final ListEventSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventSubscriptionsRequest, ListEventSubscriptionsResult> asyncHandler) {
        final ListEventSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventSubscriptionsResult>() {
            @Override
            public ListEventSubscriptionsResult call() throws Exception {
                ListEventSubscriptionsResult result = null;

                try {
                    result = executeListEventSubscriptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListExclusionsResult> listExclusionsAsync(ListExclusionsRequest request) {

        return listExclusionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExclusionsResult> listExclusionsAsync(final ListExclusionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExclusionsRequest, ListExclusionsResult> asyncHandler) {
        final ListExclusionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExclusionsResult>() {
            @Override
            public ListExclusionsResult call() throws Exception {
                ListExclusionsResult result = null;

                try {
                    result = executeListExclusions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(final ListFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {
        final ListFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingsResult>() {
            @Override
            public ListFindingsResult call() throws Exception {
                ListFindingsResult result = null;

                try {
                    result = executeListFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(ListRulesPackagesRequest request) {

        return listRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(final ListRulesPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesPackagesRequest, ListRulesPackagesResult> asyncHandler) {
        final ListRulesPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRulesPackagesResult>() {
            @Override
            public ListRulesPackagesResult call() throws Exception {
                ListRulesPackagesResult result = null;

                try {
                    result = executeListRulesPackages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PreviewAgentsResult> previewAgentsAsync(PreviewAgentsRequest request) {

        return previewAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PreviewAgentsResult> previewAgentsAsync(final PreviewAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PreviewAgentsRequest, PreviewAgentsResult> asyncHandler) {
        final PreviewAgentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PreviewAgentsResult>() {
            @Override
            public PreviewAgentsResult call() throws Exception {
                PreviewAgentsResult result = null;

                try {
                    result = executePreviewAgents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(RegisterCrossAccountAccessRoleRequest request) {

        return registerCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(
            final RegisterCrossAccountAccessRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterCrossAccountAccessRoleRequest, RegisterCrossAccountAccessRoleResult> asyncHandler) {
        final RegisterCrossAccountAccessRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterCrossAccountAccessRoleResult>() {
            @Override
            public RegisterCrossAccountAccessRoleResult call() throws Exception {
                RegisterCrossAccountAccessRoleResult result = null;

                try {
                    result = executeRegisterCrossAccountAccessRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(RemoveAttributesFromFindingsRequest request) {

        return removeAttributesFromFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(final RemoveAttributesFromFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAttributesFromFindingsRequest, RemoveAttributesFromFindingsResult> asyncHandler) {
        final RemoveAttributesFromFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveAttributesFromFindingsResult>() {
            @Override
            public RemoveAttributesFromFindingsResult call() throws Exception {
                RemoveAttributesFromFindingsResult result = null;

                try {
                    result = executeRemoveAttributesFromFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(SetTagsForResourceRequest request) {

        return setTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(final SetTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTagsForResourceRequest, SetTagsForResourceResult> asyncHandler) {
        final SetTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetTagsForResourceResult>() {
            @Override
            public SetTagsForResourceResult call() throws Exception {
                SetTagsForResourceResult result = null;

                try {
                    result = executeSetTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartAssessmentRunResult> startAssessmentRunAsync(StartAssessmentRunRequest request) {

        return startAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAssessmentRunResult> startAssessmentRunAsync(final StartAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAssessmentRunRequest, StartAssessmentRunResult> asyncHandler) {
        final StartAssessmentRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAssessmentRunResult>() {
            @Override
            public StartAssessmentRunResult call() throws Exception {
                StartAssessmentRunResult result = null;

                try {
                    result = executeStartAssessmentRun(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopAssessmentRunResult> stopAssessmentRunAsync(StopAssessmentRunRequest request) {

        return stopAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAssessmentRunResult> stopAssessmentRunAsync(final StopAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAssessmentRunRequest, StopAssessmentRunResult> asyncHandler) {
        final StopAssessmentRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAssessmentRunResult>() {
            @Override
            public StopAssessmentRunResult call() throws Exception {
                StopAssessmentRunResult result = null;

                try {
                    result = executeStopAssessmentRun(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SubscribeToEventResult> subscribeToEventAsync(SubscribeToEventRequest request) {

        return subscribeToEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeToEventResult> subscribeToEventAsync(final SubscribeToEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubscribeToEventRequest, SubscribeToEventResult> asyncHandler) {
        final SubscribeToEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubscribeToEventResult>() {
            @Override
            public SubscribeToEventResult call() throws Exception {
                SubscribeToEventResult result = null;

                try {
                    result = executeSubscribeToEvent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeFromEventResult> unsubscribeFromEventAsync(UnsubscribeFromEventRequest request) {

        return unsubscribeFromEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeFromEventResult> unsubscribeFromEventAsync(final UnsubscribeFromEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnsubscribeFromEventRequest, UnsubscribeFromEventResult> asyncHandler) {
        final UnsubscribeFromEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnsubscribeFromEventResult>() {
            @Override
            public UnsubscribeFromEventResult call() throws Exception {
                UnsubscribeFromEventResult result = null;

                try {
                    result = executeUnsubscribeFromEvent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentTargetResult> updateAssessmentTargetAsync(UpdateAssessmentTargetRequest request) {

        return updateAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentTargetResult> updateAssessmentTargetAsync(final UpdateAssessmentTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentTargetRequest, UpdateAssessmentTargetResult> asyncHandler) {
        final UpdateAssessmentTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssessmentTargetResult>() {
            @Override
            public UpdateAssessmentTargetResult call() throws Exception {
                UpdateAssessmentTargetResult result = null;

                try {
                    result = executeUpdateAssessmentTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
