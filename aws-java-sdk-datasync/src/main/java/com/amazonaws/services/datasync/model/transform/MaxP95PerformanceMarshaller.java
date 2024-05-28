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
package com.amazonaws.services.datasync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MaxP95PerformanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MaxP95PerformanceMarshaller {

    private static final MarshallingInfo<Double> IOPSREAD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IopsRead").build();
    private static final MarshallingInfo<Double> IOPSWRITE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IopsWrite").build();
    private static final MarshallingInfo<Double> IOPSOTHER_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IopsOther").build();
    private static final MarshallingInfo<Double> IOPSTOTAL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IopsTotal").build();
    private static final MarshallingInfo<Double> THROUGHPUTREAD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputRead").build();
    private static final MarshallingInfo<Double> THROUGHPUTWRITE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputWrite").build();
    private static final MarshallingInfo<Double> THROUGHPUTOTHER_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputOther").build();
    private static final MarshallingInfo<Double> THROUGHPUTTOTAL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputTotal").build();
    private static final MarshallingInfo<Double> LATENCYREAD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatencyRead").build();
    private static final MarshallingInfo<Double> LATENCYWRITE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatencyWrite").build();
    private static final MarshallingInfo<Double> LATENCYOTHER_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatencyOther").build();

    private static final MaxP95PerformanceMarshaller instance = new MaxP95PerformanceMarshaller();

    public static MaxP95PerformanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MaxP95Performance maxP95Performance, ProtocolMarshaller protocolMarshaller) {

        if (maxP95Performance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(maxP95Performance.getIopsRead(), IOPSREAD_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getIopsWrite(), IOPSWRITE_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getIopsOther(), IOPSOTHER_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getIopsTotal(), IOPSTOTAL_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getThroughputRead(), THROUGHPUTREAD_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getThroughputWrite(), THROUGHPUTWRITE_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getThroughputOther(), THROUGHPUTOTHER_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getThroughputTotal(), THROUGHPUTTOTAL_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getLatencyRead(), LATENCYREAD_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getLatencyWrite(), LATENCYWRITE_BINDING);
            protocolMarshaller.marshall(maxP95Performance.getLatencyOther(), LATENCYOTHER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
