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
package com.amazonaws.services.costoptimizationhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costoptimizationhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> ACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionType").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currencyCode").build();
    private static final MarshallingInfo<String> CURRENTRESOURCESUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentResourceSummary").build();
    private static final MarshallingInfo<String> CURRENTRESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentResourceType").build();
    private static final MarshallingInfo<Double> ESTIMATEDMONTHLYCOST_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedMonthlyCost").build();
    private static final MarshallingInfo<Double> ESTIMATEDMONTHLYSAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedMonthlySavings").build();
    private static final MarshallingInfo<Double> ESTIMATEDSAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedSavingsPercentage").build();
    private static final MarshallingInfo<String> IMPLEMENTATIONEFFORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("implementationEffort").build();
    private static final MarshallingInfo<java.util.Date> LASTREFRESHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRefreshTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RECOMMENDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationId").build();
    private static final MarshallingInfo<Integer> RECOMMENDATIONLOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationLookbackPeriodInDays").build();
    private static final MarshallingInfo<String> RECOMMENDEDRESOURCESUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedResourceSummary").build();
    private static final MarshallingInfo<String> RECOMMENDEDRESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedResourceType").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceId").build();
    private static final MarshallingInfo<Boolean> RESTARTNEEDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("restartNeeded").build();
    private static final MarshallingInfo<Boolean> ROLLBACKPOSSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rollbackPossible").build();
    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("source").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final RecommendationMarshaller instance = new RecommendationMarshaller();

    public static RecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Recommendation recommendation, ProtocolMarshaller protocolMarshaller) {

        if (recommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(recommendation.getActionType(), ACTIONTYPE_BINDING);
            protocolMarshaller.marshall(recommendation.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(recommendation.getCurrentResourceSummary(), CURRENTRESOURCESUMMARY_BINDING);
            protocolMarshaller.marshall(recommendation.getCurrentResourceType(), CURRENTRESOURCETYPE_BINDING);
            protocolMarshaller.marshall(recommendation.getEstimatedMonthlyCost(), ESTIMATEDMONTHLYCOST_BINDING);
            protocolMarshaller.marshall(recommendation.getEstimatedMonthlySavings(), ESTIMATEDMONTHLYSAVINGS_BINDING);
            protocolMarshaller.marshall(recommendation.getEstimatedSavingsPercentage(), ESTIMATEDSAVINGSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(recommendation.getImplementationEffort(), IMPLEMENTATIONEFFORT_BINDING);
            protocolMarshaller.marshall(recommendation.getLastRefreshTimestamp(), LASTREFRESHTIMESTAMP_BINDING);
            protocolMarshaller.marshall(recommendation.getRecommendationId(), RECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(recommendation.getRecommendationLookbackPeriodInDays(), RECOMMENDATIONLOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(recommendation.getRecommendedResourceSummary(), RECOMMENDEDRESOURCESUMMARY_BINDING);
            protocolMarshaller.marshall(recommendation.getRecommendedResourceType(), RECOMMENDEDRESOURCETYPE_BINDING);
            protocolMarshaller.marshall(recommendation.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(recommendation.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(recommendation.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(recommendation.getRestartNeeded(), RESTARTNEEDED_BINDING);
            protocolMarshaller.marshall(recommendation.getRollbackPossible(), ROLLBACKPOSSIBLE_BINDING);
            protocolMarshaller.marshall(recommendation.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(recommendation.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
