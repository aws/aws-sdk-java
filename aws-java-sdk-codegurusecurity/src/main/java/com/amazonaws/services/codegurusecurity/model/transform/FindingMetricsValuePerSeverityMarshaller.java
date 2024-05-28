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
package com.amazonaws.services.codegurusecurity.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codegurusecurity.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingMetricsValuePerSeverityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingMetricsValuePerSeverityMarshaller {

    private static final MarshallingInfo<Double> CRITICAL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("critical").build();
    private static final MarshallingInfo<Double> HIGH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("high").build();
    private static final MarshallingInfo<Double> INFO_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("info").build();
    private static final MarshallingInfo<Double> LOW_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("low").build();
    private static final MarshallingInfo<Double> MEDIUM_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("medium").build();

    private static final FindingMetricsValuePerSeverityMarshaller instance = new FindingMetricsValuePerSeverityMarshaller();

    public static FindingMetricsValuePerSeverityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindingMetricsValuePerSeverity findingMetricsValuePerSeverity, ProtocolMarshaller protocolMarshaller) {

        if (findingMetricsValuePerSeverity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findingMetricsValuePerSeverity.getCritical(), CRITICAL_BINDING);
            protocolMarshaller.marshall(findingMetricsValuePerSeverity.getHigh(), HIGH_BINDING);
            protocolMarshaller.marshall(findingMetricsValuePerSeverity.getInfo(), INFO_BINDING);
            protocolMarshaller.marshall(findingMetricsValuePerSeverity.getLow(), LOW_BINDING);
            protocolMarshaller.marshall(findingMetricsValuePerSeverity.getMedium(), MEDIUM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
