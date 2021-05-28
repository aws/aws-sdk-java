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
package com.amazonaws.services.location;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;

/**
 * Interface for accessing Amazon Location Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.location.AbstractAmazonLocationAsync} instead.
 * </p>
 * <p>
 * <p>
 * Suite of geospatial services including Maps, Places, Routes, Tracking, and Geofencing
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLocationAsync extends AmazonLocation {

    /**
     * <p>
     * Creates an association between a geofence collection and a tracker resource. This allows the tracker resource to
     * communicate location data to the linked geofence collection.
     * </p>
     * <note>
     * <p>
     * Currently not supported — Cross-account configurations, such as creating associations between a tracker resource
     * in one account and a geofence collection in another account.
     * </p>
     * </note>
     * 
     * @param associateTrackerConsumerRequest
     * @return A Java Future containing the result of the AssociateTrackerConsumer operation returned by the service.
     * @sample AmazonLocationAsync.AssociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/AssociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTrackerConsumerResult> associateTrackerConsumerAsync(AssociateTrackerConsumerRequest associateTrackerConsumerRequest);

    /**
     * <p>
     * Creates an association between a geofence collection and a tracker resource. This allows the tracker resource to
     * communicate location data to the linked geofence collection.
     * </p>
     * <note>
     * <p>
     * Currently not supported — Cross-account configurations, such as creating associations between a tracker resource
     * in one account and a geofence collection in another account.
     * </p>
     * </note>
     * 
     * @param associateTrackerConsumerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateTrackerConsumer operation returned by the service.
     * @sample AmazonLocationAsyncHandler.AssociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/AssociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTrackerConsumerResult> associateTrackerConsumerAsync(AssociateTrackerConsumerRequest associateTrackerConsumerRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateTrackerConsumerRequest, AssociateTrackerConsumerResult> asyncHandler);

    /**
     * <p>
     * Deletes the position history of one or more devices from a tracker resource.
     * </p>
     * 
     * @param batchDeleteDevicePositionHistoryRequest
     * @return A Java Future containing the result of the BatchDeleteDevicePositionHistory operation returned by the
     *         service.
     * @sample AmazonLocationAsync.BatchDeleteDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDevicePositionHistoryResult> batchDeleteDevicePositionHistoryAsync(
            BatchDeleteDevicePositionHistoryRequest batchDeleteDevicePositionHistoryRequest);

    /**
     * <p>
     * Deletes the position history of one or more devices from a tracker resource.
     * </p>
     * 
     * @param batchDeleteDevicePositionHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteDevicePositionHistory operation returned by the
     *         service.
     * @sample AmazonLocationAsyncHandler.BatchDeleteDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDevicePositionHistoryResult> batchDeleteDevicePositionHistoryAsync(
            BatchDeleteDevicePositionHistoryRequest batchDeleteDevicePositionHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteDevicePositionHistoryRequest, BatchDeleteDevicePositionHistoryResult> asyncHandler);

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
     * @return A Java Future containing the result of the BatchDeleteGeofence operation returned by the service.
     * @sample AmazonLocationAsync.BatchDeleteGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteGeofence" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteGeofenceResult> batchDeleteGeofenceAsync(BatchDeleteGeofenceRequest batchDeleteGeofenceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteGeofence operation returned by the service.
     * @sample AmazonLocationAsyncHandler.BatchDeleteGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteGeofence" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteGeofenceResult> batchDeleteGeofenceAsync(BatchDeleteGeofenceRequest batchDeleteGeofenceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteGeofenceRequest, BatchDeleteGeofenceResult> asyncHandler);

    /**
     * <p>
     * Evaluates device positions against the geofence geometries from a given geofence collection. The evaluation
     * determines if the device has entered or exited a geofenced area, which publishes ENTER or EXIT geofence events to
     * Amazon EventBridge.
     * </p>
     * <note>
     * <p>
     * The last geofence that a device was observed within, if any, is tracked for 30 days after the most recent device
     * position update
     * </p>
     * </note>
     * 
     * @param batchEvaluateGeofencesRequest
     * @return A Java Future containing the result of the BatchEvaluateGeofences operation returned by the service.
     * @sample AmazonLocationAsync.BatchEvaluateGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchEvaluateGeofences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEvaluateGeofencesResult> batchEvaluateGeofencesAsync(BatchEvaluateGeofencesRequest batchEvaluateGeofencesRequest);

    /**
     * <p>
     * Evaluates device positions against the geofence geometries from a given geofence collection. The evaluation
     * determines if the device has entered or exited a geofenced area, which publishes ENTER or EXIT geofence events to
     * Amazon EventBridge.
     * </p>
     * <note>
     * <p>
     * The last geofence that a device was observed within, if any, is tracked for 30 days after the most recent device
     * position update
     * </p>
     * </note>
     * 
     * @param batchEvaluateGeofencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchEvaluateGeofences operation returned by the service.
     * @sample AmazonLocationAsyncHandler.BatchEvaluateGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchEvaluateGeofences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEvaluateGeofencesResult> batchEvaluateGeofencesAsync(BatchEvaluateGeofencesRequest batchEvaluateGeofencesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchEvaluateGeofencesRequest, BatchEvaluateGeofencesResult> asyncHandler);

    /**
     * <p>
     * A batch request to retrieve all device positions.
     * </p>
     * 
     * @param batchGetDevicePositionRequest
     * @return A Java Future containing the result of the BatchGetDevicePosition operation returned by the service.
     * @sample AmazonLocationAsync.BatchGetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchGetDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDevicePositionResult> batchGetDevicePositionAsync(BatchGetDevicePositionRequest batchGetDevicePositionRequest);

    /**
     * <p>
     * A batch request to retrieve all device positions.
     * </p>
     * 
     * @param batchGetDevicePositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDevicePosition operation returned by the service.
     * @sample AmazonLocationAsyncHandler.BatchGetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchGetDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDevicePositionResult> batchGetDevicePositionAsync(BatchGetDevicePositionRequest batchGetDevicePositionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDevicePositionRequest, BatchGetDevicePositionResult> asyncHandler);

    /**
     * <p>
     * A batch request for storing geofence geometries into a given geofence collection, or updates the geometry of an
     * existing geofence if a geofence ID is included in the request.
     * </p>
     * 
     * @param batchPutGeofenceRequest
     * @return A Java Future containing the result of the BatchPutGeofence operation returned by the service.
     * @sample AmazonLocationAsync.BatchPutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchPutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchPutGeofenceResult> batchPutGeofenceAsync(BatchPutGeofenceRequest batchPutGeofenceRequest);

    /**
     * <p>
     * A batch request for storing geofence geometries into a given geofence collection, or updates the geometry of an
     * existing geofence if a geofence ID is included in the request.
     * </p>
     * 
     * @param batchPutGeofenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutGeofence operation returned by the service.
     * @sample AmazonLocationAsyncHandler.BatchPutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchPutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchPutGeofenceResult> batchPutGeofenceAsync(BatchPutGeofenceRequest batchPutGeofenceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutGeofenceRequest, BatchPutGeofenceResult> asyncHandler);

    /**
     * <p>
     * Uploads position update data for one or more devices to a tracker resource. Amazon Location uses the data when
     * reporting the last known device position and position history.
     * </p>
     * <note>
     * <p>
     * Only one position update is stored per sample time. Location data is sampled at a fixed rate of one position per
     * 30-second interval and retained for 30 days before it's deleted.
     * </p>
     * </note>
     * 
     * @param batchUpdateDevicePositionRequest
     * @return A Java Future containing the result of the BatchUpdateDevicePosition operation returned by the service.
     * @sample AmazonLocationAsync.BatchUpdateDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchUpdateDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateDevicePositionResult> batchUpdateDevicePositionAsync(
            BatchUpdateDevicePositionRequest batchUpdateDevicePositionRequest);

    /**
     * <p>
     * Uploads position update data for one or more devices to a tracker resource. Amazon Location uses the data when
     * reporting the last known device position and position history.
     * </p>
     * <note>
     * <p>
     * Only one position update is stored per sample time. Location data is sampled at a fixed rate of one position per
     * 30-second interval and retained for 30 days before it's deleted.
     * </p>
     * </note>
     * 
     * @param batchUpdateDevicePositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateDevicePosition operation returned by the service.
     * @sample AmazonLocationAsyncHandler.BatchUpdateDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchUpdateDevicePosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateDevicePositionResult> batchUpdateDevicePositionAsync(
            BatchUpdateDevicePositionRequest batchUpdateDevicePositionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateDevicePositionRequest, BatchUpdateDevicePositionResult> asyncHandler);

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html">Calculates a route</a>
     * given the following required parameters: <code>DeparturePostiton</code> and <code>DestinationPosition</code>.
     * Requires that you first <a
     * href="https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html">create
     * aroute calculator resource</a>
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
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#departure-time">
     * Specifying a departure time</a> using either <code>DepartureTime</code> or <code>DepartureNow</code>. This
     * calculates a route based on predictive traffic data at the given time.
     * </p>
     * <note>
     * <p>
     * You can't specify both <code>DepartureTime</code> and <code>DepartureNow</code> in a single request. Specifying
     * both parameters returns an error message.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#travel-mode">Specifying
     * a travel mode</a> using TravelMode. This lets you specify additional route preference such as
     * <code>CarModeOptions</code> if traveling by <code>Car</code>, or <code>TruckModeOptions</code> if traveling by
     * <code>Truck</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param calculateRouteRequest
     * @return A Java Future containing the result of the CalculateRoute operation returned by the service.
     * @sample AmazonLocationAsync.CalculateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CalculateRouteResult> calculateRouteAsync(CalculateRouteRequest calculateRouteRequest);

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html">Calculates a route</a>
     * given the following required parameters: <code>DeparturePostiton</code> and <code>DestinationPosition</code>.
     * Requires that you first <a
     * href="https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html">create
     * aroute calculator resource</a>
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
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#departure-time">
     * Specifying a departure time</a> using either <code>DepartureTime</code> or <code>DepartureNow</code>. This
     * calculates a route based on predictive traffic data at the given time.
     * </p>
     * <note>
     * <p>
     * You can't specify both <code>DepartureTime</code> and <code>DepartureNow</code> in a single request. Specifying
     * both parameters returns an error message.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#travel-mode">Specifying
     * a travel mode</a> using TravelMode. This lets you specify additional route preference such as
     * <code>CarModeOptions</code> if traveling by <code>Car</code>, or <code>TruckModeOptions</code> if traveling by
     * <code>Truck</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param calculateRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CalculateRoute operation returned by the service.
     * @sample AmazonLocationAsyncHandler.CalculateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CalculateRouteResult> calculateRouteAsync(CalculateRouteRequest calculateRouteRequest,
            com.amazonaws.handlers.AsyncHandler<CalculateRouteRequest, CalculateRouteResult> asyncHandler);

    /**
     * <p>
     * Creates a geofence collection, which manages and stores geofences.
     * </p>
     * 
     * @param createGeofenceCollectionRequest
     * @return A Java Future containing the result of the CreateGeofenceCollection operation returned by the service.
     * @sample AmazonLocationAsync.CreateGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGeofenceCollectionResult> createGeofenceCollectionAsync(CreateGeofenceCollectionRequest createGeofenceCollectionRequest);

    /**
     * <p>
     * Creates a geofence collection, which manages and stores geofences.
     * </p>
     * 
     * @param createGeofenceCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGeofenceCollection operation returned by the service.
     * @sample AmazonLocationAsyncHandler.CreateGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGeofenceCollectionResult> createGeofenceCollectionAsync(CreateGeofenceCollectionRequest createGeofenceCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGeofenceCollectionRequest, CreateGeofenceCollectionResult> asyncHandler);

    /**
     * <p>
     * Creates a map resource in your AWS account, which provides map tiles of different styles sourced from global
     * location data providers.
     * </p>
     * 
     * @param createMapRequest
     * @return A Java Future containing the result of the CreateMap operation returned by the service.
     * @sample AmazonLocationAsync.CreateMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateMap" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMapResult> createMapAsync(CreateMapRequest createMapRequest);

    /**
     * <p>
     * Creates a map resource in your AWS account, which provides map tiles of different styles sourced from global
     * location data providers.
     * </p>
     * 
     * @param createMapRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMap operation returned by the service.
     * @sample AmazonLocationAsyncHandler.CreateMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateMap" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMapResult> createMapAsync(CreateMapRequest createMapRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMapRequest, CreateMapResult> asyncHandler);

    /**
     * <p>
     * Creates a place index resource in your AWS account, which supports functions with geospatial data sourced from
     * your chosen data provider.
     * </p>
     * 
     * @param createPlaceIndexRequest
     * @return A Java Future containing the result of the CreatePlaceIndex operation returned by the service.
     * @sample AmazonLocationAsync.CreatePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreatePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePlaceIndexResult> createPlaceIndexAsync(CreatePlaceIndexRequest createPlaceIndexRequest);

    /**
     * <p>
     * Creates a place index resource in your AWS account, which supports functions with geospatial data sourced from
     * your chosen data provider.
     * </p>
     * 
     * @param createPlaceIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlaceIndex operation returned by the service.
     * @sample AmazonLocationAsyncHandler.CreatePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreatePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePlaceIndexResult> createPlaceIndexAsync(CreatePlaceIndexRequest createPlaceIndexRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlaceIndexRequest, CreatePlaceIndexResult> asyncHandler);

    /**
     * <p>
     * Creates a route calculator resource in your AWS account.
     * </p>
     * <p>
     * You can send requests to a route calculator resource to estimate travel time, distance, and get directions. A
     * route calculator sources traffic and road network data from your chosen data provider.
     * </p>
     * 
     * @param createRouteCalculatorRequest
     * @return A Java Future containing the result of the CreateRouteCalculator operation returned by the service.
     * @sample AmazonLocationAsync.CreateRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteCalculatorResult> createRouteCalculatorAsync(CreateRouteCalculatorRequest createRouteCalculatorRequest);

    /**
     * <p>
     * Creates a route calculator resource in your AWS account.
     * </p>
     * <p>
     * You can send requests to a route calculator resource to estimate travel time, distance, and get directions. A
     * route calculator sources traffic and road network data from your chosen data provider.
     * </p>
     * 
     * @param createRouteCalculatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRouteCalculator operation returned by the service.
     * @sample AmazonLocationAsyncHandler.CreateRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteCalculatorResult> createRouteCalculatorAsync(CreateRouteCalculatorRequest createRouteCalculatorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteCalculatorRequest, CreateRouteCalculatorResult> asyncHandler);

    /**
     * <p>
     * Creates a tracker resource in your AWS account, which lets you retrieve current and historical location of
     * devices.
     * </p>
     * 
     * @param createTrackerRequest
     * @return A Java Future containing the result of the CreateTracker operation returned by the service.
     * @sample AmazonLocationAsync.CreateTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateTracker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrackerResult> createTrackerAsync(CreateTrackerRequest createTrackerRequest);

    /**
     * <p>
     * Creates a tracker resource in your AWS account, which lets you retrieve current and historical location of
     * devices.
     * </p>
     * 
     * @param createTrackerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTracker operation returned by the service.
     * @sample AmazonLocationAsyncHandler.CreateTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateTracker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrackerResult> createTrackerAsync(CreateTrackerRequest createTrackerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrackerRequest, CreateTrackerResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteGeofenceCollection operation returned by the service.
     * @sample AmazonLocationAsync.DeleteGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGeofenceCollectionResult> deleteGeofenceCollectionAsync(DeleteGeofenceCollectionRequest deleteGeofenceCollectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGeofenceCollection operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DeleteGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGeofenceCollectionResult> deleteGeofenceCollectionAsync(DeleteGeofenceCollectionRequest deleteGeofenceCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGeofenceCollectionRequest, DeleteGeofenceCollectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteMap operation returned by the service.
     * @sample AmazonLocationAsync.DeleteMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteMap" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMapResult> deleteMapAsync(DeleteMapRequest deleteMapRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMap operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DeleteMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteMap" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMapResult> deleteMapAsync(DeleteMapRequest deleteMapRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMapRequest, DeleteMapResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeletePlaceIndex operation returned by the service.
     * @sample AmazonLocationAsync.DeletePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeletePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaceIndexResult> deletePlaceIndexAsync(DeletePlaceIndexRequest deletePlaceIndexRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlaceIndex operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DeletePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeletePlaceIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaceIndexResult> deletePlaceIndexAsync(DeletePlaceIndexRequest deletePlaceIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePlaceIndexRequest, DeletePlaceIndexResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRouteCalculator operation returned by the service.
     * @sample AmazonLocationAsync.DeleteRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteCalculatorResult> deleteRouteCalculatorAsync(DeleteRouteCalculatorRequest deleteRouteCalculatorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRouteCalculator operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DeleteRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteRouteCalculator" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteCalculatorResult> deleteRouteCalculatorAsync(DeleteRouteCalculatorRequest deleteRouteCalculatorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteCalculatorRequest, DeleteRouteCalculatorResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteTracker operation returned by the service.
     * @sample AmazonLocationAsync.DeleteTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteTracker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrackerResult> deleteTrackerAsync(DeleteTrackerRequest deleteTrackerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTracker operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DeleteTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteTracker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrackerResult> deleteTrackerAsync(DeleteTrackerRequest deleteTrackerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrackerRequest, DeleteTrackerResult> asyncHandler);

    /**
     * <p>
     * Retrieves the geofence collection details.
     * </p>
     * 
     * @param describeGeofenceCollectionRequest
     * @return A Java Future containing the result of the DescribeGeofenceCollection operation returned by the service.
     * @sample AmazonLocationAsync.DescribeGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGeofenceCollectionResult> describeGeofenceCollectionAsync(
            DescribeGeofenceCollectionRequest describeGeofenceCollectionRequest);

    /**
     * <p>
     * Retrieves the geofence collection details.
     * </p>
     * 
     * @param describeGeofenceCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGeofenceCollection operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DescribeGeofenceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeGeofenceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGeofenceCollectionResult> describeGeofenceCollectionAsync(
            DescribeGeofenceCollectionRequest describeGeofenceCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGeofenceCollectionRequest, DescribeGeofenceCollectionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the map resource details.
     * </p>
     * 
     * @param describeMapRequest
     * @return A Java Future containing the result of the DescribeMap operation returned by the service.
     * @sample AmazonLocationAsync.DescribeMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeMap" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeMapResult> describeMapAsync(DescribeMapRequest describeMapRequest);

    /**
     * <p>
     * Retrieves the map resource details.
     * </p>
     * 
     * @param describeMapRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMap operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DescribeMap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeMap" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeMapResult> describeMapAsync(DescribeMapRequest describeMapRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMapRequest, DescribeMapResult> asyncHandler);

    /**
     * <p>
     * Retrieves the place index resource details.
     * </p>
     * 
     * @param describePlaceIndexRequest
     * @return A Java Future containing the result of the DescribePlaceIndex operation returned by the service.
     * @sample AmazonLocationAsync.DescribePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribePlaceIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlaceIndexResult> describePlaceIndexAsync(DescribePlaceIndexRequest describePlaceIndexRequest);

    /**
     * <p>
     * Retrieves the place index resource details.
     * </p>
     * 
     * @param describePlaceIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePlaceIndex operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DescribePlaceIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribePlaceIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlaceIndexResult> describePlaceIndexAsync(DescribePlaceIndexRequest describePlaceIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePlaceIndexRequest, DescribePlaceIndexResult> asyncHandler);

    /**
     * <p>
     * Retrieves the route calculator resource details.
     * </p>
     * 
     * @param describeRouteCalculatorRequest
     * @return A Java Future containing the result of the DescribeRouteCalculator operation returned by the service.
     * @sample AmazonLocationAsync.DescribeRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeRouteCalculator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRouteCalculatorResult> describeRouteCalculatorAsync(DescribeRouteCalculatorRequest describeRouteCalculatorRequest);

    /**
     * <p>
     * Retrieves the route calculator resource details.
     * </p>
     * 
     * @param describeRouteCalculatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRouteCalculator operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DescribeRouteCalculator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeRouteCalculator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRouteCalculatorResult> describeRouteCalculatorAsync(DescribeRouteCalculatorRequest describeRouteCalculatorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRouteCalculatorRequest, DescribeRouteCalculatorResult> asyncHandler);

    /**
     * <p>
     * Retrieves the tracker resource details.
     * </p>
     * 
     * @param describeTrackerRequest
     * @return A Java Future containing the result of the DescribeTracker operation returned by the service.
     * @sample AmazonLocationAsync.DescribeTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeTracker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrackerResult> describeTrackerAsync(DescribeTrackerRequest describeTrackerRequest);

    /**
     * <p>
     * Retrieves the tracker resource details.
     * </p>
     * 
     * @param describeTrackerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTracker operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DescribeTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeTracker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrackerResult> describeTrackerAsync(DescribeTrackerRequest describeTrackerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrackerRequest, DescribeTrackerResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateTrackerConsumer operation returned by the service.
     * @sample AmazonLocationAsync.DisassociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DisassociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTrackerConsumerResult> disassociateTrackerConsumerAsync(
            DisassociateTrackerConsumerRequest disassociateTrackerConsumerRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateTrackerConsumer operation returned by the service.
     * @sample AmazonLocationAsyncHandler.DisassociateTrackerConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DisassociateTrackerConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTrackerConsumerResult> disassociateTrackerConsumerAsync(
            DisassociateTrackerConsumerRequest disassociateTrackerConsumerRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateTrackerConsumerRequest, DisassociateTrackerConsumerResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDevicePosition operation returned by the service.
     * @sample AmazonLocationAsync.GetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePosition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevicePositionResult> getDevicePositionAsync(GetDevicePositionRequest getDevicePositionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevicePosition operation returned by the service.
     * @sample AmazonLocationAsyncHandler.GetDevicePosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePosition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevicePositionResult> getDevicePositionAsync(GetDevicePositionRequest getDevicePositionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicePositionRequest, GetDevicePositionResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDevicePositionHistory operation returned by the service.
     * @sample AmazonLocationAsync.GetDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDevicePositionHistoryResult> getDevicePositionHistoryAsync(GetDevicePositionHistoryRequest getDevicePositionHistoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevicePositionHistory operation returned by the service.
     * @sample AmazonLocationAsyncHandler.GetDevicePositionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePositionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDevicePositionHistoryResult> getDevicePositionHistoryAsync(GetDevicePositionHistoryRequest getDevicePositionHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicePositionHistoryRequest, GetDevicePositionHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the geofence details from a geofence collection.
     * </p>
     * 
     * @param getGeofenceRequest
     * @return A Java Future containing the result of the GetGeofence operation returned by the service.
     * @sample AmazonLocationAsync.GetGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGeofenceResult> getGeofenceAsync(GetGeofenceRequest getGeofenceRequest);

    /**
     * <p>
     * Retrieves the geofence details from a geofence collection.
     * </p>
     * 
     * @param getGeofenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGeofence operation returned by the service.
     * @sample AmazonLocationAsyncHandler.GetGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGeofenceResult> getGeofenceAsync(GetGeofenceRequest getGeofenceRequest,
            com.amazonaws.handlers.AsyncHandler<GetGeofenceRequest, GetGeofenceResult> asyncHandler);

    /**
     * <p>
     * Retrieves glyphs used to display labels on a map.
     * </p>
     * 
     * @param getMapGlyphsRequest
     * @return A Java Future containing the result of the GetMapGlyphs operation returned by the service.
     * @sample AmazonLocationAsync.GetMapGlyphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapGlyphs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMapGlyphsResult> getMapGlyphsAsync(GetMapGlyphsRequest getMapGlyphsRequest);

    /**
     * <p>
     * Retrieves glyphs used to display labels on a map.
     * </p>
     * 
     * @param getMapGlyphsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMapGlyphs operation returned by the service.
     * @sample AmazonLocationAsyncHandler.GetMapGlyphs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapGlyphs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMapGlyphsResult> getMapGlyphsAsync(GetMapGlyphsRequest getMapGlyphsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMapGlyphsRequest, GetMapGlyphsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the sprite sheet corresponding to a map resource. The sprite sheet is a PNG image paired with a JSON
     * document describing the offsets of individual icons that will be displayed on a rendered map.
     * </p>
     * 
     * @param getMapSpritesRequest
     * @return A Java Future containing the result of the GetMapSprites operation returned by the service.
     * @sample AmazonLocationAsync.GetMapSprites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapSprites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMapSpritesResult> getMapSpritesAsync(GetMapSpritesRequest getMapSpritesRequest);

    /**
     * <p>
     * Retrieves the sprite sheet corresponding to a map resource. The sprite sheet is a PNG image paired with a JSON
     * document describing the offsets of individual icons that will be displayed on a rendered map.
     * </p>
     * 
     * @param getMapSpritesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMapSprites operation returned by the service.
     * @sample AmazonLocationAsyncHandler.GetMapSprites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapSprites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMapSpritesResult> getMapSpritesAsync(GetMapSpritesRequest getMapSpritesRequest,
            com.amazonaws.handlers.AsyncHandler<GetMapSpritesRequest, GetMapSpritesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetMapStyleDescriptor operation returned by the service.
     * @sample AmazonLocationAsync.GetMapStyleDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapStyleDescriptor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMapStyleDescriptorResult> getMapStyleDescriptorAsync(GetMapStyleDescriptorRequest getMapStyleDescriptorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMapStyleDescriptor operation returned by the service.
     * @sample AmazonLocationAsyncHandler.GetMapStyleDescriptor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapStyleDescriptor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMapStyleDescriptorResult> getMapStyleDescriptorAsync(GetMapStyleDescriptorRequest getMapStyleDescriptorRequest,
            com.amazonaws.handlers.AsyncHandler<GetMapStyleDescriptorRequest, GetMapStyleDescriptorResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetMapTile operation returned by the service.
     * @sample AmazonLocationAsync.GetMapTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapTile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMapTileResult> getMapTileAsync(GetMapTileRequest getMapTileRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMapTile operation returned by the service.
     * @sample AmazonLocationAsyncHandler.GetMapTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapTile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMapTileResult> getMapTileAsync(GetMapTileRequest getMapTileRequest,
            com.amazonaws.handlers.AsyncHandler<GetMapTileRequest, GetMapTileResult> asyncHandler);

    /**
     * <p>
     * Lists the latest device positions for requested devices.
     * </p>
     * 
     * @param listDevicePositionsRequest
     * @return A Java Future containing the result of the ListDevicePositions operation returned by the service.
     * @sample AmazonLocationAsync.ListDevicePositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListDevicePositions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDevicePositionsResult> listDevicePositionsAsync(ListDevicePositionsRequest listDevicePositionsRequest);

    /**
     * <p>
     * Lists the latest device positions for requested devices.
     * </p>
     * 
     * @param listDevicePositionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevicePositions operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListDevicePositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListDevicePositions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDevicePositionsResult> listDevicePositionsAsync(ListDevicePositionsRequest listDevicePositionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicePositionsRequest, ListDevicePositionsResult> asyncHandler);

    /**
     * <p>
     * Lists geofence collections in your AWS account.
     * </p>
     * 
     * @param listGeofenceCollectionsRequest
     * @return A Java Future containing the result of the ListGeofenceCollections operation returned by the service.
     * @sample AmazonLocationAsync.ListGeofenceCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofenceCollections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGeofenceCollectionsResult> listGeofenceCollectionsAsync(ListGeofenceCollectionsRequest listGeofenceCollectionsRequest);

    /**
     * <p>
     * Lists geofence collections in your AWS account.
     * </p>
     * 
     * @param listGeofenceCollectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeofenceCollections operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListGeofenceCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofenceCollections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGeofenceCollectionsResult> listGeofenceCollectionsAsync(ListGeofenceCollectionsRequest listGeofenceCollectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGeofenceCollectionsRequest, ListGeofenceCollectionsResult> asyncHandler);

    /**
     * <p>
     * Lists geofences stored in a given geofence collection.
     * </p>
     * 
     * @param listGeofencesRequest
     * @return A Java Future containing the result of the ListGeofences operation returned by the service.
     * @sample AmazonLocationAsync.ListGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGeofencesResult> listGeofencesAsync(ListGeofencesRequest listGeofencesRequest);

    /**
     * <p>
     * Lists geofences stored in a given geofence collection.
     * </p>
     * 
     * @param listGeofencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeofences operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListGeofences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGeofencesResult> listGeofencesAsync(ListGeofencesRequest listGeofencesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGeofencesRequest, ListGeofencesResult> asyncHandler);

    /**
     * <p>
     * Lists map resources in your AWS account.
     * </p>
     * 
     * @param listMapsRequest
     * @return A Java Future containing the result of the ListMaps operation returned by the service.
     * @sample AmazonLocationAsync.ListMaps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListMaps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMapsResult> listMapsAsync(ListMapsRequest listMapsRequest);

    /**
     * <p>
     * Lists map resources in your AWS account.
     * </p>
     * 
     * @param listMapsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMaps operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListMaps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListMaps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMapsResult> listMapsAsync(ListMapsRequest listMapsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMapsRequest, ListMapsResult> asyncHandler);

    /**
     * <p>
     * Lists place index resources in your AWS account.
     * </p>
     * 
     * @param listPlaceIndexesRequest
     * @return A Java Future containing the result of the ListPlaceIndexes operation returned by the service.
     * @sample AmazonLocationAsync.ListPlaceIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListPlaceIndexes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPlaceIndexesResult> listPlaceIndexesAsync(ListPlaceIndexesRequest listPlaceIndexesRequest);

    /**
     * <p>
     * Lists place index resources in your AWS account.
     * </p>
     * 
     * @param listPlaceIndexesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlaceIndexes operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListPlaceIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListPlaceIndexes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPlaceIndexesResult> listPlaceIndexesAsync(ListPlaceIndexesRequest listPlaceIndexesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPlaceIndexesRequest, ListPlaceIndexesResult> asyncHandler);

    /**
     * <p>
     * Lists route calculator resources in your AWS account.
     * </p>
     * 
     * @param listRouteCalculatorsRequest
     * @return A Java Future containing the result of the ListRouteCalculators operation returned by the service.
     * @sample AmazonLocationAsync.ListRouteCalculators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListRouteCalculators" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRouteCalculatorsResult> listRouteCalculatorsAsync(ListRouteCalculatorsRequest listRouteCalculatorsRequest);

    /**
     * <p>
     * Lists route calculator resources in your AWS account.
     * </p>
     * 
     * @param listRouteCalculatorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRouteCalculators operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListRouteCalculators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListRouteCalculators" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRouteCalculatorsResult> listRouteCalculatorsAsync(ListRouteCalculatorsRequest listRouteCalculatorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRouteCalculatorsRequest, ListRouteCalculatorsResult> asyncHandler);

    /**
     * <p>
     * Returns the tags for the specified Amazon Location Service resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLocationAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns the tags for the specified Amazon Location Service resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists geofence collections currently associated to the given tracker resource.
     * </p>
     * 
     * @param listTrackerConsumersRequest
     * @return A Java Future containing the result of the ListTrackerConsumers operation returned by the service.
     * @sample AmazonLocationAsync.ListTrackerConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackerConsumers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrackerConsumersResult> listTrackerConsumersAsync(ListTrackerConsumersRequest listTrackerConsumersRequest);

    /**
     * <p>
     * Lists geofence collections currently associated to the given tracker resource.
     * </p>
     * 
     * @param listTrackerConsumersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrackerConsumers operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListTrackerConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackerConsumers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrackerConsumersResult> listTrackerConsumersAsync(ListTrackerConsumersRequest listTrackerConsumersRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrackerConsumersRequest, ListTrackerConsumersResult> asyncHandler);

    /**
     * <p>
     * Lists tracker resources in your AWS account.
     * </p>
     * 
     * @param listTrackersRequest
     * @return A Java Future containing the result of the ListTrackers operation returned by the service.
     * @sample AmazonLocationAsync.ListTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrackersResult> listTrackersAsync(ListTrackersRequest listTrackersRequest);

    /**
     * <p>
     * Lists tracker resources in your AWS account.
     * </p>
     * 
     * @param listTrackersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrackers operation returned by the service.
     * @sample AmazonLocationAsyncHandler.ListTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrackersResult> listTrackersAsync(ListTrackersRequest listTrackersRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrackersRequest, ListTrackersResult> asyncHandler);

    /**
     * <p>
     * Stores a geofence geometry in a given geofence collection, or updates the geometry of an existing geofence if a
     * geofence ID is included in the request.
     * </p>
     * 
     * @param putGeofenceRequest
     * @return A Java Future containing the result of the PutGeofence operation returned by the service.
     * @sample AmazonLocationAsync.PutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/PutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutGeofenceResult> putGeofenceAsync(PutGeofenceRequest putGeofenceRequest);

    /**
     * <p>
     * Stores a geofence geometry in a given geofence collection, or updates the geometry of an existing geofence if a
     * geofence ID is included in the request.
     * </p>
     * 
     * @param putGeofenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutGeofence operation returned by the service.
     * @sample AmazonLocationAsyncHandler.PutGeofence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/PutGeofence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutGeofenceResult> putGeofenceAsync(PutGeofenceRequest putGeofenceRequest,
            com.amazonaws.handlers.AsyncHandler<PutGeofenceRequest, PutGeofenceResult> asyncHandler);

    /**
     * <p>
     * Reverse geocodes a given coordinate and returns a legible address. Allows you to search for Places or points of
     * interest near a given position.
     * </p>
     * 
     * @param searchPlaceIndexForPositionRequest
     * @return A Java Future containing the result of the SearchPlaceIndexForPosition operation returned by the service.
     * @sample AmazonLocationAsync.SearchPlaceIndexForPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForPosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchPlaceIndexForPositionResult> searchPlaceIndexForPositionAsync(
            SearchPlaceIndexForPositionRequest searchPlaceIndexForPositionRequest);

    /**
     * <p>
     * Reverse geocodes a given coordinate and returns a legible address. Allows you to search for Places or points of
     * interest near a given position.
     * </p>
     * 
     * @param searchPlaceIndexForPositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchPlaceIndexForPosition operation returned by the service.
     * @sample AmazonLocationAsyncHandler.SearchPlaceIndexForPosition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForPosition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchPlaceIndexForPositionResult> searchPlaceIndexForPositionAsync(
            SearchPlaceIndexForPositionRequest searchPlaceIndexForPositionRequest,
            com.amazonaws.handlers.AsyncHandler<SearchPlaceIndexForPositionRequest, SearchPlaceIndexForPositionResult> asyncHandler);

    /**
     * <p>
     * Geocodes free-form text, such as an address, name, city, or region to allow you to search for Places or points of
     * interest.
     * </p>
     * <p>
     * Includes the option to apply additional parameters to narrow your list of results.
     * </p>
     * <note>
     * <p>
     * You can search for places near a given position using <code>BiasPosition</code>, or filter results within a
     * bounding box using <code>FilterBBox</code>. Providing both parameters simultaneously returns an error.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForTextRequest
     * @return A Java Future containing the result of the SearchPlaceIndexForText operation returned by the service.
     * @sample AmazonLocationAsync.SearchPlaceIndexForText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForText"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchPlaceIndexForTextResult> searchPlaceIndexForTextAsync(SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest);

    /**
     * <p>
     * Geocodes free-form text, such as an address, name, city, or region to allow you to search for Places or points of
     * interest.
     * </p>
     * <p>
     * Includes the option to apply additional parameters to narrow your list of results.
     * </p>
     * <note>
     * <p>
     * You can search for places near a given position using <code>BiasPosition</code>, or filter results within a
     * bounding box using <code>FilterBBox</code>. Providing both parameters simultaneously returns an error.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForTextRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchPlaceIndexForText operation returned by the service.
     * @sample AmazonLocationAsyncHandler.SearchPlaceIndexForText
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForText"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchPlaceIndexForTextResult> searchPlaceIndexForTextAsync(SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest,
            com.amazonaws.handlers.AsyncHandler<SearchPlaceIndexForTextRequest, SearchPlaceIndexForTextResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon Location Service resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; action with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate as many as 50 tags with a resource.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLocationAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon Location Service resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; action with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate as many as 50 tags with a resource.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLocationAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified Amazon Location Service resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLocationAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Amazon Location Service resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLocationAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
