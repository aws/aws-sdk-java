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
 * Alexa for Business makes it easy for you to use Alexa in your organization. Alexa for Business gives you the tools
 * you need to manage Alexa devices, enroll your users, and assign skills, at scale. You can build your own
 * context-aware voice skills using the Alexa Skills Kit, and the Alexa for Business APIs, and you can make these
 * available as private skills for your organization. Alexa for Business also makes it easy to voice-enable your
 * products and services, providing context-aware voice experiences for your customers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAlexaForBusinessAsync extends AmazonAlexaForBusiness {

    /**
     * <p>
     * Associates a device to a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or a manual
     * sync is required.
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
     * Associates a device to a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or a manual
     * sync is required.
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
     * Associates a skill group to a given room. This enables all skills in the associated skill group on all devices in
     * the room.
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
     * Associates a skill group to a given room. This enables all skills in the associated skill group on all devices in
     * the room.
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
     * Lists all tags for a specific resource.
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
     * Lists all tags for a specific resource.
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
     * Resets a device and its account to the known default settings by clearing all information and settings set by
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
     * Resets a device and its account to the known default settings by clearing all information and settings set by
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
