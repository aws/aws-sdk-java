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
package com.amazonaws.services.trustedadvisor;

import javax.annotation.Generated;

import com.amazonaws.services.trustedadvisor.model.*;

/**
 * Interface for accessing TrustedAdvisor Public API asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.trustedadvisor.AbstractAWSTrustedAdvisorAsync} instead.
 * </p>
 * <p>
 * <p>
 * TrustedAdvisor Public API
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTrustedAdvisorAsync extends AWSTrustedAdvisor {

    /**
     * <p>
     * Update one or more exclusion status for a list of recommendation resources
     * </p>
     * 
     * @param batchUpdateRecommendationResourceExclusionRequest
     * @return A Java Future containing the result of the BatchUpdateRecommendationResourceExclusion operation returned
     *         by the service.
     * @sample AWSTrustedAdvisorAsync.BatchUpdateRecommendationResourceExclusion
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/BatchUpdateRecommendationResourceExclusion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateRecommendationResourceExclusionResult> batchUpdateRecommendationResourceExclusionAsync(
            BatchUpdateRecommendationResourceExclusionRequest batchUpdateRecommendationResourceExclusionRequest);

    /**
     * <p>
     * Update one or more exclusion status for a list of recommendation resources
     * </p>
     * 
     * @param batchUpdateRecommendationResourceExclusionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateRecommendationResourceExclusion operation returned
     *         by the service.
     * @sample AWSTrustedAdvisorAsyncHandler.BatchUpdateRecommendationResourceExclusion
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/BatchUpdateRecommendationResourceExclusion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateRecommendationResourceExclusionResult> batchUpdateRecommendationResourceExclusionAsync(
            BatchUpdateRecommendationResourceExclusionRequest batchUpdateRecommendationResourceExclusionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateRecommendationResourceExclusionRequest, BatchUpdateRecommendationResourceExclusionResult> asyncHandler);

    /**
     * <p>
     * Get a specific recommendation within an AWS Organizations organization. This API supports only prioritized
     * recommendations.
     * </p>
     * 
     * @param getOrganizationRecommendationRequest
     * @return A Java Future containing the result of the GetOrganizationRecommendation operation returned by the
     *         service.
     * @sample AWSTrustedAdvisorAsync.GetOrganizationRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetOrganizationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationRecommendationResult> getOrganizationRecommendationAsync(
            GetOrganizationRecommendationRequest getOrganizationRecommendationRequest);

    /**
     * <p>
     * Get a specific recommendation within an AWS Organizations organization. This API supports only prioritized
     * recommendations.
     * </p>
     * 
     * @param getOrganizationRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOrganizationRecommendation operation returned by the
     *         service.
     * @sample AWSTrustedAdvisorAsyncHandler.GetOrganizationRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetOrganizationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationRecommendationResult> getOrganizationRecommendationAsync(
            GetOrganizationRecommendationRequest getOrganizationRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<GetOrganizationRecommendationRequest, GetOrganizationRecommendationResult> asyncHandler);

    /**
     * <p>
     * Get a specific Recommendation
     * </p>
     * 
     * @param getRecommendationRequest
     * @return A Java Future containing the result of the GetRecommendation operation returned by the service.
     * @sample AWSTrustedAdvisorAsync.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(GetRecommendationRequest getRecommendationRequest);

    /**
     * <p>
     * Get a specific Recommendation
     * </p>
     * 
     * @param getRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendation operation returned by the service.
     * @sample AWSTrustedAdvisorAsyncHandler.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(GetRecommendationRequest getRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationRequest, GetRecommendationResult> asyncHandler);

    /**
     * <p>
     * List a filterable set of Checks
     * </p>
     * 
     * @param listChecksRequest
     * @return A Java Future containing the result of the ListChecks operation returned by the service.
     * @sample AWSTrustedAdvisorAsync.ListChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListChecks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChecksResult> listChecksAsync(ListChecksRequest listChecksRequest);

    /**
     * <p>
     * List a filterable set of Checks
     * </p>
     * 
     * @param listChecksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChecks operation returned by the service.
     * @sample AWSTrustedAdvisorAsyncHandler.ListChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListChecks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChecksResult> listChecksAsync(ListChecksRequest listChecksRequest,
            com.amazonaws.handlers.AsyncHandler<ListChecksRequest, ListChecksResult> asyncHandler);

    /**
     * <p>
     * Lists the accounts that own the resources for an organization aggregate recommendation. This API only supports
     * prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationAccountsRequest
     * @return A Java Future containing the result of the ListOrganizationRecommendationAccounts operation returned by
     *         the service.
     * @sample AWSTrustedAdvisorAsync.ListOrganizationRecommendationAccounts
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationRecommendationAccountsResult> listOrganizationRecommendationAccountsAsync(
            ListOrganizationRecommendationAccountsRequest listOrganizationRecommendationAccountsRequest);

    /**
     * <p>
     * Lists the accounts that own the resources for an organization aggregate recommendation. This API only supports
     * prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationRecommendationAccounts operation returned by
     *         the service.
     * @sample AWSTrustedAdvisorAsyncHandler.ListOrganizationRecommendationAccounts
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationRecommendationAccountsResult> listOrganizationRecommendationAccountsAsync(
            ListOrganizationRecommendationAccountsRequest listOrganizationRecommendationAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationRecommendationAccountsRequest, ListOrganizationRecommendationAccountsResult> asyncHandler);

    /**
     * <p>
     * List Resources of a Recommendation within an Organization. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationResourcesRequest
     * @return A Java Future containing the result of the ListOrganizationRecommendationResources operation returned by
     *         the service.
     * @sample AWSTrustedAdvisorAsync.ListOrganizationRecommendationResources
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationRecommendationResourcesResult> listOrganizationRecommendationResourcesAsync(
            ListOrganizationRecommendationResourcesRequest listOrganizationRecommendationResourcesRequest);

    /**
     * <p>
     * List Resources of a Recommendation within an Organization. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationRecommendationResources operation returned by
     *         the service.
     * @sample AWSTrustedAdvisorAsyncHandler.ListOrganizationRecommendationResources
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationRecommendationResourcesResult> listOrganizationRecommendationResourcesAsync(
            ListOrganizationRecommendationResourcesRequest listOrganizationRecommendationResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationRecommendationResourcesRequest, ListOrganizationRecommendationResourcesResult> asyncHandler);

    /**
     * <p>
     * List a filterable set of Recommendations within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationsRequest
     * @return A Java Future containing the result of the ListOrganizationRecommendations operation returned by the
     *         service.
     * @sample AWSTrustedAdvisorAsync.ListOrganizationRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationRecommendationsResult> listOrganizationRecommendationsAsync(
            ListOrganizationRecommendationsRequest listOrganizationRecommendationsRequest);

    /**
     * <p>
     * List a filterable set of Recommendations within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationRecommendations operation returned by the
     *         service.
     * @sample AWSTrustedAdvisorAsyncHandler.ListOrganizationRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationRecommendationsResult> listOrganizationRecommendationsAsync(
            ListOrganizationRecommendationsRequest listOrganizationRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationRecommendationsRequest, ListOrganizationRecommendationsResult> asyncHandler);

    /**
     * <p>
     * List Resources of a Recommendation
     * </p>
     * 
     * @param listRecommendationResourcesRequest
     * @return A Java Future containing the result of the ListRecommendationResources operation returned by the service.
     * @sample AWSTrustedAdvisorAsync.ListRecommendationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationResourcesResult> listRecommendationResourcesAsync(
            ListRecommendationResourcesRequest listRecommendationResourcesRequest);

    /**
     * <p>
     * List Resources of a Recommendation
     * </p>
     * 
     * @param listRecommendationResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendationResources operation returned by the service.
     * @sample AWSTrustedAdvisorAsyncHandler.ListRecommendationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationResourcesResult> listRecommendationResourcesAsync(
            ListRecommendationResourcesRequest listRecommendationResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationResourcesRequest, ListRecommendationResourcesResult> asyncHandler);

    /**
     * <p>
     * List a filterable set of Recommendations
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AWSTrustedAdvisorAsync.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * <p>
     * List a filterable set of Recommendations
     * </p>
     * 
     * @param listRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AWSTrustedAdvisorAsyncHandler.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Update the lifecycle of a Recommendation within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param updateOrganizationRecommendationLifecycleRequest
     * @return A Java Future containing the result of the UpdateOrganizationRecommendationLifecycle operation returned
     *         by the service.
     * @sample AWSTrustedAdvisorAsync.UpdateOrganizationRecommendationLifecycle
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateOrganizationRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationRecommendationLifecycleResult> updateOrganizationRecommendationLifecycleAsync(
            UpdateOrganizationRecommendationLifecycleRequest updateOrganizationRecommendationLifecycleRequest);

    /**
     * <p>
     * Update the lifecycle of a Recommendation within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param updateOrganizationRecommendationLifecycleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationRecommendationLifecycle operation returned
     *         by the service.
     * @sample AWSTrustedAdvisorAsyncHandler.UpdateOrganizationRecommendationLifecycle
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateOrganizationRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationRecommendationLifecycleResult> updateOrganizationRecommendationLifecycleAsync(
            UpdateOrganizationRecommendationLifecycleRequest updateOrganizationRecommendationLifecycleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationRecommendationLifecycleRequest, UpdateOrganizationRecommendationLifecycleResult> asyncHandler);

    /**
     * <p>
     * Update the lifecyle of a Recommendation. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param updateRecommendationLifecycleRequest
     * @return A Java Future containing the result of the UpdateRecommendationLifecycle operation returned by the
     *         service.
     * @sample AWSTrustedAdvisorAsync.UpdateRecommendationLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecommendationLifecycleResult> updateRecommendationLifecycleAsync(
            UpdateRecommendationLifecycleRequest updateRecommendationLifecycleRequest);

    /**
     * <p>
     * Update the lifecyle of a Recommendation. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param updateRecommendationLifecycleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecommendationLifecycle operation returned by the
     *         service.
     * @sample AWSTrustedAdvisorAsyncHandler.UpdateRecommendationLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecommendationLifecycleResult> updateRecommendationLifecycleAsync(
            UpdateRecommendationLifecycleRequest updateRecommendationLifecycleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecommendationLifecycleRequest, UpdateRecommendationLifecycleResult> asyncHandler);

}
