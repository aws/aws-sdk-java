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

import com.amazonaws.services.iotwireless.model.*;

/**
 * Interface for accessing AWS IoT Wireless asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotwireless.AbstractAWSIoTWirelessAsync} instead.
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
public interface AWSIoTWirelessAsync extends AWSIoTWireless {

    /**
     * <p>
     * Associates a partner account with your AWS account.
     * </p>
     * 
     * @param associateAwsAccountWithPartnerAccountRequest
     * @return A Java Future containing the result of the AssociateAwsAccountWithPartnerAccount operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsync.AssociateAwsAccountWithPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateAwsAccountWithPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAwsAccountWithPartnerAccountResult> associateAwsAccountWithPartnerAccountAsync(
            AssociateAwsAccountWithPartnerAccountRequest associateAwsAccountWithPartnerAccountRequest);

    /**
     * <p>
     * Associates a partner account with your AWS account.
     * </p>
     * 
     * @param associateAwsAccountWithPartnerAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAwsAccountWithPartnerAccount operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsyncHandler.AssociateAwsAccountWithPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateAwsAccountWithPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAwsAccountWithPartnerAccountResult> associateAwsAccountWithPartnerAccountAsync(
            AssociateAwsAccountWithPartnerAccountRequest associateAwsAccountWithPartnerAccountRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAwsAccountWithPartnerAccountRequest, AssociateAwsAccountWithPartnerAccountResult> asyncHandler);

    /**
     * <p>
     * Associate a multicast group with a FUOTA task.
     * </p>
     * 
     * @param associateMulticastGroupWithFuotaTaskRequest
     * @return A Java Future containing the result of the AssociateMulticastGroupWithFuotaTask operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.AssociateMulticastGroupWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateMulticastGroupWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMulticastGroupWithFuotaTaskResult> associateMulticastGroupWithFuotaTaskAsync(
            AssociateMulticastGroupWithFuotaTaskRequest associateMulticastGroupWithFuotaTaskRequest);

    /**
     * <p>
     * Associate a multicast group with a FUOTA task.
     * </p>
     * 
     * @param associateMulticastGroupWithFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMulticastGroupWithFuotaTask operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.AssociateMulticastGroupWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateMulticastGroupWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMulticastGroupWithFuotaTaskResult> associateMulticastGroupWithFuotaTaskAsync(
            AssociateMulticastGroupWithFuotaTaskRequest associateMulticastGroupWithFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMulticastGroupWithFuotaTaskRequest, AssociateMulticastGroupWithFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Associate a wireless device with a FUOTA task.
     * </p>
     * 
     * @param associateWirelessDeviceWithFuotaTaskRequest
     * @return A Java Future containing the result of the AssociateWirelessDeviceWithFuotaTask operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.AssociateWirelessDeviceWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessDeviceWithFuotaTaskResult> associateWirelessDeviceWithFuotaTaskAsync(
            AssociateWirelessDeviceWithFuotaTaskRequest associateWirelessDeviceWithFuotaTaskRequest);

    /**
     * <p>
     * Associate a wireless device with a FUOTA task.
     * </p>
     * 
     * @param associateWirelessDeviceWithFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWirelessDeviceWithFuotaTask operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.AssociateWirelessDeviceWithFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessDeviceWithFuotaTaskResult> associateWirelessDeviceWithFuotaTaskAsync(
            AssociateWirelessDeviceWithFuotaTaskRequest associateWirelessDeviceWithFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWirelessDeviceWithFuotaTaskRequest, AssociateWirelessDeviceWithFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Associates a wireless device with a multicast group.
     * </p>
     * 
     * @param associateWirelessDeviceWithMulticastGroupRequest
     * @return A Java Future containing the result of the AssociateWirelessDeviceWithMulticastGroup operation returned
     *         by the service.
     * @sample AWSIoTWirelessAsync.AssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessDeviceWithMulticastGroupResult> associateWirelessDeviceWithMulticastGroupAsync(
            AssociateWirelessDeviceWithMulticastGroupRequest associateWirelessDeviceWithMulticastGroupRequest);

    /**
     * <p>
     * Associates a wireless device with a multicast group.
     * </p>
     * 
     * @param associateWirelessDeviceWithMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWirelessDeviceWithMulticastGroup operation returned
     *         by the service.
     * @sample AWSIoTWirelessAsyncHandler.AssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessDeviceWithMulticastGroupResult> associateWirelessDeviceWithMulticastGroupAsync(
            AssociateWirelessDeviceWithMulticastGroupRequest associateWirelessDeviceWithMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWirelessDeviceWithMulticastGroupRequest, AssociateWirelessDeviceWithMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Associates a wireless device with a thing.
     * </p>
     * 
     * @param associateWirelessDeviceWithThingRequest
     * @return A Java Future containing the result of the AssociateWirelessDeviceWithThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.AssociateWirelessDeviceWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessDeviceWithThingResult> associateWirelessDeviceWithThingAsync(
            AssociateWirelessDeviceWithThingRequest associateWirelessDeviceWithThingRequest);

    /**
     * <p>
     * Associates a wireless device with a thing.
     * </p>
     * 
     * @param associateWirelessDeviceWithThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWirelessDeviceWithThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.AssociateWirelessDeviceWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessDeviceWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessDeviceWithThingResult> associateWirelessDeviceWithThingAsync(
            AssociateWirelessDeviceWithThingRequest associateWirelessDeviceWithThingRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWirelessDeviceWithThingRequest, AssociateWirelessDeviceWithThingResult> asyncHandler);

    /**
     * <p>
     * Associates a wireless gateway with a certificate.
     * </p>
     * 
     * @param associateWirelessGatewayWithCertificateRequest
     * @return A Java Future containing the result of the AssociateWirelessGatewayWithCertificate operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsync.AssociateWirelessGatewayWithCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessGatewayWithCertificateResult> associateWirelessGatewayWithCertificateAsync(
            AssociateWirelessGatewayWithCertificateRequest associateWirelessGatewayWithCertificateRequest);

    /**
     * <p>
     * Associates a wireless gateway with a certificate.
     * </p>
     * 
     * @param associateWirelessGatewayWithCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWirelessGatewayWithCertificate operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsyncHandler.AssociateWirelessGatewayWithCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessGatewayWithCertificateResult> associateWirelessGatewayWithCertificateAsync(
            AssociateWirelessGatewayWithCertificateRequest associateWirelessGatewayWithCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWirelessGatewayWithCertificateRequest, AssociateWirelessGatewayWithCertificateResult> asyncHandler);

    /**
     * <p>
     * Associates a wireless gateway with a thing.
     * </p>
     * 
     * @param associateWirelessGatewayWithThingRequest
     * @return A Java Future containing the result of the AssociateWirelessGatewayWithThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.AssociateWirelessGatewayWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessGatewayWithThingResult> associateWirelessGatewayWithThingAsync(
            AssociateWirelessGatewayWithThingRequest associateWirelessGatewayWithThingRequest);

    /**
     * <p>
     * Associates a wireless gateway with a thing.
     * </p>
     * 
     * @param associateWirelessGatewayWithThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateWirelessGatewayWithThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.AssociateWirelessGatewayWithThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/AssociateWirelessGatewayWithThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateWirelessGatewayWithThingResult> associateWirelessGatewayWithThingAsync(
            AssociateWirelessGatewayWithThingRequest associateWirelessGatewayWithThingRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateWirelessGatewayWithThingRequest, AssociateWirelessGatewayWithThingResult> asyncHandler);

    /**
     * <p>
     * Cancels an existing multicast group session.
     * </p>
     * 
     * @param cancelMulticastGroupSessionRequest
     * @return A Java Future containing the result of the CancelMulticastGroupSession operation returned by the service.
     * @sample AWSIoTWirelessAsync.CancelMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CancelMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMulticastGroupSessionResult> cancelMulticastGroupSessionAsync(
            CancelMulticastGroupSessionRequest cancelMulticastGroupSessionRequest);

    /**
     * <p>
     * Cancels an existing multicast group session.
     * </p>
     * 
     * @param cancelMulticastGroupSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelMulticastGroupSession operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CancelMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CancelMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelMulticastGroupSessionResult> cancelMulticastGroupSessionAsync(
            CancelMulticastGroupSessionRequest cancelMulticastGroupSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelMulticastGroupSessionRequest, CancelMulticastGroupSessionResult> asyncHandler);

    /**
     * <p>
     * Creates a new destination that maps a device message to an AWS IoT rule.
     * </p>
     * 
     * @param createDestinationRequest
     * @return A Java Future containing the result of the CreateDestination operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(CreateDestinationRequest createDestinationRequest);

    /**
     * <p>
     * Creates a new destination that maps a device message to an AWS IoT rule.
     * </p>
     * 
     * @param createDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDestination operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(CreateDestinationRequest createDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDestinationRequest, CreateDestinationResult> asyncHandler);

    /**
     * <p>
     * Creates a new device profile.
     * </p>
     * 
     * @param createDeviceProfileRequest
     * @return A Java Future containing the result of the CreateDeviceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceProfileResult> createDeviceProfileAsync(CreateDeviceProfileRequest createDeviceProfileRequest);

    /**
     * <p>
     * Creates a new device profile.
     * </p>
     * 
     * @param createDeviceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeviceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceProfileResult> createDeviceProfileAsync(CreateDeviceProfileRequest createDeviceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeviceProfileRequest, CreateDeviceProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a FUOTA task.
     * </p>
     * 
     * @param createFuotaTaskRequest
     * @return A Java Future containing the result of the CreateFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFuotaTaskResult> createFuotaTaskAsync(CreateFuotaTaskRequest createFuotaTaskRequest);

    /**
     * <p>
     * Creates a FUOTA task.
     * </p>
     * 
     * @param createFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFuotaTaskResult> createFuotaTaskAsync(CreateFuotaTaskRequest createFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFuotaTaskRequest, CreateFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Creates a multicast group.
     * </p>
     * 
     * @param createMulticastGroupRequest
     * @return A Java Future containing the result of the CreateMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMulticastGroupResult> createMulticastGroupAsync(CreateMulticastGroupRequest createMulticastGroupRequest);

    /**
     * <p>
     * Creates a multicast group.
     * </p>
     * 
     * @param createMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMulticastGroupResult> createMulticastGroupAsync(CreateMulticastGroupRequest createMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMulticastGroupRequest, CreateMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new network analyzer configuration.
     * </p>
     * 
     * @param createNetworkAnalyzerConfigurationRequest
     * @return A Java Future containing the result of the CreateNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.CreateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkAnalyzerConfigurationResult> createNetworkAnalyzerConfigurationAsync(
            CreateNetworkAnalyzerConfigurationRequest createNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Creates a new network analyzer configuration.
     * </p>
     * 
     * @param createNetworkAnalyzerConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.CreateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkAnalyzerConfigurationResult> createNetworkAnalyzerConfigurationAsync(
            CreateNetworkAnalyzerConfigurationRequest createNetworkAnalyzerConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkAnalyzerConfigurationRequest, CreateNetworkAnalyzerConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new service profile.
     * </p>
     * 
     * @param createServiceProfileRequest
     * @return A Java Future containing the result of the CreateServiceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceProfileResult> createServiceProfileAsync(CreateServiceProfileRequest createServiceProfileRequest);

    /**
     * <p>
     * Creates a new service profile.
     * </p>
     * 
     * @param createServiceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceProfileResult> createServiceProfileAsync(CreateServiceProfileRequest createServiceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceProfileRequest, CreateServiceProfileResult> asyncHandler);

    /**
     * <p>
     * Provisions a wireless device.
     * </p>
     * 
     * @param createWirelessDeviceRequest
     * @return A Java Future containing the result of the CreateWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessDeviceResult> createWirelessDeviceAsync(CreateWirelessDeviceRequest createWirelessDeviceRequest);

    /**
     * <p>
     * Provisions a wireless device.
     * </p>
     * 
     * @param createWirelessDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessDeviceResult> createWirelessDeviceAsync(CreateWirelessDeviceRequest createWirelessDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWirelessDeviceRequest, CreateWirelessDeviceResult> asyncHandler);

    /**
     * <p>
     * Provisions a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayRequest
     * @return A Java Future containing the result of the CreateWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessGatewayResult> createWirelessGatewayAsync(CreateWirelessGatewayRequest createWirelessGatewayRequest);

    /**
     * <p>
     * Provisions a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessGatewayResult> createWirelessGatewayAsync(CreateWirelessGatewayRequest createWirelessGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWirelessGatewayRequest, CreateWirelessGatewayResult> asyncHandler);

    /**
     * <p>
     * Creates a task for a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayTaskRequest
     * @return A Java Future containing the result of the CreateWirelessGatewayTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.CreateWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessGatewayTaskResult> createWirelessGatewayTaskAsync(
            CreateWirelessGatewayTaskRequest createWirelessGatewayTaskRequest);

    /**
     * <p>
     * Creates a task for a wireless gateway.
     * </p>
     * 
     * @param createWirelessGatewayTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWirelessGatewayTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.CreateWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessGatewayTaskResult> createWirelessGatewayTaskAsync(
            CreateWirelessGatewayTaskRequest createWirelessGatewayTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWirelessGatewayTaskRequest, CreateWirelessGatewayTaskResult> asyncHandler);

    /**
     * <p>
     * Creates a gateway task definition.
     * </p>
     * 
     * @param createWirelessGatewayTaskDefinitionRequest
     * @return A Java Future containing the result of the CreateWirelessGatewayTaskDefinition operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.CreateWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessGatewayTaskDefinitionResult> createWirelessGatewayTaskDefinitionAsync(
            CreateWirelessGatewayTaskDefinitionRequest createWirelessGatewayTaskDefinitionRequest);

    /**
     * <p>
     * Creates a gateway task definition.
     * </p>
     * 
     * @param createWirelessGatewayTaskDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWirelessGatewayTaskDefinition operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.CreateWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWirelessGatewayTaskDefinitionResult> createWirelessGatewayTaskDefinitionAsync(
            CreateWirelessGatewayTaskDefinitionRequest createWirelessGatewayTaskDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWirelessGatewayTaskDefinitionRequest, CreateWirelessGatewayTaskDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return A Java Future containing the result of the DeleteDestination operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Deletes a destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDestination operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest deleteDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, DeleteDestinationResult> asyncHandler);

    /**
     * <p>
     * Deletes a device profile.
     * </p>
     * 
     * @param deleteDeviceProfileRequest
     * @return A Java Future containing the result of the DeleteDeviceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceProfileResult> deleteDeviceProfileAsync(DeleteDeviceProfileRequest deleteDeviceProfileRequest);

    /**
     * <p>
     * Deletes a device profile.
     * </p>
     * 
     * @param deleteDeviceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeviceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteDeviceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceProfileResult> deleteDeviceProfileAsync(DeleteDeviceProfileRequest deleteDeviceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceProfileRequest, DeleteDeviceProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a FUOTA task.
     * </p>
     * 
     * @param deleteFuotaTaskRequest
     * @return A Java Future containing the result of the DeleteFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFuotaTaskResult> deleteFuotaTaskAsync(DeleteFuotaTaskRequest deleteFuotaTaskRequest);

    /**
     * <p>
     * Deletes a FUOTA task.
     * </p>
     * 
     * @param deleteFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFuotaTaskResult> deleteFuotaTaskAsync(DeleteFuotaTaskRequest deleteFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFuotaTaskRequest, DeleteFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Deletes a multicast group if it is not in use by a fuota task.
     * </p>
     * 
     * @param deleteMulticastGroupRequest
     * @return A Java Future containing the result of the DeleteMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMulticastGroupResult> deleteMulticastGroupAsync(DeleteMulticastGroupRequest deleteMulticastGroupRequest);

    /**
     * <p>
     * Deletes a multicast group if it is not in use by a fuota task.
     * </p>
     * 
     * @param deleteMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMulticastGroupResult> deleteMulticastGroupAsync(DeleteMulticastGroupRequest deleteMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMulticastGroupRequest, DeleteMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a network analyzer configuration.
     * </p>
     * 
     * @param deleteNetworkAnalyzerConfigurationRequest
     * @return A Java Future containing the result of the DeleteNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.DeleteNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkAnalyzerConfigurationResult> deleteNetworkAnalyzerConfigurationAsync(
            DeleteNetworkAnalyzerConfigurationRequest deleteNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Deletes a network analyzer configuration.
     * </p>
     * 
     * @param deleteNetworkAnalyzerConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkAnalyzerConfigurationResult> deleteNetworkAnalyzerConfigurationAsync(
            DeleteNetworkAnalyzerConfigurationRequest deleteNetworkAnalyzerConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkAnalyzerConfigurationRequest, DeleteNetworkAnalyzerConfigurationResult> asyncHandler);

    /**
     * <p>
     * Remove queued messages from the downlink queue.
     * </p>
     * 
     * @param deleteQueuedMessagesRequest
     * @return A Java Future containing the result of the DeleteQueuedMessages operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteQueuedMessages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueuedMessagesResult> deleteQueuedMessagesAsync(DeleteQueuedMessagesRequest deleteQueuedMessagesRequest);

    /**
     * <p>
     * Remove queued messages from the downlink queue.
     * </p>
     * 
     * @param deleteQueuedMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQueuedMessages operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteQueuedMessages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueuedMessagesResult> deleteQueuedMessagesAsync(DeleteQueuedMessagesRequest deleteQueuedMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQueuedMessagesRequest, DeleteQueuedMessagesResult> asyncHandler);

    /**
     * <p>
     * Deletes a service profile.
     * </p>
     * 
     * @param deleteServiceProfileRequest
     * @return A Java Future containing the result of the DeleteServiceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceProfileResult> deleteServiceProfileAsync(DeleteServiceProfileRequest deleteServiceProfileRequest);

    /**
     * <p>
     * Deletes a service profile.
     * </p>
     * 
     * @param deleteServiceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteServiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceProfileResult> deleteServiceProfileAsync(DeleteServiceProfileRequest deleteServiceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceProfileRequest, DeleteServiceProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a wireless device.
     * </p>
     * 
     * @param deleteWirelessDeviceRequest
     * @return A Java Future containing the result of the DeleteWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessDeviceResult> deleteWirelessDeviceAsync(DeleteWirelessDeviceRequest deleteWirelessDeviceRequest);

    /**
     * <p>
     * Deletes a wireless device.
     * </p>
     * 
     * @param deleteWirelessDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessDeviceResult> deleteWirelessDeviceAsync(DeleteWirelessDeviceRequest deleteWirelessDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWirelessDeviceRequest, DeleteWirelessDeviceResult> asyncHandler);

    /**
     * <p>
     * Deletes a wireless gateway.
     * </p>
     * 
     * @param deleteWirelessGatewayRequest
     * @return A Java Future containing the result of the DeleteWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessGatewayResult> deleteWirelessGatewayAsync(DeleteWirelessGatewayRequest deleteWirelessGatewayRequest);

    /**
     * <p>
     * Deletes a wireless gateway.
     * </p>
     * 
     * @param deleteWirelessGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessGatewayResult> deleteWirelessGatewayAsync(DeleteWirelessGatewayRequest deleteWirelessGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWirelessGatewayRequest, DeleteWirelessGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes a wireless gateway task.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskRequest
     * @return A Java Future containing the result of the DeleteWirelessGatewayTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.DeleteWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessGatewayTaskResult> deleteWirelessGatewayTaskAsync(
            DeleteWirelessGatewayTaskRequest deleteWirelessGatewayTaskRequest);

    /**
     * <p>
     * Deletes a wireless gateway task.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWirelessGatewayTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessGatewayTaskResult> deleteWirelessGatewayTaskAsync(
            DeleteWirelessGatewayTaskRequest deleteWirelessGatewayTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWirelessGatewayTaskRequest, DeleteWirelessGatewayTaskResult> asyncHandler);

    /**
     * <p>
     * Deletes a wireless gateway task definition. Deleting this task definition does not affect tasks that are
     * currently in progress.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskDefinitionRequest
     * @return A Java Future containing the result of the DeleteWirelessGatewayTaskDefinition operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.DeleteWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessGatewayTaskDefinitionResult> deleteWirelessGatewayTaskDefinitionAsync(
            DeleteWirelessGatewayTaskDefinitionRequest deleteWirelessGatewayTaskDefinitionRequest);

    /**
     * <p>
     * Deletes a wireless gateway task definition. Deleting this task definition does not affect tasks that are
     * currently in progress.
     * </p>
     * 
     * @param deleteWirelessGatewayTaskDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWirelessGatewayTaskDefinition operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.DeleteWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWirelessGatewayTaskDefinitionResult> deleteWirelessGatewayTaskDefinitionAsync(
            DeleteWirelessGatewayTaskDefinitionRequest deleteWirelessGatewayTaskDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWirelessGatewayTaskDefinitionRequest, DeleteWirelessGatewayTaskDefinitionResult> asyncHandler);

    /**
     * <p>
     * Disassociates your AWS account from a partner account. If <code>PartnerAccountId</code> and
     * <code>PartnerType</code> are <code>null</code>, disassociates your AWS account from all partner accounts.
     * </p>
     * 
     * @param disassociateAwsAccountFromPartnerAccountRequest
     * @return A Java Future containing the result of the DisassociateAwsAccountFromPartnerAccount operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsync.DisassociateAwsAccountFromPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateAwsAccountFromPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAwsAccountFromPartnerAccountResult> disassociateAwsAccountFromPartnerAccountAsync(
            DisassociateAwsAccountFromPartnerAccountRequest disassociateAwsAccountFromPartnerAccountRequest);

    /**
     * <p>
     * Disassociates your AWS account from a partner account. If <code>PartnerAccountId</code> and
     * <code>PartnerType</code> are <code>null</code>, disassociates your AWS account from all partner accounts.
     * </p>
     * 
     * @param disassociateAwsAccountFromPartnerAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAwsAccountFromPartnerAccount operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsyncHandler.DisassociateAwsAccountFromPartnerAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateAwsAccountFromPartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAwsAccountFromPartnerAccountResult> disassociateAwsAccountFromPartnerAccountAsync(
            DisassociateAwsAccountFromPartnerAccountRequest disassociateAwsAccountFromPartnerAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAwsAccountFromPartnerAccountRequest, DisassociateAwsAccountFromPartnerAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates a multicast group from a fuota task.
     * </p>
     * 
     * @param disassociateMulticastGroupFromFuotaTaskRequest
     * @return A Java Future containing the result of the DisassociateMulticastGroupFromFuotaTask operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsync.DisassociateMulticastGroupFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateMulticastGroupFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMulticastGroupFromFuotaTaskResult> disassociateMulticastGroupFromFuotaTaskAsync(
            DisassociateMulticastGroupFromFuotaTaskRequest disassociateMulticastGroupFromFuotaTaskRequest);

    /**
     * <p>
     * Disassociates a multicast group from a fuota task.
     * </p>
     * 
     * @param disassociateMulticastGroupFromFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMulticastGroupFromFuotaTask operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsyncHandler.DisassociateMulticastGroupFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateMulticastGroupFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMulticastGroupFromFuotaTaskResult> disassociateMulticastGroupFromFuotaTaskAsync(
            DisassociateMulticastGroupFromFuotaTaskRequest disassociateMulticastGroupFromFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMulticastGroupFromFuotaTaskRequest, DisassociateMulticastGroupFromFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Disassociates a wireless device from a FUOTA task.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromFuotaTaskRequest
     * @return A Java Future containing the result of the DisassociateWirelessDeviceFromFuotaTask operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsync.DisassociateWirelessDeviceFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessDeviceFromFuotaTaskResult> disassociateWirelessDeviceFromFuotaTaskAsync(
            DisassociateWirelessDeviceFromFuotaTaskRequest disassociateWirelessDeviceFromFuotaTaskRequest);

    /**
     * <p>
     * Disassociates a wireless device from a FUOTA task.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWirelessDeviceFromFuotaTask operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsyncHandler.DisassociateWirelessDeviceFromFuotaTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessDeviceFromFuotaTaskResult> disassociateWirelessDeviceFromFuotaTaskAsync(
            DisassociateWirelessDeviceFromFuotaTaskRequest disassociateWirelessDeviceFromFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWirelessDeviceFromFuotaTaskRequest, DisassociateWirelessDeviceFromFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Disassociates a wireless device from a multicast group.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromMulticastGroupRequest
     * @return A Java Future containing the result of the DisassociateWirelessDeviceFromMulticastGroup operation
     *         returned by the service.
     * @sample AWSIoTWirelessAsync.DisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessDeviceFromMulticastGroupResult> disassociateWirelessDeviceFromMulticastGroupAsync(
            DisassociateWirelessDeviceFromMulticastGroupRequest disassociateWirelessDeviceFromMulticastGroupRequest);

    /**
     * <p>
     * Disassociates a wireless device from a multicast group.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWirelessDeviceFromMulticastGroup operation
     *         returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.DisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessDeviceFromMulticastGroupResult> disassociateWirelessDeviceFromMulticastGroupAsync(
            DisassociateWirelessDeviceFromMulticastGroupRequest disassociateWirelessDeviceFromMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWirelessDeviceFromMulticastGroupRequest, DisassociateWirelessDeviceFromMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Disassociates a wireless device from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromThingRequest
     * @return A Java Future containing the result of the DisassociateWirelessDeviceFromThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.DisassociateWirelessDeviceFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessDeviceFromThingResult> disassociateWirelessDeviceFromThingAsync(
            DisassociateWirelessDeviceFromThingRequest disassociateWirelessDeviceFromThingRequest);

    /**
     * <p>
     * Disassociates a wireless device from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessDeviceFromThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWirelessDeviceFromThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.DisassociateWirelessDeviceFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessDeviceFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessDeviceFromThingResult> disassociateWirelessDeviceFromThingAsync(
            DisassociateWirelessDeviceFromThingRequest disassociateWirelessDeviceFromThingRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWirelessDeviceFromThingRequest, DisassociateWirelessDeviceFromThingResult> asyncHandler);

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated certificate.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromCertificateRequest
     * @return A Java Future containing the result of the DisassociateWirelessGatewayFromCertificate operation returned
     *         by the service.
     * @sample AWSIoTWirelessAsync.DisassociateWirelessGatewayFromCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessGatewayFromCertificateResult> disassociateWirelessGatewayFromCertificateAsync(
            DisassociateWirelessGatewayFromCertificateRequest disassociateWirelessGatewayFromCertificateRequest);

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated certificate.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWirelessGatewayFromCertificate operation returned
     *         by the service.
     * @sample AWSIoTWirelessAsyncHandler.DisassociateWirelessGatewayFromCertificate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessGatewayFromCertificateResult> disassociateWirelessGatewayFromCertificateAsync(
            DisassociateWirelessGatewayFromCertificateRequest disassociateWirelessGatewayFromCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWirelessGatewayFromCertificateRequest, DisassociateWirelessGatewayFromCertificateResult> asyncHandler);

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromThingRequest
     * @return A Java Future containing the result of the DisassociateWirelessGatewayFromThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.DisassociateWirelessGatewayFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessGatewayFromThingResult> disassociateWirelessGatewayFromThingAsync(
            DisassociateWirelessGatewayFromThingRequest disassociateWirelessGatewayFromThingRequest);

    /**
     * <p>
     * Disassociates a wireless gateway from its currently associated thing.
     * </p>
     * 
     * @param disassociateWirelessGatewayFromThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateWirelessGatewayFromThing operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.DisassociateWirelessGatewayFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DisassociateWirelessGatewayFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateWirelessGatewayFromThingResult> disassociateWirelessGatewayFromThingAsync(
            DisassociateWirelessGatewayFromThingRequest disassociateWirelessGatewayFromThingRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateWirelessGatewayFromThingRequest, DisassociateWirelessGatewayFromThingResult> asyncHandler);

    /**
     * <p>
     * Gets information about a destination.
     * </p>
     * 
     * @param getDestinationRequest
     * @return A Java Future containing the result of the GetDestination operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDestination" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(GetDestinationRequest getDestinationRequest);

    /**
     * <p>
     * Gets information about a destination.
     * </p>
     * 
     * @param getDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDestination operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDestination" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(GetDestinationRequest getDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDestinationRequest, GetDestinationResult> asyncHandler);

    /**
     * <p>
     * Gets information about a device profile.
     * </p>
     * 
     * @param getDeviceProfileRequest
     * @return A Java Future containing the result of the GetDeviceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDeviceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceProfileResult> getDeviceProfileAsync(GetDeviceProfileRequest getDeviceProfileRequest);

    /**
     * <p>
     * Gets information about a device profile.
     * </p>
     * 
     * @param getDeviceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetDeviceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetDeviceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceProfileResult> getDeviceProfileAsync(GetDeviceProfileRequest getDeviceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceProfileRequest, GetDeviceProfileResult> asyncHandler);

    /**
     * <p>
     * Get the event configuration based on resource types.
     * </p>
     * 
     * @param getEventConfigurationByResourceTypesRequest
     * @return A Java Future containing the result of the GetEventConfigurationByResourceTypes operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.GetEventConfigurationByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEventConfigurationByResourceTypesResult> getEventConfigurationByResourceTypesAsync(
            GetEventConfigurationByResourceTypesRequest getEventConfigurationByResourceTypesRequest);

    /**
     * <p>
     * Get the event configuration based on resource types.
     * </p>
     * 
     * @param getEventConfigurationByResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventConfigurationByResourceTypes operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.GetEventConfigurationByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEventConfigurationByResourceTypesResult> getEventConfigurationByResourceTypesAsync(
            GetEventConfigurationByResourceTypesRequest getEventConfigurationByResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventConfigurationByResourceTypesRequest, GetEventConfigurationByResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Gets information about a FUOTA task.
     * </p>
     * 
     * @param getFuotaTaskRequest
     * @return A Java Future containing the result of the GetFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFuotaTaskResult> getFuotaTaskAsync(GetFuotaTaskRequest getFuotaTaskRequest);

    /**
     * <p>
     * Gets information about a FUOTA task.
     * </p>
     * 
     * @param getFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFuotaTaskResult> getFuotaTaskAsync(GetFuotaTaskRequest getFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetFuotaTaskRequest, GetFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Returns current default log levels or log levels by resource types. Based on resource types, log levels can be
     * for wireless device log options or wireless gateway log options.
     * </p>
     * 
     * @param getLogLevelsByResourceTypesRequest
     * @return A Java Future containing the result of the GetLogLevelsByResourceTypes operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLogLevelsByResourceTypesResult> getLogLevelsByResourceTypesAsync(
            GetLogLevelsByResourceTypesRequest getLogLevelsByResourceTypesRequest);

    /**
     * <p>
     * Returns current default log levels or log levels by resource types. Based on resource types, log levels can be
     * for wireless device log options or wireless gateway log options.
     * </p>
     * 
     * @param getLogLevelsByResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLogLevelsByResourceTypes operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLogLevelsByResourceTypesResult> getLogLevelsByResourceTypesAsync(
            GetLogLevelsByResourceTypesRequest getLogLevelsByResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetLogLevelsByResourceTypesRequest, GetLogLevelsByResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Gets information about a multicast group.
     * </p>
     * 
     * @param getMulticastGroupRequest
     * @return A Java Future containing the result of the GetMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMulticastGroupResult> getMulticastGroupAsync(GetMulticastGroupRequest getMulticastGroupRequest);

    /**
     * <p>
     * Gets information about a multicast group.
     * </p>
     * 
     * @param getMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMulticastGroupResult> getMulticastGroupAsync(GetMulticastGroupRequest getMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetMulticastGroupRequest, GetMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Gets information about a multicast group session.
     * </p>
     * 
     * @param getMulticastGroupSessionRequest
     * @return A Java Future containing the result of the GetMulticastGroupSession operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMulticastGroupSessionResult> getMulticastGroupSessionAsync(GetMulticastGroupSessionRequest getMulticastGroupSessionRequest);

    /**
     * <p>
     * Gets information about a multicast group session.
     * </p>
     * 
     * @param getMulticastGroupSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMulticastGroupSession operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMulticastGroupSessionResult> getMulticastGroupSessionAsync(GetMulticastGroupSessionRequest getMulticastGroupSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetMulticastGroupSessionRequest, GetMulticastGroupSessionResult> asyncHandler);

    /**
     * <p>
     * Get network analyzer configuration.
     * </p>
     * 
     * @param getNetworkAnalyzerConfigurationRequest
     * @return A Java Future containing the result of the GetNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.GetNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkAnalyzerConfigurationResult> getNetworkAnalyzerConfigurationAsync(
            GetNetworkAnalyzerConfigurationRequest getNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Get network analyzer configuration.
     * </p>
     * 
     * @param getNetworkAnalyzerConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.GetNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkAnalyzerConfigurationResult> getNetworkAnalyzerConfigurationAsync(
            GetNetworkAnalyzerConfigurationRequest getNetworkAnalyzerConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkAnalyzerConfigurationRequest, GetNetworkAnalyzerConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about a partner account. If <code>PartnerAccountId</code> and <code>PartnerType</code> are
     * <code>null</code>, returns all partner accounts.
     * </p>
     * 
     * @param getPartnerAccountRequest
     * @return A Java Future containing the result of the GetPartnerAccount operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetPartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPartnerAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPartnerAccountResult> getPartnerAccountAsync(GetPartnerAccountRequest getPartnerAccountRequest);

    /**
     * <p>
     * Gets information about a partner account. If <code>PartnerAccountId</code> and <code>PartnerType</code> are
     * <code>null</code>, returns all partner accounts.
     * </p>
     * 
     * @param getPartnerAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPartnerAccount operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetPartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPartnerAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPartnerAccountResult> getPartnerAccountAsync(GetPartnerAccountRequest getPartnerAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetPartnerAccountRequest, GetPartnerAccountResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetPosition operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetPositionResult> getPositionAsync(GetPositionRequest getPositionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPosition operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetPositionResult> getPositionAsync(GetPositionRequest getPositionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPositionRequest, GetPositionResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetPositionConfiguration operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetPositionConfigurationResult> getPositionConfigurationAsync(GetPositionConfigurationRequest getPositionConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPositionConfiguration operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetPositionConfigurationResult> getPositionConfigurationAsync(GetPositionConfigurationRequest getPositionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetPositionConfigurationRequest, GetPositionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Get estimated position information as a payload in GeoJSON format. The payload measurement data is resolved using
     * solvers that are provided by third-party vendors.
     * </p>
     * 
     * @param getPositionEstimateRequest
     * @return A Java Future containing the result of the GetPositionEstimate operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetPositionEstimate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionEstimate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPositionEstimateResult> getPositionEstimateAsync(GetPositionEstimateRequest getPositionEstimateRequest);

    /**
     * <p>
     * Get estimated position information as a payload in GeoJSON format. The payload measurement data is resolved using
     * solvers that are provided by third-party vendors.
     * </p>
     * 
     * @param getPositionEstimateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPositionEstimate operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetPositionEstimate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionEstimate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPositionEstimateResult> getPositionEstimateAsync(GetPositionEstimateRequest getPositionEstimateRequest,
            com.amazonaws.handlers.AsyncHandler<GetPositionEstimateRequest, GetPositionEstimateResult> asyncHandler);

    /**
     * <p>
     * Get the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param getResourceEventConfigurationRequest
     * @return A Java Future containing the result of the GetResourceEventConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.GetResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceEventConfigurationResult> getResourceEventConfigurationAsync(
            GetResourceEventConfigurationRequest getResourceEventConfigurationRequest);

    /**
     * <p>
     * Get the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param getResourceEventConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceEventConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.GetResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceEventConfigurationResult> getResourceEventConfigurationAsync(
            GetResourceEventConfigurationRequest getResourceEventConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceEventConfigurationRequest, GetResourceEventConfigurationResult> asyncHandler);

    /**
     * <p>
     * Fetches the log-level override, if any, for a given resource-ID and resource-type. It can be used for a wireless
     * device or a wireless gateway.
     * </p>
     * 
     * @param getResourceLogLevelRequest
     * @return A Java Future containing the result of the GetResourceLogLevel operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceLogLevelResult> getResourceLogLevelAsync(GetResourceLogLevelRequest getResourceLogLevelRequest);

    /**
     * <p>
     * Fetches the log-level override, if any, for a given resource-ID and resource-type. It can be used for a wireless
     * device or a wireless gateway.
     * </p>
     * 
     * @param getResourceLogLevelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceLogLevel operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceLogLevelResult> getResourceLogLevelAsync(GetResourceLogLevelRequest getResourceLogLevelRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceLogLevelRequest, GetResourceLogLevelResult> asyncHandler);

    /**
     * <p>
     * Get the position information for a given wireless device or a wireless gateway resource. The postion information
     * uses the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic System (WGS84)</a>.
     * </p>
     * 
     * @param getResourcePositionRequest
     * @return A Java Future containing the result of the GetResourcePosition operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePositionResult> getResourcePositionAsync(GetResourcePositionRequest getResourcePositionRequest);

    /**
     * <p>
     * Get the position information for a given wireless device or a wireless gateway resource. The postion information
     * uses the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic System (WGS84)</a>.
     * </p>
     * 
     * @param getResourcePositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePosition operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePositionResult> getResourcePositionAsync(GetResourcePositionRequest getResourcePositionRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePositionRequest, GetResourcePositionResult> asyncHandler);

    /**
     * <p>
     * Gets the account-specific endpoint for Configuration and Update Server (CUPS) protocol or LoRaWAN Network Server
     * (LNS) connections.
     * </p>
     * 
     * @param getServiceEndpointRequest
     * @return A Java Future containing the result of the GetServiceEndpoint operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetServiceEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceEndpointResult> getServiceEndpointAsync(GetServiceEndpointRequest getServiceEndpointRequest);

    /**
     * <p>
     * Gets the account-specific endpoint for Configuration and Update Server (CUPS) protocol or LoRaWAN Network Server
     * (LNS) connections.
     * </p>
     * 
     * @param getServiceEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceEndpoint operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetServiceEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceEndpointResult> getServiceEndpointAsync(GetServiceEndpointRequest getServiceEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceEndpointRequest, GetServiceEndpointResult> asyncHandler);

    /**
     * <p>
     * Gets information about a service profile.
     * </p>
     * 
     * @param getServiceProfileRequest
     * @return A Java Future containing the result of the GetServiceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceProfileResult> getServiceProfileAsync(GetServiceProfileRequest getServiceProfileRequest);

    /**
     * <p>
     * Gets information about a service profile.
     * </p>
     * 
     * @param getServiceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceProfile operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetServiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetServiceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceProfileResult> getServiceProfileAsync(GetServiceProfileRequest getServiceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceProfileRequest, GetServiceProfileResult> asyncHandler);

    /**
     * <p>
     * Gets information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceRequest
     * @return A Java Future containing the result of the GetWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessDeviceResult> getWirelessDeviceAsync(GetWirelessDeviceRequest getWirelessDeviceRequest);

    /**
     * <p>
     * Gets information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessDeviceResult> getWirelessDeviceAsync(GetWirelessDeviceRequest getWirelessDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessDeviceRequest, GetWirelessDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets operating information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceStatisticsRequest
     * @return A Java Future containing the result of the GetWirelessDeviceStatistics operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetWirelessDeviceStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDeviceStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessDeviceStatisticsResult> getWirelessDeviceStatisticsAsync(
            GetWirelessDeviceStatisticsRequest getWirelessDeviceStatisticsRequest);

    /**
     * <p>
     * Gets operating information about a wireless device.
     * </p>
     * 
     * @param getWirelessDeviceStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessDeviceStatistics operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessDeviceStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessDeviceStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessDeviceStatisticsResult> getWirelessDeviceStatisticsAsync(
            GetWirelessDeviceStatisticsRequest getWirelessDeviceStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessDeviceStatisticsRequest, GetWirelessDeviceStatisticsResult> asyncHandler);

    /**
     * <p>
     * Gets information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayRequest
     * @return A Java Future containing the result of the GetWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayResult> getWirelessGatewayAsync(GetWirelessGatewayRequest getWirelessGatewayRequest);

    /**
     * <p>
     * Gets information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayResult> getWirelessGatewayAsync(GetWirelessGatewayRequest getWirelessGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayRequest, GetWirelessGatewayResult> asyncHandler);

    /**
     * <p>
     * Gets the ID of the certificate that is currently associated with a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayCertificateRequest
     * @return A Java Future containing the result of the GetWirelessGatewayCertificate operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.GetWirelessGatewayCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayCertificateResult> getWirelessGatewayCertificateAsync(
            GetWirelessGatewayCertificateRequest getWirelessGatewayCertificateRequest);

    /**
     * <p>
     * Gets the ID of the certificate that is currently associated with a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessGatewayCertificate operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessGatewayCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayCertificateResult> getWirelessGatewayCertificateAsync(
            GetWirelessGatewayCertificateRequest getWirelessGatewayCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayCertificateRequest, GetWirelessGatewayCertificateResult> asyncHandler);

    /**
     * <p>
     * Gets the firmware version and other information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayFirmwareInformationRequest
     * @return A Java Future containing the result of the GetWirelessGatewayFirmwareInformation operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsync.GetWirelessGatewayFirmwareInformation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayFirmwareInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayFirmwareInformationResult> getWirelessGatewayFirmwareInformationAsync(
            GetWirelessGatewayFirmwareInformationRequest getWirelessGatewayFirmwareInformationRequest);

    /**
     * <p>
     * Gets the firmware version and other information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayFirmwareInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessGatewayFirmwareInformation operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessGatewayFirmwareInformation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayFirmwareInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayFirmwareInformationResult> getWirelessGatewayFirmwareInformationAsync(
            GetWirelessGatewayFirmwareInformationRequest getWirelessGatewayFirmwareInformationRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayFirmwareInformationRequest, GetWirelessGatewayFirmwareInformationResult> asyncHandler);

    /**
     * <p>
     * Gets operating information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayStatisticsRequest
     * @return A Java Future containing the result of the GetWirelessGatewayStatistics operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.GetWirelessGatewayStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayStatisticsResult> getWirelessGatewayStatisticsAsync(
            GetWirelessGatewayStatisticsRequest getWirelessGatewayStatisticsRequest);

    /**
     * <p>
     * Gets operating information about a wireless gateway.
     * </p>
     * 
     * @param getWirelessGatewayStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessGatewayStatistics operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessGatewayStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayStatisticsResult> getWirelessGatewayStatisticsAsync(
            GetWirelessGatewayStatisticsRequest getWirelessGatewayStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayStatisticsRequest, GetWirelessGatewayStatisticsResult> asyncHandler);

    /**
     * <p>
     * Gets information about a wireless gateway task.
     * </p>
     * 
     * @param getWirelessGatewayTaskRequest
     * @return A Java Future containing the result of the GetWirelessGatewayTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.GetWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayTaskResult> getWirelessGatewayTaskAsync(GetWirelessGatewayTaskRequest getWirelessGatewayTaskRequest);

    /**
     * <p>
     * Gets information about a wireless gateway task.
     * </p>
     * 
     * @param getWirelessGatewayTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessGatewayTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessGatewayTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayTaskResult> getWirelessGatewayTaskAsync(GetWirelessGatewayTaskRequest getWirelessGatewayTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayTaskRequest, GetWirelessGatewayTaskResult> asyncHandler);

    /**
     * <p>
     * Gets information about a wireless gateway task definition.
     * </p>
     * 
     * @param getWirelessGatewayTaskDefinitionRequest
     * @return A Java Future containing the result of the GetWirelessGatewayTaskDefinition operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.GetWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayTaskDefinitionResult> getWirelessGatewayTaskDefinitionAsync(
            GetWirelessGatewayTaskDefinitionRequest getWirelessGatewayTaskDefinitionRequest);

    /**
     * <p>
     * Gets information about a wireless gateway task definition.
     * </p>
     * 
     * @param getWirelessGatewayTaskDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWirelessGatewayTaskDefinition operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.GetWirelessGatewayTaskDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTaskDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWirelessGatewayTaskDefinitionResult> getWirelessGatewayTaskDefinitionAsync(
            GetWirelessGatewayTaskDefinitionRequest getWirelessGatewayTaskDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetWirelessGatewayTaskDefinitionRequest, GetWirelessGatewayTaskDefinitionResult> asyncHandler);

    /**
     * <p>
     * Lists the destinations registered to your AWS account.
     * </p>
     * 
     * @param listDestinationsRequest
     * @return A Java Future containing the result of the ListDestinations operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDestinations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(ListDestinationsRequest listDestinationsRequest);

    /**
     * <p>
     * Lists the destinations registered to your AWS account.
     * </p>
     * 
     * @param listDestinationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDestinations operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDestinations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(ListDestinationsRequest listDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDestinationsRequest, ListDestinationsResult> asyncHandler);

    /**
     * <p>
     * Lists the device profiles registered to your AWS account.
     * </p>
     * 
     * @param listDeviceProfilesRequest
     * @return A Java Future containing the result of the ListDeviceProfiles operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListDeviceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDeviceProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceProfilesResult> listDeviceProfilesAsync(ListDeviceProfilesRequest listDeviceProfilesRequest);

    /**
     * <p>
     * Lists the device profiles registered to your AWS account.
     * </p>
     * 
     * @param listDeviceProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceProfiles operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListDeviceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListDeviceProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceProfilesResult> listDeviceProfilesAsync(ListDeviceProfilesRequest listDeviceProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceProfilesRequest, ListDeviceProfilesResult> asyncHandler);

    /**
     * <p>
     * List event configurations where at least one event topic has been enabled.
     * </p>
     * 
     * @param listEventConfigurationsRequest
     * @return A Java Future containing the result of the ListEventConfigurations operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListEventConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListEventConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventConfigurationsResult> listEventConfigurationsAsync(ListEventConfigurationsRequest listEventConfigurationsRequest);

    /**
     * <p>
     * List event configurations where at least one event topic has been enabled.
     * </p>
     * 
     * @param listEventConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventConfigurations operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListEventConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListEventConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventConfigurationsResult> listEventConfigurationsAsync(ListEventConfigurationsRequest listEventConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventConfigurationsRequest, ListEventConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists the FUOTA tasks registered to your AWS account.
     * </p>
     * 
     * @param listFuotaTasksRequest
     * @return A Java Future containing the result of the ListFuotaTasks operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListFuotaTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListFuotaTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFuotaTasksResult> listFuotaTasksAsync(ListFuotaTasksRequest listFuotaTasksRequest);

    /**
     * <p>
     * Lists the FUOTA tasks registered to your AWS account.
     * </p>
     * 
     * @param listFuotaTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFuotaTasks operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListFuotaTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListFuotaTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFuotaTasksResult> listFuotaTasksAsync(ListFuotaTasksRequest listFuotaTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListFuotaTasksRequest, ListFuotaTasksResult> asyncHandler);

    /**
     * <p>
     * Lists the multicast groups registered to your AWS account.
     * </p>
     * 
     * @param listMulticastGroupsRequest
     * @return A Java Future containing the result of the ListMulticastGroups operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListMulticastGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMulticastGroupsResult> listMulticastGroupsAsync(ListMulticastGroupsRequest listMulticastGroupsRequest);

    /**
     * <p>
     * Lists the multicast groups registered to your AWS account.
     * </p>
     * 
     * @param listMulticastGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMulticastGroups operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListMulticastGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMulticastGroupsResult> listMulticastGroupsAsync(ListMulticastGroupsRequest listMulticastGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMulticastGroupsRequest, ListMulticastGroupsResult> asyncHandler);

    /**
     * <p>
     * List all multicast groups associated with a fuota task.
     * </p>
     * 
     * @param listMulticastGroupsByFuotaTaskRequest
     * @return A Java Future containing the result of the ListMulticastGroupsByFuotaTask operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.ListMulticastGroupsByFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroupsByFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMulticastGroupsByFuotaTaskResult> listMulticastGroupsByFuotaTaskAsync(
            ListMulticastGroupsByFuotaTaskRequest listMulticastGroupsByFuotaTaskRequest);

    /**
     * <p>
     * List all multicast groups associated with a fuota task.
     * </p>
     * 
     * @param listMulticastGroupsByFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMulticastGroupsByFuotaTask operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.ListMulticastGroupsByFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListMulticastGroupsByFuotaTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMulticastGroupsByFuotaTaskResult> listMulticastGroupsByFuotaTaskAsync(
            ListMulticastGroupsByFuotaTaskRequest listMulticastGroupsByFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<ListMulticastGroupsByFuotaTaskRequest, ListMulticastGroupsByFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Lists the network analyzer configurations.
     * </p>
     * 
     * @param listNetworkAnalyzerConfigurationsRequest
     * @return A Java Future containing the result of the ListNetworkAnalyzerConfigurations operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.ListNetworkAnalyzerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListNetworkAnalyzerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkAnalyzerConfigurationsResult> listNetworkAnalyzerConfigurationsAsync(
            ListNetworkAnalyzerConfigurationsRequest listNetworkAnalyzerConfigurationsRequest);

    /**
     * <p>
     * Lists the network analyzer configurations.
     * </p>
     * 
     * @param listNetworkAnalyzerConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNetworkAnalyzerConfigurations operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.ListNetworkAnalyzerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListNetworkAnalyzerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkAnalyzerConfigurationsResult> listNetworkAnalyzerConfigurationsAsync(
            ListNetworkAnalyzerConfigurationsRequest listNetworkAnalyzerConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNetworkAnalyzerConfigurationsRequest, ListNetworkAnalyzerConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists the partner accounts associated with your AWS account.
     * </p>
     * 
     * @param listPartnerAccountsRequest
     * @return A Java Future containing the result of the ListPartnerAccounts operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListPartnerAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPartnerAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPartnerAccountsResult> listPartnerAccountsAsync(ListPartnerAccountsRequest listPartnerAccountsRequest);

    /**
     * <p>
     * Lists the partner accounts associated with your AWS account.
     * </p>
     * 
     * @param listPartnerAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPartnerAccounts operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListPartnerAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPartnerAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPartnerAccountsResult> listPartnerAccountsAsync(ListPartnerAccountsRequest listPartnerAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPartnerAccountsRequest, ListPartnerAccountsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListPositionConfigurations operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListPositionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPositionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<ListPositionConfigurationsResult> listPositionConfigurationsAsync(
            ListPositionConfigurationsRequest listPositionConfigurationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPositionConfigurations operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListPositionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPositionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<ListPositionConfigurationsResult> listPositionConfigurationsAsync(
            ListPositionConfigurationsRequest listPositionConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPositionConfigurationsRequest, ListPositionConfigurationsResult> asyncHandler);

    /**
     * <p>
     * List queued messages in the downlink queue.
     * </p>
     * 
     * @param listQueuedMessagesRequest
     * @return A Java Future containing the result of the ListQueuedMessages operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListQueuedMessages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQueuedMessagesResult> listQueuedMessagesAsync(ListQueuedMessagesRequest listQueuedMessagesRequest);

    /**
     * <p>
     * List queued messages in the downlink queue.
     * </p>
     * 
     * @param listQueuedMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueuedMessages operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListQueuedMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListQueuedMessages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQueuedMessagesResult> listQueuedMessagesAsync(ListQueuedMessagesRequest listQueuedMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueuedMessagesRequest, ListQueuedMessagesResult> asyncHandler);

    /**
     * <p>
     * Lists the service profiles registered to your AWS account.
     * </p>
     * 
     * @param listServiceProfilesRequest
     * @return A Java Future containing the result of the ListServiceProfiles operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListServiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListServiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceProfilesResult> listServiceProfilesAsync(ListServiceProfilesRequest listServiceProfilesRequest);

    /**
     * <p>
     * Lists the service profiles registered to your AWS account.
     * </p>
     * 
     * @param listServiceProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceProfiles operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListServiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListServiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceProfilesResult> listServiceProfilesAsync(ListServiceProfilesRequest listServiceProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceProfilesRequest, ListServiceProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the wireless devices registered to your AWS account.
     * </p>
     * 
     * @param listWirelessDevicesRequest
     * @return A Java Future containing the result of the ListWirelessDevices operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListWirelessDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWirelessDevicesResult> listWirelessDevicesAsync(ListWirelessDevicesRequest listWirelessDevicesRequest);

    /**
     * <p>
     * Lists the wireless devices registered to your AWS account.
     * </p>
     * 
     * @param listWirelessDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWirelessDevices operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListWirelessDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWirelessDevicesResult> listWirelessDevicesAsync(ListWirelessDevicesRequest listWirelessDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWirelessDevicesRequest, ListWirelessDevicesResult> asyncHandler);

    /**
     * <p>
     * List the wireless gateway tasks definitions registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewayTaskDefinitionsRequest
     * @return A Java Future containing the result of the ListWirelessGatewayTaskDefinitions operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.ListWirelessGatewayTaskDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGatewayTaskDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWirelessGatewayTaskDefinitionsResult> listWirelessGatewayTaskDefinitionsAsync(
            ListWirelessGatewayTaskDefinitionsRequest listWirelessGatewayTaskDefinitionsRequest);

    /**
     * <p>
     * List the wireless gateway tasks definitions registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewayTaskDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWirelessGatewayTaskDefinitions operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.ListWirelessGatewayTaskDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGatewayTaskDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWirelessGatewayTaskDefinitionsResult> listWirelessGatewayTaskDefinitionsAsync(
            ListWirelessGatewayTaskDefinitionsRequest listWirelessGatewayTaskDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWirelessGatewayTaskDefinitionsRequest, ListWirelessGatewayTaskDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Lists the wireless gateways registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewaysRequest
     * @return A Java Future containing the result of the ListWirelessGateways operation returned by the service.
     * @sample AWSIoTWirelessAsync.ListWirelessGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWirelessGatewaysResult> listWirelessGatewaysAsync(ListWirelessGatewaysRequest listWirelessGatewaysRequest);

    /**
     * <p>
     * Lists the wireless gateways registered to your AWS account.
     * </p>
     * 
     * @param listWirelessGatewaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWirelessGateways operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ListWirelessGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGateways"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWirelessGatewaysResult> listWirelessGatewaysAsync(ListWirelessGatewaysRequest listWirelessGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<ListWirelessGatewaysRequest, ListWirelessGatewaysResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutPositionConfiguration operation returned by the service.
     * @sample AWSIoTWirelessAsync.PutPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<PutPositionConfigurationResult> putPositionConfigurationAsync(PutPositionConfigurationRequest putPositionConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPositionConfiguration operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.PutPositionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutPositionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<PutPositionConfigurationResult> putPositionConfigurationAsync(PutPositionConfigurationRequest putPositionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutPositionConfigurationRequest, PutPositionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Sets the log-level override for a resource-ID and resource-type. This option can be specified for a wireless
     * gateway or a wireless device. A limit of 200 log level override can be set per account.
     * </p>
     * 
     * @param putResourceLogLevelRequest
     * @return A Java Future containing the result of the PutResourceLogLevel operation returned by the service.
     * @sample AWSIoTWirelessAsync.PutResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourceLogLevelResult> putResourceLogLevelAsync(PutResourceLogLevelRequest putResourceLogLevelRequest);

    /**
     * <p>
     * Sets the log-level override for a resource-ID and resource-type. This option can be specified for a wireless
     * gateway or a wireless device. A limit of 200 log level override can be set per account.
     * </p>
     * 
     * @param putResourceLogLevelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourceLogLevel operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.PutResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/PutResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourceLogLevelResult> putResourceLogLevelAsync(PutResourceLogLevelRequest putResourceLogLevelRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourceLogLevelRequest, PutResourceLogLevelResult> asyncHandler);

    /**
     * <p>
     * Removes the log-level overrides for all resources; both wireless devices and wireless gateways.
     * </p>
     * 
     * @param resetAllResourceLogLevelsRequest
     * @return A Java Future containing the result of the ResetAllResourceLogLevels operation returned by the service.
     * @sample AWSIoTWirelessAsync.ResetAllResourceLogLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetAllResourceLogLevels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetAllResourceLogLevelsResult> resetAllResourceLogLevelsAsync(
            ResetAllResourceLogLevelsRequest resetAllResourceLogLevelsRequest);

    /**
     * <p>
     * Removes the log-level overrides for all resources; both wireless devices and wireless gateways.
     * </p>
     * 
     * @param resetAllResourceLogLevelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetAllResourceLogLevels operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ResetAllResourceLogLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetAllResourceLogLevels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetAllResourceLogLevelsResult> resetAllResourceLogLevelsAsync(
            ResetAllResourceLogLevelsRequest resetAllResourceLogLevelsRequest,
            com.amazonaws.handlers.AsyncHandler<ResetAllResourceLogLevelsRequest, ResetAllResourceLogLevelsResult> asyncHandler);

    /**
     * <p>
     * Removes the log-level override, if any, for a specific resource-ID and resource-type. It can be used for a
     * wireless device or a wireless gateway.
     * </p>
     * 
     * @param resetResourceLogLevelRequest
     * @return A Java Future containing the result of the ResetResourceLogLevel operation returned by the service.
     * @sample AWSIoTWirelessAsync.ResetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetResourceLogLevelResult> resetResourceLogLevelAsync(ResetResourceLogLevelRequest resetResourceLogLevelRequest);

    /**
     * <p>
     * Removes the log-level override, if any, for a specific resource-ID and resource-type. It can be used for a
     * wireless device or a wireless gateway.
     * </p>
     * 
     * @param resetResourceLogLevelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetResourceLogLevel operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.ResetResourceLogLevel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ResetResourceLogLevel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResetResourceLogLevelResult> resetResourceLogLevelAsync(ResetResourceLogLevelRequest resetResourceLogLevelRequest,
            com.amazonaws.handlers.AsyncHandler<ResetResourceLogLevelRequest, ResetResourceLogLevelResult> asyncHandler);

    /**
     * <p>
     * Sends the specified data to a multicast group.
     * </p>
     * 
     * @param sendDataToMulticastGroupRequest
     * @return A Java Future containing the result of the SendDataToMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsync.SendDataToMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDataToMulticastGroupResult> sendDataToMulticastGroupAsync(SendDataToMulticastGroupRequest sendDataToMulticastGroupRequest);

    /**
     * <p>
     * Sends the specified data to a multicast group.
     * </p>
     * 
     * @param sendDataToMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendDataToMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.SendDataToMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDataToMulticastGroupResult> sendDataToMulticastGroupAsync(SendDataToMulticastGroupRequest sendDataToMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<SendDataToMulticastGroupRequest, SendDataToMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Sends a decrypted application data frame to a device.
     * </p>
     * 
     * @param sendDataToWirelessDeviceRequest
     * @return A Java Future containing the result of the SendDataToWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsync.SendDataToWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDataToWirelessDeviceResult> sendDataToWirelessDeviceAsync(SendDataToWirelessDeviceRequest sendDataToWirelessDeviceRequest);

    /**
     * <p>
     * Sends a decrypted application data frame to a device.
     * </p>
     * 
     * @param sendDataToWirelessDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendDataToWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.SendDataToWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SendDataToWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendDataToWirelessDeviceResult> sendDataToWirelessDeviceAsync(SendDataToWirelessDeviceRequest sendDataToWirelessDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<SendDataToWirelessDeviceRequest, SendDataToWirelessDeviceResult> asyncHandler);

    /**
     * <p>
     * Starts a bulk association of all qualifying wireless devices with a multicast group.
     * </p>
     * 
     * @param startBulkAssociateWirelessDeviceWithMulticastGroupRequest
     * @return A Java Future containing the result of the StartBulkAssociateWirelessDeviceWithMulticastGroup operation
     *         returned by the service.
     * @sample AWSIoTWirelessAsync.StartBulkAssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkAssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBulkAssociateWirelessDeviceWithMulticastGroupResult> startBulkAssociateWirelessDeviceWithMulticastGroupAsync(
            StartBulkAssociateWirelessDeviceWithMulticastGroupRequest startBulkAssociateWirelessDeviceWithMulticastGroupRequest);

    /**
     * <p>
     * Starts a bulk association of all qualifying wireless devices with a multicast group.
     * </p>
     * 
     * @param startBulkAssociateWirelessDeviceWithMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartBulkAssociateWirelessDeviceWithMulticastGroup operation
     *         returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.StartBulkAssociateWirelessDeviceWithMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkAssociateWirelessDeviceWithMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBulkAssociateWirelessDeviceWithMulticastGroupResult> startBulkAssociateWirelessDeviceWithMulticastGroupAsync(
            StartBulkAssociateWirelessDeviceWithMulticastGroupRequest startBulkAssociateWirelessDeviceWithMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<StartBulkAssociateWirelessDeviceWithMulticastGroupRequest, StartBulkAssociateWirelessDeviceWithMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Starts a bulk disassociatin of all qualifying wireless devices from a multicast group.
     * </p>
     * 
     * @param startBulkDisassociateWirelessDeviceFromMulticastGroupRequest
     * @return A Java Future containing the result of the StartBulkDisassociateWirelessDeviceFromMulticastGroup
     *         operation returned by the service.
     * @sample AWSIoTWirelessAsync.StartBulkDisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkDisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBulkDisassociateWirelessDeviceFromMulticastGroupResult> startBulkDisassociateWirelessDeviceFromMulticastGroupAsync(
            StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest startBulkDisassociateWirelessDeviceFromMulticastGroupRequest);

    /**
     * <p>
     * Starts a bulk disassociatin of all qualifying wireless devices from a multicast group.
     * </p>
     * 
     * @param startBulkDisassociateWirelessDeviceFromMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartBulkDisassociateWirelessDeviceFromMulticastGroup
     *         operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.StartBulkDisassociateWirelessDeviceFromMulticastGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartBulkDisassociateWirelessDeviceFromMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBulkDisassociateWirelessDeviceFromMulticastGroupResult> startBulkDisassociateWirelessDeviceFromMulticastGroupAsync(
            StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest startBulkDisassociateWirelessDeviceFromMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest, StartBulkDisassociateWirelessDeviceFromMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Starts a FUOTA task.
     * </p>
     * 
     * @param startFuotaTaskRequest
     * @return A Java Future containing the result of the StartFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.StartFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFuotaTaskResult> startFuotaTaskAsync(StartFuotaTaskRequest startFuotaTaskRequest);

    /**
     * <p>
     * Starts a FUOTA task.
     * </p>
     * 
     * @param startFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.StartFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartFuotaTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFuotaTaskResult> startFuotaTaskAsync(StartFuotaTaskRequest startFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartFuotaTaskRequest, StartFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Starts a multicast group session.
     * </p>
     * 
     * @param startMulticastGroupSessionRequest
     * @return A Java Future containing the result of the StartMulticastGroupSession operation returned by the service.
     * @sample AWSIoTWirelessAsync.StartMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMulticastGroupSessionResult> startMulticastGroupSessionAsync(
            StartMulticastGroupSessionRequest startMulticastGroupSessionRequest);

    /**
     * <p>
     * Starts a multicast group session.
     * </p>
     * 
     * @param startMulticastGroupSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMulticastGroupSession operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.StartMulticastGroupSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartMulticastGroupSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMulticastGroupSessionResult> startMulticastGroupSessionAsync(
            StartMulticastGroupSessionRequest startMulticastGroupSessionRequest,
            com.amazonaws.handlers.AsyncHandler<StartMulticastGroupSessionRequest, StartMulticastGroupSessionResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTWirelessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Simulates a provisioned device by sending an uplink data payload of <code>Hello</code>.
     * </p>
     * 
     * @param testWirelessDeviceRequest
     * @return A Java Future containing the result of the TestWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsync.TestWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TestWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestWirelessDeviceResult> testWirelessDeviceAsync(TestWirelessDeviceRequest testWirelessDeviceRequest);

    /**
     * <p>
     * Simulates a provisioned device by sending an uplink data payload of <code>Hello</code>.
     * </p>
     * 
     * @param testWirelessDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.TestWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TestWirelessDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestWirelessDeviceResult> testWirelessDeviceAsync(TestWirelessDeviceRequest testWirelessDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<TestWirelessDeviceRequest, TestWirelessDeviceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTWirelessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates properties of a destination.
     * </p>
     * 
     * @param updateDestinationRequest
     * @return A Java Future containing the result of the UpdateDestination operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest updateDestinationRequest);

    /**
     * <p>
     * Updates properties of a destination.
     * </p>
     * 
     * @param updateDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDestination operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest updateDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDestinationRequest, UpdateDestinationResult> asyncHandler);

    /**
     * <p>
     * Update the event configuration based on resource types.
     * </p>
     * 
     * @param updateEventConfigurationByResourceTypesRequest
     * @return A Java Future containing the result of the UpdateEventConfigurationByResourceTypes operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsync.UpdateEventConfigurationByResourceTypes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventConfigurationByResourceTypesResult> updateEventConfigurationByResourceTypesAsync(
            UpdateEventConfigurationByResourceTypesRequest updateEventConfigurationByResourceTypesRequest);

    /**
     * <p>
     * Update the event configuration based on resource types.
     * </p>
     * 
     * @param updateEventConfigurationByResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventConfigurationByResourceTypes operation returned by
     *         the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateEventConfigurationByResourceTypes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateEventConfigurationByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventConfigurationByResourceTypesResult> updateEventConfigurationByResourceTypesAsync(
            UpdateEventConfigurationByResourceTypesRequest updateEventConfigurationByResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEventConfigurationByResourceTypesRequest, UpdateEventConfigurationByResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Updates properties of a FUOTA task.
     * </p>
     * 
     * @param updateFuotaTaskRequest
     * @return A Java Future containing the result of the UpdateFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFuotaTaskResult> updateFuotaTaskAsync(UpdateFuotaTaskRequest updateFuotaTaskRequest);

    /**
     * <p>
     * Updates properties of a FUOTA task.
     * </p>
     * 
     * @param updateFuotaTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFuotaTask operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateFuotaTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateFuotaTask" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFuotaTaskResult> updateFuotaTaskAsync(UpdateFuotaTaskRequest updateFuotaTaskRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFuotaTaskRequest, UpdateFuotaTaskResult> asyncHandler);

    /**
     * <p>
     * Set default log level, or log levels by resource types. This can be for wireless device log options or wireless
     * gateways log options and is used to control the log messages that'll be displayed in CloudWatch.
     * </p>
     * 
     * @param updateLogLevelsByResourceTypesRequest
     * @return A Java Future containing the result of the UpdateLogLevelsByResourceTypes operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.UpdateLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLogLevelsByResourceTypesResult> updateLogLevelsByResourceTypesAsync(
            UpdateLogLevelsByResourceTypesRequest updateLogLevelsByResourceTypesRequest);

    /**
     * <p>
     * Set default log level, or log levels by resource types. This can be for wireless device log options or wireless
     * gateways log options and is used to control the log messages that'll be displayed in CloudWatch.
     * </p>
     * 
     * @param updateLogLevelsByResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLogLevelsByResourceTypes operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateLogLevelsByResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateLogLevelsByResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLogLevelsByResourceTypesResult> updateLogLevelsByResourceTypesAsync(
            UpdateLogLevelsByResourceTypesRequest updateLogLevelsByResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLogLevelsByResourceTypesRequest, UpdateLogLevelsByResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Updates properties of a multicast group session.
     * </p>
     * 
     * @param updateMulticastGroupRequest
     * @return A Java Future containing the result of the UpdateMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMulticastGroupResult> updateMulticastGroupAsync(UpdateMulticastGroupRequest updateMulticastGroupRequest);

    /**
     * <p>
     * Updates properties of a multicast group session.
     * </p>
     * 
     * @param updateMulticastGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMulticastGroup operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateMulticastGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateMulticastGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMulticastGroupResult> updateMulticastGroupAsync(UpdateMulticastGroupRequest updateMulticastGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMulticastGroupRequest, UpdateMulticastGroupResult> asyncHandler);

    /**
     * <p>
     * Update network analyzer configuration.
     * </p>
     * 
     * @param updateNetworkAnalyzerConfigurationRequest
     * @return A Java Future containing the result of the UpdateNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.UpdateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkAnalyzerConfigurationResult> updateNetworkAnalyzerConfigurationAsync(
            UpdateNetworkAnalyzerConfigurationRequest updateNetworkAnalyzerConfigurationRequest);

    /**
     * <p>
     * Update network analyzer configuration.
     * </p>
     * 
     * @param updateNetworkAnalyzerConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNetworkAnalyzerConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateNetworkAnalyzerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateNetworkAnalyzerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkAnalyzerConfigurationResult> updateNetworkAnalyzerConfigurationAsync(
            UpdateNetworkAnalyzerConfigurationRequest updateNetworkAnalyzerConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNetworkAnalyzerConfigurationRequest, UpdateNetworkAnalyzerConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates properties of a partner account.
     * </p>
     * 
     * @param updatePartnerAccountRequest
     * @return A Java Future containing the result of the UpdatePartnerAccount operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdatePartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePartnerAccountResult> updatePartnerAccountAsync(UpdatePartnerAccountRequest updatePartnerAccountRequest);

    /**
     * <p>
     * Updates properties of a partner account.
     * </p>
     * 
     * @param updatePartnerAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePartnerAccount operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdatePartnerAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePartnerAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePartnerAccountResult> updatePartnerAccountAsync(UpdatePartnerAccountRequest updatePartnerAccountRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePartnerAccountRequest, UpdatePartnerAccountResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdatePosition operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdatePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<UpdatePositionResult> updatePositionAsync(UpdatePositionRequest updatePositionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePosition operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdatePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePosition" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<UpdatePositionResult> updatePositionAsync(UpdatePositionRequest updatePositionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePositionRequest, UpdatePositionResult> asyncHandler);

    /**
     * <p>
     * Update the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param updateResourceEventConfigurationRequest
     * @return A Java Future containing the result of the UpdateResourceEventConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsync.UpdateResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceEventConfigurationResult> updateResourceEventConfigurationAsync(
            UpdateResourceEventConfigurationRequest updateResourceEventConfigurationRequest);

    /**
     * <p>
     * Update the event configuration for a particular resource identifier.
     * </p>
     * 
     * @param updateResourceEventConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceEventConfiguration operation returned by the
     *         service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateResourceEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourceEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceEventConfigurationResult> updateResourceEventConfigurationAsync(
            UpdateResourceEventConfigurationRequest updateResourceEventConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceEventConfigurationRequest, UpdateResourceEventConfigurationResult> asyncHandler);

    /**
     * <p>
     * Update the position information of a given wireless device or a wireless gateway resource. The postion
     * coordinates are based on the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic
     * System (WGS84)</a>.
     * </p>
     * 
     * @param updateResourcePositionRequest
     * @return A Java Future containing the result of the UpdateResourcePosition operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdateResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourcePositionResult> updateResourcePositionAsync(UpdateResourcePositionRequest updateResourcePositionRequest);

    /**
     * <p>
     * Update the position information of a given wireless device or a wireless gateway resource. The postion
     * coordinates are based on the <a href="https://gisgeography.com/wgs84-world-geodetic-system/"> World Geodetic
     * System (WGS84)</a>.
     * </p>
     * 
     * @param updateResourcePositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourcePosition operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateResourcePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateResourcePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourcePositionResult> updateResourcePositionAsync(UpdateResourcePositionRequest updateResourcePositionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourcePositionRequest, UpdateResourcePositionResult> asyncHandler);

    /**
     * <p>
     * Updates properties of a wireless device.
     * </p>
     * 
     * @param updateWirelessDeviceRequest
     * @return A Java Future containing the result of the UpdateWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWirelessDeviceResult> updateWirelessDeviceAsync(UpdateWirelessDeviceRequest updateWirelessDeviceRequest);

    /**
     * <p>
     * Updates properties of a wireless device.
     * </p>
     * 
     * @param updateWirelessDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWirelessDevice operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateWirelessDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWirelessDeviceResult> updateWirelessDeviceAsync(UpdateWirelessDeviceRequest updateWirelessDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWirelessDeviceRequest, UpdateWirelessDeviceResult> asyncHandler);

    /**
     * <p>
     * Updates properties of a wireless gateway.
     * </p>
     * 
     * @param updateWirelessGatewayRequest
     * @return A Java Future containing the result of the UpdateWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsync.UpdateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWirelessGatewayResult> updateWirelessGatewayAsync(UpdateWirelessGatewayRequest updateWirelessGatewayRequest);

    /**
     * <p>
     * Updates properties of a wireless gateway.
     * </p>
     * 
     * @param updateWirelessGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWirelessGateway operation returned by the service.
     * @sample AWSIoTWirelessAsyncHandler.UpdateWirelessGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWirelessGatewayResult> updateWirelessGatewayAsync(UpdateWirelessGatewayRequest updateWirelessGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWirelessGatewayRequest, UpdateWirelessGatewayResult> asyncHandler);

}
