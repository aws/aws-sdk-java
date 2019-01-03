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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservationPlanMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservationPlanMarshaller {

    private static final MarshallingInfo<String> COMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitment").build();
    private static final MarshallingInfo<java.util.Date> EXPIRESAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiresAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> PURCHASEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("purchasedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RENEWALTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renewalType").build();
    private static final MarshallingInfo<Integer> RESERVEDSLOTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reservedSlots").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final ReservationPlanMarshaller instance = new ReservationPlanMarshaller();

    public static ReservationPlanMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservationPlan reservationPlan, ProtocolMarshaller protocolMarshaller) {

        if (reservationPlan == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservationPlan.getCommitment(), COMMITMENT_BINDING);
            protocolMarshaller.marshall(reservationPlan.getExpiresAt(), EXPIRESAT_BINDING);
            protocolMarshaller.marshall(reservationPlan.getPurchasedAt(), PURCHASEDAT_BINDING);
            protocolMarshaller.marshall(reservationPlan.getRenewalType(), RENEWALTYPE_BINDING);
            protocolMarshaller.marshall(reservationPlan.getReservedSlots(), RESERVEDSLOTS_BINDING);
            protocolMarshaller.marshall(reservationPlan.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
