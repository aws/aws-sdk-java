/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Chime asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon Chime API (application programming interface) is designed for developers to perform key tasks, such as
 * creating and managing Amazon Chime accounts, users, and Voice Connectors. This guide provides detailed information
 * about the Amazon Chime API, including operations, types, inputs and outputs, and error codes. It also includes some
 * server-side API actions to use with the Amazon Chime SDK. For more information about the Amazon Chime SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the <i>Amazon
 * Chime Developer Guide</i>.
 * </p>
 * <p>
 * You can use an AWS SDK, the AWS Command Line Interface (AWS CLI), or the REST API to make API calls. We recommend
 * using an AWS SDK or the AWS CLI. Each API operation includes links to information about using it with a
 * language-specific AWS SDK or the AWS CLI.
 * </p>
 * <dl>
 * <dt>Using an AWS SDK</dt>
 * <dd>
 * <p>
 * You don't need to write code to calculate a signature for request authentication. The SDK clients authenticate your
 * requests by using access keys that you provide. For more information about AWS SDKs, see the <a
 * href="http://aws.amazon.com/developer/">AWS Developer Center</a>.
 * </p>
 * </dd>
 * <dt>Using the AWS CLI</dt>
 * <dd>
 * <p>
 * Use your access keys with the AWS CLI to make API calls. For information about setting up the AWS CLI, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/installing.html">Installing the AWS Command Line Interface</a>
 * in the <i>AWS Command Line Interface User Guide</i>. For a list of available Amazon Chime commands, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/chime/index.html">Amazon Chime commands</a> in the <i>AWS CLI
 * Command Reference</i>.
 * </p>
 * </dd>
 * <dt>Using REST API</dt>
 * <dd>
 * <p>
 * If you use REST to make API calls, you must authenticate your request by providing a signature. Amazon Chime supports
 * signature version 4. For more information, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>
 * in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * <p>
 * When making REST API calls, use the service name <code>chime</code> and REST endpoint
 * <code>https://service.chime.aws.amazon.com</code>.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * Administrative permissions are controlled using AWS Identity and Access Management (IAM). For more information, see
 * <a href="https://docs.aws.amazon.com/chime/latest/ag/security-iam.html">Identity and Access Management for Amazon
 * Chime</a> in the <i>Amazon Chime Administration Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeAsyncClient extends AmazonChimeClient implements AmazonChimeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonChimeAsyncClientBuilder asyncBuilder() {
        return AmazonChimeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonChimeAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociatePhoneNumberWithUserResult> associatePhoneNumberWithUserAsync(AssociatePhoneNumberWithUserRequest request) {

        return associatePhoneNumberWithUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumberWithUserResult> associatePhoneNumberWithUserAsync(final AssociatePhoneNumberWithUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumberWithUserRequest, AssociatePhoneNumberWithUserResult> asyncHandler) {
        final AssociatePhoneNumberWithUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePhoneNumberWithUserResult>() {
            @Override
            public AssociatePhoneNumberWithUserResult call() throws Exception {
                AssociatePhoneNumberWithUserResult result = null;

                try {
                    result = executeAssociatePhoneNumberWithUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            AssociatePhoneNumbersWithVoiceConnectorRequest request) {

        return associatePhoneNumbersWithVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            final AssociatePhoneNumbersWithVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorRequest, AssociatePhoneNumbersWithVoiceConnectorResult> asyncHandler) {
        final AssociatePhoneNumbersWithVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePhoneNumbersWithVoiceConnectorResult>() {
            @Override
            public AssociatePhoneNumbersWithVoiceConnectorResult call() throws Exception {
                AssociatePhoneNumbersWithVoiceConnectorResult result = null;

                try {
                    result = executeAssociatePhoneNumbersWithVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest request) {

        return associatePhoneNumbersWithVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            final AssociatePhoneNumbersWithVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorGroupRequest, AssociatePhoneNumbersWithVoiceConnectorGroupResult> asyncHandler) {
        final AssociatePhoneNumbersWithVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePhoneNumbersWithVoiceConnectorGroupResult>() {
            @Override
            public AssociatePhoneNumbersWithVoiceConnectorGroupResult call() throws Exception {
                AssociatePhoneNumbersWithVoiceConnectorGroupResult result = null;

                try {
                    result = executeAssociatePhoneNumbersWithVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateSigninDelegateGroupsWithAccountResult> associateSigninDelegateGroupsWithAccountAsync(
            AssociateSigninDelegateGroupsWithAccountRequest request) {

        return associateSigninDelegateGroupsWithAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSigninDelegateGroupsWithAccountResult> associateSigninDelegateGroupsWithAccountAsync(
            final AssociateSigninDelegateGroupsWithAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSigninDelegateGroupsWithAccountRequest, AssociateSigninDelegateGroupsWithAccountResult> asyncHandler) {
        final AssociateSigninDelegateGroupsWithAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSigninDelegateGroupsWithAccountResult>() {
            @Override
            public AssociateSigninDelegateGroupsWithAccountResult call() throws Exception {
                AssociateSigninDelegateGroupsWithAccountResult result = null;

                try {
                    result = executeAssociateSigninDelegateGroupsWithAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest request) {

        return batchCreateAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(final BatchCreateAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateAttendeeRequest, BatchCreateAttendeeResult> asyncHandler) {
        final BatchCreateAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateAttendeeResult>() {
            @Override
            public BatchCreateAttendeeResult call() throws Exception {
                BatchCreateAttendeeResult result = null;

                try {
                    result = executeBatchCreateAttendee(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchCreateRoomMembershipResult> batchCreateRoomMembershipAsync(BatchCreateRoomMembershipRequest request) {

        return batchCreateRoomMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateRoomMembershipResult> batchCreateRoomMembershipAsync(final BatchCreateRoomMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateRoomMembershipRequest, BatchCreateRoomMembershipResult> asyncHandler) {
        final BatchCreateRoomMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateRoomMembershipResult>() {
            @Override
            public BatchCreateRoomMembershipResult call() throws Exception {
                BatchCreateRoomMembershipResult result = null;

                try {
                    result = executeBatchCreateRoomMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(BatchDeletePhoneNumberRequest request) {

        return batchDeletePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(final BatchDeletePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeletePhoneNumberRequest, BatchDeletePhoneNumberResult> asyncHandler) {
        final BatchDeletePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeletePhoneNumberResult>() {
            @Override
            public BatchDeletePhoneNumberResult call() throws Exception {
                BatchDeletePhoneNumberResult result = null;

                try {
                    result = executeBatchDeletePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchSuspendUserResult> batchSuspendUserAsync(BatchSuspendUserRequest request) {

        return batchSuspendUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchSuspendUserResult> batchSuspendUserAsync(final BatchSuspendUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchSuspendUserRequest, BatchSuspendUserResult> asyncHandler) {
        final BatchSuspendUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchSuspendUserResult>() {
            @Override
            public BatchSuspendUserResult call() throws Exception {
                BatchSuspendUserResult result = null;

                try {
                    result = executeBatchSuspendUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUnsuspendUserResult> batchUnsuspendUserAsync(BatchUnsuspendUserRequest request) {

        return batchUnsuspendUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUnsuspendUserResult> batchUnsuspendUserAsync(final BatchUnsuspendUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUnsuspendUserRequest, BatchUnsuspendUserResult> asyncHandler) {
        final BatchUnsuspendUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUnsuspendUserResult>() {
            @Override
            public BatchUnsuspendUserResult call() throws Exception {
                BatchUnsuspendUserResult result = null;

                try {
                    result = executeBatchUnsuspendUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(BatchUpdatePhoneNumberRequest request) {

        return batchUpdatePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(final BatchUpdatePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdatePhoneNumberRequest, BatchUpdatePhoneNumberResult> asyncHandler) {
        final BatchUpdatePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdatePhoneNumberResult>() {
            @Override
            public BatchUpdatePhoneNumberResult call() throws Exception {
                BatchUpdatePhoneNumberResult result = null;

                try {
                    result = executeBatchUpdatePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateUserResult> batchUpdateUserAsync(BatchUpdateUserRequest request) {

        return batchUpdateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateUserResult> batchUpdateUserAsync(final BatchUpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateUserRequest, BatchUpdateUserResult> asyncHandler) {
        final BatchUpdateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateUserResult>() {
            @Override
            public BatchUpdateUserResult call() throws Exception {
                BatchUpdateUserResult result = null;

                try {
                    result = executeBatchUpdateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest request) {

        return createAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccountResult> createAccountAsync(final CreateAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccountRequest, CreateAccountResult> asyncHandler) {
        final CreateAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccountResult>() {
            @Override
            public CreateAccountResult call() throws Exception {
                CreateAccountResult result = null;

                try {
                    result = executeCreateAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest request) {

        return createAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(final CreateAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAttendeeRequest, CreateAttendeeResult> asyncHandler) {
        final CreateAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAttendeeResult>() {
            @Override
            public CreateAttendeeResult call() throws Exception {
                CreateAttendeeResult result = null;

                try {
                    result = executeCreateAttendee(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBotResult> createBotAsync(CreateBotRequest request) {

        return createBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBotResult> createBotAsync(final CreateBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBotRequest, CreateBotResult> asyncHandler) {
        final CreateBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBotResult>() {
            @Override
            public CreateBotResult call() throws Exception {
                CreateBotResult result = null;

                try {
                    result = executeCreateBot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest request) {

        return createMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(final CreateMeetingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMeetingRequest, CreateMeetingResult> asyncHandler) {
        final CreateMeetingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMeetingResult>() {
            @Override
            public CreateMeetingResult call() throws Exception {
                CreateMeetingResult result = null;

                try {
                    result = executeCreateMeeting(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(CreatePhoneNumberOrderRequest request) {

        return createPhoneNumberOrderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(final CreatePhoneNumberOrderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePhoneNumberOrderRequest, CreatePhoneNumberOrderResult> asyncHandler) {
        final CreatePhoneNumberOrderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePhoneNumberOrderResult>() {
            @Override
            public CreatePhoneNumberOrderResult call() throws Exception {
                CreatePhoneNumberOrderResult result = null;

                try {
                    result = executeCreatePhoneNumberOrder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateRoomMembershipResult> createRoomMembershipAsync(CreateRoomMembershipRequest request) {

        return createRoomMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoomMembershipResult> createRoomMembershipAsync(final CreateRoomMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoomMembershipRequest, CreateRoomMembershipResult> asyncHandler) {
        final CreateRoomMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoomMembershipResult>() {
            @Override
            public CreateRoomMembershipResult call() throws Exception {
                CreateRoomMembershipResult result = null;

                try {
                    result = executeCreateRoomMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(CreateVoiceConnectorRequest request) {

        return createVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(final CreateVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorRequest, CreateVoiceConnectorResult> asyncHandler) {
        final CreateVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVoiceConnectorResult>() {
            @Override
            public CreateVoiceConnectorResult call() throws Exception {
                CreateVoiceConnectorResult result = null;

                try {
                    result = executeCreateVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(CreateVoiceConnectorGroupRequest request) {

        return createVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(final CreateVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorGroupRequest, CreateVoiceConnectorGroupResult> asyncHandler) {
        final CreateVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVoiceConnectorGroupResult>() {
            @Override
            public CreateVoiceConnectorGroupResult call() throws Exception {
                CreateVoiceConnectorGroupResult result = null;

                try {
                    result = executeCreateVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountResult> deleteAccountAsync(DeleteAccountRequest request) {

        return deleteAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountResult> deleteAccountAsync(final DeleteAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountRequest, DeleteAccountResult> asyncHandler) {
        final DeleteAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountResult>() {
            @Override
            public DeleteAccountResult call() throws Exception {
                DeleteAccountResult result = null;

                try {
                    result = executeDeleteAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest request) {

        return deleteAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(final DeleteAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAttendeeRequest, DeleteAttendeeResult> asyncHandler) {
        final DeleteAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAttendeeResult>() {
            @Override
            public DeleteAttendeeResult call() throws Exception {
                DeleteAttendeeResult result = null;

                try {
                    result = executeDeleteAttendee(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEventsConfigurationResult> deleteEventsConfigurationAsync(DeleteEventsConfigurationRequest request) {

        return deleteEventsConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventsConfigurationResult> deleteEventsConfigurationAsync(final DeleteEventsConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventsConfigurationRequest, DeleteEventsConfigurationResult> asyncHandler) {
        final DeleteEventsConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventsConfigurationResult>() {
            @Override
            public DeleteEventsConfigurationResult call() throws Exception {
                DeleteEventsConfigurationResult result = null;

                try {
                    result = executeDeleteEventsConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest request) {

        return deleteMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(final DeleteMeetingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMeetingRequest, DeleteMeetingResult> asyncHandler) {
        final DeleteMeetingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMeetingResult>() {
            @Override
            public DeleteMeetingResult call() throws Exception {
                DeleteMeetingResult result = null;

                try {
                    result = executeDeleteMeeting(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(DeletePhoneNumberRequest request) {

        return deletePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(final DeletePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePhoneNumberRequest, DeletePhoneNumberResult> asyncHandler) {
        final DeletePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePhoneNumberResult>() {
            @Override
            public DeletePhoneNumberResult call() throws Exception {
                DeletePhoneNumberResult result = null;

                try {
                    result = executeDeletePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteRoomMembershipResult> deleteRoomMembershipAsync(DeleteRoomMembershipRequest request) {

        return deleteRoomMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomMembershipResult> deleteRoomMembershipAsync(final DeleteRoomMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoomMembershipRequest, DeleteRoomMembershipResult> asyncHandler) {
        final DeleteRoomMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoomMembershipResult>() {
            @Override
            public DeleteRoomMembershipResult call() throws Exception {
                DeleteRoomMembershipResult result = null;

                try {
                    result = executeDeleteRoomMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(DeleteVoiceConnectorRequest request) {

        return deleteVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(final DeleteVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorRequest, DeleteVoiceConnectorResult> asyncHandler) {
        final DeleteVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorResult>() {
            @Override
            public DeleteVoiceConnectorResult call() throws Exception {
                DeleteVoiceConnectorResult result = null;

                try {
                    result = executeDeleteVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(DeleteVoiceConnectorGroupRequest request) {

        return deleteVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(final DeleteVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorGroupRequest, DeleteVoiceConnectorGroupResult> asyncHandler) {
        final DeleteVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorGroupResult>() {
            @Override
            public DeleteVoiceConnectorGroupResult call() throws Exception {
                DeleteVoiceConnectorGroupResult result = null;

                try {
                    result = executeDeleteVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            DeleteVoiceConnectorOriginationRequest request) {

        return deleteVoiceConnectorOriginationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            final DeleteVoiceConnectorOriginationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorOriginationRequest, DeleteVoiceConnectorOriginationResult> asyncHandler) {
        final DeleteVoiceConnectorOriginationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorOriginationResult>() {
            @Override
            public DeleteVoiceConnectorOriginationResult call() throws Exception {
                DeleteVoiceConnectorOriginationResult result = null;

                try {
                    result = executeDeleteVoiceConnectorOrigination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            DeleteVoiceConnectorStreamingConfigurationRequest request) {

        return deleteVoiceConnectorStreamingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            final DeleteVoiceConnectorStreamingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorStreamingConfigurationRequest, DeleteVoiceConnectorStreamingConfigurationResult> asyncHandler) {
        final DeleteVoiceConnectorStreamingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorStreamingConfigurationResult>() {
            @Override
            public DeleteVoiceConnectorStreamingConfigurationResult call() throws Exception {
                DeleteVoiceConnectorStreamingConfigurationResult result = null;

                try {
                    result = executeDeleteVoiceConnectorStreamingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            DeleteVoiceConnectorTerminationRequest request) {

        return deleteVoiceConnectorTerminationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            final DeleteVoiceConnectorTerminationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationRequest, DeleteVoiceConnectorTerminationResult> asyncHandler) {
        final DeleteVoiceConnectorTerminationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorTerminationResult>() {
            @Override
            public DeleteVoiceConnectorTerminationResult call() throws Exception {
                DeleteVoiceConnectorTerminationResult result = null;

                try {
                    result = executeDeleteVoiceConnectorTermination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            DeleteVoiceConnectorTerminationCredentialsRequest request) {

        return deleteVoiceConnectorTerminationCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            final DeleteVoiceConnectorTerminationCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationCredentialsRequest, DeleteVoiceConnectorTerminationCredentialsResult> asyncHandler) {
        final DeleteVoiceConnectorTerminationCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorTerminationCredentialsResult>() {
            @Override
            public DeleteVoiceConnectorTerminationCredentialsResult call() throws Exception {
                DeleteVoiceConnectorTerminationCredentialsResult result = null;

                try {
                    result = executeDeleteVoiceConnectorTerminationCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumberFromUserResult> disassociatePhoneNumberFromUserAsync(
            DisassociatePhoneNumberFromUserRequest request) {

        return disassociatePhoneNumberFromUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumberFromUserResult> disassociatePhoneNumberFromUserAsync(
            final DisassociatePhoneNumberFromUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumberFromUserRequest, DisassociatePhoneNumberFromUserResult> asyncHandler) {
        final DisassociatePhoneNumberFromUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePhoneNumberFromUserResult>() {
            @Override
            public DisassociatePhoneNumberFromUserResult call() throws Exception {
                DisassociatePhoneNumberFromUserResult result = null;

                try {
                    result = executeDisassociatePhoneNumberFromUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            DisassociatePhoneNumbersFromVoiceConnectorRequest request) {

        return disassociatePhoneNumbersFromVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            final DisassociatePhoneNumbersFromVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorRequest, DisassociatePhoneNumbersFromVoiceConnectorResult> asyncHandler) {
        final DisassociatePhoneNumbersFromVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePhoneNumbersFromVoiceConnectorResult>() {
            @Override
            public DisassociatePhoneNumbersFromVoiceConnectorResult call() throws Exception {
                DisassociatePhoneNumbersFromVoiceConnectorResult result = null;

                try {
                    result = executeDisassociatePhoneNumbersFromVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest request) {

        return disassociatePhoneNumbersFromVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            final DisassociatePhoneNumbersFromVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorGroupRequest, DisassociatePhoneNumbersFromVoiceConnectorGroupResult> asyncHandler) {
        final DisassociatePhoneNumbersFromVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePhoneNumbersFromVoiceConnectorGroupResult>() {
            @Override
            public DisassociatePhoneNumbersFromVoiceConnectorGroupResult call() throws Exception {
                DisassociatePhoneNumbersFromVoiceConnectorGroupResult result = null;

                try {
                    result = executeDisassociatePhoneNumbersFromVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateSigninDelegateGroupsFromAccountResult> disassociateSigninDelegateGroupsFromAccountAsync(
            DisassociateSigninDelegateGroupsFromAccountRequest request) {

        return disassociateSigninDelegateGroupsFromAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSigninDelegateGroupsFromAccountResult> disassociateSigninDelegateGroupsFromAccountAsync(
            final DisassociateSigninDelegateGroupsFromAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSigninDelegateGroupsFromAccountRequest, DisassociateSigninDelegateGroupsFromAccountResult> asyncHandler) {
        final DisassociateSigninDelegateGroupsFromAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSigninDelegateGroupsFromAccountResult>() {
            @Override
            public DisassociateSigninDelegateGroupsFromAccountResult call() throws Exception {
                DisassociateSigninDelegateGroupsFromAccountResult result = null;

                try {
                    result = executeDisassociateSigninDelegateGroupsFromAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest request) {

        return getAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(final GetAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler) {
        final GetAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountResult>() {
            @Override
            public GetAccountResult call() throws Exception {
                GetAccountResult result = null;

                try {
                    result = executeGetAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(final GetAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {
        final GetAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSettingsResult>() {
            @Override
            public GetAccountSettingsResult call() throws Exception {
                GetAccountSettingsResult result = null;

                try {
                    result = executeGetAccountSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest request) {

        return getAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(final GetAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAttendeeRequest, GetAttendeeResult> asyncHandler) {
        final GetAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAttendeeResult>() {
            @Override
            public GetAttendeeResult call() throws Exception {
                GetAttendeeResult result = null;

                try {
                    result = executeGetAttendee(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBotResult> getBotAsync(GetBotRequest request) {

        return getBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBotResult> getBotAsync(final GetBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBotRequest, GetBotResult> asyncHandler) {
        final GetBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBotResult>() {
            @Override
            public GetBotResult call() throws Exception {
                GetBotResult result = null;

                try {
                    result = executeGetBot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEventsConfigurationResult> getEventsConfigurationAsync(GetEventsConfigurationRequest request) {

        return getEventsConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventsConfigurationResult> getEventsConfigurationAsync(final GetEventsConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventsConfigurationRequest, GetEventsConfigurationResult> asyncHandler) {
        final GetEventsConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventsConfigurationResult>() {
            @Override
            public GetEventsConfigurationResult call() throws Exception {
                GetEventsConfigurationResult result = null;

                try {
                    result = executeGetEventsConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest request) {

        return getGlobalSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(final GetGlobalSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGlobalSettingsRequest, GetGlobalSettingsResult> asyncHandler) {
        final GetGlobalSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGlobalSettingsResult>() {
            @Override
            public GetGlobalSettingsResult call() throws Exception {
                GetGlobalSettingsResult result = null;

                try {
                    result = executeGetGlobalSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest request) {

        return getMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(final GetMeetingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMeetingRequest, GetMeetingResult> asyncHandler) {
        final GetMeetingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMeetingResult>() {
            @Override
            public GetMeetingResult call() throws Exception {
                GetMeetingResult result = null;

                try {
                    result = executeGetMeeting(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(GetPhoneNumberRequest request) {

        return getPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(final GetPhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPhoneNumberRequest, GetPhoneNumberResult> asyncHandler) {
        final GetPhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPhoneNumberResult>() {
            @Override
            public GetPhoneNumberResult call() throws Exception {
                GetPhoneNumberResult result = null;

                try {
                    result = executeGetPhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(GetPhoneNumberOrderRequest request) {

        return getPhoneNumberOrderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(final GetPhoneNumberOrderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPhoneNumberOrderRequest, GetPhoneNumberOrderResult> asyncHandler) {
        final GetPhoneNumberOrderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPhoneNumberOrderResult>() {
            @Override
            public GetPhoneNumberOrderResult call() throws Exception {
                GetPhoneNumberOrderResult result = null;

                try {
                    result = executeGetPhoneNumberOrder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(GetPhoneNumberSettingsRequest request) {

        return getPhoneNumberSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(final GetPhoneNumberSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPhoneNumberSettingsRequest, GetPhoneNumberSettingsResult> asyncHandler) {
        final GetPhoneNumberSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPhoneNumberSettingsResult>() {
            @Override
            public GetPhoneNumberSettingsResult call() throws Exception {
                GetPhoneNumberSettingsResult result = null;

                try {
                    result = executeGetPhoneNumberSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest request) {

        return getUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(final GetUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {
        final GetUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserResult>() {
            @Override
            public GetUserResult call() throws Exception {
                GetUserResult result = null;

                try {
                    result = executeGetUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(GetVoiceConnectorRequest request) {

        return getVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(final GetVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorRequest, GetVoiceConnectorResult> asyncHandler) {
        final GetVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorResult>() {
            @Override
            public GetVoiceConnectorResult call() throws Exception {
                GetVoiceConnectorResult result = null;

                try {
                    result = executeGetVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(GetVoiceConnectorGroupRequest request) {

        return getVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(final GetVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorGroupRequest, GetVoiceConnectorGroupResult> asyncHandler) {
        final GetVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorGroupResult>() {
            @Override
            public GetVoiceConnectorGroupResult call() throws Exception {
                GetVoiceConnectorGroupResult result = null;

                try {
                    result = executeGetVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            GetVoiceConnectorLoggingConfigurationRequest request) {

        return getVoiceConnectorLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            final GetVoiceConnectorLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorLoggingConfigurationRequest, GetVoiceConnectorLoggingConfigurationResult> asyncHandler) {
        final GetVoiceConnectorLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorLoggingConfigurationResult>() {
            @Override
            public GetVoiceConnectorLoggingConfigurationResult call() throws Exception {
                GetVoiceConnectorLoggingConfigurationResult result = null;

                try {
                    result = executeGetVoiceConnectorLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(GetVoiceConnectorOriginationRequest request) {

        return getVoiceConnectorOriginationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(final GetVoiceConnectorOriginationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorOriginationRequest, GetVoiceConnectorOriginationResult> asyncHandler) {
        final GetVoiceConnectorOriginationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorOriginationResult>() {
            @Override
            public GetVoiceConnectorOriginationResult call() throws Exception {
                GetVoiceConnectorOriginationResult result = null;

                try {
                    result = executeGetVoiceConnectorOrigination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            GetVoiceConnectorStreamingConfigurationRequest request) {

        return getVoiceConnectorStreamingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            final GetVoiceConnectorStreamingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorStreamingConfigurationRequest, GetVoiceConnectorStreamingConfigurationResult> asyncHandler) {
        final GetVoiceConnectorStreamingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorStreamingConfigurationResult>() {
            @Override
            public GetVoiceConnectorStreamingConfigurationResult call() throws Exception {
                GetVoiceConnectorStreamingConfigurationResult result = null;

                try {
                    result = executeGetVoiceConnectorStreamingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(GetVoiceConnectorTerminationRequest request) {

        return getVoiceConnectorTerminationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(final GetVoiceConnectorTerminationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationRequest, GetVoiceConnectorTerminationResult> asyncHandler) {
        final GetVoiceConnectorTerminationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorTerminationResult>() {
            @Override
            public GetVoiceConnectorTerminationResult call() throws Exception {
                GetVoiceConnectorTerminationResult result = null;

                try {
                    result = executeGetVoiceConnectorTermination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            GetVoiceConnectorTerminationHealthRequest request) {

        return getVoiceConnectorTerminationHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            final GetVoiceConnectorTerminationHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationHealthRequest, GetVoiceConnectorTerminationHealthResult> asyncHandler) {
        final GetVoiceConnectorTerminationHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorTerminationHealthResult>() {
            @Override
            public GetVoiceConnectorTerminationHealthResult call() throws Exception {
                GetVoiceConnectorTerminationHealthResult result = null;

                try {
                    result = executeGetVoiceConnectorTerminationHealth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<InviteUsersResult> inviteUsersAsync(InviteUsersRequest request) {

        return inviteUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InviteUsersResult> inviteUsersAsync(final InviteUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<InviteUsersRequest, InviteUsersResult> asyncHandler) {
        final InviteUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InviteUsersResult>() {
            @Override
            public InviteUsersResult call() throws Exception {
                InviteUsersResult result = null;

                try {
                    result = executeInviteUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest request) {

        return listAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(final ListAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountsRequest, ListAccountsResult> asyncHandler) {
        final ListAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountsResult>() {
            @Override
            public ListAccountsResult call() throws Exception {
                ListAccountsResult result = null;

                try {
                    result = executeListAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest request) {

        return listAttendeesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(final ListAttendeesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttendeesRequest, ListAttendeesResult> asyncHandler) {
        final ListAttendeesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttendeesResult>() {
            @Override
            public ListAttendeesResult call() throws Exception {
                ListAttendeesResult result = null;

                try {
                    result = executeListAttendees(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest request) {

        return listBotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotsResult> listBotsAsync(final ListBotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler) {
        final ListBotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotsResult>() {
            @Override
            public ListBotsResult call() throws Exception {
                ListBotsResult result = null;

                try {
                    result = executeListBots(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMeetingsResult> listMeetingsAsync(ListMeetingsRequest request) {

        return listMeetingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMeetingsResult> listMeetingsAsync(final ListMeetingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMeetingsRequest, ListMeetingsResult> asyncHandler) {
        final ListMeetingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMeetingsResult>() {
            @Override
            public ListMeetingsResult call() throws Exception {
                ListMeetingsResult result = null;

                try {
                    result = executeListMeetings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(ListPhoneNumberOrdersRequest request) {

        return listPhoneNumberOrdersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(final ListPhoneNumberOrdersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumberOrdersRequest, ListPhoneNumberOrdersResult> asyncHandler) {
        final ListPhoneNumberOrdersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumberOrdersResult>() {
            @Override
            public ListPhoneNumberOrdersResult call() throws Exception {
                ListPhoneNumberOrdersResult result = null;

                try {
                    result = executeListPhoneNumberOrders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest request) {

        return listPhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(final ListPhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler) {
        final ListPhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumbersResult>() {
            @Override
            public ListPhoneNumbersResult call() throws Exception {
                ListPhoneNumbersResult result = null;

                try {
                    result = executeListPhoneNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRoomMembershipsResult> listRoomMembershipsAsync(ListRoomMembershipsRequest request) {

        return listRoomMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoomMembershipsResult> listRoomMembershipsAsync(final ListRoomMembershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoomMembershipsRequest, ListRoomMembershipsResult> asyncHandler) {
        final ListRoomMembershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoomMembershipsResult>() {
            @Override
            public ListRoomMembershipsResult call() throws Exception {
                ListRoomMembershipsResult result = null;

                try {
                    result = executeListRoomMemberships(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest request) {

        return listRoomsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(final ListRoomsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoomsRequest, ListRoomsResult> asyncHandler) {
        final ListRoomsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoomsResult>() {
            @Override
            public ListRoomsResult call() throws Exception {
                ListRoomsResult result = null;

                try {
                    result = executeListRooms(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(ListVoiceConnectorGroupsRequest request) {

        return listVoiceConnectorGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(final ListVoiceConnectorGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorGroupsRequest, ListVoiceConnectorGroupsResult> asyncHandler) {
        final ListVoiceConnectorGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVoiceConnectorGroupsResult>() {
            @Override
            public ListVoiceConnectorGroupsResult call() throws Exception {
                ListVoiceConnectorGroupsResult result = null;

                try {
                    result = executeListVoiceConnectorGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            ListVoiceConnectorTerminationCredentialsRequest request) {

        return listVoiceConnectorTerminationCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            final ListVoiceConnectorTerminationCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorTerminationCredentialsRequest, ListVoiceConnectorTerminationCredentialsResult> asyncHandler) {
        final ListVoiceConnectorTerminationCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVoiceConnectorTerminationCredentialsResult>() {
            @Override
            public ListVoiceConnectorTerminationCredentialsResult call() throws Exception {
                ListVoiceConnectorTerminationCredentialsResult result = null;

                try {
                    result = executeListVoiceConnectorTerminationCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(ListVoiceConnectorsRequest request) {

        return listVoiceConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(final ListVoiceConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorsRequest, ListVoiceConnectorsResult> asyncHandler) {
        final ListVoiceConnectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVoiceConnectorsResult>() {
            @Override
            public ListVoiceConnectorsResult call() throws Exception {
                ListVoiceConnectorsResult result = null;

                try {
                    result = executeListVoiceConnectors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<LogoutUserResult> logoutUserAsync(LogoutUserRequest request) {

        return logoutUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LogoutUserResult> logoutUserAsync(final LogoutUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<LogoutUserRequest, LogoutUserResult> asyncHandler) {
        final LogoutUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LogoutUserResult>() {
            @Override
            public LogoutUserResult call() throws Exception {
                LogoutUserResult result = null;

                try {
                    result = executeLogoutUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutEventsConfigurationResult> putEventsConfigurationAsync(PutEventsConfigurationRequest request) {

        return putEventsConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsConfigurationResult> putEventsConfigurationAsync(final PutEventsConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventsConfigurationRequest, PutEventsConfigurationResult> asyncHandler) {
        final PutEventsConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEventsConfigurationResult>() {
            @Override
            public PutEventsConfigurationResult call() throws Exception {
                PutEventsConfigurationResult result = null;

                try {
                    result = executePutEventsConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            PutVoiceConnectorLoggingConfigurationRequest request) {

        return putVoiceConnectorLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            final PutVoiceConnectorLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorLoggingConfigurationRequest, PutVoiceConnectorLoggingConfigurationResult> asyncHandler) {
        final PutVoiceConnectorLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorLoggingConfigurationResult>() {
            @Override
            public PutVoiceConnectorLoggingConfigurationResult call() throws Exception {
                PutVoiceConnectorLoggingConfigurationResult result = null;

                try {
                    result = executePutVoiceConnectorLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(PutVoiceConnectorOriginationRequest request) {

        return putVoiceConnectorOriginationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(final PutVoiceConnectorOriginationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorOriginationRequest, PutVoiceConnectorOriginationResult> asyncHandler) {
        final PutVoiceConnectorOriginationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorOriginationResult>() {
            @Override
            public PutVoiceConnectorOriginationResult call() throws Exception {
                PutVoiceConnectorOriginationResult result = null;

                try {
                    result = executePutVoiceConnectorOrigination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            PutVoiceConnectorStreamingConfigurationRequest request) {

        return putVoiceConnectorStreamingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            final PutVoiceConnectorStreamingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorStreamingConfigurationRequest, PutVoiceConnectorStreamingConfigurationResult> asyncHandler) {
        final PutVoiceConnectorStreamingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorStreamingConfigurationResult>() {
            @Override
            public PutVoiceConnectorStreamingConfigurationResult call() throws Exception {
                PutVoiceConnectorStreamingConfigurationResult result = null;

                try {
                    result = executePutVoiceConnectorStreamingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(PutVoiceConnectorTerminationRequest request) {

        return putVoiceConnectorTerminationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(final PutVoiceConnectorTerminationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationRequest, PutVoiceConnectorTerminationResult> asyncHandler) {
        final PutVoiceConnectorTerminationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorTerminationResult>() {
            @Override
            public PutVoiceConnectorTerminationResult call() throws Exception {
                PutVoiceConnectorTerminationResult result = null;

                try {
                    result = executePutVoiceConnectorTermination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            PutVoiceConnectorTerminationCredentialsRequest request) {

        return putVoiceConnectorTerminationCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            final PutVoiceConnectorTerminationCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationCredentialsRequest, PutVoiceConnectorTerminationCredentialsResult> asyncHandler) {
        final PutVoiceConnectorTerminationCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorTerminationCredentialsResult>() {
            @Override
            public PutVoiceConnectorTerminationCredentialsResult call() throws Exception {
                PutVoiceConnectorTerminationCredentialsResult result = null;

                try {
                    result = executePutVoiceConnectorTerminationCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegenerateSecurityTokenResult> regenerateSecurityTokenAsync(RegenerateSecurityTokenRequest request) {

        return regenerateSecurityTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegenerateSecurityTokenResult> regenerateSecurityTokenAsync(final RegenerateSecurityTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegenerateSecurityTokenRequest, RegenerateSecurityTokenResult> asyncHandler) {
        final RegenerateSecurityTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegenerateSecurityTokenResult>() {
            @Override
            public RegenerateSecurityTokenResult call() throws Exception {
                RegenerateSecurityTokenResult result = null;

                try {
                    result = executeRegenerateSecurityToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResetPersonalPINResult> resetPersonalPINAsync(ResetPersonalPINRequest request) {

        return resetPersonalPINAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetPersonalPINResult> resetPersonalPINAsync(final ResetPersonalPINRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetPersonalPINRequest, ResetPersonalPINResult> asyncHandler) {
        final ResetPersonalPINRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetPersonalPINResult>() {
            @Override
            public ResetPersonalPINResult call() throws Exception {
                ResetPersonalPINResult result = null;

                try {
                    result = executeResetPersonalPIN(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(RestorePhoneNumberRequest request) {

        return restorePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(final RestorePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestorePhoneNumberRequest, RestorePhoneNumberResult> asyncHandler) {
        final RestorePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestorePhoneNumberResult>() {
            @Override
            public RestorePhoneNumberResult call() throws Exception {
                RestorePhoneNumberResult result = null;

                try {
                    result = executeRestorePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(SearchAvailablePhoneNumbersRequest request) {

        return searchAvailablePhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(final SearchAvailablePhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchAvailablePhoneNumbersRequest, SearchAvailablePhoneNumbersResult> asyncHandler) {
        final SearchAvailablePhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchAvailablePhoneNumbersResult>() {
            @Override
            public SearchAvailablePhoneNumbersResult call() throws Exception {
                SearchAvailablePhoneNumbersResult result = null;

                try {
                    result = executeSearchAvailablePhoneNumbers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest request) {

        return updateAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(final UpdateAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler) {
        final UpdateAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountResult>() {
            @Override
            public UpdateAccountResult call() throws Exception {
                UpdateAccountResult result = null;

                try {
                    result = executeUpdateAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest request) {

        return updateAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(final UpdateAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler) {
        final UpdateAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountSettingsResult>() {
            @Override
            public UpdateAccountSettingsResult call() throws Exception {
                UpdateAccountSettingsResult result = null;

                try {
                    result = executeUpdateAccountSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBotResult> updateBotAsync(UpdateBotRequest request) {

        return updateBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBotResult> updateBotAsync(final UpdateBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBotRequest, UpdateBotResult> asyncHandler) {
        final UpdateBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBotResult>() {
            @Override
            public UpdateBotResult call() throws Exception {
                UpdateBotResult result = null;

                try {
                    result = executeUpdateBot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest request) {

        return updateGlobalSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(final UpdateGlobalSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGlobalSettingsRequest, UpdateGlobalSettingsResult> asyncHandler) {
        final UpdateGlobalSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGlobalSettingsResult>() {
            @Override
            public UpdateGlobalSettingsResult call() throws Exception {
                UpdateGlobalSettingsResult result = null;

                try {
                    result = executeUpdateGlobalSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest request) {

        return updatePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(final UpdatePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler) {
        final UpdatePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePhoneNumberResult>() {
            @Override
            public UpdatePhoneNumberResult call() throws Exception {
                UpdatePhoneNumberResult result = null;

                try {
                    result = executeUpdatePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(UpdatePhoneNumberSettingsRequest request) {

        return updatePhoneNumberSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(final UpdatePhoneNumberSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberSettingsRequest, UpdatePhoneNumberSettingsResult> asyncHandler) {
        final UpdatePhoneNumberSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePhoneNumberSettingsResult>() {
            @Override
            public UpdatePhoneNumberSettingsResult call() throws Exception {
                UpdatePhoneNumberSettingsResult result = null;

                try {
                    result = executeUpdatePhoneNumberSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateRoomMembershipResult> updateRoomMembershipAsync(UpdateRoomMembershipRequest request) {

        return updateRoomMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoomMembershipResult> updateRoomMembershipAsync(final UpdateRoomMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoomMembershipRequest, UpdateRoomMembershipResult> asyncHandler) {
        final UpdateRoomMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoomMembershipResult>() {
            @Override
            public UpdateRoomMembershipResult call() throws Exception {
                UpdateRoomMembershipResult result = null;

                try {
                    result = executeUpdateRoomMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(final UpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {
        final UpdateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result = null;

                try {
                    result = executeUpdateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(UpdateVoiceConnectorRequest request) {

        return updateVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(final UpdateVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorRequest, UpdateVoiceConnectorResult> asyncHandler) {
        final UpdateVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVoiceConnectorResult>() {
            @Override
            public UpdateVoiceConnectorResult call() throws Exception {
                UpdateVoiceConnectorResult result = null;

                try {
                    result = executeUpdateVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(UpdateVoiceConnectorGroupRequest request) {

        return updateVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(final UpdateVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorGroupRequest, UpdateVoiceConnectorGroupResult> asyncHandler) {
        final UpdateVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVoiceConnectorGroupResult>() {
            @Override
            public UpdateVoiceConnectorGroupResult call() throws Exception {
                UpdateVoiceConnectorGroupResult result = null;

                try {
                    result = executeUpdateVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
