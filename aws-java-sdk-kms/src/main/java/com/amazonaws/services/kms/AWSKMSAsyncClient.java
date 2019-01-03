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
package com.amazonaws.services.kms;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing KMS asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <fullname>AWS Key Management Service</fullname>
 * <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key management web service. This guide describes the AWS
 * KMS operations that you can call programmatically. For general information about AWS KMS, see the <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/"> <i>AWS Key Management Service Developer Guide</i> </a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, macOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS KMS and
 * other AWS services. For example, the SDKs take care of tasks such as signing requests (see below), managing errors,
 * and retrying requests automatically. For more information about the AWS SDKs, including how to download and install
 * them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to AWS KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS 1.2. Clients must also support cipher
 * suites with Perfect Forward Secrecy (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
 * Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We strongly recommend that you <i>do
 * not</i> use your AWS account (root) access key ID and secret key for everyday work with AWS KMS. Instead, use the
 * access key ID and secret access key for an IAM user, or you can use the AWS Security Token Service to generate
 * temporary security credentials that you can use to sign requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and related events for your AWS account and
 * delivers them to an Amazon S3 bucket that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it was made, and so on. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS CloudTrail User Guide</a>.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">AWS Security Credentials</a> -
 * This topic provides general information about the of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>
 * - This section of the <i>IAM User Guide</i> describes how to create and use temporary security credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a> - This set of topics walks you through the process of signing a request using an access key ID and a
 * secret access key.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the most useful for most applications. You will likely
 * perform actions other than these, such as creating keys and assigning policies, by using the console.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>Encrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Decrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyWithoutPlaintext</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSKMSAsyncClient extends AWSKMSClient implements AWSKMSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AWSKMSAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSKMSAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to KMS (ex: proxy settings, retry
     *        counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSKMSAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSKMSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSKMSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSKMSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSKMSAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the specified AWS account credentials
     * provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the provided AWS account credentials
     * provider and client configuration options.
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
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSKMSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSKMSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSKMSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSKMSAsyncClientBuilder asyncBuilder() {
        return AWSKMSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSKMSAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest request) {

        return cancelKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(final CancelKeyDeletionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler) {
        final CancelKeyDeletionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelKeyDeletionResult>() {
            @Override
            public CancelKeyDeletionResult call() throws Exception {
                CancelKeyDeletionResult result = null;

                try {
                    result = executeCancelKeyDeletion(finalRequest);
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
    public java.util.concurrent.Future<ConnectCustomKeyStoreResult> connectCustomKeyStoreAsync(ConnectCustomKeyStoreRequest request) {

        return connectCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConnectCustomKeyStoreResult> connectCustomKeyStoreAsync(final ConnectCustomKeyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConnectCustomKeyStoreRequest, ConnectCustomKeyStoreResult> asyncHandler) {
        final ConnectCustomKeyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConnectCustomKeyStoreResult>() {
            @Override
            public ConnectCustomKeyStoreResult call() throws Exception {
                ConnectCustomKeyStoreResult result = null;

                try {
                    result = executeConnectCustomKeyStore(finalRequest);
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
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {
        final CreateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result = null;

                try {
                    result = executeCreateAlias(finalRequest);
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
    public java.util.concurrent.Future<CreateCustomKeyStoreResult> createCustomKeyStoreAsync(CreateCustomKeyStoreRequest request) {

        return createCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomKeyStoreResult> createCustomKeyStoreAsync(final CreateCustomKeyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomKeyStoreRequest, CreateCustomKeyStoreResult> asyncHandler) {
        final CreateCustomKeyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomKeyStoreResult>() {
            @Override
            public CreateCustomKeyStoreResult call() throws Exception {
                CreateCustomKeyStoreResult result = null;

                try {
                    result = executeCreateCustomKeyStore(finalRequest);
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
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(CreateGrantRequest request) {

        return createGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(final CreateGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler) {
        final CreateGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGrantResult>() {
            @Override
            public CreateGrantResult call() throws Exception {
                CreateGrantResult result = null;

                try {
                    result = executeCreateGrant(finalRequest);
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
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest request) {

        return createKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(final CreateKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {
        final CreateKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyResult>() {
            @Override
            public CreateKeyResult call() throws Exception {
                CreateKeyResult result = null;

                try {
                    result = executeCreateKey(finalRequest);
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
     * Simplified method form for invoking the CreateKey operation.
     *
     * @see #createKeyAsync(CreateKeyRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync() {

        return createKeyAsync(new CreateKeyRequest());
    }

    /**
     * Simplified method form for invoking the CreateKey operation with an AsyncHandler.
     *
     * @see #createKeyAsync(CreateKeyRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {

        return createKeyAsync(new CreateKeyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(DecryptRequest request) {

        return decryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(final DecryptRequest request,
            final com.amazonaws.handlers.AsyncHandler<DecryptRequest, DecryptResult> asyncHandler) {
        final DecryptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DecryptResult>() {
            @Override
            public DecryptResult call() throws Exception {
                DecryptResult result = null;

                try {
                    result = executeDecrypt(finalRequest);
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
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {
        final DeleteAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAliasResult>() {
            @Override
            public DeleteAliasResult call() throws Exception {
                DeleteAliasResult result = null;

                try {
                    result = executeDeleteAlias(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomKeyStoreResult> deleteCustomKeyStoreAsync(DeleteCustomKeyStoreRequest request) {

        return deleteCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomKeyStoreResult> deleteCustomKeyStoreAsync(final DeleteCustomKeyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomKeyStoreRequest, DeleteCustomKeyStoreResult> asyncHandler) {
        final DeleteCustomKeyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomKeyStoreResult>() {
            @Override
            public DeleteCustomKeyStoreResult call() throws Exception {
                DeleteCustomKeyStoreResult result = null;

                try {
                    result = executeDeleteCustomKeyStore(finalRequest);
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
    public java.util.concurrent.Future<DeleteImportedKeyMaterialResult> deleteImportedKeyMaterialAsync(DeleteImportedKeyMaterialRequest request) {

        return deleteImportedKeyMaterialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImportedKeyMaterialResult> deleteImportedKeyMaterialAsync(final DeleteImportedKeyMaterialRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResult> asyncHandler) {
        final DeleteImportedKeyMaterialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImportedKeyMaterialResult>() {
            @Override
            public DeleteImportedKeyMaterialResult call() throws Exception {
                DeleteImportedKeyMaterialResult result = null;

                try {
                    result = executeDeleteImportedKeyMaterial(finalRequest);
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
    public java.util.concurrent.Future<DescribeCustomKeyStoresResult> describeCustomKeyStoresAsync(DescribeCustomKeyStoresRequest request) {

        return describeCustomKeyStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomKeyStoresResult> describeCustomKeyStoresAsync(final DescribeCustomKeyStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomKeyStoresRequest, DescribeCustomKeyStoresResult> asyncHandler) {
        final DescribeCustomKeyStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomKeyStoresResult>() {
            @Override
            public DescribeCustomKeyStoresResult call() throws Exception {
                DescribeCustomKeyStoresResult result = null;

                try {
                    result = executeDescribeCustomKeyStores(finalRequest);
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
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest request) {

        return describeKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(final DescribeKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler) {
        final DescribeKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeKeyResult>() {
            @Override
            public DescribeKeyResult call() throws Exception {
                DescribeKeyResult result = null;

                try {
                    result = executeDescribeKey(finalRequest);
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
    public java.util.concurrent.Future<DisableKeyResult> disableKeyAsync(DisableKeyRequest request) {

        return disableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableKeyResult> disableKeyAsync(final DisableKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableKeyRequest, DisableKeyResult> asyncHandler) {
        final DisableKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableKeyResult>() {
            @Override
            public DisableKeyResult call() throws Exception {
                DisableKeyResult result = null;

                try {
                    result = executeDisableKey(finalRequest);
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
    public java.util.concurrent.Future<DisableKeyRotationResult> disableKeyRotationAsync(DisableKeyRotationRequest request) {

        return disableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableKeyRotationResult> disableKeyRotationAsync(final DisableKeyRotationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableKeyRotationRequest, DisableKeyRotationResult> asyncHandler) {
        final DisableKeyRotationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableKeyRotationResult>() {
            @Override
            public DisableKeyRotationResult call() throws Exception {
                DisableKeyRotationResult result = null;

                try {
                    result = executeDisableKeyRotation(finalRequest);
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
    public java.util.concurrent.Future<DisconnectCustomKeyStoreResult> disconnectCustomKeyStoreAsync(DisconnectCustomKeyStoreRequest request) {

        return disconnectCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectCustomKeyStoreResult> disconnectCustomKeyStoreAsync(final DisconnectCustomKeyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectCustomKeyStoreRequest, DisconnectCustomKeyStoreResult> asyncHandler) {
        final DisconnectCustomKeyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectCustomKeyStoreResult>() {
            @Override
            public DisconnectCustomKeyStoreResult call() throws Exception {
                DisconnectCustomKeyStoreResult result = null;

                try {
                    result = executeDisconnectCustomKeyStore(finalRequest);
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
    public java.util.concurrent.Future<EnableKeyResult> enableKeyAsync(EnableKeyRequest request) {

        return enableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableKeyResult> enableKeyAsync(final EnableKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableKeyRequest, EnableKeyResult> asyncHandler) {
        final EnableKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableKeyResult>() {
            @Override
            public EnableKeyResult call() throws Exception {
                EnableKeyResult result = null;

                try {
                    result = executeEnableKey(finalRequest);
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
    public java.util.concurrent.Future<EnableKeyRotationResult> enableKeyRotationAsync(EnableKeyRotationRequest request) {

        return enableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableKeyRotationResult> enableKeyRotationAsync(final EnableKeyRotationRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableKeyRotationRequest, EnableKeyRotationResult> asyncHandler) {
        final EnableKeyRotationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableKeyRotationResult>() {
            @Override
            public EnableKeyRotationResult call() throws Exception {
                EnableKeyRotationResult result = null;

                try {
                    result = executeEnableKeyRotation(finalRequest);
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
    public java.util.concurrent.Future<EncryptResult> encryptAsync(EncryptRequest request) {

        return encryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EncryptResult> encryptAsync(final EncryptRequest request,
            final com.amazonaws.handlers.AsyncHandler<EncryptRequest, EncryptResult> asyncHandler) {
        final EncryptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EncryptResult>() {
            @Override
            public EncryptResult call() throws Exception {
                EncryptResult result = null;

                try {
                    result = executeEncrypt(finalRequest);
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
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest request) {

        return generateDataKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(final GenerateDataKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler) {
        final GenerateDataKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateDataKeyResult>() {
            @Override
            public GenerateDataKeyResult call() throws Exception {
                GenerateDataKeyResult result = null;

                try {
                    result = executeGenerateDataKey(finalRequest);
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
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest request) {

        return generateDataKeyWithoutPlaintextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            final GenerateDataKeyWithoutPlaintextRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler) {
        final GenerateDataKeyWithoutPlaintextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateDataKeyWithoutPlaintextResult>() {
            @Override
            public GenerateDataKeyWithoutPlaintextResult call() throws Exception {
                GenerateDataKeyWithoutPlaintextResult result = null;

                try {
                    result = executeGenerateDataKeyWithoutPlaintext(finalRequest);
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
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest request) {

        return generateRandomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(final GenerateRandomRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {
        final GenerateRandomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateRandomResult>() {
            @Override
            public GenerateRandomResult call() throws Exception {
                GenerateRandomResult result = null;

                try {
                    result = executeGenerateRandom(finalRequest);
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
     * Simplified method form for invoking the GenerateRandom operation.
     *
     * @see #generateRandomAsync(GenerateRandomRequest)
     */
    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync() {

        return generateRandomAsync(new GenerateRandomRequest());
    }

    /**
     * Simplified method form for invoking the GenerateRandom operation with an AsyncHandler.
     *
     * @see #generateRandomAsync(GenerateRandomRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {

        return generateRandomAsync(new GenerateRandomRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest request) {

        return getKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(final GetKeyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler) {
        final GetKeyPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyPolicyResult>() {
            @Override
            public GetKeyPolicyResult call() throws Exception {
                GetKeyPolicyResult result = null;

                try {
                    result = executeGetKeyPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest request) {

        return getKeyRotationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(final GetKeyRotationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler) {
        final GetKeyRotationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyRotationStatusResult>() {
            @Override
            public GetKeyRotationStatusResult call() throws Exception {
                GetKeyRotationStatusResult result = null;

                try {
                    result = executeGetKeyRotationStatus(finalRequest);
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
    public java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest request) {

        return getParametersForImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(final GetParametersForImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParametersForImportRequest, GetParametersForImportResult> asyncHandler) {
        final GetParametersForImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParametersForImportResult>() {
            @Override
            public GetParametersForImportResult call() throws Exception {
                GetParametersForImportResult result = null;

                try {
                    result = executeGetParametersForImport(finalRequest);
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
    public java.util.concurrent.Future<ImportKeyMaterialResult> importKeyMaterialAsync(ImportKeyMaterialRequest request) {

        return importKeyMaterialAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyMaterialResult> importKeyMaterialAsync(final ImportKeyMaterialRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportKeyMaterialRequest, ImportKeyMaterialResult> asyncHandler) {
        final ImportKeyMaterialRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportKeyMaterialResult>() {
            @Override
            public ImportKeyMaterialResult call() throws Exception {
                ImportKeyMaterialResult result = null;

                try {
                    result = executeImportKeyMaterial(finalRequest);
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
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {
        final ListAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAliasesResult>() {
            @Override
            public ListAliasesResult call() throws Exception {
                ListAliasesResult result = null;

                try {
                    result = executeListAliases(finalRequest);
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
     * Simplified method form for invoking the ListAliases operation.
     *
     * @see #listAliasesAsync(ListAliasesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync() {

        return listAliasesAsync(new ListAliasesRequest());
    }

    /**
     * Simplified method form for invoking the ListAliases operation with an AsyncHandler.
     *
     * @see #listAliasesAsync(ListAliasesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        return listAliasesAsync(new ListAliasesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest request) {

        return listGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(final ListGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler) {
        final ListGrantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGrantsResult>() {
            @Override
            public ListGrantsResult call() throws Exception {
                ListGrantsResult result = null;

                try {
                    result = executeListGrants(finalRequest);
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
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest request) {

        return listKeyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(final ListKeyPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler) {
        final ListKeyPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeyPoliciesResult>() {
            @Override
            public ListKeyPoliciesResult call() throws Exception {
                ListKeyPoliciesResult result = null;

                try {
                    result = executeListKeyPolicies(finalRequest);
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
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest request) {

        return listKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(final ListKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {
        final ListKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeysResult>() {
            @Override
            public ListKeysResult call() throws Exception {
                ListKeysResult result = null;

                try {
                    result = executeListKeys(finalRequest);
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
     * Simplified method form for invoking the ListKeys operation.
     *
     * @see #listKeysAsync(ListKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync() {

        return listKeysAsync(new ListKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListKeys operation with an AsyncHandler.
     *
     * @see #listKeysAsync(ListKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

        return listKeysAsync(new ListKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListResourceTagsResult> listResourceTagsAsync(ListResourceTagsRequest request) {

        return listResourceTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceTagsResult> listResourceTagsAsync(final ListResourceTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceTagsRequest, ListResourceTagsResult> asyncHandler) {
        final ListResourceTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceTagsResult>() {
            @Override
            public ListResourceTagsResult call() throws Exception {
                ListResourceTagsResult result = null;

                try {
                    result = executeListResourceTags(finalRequest);
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
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest request) {

        return listRetirableGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(final ListRetirableGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler) {
        final ListRetirableGrantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRetirableGrantsResult>() {
            @Override
            public ListRetirableGrantsResult call() throws Exception {
                ListRetirableGrantsResult result = null;

                try {
                    result = executeListRetirableGrants(finalRequest);
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
    public java.util.concurrent.Future<PutKeyPolicyResult> putKeyPolicyAsync(PutKeyPolicyRequest request) {

        return putKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKeyPolicyResult> putKeyPolicyAsync(final PutKeyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutKeyPolicyRequest, PutKeyPolicyResult> asyncHandler) {
        final PutKeyPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutKeyPolicyResult>() {
            @Override
            public PutKeyPolicyResult call() throws Exception {
                PutKeyPolicyResult result = null;

                try {
                    result = executePutKeyPolicy(finalRequest);
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
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest request) {

        return reEncryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(final ReEncryptRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler) {
        final ReEncryptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReEncryptResult>() {
            @Override
            public ReEncryptResult call() throws Exception {
                ReEncryptResult result = null;

                try {
                    result = executeReEncrypt(finalRequest);
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
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(RetireGrantRequest request) {

        return retireGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(final RetireGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, RetireGrantResult> asyncHandler) {
        final RetireGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RetireGrantResult>() {
            @Override
            public RetireGrantResult call() throws Exception {
                RetireGrantResult result = null;

                try {
                    result = executeRetireGrant(finalRequest);
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
     * Simplified method form for invoking the RetireGrant operation.
     *
     * @see #retireGrantAsync(RetireGrantRequest)
     */
    @Override
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync() {

        return retireGrantAsync(new RetireGrantRequest());
    }

    /**
     * Simplified method form for invoking the RetireGrant operation with an AsyncHandler.
     *
     * @see #retireGrantAsync(RetireGrantRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<RetireGrantResult> retireGrantAsync(
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, RetireGrantResult> asyncHandler) {

        return retireGrantAsync(new RetireGrantRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RevokeGrantResult> revokeGrantAsync(RevokeGrantRequest request) {

        return revokeGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeGrantResult> revokeGrantAsync(final RevokeGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeGrantRequest, RevokeGrantResult> asyncHandler) {
        final RevokeGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeGrantResult>() {
            @Override
            public RevokeGrantResult call() throws Exception {
                RevokeGrantResult result = null;

                try {
                    result = executeRevokeGrant(finalRequest);
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
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest request) {

        return scheduleKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(final ScheduleKeyDeletionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler) {
        final ScheduleKeyDeletionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ScheduleKeyDeletionResult>() {
            @Override
            public ScheduleKeyDeletionResult call() throws Exception {
                ScheduleKeyDeletionResult result = null;

                try {
                    result = executeScheduleKeyDeletion(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(final UpdateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {
        final UpdateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAliasResult>() {
            @Override
            public UpdateAliasResult call() throws Exception {
                UpdateAliasResult result = null;

                try {
                    result = executeUpdateAlias(finalRequest);
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
    public java.util.concurrent.Future<UpdateCustomKeyStoreResult> updateCustomKeyStoreAsync(UpdateCustomKeyStoreRequest request) {

        return updateCustomKeyStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomKeyStoreResult> updateCustomKeyStoreAsync(final UpdateCustomKeyStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCustomKeyStoreRequest, UpdateCustomKeyStoreResult> asyncHandler) {
        final UpdateCustomKeyStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCustomKeyStoreResult>() {
            @Override
            public UpdateCustomKeyStoreResult call() throws Exception {
                UpdateCustomKeyStoreResult result = null;

                try {
                    result = executeUpdateCustomKeyStore(finalRequest);
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
    public java.util.concurrent.Future<UpdateKeyDescriptionResult> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest request) {

        return updateKeyDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKeyDescriptionResult> updateKeyDescriptionAsync(final UpdateKeyDescriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResult> asyncHandler) {
        final UpdateKeyDescriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKeyDescriptionResult>() {
            @Override
            public UpdateKeyDescriptionResult call() throws Exception {
                UpdateKeyDescriptionResult result = null;

                try {
                    result = executeUpdateKeyDescription(finalRequest);
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
