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
package com.amazonaws.services.internetmonitor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.internetmonitor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PerformanceMeasurementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PerformanceMeasurementMarshaller {

    private static final MarshallingInfo<Double> EXPERIENCESCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExperienceScore").build();
    private static final MarshallingInfo<Double> PERCENTOFTOTALTRAFFICIMPACTED_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentOfTotalTrafficImpacted").build();
    private static final MarshallingInfo<Double> PERCENTOFCLIENTLOCATIONIMPACTED_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentOfClientLocationImpacted").build();
    private static final MarshallingInfo<StructuredPojo> ROUNDTRIPTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoundTripTime").build();

    private static final PerformanceMeasurementMarshaller instance = new PerformanceMeasurementMarshaller();

    public static PerformanceMeasurementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PerformanceMeasurement performanceMeasurement, ProtocolMarshaller protocolMarshaller) {

        if (performanceMeasurement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(performanceMeasurement.getExperienceScore(), EXPERIENCESCORE_BINDING);
            protocolMarshaller.marshall(performanceMeasurement.getPercentOfTotalTrafficImpacted(), PERCENTOFTOTALTRAFFICIMPACTED_BINDING);
            protocolMarshaller.marshall(performanceMeasurement.getPercentOfClientLocationImpacted(), PERCENTOFCLIENTLOCATIONIMPACTED_BINDING);
            protocolMarshaller.marshall(performanceMeasurement.getRoundTripTime(), ROUNDTRIPTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
