/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>Amazon Timestream Query </fullname>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTimestreamQueryAsync extends AmazonTimestreamQuery {

    /**
     * <p>
     * Cancels a query that has been issued. Cancellation is provided only if the query has not completed running before
     * the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation
     * requests will return a <code>CancellationMessage</code>, indicating that the query has already been canceled. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.cancel-query.html">code
     * sample</a> for details.
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
     * Cancels a query that has been issued. Cancellation is provided only if the query has not completed running before
     * the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation
     * requests will return a <code>CancellationMessage</code>, indicating that the query has already been canceled. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.cancel-query.html">code
     * sample</a> for details.
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
     * Create a scheduled query that will be run on your behalf at the configured schedule. Timestream assumes the
     * execution role provided as part of the <code>ScheduledQueryExecutionRoleArn</code> parameter to run the query.
     * You can use the <code>NotificationConfiguration</code> parameter to configure notification for your scheduled
     * query operations.
     * </p>
     * 
     * @param createScheduledQueryRequest
     * @return A Java Future containing the result of the CreateScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.CreateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CreateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduledQueryResult> createScheduledQueryAsync(CreateScheduledQueryRequest createScheduledQueryRequest);

    /**
     * <p>
     * Create a scheduled query that will be run on your behalf at the configured schedule. Timestream assumes the
     * execution role provided as part of the <code>ScheduledQueryExecutionRoleArn</code> parameter to run the query.
     * You can use the <code>NotificationConfiguration</code> parameter to configure notification for your scheduled
     * query operations.
     * </p>
     * 
     * @param createScheduledQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.CreateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CreateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduledQueryResult> createScheduledQueryAsync(CreateScheduledQueryRequest createScheduledQueryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScheduledQueryRequest, CreateScheduledQueryResult> asyncHandler);

    /**
     * <p>
     * Deletes a given scheduled query. This is an irreversible operation.
     * </p>
     * 
     * @param deleteScheduledQueryRequest
     * @return A Java Future containing the result of the DeleteScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.DeleteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DeleteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledQueryResult> deleteScheduledQueryAsync(DeleteScheduledQueryRequest deleteScheduledQueryRequest);

    /**
     * <p>
     * Deletes a given scheduled query. This is an irreversible operation.
     * </p>
     * 
     * @param deleteScheduledQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.DeleteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DeleteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledQueryResult> deleteScheduledQueryAsync(DeleteScheduledQueryRequest deleteScheduledQueryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledQueryRequest, DeleteScheduledQueryResult> asyncHandler);

    /**
     * <p>
     * Describes the settings for your account that include the query pricing model and the configured maximum TCUs the
     * service can use for your query workload.
     * </p>
     * <p>
     * You're charged only for the duration of compute units used for your workloads.
     * </p>
     * 
     * @param describeAccountSettingsRequest
     * @return A Java Future containing the result of the DescribeAccountSettings operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.DescribeAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(DescribeAccountSettingsRequest describeAccountSettingsRequest);

    /**
     * <p>
     * Describes the settings for your account that include the query pricing model and the configured maximum TCUs the
     * service can use for your query workload.
     * </p>
     * <p>
     * You're charged only for the duration of compute units used for your workloads.
     * </p>
     * 
     * @param describeAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountSettings operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.DescribeAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(DescribeAccountSettingsRequest describeAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountSettingsRequest, DescribeAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is
     * available through both Write and Query.
     * </p>
     * <p>
     * Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>it is not recommended that you use this API unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/VPCEndpoints">VPC endpoints
     * (Amazon Web Services PrivateLink) with Timestream </a>
     * </p>
     * </li>
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
     * For detailed information on how and when to use and implement DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using.API.html#Using-API.endpoint-discovery"
     * >The Endpoint Discovery Pattern</a>.
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
     * Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>it is not recommended that you use this API unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/VPCEndpoints">VPC endpoints
     * (Amazon Web Services PrivateLink) with Timestream </a>
     * </p>
     * </li>
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
     * For detailed information on how and when to use and implement DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using.API.html#Using-API.endpoint-discovery"
     * >The Endpoint Discovery Pattern</a>.
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
     * Provides detailed information about a scheduled query.
     * </p>
     * 
     * @param describeScheduledQueryRequest
     * @return A Java Future containing the result of the DescribeScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.DescribeScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledQueryResult> describeScheduledQueryAsync(DescribeScheduledQueryRequest describeScheduledQueryRequest);

    /**
     * <p>
     * Provides detailed information about a scheduled query.
     * </p>
     * 
     * @param describeScheduledQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.DescribeScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledQueryResult> describeScheduledQueryAsync(DescribeScheduledQueryRequest describeScheduledQueryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledQueryRequest, DescribeScheduledQueryResult> asyncHandler);

    /**
     * <p>
     * You can use this API to run a scheduled query manually.
     * </p>
     * 
     * @param executeScheduledQueryRequest
     * @return A Java Future containing the result of the ExecuteScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.ExecuteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ExecuteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteScheduledQueryResult> executeScheduledQueryAsync(ExecuteScheduledQueryRequest executeScheduledQueryRequest);

    /**
     * <p>
     * You can use this API to run a scheduled query manually.
     * </p>
     * 
     * @param executeScheduledQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.ExecuteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ExecuteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteScheduledQueryResult> executeScheduledQueryAsync(ExecuteScheduledQueryRequest executeScheduledQueryRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteScheduledQueryRequest, ExecuteScheduledQueryResult> asyncHandler);

    /**
     * <p>
     * Gets a list of all scheduled queries in the caller's Amazon account and Region. <code>ListScheduledQueries</code>
     * is eventually consistent.
     * </p>
     * 
     * @param listScheduledQueriesRequest
     * @return A Java Future containing the result of the ListScheduledQueries operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.ListScheduledQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListScheduledQueries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListScheduledQueriesResult> listScheduledQueriesAsync(ListScheduledQueriesRequest listScheduledQueriesRequest);

    /**
     * <p>
     * Gets a list of all scheduled queries in the caller's Amazon account and Region. <code>ListScheduledQueries</code>
     * is eventually consistent.
     * </p>
     * 
     * @param listScheduledQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListScheduledQueries operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.ListScheduledQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListScheduledQueries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListScheduledQueriesResult> listScheduledQueriesAsync(ListScheduledQueriesRequest listScheduledQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListScheduledQueriesRequest, ListScheduledQueriesResult> asyncHandler);

    /**
     * <p>
     * List all tags on a Timestream query resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List all tags on a Timestream query resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * A synchronous operation that allows you to submit a query with parameters to be stored by Timestream for later
     * running. Timestream only supports using this operation with <code>ValidateOnly</code> set to <code>true</code>.
     * </p>
     * 
     * @param prepareQueryRequest
     * @return A Java Future containing the result of the PrepareQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.PrepareQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/PrepareQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PrepareQueryResult> prepareQueryAsync(PrepareQueryRequest prepareQueryRequest);

    /**
     * <p>
     * A synchronous operation that allows you to submit a query with parameters to be stored by Timestream for later
     * running. Timestream only supports using this operation with <code>ValidateOnly</code> set to <code>true</code>.
     * </p>
     * 
     * @param prepareQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PrepareQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.PrepareQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/PrepareQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PrepareQueryResult> prepareQueryAsync(PrepareQueryRequest prepareQueryRequest,
            com.amazonaws.handlers.AsyncHandler<PrepareQueryRequest, PrepareQueryResult> asyncHandler);

    /**
     * <p>
     * <code>Query</code> is a synchronous operation that enables you to run a query against your Amazon Timestream
     * data. <code>Query</code> will time out after 60 seconds. You must update the default timeout in the SDK to
     * support a timeout of 60 seconds. See the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.run-query.html">code sample</a>
     * for details.
     * </p>
     * <p>
     * Your query request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you submit a <code>Query</code> request with the same client token outside of the 5-minute idempotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you submit a <code>Query</code> request with the same client token, but change other parameters, within the
     * 5-minute idempotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the size of the row (including the query metadata) exceeds 1 MB, then the query will fail with the following
     * error message:
     * </p>
     * <p>
     * <code>Query aborted as max page response size has been exceeded by the output result row</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and
     * the result reader do not have the same query string in the query requests, the query will fail with an
     * <code>Invalid pagination token</code> error.
     * </p>
     * </li>
     * </ul>
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
     * <code>Query</code> is a synchronous operation that enables you to run a query against your Amazon Timestream
     * data. <code>Query</code> will time out after 60 seconds. You must update the default timeout in the SDK to
     * support a timeout of 60 seconds. See the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.run-query.html">code sample</a>
     * for details.
     * </p>
     * <p>
     * Your query request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you submit a <code>Query</code> request with the same client token outside of the 5-minute idempotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you submit a <code>Query</code> request with the same client token, but change other parameters, within the
     * 5-minute idempotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the size of the row (including the query metadata) exceeds 1 MB, then the query will fail with the following
     * error message:
     * </p>
     * <p>
     * <code>Query aborted as max page response size has been exceeded by the output result row</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and
     * the result reader do not have the same query string in the query requests, the query will fail with an
     * <code>Invalid pagination token</code> error.
     * </p>
     * </li>
     * </ul>
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

    /**
     * <p>
     * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the association of tags from a Timestream query resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a Timestream query resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Transitions your account to use TCUs for query pricing and modifies the maximum query compute units that you've
     * configured. If you reduce the value of <code>MaxQueryTCU</code> to a desired configuration, the new value can
     * take up to 24 hours to be effective.
     * </p>
     * <note>
     * <p>
     * After you've transitioned your account to use TCUs for query pricing, you can't transition to using bytes scanned
     * for query pricing.
     * </p>
     * </note>
     * 
     * @param updateAccountSettingsRequest
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Transitions your account to use TCUs for query pricing and modifies the maximum query compute units that you've
     * configured. If you reduce the value of <code>MaxQueryTCU</code> to a desired configuration, the new value can
     * take up to 24 hours to be effective.
     * </p>
     * <note>
     * <p>
     * After you've transitioned your account to use TCUs for query pricing, you can't transition to using bytes scanned
     * for query pricing.
     * </p>
     * </note>
     * 
     * @param updateAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Update a scheduled query.
     * </p>
     * 
     * @param updateScheduledQueryRequest
     * @return A Java Future containing the result of the UpdateScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsync.UpdateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateScheduledQueryResult> updateScheduledQueryAsync(UpdateScheduledQueryRequest updateScheduledQueryRequest);

    /**
     * <p>
     * Update a scheduled query.
     * </p>
     * 
     * @param updateScheduledQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateScheduledQuery operation returned by the service.
     * @sample AmazonTimestreamQueryAsyncHandler.UpdateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateScheduledQueryResult> updateScheduledQueryAsync(UpdateScheduledQueryRequest updateScheduledQueryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateScheduledQueryRequest, UpdateScheduledQueryResult> asyncHandler);

}
