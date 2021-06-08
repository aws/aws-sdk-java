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
package com.amazonaws.services.location.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CalculateRouteSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CalculateRouteSummaryMarshaller {

    private static final MarshallingInfo<String> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<Double> DISTANCE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Distance").build();
    private static final MarshallingInfo<String> DISTANCEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistanceUnit").build();
    private static final MarshallingInfo<Double> DURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationSeconds").build();
    private static final MarshallingInfo<List> ROUTEBBOX_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RouteBBox").build();

    private static final CalculateRouteSummaryMarshaller instance = new CalculateRouteSummaryMarshaller();

    public static CalculateRouteSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CalculateRouteSummary calculateRouteSummary, ProtocolMarshaller protocolMarshaller) {

        if (calculateRouteSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(calculateRouteSummary.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(calculateRouteSummary.getDistance(), DISTANCE_BINDING);
            protocolMarshaller.marshall(calculateRouteSummary.getDistanceUnit(), DISTANCEUNIT_BINDING);
            protocolMarshaller.marshall(calculateRouteSummary.getDurationSeconds(), DURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(calculateRouteSummary.getRouteBBox(), ROUTEBBOX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
