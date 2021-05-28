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
 * CalculateRouteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CalculateRouteRequestMarshaller {

    private static final MarshallingInfo<String> CALCULATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("CalculatorName").build();
    private static final MarshallingInfo<StructuredPojo> CARMODEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CarModeOptions").build();
    private static final MarshallingInfo<Boolean> DEPARTNOW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DepartNow").build();
    private static final MarshallingInfo<List> DEPARTUREPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeparturePosition").build();
    private static final MarshallingInfo<java.util.Date> DEPARTURETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DepartureTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<List> DESTINATIONPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPosition").build();
    private static final MarshallingInfo<String> DISTANCEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistanceUnit").build();
    private static final MarshallingInfo<Boolean> INCLUDELEGGEOMETRY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeLegGeometry").build();
    private static final MarshallingInfo<String> TRAVELMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TravelMode").build();
    private static final MarshallingInfo<StructuredPojo> TRUCKMODEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TruckModeOptions").build();
    private static final MarshallingInfo<List> WAYPOINTPOSITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WaypointPositions").build();

    private static final CalculateRouteRequestMarshaller instance = new CalculateRouteRequestMarshaller();

    public static CalculateRouteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CalculateRouteRequest calculateRouteRequest, ProtocolMarshaller protocolMarshaller) {

        if (calculateRouteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(calculateRouteRequest.getCalculatorName(), CALCULATORNAME_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getCarModeOptions(), CARMODEOPTIONS_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getDepartNow(), DEPARTNOW_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getDeparturePosition(), DEPARTUREPOSITION_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getDepartureTime(), DEPARTURETIME_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getDestinationPosition(), DESTINATIONPOSITION_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getDistanceUnit(), DISTANCEUNIT_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getIncludeLegGeometry(), INCLUDELEGGEOMETRY_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getTravelMode(), TRAVELMODE_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getTruckModeOptions(), TRUCKMODEOPTIONS_BINDING);
            protocolMarshaller.marshall(calculateRouteRequest.getWaypointPositions(), WAYPOINTPOSITIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
