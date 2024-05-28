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
package com.amazonaws.services.costoptimizationhub;

import javax.annotation.Generated;

import com.amazonaws.services.costoptimizationhub.model.*;

/**
 * Interface for accessing Cost Optimization Hub asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.costoptimizationhub.AbstractAWSCostOptimizationHubAsync} instead.
 * </p>
 * <p>
 * <p>
 * You can use the Cost Optimization Hub API to programmatically identify, filter, aggregate, and quantify savings for
 * your cost optimization recommendations across multiple Amazon Web Services Regions and Amazon Web Services accounts
 * in your organization.
 * </p>
 * <p>
 * The Cost Optimization Hub API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://cost-optimization-hub.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCostOptimizationHubAsync extends AWSCostOptimizationHub {

    /**
     * <p>
     * Returns a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented—estimated savings after
     * discounts or estimated savings before discounts, for example.
     * </p>
     * 
     * @param getPreferencesRequest
     * @return A Java Future containing the result of the GetPreferences operation returned by the service.
     * @sample AWSCostOptimizationHubAsync.GetPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPreferencesResult> getPreferencesAsync(GetPreferencesRequest getPreferencesRequest);

    /**
     * <p>
     * Returns a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented—estimated savings after
     * discounts or estimated savings before discounts, for example.
     * </p>
     * 
     * @param getPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPreferences operation returned by the service.
     * @sample AWSCostOptimizationHubAsyncHandler.GetPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPreferencesResult> getPreferencesAsync(GetPreferencesRequest getPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetPreferencesRequest, GetPreferencesResult> asyncHandler);

    /**
     * <p>
     * Returns both the current and recommended resource configuration and the estimated cost impact for a
     * recommendation.
     * </p>
     * <p>
     * The <code>recommendationId</code> is only valid for up to a maximum of 24 hours as recommendations are refreshed
     * daily. To retrieve the <code>recommendationId</code>, use the <code>ListRecommendations</code> API.
     * </p>
     * 
     * @param getRecommendationRequest
     * @return A Java Future containing the result of the GetRecommendation operation returned by the service.
     * @sample AWSCostOptimizationHubAsync.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(GetRecommendationRequest getRecommendationRequest);

    /**
     * <p>
     * Returns both the current and recommended resource configuration and the estimated cost impact for a
     * recommendation.
     * </p>
     * <p>
     * The <code>recommendationId</code> is only valid for up to a maximum of 24 hours as recommendations are refreshed
     * daily. To retrieve the <code>recommendationId</code>, use the <code>ListRecommendations</code> API.
     * </p>
     * 
     * @param getRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendation operation returned by the service.
     * @sample AWSCostOptimizationHubAsyncHandler.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationResult> getRecommendationAsync(GetRecommendationRequest getRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationRequest, GetRecommendationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the enrollment status for an account. It can also return the list of accounts that are enrolled under
     * the organization.
     * </p>
     * 
     * @param listEnrollmentStatusesRequest
     * @return A Java Future containing the result of the ListEnrollmentStatuses operation returned by the service.
     * @sample AWSCostOptimizationHubAsync.ListEnrollmentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListEnrollmentStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnrollmentStatusesResult> listEnrollmentStatusesAsync(ListEnrollmentStatusesRequest listEnrollmentStatusesRequest);

    /**
     * <p>
     * Retrieves the enrollment status for an account. It can also return the list of accounts that are enrolled under
     * the organization.
     * </p>
     * 
     * @param listEnrollmentStatusesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnrollmentStatuses operation returned by the service.
     * @sample AWSCostOptimizationHubAsyncHandler.ListEnrollmentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListEnrollmentStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnrollmentStatusesResult> listEnrollmentStatusesAsync(ListEnrollmentStatusesRequest listEnrollmentStatusesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnrollmentStatusesRequest, ListEnrollmentStatusesResult> asyncHandler);

    /**
     * <p>
     * Returns a concise representation of savings estimates for resources. Also returns de-duped savings across
     * different types of recommendations.
     * </p>
     * <note>
     * <p>
     * The following filters are not supported for this API: <code>recommendationIds</code>, <code>resourceArns</code>,
     * and <code>resourceIds</code>.
     * </p>
     * </note>
     * 
     * @param listRecommendationSummariesRequest
     * @return A Java Future containing the result of the ListRecommendationSummaries operation returned by the service.
     * @sample AWSCostOptimizationHubAsync.ListRecommendationSummaries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationSummariesResult> listRecommendationSummariesAsync(
            ListRecommendationSummariesRequest listRecommendationSummariesRequest);

    /**
     * <p>
     * Returns a concise representation of savings estimates for resources. Also returns de-duped savings across
     * different types of recommendations.
     * </p>
     * <note>
     * <p>
     * The following filters are not supported for this API: <code>recommendationIds</code>, <code>resourceArns</code>,
     * and <code>resourceIds</code>.
     * </p>
     * </note>
     * 
     * @param listRecommendationSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendationSummaries operation returned by the service.
     * @sample AWSCostOptimizationHubAsyncHandler.ListRecommendationSummaries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationSummariesResult> listRecommendationSummariesAsync(
            ListRecommendationSummariesRequest listRecommendationSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationSummariesRequest, ListRecommendationSummariesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of recommendations.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AWSCostOptimizationHubAsync.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * <p>
     * Returns a list of recommendations.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AWSCostOptimizationHubAsyncHandler.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Updates the enrollment (opt in and opt out) status of an account to the Cost Optimization Hub service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * of the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Cost Optimization Hub and to view its recommendations.
     * When you opt in, Cost Optimization Hub automatically creates a service-linked role in your account to access its
     * data.
     * </p>
     * 
     * @param updateEnrollmentStatusRequest
     * @return A Java Future containing the result of the UpdateEnrollmentStatus operation returned by the service.
     * @sample AWSCostOptimizationHubAsync.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest);

    /**
     * <p>
     * Updates the enrollment (opt in and opt out) status of an account to the Cost Optimization Hub service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * of the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Cost Optimization Hub and to view its recommendations.
     * When you opt in, Cost Optimization Hub automatically creates a service-linked role in your account to access its
     * data.
     * </p>
     * 
     * @param updateEnrollmentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnrollmentStatus operation returned by the service.
     * @sample AWSCostOptimizationHubAsyncHandler.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnrollmentStatusRequest, UpdateEnrollmentStatusResult> asyncHandler);

    /**
     * <p>
     * Updates a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented.
     * </p>
     * 
     * @param updatePreferencesRequest
     * @return A Java Future containing the result of the UpdatePreferences operation returned by the service.
     * @sample AWSCostOptimizationHubAsync.UpdatePreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdatePreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePreferencesResult> updatePreferencesAsync(UpdatePreferencesRequest updatePreferencesRequest);

    /**
     * <p>
     * Updates a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented.
     * </p>
     * 
     * @param updatePreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePreferences operation returned by the service.
     * @sample AWSCostOptimizationHubAsyncHandler.UpdatePreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdatePreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePreferencesResult> updatePreferencesAsync(UpdatePreferencesRequest updatePreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePreferencesRequest, UpdatePreferencesResult> asyncHandler);

}
