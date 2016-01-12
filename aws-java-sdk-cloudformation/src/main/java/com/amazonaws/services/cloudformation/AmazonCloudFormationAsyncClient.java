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
package com.amazonaws.services.cloudformation;

import com.amazonaws.services.cloudformation.model.*;

/**
 * Interface for accessing AWS CloudFormation asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation enables you to create and manage AWS infrastructure
 * deployments predictably and repeatedly. AWS CloudFormation helps you leverage
 * AWS products such as Amazon EC2, EBS, Amazon SNS, ELB, and Auto Scaling to
 * build highly-reliable, highly scalable, cost effective applications without
 * worrying about creating and configuring the underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies
 * in a template file. The template defines a collection of resources as a
 * single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the
 * resources for you.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/cloudformation/">CloudFormation Product Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional
 * technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/"
 * >http://aws.amazon.com/documentation/</a>.
 * </p>
 */
public class AmazonCloudFormationAsyncClient extends AmazonCloudFormationClient
        implements AmazonCloudFormationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation. A credentials provider chain will be used that searches
     * for credentials in this order:
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
    public AmazonCloudFormationAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     *        connects to AWS CloudFormation (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCloudFormationAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation using the specified AWS account credentials.
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
    public AmazonCloudFormationAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCloudFormationAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation using the specified AWS account credentials, executor
     * service, and client configuration options.
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
    public AmazonCloudFormationAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation using the specified AWS account credentials provider.
     * Default client settings will be used.
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
    public AmazonCloudFormationAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation using the provided AWS account credentials provider and
     * client configuration options.
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
    public AmazonCloudFormationAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCloudFormationAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * CloudFormation using the specified AWS account credentials provider,
     * executor service, and client configuration options.
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
    public AmazonCloudFormationAsyncClient(
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
    public java.util.concurrent.Future<Void> cancelUpdateStackAsync(
            CancelUpdateStackRequest request) {

        return cancelUpdateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> cancelUpdateStackAsync(
            final CancelUpdateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelUpdateStackRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            cancelUpdateStack(request);
                            result = null;
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
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest request) {

        return createStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStackResult> createStackAsync(
            final CreateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateStackResult>() {
                    @Override
                    public CreateStackResult call() throws Exception {
                        CreateStackResult result;

                        try {
                            result = createStack(request);
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
    public java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest request) {

        return deleteStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStackAsync(
            final DeleteStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteStack(request);
                            result = null;
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
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest request) {

        return describeAccountLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            final DescribeAccountLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAccountLimitsResult>() {
                    @Override
                    public DescribeAccountLimitsResult call() throws Exception {
                        DescribeAccountLimitsResult result;

                        try {
                            result = describeAccountLimits(request);
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
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(
            DescribeStackEventsRequest request) {

        return describeStackEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(
            final DescribeStackEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStackEventsResult>() {
                    @Override
                    public DescribeStackEventsResult call() throws Exception {
                        DescribeStackEventsResult result;

                        try {
                            result = describeStackEvents(request);
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
    public java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(
            DescribeStackResourceRequest request) {

        return describeStackResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(
            final DescribeStackResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackResourceRequest, DescribeStackResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStackResourceResult>() {
                    @Override
                    public DescribeStackResourceResult call() throws Exception {
                        DescribeStackResourceResult result;

                        try {
                            result = describeStackResource(request);
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
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(
            DescribeStackResourcesRequest request) {

        return describeStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(
            final DescribeStackResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStackResourcesResult>() {
                    @Override
                    public DescribeStackResourcesResult call() throws Exception {
                        DescribeStackResourcesResult result;

                        try {
                            result = describeStackResources(request);
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
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest request) {

        return describeStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            final DescribeStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStacksResult>() {
                    @Override
                    public DescribeStacksResult call() throws Exception {
                        DescribeStacksResult result;

                        try {
                            result = describeStacks(request);
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
     * Simplified method form for invoking the DescribeStacks operation.
     *
     * @see #describeStacksAsync(DescribeStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync() {

        return describeStacksAsync(new DescribeStacksRequest());
    }

    /**
     * Simplified method form for invoking the DescribeStacks operation with an
     * AsyncHandler.
     *
     * @see #describeStacksAsync(DescribeStacksRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler) {

        return describeStacksAsync(new DescribeStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            EstimateTemplateCostRequest request) {

        return estimateTemplateCostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            final EstimateTemplateCostRequest request,
            final com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<EstimateTemplateCostResult>() {
                    @Override
                    public EstimateTemplateCostResult call() throws Exception {
                        EstimateTemplateCostResult result;

                        try {
                            result = estimateTemplateCost(request);
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
     * Simplified method form for invoking the EstimateTemplateCost operation.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest)
     */
    @Override
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync() {

        return estimateTemplateCostAsync(new EstimateTemplateCostRequest());
    }

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation
     * with an AsyncHandler.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler) {

        return estimateTemplateCostAsync(new EstimateTemplateCostRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(
            GetStackPolicyRequest request) {

        return getStackPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(
            final GetStackPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStackPolicyRequest, GetStackPolicyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetStackPolicyResult>() {
                    @Override
                    public GetStackPolicyResult call() throws Exception {
                        GetStackPolicyResult result;

                        try {
                            result = getStackPolicy(request);
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
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(
            GetTemplateRequest request) {

        return getTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(
            final GetTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetTemplateResult>() {
                    @Override
                    public GetTemplateResult call() throws Exception {
                        GetTemplateResult result;

                        try {
                            result = getTemplate(request);
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
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            GetTemplateSummaryRequest request) {

        return getTemplateSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            final GetTemplateSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetTemplateSummaryResult>() {
                    @Override
                    public GetTemplateSummaryResult call() throws Exception {
                        GetTemplateSummaryResult result;

                        try {
                            result = getTemplateSummary(request);
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
     * Simplified method form for invoking the GetTemplateSummary operation.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest)
     */
    @Override
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync() {

        return getTemplateSummaryAsync(new GetTemplateSummaryRequest());
    }

    /**
     * Simplified method form for invoking the GetTemplateSummary operation with
     * an AsyncHandler.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler) {

        return getTemplateSummaryAsync(new GetTemplateSummaryRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(
            ListStackResourcesRequest request) {

        return listStackResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(
            final ListStackResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListStackResourcesResult>() {
                    @Override
                    public ListStackResourcesResult call() throws Exception {
                        ListStackResourcesResult result;

                        try {
                            result = listStackResources(request);
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
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(
            ListStacksRequest request) {

        return listStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(
            final ListStacksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListStacksResult>() {
                    @Override
                    public ListStacksResult call() throws Exception {
                        ListStacksResult result;

                        try {
                            result = listStacks(request);
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
     * Simplified method form for invoking the ListStacks operation.
     *
     * @see #listStacksAsync(ListStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync() {

        return listStacksAsync(new ListStacksRequest());
    }

    /**
     * Simplified method form for invoking the ListStacks operation with an
     * AsyncHandler.
     *
     * @see #listStacksAsync(ListStacksRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListStacksResult> listStacksAsync(
            com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler) {

        return listStacksAsync(new ListStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> setStackPolicyAsync(
            SetStackPolicyRequest request) {

        return setStackPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setStackPolicyAsync(
            final SetStackPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetStackPolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setStackPolicy(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> signalResourceAsync(
            SignalResourceRequest request) {

        return signalResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> signalResourceAsync(
            final SignalResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<SignalResourceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            signalResource(request);
                            result = null;
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
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(
            UpdateStackRequest request) {

        return updateStackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStackResult> updateStackAsync(
            final UpdateStackRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateStackResult>() {
                    @Override
                    public UpdateStackResult call() throws Exception {
                        UpdateStackResult result;

                        try {
                            result = updateStack(request);
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
    public java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(
            ValidateTemplateRequest request) {

        return validateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(
            final ValidateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateTemplateRequest, ValidateTemplateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ValidateTemplateResult>() {
                    @Override
                    public ValidateTemplateResult call() throws Exception {
                        ValidateTemplateResult result;

                        try {
                            result = validateTemplate(request);
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
