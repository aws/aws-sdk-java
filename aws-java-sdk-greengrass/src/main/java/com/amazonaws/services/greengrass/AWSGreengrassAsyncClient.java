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
package com.amazonaws.services.greengrass;

import javax.annotation.Generated;

import com.amazonaws.services.greengrass.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Greengrass asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * AWS IoT Greengrass seamlessly extends AWS onto physical devices so they can act locally on the data they generate,
 * while still using the cloud for management, analytics, and durable storage. AWS IoT Greengrass ensures your devices
 * can respond quickly to local events and operate with intermittent connectivity. AWS IoT Greengrass minimizes the cost
 * of transmitting data to the cloud by allowing you to author AWS Lambda functions that execute locally.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGreengrassAsyncClient extends AWSGreengrassClient implements AWSGreengrassAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSGreengrassAsyncClientBuilder asyncBuilder() {
        return AWSGreengrassAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Greengrass using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSGreengrassAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateRoleToGroupResult> associateRoleToGroupAsync(AssociateRoleToGroupRequest request) {

        return associateRoleToGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRoleToGroupResult> associateRoleToGroupAsync(final AssociateRoleToGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateRoleToGroupRequest, AssociateRoleToGroupResult> asyncHandler) {
        final AssociateRoleToGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateRoleToGroupResult>() {
            @Override
            public AssociateRoleToGroupResult call() throws Exception {
                AssociateRoleToGroupResult result = null;

                try {
                    result = executeAssociateRoleToGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateServiceRoleToAccountResult> associateServiceRoleToAccountAsync(AssociateServiceRoleToAccountRequest request) {

        return associateServiceRoleToAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateServiceRoleToAccountResult> associateServiceRoleToAccountAsync(
            final AssociateServiceRoleToAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateServiceRoleToAccountRequest, AssociateServiceRoleToAccountResult> asyncHandler) {
        final AssociateServiceRoleToAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateServiceRoleToAccountResult>() {
            @Override
            public AssociateServiceRoleToAccountResult call() throws Exception {
                AssociateServiceRoleToAccountResult result = null;

                try {
                    result = executeAssociateServiceRoleToAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorDefinitionResult> createConnectorDefinitionAsync(CreateConnectorDefinitionRequest request) {

        return createConnectorDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorDefinitionResult> createConnectorDefinitionAsync(final CreateConnectorDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectorDefinitionRequest, CreateConnectorDefinitionResult> asyncHandler) {
        final CreateConnectorDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectorDefinitionResult>() {
            @Override
            public CreateConnectorDefinitionResult call() throws Exception {
                CreateConnectorDefinitionResult result = null;

                try {
                    result = executeCreateConnectorDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorDefinitionVersionResult> createConnectorDefinitionVersionAsync(
            CreateConnectorDefinitionVersionRequest request) {

        return createConnectorDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorDefinitionVersionResult> createConnectorDefinitionVersionAsync(
            final CreateConnectorDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectorDefinitionVersionRequest, CreateConnectorDefinitionVersionResult> asyncHandler) {
        final CreateConnectorDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectorDefinitionVersionResult>() {
            @Override
            public CreateConnectorDefinitionVersionResult call() throws Exception {
                CreateConnectorDefinitionVersionResult result = null;

                try {
                    result = executeCreateConnectorDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCoreDefinitionResult> createCoreDefinitionAsync(CreateCoreDefinitionRequest request) {

        return createCoreDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCoreDefinitionResult> createCoreDefinitionAsync(final CreateCoreDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCoreDefinitionRequest, CreateCoreDefinitionResult> asyncHandler) {
        final CreateCoreDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCoreDefinitionResult>() {
            @Override
            public CreateCoreDefinitionResult call() throws Exception {
                CreateCoreDefinitionResult result = null;

                try {
                    result = executeCreateCoreDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCoreDefinitionVersionResult> createCoreDefinitionVersionAsync(CreateCoreDefinitionVersionRequest request) {

        return createCoreDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCoreDefinitionVersionResult> createCoreDefinitionVersionAsync(final CreateCoreDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCoreDefinitionVersionRequest, CreateCoreDefinitionVersionResult> asyncHandler) {
        final CreateCoreDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCoreDefinitionVersionResult>() {
            @Override
            public CreateCoreDefinitionVersionResult call() throws Exception {
                CreateCoreDefinitionVersionResult result = null;

                try {
                    result = executeCreateCoreDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceDefinitionResult> createDeviceDefinitionAsync(CreateDeviceDefinitionRequest request) {

        return createDeviceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceDefinitionResult> createDeviceDefinitionAsync(final CreateDeviceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeviceDefinitionRequest, CreateDeviceDefinitionResult> asyncHandler) {
        final CreateDeviceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeviceDefinitionResult>() {
            @Override
            public CreateDeviceDefinitionResult call() throws Exception {
                CreateDeviceDefinitionResult result = null;

                try {
                    result = executeCreateDeviceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceDefinitionVersionResult> createDeviceDefinitionVersionAsync(CreateDeviceDefinitionVersionRequest request) {

        return createDeviceDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceDefinitionVersionResult> createDeviceDefinitionVersionAsync(
            final CreateDeviceDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeviceDefinitionVersionRequest, CreateDeviceDefinitionVersionResult> asyncHandler) {
        final CreateDeviceDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeviceDefinitionVersionResult>() {
            @Override
            public CreateDeviceDefinitionVersionResult call() throws Exception {
                CreateDeviceDefinitionVersionResult result = null;

                try {
                    result = executeCreateDeviceDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionDefinitionResult> createFunctionDefinitionAsync(CreateFunctionDefinitionRequest request) {

        return createFunctionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionDefinitionResult> createFunctionDefinitionAsync(final CreateFunctionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFunctionDefinitionRequest, CreateFunctionDefinitionResult> asyncHandler) {
        final CreateFunctionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFunctionDefinitionResult>() {
            @Override
            public CreateFunctionDefinitionResult call() throws Exception {
                CreateFunctionDefinitionResult result = null;

                try {
                    result = executeCreateFunctionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionDefinitionVersionResult> createFunctionDefinitionVersionAsync(
            CreateFunctionDefinitionVersionRequest request) {

        return createFunctionDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionDefinitionVersionResult> createFunctionDefinitionVersionAsync(
            final CreateFunctionDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFunctionDefinitionVersionRequest, CreateFunctionDefinitionVersionResult> asyncHandler) {
        final CreateFunctionDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFunctionDefinitionVersionResult>() {
            @Override
            public CreateFunctionDefinitionVersionResult call() throws Exception {
                CreateFunctionDefinitionVersionResult result = null;

                try {
                    result = executeCreateFunctionDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(final CreateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {
        final CreateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result = null;

                try {
                    result = executeCreateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupCertificateAuthorityResult> createGroupCertificateAuthorityAsync(
            CreateGroupCertificateAuthorityRequest request) {

        return createGroupCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupCertificateAuthorityResult> createGroupCertificateAuthorityAsync(
            final CreateGroupCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupCertificateAuthorityRequest, CreateGroupCertificateAuthorityResult> asyncHandler) {
        final CreateGroupCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupCertificateAuthorityResult>() {
            @Override
            public CreateGroupCertificateAuthorityResult call() throws Exception {
                CreateGroupCertificateAuthorityResult result = null;

                try {
                    result = executeCreateGroupCertificateAuthority(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupVersionResult> createGroupVersionAsync(CreateGroupVersionRequest request) {

        return createGroupVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupVersionResult> createGroupVersionAsync(final CreateGroupVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupVersionRequest, CreateGroupVersionResult> asyncHandler) {
        final CreateGroupVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupVersionResult>() {
            @Override
            public CreateGroupVersionResult call() throws Exception {
                CreateGroupVersionResult result = null;

                try {
                    result = executeCreateGroupVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLoggerDefinitionResult> createLoggerDefinitionAsync(CreateLoggerDefinitionRequest request) {

        return createLoggerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoggerDefinitionResult> createLoggerDefinitionAsync(final CreateLoggerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoggerDefinitionRequest, CreateLoggerDefinitionResult> asyncHandler) {
        final CreateLoggerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLoggerDefinitionResult>() {
            @Override
            public CreateLoggerDefinitionResult call() throws Exception {
                CreateLoggerDefinitionResult result = null;

                try {
                    result = executeCreateLoggerDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLoggerDefinitionVersionResult> createLoggerDefinitionVersionAsync(CreateLoggerDefinitionVersionRequest request) {

        return createLoggerDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoggerDefinitionVersionResult> createLoggerDefinitionVersionAsync(
            final CreateLoggerDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoggerDefinitionVersionRequest, CreateLoggerDefinitionVersionResult> asyncHandler) {
        final CreateLoggerDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLoggerDefinitionVersionResult>() {
            @Override
            public CreateLoggerDefinitionVersionResult call() throws Exception {
                CreateLoggerDefinitionVersionResult result = null;

                try {
                    result = executeCreateLoggerDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResourceDefinitionResult> createResourceDefinitionAsync(CreateResourceDefinitionRequest request) {

        return createResourceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceDefinitionResult> createResourceDefinitionAsync(final CreateResourceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceDefinitionRequest, CreateResourceDefinitionResult> asyncHandler) {
        final CreateResourceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceDefinitionResult>() {
            @Override
            public CreateResourceDefinitionResult call() throws Exception {
                CreateResourceDefinitionResult result = null;

                try {
                    result = executeCreateResourceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResourceDefinitionVersionResult> createResourceDefinitionVersionAsync(
            CreateResourceDefinitionVersionRequest request) {

        return createResourceDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceDefinitionVersionResult> createResourceDefinitionVersionAsync(
            final CreateResourceDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceDefinitionVersionRequest, CreateResourceDefinitionVersionResult> asyncHandler) {
        final CreateResourceDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceDefinitionVersionResult>() {
            @Override
            public CreateResourceDefinitionVersionResult call() throws Exception {
                CreateResourceDefinitionVersionResult result = null;

                try {
                    result = executeCreateResourceDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSoftwareUpdateJobResult> createSoftwareUpdateJobAsync(CreateSoftwareUpdateJobRequest request) {

        return createSoftwareUpdateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSoftwareUpdateJobResult> createSoftwareUpdateJobAsync(final CreateSoftwareUpdateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSoftwareUpdateJobRequest, CreateSoftwareUpdateJobResult> asyncHandler) {
        final CreateSoftwareUpdateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSoftwareUpdateJobResult>() {
            @Override
            public CreateSoftwareUpdateJobResult call() throws Exception {
                CreateSoftwareUpdateJobResult result = null;

                try {
                    result = executeCreateSoftwareUpdateJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionDefinitionResult> createSubscriptionDefinitionAsync(CreateSubscriptionDefinitionRequest request) {

        return createSubscriptionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionDefinitionResult> createSubscriptionDefinitionAsync(final CreateSubscriptionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriptionDefinitionRequest, CreateSubscriptionDefinitionResult> asyncHandler) {
        final CreateSubscriptionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriptionDefinitionResult>() {
            @Override
            public CreateSubscriptionDefinitionResult call() throws Exception {
                CreateSubscriptionDefinitionResult result = null;

                try {
                    result = executeCreateSubscriptionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionDefinitionVersionResult> createSubscriptionDefinitionVersionAsync(
            CreateSubscriptionDefinitionVersionRequest request) {

        return createSubscriptionDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubscriptionDefinitionVersionResult> createSubscriptionDefinitionVersionAsync(
            final CreateSubscriptionDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSubscriptionDefinitionVersionRequest, CreateSubscriptionDefinitionVersionResult> asyncHandler) {
        final CreateSubscriptionDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSubscriptionDefinitionVersionResult>() {
            @Override
            public CreateSubscriptionDefinitionVersionResult call() throws Exception {
                CreateSubscriptionDefinitionVersionResult result = null;

                try {
                    result = executeCreateSubscriptionDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorDefinitionResult> deleteConnectorDefinitionAsync(DeleteConnectorDefinitionRequest request) {

        return deleteConnectorDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorDefinitionResult> deleteConnectorDefinitionAsync(final DeleteConnectorDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectorDefinitionRequest, DeleteConnectorDefinitionResult> asyncHandler) {
        final DeleteConnectorDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectorDefinitionResult>() {
            @Override
            public DeleteConnectorDefinitionResult call() throws Exception {
                DeleteConnectorDefinitionResult result = null;

                try {
                    result = executeDeleteConnectorDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreDefinitionResult> deleteCoreDefinitionAsync(DeleteCoreDefinitionRequest request) {

        return deleteCoreDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCoreDefinitionResult> deleteCoreDefinitionAsync(final DeleteCoreDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCoreDefinitionRequest, DeleteCoreDefinitionResult> asyncHandler) {
        final DeleteCoreDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCoreDefinitionResult>() {
            @Override
            public DeleteCoreDefinitionResult call() throws Exception {
                DeleteCoreDefinitionResult result = null;

                try {
                    result = executeDeleteCoreDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceDefinitionResult> deleteDeviceDefinitionAsync(DeleteDeviceDefinitionRequest request) {

        return deleteDeviceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceDefinitionResult> deleteDeviceDefinitionAsync(final DeleteDeviceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeviceDefinitionRequest, DeleteDeviceDefinitionResult> asyncHandler) {
        final DeleteDeviceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeviceDefinitionResult>() {
            @Override
            public DeleteDeviceDefinitionResult call() throws Exception {
                DeleteDeviceDefinitionResult result = null;

                try {
                    result = executeDeleteDeviceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionDefinitionResult> deleteFunctionDefinitionAsync(DeleteFunctionDefinitionRequest request) {

        return deleteFunctionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionDefinitionResult> deleteFunctionDefinitionAsync(final DeleteFunctionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFunctionDefinitionRequest, DeleteFunctionDefinitionResult> asyncHandler) {
        final DeleteFunctionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFunctionDefinitionResult>() {
            @Override
            public DeleteFunctionDefinitionResult call() throws Exception {
                DeleteFunctionDefinitionResult result = null;

                try {
                    result = executeDeleteFunctionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggerDefinitionResult> deleteLoggerDefinitionAsync(DeleteLoggerDefinitionRequest request) {

        return deleteLoggerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggerDefinitionResult> deleteLoggerDefinitionAsync(final DeleteLoggerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoggerDefinitionRequest, DeleteLoggerDefinitionResult> asyncHandler) {
        final DeleteLoggerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoggerDefinitionResult>() {
            @Override
            public DeleteLoggerDefinitionResult call() throws Exception {
                DeleteLoggerDefinitionResult result = null;

                try {
                    result = executeDeleteLoggerDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceDefinitionResult> deleteResourceDefinitionAsync(DeleteResourceDefinitionRequest request) {

        return deleteResourceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceDefinitionResult> deleteResourceDefinitionAsync(final DeleteResourceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceDefinitionRequest, DeleteResourceDefinitionResult> asyncHandler) {
        final DeleteResourceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceDefinitionResult>() {
            @Override
            public DeleteResourceDefinitionResult call() throws Exception {
                DeleteResourceDefinitionResult result = null;

                try {
                    result = executeDeleteResourceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionDefinitionResult> deleteSubscriptionDefinitionAsync(DeleteSubscriptionDefinitionRequest request) {

        return deleteSubscriptionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionDefinitionResult> deleteSubscriptionDefinitionAsync(final DeleteSubscriptionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionDefinitionRequest, DeleteSubscriptionDefinitionResult> asyncHandler) {
        final DeleteSubscriptionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriptionDefinitionResult>() {
            @Override
            public DeleteSubscriptionDefinitionResult call() throws Exception {
                DeleteSubscriptionDefinitionResult result = null;

                try {
                    result = executeDeleteSubscriptionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateRoleFromGroupResult> disassociateRoleFromGroupAsync(DisassociateRoleFromGroupRequest request) {

        return disassociateRoleFromGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRoleFromGroupResult> disassociateRoleFromGroupAsync(final DisassociateRoleFromGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateRoleFromGroupRequest, DisassociateRoleFromGroupResult> asyncHandler) {
        final DisassociateRoleFromGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateRoleFromGroupResult>() {
            @Override
            public DisassociateRoleFromGroupResult call() throws Exception {
                DisassociateRoleFromGroupResult result = null;

                try {
                    result = executeDisassociateRoleFromGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateServiceRoleFromAccountResult> disassociateServiceRoleFromAccountAsync(
            DisassociateServiceRoleFromAccountRequest request) {

        return disassociateServiceRoleFromAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateServiceRoleFromAccountResult> disassociateServiceRoleFromAccountAsync(
            final DisassociateServiceRoleFromAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateServiceRoleFromAccountRequest, DisassociateServiceRoleFromAccountResult> asyncHandler) {
        final DisassociateServiceRoleFromAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateServiceRoleFromAccountResult>() {
            @Override
            public DisassociateServiceRoleFromAccountResult call() throws Exception {
                DisassociateServiceRoleFromAccountResult result = null;

                try {
                    result = executeDisassociateServiceRoleFromAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssociatedRoleResult> getAssociatedRoleAsync(GetAssociatedRoleRequest request) {

        return getAssociatedRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssociatedRoleResult> getAssociatedRoleAsync(final GetAssociatedRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssociatedRoleRequest, GetAssociatedRoleResult> asyncHandler) {
        final GetAssociatedRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssociatedRoleResult>() {
            @Override
            public GetAssociatedRoleResult call() throws Exception {
                GetAssociatedRoleResult result = null;

                try {
                    result = executeGetAssociatedRole(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBulkDeploymentStatusResult> getBulkDeploymentStatusAsync(GetBulkDeploymentStatusRequest request) {

        return getBulkDeploymentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBulkDeploymentStatusResult> getBulkDeploymentStatusAsync(final GetBulkDeploymentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBulkDeploymentStatusRequest, GetBulkDeploymentStatusResult> asyncHandler) {
        final GetBulkDeploymentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBulkDeploymentStatusResult>() {
            @Override
            public GetBulkDeploymentStatusResult call() throws Exception {
                GetBulkDeploymentStatusResult result = null;

                try {
                    result = executeGetBulkDeploymentStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectivityInfoResult> getConnectivityInfoAsync(GetConnectivityInfoRequest request) {

        return getConnectivityInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectivityInfoResult> getConnectivityInfoAsync(final GetConnectivityInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectivityInfoRequest, GetConnectivityInfoResult> asyncHandler) {
        final GetConnectivityInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectivityInfoResult>() {
            @Override
            public GetConnectivityInfoResult call() throws Exception {
                GetConnectivityInfoResult result = null;

                try {
                    result = executeGetConnectivityInfo(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectorDefinitionResult> getConnectorDefinitionAsync(GetConnectorDefinitionRequest request) {

        return getConnectorDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectorDefinitionResult> getConnectorDefinitionAsync(final GetConnectorDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectorDefinitionRequest, GetConnectorDefinitionResult> asyncHandler) {
        final GetConnectorDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectorDefinitionResult>() {
            @Override
            public GetConnectorDefinitionResult call() throws Exception {
                GetConnectorDefinitionResult result = null;

                try {
                    result = executeGetConnectorDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectorDefinitionVersionResult> getConnectorDefinitionVersionAsync(GetConnectorDefinitionVersionRequest request) {

        return getConnectorDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectorDefinitionVersionResult> getConnectorDefinitionVersionAsync(
            final GetConnectorDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectorDefinitionVersionRequest, GetConnectorDefinitionVersionResult> asyncHandler) {
        final GetConnectorDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectorDefinitionVersionResult>() {
            @Override
            public GetConnectorDefinitionVersionResult call() throws Exception {
                GetConnectorDefinitionVersionResult result = null;

                try {
                    result = executeGetConnectorDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCoreDefinitionResult> getCoreDefinitionAsync(GetCoreDefinitionRequest request) {

        return getCoreDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreDefinitionResult> getCoreDefinitionAsync(final GetCoreDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCoreDefinitionRequest, GetCoreDefinitionResult> asyncHandler) {
        final GetCoreDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCoreDefinitionResult>() {
            @Override
            public GetCoreDefinitionResult call() throws Exception {
                GetCoreDefinitionResult result = null;

                try {
                    result = executeGetCoreDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCoreDefinitionVersionResult> getCoreDefinitionVersionAsync(GetCoreDefinitionVersionRequest request) {

        return getCoreDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCoreDefinitionVersionResult> getCoreDefinitionVersionAsync(final GetCoreDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCoreDefinitionVersionRequest, GetCoreDefinitionVersionResult> asyncHandler) {
        final GetCoreDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCoreDefinitionVersionResult>() {
            @Override
            public GetCoreDefinitionVersionResult call() throws Exception {
                GetCoreDefinitionVersionResult result = null;

                try {
                    result = executeGetCoreDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentStatusResult> getDeploymentStatusAsync(GetDeploymentStatusRequest request) {

        return getDeploymentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentStatusResult> getDeploymentStatusAsync(final GetDeploymentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentStatusRequest, GetDeploymentStatusResult> asyncHandler) {
        final GetDeploymentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentStatusResult>() {
            @Override
            public GetDeploymentStatusResult call() throws Exception {
                GetDeploymentStatusResult result = null;

                try {
                    result = executeGetDeploymentStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeviceDefinitionResult> getDeviceDefinitionAsync(GetDeviceDefinitionRequest request) {

        return getDeviceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceDefinitionResult> getDeviceDefinitionAsync(final GetDeviceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceDefinitionRequest, GetDeviceDefinitionResult> asyncHandler) {
        final GetDeviceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceDefinitionResult>() {
            @Override
            public GetDeviceDefinitionResult call() throws Exception {
                GetDeviceDefinitionResult result = null;

                try {
                    result = executeGetDeviceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeviceDefinitionVersionResult> getDeviceDefinitionVersionAsync(GetDeviceDefinitionVersionRequest request) {

        return getDeviceDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceDefinitionVersionResult> getDeviceDefinitionVersionAsync(final GetDeviceDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceDefinitionVersionRequest, GetDeviceDefinitionVersionResult> asyncHandler) {
        final GetDeviceDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceDefinitionVersionResult>() {
            @Override
            public GetDeviceDefinitionVersionResult call() throws Exception {
                GetDeviceDefinitionVersionResult result = null;

                try {
                    result = executeGetDeviceDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionDefinitionResult> getFunctionDefinitionAsync(GetFunctionDefinitionRequest request) {

        return getFunctionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionDefinitionResult> getFunctionDefinitionAsync(final GetFunctionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionDefinitionRequest, GetFunctionDefinitionResult> asyncHandler) {
        final GetFunctionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionDefinitionResult>() {
            @Override
            public GetFunctionDefinitionResult call() throws Exception {
                GetFunctionDefinitionResult result = null;

                try {
                    result = executeGetFunctionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionDefinitionVersionResult> getFunctionDefinitionVersionAsync(GetFunctionDefinitionVersionRequest request) {

        return getFunctionDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionDefinitionVersionResult> getFunctionDefinitionVersionAsync(final GetFunctionDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionDefinitionVersionRequest, GetFunctionDefinitionVersionResult> asyncHandler) {
        final GetFunctionDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionDefinitionVersionResult>() {
            @Override
            public GetFunctionDefinitionVersionResult call() throws Exception {
                GetFunctionDefinitionVersionResult result = null;

                try {
                    result = executeGetFunctionDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(final GetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {
        final GetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupResult>() {
            @Override
            public GetGroupResult call() throws Exception {
                GetGroupResult result = null;

                try {
                    result = executeGetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupCertificateAuthorityResult> getGroupCertificateAuthorityAsync(GetGroupCertificateAuthorityRequest request) {

        return getGroupCertificateAuthorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupCertificateAuthorityResult> getGroupCertificateAuthorityAsync(final GetGroupCertificateAuthorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupCertificateAuthorityRequest, GetGroupCertificateAuthorityResult> asyncHandler) {
        final GetGroupCertificateAuthorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupCertificateAuthorityResult>() {
            @Override
            public GetGroupCertificateAuthorityResult call() throws Exception {
                GetGroupCertificateAuthorityResult result = null;

                try {
                    result = executeGetGroupCertificateAuthority(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupCertificateConfigurationResult> getGroupCertificateConfigurationAsync(
            GetGroupCertificateConfigurationRequest request) {

        return getGroupCertificateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupCertificateConfigurationResult> getGroupCertificateConfigurationAsync(
            final GetGroupCertificateConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupCertificateConfigurationRequest, GetGroupCertificateConfigurationResult> asyncHandler) {
        final GetGroupCertificateConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupCertificateConfigurationResult>() {
            @Override
            public GetGroupCertificateConfigurationResult call() throws Exception {
                GetGroupCertificateConfigurationResult result = null;

                try {
                    result = executeGetGroupCertificateConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupVersionResult> getGroupVersionAsync(GetGroupVersionRequest request) {

        return getGroupVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupVersionResult> getGroupVersionAsync(final GetGroupVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupVersionRequest, GetGroupVersionResult> asyncHandler) {
        final GetGroupVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupVersionResult>() {
            @Override
            public GetGroupVersionResult call() throws Exception {
                GetGroupVersionResult result = null;

                try {
                    result = executeGetGroupVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLoggerDefinitionResult> getLoggerDefinitionAsync(GetLoggerDefinitionRequest request) {

        return getLoggerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggerDefinitionResult> getLoggerDefinitionAsync(final GetLoggerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggerDefinitionRequest, GetLoggerDefinitionResult> asyncHandler) {
        final GetLoggerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoggerDefinitionResult>() {
            @Override
            public GetLoggerDefinitionResult call() throws Exception {
                GetLoggerDefinitionResult result = null;

                try {
                    result = executeGetLoggerDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLoggerDefinitionVersionResult> getLoggerDefinitionVersionAsync(GetLoggerDefinitionVersionRequest request) {

        return getLoggerDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggerDefinitionVersionResult> getLoggerDefinitionVersionAsync(final GetLoggerDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggerDefinitionVersionRequest, GetLoggerDefinitionVersionResult> asyncHandler) {
        final GetLoggerDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoggerDefinitionVersionResult>() {
            @Override
            public GetLoggerDefinitionVersionResult call() throws Exception {
                GetLoggerDefinitionVersionResult result = null;

                try {
                    result = executeGetLoggerDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceDefinitionResult> getResourceDefinitionAsync(GetResourceDefinitionRequest request) {

        return getResourceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceDefinitionResult> getResourceDefinitionAsync(final GetResourceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceDefinitionRequest, GetResourceDefinitionResult> asyncHandler) {
        final GetResourceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceDefinitionResult>() {
            @Override
            public GetResourceDefinitionResult call() throws Exception {
                GetResourceDefinitionResult result = null;

                try {
                    result = executeGetResourceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceDefinitionVersionResult> getResourceDefinitionVersionAsync(GetResourceDefinitionVersionRequest request) {

        return getResourceDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceDefinitionVersionResult> getResourceDefinitionVersionAsync(final GetResourceDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceDefinitionVersionRequest, GetResourceDefinitionVersionResult> asyncHandler) {
        final GetResourceDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceDefinitionVersionResult>() {
            @Override
            public GetResourceDefinitionVersionResult call() throws Exception {
                GetResourceDefinitionVersionResult result = null;

                try {
                    result = executeGetResourceDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetServiceRoleForAccountResult> getServiceRoleForAccountAsync(GetServiceRoleForAccountRequest request) {

        return getServiceRoleForAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceRoleForAccountResult> getServiceRoleForAccountAsync(final GetServiceRoleForAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceRoleForAccountRequest, GetServiceRoleForAccountResult> asyncHandler) {
        final GetServiceRoleForAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceRoleForAccountResult>() {
            @Override
            public GetServiceRoleForAccountResult call() throws Exception {
                GetServiceRoleForAccountResult result = null;

                try {
                    result = executeGetServiceRoleForAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionDefinitionResult> getSubscriptionDefinitionAsync(GetSubscriptionDefinitionRequest request) {

        return getSubscriptionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionDefinitionResult> getSubscriptionDefinitionAsync(final GetSubscriptionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionDefinitionRequest, GetSubscriptionDefinitionResult> asyncHandler) {
        final GetSubscriptionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionDefinitionResult>() {
            @Override
            public GetSubscriptionDefinitionResult call() throws Exception {
                GetSubscriptionDefinitionResult result = null;

                try {
                    result = executeGetSubscriptionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionDefinitionVersionResult> getSubscriptionDefinitionVersionAsync(
            GetSubscriptionDefinitionVersionRequest request) {

        return getSubscriptionDefinitionVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionDefinitionVersionResult> getSubscriptionDefinitionVersionAsync(
            final GetSubscriptionDefinitionVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionDefinitionVersionRequest, GetSubscriptionDefinitionVersionResult> asyncHandler) {
        final GetSubscriptionDefinitionVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSubscriptionDefinitionVersionResult>() {
            @Override
            public GetSubscriptionDefinitionVersionResult call() throws Exception {
                GetSubscriptionDefinitionVersionResult result = null;

                try {
                    result = executeGetSubscriptionDefinitionVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBulkDeploymentDetailedReportsResult> listBulkDeploymentDetailedReportsAsync(
            ListBulkDeploymentDetailedReportsRequest request) {

        return listBulkDeploymentDetailedReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBulkDeploymentDetailedReportsResult> listBulkDeploymentDetailedReportsAsync(
            final ListBulkDeploymentDetailedReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBulkDeploymentDetailedReportsRequest, ListBulkDeploymentDetailedReportsResult> asyncHandler) {
        final ListBulkDeploymentDetailedReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBulkDeploymentDetailedReportsResult>() {
            @Override
            public ListBulkDeploymentDetailedReportsResult call() throws Exception {
                ListBulkDeploymentDetailedReportsResult result = null;

                try {
                    result = executeListBulkDeploymentDetailedReports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBulkDeploymentsResult> listBulkDeploymentsAsync(ListBulkDeploymentsRequest request) {

        return listBulkDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBulkDeploymentsResult> listBulkDeploymentsAsync(final ListBulkDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBulkDeploymentsRequest, ListBulkDeploymentsResult> asyncHandler) {
        final ListBulkDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBulkDeploymentsResult>() {
            @Override
            public ListBulkDeploymentsResult call() throws Exception {
                ListBulkDeploymentsResult result = null;

                try {
                    result = executeListBulkDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConnectorDefinitionVersionsResult> listConnectorDefinitionVersionsAsync(
            ListConnectorDefinitionVersionsRequest request) {

        return listConnectorDefinitionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorDefinitionVersionsResult> listConnectorDefinitionVersionsAsync(
            final ListConnectorDefinitionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectorDefinitionVersionsRequest, ListConnectorDefinitionVersionsResult> asyncHandler) {
        final ListConnectorDefinitionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectorDefinitionVersionsResult>() {
            @Override
            public ListConnectorDefinitionVersionsResult call() throws Exception {
                ListConnectorDefinitionVersionsResult result = null;

                try {
                    result = executeListConnectorDefinitionVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConnectorDefinitionsResult> listConnectorDefinitionsAsync(ListConnectorDefinitionsRequest request) {

        return listConnectorDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorDefinitionsResult> listConnectorDefinitionsAsync(final ListConnectorDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConnectorDefinitionsRequest, ListConnectorDefinitionsResult> asyncHandler) {
        final ListConnectorDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConnectorDefinitionsResult>() {
            @Override
            public ListConnectorDefinitionsResult call() throws Exception {
                ListConnectorDefinitionsResult result = null;

                try {
                    result = executeListConnectorDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCoreDefinitionVersionsResult> listCoreDefinitionVersionsAsync(ListCoreDefinitionVersionsRequest request) {

        return listCoreDefinitionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoreDefinitionVersionsResult> listCoreDefinitionVersionsAsync(final ListCoreDefinitionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCoreDefinitionVersionsRequest, ListCoreDefinitionVersionsResult> asyncHandler) {
        final ListCoreDefinitionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCoreDefinitionVersionsResult>() {
            @Override
            public ListCoreDefinitionVersionsResult call() throws Exception {
                ListCoreDefinitionVersionsResult result = null;

                try {
                    result = executeListCoreDefinitionVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCoreDefinitionsResult> listCoreDefinitionsAsync(ListCoreDefinitionsRequest request) {

        return listCoreDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoreDefinitionsResult> listCoreDefinitionsAsync(final ListCoreDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCoreDefinitionsRequest, ListCoreDefinitionsResult> asyncHandler) {
        final ListCoreDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCoreDefinitionsResult>() {
            @Override
            public ListCoreDefinitionsResult call() throws Exception {
                ListCoreDefinitionsResult result = null;

                try {
                    result = executeListCoreDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {
        final ListDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
            @Override
            public ListDeploymentsResult call() throws Exception {
                ListDeploymentsResult result = null;

                try {
                    result = executeListDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeviceDefinitionVersionsResult> listDeviceDefinitionVersionsAsync(ListDeviceDefinitionVersionsRequest request) {

        return listDeviceDefinitionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceDefinitionVersionsResult> listDeviceDefinitionVersionsAsync(final ListDeviceDefinitionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceDefinitionVersionsRequest, ListDeviceDefinitionVersionsResult> asyncHandler) {
        final ListDeviceDefinitionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceDefinitionVersionsResult>() {
            @Override
            public ListDeviceDefinitionVersionsResult call() throws Exception {
                ListDeviceDefinitionVersionsResult result = null;

                try {
                    result = executeListDeviceDefinitionVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeviceDefinitionsResult> listDeviceDefinitionsAsync(ListDeviceDefinitionsRequest request) {

        return listDeviceDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceDefinitionsResult> listDeviceDefinitionsAsync(final ListDeviceDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceDefinitionsRequest, ListDeviceDefinitionsResult> asyncHandler) {
        final ListDeviceDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceDefinitionsResult>() {
            @Override
            public ListDeviceDefinitionsResult call() throws Exception {
                ListDeviceDefinitionsResult result = null;

                try {
                    result = executeListDeviceDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFunctionDefinitionVersionsResult> listFunctionDefinitionVersionsAsync(ListFunctionDefinitionVersionsRequest request) {

        return listFunctionDefinitionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionDefinitionVersionsResult> listFunctionDefinitionVersionsAsync(
            final ListFunctionDefinitionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFunctionDefinitionVersionsRequest, ListFunctionDefinitionVersionsResult> asyncHandler) {
        final ListFunctionDefinitionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFunctionDefinitionVersionsResult>() {
            @Override
            public ListFunctionDefinitionVersionsResult call() throws Exception {
                ListFunctionDefinitionVersionsResult result = null;

                try {
                    result = executeListFunctionDefinitionVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFunctionDefinitionsResult> listFunctionDefinitionsAsync(ListFunctionDefinitionsRequest request) {

        return listFunctionDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionDefinitionsResult> listFunctionDefinitionsAsync(final ListFunctionDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFunctionDefinitionsRequest, ListFunctionDefinitionsResult> asyncHandler) {
        final ListFunctionDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFunctionDefinitionsResult>() {
            @Override
            public ListFunctionDefinitionsResult call() throws Exception {
                ListFunctionDefinitionsResult result = null;

                try {
                    result = executeListFunctionDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupCertificateAuthoritiesResult> listGroupCertificateAuthoritiesAsync(
            ListGroupCertificateAuthoritiesRequest request) {

        return listGroupCertificateAuthoritiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupCertificateAuthoritiesResult> listGroupCertificateAuthoritiesAsync(
            final ListGroupCertificateAuthoritiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupCertificateAuthoritiesRequest, ListGroupCertificateAuthoritiesResult> asyncHandler) {
        final ListGroupCertificateAuthoritiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupCertificateAuthoritiesResult>() {
            @Override
            public ListGroupCertificateAuthoritiesResult call() throws Exception {
                ListGroupCertificateAuthoritiesResult result = null;

                try {
                    result = executeListGroupCertificateAuthorities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupVersionsResult> listGroupVersionsAsync(ListGroupVersionsRequest request) {

        return listGroupVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupVersionsResult> listGroupVersionsAsync(final ListGroupVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupVersionsRequest, ListGroupVersionsResult> asyncHandler) {
        final ListGroupVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupVersionsResult>() {
            @Override
            public ListGroupVersionsResult call() throws Exception {
                ListGroupVersionsResult result = null;

                try {
                    result = executeListGroupVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLoggerDefinitionVersionsResult> listLoggerDefinitionVersionsAsync(ListLoggerDefinitionVersionsRequest request) {

        return listLoggerDefinitionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoggerDefinitionVersionsResult> listLoggerDefinitionVersionsAsync(final ListLoggerDefinitionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLoggerDefinitionVersionsRequest, ListLoggerDefinitionVersionsResult> asyncHandler) {
        final ListLoggerDefinitionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLoggerDefinitionVersionsResult>() {
            @Override
            public ListLoggerDefinitionVersionsResult call() throws Exception {
                ListLoggerDefinitionVersionsResult result = null;

                try {
                    result = executeListLoggerDefinitionVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLoggerDefinitionsResult> listLoggerDefinitionsAsync(ListLoggerDefinitionsRequest request) {

        return listLoggerDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoggerDefinitionsResult> listLoggerDefinitionsAsync(final ListLoggerDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLoggerDefinitionsRequest, ListLoggerDefinitionsResult> asyncHandler) {
        final ListLoggerDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLoggerDefinitionsResult>() {
            @Override
            public ListLoggerDefinitionsResult call() throws Exception {
                ListLoggerDefinitionsResult result = null;

                try {
                    result = executeListLoggerDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourceDefinitionVersionsResult> listResourceDefinitionVersionsAsync(ListResourceDefinitionVersionsRequest request) {

        return listResourceDefinitionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceDefinitionVersionsResult> listResourceDefinitionVersionsAsync(
            final ListResourceDefinitionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceDefinitionVersionsRequest, ListResourceDefinitionVersionsResult> asyncHandler) {
        final ListResourceDefinitionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceDefinitionVersionsResult>() {
            @Override
            public ListResourceDefinitionVersionsResult call() throws Exception {
                ListResourceDefinitionVersionsResult result = null;

                try {
                    result = executeListResourceDefinitionVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourceDefinitionsResult> listResourceDefinitionsAsync(ListResourceDefinitionsRequest request) {

        return listResourceDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceDefinitionsResult> listResourceDefinitionsAsync(final ListResourceDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceDefinitionsRequest, ListResourceDefinitionsResult> asyncHandler) {
        final ListResourceDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceDefinitionsResult>() {
            @Override
            public ListResourceDefinitionsResult call() throws Exception {
                ListResourceDefinitionsResult result = null;

                try {
                    result = executeListResourceDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionDefinitionVersionsResult> listSubscriptionDefinitionVersionsAsync(
            ListSubscriptionDefinitionVersionsRequest request) {

        return listSubscriptionDefinitionVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionDefinitionVersionsResult> listSubscriptionDefinitionVersionsAsync(
            final ListSubscriptionDefinitionVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionDefinitionVersionsRequest, ListSubscriptionDefinitionVersionsResult> asyncHandler) {
        final ListSubscriptionDefinitionVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionDefinitionVersionsResult>() {
            @Override
            public ListSubscriptionDefinitionVersionsResult call() throws Exception {
                ListSubscriptionDefinitionVersionsResult result = null;

                try {
                    result = executeListSubscriptionDefinitionVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionDefinitionsResult> listSubscriptionDefinitionsAsync(ListSubscriptionDefinitionsRequest request) {

        return listSubscriptionDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionDefinitionsResult> listSubscriptionDefinitionsAsync(final ListSubscriptionDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionDefinitionsRequest, ListSubscriptionDefinitionsResult> asyncHandler) {
        final ListSubscriptionDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubscriptionDefinitionsResult>() {
            @Override
            public ListSubscriptionDefinitionsResult call() throws Exception {
                ListSubscriptionDefinitionsResult result = null;

                try {
                    result = executeListSubscriptionDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ResetDeploymentsResult> resetDeploymentsAsync(ResetDeploymentsRequest request) {

        return resetDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDeploymentsResult> resetDeploymentsAsync(final ResetDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetDeploymentsRequest, ResetDeploymentsResult> asyncHandler) {
        final ResetDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetDeploymentsResult>() {
            @Override
            public ResetDeploymentsResult call() throws Exception {
                ResetDeploymentsResult result = null;

                try {
                    result = executeResetDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartBulkDeploymentResult> startBulkDeploymentAsync(StartBulkDeploymentRequest request) {

        return startBulkDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartBulkDeploymentResult> startBulkDeploymentAsync(final StartBulkDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartBulkDeploymentRequest, StartBulkDeploymentResult> asyncHandler) {
        final StartBulkDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartBulkDeploymentResult>() {
            @Override
            public StartBulkDeploymentResult call() throws Exception {
                StartBulkDeploymentResult result = null;

                try {
                    result = executeStartBulkDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopBulkDeploymentResult> stopBulkDeploymentAsync(StopBulkDeploymentRequest request) {

        return stopBulkDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopBulkDeploymentResult> stopBulkDeploymentAsync(final StopBulkDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopBulkDeploymentRequest, StopBulkDeploymentResult> asyncHandler) {
        final StopBulkDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopBulkDeploymentResult>() {
            @Override
            public StopBulkDeploymentResult call() throws Exception {
                StopBulkDeploymentResult result = null;

                try {
                    result = executeStopBulkDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateConnectivityInfoResult> updateConnectivityInfoAsync(UpdateConnectivityInfoRequest request) {

        return updateConnectivityInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectivityInfoResult> updateConnectivityInfoAsync(final UpdateConnectivityInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConnectivityInfoRequest, UpdateConnectivityInfoResult> asyncHandler) {
        final UpdateConnectivityInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConnectivityInfoResult>() {
            @Override
            public UpdateConnectivityInfoResult call() throws Exception {
                UpdateConnectivityInfoResult result = null;

                try {
                    result = executeUpdateConnectivityInfo(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorDefinitionResult> updateConnectorDefinitionAsync(UpdateConnectorDefinitionRequest request) {

        return updateConnectorDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorDefinitionResult> updateConnectorDefinitionAsync(final UpdateConnectorDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConnectorDefinitionRequest, UpdateConnectorDefinitionResult> asyncHandler) {
        final UpdateConnectorDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConnectorDefinitionResult>() {
            @Override
            public UpdateConnectorDefinitionResult call() throws Exception {
                UpdateConnectorDefinitionResult result = null;

                try {
                    result = executeUpdateConnectorDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCoreDefinitionResult> updateCoreDefinitionAsync(UpdateCoreDefinitionRequest request) {

        return updateCoreDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCoreDefinitionResult> updateCoreDefinitionAsync(final UpdateCoreDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCoreDefinitionRequest, UpdateCoreDefinitionResult> asyncHandler) {
        final UpdateCoreDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCoreDefinitionResult>() {
            @Override
            public UpdateCoreDefinitionResult call() throws Exception {
                UpdateCoreDefinitionResult result = null;

                try {
                    result = executeUpdateCoreDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceDefinitionResult> updateDeviceDefinitionAsync(UpdateDeviceDefinitionRequest request) {

        return updateDeviceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceDefinitionResult> updateDeviceDefinitionAsync(final UpdateDeviceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceDefinitionRequest, UpdateDeviceDefinitionResult> asyncHandler) {
        final UpdateDeviceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceDefinitionResult>() {
            @Override
            public UpdateDeviceDefinitionResult call() throws Exception {
                UpdateDeviceDefinitionResult result = null;

                try {
                    result = executeUpdateDeviceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionDefinitionResult> updateFunctionDefinitionAsync(UpdateFunctionDefinitionRequest request) {

        return updateFunctionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionDefinitionResult> updateFunctionDefinitionAsync(final UpdateFunctionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionDefinitionRequest, UpdateFunctionDefinitionResult> asyncHandler) {
        final UpdateFunctionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionDefinitionResult>() {
            @Override
            public UpdateFunctionDefinitionResult call() throws Exception {
                UpdateFunctionDefinitionResult result = null;

                try {
                    result = executeUpdateFunctionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(final UpdateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {
        final UpdateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupResult>() {
            @Override
            public UpdateGroupResult call() throws Exception {
                UpdateGroupResult result = null;

                try {
                    result = executeUpdateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupCertificateConfigurationResult> updateGroupCertificateConfigurationAsync(
            UpdateGroupCertificateConfigurationRequest request) {

        return updateGroupCertificateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupCertificateConfigurationResult> updateGroupCertificateConfigurationAsync(
            final UpdateGroupCertificateConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupCertificateConfigurationRequest, UpdateGroupCertificateConfigurationResult> asyncHandler) {
        final UpdateGroupCertificateConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupCertificateConfigurationResult>() {
            @Override
            public UpdateGroupCertificateConfigurationResult call() throws Exception {
                UpdateGroupCertificateConfigurationResult result = null;

                try {
                    result = executeUpdateGroupCertificateConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggerDefinitionResult> updateLoggerDefinitionAsync(UpdateLoggerDefinitionRequest request) {

        return updateLoggerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggerDefinitionResult> updateLoggerDefinitionAsync(final UpdateLoggerDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLoggerDefinitionRequest, UpdateLoggerDefinitionResult> asyncHandler) {
        final UpdateLoggerDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLoggerDefinitionResult>() {
            @Override
            public UpdateLoggerDefinitionResult call() throws Exception {
                UpdateLoggerDefinitionResult result = null;

                try {
                    result = executeUpdateLoggerDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceDefinitionResult> updateResourceDefinitionAsync(UpdateResourceDefinitionRequest request) {

        return updateResourceDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceDefinitionResult> updateResourceDefinitionAsync(final UpdateResourceDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceDefinitionRequest, UpdateResourceDefinitionResult> asyncHandler) {
        final UpdateResourceDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceDefinitionResult>() {
            @Override
            public UpdateResourceDefinitionResult call() throws Exception {
                UpdateResourceDefinitionResult result = null;

                try {
                    result = executeUpdateResourceDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionDefinitionResult> updateSubscriptionDefinitionAsync(UpdateSubscriptionDefinitionRequest request) {

        return updateSubscriptionDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionDefinitionResult> updateSubscriptionDefinitionAsync(final UpdateSubscriptionDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionDefinitionRequest, UpdateSubscriptionDefinitionResult> asyncHandler) {
        final UpdateSubscriptionDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriptionDefinitionResult>() {
            @Override
            public UpdateSubscriptionDefinitionResult call() throws Exception {
                UpdateSubscriptionDefinitionResult result = null;

                try {
                    result = executeUpdateSubscriptionDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
