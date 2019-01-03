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

/**
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
package com.amazonaws.services.codestar;

