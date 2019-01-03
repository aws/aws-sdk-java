/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservationPurchaseRecommendationDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservationPurchaseRecommendationDetailMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceDetails").build();
    private static final MarshallingInfo<String> RECOMMENDEDNUMBEROFINSTANCESTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendedNumberOfInstancesToPurchase").build();
    private static final MarshallingInfo<String> RECOMMENDEDNORMALIZEDUNITSTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendedNormalizedUnitsToPurchase").build();
    private static final MarshallingInfo<String> MINIMUMNUMBEROFINSTANCESUSEDPERHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumNumberOfInstancesUsedPerHour").build();
    private static final MarshallingInfo<String> MINIMUMNORMALIZEDUNITSUSEDPERHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumNormalizedUnitsUsedPerHour").build();
    private static final MarshallingInfo<String> MAXIMUMNUMBEROFINSTANCESUSEDPERHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumNumberOfInstancesUsedPerHour").build();
    private static final MarshallingInfo<String> MAXIMUMNORMALIZEDUNITSUSEDPERHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumNormalizedUnitsUsedPerHour").build();
    private static final MarshallingInfo<String> AVERAGENUMBEROFINSTANCESUSEDPERHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AverageNumberOfInstancesUsedPerHour").build();
    private static final MarshallingInfo<String> AVERAGENORMALIZEDUNITSUSEDPERHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AverageNormalizedUnitsUsedPerHour").build();
    private static final MarshallingInfo<String> AVERAGEUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AverageUtilization").build();
    private static final MarshallingInfo<String> ESTIMATEDBREAKEVENINMONTHS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedBreakEvenInMonths").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();
    private static final MarshallingInfo<String> ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlySavingsAmount").build();
    private static final MarshallingInfo<String> ESTIMATEDMONTHLYSAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlySavingsPercentage").build();
    private static final MarshallingInfo<String> ESTIMATEDMONTHLYONDEMANDCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlyOnDemandCost").build();
    private static final MarshallingInfo<String> ESTIMATEDRESERVATIONCOSTFORLOOKBACKPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedReservationCostForLookbackPeriod").build();
    private static final MarshallingInfo<String> UPFRONTCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpfrontCost").build();
    private static final MarshallingInfo<String> RECURRINGSTANDARDMONTHLYCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecurringStandardMonthlyCost").build();

    private static final ReservationPurchaseRecommendationDetailMarshaller instance = new ReservationPurchaseRecommendationDetailMarshaller();

    public static ReservationPurchaseRecommendationDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservationPurchaseRecommendationDetail reservationPurchaseRecommendationDetail, ProtocolMarshaller protocolMarshaller) {

        if (reservationPurchaseRecommendationDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getInstanceDetails(), INSTANCEDETAILS_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getRecommendedNumberOfInstancesToPurchase(),
                    RECOMMENDEDNUMBEROFINSTANCESTOPURCHASE_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getRecommendedNormalizedUnitsToPurchase(),
                    RECOMMENDEDNORMALIZEDUNITSTOPURCHASE_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getMinimumNumberOfInstancesUsedPerHour(),
                    MINIMUMNUMBEROFINSTANCESUSEDPERHOUR_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getMinimumNormalizedUnitsUsedPerHour(),
                    MINIMUMNORMALIZEDUNITSUSEDPERHOUR_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getMaximumNumberOfInstancesUsedPerHour(),
                    MAXIMUMNUMBEROFINSTANCESUSEDPERHOUR_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getMaximumNormalizedUnitsUsedPerHour(),
                    MAXIMUMNORMALIZEDUNITSUSEDPERHOUR_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getAverageNumberOfInstancesUsedPerHour(),
                    AVERAGENUMBEROFINSTANCESUSEDPERHOUR_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getAverageNormalizedUnitsUsedPerHour(),
                    AVERAGENORMALIZEDUNITSUSEDPERHOUR_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getAverageUtilization(), AVERAGEUTILIZATION_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getEstimatedBreakEvenInMonths(), ESTIMATEDBREAKEVENINMONTHS_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getEstimatedMonthlySavingsAmount(), ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getEstimatedMonthlySavingsPercentage(),
                    ESTIMATEDMONTHLYSAVINGSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getEstimatedMonthlyOnDemandCost(), ESTIMATEDMONTHLYONDEMANDCOST_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getEstimatedReservationCostForLookbackPeriod(),
                    ESTIMATEDRESERVATIONCOSTFORLOOKBACKPERIOD_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getUpfrontCost(), UPFRONTCOST_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationDetail.getRecurringStandardMonthlyCost(), RECURRINGSTANDARDMONTHLYCOST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
