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
 * resources across Amazon Web Services accounts. If you have multiple Amazon Web Services accounts, you can use RAM to
 * share those resources with other accounts. If you use Organizations to manage your accounts, then you share your
 * resources with your organization or organizational units (OUs). For supported resource types, you can also share
 * resources with individual Identity and Access Management (IAM) roles an users.
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
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The specified Amazon Resource Name (ARN) for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The specified invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The specified invitation is expired.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws IdempotentParameterMismatchException
     *         The client token input parameter was matched one used with a previous call to the operation, but at least
     *         one of the other input parameters is different from the previous call.
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
     *         The client token input parameter was matched one used with a previous call to the operation, but at least
     *         one of the other input parameters is different from the previous call.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws ResourceShareLimitExceededException
     *         This request would exceed the limit for resource shares for your account.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws ThrottlingException
     *         You exceeded the rate at which you are allowed to perform this operation. Please try again later.
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
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @sample AWSRAM.AssociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateResourceSharePermissionResult associateResourceSharePermission(AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest);

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
     *         The client token input parameter was matched one used with a previous call to the operation, but at least
     *         one of the other input parameters is different from the previous call.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareLimitExceededException
     *         This request would exceed the limit for resource shares for your account.
     * @throws TagPolicyViolationException
     *         The specified tag key is a reserved word and can't be used.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.CreateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    CreateResourceShareResult createResourceShare(CreateResourceShareRequest createResourceShareRequest);

    /**
     * <p>
     * Deletes the specified resource share. This doesn't delete any of the resources that were associated with the
     * resource share; it only stops the sharing of those resources outside of the Amazon Web Services account that
     * created them.
     * </p>
     * 
     * @param deleteResourceShareRequest
     * @return Result of the DeleteResourceShare operation returned by the service.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws IdempotentParameterMismatchException
     *         The client token input parameter was matched one used with a previous call to the operation, but at least
     *         one of the other input parameters is different from the previous call.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.DeleteResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DeleteResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResourceShareResult deleteResourceShare(DeleteResourceShareRequest deleteResourceShareRequest);

    /**
     * <p>
     * Disassociates the specified principals or resources from the specified resource share.
     * </p>
     * 
     * @param disassociateResourceShareRequest
     * @return Result of the DisassociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         The client token input parameter was matched one used with a previous call to the operation, but at least
     *         one of the other input parameters is different from the previous call.
     * @throws ResourceShareLimitExceededException
     *         This request would exceed the limit for resource shares for your account.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @sample AWSRAM.DisassociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceShare" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateResourceShareResult disassociateResourceShare(DisassociateResourceShareRequest disassociateResourceShareRequest);

    /**
     * <p>
     * Disassociates an RAM permission from a resource share. Permission changes take effect immediately. You can remove
     * a RAM permission from a resource share only if there are currently no resources of the relevant resource type
     * currently attached to the resource share.
     * </p>
     * 
     * @param disassociateResourceSharePermissionRequest
     * @return Result of the DisassociateResourceSharePermission operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @sample AWSRAM.DisassociateResourceSharePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceSharePermission"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResourceSharePermissionResult disassociateResourceSharePermission(
            DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest);

    /**
     * <p>
     * Enables resource sharing within your organization in Organizations. Calling this operation enables RAM to
     * retrieve information about the organization and its structure. This lets you share resources with all of the
     * accounts in an organization by specifying the organization's ID, or all of the accounts in an organizational unit
     * (OU) by specifying the OU's ID. Until you enable sharing within the organization, you can specify only individual
     * Amazon Web Services accounts, or for supported resource types, IAM users and roles.
     * </p>
     * <p>
     * You must call this operation from an IAM user or role in the organization's management account.
     * </p>
     * 
     * @param enableSharingWithAwsOrganizationRequest
     * @return Result of the EnableSharingWithAwsOrganization operation returned by the service.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.EnableSharingWithAwsOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/EnableSharingWithAwsOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    EnableSharingWithAwsOrganizationResult enableSharingWithAwsOrganization(EnableSharingWithAwsOrganizationRequest enableSharingWithAwsOrganizationRequest);

    /**
     * <p>
     * Gets the contents of an RAM permission in JSON format.
     * </p>
     * 
     * @param getPermissionRequest
     * @return Result of the GetPermission operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
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
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ResourceArnNotFoundException
     *         The specified Amazon Resource Name (ARN) was not found.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourcePoliciesResult getResourcePolicies(GetResourcePoliciesRequest getResourcePoliciesRequest);

    /**
     * <p>
     * Retrieves the resource and principal associations for resource shares that you own.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return Result of the GetResourceShareAssociations operation returned by the service.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     *         The specified Amazon Resource Name (ARN) for an invitation was not found.
     * @throws InvalidMaxResultsException
     *         The specified value for <code>MaxResults</code> is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The specified Amazon Resource Name (ARN) for an invitation was not found.
     * @throws MissingRequiredParameterException
     *         A required input parameter is missing.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The specified invitation is expired.
     * @sample AWSRAM.ListPendingInvitationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPendingInvitationResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListPendingInvitationResourcesResult listPendingInvitationResources(ListPendingInvitationResourcesRequest listPendingInvitationResourcesRequest);

    /**
     * <p>
     * Lists the available versions of the specified RAM permission.
     * </p>
     * 
     * @param listPermissionVersionsRequest
     * @return Result of the ListPermissionVersions operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws InvalidParameterException
     *         A parameter is not valid.
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
     *         A parameter is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
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
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.ListPrincipals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPrincipals" target="_top">AWS API
     *      Documentation</a>
     */
    ListPrincipalsResult listPrincipals(ListPrincipalsRequest listPrincipalsRequest);

    /**
     * <p>
     * Lists the RAM permissions that are associated with a resource share.
     * </p>
     * 
     * @param listResourceSharePermissionsRequest
     * @return Result of the ListResourceSharePermissions operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
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
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     *         The specified resource type is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for <code>NextToken</code> is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * When you attach a resource-based permission policy to a resource, it automatically creates a resource share.
     * However, resource shares created this way are visible only to the resource share owner, and the resource share
     * can't be modified in RAM.
     * </p>
     * <p>
     * You can use this operation to promote the resource share to a full RAM resource share. When you promote a
     * resource share, you can then manage the resource share in RAM and it becomes visible to all of the principals you
     * shared it with.
     * </p>
     * 
     * @param promoteResourceShareCreatedFromPolicyRequest
     * @return Result of the PromoteResourceShareCreatedFromPolicy operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws ResourceShareLimitExceededException
     *         This request would exceed the limit for resource shares for your account.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws MissingRequiredParameterException
     *         A required input parameter is missing.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws UnknownResourceException
     *         A specified resource was not found.
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
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The specified Amazon Resource Name (ARN) for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The specified invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The specified invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The specified invitation is expired.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws IdempotentParameterMismatchException
     *         The client token input parameter was matched one used with a previous call to the operation, but at least
     *         one of the other input parameters is different from the previous call.
     * @sample AWSRAM.RejectResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/RejectResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    RejectResourceShareInvitationResult rejectResourceShareInvitation(RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest);

    /**
     * <p>
     * Adds the specified tag keys and values to the specified resource share. The tags are attached only to the
     * resource share, not to the resources that are in the resource share.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws TagLimitExceededException
     *         This request would exceed the limit for tags for your account.
     * @throws ResourceArnNotFoundException
     *         The specified Amazon Resource Name (ARN) was not found.
     * @throws TagPolicyViolationException
     *         The specified tag key is a reserved word and can't be used.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tag key and value pairs from the specified resource share.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
     *         The client token input parameter was matched one used with a previous call to the operation, but at least
     *         one of the other input parameters is different from the previous call.
     * @throws MissingRequiredParameterException
     *         A required input parameter is missing.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         The client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
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
