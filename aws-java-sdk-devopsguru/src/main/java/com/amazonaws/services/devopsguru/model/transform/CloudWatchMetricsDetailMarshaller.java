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
package com.amazonaws.services.devopsguru.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchMetricsDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchMetricsDetailMarshaller {

    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<String> STAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stat").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Period").build();

    private static final CloudWatchMetricsDetailMarshaller instance = new CloudWatchMetricsDetailMarshaller();

    public static CloudWatchMetricsDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchMetricsDetail cloudWatchMetricsDetail, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchMetricsDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchMetricsDetail.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(cloudWatchMetricsDetail.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(cloudWatchMetricsDetail.getDimensions(), DIMENSIONS_BINDING);
            protocolMarshaller.marshall(cloudWatchMetricsDetail.getStat(), STAT_BINDING);
            protocolMarshaller.marshall(cloudWatchMetricsDetail.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(cloudWatchMetricsDetail.getPeriod(), PERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
