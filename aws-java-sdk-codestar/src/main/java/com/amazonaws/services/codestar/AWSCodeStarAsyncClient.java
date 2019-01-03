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
package com.amazonaws.services.codestar;

import javax.annotation.Generated;

import com.amazonaws.services.codestar.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing CodeStar asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeStar</fullname>
 * <p>
 * This is the API reference for AWS CodeStar. This reference provides descriptions of the operations and data types for
 * the AWS CodeStar API along with usage examples.
 * </p>
 * <p>
 * You can use the AWS CodeStar API to work with:
 * </p>
 * <p>
 * Projects and their resources, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DeleteProject</code>, which deletes a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeProject</code>, which lists the attributes of a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>, which lists all projects associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListResources</code>, which lists the resources associated with a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListTagsForProject</code>, which lists the tags associated with a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TagProject</code>, which adds tags to a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UntagProject</code>, which removes tags from a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>, which updates the attributes of a project.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Teams and team members, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AssociateTeamMember</code>, which adds an IAM user to the team for a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DisassociateTeamMember</code>, which removes an IAM user from the team for a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListTeamMembers</code>, which lists all the IAM users in the team for a project, including their roles and
 * attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateTeamMember</code>, which updates a team member's attributes in a project.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Users, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateUserProfile</code>, which creates a user profile that contains data associated with the user across all
 * projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteUserProfile</code>, which deletes all user profile information across all projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeUserProfile</code>, which describes the profile of a user.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListUserProfiles</code>, which lists all user profiles.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateUserProfile</code>, which updates the profile for a user.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeStarAsyncClient extends AWSCodeStarClient implements AWSCodeStarAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCodeStarAsyncClientBuilder asyncBuilder() {
        return AWSCodeStarAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeStar using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodeStarAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateTeamMemberResult> associateTeamMemberAsync(AssociateTeamMemberRequest request) {

        return associateTeamMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTeamMemberResult> associateTeamMemberAsync(final AssociateTeamMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTeamMemberRequest, AssociateTeamMemberResult> asyncHandler) {
        final AssociateTeamMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTeamMemberResult>() {
            @Override
            public AssociateTeamMemberResult call() throws Exception {
                AssociateTeamMemberResult result = null;

                try {
                    result = executeAssociateTeamMember(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest request) {

        return createProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResult> createProjectAsync(final CreateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler) {
        final CreateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProjectResult>() {
            @Override
            public CreateProjectResult call() throws Exception {
                CreateProjectResult result = null;

                try {
                    result = executeCreateProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest request) {

        return createUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(final CreateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler) {
        final CreateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserProfileResult>() {
            @Override
            public CreateUserProfileResult call() throws Exception {
                CreateUserProfileResult result = null;

                try {
                    result = executeCreateUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest request) {

        return deleteProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(final DeleteProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler) {
        final DeleteProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProjectResult>() {
            @Override
            public DeleteProjectResult call() throws Exception {
                DeleteProjectResult result = null;

                try {
                    result = executeDeleteProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest request) {

        return deleteUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(final DeleteUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, DeleteUserProfileResult> asyncHandler) {
        final DeleteUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserProfileResult>() {
            @Override
            public DeleteUserProfileResult call() throws Exception {
                DeleteUserProfileResult result = null;

                try {
                    result = executeDeleteUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest request) {

        return describeProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(final DescribeProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler) {
        final DescribeProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProjectResult>() {
            @Override
            public DescribeProjectResult call() throws Exception {
                DescribeProjectResult result = null;

                try {
                    result = executeDescribeProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(DescribeUserProfileRequest request) {

        return describeUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(final DescribeUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserProfileRequest, DescribeUserProfileResult> asyncHandler) {
        final DescribeUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserProfileResult>() {
            @Override
            public DescribeUserProfileResult call() throws Exception {
                DescribeUserProfileResult result = null;

                try {
                    result = executeDescribeUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateTeamMemberResult> disassociateTeamMemberAsync(DisassociateTeamMemberRequest request) {

        return disassociateTeamMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTeamMemberResult> disassociateTeamMemberAsync(final DisassociateTeamMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTeamMemberRequest, DisassociateTeamMemberResult> asyncHandler) {
        final DisassociateTeamMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTeamMemberResult>() {
            @Override
            public DisassociateTeamMemberResult call() throws Exception {
                DisassociateTeamMemberResult result = null;

                try {
                    result = executeDisassociateTeamMember(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest request) {

        return listProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(final ListProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler) {
        final ListProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProjectsResult>() {
            @Override
            public ListProjectsResult call() throws Exception {
                ListProjectsResult result = null;

                try {
                    result = executeListProjects(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest request) {

        return listResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(final ListResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler) {
        final ListResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesResult>() {
            @Override
            public ListResourcesResult call() throws Exception {
                ListResourcesResult result = null;

                try {
                    result = executeListResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForProjectResult> listTagsForProjectAsync(ListTagsForProjectRequest request) {

        return listTagsForProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForProjectResult> listTagsForProjectAsync(final ListTagsForProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForProjectRequest, ListTagsForProjectResult> asyncHandler) {
        final ListTagsForProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForProjectResult>() {
            @Override
            public ListTagsForProjectResult call() throws Exception {
                ListTagsForProjectResult result = null;

                try {
                    result = executeListTagsForProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTeamMembersResult> listTeamMembersAsync(ListTeamMembersRequest request) {

        return listTeamMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTeamMembersResult> listTeamMembersAsync(final ListTeamMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTeamMembersRequest, ListTeamMembersResult> asyncHandler) {
        final ListTeamMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTeamMembersResult>() {
            @Override
            public ListTeamMembersResult call() throws Exception {
                ListTeamMembersResult result = null;

                try {
                    result = executeListTeamMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(ListUserProfilesRequest request) {

        return listUserProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(final ListUserProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserProfilesRequest, ListUserProfilesResult> asyncHandler) {
        final ListUserProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserProfilesResult>() {
            @Override
            public ListUserProfilesResult call() throws Exception {
                ListUserProfilesResult result = null;

                try {
                    result = executeListUserProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagProjectResult> tagProjectAsync(TagProjectRequest request) {

        return tagProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagProjectResult> tagProjectAsync(final TagProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagProjectRequest, TagProjectResult> asyncHandler) {
        final TagProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagProjectResult>() {
            @Override
            public TagProjectResult call() throws Exception {
                TagProjectResult result = null;

                try {
                    result = executeTagProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagProjectResult> untagProjectAsync(UntagProjectRequest request) {

        return untagProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagProjectResult> untagProjectAsync(final UntagProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagProjectRequest, UntagProjectResult> asyncHandler) {
        final UntagProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagProjectResult>() {
            @Override
            public UntagProjectResult call() throws Exception {
                UntagProjectResult result = null;

                try {
                    result = executeUntagProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest request) {

        return updateProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(final UpdateProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler) {
        final UpdateProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProjectResult>() {
            @Override
            public UpdateProjectResult call() throws Exception {
                UpdateProjectResult result = null;

                try {
                    result = executeUpdateProject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTeamMemberResult> updateTeamMemberAsync(UpdateTeamMemberRequest request) {

        return updateTeamMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTeamMemberResult> updateTeamMemberAsync(final UpdateTeamMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTeamMemberRequest, UpdateTeamMemberResult> asyncHandler) {
        final UpdateTeamMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTeamMemberResult>() {
            @Override
            public UpdateTeamMemberResult call() throws Exception {
                UpdateTeamMemberResult result = null;

                try {
                    result = executeUpdateTeamMember(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest request) {

        return updateUserProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(final UpdateUserProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler) {
        final UpdateUserProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserProfileResult>() {
            @Override
            public UpdateUserProfileResult call() throws Exception {
                UpdateUserProfileResult result = null;

                try {
                    result = executeUpdateUserProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
