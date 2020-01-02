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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StatisticsMarshaller {

    private static final MarshallingInfo<Integer> COUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("count").build();
    private static final MarshallingInfo<Double> AVERAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("average").build();
    private static final MarshallingInfo<Double> SUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sum").build();
    private static final MarshallingInfo<Double> MINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("minimum").build();
    private static final MarshallingInfo<Double> MAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maximum").build();
    private static final MarshallingInfo<Double> SUMOFSQUARES_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sumOfSquares").build();
    private static final MarshallingInfo<Double> VARIANCE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("variance").build();
    private static final MarshallingInfo<Double> STDDEVIATION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stdDeviation").build();

    private static final StatisticsMarshaller instance = new StatisticsMarshaller();

    public static StatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Statistics statistics, ProtocolMarshaller protocolMarshaller) {

        if (statistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(statistics.getCount(), COUNT_BINDING);
            protocolMarshaller.marshall(statistics.getAverage(), AVERAGE_BINDING);
            protocolMarshaller.marshall(statistics.getSum(), SUM_BINDING);
            protocolMarshaller.marshall(statistics.getMinimum(), MINIMUM_BINDING);
            protocolMarshaller.marshall(statistics.getMaximum(), MAXIMUM_BINDING);
            protocolMarshaller.marshall(statistics.getSumOfSquares(), SUMOFSQUARES_BINDING);
            protocolMarshaller.marshall(statistics.getVariance(), VARIANCE_BINDING);
            protocolMarshaller.marshall(statistics.getStdDeviation(), STDDEVIATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
