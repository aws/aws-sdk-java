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
package com.amazonaws.services.s3outposts;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.s3outposts.model.*;

/**
 * Interface for accessing Amazon S3 Outposts.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.s3outposts.AbstractAmazonS3Outposts} instead.
 * </p>
 * <p>
 * <p>
 * Amazon S3 on Outposts provides access to S3 on Outposts operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonS3Outposts {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "s3-outposts";

    /**
     * <p>
     * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts.
     * S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual
     * private cloud (VPC).
     * </p>
     * <p>
     * This action creates an endpoint and associates it with the specified Outpost.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_s3outposts_DeleteEndpoint.html">DeleteEndpoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_s3outposts_ListEndpoints.html">ListEndpoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEndpointRequest
     * @return Result of the CreateEndpoint operation returned by the service.
     * @throws InternalServerException
     *         There was an exception with the internal server.
     * @throws ValidationException
     *         There was an exception validating this data.
     * @throws AccessDeniedException
     *         Access was denied for this action.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AmazonS3Outposts.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest);

    /**
     * <p>
     * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts.
     * S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual
     * private cloud (VPC).
     * </p>
     * <p>
     * This action deletes an endpoint.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_s3outposts_CreateEndpoint.html">CreateEndpoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_s3outposts_ListEndpoints.html">ListEndpoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteEndpointRequest
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @throws InternalServerException
     *         There was an exception with the internal server.
     * @throws AccessDeniedException
     *         Access was denied for this action.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ValidationException
     *         There was an exception validating this data.
     * @sample AmazonS3Outposts.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts.
     * S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual
     * private cloud (VPC).
     * </p>
     * <p>
     * This action lists endpoints associated with the Outpost.
     * </p>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_s3outposts_CreateEndpoint.html">CreateEndpoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_s3outposts_DeleteEndpoint.html">DeleteEndpoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listEndpointsRequest
     * @return Result of the ListEndpoints operation returned by the service.
     * @throws InternalServerException
     *         There was an exception with the internal server.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         Access was denied for this action.
     * @throws ValidationException
     *         There was an exception validating this data.
     * @sample AmazonS3Outposts.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    ListEndpointsResult listEndpoints(ListEndpointsRequest listEndpointsRequest);

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
