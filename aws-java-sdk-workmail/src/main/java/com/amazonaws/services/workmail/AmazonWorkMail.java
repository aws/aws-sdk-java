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
package com.amazonaws.services.workmail;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workmail.model.*;

/**
 * Interface for accessing Amazon WorkMail.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workmail.AbstractAmazonWorkMail} instead.
 * </p>
 * <p>
 * <p>
 * Amazon WorkMail is a secure, managed business email and calendaring service with support for existing desktop and
 * mobile email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or
 * other native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory
 * and control both the keys that encrypt your data and the location in which your data is stored.
 * </p>
 * <p>
 * The WorkMail API is designed for the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Listing and describing organizations
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing users
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing groups
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * Managing resources
 * </p>
 * </li>
 * </ul>
 * <p>
 * All WorkMail API operations are Amazon-authenticated and certificate-signed. They not only require the use of the AWS
 * SDK, but also allow for the exclusive use of AWS Identity and Access Management users and roles to help facilitate
 * access, trust, and permission policies. By creating a role and allowing an IAM user to access the WorkMail site, the
 * IAM user gains full administrative visibility into the entire WorkMail organization (or as set in the IAM policy).
 * This includes, but is not limited to, the ability to create, update, and delete users, groups, and resources. This
 * allows developers to perform the scenarios listed above, as well as give users the ability to grant access on a
 * selective basis using the IAM model.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkMail {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "workmail";

    /**
     * <p>
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @return Result of the AssociateDelegateToResource operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.AssociateDelegateToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateDelegateToResource"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateDelegateToResourceResult associateDelegateToResource(AssociateDelegateToResourceRequest associateDelegateToResourceRequest);

    /**
     * <p>
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @return Result of the AssociateMemberToGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.AssociateMemberToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateMemberToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateMemberToGroupResult associateMemberToGroup(AssociateMemberToGroupRequest associateMemberToGroupRequest);

    /**
     * <p>
     * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws MailDomainNotFoundException
     *         For an email or alias to be created in Amazon WorkMail, the included domain must be defined in the
     *         organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates a group that can be used in Amazon WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in Amazon WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws ReservedNameException
     *         This user, group, or resource name is not allowed in Amazon WorkMail.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a new Amazon WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @return Result of the CreateResource operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in Amazon WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws ReservedNameException
     *         This user, group, or resource name is not allowed in Amazon WorkMail.
     * @sample AmazonWorkMail.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateResource" target="_top">AWS API
     *      Documentation</a>
     */
    CreateResourceResult createResource(CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates a user who can be used in Amazon WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws InvalidPasswordException
     *         The supplied password doesn't match the minimum security constraints, such as length or use of special
     *         characters.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in Amazon WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws ReservedNameException
     *         This user, group, or resource name is not allowed in Amazon WorkMail.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Remove one or more specified aliases from a set of aliases for a given user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAliasResult deleteAlias(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes a group from Amazon WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @return Result of the DeleteMailboxPermissions operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DeleteMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest);

    /**
     * <p>
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return Result of the DeleteResource operation returned by the service.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteResource" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResourceResult deleteResource(DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must
     * be <code>DISABLED</code>. Use the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
     * permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and
     * schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
     * functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @return Result of the DeregisterFromWorkMail operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DeregisterFromWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterFromWorkMail"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterFromWorkMailResult deregisterFromWorkMail(DeregisterFromWorkMailRequest deregisterFromWorkMailRequest);

    /**
     * <p>
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @return Result of the DescribeGroup operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeGroupResult describeGroup(DescribeGroupRequest describeGroupRequest);

    /**
     * <p>
     * Provides more information regarding a given organization based on its identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @return Result of the DescribeOrganization operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @sample AmazonWorkMail.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeOrganizationResult describeOrganization(DescribeOrganizationRequest describeOrganizationRequest);

    /**
     * <p>
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @return Result of the DescribeResource operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeResource" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeResourceResult describeResource(DescribeResourceRequest describeResourceRequest);

    /**
     * <p>
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @return Result of the DisassociateDelegateFromResource operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.DisassociateDelegateFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateDelegateFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateDelegateFromResourceResult disassociateDelegateFromResource(DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest);

    /**
     * <p>
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @return Result of the DisassociateMemberFromGroup operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.DisassociateMemberFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateMemberFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMemberFromGroupResult disassociateMemberFromGroup(DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest);

    /**
     * <p>
     * Creates a paginated call to list the aliases associated with a given entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Returns an overview of the members of a group. Users and groups can be members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @return Result of the ListGroupMembers operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.ListGroupMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupMembersResult listGroupMembers(ListGroupMembersRequest listGroupMembersRequest);

    /**
     * <p>
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists the mailbox permissions associated with a user, group, or resource mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @return Result of the ListMailboxPermissions operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.ListMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    ListMailboxPermissionsResult listMailboxPermissions(ListMailboxPermissionsRequest listMailboxPermissionsRequest);

    /**
     * <p>
     * Returns summaries of the customer's non-deleted organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @return Result of the ListOrganizations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @sample AmazonWorkMail.ListOrganizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListOrganizations" target="_top">AWS API
     *      Documentation</a>
     */
    ListOrganizationsResult listOrganizations(ListOrganizationsRequest listOrganizationsRequest);

    /**
     * <p>
     * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
     * behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @return Result of the ListResourceDelegates operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.ListResourceDelegates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS
     *      API Documentation</a>
     */
    ListResourceDelegatesResult listResourceDelegates(ListResourceDelegatesRequest listResourceDelegatesRequest);

    /**
     * <p>
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @return Result of the PutMailboxPermissions operation returned by the service.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.PutMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMailboxPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    PutMailboxPermissionsResult putMailboxPermissions(PutMailboxPermissionsRequest putMailboxPermissionsRequest);

    /**
     * <p>
     * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and
     * calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
     * group, or resource is deleted. This operation results in the accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com//workmail/pricing">Pricing</a>. The equivalent console functionality for this
     * operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API operation or they can be synchronized from your
     * directory. For more information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @return Result of the RegisterToWorkMail operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws EntityAlreadyRegisteredException
     *         The user, group, or resource that you're trying to register is already registered.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws MailDomainNotFoundException
     *         For an email or alias to be created in Amazon WorkMail, the included domain must be defined in the
     *         organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.RegisterToWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterToWorkMail" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterToWorkMailResult registerToWorkMail(RegisterToWorkMailRequest registerToWorkMailRequest);

    /**
     * <p>
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @return Result of the ResetPassword operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws InvalidPasswordException
     *         The supplied password doesn't match the minimum security constraints, such as length or use of special
     *         characters.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.ResetPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ResetPassword" target="_top">AWS API
     *      Documentation</a>
     */
    ResetPasswordResult resetPassword(ResetPasswordRequest resetPasswordRequest);

    /**
     * <p>
     * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
     * swapped between an existing alias and the current primary email), and the email provided in the input is promoted
     * as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @return Result of the UpdatePrimaryEmailAddress operation returned by the service.
     * @throws DirectoryServiceAuthenticationFailedException
     *         The directory service doesn't recognize the credentials supplied by WorkMail.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws MailDomainNotFoundException
     *         For an email or alias to be created in Amazon WorkMail, the included domain must be defined in the
     *         organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws InvalidParameterException
     *         One or more of the input parameters don't match the service's restrictions.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @throws UnsupportedOperationException
     *         You can't perform a write operation against a read-only directory.
     * @sample AmazonWorkMail.UpdatePrimaryEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdatePrimaryEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePrimaryEmailAddressResult updatePrimaryEmailAddress(UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest);

    /**
     * <p>
     * Updates data for the resource. To have the latest information, it must be preceded by a <a>DescribeResource</a>
     * call. The dataset in the request should be the one expected when performing another <code>DescribeResource</code>
     * call.
     * </p>
     * 
     * @param updateResourceRequest
     * @return Result of the UpdateResource operation returned by the service.
     * @throws DirectoryUnavailableException
     *         The directory on which you are trying to perform operations isn't available.
     * @throws EntityNotFoundException
     *         The identifier supplied for the user, group, or resource does not exist in your organization.
     * @throws EntityStateException
     *         You are performing an operation on a user, group, or resource that isn't in the expected state, such as
     *         trying to delete an active user.
     * @throws InvalidConfigurationException
     *         The configuration for a resource isn't valid. A resource must either be able to auto-respond to requests
     *         or have at least one delegate associated that can do so on its behalf.
     * @throws EmailAddressInUseException
     *         The email address that you're trying to assign is already created for a different user, group, or
     *         resource.
     * @throws MailDomainNotFoundException
     *         For an email or alias to be created in Amazon WorkMail, the included domain must be defined in the
     *         organization.
     * @throws MailDomainStateException
     *         After a domain has been added to the organization, it must be verified. The domain is not yet verified.
     * @throws NameAvailabilityException
     *         The user, group, or resource name isn't unique in Amazon WorkMail.
     * @throws OrganizationNotFoundException
     *         An operation received a valid organization identifier that either doesn't belong or exist in the system.
     * @throws OrganizationStateException
     *         The organization must have a valid state (Active or Synchronizing) to perform certain operations on the
     *         organization or its members.
     * @sample AmazonWorkMail.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateResource" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest);

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
