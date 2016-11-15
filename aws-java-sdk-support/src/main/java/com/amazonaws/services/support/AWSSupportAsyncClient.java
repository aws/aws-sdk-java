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
package com.amazonaws.services.support;

import com.amazonaws.services.support.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing AWS Support asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Support</fullname>
 * <p>
 * The AWS Support API reference is intended for programmers who need detailed information about the AWS Support
 * operations and data types. This service enables you to manage your AWS Support cases programmatically. It uses HTTP
 * methods that return results in JSON format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of <a href="http://aws.amazon.com/premiumsupport/trustedadvisor/">Trusted
 * Advisor</a> features. You can retrieve a list of checks and their descriptions, get check results, specify checks to
 * refresh, and get the refresh status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Service names, issue categories, and available severity levels. </b>The <a>DescribeServices</a> and
 * <a>DescribeSeverityLevels</a> operations return AWS service names, service codes, service categories, and problem
 * severity levels. You use these values when you call the <a>CreateCase</a> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Case creation, case details, and case resolution.</b> The <a>CreateCase</a>, <a>DescribeCases</a>,
 * <a>DescribeAttachment</a>, and <a>ResolveCase</a> operations create AWS Support cases, retrieve information about
 * cases, and resolve cases.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Case communication.</b> The <a>DescribeCommunications</a>, <a>AddCommunicationToCase</a>, and
 * <a>AddAttachmentsToSet</a> operations retrieve and add communications and attachments to AWS Support cases.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following list describes the operations available from the AWS Support service for Trusted Advisor:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorChecks</a> returns the list of checks that run against your AWS resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * Using the <code>checkId</code> for a specific check returned by <a>DescribeTrustedAdvisorChecks</a>, you can call
 * <a>DescribeTrustedAdvisorCheckResult</a> to obtain the results for the check you specified.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckSummaries</a> returns summarized results for one or more Trusted Advisor checks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RefreshTrustedAdvisorCheck</a> requests that Trusted Advisor rerun a specified check.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> reports the refresh status of one or more checks.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * See <a href="http://docs.aws.amazon.com/awssupport/latest/user/Welcome.html">About the AWS Support API</a> in the
 * <i>AWS Support User Guide</i> for information about how to use this service to create and manage your support cases,
 * and how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
@ThreadSafe
public class AWSSupportAsyncClient extends AWSSupportClient implements AWSSupportAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support. A credentials provider chain will
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
    public AWSSupportAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to AWS Support (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSupportAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSupportAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSSupportAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSSupportAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSupportAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the provided AWS account
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
    public AWSSupportAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSSupportAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSSupportAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Support using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSupportAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(AddAttachmentsToSetRequest request) {

        return addAttachmentsToSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(final AddAttachmentsToSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddAttachmentsToSetRequest, AddAttachmentsToSetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddAttachmentsToSetResult>() {
            @Override
            public AddAttachmentsToSetResult call() throws Exception {
                AddAttachmentsToSetResult result;

                try {
                    result = addAttachmentsToSet(request);
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
    public java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(AddCommunicationToCaseRequest request) {

        return addCommunicationToCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(final AddCommunicationToCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddCommunicationToCaseRequest, AddCommunicationToCaseResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddCommunicationToCaseResult>() {
            @Override
            public AddCommunicationToCaseResult call() throws Exception {
                AddCommunicationToCaseResult result;

                try {
                    result = addCommunicationToCase(request);
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
    public java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest request) {

        return createCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCaseResult> createCaseAsync(final CreateCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateCaseResult>() {
            @Override
            public CreateCaseResult call() throws Exception {
                CreateCaseResult result;

                try {
                    result = createCase(request);
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
    public java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(DescribeAttachmentRequest request) {

        return describeAttachmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(final DescribeAttachmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAttachmentRequest, DescribeAttachmentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAttachmentResult>() {
            @Override
            public DescribeAttachmentResult call() throws Exception {
                DescribeAttachmentResult result;

                try {
                    result = describeAttachment(request);
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
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(DescribeCasesRequest request) {

        return describeCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(final DescribeCasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeCasesResult>() {
            @Override
            public DescribeCasesResult call() throws Exception {
                DescribeCasesResult result;

                try {
                    result = describeCases(request);
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
     * Simplified method form for invoking the DescribeCases operation.
     *
     * @see #describeCasesAsync(DescribeCasesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync() {

        return describeCasesAsync(new DescribeCasesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCases operation with an AsyncHandler.
     *
     * @see #describeCasesAsync(DescribeCasesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler) {

        return describeCasesAsync(new DescribeCasesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(DescribeCommunicationsRequest request) {

        return describeCommunicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(final DescribeCommunicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCommunicationsRequest, DescribeCommunicationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeCommunicationsResult>() {
            @Override
            public DescribeCommunicationsResult call() throws Exception {
                DescribeCommunicationsResult result;

                try {
                    result = describeCommunications(request);
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
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request) {

        return describeServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(final DescribeServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeServicesResult>() {
            @Override
            public DescribeServicesResult call() throws Exception {
                DescribeServicesResult result;

                try {
                    result = describeServices(request);
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
     * Simplified method form for invoking the DescribeServices operation.
     *
     * @see #describeServicesAsync(DescribeServicesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync() {

        return describeServicesAsync(new DescribeServicesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeServices operation with an AsyncHandler.
     *
     * @see #describeServicesAsync(DescribeServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {

        return describeServicesAsync(new DescribeServicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(DescribeSeverityLevelsRequest request) {

        return describeSeverityLevelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(final DescribeSeverityLevelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSeverityLevelsResult>() {
            @Override
            public DescribeSeverityLevelsResult call() throws Exception {
                DescribeSeverityLevelsResult result;

                try {
                    result = describeSeverityLevels(request);
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
     * Simplified method form for invoking the DescribeSeverityLevels operation.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync() {

        return describeSeverityLevelsAsync(new DescribeSeverityLevelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation with an AsyncHandler.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler) {

        return describeSeverityLevelsAsync(new DescribeSeverityLevelsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest request) {

        return describeTrustedAdvisorCheckRefreshStatusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            final DescribeTrustedAdvisorCheckRefreshStatusesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckRefreshStatusesRequest, DescribeTrustedAdvisorCheckRefreshStatusesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrustedAdvisorCheckRefreshStatusesResult>() {
            @Override
            public DescribeTrustedAdvisorCheckRefreshStatusesResult call() throws Exception {
                DescribeTrustedAdvisorCheckRefreshStatusesResult result;

                try {
                    result = describeTrustedAdvisorCheckRefreshStatuses(request);
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
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            DescribeTrustedAdvisorCheckResultRequest request) {

        return describeTrustedAdvisorCheckResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            final DescribeTrustedAdvisorCheckResultRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckResultRequest, DescribeTrustedAdvisorCheckResultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrustedAdvisorCheckResultResult>() {
            @Override
            public DescribeTrustedAdvisorCheckResultResult call() throws Exception {
                DescribeTrustedAdvisorCheckResultResult result;

                try {
                    result = describeTrustedAdvisorCheckResult(request);
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
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            DescribeTrustedAdvisorCheckSummariesRequest request) {

        return describeTrustedAdvisorCheckSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            final DescribeTrustedAdvisorCheckSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckSummariesRequest, DescribeTrustedAdvisorCheckSummariesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrustedAdvisorCheckSummariesResult>() {
            @Override
            public DescribeTrustedAdvisorCheckSummariesResult call() throws Exception {
                DescribeTrustedAdvisorCheckSummariesResult result;

                try {
                    result = describeTrustedAdvisorCheckSummaries(request);
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
    public java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(DescribeTrustedAdvisorChecksRequest request) {

        return describeTrustedAdvisorChecksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(final DescribeTrustedAdvisorChecksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorChecksRequest, DescribeTrustedAdvisorChecksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrustedAdvisorChecksResult>() {
            @Override
            public DescribeTrustedAdvisorChecksResult call() throws Exception {
                DescribeTrustedAdvisorChecksResult result;

                try {
                    result = describeTrustedAdvisorChecks(request);
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
    public java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(RefreshTrustedAdvisorCheckRequest request) {

        return refreshTrustedAdvisorCheckAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(final RefreshTrustedAdvisorCheckRequest request,
            final com.amazonaws.handlers.AsyncHandler<RefreshTrustedAdvisorCheckRequest, RefreshTrustedAdvisorCheckResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RefreshTrustedAdvisorCheckResult>() {
            @Override
            public RefreshTrustedAdvisorCheckResult call() throws Exception {
                RefreshTrustedAdvisorCheckResult result;

                try {
                    result = refreshTrustedAdvisorCheck(request);
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
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(ResolveCaseRequest request) {

        return resolveCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(final ResolveCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResolveCaseResult>() {
            @Override
            public ResolveCaseResult call() throws Exception {
                ResolveCaseResult result;

                try {
                    result = resolveCase(request);
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
     * Simplified method form for invoking the ResolveCase operation.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest)
     */
    @Override
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync() {

        return resolveCaseAsync(new ResolveCaseRequest());
    }

    /**
     * Simplified method form for invoking the ResolveCase operation with an AsyncHandler.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(
            com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler) {

        return resolveCaseAsync(new ResolveCaseRequest(), asyncHandler);
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
