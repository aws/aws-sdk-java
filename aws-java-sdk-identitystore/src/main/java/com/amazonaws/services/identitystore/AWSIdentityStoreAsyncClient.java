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
package com.amazonaws.services.identitystore;

import javax.annotation.Generated;

import com.amazonaws.services.identitystore.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing IdentityStore asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Identity Store service used by AWS IAM Identity Center (successor to AWS Single Sign-On) provides a single place
 * to retrieve all of your identities (users and groups). For more information, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">IAM Identity Center User Guide</a>.
 * </p>
 * 
 * <pre>
 * <code> &lt;note&gt; &lt;p&gt;Although AWS Single Sign-On was renamed, the &lt;code&gt;sso&lt;/code&gt; and &lt;code&gt;identitystore&lt;/code&gt; API namespaces will continue to retain their original name for backward compatibility purposes. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html#renamed&quot;&gt;IAM Identity Center rename&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;This reference guide describes the identity store operations that you can call programatically and includes detailed information on data types and errors.&lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIdentityStoreAsyncClient extends AWSIdentityStoreClient implements AWSIdentityStoreAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIdentityStoreAsyncClientBuilder asyncBuilder() {
        return AWSIdentityStoreAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IdentityStore using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIdentityStoreAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IdentityStore using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIdentityStoreAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(final CreateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {
        final CreateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result = null;

                try {
                    result = executeCreateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest request) {

        return createGroupMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(final CreateGroupMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupMembershipRequest, CreateGroupMembershipResult> asyncHandler) {
        final CreateGroupMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupMembershipResult>() {
            @Override
            public CreateGroupMembershipResult call() throws Exception {
                CreateGroupMembershipResult result = null;

                try {
                    result = executeCreateGroupMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest request) {

        return deleteGroupMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(final DeleteGroupMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupMembershipRequest, DeleteGroupMembershipResult> asyncHandler) {
        final DeleteGroupMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupMembershipResult>() {
            @Override
            public DeleteGroupMembershipResult call() throws Exception {
                DeleteGroupMembershipResult result = null;

                try {
                    result = executeDeleteGroupMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest request) {

        return describeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(final DescribeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler) {
        final DescribeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGroupResult>() {
            @Override
            public DescribeGroupResult call() throws Exception {
                DescribeGroupResult result = null;

                try {
                    result = executeDescribeGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupMembershipResult> describeGroupMembershipAsync(DescribeGroupMembershipRequest request) {

        return describeGroupMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupMembershipResult> describeGroupMembershipAsync(final DescribeGroupMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGroupMembershipRequest, DescribeGroupMembershipResult> asyncHandler) {
        final DescribeGroupMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGroupMembershipResult>() {
            @Override
            public DescribeGroupMembershipResult call() throws Exception {
                DescribeGroupMembershipResult result = null;

                try {
                    result = executeDescribeGroupMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupIdResult> getGroupIdAsync(GetGroupIdRequest request) {

        return getGroupIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupIdResult> getGroupIdAsync(final GetGroupIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupIdRequest, GetGroupIdResult> asyncHandler) {
        final GetGroupIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupIdResult>() {
            @Override
            public GetGroupIdResult call() throws Exception {
                GetGroupIdResult result = null;

                try {
                    result = executeGetGroupId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGroupMembershipIdResult> getGroupMembershipIdAsync(GetGroupMembershipIdRequest request) {

        return getGroupMembershipIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupMembershipIdResult> getGroupMembershipIdAsync(final GetGroupMembershipIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGroupMembershipIdRequest, GetGroupMembershipIdResult> asyncHandler) {
        final GetGroupMembershipIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGroupMembershipIdResult>() {
            @Override
            public GetGroupMembershipIdResult call() throws Exception {
                GetGroupMembershipIdResult result = null;

                try {
                    result = executeGetGroupMembershipId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetUserIdResult> getUserIdAsync(GetUserIdRequest request) {

        return getUserIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserIdResult> getUserIdAsync(final GetUserIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserIdRequest, GetUserIdResult> asyncHandler) {
        final GetUserIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserIdResult>() {
            @Override
            public GetUserIdResult call() throws Exception {
                GetUserIdResult result = null;

                try {
                    result = executeGetUserId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<IsMemberInGroupsResult> isMemberInGroupsAsync(IsMemberInGroupsRequest request) {

        return isMemberInGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IsMemberInGroupsResult> isMemberInGroupsAsync(final IsMemberInGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<IsMemberInGroupsRequest, IsMemberInGroupsResult> asyncHandler) {
        final IsMemberInGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IsMemberInGroupsResult>() {
            @Override
            public IsMemberInGroupsResult call() throws Exception {
                IsMemberInGroupsResult result = null;

                try {
                    result = executeIsMemberInGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest request) {

        return listGroupMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(final ListGroupMembershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupMembershipsRequest, ListGroupMembershipsResult> asyncHandler) {
        final ListGroupMembershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupMembershipsResult>() {
            @Override
            public ListGroupMembershipsResult call() throws Exception {
                ListGroupMembershipsResult result = null;

                try {
                    result = executeListGroupMemberships(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsForMemberResult> listGroupMembershipsForMemberAsync(ListGroupMembershipsForMemberRequest request) {

        return listGroupMembershipsForMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsForMemberResult> listGroupMembershipsForMemberAsync(
            final ListGroupMembershipsForMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupMembershipsForMemberRequest, ListGroupMembershipsForMemberResult> asyncHandler) {
        final ListGroupMembershipsForMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupMembershipsForMemberResult>() {
            @Override
            public ListGroupMembershipsForMemberResult call() throws Exception {
                ListGroupMembershipsForMemberResult result = null;

                try {
                    result = executeListGroupMembershipsForMember(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(final UpdateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {
        final UpdateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupResult>() {
            @Override
            public UpdateGroupResult call() throws Exception {
                UpdateGroupResult result = null;

                try {
                    result = executeUpdateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
