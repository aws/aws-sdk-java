/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness;

import javax.annotation.Generated;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Alexa For Business asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Alexa for Business makes it easy for you to use Alexa in your organization. Alexa for Business gives you the tools
 * you need to manage Alexa devices, enroll your users, and assign skills, at scale. You can build your own
 * context-aware voice skills using the Alexa Skills Kit, and the Alexa for Business APIs, and you can make these
 * available as private skills for your organization. Alexa for Business also makes it easy to voice-enable your
 * products and services, providing context-aware voice experiences for your customers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAlexaForBusinessAsyncClient extends AmazonAlexaForBusinessClient implements AmazonAlexaForBusinessAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonAlexaForBusinessAsyncClientBuilder asyncBuilder() {
        return AmazonAlexaForBusinessAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Alexa For Business using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonAlexaForBusinessAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateDeviceWithRoomResult> associateDeviceWithRoomAsync(AssociateDeviceWithRoomRequest request) {

        return associateDeviceWithRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDeviceWithRoomResult> associateDeviceWithRoomAsync(final AssociateDeviceWithRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDeviceWithRoomRequest, AssociateDeviceWithRoomResult> asyncHandler) {
        final AssociateDeviceWithRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDeviceWithRoomResult>() {
            @Override
            public AssociateDeviceWithRoomResult call() throws Exception {
                AssociateDeviceWithRoomResult result = null;

                try {
                    result = executeAssociateDeviceWithRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateSkillGroupWithRoomResult> associateSkillGroupWithRoomAsync(AssociateSkillGroupWithRoomRequest request) {

        return associateSkillGroupWithRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSkillGroupWithRoomResult> associateSkillGroupWithRoomAsync(final AssociateSkillGroupWithRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSkillGroupWithRoomRequest, AssociateSkillGroupWithRoomResult> asyncHandler) {
        final AssociateSkillGroupWithRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSkillGroupWithRoomResult>() {
            @Override
            public AssociateSkillGroupWithRoomResult call() throws Exception {
                AssociateSkillGroupWithRoomResult result = null;

                try {
                    result = executeAssociateSkillGroupWithRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest request) {

        return createRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoomResult> createRoomAsync(final CreateRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoomRequest, CreateRoomResult> asyncHandler) {
        final CreateRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoomResult>() {
            @Override
            public CreateRoomResult call() throws Exception {
                CreateRoomResult result = null;

                try {
                    result = executeCreateRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSkillGroupResult> createSkillGroupAsync(CreateSkillGroupRequest request) {

        return createSkillGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSkillGroupResult> createSkillGroupAsync(final CreateSkillGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSkillGroupRequest, CreateSkillGroupResult> asyncHandler) {
        final CreateSkillGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSkillGroupResult>() {
            @Override
            public CreateSkillGroupResult call() throws Exception {
                CreateSkillGroupResult result = null;

                try {
                    result = executeCreateSkillGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest request) {

        return deleteRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(final DeleteRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoomRequest, DeleteRoomResult> asyncHandler) {
        final DeleteRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoomResult>() {
            @Override
            public DeleteRoomResult call() throws Exception {
                DeleteRoomResult result = null;

                try {
                    result = executeDeleteRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomSkillParameterResult> deleteRoomSkillParameterAsync(DeleteRoomSkillParameterRequest request) {

        return deleteRoomSkillParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomSkillParameterResult> deleteRoomSkillParameterAsync(final DeleteRoomSkillParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoomSkillParameterRequest, DeleteRoomSkillParameterResult> asyncHandler) {
        final DeleteRoomSkillParameterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoomSkillParameterResult>() {
            @Override
            public DeleteRoomSkillParameterResult call() throws Exception {
                DeleteRoomSkillParameterResult result = null;

                try {
                    result = executeDeleteRoomSkillParameter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSkillGroupResult> deleteSkillGroupAsync(DeleteSkillGroupRequest request) {

        return deleteSkillGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSkillGroupResult> deleteSkillGroupAsync(final DeleteSkillGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSkillGroupRequest, DeleteSkillGroupResult> asyncHandler) {
        final DeleteSkillGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSkillGroupResult>() {
            @Override
            public DeleteSkillGroupResult call() throws Exception {
                DeleteSkillGroupResult result = null;

                try {
                    result = executeDeleteSkillGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateDeviceFromRoomResult> disassociateDeviceFromRoomAsync(DisassociateDeviceFromRoomRequest request) {

        return disassociateDeviceFromRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateDeviceFromRoomResult> disassociateDeviceFromRoomAsync(final DisassociateDeviceFromRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateDeviceFromRoomRequest, DisassociateDeviceFromRoomResult> asyncHandler) {
        final DisassociateDeviceFromRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateDeviceFromRoomResult>() {
            @Override
            public DisassociateDeviceFromRoomResult call() throws Exception {
                DisassociateDeviceFromRoomResult result = null;

                try {
                    result = executeDisassociateDeviceFromRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateSkillGroupFromRoomResult> disassociateSkillGroupFromRoomAsync(DisassociateSkillGroupFromRoomRequest request) {

        return disassociateSkillGroupFromRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSkillGroupFromRoomResult> disassociateSkillGroupFromRoomAsync(
            final DisassociateSkillGroupFromRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSkillGroupFromRoomRequest, DisassociateSkillGroupFromRoomResult> asyncHandler) {
        final DisassociateSkillGroupFromRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSkillGroupFromRoomResult>() {
            @Override
            public DisassociateSkillGroupFromRoomResult call() throws Exception {
                DisassociateSkillGroupFromRoomResult result = null;

                try {
                    result = executeDisassociateSkillGroupFromRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest request) {

        return getDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(final GetDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler) {
        final GetDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceResult>() {
            @Override
            public GetDeviceResult call() throws Exception {
                GetDeviceResult result = null;

                try {
                    result = executeGetDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest request) {

        return getRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoomResult> getRoomAsync(final GetRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRoomRequest, GetRoomResult> asyncHandler) {
        final GetRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRoomResult>() {
            @Override
            public GetRoomResult call() throws Exception {
                GetRoomResult result = null;

                try {
                    result = executeGetRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRoomSkillParameterResult> getRoomSkillParameterAsync(GetRoomSkillParameterRequest request) {

        return getRoomSkillParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoomSkillParameterResult> getRoomSkillParameterAsync(final GetRoomSkillParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRoomSkillParameterRequest, GetRoomSkillParameterResult> asyncHandler) {
        final GetRoomSkillParameterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRoomSkillParameterResult>() {
            @Override
            public GetRoomSkillParameterResult call() throws Exception {
                GetRoomSkillParameterResult result = null;

                try {
                    result = executeGetRoomSkillParameter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSkillGroupResult> getSkillGroupAsync(GetSkillGroupRequest request) {

        return getSkillGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSkillGroupResult> getSkillGroupAsync(final GetSkillGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSkillGroupRequest, GetSkillGroupResult> asyncHandler) {
        final GetSkillGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSkillGroupResult>() {
            @Override
            public GetSkillGroupResult call() throws Exception {
                GetSkillGroupResult result = null;

                try {
                    result = executeGetSkillGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSkillsResult> listSkillsAsync(ListSkillsRequest request) {

        return listSkillsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSkillsResult> listSkillsAsync(final ListSkillsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSkillsRequest, ListSkillsResult> asyncHandler) {
        final ListSkillsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSkillsResult>() {
            @Override
            public ListSkillsResult call() throws Exception {
                ListSkillsResult result = null;

                try {
                    result = executeListSkills(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(final ListTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {
        final ListTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsResult>() {
            @Override
            public ListTagsResult call() throws Exception {
                ListTagsResult result = null;

                try {
                    result = executeListTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRoomSkillParameterResult> putRoomSkillParameterAsync(PutRoomSkillParameterRequest request) {

        return putRoomSkillParameterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRoomSkillParameterResult> putRoomSkillParameterAsync(final PutRoomSkillParameterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRoomSkillParameterRequest, PutRoomSkillParameterResult> asyncHandler) {
        final PutRoomSkillParameterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRoomSkillParameterResult>() {
            @Override
            public PutRoomSkillParameterResult call() throws Exception {
                PutRoomSkillParameterResult result = null;

                try {
                    result = executePutRoomSkillParameter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResolveRoomResult> resolveRoomAsync(ResolveRoomRequest request) {

        return resolveRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveRoomResult> resolveRoomAsync(final ResolveRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResolveRoomRequest, ResolveRoomResult> asyncHandler) {
        final ResolveRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResolveRoomResult>() {
            @Override
            public ResolveRoomResult call() throws Exception {
                ResolveRoomResult result = null;

                try {
                    result = executeResolveRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RevokeInvitationResult> revokeInvitationAsync(RevokeInvitationRequest request) {

        return revokeInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeInvitationResult> revokeInvitationAsync(final RevokeInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeInvitationRequest, RevokeInvitationResult> asyncHandler) {
        final RevokeInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeInvitationResult>() {
            @Override
            public RevokeInvitationResult call() throws Exception {
                RevokeInvitationResult result = null;

                try {
                    result = executeRevokeInvitation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest request) {

        return searchDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(final SearchDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchDevicesRequest, SearchDevicesResult> asyncHandler) {
        final SearchDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchDevicesResult>() {
            @Override
            public SearchDevicesResult call() throws Exception {
                SearchDevicesResult result = null;

                try {
                    result = executeSearchDevices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest request) {

        return searchProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(final SearchProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchProfilesRequest, SearchProfilesResult> asyncHandler) {
        final SearchProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchProfilesResult>() {
            @Override
            public SearchProfilesResult call() throws Exception {
                SearchProfilesResult result = null;

                try {
                    result = executeSearchProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchRoomsResult> searchRoomsAsync(SearchRoomsRequest request) {

        return searchRoomsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchRoomsResult> searchRoomsAsync(final SearchRoomsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRoomsRequest, SearchRoomsResult> asyncHandler) {
        final SearchRoomsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchRoomsResult>() {
            @Override
            public SearchRoomsResult call() throws Exception {
                SearchRoomsResult result = null;

                try {
                    result = executeSearchRooms(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchSkillGroupsResult> searchSkillGroupsAsync(SearchSkillGroupsRequest request) {

        return searchSkillGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchSkillGroupsResult> searchSkillGroupsAsync(final SearchSkillGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchSkillGroupsRequest, SearchSkillGroupsResult> asyncHandler) {
        final SearchSkillGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchSkillGroupsResult>() {
            @Override
            public SearchSkillGroupsResult call() throws Exception {
                SearchSkillGroupsResult result = null;

                try {
                    result = executeSearchSkillGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest request) {

        return searchUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(final SearchUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchUsersRequest, SearchUsersResult> asyncHandler) {
        final SearchUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchUsersResult>() {
            @Override
            public SearchUsersResult call() throws Exception {
                SearchUsersResult result = null;

                try {
                    result = executeSearchUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendInvitationResult> sendInvitationAsync(SendInvitationRequest request) {

        return sendInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendInvitationResult> sendInvitationAsync(final SendInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendInvitationRequest, SendInvitationResult> asyncHandler) {
        final SendInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendInvitationResult>() {
            @Override
            public SendInvitationResult call() throws Exception {
                SendInvitationResult result = null;

                try {
                    result = executeSendInvitation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDeviceSyncResult> startDeviceSyncAsync(StartDeviceSyncRequest request) {

        return startDeviceSyncAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeviceSyncResult> startDeviceSyncAsync(final StartDeviceSyncRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDeviceSyncRequest, StartDeviceSyncResult> asyncHandler) {
        final StartDeviceSyncRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDeviceSyncResult>() {
            @Override
            public StartDeviceSyncResult call() throws Exception {
                StartDeviceSyncResult result = null;

                try {
                    result = executeStartDeviceSync(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest request) {

        return updateDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(final UpdateDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceRequest, UpdateDeviceResult> asyncHandler) {
        final UpdateDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceResult>() {
            @Override
            public UpdateDeviceResult call() throws Exception {
                UpdateDeviceResult result = null;

                try {
                    result = executeUpdateDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest request) {

        return updateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(final UpdateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler) {
        final UpdateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfileResult>() {
            @Override
            public UpdateProfileResult call() throws Exception {
                UpdateProfileResult result = null;

                try {
                    result = executeUpdateProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest request) {

        return updateRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(final UpdateRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoomRequest, UpdateRoomResult> asyncHandler) {
        final UpdateRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoomResult>() {
            @Override
            public UpdateRoomResult call() throws Exception {
                UpdateRoomResult result = null;

                try {
                    result = executeUpdateRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSkillGroupResult> updateSkillGroupAsync(UpdateSkillGroupRequest request) {

        return updateSkillGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSkillGroupResult> updateSkillGroupAsync(final UpdateSkillGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSkillGroupRequest, UpdateSkillGroupResult> asyncHandler) {
        final UpdateSkillGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSkillGroupResult>() {
            @Override
            public UpdateSkillGroupResult call() throws Exception {
                UpdateSkillGroupResult result = null;

                try {
                    result = executeUpdateSkillGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
