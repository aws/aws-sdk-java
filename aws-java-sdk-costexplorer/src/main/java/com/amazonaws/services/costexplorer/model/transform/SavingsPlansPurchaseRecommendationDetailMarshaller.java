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
 * SavingsPlansPurchaseRecommendationDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansPurchaseRecommendationDetailMarshaller {

    private static final MarshallingInfo<StructuredPojo> SAVINGSPLANSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsPlansDetails").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> UPFRONTCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpfrontCost").build();
    private static final MarshallingInfo<String> ESTIMATEDROI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedROI").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();
    private static final MarshallingInfo<String> ESTIMATEDSPCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSPCost").build();
    private static final MarshallingInfo<String> ESTIMATEDONDEMANDCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedOnDemandCost").build();
    private static final MarshallingInfo<String> ESTIMATEDONDEMANDCOSTWITHCURRENTCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedOnDemandCostWithCurrentCommitment").build();
    private static final MarshallingInfo<String> ESTIMATEDSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSavingsAmount").build();
    private static final MarshallingInfo<String> ESTIMATEDSAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSavingsPercentage").build();
    private static final MarshallingInfo<String> HOURLYCOMMITMENTTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HourlyCommitmentToPurchase").build();
    private static final MarshallingInfo<String> ESTIMATEDAVERAGEUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedAverageUtilization").build();
    private static final MarshallingInfo<String> ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlySavingsAmount").build();
    private static final MarshallingInfo<String> CURRENTMINIMUMHOURLYONDEMANDSPEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentMinimumHourlyOnDemandSpend").build();
    private static final MarshallingInfo<String> CURRENTMAXIMUMHOURLYONDEMANDSPEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentMaximumHourlyOnDemandSpend").build();
    private static final MarshallingInfo<String> CURRENTAVERAGEHOURLYONDEMANDSPEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentAverageHourlyOnDemandSpend").build();

    private static final SavingsPlansPurchaseRecommendationDetailMarshaller instance = new SavingsPlansPurchaseRecommendationDetailMarshaller();

    public static SavingsPlansPurchaseRecommendationDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansPurchaseRecommendationDetail savingsPlansPurchaseRecommendationDetail, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansPurchaseRecommendationDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getSavingsPlansDetails(), SAVINGSPLANSDETAILS_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getUpfrontCost(), UPFRONTCOST_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedROI(), ESTIMATEDROI_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedSPCost(), ESTIMATEDSPCOST_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedOnDemandCost(), ESTIMATEDONDEMANDCOST_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedOnDemandCostWithCurrentCommitment(),
                    ESTIMATEDONDEMANDCOSTWITHCURRENTCOMMITMENT_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedSavingsAmount(), ESTIMATEDSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedSavingsPercentage(), ESTIMATEDSAVINGSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getHourlyCommitmentToPurchase(), HOURLYCOMMITMENTTOPURCHASE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedAverageUtilization(), ESTIMATEDAVERAGEUTILIZATION_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getEstimatedMonthlySavingsAmount(), ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getCurrentMinimumHourlyOnDemandSpend(),
                    CURRENTMINIMUMHOURLYONDEMANDSPEND_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getCurrentMaximumHourlyOnDemandSpend(),
                    CURRENTMAXIMUMHOURLYONDEMANDSPEND_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendationDetail.getCurrentAverageHourlyOnDemandSpend(),
                    CURRENTAVERAGEHOURLYONDEMANDSPEND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
