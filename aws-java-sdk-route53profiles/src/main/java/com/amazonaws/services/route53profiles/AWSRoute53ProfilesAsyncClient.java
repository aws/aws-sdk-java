/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53profiles;

import javax.annotation.Generated;

import com.amazonaws.services.route53profiles.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Route 53 Profiles asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * With Amazon Route 53 Profiles you can share Route 53 configurations with VPCs and AWS accounts
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53ProfilesAsyncClient extends AWSRoute53ProfilesClient implements AWSRoute53ProfilesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRoute53ProfilesAsyncClientBuilder asyncBuilder() {
        return AWSRoute53ProfilesAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 Profiles using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRoute53ProfilesAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route 53 Profiles using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSRoute53ProfilesAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateProfileResult> associateProfileAsync(AssociateProfileRequest request) {

        return associateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateProfileResult> associateProfileAsync(final AssociateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateProfileRequest, AssociateProfileResult> asyncHandler) {
        final AssociateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateProfileResult>() {
            @Override
            public AssociateProfileResult call() throws Exception {
                AssociateProfileResult result = null;

                try {
                    result = executeAssociateProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceToProfileResult> associateResourceToProfileAsync(AssociateResourceToProfileRequest request) {

        return associateResourceToProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateResourceToProfileResult> associateResourceToProfileAsync(final AssociateResourceToProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateResourceToProfileRequest, AssociateResourceToProfileResult> asyncHandler) {
        final AssociateResourceToProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateResourceToProfileResult>() {
            @Override
            public AssociateResourceToProfileResult call() throws Exception {
                AssociateResourceToProfileResult result = null;

                try {
                    result = executeAssociateResourceToProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request) {

        return createProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(final CreateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler) {
        final CreateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfileResult>() {
            @Override
            public CreateProfileResult call() throws Exception {
                CreateProfileResult result = null;

                try {
                    result = executeCreateProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request) {

        return deleteProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(final DeleteProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler) {
        final DeleteProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileResult>() {
            @Override
            public DeleteProfileResult call() throws Exception {
                DeleteProfileResult result = null;

                try {
                    result = executeDeleteProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateProfileResult> disassociateProfileAsync(DisassociateProfileRequest request) {

        return disassociateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateProfileResult> disassociateProfileAsync(final DisassociateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateProfileRequest, DisassociateProfileResult> asyncHandler) {
        final DisassociateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateProfileResult>() {
            @Override
            public DisassociateProfileResult call() throws Exception {
                DisassociateProfileResult result = null;

                try {
                    result = executeDisassociateProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceFromProfileResult> disassociateResourceFromProfileAsync(
            DisassociateResourceFromProfileRequest request) {

        return disassociateResourceFromProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateResourceFromProfileResult> disassociateResourceFromProfileAsync(
            final DisassociateResourceFromProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateResourceFromProfileRequest, DisassociateResourceFromProfileResult> asyncHandler) {
        final DisassociateResourceFromProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateResourceFromProfileResult>() {
            @Override
            public DisassociateResourceFromProfileResult call() throws Exception {
                DisassociateResourceFromProfileResult result = null;

                try {
                    result = executeDisassociateResourceFromProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest request) {

        return getProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(final GetProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler) {
        final GetProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileResult>() {
            @Override
            public GetProfileResult call() throws Exception {
                GetProfileResult result = null;

                try {
                    result = executeGetProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProfileAssociationResult> getProfileAssociationAsync(GetProfileAssociationRequest request) {

        return getProfileAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileAssociationResult> getProfileAssociationAsync(final GetProfileAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileAssociationRequest, GetProfileAssociationResult> asyncHandler) {
        final GetProfileAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileAssociationResult>() {
            @Override
            public GetProfileAssociationResult call() throws Exception {
                GetProfileAssociationResult result = null;

                try {
                    result = executeGetProfileAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProfileResourceAssociationResult> getProfileResourceAssociationAsync(GetProfileResourceAssociationRequest request) {

        return getProfileResourceAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResourceAssociationResult> getProfileResourceAssociationAsync(
            final GetProfileResourceAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileResourceAssociationRequest, GetProfileResourceAssociationResult> asyncHandler) {
        final GetProfileResourceAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileResourceAssociationResult>() {
            @Override
            public GetProfileResourceAssociationResult call() throws Exception {
                GetProfileResourceAssociationResult result = null;

                try {
                    result = executeGetProfileResourceAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProfileAssociationsResult> listProfileAssociationsAsync(ListProfileAssociationsRequest request) {

        return listProfileAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileAssociationsResult> listProfileAssociationsAsync(final ListProfileAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileAssociationsRequest, ListProfileAssociationsResult> asyncHandler) {
        final ListProfileAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileAssociationsResult>() {
            @Override
            public ListProfileAssociationsResult call() throws Exception {
                ListProfileAssociationsResult result = null;

                try {
                    result = executeListProfileAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProfileResourceAssociationsResult> listProfileResourceAssociationsAsync(
            ListProfileResourceAssociationsRequest request) {

        return listProfileResourceAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileResourceAssociationsResult> listProfileResourceAssociationsAsync(
            final ListProfileResourceAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileResourceAssociationsRequest, ListProfileResourceAssociationsResult> asyncHandler) {
        final ListProfileResourceAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileResourceAssociationsResult>() {
            @Override
            public ListProfileResourceAssociationsResult call() throws Exception {
                ListProfileResourceAssociationsResult result = null;

                try {
                    result = executeListProfileResourceAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest request) {

        return listProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(final ListProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler) {
        final ListProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfilesResult>() {
            @Override
            public ListProfilesResult call() throws Exception {
                ListProfilesResult result = null;

                try {
                    result = executeListProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateProfileResourceAssociationResult> updateProfileResourceAssociationAsync(
            UpdateProfileResourceAssociationRequest request) {

        return updateProfileResourceAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResourceAssociationResult> updateProfileResourceAssociationAsync(
            final UpdateProfileResourceAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfileResourceAssociationRequest, UpdateProfileResourceAssociationResult> asyncHandler) {
        final UpdateProfileResourceAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfileResourceAssociationResult>() {
            @Override
            public UpdateProfileResourceAssociationResult call() throws Exception {
                UpdateProfileResourceAssociationResult result = null;

                try {
                    result = executeUpdateProfileResourceAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
