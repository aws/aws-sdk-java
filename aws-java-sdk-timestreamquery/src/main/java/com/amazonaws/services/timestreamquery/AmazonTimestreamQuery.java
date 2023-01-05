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
 * <fullname>Amazon Timestream Query </fullname>
 * <p/>
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
     * Cancels a query that has been issued. Cancellation is provided only if the query has not completed running before
     * the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation
     * requests will return a <code>CancellationMessage</code>, indicating that the query has already been canceled. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.cancel-query.html">code
     * sample</a> for details.
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
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CancelQuery" target="_top">AWS
     *      API Documentation</a>
     */
    CancelQueryResult cancelQuery(CancelQueryRequest cancelQueryRequest);

    /**
     * <p>
     * Create a scheduled query that will be run on your behalf at the configured schedule. Timestream assumes the
     * execution role provided as part of the <code>ScheduledQueryExecutionRoleArn</code> parameter to run the query.
     * You can use the <code>NotificationConfiguration</code> parameter to configure notification for your scheduled
     * query operations.
     * </p>
     * 
     * @param createScheduledQueryRequest
     * @return Result of the CreateScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ConflictException
     *         Unable to poll results for a cancelled query.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.CreateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CreateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    CreateScheduledQueryResult createScheduledQuery(CreateScheduledQueryRequest createScheduledQueryRequest);

    /**
     * <p>
     * Deletes a given scheduled query. This is an irreversible operation.
     * </p>
     * 
     * @param deleteScheduledQueryRequest
     * @return Result of the DeleteScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.DeleteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DeleteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteScheduledQueryResult deleteScheduledQuery(DeleteScheduledQueryRequest deleteScheduledQueryRequest);

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
     * Provides detailed information about a scheduled query.
     * </p>
     * 
     * @param describeScheduledQueryRequest
     * @return Result of the DescribeScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.DescribeScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScheduledQueryResult describeScheduledQuery(DescribeScheduledQueryRequest describeScheduledQueryRequest);

    /**
     * <p>
     * You can use this API to run a scheduled query manually.
     * </p>
     * 
     * @param executeScheduledQueryRequest
     * @return Result of the ExecuteScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.ExecuteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ExecuteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    ExecuteScheduledQueryResult executeScheduledQuery(ExecuteScheduledQueryRequest executeScheduledQueryRequest);

    /**
     * <p>
     * Gets a list of all scheduled queries in the caller's Amazon account and Region. <code>ListScheduledQueries</code>
     * is eventually consistent.
     * </p>
     * 
     * @param listScheduledQueriesRequest
     * @return Result of the ListScheduledQueries operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.ListScheduledQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListScheduledQueries"
     *      target="_top">AWS API Documentation</a>
     */
    ListScheduledQueriesResult listScheduledQueries(ListScheduledQueriesRequest listScheduledQueriesRequest);

    /**
     * <p>
     * List all tags on a Timestream query resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * A synchronous operation that allows you to submit a query with parameters to be stored by Timestream for later
     * running. Timestream only supports using this operation with the <code>PrepareQueryRequest$ValidateOnly</code> set
     * to <code>true</code>.
     * </p>
     * 
     * @param prepareQueryRequest
     * @return Result of the PrepareQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.PrepareQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/PrepareQuery" target="_top">AWS
     *      API Documentation</a>
     */
    PrepareQueryResult prepareQuery(PrepareQueryRequest prepareQueryRequest);

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
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
     *      Documentation</a>
     */
    QueryResult query(QueryRequest queryRequest);

    /**
     * <p>
     * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a Timestream query resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update a scheduled query.
     * </p>
     * 
     * @param updateScheduledQueryRequest
     * @return Result of the UpdateScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.UpdateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateScheduledQueryResult updateScheduledQuery(UpdateScheduledQueryRequest updateScheduledQueryRequest);

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
