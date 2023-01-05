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
package com.amazonaws.services.iotfleetwise;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;

/**
 * Interface for accessing AWS IoT FleetWise asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotfleetwise.AbstractAWSIoTFleetWiseAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services IoT FleetWise is a fully managed service that you can use to collect, model, and transfer vehicle
 * data to the Amazon Web Services cloud at scale. With Amazon Web Services IoT FleetWise, you can standardize all of
 * your vehicle data models, independent of the in-vehicle communication architecture, and define data collection rules
 * to transfer only high-value data to the cloud.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/">What is Amazon
 * Web Services IoT FleetWise?</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTFleetWiseAsync extends AWSIoTFleetWise {

    /**
     * <p>
     * Adds, or associates, a vehicle with a fleet.
     * </p>
     * 
     * @param associateVehicleFleetRequest
     * @return A Java Future containing the result of the AssociateVehicleFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.AssociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/AssociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateVehicleFleetResult> associateVehicleFleetAsync(AssociateVehicleFleetRequest associateVehicleFleetRequest);

    /**
     * <p>
     * Adds, or associates, a vehicle with a fleet.
     * </p>
     * 
     * @param associateVehicleFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateVehicleFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.AssociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/AssociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateVehicleFleetResult> associateVehicleFleetAsync(AssociateVehicleFleetRequest associateVehicleFleetRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateVehicleFleetRequest, AssociateVehicleFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a group, or batch, of vehicles.
     * </p>
     * <note>
     * <p>
     * You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/create-vehicles-cli.html">Create multiple
     * vehicles (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateVehicleRequest
     * @return A Java Future containing the result of the BatchCreateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.BatchCreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchCreateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateVehicleResult> batchCreateVehicleAsync(BatchCreateVehicleRequest batchCreateVehicleRequest);

    /**
     * <p>
     * Creates a group, or batch, of vehicles.
     * </p>
     * <note>
     * <p>
     * You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/create-vehicles-cli.html">Create multiple
     * vehicles (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateVehicleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.BatchCreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchCreateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateVehicleResult> batchCreateVehicleAsync(BatchCreateVehicleRequest batchCreateVehicleRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateVehicleRequest, BatchCreateVehicleResult> asyncHandler);

    /**
     * <p>
     * Updates a group, or batch, of vehicles.
     * </p>
     * <note>
     * <p>
     * You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/update-vehicles-cli.html">Update multiple
     * vehicles (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param batchUpdateVehicleRequest
     * @return A Java Future containing the result of the BatchUpdateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.BatchUpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchUpdateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateVehicleResult> batchUpdateVehicleAsync(BatchUpdateVehicleRequest batchUpdateVehicleRequest);

    /**
     * <p>
     * Updates a group, or batch, of vehicles.
     * </p>
     * <note>
     * <p>
     * You must specify a decoder manifest and a vehicle model (model manifest) for each vehicle.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/update-vehicles-cli.html">Update multiple
     * vehicles (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param batchUpdateVehicleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.BatchUpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchUpdateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateVehicleResult> batchUpdateVehicleAsync(BatchUpdateVehicleRequest batchUpdateVehicleRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateVehicleRequest, BatchUpdateVehicleResult> asyncHandler);

    /**
     * <p>
     * Creates an orchestration of data collection rules. The Amazon Web Services IoT FleetWise Edge Agent software
     * running in vehicles uses campaigns to decide how to collect and transfer data to the cloud. You create campaigns
     * in the cloud. After you or your team approve campaigns, Amazon Web Services IoT FleetWise automatically deploys
     * them to vehicles.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/campaigns.html">Collect and transfer data
     * with campaigns</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createCampaignRequest
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest);

    /**
     * <p>
     * Creates an orchestration of data collection rules. The Amazon Web Services IoT FleetWise Edge Agent software
     * running in vehicles uses campaigns to decide how to collect and transfer data to the cloud. You create campaigns
     * in the cloud. After you or your team approve campaigns, Amazon Web Services IoT FleetWise automatically deploys
     * them to vehicles.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/campaigns.html">Collect and transfer data
     * with campaigns</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler);

    /**
     * <p>
     * Creates the decoder manifest associated with a model manifest. To create a decoder manifest, the following must
     * be true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every signal decoder has a unique name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each signal decoder is associated with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each network interface has a unique ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * The signal decoders are specified in the model manifest.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDecoderManifestRequest
     * @return A Java Future containing the result of the CreateDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.CreateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDecoderManifestResult> createDecoderManifestAsync(CreateDecoderManifestRequest createDecoderManifestRequest);

    /**
     * <p>
     * Creates the decoder manifest associated with a model manifest. To create a decoder manifest, the following must
     * be true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Every signal decoder has a unique name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each signal decoder is associated with a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each network interface has a unique ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * The signal decoders are specified in the model manifest.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDecoderManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.CreateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDecoderManifestResult> createDecoderManifestAsync(CreateDecoderManifestRequest createDecoderManifestRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDecoderManifestRequest, CreateDecoderManifestResult> asyncHandler);

    /**
     * <p>
     * Creates a fleet that represents a group of vehicles.
     * </p>
     * <note>
     * <p>
     * You must create both a signal catalog and vehicles before you can create a fleet.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleets.html">Fleets</a> in the <i>Amazon
     * Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createFleetRequest
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a fleet that represents a group of vehicles.
     * </p>
     * <note>
     * <p>
     * You must create both a signal catalog and vehicles before you can create a fleet.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleets.html">Fleets</a> in the <i>Amazon
     * Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a vehicle model (model manifest) that specifies signals (attributes, branches, sensors, and actuators).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/vehicle-models.html">Vehicle models</a> in
     * the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createModelManifestRequest
     * @return A Java Future containing the result of the CreateModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.CreateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelManifestResult> createModelManifestAsync(CreateModelManifestRequest createModelManifestRequest);

    /**
     * <p>
     * Creates a vehicle model (model manifest) that specifies signals (attributes, branches, sensors, and actuators).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/vehicle-models.html">Vehicle models</a> in
     * the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createModelManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.CreateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelManifestResult> createModelManifestAsync(CreateModelManifestRequest createModelManifestRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelManifestRequest, CreateModelManifestResult> asyncHandler);

    /**
     * <p>
     * Creates a collection of standardized signals that can be reused to create vehicle models.
     * </p>
     * 
     * @param createSignalCatalogRequest
     * @return A Java Future containing the result of the CreateSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.CreateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSignalCatalogResult> createSignalCatalogAsync(CreateSignalCatalogRequest createSignalCatalogRequest);

    /**
     * <p>
     * Creates a collection of standardized signals that can be reused to create vehicle models.
     * </p>
     * 
     * @param createSignalCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.CreateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSignalCatalogResult> createSignalCatalogAsync(CreateSignalCatalogRequest createSignalCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSignalCatalogRequest, CreateSignalCatalogResult> asyncHandler);

    /**
     * <p>
     * Creates a vehicle, which is an instance of a vehicle model (model manifest). Vehicles created from the same
     * vehicle model consist of the same signals inherited from the vehicle model.
     * </p>
     * <note>
     * <p>
     * If you have an existing Amazon Web Services IoT Thing, you can use Amazon Web Services IoT FleetWise to create a
     * vehicle and collect data from your thing.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/create-vehicle-cli.html">Create a vehicle
     * (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createVehicleRequest
     * @return A Java Future containing the result of the CreateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.CreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVehicleResult> createVehicleAsync(CreateVehicleRequest createVehicleRequest);

    /**
     * <p>
     * Creates a vehicle, which is an instance of a vehicle model (model manifest). Vehicles created from the same
     * vehicle model consist of the same signals inherited from the vehicle model.
     * </p>
     * <note>
     * <p>
     * If you have an existing Amazon Web Services IoT Thing, you can use Amazon Web Services IoT FleetWise to create a
     * vehicle and collect data from your thing.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/create-vehicle-cli.html">Create a vehicle
     * (AWS CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * 
     * @param createVehicleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.CreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVehicleResult> createVehicleAsync(CreateVehicleRequest createVehicleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVehicleRequest, CreateVehicleResult> asyncHandler);

    /**
     * <p>
     * Deletes a data collection campaign. Deleting a campaign suspends all data collection and removes it from any
     * vehicles.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * <p>
     * Deletes a data collection campaign. Deleting a campaign suspends all data collection and removes it from any
     * vehicles.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler);

    /**
     * <p>
     * Deletes a decoder manifest. You can't delete a decoder manifest if it has vehicles associated with it.
     * </p>
     * <note>
     * <p>
     * If the decoder manifest is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200
     * response with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteDecoderManifestRequest
     * @return A Java Future containing the result of the DeleteDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.DeleteDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDecoderManifestResult> deleteDecoderManifestAsync(DeleteDecoderManifestRequest deleteDecoderManifestRequest);

    /**
     * <p>
     * Deletes a decoder manifest. You can't delete a decoder manifest if it has vehicles associated with it.
     * </p>
     * <note>
     * <p>
     * If the decoder manifest is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200
     * response with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteDecoderManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.DeleteDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDecoderManifestResult> deleteDecoderManifestAsync(DeleteDecoderManifestRequest deleteDecoderManifestRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDecoderManifestRequest, DeleteDecoderManifestResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet. Before you delete a fleet, all vehicles must be dissociated from the fleet. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/delete-fleet-cli.html">Delete a fleet (AWS
     * CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the fleet is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty body.
     * </p>
     * </note>
     * 
     * @param deleteFleetRequest
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a fleet. Before you delete a fleet, all vehicles must be dissociated from the fleet. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/delete-fleet-cli.html">Delete a fleet (AWS
     * CLI)</a> in the <i>Amazon Web Services IoT FleetWise Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * If the fleet is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty body.
     * </p>
     * </note>
     * 
     * @param deleteFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes a vehicle model (model manifest).
     * </p>
     * <note>
     * <p>
     * If the vehicle model is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response
     * with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteModelManifestRequest
     * @return A Java Future containing the result of the DeleteModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.DeleteModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelManifestResult> deleteModelManifestAsync(DeleteModelManifestRequest deleteModelManifestRequest);

    /**
     * <p>
     * Deletes a vehicle model (model manifest).
     * </p>
     * <note>
     * <p>
     * If the vehicle model is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response
     * with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteModelManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.DeleteModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelManifestResult> deleteModelManifestAsync(DeleteModelManifestRequest deleteModelManifestRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelManifestRequest, DeleteModelManifestResult> asyncHandler);

    /**
     * <p>
     * Deletes a signal catalog.
     * </p>
     * <note>
     * <p>
     * If the signal catalog is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response
     * with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteSignalCatalogRequest
     * @return A Java Future containing the result of the DeleteSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.DeleteSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSignalCatalogResult> deleteSignalCatalogAsync(DeleteSignalCatalogRequest deleteSignalCatalogRequest);

    /**
     * <p>
     * Deletes a signal catalog.
     * </p>
     * <note>
     * <p>
     * If the signal catalog is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response
     * with an empty body.
     * </p>
     * </note>
     * 
     * @param deleteSignalCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.DeleteSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSignalCatalogResult> deleteSignalCatalogAsync(DeleteSignalCatalogRequest deleteSignalCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSignalCatalogRequest, DeleteSignalCatalogResult> asyncHandler);

    /**
     * <p>
     * Deletes a vehicle and removes it from any campaigns.
     * </p>
     * <note>
     * <p>
     * If the vehicle is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty body.
     * </p>
     * </note>
     * 
     * @param deleteVehicleRequest
     * @return A Java Future containing the result of the DeleteVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.DeleteVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVehicleResult> deleteVehicleAsync(DeleteVehicleRequest deleteVehicleRequest);

    /**
     * <p>
     * Deletes a vehicle and removes it from any campaigns.
     * </p>
     * <note>
     * <p>
     * If the vehicle is successfully deleted, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty body.
     * </p>
     * </note>
     * 
     * @param deleteVehicleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.DeleteVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVehicleResult> deleteVehicleAsync(DeleteVehicleRequest deleteVehicleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVehicleRequest, DeleteVehicleResult> asyncHandler);

    /**
     * <p>
     * Removes, or disassociates, a vehicle from a fleet. Disassociating a vehicle from a fleet doesn't delete the
     * vehicle.
     * </p>
     * <note>
     * <p>
     * If the vehicle is successfully dissociated from a fleet, Amazon Web Services IoT FleetWise sends back an HTTP 200
     * response with an empty body.
     * </p>
     * </note>
     * 
     * @param disassociateVehicleFleetRequest
     * @return A Java Future containing the result of the DisassociateVehicleFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.DisassociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DisassociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateVehicleFleetResult> disassociateVehicleFleetAsync(DisassociateVehicleFleetRequest disassociateVehicleFleetRequest);

    /**
     * <p>
     * Removes, or disassociates, a vehicle from a fleet. Disassociating a vehicle from a fleet doesn't delete the
     * vehicle.
     * </p>
     * <note>
     * <p>
     * If the vehicle is successfully dissociated from a fleet, Amazon Web Services IoT FleetWise sends back an HTTP 200
     * response with an empty body.
     * </p>
     * </note>
     * 
     * @param disassociateVehicleFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateVehicleFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.DisassociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DisassociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateVehicleFleetResult> disassociateVehicleFleetAsync(DisassociateVehicleFleetRequest disassociateVehicleFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateVehicleFleetRequest, DisassociateVehicleFleetResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @return A Java Future containing the result of the GetCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest getCampaignRequest);

    /**
     * <p>
     * Retrieves information about a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest getCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignRequest, GetCampaignResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a created decoder manifest.
     * </p>
     * 
     * @param getDecoderManifestRequest
     * @return A Java Future containing the result of the GetDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDecoderManifestResult> getDecoderManifestAsync(GetDecoderManifestRequest getDecoderManifestRequest);

    /**
     * <p>
     * Retrieves information about a created decoder manifest.
     * </p>
     * 
     * @param getDecoderManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDecoderManifestResult> getDecoderManifestAsync(GetDecoderManifestRequest getDecoderManifestRequest,
            com.amazonaws.handlers.AsyncHandler<GetDecoderManifestRequest, GetDecoderManifestResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @return A Java Future containing the result of the GetFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFleetResult> getFleetAsync(GetFleetRequest getFleetRequest);

    /**
     * <p>
     * Retrieves information about a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFleetResult> getFleetAsync(GetFleetRequest getFleetRequest,
            com.amazonaws.handlers.AsyncHandler<GetFleetRequest, GetFleetResult> asyncHandler);

    /**
     * <p>
     * Retrieves the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     * @return A Java Future containing the result of the GetLoggingOptions operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(GetLoggingOptionsRequest getLoggingOptionsRequest);

    /**
     * <p>
     * Retrieves the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggingOptions operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingOptionsResult> getLoggingOptionsAsync(GetLoggingOptionsRequest getLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggingOptionsRequest, GetLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a vehicle model (model manifest).
     * </p>
     * 
     * @param getModelManifestRequest
     * @return A Java Future containing the result of the GetModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetModelManifest" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetModelManifestResult> getModelManifestAsync(GetModelManifestRequest getModelManifestRequest);

    /**
     * <p>
     * Retrieves information about a vehicle model (model manifest).
     * </p>
     * 
     * @param getModelManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetModelManifest" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetModelManifestResult> getModelManifestAsync(GetModelManifestRequest getModelManifestRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelManifestRequest, GetModelManifestResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status of registering your Amazon Web Services account, IAM, and Amazon
     * Timestream resources so that Amazon Web Services IoT FleetWise can transfer your vehicle data to the Amazon Web
     * Services Cloud.
     * </p>
     * <p>
     * For more information, including step-by-step procedures, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/setting-up.html">Setting up Amazon Web
     * Services IoT FleetWise</a>.
     * </p>
     * <note>
     * <p>
     * This API operation doesn't require input parameters.
     * </p>
     * </note>
     * 
     * @param getRegisterAccountStatusRequest
     * @return A Java Future containing the result of the GetRegisterAccountStatus operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetRegisterAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetRegisterAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRegisterAccountStatusResult> getRegisterAccountStatusAsync(GetRegisterAccountStatusRequest getRegisterAccountStatusRequest);

    /**
     * <p>
     * Retrieves information about the status of registering your Amazon Web Services account, IAM, and Amazon
     * Timestream resources so that Amazon Web Services IoT FleetWise can transfer your vehicle data to the Amazon Web
     * Services Cloud.
     * </p>
     * <p>
     * For more information, including step-by-step procedures, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/setting-up.html">Setting up Amazon Web
     * Services IoT FleetWise</a>.
     * </p>
     * <note>
     * <p>
     * This API operation doesn't require input parameters.
     * </p>
     * </note>
     * 
     * @param getRegisterAccountStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegisterAccountStatus operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetRegisterAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetRegisterAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRegisterAccountStatusResult> getRegisterAccountStatusAsync(GetRegisterAccountStatusRequest getRegisterAccountStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegisterAccountStatusRequest, GetRegisterAccountStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a signal catalog.
     * </p>
     * 
     * @param getSignalCatalogRequest
     * @return A Java Future containing the result of the GetSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetSignalCatalog" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSignalCatalogResult> getSignalCatalogAsync(GetSignalCatalogRequest getSignalCatalogRequest);

    /**
     * <p>
     * Retrieves information about a signal catalog.
     * </p>
     * 
     * @param getSignalCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetSignalCatalog" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSignalCatalogResult> getSignalCatalogAsync(GetSignalCatalogRequest getSignalCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<GetSignalCatalogRequest, GetSignalCatalogResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a vehicle.
     * </p>
     * 
     * @param getVehicleRequest
     * @return A Java Future containing the result of the GetVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVehicleResult> getVehicleAsync(GetVehicleRequest getVehicleRequest);

    /**
     * <p>
     * Retrieves information about a vehicle.
     * </p>
     * 
     * @param getVehicleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVehicleResult> getVehicleAsync(GetVehicleRequest getVehicleRequest,
            com.amazonaws.handlers.AsyncHandler<GetVehicleRequest, GetVehicleResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status of a vehicle with any associated campaigns.
     * </p>
     * 
     * @param getVehicleStatusRequest
     * @return A Java Future containing the result of the GetVehicleStatus operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.GetVehicleStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicleStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVehicleStatusResult> getVehicleStatusAsync(GetVehicleStatusRequest getVehicleStatusRequest);

    /**
     * <p>
     * Retrieves information about the status of a vehicle with any associated campaigns.
     * </p>
     * 
     * @param getVehicleStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVehicleStatus operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.GetVehicleStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicleStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVehicleStatusResult> getVehicleStatusAsync(GetVehicleStatusRequest getVehicleStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetVehicleStatusRequest, GetVehicleStatusResult> asyncHandler);

    /**
     * <p>
     * Creates a decoder manifest using your existing CAN DBC file from your local device.
     * </p>
     * 
     * @param importDecoderManifestRequest
     * @return A Java Future containing the result of the ImportDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ImportDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportDecoderManifestResult> importDecoderManifestAsync(ImportDecoderManifestRequest importDecoderManifestRequest);

    /**
     * <p>
     * Creates a decoder manifest using your existing CAN DBC file from your local device.
     * </p>
     * 
     * @param importDecoderManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ImportDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportDecoderManifestResult> importDecoderManifestAsync(ImportDecoderManifestRequest importDecoderManifestRequest,
            com.amazonaws.handlers.AsyncHandler<ImportDecoderManifestRequest, ImportDecoderManifestResult> asyncHandler);

    /**
     * <p>
     * Creates a signal catalog using your existing VSS formatted content from your local device.
     * </p>
     * 
     * @param importSignalCatalogRequest
     * @return A Java Future containing the result of the ImportSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ImportSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportSignalCatalogResult> importSignalCatalogAsync(ImportSignalCatalogRequest importSignalCatalogRequest);

    /**
     * <p>
     * Creates a signal catalog using your existing VSS formatted content from your local device.
     * </p>
     * 
     * @param importSignalCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ImportSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportSignalCatalogResult> importSignalCatalogAsync(ImportSignalCatalogRequest importSignalCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<ImportSignalCatalogRequest, ImportSignalCatalogResult> asyncHandler);

    /**
     * <p>
     * Lists information about created campaigns.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listCampaignsRequest
     * @return A Java Future containing the result of the ListCampaigns operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest listCampaignsRequest);

    /**
     * <p>
     * Lists information about created campaigns.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listCampaignsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCampaigns operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest listCampaignsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler);

    /**
     * <p>
     * Lists the network interfaces specified in a decoder manifest.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestNetworkInterfacesRequest
     * @return A Java Future containing the result of the ListDecoderManifestNetworkInterfaces operation returned by the
     *         service.
     * @sample AWSIoTFleetWiseAsync.ListDecoderManifestNetworkInterfaces
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestNetworkInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDecoderManifestNetworkInterfacesResult> listDecoderManifestNetworkInterfacesAsync(
            ListDecoderManifestNetworkInterfacesRequest listDecoderManifestNetworkInterfacesRequest);

    /**
     * <p>
     * Lists the network interfaces specified in a decoder manifest.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestNetworkInterfacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDecoderManifestNetworkInterfaces operation returned by the
     *         service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListDecoderManifestNetworkInterfaces
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestNetworkInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDecoderManifestNetworkInterfacesResult> listDecoderManifestNetworkInterfacesAsync(
            ListDecoderManifestNetworkInterfacesRequest listDecoderManifestNetworkInterfacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDecoderManifestNetworkInterfacesRequest, ListDecoderManifestNetworkInterfacesResult> asyncHandler);

    /**
     * <p>
     * A list of information about signal decoders specified in a decoder manifest.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestSignalsRequest
     * @return A Java Future containing the result of the ListDecoderManifestSignals operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListDecoderManifestSignals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestSignals"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDecoderManifestSignalsResult> listDecoderManifestSignalsAsync(
            ListDecoderManifestSignalsRequest listDecoderManifestSignalsRequest);

    /**
     * <p>
     * A list of information about signal decoders specified in a decoder manifest.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestSignalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDecoderManifestSignals operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListDecoderManifestSignals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestSignals"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDecoderManifestSignalsResult> listDecoderManifestSignalsAsync(
            ListDecoderManifestSignalsRequest listDecoderManifestSignalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDecoderManifestSignalsRequest, ListDecoderManifestSignalsResult> asyncHandler);

    /**
     * <p>
     * Lists decoder manifests.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestsRequest
     * @return A Java Future containing the result of the ListDecoderManifests operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListDecoderManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDecoderManifestsResult> listDecoderManifestsAsync(ListDecoderManifestsRequest listDecoderManifestsRequest);

    /**
     * <p>
     * Lists decoder manifests.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listDecoderManifestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDecoderManifests operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListDecoderManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDecoderManifestsResult> listDecoderManifestsAsync(ListDecoderManifestsRequest listDecoderManifestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDecoderManifestsRequest, ListDecoderManifestsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information for each created fleet in an Amazon Web Services account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Retrieves information for each created fleet in an Amazon Web Services account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of IDs for all fleets that the vehicle is associated with.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listFleetsForVehicleRequest
     * @return A Java Future containing the result of the ListFleetsForVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListFleetsForVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleetsForVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsForVehicleResult> listFleetsForVehicleAsync(ListFleetsForVehicleRequest listFleetsForVehicleRequest);

    /**
     * <p>
     * Retrieves a list of IDs for all fleets that the vehicle is associated with.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listFleetsForVehicleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleetsForVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListFleetsForVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleetsForVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsForVehicleResult> listFleetsForVehicleAsync(ListFleetsForVehicleRequest listFleetsForVehicleRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsForVehicleRequest, ListFleetsForVehicleResult> asyncHandler);

    /**
     * <p>
     * Lists information about nodes specified in a vehicle model (model manifest).
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listModelManifestNodesRequest
     * @return A Java Future containing the result of the ListModelManifestNodes operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListModelManifestNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifestNodes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelManifestNodesResult> listModelManifestNodesAsync(ListModelManifestNodesRequest listModelManifestNodesRequest);

    /**
     * <p>
     * Lists information about nodes specified in a vehicle model (model manifest).
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listModelManifestNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelManifestNodes operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListModelManifestNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifestNodes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelManifestNodesResult> listModelManifestNodesAsync(ListModelManifestNodesRequest listModelManifestNodesRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelManifestNodesRequest, ListModelManifestNodesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of vehicle models (model manifests).
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listModelManifestsRequest
     * @return A Java Future containing the result of the ListModelManifests operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListModelManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelManifestsResult> listModelManifestsAsync(ListModelManifestsRequest listModelManifestsRequest);

    /**
     * <p>
     * Retrieves a list of vehicle models (model manifests).
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listModelManifestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelManifests operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListModelManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListModelManifestsResult> listModelManifestsAsync(ListModelManifestsRequest listModelManifestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelManifestsRequest, ListModelManifestsResult> asyncHandler);

    /**
     * <p>
     * Lists of information about the signals (nodes) specified in a signal catalog.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listSignalCatalogNodesRequest
     * @return A Java Future containing the result of the ListSignalCatalogNodes operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListSignalCatalogNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogNodes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSignalCatalogNodesResult> listSignalCatalogNodesAsync(ListSignalCatalogNodesRequest listSignalCatalogNodesRequest);

    /**
     * <p>
     * Lists of information about the signals (nodes) specified in a signal catalog.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listSignalCatalogNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSignalCatalogNodes operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListSignalCatalogNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogNodes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSignalCatalogNodesResult> listSignalCatalogNodesAsync(ListSignalCatalogNodesRequest listSignalCatalogNodesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSignalCatalogNodesRequest, ListSignalCatalogNodesResult> asyncHandler);

    /**
     * <p>
     * Lists all the created signal catalogs in an Amazon Web Services account.
     * </p>
     * <p>
     * You can use to list information about each signal (node) specified in a signal catalog.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listSignalCatalogsRequest
     * @return A Java Future containing the result of the ListSignalCatalogs operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListSignalCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSignalCatalogsResult> listSignalCatalogsAsync(ListSignalCatalogsRequest listSignalCatalogsRequest);

    /**
     * <p>
     * Lists all the created signal catalogs in an Amazon Web Services account.
     * </p>
     * <p>
     * You can use to list information about each signal (node) specified in a signal catalog.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listSignalCatalogsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSignalCatalogs operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListSignalCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSignalCatalogsResult> listSignalCatalogsAsync(ListSignalCatalogsRequest listSignalCatalogsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSignalCatalogsRequest, ListSignalCatalogsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListTagsForResource"
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
     * @sample AWSIoTFleetWiseAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of summaries of created vehicles.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listVehiclesRequest
     * @return A Java Future containing the result of the ListVehicles operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListVehicles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehicles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVehiclesResult> listVehiclesAsync(ListVehiclesRequest listVehiclesRequest);

    /**
     * <p>
     * Retrieves a list of summaries of created vehicles.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listVehiclesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVehicles operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListVehicles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehicles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVehiclesResult> listVehiclesAsync(ListVehiclesRequest listVehiclesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVehiclesRequest, ListVehiclesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of summaries of all vehicles associated with a fleet.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listVehiclesInFleetRequest
     * @return A Java Future containing the result of the ListVehiclesInFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.ListVehiclesInFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehiclesInFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVehiclesInFleetResult> listVehiclesInFleetAsync(ListVehiclesInFleetRequest listVehiclesInFleetRequest);

    /**
     * <p>
     * Retrieves a list of summaries of all vehicles associated with a fleet.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the request to return more
     * results.
     * </p>
     * </note>
     * 
     * @param listVehiclesInFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVehiclesInFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.ListVehiclesInFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehiclesInFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVehiclesInFleetResult> listVehiclesInFleetAsync(ListVehiclesInFleetRequest listVehiclesInFleetRequest,
            com.amazonaws.handlers.AsyncHandler<ListVehiclesInFleetRequest, ListVehiclesInFleetResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the logging option.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest);

    /**
     * <p>
     * Creates or updates the logging option.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Registers your Amazon Web Services account, IAM, and Amazon Timestream resources so Amazon Web Services IoT
     * FleetWise can transfer your vehicle data to the Amazon Web Services Cloud. For more information, including
     * step-by-step procedures, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/setting-up.html">Setting up Amazon Web
     * Services IoT FleetWise</a>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services account is <b>not</b> the same thing as a "user account". An <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/introduction_identity-management.html#intro-identity-users"
     * >Amazon Web Services user</a> is an identity that you create using Identity and Access Management (IAM) and takes
     * the form of either an <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users.html">IAM user</a> or an
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM role, both with credentials</a>. A
     * single Amazon Web Services account can, and typically does, contain many users and roles.
     * </p>
     * </note>
     * 
     * @param registerAccountRequest
     * @return A Java Future containing the result of the RegisterAccount operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest registerAccountRequest);

    /**
     * <p>
     * Registers your Amazon Web Services account, IAM, and Amazon Timestream resources so Amazon Web Services IoT
     * FleetWise can transfer your vehicle data to the Amazon Web Services Cloud. For more information, including
     * step-by-step procedures, see <a
     * href="https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/setting-up.html">Setting up Amazon Web
     * Services IoT FleetWise</a>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services account is <b>not</b> the same thing as a "user account". An <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/introduction_identity-management.html#intro-identity-users"
     * >Amazon Web Services user</a> is an identity that you create using Identity and Access Management (IAM) and takes
     * the form of either an <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users.html">IAM user</a> or an
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM role, both with credentials</a>. A
     * single Amazon Web Services account can, and typically does, contain many users and roles.
     * </p>
     * </note>
     * 
     * @param registerAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterAccount operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest registerAccountRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterAccountRequest, RegisterAccountResult> asyncHandler);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest);

    /**
     * <p>
     * Updates a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler);

    /**
     * <p>
     * Updates a decoder manifest.
     * </p>
     * <p>
     * A decoder manifest can only be updated when the status is <code>DRAFT</code>. Only <code>ACTIVE</code> decoder
     * manifests can be associated with vehicles.
     * </p>
     * 
     * @param updateDecoderManifestRequest
     * @return A Java Future containing the result of the UpdateDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.UpdateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDecoderManifestResult> updateDecoderManifestAsync(UpdateDecoderManifestRequest updateDecoderManifestRequest);

    /**
     * <p>
     * Updates a decoder manifest.
     * </p>
     * <p>
     * A decoder manifest can only be updated when the status is <code>DRAFT</code>. Only <code>ACTIVE</code> decoder
     * manifests can be associated with vehicles.
     * </p>
     * 
     * @param updateDecoderManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDecoderManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.UpdateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDecoderManifestResult> updateDecoderManifestAsync(UpdateDecoderManifestRequest updateDecoderManifestRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDecoderManifestRequest, UpdateDecoderManifestResult> asyncHandler);

    /**
     * <p>
     * Updates the description of an existing fleet.
     * </p>
     * <note>
     * <p>
     * If the fleet is successfully updated, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty HTTP body.
     * </p>
     * </note>
     * 
     * @param updateFleetRequest
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates the description of an existing fleet.
     * </p>
     * <note>
     * <p>
     * If the fleet is successfully updated, Amazon Web Services IoT FleetWise sends back an HTTP 200 response with an
     * empty HTTP body.
     * </p>
     * </note>
     * 
     * @param updateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler);

    /**
     * <p>
     * Updates a vehicle model (model manifest). If created vehicles are associated with a vehicle model, it can't be
     * updated.
     * </p>
     * 
     * @param updateModelManifestRequest
     * @return A Java Future containing the result of the UpdateModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.UpdateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelManifestResult> updateModelManifestAsync(UpdateModelManifestRequest updateModelManifestRequest);

    /**
     * <p>
     * Updates a vehicle model (model manifest). If created vehicles are associated with a vehicle model, it can't be
     * updated.
     * </p>
     * 
     * @param updateModelManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModelManifest operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.UpdateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateModelManifestResult> updateModelManifestAsync(UpdateModelManifestRequest updateModelManifestRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelManifestRequest, UpdateModelManifestResult> asyncHandler);

    /**
     * <p>
     * Updates a signal catalog.
     * </p>
     * 
     * @param updateSignalCatalogRequest
     * @return A Java Future containing the result of the UpdateSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.UpdateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSignalCatalogResult> updateSignalCatalogAsync(UpdateSignalCatalogRequest updateSignalCatalogRequest);

    /**
     * <p>
     * Updates a signal catalog.
     * </p>
     * 
     * @param updateSignalCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSignalCatalog operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.UpdateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSignalCatalogResult> updateSignalCatalogAsync(UpdateSignalCatalogRequest updateSignalCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSignalCatalogRequest, UpdateSignalCatalogResult> asyncHandler);

    /**
     * <p>
     * Updates a vehicle.
     * </p>
     * 
     * @param updateVehicleRequest
     * @return A Java Future containing the result of the UpdateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsync.UpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVehicleResult> updateVehicleAsync(UpdateVehicleRequest updateVehicleRequest);

    /**
     * <p>
     * Updates a vehicle.
     * </p>
     * 
     * @param updateVehicleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVehicle operation returned by the service.
     * @sample AWSIoTFleetWiseAsyncHandler.UpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVehicleResult> updateVehicleAsync(UpdateVehicleRequest updateVehicleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVehicleRequest, UpdateVehicleResult> asyncHandler);

}
