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
 * ComputeSavingsPlansConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComputeSavingsPlansConfigurationMarshaller {

    private static final MarshallingInfo<String> ACCOUNTSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountScope").build();
    private static final MarshallingInfo<String> HOURLYCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hourlyCommitment").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("paymentOption").build();
    private static final MarshallingInfo<String> TERM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("term").build();

    private static final ComputeSavingsPlansConfigurationMarshaller instance = new ComputeSavingsPlansConfigurationMarshaller();

    public static ComputeSavingsPlansConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComputeSavingsPlansConfiguration computeSavingsPlansConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (computeSavingsPlansConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(computeSavingsPlansConfiguration.getAccountScope(), ACCOUNTSCOPE_BINDING);
            protocolMarshaller.marshall(computeSavingsPlansConfiguration.getHourlyCommitment(), HOURLYCOMMITMENT_BINDING);
            protocolMarshaller.marshall(computeSavingsPlansConfiguration.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(computeSavingsPlansConfiguration.getTerm(), TERM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
