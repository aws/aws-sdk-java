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

import com.amazonaws.services.timestreamquery.model.*;

/**
 * Interface for accessing Timestream Query asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.timestreamquery.AbstractAmazonTimestreamQueryAsync} instead.
 * </p>
 * <p>
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTimestreamQueryAsync extends AmazonTimestreamQuery {

    /**
     * <p>
     * Cancels a query that has been issued. Cancellation is guaranteed only if the query has not completed execution
     * before the cancellation request was issued. Because cancellation is an idempotent operation, subsequent
     * cancellation requests will return a <code>CancellationMessage</code>, indicating that the query has already been
     * canceled.
     * </p>
     * 
     * @param cancelQueryRequest
     * @return A Java Future containing the result of the CancelQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CancelQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest cancelQueryRequest);

    /**
     * <p>
     * Cancels a query that has been issued. Cancellation is guaranteed only if the query has not completed execution
     * before the cancellation request was issued. Because cancellation is an idempotent operation, subsequent
     * cancellation requests will return a <code>CancellationMessage</code>, indicating that the query has already been
     * canceled.
     * </p>
     * 
     * @param cancelQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CancelQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest cancelQueryRequest,
            com.amazonaws.handlers.AsyncHandler<CancelQueryRequest, CancelQueryResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler);

    /**
     * <p>
     * Query is a synchronous operation that enables you to execute a query. Query will timeout after 60 seconds. You
     * must update the default timeout in the SDK to support a timeout of 60 seconds. The result set will be truncated
     * to 1MB. Service quotas apply. For more information, see Quotas in the Timestream Developer Guide.
     * </p>
     * 
     * @param queryRequest
     * @return A Java Future containing the result of the Query operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest queryRequest);

    /**
     * <p>
     * Query is a synchronous operation that enables you to execute a query. Query will timeout after 60 seconds. You
     * must update the default timeout in the SDK to support a timeout of 60 seconds. The result set will be truncated
     * to 1MB. Service quotas apply. For more information, see Quotas in the Timestream Developer Guide.
     * </p>
     * 
     * @param queryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Query operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest queryRequest, com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler);

}
