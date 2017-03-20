/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    public java.util.concurrent.Future<AttachPrincipalPolicyResult> attachPrincipalPolicyAsync(AttachPrincipalPolicyRequest request) {

        return attachPrincipalPolicyAsync(request, null);
    }

    @Override
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
    public java.util.concurrent.Future<DetachPrincipalPolicyResult> detachPrincipalPolicyAsync(DetachPrincipalPolicyRequest request) {

        return detachPrincipalPolicyAsync(request, null);
    }

    @Override
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
    public java.util.concurrent.Future<ListPolicyPrincipalsResult> listPolicyPrincipalsAsync(ListPolicyPrincipalsRequest request) {

        return listPolicyPrincipalsAsync(request, null);
    }

    @Override
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
    public java.util.concurrent.Future<ListPrincipalPoliciesResult> listPrincipalPoliciesAsync(ListPrincipalPoliciesRequest request) {

        return listPrincipalPoliciesAsync(request, null);
    }

    @Override
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
