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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costoptimizationhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservedInstancesPricingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservedInstancesPricingMarshaller {

    private static final MarshallingInfo<Double> ESTIMATEDMONTHLYAMORTIZEDRESERVATIONCOST_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedMonthlyAmortizedReservationCost").build();
    private static final MarshallingInfo<Double> ESTIMATEDONDEMANDCOST_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedOnDemandCost").build();
    private static final MarshallingInfo<Double> MONTHLYRESERVATIONELIGIBLECOST_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("monthlyReservationEligibleCost").build();
    private static final MarshallingInfo<Double> SAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPercentage").build();

    private static final ReservedInstancesPricingMarshaller instance = new ReservedInstancesPricingMarshaller();

    public static ReservedInstancesPricingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservedInstancesPricing reservedInstancesPricing, ProtocolMarshaller protocolMarshaller) {

        if (reservedInstancesPricing == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservedInstancesPricing.getEstimatedMonthlyAmortizedReservationCost(),
                    ESTIMATEDMONTHLYAMORTIZEDRESERVATIONCOST_BINDING);
            protocolMarshaller.marshall(reservedInstancesPricing.getEstimatedOnDemandCost(), ESTIMATEDONDEMANDCOST_BINDING);
            protocolMarshaller.marshall(reservedInstancesPricing.getMonthlyReservationEligibleCost(), MONTHLYRESERVATIONELIGIBLECOST_BINDING);
            protocolMarshaller.marshall(reservedInstancesPricing.getSavingsPercentage(), SAVINGSPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
