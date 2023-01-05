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
package com.amazonaws.services.supportapp;

import javax.annotation.Generated;

import com.amazonaws.services.supportapp.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SupportApp asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>Amazon Web Services Support App in Slack</fullname>
 * <p>
 * You can use the Amazon Web Services Support App in Slack API to manage your support cases in Slack for your Amazon
 * Web Services account. After you configure your Slack workspace and channel with the Amazon Web Services Support App,
 * you can perform the following tasks directly in your Slack channel:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create, search, update, and resolve your support cases
 * </p>
 * </li>
 * <li>
 * <p>
 * Request service quota increases for your account
 * </p>
 * </li>
 * <li>
 * <p>
 * Invite Amazon Web Services Support agents to your channel so that you can chat directly about your support cases
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about how to perform these actions in Slack, see the following documentation in the <i>Amazon
 * Web Services Support User Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html">Amazon Web Services
 * Support App in Slack</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/joining-a-live-chat-session.html">Joining a live chat
 * session with Amazon Web Services Support</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/service-quota-increase.html">Requesting service quota
 * increases</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/awssupport/latest/user/support-app-commands.html">Amazon Web Services Support
 * App commands in Slack</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can also use the Amazon Web Services Management Console instead of the Amazon Web Services Support App API to
 * manage your Slack configurations. For more information, see <a
 * href="https://docs.aws.amazon.com/awssupport/latest/user/authorize-slack-workspace.html">Authorize a Slack workspace
 * to enable the Amazon Web Services Support App</a>.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise Support plan to use the Amazon Web Services Support App API.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about the Amazon Web Services Support App endpoints, see the <a
 * href="https://docs.aws.amazon.com/general/latest/gr/awssupport.html#awssupport_app_region">Amazon Web Services
 * Support App in Slack endpoints</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * </li>
 * </ul>
 * </note></p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSupportAppAsyncClient extends AWSSupportAppClient implements AWSSupportAppAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSupportAppAsyncClientBuilder asyncBuilder() {
        return AWSSupportAppAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SupportApp using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSupportAppAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SupportApp using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSupportAppAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest request) {

        return createSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            final CreateSlackChannelConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSlackChannelConfigurationRequest, CreateSlackChannelConfigurationResult> asyncHandler) {
        final CreateSlackChannelConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSlackChannelConfigurationResult>() {
            @Override
            public CreateSlackChannelConfigurationResult call() throws Exception {
                CreateSlackChannelConfigurationResult result = null;

                try {
                    result = executeCreateSlackChannelConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(DeleteAccountAliasRequest request) {

        return deleteAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(final DeleteAccountAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountAliasRequest, DeleteAccountAliasResult> asyncHandler) {
        final DeleteAccountAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountAliasResult>() {
            @Override
            public DeleteAccountAliasResult call() throws Exception {
                DeleteAccountAliasResult result = null;

                try {
                    result = executeDeleteAccountAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest request) {

        return deleteSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            final DeleteSlackChannelConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSlackChannelConfigurationRequest, DeleteSlackChannelConfigurationResult> asyncHandler) {
        final DeleteSlackChannelConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSlackChannelConfigurationResult>() {
            @Override
            public DeleteSlackChannelConfigurationResult call() throws Exception {
                DeleteSlackChannelConfigurationResult result = null;

                try {
                    result = executeDeleteSlackChannelConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceConfigurationResult> deleteSlackWorkspaceConfigurationAsync(
            DeleteSlackWorkspaceConfigurationRequest request) {

        return deleteSlackWorkspaceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceConfigurationResult> deleteSlackWorkspaceConfigurationAsync(
            final DeleteSlackWorkspaceConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSlackWorkspaceConfigurationRequest, DeleteSlackWorkspaceConfigurationResult> asyncHandler) {
        final DeleteSlackWorkspaceConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSlackWorkspaceConfigurationResult>() {
            @Override
            public DeleteSlackWorkspaceConfigurationResult call() throws Exception {
                DeleteSlackWorkspaceConfigurationResult result = null;

                try {
                    result = executeDeleteSlackWorkspaceConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountAliasResult> getAccountAliasAsync(GetAccountAliasRequest request) {

        return getAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountAliasResult> getAccountAliasAsync(final GetAccountAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountAliasRequest, GetAccountAliasResult> asyncHandler) {
        final GetAccountAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountAliasResult>() {
            @Override
            public GetAccountAliasResult call() throws Exception {
                GetAccountAliasResult result = null;

                try {
                    result = executeGetAccountAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSlackChannelConfigurationsResult> listSlackChannelConfigurationsAsync(ListSlackChannelConfigurationsRequest request) {

        return listSlackChannelConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSlackChannelConfigurationsResult> listSlackChannelConfigurationsAsync(
            final ListSlackChannelConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSlackChannelConfigurationsRequest, ListSlackChannelConfigurationsResult> asyncHandler) {
        final ListSlackChannelConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSlackChannelConfigurationsResult>() {
            @Override
            public ListSlackChannelConfigurationsResult call() throws Exception {
                ListSlackChannelConfigurationsResult result = null;

                try {
                    result = executeListSlackChannelConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSlackWorkspaceConfigurationsResult> listSlackWorkspaceConfigurationsAsync(
            ListSlackWorkspaceConfigurationsRequest request) {

        return listSlackWorkspaceConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSlackWorkspaceConfigurationsResult> listSlackWorkspaceConfigurationsAsync(
            final ListSlackWorkspaceConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSlackWorkspaceConfigurationsRequest, ListSlackWorkspaceConfigurationsResult> asyncHandler) {
        final ListSlackWorkspaceConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSlackWorkspaceConfigurationsResult>() {
            @Override
            public ListSlackWorkspaceConfigurationsResult call() throws Exception {
                ListSlackWorkspaceConfigurationsResult result = null;

                try {
                    result = executeListSlackWorkspaceConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutAccountAliasResult> putAccountAliasAsync(PutAccountAliasRequest request) {

        return putAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountAliasResult> putAccountAliasAsync(final PutAccountAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountAliasRequest, PutAccountAliasResult> asyncHandler) {
        final PutAccountAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountAliasResult>() {
            @Override
            public PutAccountAliasResult call() throws Exception {
                PutAccountAliasResult result = null;

                try {
                    result = executePutAccountAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterSlackWorkspaceForOrganizationResult> registerSlackWorkspaceForOrganizationAsync(
            RegisterSlackWorkspaceForOrganizationRequest request) {

        return registerSlackWorkspaceForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterSlackWorkspaceForOrganizationResult> registerSlackWorkspaceForOrganizationAsync(
            final RegisterSlackWorkspaceForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterSlackWorkspaceForOrganizationRequest, RegisterSlackWorkspaceForOrganizationResult> asyncHandler) {
        final RegisterSlackWorkspaceForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterSlackWorkspaceForOrganizationResult>() {
            @Override
            public RegisterSlackWorkspaceForOrganizationResult call() throws Exception {
                RegisterSlackWorkspaceForOrganizationResult result = null;

                try {
                    result = executeRegisterSlackWorkspaceForOrganization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest request) {

        return updateSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            final UpdateSlackChannelConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSlackChannelConfigurationRequest, UpdateSlackChannelConfigurationResult> asyncHandler) {
        final UpdateSlackChannelConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSlackChannelConfigurationResult>() {
            @Override
            public UpdateSlackChannelConfigurationResult call() throws Exception {
                UpdateSlackChannelConfigurationResult result = null;

                try {
                    result = executeUpdateSlackChannelConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
