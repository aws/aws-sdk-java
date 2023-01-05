/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CalculateRouteMatrixRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CalculateRouteMatrixRequestMarshaller {

    private static final MarshallingInfo<String> CALCULATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("CalculatorName").build();
    private static final MarshallingInfo<StructuredPojo> CARMODEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CarModeOptions").build();
    private static final MarshallingInfo<Boolean> DEPARTNOW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DepartNow").build();
    private static final MarshallingInfo<List> DEPARTUREPOSITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeparturePositions").build();
    private static final MarshallingInfo<java.util.Date> DEPARTURETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DepartureTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<List> DESTINATIONPOSITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPositions").build();
    private static final MarshallingInfo<String> DISTANCEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistanceUnit").build();
    private static final MarshallingInfo<String> TRAVELMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TravelMode").build();
    private static final MarshallingInfo<StructuredPojo> TRUCKMODEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TruckModeOptions").build();

    private static final CalculateRouteMatrixRequestMarshaller instance = new CalculateRouteMatrixRequestMarshaller();

    public static CalculateRouteMatrixRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CalculateRouteMatrixRequest calculateRouteMatrixRequest, ProtocolMarshaller protocolMarshaller) {

        if (calculateRouteMatrixRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getCalculatorName(), CALCULATORNAME_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getCarModeOptions(), CARMODEOPTIONS_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getDepartNow(), DEPARTNOW_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getDeparturePositions(), DEPARTUREPOSITIONS_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getDepartureTime(), DEPARTURETIME_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getDestinationPositions(), DESTINATIONPOSITIONS_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getDistanceUnit(), DISTANCEUNIT_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getTravelMode(), TRAVELMODE_BINDING);
            protocolMarshaller.marshall(calculateRouteMatrixRequest.getTruckModeOptions(), TRUCKMODEOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
