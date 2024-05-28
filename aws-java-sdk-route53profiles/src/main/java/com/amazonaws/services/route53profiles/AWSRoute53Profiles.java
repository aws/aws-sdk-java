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
package com.amazonaws.services.route53profiles;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53profiles.model.*;

/**
 * Interface for accessing Route 53 Profiles.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53profiles.AbstractAWSRoute53Profiles} instead.
 * </p>
 * <p>
 * <p>
 * With Amazon Route 53 Profiles you can share Route 53 configurations with VPCs and AWS accounts
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53Profiles {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53profiles";

    /**
     * <p>
     * Associates a Route 53 Profiles profile with a VPC. A VPC can have only one Profile associated with it, but a
     * Profile can be associated with 1000 of VPCs (and you can request a higher quota). For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities">https://
     * docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities</a>.
     * </p>
     * 
     * @param associateProfileRequest
     * @return Result of the AssociateProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ResourceExistsException
     *         The resource you are trying to associate, has already been associated.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.AssociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateProfileResult associateProfile(AssociateProfileRequest associateProfileRequest);

    /**
     * <p>
     * Associates a DNS reource configuration to a Route 53 Profile.
     * </p>
     * 
     * @param associateResourceToProfileRequest
     * @return Result of the AssociateResourceToProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.AssociateResourceToProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateResourceToProfile"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateResourceToProfileResult associateResourceToProfile(AssociateResourceToProfileRequest associateResourceToProfileRequest);

    /**
     * <p>
     * Creates an empty Route 53 Profile.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateProfileResult createProfile(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Deletes the specified Route 53 Profile. Before you can delete a profile, you must first disassociate it from all
     * VPCs.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Dissociates a specified Route 53 Profile from the specified VPC.
     * </p>
     * 
     * @param disassociateProfileRequest
     * @return Result of the DisassociateProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.DisassociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateProfileResult disassociateProfile(DisassociateProfileRequest disassociateProfileRequest);

    /**
     * <p>
     * Dissoaciated a specified resource, from the Route 53 Profile.
     * </p>
     * 
     * @param disassociateResourceFromProfileRequest
     * @return Result of the DisassociateResourceFromProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.DisassociateResourceFromProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateResourceFromProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateResourceFromProfileResult disassociateResourceFromProfile(DisassociateResourceFromProfileRequest disassociateResourceFromProfileRequest);

    /**
     * <p>
     * Returns information about a specified Route 53 Profile, such as whether whether the Profile is shared, and the
     * current status of the Profile.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetProfileResult getProfile(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Retrieves a Route 53 Profile association for a VPC. A VPC can have only one Profile association, but a Profile
     * can be associated with up to 5000 VPCs.
     * </p>
     * 
     * @param getProfileAssociationRequest
     * @return Result of the GetProfileAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.GetProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetProfileAssociationResult getProfileAssociation(GetProfileAssociationRequest getProfileAssociationRequest);

    /**
     * <p>
     * Returns information about a specified Route 53 Profile resource association.
     * </p>
     * 
     * @param getProfileResourceAssociationRequest
     * @return Result of the GetProfileResourceAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.GetProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetProfileResourceAssociationResult getProfileResourceAssociation(GetProfileResourceAssociationRequest getProfileResourceAssociationRequest);

    /**
     * <p>
     * Lists all the VPCs that the specified Route 53 Profile is associated with.
     * </p>
     * 
     * @param listProfileAssociationsRequest
     * @return Result of the ListProfileAssociations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> you provided isn;t valid.
     * @sample AWSRoute53Profiles.ListProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfileAssociationsResult listProfileAssociations(ListProfileAssociationsRequest listProfileAssociationsRequest);

    /**
     * <p>
     * Lists all the resource associations for the specified Route 53 Profile.
     * </p>
     * 
     * @param listProfileResourceAssociationsRequest
     * @return Result of the ListProfileResourceAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> you provided isn;t valid.
     * @sample AWSRoute53Profiles.ListProfileResourceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileResourceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListProfileResourceAssociationsResult listProfileResourceAssociations(ListProfileResourceAssociationsRequest listProfileResourceAssociationsRequest);

    /**
     * <p>
     * Lists all the Route 53 Profiles associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> you provided isn;t valid.
     * @sample AWSRoute53Profiles.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListProfilesResult listProfiles(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @sample AWSRoute53Profiles.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified Route 53 Profile resourse association.
     * </p>
     * 
     * @param updateProfileResourceAssociationRequest
     * @return Result of the UpdateProfileResourceAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you are associating is not found.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         An internal server error occured. Retry your request.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws ValidationException
     *         You have provided an invalid command.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified operation.
     * @throws ConflictException
     *         The request you submitted conflicts with an existing request.
     * @sample AWSRoute53Profiles.UpdateProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UpdateProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProfileResourceAssociationResult updateProfileResourceAssociation(UpdateProfileResourceAssociationRequest updateProfileResourceAssociationRequest);

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
