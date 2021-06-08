/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS IoT Wireless API documentation
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
     * Returns current default log-levels, or log levels by resource types, could be for wireless device log options or
     * wireless gateway log options.
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
     * Returns current default log-levels, or log levels by resource types, could be for wireless device log options or
     * wireless gateway log options.
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
     * Fetches the log-level override if any for a given resource-ID and resource-type, coulde be a wireless device or a
     * wireless gateway.
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
     * Fetches the log-level override if any for a given resource-ID and resource-type, coulde be a wireless device or a
     * wireless gateway.
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
     * Sets the log-level override for a resource-ID and resource-type, could be a wireless gateway or a wireless
     * device.
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
     * Sets the log-level override for a resource-ID and resource-type, could be a wireless gateway or a wireless
     * device.
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
     * Remove log-level overrides if any for all resources (both wireless devices and wireless gateways).
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
     * Remove log-level overrides if any for all resources (both wireless devices and wireless gateways).
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
     * Remove log-level override if any for a specific resource-ID and resource-type, could be a wireless device or a
     * wireless gateway.
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
     * Remove log-level override if any for a specific resource-ID and resource-type, could be a wireless device or a
     * wireless gateway.
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
     * Set default log level, or log levels by resource types, could be for wireless device log options or wireless
     * gateways log options. This is to control the log messages that will be displayed in CloudWatch.
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
     * Set default log level, or log levels by resource types, could be for wireless device log options or wireless
     * gateways log options. This is to control the log messages that will be displayed in CloudWatch.
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
