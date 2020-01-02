/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalizeruntime;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.personalizeruntime.model.*;

/**
 * Interface for accessing Amazon Personalize Runtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.personalizeruntime.AbstractAmazonPersonalizeRuntime} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPersonalizeRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "personalize-runtime";

    /**
     * <p>
     * Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely
     * item to be of interest to the user.
     * </p>
     * <note>
     * <p>
     * The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING.
     * </p>
     * </note>
     * 
     * @param getPersonalizedRankingRequest
     * @return Result of the GetPersonalizedRanking operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonPersonalizeRuntime.GetPersonalizedRanking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetPersonalizedRanking"
     *      target="_top">AWS API Documentation</a>
     */
    GetPersonalizedRankingResult getPersonalizedRanking(GetPersonalizedRankingRequest getPersonalizedRankingRequest);

    /**
     * <p>
     * Returns a list of recommended items. The required input depends on the recipe type used to create the solution
     * backing the campaign, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RELATED_ITEMS - <code>itemId</code> required, <code>userId</code> not used
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION - <code>itemId</code> optional, <code>userId</code> required
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API.
     * </p>
     * </note>
     * 
     * @param getRecommendationsRequest
     * @return Result of the GetRecommendations operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonPersonalizeRuntime.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationsResult getRecommendations(GetRecommendationsRequest getRecommendationsRequest);

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
