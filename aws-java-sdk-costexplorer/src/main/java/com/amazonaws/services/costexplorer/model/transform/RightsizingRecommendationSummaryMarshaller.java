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
 * RightsizingRecommendationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RightsizingRecommendationSummaryMarshaller {

    private static final MarshallingInfo<String> TOTALRECOMMENDATIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalRecommendationCount").build();
    private static final MarshallingInfo<String> ESTIMATEDTOTALMONTHLYSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedTotalMonthlySavingsAmount").build();
    private static final MarshallingInfo<String> SAVINGSCURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsCurrencyCode").build();
    private static final MarshallingInfo<String> SAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsPercentage").build();

    private static final RightsizingRecommendationSummaryMarshaller instance = new RightsizingRecommendationSummaryMarshaller();

    public static RightsizingRecommendationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RightsizingRecommendationSummary rightsizingRecommendationSummary, ProtocolMarshaller protocolMarshaller) {

        if (rightsizingRecommendationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rightsizingRecommendationSummary.getTotalRecommendationCount(), TOTALRECOMMENDATIONCOUNT_BINDING);
            protocolMarshaller.marshall(rightsizingRecommendationSummary.getEstimatedTotalMonthlySavingsAmount(), ESTIMATEDTOTALMONTHLYSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(rightsizingRecommendationSummary.getSavingsCurrencyCode(), SAVINGSCURRENCYCODE_BINDING);
            protocolMarshaller.marshall(rightsizingRecommendationSummary.getSavingsPercentage(), SAVINGSPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
