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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotfleetwise.model.*;

/**
 * Interface for accessing AWS IoT FleetWise.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotfleetwise.AbstractAWSIoTFleetWise} instead.
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
public interface AWSIoTFleetWise {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iotfleetwise";

    /**
     * <p>
     * Adds, or associates, a vehicle with a fleet.
     * </p>
     * 
     * @param associateVehicleFleetRequest
     * @return Result of the AssociateVehicleFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.AssociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/AssociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateVehicleFleetResult associateVehicleFleet(AssociateVehicleFleetRequest associateVehicleFleetRequest);

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
     * @return Result of the BatchCreateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.BatchCreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchCreateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCreateVehicleResult batchCreateVehicle(BatchCreateVehicleRequest batchCreateVehicleRequest);

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
     * @return Result of the BatchUpdateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.BatchUpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/BatchUpdateVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateVehicleResult batchUpdateVehicle(BatchUpdateVehicleRequest batchUpdateVehicleRequest);

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
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest);

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
     * @return Result of the CreateDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws DecoderManifestValidationException
     *         The request couldn't be completed because it contains signal decoders with one or more validation errors.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDecoderManifestResult createDecoderManifest(CreateDecoderManifestRequest createDecoderManifestRequest);

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
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

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
     * @return Result of the CreateModelManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    CreateModelManifestResult createModelManifest(CreateModelManifestRequest createModelManifestRequest);

    /**
     * <p>
     * Creates a collection of standardized signals that can be reused to create vehicle models.
     * </p>
     * 
     * @param createSignalCatalogRequest
     * @return Result of the CreateSignalCatalog operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws InvalidNodeException
     *         The specified node type doesn't match the expected node type for a node. You can specify the node type as
     *         branch, sensor, actuator, or attribute.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSignalCatalogResult createSignalCatalog(CreateSignalCatalogRequest createSignalCatalogRequest);

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
     * @return Result of the CreateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.CreateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVehicleResult createVehicle(CreateVehicleRequest createVehicleRequest);

    /**
     * <p>
     * Deletes a data collection campaign. Deleting a campaign suspends all data collection and removes it from any
     * vehicles.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest);

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
     * @return Result of the DeleteDecoderManifest operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDecoderManifestResult deleteDecoderManifest(DeleteDecoderManifestRequest deleteDecoderManifestRequest);

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
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

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
     * @return Result of the DeleteModelManifest operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteModelManifestResult deleteModelManifest(DeleteModelManifestRequest deleteModelManifestRequest);

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
     * @return Result of the DeleteSignalCatalog operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSignalCatalogResult deleteSignalCatalog(DeleteSignalCatalogRequest deleteSignalCatalogRequest);

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
     * @return Result of the DeleteVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DeleteVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DeleteVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVehicleResult deleteVehicle(DeleteVehicleRequest deleteVehicleRequest);

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
     * @return Result of the DisassociateVehicleFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.DisassociateVehicleFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/DisassociateVehicleFleet"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateVehicleFleetResult disassociateVehicleFleet(DisassociateVehicleFleetRequest disassociateVehicleFleetRequest);

    /**
     * <p>
     * Retrieves information about a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @return Result of the GetCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    GetCampaignResult getCampaign(GetCampaignRequest getCampaignRequest);

    /**
     * <p>
     * Retrieves information about a created decoder manifest.
     * </p>
     * 
     * @param getDecoderManifestRequest
     * @return Result of the GetDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    GetDecoderManifestResult getDecoderManifest(GetDecoderManifestRequest getDecoderManifestRequest);

    /**
     * <p>
     * Retrieves information about a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @return Result of the GetFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    GetFleetResult getFleet(GetFleetRequest getFleetRequest);

    /**
     * <p>
     * Retrieves the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     * @return Result of the GetLoggingOptions operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    GetLoggingOptionsResult getLoggingOptions(GetLoggingOptionsRequest getLoggingOptionsRequest);

    /**
     * <p>
     * Retrieves information about a vehicle model (model manifest).
     * </p>
     * 
     * @param getModelManifestRequest
     * @return Result of the GetModelManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetModelManifest" target="_top">AWS
     *      API Documentation</a>
     */
    GetModelManifestResult getModelManifest(GetModelManifestRequest getModelManifestRequest);

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
     * @return Result of the GetRegisterAccountStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetRegisterAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetRegisterAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetRegisterAccountStatusResult getRegisterAccountStatus(GetRegisterAccountStatusRequest getRegisterAccountStatusRequest);

    /**
     * <p>
     * Retrieves information about a signal catalog.
     * </p>
     * 
     * @param getSignalCatalogRequest
     * @return Result of the GetSignalCatalog operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetSignalCatalog" target="_top">AWS
     *      API Documentation</a>
     */
    GetSignalCatalogResult getSignalCatalog(GetSignalCatalogRequest getSignalCatalogRequest);

    /**
     * <p>
     * Retrieves information about a vehicle.
     * </p>
     * 
     * @param getVehicleRequest
     * @return Result of the GetVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    GetVehicleResult getVehicle(GetVehicleRequest getVehicleRequest);

    /**
     * <p>
     * Retrieves information about the status of a vehicle with any associated campaigns.
     * </p>
     * 
     * @param getVehicleStatusRequest
     * @return Result of the GetVehicleStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.GetVehicleStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicleStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetVehicleStatusResult getVehicleStatus(GetVehicleStatusRequest getVehicleStatusRequest);

    /**
     * <p>
     * Creates a decoder manifest using your existing CAN DBC file from your local device.
     * </p>
     * 
     * @param importDecoderManifestRequest
     * @return Result of the ImportDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws DecoderManifestValidationException
     *         The request couldn't be completed because it contains signal decoders with one or more validation errors.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ImportDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    ImportDecoderManifestResult importDecoderManifest(ImportDecoderManifestRequest importDecoderManifestRequest);

    /**
     * <p>
     * Creates a signal catalog using your existing VSS formatted content from your local device.
     * </p>
     * 
     * @param importSignalCatalogRequest
     * @return Result of the ImportSignalCatalog operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ImportSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ImportSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    ImportSignalCatalogResult importSignalCatalog(ImportSignalCatalogRequest importSignalCatalogRequest);

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
     * @return Result of the ListCampaigns operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    ListCampaignsResult listCampaigns(ListCampaignsRequest listCampaignsRequest);

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
     * @return Result of the ListDecoderManifestNetworkInterfaces operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListDecoderManifestNetworkInterfaces
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestNetworkInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    ListDecoderManifestNetworkInterfacesResult listDecoderManifestNetworkInterfaces(
            ListDecoderManifestNetworkInterfacesRequest listDecoderManifestNetworkInterfacesRequest);

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
     * @return Result of the ListDecoderManifestSignals operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListDecoderManifestSignals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestSignals"
     *      target="_top">AWS API Documentation</a>
     */
    ListDecoderManifestSignalsResult listDecoderManifestSignals(ListDecoderManifestSignalsRequest listDecoderManifestSignalsRequest);

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
     * @return Result of the ListDecoderManifests operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListDecoderManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifests"
     *      target="_top">AWS API Documentation</a>
     */
    ListDecoderManifestsResult listDecoderManifests(ListDecoderManifestsRequest listDecoderManifestsRequest);

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
     * @return Result of the ListFleets operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest);

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
     * @return Result of the ListFleetsForVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListFleetsForVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListFleetsForVehicle"
     *      target="_top">AWS API Documentation</a>
     */
    ListFleetsForVehicleResult listFleetsForVehicle(ListFleetsForVehicleRequest listFleetsForVehicleRequest);

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
     * @return Result of the ListModelManifestNodes operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListModelManifestNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifestNodes"
     *      target="_top">AWS API Documentation</a>
     */
    ListModelManifestNodesResult listModelManifestNodes(ListModelManifestNodesRequest listModelManifestNodesRequest);

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
     * @return Result of the ListModelManifests operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListModelManifests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListModelManifests"
     *      target="_top">AWS API Documentation</a>
     */
    ListModelManifestsResult listModelManifests(ListModelManifestsRequest listModelManifestsRequest);

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
     * @return Result of the ListSignalCatalogNodes operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListSignalCatalogNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogNodes"
     *      target="_top">AWS API Documentation</a>
     */
    ListSignalCatalogNodesResult listSignalCatalogNodes(ListSignalCatalogNodesRequest listSignalCatalogNodesRequest);

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
     * @return Result of the ListSignalCatalogs operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListSignalCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListSignalCatalogs"
     *      target="_top">AWS API Documentation</a>
     */
    ListSignalCatalogsResult listSignalCatalogs(ListSignalCatalogsRequest listSignalCatalogsRequest);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the ListVehicles operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListVehicles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehicles" target="_top">AWS API
     *      Documentation</a>
     */
    ListVehiclesResult listVehicles(ListVehiclesRequest listVehiclesRequest);

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
     * @return Result of the ListVehiclesInFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.ListVehiclesInFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListVehiclesInFleet"
     *      target="_top">AWS API Documentation</a>
     */
    ListVehiclesInFleetResult listVehiclesInFleet(ListVehiclesInFleetRequest listVehiclesInFleetRequest);

    /**
     * <p>
     * Creates or updates the logging option.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest);

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
     * @return Result of the RegisterAccount operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterAccountResult registerAccount(RegisterAccountRequest registerAccountRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest);

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
     * @return Result of the UpdateDecoderManifest operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws DecoderManifestValidationException
     *         The request couldn't be completed because it contains signal decoders with one or more validation errors.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateDecoderManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateDecoderManifest"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDecoderManifestResult updateDecoderManifest(UpdateDecoderManifestRequest updateDecoderManifestRequest);

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
     * @return Result of the UpdateFleet operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFleetResult updateFleet(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates a vehicle model (model manifest). If created vehicles are associated with a vehicle model, it can't be
     * updated.
     * </p>
     * 
     * @param updateModelManifestRequest
     * @return Result of the UpdateModelManifest operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateModelManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateModelManifest"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateModelManifestResult updateModelManifest(UpdateModelManifestRequest updateModelManifestRequest);

    /**
     * <p>
     * Updates a signal catalog.
     * </p>
     * 
     * @param updateSignalCatalogRequest
     * @return Result of the UpdateSignalCatalog operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws LimitExceededException
     *         A service quota was exceeded.
     * @throws InvalidNodeException
     *         The specified node type doesn't match the expected node type for a node. You can specify the node type as
     *         branch, sensor, actuator, or attribute.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InvalidSignalsException
     *         The request couldn't be completed because it contains signals that aren't valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateSignalCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateSignalCatalog"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSignalCatalogResult updateSignalCatalog(UpdateSignalCatalogRequest updateSignalCatalogRequest);

    /**
     * <p>
     * Updates a vehicle.
     * </p>
     * 
     * @param updateVehicleRequest
     * @return Result of the UpdateVehicle operation returned by the service.
     * @throws InternalServerException
     *         The request couldn't be completed because the server temporarily failed.
     * @throws ResourceNotFoundException
     *         The resource wasn't found.
     * @throws ConflictException
     *         The request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         The request couldn't be completed due to throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @sample AWSIoTFleetWise.UpdateVehicle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateVehicle" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateVehicleResult updateVehicle(UpdateVehicleRequest updateVehicleRequest);

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
