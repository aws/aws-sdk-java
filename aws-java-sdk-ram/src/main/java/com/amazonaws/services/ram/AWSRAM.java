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
package com.amazonaws.services.ram;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ram.model.*;

/**
 * Interface for accessing RAM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ram.AbstractAWSRAM} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Resource Access Manager API Reference</i>. This documentation provides descriptions and syntax for
 * each of the actions and data types in RAM. RAM is a service that helps you securely share your Amazon Web Services
 * resources to other Amazon Web Services accounts. If you use Organizations to manage your accounts, then you can share
 * your resources with your entire organization or to organizational units (OUs). For supported resource types, you can
 * also share resources with individual Identity and Access Management (IAM) roles and users.
 * </p>
 * <p>
 * To learn more about RAM, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/ram">Resource Access Manager product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ram/latest/userguide/">Resource Access Manager User Guide</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRAM {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ram";

    /**
     * <p>
     * Accepts an invitation to a resource share from another Amazon Web Services account. After you accept the
     * invitation, the resources included in the resource share are available to interact with in the relevant Amazon
     * Web Services Management Consoles and tools.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @return Result of the AcceptResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The operation failed because the specified invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The operation failed because the specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The operation failed because the specified invitation is past its expiration date and time.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.AcceptResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AcceptResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptResourceShareInvitationResult acceptResourceShareInvitation(AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest);

    /**
     * <p>
     * Adds the specified list of principals and list of resources to a resource share. Principals that already have
     * access to this resource share immediately receive access to the added resources. Newly added principals
     * immediately receive access to the resources shared in this resource share.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @return Result of the AssociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws ThrottlingException
     *         The operation failed because it exceeded the rate at which you are allowed to perform this operation.
     *         Please try again later.
     * @sample AWSRAM.AssociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateResourceShareResult associateResourceShare(AssociateResourceShareRequest associateResourceShareRequest);

    /**
     * <p>
     * Adds or replaces the RAM permission for a resource type included in a resource share. You can have exactly one
     * permission associated with each resource type in the resource share. You can add a new RAM permission only if
     * there are currently no resources of that resource type currently in the resource share.
     * </p>
     * 
     * @param associateResourceSharePermissionRequest
     * @return Result of the AssociateResourceSharePermission operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.AssociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateResourceSharePermissionResult associateResourceSharePermission(AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest);

    /**
     * <p>
     * Creates a customer managed permission for a specified resource type that you can attach to resource shares. It is
     * created in the Amazon Web Services Region in which you call the operation.
     * </p>
     * 
     * @param createPermissionRequest
     * @return Result of the CreatePermission operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidPolicyException
     *         The operation failed because a policy you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws PermissionAlreadyExistsException
     *         The operation failed because a permission with the specified name already exists in the requested Amazon
     *         Web Services Region. Choose a different name.
     * @throws MalformedPolicyTemplateException
     *         The operation failed because the policy template that you provided isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws PermissionLimitExceededException
     *         The operation failed because it would exceed the maximum number of permissions you can create in each
     *         Amazon Web Services Region. To view the limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.CreatePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermission" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePermissionResult createPermission(CreatePermissionRequest createPermissionRequest);

    /**
     * <p>
     * Creates a new version of the specified customer managed permission. The new version is automatically set as the
     * default version of the customer managed permission. New resource shares automatically use the default permission.
     * Existing resource shares continue to use their original permission versions, but you can use
     * <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * <p>
     * If the specified customer managed permission already has the maximum of 5 versions, then you must delete one of
     * the existing versions before you can create a new one.
     * </p>
     * 
     * @param createPermissionVersionRequest
     * @return Result of the CreatePermissionVersion operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidPolicyException
     *         The operation failed because a policy you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedPolicyTemplateException
     *         The operation failed because the policy template that you provided isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws PermissionVersionsLimitExceededException
     *         The operation failed because it would exceed the limit for the number of versions you can have for a
     *         permission. To view the limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @sample AWSRAM.CreatePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreatePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePermissionVersionResult createPermissionVersion(CreatePermissionVersionRequest createPermissionVersionRequest);

    /**
     * <p>
     * Creates a resource share. You can provide a list of the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> for the resources that you want to share, a list of principals you want to share the resources with,
     * and the permissions to grant those principals.
     * </p>
     * <note>
     * <p>
     * Sharing a resource makes it available for use by principals outside of the Amazon Web Services account that
     * created the resource. Sharing doesn't change any permissions or quotas that apply to the resource in the account
     * that created it.
     * </p>
     * </note>
     * 
     * @param createResourceShareRequest
     * @return Result of the CreateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws TagPolicyViolationException
     *         The operation failed because the specified tag key is a reserved word and can't be used.
     * @throws TagLimitExceededException
     *         The operation failed because it would exceed the limit for tags for your Amazon Web Services account.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.CreateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    CreateResourceShareResult createResourceShare(CreateResourceShareRequest createResourceShareRequest);

    /**
     * <p>
     * Deletes the specified customer managed permission in the Amazon Web Services Region in which you call this
     * operation. You can delete a customer managed permission only if it isn't attached to any resource share. The
     * operation deletes all versions associated with the customer managed permission.
     * </p>
     * 
     * @param deletePermissionRequest
     * @return Result of the DeletePermission operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.DeletePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermission" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePermissionResult deletePermission(DeletePermissionRequest deletePermissionRequest);

    /**
     * <p>
     * Deletes one version of a customer managed permission. The version you specify must not be attached to any
     * resource share and must not be the default version for the permission.
     * </p>
     * <p>
     * If a customer managed permission has the maximum of 5 versions, then you must delete at least one version before
     * you can create another.
     * </p>
     * 
     * @param deletePermissionVersionRequest
     * @return Result of the DeletePermissionVersion operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.DeletePermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeletePermissionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePermissionVersionResult deletePermissionVersion(DeletePermissionVersionRequest deletePermissionVersionRequest);

    /**
     * <p>
     * Deletes the specified resource share.
     * </p>
     * <important>
     * <p>
     * This doesn't delete any of the resources that were associated with the resource share; it only stops the sharing
     * of those resources through this resource share.
     * </p>
     * </important>
     * 
     * @param deleteResourceShareRequest
     * @return Result of the DeleteResourceShare operation returned by the service.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.DeleteResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeleteResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResourceShareResult deleteResourceShare(DeleteResourceShareRequest deleteResourceShareRequest);

    /**
     * <p>
     * Removes the specified principals or resources from participating in the specified resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @return Result of the DisassociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @sample AWSRAM.DisassociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceShare" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateResourceShareResult disassociateResourceShare(DisassociateResourceShareRequest disassociateResourceShareRequest);

    /**
     * <p>
     * Removes a managed permission from a resource share. Permission changes take effect immediately. You can remove a
     * managed permission from a resource share only if there are currently no resources of the relevant resource type
     * currently attached to the resource share.
     * </p>
     * 
     * @param disassociateResourceSharePermissionRequest
     * @return Result of the DisassociateResourceSharePermission operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @sample AWSRAM.DisassociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResourceSharePermissionResult disassociateResourceSharePermission(
            DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest);

    /**
     * <p>
     * Enables resource sharing within your organization in Organizations. This operation creates a service-linked role
     * called <code>AWSServiceRoleForResourceAccessManager</code> that has the IAM managed policy named
     * AWSResourceAccessManagerServiceRolePolicy attached. This role permits RAM to retrieve information about the
     * organization and its structure. This lets you share resources with all of the accounts in the calling account's
     * organization by specifying the organization ID, or all of the accounts in an organizational unit (OU) by
     * specifying the OU ID. Until you enable sharing within the organization, you can specify only individual Amazon
     * Web Services accounts, or for supported resource types, IAM roles and users.
     * </p>
     * <p>
     * You must call this operation from an IAM role or user in the organization's management account.
     * </p>
     * <p/>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @return Result of the EnableSharingWithAwsOrganization operation returned by the service.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.EnableSharingWithAwsOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/EnableSharingWithAwsOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    EnableSharingWithAwsOrganizationResult enableSharingWithAwsOrganization(EnableSharingWithAwsOrganizationRequest enableSharingWithAwsOrganizationRequest);

    /**
     * <p>
     * Retrieves the contents of a managed permission in JSON format.
     * </p>
     * 
     * @param getPermissionRequest
     * @return Result of the GetPermission operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.GetPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetPermission" target="_top">AWS API
     *      Documentation</a>
     */
    GetPermissionResult getPermission(GetPermissionRequest getPermissionRequest);

    /**
     * <p>
     * Retrieves the resource policies for the specified resources that you own and have shared.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return Result of the GetResourcePolicies operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ResourceArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> was not found.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourcePoliciesResult getResourcePolicies(GetResourcePoliciesRequest getResourcePoliciesRequest);

    /**
     * <p>
     * Retrieves the lists of resources and principals that associated for resource shares that you own.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return Result of the GetResourceShareAssociations operation returned by the service.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourceShareAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceShareAssociationsResult getResourceShareAssociations(GetResourceShareAssociationsRequest getResourceShareAssociationsRequest);

    /**
     * <p>
     * Retrieves details about invitations that you have received for resource shares.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @return Result of the GetResourceShareInvitations operation returned by the service.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws InvalidMaxResultsException
     *         The operation failed because the specified value for <code>MaxResults</code> isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourceShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceShareInvitationsResult getResourceShareInvitations(GetResourceShareInvitationsRequest getResourceShareInvitationsRequest);

    /**
     * <p>
     * Retrieves details about the resource shares that you own or that are shared with you.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @return Result of the GetResourceShares operation returned by the service.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.GetResourceShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShares" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourceSharesResult getResourceShares(GetResourceSharesRequest getResourceSharesRequest);

    /**
     * <p>
     * Lists the resources in a resource share that is shared with you but for which the invitation is still
     * <code>PENDING</code>. That means that you haven't accepted or rejected the invitation and the invitation hasn't
     * expired.
     * </p>
     * 
     * @param listPendingInvitationResourcesRequest
     * @return Result of the ListPendingInvitationResources operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The operation failed because the specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The operation failed because the specified invitation is past its expiration date and time.
     * @sample AWSRAM.ListPendingInvitationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPendingInvitationResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListPendingInvitationResourcesResult listPendingInvitationResources(ListPendingInvitationResourcesRequest listPendingInvitationResourcesRequest);

    /**
     * <p>
     * Lists information about the managed permission and its associations to any resource shares that use this managed
     * permission. This lets you see which resource shares use which versions of the specified managed permission.
     * </p>
     * 
     * @param listPermissionAssociationsRequest
     * @return Result of the ListPermissionAssociations operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListPermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    ListPermissionAssociationsResult listPermissionAssociations(ListPermissionAssociationsRequest listPermissionAssociationsRequest);

    /**
     * <p>
     * Lists the available versions of the specified RAM permission.
     * </p>
     * 
     * @param listPermissionVersionsRequest
     * @return Result of the ListPermissionVersions operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @sample AWSRAM.ListPermissionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissionVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListPermissionVersionsResult listPermissionVersions(ListPermissionVersionsRequest listPermissionVersionsRequest);

    /**
     * <p>
     * Retrieves a list of available RAM permissions that you can use for the supported resource types.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return Result of the ListPermissions operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    ListPermissionsResult listPermissions(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Lists the principals that you are sharing resources with or that are sharing resources with you.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @return Result of the ListPrincipals operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListPrincipals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPrincipals" target="_top">AWS API
     *      Documentation</a>
     */
    ListPrincipalsResult listPrincipals(ListPrincipalsRequest listPrincipalsRequest);

    /**
     * <p>
     * Retrieves the current status of the asynchronous tasks performed by RAM when you perform the
     * <a>ReplacePermissionAssociationsWork</a> operation.
     * </p>
     * 
     * @param listReplacePermissionAssociationsWorkRequest
     * @return Result of the ListReplacePermissionAssociationsWork operation returned by the service.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @sample AWSRAM.ListReplacePermissionAssociationsWork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListReplacePermissionAssociationsWork"
     *      target="_top">AWS API Documentation</a>
     */
    ListReplacePermissionAssociationsWorkResult listReplacePermissionAssociationsWork(
            ListReplacePermissionAssociationsWorkRequest listReplacePermissionAssociationsWorkRequest);

    /**
     * <p>
     * Lists the RAM permissions that are associated with a resource share.
     * </p>
     * 
     * @param listResourceSharePermissionsRequest
     * @return Result of the ListResourceSharePermissions operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @sample AWSRAM.ListResourceSharePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceSharePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceSharePermissionsResult listResourceSharePermissions(ListResourceSharePermissionsRequest listResourceSharePermissionsRequest);

    /**
     * <p>
     * Lists the resource types that can be shared by RAM.
     * </p>
     * 
     * @param listResourceTypesRequest
     * @return Result of the ListResourceTypes operation returned by the service.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResourceTypes" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourceTypesResult listResourceTypes(ListResourceTypesRequest listResourceTypesRequest);

    /**
     * <p>
     * Lists the resources that you added to a resource share or the resources that are shared with you.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The operation failed because the specified resource type isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidNextTokenException
     *         The operation failed because the specified value for <code>NextToken</code> isn't valid. You must specify
     *         a value you received in the <code>NextToken</code> response of a previous call to this operation.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation creates a separate, fully manageable customer managed permission that has the same IAM permissions
     * as the original resource-based policy. You can associate this customer managed permission to any resource shares.
     * </p>
     * <p>
     * Before you use <a>PromoteResourceShareCreatedFromPolicy</a>, you should first run this operation to ensure that
     * you have an appropriate customer managed permission that can be associated with the promoted resource share.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The original <code>CREATED_FROM_POLICY</code> policy isn't deleted, and resource shares using that original
     * policy aren't automatically updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't modify a <code>CREATED_FROM_POLICY</code> resource share so you can't associate the new customer
     * managed permission by using <code>ReplacePermsissionAssociations</code>. However, if you use
     * <a>PromoteResourceShareCreatedFromPolicy</a>, that operation automatically associates the fully manageable
     * customer managed permission to the newly promoted <code>STANDARD</code> resource share.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you promote a resource share, if the original <code>CREATED_FROM_POLICY</code> managed permission has no
     * other associations to A resource share, then RAM automatically deletes it.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promotePermissionCreatedFromPolicyRequest
     * @return Result of the PromotePermissionCreatedFromPolicy operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @sample AWSRAM.PromotePermissionCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromotePermissionCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PromotePermissionCreatedFromPolicyResult promotePermissionCreatedFromPolicy(
            PromotePermissionCreatedFromPolicyRequest promotePermissionCreatedFromPolicyRequest);

    /**
     * <p>
     * When you attach a resource-based policy to a resource, RAM automatically creates a resource share of
     * <code>featureSet</code>=<code>CREATED_FROM_POLICY</code> with a managed permission that has the same IAM
     * permissions as the original resource-based policy. However, this type of managed permission is visible to only
     * the resource share owner, and the associated resource share can't be modified by using RAM.
     * </p>
     * <p>
     * This operation promotes the resource share to a <code>STANDARD</code> resource share that is fully manageable in
     * RAM. When you promote a resource share, you can then manage the resource share in RAM and it becomes visible to
     * all of the principals you shared it with.
     * </p>
     * <important>
     * <p>
     * Before you perform this operation, you should first run <a>PromotePermissionCreatedFromPolicy</a>to ensure that
     * you have an appropriate customer managed permission that can be associated with this resource share after its is
     * promoted. If this operation can't find a managed permission that exactly matches the existing
     * <code>CREATED_FROM_POLICY</code> permission, then this operation fails.
     * </p>
     * </important>
     * 
     * @param promoteResourceShareCreatedFromPolicyRequest
     * @return Result of the PromoteResourceShareCreatedFromPolicy operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ResourceShareLimitExceededException
     *         The operation failed because it would exceed the limit for resource shares for your account. To view the
     *         limits for your Amazon Web Services account, see the <a
     *         href="https://console.aws.amazon.com/servicequotas/home/services/ram/quotas">RAM page in the Service
     *         Quotas console</a>.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidStateTransitionException
     *         The operation failed because the requested operation isn't valid for the resource share in its current
     *         state.
     * @throws UnmatchedPolicyPermissionException
     *         There isn't an existing managed permission defined in RAM that has the same IAM permissions as the
     *         resource-based policy attached to the resource. You should first run
     *         <a>PromotePermissionCreatedFromPolicy</a> to create that managed permission.
     * @sample AWSRAM.PromoteResourceShareCreatedFromPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/PromoteResourceShareCreatedFromPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PromoteResourceShareCreatedFromPolicyResult promoteResourceShareCreatedFromPolicy(
            PromoteResourceShareCreatedFromPolicyRequest promoteResourceShareCreatedFromPolicyRequest);

    /**
     * <p>
     * Rejects an invitation to a resource share from another Amazon Web Services account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @return Result of the RejectResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The operation failed because the specified invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The operation failed because the specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The operation failed because the specified invitation is past its expiration date and time.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.RejectResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/RejectResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    RejectResourceShareInvitationResult rejectResourceShareInvitation(RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest);

    /**
     * <p>
     * Updates all resource shares that use a managed permission to a different managed permission. This operation
     * always applies the default version of the target managed permission. You can optionally specify that the update
     * applies to only resource shares that currently use a specified version. This enables you to update to the latest
     * version, without changing the which managed permission is used.
     * </p>
     * <p>
     * You can use this operation to update all of your resource shares to use the current default version of the
     * permission by specifying the same value for the <code>fromPermissionArn</code> and <code>toPermissionArn</code>
     * parameters.
     * </p>
     * <p>
     * You can use the optional <code>fromPermissionVersion</code> parameter to update only those resources that use a
     * specified version of the managed permission to the new managed permission.
     * </p>
     * <important>
     * <p>
     * To successfully perform this operation, you must have permission to update the resource-based policy on all
     * affected resource types.
     * </p>
     * </important>
     * 
     * @param replacePermissionAssociationsRequest
     * @return Result of the ReplacePermissionAssociations operation returned by the service.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.ReplacePermissionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ReplacePermissionAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ReplacePermissionAssociationsResult replacePermissionAssociations(ReplacePermissionAssociationsRequest replacePermissionAssociationsRequest);

    /**
     * <p>
     * Designates the specified version number as the default version for the specified customer managed permission. New
     * resource shares automatically use this new default permission. Existing resource shares continue to use their
     * original permission version, but you can use <a>ReplacePermissionAssociations</a> to update them.
     * </p>
     * 
     * @param setDefaultPermissionVersionRequest
     * @return Result of the SetDefaultPermissionVersion operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @sample AWSRAM.SetDefaultPermissionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/SetDefaultPermissionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    SetDefaultPermissionVersionResult setDefaultPermissionVersion(SetDefaultPermissionVersionRequest setDefaultPermissionVersionRequest);

    /**
     * <p>
     * Adds the specified tag keys and values to a resource share or managed permission. If you choose a resource share,
     * the tags are attached to only the resource share, not to the resources that are in the resource share.
     * </p>
     * <p>
     * The tags on a managed permission are the same for all versions of the managed permission.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws TagLimitExceededException
     *         The operation failed because it would exceed the limit for tags for your Amazon Web Services account.
     * @throws ResourceArnNotFoundException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> was not found.
     * @throws TagPolicyViolationException
     *         The operation failed because the specified tag key is a reserved word and can't be used.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tag key and value pairs from the specified resource share or managed permission.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies some of the properties of the specified resource share.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @return Result of the UpdateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The operation failed because the client token input parameter matched one that was used with a previous
     *         call to the operation, but at least one of the other input parameters is different from the previous
     *         call.
     * @throws MissingRequiredParameterException
     *         The operation failed because a required input parameter is missing.
     * @throws UnknownResourceException
     *         The operation failed because a specified resource couldn't be found.
     * @throws MalformedArnException
     *         The operation failed because the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> has a format that isn't valid.
     * @throws InvalidClientTokenException
     *         The operation failed because the specified client token isn't valid.
     * @throws InvalidParameterException
     *         The operation failed because a parameter you specified isn't valid.
     * @throws OperationNotPermittedException
     *         The operation failed because the requested operation isn't permitted.
     * @throws ServerInternalException
     *         The operation failed because the service could not respond to the request due to an internal problem. Try
     *         again later.
     * @throws ServiceUnavailableException
     *         The operation failed because the service isn't available. Try again later.
     * @sample AWSRAM.UpdateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UpdateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateResourceShareResult updateResourceShare(UpdateResourceShareRequest updateResourceShareRequest);

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
