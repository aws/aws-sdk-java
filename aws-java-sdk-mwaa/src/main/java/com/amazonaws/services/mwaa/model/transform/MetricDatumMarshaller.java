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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mwaa.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetricDatumMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricDatumMarshaller {

    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<StructuredPojo> STATISTICVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatisticValues").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<Double> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Value").build();

    private static final MetricDatumMarshaller instance = new MetricDatumMarshaller();

    public static MetricDatumMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetricDatum metricDatum, ProtocolMarshaller protocolMarshaller) {

        if (metricDatum == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metricDatum.getDimensions(), DIMENSIONS_BINDING);
            protocolMarshaller.marshall(metricDatum.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(metricDatum.getStatisticValues(), STATISTICVALUES_BINDING);
            protocolMarshaller.marshall(metricDatum.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(metricDatum.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(metricDatum.getValue(), VALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
