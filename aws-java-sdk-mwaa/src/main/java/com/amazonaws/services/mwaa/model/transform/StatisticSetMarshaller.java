/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mwaa.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StatisticSetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StatisticSetMarshaller {

    private static final MarshallingInfo<Double> MAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Maximum").build();
    private static final MarshallingInfo<Double> MINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Minimum").build();
    private static final MarshallingInfo<Integer> SAMPLECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleCount").build();
    private static final MarshallingInfo<Double> SUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sum").build();

    private static final StatisticSetMarshaller instance = new StatisticSetMarshaller();

    public static StatisticSetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StatisticSet statisticSet, ProtocolMarshaller protocolMarshaller) {

        if (statisticSet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(statisticSet.getMaximum(), MAXIMUM_BINDING);
            protocolMarshaller.marshall(statisticSet.getMinimum(), MINIMUM_BINDING);
            protocolMarshaller.marshall(statisticSet.getSampleCount(), SAMPLECOUNT_BINDING);
            protocolMarshaller.marshall(statisticSet.getSum(), SUM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
