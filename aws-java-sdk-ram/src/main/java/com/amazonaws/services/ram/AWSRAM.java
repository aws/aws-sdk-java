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
 * Use AWS Resource Access Manager to share AWS resources between AWS accounts. To share a resource, you create a
 * resource share, associate the resource with the resource share, and specify the principals that can access the
 * resource. The following principals are supported:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ID of an AWS account
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an OU from AWS Organizations
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Resource Name (ARN) of an organization from AWS Organizations
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify an AWS account that doesn't exist in the same organization as the account that owns the resource
 * share, the owner of the specified account receives an invitation to accept the resource share. After the owner
 * accepts the invitation, they can access the resources in the resource share. An administrator of the specified
 * account can use IAM policies to restrict access resources in the resource share.
 * </p>
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
     * Accepts an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param acceptResourceShareInvitationRequest
     * @return Result of the AcceptResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The Amazon Resource Name (ARN) for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The invitation is expired.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.AcceptResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AcceptResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptResourceShareInvitationResult acceptResourceShareInvitation(AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest);

    /**
     * <p>
     * Associates the specified resource share with the specified principals and resources.
     * </p>
     * 
     * @param associateResourceShareRequest
     * @return Result of the AssociateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws ResourceShareLimitExceededException
     *         The requested resource share exceeds the limit for your account.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
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
     * @sample AWSRAM.AssociateResourceShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceShare" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateResourceShareResult associateResourceShare(AssociateResourceShareRequest associateResourceShareRequest);

    /**
     * <p>
     * Creates a resource share.
     * </p>
     * 
     * @param createResourceShareRequest
     * @return Result of the CreateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareLimitExceededException
     *         The requested resource share exceeds the limit for your account.
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
     * Deletes the specified resource share.
     * </p>
     * 
     * @param deleteResourceShareRequest
     * @return Result of the DeleteResourceShare operation returned by the service.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
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
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws ResourceShareLimitExceededException
     *         The requested resource share exceeds the limit for your account.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidStateTransitionException
     *         The requested state transition is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
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
     * Enables resource sharing within your organization.
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
     * Gets the policies for the specifies resources.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return Result of the GetResourcePolicies operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
     * @throws InvalidParameterException
     *         A parameter is not valid.
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
     * Gets the associations for the specified resource share.
     * </p>
     * 
     * @param getResourceShareAssociationsRequest
     * @return Result of the GetResourceShareAssociations operation returned by the service.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
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
     * Gets the specified invitations for resource sharing.
     * </p>
     * 
     * @param getResourceShareInvitationsRequest
     * @return Result of the GetResourceShareInvitations operation returned by the service.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The Amazon Resource Name (ARN) for an invitation was not found.
     * @throws InvalidMaxResultsException
     *         The specified value for MaxResults is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
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
     * Gets the specified resource shares or all of your resource shares.
     * </p>
     * 
     * @param getResourceSharesRequest
     * @return Result of the GetResourceShares operation returned by the service.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
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
     * Lists the principals with access to the specified resource.
     * </p>
     * 
     * @param listPrincipalsRequest
     * @return Result of the ListPrincipals operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws InvalidNextTokenException
     *         The specified value for NextToken is not valid.
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
     * Lists the resources that the specified principal can access.
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
     *         The specified value for NextToken is not valid.
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
     * Rejects an invitation to a resource share from another AWS account.
     * </p>
     * 
     * @param rejectResourceShareInvitationRequest
     * @return Result of the RejectResourceShareInvitation operation returned by the service.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws OperationNotPermittedException
     *         The requested operation is not permitted.
     * @throws ResourceShareInvitationArnNotFoundException
     *         The Amazon Resource Name (ARN) for an invitation was not found.
     * @throws ResourceShareInvitationAlreadyAcceptedException
     *         The invitation was already accepted.
     * @throws ResourceShareInvitationAlreadyRejectedException
     *         The invitation was already rejected.
     * @throws ResourceShareInvitationExpiredException
     *         The invitation is expired.
     * @throws ServerInternalException
     *         The service could not respond to the request due to an internal problem.
     * @throws ServiceUnavailableException
     *         The service is not available.
     * @sample AWSRAM.RejectResourceShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/RejectResourceShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    RejectResourceShareInvitationResult rejectResourceShareInvitation(RejectResourceShareInvitationRequest rejectResourceShareInvitationRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource share.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is not valid.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws TagLimitExceededException
     *         The requested tags exceed the limit for your account.
     * @throws ResourceArnNotFoundException
     *         An Amazon Resource Name (ARN) was not found.
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
     * Removes the specified tags from the specified resource share.
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
     * Updates the specified resource share.
     * </p>
     * 
     * @param updateResourceShareRequest
     * @return Result of the UpdateResourceShare operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         A client token input parameter was reused with an operation, but at least one of the other input
     *         parameters is different from the previous call to the operation.
     * @throws MissingRequiredParameterException
     *         A required input parameter is missing.
     * @throws UnknownResourceException
     *         A specified resource was not found.
     * @throws MalformedArnException
     *         The format of an Amazon Resource Name (ARN) is not valid.
     * @throws InvalidClientTokenException
     *         A client token is not valid.
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
