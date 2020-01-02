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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsPlansPurchaseRecommendationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansPurchaseRecommendationSummaryMarshaller {

    private static final MarshallingInfo<String> ESTIMATEDROI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedROI").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();
    private static final MarshallingInfo<String> ESTIMATEDTOTALCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedTotalCost").build();
    private static final MarshallingInfo<String> CURRENTONDEMANDSPEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentOnDemandSpend").build();
    private static final MarshallingInfo<String> ESTIMATEDSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSavingsAmount").build();
    private static final MarshallingInfo<String> TOTALRECOMMENDATIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalRecommendationCount").build();
    private static final MarshallingInfo<String> DAILYCOMMITMENTTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DailyCommitmentToPurchase").build();
    private static final MarshallingInfo<String> HOURLYCOMMITMENTTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HourlyCommitmentToPurchase").build();
    private static final MarshallingInfo<String> ESTIMATEDSAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSavingsPercentage").build();
    private static final MarshallingInfo<String> ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlySavingsAmount").build();
    private static final MarshallingInfo<String> ESTIMATEDONDEMANDCOSTWITHCURRENTCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedOnDemandCostWithCurrentCommitment").build();

    private static final SavingsPlansPurchaseRecommendationSummaryMarshaller instance = new SavingsPlansPurchaseRecommendationSummaryMarshaller();

    public static SavingsPlansPurchaseRecommendationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansPurchaseRecommendationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getEstimatedROI(), ESTIMATEDROI_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getEstimatedTotalCost(), ESTIMATEDTOTALCOST_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getCurrentOnDemandSpend(), CURRENTONDEMANDSPEND_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getEstimatedSavingsAmount(), ESTIMATEDSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getTotalRecommendationCount(), TOTALRECOMMENDATIONCOUNT_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getDailyCommitmentToPurchase(), DAILYCOMMITMENTTOPURCHASE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getHourlyCommitmentToPurchase(), HOURLYCOMMITMENTTOPURCHASE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getEstimatedSavingsPercentage(), ESTIMATEDSAVINGSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getEstimatedMonthlySavingsAmount(), ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationSummary.getEstimatedOnDemandCostWithCurrentCommitment(),
                    ESTIMATEDONDEMANDCOSTWITHCURRENTCOMMITMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
