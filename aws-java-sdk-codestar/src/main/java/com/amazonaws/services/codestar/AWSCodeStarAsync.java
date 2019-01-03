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

/**
 * Interface for accessing CodeStar asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codestar.AbstractAWSCodeStarAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeStarAsync extends AWSCodeStar {

    /**
     * <p>
     * Adds an IAM user to the team for an AWS CodeStar project.
     * </p>
     * 
     * @param associateTeamMemberRequest
     * @return A Java Future containing the result of the AssociateTeamMember operation returned by the service.
     * @sample AWSCodeStarAsync.AssociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/AssociateTeamMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTeamMemberResult> associateTeamMemberAsync(AssociateTeamMemberRequest associateTeamMemberRequest);

    /**
     * <p>
     * Adds an IAM user to the team for an AWS CodeStar project.
     * </p>
     * 
     * @param associateTeamMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateTeamMember operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.AssociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/AssociateTeamMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTeamMemberResult> associateTeamMemberAsync(AssociateTeamMemberRequest associateTeamMemberRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateTeamMemberRequest, AssociateTeamMemberResult> asyncHandler);

    /**
     * <p>
     * Creates a project, including project resources. This action creates a project based on a submitted project
     * request. A set of source code files and a toolchain template file can be included with the project request. If
     * these are not provided, an empty project is created.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSCodeStarAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a project, including project resources. This action creates a project based on a submitted project
     * request. A set of source code files and a toolchain template file can be included with the project request. If
     * these are not provided, an empty project is created.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Creates a profile for a user that includes user preferences, such as the display name and email address
     * assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AWSCodeStarAsync.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Creates a profile for a user that includes user preferences, such as the display name and email address
     * assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param createUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a project, including project resources. Does not delete users associated with the project, but does
     * delete the IAM roles that allowed access to the project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSCodeStarAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a project, including project resources. Does not delete users associated with the project, but does
     * delete the IAM roles that allowed access to the project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such
     * as display name and email address. It does not delete the history of that user, for example the history of
     * commits made by that user.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return A Java Future containing the result of the DeleteUserProfile operation returned by the service.
     * @sample AWSCodeStarAsync.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest);

    /**
     * <p>
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such
     * as display name and email address. It does not delete the history of that user, for example the history of
     * commits made by that user.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserProfile operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, DeleteUserProfileResult> asyncHandler);

    /**
     * <p>
     * Describes a project and its resources.
     * </p>
     * 
     * @param describeProjectRequest
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSCodeStarAsync.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Describes a project and its resources.
     * </p>
     * 
     * @param describeProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler);

    /**
     * <p>
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return A Java Future containing the result of the DescribeUserProfile operation returned by the service.
     * @sample AWSCodeStarAsync.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(DescribeUserProfileRequest describeUserProfileRequest);

    /**
     * <p>
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserProfile operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserProfileResult> describeUserProfileAsync(DescribeUserProfileRequest describeUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserProfileRequest, DescribeUserProfileResult> asyncHandler);

    /**
     * <p>
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that
     * allowed access to the project and its resources. Disassociating a team member does not remove that user's profile
     * from AWS CodeStar. It does not remove the user from IAM.
     * </p>
     * 
     * @param disassociateTeamMemberRequest
     * @return A Java Future containing the result of the DisassociateTeamMember operation returned by the service.
     * @sample AWSCodeStarAsync.DisassociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DisassociateTeamMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTeamMemberResult> disassociateTeamMemberAsync(DisassociateTeamMemberRequest disassociateTeamMemberRequest);

    /**
     * <p>
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that
     * allowed access to the project and its resources. Disassociating a team member does not remove that user's profile
     * from AWS CodeStar. It does not remove the user from IAM.
     * </p>
     * 
     * @param disassociateTeamMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateTeamMember operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.DisassociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DisassociateTeamMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTeamMemberResult> disassociateTeamMemberAsync(DisassociateTeamMemberRequest disassociateTeamMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateTeamMemberRequest, DisassociateTeamMemberResult> asyncHandler);

    /**
     * <p>
     * Lists all projects in AWS CodeStar associated with your AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSCodeStarAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists all projects in AWS CodeStar associated with your AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Lists resources associated with a project in AWS CodeStar.
     * </p>
     * 
     * @param listResourcesRequest
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSCodeStarAsync.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Lists resources associated with a project in AWS CodeStar.
     * </p>
     * 
     * @param listResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler);

    /**
     * <p>
     * Gets the tags for a project.
     * </p>
     * 
     * @param listTagsForProjectRequest
     * @return A Java Future containing the result of the ListTagsForProject operation returned by the service.
     * @sample AWSCodeStarAsync.ListTagsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTagsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForProjectResult> listTagsForProjectAsync(ListTagsForProjectRequest listTagsForProjectRequest);

    /**
     * <p>
     * Gets the tags for a project.
     * </p>
     * 
     * @param listTagsForProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForProject operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.ListTagsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTagsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForProjectResult> listTagsForProjectAsync(ListTagsForProjectRequest listTagsForProjectRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForProjectRequest, ListTagsForProjectResult> asyncHandler);

    /**
     * <p>
     * Lists all team members associated with a project.
     * </p>
     * 
     * @param listTeamMembersRequest
     * @return A Java Future containing the result of the ListTeamMembers operation returned by the service.
     * @sample AWSCodeStarAsync.ListTeamMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTeamMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTeamMembersResult> listTeamMembersAsync(ListTeamMembersRequest listTeamMembersRequest);

    /**
     * <p>
     * Lists all team members associated with a project.
     * </p>
     * 
     * @param listTeamMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTeamMembers operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.ListTeamMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTeamMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTeamMembersResult> listTeamMembersAsync(ListTeamMembersRequest listTeamMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListTeamMembersRequest, ListTeamMembersResult> asyncHandler);

    /**
     * <p>
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return A Java Future containing the result of the ListUserProfiles operation returned by the service.
     * @sample AWSCodeStarAsync.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(ListUserProfilesRequest listUserProfilesRequest);

    /**
     * <p>
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserProfiles operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserProfilesResult> listUserProfilesAsync(ListUserProfilesRequest listUserProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserProfilesRequest, ListUserProfilesResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a project.
     * </p>
     * 
     * @param tagProjectRequest
     * @return A Java Future containing the result of the TagProject operation returned by the service.
     * @sample AWSCodeStarAsync.TagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/TagProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagProjectResult> tagProjectAsync(TagProjectRequest tagProjectRequest);

    /**
     * <p>
     * Adds tags to a project.
     * </p>
     * 
     * @param tagProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagProject operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.TagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/TagProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagProjectResult> tagProjectAsync(TagProjectRequest tagProjectRequest,
            com.amazonaws.handlers.AsyncHandler<TagProjectRequest, TagProjectResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a project.
     * </p>
     * 
     * @param untagProjectRequest
     * @return A Java Future containing the result of the UntagProject operation returned by the service.
     * @sample AWSCodeStarAsync.UntagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UntagProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagProjectResult> untagProjectAsync(UntagProjectRequest untagProjectRequest);

    /**
     * <p>
     * Removes tags from a project.
     * </p>
     * 
     * @param untagProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagProject operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.UntagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UntagProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagProjectResult> untagProjectAsync(UntagProjectRequest untagProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UntagProjectRequest, UntagProjectResult> asyncHandler);

    /**
     * <p>
     * Updates a project in AWS CodeStar.
     * </p>
     * 
     * @param updateProjectRequest
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSCodeStarAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Updates a project in AWS CodeStar.
     * </p>
     * 
     * @param updateProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

    /**
     * <p>
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role
     * in the project, or change whether they have remote access to project resources.
     * </p>
     * 
     * @param updateTeamMemberRequest
     * @return A Java Future containing the result of the UpdateTeamMember operation returned by the service.
     * @sample AWSCodeStarAsync.UpdateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateTeamMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTeamMemberResult> updateTeamMemberAsync(UpdateTeamMemberRequest updateTeamMemberRequest);

    /**
     * <p>
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role
     * in the project, or change whether they have remote access to project resources.
     * </p>
     * 
     * @param updateTeamMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTeamMember operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.UpdateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateTeamMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTeamMemberResult> updateTeamMemberAsync(UpdateTeamMemberRequest updateTeamMemberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTeamMemberRequest, UpdateTeamMemberResult> asyncHandler);

    /**
     * <p>
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AWSCodeStarAsync.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest);

    /**
     * <p>
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AWSCodeStarAsyncHandler.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler);

}
