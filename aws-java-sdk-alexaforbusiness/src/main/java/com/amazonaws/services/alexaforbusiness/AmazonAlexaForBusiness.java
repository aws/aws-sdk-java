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
 * Alexa for Business helps you use Alexa in your organization. Alexa for Business provides you with the tools to manage
 * Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
 * using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
 * skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
 * providing context-aware voice experiences for your customers. Device makers building with the Alexa Voice Service
 * (AVS) can create fully integrated solutions, register their products with Alexa for Business, and manage them as
 * shared devices in their organization.
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
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
     * implicitly accepts access to this skill during enablement.
     * </p>
     * 
     * @param approveSkillRequest
     * @return Result of the ApproveSkill operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.ApproveSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ApproveSkill" target="_top">AWS
     *      API Documentation</a>
     */
    ApproveSkillResult approveSkill(ApproveSkillRequest approveSkillRequest);

    /**
     * <p>
     * Associates a contact with a given address book.
     * </p>
     * 
     * @param associateContactWithAddressBookRequest
     * @return Result of the AssociateContactWithAddressBook operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.AssociateContactWithAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateContactWithAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateContactWithAddressBookResult associateContactWithAddressBook(AssociateContactWithAddressBookRequest associateContactWithAddressBookRequest);

    /**
     * <p>
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or else a
     * manual sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return Result of the AssociateDeviceWithRoom operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.AssociateDeviceWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateDeviceWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateDeviceWithRoomResult associateDeviceWithRoom(AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest);

    /**
     * <p>
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
     * in the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return Result of the AssociateSkillGroupWithRoom operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.AssociateSkillGroupWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillGroupWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest);

    /**
     * <p>
     * Associates a skill with a skill group.
     * </p>
     * 
     * @param associateSkillWithSkillGroupRequest
     * @return Result of the AssociateSkillWithSkillGroup operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws SkillNotLinkedException
     *         The skill must be linked to a third-party account.
     * @sample AmazonAlexaForBusiness.AssociateSkillWithSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateSkillWithSkillGroupResult associateSkillWithSkillGroup(AssociateSkillWithSkillGroupRequest associateSkillWithSkillGroupRequest);

    /**
     * <p>
     * Makes a private skill available for enrolled users to enable on their devices.
     * </p>
     * 
     * @param associateSkillWithUsersRequest
     * @return Result of the AssociateSkillWithUsers operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.AssociateSkillWithUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithUsers"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateSkillWithUsersResult associateSkillWithUsers(AssociateSkillWithUsersRequest associateSkillWithUsersRequest);

    /**
     * <p>
     * Creates an address book with the specified details.
     * </p>
     * 
     * @param createAddressBookRequest
     * @return Result of the CreateAddressBook operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAddressBookResult createAddressBook(CreateAddressBookRequest createAddressBookRequest);

    /**
     * <p>
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or
     * weekly interval.
     * </p>
     * 
     * @param createBusinessReportScheduleRequest
     * @return Result of the CreateBusinessReportSchedule operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @sample AmazonAlexaForBusiness.CreateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBusinessReportScheduleResult createBusinessReportSchedule(CreateBusinessReportScheduleRequest createBusinessReportScheduleRequest);

    /**
     * <p>
     * Adds a new conference provider under the user's AWS account.
     * </p>
     * 
     * @param createConferenceProviderRequest
     * @return Result of the CreateConferenceProvider operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @sample AmazonAlexaForBusiness.CreateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConferenceProviderResult createConferenceProvider(CreateConferenceProviderRequest createConferenceProviderRequest);

    /**
     * <p>
     * Creates a contact with the specified details.
     * </p>
     * 
     * @param createContactRequest
     * @return Result of the CreateContact operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateContact" target="_top">AWS
     *      API Documentation</a>
     */
    CreateContactResult createContact(CreateContactRequest createContactRequest);

    /**
     * <p>
     * Creates a gateway group with the specified details.
     * </p>
     * 
     * @param createGatewayGroupRequest
     * @return Result of the CreateGatewayGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest createGatewayGroupRequest);

    /**
     * <p>
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
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
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
     *         The resource in the request is already in use.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Deletes an address book by the address book ARN.
     * </p>
     * 
     * @param deleteAddressBookRequest
     * @return Result of the DeleteAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAddressBookResult deleteAddressBook(DeleteAddressBookRequest deleteAddressBookRequest);

    /**
     * <p>
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param deleteBusinessReportScheduleRequest
     * @return Result of the DeleteBusinessReportSchedule operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBusinessReportScheduleResult deleteBusinessReportSchedule(DeleteBusinessReportScheduleRequest deleteBusinessReportScheduleRequest);

    /**
     * <p>
     * Deletes a conference provider.
     * </p>
     * 
     * @param deleteConferenceProviderRequest
     * @return Result of the DeleteConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DeleteConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConferenceProviderResult deleteConferenceProvider(DeleteConferenceProviderRequest deleteConferenceProviderRequest);

    /**
     * <p>
     * Deletes a contact by the contact ARN.
     * </p>
     * 
     * @param deleteContactRequest
     * @return Result of the DeleteContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteContact" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteContactResult deleteContact(DeleteContactRequest deleteContactRequest);

    /**
     * <p>
     * Removes a device from Alexa For Business.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws InvalidCertificateAuthorityException
     *         The Certificate Authority can't issue or revoke a certificate.
     * @sample AmazonAlexaForBusiness.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDeviceResult deleteDevice(DeleteDeviceRequest deleteDeviceRequest);

    /**
     * <p>
     * Deletes a gateway group.
     * </p>
     * 
     * @param deleteGatewayGroupRequest
     * @return Result of the DeleteGatewayGroup operation returned by the service.
     * @throws ResourceAssociatedException
     *         Another resource is associated with the resource in the request.
     * @sample AmazonAlexaForBusiness.DeleteGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGatewayGroupResult deleteGatewayGroup(DeleteGatewayGroupRequest deleteGatewayGroupRequest);

    /**
     * <p>
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRoomSkillParameterResult deleteRoomSkillParameter(DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest);

    /**
     * <p>
     * Unlinks a third-party account from a skill.
     * </p>
     * 
     * @param deleteSkillAuthorizationRequest
     * @return Result of the DeleteSkillAuthorization operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSkillAuthorizationResult deleteSkillAuthorization(DeleteSkillAuthorizationRequest deleteSkillAuthorizationRequest);

    /**
     * <p>
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @return Result of the DeleteSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Disassociates a contact from a given address book.
     * </p>
     * 
     * @param disassociateContactFromAddressBookRequest
     * @return Result of the DisassociateContactFromAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusiness.DisassociateContactFromAddressBook
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateContactFromAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateContactFromAddressBookResult disassociateContactFromAddressBook(
            DisassociateContactFromAddressBookRequest disassociateContactFromAddressBookRequest);

    /**
     * <p>
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
     * still registered to the account. The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @return Result of the DisassociateDeviceFromRoom operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.DisassociateDeviceFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateDeviceFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateDeviceFromRoomResult disassociateDeviceFromRoom(DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest);

    /**
     * <p>
     * Disassociates a skill from a skill group.
     * </p>
     * 
     * @param disassociateSkillFromSkillGroupRequest
     * @return Result of the DisassociateSkillFromSkillGroup operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DisassociateSkillFromSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSkillFromSkillGroupResult disassociateSkillFromSkillGroup(DisassociateSkillFromSkillGroupRequest disassociateSkillFromSkillGroupRequest);

    /**
     * <p>
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     * </p>
     * 
     * @param disassociateSkillFromUsersRequest
     * @return Result of the DisassociateSkillFromUsers operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DisassociateSkillFromUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromUsers"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSkillFromUsersResult disassociateSkillFromUsers(DisassociateSkillFromUsersRequest disassociateSkillFromUsersRequest);

    /**
     * <p>
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
     * the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @return Result of the DisassociateSkillGroupFromRoom operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DisassociateSkillGroupFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillGroupFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSkillGroupFromRoomResult disassociateSkillGroupFromRoom(DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest);

    /**
     * <p>
     * Forgets smart home appliances associated to a room.
     * </p>
     * 
     * @param forgetSmartHomeAppliancesRequest
     * @return Result of the ForgetSmartHomeAppliances operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ForgetSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ForgetSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    ForgetSmartHomeAppliancesResult forgetSmartHomeAppliances(ForgetSmartHomeAppliancesRequest forgetSmartHomeAppliancesRequest);

    /**
     * <p>
     * Gets address the book details by the address book ARN.
     * </p>
     * 
     * @param getAddressBookRequest
     * @return Result of the GetAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    GetAddressBookResult getAddressBook(GetAddressBookRequest getAddressBookRequest);

    /**
     * <p>
     * Retrieves the existing conference preferences.
     * </p>
     * 
     * @param getConferencePreferenceRequest
     * @return Result of the GetConferencePreference operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    GetConferencePreferenceResult getConferencePreference(GetConferencePreferenceRequest getConferencePreferenceRequest);

    /**
     * <p>
     * Gets details about a specific conference provider.
     * </p>
     * 
     * @param getConferenceProviderRequest
     * @return Result of the GetConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    GetConferenceProviderResult getConferenceProvider(GetConferenceProviderRequest getConferenceProviderRequest);

    /**
     * <p>
     * Gets the contact details by the contact ARN.
     * </p>
     * 
     * @param getContactRequest
     * @return Result of the GetContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetContact" target="_top">AWS
     *      API Documentation</a>
     */
    GetContactResult getContact(GetContactRequest getContactRequest);

    /**
     * <p>
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @return Result of the GetDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Retrieves the details of a gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return Result of the GetGateway operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGateway" target="_top">AWS
     *      API Documentation</a>
     */
    GetGatewayResult getGateway(GetGatewayRequest getGatewayRequest);

    /**
     * <p>
     * Retrieves the details of a gateway group.
     * </p>
     * 
     * @param getGatewayGroupRequest
     * @return Result of the GetGatewayGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest getGatewayGroupRequest);

    /**
     * <p>
     * Retrieves the configured values for the user enrollment invitation email template.
     * </p>
     * 
     * @param getInvitationConfigurationRequest
     * @return Result of the GetInvitationConfiguration operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetInvitationConfigurationResult getInvitationConfiguration(GetInvitationConfigurationRequest getInvitationConfigurationRequest);

    /**
     * <p>
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
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
     *         The resource is not found.
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
     *         The resource is not found.
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
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetSkillGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetSkillGroupResult getSkillGroup(GetSkillGroupRequest getSkillGroupRequest);

    /**
     * <p>
     * Lists the details of the schedules that a user configured.
     * </p>
     * 
     * @param listBusinessReportSchedulesRequest
     * @return Result of the ListBusinessReportSchedules operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListBusinessReportSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListBusinessReportSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    ListBusinessReportSchedulesResult listBusinessReportSchedules(ListBusinessReportSchedulesRequest listBusinessReportSchedulesRequest);

    /**
     * <p>
     * Lists conference providers under a specific AWS account.
     * </p>
     * 
     * @param listConferenceProvidersRequest
     * @return Result of the ListConferenceProviders operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListConferenceProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListConferenceProviders"
     *      target="_top">AWS API Documentation</a>
     */
    ListConferenceProvidersResult listConferenceProviders(ListConferenceProvidersRequest listConferenceProvidersRequest);

    /**
     * <p>
     * Lists the device event history, including device connection status, for up to 30 days.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return Result of the ListDeviceEvents operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListDeviceEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest listDeviceEventsRequest);

    /**
     * <p>
     * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
     * </p>
     * 
     * @param listGatewayGroupsRequest
     * @return Result of the ListGatewayGroups operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListGatewayGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGatewayGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListGatewayGroupsResult listGatewayGroups(ListGatewayGroupsRequest listGatewayGroupsRequest);

    /**
     * <p>
     * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional
     * gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that
     * gateway group ARN.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return Result of the ListGateways operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest);

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
     * Lists all categories in the Alexa skill store.
     * </p>
     * 
     * @param listSkillsStoreCategoriesRequest
     * @return Result of the ListSkillsStoreCategories operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkillsStoreCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreCategories"
     *      target="_top">AWS API Documentation</a>
     */
    ListSkillsStoreCategoriesResult listSkillsStoreCategories(ListSkillsStoreCategoriesRequest listSkillsStoreCategoriesRequest);

    /**
     * <p>
     * Lists all skills in the Alexa skill store by category.
     * </p>
     * 
     * @param listSkillsStoreSkillsByCategoryRequest
     * @return Result of the ListSkillsStoreSkillsByCategory operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkillsStoreSkillsByCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreSkillsByCategory"
     *      target="_top">AWS API Documentation</a>
     */
    ListSkillsStoreSkillsByCategoryResult listSkillsStoreSkillsByCategory(ListSkillsStoreSkillsByCategoryRequest listSkillsStoreSkillsByCategoryRequest);

    /**
     * <p>
     * Lists all of the smart home appliances associated with a room.
     * </p>
     * 
     * @param listSmartHomeAppliancesRequest
     * @return Result of the ListSmartHomeAppliances operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    ListSmartHomeAppliancesResult listSmartHomeAppliances(ListSmartHomeAppliancesRequest listSmartHomeAppliancesRequest);

    /**
     * <p>
     * Lists all tags for the specified resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Sets the conference preferences on a specific conference provider at the account level.
     * </p>
     * 
     * @param putConferencePreferenceRequest
     * @return Result of the PutConferencePreference operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.PutConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    PutConferencePreferenceResult putConferencePreference(PutConferencePreferenceRequest putConferencePreferenceRequest);

    /**
     * <p>
     * Configures the email template for the user enrollment invitation with the specified attributes.
     * </p>
     * 
     * @param putInvitationConfigurationRequest
     * @return Result of the PutInvitationConfiguration operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.PutInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutInvitationConfigurationResult putInvitationConfiguration(PutInvitationConfigurationRequest putInvitationConfigurationRequest);

    /**
     * <p>
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
     * parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @return Result of the PutRoomSkillParameter operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.PutRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    PutRoomSkillParameterResult putRoomSkillParameter(PutRoomSkillParameterRequest putRoomSkillParameterRequest);

    /**
     * <p>
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
     * the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
     * IAM role.
     * </p>
     * 
     * @param putSkillAuthorizationRequest
     * @return Result of the PutSkillAuthorization operation returned by the service.
     * @throws UnauthorizedException
     *         The caller has no permissions to operate on the resource involved in the API call.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.PutSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    PutSkillAuthorizationResult putSkillAuthorization(PutSkillAuthorizationRequest putSkillAuthorizationRequest);

    /**
     * <p>
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
     * (AVS).
     * </p>
     * 
     * @param registerAVSDeviceRequest
     * @return Result of the RegisterAVSDevice operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws InvalidDeviceException
     *         The device is in an invalid state.
     * @sample AmazonAlexaForBusiness.RegisterAVSDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RegisterAVSDevice"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterAVSDeviceResult registerAVSDevice(RegisterAVSDeviceRequest registerAVSDeviceRequest);

    /**
     * <p>
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
     * to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
     * ApproveSkill API.
     * </p>
     * 
     * @param rejectSkillRequest
     * @return Result of the RejectSkill operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.RejectSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RejectSkill" target="_top">AWS
     *      API Documentation</a>
     */
    RejectSkillResult rejectSkill(RejectSkillRequest rejectSkillRequest);

    /**
     * <p>
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill
     * developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @return Result of the ResolveRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.RevokeInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RevokeInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    RevokeInvitationResult revokeInvitation(RevokeInvitationRequest revokeInvitationRequest);

    /**
     * <p>
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchAddressBooksRequest
     * @return Result of the SearchAddressBooks operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchAddressBooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchAddressBooks"
     *      target="_top">AWS API Documentation</a>
     */
    SearchAddressBooksResult searchAddressBooks(SearchAddressBooksRequest searchAddressBooksRequest);

    /**
     * <p>
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchContactsRequest
     * @return Result of the SearchContacts operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchContacts"
     *      target="_top">AWS API Documentation</a>
     */
    SearchContactsResult searchContacts(SearchContactsRequest searchContactsRequest);

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
     *         The resource is not found.
     * @throws InvalidUserStatusException
     *         The attempt to update a user is invalid due to the user's current status.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.SendInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SendInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    SendInvitationResult sendInvitation(SendInvitationRequest sendInvitationRequest);

    /**
     * <p>
     * Resets a device and its account to the known default settings, by clearing all information and settings set by
     * previous users.
     * </p>
     * 
     * @param startDeviceSyncRequest
     * @return Result of the StartDeviceSync operation returned by the service.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.StartDeviceSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartDeviceSync"
     *      target="_top">AWS API Documentation</a>
     */
    StartDeviceSyncResult startDeviceSync(StartDeviceSyncRequest startDeviceSyncRequest);

    /**
     * <p>
     * Initiates the discovery of any smart home appliances associated with the room.
     * </p>
     * 
     * @param startSmartHomeApplianceDiscoveryRequest
     * @return Result of the StartSmartHomeApplianceDiscovery operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.StartSmartHomeApplianceDiscovery
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartSmartHomeApplianceDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    StartSmartHomeApplianceDiscoveryResult startSmartHomeApplianceDiscovery(StartSmartHomeApplianceDiscoveryRequest startSmartHomeApplianceDiscoveryRequest);

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
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
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates address book details by the address book ARN.
     * </p>
     * 
     * @param updateAddressBookRequest
     * @return Result of the UpdateAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.UpdateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAddressBookResult updateAddressBook(UpdateAddressBookRequest updateAddressBookRequest);

    /**
     * <p>
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param updateBusinessReportScheduleRequest
     * @return Result of the UpdateBusinessReportSchedule operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.UpdateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBusinessReportScheduleResult updateBusinessReportSchedule(UpdateBusinessReportScheduleRequest updateBusinessReportScheduleRequest);

    /**
     * <p>
     * Updates an existing conference provider's settings.
     * </p>
     * 
     * @param updateConferenceProviderRequest
     * @return Result of the UpdateConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.UpdateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConferenceProviderResult updateConferenceProvider(UpdateConferenceProviderRequest updateConferenceProviderRequest);

    /**
     * <p>
     * Updates the contact details by the contact ARN.
     * </p>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateContact" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateContactResult updateContact(UpdateContactRequest updateContactRequest);

    /**
     * <p>
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDeviceResult updateDevice(UpdateDeviceRequest updateDeviceRequest);

    /**
     * <p>
     * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left
     * unmodified.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return Result of the UpdateGateway operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @sample AmazonAlexaForBusiness.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateGatewayResult updateGateway(UpdateGatewayRequest updateGatewayRequest);

    /**
     * <p>
     * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value
     * is left unmodified.
     * </p>
     * 
     * @param updateGatewayGroupRequest
     * @return Result of the UpdateGatewayGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @sample AmazonAlexaForBusiness.UpdateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGatewayGroupResult updateGatewayGroup(UpdateGatewayGroupRequest updateGatewayGroupRequest);

    /**
     * <p>
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
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
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
