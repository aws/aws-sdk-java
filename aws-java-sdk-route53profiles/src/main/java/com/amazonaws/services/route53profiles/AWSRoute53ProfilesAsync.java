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

import com.amazonaws.services.route53profiles.model.*;

/**
 * Interface for accessing Route 53 Profiles asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53profiles.AbstractAWSRoute53ProfilesAsync} instead.
 * </p>
 * <p>
 * <p>
 * With Amazon Route 53 Profiles you can share Route 53 configurations with VPCs and AWS accounts
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53ProfilesAsync extends AWSRoute53Profiles {

    /**
     * <p>
     * Associates a Route 53 Profiles profile with a VPC. A VPC can have only one Profile associated with it, but a
     * Profile can be associated with 1000 of VPCs (and you can request a higher quota). For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities">https://
     * docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities</a>.
     * </p>
     * 
     * @param associateProfileRequest
     * @return A Java Future containing the result of the AssociateProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.AssociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProfileResult> associateProfileAsync(AssociateProfileRequest associateProfileRequest);

    /**
     * <p>
     * Associates a Route 53 Profiles profile with a VPC. A VPC can have only one Profile associated with it, but a
     * Profile can be associated with 1000 of VPCs (and you can request a higher quota). For more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities">https://
     * docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html#limits-api-entities</a>.
     * </p>
     * 
     * @param associateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.AssociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProfileResult> associateProfileAsync(AssociateProfileRequest associateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateProfileRequest, AssociateProfileResult> asyncHandler);

    /**
     * <p>
     * Associates a DNS reource configuration to a Route 53 Profile.
     * </p>
     * 
     * @param associateResourceToProfileRequest
     * @return A Java Future containing the result of the AssociateResourceToProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.AssociateResourceToProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateResourceToProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceToProfileResult> associateResourceToProfileAsync(
            AssociateResourceToProfileRequest associateResourceToProfileRequest);

    /**
     * <p>
     * Associates a DNS reource configuration to a Route 53 Profile.
     * </p>
     * 
     * @param associateResourceToProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResourceToProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.AssociateResourceToProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateResourceToProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceToProfileResult> associateResourceToProfileAsync(
            AssociateResourceToProfileRequest associateResourceToProfileRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceToProfileRequest, AssociateResourceToProfileResult> asyncHandler);

    /**
     * <p>
     * Creates an empty Route 53 Profile.
     * </p>
     * 
     * @param createProfileRequest
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates an empty Route 53 Profile.
     * </p>
     * 
     * @param createProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Route 53 Profile. Before you can delete a profile, you must first disassociate it from all
     * VPCs.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes the specified Route 53 Profile. Before you can delete a profile, you must first disassociate it from all
     * VPCs.
     * </p>
     * 
     * @param deleteProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler);

    /**
     * <p>
     * Dissociates a specified Route 53 Profile from the specified VPC.
     * </p>
     * 
     * @param disassociateProfileRequest
     * @return A Java Future containing the result of the DisassociateProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.DisassociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProfileResult> disassociateProfileAsync(DisassociateProfileRequest disassociateProfileRequest);

    /**
     * <p>
     * Dissociates a specified Route 53 Profile from the specified VPC.
     * </p>
     * 
     * @param disassociateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.DisassociateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProfileResult> disassociateProfileAsync(DisassociateProfileRequest disassociateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateProfileRequest, DisassociateProfileResult> asyncHandler);

    /**
     * <p>
     * Dissoaciated a specified resource, from the Route 53 Profile.
     * </p>
     * 
     * @param disassociateResourceFromProfileRequest
     * @return A Java Future containing the result of the DisassociateResourceFromProfile operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsync.DisassociateResourceFromProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateResourceFromProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceFromProfileResult> disassociateResourceFromProfileAsync(
            DisassociateResourceFromProfileRequest disassociateResourceFromProfileRequest);

    /**
     * <p>
     * Dissoaciated a specified resource, from the Route 53 Profile.
     * </p>
     * 
     * @param disassociateResourceFromProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResourceFromProfile operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsyncHandler.DisassociateResourceFromProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/DisassociateResourceFromProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceFromProfileResult> disassociateResourceFromProfileAsync(
            DisassociateResourceFromProfileRequest disassociateResourceFromProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceFromProfileRequest, DisassociateResourceFromProfileResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specified Route 53 Profile, such as whether whether the Profile is shared, and the
     * current status of the Profile.
     * </p>
     * 
     * @param getProfileRequest
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Returns information about a specified Route 53 Profile, such as whether whether the Profile is shared, and the
     * current status of the Profile.
     * </p>
     * 
     * @param getProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler);

    /**
     * <p>
     * Retrieves a Route 53 Profile association for a VPC. A VPC can have only one Profile association, but a Profile
     * can be associated with up to 5000 VPCs.
     * </p>
     * 
     * @param getProfileAssociationRequest
     * @return A Java Future containing the result of the GetProfileAssociation operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.GetProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileAssociationResult> getProfileAssociationAsync(GetProfileAssociationRequest getProfileAssociationRequest);

    /**
     * <p>
     * Retrieves a Route 53 Profile association for a VPC. A VPC can have only one Profile association, but a Profile
     * can be associated with up to 5000 VPCs.
     * </p>
     * 
     * @param getProfileAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfileAssociation operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.GetProfileAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileAssociationResult> getProfileAssociationAsync(GetProfileAssociationRequest getProfileAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileAssociationRequest, GetProfileAssociationResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specified Route 53 Profile resource association.
     * </p>
     * 
     * @param getProfileResourceAssociationRequest
     * @return A Java Future containing the result of the GetProfileResourceAssociation operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsync.GetProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResourceAssociationResult> getProfileResourceAssociationAsync(
            GetProfileResourceAssociationRequest getProfileResourceAssociationRequest);

    /**
     * <p>
     * Returns information about a specified Route 53 Profile resource association.
     * </p>
     * 
     * @param getProfileResourceAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfileResourceAssociation operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsyncHandler.GetProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/GetProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResourceAssociationResult> getProfileResourceAssociationAsync(
            GetProfileResourceAssociationRequest getProfileResourceAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileResourceAssociationRequest, GetProfileResourceAssociationResult> asyncHandler);

    /**
     * <p>
     * Lists all the VPCs that the specified Route 53 Profile is associated with.
     * </p>
     * 
     * @param listProfileAssociationsRequest
     * @return A Java Future containing the result of the ListProfileAssociations operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.ListProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileAssociationsResult> listProfileAssociationsAsync(ListProfileAssociationsRequest listProfileAssociationsRequest);

    /**
     * <p>
     * Lists all the VPCs that the specified Route 53 Profile is associated with.
     * </p>
     * 
     * @param listProfileAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileAssociations operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.ListProfileAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileAssociationsResult> listProfileAssociationsAsync(ListProfileAssociationsRequest listProfileAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileAssociationsRequest, ListProfileAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists all the resource associations for the specified Route 53 Profile.
     * </p>
     * 
     * @param listProfileResourceAssociationsRequest
     * @return A Java Future containing the result of the ListProfileResourceAssociations operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsync.ListProfileResourceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileResourceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileResourceAssociationsResult> listProfileResourceAssociationsAsync(
            ListProfileResourceAssociationsRequest listProfileResourceAssociationsRequest);

    /**
     * <p>
     * Lists all the resource associations for the specified Route 53 Profile.
     * </p>
     * 
     * @param listProfileResourceAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileResourceAssociations operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsyncHandler.ListProfileResourceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileResourceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileResourceAssociationsResult> listProfileResourceAssociationsAsync(
            ListProfileResourceAssociationsRequest listProfileResourceAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileResourceAssociationsRequest, ListProfileResourceAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists all the Route 53 Profiles associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listProfilesRequest
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * Lists all the Route 53 Profiles associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53ProfilesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53ProfilesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified Route 53 Profile resourse association.
     * </p>
     * 
     * @param updateProfileResourceAssociationRequest
     * @return A Java Future containing the result of the UpdateProfileResourceAssociation operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsync.UpdateProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UpdateProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResourceAssociationResult> updateProfileResourceAssociationAsync(
            UpdateProfileResourceAssociationRequest updateProfileResourceAssociationRequest);

    /**
     * <p>
     * Updates the specified Route 53 Profile resourse association.
     * </p>
     * 
     * @param updateProfileResourceAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfileResourceAssociation operation returned by the
     *         service.
     * @sample AWSRoute53ProfilesAsyncHandler.UpdateProfileResourceAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UpdateProfileResourceAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResourceAssociationResult> updateProfileResourceAssociationAsync(
            UpdateProfileResourceAssociationRequest updateProfileResourceAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileResourceAssociationRequest, UpdateProfileResourceAssociationResult> asyncHandler);

}
