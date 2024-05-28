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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.costoptimizationhub.model.*;

/**
 * Interface for accessing Cost Optimization Hub.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.costoptimizationhub.AbstractAWSCostOptimizationHub} instead.
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
public interface AWSCostOptimizationHub {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cost-optimization-hub";

    /**
     * <p>
     * Returns a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented—estimated savings after
     * discounts or estimated savings before discounts, for example.
     * </p>
     * 
     * @param getPreferencesRequest
     * @return Result of the GetPreferences operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.GetPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    GetPreferencesResult getPreferences(GetPreferencesRequest getPreferencesRequest);

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
     * @return Result of the GetRecommendation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationResult getRecommendation(GetRecommendationRequest getRecommendationRequest);

    /**
     * <p>
     * Retrieves the enrollment status for an account. It can also return the list of accounts that are enrolled under
     * the organization.
     * </p>
     * 
     * @param listEnrollmentStatusesRequest
     * @return Result of the ListEnrollmentStatuses operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.ListEnrollmentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListEnrollmentStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnrollmentStatusesResult listEnrollmentStatuses(ListEnrollmentStatusesRequest listEnrollmentStatusesRequest);

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
     * @return Result of the ListRecommendationSummaries operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.ListRecommendationSummaries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationSummariesResult listRecommendationSummaries(ListRecommendationSummariesRequest listRecommendationSummariesRequest);

    /**
     * <p>
     * Returns a list of recommendations.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsRequest listRecommendationsRequest);

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
     * @return Result of the UpdateEnrollmentStatus operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest);

    /**
     * <p>
     * Updates a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented.
     * </p>
     * 
     * @param updatePreferencesRequest
     * @return Result of the UpdatePreferences operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.UpdatePreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdatePreferences"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePreferencesResult updatePreferences(UpdatePreferencesRequest updatePreferencesRequest);

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
