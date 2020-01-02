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
package com.amazonaws.services.sso;

import javax.annotation.Generated;

import com.amazonaws.services.sso.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SSO asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <p>
 * AWS Single Sign-On Portal is a web service that makes it easy for you to assign user access to AWS SSO resources such
 * as the user portal. Users can get AWS account applications and roles assigned to them and get federated into the
 * application.
 * </p>
 * <p>
 * For general information about AWS SSO, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">What is AWS Single Sign-On?</a> in the
 * <i>AWS SSO User Guide</i>.
 * </p>
 * <p>
 * This API reference guide describes the AWS SSO Portal operations that you can call programatically and includes
 * detailed information on data types and errors.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms, such as
 * Java, Ruby, .Net, iOS, or Android. The SDKs provide a convenient way to create programmatic access to AWS SSO and
 * other AWS services. For more information about the AWS SDKs, including how to download and install them, see <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSOAsyncClient extends AWSSSOClient implements AWSSSOAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSSOAsyncClientBuilder asyncBuilder() {
        return AWSSSOAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSO using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSSOAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<GetRoleCredentialsResult> getRoleCredentialsAsync(GetRoleCredentialsRequest request) {

        return getRoleCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoleCredentialsResult> getRoleCredentialsAsync(final GetRoleCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRoleCredentialsRequest, GetRoleCredentialsResult> asyncHandler) {
        final GetRoleCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRoleCredentialsResult>() {
            @Override
            public GetRoleCredentialsResult call() throws Exception {
                GetRoleCredentialsResult result = null;

                try {
                    result = executeGetRoleCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAccountRolesResult> listAccountRolesAsync(ListAccountRolesRequest request) {

        return listAccountRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountRolesResult> listAccountRolesAsync(final ListAccountRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountRolesRequest, ListAccountRolesResult> asyncHandler) {
        final ListAccountRolesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountRolesResult>() {
            @Override
            public ListAccountRolesResult call() throws Exception {
                ListAccountRolesResult result = null;

                try {
                    result = executeListAccountRoles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<LogoutResult> logoutAsync(LogoutRequest request) {

        return logoutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LogoutResult> logoutAsync(final LogoutRequest request,
            final com.amazonaws.handlers.AsyncHandler<LogoutRequest, LogoutResult> asyncHandler) {
        final LogoutRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LogoutResult>() {
            @Override
            public LogoutResult call() throws Exception {
                LogoutResult result = null;

                try {
                    result = executeLogout(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
