/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <a>CreateProject</a>, which creates an empty project in AWS CodeStar with no resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteProject</a>, which deletes a project in AWS CodeStar.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeProject</a>, which lists the attributes of a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListProjects</a>, which lists all AWS CodeStar projects associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListResources</a>, which lists the resources associated with an AWS CodeStar project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateProject</a>, which updates the attributes of an AWS CodeStar project.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Teams and team members, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AssociateTeamMember</a>, which adds an IAM user to the team for an AWS CodeStar project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisassociateTeamMember</a>, which removes an IAM user from the team for an AWS CodeStar project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTeamMembers</a>, which lists all the IAM users in the team for an AWS CodeStar project, including their roles
 * and attributes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Users, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateUserProfile</a>, which creates a user profile that contains data associated with the user across all AWS
 * CodeStar projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteUserProfile</a>, which deletes all user profile information across all AWS CodeStar projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeUserProfile</a>, which describes the profile of a user.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListUserProfiles</a>, which lists all AWS CodeStar user profiles.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateUserProfile</a>, which updates the profile for an AWS CodeStar user.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.codestar;

