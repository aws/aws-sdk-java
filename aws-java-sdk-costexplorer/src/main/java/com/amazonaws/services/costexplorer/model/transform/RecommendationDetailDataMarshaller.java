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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationDetailDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationDetailDataMarshaller {

    private static final MarshallingInfo<String> ACCOUNTSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountScope").build();
    private static final MarshallingInfo<String> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookbackPeriodInDays").build();
    private static final MarshallingInfo<String> SAVINGSPLANSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsPlansType").build();
    private static final MarshallingInfo<String> TERMINYEARS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TermInYears").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaymentOption").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();
    private static final MarshallingInfo<String> INSTANCEFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceFamily").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<String> OFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferingId").build();
    private static final MarshallingInfo<String> GENERATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationTimestamp").build();
    private static final MarshallingInfo<String> LATESTUSAGETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestUsageTimestamp").build();
    private static final MarshallingInfo<String> CURRENTAVERAGEHOURLYONDEMANDSPEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentAverageHourlyOnDemandSpend").build();
    private static final MarshallingInfo<String> CURRENTMAXIMUMHOURLYONDEMANDSPEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentMaximumHourlyOnDemandSpend").build();
    private static final MarshallingInfo<String> CURRENTMINIMUMHOURLYONDEMANDSPEND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentMinimumHourlyOnDemandSpend").build();
    private static final MarshallingInfo<String> ESTIMATEDAVERAGEUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedAverageUtilization").build();
    private static final MarshallingInfo<String> ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedMonthlySavingsAmount").build();
    private static final MarshallingInfo<String> ESTIMATEDONDEMANDCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedOnDemandCost").build();
    private static final MarshallingInfo<String> ESTIMATEDONDEMANDCOSTWITHCURRENTCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedOnDemandCostWithCurrentCommitment").build();
    private static final MarshallingInfo<String> ESTIMATEDROI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedROI").build();
    private static final MarshallingInfo<String> ESTIMATEDSPCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSPCost").build();
    private static final MarshallingInfo<String> ESTIMATEDSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSavingsAmount").build();
    private static final MarshallingInfo<String> ESTIMATEDSAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedSavingsPercentage").build();
    private static final MarshallingInfo<String> EXISTINGHOURLYCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExistingHourlyCommitment").build();
    private static final MarshallingInfo<String> HOURLYCOMMITMENTTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HourlyCommitmentToPurchase").build();
    private static final MarshallingInfo<String> UPFRONTCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpfrontCost").build();
    private static final MarshallingInfo<String> CURRENTAVERAGECOVERAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentAverageCoverage").build();
    private static final MarshallingInfo<String> ESTIMATEDAVERAGECOVERAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedAverageCoverage").build();
    private static final MarshallingInfo<List> METRICSOVERLOOKBACKPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricsOverLookbackPeriod").build();

    private static final RecommendationDetailDataMarshaller instance = new RecommendationDetailDataMarshaller();

    public static RecommendationDetailDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationDetailData recommendationDetailData, ProtocolMarshaller protocolMarshaller) {

        if (recommendationDetailData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationDetailData.getAccountScope(), ACCOUNTSCOPE_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getSavingsPlansType(), SAVINGSPLANSTYPE_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getTermInYears(), TERMINYEARS_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getInstanceFamily(), INSTANCEFAMILY_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getOfferingId(), OFFERINGID_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getGenerationTimestamp(), GENERATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getLatestUsageTimestamp(), LATESTUSAGETIMESTAMP_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getCurrentAverageHourlyOnDemandSpend(), CURRENTAVERAGEHOURLYONDEMANDSPEND_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getCurrentMaximumHourlyOnDemandSpend(), CURRENTMAXIMUMHOURLYONDEMANDSPEND_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getCurrentMinimumHourlyOnDemandSpend(), CURRENTMINIMUMHOURLYONDEMANDSPEND_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedAverageUtilization(), ESTIMATEDAVERAGEUTILIZATION_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedMonthlySavingsAmount(), ESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedOnDemandCost(), ESTIMATEDONDEMANDCOST_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedOnDemandCostWithCurrentCommitment(),
                    ESTIMATEDONDEMANDCOSTWITHCURRENTCOMMITMENT_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedROI(), ESTIMATEDROI_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedSPCost(), ESTIMATEDSPCOST_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedSavingsAmount(), ESTIMATEDSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedSavingsPercentage(), ESTIMATEDSAVINGSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getExistingHourlyCommitment(), EXISTINGHOURLYCOMMITMENT_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getHourlyCommitmentToPurchase(), HOURLYCOMMITMENTTOPURCHASE_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getUpfrontCost(), UPFRONTCOST_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getCurrentAverageCoverage(), CURRENTAVERAGECOVERAGE_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getEstimatedAverageCoverage(), ESTIMATEDAVERAGECOVERAGE_BINDING);
            protocolMarshaller.marshall(recommendationDetailData.getMetricsOverLookbackPeriod(), METRICSOVERLOOKBACKPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
