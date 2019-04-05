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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetricDatapointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricDatapointMarshaller {

    private static final MarshallingInfo<Double> AVERAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("average").build();
    private static final MarshallingInfo<Double> MAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maximum").build();
    private static final MarshallingInfo<Double> MINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("minimum").build();
    private static final MarshallingInfo<Double> SAMPLECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleCount").build();
    private static final MarshallingInfo<Double> SUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sum").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unit").build();

    private static final MetricDatapointMarshaller instance = new MetricDatapointMarshaller();

    public static MetricDatapointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetricDatapoint metricDatapoint, ProtocolMarshaller protocolMarshaller) {

        if (metricDatapoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metricDatapoint.getAverage(), AVERAGE_BINDING);
            protocolMarshaller.marshall(metricDatapoint.getMaximum(), MAXIMUM_BINDING);
            protocolMarshaller.marshall(metricDatapoint.getMinimum(), MINIMUM_BINDING);
            protocolMarshaller.marshall(metricDatapoint.getSampleCount(), SAMPLECOUNT_BINDING);
            protocolMarshaller.marshall(metricDatapoint.getSum(), SUM_BINDING);
            protocolMarshaller.marshall(metricDatapoint.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(metricDatapoint.getUnit(), UNIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
