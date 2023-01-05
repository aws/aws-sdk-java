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
package com.amazonaws.services.chimesdkidentity;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Chime SDK Identity asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon Chime SDK Identity APIs in this section allow software developers to create and manage unique instances of
 * their messaging applications. These APIs provide the overarching framework for creating and sending messages. For
 * more information about the identity APIs, refer to <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Identity.html">Amazon
 * Chime SDK identity</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKIdentityAsyncClient extends AmazonChimeSDKIdentityClient implements AmazonChimeSDKIdentityAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonChimeSDKIdentityAsyncClientBuilder asyncBuilder() {
        return AmazonChimeSDKIdentityAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Identity using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKIdentityAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Identity using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonChimeSDKIdentityAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(CreateAppInstanceRequest request) {

        return createAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(final CreateAppInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppInstanceRequest, CreateAppInstanceResult> asyncHandler) {
        final CreateAppInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppInstanceResult>() {
            @Override
            public CreateAppInstanceResult call() throws Exception {
                CreateAppInstanceResult result = null;

                try {
                    result = executeCreateAppInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(CreateAppInstanceAdminRequest request) {

        return createAppInstanceAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(final CreateAppInstanceAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppInstanceAdminRequest, CreateAppInstanceAdminResult> asyncHandler) {
        final CreateAppInstanceAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppInstanceAdminResult>() {
            @Override
            public CreateAppInstanceAdminResult call() throws Exception {
                CreateAppInstanceAdminResult result = null;

                try {
                    result = executeCreateAppInstanceAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(CreateAppInstanceUserRequest request) {

        return createAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(final CreateAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppInstanceUserRequest, CreateAppInstanceUserResult> asyncHandler) {
        final CreateAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppInstanceUserResult>() {
            @Override
            public CreateAppInstanceUserResult call() throws Exception {
                CreateAppInstanceUserResult result = null;

                try {
                    result = executeCreateAppInstanceUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(DeleteAppInstanceRequest request) {

        return deleteAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(final DeleteAppInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceRequest, DeleteAppInstanceResult> asyncHandler) {
        final DeleteAppInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppInstanceResult>() {
            @Override
            public DeleteAppInstanceResult call() throws Exception {
                DeleteAppInstanceResult result = null;

                try {
                    result = executeDeleteAppInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(DeleteAppInstanceAdminRequest request) {

        return deleteAppInstanceAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(final DeleteAppInstanceAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceAdminRequest, DeleteAppInstanceAdminResult> asyncHandler) {
        final DeleteAppInstanceAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppInstanceAdminResult>() {
            @Override
            public DeleteAppInstanceAdminResult call() throws Exception {
                DeleteAppInstanceAdminResult result = null;

                try {
                    result = executeDeleteAppInstanceAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(DeleteAppInstanceUserRequest request) {

        return deleteAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(final DeleteAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceUserRequest, DeleteAppInstanceUserResult> asyncHandler) {
        final DeleteAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppInstanceUserResult>() {
            @Override
            public DeleteAppInstanceUserResult call() throws Exception {
                DeleteAppInstanceUserResult result = null;

                try {
                    result = executeDeleteAppInstanceUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterAppInstanceUserEndpointResult> deregisterAppInstanceUserEndpointAsync(
            DeregisterAppInstanceUserEndpointRequest request) {

        return deregisterAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterAppInstanceUserEndpointResult> deregisterAppInstanceUserEndpointAsync(
            final DeregisterAppInstanceUserEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterAppInstanceUserEndpointRequest, DeregisterAppInstanceUserEndpointResult> asyncHandler) {
        final DeregisterAppInstanceUserEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterAppInstanceUserEndpointResult>() {
            @Override
            public DeregisterAppInstanceUserEndpointResult call() throws Exception {
                DeregisterAppInstanceUserEndpointResult result = null;

                try {
                    result = executeDeregisterAppInstanceUserEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(DescribeAppInstanceRequest request) {

        return describeAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(final DescribeAppInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceRequest, DescribeAppInstanceResult> asyncHandler) {
        final DescribeAppInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppInstanceResult>() {
            @Override
            public DescribeAppInstanceResult call() throws Exception {
                DescribeAppInstanceResult result = null;

                try {
                    result = executeDescribeAppInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(DescribeAppInstanceAdminRequest request) {

        return describeAppInstanceAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(final DescribeAppInstanceAdminRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceAdminRequest, DescribeAppInstanceAdminResult> asyncHandler) {
        final DescribeAppInstanceAdminRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppInstanceAdminResult>() {
            @Override
            public DescribeAppInstanceAdminResult call() throws Exception {
                DescribeAppInstanceAdminResult result = null;

                try {
                    result = executeDescribeAppInstanceAdmin(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(DescribeAppInstanceUserRequest request) {

        return describeAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(final DescribeAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceUserRequest, DescribeAppInstanceUserResult> asyncHandler) {
        final DescribeAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppInstanceUserResult>() {
            @Override
            public DescribeAppInstanceUserResult call() throws Exception {
                DescribeAppInstanceUserResult result = null;

                try {
                    result = executeDescribeAppInstanceUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserEndpointResult> describeAppInstanceUserEndpointAsync(
            DescribeAppInstanceUserEndpointRequest request) {

        return describeAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserEndpointResult> describeAppInstanceUserEndpointAsync(
            final DescribeAppInstanceUserEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceUserEndpointRequest, DescribeAppInstanceUserEndpointResult> asyncHandler) {
        final DescribeAppInstanceUserEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAppInstanceUserEndpointResult>() {
            @Override
            public DescribeAppInstanceUserEndpointResult call() throws Exception {
                DescribeAppInstanceUserEndpointResult result = null;

                try {
                    result = executeDescribeAppInstanceUserEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            GetAppInstanceRetentionSettingsRequest request) {

        return getAppInstanceRetentionSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            final GetAppInstanceRetentionSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppInstanceRetentionSettingsRequest, GetAppInstanceRetentionSettingsResult> asyncHandler) {
        final GetAppInstanceRetentionSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppInstanceRetentionSettingsResult>() {
            @Override
            public GetAppInstanceRetentionSettingsResult call() throws Exception {
                GetAppInstanceRetentionSettingsResult result = null;

                try {
                    result = executeGetAppInstanceRetentionSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(ListAppInstanceAdminsRequest request) {

        return listAppInstanceAdminsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(final ListAppInstanceAdminsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppInstanceAdminsRequest, ListAppInstanceAdminsResult> asyncHandler) {
        final ListAppInstanceAdminsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppInstanceAdminsResult>() {
            @Override
            public ListAppInstanceAdminsResult call() throws Exception {
                ListAppInstanceAdminsResult result = null;

                try {
                    result = executeListAppInstanceAdmins(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUserEndpointsResult> listAppInstanceUserEndpointsAsync(ListAppInstanceUserEndpointsRequest request) {

        return listAppInstanceUserEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUserEndpointsResult> listAppInstanceUserEndpointsAsync(final ListAppInstanceUserEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppInstanceUserEndpointsRequest, ListAppInstanceUserEndpointsResult> asyncHandler) {
        final ListAppInstanceUserEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppInstanceUserEndpointsResult>() {
            @Override
            public ListAppInstanceUserEndpointsResult call() throws Exception {
                ListAppInstanceUserEndpointsResult result = null;

                try {
                    result = executeListAppInstanceUserEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(ListAppInstanceUsersRequest request) {

        return listAppInstanceUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(final ListAppInstanceUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppInstanceUsersRequest, ListAppInstanceUsersResult> asyncHandler) {
        final ListAppInstanceUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppInstanceUsersResult>() {
            @Override
            public ListAppInstanceUsersResult call() throws Exception {
                ListAppInstanceUsersResult result = null;

                try {
                    result = executeListAppInstanceUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(ListAppInstancesRequest request) {

        return listAppInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(final ListAppInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppInstancesRequest, ListAppInstancesResult> asyncHandler) {
        final ListAppInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppInstancesResult>() {
            @Override
            public ListAppInstancesResult call() throws Exception {
                ListAppInstancesResult result = null;

                try {
                    result = executeListAppInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            PutAppInstanceRetentionSettingsRequest request) {

        return putAppInstanceRetentionSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            final PutAppInstanceRetentionSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAppInstanceRetentionSettingsRequest, PutAppInstanceRetentionSettingsResult> asyncHandler) {
        final PutAppInstanceRetentionSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAppInstanceRetentionSettingsResult>() {
            @Override
            public PutAppInstanceRetentionSettingsResult call() throws Exception {
                PutAppInstanceRetentionSettingsResult result = null;

                try {
                    result = executePutAppInstanceRetentionSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterAppInstanceUserEndpointResult> registerAppInstanceUserEndpointAsync(
            RegisterAppInstanceUserEndpointRequest request) {

        return registerAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAppInstanceUserEndpointResult> registerAppInstanceUserEndpointAsync(
            final RegisterAppInstanceUserEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterAppInstanceUserEndpointRequest, RegisterAppInstanceUserEndpointResult> asyncHandler) {
        final RegisterAppInstanceUserEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterAppInstanceUserEndpointResult>() {
            @Override
            public RegisterAppInstanceUserEndpointResult call() throws Exception {
                RegisterAppInstanceUserEndpointResult result = null;

                try {
                    result = executeRegisterAppInstanceUserEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(UpdateAppInstanceRequest request) {

        return updateAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(final UpdateAppInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceRequest, UpdateAppInstanceResult> asyncHandler) {
        final UpdateAppInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppInstanceResult>() {
            @Override
            public UpdateAppInstanceResult call() throws Exception {
                UpdateAppInstanceResult result = null;

                try {
                    result = executeUpdateAppInstance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(UpdateAppInstanceUserRequest request) {

        return updateAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(final UpdateAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceUserRequest, UpdateAppInstanceUserResult> asyncHandler) {
        final UpdateAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppInstanceUserResult>() {
            @Override
            public UpdateAppInstanceUserResult call() throws Exception {
                UpdateAppInstanceUserResult result = null;

                try {
                    result = executeUpdateAppInstanceUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserEndpointResult> updateAppInstanceUserEndpointAsync(UpdateAppInstanceUserEndpointRequest request) {

        return updateAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserEndpointResult> updateAppInstanceUserEndpointAsync(
            final UpdateAppInstanceUserEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceUserEndpointRequest, UpdateAppInstanceUserEndpointResult> asyncHandler) {
        final UpdateAppInstanceUserEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAppInstanceUserEndpointResult>() {
            @Override
            public UpdateAppInstanceUserEndpointResult call() throws Exception {
                UpdateAppInstanceUserEndpointResult result = null;

                try {
                    result = executeUpdateAppInstanceUserEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
