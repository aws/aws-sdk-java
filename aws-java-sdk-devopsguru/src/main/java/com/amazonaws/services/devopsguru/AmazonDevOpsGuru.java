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
package com.amazonaws.services.devopsguru;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.devopsguru.model.*;

/**
 * Interface for accessing Amazon DevOps Guru.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.devopsguru.AbstractAmazonDevOpsGuru} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDevOpsGuru {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "devops-guru";

    /**
     * @param addNotificationChannelRequest
     * @return Result of the AddNotificationChannel operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @sample AmazonDevOpsGuru.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    AddNotificationChannelResult addNotificationChannel(AddNotificationChannelRequest addNotificationChannelRequest);

    /**
     * @param describeAccountHealthRequest
     * @return Result of the DescribeAccountHealth operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountHealthResult describeAccountHealth(DescribeAccountHealthRequest describeAccountHealthRequest);

    /**
     * @param describeAccountOverviewRequest
     * @return Result of the DescribeAccountOverview operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountOverviewResult describeAccountOverview(DescribeAccountOverviewRequest describeAccountOverviewRequest);

    /**
     * @param describeAnomalyRequest
     * @return Result of the DescribeAnomaly operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAnomalyResult describeAnomaly(DescribeAnomalyRequest describeAnomalyRequest);

    /**
     * @param describeInsightRequest
     * @return Result of the DescribeInsight operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInsightResult describeInsight(DescribeInsightRequest describeInsightRequest);

    /**
     * @param describeResourceCollectionHealthRequest
     * @return Result of the DescribeResourceCollectionHealth operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResourceCollectionHealthResult describeResourceCollectionHealth(DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest);

    /**
     * @param describeServiceIntegrationRequest
     * @return Result of the DescribeServiceIntegration operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeServiceIntegrationResult describeServiceIntegration(DescribeServiceIntegrationRequest describeServiceIntegrationRequest);

    /**
     * @param getResourceCollectionRequest
     * @return Result of the GetResourceCollection operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceCollectionResult getResourceCollection(GetResourceCollectionRequest getResourceCollectionRequest);

    /**
     * @param listAnomaliesForInsightRequest
     * @return Result of the ListAnomaliesForInsight operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnomaliesForInsightResult listAnomaliesForInsight(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest);

    /**
     * @param listEventsRequest
     * @return Result of the ListEvents operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    ListEventsResult listEvents(ListEventsRequest listEventsRequest);

    /**
     * @param listInsightsRequest
     * @return Result of the ListInsights operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    ListInsightsResult listInsights(ListInsightsRequest listInsightsRequest);

    /**
     * @param listNotificationChannelsRequest
     * @return Result of the ListNotificationChannels operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    ListNotificationChannelsResult listNotificationChannels(ListNotificationChannelsRequest listNotificationChannelsRequest);

    /**
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @sample AmazonDevOpsGuru.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    PutFeedbackResult putFeedback(PutFeedbackRequest putFeedbackRequest);

    /**
     * @param removeNotificationChannelRequest
     * @return Result of the RemoveNotificationChannel operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @sample AmazonDevOpsGuru.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveNotificationChannelResult removeNotificationChannel(RemoveNotificationChannelRequest removeNotificationChannelRequest);

    /**
     * @param searchInsightsRequest
     * @return Result of the SearchInsights operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    SearchInsightsResult searchInsights(SearchInsightsRequest searchInsightsRequest);

    /**
     * @param updateResourceCollectionRequest
     * @return Result of the UpdateResourceCollection operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceCollectionResult updateResourceCollection(UpdateResourceCollectionRequest updateResourceCollectionRequest);

    /**
     * @param updateServiceIntegrationRequest
     * @return Result of the UpdateServiceIntegration operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServiceIntegrationResult updateServiceIntegration(UpdateServiceIntegrationRequest updateServiceIntegrationRequest);

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
