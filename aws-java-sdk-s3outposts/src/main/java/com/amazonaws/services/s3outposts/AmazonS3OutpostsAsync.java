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

import com.amazonaws.services.s3outposts.model.*;

/**
 * Interface for accessing Amazon S3 Outposts asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.s3outposts.AbstractAmazonS3OutpostsAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon S3 on Outposts provides access to S3 on Outposts operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonS3OutpostsAsync extends AmazonS3Outposts {

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
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AmazonS3OutpostsAsync.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AmazonS3OutpostsAsyncHandler.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonS3OutpostsAsync.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonS3OutpostsAsyncHandler.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListEndpoints operation returned by the service.
     * @sample AmazonS3OutpostsAsync.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpoints operation returned by the service.
     * @sample AmazonS3OutpostsAsyncHandler.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler);

}
