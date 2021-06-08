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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StringColumnStatisticsDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StringColumnStatisticsDataMarshaller {

    private static final MarshallingInfo<Long> MAXIMUMLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaximumLength").build();
    private static final MarshallingInfo<Double> AVERAGELENGTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AverageLength").build();
    private static final MarshallingInfo<Long> NUMBEROFNULLS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NumberOfNulls").build();
    private static final MarshallingInfo<Long> NUMBEROFDISTINCTVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDistinctValues").build();

    private static final StringColumnStatisticsDataMarshaller instance = new StringColumnStatisticsDataMarshaller();

    public static StringColumnStatisticsDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StringColumnStatisticsData stringColumnStatisticsData, ProtocolMarshaller protocolMarshaller) {

        if (stringColumnStatisticsData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stringColumnStatisticsData.getMaximumLength(), MAXIMUMLENGTH_BINDING);
            protocolMarshaller.marshall(stringColumnStatisticsData.getAverageLength(), AVERAGELENGTH_BINDING);
            protocolMarshaller.marshall(stringColumnStatisticsData.getNumberOfNulls(), NUMBEROFNULLS_BINDING);
            protocolMarshaller.marshall(stringColumnStatisticsData.getNumberOfDistinctValues(), NUMBEROFDISTINCTVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
