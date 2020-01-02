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
 * SavingsPlansUtilizationByTimeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansUtilizationByTimeMarshaller {

    private static final MarshallingInfo<StructuredPojo> TIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimePeriod").build();
    private static final MarshallingInfo<StructuredPojo> UTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Utilization").build();
    private static final MarshallingInfo<StructuredPojo> SAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Savings").build();
    private static final MarshallingInfo<StructuredPojo> AMORTIZEDCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmortizedCommitment").build();

    private static final SavingsPlansUtilizationByTimeMarshaller instance = new SavingsPlansUtilizationByTimeMarshaller();

    public static SavingsPlansUtilizationByTimeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansUtilizationByTime savingsPlansUtilizationByTime, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansUtilizationByTime == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansUtilizationByTime.getTimePeriod(), TIMEPERIOD_BINDING);
            protocolMarshaller.marshall(savingsPlansUtilizationByTime.getUtilization(), UTILIZATION_BINDING);
            protocolMarshaller.marshall(savingsPlansUtilizationByTime.getSavings(), SAVINGS_BINDING);
            protocolMarshaller.marshall(savingsPlansUtilizationByTime.getAmortizedCommitment(), AMORTIZEDCOMMITMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
