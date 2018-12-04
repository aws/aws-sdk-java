/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.alexaforbusiness.model.*;

/**
 * Interface for accessing Alexa For Business.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.alexaforbusiness.AbstractAmazonAlexaForBusiness} instead.
 * </p>
 * <p>
 * <p>
 * Alexa for Business makes it easy for you to use Alexa in your organization. Alexa for Business gives you the tools
 * you need to manage Alexa devices, enroll your users, and assign skills, at scale. You can build your own
 * context-aware voice skills using the Alexa Skills Kit, and the Alexa for Business APIs, and you can make these
 * available as private skills for your organization. Alexa for Business also makes it easy to voice-enable your
 * products and services, providing context-aware voice experiences for your customers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAlexaForBusiness {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "a4b";

    /**
     * <p>
     * Associates a device to a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or a manual
     * sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return Result of the AssociateDeviceWithRoom operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.AssociateDeviceWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateDeviceWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateDeviceWithRoomResult associateDeviceWithRoom(AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest);

    /**
     * <p>
     * Associates a skill group to a given room. This enables all skills in the associated skill group on all devices in
     * the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return Result of the AssociateSkillGroupWithRoom operation returned by the service.
     * @sample AmazonAlexaForBusiness.AssociateSkillGroupWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillGroupWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest);

    /**
     * <p>
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @throws AlreadyExistsException
     *         The resource being created already exists. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateProfileResult createProfile(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates a room with the specified details.
     * </p>
     * 
     * @param createRoomRequest
     * @return Result of the CreateRoom operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists. HTTP Status Code: 400
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRoomResult createRoom(CreateRoomRequest createRoomRequest);

    /**
     * <p>
     * Creates a skill group with a specified name and description.
     * </p>
     * 
     * @param createSkillGroupRequest
     * @return Result of the CreateSkillGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists. HTTP Status Code: 400
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSkillGroupResult createSkillGroup(CreateSkillGroupRequest createSkillGroupRequest);

    /**
     * <p>
     * Creates a user.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceInUseException
     *         The resource in the request is already in use. HTTP Status Code: 400
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes a room by the room ARN.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return Result of the DeleteRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoom" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRoomResult deleteRoom(DeleteRoomRequest deleteRoomRequest);

    /**
     * <p>
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     * </p>
     * 
     * @param deleteRoomSkillParameterRequest
     * @return Result of the DeleteRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusiness.DeleteRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRoomSkillParameterResult deleteRoomSkillParameter(DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest);

    /**
     * <p>
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @return Result of the DeleteSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSkillGroupResult deleteSkillGroup(DeleteSkillGroupRequest deleteSkillGroupRequest);

    /**
     * <p>
     * Deletes a specified user by user ARN and enrollment ARN.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
     * still registered to the account. The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @return Result of the DisassociateDeviceFromRoom operation returned by the service.
     * @sample AmazonAlexaForBusiness.DisassociateDeviceFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateDeviceFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateDeviceFromRoomResult disassociateDeviceFromRoom(DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest);

    /**
     * <p>
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
     * the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @return Result of the DisassociateSkillGroupFromRoom operation returned by the service.
     * @sample AmazonAlexaForBusiness.DisassociateSkillGroupFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillGroupFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSkillGroupFromRoomResult disassociateSkillGroupFromRoom(DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest);

    /**
     * <p>
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @return Result of the GetDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetProfileResult getProfile(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Gets room details by room ARN.
     * </p>
     * 
     * @param getRoomRequest
     * @return Result of the GetRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    GetRoomResult getRoom(GetRoomRequest getRoomRequest);

    /**
     * <p>
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     * </p>
     * 
     * @param getRoomSkillParameterRequest
     * @return Result of the GetRoomSkillParameter operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    GetRoomSkillParameterResult getRoomSkillParameter(GetRoomSkillParameterRequest getRoomSkillParameterRequest);

    /**
     * <p>
     * Gets skill group details by skill group ARN.
     * </p>
     * 
     * @param getSkillGroupRequest
     * @return Result of the GetSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetSkillGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetSkillGroupResult getSkillGroup(GetSkillGroupRequest getSkillGroupRequest);

    /**
     * <p>
     * Lists all enabled skills in a specific skill group.
     * </p>
     * 
     * @param listSkillsRequest
     * @return Result of the ListSkills operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkills
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkills" target="_top">AWS
     *      API Documentation</a>
     */
    ListSkillsResult listSkills(ListSkillsRequest listSkillsRequest);

    /**
     * <p>
     * Lists all tags for a specific resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
     * parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @return Result of the PutRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusiness.PutRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    PutRoomSkillParameterResult putRoomSkillParameter(PutRoomSkillParameterRequest putRoomSkillParameterRequest);

    /**
     * <p>
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill
     * developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @return Result of the ResolveRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.ResolveRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ResolveRoom" target="_top">AWS
     *      API Documentation</a>
     */
    ResolveRoomResult resolveRoom(ResolveRoomRequest resolveRoomRequest);

    /**
     * <p>
     * Revokes an invitation and invalidates the enrollment URL.
     * </p>
     * 
     * @param revokeInvitationRequest
     * @return Result of the RevokeInvitation operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.RevokeInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RevokeInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    RevokeInvitationResult revokeInvitation(RevokeInvitationRequest revokeInvitationRequest);

    /**
     * <p>
     * Searches devices and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return Result of the SearchDevices operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchDevices" target="_top">AWS
     *      API Documentation</a>
     */
    SearchDevicesResult searchDevices(SearchDevicesRequest searchDevicesRequest);

    /**
     * <p>
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return Result of the SearchProfiles operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    SearchProfilesResult searchProfiles(SearchProfilesRequest searchProfilesRequest);

    /**
     * <p>
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchRoomsRequest
     * @return Result of the SearchRooms operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchRooms" target="_top">AWS
     *      API Documentation</a>
     */
    SearchRoomsResult searchRooms(SearchRoomsRequest searchRoomsRequest);

    /**
     * <p>
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchSkillGroupsRequest
     * @return Result of the SearchSkillGroups operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchSkillGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchSkillGroups"
     *      target="_top">AWS API Documentation</a>
     */
    SearchSkillGroupsResult searchSkillGroups(SearchSkillGroupsRequest searchSkillGroupsRequest);

    /**
     * <p>
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchUsersRequest
     * @return Result of the SearchUsers operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchUsers" target="_top">AWS
     *      API Documentation</a>
     */
    SearchUsersResult searchUsers(SearchUsersRequest searchUsersRequest);

    /**
     * <p>
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this
     * operation again, whichever comes first.
     * </p>
     * 
     * @param sendInvitationRequest
     * @return Result of the SendInvitation operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws InvalidUserStatusException
     *         The attempt to update a user is invalid due to the user's current status. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.SendInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SendInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    SendInvitationResult sendInvitation(SendInvitationRequest sendInvitationRequest);

    /**
     * <p>
     * Resets a device and its account to the known default settings by clearing all information and settings set by
     * previous users.
     * </p>
     * 
     * @param startDeviceSyncRequest
     * @return Result of the StartDeviceSync operation returned by the service.
     * @sample AmazonAlexaForBusiness.StartDeviceSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartDeviceSync"
     *      target="_top">AWS API Documentation</a>
     */
    StartDeviceSyncResult startDeviceSync(StartDeviceSyncRequest startDeviceSyncRequest);

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDeviceResult updateDevice(UpdateDeviceRequest updateDeviceRequest);

    /**
     * <p>
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws NameInUseException
     *         The name sent in the request is already in use. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateProfileResult updateProfile(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates room details by room ARN.
     * </p>
     * 
     * @param updateRoomRequest
     * @return Result of the UpdateRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws NameInUseException
     *         The name sent in the request is already in use. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateRoomResult updateRoom(UpdateRoomRequest updateRoomRequest);

    /**
     * <p>
     * Updates skill group details by skill group ARN.
     * </p>
     * 
     * @param updateSkillGroupRequest
     * @return Result of the UpdateSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws NameInUseException
     *         The name sent in the request is already in use. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSkillGroupResult updateSkillGroup(UpdateSkillGroupRequest updateSkillGroupRequest);

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
