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
package com.amazonaws.services.ram;

import javax.annotation.Generated;

import com.amazonaws.services.ram.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing RAM asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * Use AWS Resource Access Manager to share AWS resources between AWS accounts. To share a resource, you create a
 * resource share, associate the resource with the resource share, and specify the principals that can access the
 * resource. The following principals are supported:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ID of an AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an OU from AWS Organizations
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an organization from AWS Organizations
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify an AWS account that doesn't exist in the same organization as the account that owns the resource
 * share, the owner of the specified account receives an invitation to accept the resource share. After the owner
 * accepts the invitation, they can access the resources in the resource share. An administrator of the specified
 * account can use IAM policies to restrict access resources in the resource share.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRAMAsyncClient extends AWSRAMClient implements AWSRAMAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRAMAsyncClientBuilder asyncBuilder() {
        return AWSRAMAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on RAM using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRAMAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptResourceShareInvitationResult> acceptResourceShareInvitationAsync(AcceptResourceShareInvitationRequest request) {

        return acceptResourceShareInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptResourceShareInvitationResult> acceptResourceShareInvitationAsync(
            final AcceptResourceShareInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptResourceShareInvitationRequest, AcceptResourceShareInvitationResult> asyncHandler) {
        final AcceptResourceShareInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptResourceShareInvitationResult>() {
            @Override
            public AcceptResourceShareInvitationResult call() throws Exception {
                AcceptResourceShareInvitationResult result = null;

                try {
                    result = executeAcceptResourceShareInvitation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceShareResult> associateResourceShareAsync(AssociateResourceShareRequest request) {

        return associateResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceShareResult> associateResourceShareAsync(final AssociateResourceShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResourceShareRequest, AssociateResourceShareResult> asyncHandler) {
        final AssociateResourceShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResourceShareResult>() {
            @Override
            public AssociateResourceShareResult call() throws Exception {
                AssociateResourceShareResult result = null;

                try {
                    result = executeAssociateResourceShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResourceShareResult> createResourceShareAsync(CreateResourceShareRequest request) {

        return createResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceShareResult> createResourceShareAsync(final CreateResourceShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResourceShareRequest, CreateResourceShareResult> asyncHandler) {
        final CreateResourceShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResourceShareResult>() {
            @Override
            public CreateResourceShareResult call() throws Exception {
                CreateResourceShareResult result = null;

                try {
                    result = executeCreateResourceShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceShareResult> deleteResourceShareAsync(DeleteResourceShareRequest request) {

        return deleteResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourceShareResult> deleteResourceShareAsync(final DeleteResourceShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourceShareRequest, DeleteResourceShareResult> asyncHandler) {
        final DeleteResourceShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourceShareResult>() {
            @Override
            public DeleteResourceShareResult call() throws Exception {
                DeleteResourceShareResult result = null;

                try {
                    result = executeDeleteResourceShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceShareResult> disassociateResourceShareAsync(DisassociateResourceShareRequest request) {

        return disassociateResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceShareResult> disassociateResourceShareAsync(final DisassociateResourceShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResourceShareRequest, DisassociateResourceShareResult> asyncHandler) {
        final DisassociateResourceShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResourceShareResult>() {
            @Override
            public DisassociateResourceShareResult call() throws Exception {
                DisassociateResourceShareResult result = null;

                try {
                    result = executeDisassociateResourceShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableSharingWithAwsOrganizationResult> enableSharingWithAwsOrganizationAsync(
            EnableSharingWithAwsOrganizationRequest request) {

        return enableSharingWithAwsOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSharingWithAwsOrganizationResult> enableSharingWithAwsOrganizationAsync(
            final EnableSharingWithAwsOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSharingWithAwsOrganizationRequest, EnableSharingWithAwsOrganizationResult> asyncHandler) {
        final EnableSharingWithAwsOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableSharingWithAwsOrganizationResult>() {
            @Override
            public EnableSharingWithAwsOrganizationResult call() throws Exception {
                EnableSharingWithAwsOrganizationResult result = null;

                try {
                    result = executeEnableSharingWithAwsOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest request) {

        return getResourcePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(final GetResourcePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePoliciesRequest, GetResourcePoliciesResult> asyncHandler) {
        final GetResourcePoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePoliciesResult>() {
            @Override
            public GetResourcePoliciesResult call() throws Exception {
                GetResourcePoliciesResult result = null;

                try {
                    result = executeGetResourcePolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareAssociationsResult> getResourceShareAssociationsAsync(GetResourceShareAssociationsRequest request) {

        return getResourceShareAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareAssociationsResult> getResourceShareAssociationsAsync(final GetResourceShareAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceShareAssociationsRequest, GetResourceShareAssociationsResult> asyncHandler) {
        final GetResourceShareAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceShareAssociationsResult>() {
            @Override
            public GetResourceShareAssociationsResult call() throws Exception {
                GetResourceShareAssociationsResult result = null;

                try {
                    result = executeGetResourceShareAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareInvitationsResult> getResourceShareInvitationsAsync(GetResourceShareInvitationsRequest request) {

        return getResourceShareInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceShareInvitationsResult> getResourceShareInvitationsAsync(final GetResourceShareInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceShareInvitationsRequest, GetResourceShareInvitationsResult> asyncHandler) {
        final GetResourceShareInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceShareInvitationsResult>() {
            @Override
            public GetResourceShareInvitationsResult call() throws Exception {
                GetResourceShareInvitationsResult result = null;

                try {
                    result = executeGetResourceShareInvitations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourceSharesResult> getResourceSharesAsync(GetResourceSharesRequest request) {

        return getResourceSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceSharesResult> getResourceSharesAsync(final GetResourceSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceSharesRequest, GetResourceSharesResult> asyncHandler) {
        final GetResourceSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceSharesResult>() {
            @Override
            public GetResourceSharesResult call() throws Exception {
                GetResourceSharesResult result = null;

                try {
                    result = executeGetResourceShares(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsResult> listPrincipalsAsync(ListPrincipalsRequest request) {

        return listPrincipalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPrincipalsResult> listPrincipalsAsync(final ListPrincipalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPrincipalsRequest, ListPrincipalsResult> asyncHandler) {
        final ListPrincipalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPrincipalsResult>() {
            @Override
            public ListPrincipalsResult call() throws Exception {
                ListPrincipalsResult result = null;

                try {
                    result = executeListPrincipals(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(final ListResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {
        final ListResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesResult>() {
            @Override
            public ListResourcesResult call() throws Exception {
                ListResourcesResult result = null;

                try {
                    result = executeListResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RejectResourceShareInvitationResult> rejectResourceShareInvitationAsync(RejectResourceShareInvitationRequest request) {

        return rejectResourceShareInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectResourceShareInvitationResult> rejectResourceShareInvitationAsync(
            final RejectResourceShareInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectResourceShareInvitationRequest, RejectResourceShareInvitationResult> asyncHandler) {
        final RejectResourceShareInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectResourceShareInvitationResult>() {
            @Override
            public RejectResourceShareInvitationResult call() throws Exception {
                RejectResourceShareInvitationResult result = null;

                try {
                    result = executeRejectResourceShareInvitation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateResourceShareResult> updateResourceShareAsync(UpdateResourceShareRequest request) {

        return updateResourceShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceShareResult> updateResourceShareAsync(final UpdateResourceShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceShareRequest, UpdateResourceShareResult> asyncHandler) {
        final UpdateResourceShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceShareResult>() {
            @Override
            public UpdateResourceShareResult call() throws Exception {
                UpdateResourceShareResult result = null;

                try {
                    result = executeUpdateResourceShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
