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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kendraranking.model.*;

/**
 * Interface for accessing Kendra Ranking.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kendraranking.AbstractAmazonKendraRanking} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Kendra Intelligent Ranking uses Amazon Kendra semantic search capabilities to intelligently re-rank a search
 * service's results.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKendraRanking {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kendra-ranking";

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
     * @return Result of the CreateRescoreExecutionPlan operation returned by the service.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra Intelligent Ranking service. Please see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a> for more information, or
     *         contact <a href="http://aws.amazon.com/contact-us/">Support</a> to inquire about an increase of limits.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.CreateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/CreateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRescoreExecutionPlanResult createRescoreExecutionPlan(CreateRescoreExecutionPlanRequest createRescoreExecutionPlanRequest);

    /**
     * <p>
     * Deletes a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param deleteRescoreExecutionPlanRequest
     * @return Result of the DeleteRescoreExecutionPlan operation returned by the service.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.DeleteRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DeleteRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRescoreExecutionPlanResult deleteRescoreExecutionPlan(DeleteRescoreExecutionPlanRequest deleteRescoreExecutionPlanRequest);

    /**
     * <p>
     * Gets information about a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param describeRescoreExecutionPlanRequest
     * @return Result of the DescribeRescoreExecutionPlan operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.DescribeRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DescribeRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRescoreExecutionPlanResult describeRescoreExecutionPlan(DescribeRescoreExecutionPlanRequest describeRescoreExecutionPlanRequest);

    /**
     * <p>
     * Lists your rescore execution plans. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource
     * used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param listRescoreExecutionPlansRequest
     * @return Result of the ListRescoreExecutionPlans operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.ListRescoreExecutionPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListRescoreExecutionPlans"
     *      target="_top">AWS API Documentation</a>
     */
    ListRescoreExecutionPlansResult listRescoreExecutionPlans(ListRescoreExecutionPlansRequest listRescoreExecutionPlansRequest);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. A rescore execution plan is an example of a resource
     * that can have tags associated with it.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request information for listing tags associated with a rescore execution plan. A rescore execution
     *        plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use is unavailable. Please check you have provided the correct resource
     *         information and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Rescores or re-ranks search results from a search service such as OpenSearch (self managed). You use the semantic
     * search capabilities of Amazon Kendra Intelligent Ranking to improve the search service's results.
     * </p>
     * 
     * @param rescoreRequest
     * @return Result of the Rescore operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.Rescore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/Rescore" target="_top">AWS API
     *      Documentation</a>
     */
    RescoreResult rescore(RescoreRequest rescoreRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use is unavailable. Please check you have provided the correct resource
     *         information and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> operation.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request information to remove a tag from a rescore execution plan. A rescore execution plan is an
     *        Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use is unavailable. Please check you have provided the correct resource
     *         information and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API. You can update the number of capacity units you require for Amazon
     * Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     * </p>
     * 
     * @param updateRescoreExecutionPlanRequest
     * @return Result of the UpdateRescoreExecutionPlan operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra Intelligent Ranking service. Please see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a> for more information, or
     *         contact <a href="http://aws.amazon.com/contact-us/">Support</a> to inquire about an increase of limits.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.UpdateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UpdateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRescoreExecutionPlanResult updateRescoreExecutionPlan(UpdateRescoreExecutionPlanRequest updateRescoreExecutionPlanRequest);

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
