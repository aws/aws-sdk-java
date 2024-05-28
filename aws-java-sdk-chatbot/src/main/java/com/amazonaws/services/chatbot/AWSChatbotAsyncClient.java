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
package com.amazonaws.services.chatbot;

import javax.annotation.Generated;

import com.amazonaws.services.chatbot.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Chatbot asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * AWS Chatbot API
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSChatbotAsyncClient extends AWSChatbotClient implements AWSChatbotAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSChatbotAsyncClientBuilder asyncBuilder() {
        return AWSChatbotAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Chatbot using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSChatbotAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Chatbot using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSChatbotAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateChimeWebhookConfigurationResult> createChimeWebhookConfigurationAsync(
            CreateChimeWebhookConfigurationRequest request) {

        return createChimeWebhookConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChimeWebhookConfigurationResult> createChimeWebhookConfigurationAsync(
            final CreateChimeWebhookConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChimeWebhookConfigurationRequest, CreateChimeWebhookConfigurationResult> asyncHandler) {
        final CreateChimeWebhookConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChimeWebhookConfigurationResult>() {
            @Override
            public CreateChimeWebhookConfigurationResult call() throws Exception {
                CreateChimeWebhookConfigurationResult result = null;

                try {
                    result = executeCreateChimeWebhookConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftTeamsChannelConfigurationResult> createMicrosoftTeamsChannelConfigurationAsync(
            CreateMicrosoftTeamsChannelConfigurationRequest request) {

        return createMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftTeamsChannelConfigurationResult> createMicrosoftTeamsChannelConfigurationAsync(
            final CreateMicrosoftTeamsChannelConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMicrosoftTeamsChannelConfigurationRequest, CreateMicrosoftTeamsChannelConfigurationResult> asyncHandler) {
        final CreateMicrosoftTeamsChannelConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMicrosoftTeamsChannelConfigurationResult>() {
            @Override
            public CreateMicrosoftTeamsChannelConfigurationResult call() throws Exception {
                CreateMicrosoftTeamsChannelConfigurationResult result = null;

                try {
                    result = executeCreateMicrosoftTeamsChannelConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
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
    public java.util.concurrent.Future<DeleteChimeWebhookConfigurationResult> deleteChimeWebhookConfigurationAsync(
            DeleteChimeWebhookConfigurationRequest request) {

        return deleteChimeWebhookConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChimeWebhookConfigurationResult> deleteChimeWebhookConfigurationAsync(
            final DeleteChimeWebhookConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChimeWebhookConfigurationRequest, DeleteChimeWebhookConfigurationResult> asyncHandler) {
        final DeleteChimeWebhookConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChimeWebhookConfigurationResult>() {
            @Override
            public DeleteChimeWebhookConfigurationResult call() throws Exception {
                DeleteChimeWebhookConfigurationResult result = null;

                try {
                    result = executeDeleteChimeWebhookConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsChannelConfigurationResult> deleteMicrosoftTeamsChannelConfigurationAsync(
            DeleteMicrosoftTeamsChannelConfigurationRequest request) {

        return deleteMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsChannelConfigurationResult> deleteMicrosoftTeamsChannelConfigurationAsync(
            final DeleteMicrosoftTeamsChannelConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsChannelConfigurationRequest, DeleteMicrosoftTeamsChannelConfigurationResult> asyncHandler) {
        final DeleteMicrosoftTeamsChannelConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMicrosoftTeamsChannelConfigurationResult>() {
            @Override
            public DeleteMicrosoftTeamsChannelConfigurationResult call() throws Exception {
                DeleteMicrosoftTeamsChannelConfigurationResult result = null;

                try {
                    result = executeDeleteMicrosoftTeamsChannelConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsConfiguredTeamResult> deleteMicrosoftTeamsConfiguredTeamAsync(
            DeleteMicrosoftTeamsConfiguredTeamRequest request) {

        return deleteMicrosoftTeamsConfiguredTeamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsConfiguredTeamResult> deleteMicrosoftTeamsConfiguredTeamAsync(
            final DeleteMicrosoftTeamsConfiguredTeamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsConfiguredTeamRequest, DeleteMicrosoftTeamsConfiguredTeamResult> asyncHandler) {
        final DeleteMicrosoftTeamsConfiguredTeamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMicrosoftTeamsConfiguredTeamResult>() {
            @Override
            public DeleteMicrosoftTeamsConfiguredTeamResult call() throws Exception {
                DeleteMicrosoftTeamsConfiguredTeamResult result = null;

                try {
                    result = executeDeleteMicrosoftTeamsConfiguredTeam(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsUserIdentityResult> deleteMicrosoftTeamsUserIdentityAsync(
            DeleteMicrosoftTeamsUserIdentityRequest request) {

        return deleteMicrosoftTeamsUserIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMicrosoftTeamsUserIdentityResult> deleteMicrosoftTeamsUserIdentityAsync(
            final DeleteMicrosoftTeamsUserIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMicrosoftTeamsUserIdentityRequest, DeleteMicrosoftTeamsUserIdentityResult> asyncHandler) {
        final DeleteMicrosoftTeamsUserIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMicrosoftTeamsUserIdentityResult>() {
            @Override
            public DeleteMicrosoftTeamsUserIdentityResult call() throws Exception {
                DeleteMicrosoftTeamsUserIdentityResult result = null;

                try {
                    result = executeDeleteMicrosoftTeamsUserIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteSlackUserIdentityResult> deleteSlackUserIdentityAsync(DeleteSlackUserIdentityRequest request) {

        return deleteSlackUserIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackUserIdentityResult> deleteSlackUserIdentityAsync(final DeleteSlackUserIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSlackUserIdentityRequest, DeleteSlackUserIdentityResult> asyncHandler) {
        final DeleteSlackUserIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSlackUserIdentityResult>() {
            @Override
            public DeleteSlackUserIdentityResult call() throws Exception {
                DeleteSlackUserIdentityResult result = null;

                try {
                    result = executeDeleteSlackUserIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceAuthorizationResult> deleteSlackWorkspaceAuthorizationAsync(
            DeleteSlackWorkspaceAuthorizationRequest request) {

        return deleteSlackWorkspaceAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceAuthorizationResult> deleteSlackWorkspaceAuthorizationAsync(
            final DeleteSlackWorkspaceAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSlackWorkspaceAuthorizationRequest, DeleteSlackWorkspaceAuthorizationResult> asyncHandler) {
        final DeleteSlackWorkspaceAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSlackWorkspaceAuthorizationResult>() {
            @Override
            public DeleteSlackWorkspaceAuthorizationResult call() throws Exception {
                DeleteSlackWorkspaceAuthorizationResult result = null;

                try {
                    result = executeDeleteSlackWorkspaceAuthorization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeChimeWebhookConfigurationsResult> describeChimeWebhookConfigurationsAsync(
            DescribeChimeWebhookConfigurationsRequest request) {

        return describeChimeWebhookConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChimeWebhookConfigurationsResult> describeChimeWebhookConfigurationsAsync(
            final DescribeChimeWebhookConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChimeWebhookConfigurationsRequest, DescribeChimeWebhookConfigurationsResult> asyncHandler) {
        final DescribeChimeWebhookConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChimeWebhookConfigurationsResult>() {
            @Override
            public DescribeChimeWebhookConfigurationsResult call() throws Exception {
                DescribeChimeWebhookConfigurationsResult result = null;

                try {
                    result = executeDescribeChimeWebhookConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackChannelConfigurationsResult> describeSlackChannelConfigurationsAsync(
            DescribeSlackChannelConfigurationsRequest request) {

        return describeSlackChannelConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackChannelConfigurationsResult> describeSlackChannelConfigurationsAsync(
            final DescribeSlackChannelConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSlackChannelConfigurationsRequest, DescribeSlackChannelConfigurationsResult> asyncHandler) {
        final DescribeSlackChannelConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSlackChannelConfigurationsResult>() {
            @Override
            public DescribeSlackChannelConfigurationsResult call() throws Exception {
                DescribeSlackChannelConfigurationsResult result = null;

                try {
                    result = executeDescribeSlackChannelConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackUserIdentitiesResult> describeSlackUserIdentitiesAsync(DescribeSlackUserIdentitiesRequest request) {

        return describeSlackUserIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackUserIdentitiesResult> describeSlackUserIdentitiesAsync(final DescribeSlackUserIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSlackUserIdentitiesRequest, DescribeSlackUserIdentitiesResult> asyncHandler) {
        final DescribeSlackUserIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSlackUserIdentitiesResult>() {
            @Override
            public DescribeSlackUserIdentitiesResult call() throws Exception {
                DescribeSlackUserIdentitiesResult result = null;

                try {
                    result = executeDescribeSlackUserIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackWorkspacesResult> describeSlackWorkspacesAsync(DescribeSlackWorkspacesRequest request) {

        return describeSlackWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSlackWorkspacesResult> describeSlackWorkspacesAsync(final DescribeSlackWorkspacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSlackWorkspacesRequest, DescribeSlackWorkspacesResult> asyncHandler) {
        final DescribeSlackWorkspacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSlackWorkspacesResult>() {
            @Override
            public DescribeSlackWorkspacesResult call() throws Exception {
                DescribeSlackWorkspacesResult result = null;

                try {
                    result = executeDescribeSlackWorkspaces(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountPreferencesResult> getAccountPreferencesAsync(GetAccountPreferencesRequest request) {

        return getAccountPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountPreferencesResult> getAccountPreferencesAsync(final GetAccountPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountPreferencesRequest, GetAccountPreferencesResult> asyncHandler) {
        final GetAccountPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountPreferencesResult>() {
            @Override
            public GetAccountPreferencesResult call() throws Exception {
                GetAccountPreferencesResult result = null;

                try {
                    result = executeGetAccountPreferences(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMicrosoftTeamsChannelConfigurationResult> getMicrosoftTeamsChannelConfigurationAsync(
            GetMicrosoftTeamsChannelConfigurationRequest request) {

        return getMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMicrosoftTeamsChannelConfigurationResult> getMicrosoftTeamsChannelConfigurationAsync(
            final GetMicrosoftTeamsChannelConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMicrosoftTeamsChannelConfigurationRequest, GetMicrosoftTeamsChannelConfigurationResult> asyncHandler) {
        final GetMicrosoftTeamsChannelConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMicrosoftTeamsChannelConfigurationResult>() {
            @Override
            public GetMicrosoftTeamsChannelConfigurationResult call() throws Exception {
                GetMicrosoftTeamsChannelConfigurationResult result = null;

                try {
                    result = executeGetMicrosoftTeamsChannelConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsChannelConfigurationsResult> listMicrosoftTeamsChannelConfigurationsAsync(
            ListMicrosoftTeamsChannelConfigurationsRequest request) {

        return listMicrosoftTeamsChannelConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsChannelConfigurationsResult> listMicrosoftTeamsChannelConfigurationsAsync(
            final ListMicrosoftTeamsChannelConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsChannelConfigurationsRequest, ListMicrosoftTeamsChannelConfigurationsResult> asyncHandler) {
        final ListMicrosoftTeamsChannelConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMicrosoftTeamsChannelConfigurationsResult>() {
            @Override
            public ListMicrosoftTeamsChannelConfigurationsResult call() throws Exception {
                ListMicrosoftTeamsChannelConfigurationsResult result = null;

                try {
                    result = executeListMicrosoftTeamsChannelConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsConfiguredTeamsResult> listMicrosoftTeamsConfiguredTeamsAsync(
            ListMicrosoftTeamsConfiguredTeamsRequest request) {

        return listMicrosoftTeamsConfiguredTeamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsConfiguredTeamsResult> listMicrosoftTeamsConfiguredTeamsAsync(
            final ListMicrosoftTeamsConfiguredTeamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsConfiguredTeamsRequest, ListMicrosoftTeamsConfiguredTeamsResult> asyncHandler) {
        final ListMicrosoftTeamsConfiguredTeamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMicrosoftTeamsConfiguredTeamsResult>() {
            @Override
            public ListMicrosoftTeamsConfiguredTeamsResult call() throws Exception {
                ListMicrosoftTeamsConfiguredTeamsResult result = null;

                try {
                    result = executeListMicrosoftTeamsConfiguredTeams(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsUserIdentitiesResult> listMicrosoftTeamsUserIdentitiesAsync(
            ListMicrosoftTeamsUserIdentitiesRequest request) {

        return listMicrosoftTeamsUserIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMicrosoftTeamsUserIdentitiesResult> listMicrosoftTeamsUserIdentitiesAsync(
            final ListMicrosoftTeamsUserIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMicrosoftTeamsUserIdentitiesRequest, ListMicrosoftTeamsUserIdentitiesResult> asyncHandler) {
        final ListMicrosoftTeamsUserIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMicrosoftTeamsUserIdentitiesResult>() {
            @Override
            public ListMicrosoftTeamsUserIdentitiesResult call() throws Exception {
                ListMicrosoftTeamsUserIdentitiesResult result = null;

                try {
                    result = executeListMicrosoftTeamsUserIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAccountPreferencesResult> updateAccountPreferencesAsync(UpdateAccountPreferencesRequest request) {

        return updateAccountPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountPreferencesResult> updateAccountPreferencesAsync(final UpdateAccountPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountPreferencesRequest, UpdateAccountPreferencesResult> asyncHandler) {
        final UpdateAccountPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountPreferencesResult>() {
            @Override
            public UpdateAccountPreferencesResult call() throws Exception {
                UpdateAccountPreferencesResult result = null;

                try {
                    result = executeUpdateAccountPreferences(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateChimeWebhookConfigurationResult> updateChimeWebhookConfigurationAsync(
            UpdateChimeWebhookConfigurationRequest request) {

        return updateChimeWebhookConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChimeWebhookConfigurationResult> updateChimeWebhookConfigurationAsync(
            final UpdateChimeWebhookConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChimeWebhookConfigurationRequest, UpdateChimeWebhookConfigurationResult> asyncHandler) {
        final UpdateChimeWebhookConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChimeWebhookConfigurationResult>() {
            @Override
            public UpdateChimeWebhookConfigurationResult call() throws Exception {
                UpdateChimeWebhookConfigurationResult result = null;

                try {
                    result = executeUpdateChimeWebhookConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMicrosoftTeamsChannelConfigurationResult> updateMicrosoftTeamsChannelConfigurationAsync(
            UpdateMicrosoftTeamsChannelConfigurationRequest request) {

        return updateMicrosoftTeamsChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMicrosoftTeamsChannelConfigurationResult> updateMicrosoftTeamsChannelConfigurationAsync(
            final UpdateMicrosoftTeamsChannelConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMicrosoftTeamsChannelConfigurationRequest, UpdateMicrosoftTeamsChannelConfigurationResult> asyncHandler) {
        final UpdateMicrosoftTeamsChannelConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMicrosoftTeamsChannelConfigurationResult>() {
            @Override
            public UpdateMicrosoftTeamsChannelConfigurationResult call() throws Exception {
                UpdateMicrosoftTeamsChannelConfigurationResult result = null;

                try {
                    result = executeUpdateMicrosoftTeamsChannelConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
