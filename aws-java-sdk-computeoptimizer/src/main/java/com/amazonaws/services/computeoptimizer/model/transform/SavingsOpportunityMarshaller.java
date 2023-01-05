/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsOpportunityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsOpportunityMarshaller {

    private static final MarshallingInfo<Double> SAVINGSOPPORTUNITYPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsOpportunityPercentage").build();
    private static final MarshallingInfo<StructuredPojo> ESTIMATEDMONTHLYSAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedMonthlySavings").build();

    private static final SavingsOpportunityMarshaller instance = new SavingsOpportunityMarshaller();

    public static SavingsOpportunityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsOpportunity savingsOpportunity, ProtocolMarshaller protocolMarshaller) {

        if (savingsOpportunity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsOpportunity.getSavingsOpportunityPercentage(), SAVINGSOPPORTUNITYPERCENTAGE_BINDING);
            protocolMarshaller.marshall(savingsOpportunity.getEstimatedMonthlySavings(), ESTIMATEDMONTHLYSAVINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
