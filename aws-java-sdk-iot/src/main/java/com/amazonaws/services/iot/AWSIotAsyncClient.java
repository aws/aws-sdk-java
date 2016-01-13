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
package com.amazonaws.services.iot;

import com.amazonaws.services.iot.model.*;

/**
 * Interface for accessing AWS IoT asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the AWS cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and
 * integration with other services, organize resources associated with each
 * thing (Thing Registry), configure logging, and create and manage policies and
 * credentials to authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"
 * >Developer Guide</a>.
 * </p>
 */
public class AWSIotAsyncClient extends AWSIotClient implements AWSIotAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * IoT. A credentials provider chain will be used that searches for
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
    public AWSIotAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * IoT. A credentials provider chain will be used that searches for
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
     *        connects to AWS IoT (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSIotAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT
     * using the specified AWS account credentials.
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
    public AWSIotAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT
     * using the specified AWS account credentials and executor service. Default
     * client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSIotAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT
     * using the specified AWS account credentials, executor service, and client
     * configuration options.
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
    public AWSIotAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT
     * using the specified AWS account credentials provider. Default client
     * settings will be used.
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
    public AWSIotAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT
     * using the provided AWS account credentials provider and client
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
    public AWSIotAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT
     * using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSIotAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT
     * using the specified AWS account credentials provider, executor service,
     * and client configuration options.
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
    public AWSIotAsyncClient(
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
    public java.util.concurrent.Future<Void> acceptCertificateTransferAsync(
            AcceptCertificateTransferRequest request) {

        return acceptCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> acceptCertificateTransferAsync(
            final AcceptCertificateTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptCertificateTransferRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            acceptCertificateTransfer(request);
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
    public java.util.concurrent.Future<Void> attachPrincipalPolicyAsync(
            AttachPrincipalPolicyRequest request) {

        return attachPrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachPrincipalPolicyAsync(
            final AttachPrincipalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachPrincipalPolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            attachPrincipalPolicy(request);
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
    public java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(
            AttachThingPrincipalRequest request) {

        return attachThingPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(
            final AttachThingPrincipalRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachThingPrincipalRequest, AttachThingPrincipalResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AttachThingPrincipalResult>() {
                    @Override
                    public AttachThingPrincipalResult call() throws Exception {
                        AttachThingPrincipalResult result;

                        try {
                            result = attachThingPrincipal(request);
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
    public java.util.concurrent.Future<Void> cancelCertificateTransferAsync(
            CancelCertificateTransferRequest request) {

        return cancelCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> cancelCertificateTransferAsync(
            final CancelCertificateTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelCertificateTransferRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            cancelCertificateTransfer(request);
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
    public java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(
            CreateCertificateFromCsrRequest request) {

        return createCertificateFromCsrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(
            final CreateCertificateFromCsrRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCertificateFromCsrRequest, CreateCertificateFromCsrResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateCertificateFromCsrResult>() {
                    @Override
                    public CreateCertificateFromCsrResult call()
                            throws Exception {
                        CreateCertificateFromCsrResult result;

                        try {
                            result = createCertificateFromCsr(request);
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
    public java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(
            CreateKeysAndCertificateRequest request) {

        return createKeysAndCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(
            final CreateKeysAndCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeysAndCertificateRequest, CreateKeysAndCertificateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateKeysAndCertificateResult>() {
                    @Override
                    public CreateKeysAndCertificateResult call()
                            throws Exception {
                        CreateKeysAndCertificateResult result;

                        try {
                            result = createKeysAndCertificate(request);
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
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            final CreatePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreatePolicyResult>() {
                    @Override
                    public CreatePolicyResult call() throws Exception {
                        CreatePolicyResult result;

                        try {
                            result = createPolicy(request);
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
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest request) {

        return createPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            final CreatePolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreatePolicyVersionResult>() {
                    @Override
                    public CreatePolicyVersionResult call() throws Exception {
                        CreatePolicyVersionResult result;

                        try {
                            result = createPolicyVersion(request);
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
    public java.util.concurrent.Future<CreateThingResult> createThingAsync(
            CreateThingRequest request) {

        return createThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThingResult> createThingAsync(
            final CreateThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThingRequest, CreateThingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateThingResult>() {
                    @Override
                    public CreateThingResult call() throws Exception {
                        CreateThingResult result;

                        try {
                            result = createThing(request);
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
    public java.util.concurrent.Future<Void> createTopicRuleAsync(
            CreateTopicRuleRequest request) {

        return createTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createTopicRuleAsync(
            final CreateTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTopicRuleRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createTopicRule(request);
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
    public java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteCertificateAsync(
            final DeleteCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteCertificate(request);
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
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deletePolicy(request);
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
    public java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest request) {

        return deletePolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            final DeletePolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deletePolicyVersion(request);
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
    public java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(
            DeleteThingRequest request) {

        return deleteThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(
            final DeleteThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThingRequest, DeleteThingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteThingResult>() {
                    @Override
                    public DeleteThingResult call() throws Exception {
                        DeleteThingResult result;

                        try {
                            result = deleteThing(request);
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
    public java.util.concurrent.Future<Void> deleteTopicRuleAsync(
            DeleteTopicRuleRequest request) {

        return deleteTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTopicRuleAsync(
            final DeleteTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTopicRuleRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteTopicRule(request);
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
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest request) {

        return describeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            final DescribeCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeCertificateResult>() {
                    @Override
                    public DescribeCertificateResult call() throws Exception {
                        DescribeCertificateResult result;

                        try {
                            result = describeCertificate(request);
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
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(
            DescribeEndpointRequest request) {

        return describeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(
            final DescribeEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeEndpointResult>() {
                    @Override
                    public DescribeEndpointResult call() throws Exception {
                        DescribeEndpointResult result;

                        try {
                            result = describeEndpoint(request);
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
    public java.util.concurrent.Future<DescribeThingResult> describeThingAsync(
            DescribeThingRequest request) {

        return describeThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThingResult> describeThingAsync(
            final DescribeThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThingRequest, DescribeThingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeThingResult>() {
                    @Override
                    public DescribeThingResult call() throws Exception {
                        DescribeThingResult result;

                        try {
                            result = describeThing(request);
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
    public java.util.concurrent.Future<Void> detachPrincipalPolicyAsync(
            DetachPrincipalPolicyRequest request) {

        return detachPrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> detachPrincipalPolicyAsync(
            final DetachPrincipalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachPrincipalPolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            detachPrincipalPolicy(request);
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
    public java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(
            DetachThingPrincipalRequest request) {

        return detachThingPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(
            final DetachThingPrincipalRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachThingPrincipalRequest, DetachThingPrincipalResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DetachThingPrincipalResult>() {
                    @Override
                    public DetachThingPrincipalResult call() throws Exception {
                        DetachThingPrincipalResult result;

                        try {
                            result = detachThingPrincipal(request);
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
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(
            GetLoggingOptionsRequest request) {

        return getLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(
            final GetLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggingOptionsRequest, GetLoggingOptionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetLoggingOptionsResult>() {
                    @Override
                    public GetLoggingOptionsResult call() throws Exception {
                        GetLoggingOptionsResult result;

                        try {
                            result = getLoggingOptions(request);
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
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetPolicyResult>() {
                    @Override
                    public GetPolicyResult call() throws Exception {
                        GetPolicyResult result;

                        try {
                            result = getPolicy(request);
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
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest request) {

        return getPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            final GetPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetPolicyVersionResult>() {
                    @Override
                    public GetPolicyVersionResult call() throws Exception {
                        GetPolicyVersionResult result;

                        try {
                            result = getPolicyVersion(request);
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
    public java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(
            GetTopicRuleRequest request) {

        return getTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(
            final GetTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTopicRuleRequest, GetTopicRuleResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetTopicRuleResult>() {
                    @Override
                    public GetTopicRuleResult call() throws Exception {
                        GetTopicRuleResult result;

                        try {
                            result = getTopicRule(request);
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
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest request) {

        return listCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            final ListCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListCertificatesResult>() {
                    @Override
                    public ListCertificatesResult call() throws Exception {
                        ListCertificatesResult result;

                        try {
                            result = listCertificates(request);
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
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            final ListPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListPoliciesResult>() {
                    @Override
                    public ListPoliciesResult call() throws Exception {
                        ListPoliciesResult result;

                        try {
                            result = listPolicies(request);
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
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest request) {

        return listPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            final ListPolicyVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListPolicyVersionsResult>() {
                    @Override
                    public ListPolicyVersionsResult call() throws Exception {
                        ListPolicyVersionsResult result;

                        try {
                            result = listPolicyVersions(request);
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
    public java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(
            ListPrincipalPoliciesRequest request) {

        return listPrincipalPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(
            final ListPrincipalPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPrincipalPoliciesRequest, ListPrincipalPoliciesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListPrincipalPoliciesResult>() {
                    @Override
                    public ListPrincipalPoliciesResult call() throws Exception {
                        ListPrincipalPoliciesResult result;

                        try {
                            result = listPrincipalPolicies(request);
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
    public java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(
            ListPrincipalThingsRequest request) {

        return listPrincipalThingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(
            final ListPrincipalThingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPrincipalThingsRequest, ListPrincipalThingsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListPrincipalThingsResult>() {
                    @Override
                    public ListPrincipalThingsResult call() throws Exception {
                        ListPrincipalThingsResult result;

                        try {
                            result = listPrincipalThings(request);
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
    public java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(
            ListThingPrincipalsRequest request) {

        return listThingPrincipalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(
            final ListThingPrincipalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingPrincipalsRequest, ListThingPrincipalsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListThingPrincipalsResult>() {
                    @Override
                    public ListThingPrincipalsResult call() throws Exception {
                        ListThingPrincipalsResult result;

                        try {
                            result = listThingPrincipals(request);
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
    public java.util.concurrent.Future<ListThingsResult> listThingsAsync(
            ListThingsRequest request) {

        return listThingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingsResult> listThingsAsync(
            final ListThingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingsRequest, ListThingsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListThingsResult>() {
                    @Override
                    public ListThingsResult call() throws Exception {
                        ListThingsResult result;

                        try {
                            result = listThings(request);
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
    public java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(
            ListTopicRulesRequest request) {

        return listTopicRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(
            final ListTopicRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTopicRulesRequest, ListTopicRulesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListTopicRulesResult>() {
                    @Override
                    public ListTopicRulesResult call() throws Exception {
                        ListTopicRulesResult result;

                        try {
                            result = listTopicRules(request);
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
    public java.util.concurrent.Future<Void> rejectCertificateTransferAsync(
            RejectCertificateTransferRequest request) {

        return rejectCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> rejectCertificateTransferAsync(
            final RejectCertificateTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectCertificateTransferRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            rejectCertificateTransfer(request);
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
    public java.util.concurrent.Future<Void> replaceTopicRuleAsync(
            ReplaceTopicRuleRequest request) {

        return replaceTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> replaceTopicRuleAsync(
            final ReplaceTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceTopicRuleRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            replaceTopicRule(request);
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
    public java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest request) {

        return setDefaultPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            final SetDefaultPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setDefaultPolicyVersion(request);
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
    public java.util.concurrent.Future<Void> setLoggingOptionsAsync(
            SetLoggingOptionsRequest request) {

        return setLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setLoggingOptionsAsync(
            final SetLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetLoggingOptionsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setLoggingOptions(request);
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
    public java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(
            TransferCertificateRequest request) {

        return transferCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(
            final TransferCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<TransferCertificateRequest, TransferCertificateResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<TransferCertificateResult>() {
                    @Override
                    public TransferCertificateResult call() throws Exception {
                        TransferCertificateResult result;

                        try {
                            result = transferCertificate(request);
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
    public java.util.concurrent.Future<Void> updateCertificateAsync(
            UpdateCertificateRequest request) {

        return updateCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateCertificateAsync(
            final UpdateCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCertificateRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateCertificate(request);
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
    public java.util.concurrent.Future<UpdateThingResult> updateThingAsync(
            UpdateThingRequest request) {

        return updateThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThingResult> updateThingAsync(
            final UpdateThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThingRequest, UpdateThingResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateThingResult>() {
                    @Override
                    public UpdateThingResult call() throws Exception {
                        UpdateThingResult result;

                        try {
                            result = updateThing(request);
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
