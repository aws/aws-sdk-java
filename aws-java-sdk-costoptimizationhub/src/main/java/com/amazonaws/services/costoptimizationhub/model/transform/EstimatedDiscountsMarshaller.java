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
 * EstimatedDiscountsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EstimatedDiscountsMarshaller {

    private static final MarshallingInfo<Double> OTHERDISCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("otherDiscount").build();
    private static final MarshallingInfo<Double> RESERVEDINSTANCESDISCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reservedInstancesDiscount").build();
    private static final MarshallingInfo<Double> SAVINGSPLANSDISCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlansDiscount").build();

    private static final EstimatedDiscountsMarshaller instance = new EstimatedDiscountsMarshaller();

    public static EstimatedDiscountsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EstimatedDiscounts estimatedDiscounts, ProtocolMarshaller protocolMarshaller) {

        if (estimatedDiscounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(estimatedDiscounts.getOtherDiscount(), OTHERDISCOUNT_BINDING);
            protocolMarshaller.marshall(estimatedDiscounts.getReservedInstancesDiscount(), RESERVEDINSTANCESDISCOUNT_BINDING);
            protocolMarshaller.marshall(estimatedDiscounts.getSavingsPlansDiscount(), SAVINGSPLANSDISCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
