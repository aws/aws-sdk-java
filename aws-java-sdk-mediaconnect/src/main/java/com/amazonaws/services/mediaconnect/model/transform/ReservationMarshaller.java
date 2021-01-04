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
package com.amazonaws.services.mediaconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservationMarshaller {

    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currencyCode").build();
    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("duration").build();
    private static final MarshallingInfo<String> DURATIONUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationUnits").build();
    private static final MarshallingInfo<String> END_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("end").build();
    private static final MarshallingInfo<String> OFFERINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringArn").build();
    private static final MarshallingInfo<String> OFFERINGDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringDescription").build();
    private static final MarshallingInfo<String> PRICEPERUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pricePerUnit").build();
    private static final MarshallingInfo<String> PRICEUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("priceUnits").build();
    private static final MarshallingInfo<String> RESERVATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reservationArn").build();
    private static final MarshallingInfo<String> RESERVATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reservationName").build();
    private static final MarshallingInfo<String> RESERVATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reservationState").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceSpecification").build();
    private static final MarshallingInfo<String> START_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("start").build();

    private static final ReservationMarshaller instance = new ReservationMarshaller();

    public static ReservationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Reservation reservation, ProtocolMarshaller protocolMarshaller) {

        if (reservation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservation.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(reservation.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(reservation.getDurationUnits(), DURATIONUNITS_BINDING);
            protocolMarshaller.marshall(reservation.getEnd(), END_BINDING);
            protocolMarshaller.marshall(reservation.getOfferingArn(), OFFERINGARN_BINDING);
            protocolMarshaller.marshall(reservation.getOfferingDescription(), OFFERINGDESCRIPTION_BINDING);
            protocolMarshaller.marshall(reservation.getPricePerUnit(), PRICEPERUNIT_BINDING);
            protocolMarshaller.marshall(reservation.getPriceUnits(), PRICEUNITS_BINDING);
            protocolMarshaller.marshall(reservation.getReservationArn(), RESERVATIONARN_BINDING);
            protocolMarshaller.marshall(reservation.getReservationName(), RESERVATIONNAME_BINDING);
            protocolMarshaller.marshall(reservation.getReservationState(), RESERVATIONSTATE_BINDING);
            protocolMarshaller.marshall(reservation.getResourceSpecification(), RESOURCESPECIFICATION_BINDING);
            protocolMarshaller.marshall(reservation.getStart(), START_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
