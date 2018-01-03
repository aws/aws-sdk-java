/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS IoT asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between Internet-connected things (such as sensors, actuators,
 * embedded devices, or smart appliances) and the AWS cloud. You can discover your custom IoT-Data endpoint to
 * communicate with, configure rules for data processing and integration with other services, organize resources
 * associated with each thing (Thing Registry), configure logging, and create and manage policies and credentials to
 * authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html">Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIotAsyncClient extends AWSIotClient implements AWSIotAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT. A credentials provider chain will be
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
     * @deprecated use {@link AWSIotAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSIotAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT. A credentials provider chain will be
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
     *        The client configuration options controlling how this client connects to AWS IoT (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSIotAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSIotAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSIotAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSIotAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSIotAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSIotAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSIotAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSIotAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSIotAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSIotAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the provided AWS account
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
     * @deprecated use {@link AWSIotAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSIotAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSIotAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSIotAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSIotAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSIotAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSIotAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSIotAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSIotAsyncClientBuilder asyncBuilder() {
        return AWSIotAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIotAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptCertificateTransferResult> acceptCertificateTransferAsync(AcceptCertificateTransferRequest request) {

        return acceptCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptCertificateTransferResult> acceptCertificateTransferAsync(final AcceptCertificateTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptCertificateTransferRequest, AcceptCertificateTransferResult> asyncHandler) {
        final AcceptCertificateTransferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptCertificateTransferResult>() {
            @Override
            public AcceptCertificateTransferResult call() throws Exception {
                AcceptCertificateTransferResult result = null;

                try {
                    result = executeAcceptCertificateTransfer(finalRequest);
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
    public java.util.concurrent.Future<AddThingToThingGroupResult> addThingToThingGroupAsync(AddThingToThingGroupRequest request) {

        return addThingToThingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddThingToThingGroupResult> addThingToThingGroupAsync(final AddThingToThingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddThingToThingGroupRequest, AddThingToThingGroupResult> asyncHandler) {
        final AddThingToThingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddThingToThingGroupResult>() {
            @Override
            public AddThingToThingGroupResult call() throws Exception {
                AddThingToThingGroupResult result = null;

                try {
                    result = executeAddThingToThingGroup(finalRequest);
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
    public java.util.concurrent.Future<AssociateTargetsWithJobResult> associateTargetsWithJobAsync(AssociateTargetsWithJobRequest request) {

        return associateTargetsWithJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTargetsWithJobResult> associateTargetsWithJobAsync(final AssociateTargetsWithJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTargetsWithJobRequest, AssociateTargetsWithJobResult> asyncHandler) {
        final AssociateTargetsWithJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTargetsWithJobResult>() {
            @Override
            public AssociateTargetsWithJobResult call() throws Exception {
                AssociateTargetsWithJobResult result = null;

                try {
                    result = executeAssociateTargetsWithJob(finalRequest);
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
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest request) {

        return attachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(final AttachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachPolicyRequest, AttachPolicyResult> asyncHandler) {
        final AttachPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachPolicyResult>() {
            @Override
            public AttachPolicyResult call() throws Exception {
                AttachPolicyResult result = null;

                try {
                    result = executeAttachPolicy(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<AttachPrincipalPolicyResult> attachPrincipalPolicyAsync(AttachPrincipalPolicyRequest request) {

        return attachPrincipalPolicyAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<AttachPrincipalPolicyResult> attachPrincipalPolicyAsync(final AttachPrincipalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachPrincipalPolicyRequest, AttachPrincipalPolicyResult> asyncHandler) {
        final AttachPrincipalPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachPrincipalPolicyResult>() {
            @Override
            public AttachPrincipalPolicyResult call() throws Exception {
                AttachPrincipalPolicyResult result = null;

                try {
                    result = executeAttachPrincipalPolicy(finalRequest);
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
    public java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(AttachThingPrincipalRequest request) {

        return attachThingPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachThingPrincipalResult> attachThingPrincipalAsync(final AttachThingPrincipalRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachThingPrincipalRequest, AttachThingPrincipalResult> asyncHandler) {
        final AttachThingPrincipalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachThingPrincipalResult>() {
            @Override
            public AttachThingPrincipalResult call() throws Exception {
                AttachThingPrincipalResult result = null;

                try {
                    result = executeAttachThingPrincipal(finalRequest);
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
    public java.util.concurrent.Future<CancelCertificateTransferResult> cancelCertificateTransferAsync(CancelCertificateTransferRequest request) {

        return cancelCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelCertificateTransferResult> cancelCertificateTransferAsync(final CancelCertificateTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelCertificateTransferRequest, CancelCertificateTransferResult> asyncHandler) {
        final CancelCertificateTransferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelCertificateTransferResult>() {
            @Override
            public CancelCertificateTransferResult call() throws Exception {
                CancelCertificateTransferResult result = null;

                try {
                    result = executeCancelCertificateTransfer(finalRequest);
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
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(final CancelJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {
        final CancelJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelJobResult>() {
            @Override
            public CancelJobResult call() throws Exception {
                CancelJobResult result = null;

                try {
                    result = executeCancelJob(finalRequest);
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
    public java.util.concurrent.Future<ClearDefaultAuthorizerResult> clearDefaultAuthorizerAsync(ClearDefaultAuthorizerRequest request) {

        return clearDefaultAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClearDefaultAuthorizerResult> clearDefaultAuthorizerAsync(final ClearDefaultAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<ClearDefaultAuthorizerRequest, ClearDefaultAuthorizerResult> asyncHandler) {
        final ClearDefaultAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClearDefaultAuthorizerResult>() {
            @Override
            public ClearDefaultAuthorizerResult call() throws Exception {
                ClearDefaultAuthorizerResult result = null;

                try {
                    result = executeClearDefaultAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest request) {

        return createAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(final CreateAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAuthorizerRequest, CreateAuthorizerResult> asyncHandler) {
        final CreateAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAuthorizerResult>() {
            @Override
            public CreateAuthorizerResult call() throws Exception {
                CreateAuthorizerResult result = null;

                try {
                    result = executeCreateAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(CreateCertificateFromCsrRequest request) {

        return createCertificateFromCsrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateFromCsrResult> createCertificateFromCsrAsync(final CreateCertificateFromCsrRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCertificateFromCsrRequest, CreateCertificateFromCsrResult> asyncHandler) {
        final CreateCertificateFromCsrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCertificateFromCsrResult>() {
            @Override
            public CreateCertificateFromCsrResult call() throws Exception {
                CreateCertificateFromCsrResult result = null;

                try {
                    result = executeCreateCertificateFromCsr(finalRequest);
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
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(final CreateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {
        final CreateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateJobResult>() {
            @Override
            public CreateJobResult call() throws Exception {
                CreateJobResult result = null;

                try {
                    result = executeCreateJob(finalRequest);
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
    public java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(CreateKeysAndCertificateRequest request) {

        return createKeysAndCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeysAndCertificateResult> createKeysAndCertificateAsync(final CreateKeysAndCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeysAndCertificateRequest, CreateKeysAndCertificateResult> asyncHandler) {
        final CreateKeysAndCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKeysAndCertificateResult>() {
            @Override
            public CreateKeysAndCertificateResult call() throws Exception {
                CreateKeysAndCertificateResult result = null;

                try {
                    result = executeCreateKeysAndCertificate(finalRequest);
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
    public java.util.concurrent.Future<CreateOTAUpdateResult> createOTAUpdateAsync(CreateOTAUpdateRequest request) {

        return createOTAUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOTAUpdateResult> createOTAUpdateAsync(final CreateOTAUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOTAUpdateRequest, CreateOTAUpdateResult> asyncHandler) {
        final CreateOTAUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOTAUpdateResult>() {
            @Override
            public CreateOTAUpdateResult call() throws Exception {
                CreateOTAUpdateResult result = null;

                try {
                    result = executeCreateOTAUpdate(finalRequest);
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
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(final CreatePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {
        final CreatePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyResult>() {
            @Override
            public CreatePolicyResult call() throws Exception {
                CreatePolicyResult result = null;

                try {
                    result = executeCreatePolicy(finalRequest);
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
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(CreatePolicyVersionRequest request) {

        return createPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(final CreatePolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler) {
        final CreatePolicyVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePolicyVersionResult>() {
            @Override
            public CreatePolicyVersionResult call() throws Exception {
                CreatePolicyVersionResult result = null;

                try {
                    result = executeCreatePolicyVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateRoleAliasResult> createRoleAliasAsync(CreateRoleAliasRequest request) {

        return createRoleAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoleAliasResult> createRoleAliasAsync(final CreateRoleAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoleAliasRequest, CreateRoleAliasResult> asyncHandler) {
        final CreateRoleAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoleAliasResult>() {
            @Override
            public CreateRoleAliasResult call() throws Exception {
                CreateRoleAliasResult result = null;

                try {
                    result = executeCreateRoleAlias(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest request) {

        return createStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(final CreateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {
        final CreateStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamResult>() {
            @Override
            public CreateStreamResult call() throws Exception {
                CreateStreamResult result = null;

                try {
                    result = executeCreateStream(finalRequest);
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
    public java.util.concurrent.Future<CreateThingResult> createThingAsync(CreateThingRequest request) {

        return createThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThingResult> createThingAsync(final CreateThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThingRequest, CreateThingResult> asyncHandler) {
        final CreateThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThingResult>() {
            @Override
            public CreateThingResult call() throws Exception {
                CreateThingResult result = null;

                try {
                    result = executeCreateThing(finalRequest);
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
    public java.util.concurrent.Future<CreateThingGroupResult> createThingGroupAsync(CreateThingGroupRequest request) {

        return createThingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThingGroupResult> createThingGroupAsync(final CreateThingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThingGroupRequest, CreateThingGroupResult> asyncHandler) {
        final CreateThingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThingGroupResult>() {
            @Override
            public CreateThingGroupResult call() throws Exception {
                CreateThingGroupResult result = null;

                try {
                    result = executeCreateThingGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateThingTypeResult> createThingTypeAsync(CreateThingTypeRequest request) {

        return createThingTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThingTypeResult> createThingTypeAsync(final CreateThingTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThingTypeRequest, CreateThingTypeResult> asyncHandler) {
        final CreateThingTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThingTypeResult>() {
            @Override
            public CreateThingTypeResult call() throws Exception {
                CreateThingTypeResult result = null;

                try {
                    result = executeCreateThingType(finalRequest);
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
    public java.util.concurrent.Future<CreateTopicRuleResult> createTopicRuleAsync(CreateTopicRuleRequest request) {

        return createTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTopicRuleResult> createTopicRuleAsync(final CreateTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTopicRuleRequest, CreateTopicRuleResult> asyncHandler) {
        final CreateTopicRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTopicRuleResult>() {
            @Override
            public CreateTopicRuleResult call() throws Exception {
                CreateTopicRuleResult result = null;

                try {
                    result = executeCreateTopicRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest request) {

        return deleteAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(final DeleteAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAuthorizerRequest, DeleteAuthorizerResult> asyncHandler) {
        final DeleteAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAuthorizerResult>() {
            @Override
            public DeleteAuthorizerResult call() throws Exception {
                DeleteAuthorizerResult result = null;

                try {
                    result = executeDeleteAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<DeleteCACertificateResult> deleteCACertificateAsync(DeleteCACertificateRequest request) {

        return deleteCACertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCACertificateResult> deleteCACertificateAsync(final DeleteCACertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCACertificateRequest, DeleteCACertificateResult> asyncHandler) {
        final DeleteCACertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCACertificateResult>() {
            @Override
            public DeleteCACertificateResult call() throws Exception {
                DeleteCACertificateResult result = null;

                try {
                    result = executeDeleteCACertificate(finalRequest);
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
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(final DeleteCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler) {
        final DeleteCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCertificateResult>() {
            @Override
            public DeleteCertificateResult call() throws Exception {
                DeleteCertificateResult result = null;

                try {
                    result = executeDeleteCertificate(finalRequest);
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
    public java.util.concurrent.Future<DeleteOTAUpdateResult> deleteOTAUpdateAsync(DeleteOTAUpdateRequest request) {

        return deleteOTAUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOTAUpdateResult> deleteOTAUpdateAsync(final DeleteOTAUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOTAUpdateRequest, DeleteOTAUpdateResult> asyncHandler) {
        final DeleteOTAUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOTAUpdateResult>() {
            @Override
            public DeleteOTAUpdateResult call() throws Exception {
                DeleteOTAUpdateResult result = null;

                try {
                    result = executeDeleteOTAUpdate(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(final DeletePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler) {
        final DeletePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyResult>() {
            @Override
            public DeletePolicyResult call() throws Exception {
                DeletePolicyResult result = null;

                try {
                    result = executeDeletePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeletePolicyVersionResult> deletePolicyVersionAsync(DeletePolicyVersionRequest request) {

        return deletePolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePolicyVersionResult> deletePolicyVersionAsync(final DeletePolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, DeletePolicyVersionResult> asyncHandler) {
        final DeletePolicyVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePolicyVersionResult>() {
            @Override
            public DeletePolicyVersionResult call() throws Exception {
                DeletePolicyVersionResult result = null;

                try {
                    result = executeDeletePolicyVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteRegistrationCodeResult> deleteRegistrationCodeAsync(DeleteRegistrationCodeRequest request) {

        return deleteRegistrationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegistrationCodeResult> deleteRegistrationCodeAsync(final DeleteRegistrationCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegistrationCodeRequest, DeleteRegistrationCodeResult> asyncHandler) {
        final DeleteRegistrationCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegistrationCodeResult>() {
            @Override
            public DeleteRegistrationCodeResult call() throws Exception {
                DeleteRegistrationCodeResult result = null;

                try {
                    result = executeDeleteRegistrationCode(finalRequest);
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
    public java.util.concurrent.Future<DeleteRoleAliasResult> deleteRoleAliasAsync(DeleteRoleAliasRequest request) {

        return deleteRoleAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoleAliasResult> deleteRoleAliasAsync(final DeleteRoleAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoleAliasRequest, DeleteRoleAliasResult> asyncHandler) {
        final DeleteRoleAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoleAliasResult>() {
            @Override
            public DeleteRoleAliasResult call() throws Exception {
                DeleteRoleAliasResult result = null;

                try {
                    result = executeDeleteRoleAlias(finalRequest);
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
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest request) {

        return deleteStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(final DeleteStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {
        final DeleteStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamResult>() {
            @Override
            public DeleteStreamResult call() throws Exception {
                DeleteStreamResult result = null;

                try {
                    result = executeDeleteStream(finalRequest);
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
    public java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(DeleteThingRequest request) {

        return deleteThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThingResult> deleteThingAsync(final DeleteThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThingRequest, DeleteThingResult> asyncHandler) {
        final DeleteThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThingResult>() {
            @Override
            public DeleteThingResult call() throws Exception {
                DeleteThingResult result = null;

                try {
                    result = executeDeleteThing(finalRequest);
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
    public java.util.concurrent.Future<DeleteThingGroupResult> deleteThingGroupAsync(DeleteThingGroupRequest request) {

        return deleteThingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThingGroupResult> deleteThingGroupAsync(final DeleteThingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThingGroupRequest, DeleteThingGroupResult> asyncHandler) {
        final DeleteThingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThingGroupResult>() {
            @Override
            public DeleteThingGroupResult call() throws Exception {
                DeleteThingGroupResult result = null;

                try {
                    result = executeDeleteThingGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteThingTypeResult> deleteThingTypeAsync(DeleteThingTypeRequest request) {

        return deleteThingTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThingTypeResult> deleteThingTypeAsync(final DeleteThingTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThingTypeRequest, DeleteThingTypeResult> asyncHandler) {
        final DeleteThingTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThingTypeResult>() {
            @Override
            public DeleteThingTypeResult call() throws Exception {
                DeleteThingTypeResult result = null;

                try {
                    result = executeDeleteThingType(finalRequest);
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
    public java.util.concurrent.Future<DeleteTopicRuleResult> deleteTopicRuleAsync(DeleteTopicRuleRequest request) {

        return deleteTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTopicRuleResult> deleteTopicRuleAsync(final DeleteTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTopicRuleRequest, DeleteTopicRuleResult> asyncHandler) {
        final DeleteTopicRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTopicRuleResult>() {
            @Override
            public DeleteTopicRuleResult call() throws Exception {
                DeleteTopicRuleResult result = null;

                try {
                    result = executeDeleteTopicRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteV2LoggingLevelResult> deleteV2LoggingLevelAsync(DeleteV2LoggingLevelRequest request) {

        return deleteV2LoggingLevelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteV2LoggingLevelResult> deleteV2LoggingLevelAsync(final DeleteV2LoggingLevelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteV2LoggingLevelRequest, DeleteV2LoggingLevelResult> asyncHandler) {
        final DeleteV2LoggingLevelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteV2LoggingLevelResult>() {
            @Override
            public DeleteV2LoggingLevelResult call() throws Exception {
                DeleteV2LoggingLevelResult result = null;

                try {
                    result = executeDeleteV2LoggingLevel(finalRequest);
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
    public java.util.concurrent.Future<DeprecateThingTypeResult> deprecateThingTypeAsync(DeprecateThingTypeRequest request) {

        return deprecateThingTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeprecateThingTypeResult> deprecateThingTypeAsync(final DeprecateThingTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprecateThingTypeRequest, DeprecateThingTypeResult> asyncHandler) {
        final DeprecateThingTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeprecateThingTypeResult>() {
            @Override
            public DeprecateThingTypeResult call() throws Exception {
                DeprecateThingTypeResult result = null;

                try {
                    result = executeDeprecateThingType(finalRequest);
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
    public java.util.concurrent.Future<DescribeAuthorizerResult> describeAuthorizerAsync(DescribeAuthorizerRequest request) {

        return describeAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAuthorizerResult> describeAuthorizerAsync(final DescribeAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAuthorizerRequest, DescribeAuthorizerResult> asyncHandler) {
        final DescribeAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAuthorizerResult>() {
            @Override
            public DescribeAuthorizerResult call() throws Exception {
                DescribeAuthorizerResult result = null;

                try {
                    result = executeDescribeAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<DescribeCACertificateResult> describeCACertificateAsync(DescribeCACertificateRequest request) {

        return describeCACertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCACertificateResult> describeCACertificateAsync(final DescribeCACertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCACertificateRequest, DescribeCACertificateResult> asyncHandler) {
        final DescribeCACertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCACertificateResult>() {
            @Override
            public DescribeCACertificateResult call() throws Exception {
                DescribeCACertificateResult result = null;

                try {
                    result = executeDescribeCACertificate(finalRequest);
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
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest request) {

        return describeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(final DescribeCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler) {
        final DescribeCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificateResult>() {
            @Override
            public DescribeCertificateResult call() throws Exception {
                DescribeCertificateResult result = null;

                try {
                    result = executeDescribeCertificate(finalRequest);
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
    public java.util.concurrent.Future<DescribeDefaultAuthorizerResult> describeDefaultAuthorizerAsync(DescribeDefaultAuthorizerRequest request) {

        return describeDefaultAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDefaultAuthorizerResult> describeDefaultAuthorizerAsync(final DescribeDefaultAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDefaultAuthorizerRequest, DescribeDefaultAuthorizerResult> asyncHandler) {
        final DescribeDefaultAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDefaultAuthorizerResult>() {
            @Override
            public DescribeDefaultAuthorizerResult call() throws Exception {
                DescribeDefaultAuthorizerResult result = null;

                try {
                    result = executeDescribeDefaultAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest request) {

        return describeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(final DescribeEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler) {
        final DescribeEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointResult>() {
            @Override
            public DescribeEndpointResult call() throws Exception {
                DescribeEndpointResult result = null;

                try {
                    result = executeDescribeEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventConfigurationsResult> describeEventConfigurationsAsync(DescribeEventConfigurationsRequest request) {

        return describeEventConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventConfigurationsResult> describeEventConfigurationsAsync(final DescribeEventConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventConfigurationsRequest, DescribeEventConfigurationsResult> asyncHandler) {
        final DescribeEventConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventConfigurationsResult>() {
            @Override
            public DescribeEventConfigurationsResult call() throws Exception {
                DescribeEventConfigurationsResult result = null;

                try {
                    result = executeDescribeEventConfigurations(finalRequest);
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
    public java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest request) {

        return describeIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(final DescribeIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIndexRequest, DescribeIndexResult> asyncHandler) {
        final DescribeIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIndexResult>() {
            @Override
            public DescribeIndexResult call() throws Exception {
                DescribeIndexResult result = null;

                try {
                    result = executeDescribeIndex(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request) {

        return describeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(final DescribeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler) {
        final DescribeJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobResult>() {
            @Override
            public DescribeJobResult call() throws Exception {
                DescribeJobResult result = null;

                try {
                    result = executeDescribeJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest request) {

        return describeJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(final DescribeJobExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobExecutionRequest, DescribeJobExecutionResult> asyncHandler) {
        final DescribeJobExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobExecutionResult>() {
            @Override
            public DescribeJobExecutionResult call() throws Exception {
                DescribeJobExecutionResult result = null;

                try {
                    result = executeDescribeJobExecution(finalRequest);
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
    public java.util.concurrent.Future<DescribeRoleAliasResult> describeRoleAliasAsync(DescribeRoleAliasRequest request) {

        return describeRoleAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRoleAliasResult> describeRoleAliasAsync(final DescribeRoleAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRoleAliasRequest, DescribeRoleAliasResult> asyncHandler) {
        final DescribeRoleAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRoleAliasResult>() {
            @Override
            public DescribeRoleAliasResult call() throws Exception {
                DescribeRoleAliasResult result = null;

                try {
                    result = executeDescribeRoleAlias(finalRequest);
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
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(final DescribeStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {
        final DescribeStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStreamResult>() {
            @Override
            public DescribeStreamResult call() throws Exception {
                DescribeStreamResult result = null;

                try {
                    result = executeDescribeStream(finalRequest);
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
    public java.util.concurrent.Future<DescribeThingResult> describeThingAsync(DescribeThingRequest request) {

        return describeThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThingResult> describeThingAsync(final DescribeThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThingRequest, DescribeThingResult> asyncHandler) {
        final DescribeThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThingResult>() {
            @Override
            public DescribeThingResult call() throws Exception {
                DescribeThingResult result = null;

                try {
                    result = executeDescribeThing(finalRequest);
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
    public java.util.concurrent.Future<DescribeThingGroupResult> describeThingGroupAsync(DescribeThingGroupRequest request) {

        return describeThingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThingGroupResult> describeThingGroupAsync(final DescribeThingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThingGroupRequest, DescribeThingGroupResult> asyncHandler) {
        final DescribeThingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThingGroupResult>() {
            @Override
            public DescribeThingGroupResult call() throws Exception {
                DescribeThingGroupResult result = null;

                try {
                    result = executeDescribeThingGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeThingRegistrationTaskResult> describeThingRegistrationTaskAsync(DescribeThingRegistrationTaskRequest request) {

        return describeThingRegistrationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThingRegistrationTaskResult> describeThingRegistrationTaskAsync(
            final DescribeThingRegistrationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThingRegistrationTaskRequest, DescribeThingRegistrationTaskResult> asyncHandler) {
        final DescribeThingRegistrationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThingRegistrationTaskResult>() {
            @Override
            public DescribeThingRegistrationTaskResult call() throws Exception {
                DescribeThingRegistrationTaskResult result = null;

                try {
                    result = executeDescribeThingRegistrationTask(finalRequest);
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
    public java.util.concurrent.Future<DescribeThingTypeResult> describeThingTypeAsync(DescribeThingTypeRequest request) {

        return describeThingTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThingTypeResult> describeThingTypeAsync(final DescribeThingTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThingTypeRequest, DescribeThingTypeResult> asyncHandler) {
        final DescribeThingTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThingTypeResult>() {
            @Override
            public DescribeThingTypeResult call() throws Exception {
                DescribeThingTypeResult result = null;

                try {
                    result = executeDescribeThingType(finalRequest);
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
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest request) {

        return detachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(final DetachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachPolicyRequest, DetachPolicyResult> asyncHandler) {
        final DetachPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachPolicyResult>() {
            @Override
            public DetachPolicyResult call() throws Exception {
                DetachPolicyResult result = null;

                try {
                    result = executeDetachPolicy(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<DetachPrincipalPolicyResult> detachPrincipalPolicyAsync(DetachPrincipalPolicyRequest request) {

        return detachPrincipalPolicyAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DetachPrincipalPolicyResult> detachPrincipalPolicyAsync(final DetachPrincipalPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachPrincipalPolicyRequest, DetachPrincipalPolicyResult> asyncHandler) {
        final DetachPrincipalPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachPrincipalPolicyResult>() {
            @Override
            public DetachPrincipalPolicyResult call() throws Exception {
                DetachPrincipalPolicyResult result = null;

                try {
                    result = executeDetachPrincipalPolicy(finalRequest);
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
    public java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(DetachThingPrincipalRequest request) {

        return detachThingPrincipalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachThingPrincipalResult> detachThingPrincipalAsync(final DetachThingPrincipalRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachThingPrincipalRequest, DetachThingPrincipalResult> asyncHandler) {
        final DetachThingPrincipalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachThingPrincipalResult>() {
            @Override
            public DetachThingPrincipalResult call() throws Exception {
                DetachThingPrincipalResult result = null;

                try {
                    result = executeDetachThingPrincipal(finalRequest);
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
    public java.util.concurrent.Future<DisableTopicRuleResult> disableTopicRuleAsync(DisableTopicRuleRequest request) {

        return disableTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableTopicRuleResult> disableTopicRuleAsync(final DisableTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableTopicRuleRequest, DisableTopicRuleResult> asyncHandler) {
        final DisableTopicRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableTopicRuleResult>() {
            @Override
            public DisableTopicRuleResult call() throws Exception {
                DisableTopicRuleResult result = null;

                try {
                    result = executeDisableTopicRule(finalRequest);
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
    public java.util.concurrent.Future<EnableTopicRuleResult> enableTopicRuleAsync(EnableTopicRuleRequest request) {

        return enableTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableTopicRuleResult> enableTopicRuleAsync(final EnableTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableTopicRuleRequest, EnableTopicRuleResult> asyncHandler) {
        final EnableTopicRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableTopicRuleResult>() {
            @Override
            public EnableTopicRuleResult call() throws Exception {
                EnableTopicRuleResult result = null;

                try {
                    result = executeEnableTopicRule(finalRequest);
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
    public java.util.concurrent.Future<GetEffectivePoliciesResult> getEffectivePoliciesAsync(GetEffectivePoliciesRequest request) {

        return getEffectivePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEffectivePoliciesResult> getEffectivePoliciesAsync(final GetEffectivePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEffectivePoliciesRequest, GetEffectivePoliciesResult> asyncHandler) {
        final GetEffectivePoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEffectivePoliciesResult>() {
            @Override
            public GetEffectivePoliciesResult call() throws Exception {
                GetEffectivePoliciesResult result = null;

                try {
                    result = executeGetEffectivePolicies(finalRequest);
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
    public java.util.concurrent.Future<GetIndexingConfigurationResult> getIndexingConfigurationAsync(GetIndexingConfigurationRequest request) {

        return getIndexingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIndexingConfigurationResult> getIndexingConfigurationAsync(final GetIndexingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIndexingConfigurationRequest, GetIndexingConfigurationResult> asyncHandler) {
        final GetIndexingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIndexingConfigurationResult>() {
            @Override
            public GetIndexingConfigurationResult call() throws Exception {
                GetIndexingConfigurationResult result = null;

                try {
                    result = executeGetIndexingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetJobDocumentResult> getJobDocumentAsync(GetJobDocumentRequest request) {

        return getJobDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobDocumentResult> getJobDocumentAsync(final GetJobDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobDocumentRequest, GetJobDocumentResult> asyncHandler) {
        final GetJobDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobDocumentResult>() {
            @Override
            public GetJobDocumentResult call() throws Exception {
                GetJobDocumentResult result = null;

                try {
                    result = executeGetJobDocument(finalRequest);
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
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(GetLoggingOptionsRequest request) {

        return getLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(final GetLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggingOptionsRequest, GetLoggingOptionsResult> asyncHandler) {
        final GetLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoggingOptionsResult>() {
            @Override
            public GetLoggingOptionsResult call() throws Exception {
                GetLoggingOptionsResult result = null;

                try {
                    result = executeGetLoggingOptions(finalRequest);
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
    public java.util.concurrent.Future<GetOTAUpdateResult> getOTAUpdateAsync(GetOTAUpdateRequest request) {

        return getOTAUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOTAUpdateResult> getOTAUpdateAsync(final GetOTAUpdateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOTAUpdateRequest, GetOTAUpdateResult> asyncHandler) {
        final GetOTAUpdateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOTAUpdateResult>() {
            @Override
            public GetOTAUpdateResult call() throws Exception {
                GetOTAUpdateResult result = null;

                try {
                    result = executeGetOTAUpdate(finalRequest);
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
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(final GetPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {
        final GetPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyResult>() {
            @Override
            public GetPolicyResult call() throws Exception {
                GetPolicyResult result = null;

                try {
                    result = executeGetPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(GetPolicyVersionRequest request) {

        return getPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(final GetPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler) {
        final GetPolicyVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPolicyVersionResult>() {
            @Override
            public GetPolicyVersionResult call() throws Exception {
                GetPolicyVersionResult result = null;

                try {
                    result = executeGetPolicyVersion(finalRequest);
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
    public java.util.concurrent.Future<GetRegistrationCodeResult> getRegistrationCodeAsync(GetRegistrationCodeRequest request) {

        return getRegistrationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegistrationCodeResult> getRegistrationCodeAsync(final GetRegistrationCodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegistrationCodeRequest, GetRegistrationCodeResult> asyncHandler) {
        final GetRegistrationCodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegistrationCodeResult>() {
            @Override
            public GetRegistrationCodeResult call() throws Exception {
                GetRegistrationCodeResult result = null;

                try {
                    result = executeGetRegistrationCode(finalRequest);
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
    public java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(GetTopicRuleRequest request) {

        return getTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTopicRuleResult> getTopicRuleAsync(final GetTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTopicRuleRequest, GetTopicRuleResult> asyncHandler) {
        final GetTopicRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTopicRuleResult>() {
            @Override
            public GetTopicRuleResult call() throws Exception {
                GetTopicRuleResult result = null;

                try {
                    result = executeGetTopicRule(finalRequest);
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
    public java.util.concurrent.Future<GetV2LoggingOptionsResult> getV2LoggingOptionsAsync(GetV2LoggingOptionsRequest request) {

        return getV2LoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetV2LoggingOptionsResult> getV2LoggingOptionsAsync(final GetV2LoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetV2LoggingOptionsRequest, GetV2LoggingOptionsResult> asyncHandler) {
        final GetV2LoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetV2LoggingOptionsResult>() {
            @Override
            public GetV2LoggingOptionsResult call() throws Exception {
                GetV2LoggingOptionsResult result = null;

                try {
                    result = executeGetV2LoggingOptions(finalRequest);
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
    public java.util.concurrent.Future<ListAttachedPoliciesResult> listAttachedPoliciesAsync(ListAttachedPoliciesRequest request) {

        return listAttachedPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedPoliciesResult> listAttachedPoliciesAsync(final ListAttachedPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedPoliciesRequest, ListAttachedPoliciesResult> asyncHandler) {
        final ListAttachedPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttachedPoliciesResult>() {
            @Override
            public ListAttachedPoliciesResult call() throws Exception {
                ListAttachedPoliciesResult result = null;

                try {
                    result = executeListAttachedPolicies(finalRequest);
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
    public java.util.concurrent.Future<ListAuthorizersResult> listAuthorizersAsync(ListAuthorizersRequest request) {

        return listAuthorizersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAuthorizersResult> listAuthorizersAsync(final ListAuthorizersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAuthorizersRequest, ListAuthorizersResult> asyncHandler) {
        final ListAuthorizersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAuthorizersResult>() {
            @Override
            public ListAuthorizersResult call() throws Exception {
                ListAuthorizersResult result = null;

                try {
                    result = executeListAuthorizers(finalRequest);
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
    public java.util.concurrent.Future<ListCACertificatesResult> listCACertificatesAsync(ListCACertificatesRequest request) {

        return listCACertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCACertificatesResult> listCACertificatesAsync(final ListCACertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCACertificatesRequest, ListCACertificatesResult> asyncHandler) {
        final ListCACertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCACertificatesResult>() {
            @Override
            public ListCACertificatesResult call() throws Exception {
                ListCACertificatesResult result = null;

                try {
                    result = executeListCACertificates(finalRequest);
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
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest request) {

        return listCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(final ListCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler) {
        final ListCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCertificatesResult>() {
            @Override
            public ListCertificatesResult call() throws Exception {
                ListCertificatesResult result = null;

                try {
                    result = executeListCertificates(finalRequest);
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
    public java.util.concurrent.Future<ListCertificatesByCAResult> listCertificatesByCAAsync(ListCertificatesByCARequest request) {

        return listCertificatesByCAAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesByCAResult> listCertificatesByCAAsync(final ListCertificatesByCARequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCertificatesByCARequest, ListCertificatesByCAResult> asyncHandler) {
        final ListCertificatesByCARequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCertificatesByCAResult>() {
            @Override
            public ListCertificatesByCAResult call() throws Exception {
                ListCertificatesByCAResult result = null;

                try {
                    result = executeListCertificatesByCA(finalRequest);
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
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest request) {

        return listIndicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(final ListIndicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIndicesRequest, ListIndicesResult> asyncHandler) {
        final ListIndicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIndicesResult>() {
            @Override
            public ListIndicesResult call() throws Exception {
                ListIndicesResult result = null;

                try {
                    result = executeListIndices(finalRequest);
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
    public java.util.concurrent.Future<ListJobExecutionsForJobResult> listJobExecutionsForJobAsync(ListJobExecutionsForJobRequest request) {

        return listJobExecutionsForJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobExecutionsForJobResult> listJobExecutionsForJobAsync(final ListJobExecutionsForJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobExecutionsForJobRequest, ListJobExecutionsForJobResult> asyncHandler) {
        final ListJobExecutionsForJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobExecutionsForJobResult>() {
            @Override
            public ListJobExecutionsForJobResult call() throws Exception {
                ListJobExecutionsForJobResult result = null;

                try {
                    result = executeListJobExecutionsForJob(finalRequest);
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
    public java.util.concurrent.Future<ListJobExecutionsForThingResult> listJobExecutionsForThingAsync(ListJobExecutionsForThingRequest request) {

        return listJobExecutionsForThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobExecutionsForThingResult> listJobExecutionsForThingAsync(final ListJobExecutionsForThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobExecutionsForThingRequest, ListJobExecutionsForThingResult> asyncHandler) {
        final ListJobExecutionsForThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobExecutionsForThingResult>() {
            @Override
            public ListJobExecutionsForThingResult call() throws Exception {
                ListJobExecutionsForThingResult result = null;

                try {
                    result = executeListJobExecutionsForThing(finalRequest);
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
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {
        final ListJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result = null;

                try {
                    result = executeListJobs(finalRequest);
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
    public java.util.concurrent.Future<ListOTAUpdatesResult> listOTAUpdatesAsync(ListOTAUpdatesRequest request) {

        return listOTAUpdatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOTAUpdatesResult> listOTAUpdatesAsync(final ListOTAUpdatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOTAUpdatesRequest, ListOTAUpdatesResult> asyncHandler) {
        final ListOTAUpdatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOTAUpdatesResult>() {
            @Override
            public ListOTAUpdatesResult call() throws Exception {
                ListOTAUpdatesResult result = null;

                try {
                    result = executeListOTAUpdates(finalRequest);
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
    public java.util.concurrent.Future<ListOutgoingCertificatesResult> listOutgoingCertificatesAsync(ListOutgoingCertificatesRequest request) {

        return listOutgoingCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOutgoingCertificatesResult> listOutgoingCertificatesAsync(final ListOutgoingCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOutgoingCertificatesRequest, ListOutgoingCertificatesResult> asyncHandler) {
        final ListOutgoingCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOutgoingCertificatesResult>() {
            @Override
            public ListOutgoingCertificatesResult call() throws Exception {
                ListOutgoingCertificatesResult result = null;

                try {
                    result = executeListOutgoingCertificates(finalRequest);
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
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(final ListPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {
        final ListPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPoliciesResult>() {
            @Override
            public ListPoliciesResult call() throws Exception {
                ListPoliciesResult result = null;

                try {
                    result = executeListPolicies(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<ListPolicyPrincipalsResult> listPolicyPrincipalsAsync(ListPolicyPrincipalsRequest request) {

        return listPolicyPrincipalsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListPolicyPrincipalsResult> listPolicyPrincipalsAsync(final ListPolicyPrincipalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyPrincipalsRequest, ListPolicyPrincipalsResult> asyncHandler) {
        final ListPolicyPrincipalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPolicyPrincipalsResult>() {
            @Override
            public ListPolicyPrincipalsResult call() throws Exception {
                ListPolicyPrincipalsResult result = null;

                try {
                    result = executeListPolicyPrincipals(finalRequest);
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
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(ListPolicyVersionsRequest request) {

        return listPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(final ListPolicyVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler) {
        final ListPolicyVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPolicyVersionsResult>() {
            @Override
            public ListPolicyVersionsResult call() throws Exception {
                ListPolicyVersionsResult result = null;

                try {
                    result = executeListPolicyVersions(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(ListPrincipalPoliciesRequest request) {

        return listPrincipalPoliciesAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(final ListPrincipalPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPrincipalPoliciesRequest, ListPrincipalPoliciesResult> asyncHandler) {
        final ListPrincipalPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPrincipalPoliciesResult>() {
            @Override
            public ListPrincipalPoliciesResult call() throws Exception {
                ListPrincipalPoliciesResult result = null;

                try {
                    result = executeListPrincipalPolicies(finalRequest);
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
    public java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(ListPrincipalThingsRequest request) {

        return listPrincipalThingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalThingsResult> listPrincipalThingsAsync(final ListPrincipalThingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPrincipalThingsRequest, ListPrincipalThingsResult> asyncHandler) {
        final ListPrincipalThingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPrincipalThingsResult>() {
            @Override
            public ListPrincipalThingsResult call() throws Exception {
                ListPrincipalThingsResult result = null;

                try {
                    result = executeListPrincipalThings(finalRequest);
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
    public java.util.concurrent.Future<ListRoleAliasesResult> listRoleAliasesAsync(ListRoleAliasesRequest request) {

        return listRoleAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoleAliasesResult> listRoleAliasesAsync(final ListRoleAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoleAliasesRequest, ListRoleAliasesResult> asyncHandler) {
        final ListRoleAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoleAliasesResult>() {
            @Override
            public ListRoleAliasesResult call() throws Exception {
                ListRoleAliasesResult result = null;

                try {
                    result = executeListRoleAliases(finalRequest);
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
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(final ListStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {
        final ListStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamsResult>() {
            @Override
            public ListStreamsResult call() throws Exception {
                ListStreamsResult result = null;

                try {
                    result = executeListStreams(finalRequest);
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
    public java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(ListTargetsForPolicyRequest request) {

        return listTargetsForPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(final ListTargetsForPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetsForPolicyRequest, ListTargetsForPolicyResult> asyncHandler) {
        final ListTargetsForPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTargetsForPolicyResult>() {
            @Override
            public ListTargetsForPolicyResult call() throws Exception {
                ListTargetsForPolicyResult result = null;

                try {
                    result = executeListTargetsForPolicy(finalRequest);
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
    public java.util.concurrent.Future<ListThingGroupsResult> listThingGroupsAsync(ListThingGroupsRequest request) {

        return listThingGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingGroupsResult> listThingGroupsAsync(final ListThingGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingGroupsRequest, ListThingGroupsResult> asyncHandler) {
        final ListThingGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingGroupsResult>() {
            @Override
            public ListThingGroupsResult call() throws Exception {
                ListThingGroupsResult result = null;

                try {
                    result = executeListThingGroups(finalRequest);
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
    public java.util.concurrent.Future<ListThingGroupsForThingResult> listThingGroupsForThingAsync(ListThingGroupsForThingRequest request) {

        return listThingGroupsForThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingGroupsForThingResult> listThingGroupsForThingAsync(final ListThingGroupsForThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingGroupsForThingRequest, ListThingGroupsForThingResult> asyncHandler) {
        final ListThingGroupsForThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingGroupsForThingResult>() {
            @Override
            public ListThingGroupsForThingResult call() throws Exception {
                ListThingGroupsForThingResult result = null;

                try {
                    result = executeListThingGroupsForThing(finalRequest);
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
    public java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(ListThingPrincipalsRequest request) {

        return listThingPrincipalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingPrincipalsResult> listThingPrincipalsAsync(final ListThingPrincipalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingPrincipalsRequest, ListThingPrincipalsResult> asyncHandler) {
        final ListThingPrincipalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingPrincipalsResult>() {
            @Override
            public ListThingPrincipalsResult call() throws Exception {
                ListThingPrincipalsResult result = null;

                try {
                    result = executeListThingPrincipals(finalRequest);
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
    public java.util.concurrent.Future<ListThingRegistrationTaskReportsResult> listThingRegistrationTaskReportsAsync(
            ListThingRegistrationTaskReportsRequest request) {

        return listThingRegistrationTaskReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingRegistrationTaskReportsResult> listThingRegistrationTaskReportsAsync(
            final ListThingRegistrationTaskReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingRegistrationTaskReportsRequest, ListThingRegistrationTaskReportsResult> asyncHandler) {
        final ListThingRegistrationTaskReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingRegistrationTaskReportsResult>() {
            @Override
            public ListThingRegistrationTaskReportsResult call() throws Exception {
                ListThingRegistrationTaskReportsResult result = null;

                try {
                    result = executeListThingRegistrationTaskReports(finalRequest);
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
    public java.util.concurrent.Future<ListThingRegistrationTasksResult> listThingRegistrationTasksAsync(ListThingRegistrationTasksRequest request) {

        return listThingRegistrationTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingRegistrationTasksResult> listThingRegistrationTasksAsync(final ListThingRegistrationTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingRegistrationTasksRequest, ListThingRegistrationTasksResult> asyncHandler) {
        final ListThingRegistrationTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingRegistrationTasksResult>() {
            @Override
            public ListThingRegistrationTasksResult call() throws Exception {
                ListThingRegistrationTasksResult result = null;

                try {
                    result = executeListThingRegistrationTasks(finalRequest);
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
    public java.util.concurrent.Future<ListThingTypesResult> listThingTypesAsync(ListThingTypesRequest request) {

        return listThingTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingTypesResult> listThingTypesAsync(final ListThingTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingTypesRequest, ListThingTypesResult> asyncHandler) {
        final ListThingTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingTypesResult>() {
            @Override
            public ListThingTypesResult call() throws Exception {
                ListThingTypesResult result = null;

                try {
                    result = executeListThingTypes(finalRequest);
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
    public java.util.concurrent.Future<ListThingsResult> listThingsAsync(ListThingsRequest request) {

        return listThingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingsResult> listThingsAsync(final ListThingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingsRequest, ListThingsResult> asyncHandler) {
        final ListThingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingsResult>() {
            @Override
            public ListThingsResult call() throws Exception {
                ListThingsResult result = null;

                try {
                    result = executeListThings(finalRequest);
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
    public java.util.concurrent.Future<ListThingsInThingGroupResult> listThingsInThingGroupAsync(ListThingsInThingGroupRequest request) {

        return listThingsInThingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThingsInThingGroupResult> listThingsInThingGroupAsync(final ListThingsInThingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThingsInThingGroupRequest, ListThingsInThingGroupResult> asyncHandler) {
        final ListThingsInThingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThingsInThingGroupResult>() {
            @Override
            public ListThingsInThingGroupResult call() throws Exception {
                ListThingsInThingGroupResult result = null;

                try {
                    result = executeListThingsInThingGroup(finalRequest);
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
    public java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(ListTopicRulesRequest request) {

        return listTopicRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicRulesResult> listTopicRulesAsync(final ListTopicRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTopicRulesRequest, ListTopicRulesResult> asyncHandler) {
        final ListTopicRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTopicRulesResult>() {
            @Override
            public ListTopicRulesResult call() throws Exception {
                ListTopicRulesResult result = null;

                try {
                    result = executeListTopicRules(finalRequest);
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
    public java.util.concurrent.Future<ListV2LoggingLevelsResult> listV2LoggingLevelsAsync(ListV2LoggingLevelsRequest request) {

        return listV2LoggingLevelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListV2LoggingLevelsResult> listV2LoggingLevelsAsync(final ListV2LoggingLevelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListV2LoggingLevelsRequest, ListV2LoggingLevelsResult> asyncHandler) {
        final ListV2LoggingLevelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListV2LoggingLevelsResult>() {
            @Override
            public ListV2LoggingLevelsResult call() throws Exception {
                ListV2LoggingLevelsResult result = null;

                try {
                    result = executeListV2LoggingLevels(finalRequest);
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
    public java.util.concurrent.Future<RegisterCACertificateResult> registerCACertificateAsync(RegisterCACertificateRequest request) {

        return registerCACertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterCACertificateResult> registerCACertificateAsync(final RegisterCACertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterCACertificateRequest, RegisterCACertificateResult> asyncHandler) {
        final RegisterCACertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterCACertificateResult>() {
            @Override
            public RegisterCACertificateResult call() throws Exception {
                RegisterCACertificateResult result = null;

                try {
                    result = executeRegisterCACertificate(finalRequest);
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
    public java.util.concurrent.Future<RegisterCertificateResult> registerCertificateAsync(RegisterCertificateRequest request) {

        return registerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterCertificateResult> registerCertificateAsync(final RegisterCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterCertificateRequest, RegisterCertificateResult> asyncHandler) {
        final RegisterCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterCertificateResult>() {
            @Override
            public RegisterCertificateResult call() throws Exception {
                RegisterCertificateResult result = null;

                try {
                    result = executeRegisterCertificate(finalRequest);
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
    public java.util.concurrent.Future<RegisterThingResult> registerThingAsync(RegisterThingRequest request) {

        return registerThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterThingResult> registerThingAsync(final RegisterThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterThingRequest, RegisterThingResult> asyncHandler) {
        final RegisterThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterThingResult>() {
            @Override
            public RegisterThingResult call() throws Exception {
                RegisterThingResult result = null;

                try {
                    result = executeRegisterThing(finalRequest);
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
    public java.util.concurrent.Future<RejectCertificateTransferResult> rejectCertificateTransferAsync(RejectCertificateTransferRequest request) {

        return rejectCertificateTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectCertificateTransferResult> rejectCertificateTransferAsync(final RejectCertificateTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectCertificateTransferRequest, RejectCertificateTransferResult> asyncHandler) {
        final RejectCertificateTransferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectCertificateTransferResult>() {
            @Override
            public RejectCertificateTransferResult call() throws Exception {
                RejectCertificateTransferResult result = null;

                try {
                    result = executeRejectCertificateTransfer(finalRequest);
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
    public java.util.concurrent.Future<RemoveThingFromThingGroupResult> removeThingFromThingGroupAsync(RemoveThingFromThingGroupRequest request) {

        return removeThingFromThingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveThingFromThingGroupResult> removeThingFromThingGroupAsync(final RemoveThingFromThingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveThingFromThingGroupRequest, RemoveThingFromThingGroupResult> asyncHandler) {
        final RemoveThingFromThingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveThingFromThingGroupResult>() {
            @Override
            public RemoveThingFromThingGroupResult call() throws Exception {
                RemoveThingFromThingGroupResult result = null;

                try {
                    result = executeRemoveThingFromThingGroup(finalRequest);
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
    public java.util.concurrent.Future<ReplaceTopicRuleResult> replaceTopicRuleAsync(ReplaceTopicRuleRequest request) {

        return replaceTopicRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplaceTopicRuleResult> replaceTopicRuleAsync(final ReplaceTopicRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplaceTopicRuleRequest, ReplaceTopicRuleResult> asyncHandler) {
        final ReplaceTopicRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplaceTopicRuleResult>() {
            @Override
            public ReplaceTopicRuleResult call() throws Exception {
                ReplaceTopicRuleResult result = null;

                try {
                    result = executeReplaceTopicRule(finalRequest);
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
    public java.util.concurrent.Future<SearchIndexResult> searchIndexAsync(SearchIndexRequest request) {

        return searchIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchIndexResult> searchIndexAsync(final SearchIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchIndexRequest, SearchIndexResult> asyncHandler) {
        final SearchIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchIndexResult>() {
            @Override
            public SearchIndexResult call() throws Exception {
                SearchIndexResult result = null;

                try {
                    result = executeSearchIndex(finalRequest);
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
    public java.util.concurrent.Future<SetDefaultAuthorizerResult> setDefaultAuthorizerAsync(SetDefaultAuthorizerRequest request) {

        return setDefaultAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultAuthorizerResult> setDefaultAuthorizerAsync(final SetDefaultAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultAuthorizerRequest, SetDefaultAuthorizerResult> asyncHandler) {
        final SetDefaultAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetDefaultAuthorizerResult>() {
            @Override
            public SetDefaultAuthorizerResult call() throws Exception {
                SetDefaultAuthorizerResult result = null;

                try {
                    result = executeSetDefaultAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<SetDefaultPolicyVersionResult> setDefaultPolicyVersionAsync(SetDefaultPolicyVersionRequest request) {

        return setDefaultPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetDefaultPolicyVersionResult> setDefaultPolicyVersionAsync(final SetDefaultPolicyVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, SetDefaultPolicyVersionResult> asyncHandler) {
        final SetDefaultPolicyVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetDefaultPolicyVersionResult>() {
            @Override
            public SetDefaultPolicyVersionResult call() throws Exception {
                SetDefaultPolicyVersionResult result = null;

                try {
                    result = executeSetDefaultPolicyVersion(finalRequest);
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
    public java.util.concurrent.Future<SetLoggingOptionsResult> setLoggingOptionsAsync(SetLoggingOptionsRequest request) {

        return setLoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetLoggingOptionsResult> setLoggingOptionsAsync(final SetLoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetLoggingOptionsRequest, SetLoggingOptionsResult> asyncHandler) {
        final SetLoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetLoggingOptionsResult>() {
            @Override
            public SetLoggingOptionsResult call() throws Exception {
                SetLoggingOptionsResult result = null;

                try {
                    result = executeSetLoggingOptions(finalRequest);
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
    public java.util.concurrent.Future<SetV2LoggingLevelResult> setV2LoggingLevelAsync(SetV2LoggingLevelRequest request) {

        return setV2LoggingLevelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetV2LoggingLevelResult> setV2LoggingLevelAsync(final SetV2LoggingLevelRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetV2LoggingLevelRequest, SetV2LoggingLevelResult> asyncHandler) {
        final SetV2LoggingLevelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetV2LoggingLevelResult>() {
            @Override
            public SetV2LoggingLevelResult call() throws Exception {
                SetV2LoggingLevelResult result = null;

                try {
                    result = executeSetV2LoggingLevel(finalRequest);
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
    public java.util.concurrent.Future<SetV2LoggingOptionsResult> setV2LoggingOptionsAsync(SetV2LoggingOptionsRequest request) {

        return setV2LoggingOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetV2LoggingOptionsResult> setV2LoggingOptionsAsync(final SetV2LoggingOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetV2LoggingOptionsRequest, SetV2LoggingOptionsResult> asyncHandler) {
        final SetV2LoggingOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetV2LoggingOptionsResult>() {
            @Override
            public SetV2LoggingOptionsResult call() throws Exception {
                SetV2LoggingOptionsResult result = null;

                try {
                    result = executeSetV2LoggingOptions(finalRequest);
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
    public java.util.concurrent.Future<StartThingRegistrationTaskResult> startThingRegistrationTaskAsync(StartThingRegistrationTaskRequest request) {

        return startThingRegistrationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartThingRegistrationTaskResult> startThingRegistrationTaskAsync(final StartThingRegistrationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartThingRegistrationTaskRequest, StartThingRegistrationTaskResult> asyncHandler) {
        final StartThingRegistrationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartThingRegistrationTaskResult>() {
            @Override
            public StartThingRegistrationTaskResult call() throws Exception {
                StartThingRegistrationTaskResult result = null;

                try {
                    result = executeStartThingRegistrationTask(finalRequest);
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
    public java.util.concurrent.Future<StopThingRegistrationTaskResult> stopThingRegistrationTaskAsync(StopThingRegistrationTaskRequest request) {

        return stopThingRegistrationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopThingRegistrationTaskResult> stopThingRegistrationTaskAsync(final StopThingRegistrationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopThingRegistrationTaskRequest, StopThingRegistrationTaskResult> asyncHandler) {
        final StopThingRegistrationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopThingRegistrationTaskResult>() {
            @Override
            public StopThingRegistrationTaskResult call() throws Exception {
                StopThingRegistrationTaskResult result = null;

                try {
                    result = executeStopThingRegistrationTask(finalRequest);
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
    public java.util.concurrent.Future<TestAuthorizationResult> testAuthorizationAsync(TestAuthorizationRequest request) {

        return testAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestAuthorizationResult> testAuthorizationAsync(final TestAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestAuthorizationRequest, TestAuthorizationResult> asyncHandler) {
        final TestAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestAuthorizationResult>() {
            @Override
            public TestAuthorizationResult call() throws Exception {
                TestAuthorizationResult result = null;

                try {
                    result = executeTestAuthorization(finalRequest);
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
    public java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(TestInvokeAuthorizerRequest request) {

        return testInvokeAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(final TestInvokeAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestInvokeAuthorizerRequest, TestInvokeAuthorizerResult> asyncHandler) {
        final TestInvokeAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestInvokeAuthorizerResult>() {
            @Override
            public TestInvokeAuthorizerResult call() throws Exception {
                TestInvokeAuthorizerResult result = null;

                try {
                    result = executeTestInvokeAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(TransferCertificateRequest request) {

        return transferCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransferCertificateResult> transferCertificateAsync(final TransferCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<TransferCertificateRequest, TransferCertificateResult> asyncHandler) {
        final TransferCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TransferCertificateResult>() {
            @Override
            public TransferCertificateResult call() throws Exception {
                TransferCertificateResult result = null;

                try {
                    result = executeTransferCertificate(finalRequest);
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
    public java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest request) {

        return updateAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(final UpdateAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAuthorizerRequest, UpdateAuthorizerResult> asyncHandler) {
        final UpdateAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAuthorizerResult>() {
            @Override
            public UpdateAuthorizerResult call() throws Exception {
                UpdateAuthorizerResult result = null;

                try {
                    result = executeUpdateAuthorizer(finalRequest);
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
    public java.util.concurrent.Future<UpdateCACertificateResult> updateCACertificateAsync(UpdateCACertificateRequest request) {

        return updateCACertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCACertificateResult> updateCACertificateAsync(final UpdateCACertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCACertificateRequest, UpdateCACertificateResult> asyncHandler) {
        final UpdateCACertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCACertificateResult>() {
            @Override
            public UpdateCACertificateResult call() throws Exception {
                UpdateCACertificateResult result = null;

                try {
                    result = executeUpdateCACertificate(finalRequest);
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
    public java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(UpdateCertificateRequest request) {

        return updateCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateResult> updateCertificateAsync(final UpdateCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCertificateRequest, UpdateCertificateResult> asyncHandler) {
        final UpdateCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCertificateResult>() {
            @Override
            public UpdateCertificateResult call() throws Exception {
                UpdateCertificateResult result = null;

                try {
                    result = executeUpdateCertificate(finalRequest);
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
    public java.util.concurrent.Future<UpdateEventConfigurationsResult> updateEventConfigurationsAsync(UpdateEventConfigurationsRequest request) {

        return updateEventConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventConfigurationsResult> updateEventConfigurationsAsync(final UpdateEventConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventConfigurationsRequest, UpdateEventConfigurationsResult> asyncHandler) {
        final UpdateEventConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventConfigurationsResult>() {
            @Override
            public UpdateEventConfigurationsResult call() throws Exception {
                UpdateEventConfigurationsResult result = null;

                try {
                    result = executeUpdateEventConfigurations(finalRequest);
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
    public java.util.concurrent.Future<UpdateIndexingConfigurationResult> updateIndexingConfigurationAsync(UpdateIndexingConfigurationRequest request) {

        return updateIndexingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIndexingConfigurationResult> updateIndexingConfigurationAsync(final UpdateIndexingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIndexingConfigurationRequest, UpdateIndexingConfigurationResult> asyncHandler) {
        final UpdateIndexingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIndexingConfigurationResult>() {
            @Override
            public UpdateIndexingConfigurationResult call() throws Exception {
                UpdateIndexingConfigurationResult result = null;

                try {
                    result = executeUpdateIndexingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoleAliasResult> updateRoleAliasAsync(UpdateRoleAliasRequest request) {

        return updateRoleAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoleAliasResult> updateRoleAliasAsync(final UpdateRoleAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoleAliasRequest, UpdateRoleAliasResult> asyncHandler) {
        final UpdateRoleAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoleAliasResult>() {
            @Override
            public UpdateRoleAliasResult call() throws Exception {
                UpdateRoleAliasResult result = null;

                try {
                    result = executeUpdateRoleAlias(finalRequest);
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
    public java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest request) {

        return updateStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(final UpdateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStreamRequest, UpdateStreamResult> asyncHandler) {
        final UpdateStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStreamResult>() {
            @Override
            public UpdateStreamResult call() throws Exception {
                UpdateStreamResult result = null;

                try {
                    result = executeUpdateStream(finalRequest);
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
    public java.util.concurrent.Future<UpdateThingResult> updateThingAsync(UpdateThingRequest request) {

        return updateThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThingResult> updateThingAsync(final UpdateThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThingRequest, UpdateThingResult> asyncHandler) {
        final UpdateThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThingResult>() {
            @Override
            public UpdateThingResult call() throws Exception {
                UpdateThingResult result = null;

                try {
                    result = executeUpdateThing(finalRequest);
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
    public java.util.concurrent.Future<UpdateThingGroupResult> updateThingGroupAsync(UpdateThingGroupRequest request) {

        return updateThingGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThingGroupResult> updateThingGroupAsync(final UpdateThingGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThingGroupRequest, UpdateThingGroupResult> asyncHandler) {
        final UpdateThingGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThingGroupResult>() {
            @Override
            public UpdateThingGroupResult call() throws Exception {
                UpdateThingGroupResult result = null;

                try {
                    result = executeUpdateThingGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateThingGroupsForThingResult> updateThingGroupsForThingAsync(UpdateThingGroupsForThingRequest request) {

        return updateThingGroupsForThingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThingGroupsForThingResult> updateThingGroupsForThingAsync(final UpdateThingGroupsForThingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThingGroupsForThingRequest, UpdateThingGroupsForThingResult> asyncHandler) {
        final UpdateThingGroupsForThingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThingGroupsForThingResult>() {
            @Override
            public UpdateThingGroupsForThingResult call() throws Exception {
                UpdateThingGroupsForThingResult result = null;

                try {
                    result = executeUpdateThingGroupsForThing(finalRequest);
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
