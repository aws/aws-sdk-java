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
 * SavingsPlansAmortizedCommitmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansAmortizedCommitmentMarshaller {

    private static final MarshallingInfo<String> AMORTIZEDRECURRINGCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmortizedRecurringCommitment").build();
    private static final MarshallingInfo<String> AMORTIZEDUPFRONTCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmortizedUpfrontCommitment").build();
    private static final MarshallingInfo<String> TOTALAMORTIZEDCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalAmortizedCommitment").build();

    private static final SavingsPlansAmortizedCommitmentMarshaller instance = new SavingsPlansAmortizedCommitmentMarshaller();

    public static SavingsPlansAmortizedCommitmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansAmortizedCommitment savingsPlansAmortizedCommitment, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansAmortizedCommitment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansAmortizedCommitment.getAmortizedRecurringCommitment(), AMORTIZEDRECURRINGCOMMITMENT_BINDING);
            protocolMarshaller.marshall(savingsPlansAmortizedCommitment.getAmortizedUpfrontCommitment(), AMORTIZEDUPFRONTCOMMITMENT_BINDING);
            protocolMarshaller.marshall(savingsPlansAmortizedCommitment.getTotalAmortizedCommitment(), TOTALAMORTIZEDCOMMITMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
