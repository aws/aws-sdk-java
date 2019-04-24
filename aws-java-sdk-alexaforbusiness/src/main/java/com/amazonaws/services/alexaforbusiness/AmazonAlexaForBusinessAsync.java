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

import com.amazonaws.services.alexaforbusiness.model.*;

/**
 * Interface for accessing Alexa For Business asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.alexaforbusiness.AbstractAmazonAlexaForBusinessAsync} instead.
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
public interface AmazonAlexaForBusinessAsync extends AmazonAlexaForBusiness {

    /**
     * <p>
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
     * implicitly accepts access to this skill during enablement.
     * </p>
     * 
     * @param approveSkillRequest
     * @return A Java Future containing the result of the ApproveSkill operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ApproveSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ApproveSkill" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ApproveSkillResult> approveSkillAsync(ApproveSkillRequest approveSkillRequest);

    /**
     * <p>
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
     * implicitly accepts access to this skill during enablement.
     * </p>
     * 
     * @param approveSkillRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApproveSkill operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ApproveSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ApproveSkill" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ApproveSkillResult> approveSkillAsync(ApproveSkillRequest approveSkillRequest,
            com.amazonaws.handlers.AsyncHandler<ApproveSkillRequest, ApproveSkillResult> asyncHandler);

    /**
     * <p>
     * Associates a contact with a given address book.
     * </p>
     * 
     * @param associateContactWithAddressBookRequest
     * @return A Java Future containing the result of the AssociateContactWithAddressBook operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.AssociateContactWithAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateContactWithAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateContactWithAddressBookResult> associateContactWithAddressBookAsync(
            AssociateContactWithAddressBookRequest associateContactWithAddressBookRequest);

    /**
     * <p>
     * Associates a contact with a given address book.
     * </p>
     * 
     * @param associateContactWithAddressBookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateContactWithAddressBook operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.AssociateContactWithAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateContactWithAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateContactWithAddressBookResult> associateContactWithAddressBookAsync(
            AssociateContactWithAddressBookRequest associateContactWithAddressBookRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateContactWithAddressBookRequest, AssociateContactWithAddressBookResult> asyncHandler);

    /**
     * <p>
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or else a
     * manual sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return A Java Future containing the result of the AssociateDeviceWithRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.AssociateDeviceWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateDeviceWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDeviceWithRoomResult> associateDeviceWithRoomAsync(AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest);

    /**
     * <p>
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or else a
     * manual sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDeviceWithRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.AssociateDeviceWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateDeviceWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDeviceWithRoomResult> associateDeviceWithRoomAsync(AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDeviceWithRoomRequest, AssociateDeviceWithRoomResult> asyncHandler);

    /**
     * <p>
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
     * in the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return A Java Future containing the result of the AssociateSkillGroupWithRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.AssociateSkillGroupWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillGroupWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSkillGroupWithRoomResult> associateSkillGroupWithRoomAsync(
            AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest);

    /**
     * <p>
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
     * in the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSkillGroupWithRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.AssociateSkillGroupWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillGroupWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSkillGroupWithRoomResult> associateSkillGroupWithRoomAsync(
            AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSkillGroupWithRoomRequest, AssociateSkillGroupWithRoomResult> asyncHandler);

    /**
     * <p>
     * Associates a skill with a skill group.
     * </p>
     * 
     * @param associateSkillWithSkillGroupRequest
     * @return A Java Future containing the result of the AssociateSkillWithSkillGroup operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.AssociateSkillWithSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSkillWithSkillGroupResult> associateSkillWithSkillGroupAsync(
            AssociateSkillWithSkillGroupRequest associateSkillWithSkillGroupRequest);

    /**
     * <p>
     * Associates a skill with a skill group.
     * </p>
     * 
     * @param associateSkillWithSkillGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSkillWithSkillGroup operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.AssociateSkillWithSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSkillWithSkillGroupResult> associateSkillWithSkillGroupAsync(
            AssociateSkillWithSkillGroupRequest associateSkillWithSkillGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSkillWithSkillGroupRequest, AssociateSkillWithSkillGroupResult> asyncHandler);

    /**
     * <p>
     * Makes a private skill available for enrolled users to enable on their devices.
     * </p>
     * 
     * @param associateSkillWithUsersRequest
     * @return A Java Future containing the result of the AssociateSkillWithUsers operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.AssociateSkillWithUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSkillWithUsersResult> associateSkillWithUsersAsync(AssociateSkillWithUsersRequest associateSkillWithUsersRequest);

    /**
     * <p>
     * Makes a private skill available for enrolled users to enable on their devices.
     * </p>
     * 
     * @param associateSkillWithUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSkillWithUsers operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.AssociateSkillWithUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSkillWithUsersResult> associateSkillWithUsersAsync(AssociateSkillWithUsersRequest associateSkillWithUsersRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSkillWithUsersRequest, AssociateSkillWithUsersResult> asyncHandler);

    /**
     * <p>
     * Creates an address book with the specified details.
     * </p>
     * 
     * @param createAddressBookRequest
     * @return A Java Future containing the result of the CreateAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAddressBookResult> createAddressBookAsync(CreateAddressBookRequest createAddressBookRequest);

    /**
     * <p>
     * Creates an address book with the specified details.
     * </p>
     * 
     * @param createAddressBookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAddressBookResult> createAddressBookAsync(CreateAddressBookRequest createAddressBookRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAddressBookRequest, CreateAddressBookResult> asyncHandler);

    /**
     * <p>
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or
     * weekly interval.
     * </p>
     * 
     * @param createBusinessReportScheduleRequest
     * @return A Java Future containing the result of the CreateBusinessReportSchedule operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.CreateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBusinessReportScheduleResult> createBusinessReportScheduleAsync(
            CreateBusinessReportScheduleRequest createBusinessReportScheduleRequest);

    /**
     * <p>
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or
     * weekly interval.
     * </p>
     * 
     * @param createBusinessReportScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBusinessReportSchedule operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBusinessReportScheduleResult> createBusinessReportScheduleAsync(
            CreateBusinessReportScheduleRequest createBusinessReportScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBusinessReportScheduleRequest, CreateBusinessReportScheduleResult> asyncHandler);

    /**
     * <p>
     * Adds a new conference provider under the user's AWS account.
     * </p>
     * 
     * @param createConferenceProviderRequest
     * @return A Java Future containing the result of the CreateConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConferenceProviderResult> createConferenceProviderAsync(CreateConferenceProviderRequest createConferenceProviderRequest);

    /**
     * <p>
     * Adds a new conference provider under the user's AWS account.
     * </p>
     * 
     * @param createConferenceProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConferenceProviderResult> createConferenceProviderAsync(CreateConferenceProviderRequest createConferenceProviderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConferenceProviderRequest, CreateConferenceProviderResult> asyncHandler);

    /**
     * <p>
     * Creates a contact with the specified details.
     * </p>
     * 
     * @param createContactRequest
     * @return A Java Future containing the result of the CreateContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactResult> createContactAsync(CreateContactRequest createContactRequest);

    /**
     * <p>
     * Creates a contact with the specified details.
     * </p>
     * 
     * @param createContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateContactResult> createContactAsync(CreateContactRequest createContactRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContactRequest, CreateContactResult> asyncHandler);

    /**
     * <p>
     * Creates a gateway group with the specified details.
     * </p>
     * 
     * @param createGatewayGroupRequest
     * @return A Java Future containing the result of the CreateGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGatewayGroupResult> createGatewayGroupAsync(CreateGatewayGroupRequest createGatewayGroupRequest);

    /**
     * <p>
     * Creates a gateway group with the specified details.
     * </p>
     * 
     * @param createGatewayGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGatewayGroupResult> createGatewayGroupAsync(CreateGatewayGroupRequest createGatewayGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGatewayGroupRequest, CreateGatewayGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a room with the specified details.
     * </p>
     * 
     * @param createRoomRequest
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest);

    /**
     * <p>
     * Creates a room with the specified details.
     * </p>
     * 
     * @param createRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoomRequest, CreateRoomResult> asyncHandler);

    /**
     * <p>
     * Creates a skill group with a specified name and description.
     * </p>
     * 
     * @param createSkillGroupRequest
     * @return A Java Future containing the result of the CreateSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSkillGroupResult> createSkillGroupAsync(CreateSkillGroupRequest createSkillGroupRequest);

    /**
     * <p>
     * Creates a skill group with a specified name and description.
     * </p>
     * 
     * @param createSkillGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSkillGroupResult> createSkillGroupAsync(CreateSkillGroupRequest createSkillGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSkillGroupRequest, CreateSkillGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a user.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a user.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an address book by the address book ARN.
     * </p>
     * 
     * @param deleteAddressBookRequest
     * @return A Java Future containing the result of the DeleteAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddressBookResult> deleteAddressBookAsync(DeleteAddressBookRequest deleteAddressBookRequest);

    /**
     * <p>
     * Deletes an address book by the address book ARN.
     * </p>
     * 
     * @param deleteAddressBookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAddressBookResult> deleteAddressBookAsync(DeleteAddressBookRequest deleteAddressBookRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAddressBookRequest, DeleteAddressBookResult> asyncHandler);

    /**
     * <p>
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param deleteBusinessReportScheduleRequest
     * @return A Java Future containing the result of the DeleteBusinessReportSchedule operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.DeleteBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBusinessReportScheduleResult> deleteBusinessReportScheduleAsync(
            DeleteBusinessReportScheduleRequest deleteBusinessReportScheduleRequest);

    /**
     * <p>
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param deleteBusinessReportScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBusinessReportSchedule operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBusinessReportScheduleResult> deleteBusinessReportScheduleAsync(
            DeleteBusinessReportScheduleRequest deleteBusinessReportScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBusinessReportScheduleRequest, DeleteBusinessReportScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes a conference provider.
     * </p>
     * 
     * @param deleteConferenceProviderRequest
     * @return A Java Future containing the result of the DeleteConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConferenceProviderResult> deleteConferenceProviderAsync(DeleteConferenceProviderRequest deleteConferenceProviderRequest);

    /**
     * <p>
     * Deletes a conference provider.
     * </p>
     * 
     * @param deleteConferenceProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConferenceProviderResult> deleteConferenceProviderAsync(DeleteConferenceProviderRequest deleteConferenceProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConferenceProviderRequest, DeleteConferenceProviderResult> asyncHandler);

    /**
     * <p>
     * Deletes a contact by the contact ARN.
     * </p>
     * 
     * @param deleteContactRequest
     * @return A Java Future containing the result of the DeleteContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(DeleteContactRequest deleteContactRequest);

    /**
     * <p>
     * Deletes a contact by the contact ARN.
     * </p>
     * 
     * @param deleteContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContactResult> deleteContactAsync(DeleteContactRequest deleteContactRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContactRequest, DeleteContactResult> asyncHandler);

    /**
     * <p>
     * Removes a device from Alexa For Business.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest);

    /**
     * <p>
     * Removes a device from Alexa For Business.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler);

    /**
     * <p>
     * Deletes a gateway group.
     * </p>
     * 
     * @param deleteGatewayGroupRequest
     * @return A Java Future containing the result of the DeleteGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayGroupResult> deleteGatewayGroupAsync(DeleteGatewayGroupRequest deleteGatewayGroupRequest);

    /**
     * <p>
     * Deletes a gateway group.
     * </p>
     * 
     * @param deleteGatewayGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayGroupResult> deleteGatewayGroupAsync(DeleteGatewayGroupRequest deleteGatewayGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGatewayGroupRequest, DeleteGatewayGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a room by the room ARN.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest);

    /**
     * <p>
     * Deletes a room by the room ARN.
     * </p>
     * 
     * @param deleteRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoomRequest, DeleteRoomResult> asyncHandler);

    /**
     * <p>
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     * </p>
     * 
     * @param deleteRoomSkillParameterRequest
     * @return A Java Future containing the result of the DeleteRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomSkillParameterResult> deleteRoomSkillParameterAsync(DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest);

    /**
     * <p>
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     * </p>
     * 
     * @param deleteRoomSkillParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomSkillParameterResult> deleteRoomSkillParameterAsync(DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoomSkillParameterRequest, DeleteRoomSkillParameterResult> asyncHandler);

    /**
     * <p>
     * Unlinks a third-party account from a skill.
     * </p>
     * 
     * @param deleteSkillAuthorizationRequest
     * @return A Java Future containing the result of the DeleteSkillAuthorization operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSkillAuthorizationResult> deleteSkillAuthorizationAsync(DeleteSkillAuthorizationRequest deleteSkillAuthorizationRequest);

    /**
     * <p>
     * Unlinks a third-party account from a skill.
     * </p>
     * 
     * @param deleteSkillAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSkillAuthorization operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSkillAuthorizationResult> deleteSkillAuthorizationAsync(DeleteSkillAuthorizationRequest deleteSkillAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSkillAuthorizationRequest, DeleteSkillAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @return A Java Future containing the result of the DeleteSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSkillGroupResult> deleteSkillGroupAsync(DeleteSkillGroupRequest deleteSkillGroupRequest);

    /**
     * <p>
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSkillGroupResult> deleteSkillGroupAsync(DeleteSkillGroupRequest deleteSkillGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSkillGroupRequest, DeleteSkillGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified user by user ARN and enrollment ARN.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a specified user by user ARN and enrollment ARN.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Disassociates a contact from a given address book.
     * </p>
     * 
     * @param disassociateContactFromAddressBookRequest
     * @return A Java Future containing the result of the DisassociateContactFromAddressBook operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.DisassociateContactFromAddressBook
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateContactFromAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateContactFromAddressBookResult> disassociateContactFromAddressBookAsync(
            DisassociateContactFromAddressBookRequest disassociateContactFromAddressBookRequest);

    /**
     * <p>
     * Disassociates a contact from a given address book.
     * </p>
     * 
     * @param disassociateContactFromAddressBookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateContactFromAddressBook operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DisassociateContactFromAddressBook
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateContactFromAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateContactFromAddressBookResult> disassociateContactFromAddressBookAsync(
            DisassociateContactFromAddressBookRequest disassociateContactFromAddressBookRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateContactFromAddressBookRequest, DisassociateContactFromAddressBookResult> asyncHandler);

    /**
     * <p>
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
     * still registered to the account. The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @return A Java Future containing the result of the DisassociateDeviceFromRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DisassociateDeviceFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateDeviceFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDeviceFromRoomResult> disassociateDeviceFromRoomAsync(
            DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest);

    /**
     * <p>
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
     * still registered to the account. The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDeviceFromRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DisassociateDeviceFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateDeviceFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDeviceFromRoomResult> disassociateDeviceFromRoomAsync(
            DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDeviceFromRoomRequest, DisassociateDeviceFromRoomResult> asyncHandler);

    /**
     * <p>
     * Disassociates a skill from a skill group.
     * </p>
     * 
     * @param disassociateSkillFromSkillGroupRequest
     * @return A Java Future containing the result of the DisassociateSkillFromSkillGroup operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.DisassociateSkillFromSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSkillFromSkillGroupResult> disassociateSkillFromSkillGroupAsync(
            DisassociateSkillFromSkillGroupRequest disassociateSkillFromSkillGroupRequest);

    /**
     * <p>
     * Disassociates a skill from a skill group.
     * </p>
     * 
     * @param disassociateSkillFromSkillGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSkillFromSkillGroup operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DisassociateSkillFromSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSkillFromSkillGroupResult> disassociateSkillFromSkillGroupAsync(
            DisassociateSkillFromSkillGroupRequest disassociateSkillFromSkillGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSkillFromSkillGroupRequest, DisassociateSkillFromSkillGroupResult> asyncHandler);

    /**
     * <p>
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     * </p>
     * 
     * @param disassociateSkillFromUsersRequest
     * @return A Java Future containing the result of the DisassociateSkillFromUsers operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.DisassociateSkillFromUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSkillFromUsersResult> disassociateSkillFromUsersAsync(
            DisassociateSkillFromUsersRequest disassociateSkillFromUsersRequest);

    /**
     * <p>
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     * </p>
     * 
     * @param disassociateSkillFromUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSkillFromUsers operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DisassociateSkillFromUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSkillFromUsersResult> disassociateSkillFromUsersAsync(
            DisassociateSkillFromUsersRequest disassociateSkillFromUsersRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSkillFromUsersRequest, DisassociateSkillFromUsersResult> asyncHandler);

    /**
     * <p>
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
     * the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @return A Java Future containing the result of the DisassociateSkillGroupFromRoom operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.DisassociateSkillGroupFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillGroupFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSkillGroupFromRoomResult> disassociateSkillGroupFromRoomAsync(
            DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest);

    /**
     * <p>
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
     * the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSkillGroupFromRoom operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.DisassociateSkillGroupFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillGroupFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSkillGroupFromRoomResult> disassociateSkillGroupFromRoomAsync(
            DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSkillGroupFromRoomRequest, DisassociateSkillGroupFromRoomResult> asyncHandler);

    /**
     * <p>
     * Forgets smart home appliances associated to a room.
     * </p>
     * 
     * @param forgetSmartHomeAppliancesRequest
     * @return A Java Future containing the result of the ForgetSmartHomeAppliances operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ForgetSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ForgetSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ForgetSmartHomeAppliancesResult> forgetSmartHomeAppliancesAsync(
            ForgetSmartHomeAppliancesRequest forgetSmartHomeAppliancesRequest);

    /**
     * <p>
     * Forgets smart home appliances associated to a room.
     * </p>
     * 
     * @param forgetSmartHomeAppliancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ForgetSmartHomeAppliances operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ForgetSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ForgetSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ForgetSmartHomeAppliancesResult> forgetSmartHomeAppliancesAsync(
            ForgetSmartHomeAppliancesRequest forgetSmartHomeAppliancesRequest,
            com.amazonaws.handlers.AsyncHandler<ForgetSmartHomeAppliancesRequest, ForgetSmartHomeAppliancesResult> asyncHandler);

    /**
     * <p>
     * Gets address the book details by the address book ARN.
     * </p>
     * 
     * @param getAddressBookRequest
     * @return A Java Future containing the result of the GetAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAddressBookResult> getAddressBookAsync(GetAddressBookRequest getAddressBookRequest);

    /**
     * <p>
     * Gets address the book details by the address book ARN.
     * </p>
     * 
     * @param getAddressBookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAddressBookResult> getAddressBookAsync(GetAddressBookRequest getAddressBookRequest,
            com.amazonaws.handlers.AsyncHandler<GetAddressBookRequest, GetAddressBookResult> asyncHandler);

    /**
     * <p>
     * Retrieves the existing conference preferences.
     * </p>
     * 
     * @param getConferencePreferenceRequest
     * @return A Java Future containing the result of the GetConferencePreference operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConferencePreferenceResult> getConferencePreferenceAsync(GetConferencePreferenceRequest getConferencePreferenceRequest);

    /**
     * <p>
     * Retrieves the existing conference preferences.
     * </p>
     * 
     * @param getConferencePreferenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConferencePreference operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConferencePreferenceResult> getConferencePreferenceAsync(GetConferencePreferenceRequest getConferencePreferenceRequest,
            com.amazonaws.handlers.AsyncHandler<GetConferencePreferenceRequest, GetConferencePreferenceResult> asyncHandler);

    /**
     * <p>
     * Gets details about a specific conference provider.
     * </p>
     * 
     * @param getConferenceProviderRequest
     * @return A Java Future containing the result of the GetConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConferenceProviderResult> getConferenceProviderAsync(GetConferenceProviderRequest getConferenceProviderRequest);

    /**
     * <p>
     * Gets details about a specific conference provider.
     * </p>
     * 
     * @param getConferenceProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConferenceProviderResult> getConferenceProviderAsync(GetConferenceProviderRequest getConferenceProviderRequest,
            com.amazonaws.handlers.AsyncHandler<GetConferenceProviderRequest, GetConferenceProviderResult> asyncHandler);

    /**
     * <p>
     * Gets the contact details by the contact ARN.
     * </p>
     * 
     * @param getContactRequest
     * @return A Java Future containing the result of the GetContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactResult> getContactAsync(GetContactRequest getContactRequest);

    /**
     * <p>
     * Gets the contact details by the contact ARN.
     * </p>
     * 
     * @param getContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContactResult> getContactAsync(GetContactRequest getContactRequest,
            com.amazonaws.handlers.AsyncHandler<GetContactRequest, GetContactResult> asyncHandler);

    /**
     * <p>
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return A Java Future containing the result of the GetGateway operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest getGatewayRequest);

    /**
     * <p>
     * Retrieves the details of a gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGateway operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGatewayResult> getGatewayAsync(GetGatewayRequest getGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<GetGatewayRequest, GetGatewayResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a gateway group.
     * </p>
     * 
     * @param getGatewayGroupRequest
     * @return A Java Future containing the result of the GetGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGatewayGroupResult> getGatewayGroupAsync(GetGatewayGroupRequest getGatewayGroupRequest);

    /**
     * <p>
     * Retrieves the details of a gateway group.
     * </p>
     * 
     * @param getGatewayGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGatewayGroupResult> getGatewayGroupAsync(GetGatewayGroupRequest getGatewayGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGatewayGroupRequest, GetGatewayGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configured values for the user enrollment invitation email template.
     * </p>
     * 
     * @param getInvitationConfigurationRequest
     * @return A Java Future containing the result of the GetInvitationConfiguration operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationConfigurationResult> getInvitationConfigurationAsync(
            GetInvitationConfigurationRequest getInvitationConfigurationRequest);

    /**
     * <p>
     * Retrieves the configured values for the user enrollment invitation email template.
     * </p>
     * 
     * @param getInvitationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvitationConfiguration operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationConfigurationResult> getInvitationConfigurationAsync(
            GetInvitationConfigurationRequest getInvitationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvitationConfigurationRequest, GetInvitationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler);

    /**
     * <p>
     * Gets room details by room ARN.
     * </p>
     * 
     * @param getRoomRequest
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest);

    /**
     * <p>
     * Gets room details by room ARN.
     * </p>
     * 
     * @param getRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoomRequest, GetRoomResult> asyncHandler);

    /**
     * <p>
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     * </p>
     * 
     * @param getRoomSkillParameterRequest
     * @return A Java Future containing the result of the GetRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRoomSkillParameterResult> getRoomSkillParameterAsync(GetRoomSkillParameterRequest getRoomSkillParameterRequest);

    /**
     * <p>
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     * </p>
     * 
     * @param getRoomSkillParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRoomSkillParameterResult> getRoomSkillParameterAsync(GetRoomSkillParameterRequest getRoomSkillParameterRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoomSkillParameterRequest, GetRoomSkillParameterResult> asyncHandler);

    /**
     * <p>
     * Gets skill group details by skill group ARN.
     * </p>
     * 
     * @param getSkillGroupRequest
     * @return A Java Future containing the result of the GetSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.GetSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetSkillGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSkillGroupResult> getSkillGroupAsync(GetSkillGroupRequest getSkillGroupRequest);

    /**
     * <p>
     * Gets skill group details by skill group ARN.
     * </p>
     * 
     * @param getSkillGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.GetSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetSkillGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSkillGroupResult> getSkillGroupAsync(GetSkillGroupRequest getSkillGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetSkillGroupRequest, GetSkillGroupResult> asyncHandler);

    /**
     * <p>
     * Lists the details of the schedules that a user configured.
     * </p>
     * 
     * @param listBusinessReportSchedulesRequest
     * @return A Java Future containing the result of the ListBusinessReportSchedules operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListBusinessReportSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListBusinessReportSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBusinessReportSchedulesResult> listBusinessReportSchedulesAsync(
            ListBusinessReportSchedulesRequest listBusinessReportSchedulesRequest);

    /**
     * <p>
     * Lists the details of the schedules that a user configured.
     * </p>
     * 
     * @param listBusinessReportSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBusinessReportSchedules operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListBusinessReportSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListBusinessReportSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBusinessReportSchedulesResult> listBusinessReportSchedulesAsync(
            ListBusinessReportSchedulesRequest listBusinessReportSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBusinessReportSchedulesRequest, ListBusinessReportSchedulesResult> asyncHandler);

    /**
     * <p>
     * Lists conference providers under a specific AWS account.
     * </p>
     * 
     * @param listConferenceProvidersRequest
     * @return A Java Future containing the result of the ListConferenceProviders operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListConferenceProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListConferenceProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConferenceProvidersResult> listConferenceProvidersAsync(ListConferenceProvidersRequest listConferenceProvidersRequest);

    /**
     * <p>
     * Lists conference providers under a specific AWS account.
     * </p>
     * 
     * @param listConferenceProvidersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConferenceProviders operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListConferenceProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListConferenceProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConferenceProvidersResult> listConferenceProvidersAsync(ListConferenceProvidersRequest listConferenceProvidersRequest,
            com.amazonaws.handlers.AsyncHandler<ListConferenceProvidersRequest, ListConferenceProvidersResult> asyncHandler);

    /**
     * <p>
     * Lists the device event history, including device connection status, for up to 30 days.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return A Java Future containing the result of the ListDeviceEvents operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListDeviceEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest listDeviceEventsRequest);

    /**
     * <p>
     * Lists the device event history, including device connection status, for up to 30 days.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceEvents operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListDeviceEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceEventsResult> listDeviceEventsAsync(ListDeviceEventsRequest listDeviceEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceEventsRequest, ListDeviceEventsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
     * </p>
     * 
     * @param listGatewayGroupsRequest
     * @return A Java Future containing the result of the ListGatewayGroups operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListGatewayGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGatewayGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewayGroupsResult> listGatewayGroupsAsync(ListGatewayGroupsRequest listGatewayGroupsRequest);

    /**
     * <p>
     * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
     * </p>
     * 
     * @param listGatewayGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGatewayGroups operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListGatewayGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGatewayGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewayGroupsResult> listGatewayGroupsAsync(ListGatewayGroupsRequest listGatewayGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGatewayGroupsRequest, ListGatewayGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional
     * gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that
     * gateway group ARN.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest);

    /**
     * <p>
     * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional
     * gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that
     * gateway group ARN.
     * </p>
     * 
     * @param listGatewaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler);

    /**
     * <p>
     * Lists all enabled skills in a specific skill group.
     * </p>
     * 
     * @param listSkillsRequest
     * @return A Java Future containing the result of the ListSkills operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListSkills
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkills" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSkillsResult> listSkillsAsync(ListSkillsRequest listSkillsRequest);

    /**
     * <p>
     * Lists all enabled skills in a specific skill group.
     * </p>
     * 
     * @param listSkillsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSkills operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListSkills
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkills" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSkillsResult> listSkillsAsync(ListSkillsRequest listSkillsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSkillsRequest, ListSkillsResult> asyncHandler);

    /**
     * <p>
     * Lists all categories in the Alexa skill store.
     * </p>
     * 
     * @param listSkillsStoreCategoriesRequest
     * @return A Java Future containing the result of the ListSkillsStoreCategories operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListSkillsStoreCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreCategories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSkillsStoreCategoriesResult> listSkillsStoreCategoriesAsync(
            ListSkillsStoreCategoriesRequest listSkillsStoreCategoriesRequest);

    /**
     * <p>
     * Lists all categories in the Alexa skill store.
     * </p>
     * 
     * @param listSkillsStoreCategoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSkillsStoreCategories operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListSkillsStoreCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreCategories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSkillsStoreCategoriesResult> listSkillsStoreCategoriesAsync(
            ListSkillsStoreCategoriesRequest listSkillsStoreCategoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSkillsStoreCategoriesRequest, ListSkillsStoreCategoriesResult> asyncHandler);

    /**
     * <p>
     * Lists all skills in the Alexa skill store by category.
     * </p>
     * 
     * @param listSkillsStoreSkillsByCategoryRequest
     * @return A Java Future containing the result of the ListSkillsStoreSkillsByCategory operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.ListSkillsStoreSkillsByCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreSkillsByCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSkillsStoreSkillsByCategoryResult> listSkillsStoreSkillsByCategoryAsync(
            ListSkillsStoreSkillsByCategoryRequest listSkillsStoreSkillsByCategoryRequest);

    /**
     * <p>
     * Lists all skills in the Alexa skill store by category.
     * </p>
     * 
     * @param listSkillsStoreSkillsByCategoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSkillsStoreSkillsByCategory operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListSkillsStoreSkillsByCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreSkillsByCategory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSkillsStoreSkillsByCategoryResult> listSkillsStoreSkillsByCategoryAsync(
            ListSkillsStoreSkillsByCategoryRequest listSkillsStoreSkillsByCategoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListSkillsStoreSkillsByCategoryRequest, ListSkillsStoreSkillsByCategoryResult> asyncHandler);

    /**
     * <p>
     * Lists all of the smart home appliances associated with a room.
     * </p>
     * 
     * @param listSmartHomeAppliancesRequest
     * @return A Java Future containing the result of the ListSmartHomeAppliances operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSmartHomeAppliancesResult> listSmartHomeAppliancesAsync(ListSmartHomeAppliancesRequest listSmartHomeAppliancesRequest);

    /**
     * <p>
     * Lists all of the smart home appliances associated with a room.
     * </p>
     * 
     * @param listSmartHomeAppliancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSmartHomeAppliances operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSmartHomeAppliancesResult> listSmartHomeAppliancesAsync(ListSmartHomeAppliancesRequest listSmartHomeAppliancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSmartHomeAppliancesRequest, ListSmartHomeAppliancesResult> asyncHandler);

    /**
     * <p>
     * Lists all tags for the specified resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Lists all tags for the specified resource.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Sets the conference preferences on a specific conference provider at the account level.
     * </p>
     * 
     * @param putConferencePreferenceRequest
     * @return A Java Future containing the result of the PutConferencePreference operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.PutConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConferencePreferenceResult> putConferencePreferenceAsync(PutConferencePreferenceRequest putConferencePreferenceRequest);

    /**
     * <p>
     * Sets the conference preferences on a specific conference provider at the account level.
     * </p>
     * 
     * @param putConferencePreferenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConferencePreference operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.PutConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConferencePreferenceResult> putConferencePreferenceAsync(PutConferencePreferenceRequest putConferencePreferenceRequest,
            com.amazonaws.handlers.AsyncHandler<PutConferencePreferenceRequest, PutConferencePreferenceResult> asyncHandler);

    /**
     * <p>
     * Configures the email template for the user enrollment invitation with the specified attributes.
     * </p>
     * 
     * @param putInvitationConfigurationRequest
     * @return A Java Future containing the result of the PutInvitationConfiguration operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.PutInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInvitationConfigurationResult> putInvitationConfigurationAsync(
            PutInvitationConfigurationRequest putInvitationConfigurationRequest);

    /**
     * <p>
     * Configures the email template for the user enrollment invitation with the specified attributes.
     * </p>
     * 
     * @param putInvitationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInvitationConfiguration operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.PutInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInvitationConfigurationResult> putInvitationConfigurationAsync(
            PutInvitationConfigurationRequest putInvitationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutInvitationConfigurationRequest, PutInvitationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
     * parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @return A Java Future containing the result of the PutRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.PutRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRoomSkillParameterResult> putRoomSkillParameterAsync(PutRoomSkillParameterRequest putRoomSkillParameterRequest);

    /**
     * <p>
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
     * parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.PutRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRoomSkillParameterResult> putRoomSkillParameterAsync(PutRoomSkillParameterRequest putRoomSkillParameterRequest,
            com.amazonaws.handlers.AsyncHandler<PutRoomSkillParameterRequest, PutRoomSkillParameterResult> asyncHandler);

    /**
     * <p>
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
     * the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
     * IAM role.
     * </p>
     * 
     * @param putSkillAuthorizationRequest
     * @return A Java Future containing the result of the PutSkillAuthorization operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.PutSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSkillAuthorizationResult> putSkillAuthorizationAsync(PutSkillAuthorizationRequest putSkillAuthorizationRequest);

    /**
     * <p>
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
     * the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
     * IAM role.
     * </p>
     * 
     * @param putSkillAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSkillAuthorization operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.PutSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSkillAuthorizationResult> putSkillAuthorizationAsync(PutSkillAuthorizationRequest putSkillAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<PutSkillAuthorizationRequest, PutSkillAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
     * (AVS).
     * </p>
     * 
     * @param registerAVSDeviceRequest
     * @return A Java Future containing the result of the RegisterAVSDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.RegisterAVSDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RegisterAVSDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAVSDeviceResult> registerAVSDeviceAsync(RegisterAVSDeviceRequest registerAVSDeviceRequest);

    /**
     * <p>
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
     * (AVS).
     * </p>
     * 
     * @param registerAVSDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterAVSDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.RegisterAVSDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RegisterAVSDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAVSDeviceResult> registerAVSDeviceAsync(RegisterAVSDeviceRequest registerAVSDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterAVSDeviceRequest, RegisterAVSDeviceResult> asyncHandler);

    /**
     * <p>
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
     * to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
     * ApproveSkill API.
     * </p>
     * 
     * @param rejectSkillRequest
     * @return A Java Future containing the result of the RejectSkill operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.RejectSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RejectSkill" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RejectSkillResult> rejectSkillAsync(RejectSkillRequest rejectSkillRequest);

    /**
     * <p>
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
     * to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
     * ApproveSkill API.
     * </p>
     * 
     * @param rejectSkillRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectSkill operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.RejectSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RejectSkill" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RejectSkillResult> rejectSkillAsync(RejectSkillRequest rejectSkillRequest,
            com.amazonaws.handlers.AsyncHandler<RejectSkillRequest, RejectSkillResult> asyncHandler);

    /**
     * <p>
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill
     * developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @return A Java Future containing the result of the ResolveRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.ResolveRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ResolveRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResolveRoomResult> resolveRoomAsync(ResolveRoomRequest resolveRoomRequest);

    /**
     * <p>
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill
     * developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.ResolveRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ResolveRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResolveRoomResult> resolveRoomAsync(ResolveRoomRequest resolveRoomRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveRoomRequest, ResolveRoomResult> asyncHandler);

    /**
     * <p>
     * Revokes an invitation and invalidates the enrollment URL.
     * </p>
     * 
     * @param revokeInvitationRequest
     * @return A Java Future containing the result of the RevokeInvitation operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.RevokeInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RevokeInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokeInvitationResult> revokeInvitationAsync(RevokeInvitationRequest revokeInvitationRequest);

    /**
     * <p>
     * Revokes an invitation and invalidates the enrollment URL.
     * </p>
     * 
     * @param revokeInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeInvitation operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.RevokeInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RevokeInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokeInvitationResult> revokeInvitationAsync(RevokeInvitationRequest revokeInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeInvitationRequest, RevokeInvitationResult> asyncHandler);

    /**
     * <p>
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchAddressBooksRequest
     * @return A Java Future containing the result of the SearchAddressBooks operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SearchAddressBooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchAddressBooks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAddressBooksResult> searchAddressBooksAsync(SearchAddressBooksRequest searchAddressBooksRequest);

    /**
     * <p>
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchAddressBooksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchAddressBooks operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SearchAddressBooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchAddressBooks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAddressBooksResult> searchAddressBooksAsync(SearchAddressBooksRequest searchAddressBooksRequest,
            com.amazonaws.handlers.AsyncHandler<SearchAddressBooksRequest, SearchAddressBooksResult> asyncHandler);

    /**
     * <p>
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchContactsRequest
     * @return A Java Future containing the result of the SearchContacts operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SearchContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchContacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchContactsResult> searchContactsAsync(SearchContactsRequest searchContactsRequest);

    /**
     * <p>
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchContactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchContacts operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SearchContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchContacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchContactsResult> searchContactsAsync(SearchContactsRequest searchContactsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchContactsRequest, SearchContactsResult> asyncHandler);

    /**
     * <p>
     * Searches devices and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return A Java Future containing the result of the SearchDevices operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest searchDevicesRequest);

    /**
     * <p>
     * Searches devices and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchDevices operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchDevicesResult> searchDevicesAsync(SearchDevicesRequest searchDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchDevicesRequest, SearchDevicesResult> asyncHandler);

    /**
     * <p>
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return A Java Future containing the result of the SearchProfiles operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest searchProfilesRequest);

    /**
     * <p>
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchProfiles operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProfilesResult> searchProfilesAsync(SearchProfilesRequest searchProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchProfilesRequest, SearchProfilesResult> asyncHandler);

    /**
     * <p>
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchRoomsRequest
     * @return A Java Future containing the result of the SearchRooms operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SearchRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchRooms" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchRoomsResult> searchRoomsAsync(SearchRoomsRequest searchRoomsRequest);

    /**
     * <p>
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchRoomsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchRooms operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SearchRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchRooms" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchRoomsResult> searchRoomsAsync(SearchRoomsRequest searchRoomsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRoomsRequest, SearchRoomsResult> asyncHandler);

    /**
     * <p>
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchSkillGroupsRequest
     * @return A Java Future containing the result of the SearchSkillGroups operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SearchSkillGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchSkillGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchSkillGroupsResult> searchSkillGroupsAsync(SearchSkillGroupsRequest searchSkillGroupsRequest);

    /**
     * <p>
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchSkillGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchSkillGroups operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SearchSkillGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchSkillGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchSkillGroupsResult> searchSkillGroupsAsync(SearchSkillGroupsRequest searchSkillGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchSkillGroupsRequest, SearchSkillGroupsResult> asyncHandler);

    /**
     * <p>
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchUsersRequest
     * @return A Java Future containing the result of the SearchUsers operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchUsers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest searchUsersRequest);

    /**
     * <p>
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchUsers operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchUsers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest searchUsersRequest,
            com.amazonaws.handlers.AsyncHandler<SearchUsersRequest, SearchUsersResult> asyncHandler);

    /**
     * <p>
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this
     * operation again, whichever comes first.
     * </p>
     * 
     * @param sendInvitationRequest
     * @return A Java Future containing the result of the SendInvitation operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.SendInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SendInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendInvitationResult> sendInvitationAsync(SendInvitationRequest sendInvitationRequest);

    /**
     * <p>
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this
     * operation again, whichever comes first.
     * </p>
     * 
     * @param sendInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendInvitation operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.SendInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SendInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendInvitationResult> sendInvitationAsync(SendInvitationRequest sendInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<SendInvitationRequest, SendInvitationResult> asyncHandler);

    /**
     * <p>
     * Resets a device and its account to the known default settings, by clearing all information and settings set by
     * previous users.
     * </p>
     * 
     * @param startDeviceSyncRequest
     * @return A Java Future containing the result of the StartDeviceSync operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.StartDeviceSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartDeviceSync"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDeviceSyncResult> startDeviceSyncAsync(StartDeviceSyncRequest startDeviceSyncRequest);

    /**
     * <p>
     * Resets a device and its account to the known default settings, by clearing all information and settings set by
     * previous users.
     * </p>
     * 
     * @param startDeviceSyncRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDeviceSync operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.StartDeviceSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartDeviceSync"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDeviceSyncResult> startDeviceSyncAsync(StartDeviceSyncRequest startDeviceSyncRequest,
            com.amazonaws.handlers.AsyncHandler<StartDeviceSyncRequest, StartDeviceSyncResult> asyncHandler);

    /**
     * <p>
     * Initiates the discovery of any smart home appliances associated with the room.
     * </p>
     * 
     * @param startSmartHomeApplianceDiscoveryRequest
     * @return A Java Future containing the result of the StartSmartHomeApplianceDiscovery operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.StartSmartHomeApplianceDiscovery
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartSmartHomeApplianceDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSmartHomeApplianceDiscoveryResult> startSmartHomeApplianceDiscoveryAsync(
            StartSmartHomeApplianceDiscoveryRequest startSmartHomeApplianceDiscoveryRequest);

    /**
     * <p>
     * Initiates the discovery of any smart home appliances associated with the room.
     * </p>
     * 
     * @param startSmartHomeApplianceDiscoveryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSmartHomeApplianceDiscovery operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.StartSmartHomeApplianceDiscovery
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartSmartHomeApplianceDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSmartHomeApplianceDiscoveryResult> startSmartHomeApplianceDiscoveryAsync(
            StartSmartHomeApplianceDiscoveryRequest startSmartHomeApplianceDiscoveryRequest,
            com.amazonaws.handlers.AsyncHandler<StartSmartHomeApplianceDiscoveryRequest, StartSmartHomeApplianceDiscoveryResult> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates address book details by the address book ARN.
     * </p>
     * 
     * @param updateAddressBookRequest
     * @return A Java Future containing the result of the UpdateAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAddressBookResult> updateAddressBookAsync(UpdateAddressBookRequest updateAddressBookRequest);

    /**
     * <p>
     * Updates address book details by the address book ARN.
     * </p>
     * 
     * @param updateAddressBookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAddressBookResult> updateAddressBookAsync(UpdateAddressBookRequest updateAddressBookRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAddressBookRequest, UpdateAddressBookResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param updateBusinessReportScheduleRequest
     * @return A Java Future containing the result of the UpdateBusinessReportSchedule operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsync.UpdateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBusinessReportScheduleResult> updateBusinessReportScheduleAsync(
            UpdateBusinessReportScheduleRequest updateBusinessReportScheduleRequest);

    /**
     * <p>
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param updateBusinessReportScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBusinessReportSchedule operation returned by the
     *         service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBusinessReportScheduleResult> updateBusinessReportScheduleAsync(
            UpdateBusinessReportScheduleRequest updateBusinessReportScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBusinessReportScheduleRequest, UpdateBusinessReportScheduleResult> asyncHandler);

    /**
     * <p>
     * Updates an existing conference provider's settings.
     * </p>
     * 
     * @param updateConferenceProviderRequest
     * @return A Java Future containing the result of the UpdateConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConferenceProviderResult> updateConferenceProviderAsync(UpdateConferenceProviderRequest updateConferenceProviderRequest);

    /**
     * <p>
     * Updates an existing conference provider's settings.
     * </p>
     * 
     * @param updateConferenceProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConferenceProvider operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConferenceProviderResult> updateConferenceProviderAsync(UpdateConferenceProviderRequest updateConferenceProviderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConferenceProviderRequest, UpdateConferenceProviderResult> asyncHandler);

    /**
     * <p>
     * Updates the contact details by the contact ARN.
     * </p>
     * 
     * @param updateContactRequest
     * @return A Java Future containing the result of the UpdateContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest);

    /**
     * <p>
     * Updates the contact details by the contact ARN.
     * </p>
     * 
     * @param updateContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContact operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest updateContactRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler);

    /**
     * <p>
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return A Java Future containing the result of the UpdateDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest updateDeviceRequest);

    /**
     * <p>
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDevice operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest updateDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceRequest, UpdateDeviceResult> asyncHandler);

    /**
     * <p>
     * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left
     * unmodified.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return A Java Future containing the result of the UpdateGateway operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(UpdateGatewayRequest updateGatewayRequest);

    /**
     * <p>
     * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left
     * unmodified.
     * </p>
     * 
     * @param updateGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGateway operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(UpdateGatewayRequest updateGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayRequest, UpdateGatewayResult> asyncHandler);

    /**
     * <p>
     * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value
     * is left unmodified.
     * </p>
     * 
     * @param updateGatewayGroupRequest
     * @return A Java Future containing the result of the UpdateGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayGroupResult> updateGatewayGroupAsync(UpdateGatewayGroupRequest updateGatewayGroupRequest);

    /**
     * <p>
     * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value
     * is left unmodified.
     * </p>
     * 
     * @param updateGatewayGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGatewayGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayGroupResult> updateGatewayGroupAsync(UpdateGatewayGroupRequest updateGatewayGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayGroupRequest, UpdateGatewayGroupResult> asyncHandler);

    /**
     * <p>
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler);

    /**
     * <p>
     * Updates room details by room ARN.
     * </p>
     * 
     * @param updateRoomRequest
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest);

    /**
     * <p>
     * Updates room details by room ARN.
     * </p>
     * 
     * @param updateRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoomRequest, UpdateRoomResult> asyncHandler);

    /**
     * <p>
     * Updates skill group details by skill group ARN.
     * </p>
     * 
     * @param updateSkillGroupRequest
     * @return A Java Future containing the result of the UpdateSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsync.UpdateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSkillGroupResult> updateSkillGroupAsync(UpdateSkillGroupRequest updateSkillGroupRequest);

    /**
     * <p>
     * Updates skill group details by skill group ARN.
     * </p>
     * 
     * @param updateSkillGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSkillGroup operation returned by the service.
     * @sample AmazonAlexaForBusinessAsyncHandler.UpdateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSkillGroupResult> updateSkillGroupAsync(UpdateSkillGroupRequest updateSkillGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSkillGroupRequest, UpdateSkillGroupResult> asyncHandler);

}
