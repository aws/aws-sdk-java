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
package com.amazonaws.services.iotroborunner;

import javax.annotation.Generated;

import com.amazonaws.services.iotroborunner.model.*;

/**
 * Interface for accessing AWS IoT RoboRunner asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotroborunner.AbstractAWSIoTRoboRunnerAsync} instead.
 * </p>
 * <p>
 * <p>
 * An example service, deployed with the Octane Service creator, which will echo the string
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTRoboRunnerAsync extends AWSIoTRoboRunner {

    /**
     * <p>
     * Grants permission to create a destination
     * </p>
     * 
     * @param createDestinationRequest
     * @return A Java Future containing the result of the CreateDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(CreateDestinationRequest createDestinationRequest);

    /**
     * <p>
     * Grants permission to create a destination
     * </p>
     * 
     * @param createDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDestinationResult> createDestinationAsync(CreateDestinationRequest createDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDestinationRequest, CreateDestinationResult> asyncHandler);

    /**
     * <p>
     * Grants permission to create a site
     * </p>
     * 
     * @param createSiteRequest
     * @return A Java Future containing the result of the CreateSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest createSiteRequest);

    /**
     * <p>
     * Grants permission to create a site
     * </p>
     * 
     * @param createSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest createSiteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSiteRequest, CreateSiteResult> asyncHandler);

    /**
     * <p>
     * Grants permission to create a worker
     * </p>
     * 
     * @param createWorkerRequest
     * @return A Java Future containing the result of the CreateWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(CreateWorkerRequest createWorkerRequest);

    /**
     * <p>
     * Grants permission to create a worker
     * </p>
     * 
     * @param createWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(CreateWorkerRequest createWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkerRequest, CreateWorkerResult> asyncHandler);

    /**
     * <p>
     * Grants permission to create a worker fleet
     * </p>
     * 
     * @param createWorkerFleetRequest
     * @return A Java Future containing the result of the CreateWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.CreateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerFleetResult> createWorkerFleetAsync(CreateWorkerFleetRequest createWorkerFleetRequest);

    /**
     * <p>
     * Grants permission to create a worker fleet
     * </p>
     * 
     * @param createWorkerFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.CreateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerFleetResult> createWorkerFleetAsync(CreateWorkerFleetRequest createWorkerFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkerFleetRequest, CreateWorkerFleetResult> asyncHandler);

    /**
     * <p>
     * Grants permission to delete a destination
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return A Java Future containing the result of the DeleteDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Grants permission to delete a destination
     * </p>
     * 
     * @param deleteDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest deleteDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, DeleteDestinationResult> asyncHandler);

    /**
     * <p>
     * Grants permission to delete a site
     * </p>
     * 
     * @param deleteSiteRequest
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Grants permission to delete a site
     * </p>
     * 
     * @param deleteSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler);

    /**
     * <p>
     * Grants permission to delete a worker
     * </p>
     * 
     * @param deleteWorkerRequest
     * @return A Java Future containing the result of the DeleteWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(DeleteWorkerRequest deleteWorkerRequest);

    /**
     * <p>
     * Grants permission to delete a worker
     * </p>
     * 
     * @param deleteWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(DeleteWorkerRequest deleteWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkerRequest, DeleteWorkerResult> asyncHandler);

    /**
     * <p>
     * Grants permission to delete a worker fleet
     * </p>
     * 
     * @param deleteWorkerFleetRequest
     * @return A Java Future containing the result of the DeleteWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.DeleteWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkerFleetResult> deleteWorkerFleetAsync(DeleteWorkerFleetRequest deleteWorkerFleetRequest);

    /**
     * <p>
     * Grants permission to delete a worker fleet
     * </p>
     * 
     * @param deleteWorkerFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.DeleteWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkerFleetResult> deleteWorkerFleetAsync(DeleteWorkerFleetRequest deleteWorkerFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkerFleetRequest, DeleteWorkerFleetResult> asyncHandler);

    /**
     * <p>
     * Grants permission to get a destination
     * </p>
     * 
     * @param getDestinationRequest
     * @return A Java Future containing the result of the GetDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(GetDestinationRequest getDestinationRequest);

    /**
     * <p>
     * Grants permission to get a destination
     * </p>
     * 
     * @param getDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDestinationResult> getDestinationAsync(GetDestinationRequest getDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDestinationRequest, GetDestinationResult> asyncHandler);

    /**
     * <p>
     * Grants permission to get a site
     * </p>
     * 
     * @param getSiteRequest
     * @return A Java Future containing the result of the GetSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSiteResult> getSiteAsync(GetSiteRequest getSiteRequest);

    /**
     * <p>
     * Grants permission to get a site
     * </p>
     * 
     * @param getSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSiteResult> getSiteAsync(GetSiteRequest getSiteRequest,
            com.amazonaws.handlers.AsyncHandler<GetSiteRequest, GetSiteResult> asyncHandler);

    /**
     * <p>
     * Grants permission to get a worker
     * </p>
     * 
     * @param getWorkerRequest
     * @return A Java Future containing the result of the GetWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(GetWorkerRequest getWorkerRequest);

    /**
     * <p>
     * Grants permission to get a worker
     * </p>
     * 
     * @param getWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(GetWorkerRequest getWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkerRequest, GetWorkerResult> asyncHandler);

    /**
     * <p>
     * Grants permission to get a worker fleet
     * </p>
     * 
     * @param getWorkerFleetRequest
     * @return A Java Future containing the result of the GetWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.GetWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorkerFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkerFleetResult> getWorkerFleetAsync(GetWorkerFleetRequest getWorkerFleetRequest);

    /**
     * <p>
     * Grants permission to get a worker fleet
     * </p>
     * 
     * @param getWorkerFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.GetWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorkerFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkerFleetResult> getWorkerFleetAsync(GetWorkerFleetRequest getWorkerFleetRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkerFleetRequest, GetWorkerFleetResult> asyncHandler);

    /**
     * <p>
     * Grants permission to list destinations
     * </p>
     * 
     * @param listDestinationsRequest
     * @return A Java Future containing the result of the ListDestinations operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(ListDestinationsRequest listDestinationsRequest);

    /**
     * <p>
     * Grants permission to list destinations
     * </p>
     * 
     * @param listDestinationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDestinations operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDestinationsResult> listDestinationsAsync(ListDestinationsRequest listDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDestinationsRequest, ListDestinationsResult> asyncHandler);

    /**
     * <p>
     * Grants permission to list sites
     * </p>
     * 
     * @param listSitesRequest
     * @return A Java Future containing the result of the ListSites operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest listSitesRequest);

    /**
     * <p>
     * Grants permission to list sites
     * </p>
     * 
     * @param listSitesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSites operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest listSitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSitesRequest, ListSitesResult> asyncHandler);

    /**
     * <p>
     * Grants permission to list worker fleets
     * </p>
     * 
     * @param listWorkerFleetsRequest
     * @return A Java Future containing the result of the ListWorkerFleets operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.ListWorkerFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkerFleets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkerFleetsResult> listWorkerFleetsAsync(ListWorkerFleetsRequest listWorkerFleetsRequest);

    /**
     * <p>
     * Grants permission to list worker fleets
     * </p>
     * 
     * @param listWorkerFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkerFleets operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.ListWorkerFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkerFleets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkerFleetsResult> listWorkerFleetsAsync(ListWorkerFleetsRequest listWorkerFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkerFleetsRequest, ListWorkerFleetsResult> asyncHandler);

    /**
     * <p>
     * Grants permission to list workers
     * </p>
     * 
     * @param listWorkersRequest
     * @return A Java Future containing the result of the ListWorkers operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(ListWorkersRequest listWorkersRequest);

    /**
     * <p>
     * Grants permission to list workers
     * </p>
     * 
     * @param listWorkersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkers operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(ListWorkersRequest listWorkersRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkersRequest, ListWorkersResult> asyncHandler);

    /**
     * <p>
     * Grants permission to update a destination
     * </p>
     * 
     * @param updateDestinationRequest
     * @return A Java Future containing the result of the UpdateDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest updateDestinationRequest);

    /**
     * <p>
     * Grants permission to update a destination
     * </p>
     * 
     * @param updateDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDestination operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest updateDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDestinationRequest, UpdateDestinationResult> asyncHandler);

    /**
     * <p>
     * Grants permission to update a site
     * </p>
     * 
     * @param updateSiteRequest
     * @return A Java Future containing the result of the UpdateSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest updateSiteRequest);

    /**
     * <p>
     * Grants permission to update a site
     * </p>
     * 
     * @param updateSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSite operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest updateSiteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSiteRequest, UpdateSiteResult> asyncHandler);

    /**
     * <p>
     * Grants permission to update a worker
     * </p>
     * 
     * @param updateWorkerRequest
     * @return A Java Future containing the result of the UpdateWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(UpdateWorkerRequest updateWorkerRequest);

    /**
     * <p>
     * Grants permission to update a worker
     * </p>
     * 
     * @param updateWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorker operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(UpdateWorkerRequest updateWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkerRequest, UpdateWorkerResult> asyncHandler);

    /**
     * <p>
     * Grants permission to update a worker fleet
     * </p>
     * 
     * @param updateWorkerFleetRequest
     * @return A Java Future containing the result of the UpdateWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsync.UpdateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerFleetResult> updateWorkerFleetAsync(UpdateWorkerFleetRequest updateWorkerFleetRequest);

    /**
     * <p>
     * Grants permission to update a worker fleet
     * </p>
     * 
     * @param updateWorkerFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkerFleet operation returned by the service.
     * @sample AWSIoTRoboRunnerAsyncHandler.UpdateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerFleetResult> updateWorkerFleetAsync(UpdateWorkerFleetRequest updateWorkerFleetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkerFleetRequest, UpdateWorkerFleetResult> asyncHandler);

}
