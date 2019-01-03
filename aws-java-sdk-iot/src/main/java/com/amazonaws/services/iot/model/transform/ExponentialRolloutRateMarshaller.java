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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExponentialRolloutRateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExponentialRolloutRateMarshaller {

    private static final MarshallingInfo<Integer> BASERATEPERMINUTE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("baseRatePerMinute").build();
    private static final MarshallingInfo<Double> INCREMENTFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incrementFactor").build();
    private static final MarshallingInfo<StructuredPojo> RATEINCREASECRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rateIncreaseCriteria").build();

    private static final ExponentialRolloutRateMarshaller instance = new ExponentialRolloutRateMarshaller();

    public static ExponentialRolloutRateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExponentialRolloutRate exponentialRolloutRate, ProtocolMarshaller protocolMarshaller) {

        if (exponentialRolloutRate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exponentialRolloutRate.getBaseRatePerMinute(), BASERATEPERMINUTE_BINDING);
            protocolMarshaller.marshall(exponentialRolloutRate.getIncrementFactor(), INCREMENTFACTOR_BINDING);
            protocolMarshaller.marshall(exponentialRolloutRate.getRateIncreaseCriteria(), RATEINCREASECRITERIA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
