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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotroborunner.model.*;

/**
 * Interface for accessing AWS IoT RoboRunner.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotroborunner.AbstractAWSIoTRoboRunner} instead.
 * </p>
 * <p>
 * <p>
 * An example service, deployed with the Octane Service creator, which will echo the string
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTRoboRunner {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iotroborunner";

    /**
     * <p>
     * Grants permission to create a destination
     * </p>
     * 
     * @param createDestinationRequest
     * @return Result of the CreateDestination operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDestinationResult createDestination(CreateDestinationRequest createDestinationRequest);

    /**
     * <p>
     * Grants permission to create a site
     * </p>
     * 
     * @param createSiteRequest
     * @return Result of the CreateSite operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSiteResult createSite(CreateSiteRequest createSiteRequest);

    /**
     * <p>
     * Grants permission to create a worker
     * </p>
     * 
     * @param createWorkerRequest
     * @return Result of the CreateWorker operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkerResult createWorker(CreateWorkerRequest createWorkerRequest);

    /**
     * <p>
     * Grants permission to create a worker fleet
     * </p>
     * 
     * @param createWorkerFleetRequest
     * @return Result of the CreateWorkerFleet operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @throws ServiceQuotaExceededException
     *         Exception thrown if the user's AWS account has reached a service limit and the operation cannot proceed.
     * @sample AWSIoTRoboRunner.CreateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CreateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkerFleetResult createWorkerFleet(CreateWorkerFleetRequest createWorkerFleetRequest);

    /**
     * <p>
     * Grants permission to delete a destination
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDestinationResult deleteDestination(DeleteDestinationRequest deleteDestinationRequest);

    /**
     * <p>
     * Grants permission to delete a site
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSiteResult deleteSite(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Grants permission to delete a worker
     * </p>
     * 
     * @param deleteWorkerRequest
     * @return Result of the DeleteWorker operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorker" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteWorkerResult deleteWorker(DeleteWorkerRequest deleteWorkerRequest);

    /**
     * <p>
     * Grants permission to delete a worker fleet
     * </p>
     * 
     * @param deleteWorkerFleetRequest
     * @return Result of the DeleteWorkerFleet operation returned by the service.
     * @throws ConflictException
     *         Exception thrown if a resource in a create request already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.DeleteWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/DeleteWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkerFleetResult deleteWorkerFleet(DeleteWorkerFleetRequest deleteWorkerFleetRequest);

    /**
     * <p>
     * Grants permission to get a destination
     * </p>
     * 
     * @param getDestinationRequest
     * @return Result of the GetDestination operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetDestination" target="_top">AWS
     *      API Documentation</a>
     */
    GetDestinationResult getDestination(GetDestinationRequest getDestinationRequest);

    /**
     * <p>
     * Grants permission to get a site
     * </p>
     * 
     * @param getSiteRequest
     * @return Result of the GetSite operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    GetSiteResult getSite(GetSiteRequest getSiteRequest);

    /**
     * <p>
     * Grants permission to get a worker
     * </p>
     * 
     * @param getWorkerRequest
     * @return Result of the GetWorker operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkerResult getWorker(GetWorkerRequest getWorkerRequest);

    /**
     * <p>
     * Grants permission to get a worker fleet
     * </p>
     * 
     * @param getWorkerFleetRequest
     * @return Result of the GetWorkerFleet operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.GetWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/GetWorkerFleet" target="_top">AWS
     *      API Documentation</a>
     */
    GetWorkerFleetResult getWorkerFleet(GetWorkerFleetRequest getWorkerFleetRequest);

    /**
     * <p>
     * Grants permission to list destinations
     * </p>
     * 
     * @param listDestinationsRequest
     * @return Result of the ListDestinations operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    ListDestinationsResult listDestinations(ListDestinationsRequest listDestinationsRequest);

    /**
     * <p>
     * Grants permission to list sites
     * </p>
     * 
     * @param listSitesRequest
     * @return Result of the ListSites operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    ListSitesResult listSites(ListSitesRequest listSitesRequest);

    /**
     * <p>
     * Grants permission to list worker fleets
     * </p>
     * 
     * @param listWorkerFleetsRequest
     * @return Result of the ListWorkerFleets operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListWorkerFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkerFleets"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkerFleetsResult listWorkerFleets(ListWorkerFleetsRequest listWorkerFleetsRequest);

    /**
     * <p>
     * Grants permission to list workers
     * </p>
     * 
     * @param listWorkersRequest
     * @return Result of the ListWorkers operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkersResult listWorkers(ListWorkersRequest listWorkersRequest);

    /**
     * <p>
     * Grants permission to update a destination
     * </p>
     * 
     * @param updateDestinationRequest
     * @return Result of the UpdateDestination operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDestinationResult updateDestination(UpdateDestinationRequest updateDestinationRequest);

    /**
     * <p>
     * Grants permission to update a site
     * </p>
     * 
     * @param updateSiteRequest
     * @return Result of the UpdateSite operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSiteResult updateSite(UpdateSiteRequest updateSiteRequest);

    /**
     * <p>
     * Grants permission to update a worker
     * </p>
     * 
     * @param updateWorkerRequest
     * @return Result of the UpdateWorker operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorker" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateWorkerResult updateWorker(UpdateWorkerRequest updateWorkerRequest);

    /**
     * <p>
     * Grants permission to update a worker fleet
     * </p>
     * 
     * @param updateWorkerFleetRequest
     * @return Result of the UpdateWorkerFleet operation returned by the service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ValidationException
     *         Exception thrown if an invalid parameter is provided to an API.
     * @throws ResourceNotFoundException
     *         Exception thrown if a resource referenced in the request doesn't exist.
     * @throws ThrottlingException
     *         Exception thrown if the api has been called too quickly be the client.
     * @throws InternalServerException
     *         Exception thrown if something goes wrong within the service.
     * @sample AWSIoTRoboRunner.UpdateWorkerFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/UpdateWorkerFleet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkerFleetResult updateWorkerFleet(UpdateWorkerFleetRequest updateWorkerFleetRequest);

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
