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
package com.amazonaws.services.simplesystemsmanagement;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon SSM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EC2 Systems Manager is a collection of capabilities that helps you automate management tasks such as
 * collecting system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images
 * (AMIs), and configuring operating systems (OSs) and applications at scale. Systems Manager works with managed
 * instances: Amazon EC2 instances and servers or virtual machines (VMs) in your on-premises environment that are
 * configured for Systems Manager.
 * </p>
 * <p>
 * This references is intended to be used with the EC2 Systems Manager User Guide (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/systems-manager.html">Linux</a>) (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/systems-manager.html">Windows</a>).
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/systems-manager-prereqs.html">Linux</a>) (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/systems-manager-prereqs.html">Windows</a>).
 * </p>
 */
@ThreadSafe
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
     */
    public AWSSimpleSystemsManagementAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SSM using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSSimpleSystemsManagementAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result;

                try {
                    result = addTagsToResource(request);
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
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest request) {

        return cancelCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(final CancelCommandRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CancelCommandResult>() {
            @Override
            public CancelCommandResult call() throws Exception {
                CancelCommandResult result;

                try {
                    result = cancelCommand(request);
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
    public java.util.concurrent.Future<CreateActivationResult> createActivationAsync(CreateActivationRequest request) {

        return createActivationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateActivationResult> createActivationAsync(final CreateActivationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateActivationRequest, CreateActivationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateActivationResult>() {
            @Override
            public CreateActivationResult call() throws Exception {
                CreateActivationResult result;

                try {
                    result = createActivation(request);
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
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest request) {

        return createAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(final CreateAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAssociationResult>() {
            @Override
            public CreateAssociationResult call() throws Exception {
                CreateAssociationResult result;

                try {
                    result = createAssociation(request);
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
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest request) {

        return createAssociationBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(final CreateAssociationBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAssociationBatchResult>() {
            @Override
            public CreateAssociationBatchResult call() throws Exception {
                CreateAssociationBatchResult result;

                try {
                    result = createAssociationBatch(request);
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
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest request) {

        return createDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(final CreateDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDocumentResult>() {
            @Override
            public CreateDocumentResult call() throws Exception {
                CreateDocumentResult result;

                try {
                    result = createDocument(request);
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
    public java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(CreateMaintenanceWindowRequest request) {

        return createMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(final CreateMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMaintenanceWindowRequest, CreateMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateMaintenanceWindowResult>() {
            @Override
            public CreateMaintenanceWindowResult call() throws Exception {
                CreateMaintenanceWindowResult result;

                try {
                    result = createMaintenanceWindow(request);
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
    public java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(DeleteActivationRequest request) {

        return deleteActivationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(final DeleteActivationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteActivationRequest, DeleteActivationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteActivationResult>() {
            @Override
            public DeleteActivationResult call() throws Exception {
                DeleteActivationResult result;

                try {
                    result = deleteActivation(request);
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
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest request) {

        return deleteAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(final DeleteAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssociationResult>() {
            @Override
            public DeleteAssociationResult call() throws Exception {
                DeleteAssociationResult result;

                try {
                    result = deleteAssociation(request);
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
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest request) {

        return deleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(final DeleteDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDocumentResult>() {
            @Override
            public DeleteDocumentResult call() throws Exception {
                DeleteDocumentResult result;

                try {
                    result = deleteDocument(request);
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
    public java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(DeleteMaintenanceWindowRequest request) {

        return deleteMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(final DeleteMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteMaintenanceWindowResult>() {
            @Override
            public DeleteMaintenanceWindowResult call() throws Exception {
                DeleteMaintenanceWindowResult result;

                try {
                    result = deleteMaintenanceWindow(request);
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
    public java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(DeleteParameterRequest request) {

        return deleteParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(final DeleteParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteParameterRequest, DeleteParameterResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteParameterResult>() {
            @Override
            public DeleteParameterResult call() throws Exception {
                DeleteParameterResult result;

                try {
                    result = deleteParameter(request);
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
    public java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(DeregisterManagedInstanceRequest request) {

        return deregisterManagedInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(final DeregisterManagedInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterManagedInstanceRequest, DeregisterManagedInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeregisterManagedInstanceResult>() {
            @Override
            public DeregisterManagedInstanceResult call() throws Exception {
                DeregisterManagedInstanceResult result;

                try {
                    result = deregisterManagedInstance(request);
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
    public java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest request) {

        return deregisterTargetFromMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            final DeregisterTargetFromMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTargetFromMaintenanceWindowRequest, DeregisterTargetFromMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTargetFromMaintenanceWindowResult>() {
            @Override
            public DeregisterTargetFromMaintenanceWindowResult call() throws Exception {
                DeregisterTargetFromMaintenanceWindowResult result;

                try {
                    result = deregisterTargetFromMaintenanceWindow(request);
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
    public java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest request) {

        return deregisterTaskFromMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            final DeregisterTaskFromMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTaskFromMaintenanceWindowRequest, DeregisterTaskFromMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTaskFromMaintenanceWindowResult>() {
            @Override
            public DeregisterTaskFromMaintenanceWindowResult call() throws Exception {
                DeregisterTaskFromMaintenanceWindowResult result;

                try {
                    result = deregisterTaskFromMaintenanceWindow(request);
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
    public java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(DescribeActivationsRequest request) {

        return describeActivationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(final DescribeActivationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActivationsRequest, DescribeActivationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeActivationsResult>() {
            @Override
            public DescribeActivationsResult call() throws Exception {
                DescribeActivationsResult result;

                try {
                    result = describeActivations(request);
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
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest request) {

        return describeAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(final DescribeAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAssociationResult>() {
            @Override
            public DescribeAssociationResult call() throws Exception {
                DescribeAssociationResult result;

                try {
                    result = describeAssociation(request);
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
    public java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(DescribeAutomationExecutionsRequest request) {

        return describeAutomationExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(final DescribeAutomationExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAutomationExecutionsRequest, DescribeAutomationExecutionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAutomationExecutionsResult>() {
            @Override
            public DescribeAutomationExecutionsResult call() throws Exception {
                DescribeAutomationExecutionsResult result;

                try {
                    result = describeAutomationExecutions(request);
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
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest request) {

        return describeDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(final DescribeDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentResult>() {
            @Override
            public DescribeDocumentResult call() throws Exception {
                DescribeDocumentResult result;

                try {
                    result = describeDocument(request);
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
    public java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(DescribeDocumentPermissionRequest request) {

        return describeDocumentPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(final DescribeDocumentPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentPermissionRequest, DescribeDocumentPermissionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentPermissionResult>() {
            @Override
            public DescribeDocumentPermissionResult call() throws Exception {
                DescribeDocumentPermissionResult result;

                try {
                    result = describeDocumentPermission(request);
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
    public java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest request) {

        return describeEffectiveInstanceAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            final DescribeEffectiveInstanceAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEffectiveInstanceAssociationsRequest, DescribeEffectiveInstanceAssociationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeEffectiveInstanceAssociationsResult>() {
            @Override
            public DescribeEffectiveInstanceAssociationsResult call() throws Exception {
                DescribeEffectiveInstanceAssociationsResult result;

                try {
                    result = describeEffectiveInstanceAssociations(request);
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
    public java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest request) {

        return describeInstanceAssociationsStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            final DescribeInstanceAssociationsStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceAssociationsStatusRequest, DescribeInstanceAssociationsStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceAssociationsStatusResult>() {
            @Override
            public DescribeInstanceAssociationsStatusResult call() throws Exception {
                DescribeInstanceAssociationsStatusResult result;

                try {
                    result = describeInstanceAssociationsStatus(request);
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
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(DescribeInstanceInformationRequest request) {

        return describeInstanceInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(final DescribeInstanceInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceInformationResult>() {
            @Override
            public DescribeInstanceInformationResult call() throws Exception {
                DescribeInstanceInformationResult result;

                try {
                    result = describeInstanceInformation(request);
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest request) {

        return describeMaintenanceWindowExecutionTaskInvocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            final DescribeMaintenanceWindowExecutionTaskInvocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTaskInvocationsRequest, DescribeMaintenanceWindowExecutionTaskInvocationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowExecutionTaskInvocationsResult>() {
            @Override
            public DescribeMaintenanceWindowExecutionTaskInvocationsResult call() throws Exception {
                DescribeMaintenanceWindowExecutionTaskInvocationsResult result;

                try {
                    result = describeMaintenanceWindowExecutionTaskInvocations(request);
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest request) {

        return describeMaintenanceWindowExecutionTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            final DescribeMaintenanceWindowExecutionTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTasksRequest, DescribeMaintenanceWindowExecutionTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowExecutionTasksResult>() {
            @Override
            public DescribeMaintenanceWindowExecutionTasksResult call() throws Exception {
                DescribeMaintenanceWindowExecutionTasksResult result;

                try {
                    result = describeMaintenanceWindowExecutionTasks(request);
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest request) {

        return describeMaintenanceWindowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            final DescribeMaintenanceWindowExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionsRequest, DescribeMaintenanceWindowExecutionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowExecutionsResult>() {
            @Override
            public DescribeMaintenanceWindowExecutionsResult call() throws Exception {
                DescribeMaintenanceWindowExecutionsResult result;

                try {
                    result = describeMaintenanceWindowExecutions(request);
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest request) {

        return describeMaintenanceWindowTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            final DescribeMaintenanceWindowTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTargetsRequest, DescribeMaintenanceWindowTargetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowTargetsResult>() {
            @Override
            public DescribeMaintenanceWindowTargetsResult call() throws Exception {
                DescribeMaintenanceWindowTargetsResult result;

                try {
                    result = describeMaintenanceWindowTargets(request);
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(DescribeMaintenanceWindowTasksRequest request) {

        return describeMaintenanceWindowTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            final DescribeMaintenanceWindowTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTasksRequest, DescribeMaintenanceWindowTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowTasksResult>() {
            @Override
            public DescribeMaintenanceWindowTasksResult call() throws Exception {
                DescribeMaintenanceWindowTasksResult result;

                try {
                    result = describeMaintenanceWindowTasks(request);
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
    public java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(DescribeMaintenanceWindowsRequest request) {

        return describeMaintenanceWindowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(final DescribeMaintenanceWindowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowsRequest, DescribeMaintenanceWindowsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeMaintenanceWindowsResult>() {
            @Override
            public DescribeMaintenanceWindowsResult call() throws Exception {
                DescribeMaintenanceWindowsResult result;

                try {
                    result = describeMaintenanceWindows(request);
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
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest request) {

        return describeParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(final DescribeParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeParametersResult>() {
            @Override
            public DescribeParametersResult call() throws Exception {
                DescribeParametersResult result;

                try {
                    result = describeParameters(request);
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
    public java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(GetAutomationExecutionRequest request) {

        return getAutomationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(final GetAutomationExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAutomationExecutionRequest, GetAutomationExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetAutomationExecutionResult>() {
            @Override
            public GetAutomationExecutionResult call() throws Exception {
                GetAutomationExecutionResult result;

                try {
                    result = getAutomationExecution(request);
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
    public java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(GetCommandInvocationRequest request) {

        return getCommandInvocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(final GetCommandInvocationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCommandInvocationRequest, GetCommandInvocationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetCommandInvocationResult>() {
            @Override
            public GetCommandInvocationResult call() throws Exception {
                GetCommandInvocationResult result;

                try {
                    result = getCommandInvocation(request);
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
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest request) {

        return getDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(final GetDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentResult>() {
            @Override
            public GetDocumentResult call() throws Exception {
                GetDocumentResult result;

                try {
                    result = getDocument(request);
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
    public java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest request) {

        return getInventoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(final GetInventoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInventoryRequest, GetInventoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInventoryResult>() {
            @Override
            public GetInventoryResult call() throws Exception {
                GetInventoryResult result;

                try {
                    result = getInventory(request);
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
    public java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(GetInventorySchemaRequest request) {

        return getInventorySchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(final GetInventorySchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInventorySchemaRequest, GetInventorySchemaResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetInventorySchemaResult>() {
            @Override
            public GetInventorySchemaResult call() throws Exception {
                GetInventorySchemaResult result;

                try {
                    result = getInventorySchema(request);
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
    public java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(GetMaintenanceWindowRequest request) {

        return getMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(final GetMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowRequest, GetMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowResult>() {
            @Override
            public GetMaintenanceWindowResult call() throws Exception {
                GetMaintenanceWindowResult result;

                try {
                    result = getMaintenanceWindow(request);
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
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(GetMaintenanceWindowExecutionRequest request) {

        return getMaintenanceWindowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            final GetMaintenanceWindowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionRequest, GetMaintenanceWindowExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowExecutionResult>() {
            @Override
            public GetMaintenanceWindowExecutionResult call() throws Exception {
                GetMaintenanceWindowExecutionResult result;

                try {
                    result = getMaintenanceWindowExecution(request);
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
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest request) {

        return getMaintenanceWindowExecutionTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            final GetMaintenanceWindowExecutionTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionTaskRequest, GetMaintenanceWindowExecutionTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetMaintenanceWindowExecutionTaskResult>() {
            @Override
            public GetMaintenanceWindowExecutionTaskResult call() throws Exception {
                GetMaintenanceWindowExecutionTaskResult result;

                try {
                    result = getMaintenanceWindowExecutionTask(request);
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
    public java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(GetParameterHistoryRequest request) {

        return getParameterHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(final GetParameterHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParameterHistoryRequest, GetParameterHistoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetParameterHistoryResult>() {
            @Override
            public GetParameterHistoryResult call() throws Exception {
                GetParameterHistoryResult result;

                try {
                    result = getParameterHistory(request);
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
    public java.util.concurrent.Future<GetParametersResult> getParametersAsync(GetParametersRequest request) {

        return getParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersResult> getParametersAsync(final GetParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParametersRequest, GetParametersResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetParametersResult>() {
            @Override
            public GetParametersResult call() throws Exception {
                GetParametersResult result;

                try {
                    result = getParameters(request);
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
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest request) {

        return listAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(final ListAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAssociationsResult>() {
            @Override
            public ListAssociationsResult call() throws Exception {
                ListAssociationsResult result;

                try {
                    result = listAssociations(request);
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
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(ListCommandInvocationsRequest request) {

        return listCommandInvocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(final ListCommandInvocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListCommandInvocationsResult>() {
            @Override
            public ListCommandInvocationsResult call() throws Exception {
                ListCommandInvocationsResult result;

                try {
                    result = listCommandInvocations(request);
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
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest request) {

        return listCommandsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(final ListCommandsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListCommandsResult>() {
            @Override
            public ListCommandsResult call() throws Exception {
                ListCommandsResult result;

                try {
                    result = listCommands(request);
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
    public java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(ListDocumentVersionsRequest request) {

        return listDocumentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(final ListDocumentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentVersionsRequest, ListDocumentVersionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDocumentVersionsResult>() {
            @Override
            public ListDocumentVersionsResult call() throws Exception {
                ListDocumentVersionsResult result;

                try {
                    result = listDocumentVersions(request);
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
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest request) {

        return listDocumentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(final ListDocumentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDocumentsResult>() {
            @Override
            public ListDocumentsResult call() throws Exception {
                ListDocumentsResult result;

                try {
                    result = listDocuments(request);
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

        return executorService.submit(new java.util.concurrent.Callable<ListInventoryEntriesResult>() {
            @Override
            public ListInventoryEntriesResult call() throws Exception {
                ListInventoryEntriesResult result;

                try {
                    result = listInventoryEntries(request);
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
    public java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(ModifyDocumentPermissionRequest request) {

        return modifyDocumentPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(final ModifyDocumentPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDocumentPermissionRequest, ModifyDocumentPermissionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyDocumentPermissionResult>() {
            @Override
            public ModifyDocumentPermissionResult call() throws Exception {
                ModifyDocumentPermissionResult result;

                try {
                    result = modifyDocumentPermission(request);
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
    public java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest request) {

        return putInventoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(final PutInventoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutInventoryRequest, PutInventoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutInventoryResult>() {
            @Override
            public PutInventoryResult call() throws Exception {
                PutInventoryResult result;

                try {
                    result = putInventory(request);
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
    public java.util.concurrent.Future<PutParameterResult> putParameterAsync(PutParameterRequest request) {

        return putParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutParameterResult> putParameterAsync(final PutParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutParameterRequest, PutParameterResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutParameterResult>() {
            @Override
            public PutParameterResult call() throws Exception {
                PutParameterResult result;

                try {
                    result = putParameter(request);
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
    public java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest request) {

        return registerTargetWithMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            final RegisterTargetWithMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTargetWithMaintenanceWindowRequest, RegisterTargetWithMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RegisterTargetWithMaintenanceWindowResult>() {
            @Override
            public RegisterTargetWithMaintenanceWindowResult call() throws Exception {
                RegisterTargetWithMaintenanceWindowResult result;

                try {
                    result = registerTargetWithMaintenanceWindow(request);
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
    public java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest request) {

        return registerTaskWithMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            final RegisterTaskWithMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTaskWithMaintenanceWindowRequest, RegisterTaskWithMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RegisterTaskWithMaintenanceWindowResult>() {
            @Override
            public RegisterTaskWithMaintenanceWindowResult call() throws Exception {
                RegisterTaskWithMaintenanceWindowResult result;

                try {
                    result = registerTaskWithMaintenanceWindow(request);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result;

                try {
                    result = removeTagsFromResource(request);
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
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest request) {

        return sendCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(final SendCommandRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendCommandResult>() {
            @Override
            public SendCommandResult call() throws Exception {
                SendCommandResult result;

                try {
                    result = sendCommand(request);
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
    public java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(StartAutomationExecutionRequest request) {

        return startAutomationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(final StartAutomationExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAutomationExecutionRequest, StartAutomationExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartAutomationExecutionResult>() {
            @Override
            public StartAutomationExecutionResult call() throws Exception {
                StartAutomationExecutionResult result;

                try {
                    result = startAutomationExecution(request);
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
    public java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(StopAutomationExecutionRequest request) {

        return stopAutomationExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(final StopAutomationExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopAutomationExecutionRequest, StopAutomationExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopAutomationExecutionResult>() {
            @Override
            public StopAutomationExecutionResult call() throws Exception {
                StopAutomationExecutionResult result;

                try {
                    result = stopAutomationExecution(request);
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
    public java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(UpdateAssociationRequest request) {

        return updateAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(final UpdateAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssociationRequest, UpdateAssociationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssociationResult>() {
            @Override
            public UpdateAssociationResult call() throws Exception {
                UpdateAssociationResult result;

                try {
                    result = updateAssociation(request);
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
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest request) {

        return updateAssociationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(final UpdateAssociationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssociationStatusResult>() {
            @Override
            public UpdateAssociationStatusResult call() throws Exception {
                UpdateAssociationStatusResult result;

                try {
                    result = updateAssociationStatus(request);
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
    public java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest request) {

        return updateDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(final UpdateDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentResult>() {
            @Override
            public UpdateDocumentResult call() throws Exception {
                UpdateDocumentResult result;

                try {
                    result = updateDocument(request);
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
    public java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(UpdateDocumentDefaultVersionRequest request) {

        return updateDocumentDefaultVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(final UpdateDocumentDefaultVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentDefaultVersionRequest, UpdateDocumentDefaultVersionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentDefaultVersionResult>() {
            @Override
            public UpdateDocumentDefaultVersionResult call() throws Exception {
                UpdateDocumentDefaultVersionResult result;

                try {
                    result = updateDocumentDefaultVersion(request);
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
    public java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(UpdateMaintenanceWindowRequest request) {

        return updateMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(final UpdateMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateMaintenanceWindowResult>() {
            @Override
            public UpdateMaintenanceWindowResult call() throws Exception {
                UpdateMaintenanceWindowResult result;

                try {
                    result = updateMaintenanceWindow(request);
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
    public java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(UpdateManagedInstanceRoleRequest request) {

        return updateManagedInstanceRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(final UpdateManagedInstanceRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateManagedInstanceRoleRequest, UpdateManagedInstanceRoleResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateManagedInstanceRoleResult>() {
            @Override
            public UpdateManagedInstanceRoleResult call() throws Exception {
                UpdateManagedInstanceRoleResult result;

                try {
                    result = updateManagedInstanceRole(request);
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
