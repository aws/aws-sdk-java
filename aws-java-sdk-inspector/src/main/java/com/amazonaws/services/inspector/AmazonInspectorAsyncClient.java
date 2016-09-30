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
package com.amazonaws.services.inspector;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon Inspector asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
 * For more information, see <a
 * href="http://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"> Amazon Inspector User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
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
     */
    public AmazonInspectorAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AmazonInspectorAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AmazonInspectorAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonInspectorAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonInspectorAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonInspectorAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AmazonInspectorAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Inspector using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonInspectorAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonInspectorAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(AddAttributesToFindingsRequest request) {

        return addAttributesToFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(final AddAttributesToFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddAttributesToFindingsRequest, AddAttributesToFindingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddAttributesToFindingsResult>() {
            @Override
            public AddAttributesToFindingsResult call() throws Exception {
                AddAttributesToFindingsResult result;

                try {
                    result = addAttributesToFindings(request);
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
    public java.util.concurrent.Future<CreateAssessmentTargetResult> createAssessmentTargetAsync(CreateAssessmentTargetRequest request) {

        return createAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTargetResult> createAssessmentTargetAsync(final CreateAssessmentTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentTargetRequest, CreateAssessmentTargetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAssessmentTargetResult>() {
            @Override
            public CreateAssessmentTargetResult call() throws Exception {
                CreateAssessmentTargetResult result;

                try {
                    result = createAssessmentTarget(request);
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
    public java.util.concurrent.Future<CreateAssessmentTemplateResult> createAssessmentTemplateAsync(CreateAssessmentTemplateRequest request) {

        return createAssessmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTemplateResult> createAssessmentTemplateAsync(final CreateAssessmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentTemplateRequest, CreateAssessmentTemplateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAssessmentTemplateResult>() {
            @Override
            public CreateAssessmentTemplateResult call() throws Exception {
                CreateAssessmentTemplateResult result;

                try {
                    result = createAssessmentTemplate(request);
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
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(CreateResourceGroupRequest request) {

        return createResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(final CreateResourceGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceGroupRequest, CreateResourceGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceGroupResult>() {
            @Override
            public CreateResourceGroupResult call() throws Exception {
                CreateResourceGroupResult result;

                try {
                    result = createResourceGroup(request);
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
    public java.util.concurrent.Future<DeleteAssessmentRunResult> deleteAssessmentRunAsync(DeleteAssessmentRunRequest request) {

        return deleteAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentRunResult> deleteAssessmentRunAsync(final DeleteAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRunRequest, DeleteAssessmentRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentRunResult>() {
            @Override
            public DeleteAssessmentRunResult call() throws Exception {
                DeleteAssessmentRunResult result;

                try {
                    result = deleteAssessmentRun(request);
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
    public java.util.concurrent.Future<DeleteAssessmentTargetResult> deleteAssessmentTargetAsync(DeleteAssessmentTargetRequest request) {

        return deleteAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentTargetResult> deleteAssessmentTargetAsync(final DeleteAssessmentTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentTargetRequest, DeleteAssessmentTargetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentTargetResult>() {
            @Override
            public DeleteAssessmentTargetResult call() throws Exception {
                DeleteAssessmentTargetResult result;

                try {
                    result = deleteAssessmentTarget(request);
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
    public java.util.concurrent.Future<DeleteAssessmentTemplateResult> deleteAssessmentTemplateAsync(DeleteAssessmentTemplateRequest request) {

        return deleteAssessmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentTemplateResult> deleteAssessmentTemplateAsync(final DeleteAssessmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentTemplateRequest, DeleteAssessmentTemplateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentTemplateResult>() {
            @Override
            public DeleteAssessmentTemplateResult call() throws Exception {
                DeleteAssessmentTemplateResult result;

                try {
                    result = deleteAssessmentTemplate(request);
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
    public java.util.concurrent.Future<DescribeAssessmentRunsResult> describeAssessmentRunsAsync(DescribeAssessmentRunsRequest request) {

        return describeAssessmentRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentRunsResult> describeAssessmentRunsAsync(final DescribeAssessmentRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssessmentRunsRequest, DescribeAssessmentRunsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssessmentRunsResult>() {
            @Override
            public DescribeAssessmentRunsResult call() throws Exception {
                DescribeAssessmentRunsResult result;

                try {
                    result = describeAssessmentRuns(request);
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
    public java.util.concurrent.Future<DescribeAssessmentTargetsResult> describeAssessmentTargetsAsync(DescribeAssessmentTargetsRequest request) {

        return describeAssessmentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTargetsResult> describeAssessmentTargetsAsync(final DescribeAssessmentTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssessmentTargetsRequest, DescribeAssessmentTargetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssessmentTargetsResult>() {
            @Override
            public DescribeAssessmentTargetsResult call() throws Exception {
                DescribeAssessmentTargetsResult result;

                try {
                    result = describeAssessmentTargets(request);
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
    public java.util.concurrent.Future<DescribeAssessmentTemplatesResult> describeAssessmentTemplatesAsync(DescribeAssessmentTemplatesRequest request) {

        return describeAssessmentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTemplatesResult> describeAssessmentTemplatesAsync(final DescribeAssessmentTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssessmentTemplatesRequest, DescribeAssessmentTemplatesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssessmentTemplatesResult>() {
            @Override
            public DescribeAssessmentTemplatesResult call() throws Exception {
                DescribeAssessmentTemplatesResult result;

                try {
                    result = describeAssessmentTemplates(request);
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
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(DescribeCrossAccountAccessRoleRequest request) {

        return describeCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            final DescribeCrossAccountAccessRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCrossAccountAccessRoleRequest, DescribeCrossAccountAccessRoleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeCrossAccountAccessRoleResult>() {
            @Override
            public DescribeCrossAccountAccessRoleResult call() throws Exception {
                DescribeCrossAccountAccessRoleResult result;

                try {
                    result = describeCrossAccountAccessRole(request);
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
    public java.util.concurrent.Future<DescribeFindingsResult> describeFindingsAsync(DescribeFindingsRequest request) {

        return describeFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingsResult> describeFindingsAsync(final DescribeFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFindingsRequest, DescribeFindingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeFindingsResult>() {
            @Override
            public DescribeFindingsResult call() throws Exception {
                DescribeFindingsResult result;

                try {
                    result = describeFindings(request);
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
    public java.util.concurrent.Future<DescribeResourceGroupsResult> describeResourceGroupsAsync(DescribeResourceGroupsRequest request) {

        return describeResourceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupsResult> describeResourceGroupsAsync(final DescribeResourceGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceGroupsRequest, DescribeResourceGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourceGroupsResult>() {
            @Override
            public DescribeResourceGroupsResult call() throws Exception {
                DescribeResourceGroupsResult result;

                try {
                    result = describeResourceGroups(request);
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
    public java.util.concurrent.Future<DescribeRulesPackagesResult> describeRulesPackagesAsync(DescribeRulesPackagesRequest request) {

        return describeRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackagesResult> describeRulesPackagesAsync(final DescribeRulesPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRulesPackagesRequest, DescribeRulesPackagesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeRulesPackagesResult>() {
            @Override
            public DescribeRulesPackagesResult call() throws Exception {
                DescribeRulesPackagesResult result;

                try {
                    result = describeRulesPackages(request);
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
    public java.util.concurrent.Future<GetTelemetryMetadataResult> getTelemetryMetadataAsync(GetTelemetryMetadataRequest request) {

        return getTelemetryMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTelemetryMetadataResult> getTelemetryMetadataAsync(final GetTelemetryMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTelemetryMetadataRequest, GetTelemetryMetadataResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetTelemetryMetadataResult>() {
            @Override
            public GetTelemetryMetadataResult call() throws Exception {
                GetTelemetryMetadataResult result;

                try {
                    result = getTelemetryMetadata(request);
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
    public java.util.concurrent.Future<ListAssessmentRunAgentsResult> listAssessmentRunAgentsAsync(ListAssessmentRunAgentsRequest request) {

        return listAssessmentRunAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunAgentsResult> listAssessmentRunAgentsAsync(final ListAssessmentRunAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentRunAgentsRequest, ListAssessmentRunAgentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentRunAgentsResult>() {
            @Override
            public ListAssessmentRunAgentsResult call() throws Exception {
                ListAssessmentRunAgentsResult result;

                try {
                    result = listAssessmentRunAgents(request);
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
    public java.util.concurrent.Future<ListAssessmentRunsResult> listAssessmentRunsAsync(ListAssessmentRunsRequest request) {

        return listAssessmentRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunsResult> listAssessmentRunsAsync(final ListAssessmentRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentRunsRequest, ListAssessmentRunsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentRunsResult>() {
            @Override
            public ListAssessmentRunsResult call() throws Exception {
                ListAssessmentRunsResult result;

                try {
                    result = listAssessmentRuns(request);
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
    public java.util.concurrent.Future<ListAssessmentTargetsResult> listAssessmentTargetsAsync(ListAssessmentTargetsRequest request) {

        return listAssessmentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTargetsResult> listAssessmentTargetsAsync(final ListAssessmentTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentTargetsRequest, ListAssessmentTargetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentTargetsResult>() {
            @Override
            public ListAssessmentTargetsResult call() throws Exception {
                ListAssessmentTargetsResult result;

                try {
                    result = listAssessmentTargets(request);
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
    public java.util.concurrent.Future<ListAssessmentTemplatesResult> listAssessmentTemplatesAsync(ListAssessmentTemplatesRequest request) {

        return listAssessmentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTemplatesResult> listAssessmentTemplatesAsync(final ListAssessmentTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentTemplatesRequest, ListAssessmentTemplatesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentTemplatesResult>() {
            @Override
            public ListAssessmentTemplatesResult call() throws Exception {
                ListAssessmentTemplatesResult result;

                try {
                    result = listAssessmentTemplates(request);
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
    public java.util.concurrent.Future<ListEventSubscriptionsResult> listEventSubscriptionsAsync(ListEventSubscriptionsRequest request) {

        return listEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSubscriptionsResult> listEventSubscriptionsAsync(final ListEventSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventSubscriptionsRequest, ListEventSubscriptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListEventSubscriptionsResult>() {
            @Override
            public ListEventSubscriptionsResult call() throws Exception {
                ListEventSubscriptionsResult result;

                try {
                    result = listEventSubscriptions(request);
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
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(final ListFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListFindingsResult>() {
            @Override
            public ListFindingsResult call() throws Exception {
                ListFindingsResult result;

                try {
                    result = listFindings(request);
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
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(ListRulesPackagesRequest request) {

        return listRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(final ListRulesPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesPackagesRequest, ListRulesPackagesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListRulesPackagesResult>() {
            @Override
            public ListRulesPackagesResult call() throws Exception {
                ListRulesPackagesResult result;

                try {
                    result = listRulesPackages(request);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result;

                try {
                    result = listTagsForResource(request);
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
    public java.util.concurrent.Future<PreviewAgentsResult> previewAgentsAsync(PreviewAgentsRequest request) {

        return previewAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PreviewAgentsResult> previewAgentsAsync(final PreviewAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PreviewAgentsRequest, PreviewAgentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PreviewAgentsResult>() {
            @Override
            public PreviewAgentsResult call() throws Exception {
                PreviewAgentsResult result;

                try {
                    result = previewAgents(request);
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
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(RegisterCrossAccountAccessRoleRequest request) {

        return registerCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(
            final RegisterCrossAccountAccessRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterCrossAccountAccessRoleRequest, RegisterCrossAccountAccessRoleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RegisterCrossAccountAccessRoleResult>() {
            @Override
            public RegisterCrossAccountAccessRoleResult call() throws Exception {
                RegisterCrossAccountAccessRoleResult result;

                try {
                    result = registerCrossAccountAccessRole(request);
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
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(RemoveAttributesFromFindingsRequest request) {

        return removeAttributesFromFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(final RemoveAttributesFromFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAttributesFromFindingsRequest, RemoveAttributesFromFindingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveAttributesFromFindingsResult>() {
            @Override
            public RemoveAttributesFromFindingsResult call() throws Exception {
                RemoveAttributesFromFindingsResult result;

                try {
                    result = removeAttributesFromFindings(request);
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
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(SetTagsForResourceRequest request) {

        return setTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(final SetTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTagsForResourceRequest, SetTagsForResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SetTagsForResourceResult>() {
            @Override
            public SetTagsForResourceResult call() throws Exception {
                SetTagsForResourceResult result;

                try {
                    result = setTagsForResource(request);
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
    public java.util.concurrent.Future<StartAssessmentRunResult> startAssessmentRunAsync(StartAssessmentRunRequest request) {

        return startAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAssessmentRunResult> startAssessmentRunAsync(final StartAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAssessmentRunRequest, StartAssessmentRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartAssessmentRunResult>() {
            @Override
            public StartAssessmentRunResult call() throws Exception {
                StartAssessmentRunResult result;

                try {
                    result = startAssessmentRun(request);
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
    public java.util.concurrent.Future<StopAssessmentRunResult> stopAssessmentRunAsync(StopAssessmentRunRequest request) {

        return stopAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAssessmentRunResult> stopAssessmentRunAsync(final StopAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAssessmentRunRequest, StopAssessmentRunResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopAssessmentRunResult>() {
            @Override
            public StopAssessmentRunResult call() throws Exception {
                StopAssessmentRunResult result;

                try {
                    result = stopAssessmentRun(request);
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
    public java.util.concurrent.Future<SubscribeToEventResult> subscribeToEventAsync(SubscribeToEventRequest request) {

        return subscribeToEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeToEventResult> subscribeToEventAsync(final SubscribeToEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubscribeToEventRequest, SubscribeToEventResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SubscribeToEventResult>() {
            @Override
            public SubscribeToEventResult call() throws Exception {
                SubscribeToEventResult result;

                try {
                    result = subscribeToEvent(request);
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
    public java.util.concurrent.Future<UnsubscribeFromEventResult> unsubscribeFromEventAsync(UnsubscribeFromEventRequest request) {

        return unsubscribeFromEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeFromEventResult> unsubscribeFromEventAsync(final UnsubscribeFromEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnsubscribeFromEventRequest, UnsubscribeFromEventResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UnsubscribeFromEventResult>() {
            @Override
            public UnsubscribeFromEventResult call() throws Exception {
                UnsubscribeFromEventResult result;

                try {
                    result = unsubscribeFromEvent(request);
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
    public java.util.concurrent.Future<UpdateAssessmentTargetResult> updateAssessmentTargetAsync(UpdateAssessmentTargetRequest request) {

        return updateAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentTargetResult> updateAssessmentTargetAsync(final UpdateAssessmentTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentTargetRequest, UpdateAssessmentTargetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssessmentTargetResult>() {
            @Override
            public UpdateAssessmentTargetResult call() throws Exception {
                UpdateAssessmentTargetResult result;

                try {
                    result = updateAssessmentTarget(request);
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
