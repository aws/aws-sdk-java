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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.trustedadvisor.model.*;

/**
 * Interface for accessing TrustedAdvisor Public API.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.trustedadvisor.AbstractAWSTrustedAdvisor} instead.
 * </p>
 * <p>
 * <p>
 * TrustedAdvisor Public API
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTrustedAdvisor {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "trustedadvisor";

    /**
     * <p>
     * Update one or more exclusion status for a list of recommendation resources
     * </p>
     * 
     * @param batchUpdateRecommendationResourceExclusionRequest
     * @return Result of the BatchUpdateRecommendationResourceExclusion operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws ConflictException
     *         Exception that the request was denied due to conflictions in state
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.BatchUpdateRecommendationResourceExclusion
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/BatchUpdateRecommendationResourceExclusion"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateRecommendationResourceExclusionResult batchUpdateRecommendationResourceExclusion(
            BatchUpdateRecommendationResourceExclusionRequest batchUpdateRecommendationResourceExclusionRequest);

    /**
     * <p>
     * Get a specific recommendation within an AWS Organizations organization. This API supports only prioritized
     * recommendations.
     * </p>
     * 
     * @param getOrganizationRecommendationRequest
     * @return Result of the GetOrganizationRecommendation operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.GetOrganizationRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetOrganizationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    GetOrganizationRecommendationResult getOrganizationRecommendation(GetOrganizationRecommendationRequest getOrganizationRecommendationRequest);

    /**
     * <p>
     * Get a specific Recommendation
     * </p>
     * 
     * @param getRecommendationRequest
     * @return Result of the GetRecommendation operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationResult getRecommendation(GetRecommendationRequest getRecommendationRequest);

    /**
     * <p>
     * List a filterable set of Checks
     * </p>
     * 
     * @param listChecksRequest
     * @return Result of the ListChecks operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListChecks" target="_top">AWS API
     *      Documentation</a>
     */
    ListChecksResult listChecks(ListChecksRequest listChecksRequest);

    /**
     * <p>
     * Lists the accounts that own the resources for an organization aggregate recommendation. This API only supports
     * prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationAccountsRequest
     * @return Result of the ListOrganizationRecommendationAccounts operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListOrganizationRecommendationAccounts
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationRecommendationAccountsResult listOrganizationRecommendationAccounts(
            ListOrganizationRecommendationAccountsRequest listOrganizationRecommendationAccountsRequest);

    /**
     * <p>
     * List Resources of a Recommendation within an Organization. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationResourcesRequest
     * @return Result of the ListOrganizationRecommendationResources operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListOrganizationRecommendationResources
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationRecommendationResourcesResult listOrganizationRecommendationResources(
            ListOrganizationRecommendationResourcesRequest listOrganizationRecommendationResourcesRequest);

    /**
     * <p>
     * List a filterable set of Recommendations within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationsRequest
     * @return Result of the ListOrganizationRecommendations operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListOrganizationRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationRecommendationsResult listOrganizationRecommendations(ListOrganizationRecommendationsRequest listOrganizationRecommendationsRequest);

    /**
     * <p>
     * List Resources of a Recommendation
     * </p>
     * 
     * @param listRecommendationResourcesRequest
     * @return Result of the ListRecommendationResources operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListRecommendationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationResourcesResult listRecommendationResources(ListRecommendationResourcesRequest listRecommendationResourcesRequest);

    /**
     * <p>
     * List a filterable set of Recommendations
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * <p>
     * Update the lifecycle of a Recommendation within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param updateOrganizationRecommendationLifecycleRequest
     * @return Result of the UpdateOrganizationRecommendationLifecycle operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws ConflictException
     *         Exception that the request was denied due to conflictions in state
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.UpdateOrganizationRecommendationLifecycle
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateOrganizationRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationRecommendationLifecycleResult updateOrganizationRecommendationLifecycle(
            UpdateOrganizationRecommendationLifecycleRequest updateOrganizationRecommendationLifecycleRequest);

    /**
     * <p>
     * Update the lifecyle of a Recommendation. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param updateRecommendationLifecycleRequest
     * @return Result of the UpdateRecommendationLifecycle operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws ConflictException
     *         Exception that the request was denied due to conflictions in state
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.UpdateRecommendationLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRecommendationLifecycleResult updateRecommendationLifecycle(UpdateRecommendationLifecycleRequest updateRecommendationLifecycleRequest);

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
