/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.inspector;

import com.amazonaws.services.inspector.model.*;

/**
 * Interface for accessing Amazon Inspector asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of the applications you
 * run in AWS and to identify potential security issues. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"
 * > Amazon Inspector User Guide</a>.
 * </p>
 */
public class AmazonInspectorAsyncClient extends AmazonInspectorClient implements
        AmazonInspectorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonInspectorAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Inspector (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector using the specified AWS account credentials, executor service,
     * and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector using the specified AWS account credentials provider. Default
     * client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector using the provided AWS account credentials provider and client
     * configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Inspector using the specified AWS account credentials provider, executor
     * service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonInspectorAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(
            AddAttributesToFindingsRequest request) {

        return addAttributesToFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(
            final AddAttributesToFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddAttributesToFindingsRequest, AddAttributesToFindingsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AddAttributesToFindingsResult>() {
                    @Override
                    public AddAttributesToFindingsResult call()
                            throws Exception {
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
    public java.util.concurrent.Future<AttachAssessmentAndRulesPackageResult> attachAssessmentAndRulesPackageAsync(
            AttachAssessmentAndRulesPackageRequest request) {

        return attachAssessmentAndRulesPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachAssessmentAndRulesPackageResult> attachAssessmentAndRulesPackageAsync(
            final AttachAssessmentAndRulesPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachAssessmentAndRulesPackageRequest, AttachAssessmentAndRulesPackageResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AttachAssessmentAndRulesPackageResult>() {
                    @Override
                    public AttachAssessmentAndRulesPackageResult call()
                            throws Exception {
                        AttachAssessmentAndRulesPackageResult result;

                        try {
                            result = attachAssessmentAndRulesPackage(request);
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
                    @Override
                    public CreateApplicationResult call() throws Exception {
                        CreateApplicationResult result;

                        try {
                            result = createApplication(request);
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
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(
            CreateAssessmentRequest request) {

        return createAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(
            final CreateAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentRequest, CreateAssessmentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateAssessmentResult>() {
                    @Override
                    public CreateAssessmentResult call() throws Exception {
                        CreateAssessmentResult result;

                        try {
                            result = createAssessment(request);
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
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(
            CreateResourceGroupRequest request) {

        return createResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(
            final CreateResourceGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceGroupRequest, CreateResourceGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateResourceGroupResult>() {
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(
            DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(
            final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
                    @Override
                    public DeleteApplicationResult call() throws Exception {
                        DeleteApplicationResult result;

                        try {
                            result = deleteApplication(request);
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
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(
            DeleteAssessmentRequest request) {

        return deleteAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(
            final DeleteAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRequest, DeleteAssessmentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteAssessmentResult>() {
                    @Override
                    public DeleteAssessmentResult call() throws Exception {
                        DeleteAssessmentResult result;

                        try {
                            result = deleteAssessment(request);
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
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(
            DeleteRunRequest request) {

        return deleteRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(
            final DeleteRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteRunResult>() {
                    @Override
                    public DeleteRunResult call() throws Exception {
                        DeleteRunResult result;

                        try {
                            result = deleteRun(request);
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
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(
            DescribeApplicationRequest request) {

        return describeApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(
            final DescribeApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeApplicationResult>() {
                    @Override
                    public DescribeApplicationResult call() throws Exception {
                        DescribeApplicationResult result;

                        try {
                            result = describeApplication(request);
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
    public java.util.concurrent.Future<DescribeAssessmentResult> describeAssessmentAsync(
            DescribeAssessmentRequest request) {

        return describeAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentResult> describeAssessmentAsync(
            final DescribeAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssessmentRequest, DescribeAssessmentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAssessmentResult>() {
                    @Override
                    public DescribeAssessmentResult call() throws Exception {
                        DescribeAssessmentResult result;

                        try {
                            result = describeAssessment(request);
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
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            DescribeCrossAccountAccessRoleRequest request) {

        return describeCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            final DescribeCrossAccountAccessRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCrossAccountAccessRoleRequest, DescribeCrossAccountAccessRoleResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeCrossAccountAccessRoleResult>() {
                    @Override
                    public DescribeCrossAccountAccessRoleResult call()
                            throws Exception {
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
    public java.util.concurrent.Future<DescribeFindingResult> describeFindingAsync(
            DescribeFindingRequest request) {

        return describeFindingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingResult> describeFindingAsync(
            final DescribeFindingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFindingRequest, DescribeFindingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeFindingResult>() {
                    @Override
                    public DescribeFindingResult call() throws Exception {
                        DescribeFindingResult result;

                        try {
                            result = describeFinding(request);
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
    public java.util.concurrent.Future<DescribeResourceGroupResult> describeResourceGroupAsync(
            DescribeResourceGroupRequest request) {

        return describeResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupResult> describeResourceGroupAsync(
            final DescribeResourceGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourceGroupRequest, DescribeResourceGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeResourceGroupResult>() {
                    @Override
                    public DescribeResourceGroupResult call() throws Exception {
                        DescribeResourceGroupResult result;

                        try {
                            result = describeResourceGroup(request);
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
    public java.util.concurrent.Future<DescribeRulesPackageResult> describeRulesPackageAsync(
            DescribeRulesPackageRequest request) {

        return describeRulesPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackageResult> describeRulesPackageAsync(
            final DescribeRulesPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRulesPackageRequest, DescribeRulesPackageResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeRulesPackageResult>() {
                    @Override
                    public DescribeRulesPackageResult call() throws Exception {
                        DescribeRulesPackageResult result;

                        try {
                            result = describeRulesPackage(request);
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
    public java.util.concurrent.Future<DescribeRunResult> describeRunAsync(
            DescribeRunRequest request) {

        return describeRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRunResult> describeRunAsync(
            final DescribeRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRunRequest, DescribeRunResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeRunResult>() {
                    @Override
                    public DescribeRunResult call() throws Exception {
                        DescribeRunResult result;

                        try {
                            result = describeRun(request);
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
    public java.util.concurrent.Future<DetachAssessmentAndRulesPackageResult> detachAssessmentAndRulesPackageAsync(
            DetachAssessmentAndRulesPackageRequest request) {

        return detachAssessmentAndRulesPackageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachAssessmentAndRulesPackageResult> detachAssessmentAndRulesPackageAsync(
            final DetachAssessmentAndRulesPackageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachAssessmentAndRulesPackageRequest, DetachAssessmentAndRulesPackageResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DetachAssessmentAndRulesPackageResult>() {
                    @Override
                    public DetachAssessmentAndRulesPackageResult call()
                            throws Exception {
                        DetachAssessmentAndRulesPackageResult result;

                        try {
                            result = detachAssessmentAndRulesPackage(request);
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
    public java.util.concurrent.Future<GetAssessmentTelemetryResult> getAssessmentTelemetryAsync(
            GetAssessmentTelemetryRequest request) {

        return getAssessmentTelemetryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentTelemetryResult> getAssessmentTelemetryAsync(
            final GetAssessmentTelemetryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssessmentTelemetryRequest, GetAssessmentTelemetryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetAssessmentTelemetryResult>() {
                    @Override
                    public GetAssessmentTelemetryResult call() throws Exception {
                        GetAssessmentTelemetryResult result;

                        try {
                            result = getAssessmentTelemetry(request);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
                    @Override
                    public ListApplicationsResult call() throws Exception {
                        ListApplicationsResult result;

                        try {
                            result = listApplications(request);
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
    public java.util.concurrent.Future<ListAssessmentAgentsResult> listAssessmentAgentsAsync(
            ListAssessmentAgentsRequest request) {

        return listAssessmentAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentAgentsResult> listAssessmentAgentsAsync(
            final ListAssessmentAgentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentAgentsRequest, ListAssessmentAgentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListAssessmentAgentsResult>() {
                    @Override
                    public ListAssessmentAgentsResult call() throws Exception {
                        ListAssessmentAgentsResult result;

                        try {
                            result = listAssessmentAgents(request);
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
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(
            ListAssessmentsRequest request) {

        return listAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(
            final ListAssessmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentsRequest, ListAssessmentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListAssessmentsResult>() {
                    @Override
                    public ListAssessmentsResult call() throws Exception {
                        ListAssessmentsResult result;

                        try {
                            result = listAssessments(request);
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
    public java.util.concurrent.Future<ListAttachedAssessmentsResult> listAttachedAssessmentsAsync(
            ListAttachedAssessmentsRequest request) {

        return listAttachedAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedAssessmentsResult> listAttachedAssessmentsAsync(
            final ListAttachedAssessmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedAssessmentsRequest, ListAttachedAssessmentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListAttachedAssessmentsResult>() {
                    @Override
                    public ListAttachedAssessmentsResult call()
                            throws Exception {
                        ListAttachedAssessmentsResult result;

                        try {
                            result = listAttachedAssessments(request);
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
    public java.util.concurrent.Future<ListAttachedRulesPackagesResult> listAttachedRulesPackagesAsync(
            ListAttachedRulesPackagesRequest request) {

        return listAttachedRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRulesPackagesResult> listAttachedRulesPackagesAsync(
            final ListAttachedRulesPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedRulesPackagesRequest, ListAttachedRulesPackagesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListAttachedRulesPackagesResult>() {
                    @Override
                    public ListAttachedRulesPackagesResult call()
                            throws Exception {
                        ListAttachedRulesPackagesResult result;

                        try {
                            result = listAttachedRulesPackages(request);
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
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(
            ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(
            final ListFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListFindingsResult>() {
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
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(
            ListRulesPackagesRequest request) {

        return listRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(
            final ListRulesPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesPackagesRequest, ListRulesPackagesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListRulesPackagesResult>() {
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
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            ListRunsRequest request) {

        return listRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResult> listRunsAsync(
            final ListRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListRunsResult>() {
                    @Override
                    public ListRunsResult call() throws Exception {
                        ListRunsResult result;

                        try {
                            result = listRuns(request);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
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
    public java.util.concurrent.Future<LocalizeTextResult> localizeTextAsync(
            LocalizeTextRequest request) {

        return localizeTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LocalizeTextResult> localizeTextAsync(
            final LocalizeTextRequest request,
            final com.amazonaws.handlers.AsyncHandler<LocalizeTextRequest, LocalizeTextResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<LocalizeTextResult>() {
                    @Override
                    public LocalizeTextResult call() throws Exception {
                        LocalizeTextResult result;

                        try {
                            result = localizeText(request);
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
    public java.util.concurrent.Future<PreviewAgentsForResourceGroupResult> previewAgentsForResourceGroupAsync(
            PreviewAgentsForResourceGroupRequest request) {

        return previewAgentsForResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PreviewAgentsForResourceGroupResult> previewAgentsForResourceGroupAsync(
            final PreviewAgentsForResourceGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<PreviewAgentsForResourceGroupRequest, PreviewAgentsForResourceGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PreviewAgentsForResourceGroupResult>() {
                    @Override
                    public PreviewAgentsForResourceGroupResult call()
                            throws Exception {
                        PreviewAgentsForResourceGroupResult result;

                        try {
                            result = previewAgentsForResourceGroup(request);
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
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(
            RegisterCrossAccountAccessRoleRequest request) {

        return registerCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterCrossAccountAccessRoleResult> registerCrossAccountAccessRoleAsync(
            final RegisterCrossAccountAccessRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterCrossAccountAccessRoleRequest, RegisterCrossAccountAccessRoleResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RegisterCrossAccountAccessRoleResult>() {
                    @Override
                    public RegisterCrossAccountAccessRoleResult call()
                            throws Exception {
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
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(
            RemoveAttributesFromFindingsRequest request) {

        return removeAttributesFromFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(
            final RemoveAttributesFromFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAttributesFromFindingsRequest, RemoveAttributesFromFindingsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RemoveAttributesFromFindingsResult>() {
                    @Override
                    public RemoveAttributesFromFindingsResult call()
                            throws Exception {
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
    public java.util.concurrent.Future<RunAssessmentResult> runAssessmentAsync(
            RunAssessmentRequest request) {

        return runAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunAssessmentResult> runAssessmentAsync(
            final RunAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunAssessmentRequest, RunAssessmentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<RunAssessmentResult>() {
                    @Override
                    public RunAssessmentResult call() throws Exception {
                        RunAssessmentResult result;

                        try {
                            result = runAssessment(request);
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
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(
            SetTagsForResourceRequest request) {

        return setTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTagsForResourceResult> setTagsForResourceAsync(
            final SetTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTagsForResourceRequest, SetTagsForResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<SetTagsForResourceResult>() {
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
    public java.util.concurrent.Future<StartDataCollectionResult> startDataCollectionAsync(
            StartDataCollectionRequest request) {

        return startDataCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDataCollectionResult> startDataCollectionAsync(
            final StartDataCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDataCollectionRequest, StartDataCollectionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<StartDataCollectionResult>() {
                    @Override
                    public StartDataCollectionResult call() throws Exception {
                        StartDataCollectionResult result;

                        try {
                            result = startDataCollection(request);
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
    public java.util.concurrent.Future<StopDataCollectionResult> stopDataCollectionAsync(
            StopDataCollectionRequest request) {

        return stopDataCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDataCollectionResult> stopDataCollectionAsync(
            final StopDataCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDataCollectionRequest, StopDataCollectionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<StopDataCollectionResult>() {
                    @Override
                    public StopDataCollectionResult call() throws Exception {
                        StopDataCollectionResult result;

                        try {
                            result = stopDataCollection(request);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
                    @Override
                    public UpdateApplicationResult call() throws Exception {
                        UpdateApplicationResult result;

                        try {
                            result = updateApplication(request);
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
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(
            UpdateAssessmentRequest request) {

        return updateAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(
            final UpdateAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentRequest, UpdateAssessmentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateAssessmentResult>() {
                    @Override
                    public UpdateAssessmentResult call() throws Exception {
                        UpdateAssessmentResult result;

                        try {
                            result = updateAssessment(request);
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
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
