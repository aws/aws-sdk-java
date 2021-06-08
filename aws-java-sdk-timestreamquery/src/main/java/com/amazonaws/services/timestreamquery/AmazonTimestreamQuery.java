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
package com.amazonaws.services.timestreamquery;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.timestreamquery.model.*;

/**
 * Interface for accessing Timestream Query.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.timestreamquery.AbstractAmazonTimestreamQuery} instead.
 * </p>
 * <p>
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTimestreamQuery {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "query.timestream";

    /**
     * <p>
     * Cancels a query that has been issued. Cancellation is guaranteed only if the query has not completed execution
     * before the cancellation request was issued. Because cancellation is an idempotent operation, subsequent
     * cancellation requests will return a <code>CancellationMessage</code>, indicating that the query has already been
     * canceled.
     * </p>
     * 
     * @param cancelQueryRequest
     * @return Result of the CancelQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamQuery.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CancelQuery" target="_top">AWS
     *      API Documentation</a>
     */
    CancelQueryResult cancelQuery(CancelQueryRequest cancelQueryRequest);

    /**
     * <p>
     * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is
     * available through both Write and Query.
     * </p>
     * <p>
     * Because Timestream’s SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>it is not recommended that you use this API unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your application uses a programming language that does not yet have SDK support
     * </p>
     * </li>
     * <li>
     * <p>
     * You require better control over the client-side implementation
     * </p>
     * </li>
     * </ul>
     * <p>
     * For detailed information on how to use DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using-API.endpoint-discovery.html">The
     * Endpoint Discovery Pattern and REST APIs</a>.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonTimestreamQuery.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Query is a synchronous operation that enables you to execute a query. Query will timeout after 60 seconds. You
     * must update the default timeout in the SDK to support a timeout of 60 seconds. The result set will be truncated
     * to 1MB. Service quotas apply. For more information, see Quotas in the Timestream Developer Guide.
     * </p>
     * 
     * @param queryRequest
     * @return Result of the Query operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ConflictException
     *         Unable to poll results for a cancelled query.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws QueryExecutionException
     *         Timestream was unable to run the query successfully.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamQuery.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
     *      Documentation</a>
     */
    QueryResult query(QueryRequest queryRequest);

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
