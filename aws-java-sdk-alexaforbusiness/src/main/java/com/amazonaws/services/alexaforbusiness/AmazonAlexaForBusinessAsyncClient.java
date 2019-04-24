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
 * Alexa for Business helps you use Alexa in your organization. Alexa for Business provides you with the tools to manage
 * Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
 * using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
 * skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
 * providing context-aware voice experiences for your customers. Device makers building with the Alexa Voice Service
 * (AVS) can create fully integrated solutions, register their products with Alexa for Business, and manage them as
 * shared devices in their organization.
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
    public java.util.concurrent.Future<ApproveSkillResult> approveSkillAsync(ApproveSkillRequest request) {

        return approveSkillAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApproveSkillResult> approveSkillAsync(final ApproveSkillRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApproveSkillRequest, ApproveSkillResult> asyncHandler) {
        final ApproveSkillRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ApproveSkillResult>() {
            @Override
            public ApproveSkillResult call() throws Exception {
                ApproveSkillResult result = null;

                try {
                    result = executeApproveSkill(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateContactWithAddressBookResult> associateContactWithAddressBookAsync(
            AssociateContactWithAddressBookRequest request) {

        return associateContactWithAddressBookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateContactWithAddressBookResult> associateContactWithAddressBookAsync(
            final AssociateContactWithAddressBookRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateContactWithAddressBookRequest, AssociateContactWithAddressBookResult> asyncHandler) {
        final AssociateContactWithAddressBookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateContactWithAddressBookResult>() {
            @Override
            public AssociateContactWithAddressBookResult call() throws Exception {
                AssociateContactWithAddressBookResult result = null;

                try {
                    result = executeAssociateContactWithAddressBook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
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
    public java.util.concurrent.Future<AssociateSkillWithSkillGroupResult> associateSkillWithSkillGroupAsync(AssociateSkillWithSkillGroupRequest request) {

        return associateSkillWithSkillGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSkillWithSkillGroupResult> associateSkillWithSkillGroupAsync(final AssociateSkillWithSkillGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSkillWithSkillGroupRequest, AssociateSkillWithSkillGroupResult> asyncHandler) {
        final AssociateSkillWithSkillGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSkillWithSkillGroupResult>() {
            @Override
            public AssociateSkillWithSkillGroupResult call() throws Exception {
                AssociateSkillWithSkillGroupResult result = null;

                try {
                    result = executeAssociateSkillWithSkillGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateSkillWithUsersResult> associateSkillWithUsersAsync(AssociateSkillWithUsersRequest request) {

        return associateSkillWithUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSkillWithUsersResult> associateSkillWithUsersAsync(final AssociateSkillWithUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSkillWithUsersRequest, AssociateSkillWithUsersResult> asyncHandler) {
        final AssociateSkillWithUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSkillWithUsersResult>() {
            @Override
            public AssociateSkillWithUsersResult call() throws Exception {
                AssociateSkillWithUsersResult result = null;

                try {
                    result = executeAssociateSkillWithUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAddressBookResult> createAddressBookAsync(CreateAddressBookRequest request) {

        return createAddressBookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAddressBookResult> createAddressBookAsync(final CreateAddressBookRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAddressBookRequest, CreateAddressBookResult> asyncHandler) {
        final CreateAddressBookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAddressBookResult>() {
            @Override
            public CreateAddressBookResult call() throws Exception {
                CreateAddressBookResult result = null;

                try {
                    result = executeCreateAddressBook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBusinessReportScheduleResult> createBusinessReportScheduleAsync(CreateBusinessReportScheduleRequest request) {

        return createBusinessReportScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBusinessReportScheduleResult> createBusinessReportScheduleAsync(final CreateBusinessReportScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBusinessReportScheduleRequest, CreateBusinessReportScheduleResult> asyncHandler) {
        final CreateBusinessReportScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBusinessReportScheduleResult>() {
            @Override
            public CreateBusinessReportScheduleResult call() throws Exception {
                CreateBusinessReportScheduleResult result = null;

                try {
                    result = executeCreateBusinessReportSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConferenceProviderResult> createConferenceProviderAsync(CreateConferenceProviderRequest request) {

        return createConferenceProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConferenceProviderResult> createConferenceProviderAsync(final CreateConferenceProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConferenceProviderRequest, CreateConferenceProviderResult> asyncHandler) {
        final CreateConferenceProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConferenceProviderResult>() {
            @Override
            public CreateConferenceProviderResult call() throws Exception {
                CreateConferenceProviderResult result = null;

                try {
                    result = executeCreateConferenceProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateContactResult> createContactAsync(CreateContactRequest request) {

        return createContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactResult> createContactAsync(final CreateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactRequest, CreateContactResult> asyncHandler) {
        final CreateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactResult>() {
            @Override
            public CreateContactResult call() throws Exception {
                CreateContactResult result = null;

                try {
                    result = executeCreateContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayGroupResult> createGatewayGroupAsync(CreateGatewayGroupRequest request) {

        return createGatewayGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayGroupResult> createGatewayGroupAsync(final CreateGatewayGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGatewayGroupRequest, CreateGatewayGroupResult> asyncHandler) {
        final CreateGatewayGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGatewayGroupResult>() {
            @Override
            public CreateGatewayGroupResult call() throws Exception {
                CreateGatewayGroupResult result = null;

                try {
                    result = executeCreateGatewayGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteAddressBookResult> deleteAddressBookAsync(DeleteAddressBookRequest request) {

        return deleteAddressBookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAddressBookResult> deleteAddressBookAsync(final DeleteAddressBookRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAddressBookRequest, DeleteAddressBookResult> asyncHandler) {
        final DeleteAddressBookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAddressBookResult>() {
            @Override
            public DeleteAddressBookResult call() throws Exception {
                DeleteAddressBookResult result = null;

                try {
                    result = executeDeleteAddressBook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBusinessReportScheduleResult> deleteBusinessReportScheduleAsync(DeleteBusinessReportScheduleRequest request) {

        return deleteBusinessReportScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBusinessReportScheduleResult> deleteBusinessReportScheduleAsync(final DeleteBusinessReportScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBusinessReportScheduleRequest, DeleteBusinessReportScheduleResult> asyncHandler) {
        final DeleteBusinessReportScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBusinessReportScheduleResult>() {
            @Override
            public DeleteBusinessReportScheduleResult call() throws Exception {
                DeleteBusinessReportScheduleResult result = null;

                try {
                    result = executeDeleteBusinessReportSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConferenceProviderResult> deleteConferenceProviderAsync(DeleteConferenceProviderRequest request) {

        return deleteConferenceProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConferenceProviderResult> deleteConferenceProviderAsync(final DeleteConferenceProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConferenceProviderRequest, DeleteConferenceProviderResult> asyncHandler) {
        final DeleteConferenceProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConferenceProviderResult>() {
            @Override
            public DeleteConferenceProviderResult call() throws Exception {
                DeleteConferenceProviderResult result = null;

                try {
                    result = executeDeleteConferenceProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(DeleteContactRequest request) {

        return deleteContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(final DeleteContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactRequest, DeleteContactResult> asyncHandler) {
        final DeleteContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactResult>() {
            @Override
            public DeleteContactResult call() throws Exception {
                DeleteContactResult result = null;

                try {
                    result = executeDeleteContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest request) {

        return deleteDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(final DeleteDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler) {
        final DeleteDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeviceResult>() {
            @Override
            public DeleteDeviceResult call() throws Exception {
                DeleteDeviceResult result = null;

                try {
                    result = executeDeleteDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayGroupResult> deleteGatewayGroupAsync(DeleteGatewayGroupRequest request) {

        return deleteGatewayGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayGroupResult> deleteGatewayGroupAsync(final DeleteGatewayGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGatewayGroupRequest, DeleteGatewayGroupResult> asyncHandler) {
        final DeleteGatewayGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGatewayGroupResult>() {
            @Override
            public DeleteGatewayGroupResult call() throws Exception {
                DeleteGatewayGroupResult result = null;

                try {
                    result = executeDeleteGatewayGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteSkillAuthorizationResult> deleteSkillAuthorizationAsync(DeleteSkillAuthorizationRequest request) {

        return deleteSkillAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSkillAuthorizationResult> deleteSkillAuthorizationAsync(final DeleteSkillAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSkillAuthorizationRequest, DeleteSkillAuthorizationResult> asyncHandler) {
        final DeleteSkillAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSkillAuthorizationResult>() {
            @Override
            public DeleteSkillAuthorizationResult call() throws Exception {
                DeleteSkillAuthorizationResult result = null;

                try {
                    result = executeDeleteSkillAuthorization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DisassociateContactFromAddressBookResult> disassociateContactFromAddressBookAsync(
            DisassociateContactFromAddressBookRequest request) {

        return disassociateContactFromAddressBookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateContactFromAddressBookResult> disassociateContactFromAddressBookAsync(
            final DisassociateContactFromAddressBookRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateContactFromAddressBookRequest, DisassociateContactFromAddressBookResult> asyncHandler) {
        final DisassociateContactFromAddressBookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateContactFromAddressBookResult>() {
            @Override
            public DisassociateContactFromAddressBookResult call() throws Exception {
                DisassociateContactFromAddressBookResult result = null;

                try {
                    result = executeDisassociateContactFromAddressBook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DisassociateSkillFromSkillGroupResult> disassociateSkillFromSkillGroupAsync(
            DisassociateSkillFromSkillGroupRequest request) {

        return disassociateSkillFromSkillGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSkillFromSkillGroupResult> disassociateSkillFromSkillGroupAsync(
            final DisassociateSkillFromSkillGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSkillFromSkillGroupRequest, DisassociateSkillFromSkillGroupResult> asyncHandler) {
        final DisassociateSkillFromSkillGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSkillFromSkillGroupResult>() {
            @Override
            public DisassociateSkillFromSkillGroupResult call() throws Exception {
                DisassociateSkillFromSkillGroupResult result = null;

                try {
                    result = executeDisassociateSkillFromSkillGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateSkillFromUsersResult> disassociateSkillFromUsersAsync(DisassociateSkillFromUsersRequest request) {

        return disassociateSkillFromUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSkillFromUsersResult> disassociateSkillFromUsersAsync(final DisassociateSkillFromUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSkillFromUsersRequest, DisassociateSkillFromUsersResult> asyncHandler) {
        final DisassociateSkillFromUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSkillFromUsersResult>() {
            @Override
            public DisassociateSkillFromUsersResult call() throws Exception {
                DisassociateSkillFromUsersResult result = null;

                try {
                    result = executeDisassociateSkillFromUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ForgetSmartHomeAppliancesResult> forgetSmartHomeAppliancesAsync(ForgetSmartHomeAppliancesRequest request) {

        return forgetSmartHomeAppliancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ForgetSmartHomeAppliancesResult> forgetSmartHomeAppliancesAsync(final ForgetSmartHomeAppliancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ForgetSmartHomeAppliancesRequest, ForgetSmartHomeAppliancesResult> asyncHandler) {
        final ForgetSmartHomeAppliancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ForgetSmartHomeAppliancesResult>() {
            @Override
            public ForgetSmartHomeAppliancesResult call() throws Exception {
                ForgetSmartHomeAppliancesResult result = null;

                try {
                    result = executeForgetSmartHomeAppliances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAddressBookResult> getAddressBookAsync(GetAddressBookRequest request) {

        return getAddressBookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAddressBookResult> getAddressBookAsync(final GetAddressBookRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAddressBookRequest, GetAddressBookResult> asyncHandler) {
        final GetAddressBookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAddressBookResult>() {
            @Override
            public GetAddressBookResult call() throws Exception {
                GetAddressBookResult result = null;

                try {
                    result = executeGetAddressBook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConferencePreferenceResult> getConferencePreferenceAsync(GetConferencePreferenceRequest request) {

        return getConferencePreferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConferencePreferenceResult> getConferencePreferenceAsync(final GetConferencePreferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConferencePreferenceRequest, GetConferencePreferenceResult> asyncHandler) {
        final GetConferencePreferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConferencePreferenceResult>() {
            @Override
            public GetConferencePreferenceResult call() throws Exception {
                GetConferencePreferenceResult result = null;

                try {
                    result = executeGetConferencePreference(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConferenceProviderResult> getConferenceProviderAsync(GetConferenceProviderRequest request) {

        return getConferenceProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConferenceProviderResult> getConferenceProviderAsync(final GetConferenceProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConferenceProviderRequest, GetConferenceProviderResult> asyncHandler) {
        final GetConferenceProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConferenceProviderResult>() {
            @Override
            public GetConferenceProviderResult call() throws Exception {
                GetConferenceProviderResult result = null;

                try {
                    result = executeGetConferenceProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetContactResult> getContactAsync(GetContactRequest request) {

        return getContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactResult> getContactAsync(final GetContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactRequest, GetContactResult> asyncHandler) {
        final GetContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactResult>() {
            @Override
            public GetContactResult call() throws Exception {
                GetContactResult result = null;

                try {
                    result = executeGetContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest request) {

        return getGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(final GetGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGatewayRequest, GetGatewayResult> asyncHandler) {
        final GetGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGatewayResult>() {
            @Override
            public GetGatewayResult call() throws Exception {
                GetGatewayResult result = null;

                try {
                    result = executeGetGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGatewayGroupResult> getGatewayGroupAsync(GetGatewayGroupRequest request) {

        return getGatewayGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGatewayGroupResult> getGatewayGroupAsync(final GetGatewayGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGatewayGroupRequest, GetGatewayGroupResult> asyncHandler) {
        final GetGatewayGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGatewayGroupResult>() {
            @Override
            public GetGatewayGroupResult call() throws Exception {
                GetGatewayGroupResult result = null;

                try {
                    result = executeGetGatewayGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInvitationConfigurationResult> getInvitationConfigurationAsync(GetInvitationConfigurationRequest request) {

        return getInvitationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInvitationConfigurationResult> getInvitationConfigurationAsync(final GetInvitationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInvitationConfigurationRequest, GetInvitationConfigurationResult> asyncHandler) {
        final GetInvitationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInvitationConfigurationResult>() {
            @Override
            public GetInvitationConfigurationResult call() throws Exception {
                GetInvitationConfigurationResult result = null;

                try {
                    result = executeGetInvitationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListBusinessReportSchedulesResult> listBusinessReportSchedulesAsync(ListBusinessReportSchedulesRequest request) {

        return listBusinessReportSchedulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBusinessReportSchedulesResult> listBusinessReportSchedulesAsync(final ListBusinessReportSchedulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBusinessReportSchedulesRequest, ListBusinessReportSchedulesResult> asyncHandler) {
        final ListBusinessReportSchedulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBusinessReportSchedulesResult>() {
            @Override
            public ListBusinessReportSchedulesResult call() throws Exception {
                ListBusinessReportSchedulesResult result = null;

                try {
                    result = executeListBusinessReportSchedules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConferenceProvidersResult> listConferenceProvidersAsync(ListConferenceProvidersRequest request) {

        return listConferenceProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConferenceProvidersResult> listConferenceProvidersAsync(final ListConferenceProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConferenceProvidersRequest, ListConferenceProvidersResult> asyncHandler) {
        final ListConferenceProvidersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConferenceProvidersResult>() {
            @Override
            public ListConferenceProvidersResult call() throws Exception {
                ListConferenceProvidersResult result = null;

                try {
                    result = executeListConferenceProviders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest request) {

        return listDeviceEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(final ListDeviceEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceEventsRequest, ListDeviceEventsResult> asyncHandler) {
        final ListDeviceEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceEventsResult>() {
            @Override
            public ListDeviceEventsResult call() throws Exception {
                ListDeviceEventsResult result = null;

                try {
                    result = executeListDeviceEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGatewayGroupsResult> listGatewayGroupsAsync(ListGatewayGroupsRequest request) {

        return listGatewayGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewayGroupsResult> listGatewayGroupsAsync(final ListGatewayGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewayGroupsRequest, ListGatewayGroupsResult> asyncHandler) {
        final ListGatewayGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGatewayGroupsResult>() {
            @Override
            public ListGatewayGroupsResult call() throws Exception {
                ListGatewayGroupsResult result = null;

                try {
                    result = executeListGatewayGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request) {

        return listGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(final ListGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {
        final ListGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGatewaysResult>() {
            @Override
            public ListGatewaysResult call() throws Exception {
                ListGatewaysResult result = null;

                try {
                    result = executeListGateways(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListSkillsStoreCategoriesResult> listSkillsStoreCategoriesAsync(ListSkillsStoreCategoriesRequest request) {

        return listSkillsStoreCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSkillsStoreCategoriesResult> listSkillsStoreCategoriesAsync(final ListSkillsStoreCategoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSkillsStoreCategoriesRequest, ListSkillsStoreCategoriesResult> asyncHandler) {
        final ListSkillsStoreCategoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSkillsStoreCategoriesResult>() {
            @Override
            public ListSkillsStoreCategoriesResult call() throws Exception {
                ListSkillsStoreCategoriesResult result = null;

                try {
                    result = executeListSkillsStoreCategories(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSkillsStoreSkillsByCategoryResult> listSkillsStoreSkillsByCategoryAsync(
            ListSkillsStoreSkillsByCategoryRequest request) {

        return listSkillsStoreSkillsByCategoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSkillsStoreSkillsByCategoryResult> listSkillsStoreSkillsByCategoryAsync(
            final ListSkillsStoreSkillsByCategoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSkillsStoreSkillsByCategoryRequest, ListSkillsStoreSkillsByCategoryResult> asyncHandler) {
        final ListSkillsStoreSkillsByCategoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSkillsStoreSkillsByCategoryResult>() {
            @Override
            public ListSkillsStoreSkillsByCategoryResult call() throws Exception {
                ListSkillsStoreSkillsByCategoryResult result = null;

                try {
                    result = executeListSkillsStoreSkillsByCategory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSmartHomeAppliancesResult> listSmartHomeAppliancesAsync(ListSmartHomeAppliancesRequest request) {

        return listSmartHomeAppliancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSmartHomeAppliancesResult> listSmartHomeAppliancesAsync(final ListSmartHomeAppliancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSmartHomeAppliancesRequest, ListSmartHomeAppliancesResult> asyncHandler) {
        final ListSmartHomeAppliancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSmartHomeAppliancesResult>() {
            @Override
            public ListSmartHomeAppliancesResult call() throws Exception {
                ListSmartHomeAppliancesResult result = null;

                try {
                    result = executeListSmartHomeAppliances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutConferencePreferenceResult> putConferencePreferenceAsync(PutConferencePreferenceRequest request) {

        return putConferencePreferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutConferencePreferenceResult> putConferencePreferenceAsync(final PutConferencePreferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutConferencePreferenceRequest, PutConferencePreferenceResult> asyncHandler) {
        final PutConferencePreferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutConferencePreferenceResult>() {
            @Override
            public PutConferencePreferenceResult call() throws Exception {
                PutConferencePreferenceResult result = null;

                try {
                    result = executePutConferencePreference(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutInvitationConfigurationResult> putInvitationConfigurationAsync(PutInvitationConfigurationRequest request) {

        return putInvitationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutInvitationConfigurationResult> putInvitationConfigurationAsync(final PutInvitationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutInvitationConfigurationRequest, PutInvitationConfigurationResult> asyncHandler) {
        final PutInvitationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutInvitationConfigurationResult>() {
            @Override
            public PutInvitationConfigurationResult call() throws Exception {
                PutInvitationConfigurationResult result = null;

                try {
                    result = executePutInvitationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutSkillAuthorizationResult> putSkillAuthorizationAsync(PutSkillAuthorizationRequest request) {

        return putSkillAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSkillAuthorizationResult> putSkillAuthorizationAsync(final PutSkillAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSkillAuthorizationRequest, PutSkillAuthorizationResult> asyncHandler) {
        final PutSkillAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSkillAuthorizationResult>() {
            @Override
            public PutSkillAuthorizationResult call() throws Exception {
                PutSkillAuthorizationResult result = null;

                try {
                    result = executePutSkillAuthorization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterAVSDeviceResult> registerAVSDeviceAsync(RegisterAVSDeviceRequest request) {

        return registerAVSDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAVSDeviceResult> registerAVSDeviceAsync(final RegisterAVSDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterAVSDeviceRequest, RegisterAVSDeviceResult> asyncHandler) {
        final RegisterAVSDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterAVSDeviceResult>() {
            @Override
            public RegisterAVSDeviceResult call() throws Exception {
                RegisterAVSDeviceResult result = null;

                try {
                    result = executeRegisterAVSDevice(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RejectSkillResult> rejectSkillAsync(RejectSkillRequest request) {

        return rejectSkillAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectSkillResult> rejectSkillAsync(final RejectSkillRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectSkillRequest, RejectSkillResult> asyncHandler) {
        final RejectSkillRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectSkillResult>() {
            @Override
            public RejectSkillResult call() throws Exception {
                RejectSkillResult result = null;

                try {
                    result = executeRejectSkill(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<SearchAddressBooksResult> searchAddressBooksAsync(SearchAddressBooksRequest request) {

        return searchAddressBooksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchAddressBooksResult> searchAddressBooksAsync(final SearchAddressBooksRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchAddressBooksRequest, SearchAddressBooksResult> asyncHandler) {
        final SearchAddressBooksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchAddressBooksResult>() {
            @Override
            public SearchAddressBooksResult call() throws Exception {
                SearchAddressBooksResult result = null;

                try {
                    result = executeSearchAddressBooks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchContactsResult> searchContactsAsync(SearchContactsRequest request) {

        return searchContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchContactsResult> searchContactsAsync(final SearchContactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchContactsRequest, SearchContactsResult> asyncHandler) {
        final SearchContactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchContactsResult>() {
            @Override
            public SearchContactsResult call() throws Exception {
                SearchContactsResult result = null;

                try {
                    result = executeSearchContacts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<StartSmartHomeApplianceDiscoveryResult> startSmartHomeApplianceDiscoveryAsync(
            StartSmartHomeApplianceDiscoveryRequest request) {

        return startSmartHomeApplianceDiscoveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSmartHomeApplianceDiscoveryResult> startSmartHomeApplianceDiscoveryAsync(
            final StartSmartHomeApplianceDiscoveryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSmartHomeApplianceDiscoveryRequest, StartSmartHomeApplianceDiscoveryResult> asyncHandler) {
        final StartSmartHomeApplianceDiscoveryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSmartHomeApplianceDiscoveryResult>() {
            @Override
            public StartSmartHomeApplianceDiscoveryResult call() throws Exception {
                StartSmartHomeApplianceDiscoveryResult result = null;

                try {
                    result = executeStartSmartHomeApplianceDiscovery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAddressBookResult> updateAddressBookAsync(UpdateAddressBookRequest request) {

        return updateAddressBookAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAddressBookResult> updateAddressBookAsync(final UpdateAddressBookRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAddressBookRequest, UpdateAddressBookResult> asyncHandler) {
        final UpdateAddressBookRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAddressBookResult>() {
            @Override
            public UpdateAddressBookResult call() throws Exception {
                UpdateAddressBookResult result = null;

                try {
                    result = executeUpdateAddressBook(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBusinessReportScheduleResult> updateBusinessReportScheduleAsync(UpdateBusinessReportScheduleRequest request) {

        return updateBusinessReportScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBusinessReportScheduleResult> updateBusinessReportScheduleAsync(final UpdateBusinessReportScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBusinessReportScheduleRequest, UpdateBusinessReportScheduleResult> asyncHandler) {
        final UpdateBusinessReportScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBusinessReportScheduleResult>() {
            @Override
            public UpdateBusinessReportScheduleResult call() throws Exception {
                UpdateBusinessReportScheduleResult result = null;

                try {
                    result = executeUpdateBusinessReportSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConferenceProviderResult> updateConferenceProviderAsync(UpdateConferenceProviderRequest request) {

        return updateConferenceProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConferenceProviderResult> updateConferenceProviderAsync(final UpdateConferenceProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConferenceProviderRequest, UpdateConferenceProviderResult> asyncHandler) {
        final UpdateConferenceProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConferenceProviderResult>() {
            @Override
            public UpdateConferenceProviderResult call() throws Exception {
                UpdateConferenceProviderResult result = null;

                try {
                    result = executeUpdateConferenceProvider(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest request) {

        return updateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(final UpdateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler) {
        final UpdateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactResult>() {
            @Override
            public UpdateContactResult call() throws Exception {
                UpdateContactResult result = null;

                try {
                    result = executeUpdateContact(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(UpdateGatewayRequest request) {

        return updateGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(final UpdateGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayRequest, UpdateGatewayResult> asyncHandler) {
        final UpdateGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayResult>() {
            @Override
            public UpdateGatewayResult call() throws Exception {
                UpdateGatewayResult result = null;

                try {
                    result = executeUpdateGateway(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayGroupResult> updateGatewayGroupAsync(UpdateGatewayGroupRequest request) {

        return updateGatewayGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayGroupResult> updateGatewayGroupAsync(final UpdateGatewayGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayGroupRequest, UpdateGatewayGroupResult> asyncHandler) {
        final UpdateGatewayGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayGroupResult>() {
            @Override
            public UpdateGatewayGroupResult call() throws Exception {
                UpdateGatewayGroupResult result = null;

                try {
                    result = executeUpdateGatewayGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
