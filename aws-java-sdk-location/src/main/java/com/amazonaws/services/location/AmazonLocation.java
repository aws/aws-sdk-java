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
package com.amazonaws.services.location;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.location.model.*;

/**
 * Interface for accessing Amazon Location Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.location.AbstractAmazonLocation} instead.
 * </p>
 * <p>
 * <p>
 * "Suite of geospatial services including Maps, Places, Routes, Tracking, and Geofencing"
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLocation {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "geo";

    /**
     * <p>
     * Creates an association between a geofence collection and a tracker resource. This allows the tracker resource to
     * communicate location data to the linked geofence collection.
     * </p>
     * <p>
     * You can associate up to five geofence collections to each tracker resource.
     * </p>
     * <note>
     * <p>
     * Currently not supported — Cross-account configurations, such as creating associations between a tracker resource
     * in one account and a geofence collection in another account.
     * </p>
     * </note>
     * 
     * @param associateTrackerConsumerRequest
     * @return Result of the AssociateTrackerConsumer operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ServiceQuotaExceededException
     *         The operation was denied because the request would exceed the maximum <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/location-quotas.html">quota</a> set for
     *         Amazon Location Service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.AssociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/AssociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTrackerConsumerResult associateTrackerConsumer(AssociateTrackerConsumerRequest associateTrackerConsumerRequest);

    /**
     * <p>
     * Deletes the position history of one or more devices from a tracker resource.
     * </p>
     * 
     * @param batchDeleteDevicePositionHistoryRequest
     * @return Result of the BatchDeleteDevicePositionHistory operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.BatchDeleteDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeleteDevicePositionHistoryResult batchDeleteDevicePositionHistory(BatchDeleteDevicePositionHistoryRequest batchDeleteDevicePositionHistoryRequest);

    /**
     * <p>
     * Deletes a batch of geofences from a geofence collection.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
     * </p>
     * </note>
     * 
     * @param batchDeleteGeofenceRequest
     * @return Result of the BatchDeleteGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.BatchDeleteGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteGeofence" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDeleteGeofenceResult batchDeleteGeofence(BatchDeleteGeofenceRequest batchDeleteGeofenceRequest);

    /**
     * <p>
     * Evaluates device positions against the geofence geometries from a given geofence collection.
     * </p>
     * <p>
     * This operation always returns an empty response because geofences are asynchronously evaluated. The evaluation
     * determines if the device has entered or exited a geofenced area, and then publishes one of the following events
     * to Amazon EventBridge:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTER</code> if Amazon Location determines that the tracked device has entered a geofenced area.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXIT</code> if Amazon Location determines that the tracked device has exited a geofenced area.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The last geofence that a device was observed within is tracked for 30 days after the most recent device position
     * update.
     * </p>
     * </note> <note>
     * <p>
     * Geofence evaluation uses the given device position. It does not account for the optional <code>Accuracy</code> of
     * a <code>DevicePositionUpdate</code>.
     * </p>
     * </note> <note>
     * <p>
     * The <code>DeviceID</code> is used as a string to represent the device. You do not need to have a
     * <code>Tracker</code> associated with the <code>DeviceID</code>.
     * </p>
     * </note>
     * 
     * @param batchEvaluateGeofencesRequest
     * @return Result of the BatchEvaluateGeofences operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.BatchEvaluateGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchEvaluateGeofences"
     *      target="_top">AWS API Documentation</a>
     */
    BatchEvaluateGeofencesResult batchEvaluateGeofences(BatchEvaluateGeofencesRequest batchEvaluateGeofencesRequest);

    /**
     * <p>
     * Lists the latest device positions for requested devices.
     * </p>
     * 
     * @param batchGetDevicePositionRequest
     * @return Result of the BatchGetDevicePosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.BatchGetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchGetDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetDevicePositionResult batchGetDevicePosition(BatchGetDevicePositionRequest batchGetDevicePositionRequest);

    /**
     * <p>
     * A batch request for storing geofence geometries into a given geofence collection, or updates the geometry of an
     * existing geofence if a geofence ID is included in the request.
     * </p>
     * 
     * @param batchPutGeofenceRequest
     * @return Result of the BatchPutGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.BatchPutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchPutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    BatchPutGeofenceResult batchPutGeofence(BatchPutGeofenceRequest batchPutGeofenceRequest);

    /**
     * <p>
     * Uploads position update data for one or more devices to a tracker resource. Amazon Location uses the data when it
     * reports the last known device position and position history. Amazon Location retains location data for 30 days.
     * </p>
     * <note>
     * <p>
     * Position updates are handled based on the <code>PositionFiltering</code> property of the tracker. When
     * <code>PositionFiltering</code> is set to <code>TimeBased</code>, updates are evaluated against linked geofence
     * collections, and location data is stored at a maximum of one position per 30 second interval. If your update
     * frequency is more often than every 30 seconds, only one update per 30 seconds is stored for each unique device
     * ID.
     * </p>
     * <p>
     * When <code>PositionFiltering</code> is set to <code>DistanceBased</code> filtering, location data is stored and
     * evaluated against linked geofence collections only if the device has moved more than 30 m (98.4 ft).
     * </p>
     * <p>
     * When <code>PositionFiltering</code> is set to <code>AccuracyBased</code> filtering, location data is stored and
     * evaluated against linked geofence collections only if the device has moved more than the measured accuracy. For
     * example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the second update
     * is neither stored or evaluated if the device has moved less than 15 m. If <code>PositionFiltering</code> is set
     * to <code>AccuracyBased</code> filtering, Amazon Location uses the default value <code>{ "Horizontal": 0}</code>
     * when accuracy is not provided on a <code>DevicePositionUpdate</code>.
     * </p>
     * </note>
     * 
     * @param batchUpdateDevicePositionRequest
     * @return Result of the BatchUpdateDevicePosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.BatchUpdateDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchUpdateDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateDevicePositionResult batchUpdateDevicePosition(BatchUpdateDevicePositionRequest batchUpdateDevicePositionRequest);

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html">Calculates a route</a>
     * given the following required parameters: <code>DeparturePosition</code> and <code>DestinationPosition</code>.
     * Requires that you first <a
     * href="https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html">create a
     * route calculator resource</a>.
     * </p>
     * <p>
     * By default, a request that doesn't specify a departure time uses the best time of day to travel with the best
     * traffic conditions when calculating the route.
     * </p>
     * <p>
     * Additional options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/departure-time.html">Specifying a departure
     * time</a> using either <code>DepartureTime</code> or <code>DepartNow</code>. This calculates a route based on
     * predictive traffic data at the given time.
     * </p>
     * <note>
     * <p>
     * You can't specify both <code>DepartureTime</code> and <code>DepartNow</code> in a single request. Specifying both
     * parameters returns a validation error.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/travel-mode.html">Specifying a travel
     * mode</a> using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify
     * additional route preferences in <code>CarModeOptions</code> if traveling by <code>Car</code>, or
     * <code>TruckModeOptions</code> if traveling by <code>Truck</code>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>walking</code> for the travel mode and your data provider is Esri, the start and destination
     * must be within 40km.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param calculateRouteRequest
     * @return Result of the CalculateRoute operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CalculateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    CalculateRouteResult calculateRoute(CalculateRouteRequest calculateRouteRequest);

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html"> Calculates a
     * route matrix</a> given the following required parameters: <code>DeparturePositions</code> and
     * <code>DestinationPositions</code>. <code>CalculateRouteMatrix</code> calculates routes and returns the travel
     * time and travel distance from each departure position to each destination position in the request. For example,
     * given departure positions A and B, and destination positions X and Y, <code>CalculateRouteMatrix</code> will
     * return time and distance for routes from A to X, A to Y, B to X, and B to Y (in that order). The number of
     * results returned (and routes calculated) will be the number of <code>DeparturePositions</code> times the number
     * of <code>DestinationPositions</code>.
     * </p>
     * <note>
     * <p>
     * Your account is charged for each route calculated, not the number of requests.
     * </p>
     * </note>
     * <p>
     * Requires that you first <a
     * href="https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html">create a
     * route calculator resource</a>.
     * </p>
     * <p>
     * By default, a request that doesn't specify a departure time uses the best time of day to travel with the best
     * traffic conditions when calculating routes.
     * </p>
     * <p>
     * Additional options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/departure-time.html"> Specifying a departure
     * time</a> using either <code>DepartureTime</code> or <code>DepartNow</code>. This calculates routes based on
     * predictive traffic data at the given time.
     * </p>
     * <note>
     * <p>
     * You can't specify both <code>DepartureTime</code> and <code>DepartNow</code> in a single request. Specifying both
     * parameters returns a validation error.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/travel-mode.html">Specifying a travel
     * mode</a> using TravelMode sets the transportation mode used to calculate the routes. This also lets you specify
     * additional route preferences in <code>CarModeOptions</code> if traveling by <code>Car</code>, or
     * <code>TruckModeOptions</code> if traveling by <code>Truck</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param calculateRouteMatrixRequest
     * @return Result of the CalculateRouteMatrix operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CalculateRouteMatrix
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRouteMatrix" target="_top">AWS
     *      API Documentation</a>
     */
    CalculateRouteMatrixResult calculateRouteMatrix(CalculateRouteMatrixRequest calculateRouteMatrixRequest);

    /**
     * <p>
     * Creates a geofence collection, which manages and stores geofences.
     * </p>
     * 
     * @param createGeofenceCollectionRequest
     * @return Result of the CreateGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CreateGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGeofenceCollectionResult createGeofenceCollection(CreateGeofenceCollectionRequest createGeofenceCollectionRequest);

    /**
     * <p>
     * Creates a map resource in your AWS account, which provides map tiles of different styles sourced from global
     * location data providers.
     * </p>
     * <note>
     * <p>
     * If your application is tracking or routing assets you use in your business, such as delivery vehicles or
     * employees, you may only use HERE as your geolocation provider. See section 82 of the <a
     * href="http://aws.amazon.com/service-terms">AWS service terms</a> for more details.
     * </p>
     * </note>
     * 
     * @param createMapRequest
     * @return Result of the CreateMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CreateMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateMap" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMapResult createMap(CreateMapRequest createMapRequest);

    /**
     * <p>
     * Creates a place index resource in your AWS account. Use a place index resource to geocode addresses and other
     * text queries by using the <code>SearchPlaceIndexForText</code> operation, and reverse geocode coordinates by
     * using the <code>SearchPlaceIndexForPosition</code> operation, and enable autosuggestions by using the
     * <code>SearchPlaceIndexForSuggestions</code> operation.
     * </p>
     * <note>
     * <p>
     * If your application is tracking or routing assets you use in your business, such as delivery vehicles or
     * employees, you may only use HERE as your geolocation provider. See section 82 of the <a
     * href="http://aws.amazon.com/service-terms">AWS service terms</a> for more details.
     * </p>
     * </note>
     * 
     * @param createPlaceIndexRequest
     * @return Result of the CreatePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CreatePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreatePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePlaceIndexResult createPlaceIndex(CreatePlaceIndexRequest createPlaceIndexRequest);

    /**
     * <p>
     * Creates a route calculator resource in your AWS account.
     * </p>
     * <p>
     * You can send requests to a route calculator resource to estimate travel time, distance, and get directions. A
     * route calculator sources traffic and road network data from your chosen data provider.
     * </p>
     * <note>
     * <p>
     * If your application is tracking or routing assets you use in your business, such as delivery vehicles or
     * employees, you may only use HERE as your geolocation provider. See section 82 of the <a
     * href="http://aws.amazon.com/service-terms">AWS service terms</a> for more details.
     * </p>
     * </note>
     * 
     * @param createRouteCalculatorRequest
     * @return Result of the CreateRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CreateRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRouteCalculatorResult createRouteCalculator(CreateRouteCalculatorRequest createRouteCalculatorRequest);

    /**
     * <p>
     * Creates a tracker resource in your AWS account, which lets you retrieve current and historical location of
     * devices.
     * </p>
     * 
     * @param createTrackerRequest
     * @return Result of the CreateTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.CreateTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateTracker" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTrackerResult createTracker(CreateTrackerRequest createTrackerRequest);

    /**
     * <p>
     * Deletes a geofence collection from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently. If the geofence collection is the target of a tracker resource,
     * the devices will no longer be monitored.
     * </p>
     * </note>
     * 
     * @param deleteGeofenceCollectionRequest
     * @return Result of the DeleteGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DeleteGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGeofenceCollectionResult deleteGeofenceCollection(DeleteGeofenceCollectionRequest deleteGeofenceCollectionRequest);

    /**
     * <p>
     * Deletes a map resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently. If the map is being used in an application, the map may not
     * render.
     * </p>
     * </note>
     * 
     * @param deleteMapRequest
     * @return Result of the DeleteMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DeleteMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteMap" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMapResult deleteMap(DeleteMapRequest deleteMapRequest);

    /**
     * <p>
     * Deletes a place index resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
     * </p>
     * </note>
     * 
     * @param deletePlaceIndexRequest
     * @return Result of the DeletePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DeletePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeletePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePlaceIndexResult deletePlaceIndex(DeletePlaceIndexRequest deletePlaceIndexRequest);

    /**
     * <p>
     * Deletes a route calculator resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
     * </p>
     * </note>
     * 
     * @param deleteRouteCalculatorRequest
     * @return Result of the DeleteRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DeleteRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRouteCalculatorResult deleteRouteCalculator(DeleteRouteCalculatorRequest deleteRouteCalculatorRequest);

    /**
     * <p>
     * Deletes a tracker resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently. If the tracker resource is in use, you may encounter an error.
     * Make sure that the target resource isn't a dependency for your applications.
     * </p>
     * </note>
     * 
     * @param deleteTrackerRequest
     * @return Result of the DeleteTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DeleteTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteTracker" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTrackerResult deleteTracker(DeleteTrackerRequest deleteTrackerRequest);

    /**
     * <p>
     * Retrieves the geofence collection details.
     * </p>
     * 
     * @param describeGeofenceCollectionRequest
     * @return Result of the DescribeGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DescribeGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGeofenceCollectionResult describeGeofenceCollection(DescribeGeofenceCollectionRequest describeGeofenceCollectionRequest);

    /**
     * <p>
     * Retrieves the map resource details.
     * </p>
     * 
     * @param describeMapRequest
     * @return Result of the DescribeMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DescribeMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeMap" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeMapResult describeMap(DescribeMapRequest describeMapRequest);

    /**
     * <p>
     * Retrieves the place index resource details.
     * </p>
     * 
     * @param describePlaceIndexRequest
     * @return Result of the DescribePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DescribePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribePlaceIndex" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePlaceIndexResult describePlaceIndex(DescribePlaceIndexRequest describePlaceIndexRequest);

    /**
     * <p>
     * Retrieves the route calculator resource details.
     * </p>
     * 
     * @param describeRouteCalculatorRequest
     * @return Result of the DescribeRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DescribeRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeRouteCalculator"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRouteCalculatorResult describeRouteCalculator(DescribeRouteCalculatorRequest describeRouteCalculatorRequest);

    /**
     * <p>
     * Retrieves the tracker resource details.
     * </p>
     * 
     * @param describeTrackerRequest
     * @return Result of the DescribeTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DescribeTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeTracker" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTrackerResult describeTracker(DescribeTrackerRequest describeTrackerRequest);

    /**
     * <p>
     * Removes the association between a tracker resource and a geofence collection.
     * </p>
     * <note>
     * <p>
     * Once you unlink a tracker resource from a geofence collection, the tracker positions will no longer be
     * automatically evaluated against geofences.
     * </p>
     * </note>
     * 
     * @param disassociateTrackerConsumerRequest
     * @return Result of the DisassociateTrackerConsumer operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.DisassociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DisassociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTrackerConsumerResult disassociateTrackerConsumer(DisassociateTrackerConsumerRequest disassociateTrackerConsumerRequest);

    /**
     * <p>
     * Retrieves a device's most recent position according to its sample time.
     * </p>
     * <note>
     * <p>
     * Device positions are deleted after 30 days.
     * </p>
     * </note>
     * 
     * @param getDevicePositionRequest
     * @return Result of the GetDevicePosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePosition" target="_top">AWS API
     *      Documentation</a>
     */
    GetDevicePositionResult getDevicePosition(GetDevicePositionRequest getDevicePositionRequest);

    /**
     * <p>
     * Retrieves the device position history from a tracker resource within a specified range of time.
     * </p>
     * <note>
     * <p>
     * Device positions are deleted after 30 days.
     * </p>
     * </note>
     * 
     * @param getDevicePositionHistoryRequest
     * @return Result of the GetDevicePositionHistory operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    GetDevicePositionHistoryResult getDevicePositionHistory(GetDevicePositionHistoryRequest getDevicePositionHistoryRequest);

    /**
     * <p>
     * Retrieves the geofence details from a geofence collection.
     * </p>
     * 
     * @param getGeofenceRequest
     * @return Result of the GetGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    GetGeofenceResult getGeofence(GetGeofenceRequest getGeofenceRequest);

    /**
     * <p>
     * Retrieves glyphs used to display labels on a map.
     * </p>
     * 
     * @param getMapGlyphsRequest
     * @return Result of the GetMapGlyphs operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetMapGlyphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapGlyphs" target="_top">AWS API
     *      Documentation</a>
     */
    GetMapGlyphsResult getMapGlyphs(GetMapGlyphsRequest getMapGlyphsRequest);

    /**
     * <p>
     * Retrieves the sprite sheet corresponding to a map resource. The sprite sheet is a PNG image paired with a JSON
     * document describing the offsets of individual icons that will be displayed on a rendered map.
     * </p>
     * 
     * @param getMapSpritesRequest
     * @return Result of the GetMapSprites operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetMapSprites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapSprites" target="_top">AWS API
     *      Documentation</a>
     */
    GetMapSpritesResult getMapSprites(GetMapSpritesRequest getMapSpritesRequest);

    /**
     * <p>
     * Retrieves the map style descriptor from a map resource.
     * </p>
     * <p>
     * The style descriptor contains speciﬁcations on how features render on a map. For example, what data to display,
     * what order to display the data in, and the style for the data. Style descriptors follow the Mapbox Style
     * Specification.
     * </p>
     * 
     * @param getMapStyleDescriptorRequest
     * @return Result of the GetMapStyleDescriptor operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetMapStyleDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapStyleDescriptor" target="_top">AWS
     *      API Documentation</a>
     */
    GetMapStyleDescriptorResult getMapStyleDescriptor(GetMapStyleDescriptorRequest getMapStyleDescriptorRequest);

    /**
     * <p>
     * Retrieves a vector data tile from the map resource. Map tiles are used by clients to render a map. they're
     * addressed using a grid arrangement with an X coordinate, Y coordinate, and Z (zoom) level.
     * </p>
     * <p>
     * The origin (0, 0) is the top left of the map. Increasing the zoom level by 1 doubles both the X and Y dimensions,
     * so a tile containing data for the entire world at (0/0/0) will be split into 4 tiles at zoom 1 (1/0/0, 1/0/1,
     * 1/1/0, 1/1/1).
     * </p>
     * 
     * @param getMapTileRequest
     * @return Result of the GetMapTile operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetMapTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapTile" target="_top">AWS API
     *      Documentation</a>
     */
    GetMapTileResult getMapTile(GetMapTileRequest getMapTileRequest);

    /**
     * <p>
     * Finds a place by its unique ID. A <code>PlaceId</code> is returned by other search operations.
     * </p>
     * <note>
     * <p>
     * A PlaceId is valid only if all of the following are the same in the original search request and the call to
     * <code>GetPlace</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Region
     * </p>
     * </li>
     * <li>
     * <p>
     * Data provider specified in the place index resource
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getPlaceRequest
     * @return Result of the GetPlace operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.GetPlace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetPlace" target="_top">AWS API
     *      Documentation</a>
     */
    GetPlaceResult getPlace(GetPlaceRequest getPlaceRequest);

    /**
     * <p>
     * A batch request to retrieve all device positions.
     * </p>
     * 
     * @param listDevicePositionsRequest
     * @return Result of the ListDevicePositions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListDevicePositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListDevicePositions" target="_top">AWS
     *      API Documentation</a>
     */
    ListDevicePositionsResult listDevicePositions(ListDevicePositionsRequest listDevicePositionsRequest);

    /**
     * <p>
     * Lists geofence collections in your AWS account.
     * </p>
     * 
     * @param listGeofenceCollectionsRequest
     * @return Result of the ListGeofenceCollections operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListGeofenceCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofenceCollections"
     *      target="_top">AWS API Documentation</a>
     */
    ListGeofenceCollectionsResult listGeofenceCollections(ListGeofenceCollectionsRequest listGeofenceCollectionsRequest);

    /**
     * <p>
     * Lists geofences stored in a given geofence collection.
     * </p>
     * 
     * @param listGeofencesRequest
     * @return Result of the ListGeofences operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofences" target="_top">AWS API
     *      Documentation</a>
     */
    ListGeofencesResult listGeofences(ListGeofencesRequest listGeofencesRequest);

    /**
     * <p>
     * Lists map resources in your AWS account.
     * </p>
     * 
     * @param listMapsRequest
     * @return Result of the ListMaps operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListMaps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListMaps" target="_top">AWS API
     *      Documentation</a>
     */
    ListMapsResult listMaps(ListMapsRequest listMapsRequest);

    /**
     * <p>
     * Lists place index resources in your AWS account.
     * </p>
     * 
     * @param listPlaceIndexesRequest
     * @return Result of the ListPlaceIndexes operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListPlaceIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListPlaceIndexes" target="_top">AWS API
     *      Documentation</a>
     */
    ListPlaceIndexesResult listPlaceIndexes(ListPlaceIndexesRequest listPlaceIndexesRequest);

    /**
     * <p>
     * Lists route calculator resources in your AWS account.
     * </p>
     * 
     * @param listRouteCalculatorsRequest
     * @return Result of the ListRouteCalculators operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListRouteCalculators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListRouteCalculators" target="_top">AWS
     *      API Documentation</a>
     */
    ListRouteCalculatorsResult listRouteCalculators(ListRouteCalculatorsRequest listRouteCalculatorsRequest);

    /**
     * <p>
     * Returns a list of tags that are applied to the specified Amazon Location resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists geofence collections currently associated to the given tracker resource.
     * </p>
     * 
     * @param listTrackerConsumersRequest
     * @return Result of the ListTrackerConsumers operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListTrackerConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackerConsumers" target="_top">AWS
     *      API Documentation</a>
     */
    ListTrackerConsumersResult listTrackerConsumers(ListTrackerConsumersRequest listTrackerConsumersRequest);

    /**
     * <p>
     * Lists tracker resources in your AWS account.
     * </p>
     * 
     * @param listTrackersRequest
     * @return Result of the ListTrackers operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.ListTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackers" target="_top">AWS API
     *      Documentation</a>
     */
    ListTrackersResult listTrackers(ListTrackersRequest listTrackersRequest);

    /**
     * <p>
     * Stores a geofence geometry in a given geofence collection, or updates the geometry of an existing geofence if a
     * geofence ID is included in the request.
     * </p>
     * 
     * @param putGeofenceRequest
     * @return Result of the PutGeofence operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws ConflictException
     *         The request was unsuccessful because of a conflict.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.PutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/PutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    PutGeofenceResult putGeofence(PutGeofenceRequest putGeofenceRequest);

    /**
     * <p>
     * Reverse geocodes a given coordinate and returns a legible address. Allows you to search for Places or points of
     * interest near a given position.
     * </p>
     * 
     * @param searchPlaceIndexForPositionRequest
     * @return Result of the SearchPlaceIndexForPosition operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.SearchPlaceIndexForPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForPosition"
     *      target="_top">AWS API Documentation</a>
     */
    SearchPlaceIndexForPositionResult searchPlaceIndexForPosition(SearchPlaceIndexForPositionRequest searchPlaceIndexForPositionRequest);

    /**
     * <p>
     * Generates suggestions for addresses and points of interest based on partial or misspelled free-form text. This
     * operation is also known as autocomplete, autosuggest, or fuzzy matching.
     * </p>
     * <p>
     * Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a
     * specific position on the globe.
     * </p>
     * <note>
     * <p>
     * You can search for suggested place names near a specified position by using <code>BiasPosition</code>, or filter
     * results within a bounding box by using <code>FilterBBox</code>. These parameters are mutually exclusive; using
     * both <code>BiasPosition</code> and <code>FilterBBox</code> in the same command returns an error.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForSuggestionsRequest
     * @return Result of the SearchPlaceIndexForSuggestions operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.SearchPlaceIndexForSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForSuggestions"
     *      target="_top">AWS API Documentation</a>
     */
    SearchPlaceIndexForSuggestionsResult searchPlaceIndexForSuggestions(SearchPlaceIndexForSuggestionsRequest searchPlaceIndexForSuggestionsRequest);

    /**
     * <p>
     * Geocodes free-form text, such as an address, name, city, or region to allow you to search for Places or points of
     * interest.
     * </p>
     * <p>
     * Optional parameters let you narrow your search results by bounding box or country, or bias your search toward a
     * specific position on the globe.
     * </p>
     * <note>
     * <p>
     * You can search for places near a given position using <code>BiasPosition</code>, or filter results within a
     * bounding box using <code>FilterBBox</code>. Providing both parameters simultaneously returns an error.
     * </p>
     * </note>
     * <p>
     * Search results are returned in order of highest to lowest relevance.
     * </p>
     * 
     * @param searchPlaceIndexForTextRequest
     * @return Result of the SearchPlaceIndexForText operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.SearchPlaceIndexForText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForText"
     *      target="_top">AWS API Documentation</a>
     */
    SearchPlaceIndexForTextResult searchPlaceIndexForText(SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon Location Service resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; operation with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that's already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate up to 50 tags with a resource.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Amazon Location resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified properties of a given geofence collection.
     * </p>
     * 
     * @param updateGeofenceCollectionRequest
     * @return Result of the UpdateGeofenceCollection operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGeofenceCollectionResult updateGeofenceCollection(UpdateGeofenceCollectionRequest updateGeofenceCollectionRequest);

    /**
     * <p>
     * Updates the specified properties of a given map resource.
     * </p>
     * 
     * @param updateMapRequest
     * @return Result of the UpdateMap operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateMap" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMapResult updateMap(UpdateMapRequest updateMapRequest);

    /**
     * <p>
     * Updates the specified properties of a given place index resource.
     * </p>
     * 
     * @param updatePlaceIndexRequest
     * @return Result of the UpdatePlaceIndex operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdatePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdatePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePlaceIndexResult updatePlaceIndex(UpdatePlaceIndexRequest updatePlaceIndexRequest);

    /**
     * <p>
     * Updates the specified properties for a given route calculator resource.
     * </p>
     * 
     * @param updateRouteCalculatorRequest
     * @return Result of the UpdateRouteCalculator operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateRouteCalculatorResult updateRouteCalculator(UpdateRouteCalculatorRequest updateRouteCalculatorRequest);

    /**
     * <p>
     * Updates the specified properties of a given tracker resource.
     * </p>
     * 
     * @param updateTrackerRequest
     * @return Result of the UpdateTracker operation returned by the service.
     * @throws InternalServerException
     *         The request has failed to process because of an unknown server error, exception, or failure.
     * @throws ResourceNotFoundException
     *         The resource that you've entered was not found in your AWS account.
     * @throws AccessDeniedException
     *         The request was denied because of insufficient access or permissions. Check with an administrator to
     *         verify your permissions.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @sample AmazonLocation.UpdateTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateTracker" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTrackerResult updateTracker(UpdateTrackerRequest updateTrackerRequest);

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
