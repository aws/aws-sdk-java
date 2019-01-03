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
package com.amazonaws.services.cloudsearchdomain.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudsearchdomain.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FieldStatsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FieldStatsMarshaller {

    private static final MarshallingInfo<String> MIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("min").build();
    private static final MarshallingInfo<String> MAX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("max").build();
    private static final MarshallingInfo<Long> COUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("count").build();
    private static final MarshallingInfo<Long> MISSING_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("missing").build();
    private static final MarshallingInfo<Double> SUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sum").build();
    private static final MarshallingInfo<Double> SUMOFSQUARES_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sumOfSquares").build();
    private static final MarshallingInfo<String> MEAN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mean").build();
    private static final MarshallingInfo<Double> STDDEV_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stddev").build();

    private static final FieldStatsMarshaller instance = new FieldStatsMarshaller();

    public static FieldStatsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FieldStats fieldStats, ProtocolMarshaller protocolMarshaller) {

        if (fieldStats == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fieldStats.getMin(), MIN_BINDING);
            protocolMarshaller.marshall(fieldStats.getMax(), MAX_BINDING);
            protocolMarshaller.marshall(fieldStats.getCount(), COUNT_BINDING);
            protocolMarshaller.marshall(fieldStats.getMissing(), MISSING_BINDING);
            protocolMarshaller.marshall(fieldStats.getSum(), SUM_BINDING);
            protocolMarshaller.marshall(fieldStats.getSumOfSquares(), SUMOFSQUARES_BINDING);
            protocolMarshaller.marshall(fieldStats.getMean(), MEAN_BINDING);
            protocolMarshaller.marshall(fieldStats.getStddev(), STDDEV_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
