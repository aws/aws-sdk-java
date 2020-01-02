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

import com.amazonaws.services.personalizeruntime.model.*;

/**
 * Interface for accessing Amazon Personalize Runtime asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.personalizeruntime.AbstractAmazonPersonalizeRuntimeAsync} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPersonalizeRuntimeAsync extends AmazonPersonalizeRuntime {

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
     * @return A Java Future containing the result of the GetPersonalizedRanking operation returned by the service.
     * @sample AmazonPersonalizeRuntimeAsync.GetPersonalizedRanking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetPersonalizedRanking"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPersonalizedRankingResult> getPersonalizedRankingAsync(GetPersonalizedRankingRequest getPersonalizedRankingRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPersonalizedRanking operation returned by the service.
     * @sample AmazonPersonalizeRuntimeAsyncHandler.GetPersonalizedRanking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetPersonalizedRanking"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPersonalizedRankingResult> getPersonalizedRankingAsync(GetPersonalizedRankingRequest getPersonalizedRankingRequest,
            com.amazonaws.handlers.AsyncHandler<GetPersonalizedRankingRequest, GetPersonalizedRankingResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonPersonalizeRuntimeAsync.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendations operation returned by the service.
     * @sample AmazonPersonalizeRuntimeAsyncHandler.GetRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationsResult> getRecommendationsAsync(GetRecommendationsRequest getRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationsRequest, GetRecommendationsResult> asyncHandler);

}
