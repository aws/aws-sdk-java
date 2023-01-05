/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesweb.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon WorkSpaces Web asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * WorkSpaces Web is a low cost, fully managed WorkSpace built specifically to facilitate secure, web-based workloads.
 * WorkSpaces Web makes it easy for customers to safely provide their employees with access to internal websites and
 * SaaS web applications without the administrative burden of appliances or specialized client software. WorkSpaces Web
 * provides simple policy tools tailored for user interactions, while offloading common tasks like capacity management,
 * scaling, and maintaining browser images.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkSpacesWebAsyncClient extends AmazonWorkSpacesWebClient implements AmazonWorkSpacesWebAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonWorkSpacesWebAsyncClientBuilder asyncBuilder() {
        return AmazonWorkSpacesWebAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces Web using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonWorkSpacesWebAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkSpaces Web using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonWorkSpacesWebAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<AssociateBrowserSettingsResult> associateBrowserSettingsAsync(AssociateBrowserSettingsRequest request) {

        return associateBrowserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateBrowserSettingsResult> associateBrowserSettingsAsync(final AssociateBrowserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateBrowserSettingsRequest, AssociateBrowserSettingsResult> asyncHandler) {
        final AssociateBrowserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateBrowserSettingsResult>() {
            @Override
            public AssociateBrowserSettingsResult call() throws Exception {
                AssociateBrowserSettingsResult result = null;

                try {
                    result = executeAssociateBrowserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateNetworkSettingsResult> associateNetworkSettingsAsync(AssociateNetworkSettingsRequest request) {

        return associateNetworkSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateNetworkSettingsResult> associateNetworkSettingsAsync(final AssociateNetworkSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateNetworkSettingsRequest, AssociateNetworkSettingsResult> asyncHandler) {
        final AssociateNetworkSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateNetworkSettingsResult>() {
            @Override
            public AssociateNetworkSettingsResult call() throws Exception {
                AssociateNetworkSettingsResult result = null;

                try {
                    result = executeAssociateNetworkSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateTrustStoreResult> associateTrustStoreAsync(AssociateTrustStoreRequest request) {

        return associateTrustStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTrustStoreResult> associateTrustStoreAsync(final AssociateTrustStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTrustStoreRequest, AssociateTrustStoreResult> asyncHandler) {
        final AssociateTrustStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTrustStoreResult>() {
            @Override
            public AssociateTrustStoreResult call() throws Exception {
                AssociateTrustStoreResult result = null;

                try {
                    result = executeAssociateTrustStore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateUserAccessLoggingSettingsResult> associateUserAccessLoggingSettingsAsync(
            AssociateUserAccessLoggingSettingsRequest request) {

        return associateUserAccessLoggingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateUserAccessLoggingSettingsResult> associateUserAccessLoggingSettingsAsync(
            final AssociateUserAccessLoggingSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateUserAccessLoggingSettingsRequest, AssociateUserAccessLoggingSettingsResult> asyncHandler) {
        final AssociateUserAccessLoggingSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateUserAccessLoggingSettingsResult>() {
            @Override
            public AssociateUserAccessLoggingSettingsResult call() throws Exception {
                AssociateUserAccessLoggingSettingsResult result = null;

                try {
                    result = executeAssociateUserAccessLoggingSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateUserSettingsResult> associateUserSettingsAsync(AssociateUserSettingsRequest request) {

        return associateUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateUserSettingsResult> associateUserSettingsAsync(final AssociateUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateUserSettingsRequest, AssociateUserSettingsResult> asyncHandler) {
        final AssociateUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateUserSettingsResult>() {
            @Override
            public AssociateUserSettingsResult call() throws Exception {
                AssociateUserSettingsResult result = null;

                try {
                    result = executeAssociateUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBrowserSettingsResult> createBrowserSettingsAsync(CreateBrowserSettingsRequest request) {

        return createBrowserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBrowserSettingsResult> createBrowserSettingsAsync(final CreateBrowserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBrowserSettingsRequest, CreateBrowserSettingsResult> asyncHandler) {
        final CreateBrowserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBrowserSettingsResult>() {
            @Override
            public CreateBrowserSettingsResult call() throws Exception {
                CreateBrowserSettingsResult result = null;

                try {
                    result = executeCreateBrowserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(CreateIdentityProviderRequest request) {

        return createIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(final CreateIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIdentityProviderRequest, CreateIdentityProviderResult> asyncHandler) {
        final CreateIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIdentityProviderResult>() {
            @Override
            public CreateIdentityProviderResult call() throws Exception {
                CreateIdentityProviderResult result = null;

                try {
                    result = executeCreateIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkSettingsResult> createNetworkSettingsAsync(CreateNetworkSettingsRequest request) {

        return createNetworkSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkSettingsResult> createNetworkSettingsAsync(final CreateNetworkSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkSettingsRequest, CreateNetworkSettingsResult> asyncHandler) {
        final CreateNetworkSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkSettingsResult>() {
            @Override
            public CreateNetworkSettingsResult call() throws Exception {
                CreateNetworkSettingsResult result = null;

                try {
                    result = executeCreateNetworkSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePortalResult> createPortalAsync(CreatePortalRequest request) {

        return createPortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePortalResult> createPortalAsync(final CreatePortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePortalRequest, CreatePortalResult> asyncHandler) {
        final CreatePortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePortalResult>() {
            @Override
            public CreatePortalResult call() throws Exception {
                CreatePortalResult result = null;

                try {
                    result = executeCreatePortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTrustStoreResult> createTrustStoreAsync(CreateTrustStoreRequest request) {

        return createTrustStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrustStoreResult> createTrustStoreAsync(final CreateTrustStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrustStoreRequest, CreateTrustStoreResult> asyncHandler) {
        final CreateTrustStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrustStoreResult>() {
            @Override
            public CreateTrustStoreResult call() throws Exception {
                CreateTrustStoreResult result = null;

                try {
                    result = executeCreateTrustStore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserAccessLoggingSettingsResult> createUserAccessLoggingSettingsAsync(
            CreateUserAccessLoggingSettingsRequest request) {

        return createUserAccessLoggingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserAccessLoggingSettingsResult> createUserAccessLoggingSettingsAsync(
            final CreateUserAccessLoggingSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserAccessLoggingSettingsRequest, CreateUserAccessLoggingSettingsResult> asyncHandler) {
        final CreateUserAccessLoggingSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserAccessLoggingSettingsResult>() {
            @Override
            public CreateUserAccessLoggingSettingsResult call() throws Exception {
                CreateUserAccessLoggingSettingsResult result = null;

                try {
                    result = executeCreateUserAccessLoggingSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserSettingsResult> createUserSettingsAsync(CreateUserSettingsRequest request) {

        return createUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserSettingsResult> createUserSettingsAsync(final CreateUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserSettingsRequest, CreateUserSettingsResult> asyncHandler) {
        final CreateUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserSettingsResult>() {
            @Override
            public CreateUserSettingsResult call() throws Exception {
                CreateUserSettingsResult result = null;

                try {
                    result = executeCreateUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBrowserSettingsResult> deleteBrowserSettingsAsync(DeleteBrowserSettingsRequest request) {

        return deleteBrowserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBrowserSettingsResult> deleteBrowserSettingsAsync(final DeleteBrowserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBrowserSettingsRequest, DeleteBrowserSettingsResult> asyncHandler) {
        final DeleteBrowserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBrowserSettingsResult>() {
            @Override
            public DeleteBrowserSettingsResult call() throws Exception {
                DeleteBrowserSettingsResult result = null;

                try {
                    result = executeDeleteBrowserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(DeleteIdentityProviderRequest request) {

        return deleteIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(final DeleteIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityProviderRequest, DeleteIdentityProviderResult> asyncHandler) {
        final DeleteIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentityProviderResult>() {
            @Override
            public DeleteIdentityProviderResult call() throws Exception {
                DeleteIdentityProviderResult result = null;

                try {
                    result = executeDeleteIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkSettingsResult> deleteNetworkSettingsAsync(DeleteNetworkSettingsRequest request) {

        return deleteNetworkSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkSettingsResult> deleteNetworkSettingsAsync(final DeleteNetworkSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkSettingsRequest, DeleteNetworkSettingsResult> asyncHandler) {
        final DeleteNetworkSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkSettingsResult>() {
            @Override
            public DeleteNetworkSettingsResult call() throws Exception {
                DeleteNetworkSettingsResult result = null;

                try {
                    result = executeDeleteNetworkSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(DeletePortalRequest request) {

        return deletePortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(final DeletePortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePortalRequest, DeletePortalResult> asyncHandler) {
        final DeletePortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePortalResult>() {
            @Override
            public DeletePortalResult call() throws Exception {
                DeletePortalResult result = null;

                try {
                    result = executeDeletePortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustStoreResult> deleteTrustStoreAsync(DeleteTrustStoreRequest request) {

        return deleteTrustStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustStoreResult> deleteTrustStoreAsync(final DeleteTrustStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrustStoreRequest, DeleteTrustStoreResult> asyncHandler) {
        final DeleteTrustStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrustStoreResult>() {
            @Override
            public DeleteTrustStoreResult call() throws Exception {
                DeleteTrustStoreResult result = null;

                try {
                    result = executeDeleteTrustStore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAccessLoggingSettingsResult> deleteUserAccessLoggingSettingsAsync(
            DeleteUserAccessLoggingSettingsRequest request) {

        return deleteUserAccessLoggingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAccessLoggingSettingsResult> deleteUserAccessLoggingSettingsAsync(
            final DeleteUserAccessLoggingSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserAccessLoggingSettingsRequest, DeleteUserAccessLoggingSettingsResult> asyncHandler) {
        final DeleteUserAccessLoggingSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserAccessLoggingSettingsResult>() {
            @Override
            public DeleteUserAccessLoggingSettingsResult call() throws Exception {
                DeleteUserAccessLoggingSettingsResult result = null;

                try {
                    result = executeDeleteUserAccessLoggingSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserSettingsResult> deleteUserSettingsAsync(DeleteUserSettingsRequest request) {

        return deleteUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserSettingsResult> deleteUserSettingsAsync(final DeleteUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserSettingsRequest, DeleteUserSettingsResult> asyncHandler) {
        final DeleteUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserSettingsResult>() {
            @Override
            public DeleteUserSettingsResult call() throws Exception {
                DeleteUserSettingsResult result = null;

                try {
                    result = executeDeleteUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateBrowserSettingsResult> disassociateBrowserSettingsAsync(DisassociateBrowserSettingsRequest request) {

        return disassociateBrowserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateBrowserSettingsResult> disassociateBrowserSettingsAsync(final DisassociateBrowserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateBrowserSettingsRequest, DisassociateBrowserSettingsResult> asyncHandler) {
        final DisassociateBrowserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateBrowserSettingsResult>() {
            @Override
            public DisassociateBrowserSettingsResult call() throws Exception {
                DisassociateBrowserSettingsResult result = null;

                try {
                    result = executeDisassociateBrowserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateNetworkSettingsResult> disassociateNetworkSettingsAsync(DisassociateNetworkSettingsRequest request) {

        return disassociateNetworkSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateNetworkSettingsResult> disassociateNetworkSettingsAsync(final DisassociateNetworkSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateNetworkSettingsRequest, DisassociateNetworkSettingsResult> asyncHandler) {
        final DisassociateNetworkSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateNetworkSettingsResult>() {
            @Override
            public DisassociateNetworkSettingsResult call() throws Exception {
                DisassociateNetworkSettingsResult result = null;

                try {
                    result = executeDisassociateNetworkSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateTrustStoreResult> disassociateTrustStoreAsync(DisassociateTrustStoreRequest request) {

        return disassociateTrustStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTrustStoreResult> disassociateTrustStoreAsync(final DisassociateTrustStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTrustStoreRequest, DisassociateTrustStoreResult> asyncHandler) {
        final DisassociateTrustStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTrustStoreResult>() {
            @Override
            public DisassociateTrustStoreResult call() throws Exception {
                DisassociateTrustStoreResult result = null;

                try {
                    result = executeDisassociateTrustStore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserAccessLoggingSettingsResult> disassociateUserAccessLoggingSettingsAsync(
            DisassociateUserAccessLoggingSettingsRequest request) {

        return disassociateUserAccessLoggingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserAccessLoggingSettingsResult> disassociateUserAccessLoggingSettingsAsync(
            final DisassociateUserAccessLoggingSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateUserAccessLoggingSettingsRequest, DisassociateUserAccessLoggingSettingsResult> asyncHandler) {
        final DisassociateUserAccessLoggingSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateUserAccessLoggingSettingsResult>() {
            @Override
            public DisassociateUserAccessLoggingSettingsResult call() throws Exception {
                DisassociateUserAccessLoggingSettingsResult result = null;

                try {
                    result = executeDisassociateUserAccessLoggingSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserSettingsResult> disassociateUserSettingsAsync(DisassociateUserSettingsRequest request) {

        return disassociateUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserSettingsResult> disassociateUserSettingsAsync(final DisassociateUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateUserSettingsRequest, DisassociateUserSettingsResult> asyncHandler) {
        final DisassociateUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateUserSettingsResult>() {
            @Override
            public DisassociateUserSettingsResult call() throws Exception {
                DisassociateUserSettingsResult result = null;

                try {
                    result = executeDisassociateUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBrowserSettingsResult> getBrowserSettingsAsync(GetBrowserSettingsRequest request) {

        return getBrowserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBrowserSettingsResult> getBrowserSettingsAsync(final GetBrowserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBrowserSettingsRequest, GetBrowserSettingsResult> asyncHandler) {
        final GetBrowserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBrowserSettingsResult>() {
            @Override
            public GetBrowserSettingsResult call() throws Exception {
                GetBrowserSettingsResult result = null;

                try {
                    result = executeGetBrowserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderResult> getIdentityProviderAsync(GetIdentityProviderRequest request) {

        return getIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderResult> getIdentityProviderAsync(final GetIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityProviderRequest, GetIdentityProviderResult> asyncHandler) {
        final GetIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityProviderResult>() {
            @Override
            public GetIdentityProviderResult call() throws Exception {
                GetIdentityProviderResult result = null;

                try {
                    result = executeGetIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetNetworkSettingsResult> getNetworkSettingsAsync(GetNetworkSettingsRequest request) {

        return getNetworkSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkSettingsResult> getNetworkSettingsAsync(final GetNetworkSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkSettingsRequest, GetNetworkSettingsResult> asyncHandler) {
        final GetNetworkSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkSettingsResult>() {
            @Override
            public GetNetworkSettingsResult call() throws Exception {
                GetNetworkSettingsResult result = null;

                try {
                    result = executeGetNetworkSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPortalResult> getPortalAsync(GetPortalRequest request) {

        return getPortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPortalResult> getPortalAsync(final GetPortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPortalRequest, GetPortalResult> asyncHandler) {
        final GetPortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPortalResult>() {
            @Override
            public GetPortalResult call() throws Exception {
                GetPortalResult result = null;

                try {
                    result = executeGetPortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPortalServiceProviderMetadataResult> getPortalServiceProviderMetadataAsync(
            GetPortalServiceProviderMetadataRequest request) {

        return getPortalServiceProviderMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPortalServiceProviderMetadataResult> getPortalServiceProviderMetadataAsync(
            final GetPortalServiceProviderMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPortalServiceProviderMetadataRequest, GetPortalServiceProviderMetadataResult> asyncHandler) {
        final GetPortalServiceProviderMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPortalServiceProviderMetadataResult>() {
            @Override
            public GetPortalServiceProviderMetadataResult call() throws Exception {
                GetPortalServiceProviderMetadataResult result = null;

                try {
                    result = executeGetPortalServiceProviderMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTrustStoreResult> getTrustStoreAsync(GetTrustStoreRequest request) {

        return getTrustStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrustStoreResult> getTrustStoreAsync(final GetTrustStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrustStoreRequest, GetTrustStoreResult> asyncHandler) {
        final GetTrustStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrustStoreResult>() {
            @Override
            public GetTrustStoreResult call() throws Exception {
                GetTrustStoreResult result = null;

                try {
                    result = executeGetTrustStore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTrustStoreCertificateResult> getTrustStoreCertificateAsync(GetTrustStoreCertificateRequest request) {

        return getTrustStoreCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrustStoreCertificateResult> getTrustStoreCertificateAsync(final GetTrustStoreCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrustStoreCertificateRequest, GetTrustStoreCertificateResult> asyncHandler) {
        final GetTrustStoreCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrustStoreCertificateResult>() {
            @Override
            public GetTrustStoreCertificateResult call() throws Exception {
                GetTrustStoreCertificateResult result = null;

                try {
                    result = executeGetTrustStoreCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUserAccessLoggingSettingsResult> getUserAccessLoggingSettingsAsync(GetUserAccessLoggingSettingsRequest request) {

        return getUserAccessLoggingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserAccessLoggingSettingsResult> getUserAccessLoggingSettingsAsync(final GetUserAccessLoggingSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserAccessLoggingSettingsRequest, GetUserAccessLoggingSettingsResult> asyncHandler) {
        final GetUserAccessLoggingSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserAccessLoggingSettingsResult>() {
            @Override
            public GetUserAccessLoggingSettingsResult call() throws Exception {
                GetUserAccessLoggingSettingsResult result = null;

                try {
                    result = executeGetUserAccessLoggingSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUserSettingsResult> getUserSettingsAsync(GetUserSettingsRequest request) {

        return getUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserSettingsResult> getUserSettingsAsync(final GetUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserSettingsRequest, GetUserSettingsResult> asyncHandler) {
        final GetUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserSettingsResult>() {
            @Override
            public GetUserSettingsResult call() throws Exception {
                GetUserSettingsResult result = null;

                try {
                    result = executeGetUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBrowserSettingsResult> listBrowserSettingsAsync(ListBrowserSettingsRequest request) {

        return listBrowserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBrowserSettingsResult> listBrowserSettingsAsync(final ListBrowserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBrowserSettingsRequest, ListBrowserSettingsResult> asyncHandler) {
        final ListBrowserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBrowserSettingsResult>() {
            @Override
            public ListBrowserSettingsResult call() throws Exception {
                ListBrowserSettingsResult result = null;

                try {
                    result = executeListBrowserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest request) {

        return listIdentityProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(final ListIdentityProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityProvidersRequest, ListIdentityProvidersResult> asyncHandler) {
        final ListIdentityProvidersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityProvidersResult>() {
            @Override
            public ListIdentityProvidersResult call() throws Exception {
                ListIdentityProvidersResult result = null;

                try {
                    result = executeListIdentityProviders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSettingsResult> listNetworkSettingsAsync(ListNetworkSettingsRequest request) {

        return listNetworkSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSettingsResult> listNetworkSettingsAsync(final ListNetworkSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNetworkSettingsRequest, ListNetworkSettingsResult> asyncHandler) {
        final ListNetworkSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNetworkSettingsResult>() {
            @Override
            public ListNetworkSettingsResult call() throws Exception {
                ListNetworkSettingsResult result = null;

                try {
                    result = executeListNetworkSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(ListPortalsRequest request) {

        return listPortalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(final ListPortalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPortalsRequest, ListPortalsResult> asyncHandler) {
        final ListPortalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPortalsResult>() {
            @Override
            public ListPortalsResult call() throws Exception {
                ListPortalsResult result = null;

                try {
                    result = executeListPortals(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListTrustStoreCertificatesResult> listTrustStoreCertificatesAsync(ListTrustStoreCertificatesRequest request) {

        return listTrustStoreCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrustStoreCertificatesResult> listTrustStoreCertificatesAsync(final ListTrustStoreCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrustStoreCertificatesRequest, ListTrustStoreCertificatesResult> asyncHandler) {
        final ListTrustStoreCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrustStoreCertificatesResult>() {
            @Override
            public ListTrustStoreCertificatesResult call() throws Exception {
                ListTrustStoreCertificatesResult result = null;

                try {
                    result = executeListTrustStoreCertificates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTrustStoresResult> listTrustStoresAsync(ListTrustStoresRequest request) {

        return listTrustStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrustStoresResult> listTrustStoresAsync(final ListTrustStoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrustStoresRequest, ListTrustStoresResult> asyncHandler) {
        final ListTrustStoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrustStoresResult>() {
            @Override
            public ListTrustStoresResult call() throws Exception {
                ListTrustStoresResult result = null;

                try {
                    result = executeListTrustStores(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserAccessLoggingSettingsResult> listUserAccessLoggingSettingsAsync(ListUserAccessLoggingSettingsRequest request) {

        return listUserAccessLoggingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserAccessLoggingSettingsResult> listUserAccessLoggingSettingsAsync(
            final ListUserAccessLoggingSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserAccessLoggingSettingsRequest, ListUserAccessLoggingSettingsResult> asyncHandler) {
        final ListUserAccessLoggingSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserAccessLoggingSettingsResult>() {
            @Override
            public ListUserAccessLoggingSettingsResult call() throws Exception {
                ListUserAccessLoggingSettingsResult result = null;

                try {
                    result = executeListUserAccessLoggingSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserSettingsResult> listUserSettingsAsync(ListUserSettingsRequest request) {

        return listUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserSettingsResult> listUserSettingsAsync(final ListUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserSettingsRequest, ListUserSettingsResult> asyncHandler) {
        final ListUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserSettingsResult>() {
            @Override
            public ListUserSettingsResult call() throws Exception {
                ListUserSettingsResult result = null;

                try {
                    result = executeListUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateBrowserSettingsResult> updateBrowserSettingsAsync(UpdateBrowserSettingsRequest request) {

        return updateBrowserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrowserSettingsResult> updateBrowserSettingsAsync(final UpdateBrowserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBrowserSettingsRequest, UpdateBrowserSettingsResult> asyncHandler) {
        final UpdateBrowserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBrowserSettingsResult>() {
            @Override
            public UpdateBrowserSettingsResult call() throws Exception {
                UpdateBrowserSettingsResult result = null;

                try {
                    result = executeUpdateBrowserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(UpdateIdentityProviderRequest request) {

        return updateIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(final UpdateIdentityProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderRequest, UpdateIdentityProviderResult> asyncHandler) {
        final UpdateIdentityProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdentityProviderResult>() {
            @Override
            public UpdateIdentityProviderResult call() throws Exception {
                UpdateIdentityProviderResult result = null;

                try {
                    result = executeUpdateIdentityProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSettingsResult> updateNetworkSettingsAsync(UpdateNetworkSettingsRequest request) {

        return updateNetworkSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSettingsResult> updateNetworkSettingsAsync(final UpdateNetworkSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNetworkSettingsRequest, UpdateNetworkSettingsResult> asyncHandler) {
        final UpdateNetworkSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNetworkSettingsResult>() {
            @Override
            public UpdateNetworkSettingsResult call() throws Exception {
                UpdateNetworkSettingsResult result = null;

                try {
                    result = executeUpdateNetworkSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(UpdatePortalRequest request) {

        return updatePortalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(final UpdatePortalRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePortalRequest, UpdatePortalResult> asyncHandler) {
        final UpdatePortalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePortalResult>() {
            @Override
            public UpdatePortalResult call() throws Exception {
                UpdatePortalResult result = null;

                try {
                    result = executeUpdatePortal(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTrustStoreResult> updateTrustStoreAsync(UpdateTrustStoreRequest request) {

        return updateTrustStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrustStoreResult> updateTrustStoreAsync(final UpdateTrustStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrustStoreRequest, UpdateTrustStoreResult> asyncHandler) {
        final UpdateTrustStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrustStoreResult>() {
            @Override
            public UpdateTrustStoreResult call() throws Exception {
                UpdateTrustStoreResult result = null;

                try {
                    result = executeUpdateTrustStore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAccessLoggingSettingsResult> updateUserAccessLoggingSettingsAsync(
            UpdateUserAccessLoggingSettingsRequest request) {

        return updateUserAccessLoggingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAccessLoggingSettingsResult> updateUserAccessLoggingSettingsAsync(
            final UpdateUserAccessLoggingSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserAccessLoggingSettingsRequest, UpdateUserAccessLoggingSettingsResult> asyncHandler) {
        final UpdateUserAccessLoggingSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserAccessLoggingSettingsResult>() {
            @Override
            public UpdateUserAccessLoggingSettingsResult call() throws Exception {
                UpdateUserAccessLoggingSettingsResult result = null;

                try {
                    result = executeUpdateUserAccessLoggingSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserSettingsResult> updateUserSettingsAsync(UpdateUserSettingsRequest request) {

        return updateUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserSettingsResult> updateUserSettingsAsync(final UpdateUserSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserSettingsRequest, UpdateUserSettingsResult> asyncHandler) {
        final UpdateUserSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserSettingsResult>() {
            @Override
            public UpdateUserSettingsResult call() throws Exception {
                UpdateUserSettingsResult result = null;

                try {
                    result = executeUpdateUserSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
