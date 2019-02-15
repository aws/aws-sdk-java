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
 * The Amazon Chime API (application programming interface) is designed for administrators to use to perform key tasks,
 * such as creating and managing Amazon Chime accounts and users. This guide provides detailed information about the
 * Amazon Chime API, including operations, types, inputs and outputs, and error codes.
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
 * <a href="https://docs.aws.amazon.com/chime/latest/ag/control-access.html">Control Access to the Amazon Chime
 * Console</a> in the <i>Amazon Chime Administration Guide</i>.
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
