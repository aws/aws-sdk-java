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
package com.amazonaws.services.config;

import com.amazonaws.services.config.model.*;

/**
 * Interface for accessing Config Service asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Config</fullname>
 * <p>
 * AWS Config provides a way to keep track of the configurations of all the AWS
 * resources associated with your AWS account. You can use AWS Config to get the
 * current and historical configurations of each AWS resource and also to get
 * information about the relationship between the resources. An AWS resource can
 * be an Amazon Compute Cloud (Amazon EC2) instance, an Elastic Block Store
 * (EBS) volume, an Elastic network Interface (ENI), or a security group. For a
 * complete list of resources currently supported by AWS Config, see <a href=
 * "http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported AWS Resources</a>.
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management Console, the
 * AWS Command Line Interface (AWS CLI), the AWS Config API, or the AWS SDKs for
 * AWS Config
 * </p>
 * <p>
 * This reference guide contains documentation for the AWS Config API and the
 * AWS CLI commands that you can use to manage AWS Config.
 * </p>
 * <p>
 * The AWS Config API uses the Signature Version 4 protocol for signing
 * requests. For more information about how to sign a request with this
 * protocol, see <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * For detailed information about AWS Config features and their associated
 * actions or commands, as well as how to work with AWS Management Console, see
 * <a href=
 * "http://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html"
 * >What Is AWS Config?</a> in the <i>AWS Config Developer Guide</i>.
 * </p>
 */
public class AmazonConfigAsyncClient extends AmazonConfigClient implements
        AmazonConfigAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service. A credentials provider chain will be used that searches for
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
    public AmazonConfigAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service. A credentials provider chain will be used that searches for
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
     *        connects to Config Service (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonConfigAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service using the specified AWS account credentials.
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
    public AmazonConfigAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service using the specified AWS account credentials and executor service.
     * Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonConfigAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service using the specified AWS account credentials, executor service,
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
    public AmazonConfigAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service using the specified AWS account credentials provider. Default
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
    public AmazonConfigAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service using the provided AWS account credentials provider and client
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
    public AmazonConfigAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonConfigAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Config
     * Service using the specified AWS account credentials provider, executor
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
    public AmazonConfigAsyncClient(
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
    public java.util.concurrent.Future<Void> deleteConfigRuleAsync(
            DeleteConfigRuleRequest request) {

        return deleteConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteConfigRuleAsync(
            final DeleteConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigRuleRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteConfigRule(request);
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
    public java.util.concurrent.Future<Void> deleteDeliveryChannelAsync(
            DeleteDeliveryChannelRequest request) {

        return deleteDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeliveryChannelAsync(
            final DeleteDeliveryChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeliveryChannelRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteDeliveryChannel(request);
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
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(
            DeliverConfigSnapshotRequest request) {

        return deliverConfigSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(
            final DeliverConfigSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeliverConfigSnapshotResult>() {
                    @Override
                    public DeliverConfigSnapshotResult call() throws Exception {
                        DeliverConfigSnapshotResult result;

                        try {
                            result = deliverConfigSnapshot(request);
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
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            DescribeComplianceByConfigRuleRequest request) {

        return describeComplianceByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            final DescribeComplianceByConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeComplianceByConfigRuleResult>() {
                    @Override
                    public DescribeComplianceByConfigRuleResult call()
                            throws Exception {
                        DescribeComplianceByConfigRuleResult result;

                        try {
                            result = describeComplianceByConfigRule(request);
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
     * Simplified method form for invoking the DescribeComplianceByConfigRule
     * operation.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync() {

        return describeComplianceByConfigRuleAsync(new DescribeComplianceByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule
     * operation with an AsyncHandler.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {

        return describeComplianceByConfigRuleAsync(
                new DescribeComplianceByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            DescribeComplianceByResourceRequest request) {

        return describeComplianceByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            final DescribeComplianceByResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeComplianceByResourceResult>() {
                    @Override
                    public DescribeComplianceByResourceResult call()
                            throws Exception {
                        DescribeComplianceByResourceResult result;

                        try {
                            result = describeComplianceByResource(request);
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
     * Simplified method form for invoking the DescribeComplianceByResource
     * operation.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync() {

        return describeComplianceByResourceAsync(new DescribeComplianceByResourceRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByResource
     * operation with an AsyncHandler.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {

        return describeComplianceByResourceAsync(
                new DescribeComplianceByResourceRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest request) {

        return describeConfigRuleEvaluationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            final DescribeConfigRuleEvaluationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeConfigRuleEvaluationStatusResult>() {
                    @Override
                    public DescribeConfigRuleEvaluationStatusResult call()
                            throws Exception {
                        DescribeConfigRuleEvaluationStatusResult result;

                        try {
                            result = describeConfigRuleEvaluationStatus(request);
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
     * Simplified method form for invoking the
     * DescribeConfigRuleEvaluationStatus operation.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync() {

        return describeConfigRuleEvaluationStatusAsync(new DescribeConfigRuleEvaluationStatusRequest());
    }

    /**
     * Simplified method form for invoking the
     * DescribeConfigRuleEvaluationStatus operation with an AsyncHandler.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {

        return describeConfigRuleEvaluationStatusAsync(
                new DescribeConfigRuleEvaluationStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            DescribeConfigRulesRequest request) {

        return describeConfigRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            final DescribeConfigRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeConfigRulesResult>() {
                    @Override
                    public DescribeConfigRulesResult call() throws Exception {
                        DescribeConfigRulesResult result;

                        try {
                            result = describeConfigRules(request);
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
     * Simplified method form for invoking the DescribeConfigRules operation.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync() {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigRules operation
     * with an AsyncHandler.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest request) {

        return describeConfigurationRecorderStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            final DescribeConfigurationRecorderStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeConfigurationRecorderStatusResult>() {
                    @Override
                    public DescribeConfigurationRecorderStatusResult call()
                            throws Exception {
                        DescribeConfigurationRecorderStatusResult result;

                        try {
                            result = describeConfigurationRecorderStatus(request);
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
     * Simplified method form for invoking the
     * DescribeConfigurationRecorderStatus operation.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync() {

        return describeConfigurationRecorderStatusAsync(new DescribeConfigurationRecorderStatusRequest());
    }

    /**
     * Simplified method form for invoking the
     * DescribeConfigurationRecorderStatus operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {

        return describeConfigurationRecorderStatusAsync(
                new DescribeConfigurationRecorderStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            DescribeConfigurationRecordersRequest request) {

        return describeConfigurationRecordersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            final DescribeConfigurationRecordersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeConfigurationRecordersResult>() {
                    @Override
                    public DescribeConfigurationRecordersResult call()
                            throws Exception {
                        DescribeConfigurationRecordersResult result;

                        try {
                            result = describeConfigurationRecorders(request);
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
     * Simplified method form for invoking the DescribeConfigurationRecorders
     * operation.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync() {

        return describeConfigurationRecordersAsync(new DescribeConfigurationRecordersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders
     * operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {

        return describeConfigurationRecordersAsync(
                new DescribeConfigurationRecordersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            DescribeDeliveryChannelStatusRequest request) {

        return describeDeliveryChannelStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            final DescribeDeliveryChannelStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeDeliveryChannelStatusResult>() {
                    @Override
                    public DescribeDeliveryChannelStatusResult call()
                            throws Exception {
                        DescribeDeliveryChannelStatusResult result;

                        try {
                            result = describeDeliveryChannelStatus(request);
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
     * Simplified method form for invoking the DescribeDeliveryChannelStatus
     * operation.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync() {

        return describeDeliveryChannelStatusAsync(new DescribeDeliveryChannelStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus
     * operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {

        return describeDeliveryChannelStatusAsync(
                new DescribeDeliveryChannelStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            DescribeDeliveryChannelsRequest request) {

        return describeDeliveryChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            final DescribeDeliveryChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeDeliveryChannelsResult>() {
                    @Override
                    public DescribeDeliveryChannelsResult call()
                            throws Exception {
                        DescribeDeliveryChannelsResult result;

                        try {
                            result = describeDeliveryChannels(request);
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
     * Simplified method form for invoking the DescribeDeliveryChannels
     * operation.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync() {

        return describeDeliveryChannelsAsync(new DescribeDeliveryChannelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels
     * operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {

        return describeDeliveryChannelsAsync(
                new DescribeDeliveryChannelsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest request) {

        return getComplianceDetailsByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            final GetComplianceDetailsByConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByConfigRuleRequest, GetComplianceDetailsByConfigRuleResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetComplianceDetailsByConfigRuleResult>() {
                    @Override
                    public GetComplianceDetailsByConfigRuleResult call()
                            throws Exception {
                        GetComplianceDetailsByConfigRuleResult result;

                        try {
                            result = getComplianceDetailsByConfigRule(request);
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
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            GetComplianceDetailsByResourceRequest request) {

        return getComplianceDetailsByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            final GetComplianceDetailsByResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByResourceRequest, GetComplianceDetailsByResourceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetComplianceDetailsByResourceResult>() {
                    @Override
                    public GetComplianceDetailsByResourceResult call()
                            throws Exception {
                        GetComplianceDetailsByResourceResult result;

                        try {
                            result = getComplianceDetailsByResource(request);
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
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest request) {

        return getComplianceSummaryByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            final GetComplianceSummaryByConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetComplianceSummaryByConfigRuleResult>() {
                    @Override
                    public GetComplianceSummaryByConfigRuleResult call()
                            throws Exception {
                        GetComplianceSummaryByConfigRuleResult result;

                        try {
                            result = getComplianceSummaryByConfigRule(request);
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
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule
     * operation.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync() {

        return getComplianceSummaryByConfigRuleAsync(new GetComplianceSummaryByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule
     * operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {

        return getComplianceSummaryByConfigRuleAsync(
                new GetComplianceSummaryByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest request) {

        return getComplianceSummaryByResourceTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            final GetComplianceSummaryByResourceTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetComplianceSummaryByResourceTypeResult>() {
                    @Override
                    public GetComplianceSummaryByResourceTypeResult call()
                            throws Exception {
                        GetComplianceSummaryByResourceTypeResult result;

                        try {
                            result = getComplianceSummaryByResourceType(request);
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
     * Simplified method form for invoking the
     * GetComplianceSummaryByResourceType operation.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync() {

        return getComplianceSummaryByResourceTypeAsync(new GetComplianceSummaryByResourceTypeRequest());
    }

    /**
     * Simplified method form for invoking the
     * GetComplianceSummaryByResourceType operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {

        return getComplianceSummaryByResourceTypeAsync(
                new GetComplianceSummaryByResourceTypeRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(
            GetResourceConfigHistoryRequest request) {

        return getResourceConfigHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(
            final GetResourceConfigHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetResourceConfigHistoryResult>() {
                    @Override
                    public GetResourceConfigHistoryResult call()
                            throws Exception {
                        GetResourceConfigHistoryResult result;

                        try {
                            result = getResourceConfigHistory(request);
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
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(
            ListDiscoveredResourcesRequest request) {

        return listDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(
            final ListDiscoveredResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDiscoveredResourcesResult>() {
                    @Override
                    public ListDiscoveredResourcesResult call()
                            throws Exception {
                        ListDiscoveredResourcesResult result;

                        try {
                            result = listDiscoveredResources(request);
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
    public java.util.concurrent.Future<Void> putConfigRuleAsync(
            PutConfigRuleRequest request) {

        return putConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putConfigRuleAsync(
            final PutConfigRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigRuleRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putConfigRule(request);
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
    public java.util.concurrent.Future<Void> putConfigurationRecorderAsync(
            PutConfigurationRecorderRequest request) {

        return putConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putConfigurationRecorderAsync(
            final PutConfigurationRecorderRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConfigurationRecorderRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putConfigurationRecorder(request);
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
    public java.util.concurrent.Future<Void> putDeliveryChannelAsync(
            PutDeliveryChannelRequest request) {

        return putDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putDeliveryChannelAsync(
            final PutDeliveryChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDeliveryChannelRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putDeliveryChannel(request);
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
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(
            PutEvaluationsRequest request) {

        return putEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(
            final PutEvaluationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEvaluationsRequest, PutEvaluationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutEvaluationsResult>() {
                    @Override
                    public PutEvaluationsResult call() throws Exception {
                        PutEvaluationsResult result;

                        try {
                            result = putEvaluations(request);
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
    public java.util.concurrent.Future<Void> startConfigurationRecorderAsync(
            StartConfigurationRecorderRequest request) {

        return startConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> startConfigurationRecorderAsync(
            final StartConfigurationRecorderRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartConfigurationRecorderRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            startConfigurationRecorder(request);
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
    public java.util.concurrent.Future<Void> stopConfigurationRecorderAsync(
            StopConfigurationRecorderRequest request) {

        return stopConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> stopConfigurationRecorderAsync(
            final StopConfigurationRecorderRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopConfigurationRecorderRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            stopConfigurationRecorder(request);
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
