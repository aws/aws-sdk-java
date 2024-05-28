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
package com.amazonaws.services.kendraranking;

import javax.annotation.Generated;

import com.amazonaws.services.kendraranking.model.*;

/**
 * Interface for accessing Kendra Ranking asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kendraranking.AbstractAmazonKendraRankingAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Kendra Intelligent Ranking uses Amazon Kendra semantic search capabilities to intelligently re-rank a search
 * service's results.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKendraRankingAsync extends AmazonKendraRanking {

    /**
     * <p>
     * Creates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API. You set the number of capacity units that you require for Amazon
     * Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     * </p>
     * <p>
     * For an example of using the <code>CreateRescoreExecutionPlan</code> API, including using the Python and Java
     * SDKs, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/search-service-rerank.html">Semantically ranking
     * a search service's results</a>.
     * </p>
     * 
     * @param createRescoreExecutionPlanRequest
     * @return A Java Future containing the result of the CreateRescoreExecutionPlan operation returned by the service.
     * @sample AmazonKendraRankingAsync.CreateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/CreateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRescoreExecutionPlanResult> createRescoreExecutionPlanAsync(
            CreateRescoreExecutionPlanRequest createRescoreExecutionPlanRequest);

    /**
     * <p>
     * Creates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API. You set the number of capacity units that you require for Amazon
     * Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     * </p>
     * <p>
     * For an example of using the <code>CreateRescoreExecutionPlan</code> API, including using the Python and Java
     * SDKs, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/search-service-rerank.html">Semantically ranking
     * a search service's results</a>.
     * </p>
     * 
     * @param createRescoreExecutionPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRescoreExecutionPlan operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.CreateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/CreateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRescoreExecutionPlanResult> createRescoreExecutionPlanAsync(
            CreateRescoreExecutionPlanRequest createRescoreExecutionPlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRescoreExecutionPlanRequest, CreateRescoreExecutionPlanResult> asyncHandler);

    /**
     * <p>
     * Deletes a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param deleteRescoreExecutionPlanRequest
     * @return A Java Future containing the result of the DeleteRescoreExecutionPlan operation returned by the service.
     * @sample AmazonKendraRankingAsync.DeleteRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DeleteRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRescoreExecutionPlanResult> deleteRescoreExecutionPlanAsync(
            DeleteRescoreExecutionPlanRequest deleteRescoreExecutionPlanRequest);

    /**
     * <p>
     * Deletes a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param deleteRescoreExecutionPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRescoreExecutionPlan operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.DeleteRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DeleteRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRescoreExecutionPlanResult> deleteRescoreExecutionPlanAsync(
            DeleteRescoreExecutionPlanRequest deleteRescoreExecutionPlanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRescoreExecutionPlanRequest, DeleteRescoreExecutionPlanResult> asyncHandler);

    /**
     * <p>
     * Gets information about a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param describeRescoreExecutionPlanRequest
     * @return A Java Future containing the result of the DescribeRescoreExecutionPlan operation returned by the
     *         service.
     * @sample AmazonKendraRankingAsync.DescribeRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DescribeRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRescoreExecutionPlanResult> describeRescoreExecutionPlanAsync(
            DescribeRescoreExecutionPlanRequest describeRescoreExecutionPlanRequest);

    /**
     * <p>
     * Gets information about a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param describeRescoreExecutionPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRescoreExecutionPlan operation returned by the
     *         service.
     * @sample AmazonKendraRankingAsyncHandler.DescribeRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DescribeRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRescoreExecutionPlanResult> describeRescoreExecutionPlanAsync(
            DescribeRescoreExecutionPlanRequest describeRescoreExecutionPlanRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRescoreExecutionPlanRequest, DescribeRescoreExecutionPlanResult> asyncHandler);

    /**
     * <p>
     * Lists your rescore execution plans. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource
     * used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param listRescoreExecutionPlansRequest
     * @return A Java Future containing the result of the ListRescoreExecutionPlans operation returned by the service.
     * @sample AmazonKendraRankingAsync.ListRescoreExecutionPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListRescoreExecutionPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRescoreExecutionPlansResult> listRescoreExecutionPlansAsync(
            ListRescoreExecutionPlansRequest listRescoreExecutionPlansRequest);

    /**
     * <p>
     * Lists your rescore execution plans. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource
     * used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param listRescoreExecutionPlansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRescoreExecutionPlans operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.ListRescoreExecutionPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListRescoreExecutionPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRescoreExecutionPlansResult> listRescoreExecutionPlansAsync(
            ListRescoreExecutionPlansRequest listRescoreExecutionPlansRequest,
            com.amazonaws.handlers.AsyncHandler<ListRescoreExecutionPlansRequest, ListRescoreExecutionPlansResult> asyncHandler);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. A rescore execution plan is an example of a resource
     * that can have tags associated with it.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request information for listing tags associated with a rescore execution plan. A rescore execution
     *        plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonKendraRankingAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. A rescore execution plan is an example of a resource
     * that can have tags associated with it.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request information for listing tags associated with a rescore execution plan. A rescore execution
     *        plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Rescores or re-ranks search results from a search service such as OpenSearch (self managed). You use the semantic
     * search capabilities of Amazon Kendra Intelligent Ranking to improve the search service's results.
     * </p>
     * 
     * @param rescoreRequest
     * @return A Java Future containing the result of the Rescore operation returned by the service.
     * @sample AmazonKendraRankingAsync.Rescore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/Rescore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RescoreResult> rescoreAsync(RescoreRequest rescoreRequest);

    /**
     * <p>
     * Rescores or re-ranks search results from a search service such as OpenSearch (self managed). You use the semantic
     * search capabilities of Amazon Kendra Intelligent Ranking to improve the search service's results.
     * </p>
     * 
     * @param rescoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Rescore operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.Rescore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/Rescore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RescoreResult> rescoreAsync(RescoreRequest rescoreRequest,
            com.amazonaws.handlers.AsyncHandler<RescoreRequest, RescoreResult> asyncHandler);

    /**
     * <p>
     * Adds a specified tag to a specified rescore execution plan. A rescore execution plan is an Amazon Kendra
     * Intelligent Ranking resource used for provisioning the <code>Rescore</code> API. If the tag already exists, the
     * existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request information for tagging a rescore execution plan. A rescore execution plan is an Amazon Kendra
     *        Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonKendraRankingAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a specified tag to a specified rescore execution plan. A rescore execution plan is an Amazon Kendra
     * Intelligent Ranking resource used for provisioning the <code>Rescore</code> API. If the tag already exists, the
     * existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request information for tagging a rescore execution plan. A rescore execution plan is an Amazon Kendra
     *        Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> operation.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request information to remove a tag from a rescore execution plan. A rescore execution plan is an
     *        Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonKendraRankingAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> operation.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request information to remove a tag from a rescore execution plan. A rescore execution plan is an
     *        Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API. You can update the number of capacity units you require for Amazon
     * Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     * </p>
     * 
     * @param updateRescoreExecutionPlanRequest
     * @return A Java Future containing the result of the UpdateRescoreExecutionPlan operation returned by the service.
     * @sample AmazonKendraRankingAsync.UpdateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UpdateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRescoreExecutionPlanResult> updateRescoreExecutionPlanAsync(
            UpdateRescoreExecutionPlanRequest updateRescoreExecutionPlanRequest);

    /**
     * <p>
     * Updates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API. You can update the number of capacity units you require for Amazon
     * Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     * </p>
     * 
     * @param updateRescoreExecutionPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRescoreExecutionPlan operation returned by the service.
     * @sample AmazonKendraRankingAsyncHandler.UpdateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UpdateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRescoreExecutionPlanResult> updateRescoreExecutionPlanAsync(
            UpdateRescoreExecutionPlanRequest updateRescoreExecutionPlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRescoreExecutionPlanRequest, UpdateRescoreExecutionPlanResult> asyncHandler);

}
