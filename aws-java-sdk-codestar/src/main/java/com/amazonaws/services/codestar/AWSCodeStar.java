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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codestar.model.*;

/**
 * Interface for accessing CodeStar.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codestar.AbstractAWSCodeStar} instead.
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
public interface AWSCodeStar {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codestar";

    /**
     * <p>
     * Adds an IAM user to the team for an AWS CodeStar project.
     * </p>
     * 
     * @param associateTeamMemberRequest
     * @return Result of the AssociateTeamMember operation returned by the service.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws TeamMemberAlreadyAssociatedException
     *         The team member is already associated with a role in this project.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.AssociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/AssociateTeamMember" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateTeamMemberResult associateTeamMember(AssociateTeamMemberRequest associateTeamMemberRequest);

    /**
     * <p>
     * Creates a project, including project resources. This action creates a project based on a submitted project
     * request. A set of source code files and a toolchain template file can be included with the project request. If
     * these are not provided, an empty project is created.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws ProjectAlreadyExistsException
     *         An AWS CodeStar project with the same ID already exists in this region for the AWS account. AWS CodeStar
     *         project IDs must be unique within a region for the AWS account.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws ProjectCreationFailedException
     *         The project creation request was valid, but a nonspecific exception or error occurred during project
     *         creation. The project could not be created in AWS CodeStar.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a profile for a user that includes user preferences, such as the display name and email address
     * assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws UserProfileAlreadyExistsException
     *         A user profile with that name already exists in this region for the AWS account. AWS CodeStar user
     *         profile names must be unique within a region for the AWS account.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Deletes a project, including project resources. Does not delete users associated with the project, but does
     * delete the IAM roles that allowed access to the project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @sample AWSCodeStar.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such
     * as display name and email address. It does not delete the history of that user, for example the history of
     * commits made by that user.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return Result of the DeleteUserProfile operation returned by the service.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserProfileResult deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest);

    /**
     * <p>
     * Describes a project and its resources.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return Result of the DescribeUserProfile operation returned by the service.
     * @throws UserProfileNotFoundException
     *         The user profile was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeUserProfileResult describeUserProfile(DescribeUserProfileRequest describeUserProfileRequest);

    /**
     * <p>
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that
     * allowed access to the project and its resources. Disassociating a team member does not remove that user's profile
     * from AWS CodeStar. It does not remove the user from IAM.
     * </p>
     * 
     * @param disassociateTeamMemberRequest
     * @return Result of the DisassociateTeamMember operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.DisassociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DisassociateTeamMember"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTeamMemberResult disassociateTeamMember(DisassociateTeamMemberRequest disassociateTeamMemberRequest);

    /**
     * <p>
     * Lists all projects in AWS CodeStar associated with your AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists resources associated with a project in AWS CodeStar.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Gets the tags for a project.
     * </p>
     * 
     * @param listTagsForProjectRequest
     * @return Result of the ListTagsForProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @sample AWSCodeStar.ListTagsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTagsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForProjectResult listTagsForProject(ListTagsForProjectRequest listTagsForProjectRequest);

    /**
     * <p>
     * Lists all team members associated with a project.
     * </p>
     * 
     * @param listTeamMembersRequest
     * @return Result of the ListTeamMembers operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListTeamMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTeamMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListTeamMembersResult listTeamMembers(ListTeamMembersRequest listTeamMembersRequest);

    /**
     * <p>
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return Result of the ListUserProfiles operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListUserProfilesResult listUserProfiles(ListUserProfilesRequest listUserProfilesRequest);

    /**
     * <p>
     * Adds tags to a project.
     * </p>
     * 
     * @param tagProjectRequest
     * @return Result of the TagProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.TagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/TagProject" target="_top">AWS API
     *      Documentation</a>
     */
    TagProjectResult tagProject(TagProjectRequest tagProjectRequest);

    /**
     * <p>
     * Removes tags from a project.
     * </p>
     * 
     * @param untagProjectRequest
     * @return Result of the UntagProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.UntagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UntagProject" target="_top">AWS API
     *      Documentation</a>
     */
    UntagProjectResult untagProject(UntagProjectRequest untagProjectRequest);

    /**
     * <p>
     * Updates a project in AWS CodeStar.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role
     * in the project, or change whether they have remote access to project resources.
     * </p>
     * 
     * @param updateTeamMemberRequest
     * @return Result of the UpdateTeamMember operation returned by the service.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @throws TeamMemberNotFoundException
     *         The specified team member was not found.
     * @sample AWSCodeStar.UpdateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateTeamMember" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTeamMemberResult updateTeamMember(UpdateTeamMemberRequest updateTeamMemberRequest);

    /**
     * <p>
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws UserProfileNotFoundException
     *         The user profile was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
