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
package com.amazonaws.services.support.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrustedAdvisorCostOptimizingSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrustedAdvisorCostOptimizingSummaryMarshaller {

    private static final MarshallingInfo<Double> ESTIMATEDMONTHLYSAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedMonthlySavings").build();
    private static final MarshallingInfo<Double> ESTIMATEDPERCENTMONTHLYSAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedPercentMonthlySavings").build();

    private static final TrustedAdvisorCostOptimizingSummaryMarshaller instance = new TrustedAdvisorCostOptimizingSummaryMarshaller();

    public static TrustedAdvisorCostOptimizingSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrustedAdvisorCostOptimizingSummary trustedAdvisorCostOptimizingSummary, ProtocolMarshaller protocolMarshaller) {

        if (trustedAdvisorCostOptimizingSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trustedAdvisorCostOptimizingSummary.getEstimatedMonthlySavings(), ESTIMATEDMONTHLYSAVINGS_BINDING);
            protocolMarshaller.marshall(trustedAdvisorCostOptimizingSummary.getEstimatedPercentMonthlySavings(), ESTIMATEDPERCENTMONTHLYSAVINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
