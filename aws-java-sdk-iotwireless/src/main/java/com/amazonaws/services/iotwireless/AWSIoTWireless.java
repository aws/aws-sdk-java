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
package com.amazonaws.services.iotwireless;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotwireless.model.*;

/**
 * Interface for accessing AWS IoT Wireless.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotwireless.AbstractAWSIoTWireless} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Wireless provides bi-directional communication between internet-connected wireless devices and the AWS Cloud.
 * To onboard both LoRaWAN and Sidewalk devices to AWS IoT, use the IoT Wireless API. These wireless devices use the Low
 * Power Wide Area Networking (LPWAN) communication protocol to communicate with AWS IoT.
 * </p>
 * <p>
 * Using the API, you can perform create, read, update, and delete operations for your wireless devices, gateways,
 * destinations, and profiles. After onboarding your devices, you can use the API operations to set log levels and
 * monitor your devices with CloudWatch.
 * </p>
 * <p>
 * You can also use the API operations to create multicast groups and schedule a multicast session for sending a
 * downlink message to devices in the group. By using Firmware Updates Over-The-Air (FUOTA) API operations, you can
 * create a FUOTA task and schedule a session to update the firmware of individual devices or an entire group of devices
 * in a multicast group.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTWireless {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.iotwireless";

    /**
     * <p>
     * Associates a partner account with your AWS account.
     * </p>
     * 
     * @param associateAwsAccountWithPartnerAccountRequest
     * @return Result of the AssociateAwsAccountWithPartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.AssociateAwsAccountWithPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateAwsAccountWithPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAwsAccountWithPartnerAccountResult associateAwsAccountWithPartnerAccount(
            AssociateAwsAccountWithPartnerAccountRequest associateAwsAccountWithPartnerAccountRequest);

    /**
     * <p>
     * Associate a multicast group with a FUOTA task.
     * </p>
     * 
     * @param associateMulticastGroupWithFuotaTaskRequest
     * @return Result of the AssociateMulticastGroupWithFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.AssociateMulticastGroupWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateMulticastGroupWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateMulticastGroupWithFuotaTaskResult associateMulticastGroupWithFuotaTask(
            AssociateMulticastGroupWithFuotaTaskRequest associateMulticastGroupWithFuotaTaskRequest);

    /**
     * <p>
     * Associate a wireless device with a FUOTA task.
     * </p>
     * 
     * @param associateWirelessDeviceWithFuotaTaskRequest
     * @return Result of the AssociateWirelessDeviceWithFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.AssociateWirelessDeviceWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateWirelessDeviceWithFuotaTaskResult associateWirelessDeviceWithFuotaTask(
            AssociateWirelessDeviceWithFuotaTaskRequest associateWirelessDeviceWithFuotaTaskRequest);

    /**
     * <p>
     * Associates a wireless device with a multicast group.
     * </p>
     * 
     * @param associateWirelessDeviceWithMulticastGroupRequest
     * @return Result of the AssociateWirelessDeviceWithMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.AssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateWirelessDeviceWithMulticastGroupResult associateWirelessDeviceWithMulticastGroup(
            AssociateWirelessDeviceWithMulticastGroupRequest associateWirelessDeviceWithMulticastGroupRequest);

    /**
     * <p>
     * Associates a wireless device with a thing.
     * </p>
     * 
     * @param associateWirelessDeviceWithThingRequest
     * @return Result of the AssociateWirelessDeviceWithThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.AssociateWirelessDeviceWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateWirelessDeviceWithThingResult associateWirelessDeviceWithThing(AssociateWirelessDeviceWithThingRequest associateWirelessDeviceWithThingRequest);

    /**
     * <p>
     * Associates a wireless gateway with a certificate.
     * </p>
     * 
     * @param associateWirelessGatewayWithCertificateRequest
     * @return Result of the AssociateWirelessGatewayWithCertificate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.AssociateWirelessGatewayWithCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateWirelessGatewayWithCertificateResult associateWirelessGatewayWithCertificate(
            AssociateWirelessGatewayWithCertificateRequest associateWirelessGatewayWithCertificateRequest);

    /**
     * <p>
     * Associates a wireless gateway with a thing.
     * </p>
     * 
     * @param associateWirelessGatewayWithThingRequest
     * @return Result of the AssociateWirelessGatewayWithThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.AssociateWirelessGatewayWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateWirelessGatewayWithThingResult associateWirelessGatewayWithThing(AssociateWirelessGatewayWithThingRequest associateWirelessGatewayWithThingRequest);

    /**
     * <p>
     * Cancels an existing multicast group session.
     * </p>
     * 
     * @param cancelMulticastGroupSessionRequest
     * @return Result of the CancelMulticastGroupSession operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CancelMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CancelMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    CancelMulticastGroupSessionResult cancelMulticastGroupSession(CancelMulticastGroupSessionRequest cancelMulticastGroupSessionRequest);

    /**
     * <p>
     * Creates a new destination that maps a device message to an AWS IoT rule.
     * </p>
     * 
     * @param createDestinationRequest
     * @return Result of the CreateDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDestination" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDestinationResult createDestination(CreateDestinationRequest createDestinationRequest);

    /**
     * <p>
     * Creates a new device profile.
     * </p>
     * 
     * @param createDeviceProfileRequest
     * @return Result of the CreateDeviceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeviceProfileResult createDeviceProfile(CreateDeviceProfileRequest createDeviceProfileRequest);

    /**
     * <p>
     * Creates a FUOTA task.
     * </p>
     * 
     * @param createFuotaTaskRequest
     * @return Result of the CreateFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFuotaTaskResult createFuotaTask(CreateFuotaTaskRequest createFuotaTaskRequest);

    /**
     * <p>
     * Creates a multicast group.
     * </p>
     * 
     * @param createMulticastGroupRequest
     * @return Result of the CreateMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMulticastGroupResult createMulticastGroup(CreateMulticastGroupRequest createMulticastGroupRequest);

    /**
     * <p>
     * Creates a new network analyzer configuration.
     * </p>
     * 
     * @param createNetworkAnalyzerConfigurationRequest
     * @return Result of the CreateNetworkAnalyzerConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNetworkAnalyzerConfigurationResult createNetworkAnalyzerConfiguration(
            CreateNetworkAnalyzerConfigurationRequest createNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Creates a new service profile.
     * </p>
     * 
     * @param createServiceProfileRequest
     * @return Result of the CreateServiceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateServiceProfileResult createServiceProfile(CreateServiceProfileRequest createServiceProfileRequest);

    /**
     * <p>
     * Provisions a wireless device.
     * </p>
     * 
     * @param createWirelessDeviceRequest
     * @return Result of the CreateWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWirelessDeviceResult createWirelessDevice(CreateWirelessDeviceRequest createWirelessDeviceRequest);

    /**
     * <p>
     * Provisions a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayRequest
     * @return Result of the CreateWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWirelessGatewayResult createWirelessGateway(CreateWirelessGatewayRequest createWirelessGatewayRequest);

    /**
     * <p>
     * Creates a task for a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayTaskRequest
     * @return Result of the CreateWirelessGatewayTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWirelessGatewayTaskResult createWirelessGatewayTask(CreateWirelessGatewayTaskRequest createWirelessGatewayTaskRequest);

    /**
     * <p>
     * Creates a gateway task definition.
     * </p>
     * 
     * @param createWirelessGatewayTaskDefinitionRequest
     * @return Result of the CreateWirelessGatewayTaskDefinition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.CreateWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWirelessGatewayTaskDefinitionResult createWirelessGatewayTaskDefinition(
            CreateWirelessGatewayTaskDefinitionRequest createWirelessGatewayTaskDefinitionRequest);

    /**
     * <p>
     * Deletes a destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDestination" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDestinationResult deleteDestination(DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Deletes a device profile.
     * </p>
     * 
     * @param deleteDeviceProfileRequest
     * @return Result of the DeleteDeviceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDeviceProfileResult deleteDeviceProfile(DeleteDeviceProfileRequest deleteDeviceProfileRequest);

    /**
     * <p>
     * Deletes a FUOTA task.
     * </p>
     * 
     * @param deleteFuotaTaskRequest
     * @return Result of the DeleteFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteFuotaTaskResult deleteFuotaTask(DeleteFuotaTaskRequest deleteFuotaTaskRequest);

    /**
     * <p>
     * Deletes a multicast group if it is not in use by a fuota task.
     * </p>
     * 
     * @param deleteMulticastGroupRequest
     * @return Result of the DeleteMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMulticastGroupResult deleteMulticastGroup(DeleteMulticastGroupRequest deleteMulticastGroupRequest);

    /**
     * <p>
     * Deletes a network analyzer configuration.
     * </p>
     * 
     * @param deleteNetworkAnalyzerConfigurationRequest
     * @return Result of the DeleteNetworkAnalyzerConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNetworkAnalyzerConfigurationResult deleteNetworkAnalyzerConfiguration(
            DeleteNetworkAnalyzerConfigurationRequest deleteNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Remove queued messages from the downlink queue.
     * </p>
     * 
     * @param deleteQueuedMessagesRequest
     * @return Result of the DeleteQueuedMessages operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.DeleteQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteQueuedMessages"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQueuedMessagesResult deleteQueuedMessages(DeleteQueuedMessagesRequest deleteQueuedMessagesRequest);

    /**
     * <p>
     * Deletes a service profile.
     * </p>
     * 
     * @param deleteServiceProfileRequest
     * @return Result of the DeleteServiceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServiceProfileResult deleteServiceProfile(DeleteServiceProfileRequest deleteServiceProfileRequest);

    /**
     * <p>
     * Deletes a wireless device.
     * </p>
     * 
     * @param deleteWirelessDeviceRequest
     * @return Result of the DeleteWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWirelessDeviceResult deleteWirelessDevice(DeleteWirelessDeviceRequest deleteWirelessDeviceRequest);

    /**
     * <p>
     * Deletes a wireless gateway.
     * </p>
     * 
     * @param deleteWirelessGatewayRequest
     * @return Result of the DeleteWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWirelessGatewayResult deleteWirelessGateway(DeleteWirelessGatewayRequest deleteWirelessGatewayRequest);

    /**
     * <p>
     * Deletes a wireless gateway task.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskRequest
     * @return Result of the DeleteWirelessGatewayTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWirelessGatewayTaskResult deleteWirelessGatewayTask(DeleteWirelessGatewayTaskRequest deleteWirelessGatewayTaskRequest);

    /**
     * <p>
     * Deletes a wireless gateway task definition. Deleting this task definition does not affect tasks that are
     * currently in progress.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskDefinitionRequest
     * @return Result of the DeleteWirelessGatewayTaskDefinition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DeleteWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWirelessGatewayTaskDefinitionResult deleteWirelessGatewayTaskDefinition(
            DeleteWirelessGatewayTaskDefinitionRequest deleteWirelessGatewayTaskDefinitionRequest);

    /**
     * <p>
     * Disassociates your AWS account from a partner account. If <code>PartnerAccountId</code> and
     * <code>PartnerType</code> are <code>null</code>, disassociates your AWS account from all partner accounts.
     * </p>
     * 
     * @param disassociateAwsAccountFromPartnerAccountRequest
     * @return Result of the DisassociateAwsAccountFromPartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DisassociateAwsAccountFromPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateAwsAccountFromPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAwsAccountFromPartnerAccountResult disassociateAwsAccountFromPartnerAccount(
            DisassociateAwsAccountFromPartnerAccountRequest disassociateAwsAccountFromPartnerAccountRequest);

    /**
     * <p>
     * Disassociates a multicast group from a fuota task.
     * </p>
     * 
     * @param disassociateMulticastGroupFromFuotaTaskRequest
     * @return Result of the DisassociateMulticastGroupFromFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateMulticastGroupFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateMulticastGroupFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMulticastGroupFromFuotaTaskResult disassociateMulticastGroupFromFuotaTask(
            DisassociateMulticastGroupFromFuotaTaskRequest disassociateMulticastGroupFromFuotaTaskRequest);

    /**
     * <p>
     * Disassociates a wireless device from a FUOTA task.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromFuotaTaskRequest
     * @return Result of the DisassociateWirelessDeviceFromFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateWirelessDeviceFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateWirelessDeviceFromFuotaTaskResult disassociateWirelessDeviceFromFuotaTask(
            DisassociateWirelessDeviceFromFuotaTaskRequest disassociateWirelessDeviceFromFuotaTaskRequest);

    /**
     * <p>
     * Disassociates a wireless device from a multicast group.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromMulticastGroupRequest
     * @return Result of the DisassociateWirelessDeviceFromMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateWirelessDeviceFromMulticastGroupResult disassociateWirelessDeviceFromMulticastGroup(
            DisassociateWirelessDeviceFromMulticastGroupRequest disassociateWirelessDeviceFromMulticastGroupRequest);

    /**
     * <p>
     * Disassociates a wireless device from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromThingRequest
     * @return Result of the DisassociateWirelessDeviceFromThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateWirelessDeviceFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateWirelessDeviceFromThingResult disassociateWirelessDeviceFromThing(
            DisassociateWirelessDeviceFromThingRequest disassociateWirelessDeviceFromThingRequest);

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated certificate.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromCertificateRequest
     * @return Result of the DisassociateWirelessGatewayFromCertificate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.DisassociateWirelessGatewayFromCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateWirelessGatewayFromCertificateResult disassociateWirelessGatewayFromCertificate(
            DisassociateWirelessGatewayFromCertificateRequest disassociateWirelessGatewayFromCertificateRequest);

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromThingRequest
     * @return Result of the DisassociateWirelessGatewayFromThing operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.DisassociateWirelessGatewayFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateWirelessGatewayFromThingResult disassociateWirelessGatewayFromThing(
            DisassociateWirelessGatewayFromThingRequest disassociateWirelessGatewayFromThingRequest);

    /**
     * <p>
     * Gets information about a destination.
     * </p>
     * 
     * @param getDestinationRequest
     * @return Result of the GetDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDestination" target="_top">AWS API
     *      Documentation</a>
     */
    GetDestinationResult getDestination(GetDestinationRequest getDestinationRequest);

    /**
     * <p>
     * Gets information about a device profile.
     * </p>
     * 
     * @param getDeviceProfileRequest
     * @return Result of the GetDeviceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDeviceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeviceProfileResult getDeviceProfile(GetDeviceProfileRequest getDeviceProfileRequest);

    /**
     * <p>
     * Get the event configuration based on resource types.
     * </p>
     * 
     * @param getEventConfigurationByResourceTypesRequest
     * @return Result of the GetEventConfigurationByResourceTypes operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetEventConfigurationByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    GetEventConfigurationByResourceTypesResult getEventConfigurationByResourceTypes(
            GetEventConfigurationByResourceTypesRequest getEventConfigurationByResourceTypesRequest);

    /**
     * <p>
     * Gets information about a FUOTA task.
     * </p>
     * 
     * @param getFuotaTaskRequest
     * @return Result of the GetFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    GetFuotaTaskResult getFuotaTask(GetFuotaTaskRequest getFuotaTaskRequest);

    /**
     * <p>
     * Returns current default log levels or log levels by resource types. Based on resource types, log levels can be
     * for wireless device log options or wireless gateway log options.
     * </p>
     * 
     * @param getLogLevelsByResourceTypesRequest
     * @return Result of the GetLogLevelsByResourceTypes operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.GetLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    GetLogLevelsByResourceTypesResult getLogLevelsByResourceTypes(GetLogLevelsByResourceTypesRequest getLogLevelsByResourceTypesRequest);

    /**
     * <p>
     * Gets information about a multicast group.
     * </p>
     * 
     * @param getMulticastGroupRequest
     * @return Result of the GetMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetMulticastGroupResult getMulticastGroup(GetMulticastGroupRequest getMulticastGroupRequest);

    /**
     * <p>
     * Gets information about a multicast group session.
     * </p>
     * 
     * @param getMulticastGroupSessionRequest
     * @return Result of the GetMulticastGroupSession operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    GetMulticastGroupSessionResult getMulticastGroupSession(GetMulticastGroupSessionRequest getMulticastGroupSessionRequest);

    /**
     * <p>
     * Get network analyzer configuration.
     * </p>
     * 
     * @param getNetworkAnalyzerConfigurationRequest
     * @return Result of the GetNetworkAnalyzerConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkAnalyzerConfigurationResult getNetworkAnalyzerConfiguration(GetNetworkAnalyzerConfigurationRequest getNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Gets information about a partner account. If <code>PartnerAccountId</code> and <code>PartnerType</code> are
     * <code>null</code>, returns all partner accounts.
     * </p>
     * 
     * @param getPartnerAccountRequest
     * @return Result of the GetPartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetPartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPartnerAccount" target="_top">AWS
     *      API Documentation</a>
     */
    GetPartnerAccountResult getPartnerAccount(GetPartnerAccountRequest getPartnerAccountRequest);

    /**
     * <p>
     * Get the position information for a given resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to retrieve the position information should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html"
     * >GetResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param getPositionRequest
     * @return Result of the GetPosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    GetPositionResult getPosition(GetPositionRequest getPositionRequest);

    /**
     * <p>
     * Get position configuration for a given resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to retrieve the position configuration should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html"
     * >GetResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param getPositionConfigurationRequest
     * @return Result of the GetPositionConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    GetPositionConfigurationResult getPositionConfiguration(GetPositionConfigurationRequest getPositionConfigurationRequest);

    /**
     * <p>
     * Get estimated position information as a payload in GeoJSON format. The payload measurement data is resolved using
     * solvers that are provided by third-party vendors.
     * </p>
     * 
     * @param getPositionEstimateRequest
     * @return Result of the GetPositionEstimate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetPositionEstimate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionEstimate"
     *      target="_top">AWS API Documentation</a>
     */
    GetPositionEstimateResult getPositionEstimate(GetPositionEstimateRequest getPositionEstimateRequest);

    /**
     * <p>
     * Get the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param getResourceEventConfigurationRequest
     * @return Result of the GetResourceEventConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceEventConfigurationResult getResourceEventConfiguration(GetResourceEventConfigurationRequest getResourceEventConfigurationRequest);

    /**
     * <p>
     * Fetches the log-level override, if any, for a given resource-ID and resource-type. It can be used for a wireless
     * device or a wireless gateway.
     * </p>
     * 
     * @param getResourceLogLevelRequest
     * @return Result of the GetResourceLogLevel operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.GetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceLogLevelResult getResourceLogLevel(GetResourceLogLevelRequest getResourceLogLevelRequest);

    /**
     * <p>
     * Get the position information for a given wireless device or a wireless gateway resource. The postion information
     * uses the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic System (WGS84)</a>.
     * </p>
     * 
     * @param getResourcePositionRequest
     * @return Result of the GetResourcePosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.GetResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourcePositionResult getResourcePosition(GetResourcePositionRequest getResourcePositionRequest);

    /**
     * <p>
     * Gets the account-specific endpoint for Configuration and Update Server (CUPS) protocol or LoRaWAN Network Server
     * (LNS) connections.
     * </p>
     * 
     * @param getServiceEndpointRequest
     * @return Result of the GetServiceEndpoint operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetServiceEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    GetServiceEndpointResult getServiceEndpoint(GetServiceEndpointRequest getServiceEndpointRequest);

    /**
     * <p>
     * Gets information about a service profile.
     * </p>
     * 
     * @param getServiceProfileRequest
     * @return Result of the GetServiceProfile operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    GetServiceProfileResult getServiceProfile(GetServiceProfileRequest getServiceProfileRequest);

    /**
     * <p>
     * Gets information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceRequest
     * @return Result of the GetWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    GetWirelessDeviceResult getWirelessDevice(GetWirelessDeviceRequest getWirelessDeviceRequest);

    /**
     * <p>
     * Gets operating information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceStatisticsRequest
     * @return Result of the GetWirelessDeviceStatistics operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessDeviceStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDeviceStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetWirelessDeviceStatisticsResult getWirelessDeviceStatistics(GetWirelessDeviceStatisticsRequest getWirelessDeviceStatisticsRequest);

    /**
     * <p>
     * Gets information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayRequest
     * @return Result of the GetWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGateway" target="_top">AWS
     *      API Documentation</a>
     */
    GetWirelessGatewayResult getWirelessGateway(GetWirelessGatewayRequest getWirelessGatewayRequest);

    /**
     * <p>
     * Gets the ID of the certificate that is currently associated with a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayCertificateRequest
     * @return Result of the GetWirelessGatewayCertificate operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    GetWirelessGatewayCertificateResult getWirelessGatewayCertificate(GetWirelessGatewayCertificateRequest getWirelessGatewayCertificateRequest);

    /**
     * <p>
     * Gets the firmware version and other information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayFirmwareInformationRequest
     * @return Result of the GetWirelessGatewayFirmwareInformation operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayFirmwareInformation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayFirmwareInformation"
     *      target="_top">AWS API Documentation</a>
     */
    GetWirelessGatewayFirmwareInformationResult getWirelessGatewayFirmwareInformation(
            GetWirelessGatewayFirmwareInformationRequest getWirelessGatewayFirmwareInformationRequest);

    /**
     * <p>
     * Gets operating information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayStatisticsRequest
     * @return Result of the GetWirelessGatewayStatistics operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetWirelessGatewayStatisticsResult getWirelessGatewayStatistics(GetWirelessGatewayStatisticsRequest getWirelessGatewayStatisticsRequest);

    /**
     * <p>
     * Gets information about a wireless gateway task.
     * </p>
     * 
     * @param getWirelessGatewayTaskRequest
     * @return Result of the GetWirelessGatewayTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetWirelessGatewayTaskResult getWirelessGatewayTask(GetWirelessGatewayTaskRequest getWirelessGatewayTaskRequest);

    /**
     * <p>
     * Gets information about a wireless gateway task definition.
     * </p>
     * 
     * @param getWirelessGatewayTaskDefinitionRequest
     * @return Result of the GetWirelessGatewayTaskDefinition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.GetWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetWirelessGatewayTaskDefinitionResult getWirelessGatewayTaskDefinition(GetWirelessGatewayTaskDefinitionRequest getWirelessGatewayTaskDefinitionRequest);

    /**
     * <p>
     * Lists the destinations registered to your AWS account.
     * </p>
     * 
     * @param listDestinationsRequest
     * @return Result of the ListDestinations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDestinations" target="_top">AWS
     *      API Documentation</a>
     */
    ListDestinationsResult listDestinations(ListDestinationsRequest listDestinationsRequest);

    /**
     * <p>
     * Lists the device profiles registered to your AWS account.
     * </p>
     * 
     * @param listDeviceProfilesRequest
     * @return Result of the ListDeviceProfiles operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListDeviceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDeviceProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListDeviceProfilesResult listDeviceProfiles(ListDeviceProfilesRequest listDeviceProfilesRequest);

    /**
     * <p>
     * List event configurations where at least one event topic has been enabled.
     * </p>
     * 
     * @param listEventConfigurationsRequest
     * @return Result of the ListEventConfigurations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.ListEventConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListEventConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListEventConfigurationsResult listEventConfigurations(ListEventConfigurationsRequest listEventConfigurationsRequest);

    /**
     * <p>
     * Lists the FUOTA tasks registered to your AWS account.
     * </p>
     * 
     * @param listFuotaTasksRequest
     * @return Result of the ListFuotaTasks operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListFuotaTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListFuotaTasks" target="_top">AWS API
     *      Documentation</a>
     */
    ListFuotaTasksResult listFuotaTasks(ListFuotaTasksRequest listFuotaTasksRequest);

    /**
     * <p>
     * Lists the multicast groups registered to your AWS account.
     * </p>
     * 
     * @param listMulticastGroupsRequest
     * @return Result of the ListMulticastGroups operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListMulticastGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListMulticastGroupsResult listMulticastGroups(ListMulticastGroupsRequest listMulticastGroupsRequest);

    /**
     * <p>
     * List all multicast groups associated with a fuota task.
     * </p>
     * 
     * @param listMulticastGroupsByFuotaTaskRequest
     * @return Result of the ListMulticastGroupsByFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListMulticastGroupsByFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroupsByFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    ListMulticastGroupsByFuotaTaskResult listMulticastGroupsByFuotaTask(ListMulticastGroupsByFuotaTaskRequest listMulticastGroupsByFuotaTaskRequest);

    /**
     * <p>
     * Lists the network analyzer configurations.
     * </p>
     * 
     * @param listNetworkAnalyzerConfigurationsRequest
     * @return Result of the ListNetworkAnalyzerConfigurations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListNetworkAnalyzerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListNetworkAnalyzerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListNetworkAnalyzerConfigurationsResult listNetworkAnalyzerConfigurations(ListNetworkAnalyzerConfigurationsRequest listNetworkAnalyzerConfigurationsRequest);

    /**
     * <p>
     * Lists the partner accounts associated with your AWS account.
     * </p>
     * 
     * @param listPartnerAccountsRequest
     * @return Result of the ListPartnerAccounts operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListPartnerAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPartnerAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListPartnerAccountsResult listPartnerAccounts(ListPartnerAccountsRequest listPartnerAccountsRequest);

    /**
     * <p>
     * List position configurations for a given resource, such as positioning solvers.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to retrieve position information should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html"
     * >GetResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param listPositionConfigurationsRequest
     * @return Result of the ListPositionConfigurations operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.ListPositionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPositionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    ListPositionConfigurationsResult listPositionConfigurations(ListPositionConfigurationsRequest listPositionConfigurationsRequest);

    /**
     * <p>
     * List queued messages in the downlink queue.
     * </p>
     * 
     * @param listQueuedMessagesRequest
     * @return Result of the ListQueuedMessages operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.ListQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListQueuedMessages" target="_top">AWS
     *      API Documentation</a>
     */
    ListQueuedMessagesResult listQueuedMessages(ListQueuedMessagesRequest listQueuedMessagesRequest);

    /**
     * <p>
     * Lists the service profiles registered to your AWS account.
     * </p>
     * 
     * @param listServiceProfilesRequest
     * @return Result of the ListServiceProfiles operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListServiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListServiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListServiceProfilesResult listServiceProfiles(ListServiceProfilesRequest listServiceProfilesRequest);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the wireless devices registered to your AWS account.
     * </p>
     * 
     * @param listWirelessDevicesRequest
     * @return Result of the ListWirelessDevices operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.ListWirelessDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessDevices"
     *      target="_top">AWS API Documentation</a>
     */
    ListWirelessDevicesResult listWirelessDevices(ListWirelessDevicesRequest listWirelessDevicesRequest);

    /**
     * <p>
     * List the wireless gateway tasks definitions registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewayTaskDefinitionsRequest
     * @return Result of the ListWirelessGatewayTaskDefinitions operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.ListWirelessGatewayTaskDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGatewayTaskDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListWirelessGatewayTaskDefinitionsResult listWirelessGatewayTaskDefinitions(
            ListWirelessGatewayTaskDefinitionsRequest listWirelessGatewayTaskDefinitionsRequest);

    /**
     * <p>
     * Lists the wireless gateways registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewaysRequest
     * @return Result of the ListWirelessGateways operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @sample AWSIoTWireless.ListWirelessGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGateways"
     *      target="_top">AWS API Documentation</a>
     */
    ListWirelessGatewaysResult listWirelessGateways(ListWirelessGatewaysRequest listWirelessGatewaysRequest);

    /**
     * <p>
     * Put position configuration for a given resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to update the position configuration should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_UpdateResourcePosition.html"
     * >UpdateResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param putPositionConfigurationRequest
     * @return Result of the PutPositionConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.PutPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    PutPositionConfigurationResult putPositionConfiguration(PutPositionConfigurationRequest putPositionConfigurationRequest);

    /**
     * <p>
     * Sets the log-level override for a resource-ID and resource-type. This option can be specified for a wireless
     * gateway or a wireless device. A limit of 200 log level override can be set per account.
     * </p>
     * 
     * @param putResourceLogLevelRequest
     * @return Result of the PutResourceLogLevel operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.PutResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourceLogLevelResult putResourceLogLevel(PutResourceLogLevelRequest putResourceLogLevelRequest);

    /**
     * <p>
     * Removes the log-level overrides for all resources; both wireless devices and wireless gateways.
     * </p>
     * 
     * @param resetAllResourceLogLevelsRequest
     * @return Result of the ResetAllResourceLogLevels operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.ResetAllResourceLogLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetAllResourceLogLevels"
     *      target="_top">AWS API Documentation</a>
     */
    ResetAllResourceLogLevelsResult resetAllResourceLogLevels(ResetAllResourceLogLevelsRequest resetAllResourceLogLevelsRequest);

    /**
     * <p>
     * Removes the log-level override, if any, for a specific resource-ID and resource-type. It can be used for a
     * wireless device or a wireless gateway.
     * </p>
     * 
     * @param resetResourceLogLevelRequest
     * @return Result of the ResetResourceLogLevel operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.ResetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    ResetResourceLogLevelResult resetResourceLogLevel(ResetResourceLogLevelRequest resetResourceLogLevelRequest);

    /**
     * <p>
     * Sends the specified data to a multicast group.
     * </p>
     * 
     * @param sendDataToMulticastGroupRequest
     * @return Result of the SendDataToMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.SendDataToMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    SendDataToMulticastGroupResult sendDataToMulticastGroup(SendDataToMulticastGroupRequest sendDataToMulticastGroupRequest);

    /**
     * <p>
     * Sends a decrypted application data frame to a device.
     * </p>
     * 
     * @param sendDataToWirelessDeviceRequest
     * @return Result of the SendDataToWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.SendDataToWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    SendDataToWirelessDeviceResult sendDataToWirelessDevice(SendDataToWirelessDeviceRequest sendDataToWirelessDeviceRequest);

    /**
     * <p>
     * Starts a bulk association of all qualifying wireless devices with a multicast group.
     * </p>
     * 
     * @param startBulkAssociateWirelessDeviceWithMulticastGroupRequest
     * @return Result of the StartBulkAssociateWirelessDeviceWithMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.StartBulkAssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkAssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    StartBulkAssociateWirelessDeviceWithMulticastGroupResult startBulkAssociateWirelessDeviceWithMulticastGroup(
            StartBulkAssociateWirelessDeviceWithMulticastGroupRequest startBulkAssociateWirelessDeviceWithMulticastGroupRequest);

    /**
     * <p>
     * Starts a bulk disassociatin of all qualifying wireless devices from a multicast group.
     * </p>
     * 
     * @param startBulkDisassociateWirelessDeviceFromMulticastGroupRequest
     * @return Result of the StartBulkDisassociateWirelessDeviceFromMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.StartBulkDisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkDisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    StartBulkDisassociateWirelessDeviceFromMulticastGroupResult startBulkDisassociateWirelessDeviceFromMulticastGroup(
            StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest startBulkDisassociateWirelessDeviceFromMulticastGroupRequest);

    /**
     * <p>
     * Starts a FUOTA task.
     * </p>
     * 
     * @param startFuotaTaskRequest
     * @return Result of the StartFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.StartFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    StartFuotaTaskResult startFuotaTask(StartFuotaTaskRequest startFuotaTaskRequest);

    /**
     * <p>
     * Starts a multicast group session.
     * </p>
     * 
     * @param startMulticastGroupSessionRequest
     * @return Result of the StartMulticastGroupSession operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.StartMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    StartMulticastGroupSessionResult startMulticastGroupSession(StartMulticastGroupSessionRequest startMulticastGroupSessionRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws TooManyTagsException
     *         The request was denied because the resource can't have any more tags.
     * @sample AWSIoTWireless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Simulates a provisioned device by sending an uplink data payload of <code>Hello</code>.
     * </p>
     * 
     * @param testWirelessDeviceRequest
     * @return Result of the TestWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.TestWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TestWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    TestWirelessDeviceResult testWirelessDevice(TestWirelessDeviceRequest testWirelessDeviceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates properties of a destination.
     * </p>
     * 
     * @param updateDestinationRequest
     * @return Result of the UpdateDestination operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateDestination" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDestinationResult updateDestination(UpdateDestinationRequest updateDestinationRequest);

    /**
     * <p>
     * Update the event configuration based on resource types.
     * </p>
     * 
     * @param updateEventConfigurationByResourceTypesRequest
     * @return Result of the UpdateEventConfigurationByResourceTypes operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdateEventConfigurationByResourceTypes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventConfigurationByResourceTypesResult updateEventConfigurationByResourceTypes(
            UpdateEventConfigurationByResourceTypesRequest updateEventConfigurationByResourceTypesRequest);

    /**
     * <p>
     * Updates properties of a FUOTA task.
     * </p>
     * 
     * @param updateFuotaTaskRequest
     * @return Result of the UpdateFuotaTask operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFuotaTaskResult updateFuotaTask(UpdateFuotaTaskRequest updateFuotaTaskRequest);

    /**
     * <p>
     * Set default log level, or log levels by resource types. This can be for wireless device log options or wireless
     * gateways log options and is used to control the log messages that'll be displayed in CloudWatch.
     * </p>
     * 
     * @param updateLogLevelsByResourceTypesRequest
     * @return Result of the UpdateLogLevelsByResourceTypes operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @sample AWSIoTWireless.UpdateLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLogLevelsByResourceTypesResult updateLogLevelsByResourceTypes(UpdateLogLevelsByResourceTypesRequest updateLogLevelsByResourceTypesRequest);

    /**
     * <p>
     * Updates properties of a multicast group session.
     * </p>
     * 
     * @param updateMulticastGroupRequest
     * @return Result of the UpdateMulticastGroup operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMulticastGroupResult updateMulticastGroup(UpdateMulticastGroupRequest updateMulticastGroupRequest);

    /**
     * <p>
     * Update network analyzer configuration.
     * </p>
     * 
     * @param updateNetworkAnalyzerConfigurationRequest
     * @return Result of the UpdateNetworkAnalyzerConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNetworkAnalyzerConfigurationResult updateNetworkAnalyzerConfiguration(
            UpdateNetworkAnalyzerConfigurationRequest updateNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Updates properties of a partner account.
     * </p>
     * 
     * @param updatePartnerAccountRequest
     * @return Result of the UpdatePartnerAccount operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdatePartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePartnerAccountResult updatePartnerAccount(UpdatePartnerAccountRequest updatePartnerAccountRequest);

    /**
     * <p>
     * Update the position information of a resource.
     * </p>
     * <important>
     * <p>
     * This action is no longer supported. Calls to update the position information should use the <a
     * href="https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_UpdateResourcePosition.html"
     * >UpdateResourcePosition</a> API operation instead.
     * </p>
     * </important>
     * 
     * @param updatePositionRequest
     * @return Result of the UpdatePosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdatePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    UpdatePositionResult updatePosition(UpdatePositionRequest updatePositionRequest);

    /**
     * <p>
     * Update the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param updateResourceEventConfigurationRequest
     * @return Result of the UpdateResourceEventConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ConflictException
     *         Adding, updating, or deleting the resource can cause an inconsistent state.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdateResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceEventConfigurationResult updateResourceEventConfiguration(UpdateResourceEventConfigurationRequest updateResourceEventConfigurationRequest);

    /**
     * <p>
     * Update the position information of a given wireless device or a wireless gateway resource. The postion
     * coordinates are based on the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic
     * System (WGS84)</a>.
     * </p>
     * 
     * @param updateResourcePositionRequest
     * @return Result of the UpdateResourcePosition operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @sample AWSIoTWireless.UpdateResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourcePositionResult updateResourcePosition(UpdateResourcePositionRequest updateResourcePositionRequest);

    /**
     * <p>
     * Updates properties of a wireless device.
     * </p>
     * 
     * @param updateWirelessDeviceRequest
     * @return Result of the UpdateWirelessDevice operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWirelessDeviceResult updateWirelessDevice(UpdateWirelessDeviceRequest updateWirelessDeviceRequest);

    /**
     * <p>
     * Updates properties of a wireless gateway.
     * </p>
     * 
     * @param updateWirelessGatewayRequest
     * @return Result of the UpdateWirelessGateway operation returned by the service.
     * @throws ValidationException
     *         The input did not meet the specified constraints.
     * @throws ResourceNotFoundException
     *         Resource does not exist.
     * @throws AccessDeniedException
     *         User does not have permission to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred while processing a request.
     * @throws ThrottlingException
     *         The request was denied because it exceeded the allowed API request rate.
     * @sample AWSIoTWireless.UpdateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWirelessGatewayResult updateWirelessGateway(UpdateWirelessGatewayRequest updateWirelessGatewayRequest);

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
