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
package com.amazonaws.services.simplesystemsmanagement;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon SSM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate management tasks such as collecting
 * system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and securely
 * manage the configuration of your managed instances. A <i>managed instance</i> is any Amazon EC2 instance or
 * on-premises machine in your hybrid environment that has been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For more information, see <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html">Systems Manager
 * Prerequisites</a> in the <i>AWS Systems Manager User Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on Amazon EC2 instances, see the <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon EC2 API Reference</a>. For information about how
 * to use a Query API, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html">Making API Requests</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSimpleSystemsManagementAsyncClient extends AWSSimpleSystemsManagementClient implements AWSSimpleSystemsManagementAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM. A credentials provider chain will
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
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon SSM (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSSimpleSystemsManagementAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the provided AWS account
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
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSSimpleSystemsManagementAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSSimpleSystemsManagementAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSSimpleSystemsManagementAsyncClientBuilder asyncBuilder() {
        return AWSSimpleSystemsManagementAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSimpleSystemsManagementAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {
        final AddTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result = null;

                try {
                    result = executeAddTagsToResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest request) {

        return cancelCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(final CancelCommandRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler) {
        final CancelCommandRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelCommandResult>() {
            @Override
            public CancelCommandResult call() throws Exception {
                CancelCommandResult result = null;

                try {
                    result = executeCancelCommand(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            CancelMaintenanceWindowExecutionRequest request) {

        return cancelMaintenanceWindowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            final CancelMaintenanceWindowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelMaintenanceWindowExecutionRequest, CancelMaintenanceWindowExecutionResult> asyncHandler) {
        final CancelMaintenanceWindowExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelMaintenanceWindowExecutionResult>() {
            @Override
            public CancelMaintenanceWindowExecutionResult call() throws Exception {
                CancelMaintenanceWindowExecutionResult result = null;

                try {
                    result = executeCancelMaintenanceWindowExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateActivationResult> createActivationAsync(CreateActivationRequest request) {

        return createActivationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateActivationResult> createActivationAsync(final CreateActivationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateActivationRequest, CreateActivationResult> asyncHandler) {
        final CreateActivationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateActivationResult>() {
            @Override
            public CreateActivationResult call() throws Exception {
                CreateActivationResult result = null;

                try {
                    result = executeCreateActivation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest request) {

        return createAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(final CreateAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler) {
        final CreateAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssociationResult>() {
            @Override
            public CreateAssociationResult call() throws Exception {
                CreateAssociationResult result = null;

                try {
                    result = executeCreateAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest request) {

        return createAssociationBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(final CreateAssociationBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler) {
        final CreateAssociationBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssociationBatchResult>() {
            @Override
            public CreateAssociationBatchResult call() throws Exception {
                CreateAssociationBatchResult result = null;

                try {
                    result = executeCreateAssociationBatch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest request) {

        return createDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(final CreateDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler) {
        final CreateDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDocumentResult>() {
            @Override
            public CreateDocumentResult call() throws Exception {
                CreateDocumentResult result = null;

                try {
                    result = executeCreateDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(CreateMaintenanceWindowRequest request) {

        return createMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(final CreateMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMaintenanceWindowRequest, CreateMaintenanceWindowResult> asyncHandler) {
        final CreateMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMaintenanceWindowResult>() {
            @Override
            public CreateMaintenanceWindowResult call() throws Exception {
                CreateMaintenanceWindowResult result = null;

                try {
                    result = executeCreateMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreatePatchBaselineResult> createPatchBaselineAsync(CreatePatchBaselineRequest request) {

        return createPatchBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePatchBaselineResult> createPatchBaselineAsync(final CreatePatchBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePatchBaselineRequest, CreatePatchBaselineResult> asyncHandler) {
        final CreatePatchBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePatchBaselineResult>() {
            @Override
            public CreatePatchBaselineResult call() throws Exception {
                CreatePatchBaselineResult result = null;

                try {
                    result = executeCreatePatchBaseline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(CreateResourceDataSyncRequest request) {

        return createResourceDataSyncAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(final CreateResourceDataSyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceDataSyncRequest, CreateResourceDataSyncResult> asyncHandler) {
        final CreateResourceDataSyncRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceDataSyncResult>() {
            @Override
            public CreateResourceDataSyncResult call() throws Exception {
                CreateResourceDataSyncResult result = null;

                try {
                    result = executeCreateResourceDataSync(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(DeleteActivationRequest request) {

        return deleteActivationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(final DeleteActivationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteActivationRequest, DeleteActivationResult> asyncHandler) {
        final DeleteActivationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteActivationResult>() {
            @Override
            public DeleteActivationResult call() throws Exception {
                DeleteActivationResult result = null;

                try {
                    result = executeDeleteActivation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest request) {

        return deleteAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(final DeleteAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler) {
        final DeleteAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssociationResult>() {
            @Override
            public DeleteAssociationResult call() throws Exception {
                DeleteAssociationResult result = null;

                try {
                    result = executeDeleteAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest request) {

        return deleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(final DeleteDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler) {
        final DeleteDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDocumentResult>() {
            @Override
            public DeleteDocumentResult call() throws Exception {
                DeleteDocumentResult result = null;

                try {
                    result = executeDeleteDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteInventoryResult> deleteInventoryAsync(DeleteInventoryRequest request) {

        return deleteInventoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInventoryResult> deleteInventoryAsync(final DeleteInventoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInventoryRequest, DeleteInventoryResult> asyncHandler) {
        final DeleteInventoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInventoryResult>() {
            @Override
            public DeleteInventoryResult call() throws Exception {
                DeleteInventoryResult result = null;

                try {
                    result = executeDeleteInventory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(DeleteMaintenanceWindowRequest request) {

        return deleteMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(final DeleteMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResult> asyncHandler) {
        final DeleteMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMaintenanceWindowResult>() {
            @Override
            public DeleteMaintenanceWindowResult call() throws Exception {
                DeleteMaintenanceWindowResult result = null;

                try {
                    result = executeDeleteMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(DeleteParameterRequest request) {

        return deleteParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(final DeleteParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteParameterRequest, DeleteParameterResult> asyncHandler) {
        final DeleteParameterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteParameterResult>() {
            @Override
            public DeleteParameterResult call() throws Exception {
                DeleteParameterResult result = null;

                try {
                    result = executeDeleteParameter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteParametersResult> deleteParametersAsync(DeleteParametersRequest request) {

        return deleteParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteParametersResult> deleteParametersAsync(final DeleteParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteParametersRequest, DeleteParametersResult> asyncHandler) {
        final DeleteParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteParametersResult>() {
            @Override
            public DeleteParametersResult call() throws Exception {
                DeleteParametersResult result = null;

                try {
                    result = executeDeleteParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeletePatchBaselineResult> deletePatchBaselineAsync(DeletePatchBaselineRequest request) {

        return deletePatchBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePatchBaselineResult> deletePatchBaselineAsync(final DeletePatchBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePatchBaselineRequest, DeletePatchBaselineResult> asyncHandler) {
        final DeletePatchBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePatchBaselineResult>() {
            @Override
            public DeletePatchBaselineResult call() throws Exception {
                DeletePatchBaselineResult result = null;

                try {
                    result = executeDeletePatchBaseline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(DeleteResourceDataSyncRequest request) {

        return deleteResourceDataSyncAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(final DeleteResourceDataSyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceDataSyncRequest, DeleteResourceDataSyncResult> asyncHandler) {
        final DeleteResourceDataSyncRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceDataSyncResult>() {
            @Override
            public DeleteResourceDataSyncResult call() throws Exception {
                DeleteResourceDataSyncResult result = null;

                try {
                    result = executeDeleteResourceDataSync(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(DeregisterManagedInstanceRequest request) {

        return deregisterManagedInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(final DeregisterManagedInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterManagedInstanceRequest, DeregisterManagedInstanceResult> asyncHandler) {
        final DeregisterManagedInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterManagedInstanceResult>() {
            @Override
            public DeregisterManagedInstanceResult call() throws Exception {
                DeregisterManagedInstanceResult result = null;

                try {
                    result = executeDeregisterManagedInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            DeregisterPatchBaselineForPatchGroupRequest request) {

        return deregisterPatchBaselineForPatchGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            final DeregisterPatchBaselineForPatchGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterPatchBaselineForPatchGroupRequest, DeregisterPatchBaselineForPatchGroupResult> asyncHandler) {
        final DeregisterPatchBaselineForPatchGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterPatchBaselineForPatchGroupResult>() {
            @Override
            public DeregisterPatchBaselineForPatchGroupResult call() throws Exception {
                DeregisterPatchBaselineForPatchGroupResult result = null;

                try {
                    result = executeDeregisterPatchBaselineForPatchGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest request) {

        return deregisterTargetFromMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            final DeregisterTargetFromMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTargetFromMaintenanceWindowRequest, DeregisterTargetFromMaintenanceWindowResult> asyncHandler) {
        final DeregisterTargetFromMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTargetFromMaintenanceWindowResult>() {
            @Override
            public DeregisterTargetFromMaintenanceWindowResult call() throws Exception {
                DeregisterTargetFromMaintenanceWindowResult result = null;

                try {
                    result = executeDeregisterTargetFromMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest request) {

        return deregisterTaskFromMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            final DeregisterTaskFromMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTaskFromMaintenanceWindowRequest, DeregisterTaskFromMaintenanceWindowResult> asyncHandler) {
        final DeregisterTaskFromMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTaskFromMaintenanceWindowResult>() {
            @Override
            public DeregisterTaskFromMaintenanceWindowResult call() throws Exception {
                DeregisterTaskFromMaintenanceWindowResult result = null;

                try {
                    result = executeDeregisterTaskFromMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(DescribeActivationsRequest request) {

        return describeActivationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(final DescribeActivationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActivationsRequest, DescribeActivationsResult> asyncHandler) {
        final DescribeActivationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeActivationsResult>() {
            @Override
            public DescribeActivationsResult call() throws Exception {
                DescribeActivationsResult result = null;

                try {
                    result = executeDescribeActivations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest request) {

        return describeAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(final DescribeAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler) {
        final DescribeAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssociationResult>() {
            @Override
            public DescribeAssociationResult call() throws Exception {
                DescribeAssociationResult result = null;

                try {
                    result = executeDescribeAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            DescribeAssociationExecutionTargetsRequest request) {

        return describeAssociationExecutionTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            final DescribeAssociationExecutionTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssociationExecutionTargetsRequest, DescribeAssociationExecutionTargetsResult> asyncHandler) {
        final DescribeAssociationExecutionTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssociationExecutionTargetsResult>() {
            @Override
            public DescribeAssociationExecutionTargetsResult call() throws Exception {
                DescribeAssociationExecutionTargetsResult result = null;

                try {
                    result = executeDescribeAssociationExecutionTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(DescribeAssociationExecutionsRequest request) {

        return describeAssociationExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(
            final DescribeAssociationExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssociationExecutionsRequest, DescribeAssociationExecutionsResult> asyncHandler) {
        final DescribeAssociationExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssociationExecutionsResult>() {
            @Override
            public DescribeAssociationExecutionsResult call() throws Exception {
                DescribeAssociationExecutionsResult result = null;

                try {
                    result = executeDescribeAssociationExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(DescribeAutomationExecutionsRequest request) {

        return describeAutomationExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(final DescribeAutomationExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutomationExecutionsRequest, DescribeAutomationExecutionsResult> asyncHandler) {
        final DescribeAutomationExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAutomationExecutionsResult>() {
            @Override
            public DescribeAutomationExecutionsResult call() throws Exception {
                DescribeAutomationExecutionsResult result = null;

                try {
                    result = executeDescribeAutomationExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            DescribeAutomationStepExecutionsRequest request) {

        return describeAutomationStepExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            final DescribeAutomationStepExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutomationStepExecutionsRequest, DescribeAutomationStepExecutionsResult> asyncHandler) {
        final DescribeAutomationStepExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAutomationStepExecutionsResult>() {
            @Override
            public DescribeAutomationStepExecutionsResult call() throws Exception {
                DescribeAutomationStepExecutionsResult result = null;

                try {
                    result = executeDescribeAutomationStepExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(DescribeAvailablePatchesRequest request) {

        return describeAvailablePatchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(final DescribeAvailablePatchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAvailablePatchesRequest, DescribeAvailablePatchesResult> asyncHandler) {
        final DescribeAvailablePatchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAvailablePatchesResult>() {
            @Override
            public DescribeAvailablePatchesResult call() throws Exception {
                DescribeAvailablePatchesResult result = null;

                try {
                    result = executeDescribeAvailablePatches(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest request) {

        return describeDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(final DescribeDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler) {
        final DescribeDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentResult>() {
            @Override
            public DescribeDocumentResult call() throws Exception {
                DescribeDocumentResult result = null;

                try {
                    result = executeDescribeDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(DescribeDocumentPermissionRequest request) {

        return describeDocumentPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(final DescribeDocumentPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentPermissionRequest, DescribeDocumentPermissionResult> asyncHandler) {
        final DescribeDocumentPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentPermissionResult>() {
            @Override
            public DescribeDocumentPermissionResult call() throws Exception {
                DescribeDocumentPermissionResult result = null;

                try {
                    result = executeDescribeDocumentPermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest request) {

        return describeEffectiveInstanceAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            final DescribeEffectiveInstanceAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEffectiveInstanceAssociationsRequest, DescribeEffectiveInstanceAssociationsResult> asyncHandler) {
        final DescribeEffectiveInstanceAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEffectiveInstanceAssociationsResult>() {
            @Override
            public DescribeEffectiveInstanceAssociationsResult call() throws Exception {
                DescribeEffectiveInstanceAssociationsResult result = null;

                try {
                    result = executeDescribeEffectiveInstanceAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            DescribeEffectivePatchesForPatchBaselineRequest request) {

        return describeEffectivePatchesForPatchBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            final DescribeEffectivePatchesForPatchBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEffectivePatchesForPatchBaselineRequest, DescribeEffectivePatchesForPatchBaselineResult> asyncHandler) {
        final DescribeEffectivePatchesForPatchBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEffectivePatchesForPatchBaselineResult>() {
            @Override
            public DescribeEffectivePatchesForPatchBaselineResult call() throws Exception {
                DescribeEffectivePatchesForPatchBaselineResult result = null;

                try {
                    result = executeDescribeEffectivePatchesForPatchBaseline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest request) {

        return describeInstanceAssociationsStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            final DescribeInstanceAssociationsStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceAssociationsStatusRequest, DescribeInstanceAssociationsStatusResult> asyncHandler) {
        final DescribeInstanceAssociationsStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceAssociationsStatusResult>() {
            @Override
            public DescribeInstanceAssociationsStatusResult call() throws Exception {
                DescribeInstanceAssociationsStatusResult result = null;

                try {
                    result = executeDescribeInstanceAssociationsStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(DescribeInstanceInformationRequest request) {

        return describeInstanceInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(final DescribeInstanceInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler) {
        final DescribeInstanceInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceInformationResult>() {
            @Override
            public DescribeInstanceInformationResult call() throws Exception {
                DescribeInstanceInformationResult result = null;

                try {
                    result = executeDescribeInstanceInformation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(DescribeInstancePatchStatesRequest request) {

        return describeInstancePatchStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(final DescribeInstancePatchStatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancePatchStatesRequest, DescribeInstancePatchStatesResult> asyncHandler) {
        final DescribeInstancePatchStatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancePatchStatesResult>() {
            @Override
            public DescribeInstancePatchStatesResult call() throws Exception {
                DescribeInstancePatchStatesResult result = null;

                try {
                    result = executeDescribeInstancePatchStates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            DescribeInstancePatchStatesForPatchGroupRequest request) {

        return describeInstancePatchStatesForPatchGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            final DescribeInstancePatchStatesForPatchGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancePatchStatesForPatchGroupRequest, DescribeInstancePatchStatesForPatchGroupResult> asyncHandler) {
        final DescribeInstancePatchStatesForPatchGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancePatchStatesForPatchGroupResult>() {
            @Override
            public DescribeInstancePatchStatesForPatchGroupResult call() throws Exception {
                DescribeInstancePatchStatesForPatchGroupResult result = null;

                try {
                    result = executeDescribeInstancePatchStatesForPatchGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(DescribeInstancePatchesRequest request) {

        return describeInstancePatchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(final DescribeInstancePatchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancePatchesRequest, DescribeInstancePatchesResult> asyncHandler) {
        final DescribeInstancePatchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancePatchesResult>() {
            @Override
            public DescribeInstancePatchesResult call() throws Exception {
                DescribeInstancePatchesResult result = null;

                try {
                    result = executeDescribeInstancePatches(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(DescribeInventoryDeletionsRequest request) {

        return describeInventoryDeletionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(final DescribeInventoryDeletionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInventoryDeletionsRequest, DescribeInventoryDeletionsResult> asyncHandler) {
        final DescribeInventoryDeletionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInventoryDeletionsResult>() {
            @Override
            public DescribeInventoryDeletionsResult call() throws Exception {
                DescribeInventoryDeletionsResult result = null;

                try {
                    result = executeDescribeInventoryDeletions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest request) {

        return describeMaintenanceWindowExecutionTaskInvocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            final DescribeMaintenanceWindowExecutionTaskInvocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTaskInvocationsRequest, DescribeMaintenanceWindowExecutionTaskInvocationsResult> asyncHandler) {
        final DescribeMaintenanceWindowExecutionTaskInvocationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowExecutionTaskInvocationsResult>() {
            @Override
            public DescribeMaintenanceWindowExecutionTaskInvocationsResult call() throws Exception {
                DescribeMaintenanceWindowExecutionTaskInvocationsResult result = null;

                try {
                    result = executeDescribeMaintenanceWindowExecutionTaskInvocations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest request) {

        return describeMaintenanceWindowExecutionTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            final DescribeMaintenanceWindowExecutionTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTasksRequest, DescribeMaintenanceWindowExecutionTasksResult> asyncHandler) {
        final DescribeMaintenanceWindowExecutionTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowExecutionTasksResult>() {
            @Override
            public DescribeMaintenanceWindowExecutionTasksResult call() throws Exception {
                DescribeMaintenanceWindowExecutionTasksResult result = null;

                try {
                    result = executeDescribeMaintenanceWindowExecutionTasks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest request) {

        return describeMaintenanceWindowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            final DescribeMaintenanceWindowExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionsRequest, DescribeMaintenanceWindowExecutionsResult> asyncHandler) {
        final DescribeMaintenanceWindowExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowExecutionsResult>() {
            @Override
            public DescribeMaintenanceWindowExecutionsResult call() throws Exception {
                DescribeMaintenanceWindowExecutionsResult result = null;

                try {
                    result = executeDescribeMaintenanceWindowExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            DescribeMaintenanceWindowScheduleRequest request) {

        return describeMaintenanceWindowScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            final DescribeMaintenanceWindowScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowScheduleRequest, DescribeMaintenanceWindowScheduleResult> asyncHandler) {
        final DescribeMaintenanceWindowScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowScheduleResult>() {
            @Override
            public DescribeMaintenanceWindowScheduleResult call() throws Exception {
                DescribeMaintenanceWindowScheduleResult result = null;

                try {
                    result = executeDescribeMaintenanceWindowSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest request) {

        return describeMaintenanceWindowTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            final DescribeMaintenanceWindowTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTargetsRequest, DescribeMaintenanceWindowTargetsResult> asyncHandler) {
        final DescribeMaintenanceWindowTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowTargetsResult>() {
            @Override
            public DescribeMaintenanceWindowTargetsResult call() throws Exception {
                DescribeMaintenanceWindowTargetsResult result = null;

                try {
                    result = executeDescribeMaintenanceWindowTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(DescribeMaintenanceWindowTasksRequest request) {

        return describeMaintenanceWindowTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            final DescribeMaintenanceWindowTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTasksRequest, DescribeMaintenanceWindowTasksResult> asyncHandler) {
        final DescribeMaintenanceWindowTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowTasksResult>() {
            @Override
            public DescribeMaintenanceWindowTasksResult call() throws Exception {
                DescribeMaintenanceWindowTasksResult result = null;

                try {
                    result = executeDescribeMaintenanceWindowTasks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(DescribeMaintenanceWindowsRequest request) {

        return describeMaintenanceWindowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(final DescribeMaintenanceWindowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowsRequest, DescribeMaintenanceWindowsResult> asyncHandler) {
        final DescribeMaintenanceWindowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowsResult>() {
            @Override
            public DescribeMaintenanceWindowsResult call() throws Exception {
                DescribeMaintenanceWindowsResult result = null;

                try {
                    result = executeDescribeMaintenanceWindows(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            DescribeMaintenanceWindowsForTargetRequest request) {

        return describeMaintenanceWindowsForTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            final DescribeMaintenanceWindowsForTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowsForTargetRequest, DescribeMaintenanceWindowsForTargetResult> asyncHandler) {
        final DescribeMaintenanceWindowsForTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowsForTargetResult>() {
            @Override
            public DescribeMaintenanceWindowsForTargetResult call() throws Exception {
                DescribeMaintenanceWindowsForTargetResult result = null;

                try {
                    result = executeDescribeMaintenanceWindowsForTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest request) {

        return describeParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(final DescribeParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler) {
        final DescribeParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeParametersResult>() {
            @Override
            public DescribeParametersResult call() throws Exception {
                DescribeParametersResult result = null;

                try {
                    result = executeDescribeParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(DescribePatchBaselinesRequest request) {

        return describePatchBaselinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(final DescribePatchBaselinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePatchBaselinesRequest, DescribePatchBaselinesResult> asyncHandler) {
        final DescribePatchBaselinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePatchBaselinesResult>() {
            @Override
            public DescribePatchBaselinesResult call() throws Exception {
                DescribePatchBaselinesResult result = null;

                try {
                    result = executeDescribePatchBaselines(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(DescribePatchGroupStateRequest request) {

        return describePatchGroupStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(final DescribePatchGroupStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePatchGroupStateRequest, DescribePatchGroupStateResult> asyncHandler) {
        final DescribePatchGroupStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePatchGroupStateResult>() {
            @Override
            public DescribePatchGroupStateResult call() throws Exception {
                DescribePatchGroupStateResult result = null;

                try {
                    result = executeDescribePatchGroupState(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribePatchGroupsResult> describePatchGroupsAsync(DescribePatchGroupsRequest request) {

        return describePatchGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePatchGroupsResult> describePatchGroupsAsync(final DescribePatchGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePatchGroupsRequest, DescribePatchGroupsResult> asyncHandler) {
        final DescribePatchGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePatchGroupsResult>() {
            @Override
            public DescribePatchGroupsResult call() throws Exception {
                DescribePatchGroupsResult result = null;

                try {
                    result = executeDescribePatchGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest request) {

        return describeSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(final DescribeSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler) {
        final DescribeSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSessionsResult>() {
            @Override
            public DescribeSessionsResult call() throws Exception {
                DescribeSessionsResult result = null;

                try {
                    result = executeDescribeSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(GetAutomationExecutionRequest request) {

        return getAutomationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(final GetAutomationExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAutomationExecutionRequest, GetAutomationExecutionResult> asyncHandler) {
        final GetAutomationExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAutomationExecutionResult>() {
            @Override
            public GetAutomationExecutionResult call() throws Exception {
                GetAutomationExecutionResult result = null;

                try {
                    result = executeGetAutomationExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(GetCommandInvocationRequest request) {

        return getCommandInvocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(final GetCommandInvocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommandInvocationRequest, GetCommandInvocationResult> asyncHandler) {
        final GetCommandInvocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCommandInvocationResult>() {
            @Override
            public GetCommandInvocationResult call() throws Exception {
                GetCommandInvocationResult result = null;

                try {
                    result = executeGetCommandInvocation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetConnectionStatusResult> getConnectionStatusAsync(GetConnectionStatusRequest request) {

        return getConnectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionStatusResult> getConnectionStatusAsync(final GetConnectionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectionStatusRequest, GetConnectionStatusResult> asyncHandler) {
        final GetConnectionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectionStatusResult>() {
            @Override
            public GetConnectionStatusResult call() throws Exception {
                GetConnectionStatusResult result = null;

                try {
                    result = executeGetConnectionStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(GetDefaultPatchBaselineRequest request) {

        return getDefaultPatchBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(final GetDefaultPatchBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDefaultPatchBaselineRequest, GetDefaultPatchBaselineResult> asyncHandler) {
        final GetDefaultPatchBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDefaultPatchBaselineResult>() {
            @Override
            public GetDefaultPatchBaselineResult call() throws Exception {
                GetDefaultPatchBaselineResult result = null;

                try {
                    result = executeGetDefaultPatchBaseline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            GetDeployablePatchSnapshotForInstanceRequest request) {

        return getDeployablePatchSnapshotForInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            final GetDeployablePatchSnapshotForInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeployablePatchSnapshotForInstanceRequest, GetDeployablePatchSnapshotForInstanceResult> asyncHandler) {
        final GetDeployablePatchSnapshotForInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeployablePatchSnapshotForInstanceResult>() {
            @Override
            public GetDeployablePatchSnapshotForInstanceResult call() throws Exception {
                GetDeployablePatchSnapshotForInstanceResult result = null;

                try {
                    result = executeGetDeployablePatchSnapshotForInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest request) {

        return getDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(final GetDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler) {
        final GetDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentResult>() {
            @Override
            public GetDocumentResult call() throws Exception {
                GetDocumentResult result = null;

                try {
                    result = executeGetDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest request) {

        return getInventoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(final GetInventoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInventoryRequest, GetInventoryResult> asyncHandler) {
        final GetInventoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInventoryResult>() {
            @Override
            public GetInventoryResult call() throws Exception {
                GetInventoryResult result = null;

                try {
                    result = executeGetInventory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(GetInventorySchemaRequest request) {

        return getInventorySchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(final GetInventorySchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInventorySchemaRequest, GetInventorySchemaResult> asyncHandler) {
        final GetInventorySchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInventorySchemaResult>() {
            @Override
            public GetInventorySchemaResult call() throws Exception {
                GetInventorySchemaResult result = null;

                try {
                    result = executeGetInventorySchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(GetMaintenanceWindowRequest request) {

        return getMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(final GetMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowRequest, GetMaintenanceWindowResult> asyncHandler) {
        final GetMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowResult>() {
            @Override
            public GetMaintenanceWindowResult call() throws Exception {
                GetMaintenanceWindowResult result = null;

                try {
                    result = executeGetMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(GetMaintenanceWindowExecutionRequest request) {

        return getMaintenanceWindowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            final GetMaintenanceWindowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionRequest, GetMaintenanceWindowExecutionResult> asyncHandler) {
        final GetMaintenanceWindowExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowExecutionResult>() {
            @Override
            public GetMaintenanceWindowExecutionResult call() throws Exception {
                GetMaintenanceWindowExecutionResult result = null;

                try {
                    result = executeGetMaintenanceWindowExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest request) {

        return getMaintenanceWindowExecutionTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            final GetMaintenanceWindowExecutionTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionTaskRequest, GetMaintenanceWindowExecutionTaskResult> asyncHandler) {
        final GetMaintenanceWindowExecutionTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowExecutionTaskResult>() {
            @Override
            public GetMaintenanceWindowExecutionTaskResult call() throws Exception {
                GetMaintenanceWindowExecutionTaskResult result = null;

                try {
                    result = executeGetMaintenanceWindowExecutionTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            GetMaintenanceWindowExecutionTaskInvocationRequest request) {

        return getMaintenanceWindowExecutionTaskInvocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            final GetMaintenanceWindowExecutionTaskInvocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionTaskInvocationRequest, GetMaintenanceWindowExecutionTaskInvocationResult> asyncHandler) {
        final GetMaintenanceWindowExecutionTaskInvocationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowExecutionTaskInvocationResult>() {
            @Override
            public GetMaintenanceWindowExecutionTaskInvocationResult call() throws Exception {
                GetMaintenanceWindowExecutionTaskInvocationResult result = null;

                try {
                    result = executeGetMaintenanceWindowExecutionTaskInvocation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(GetMaintenanceWindowTaskRequest request) {

        return getMaintenanceWindowTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(final GetMaintenanceWindowTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowTaskRequest, GetMaintenanceWindowTaskResult> asyncHandler) {
        final GetMaintenanceWindowTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowTaskResult>() {
            @Override
            public GetMaintenanceWindowTaskResult call() throws Exception {
                GetMaintenanceWindowTaskResult result = null;

                try {
                    result = executeGetMaintenanceWindowTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetParameterResult> getParameterAsync(GetParameterRequest request) {

        return getParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParameterResult> getParameterAsync(final GetParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParameterRequest, GetParameterResult> asyncHandler) {
        final GetParameterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParameterResult>() {
            @Override
            public GetParameterResult call() throws Exception {
                GetParameterResult result = null;

                try {
                    result = executeGetParameter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(GetParameterHistoryRequest request) {

        return getParameterHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(final GetParameterHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParameterHistoryRequest, GetParameterHistoryResult> asyncHandler) {
        final GetParameterHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParameterHistoryResult>() {
            @Override
            public GetParameterHistoryResult call() throws Exception {
                GetParameterHistoryResult result = null;

                try {
                    result = executeGetParameterHistory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetParametersResult> getParametersAsync(GetParametersRequest request) {

        return getParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersResult> getParametersAsync(final GetParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParametersRequest, GetParametersResult> asyncHandler) {
        final GetParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParametersResult>() {
            @Override
            public GetParametersResult call() throws Exception {
                GetParametersResult result = null;

                try {
                    result = executeGetParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetParametersByPathResult> getParametersByPathAsync(GetParametersByPathRequest request) {

        return getParametersByPathAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersByPathResult> getParametersByPathAsync(final GetParametersByPathRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParametersByPathRequest, GetParametersByPathResult> asyncHandler) {
        final GetParametersByPathRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParametersByPathResult>() {
            @Override
            public GetParametersByPathResult call() throws Exception {
                GetParametersByPathResult result = null;

                try {
                    result = executeGetParametersByPath(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetPatchBaselineResult> getPatchBaselineAsync(GetPatchBaselineRequest request) {

        return getPatchBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPatchBaselineResult> getPatchBaselineAsync(final GetPatchBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPatchBaselineRequest, GetPatchBaselineResult> asyncHandler) {
        final GetPatchBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPatchBaselineResult>() {
            @Override
            public GetPatchBaselineResult call() throws Exception {
                GetPatchBaselineResult result = null;

                try {
                    result = executeGetPatchBaseline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(GetPatchBaselineForPatchGroupRequest request) {

        return getPatchBaselineForPatchGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(
            final GetPatchBaselineForPatchGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPatchBaselineForPatchGroupRequest, GetPatchBaselineForPatchGroupResult> asyncHandler) {
        final GetPatchBaselineForPatchGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPatchBaselineForPatchGroupResult>() {
            @Override
            public GetPatchBaselineForPatchGroupResult call() throws Exception {
                GetPatchBaselineForPatchGroupResult result = null;

                try {
                    result = executeGetPatchBaselineForPatchGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetServiceSettingResult> getServiceSettingAsync(GetServiceSettingRequest request) {

        return getServiceSettingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceSettingResult> getServiceSettingAsync(final GetServiceSettingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceSettingRequest, GetServiceSettingResult> asyncHandler) {
        final GetServiceSettingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceSettingResult>() {
            @Override
            public GetServiceSettingResult call() throws Exception {
                GetServiceSettingResult result = null;

                try {
                    result = executeGetServiceSetting(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<LabelParameterVersionResult> labelParameterVersionAsync(LabelParameterVersionRequest request) {

        return labelParameterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LabelParameterVersionResult> labelParameterVersionAsync(final LabelParameterVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<LabelParameterVersionRequest, LabelParameterVersionResult> asyncHandler) {
        final LabelParameterVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LabelParameterVersionResult>() {
            @Override
            public LabelParameterVersionResult call() throws Exception {
                LabelParameterVersionResult result = null;

                try {
                    result = executeLabelParameterVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListAssociationVersionsResult> listAssociationVersionsAsync(ListAssociationVersionsRequest request) {

        return listAssociationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationVersionsResult> listAssociationVersionsAsync(final ListAssociationVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociationVersionsRequest, ListAssociationVersionsResult> asyncHandler) {
        final ListAssociationVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociationVersionsResult>() {
            @Override
            public ListAssociationVersionsResult call() throws Exception {
                ListAssociationVersionsResult result = null;

                try {
                    result = executeListAssociationVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest request) {

        return listAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(final ListAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler) {
        final ListAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociationsResult>() {
            @Override
            public ListAssociationsResult call() throws Exception {
                ListAssociationsResult result = null;

                try {
                    result = executeListAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(ListCommandInvocationsRequest request) {

        return listCommandInvocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(final ListCommandInvocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler) {
        final ListCommandInvocationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCommandInvocationsResult>() {
            @Override
            public ListCommandInvocationsResult call() throws Exception {
                ListCommandInvocationsResult result = null;

                try {
                    result = executeListCommandInvocations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest request) {

        return listCommandsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(final ListCommandsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler) {
        final ListCommandsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCommandsResult>() {
            @Override
            public ListCommandsResult call() throws Exception {
                ListCommandsResult result = null;

                try {
                    result = executeListCommands(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListComplianceItemsResult> listComplianceItemsAsync(ListComplianceItemsRequest request) {

        return listComplianceItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComplianceItemsResult> listComplianceItemsAsync(final ListComplianceItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComplianceItemsRequest, ListComplianceItemsResult> asyncHandler) {
        final ListComplianceItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComplianceItemsResult>() {
            @Override
            public ListComplianceItemsResult call() throws Exception {
                ListComplianceItemsResult result = null;

                try {
                    result = executeListComplianceItems(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListComplianceSummariesResult> listComplianceSummariesAsync(ListComplianceSummariesRequest request) {

        return listComplianceSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListComplianceSummariesResult> listComplianceSummariesAsync(final ListComplianceSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListComplianceSummariesRequest, ListComplianceSummariesResult> asyncHandler) {
        final ListComplianceSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListComplianceSummariesResult>() {
            @Override
            public ListComplianceSummariesResult call() throws Exception {
                ListComplianceSummariesResult result = null;

                try {
                    result = executeListComplianceSummaries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(ListDocumentVersionsRequest request) {

        return listDocumentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(final ListDocumentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentVersionsRequest, ListDocumentVersionsResult> asyncHandler) {
        final ListDocumentVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDocumentVersionsResult>() {
            @Override
            public ListDocumentVersionsResult call() throws Exception {
                ListDocumentVersionsResult result = null;

                try {
                    result = executeListDocumentVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest request) {

        return listDocumentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(final ListDocumentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {
        final ListDocumentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDocumentsResult>() {
            @Override
            public ListDocumentsResult call() throws Exception {
                ListDocumentsResult result = null;

                try {
                    result = executeListDocuments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync() {

        return listDocumentsAsync(new ListDocumentsRequest());
    }

    /**
     * Simplified method form for invoking the ListDocuments operation with an AsyncHandler.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {

        return listDocumentsAsync(new ListDocumentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListInventoryEntriesResult> listInventoryEntriesAsync(ListInventoryEntriesRequest request) {

        return listInventoryEntriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInventoryEntriesResult> listInventoryEntriesAsync(final ListInventoryEntriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInventoryEntriesRequest, ListInventoryEntriesResult> asyncHandler) {
        final ListInventoryEntriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInventoryEntriesResult>() {
            @Override
            public ListInventoryEntriesResult call() throws Exception {
                ListInventoryEntriesResult result = null;

                try {
                    result = executeListInventoryEntries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            ListResourceComplianceSummariesRequest request) {

        return listResourceComplianceSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            final ListResourceComplianceSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceComplianceSummariesRequest, ListResourceComplianceSummariesResult> asyncHandler) {
        final ListResourceComplianceSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceComplianceSummariesResult>() {
            @Override
            public ListResourceComplianceSummariesResult call() throws Exception {
                ListResourceComplianceSummariesResult result = null;

                try {
                    result = executeListResourceComplianceSummaries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListResourceDataSyncResult> listResourceDataSyncAsync(ListResourceDataSyncRequest request) {

        return listResourceDataSyncAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceDataSyncResult> listResourceDataSyncAsync(final ListResourceDataSyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceDataSyncRequest, ListResourceDataSyncResult> asyncHandler) {
        final ListResourceDataSyncRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceDataSyncResult>() {
            @Override
            public ListResourceDataSyncResult call() throws Exception {
                ListResourceDataSyncResult result = null;

                try {
                    result = executeListResourceDataSync(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(ModifyDocumentPermissionRequest request) {

        return modifyDocumentPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(final ModifyDocumentPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDocumentPermissionRequest, ModifyDocumentPermissionResult> asyncHandler) {
        final ModifyDocumentPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyDocumentPermissionResult>() {
            @Override
            public ModifyDocumentPermissionResult call() throws Exception {
                ModifyDocumentPermissionResult result = null;

                try {
                    result = executeModifyDocumentPermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<PutComplianceItemsResult> putComplianceItemsAsync(PutComplianceItemsRequest request) {

        return putComplianceItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutComplianceItemsResult> putComplianceItemsAsync(final PutComplianceItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutComplianceItemsRequest, PutComplianceItemsResult> asyncHandler) {
        final PutComplianceItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutComplianceItemsResult>() {
            @Override
            public PutComplianceItemsResult call() throws Exception {
                PutComplianceItemsResult result = null;

                try {
                    result = executePutComplianceItems(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest request) {

        return putInventoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(final PutInventoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutInventoryRequest, PutInventoryResult> asyncHandler) {
        final PutInventoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutInventoryResult>() {
            @Override
            public PutInventoryResult call() throws Exception {
                PutInventoryResult result = null;

                try {
                    result = executePutInventory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<PutParameterResult> putParameterAsync(PutParameterRequest request) {

        return putParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutParameterResult> putParameterAsync(final PutParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutParameterRequest, PutParameterResult> asyncHandler) {
        final PutParameterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutParameterResult>() {
            @Override
            public PutParameterResult call() throws Exception {
                PutParameterResult result = null;

                try {
                    result = executePutParameter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(RegisterDefaultPatchBaselineRequest request) {

        return registerDefaultPatchBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(final RegisterDefaultPatchBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterDefaultPatchBaselineRequest, RegisterDefaultPatchBaselineResult> asyncHandler) {
        final RegisterDefaultPatchBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterDefaultPatchBaselineResult>() {
            @Override
            public RegisterDefaultPatchBaselineResult call() throws Exception {
                RegisterDefaultPatchBaselineResult result = null;

                try {
                    result = executeRegisterDefaultPatchBaseline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            RegisterPatchBaselineForPatchGroupRequest request) {

        return registerPatchBaselineForPatchGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            final RegisterPatchBaselineForPatchGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterPatchBaselineForPatchGroupRequest, RegisterPatchBaselineForPatchGroupResult> asyncHandler) {
        final RegisterPatchBaselineForPatchGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterPatchBaselineForPatchGroupResult>() {
            @Override
            public RegisterPatchBaselineForPatchGroupResult call() throws Exception {
                RegisterPatchBaselineForPatchGroupResult result = null;

                try {
                    result = executeRegisterPatchBaselineForPatchGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest request) {

        return registerTargetWithMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            final RegisterTargetWithMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTargetWithMaintenanceWindowRequest, RegisterTargetWithMaintenanceWindowResult> asyncHandler) {
        final RegisterTargetWithMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterTargetWithMaintenanceWindowResult>() {
            @Override
            public RegisterTargetWithMaintenanceWindowResult call() throws Exception {
                RegisterTargetWithMaintenanceWindowResult result = null;

                try {
                    result = executeRegisterTargetWithMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest request) {

        return registerTaskWithMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            final RegisterTaskWithMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTaskWithMaintenanceWindowRequest, RegisterTaskWithMaintenanceWindowResult> asyncHandler) {
        final RegisterTaskWithMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterTaskWithMaintenanceWindowResult>() {
            @Override
            public RegisterTaskWithMaintenanceWindowResult call() throws Exception {
                RegisterTaskWithMaintenanceWindowResult result = null;

                try {
                    result = executeRegisterTaskWithMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {
        final RemoveTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result = null;

                try {
                    result = executeRemoveTagsFromResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ResetServiceSettingResult> resetServiceSettingAsync(ResetServiceSettingRequest request) {

        return resetServiceSettingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetServiceSettingResult> resetServiceSettingAsync(final ResetServiceSettingRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetServiceSettingRequest, ResetServiceSettingResult> asyncHandler) {
        final ResetServiceSettingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetServiceSettingResult>() {
            @Override
            public ResetServiceSettingResult call() throws Exception {
                ResetServiceSettingResult result = null;

                try {
                    result = executeResetServiceSetting(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ResumeSessionResult> resumeSessionAsync(ResumeSessionRequest request) {

        return resumeSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeSessionResult> resumeSessionAsync(final ResumeSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeSessionRequest, ResumeSessionResult> asyncHandler) {
        final ResumeSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeSessionResult>() {
            @Override
            public ResumeSessionResult call() throws Exception {
                ResumeSessionResult result = null;

                try {
                    result = executeResumeSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<SendAutomationSignalResult> sendAutomationSignalAsync(SendAutomationSignalRequest request) {

        return sendAutomationSignalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendAutomationSignalResult> sendAutomationSignalAsync(final SendAutomationSignalRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendAutomationSignalRequest, SendAutomationSignalResult> asyncHandler) {
        final SendAutomationSignalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendAutomationSignalResult>() {
            @Override
            public SendAutomationSignalResult call() throws Exception {
                SendAutomationSignalResult result = null;

                try {
                    result = executeSendAutomationSignal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest request) {

        return sendCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(final SendCommandRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler) {
        final SendCommandRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendCommandResult>() {
            @Override
            public SendCommandResult call() throws Exception {
                SendCommandResult result = null;

                try {
                    result = executeSendCommand(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<StartAssociationsOnceResult> startAssociationsOnceAsync(StartAssociationsOnceRequest request) {

        return startAssociationsOnceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAssociationsOnceResult> startAssociationsOnceAsync(final StartAssociationsOnceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAssociationsOnceRequest, StartAssociationsOnceResult> asyncHandler) {
        final StartAssociationsOnceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAssociationsOnceResult>() {
            @Override
            public StartAssociationsOnceResult call() throws Exception {
                StartAssociationsOnceResult result = null;

                try {
                    result = executeStartAssociationsOnce(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(StartAutomationExecutionRequest request) {

        return startAutomationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(final StartAutomationExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAutomationExecutionRequest, StartAutomationExecutionResult> asyncHandler) {
        final StartAutomationExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAutomationExecutionResult>() {
            @Override
            public StartAutomationExecutionResult call() throws Exception {
                StartAutomationExecutionResult result = null;

                try {
                    result = executeStartAutomationExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<StartSessionResult> startSessionAsync(StartSessionRequest request) {

        return startSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSessionResult> startSessionAsync(final StartSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSessionRequest, StartSessionResult> asyncHandler) {
        final StartSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSessionResult>() {
            @Override
            public StartSessionResult call() throws Exception {
                StartSessionResult result = null;

                try {
                    result = executeStartSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(StopAutomationExecutionRequest request) {

        return stopAutomationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(final StopAutomationExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAutomationExecutionRequest, StopAutomationExecutionResult> asyncHandler) {
        final StopAutomationExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopAutomationExecutionResult>() {
            @Override
            public StopAutomationExecutionResult call() throws Exception {
                StopAutomationExecutionResult result = null;

                try {
                    result = executeStopAutomationExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(TerminateSessionRequest request) {

        return terminateSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(final TerminateSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateSessionRequest, TerminateSessionResult> asyncHandler) {
        final TerminateSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TerminateSessionResult>() {
            @Override
            public TerminateSessionResult call() throws Exception {
                TerminateSessionResult result = null;

                try {
                    result = executeTerminateSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(UpdateAssociationRequest request) {

        return updateAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(final UpdateAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssociationRequest, UpdateAssociationResult> asyncHandler) {
        final UpdateAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssociationResult>() {
            @Override
            public UpdateAssociationResult call() throws Exception {
                UpdateAssociationResult result = null;

                try {
                    result = executeUpdateAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest request) {

        return updateAssociationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(final UpdateAssociationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler) {
        final UpdateAssociationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssociationStatusResult>() {
            @Override
            public UpdateAssociationStatusResult call() throws Exception {
                UpdateAssociationStatusResult result = null;

                try {
                    result = executeUpdateAssociationStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest request) {

        return updateDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(final UpdateDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler) {
        final UpdateDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentResult>() {
            @Override
            public UpdateDocumentResult call() throws Exception {
                UpdateDocumentResult result = null;

                try {
                    result = executeUpdateDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(UpdateDocumentDefaultVersionRequest request) {

        return updateDocumentDefaultVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(final UpdateDocumentDefaultVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentDefaultVersionRequest, UpdateDocumentDefaultVersionResult> asyncHandler) {
        final UpdateDocumentDefaultVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentDefaultVersionResult>() {
            @Override
            public UpdateDocumentDefaultVersionResult call() throws Exception {
                UpdateDocumentDefaultVersionResult result = null;

                try {
                    result = executeUpdateDocumentDefaultVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(UpdateMaintenanceWindowRequest request) {

        return updateMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(final UpdateMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResult> asyncHandler) {
        final UpdateMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMaintenanceWindowResult>() {
            @Override
            public UpdateMaintenanceWindowResult call() throws Exception {
                UpdateMaintenanceWindowResult result = null;

                try {
                    result = executeUpdateMaintenanceWindow(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(UpdateMaintenanceWindowTargetRequest request) {

        return updateMaintenanceWindowTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(
            final UpdateMaintenanceWindowTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowTargetRequest, UpdateMaintenanceWindowTargetResult> asyncHandler) {
        final UpdateMaintenanceWindowTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMaintenanceWindowTargetResult>() {
            @Override
            public UpdateMaintenanceWindowTargetResult call() throws Exception {
                UpdateMaintenanceWindowTargetResult result = null;

                try {
                    result = executeUpdateMaintenanceWindowTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(UpdateMaintenanceWindowTaskRequest request) {

        return updateMaintenanceWindowTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(final UpdateMaintenanceWindowTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowTaskRequest, UpdateMaintenanceWindowTaskResult> asyncHandler) {
        final UpdateMaintenanceWindowTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMaintenanceWindowTaskResult>() {
            @Override
            public UpdateMaintenanceWindowTaskResult call() throws Exception {
                UpdateMaintenanceWindowTaskResult result = null;

                try {
                    result = executeUpdateMaintenanceWindowTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(UpdateManagedInstanceRoleRequest request) {

        return updateManagedInstanceRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(final UpdateManagedInstanceRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateManagedInstanceRoleRequest, UpdateManagedInstanceRoleResult> asyncHandler) {
        final UpdateManagedInstanceRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateManagedInstanceRoleResult>() {
            @Override
            public UpdateManagedInstanceRoleResult call() throws Exception {
                UpdateManagedInstanceRoleResult result = null;

                try {
                    result = executeUpdateManagedInstanceRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(UpdatePatchBaselineRequest request) {

        return updatePatchBaselineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(final UpdatePatchBaselineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePatchBaselineRequest, UpdatePatchBaselineResult> asyncHandler) {
        final UpdatePatchBaselineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePatchBaselineResult>() {
            @Override
            public UpdatePatchBaselineResult call() throws Exception {
                UpdatePatchBaselineResult result = null;

                try {
                    result = executeUpdatePatchBaseline(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateServiceSettingResult> updateServiceSettingAsync(UpdateServiceSettingRequest request) {

        return updateServiceSettingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceSettingResult> updateServiceSettingAsync(final UpdateServiceSettingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceSettingRequest, UpdateServiceSettingResult> asyncHandler) {
        final UpdateServiceSettingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceSettingResult>() {
            @Override
            public UpdateServiceSettingResult call() throws Exception {
                UpdateServiceSettingResult result = null;

                try {
                    result = executeUpdateServiceSetting(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
