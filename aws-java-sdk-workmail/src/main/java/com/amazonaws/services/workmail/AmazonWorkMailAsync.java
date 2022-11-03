/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.workmail.model.*;

/**
 * Interface for accessing Amazon WorkMail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workmail.AbstractAmazonWorkMailAsync} instead.
 * </p>
 * <p>
 * <p>
 * WorkMail is a secure, managed business email and calendaring service with support for existing desktop and mobile
 * email clients. You can access your email, contacts, and calendars using Microsoft Outlook, your browser, or other
 * native iOS and Android email applications. You can integrate WorkMail with your existing corporate directory and
 * control both the keys that encrypt your data and the location in which your data is stored.
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
public interface AmazonWorkMailAsync extends AmazonWorkMail {

    /**
     * <p>
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @return A Java Future containing the result of the AssociateDelegateToResource operation returned by the service.
     * @sample AmazonWorkMailAsync.AssociateDelegateToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateDelegateToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDelegateToResourceResult> associateDelegateToResourceAsync(
            AssociateDelegateToResourceRequest associateDelegateToResourceRequest);

    /**
     * <p>
     * Adds a member (user or group) to the resource's set of delegates.
     * </p>
     * 
     * @param associateDelegateToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDelegateToResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.AssociateDelegateToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateDelegateToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDelegateToResourceResult> associateDelegateToResourceAsync(
            AssociateDelegateToResourceRequest associateDelegateToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDelegateToResourceRequest, AssociateDelegateToResourceResult> asyncHandler);

    /**
     * <p>
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @return A Java Future containing the result of the AssociateMemberToGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.AssociateMemberToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateMemberToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToGroupResult> associateMemberToGroupAsync(AssociateMemberToGroupRequest associateMemberToGroupRequest);

    /**
     * <p>
     * Adds a member (user or group) to the group's set.
     * </p>
     * 
     * @param associateMemberToGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMemberToGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.AssociateMemberToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateMemberToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToGroupResult> associateMemberToGroupAsync(AssociateMemberToGroupRequest associateMemberToGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberToGroupRequest, AssociateMemberToGroupResult> asyncHandler);

    /**
     * <p>
     * Assumes an impersonation role for the given WorkMail organization. This method returns an authentication token
     * you can use to make impersonated calls.
     * </p>
     * 
     * @param assumeImpersonationRoleRequest
     * @return A Java Future containing the result of the AssumeImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsync.AssumeImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssumeImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeImpersonationRoleResult> assumeImpersonationRoleAsync(AssumeImpersonationRoleRequest assumeImpersonationRoleRequest);

    /**
     * <p>
     * Assumes an impersonation role for the given WorkMail organization. This method returns an authentication token
     * you can use to make impersonated calls.
     * </p>
     * 
     * @param assumeImpersonationRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssumeImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.AssumeImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssumeImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeImpersonationRoleResult> assumeImpersonationRoleAsync(AssumeImpersonationRoleRequest assumeImpersonationRoleRequest,
            com.amazonaws.handlers.AsyncHandler<AssumeImpersonationRoleRequest, AssumeImpersonationRoleResult> asyncHandler);

    /**
     * <p>
     * Cancels a mailbox export job.
     * </p>
     * <note>
     * <p>
     * If the mailbox export job is near completion, it might not be possible to cancel it.
     * </p>
     * </note>
     * 
     * @param cancelMailboxExportJobRequest
     * @return A Java Future containing the result of the CancelMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsync.CancelMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CancelMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMailboxExportJobResult> cancelMailboxExportJobAsync(CancelMailboxExportJobRequest cancelMailboxExportJobRequest);

    /**
     * <p>
     * Cancels a mailbox export job.
     * </p>
     * <note>
     * <p>
     * If the mailbox export job is near completion, it might not be possible to cancel it.
     * </p>
     * </note>
     * 
     * @param cancelMailboxExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CancelMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CancelMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMailboxExportJobResult> cancelMailboxExportJobAsync(CancelMailboxExportJobRequest cancelMailboxExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMailboxExportJobRequest, CancelMailboxExportJobResult> asyncHandler);

    /**
     * <p>
     * Adds an alias to the set of a given member (user or group) of WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Adds an alias to the set of a given member (user or group) of WorkMail.
     * </p>
     * 
     * @param createAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates an <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param createAvailabilityConfigurationRequest
     * @return A Java Future containing the result of the CreateAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.CreateAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAvailabilityConfigurationResult> createAvailabilityConfigurationAsync(
            CreateAvailabilityConfigurationRequest createAvailabilityConfigurationRequest);

    /**
     * <p>
     * Creates an <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param createAvailabilityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.CreateAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAvailabilityConfigurationResult> createAvailabilityConfigurationAsync(
            CreateAvailabilityConfigurationRequest createAvailabilityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAvailabilityConfigurationRequest, CreateAvailabilityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a group that can be used in WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a group that can be used in WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Creates an impersonation role for the given WorkMail organization.
     * </p>
     * <p>
     * <i>Idempotency</i> ensures that an API request completes no more than one time. With an idempotent request, if
     * the original request completes successfully, any subsequent retries also complete successfully without performing
     * any further actions.
     * </p>
     * 
     * @param createImpersonationRoleRequest
     * @return A Java Future containing the result of the CreateImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateImpersonationRoleResult> createImpersonationRoleAsync(CreateImpersonationRoleRequest createImpersonationRoleRequest);

    /**
     * <p>
     * Creates an impersonation role for the given WorkMail organization.
     * </p>
     * <p>
     * <i>Idempotency</i> ensures that an API request completes no more than one time. With an idempotent request, if
     * the original request completes successfully, any subsequent retries also complete successfully without performing
     * any further actions.
     * </p>
     * 
     * @param createImpersonationRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateImpersonationRoleResult> createImpersonationRoleAsync(CreateImpersonationRoleRequest createImpersonationRoleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImpersonationRoleRequest, CreateImpersonationRoleResult> asyncHandler);

    /**
     * <p>
     * Creates a new mobile device access rule for the specified WorkMail organization.
     * </p>
     * 
     * @param createMobileDeviceAccessRuleRequest
     * @return A Java Future containing the result of the CreateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.CreateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMobileDeviceAccessRuleResult> createMobileDeviceAccessRuleAsync(
            CreateMobileDeviceAccessRuleRequest createMobileDeviceAccessRuleRequest);

    /**
     * <p>
     * Creates a new mobile device access rule for the specified WorkMail organization.
     * </p>
     * 
     * @param createMobileDeviceAccessRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.CreateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMobileDeviceAccessRuleResult> createMobileDeviceAccessRuleAsync(
            CreateMobileDeviceAccessRuleRequest createMobileDeviceAccessRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMobileDeviceAccessRuleRequest, CreateMobileDeviceAccessRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a new WorkMail organization. Optionally, you can choose to associate an existing AWS Directory Service
     * directory with your organization. If an AWS Directory Service directory ID is specified, the organization alias
     * must match the directory alias. If you choose not to associate an existing directory with your organization, then
     * we create a new WorkMail directory for you. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_new_organization.html">Adding an
     * organization</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * You can associate multiple email domains with an organization, then choose your default email domain from the
     * WorkMail console. You can also associate a domain that is managed in an Amazon Route 53 public hosted zone. For
     * more information, see <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_domain.html">Adding a
     * domain</a> and <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/default_domain.html">Choosing the
     * default domain</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * Optionally, you can use a customer managed key from AWS Key Management Service (AWS KMS) to encrypt email for
     * your organization. If you don't associate an AWS KMS key, WorkMail creates a default, AWS managed key for you.
     * </p>
     * 
     * @param createOrganizationRequest
     * @return A Java Future containing the result of the CreateOrganization operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest createOrganizationRequest);

    /**
     * <p>
     * Creates a new WorkMail organization. Optionally, you can choose to associate an existing AWS Directory Service
     * directory with your organization. If an AWS Directory Service directory ID is specified, the organization alias
     * must match the directory alias. If you choose not to associate an existing directory with your organization, then
     * we create a new WorkMail directory for you. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_new_organization.html">Adding an
     * organization</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * You can associate multiple email domains with an organization, then choose your default email domain from the
     * WorkMail console. You can also associate a domain that is managed in an Amazon Route 53 public hosted zone. For
     * more information, see <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_domain.html">Adding a
     * domain</a> and <a href="https://docs.aws.amazon.com/workmail/latest/adminguide/default_domain.html">Choosing the
     * default domain</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * <p>
     * Optionally, you can use a customer managed key from AWS Key Management Service (AWS KMS) to encrypt email for
     * your organization. If you don't associate an AWS KMS key, WorkMail creates a default, AWS managed key for you.
     * </p>
     * 
     * @param createOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOrganization operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest createOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrganizationRequest, CreateOrganizationResult> asyncHandler);

    /**
     * <p>
     * Creates a new WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates a new WorkMail resource.
     * </p>
     * 
     * @param createResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a user who can be used in WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonWorkMailAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a user who can be used in WorkMail by calling the <a>RegisterToWorkMail</a> operation.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an access control rule for the specified WorkMail organization.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back
     * an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteAccessControlRuleRequest
     * @return A Java Future containing the result of the DeleteAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAccessControlRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessControlRuleResult> deleteAccessControlRuleAsync(DeleteAccessControlRuleRequest deleteAccessControlRuleRequest);

    /**
     * <p>
     * Deletes an access control rule for the specified WorkMail organization.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back
     * an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteAccessControlRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAccessControlRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessControlRuleResult> deleteAccessControlRuleAsync(DeleteAccessControlRuleRequest deleteAccessControlRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessControlRuleRequest, DeleteAccessControlRuleResult> asyncHandler);

    /**
     * <p>
     * Remove one or more specified aliases from a set of aliases for a given user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Remove one or more specified aliases from a set of aliases for a given user.
     * </p>
     * 
     * @param deleteAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes the <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param deleteAvailabilityConfigurationRequest
     * @return A Java Future containing the result of the DeleteAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DeleteAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAvailabilityConfigurationResult> deleteAvailabilityConfigurationAsync(
            DeleteAvailabilityConfigurationRequest deleteAvailabilityConfigurationRequest);

    /**
     * <p>
     * Deletes the <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param deleteAvailabilityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DeleteAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAvailabilityConfigurationResult> deleteAvailabilityConfigurationAsync(
            DeleteAvailabilityConfigurationRequest deleteAvailabilityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAvailabilityConfigurationRequest, DeleteAvailabilityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param deleteEmailMonitoringConfigurationRequest
     * @return A Java Future containing the result of the DeleteEmailMonitoringConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DeleteEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailMonitoringConfigurationResult> deleteEmailMonitoringConfigurationAsync(
            DeleteEmailMonitoringConfigurationRequest deleteEmailMonitoringConfigurationRequest);

    /**
     * <p>
     * Deletes the email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param deleteEmailMonitoringConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEmailMonitoringConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DeleteEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailMonitoringConfigurationResult> deleteEmailMonitoringConfigurationAsync(
            DeleteEmailMonitoringConfigurationRequest deleteEmailMonitoringConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEmailMonitoringConfigurationRequest, DeleteEmailMonitoringConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a group from WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a group from WorkMail.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an impersonation role for the given WorkMail organization.
     * </p>
     * 
     * @param deleteImpersonationRoleRequest
     * @return A Java Future containing the result of the DeleteImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImpersonationRoleResult> deleteImpersonationRoleAsync(DeleteImpersonationRoleRequest deleteImpersonationRoleRequest);

    /**
     * <p>
     * Deletes an impersonation role for the given WorkMail organization.
     * </p>
     * 
     * @param deleteImpersonationRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImpersonationRoleResult> deleteImpersonationRoleAsync(DeleteImpersonationRoleRequest deleteImpersonationRoleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImpersonationRoleRequest, DeleteImpersonationRoleResult> asyncHandler);

    /**
     * <p>
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @return A Java Future containing the result of the DeleteMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMailboxPermissionsResult> deleteMailboxPermissionsAsync(DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest);

    /**
     * <p>
     * Deletes permissions granted to a member (user or group).
     * </p>
     * 
     * @param deleteMailboxPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMailboxPermissionsResult> deleteMailboxPermissionsAsync(DeleteMailboxPermissionsRequest deleteMailboxPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMailboxPermissionsRequest, DeleteMailboxPermissionsResult> asyncHandler);

    /**
     * <p>
     * Deletes the mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing overrides does not produce an error. In those cases, the service sends
     * back an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteMobileDeviceAccessOverrideRequest
     * @return A Java Future containing the result of the DeleteMobileDeviceAccessOverride operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DeleteMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMobileDeviceAccessOverrideResult> deleteMobileDeviceAccessOverrideAsync(
            DeleteMobileDeviceAccessOverrideRequest deleteMobileDeviceAccessOverrideRequest);

    /**
     * <p>
     * Deletes the mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing overrides does not produce an error. In those cases, the service sends
     * back an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteMobileDeviceAccessOverrideRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMobileDeviceAccessOverride operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DeleteMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMobileDeviceAccessOverrideResult> deleteMobileDeviceAccessOverrideAsync(
            DeleteMobileDeviceAccessOverrideRequest deleteMobileDeviceAccessOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMobileDeviceAccessOverrideRequest, DeleteMobileDeviceAccessOverrideResult> asyncHandler);

    /**
     * <p>
     * Deletes a mobile device access rule for the specified WorkMail organization.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back
     * an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteMobileDeviceAccessRuleRequest
     * @return A Java Future containing the result of the DeleteMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DeleteMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMobileDeviceAccessRuleResult> deleteMobileDeviceAccessRuleAsync(
            DeleteMobileDeviceAccessRuleRequest deleteMobileDeviceAccessRuleRequest);

    /**
     * <p>
     * Deletes a mobile device access rule for the specified WorkMail organization.
     * </p>
     * <note>
     * <p>
     * Deleting already deleted and non-existing rules does not produce an error. In those cases, the service sends back
     * an HTTP 200 response with an empty HTTP body.
     * </p>
     * </note>
     * 
     * @param deleteMobileDeviceAccessRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DeleteMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMobileDeviceAccessRuleResult> deleteMobileDeviceAccessRuleAsync(
            DeleteMobileDeviceAccessRuleRequest deleteMobileDeviceAccessRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMobileDeviceAccessRuleRequest, DeleteMobileDeviceAccessRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes an WorkMail organization and all underlying AWS resources managed by WorkMail as part of the
     * organization. You can choose whether to delete the associated directory. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/remove_organization.html">Removing an
     * organization</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @return A Java Future containing the result of the DeleteOrganization operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest deleteOrganizationRequest);

    /**
     * <p>
     * Deletes an WorkMail organization and all underlying AWS resources managed by WorkMail as part of the
     * organization. You can choose whether to delete the associated directory. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/remove_organization.html">Removing an
     * organization</a> in the <i>WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param deleteOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOrganization operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest deleteOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOrganizationRequest, DeleteOrganizationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes the specified resource.
     * </p>
     * 
     * @param deleteResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified retention policy from the specified organization.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest);

    /**
     * <p>
     * Deletes the specified retention policy from the specified organization.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, DeleteRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a user from WorkMail and all subsequent systems. Before you can delete a user, the user state must be
     * <code>DISABLED</code>. Use the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
     * permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonWorkMailAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user from WorkMail and all subsequent systems. Before you can delete a user, the user state must be
     * <code>DISABLED</code>. Use the <a>DescribeUser</a> action to confirm the user state.
     * </p>
     * <p>
     * Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are
     * permanently removed.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Mark a user, group, or resource as no longer used in WorkMail. This action disassociates the mailbox and
     * schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
     * functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @return A Java Future containing the result of the DeregisterFromWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsync.DeregisterFromWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterFromWorkMail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterFromWorkMailResult> deregisterFromWorkMailAsync(DeregisterFromWorkMailRequest deregisterFromWorkMailRequest);

    /**
     * <p>
     * Mark a user, group, or resource as no longer used in WorkMail. This action disassociates the mailbox and
     * schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The
     * functionality in the console is <i>Disable</i>.
     * </p>
     * 
     * @param deregisterFromWorkMailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterFromWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeregisterFromWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterFromWorkMail"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterFromWorkMailResult> deregisterFromWorkMailAsync(DeregisterFromWorkMailRequest deregisterFromWorkMailRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterFromWorkMailRequest, DeregisterFromWorkMailResult> asyncHandler);

    /**
     * <p>
     * Removes a domain from WorkMail, stops email routing to WorkMail, and removes the authorization allowing WorkMail
     * use. SES keeps the domain because other applications may use it. You must first remove any email address used by
     * WorkMail entities before you remove the domain.
     * </p>
     * 
     * @param deregisterMailDomainRequest
     * @return A Java Future containing the result of the DeregisterMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsync.DeregisterMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterMailDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterMailDomainResult> deregisterMailDomainAsync(DeregisterMailDomainRequest deregisterMailDomainRequest);

    /**
     * <p>
     * Removes a domain from WorkMail, stops email routing to WorkMail, and removes the authorization allowing WorkMail
     * use. SES keeps the domain because other applications may use it. You must first remove any email address used by
     * WorkMail entities before you remove the domain.
     * </p>
     * 
     * @param deregisterMailDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DeregisterMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeregisterMailDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterMailDomainResult> deregisterMailDomainAsync(DeregisterMailDomainRequest deregisterMailDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterMailDomainRequest, DeregisterMailDomainResult> asyncHandler);

    /**
     * <p>
     * Describes the current email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param describeEmailMonitoringConfigurationRequest
     * @return A Java Future containing the result of the DescribeEmailMonitoringConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DescribeEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEmailMonitoringConfigurationResult> describeEmailMonitoringConfigurationAsync(
            DescribeEmailMonitoringConfigurationRequest describeEmailMonitoringConfigurationRequest);

    /**
     * <p>
     * Describes the current email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param describeEmailMonitoringConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEmailMonitoringConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DescribeEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEmailMonitoringConfigurationResult> describeEmailMonitoringConfigurationAsync(
            DescribeEmailMonitoringConfigurationRequest describeEmailMonitoringConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEmailMonitoringConfigurationRequest, DescribeEmailMonitoringConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest);

    /**
     * <p>
     * Returns the data available for the group.
     * </p>
     * 
     * @param describeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler);

    /**
     * <p>
     * Lists the settings in a DMARC policy for a specified organization.
     * </p>
     * 
     * @param describeInboundDmarcSettingsRequest
     * @return A Java Future containing the result of the DescribeInboundDmarcSettings operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DescribeInboundDmarcSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeInboundDmarcSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInboundDmarcSettingsResult> describeInboundDmarcSettingsAsync(
            DescribeInboundDmarcSettingsRequest describeInboundDmarcSettingsRequest);

    /**
     * <p>
     * Lists the settings in a DMARC policy for a specified organization.
     * </p>
     * 
     * @param describeInboundDmarcSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInboundDmarcSettings operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DescribeInboundDmarcSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeInboundDmarcSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInboundDmarcSettingsResult> describeInboundDmarcSettingsAsync(
            DescribeInboundDmarcSettingsRequest describeInboundDmarcSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInboundDmarcSettingsRequest, DescribeInboundDmarcSettingsResult> asyncHandler);

    /**
     * <p>
     * Describes the current status of a mailbox export job.
     * </p>
     * 
     * @param describeMailboxExportJobRequest
     * @return A Java Future containing the result of the DescribeMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMailboxExportJobResult> describeMailboxExportJobAsync(DescribeMailboxExportJobRequest describeMailboxExportJobRequest);

    /**
     * <p>
     * Describes the current status of a mailbox export job.
     * </p>
     * 
     * @param describeMailboxExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeMailboxExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMailboxExportJobResult> describeMailboxExportJobAsync(DescribeMailboxExportJobRequest describeMailboxExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMailboxExportJobRequest, DescribeMailboxExportJobResult> asyncHandler);

    /**
     * <p>
     * Provides more information regarding a given organization based on its identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @return A Java Future containing the result of the DescribeOrganization operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest describeOrganizationRequest);

    /**
     * <p>
     * Provides more information regarding a given organization based on its identifier.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganization operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeOrganization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest describeOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationRequest, DescribeOrganizationResult> asyncHandler);

    /**
     * <p>
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest);

    /**
     * <p>
     * Returns the data available for the resource.
     * </p>
     * 
     * @param describeResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler);

    /**
     * <p>
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonWorkMailAsync.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Provides information regarding the user.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler);

    /**
     * <p>
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @return A Java Future containing the result of the DisassociateDelegateFromResource operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.DisassociateDelegateFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateDelegateFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDelegateFromResourceResult> disassociateDelegateFromResourceAsync(
            DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest);

    /**
     * <p>
     * Removes a member from the resource's set of delegates.
     * </p>
     * 
     * @param disassociateDelegateFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDelegateFromResource operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.DisassociateDelegateFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateDelegateFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDelegateFromResourceResult> disassociateDelegateFromResourceAsync(
            DisassociateDelegateFromResourceRequest disassociateDelegateFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDelegateFromResourceRequest, DisassociateDelegateFromResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @return A Java Future containing the result of the DisassociateMemberFromGroup operation returned by the service.
     * @sample AmazonWorkMailAsync.DisassociateMemberFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateMemberFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromGroupResult> disassociateMemberFromGroupAsync(
            DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest);

    /**
     * <p>
     * Removes a member from a group.
     * </p>
     * 
     * @param disassociateMemberFromGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMemberFromGroup operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.DisassociateMemberFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DisassociateMemberFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromGroupResult> disassociateMemberFromGroupAsync(
            DisassociateMemberFromGroupRequest disassociateMemberFromGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromGroupRequest, DisassociateMemberFromGroupResult> asyncHandler);

    /**
     * <p>
     * Gets the effects of an organization's access control rules as they apply to a specified IPv4 address, access
     * protocol action, and user ID or impersonation role ID. You must provide either the user ID or impersonation role
     * ID. Impersonation role ID can only be used with Action EWS.
     * </p>
     * 
     * @param getAccessControlEffectRequest
     * @return A Java Future containing the result of the GetAccessControlEffect operation returned by the service.
     * @sample AmazonWorkMailAsync.GetAccessControlEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetAccessControlEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessControlEffectResult> getAccessControlEffectAsync(GetAccessControlEffectRequest getAccessControlEffectRequest);

    /**
     * <p>
     * Gets the effects of an organization's access control rules as they apply to a specified IPv4 address, access
     * protocol action, and user ID or impersonation role ID. You must provide either the user ID or impersonation role
     * ID. Impersonation role ID can only be used with Action EWS.
     * </p>
     * 
     * @param getAccessControlEffectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessControlEffect operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetAccessControlEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetAccessControlEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessControlEffectResult> getAccessControlEffectAsync(GetAccessControlEffectRequest getAccessControlEffectRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessControlEffectRequest, GetAccessControlEffectResult> asyncHandler);

    /**
     * <p>
     * Gets the default retention policy details for the specified organization.
     * </p>
     * 
     * @param getDefaultRetentionPolicyRequest
     * @return A Java Future containing the result of the GetDefaultRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsync.GetDefaultRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetDefaultRetentionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultRetentionPolicyResult> getDefaultRetentionPolicyAsync(
            GetDefaultRetentionPolicyRequest getDefaultRetentionPolicyRequest);

    /**
     * <p>
     * Gets the default retention policy details for the specified organization.
     * </p>
     * 
     * @param getDefaultRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDefaultRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetDefaultRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetDefaultRetentionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultRetentionPolicyResult> getDefaultRetentionPolicyAsync(
            GetDefaultRetentionPolicyRequest getDefaultRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetDefaultRetentionPolicyRequest, GetDefaultRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets the impersonation role details for the given WorkMail organization.
     * </p>
     * 
     * @param getImpersonationRoleRequest
     * @return A Java Future containing the result of the GetImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsync.GetImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImpersonationRoleResult> getImpersonationRoleAsync(GetImpersonationRoleRequest getImpersonationRoleRequest);

    /**
     * <p>
     * Gets the impersonation role details for the given WorkMail organization.
     * </p>
     * 
     * @param getImpersonationRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRole" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImpersonationRoleResult> getImpersonationRoleAsync(GetImpersonationRoleRequest getImpersonationRoleRequest,
            com.amazonaws.handlers.AsyncHandler<GetImpersonationRoleRequest, GetImpersonationRoleResult> asyncHandler);

    /**
     * <p>
     * Tests whether the given impersonation role can impersonate a target user.
     * </p>
     * 
     * @param getImpersonationRoleEffectRequest
     * @return A Java Future containing the result of the GetImpersonationRoleEffect operation returned by the service.
     * @sample AmazonWorkMailAsync.GetImpersonationRoleEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRoleEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImpersonationRoleEffectResult> getImpersonationRoleEffectAsync(
            GetImpersonationRoleEffectRequest getImpersonationRoleEffectRequest);

    /**
     * <p>
     * Tests whether the given impersonation role can impersonate a target user.
     * </p>
     * 
     * @param getImpersonationRoleEffectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImpersonationRoleEffect operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetImpersonationRoleEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetImpersonationRoleEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImpersonationRoleEffectResult> getImpersonationRoleEffectAsync(
            GetImpersonationRoleEffectRequest getImpersonationRoleEffectRequest,
            com.amazonaws.handlers.AsyncHandler<GetImpersonationRoleEffectRequest, GetImpersonationRoleEffectResult> asyncHandler);

    /**
     * <p>
     * Gets details for a mail domain, including domain records required to configure your domain with recommended
     * security.
     * </p>
     * 
     * @param getMailDomainRequest
     * @return A Java Future containing the result of the GetMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsync.GetMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMailDomainResult> getMailDomainAsync(GetMailDomainRequest getMailDomainRequest);

    /**
     * <p>
     * Gets details for a mail domain, including domain records required to configure your domain with recommended
     * security.
     * </p>
     * 
     * @param getMailDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMailDomainResult> getMailDomainAsync(GetMailDomainRequest getMailDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetMailDomainRequest, GetMailDomainResult> asyncHandler);

    /**
     * <p>
     * Requests a user's mailbox details for a specified organization and user.
     * </p>
     * 
     * @param getMailboxDetailsRequest
     * @return A Java Future containing the result of the GetMailboxDetails operation returned by the service.
     * @sample AmazonWorkMailAsync.GetMailboxDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailboxDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMailboxDetailsResult> getMailboxDetailsAsync(GetMailboxDetailsRequest getMailboxDetailsRequest);

    /**
     * <p>
     * Requests a user's mailbox details for a specified organization and user.
     * </p>
     * 
     * @param getMailboxDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMailboxDetails operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetMailboxDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailboxDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMailboxDetailsResult> getMailboxDetailsAsync(GetMailboxDetailsRequest getMailboxDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMailboxDetailsRequest, GetMailboxDetailsResult> asyncHandler);

    /**
     * <p>
     * Simulates the effect of the mobile device access rules for the given attributes of a sample access event. Use
     * this method to test the effects of the current set of mobile device access rules for the WorkMail organization
     * for a particular user's attributes.
     * </p>
     * 
     * @param getMobileDeviceAccessEffectRequest
     * @return A Java Future containing the result of the GetMobileDeviceAccessEffect operation returned by the service.
     * @sample AmazonWorkMailAsync.GetMobileDeviceAccessEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMobileDeviceAccessEffectResult> getMobileDeviceAccessEffectAsync(
            GetMobileDeviceAccessEffectRequest getMobileDeviceAccessEffectRequest);

    /**
     * <p>
     * Simulates the effect of the mobile device access rules for the given attributes of a sample access event. Use
     * this method to test the effects of the current set of mobile device access rules for the WorkMail organization
     * for a particular user's attributes.
     * </p>
     * 
     * @param getMobileDeviceAccessEffectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMobileDeviceAccessEffect operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.GetMobileDeviceAccessEffect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessEffect"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMobileDeviceAccessEffectResult> getMobileDeviceAccessEffectAsync(
            GetMobileDeviceAccessEffectRequest getMobileDeviceAccessEffectRequest,
            com.amazonaws.handlers.AsyncHandler<GetMobileDeviceAccessEffectRequest, GetMobileDeviceAccessEffectResult> asyncHandler);

    /**
     * <p>
     * Gets the mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * 
     * @param getMobileDeviceAccessOverrideRequest
     * @return A Java Future containing the result of the GetMobileDeviceAccessOverride operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.GetMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMobileDeviceAccessOverrideResult> getMobileDeviceAccessOverrideAsync(
            GetMobileDeviceAccessOverrideRequest getMobileDeviceAccessOverrideRequest);

    /**
     * <p>
     * Gets the mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * 
     * @param getMobileDeviceAccessOverrideRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMobileDeviceAccessOverride operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.GetMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMobileDeviceAccessOverrideResult> getMobileDeviceAccessOverrideAsync(
            GetMobileDeviceAccessOverrideRequest getMobileDeviceAccessOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<GetMobileDeviceAccessOverrideRequest, GetMobileDeviceAccessOverrideResult> asyncHandler);

    /**
     * <p>
     * Lists the access control rules for the specified organization.
     * </p>
     * 
     * @param listAccessControlRulesRequest
     * @return A Java Future containing the result of the ListAccessControlRules operation returned by the service.
     * @sample AmazonWorkMailAsync.ListAccessControlRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAccessControlRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessControlRulesResult> listAccessControlRulesAsync(ListAccessControlRulesRequest listAccessControlRulesRequest);

    /**
     * <p>
     * Lists the access control rules for the specified organization.
     * </p>
     * 
     * @param listAccessControlRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessControlRules operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListAccessControlRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAccessControlRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessControlRulesResult> listAccessControlRulesAsync(ListAccessControlRulesRequest listAccessControlRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessControlRulesRequest, ListAccessControlRulesResult> asyncHandler);

    /**
     * <p>
     * Creates a paginated call to list the aliases associated with a given entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonWorkMailAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Creates a paginated call to list the aliases associated with a given entity.
     * </p>
     * 
     * @param listAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * List all the <code>AvailabilityConfiguration</code>'s for the given WorkMail organization.
     * </p>
     * 
     * @param listAvailabilityConfigurationsRequest
     * @return A Java Future containing the result of the ListAvailabilityConfigurations operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.ListAvailabilityConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAvailabilityConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailabilityConfigurationsResult> listAvailabilityConfigurationsAsync(
            ListAvailabilityConfigurationsRequest listAvailabilityConfigurationsRequest);

    /**
     * <p>
     * List all the <code>AvailabilityConfiguration</code>'s for the given WorkMail organization.
     * </p>
     * 
     * @param listAvailabilityConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailabilityConfigurations operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.ListAvailabilityConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAvailabilityConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailabilityConfigurationsResult> listAvailabilityConfigurationsAsync(
            ListAvailabilityConfigurationsRequest listAvailabilityConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailabilityConfigurationsRequest, ListAvailabilityConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns an overview of the members of a group. Users and groups can be members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @return A Java Future containing the result of the ListGroupMembers operation returned by the service.
     * @sample AmazonWorkMailAsync.ListGroupMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembersResult> listGroupMembersAsync(ListGroupMembersRequest listGroupMembersRequest);

    /**
     * <p>
     * Returns an overview of the members of a group. Users and groups can be members of a group.
     * </p>
     * 
     * @param listGroupMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupMembers operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListGroupMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembersResult> listGroupMembersAsync(ListGroupMembersRequest listGroupMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupMembersRequest, ListGroupMembersResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AmazonWorkMailAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Returns summaries of the organization's groups.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists all the impersonation roles for the given WorkMail organization.
     * </p>
     * 
     * @param listImpersonationRolesRequest
     * @return A Java Future containing the result of the ListImpersonationRoles operation returned by the service.
     * @sample AmazonWorkMailAsync.ListImpersonationRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListImpersonationRoles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImpersonationRolesResult> listImpersonationRolesAsync(ListImpersonationRolesRequest listImpersonationRolesRequest);

    /**
     * <p>
     * Lists all the impersonation roles for the given WorkMail organization.
     * </p>
     * 
     * @param listImpersonationRolesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImpersonationRoles operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListImpersonationRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListImpersonationRoles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImpersonationRolesResult> listImpersonationRolesAsync(ListImpersonationRolesRequest listImpersonationRolesRequest,
            com.amazonaws.handlers.AsyncHandler<ListImpersonationRolesRequest, ListImpersonationRolesResult> asyncHandler);

    /**
     * <p>
     * Lists the mail domains in a given WorkMail organization.
     * </p>
     * 
     * @param listMailDomainsRequest
     * @return A Java Future containing the result of the ListMailDomains operation returned by the service.
     * @sample AmazonWorkMailAsync.ListMailDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMailDomainsResult> listMailDomainsAsync(ListMailDomainsRequest listMailDomainsRequest);

    /**
     * <p>
     * Lists the mail domains in a given WorkMail organization.
     * </p>
     * 
     * @param listMailDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMailDomains operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListMailDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMailDomainsResult> listMailDomainsAsync(ListMailDomainsRequest listMailDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMailDomainsRequest, ListMailDomainsResult> asyncHandler);

    /**
     * <p>
     * Lists the mailbox export jobs started for the specified organization within the last seven days.
     * </p>
     * 
     * @param listMailboxExportJobsRequest
     * @return A Java Future containing the result of the ListMailboxExportJobs operation returned by the service.
     * @sample AmazonWorkMailAsync.ListMailboxExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxExportJobsResult> listMailboxExportJobsAsync(ListMailboxExportJobsRequest listMailboxExportJobsRequest);

    /**
     * <p>
     * Lists the mailbox export jobs started for the specified organization within the last seven days.
     * </p>
     * 
     * @param listMailboxExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMailboxExportJobs operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListMailboxExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxExportJobsResult> listMailboxExportJobsAsync(ListMailboxExportJobsRequest listMailboxExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMailboxExportJobsRequest, ListMailboxExportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the mailbox permissions associated with a user, group, or resource mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @return A Java Future containing the result of the ListMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsync.ListMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxPermissionsResult> listMailboxPermissionsAsync(ListMailboxPermissionsRequest listMailboxPermissionsRequest);

    /**
     * <p>
     * Lists the mailbox permissions associated with a user, group, or resource mailbox.
     * </p>
     * 
     * @param listMailboxPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMailboxPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMailboxPermissionsResult> listMailboxPermissionsAsync(ListMailboxPermissionsRequest listMailboxPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMailboxPermissionsRequest, ListMailboxPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists all the mobile device access overrides for any given combination of WorkMail organization, user, or device.
     * </p>
     * 
     * @param listMobileDeviceAccessOverridesRequest
     * @return A Java Future containing the result of the ListMobileDeviceAccessOverrides operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.ListMobileDeviceAccessOverrides
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessOverrides"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileDeviceAccessOverridesResult> listMobileDeviceAccessOverridesAsync(
            ListMobileDeviceAccessOverridesRequest listMobileDeviceAccessOverridesRequest);

    /**
     * <p>
     * Lists all the mobile device access overrides for any given combination of WorkMail organization, user, or device.
     * </p>
     * 
     * @param listMobileDeviceAccessOverridesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMobileDeviceAccessOverrides operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.ListMobileDeviceAccessOverrides
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessOverrides"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileDeviceAccessOverridesResult> listMobileDeviceAccessOverridesAsync(
            ListMobileDeviceAccessOverridesRequest listMobileDeviceAccessOverridesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMobileDeviceAccessOverridesRequest, ListMobileDeviceAccessOverridesResult> asyncHandler);

    /**
     * <p>
     * Lists the mobile device access rules for the specified WorkMail organization.
     * </p>
     * 
     * @param listMobileDeviceAccessRulesRequest
     * @return A Java Future containing the result of the ListMobileDeviceAccessRules operation returned by the service.
     * @sample AmazonWorkMailAsync.ListMobileDeviceAccessRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileDeviceAccessRulesResult> listMobileDeviceAccessRulesAsync(
            ListMobileDeviceAccessRulesRequest listMobileDeviceAccessRulesRequest);

    /**
     * <p>
     * Lists the mobile device access rules for the specified WorkMail organization.
     * </p>
     * 
     * @param listMobileDeviceAccessRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMobileDeviceAccessRules operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListMobileDeviceAccessRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMobileDeviceAccessRulesResult> listMobileDeviceAccessRulesAsync(
            ListMobileDeviceAccessRulesRequest listMobileDeviceAccessRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMobileDeviceAccessRulesRequest, ListMobileDeviceAccessRulesResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the customer's organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @return A Java Future containing the result of the ListOrganizations operation returned by the service.
     * @sample AmazonWorkMailAsync.ListOrganizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListOrganizations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationsResult> listOrganizationsAsync(ListOrganizationsRequest listOrganizationsRequest);

    /**
     * <p>
     * Returns summaries of the customer's organizations.
     * </p>
     * 
     * @param listOrganizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizations operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListOrganizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListOrganizations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationsResult> listOrganizationsAsync(ListOrganizationsRequest listOrganizationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationsRequest, ListOrganizationsResult> asyncHandler);

    /**
     * <p>
     * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
     * behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @return A Java Future containing the result of the ListResourceDelegates operation returned by the service.
     * @sample AmazonWorkMailAsync.ListResourceDelegates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDelegatesResult> listResourceDelegatesAsync(ListResourceDelegatesRequest listResourceDelegatesRequest);

    /**
     * <p>
     * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on
     * behalf of the resource.
     * </p>
     * 
     * @param listResourceDelegatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceDelegates operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListResourceDelegates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResourceDelegates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceDelegatesResult> listResourceDelegatesAsync(ListResourceDelegatesRequest listResourceDelegatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceDelegatesRequest, ListResourceDelegatesResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AmazonWorkMailAsync.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Returns summaries of the organization's resources.
     * </p>
     * 
     * @param listResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an WorkMail organization resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkMailAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags applied to an WorkMail organization resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonWorkMailAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Returns summaries of the organization's users.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Adds a new access control rule for the specified organization. The rule allows or denies access to the
     * organization for the specified IPv4 addresses, access protocol actions, user IDs and impersonation IDs. Adding a
     * new rule with the same name as an existing rule replaces the older rule.
     * </p>
     * 
     * @param putAccessControlRuleRequest
     * @return A Java Future containing the result of the PutAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsync.PutAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutAccessControlRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessControlRuleResult> putAccessControlRuleAsync(PutAccessControlRuleRequest putAccessControlRuleRequest);

    /**
     * <p>
     * Adds a new access control rule for the specified organization. The rule allows or denies access to the
     * organization for the specified IPv4 addresses, access protocol actions, user IDs and impersonation IDs. Adding a
     * new rule with the same name as an existing rule replaces the older rule.
     * </p>
     * 
     * @param putAccessControlRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccessControlRule operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.PutAccessControlRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutAccessControlRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessControlRuleResult> putAccessControlRuleAsync(PutAccessControlRuleRequest putAccessControlRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccessControlRuleRequest, PutAccessControlRuleResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param putEmailMonitoringConfigurationRequest
     * @return A Java Future containing the result of the PutEmailMonitoringConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.PutEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailMonitoringConfigurationResult> putEmailMonitoringConfigurationAsync(
            PutEmailMonitoringConfigurationRequest putEmailMonitoringConfigurationRequest);

    /**
     * <p>
     * Creates or updates the email monitoring configuration for a specified organization.
     * </p>
     * 
     * @param putEmailMonitoringConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEmailMonitoringConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.PutEmailMonitoringConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutEmailMonitoringConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutEmailMonitoringConfigurationResult> putEmailMonitoringConfigurationAsync(
            PutEmailMonitoringConfigurationRequest putEmailMonitoringConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutEmailMonitoringConfigurationRequest, PutEmailMonitoringConfigurationResult> asyncHandler);

    /**
     * <p>
     * Enables or disables a DMARC policy for a given organization.
     * </p>
     * 
     * @param putInboundDmarcSettingsRequest
     * @return A Java Future containing the result of the PutInboundDmarcSettings operation returned by the service.
     * @sample AmazonWorkMailAsync.PutInboundDmarcSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutInboundDmarcSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInboundDmarcSettingsResult> putInboundDmarcSettingsAsync(PutInboundDmarcSettingsRequest putInboundDmarcSettingsRequest);

    /**
     * <p>
     * Enables or disables a DMARC policy for a given organization.
     * </p>
     * 
     * @param putInboundDmarcSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInboundDmarcSettings operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.PutInboundDmarcSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutInboundDmarcSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInboundDmarcSettingsResult> putInboundDmarcSettingsAsync(PutInboundDmarcSettingsRequest putInboundDmarcSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutInboundDmarcSettingsRequest, PutInboundDmarcSettingsResult> asyncHandler);

    /**
     * <p>
     * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @return A Java Future containing the result of the PutMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsync.PutMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMailboxPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutMailboxPermissionsResult> putMailboxPermissionsAsync(PutMailboxPermissionsRequest putMailboxPermissionsRequest);

    /**
     * <p>
     * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
     * </p>
     * 
     * @param putMailboxPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMailboxPermissions operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.PutMailboxPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMailboxPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutMailboxPermissionsResult> putMailboxPermissionsAsync(PutMailboxPermissionsRequest putMailboxPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutMailboxPermissionsRequest, PutMailboxPermissionsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * 
     * @param putMobileDeviceAccessOverrideRequest
     * @return A Java Future containing the result of the PutMobileDeviceAccessOverride operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.PutMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutMobileDeviceAccessOverrideResult> putMobileDeviceAccessOverrideAsync(
            PutMobileDeviceAccessOverrideRequest putMobileDeviceAccessOverrideRequest);

    /**
     * <p>
     * Creates or updates a mobile device access override for the given WorkMail organization, user, and device.
     * </p>
     * 
     * @param putMobileDeviceAccessOverrideRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMobileDeviceAccessOverride operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.PutMobileDeviceAccessOverride
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMobileDeviceAccessOverride"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutMobileDeviceAccessOverrideResult> putMobileDeviceAccessOverrideAsync(
            PutMobileDeviceAccessOverrideRequest putMobileDeviceAccessOverrideRequest,
            com.amazonaws.handlers.AsyncHandler<PutMobileDeviceAccessOverrideRequest, PutMobileDeviceAccessOverrideResult> asyncHandler);

    /**
     * <p>
     * Puts a retention policy to the specified organization.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsync.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest putRetentionPolicyRequest);

    /**
     * <p>
     * Puts a retention policy to the specified organization.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRetentionPolicy operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutRetentionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest putRetentionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, PutRetentionPolicyResult> asyncHandler);

    /**
     * <p>
     * Registers a new domain in WorkMail and SES, and configures it for use by WorkMail. Emails received by SES for
     * this domain are routed to the specified WorkMail organization, and WorkMail has permanent permission to use the
     * specified domain for sending your users' emails.
     * </p>
     * 
     * @param registerMailDomainRequest
     * @return A Java Future containing the result of the RegisterMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsync.RegisterMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterMailDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterMailDomainResult> registerMailDomainAsync(RegisterMailDomainRequest registerMailDomainRequest);

    /**
     * <p>
     * Registers a new domain in WorkMail and SES, and configures it for use by WorkMail. Emails received by SES for
     * this domain are routed to the specified WorkMail organization, and WorkMail has permanent permission to use the
     * specified domain for sending your users' emails.
     * </p>
     * 
     * @param registerMailDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.RegisterMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterMailDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterMailDomainResult> registerMailDomainAsync(RegisterMailDomainRequest registerMailDomainRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterMailDomainRequest, RegisterMailDomainResult> asyncHandler);

    /**
     * <p>
     * Registers an existing and disabled user, group, or resource for WorkMail use by associating a mailbox and
     * calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
     * group, or resource is deleted. This operation results in the accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com/workmail/pricing">Pricing</a>. The equivalent console functionality for this
     * operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API operation or they can be synchronized from your
     * directory. For more information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @return A Java Future containing the result of the RegisterToWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsync.RegisterToWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterToWorkMail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterToWorkMailResult> registerToWorkMailAsync(RegisterToWorkMailRequest registerToWorkMailRequest);

    /**
     * <p>
     * Registers an existing and disabled user, group, or resource for WorkMail use by associating a mailbox and
     * calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user,
     * group, or resource is deleted. This operation results in the accumulation of costs. For more information, see <a
     * href="https://aws.amazon.com/workmail/pricing">Pricing</a>. The equivalent console functionality for this
     * operation is <i>Enable</i>.
     * </p>
     * <p>
     * Users can either be created by calling the <a>CreateUser</a> API operation or they can be synchronized from your
     * directory. For more information, see <a>DeregisterFromWorkMail</a>.
     * </p>
     * 
     * @param registerToWorkMailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterToWorkMail operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.RegisterToWorkMail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/RegisterToWorkMail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterToWorkMailResult> registerToWorkMailAsync(RegisterToWorkMailRequest registerToWorkMailRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterToWorkMailRequest, RegisterToWorkMailResult> asyncHandler);

    /**
     * <p>
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @return A Java Future containing the result of the ResetPassword operation returned by the service.
     * @sample AmazonWorkMailAsync.ResetPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ResetPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetPasswordResult> resetPasswordAsync(ResetPasswordRequest resetPasswordRequest);

    /**
     * <p>
     * Allows the administrator to reset the password for a user.
     * </p>
     * 
     * @param resetPasswordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetPassword operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.ResetPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ResetPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetPasswordResult> resetPasswordAsync(ResetPasswordRequest resetPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ResetPasswordRequest, ResetPasswordResult> asyncHandler);

    /**
     * <p>
     * Starts a mailbox export job to export MIME-format email messages and calendar items from the specified mailbox to
     * the specified Amazon Simple Storage Service (Amazon S3) bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/mail-export.html">Exporting mailbox content</a> in
     * the <i>WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param startMailboxExportJobRequest
     * @return A Java Future containing the result of the StartMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsync.StartMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/StartMailboxExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMailboxExportJobResult> startMailboxExportJobAsync(StartMailboxExportJobRequest startMailboxExportJobRequest);

    /**
     * <p>
     * Starts a mailbox export job to export MIME-format email messages and calendar items from the specified mailbox to
     * the specified Amazon Simple Storage Service (Amazon S3) bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/workmail/latest/adminguide/mail-export.html">Exporting mailbox content</a> in
     * the <i>WorkMail Administrator Guide</i>.
     * </p>
     * 
     * @param startMailboxExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMailboxExportJob operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.StartMailboxExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/StartMailboxExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMailboxExportJobResult> startMailboxExportJobAsync(StartMailboxExportJobRequest startMailboxExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartMailboxExportJobRequest, StartMailboxExportJobResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified WorkMailorganization resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkMailAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies the specified tags to the specified WorkMailorganization resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Performs a test on an availability provider to ensure that access is allowed. For EWS, it verifies the provided
     * credentials can be used to successfully log in. For Lambda, it verifies that the Lambda function can be invoked
     * and that the resource access policy was configured to deny anonymous access. An anonymous invocation is one done
     * without providing either a <code>SourceArn</code> or <code>SourceAccount</code> header.
     * </p>
     * <note>
     * <p>
     * The request must contain either one provider definition (<code>EwsProvider</code> or <code>LambdaProvider</code>)
     * or the <code>DomainName</code> parameter. If the <code>DomainName</code> parameter is provided, the configuration
     * stored under the <code>DomainName</code> will be tested.
     * </p>
     * </note>
     * 
     * @param testAvailabilityConfigurationRequest
     * @return A Java Future containing the result of the TestAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.TestAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TestAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestAvailabilityConfigurationResult> testAvailabilityConfigurationAsync(
            TestAvailabilityConfigurationRequest testAvailabilityConfigurationRequest);

    /**
     * <p>
     * Performs a test on an availability provider to ensure that access is allowed. For EWS, it verifies the provided
     * credentials can be used to successfully log in. For Lambda, it verifies that the Lambda function can be invoked
     * and that the resource access policy was configured to deny anonymous access. An anonymous invocation is one done
     * without providing either a <code>SourceArn</code> or <code>SourceAccount</code> header.
     * </p>
     * <note>
     * <p>
     * The request must contain either one provider definition (<code>EwsProvider</code> or <code>LambdaProvider</code>)
     * or the <code>DomainName</code> parameter. If the <code>DomainName</code> parameter is provided, the configuration
     * stored under the <code>DomainName</code> will be tested.
     * </p>
     * </note>
     * 
     * @param testAvailabilityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.TestAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/TestAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestAvailabilityConfigurationResult> testAvailabilityConfigurationAsync(
            TestAvailabilityConfigurationRequest testAvailabilityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<TestAvailabilityConfigurationRequest, TestAvailabilityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Untags the specified tags from the specified WorkMail organization resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkMailAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags the specified tags from the specified WorkMail organization resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param updateAvailabilityConfigurationRequest
     * @return A Java Future containing the result of the UpdateAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.UpdateAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAvailabilityConfigurationResult> updateAvailabilityConfigurationAsync(
            UpdateAvailabilityConfigurationRequest updateAvailabilityConfigurationRequest);

    /**
     * <p>
     * Updates an existing <code>AvailabilityConfiguration</code> for the given WorkMail organization and domain.
     * </p>
     * 
     * @param updateAvailabilityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAvailabilityConfiguration operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.UpdateAvailabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateAvailabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAvailabilityConfigurationResult> updateAvailabilityConfigurationAsync(
            UpdateAvailabilityConfigurationRequest updateAvailabilityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAvailabilityConfigurationRequest, UpdateAvailabilityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the default mail domain for an organization. The default mail domain is used by the WorkMail AWS Console
     * to suggest an email address when enabling a mail user. You can only have one default domain.
     * </p>
     * 
     * @param updateDefaultMailDomainRequest
     * @return A Java Future containing the result of the UpdateDefaultMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdateDefaultMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateDefaultMailDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDefaultMailDomainResult> updateDefaultMailDomainAsync(UpdateDefaultMailDomainRequest updateDefaultMailDomainRequest);

    /**
     * <p>
     * Updates the default mail domain for an organization. The default mail domain is used by the WorkMail AWS Console
     * to suggest an email address when enabling a mail user. You can only have one default domain.
     * </p>
     * 
     * @param updateDefaultMailDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDefaultMailDomain operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdateDefaultMailDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateDefaultMailDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDefaultMailDomainResult> updateDefaultMailDomainAsync(UpdateDefaultMailDomainRequest updateDefaultMailDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDefaultMailDomainRequest, UpdateDefaultMailDomainResult> asyncHandler);

    /**
     * <p>
     * Updates an impersonation role for the given WorkMail organization.
     * </p>
     * 
     * @param updateImpersonationRoleRequest
     * @return A Java Future containing the result of the UpdateImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdateImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImpersonationRoleResult> updateImpersonationRoleAsync(UpdateImpersonationRoleRequest updateImpersonationRoleRequest);

    /**
     * <p>
     * Updates an impersonation role for the given WorkMail organization.
     * </p>
     * 
     * @param updateImpersonationRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateImpersonationRole operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdateImpersonationRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateImpersonationRole"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImpersonationRoleResult> updateImpersonationRoleAsync(UpdateImpersonationRoleRequest updateImpersonationRoleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateImpersonationRoleRequest, UpdateImpersonationRoleResult> asyncHandler);

    /**
     * <p>
     * Updates a user's current mailbox quota for a specified organization and user.
     * </p>
     * 
     * @param updateMailboxQuotaRequest
     * @return A Java Future containing the result of the UpdateMailboxQuota operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdateMailboxQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMailboxQuota" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMailboxQuotaResult> updateMailboxQuotaAsync(UpdateMailboxQuotaRequest updateMailboxQuotaRequest);

    /**
     * <p>
     * Updates a user's current mailbox quota for a specified organization and user.
     * </p>
     * 
     * @param updateMailboxQuotaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMailboxQuota operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdateMailboxQuota
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMailboxQuota" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMailboxQuotaResult> updateMailboxQuotaAsync(UpdateMailboxQuotaRequest updateMailboxQuotaRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMailboxQuotaRequest, UpdateMailboxQuotaResult> asyncHandler);

    /**
     * <p>
     * Updates a mobile device access rule for the specified WorkMail organization.
     * </p>
     * 
     * @param updateMobileDeviceAccessRuleRequest
     * @return A Java Future containing the result of the UpdateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsync.UpdateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMobileDeviceAccessRuleResult> updateMobileDeviceAccessRuleAsync(
            UpdateMobileDeviceAccessRuleRequest updateMobileDeviceAccessRuleRequest);

    /**
     * <p>
     * Updates a mobile device access rule for the specified WorkMail organization.
     * </p>
     * 
     * @param updateMobileDeviceAccessRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMobileDeviceAccessRule operation returned by the
     *         service.
     * @sample AmazonWorkMailAsyncHandler.UpdateMobileDeviceAccessRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMobileDeviceAccessRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMobileDeviceAccessRuleResult> updateMobileDeviceAccessRuleAsync(
            UpdateMobileDeviceAccessRuleRequest updateMobileDeviceAccessRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMobileDeviceAccessRuleRequest, UpdateMobileDeviceAccessRuleResult> asyncHandler);

    /**
     * <p>
     * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
     * swapped between an existing alias and the current primary email), and the email provided in the input is promoted
     * as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @return A Java Future containing the result of the UpdatePrimaryEmailAddress operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdatePrimaryEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdatePrimaryEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePrimaryEmailAddressResult> updatePrimaryEmailAddressAsync(
            UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest);

    /**
     * <p>
     * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or
     * swapped between an existing alias and the current primary email), and the email provided in the input is promoted
     * as the primary.
     * </p>
     * 
     * @param updatePrimaryEmailAddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePrimaryEmailAddress operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdatePrimaryEmailAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdatePrimaryEmailAddress"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePrimaryEmailAddressResult> updatePrimaryEmailAddressAsync(
            UpdatePrimaryEmailAddressRequest updatePrimaryEmailAddressRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePrimaryEmailAddressRequest, UpdatePrimaryEmailAddressResult> asyncHandler);

    /**
     * <p>
     * Updates data for the resource. To have the latest information, it must be preceded by a <a>DescribeResource</a>
     * call. The dataset in the request should be the one expected when performing another <code>DescribeResource</code>
     * call.
     * </p>
     * 
     * @param updateResourceRequest
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AmazonWorkMailAsync.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Updates data for the resource. To have the latest information, it must be preceded by a <a>DescribeResource</a>
     * call. The dataset in the request should be the one expected when performing another <code>DescribeResource</code>
     * call.
     * </p>
     * 
     * @param updateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AmazonWorkMailAsyncHandler.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler);

}
