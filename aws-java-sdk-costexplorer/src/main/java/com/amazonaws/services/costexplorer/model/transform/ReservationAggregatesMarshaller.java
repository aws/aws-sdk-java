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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservationAggregatesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservationAggregatesMarshaller {

    private static final MarshallingInfo<String> UTILIZATIONPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UtilizationPercentage").build();
    private static final MarshallingInfo<String> UTILIZATIONPERCENTAGEINUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UtilizationPercentageInUnits").build();
    private static final MarshallingInfo<String> PURCHASEDHOURS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PurchasedHours").build();
    private static final MarshallingInfo<String> PURCHASEDUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PurchasedUnits").build();
    private static final MarshallingInfo<String> TOTALACTUALHOURS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalActualHours").build();
    private static final MarshallingInfo<String> TOTALACTUALUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalActualUnits").build();
    private static final MarshallingInfo<String> UNUSEDHOURS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnusedHours").build();
    private static final MarshallingInfo<String> UNUSEDUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnusedUnits").build();
    private static final MarshallingInfo<String> ONDEMANDCOSTOFRIHOURSUSED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandCostOfRIHoursUsed").build();
    private static final MarshallingInfo<String> NETRISAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetRISavings").build();
    private static final MarshallingInfo<String> TOTALPOTENTIALRISAVINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalPotentialRISavings").build();
    private static final MarshallingInfo<String> AMORTIZEDUPFRONTFEE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmortizedUpfrontFee").build();
    private static final MarshallingInfo<String> AMORTIZEDRECURRINGFEE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmortizedRecurringFee").build();
    private static final MarshallingInfo<String> TOTALAMORTIZEDFEE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalAmortizedFee").build();

    private static final ReservationAggregatesMarshaller instance = new ReservationAggregatesMarshaller();

    public static ReservationAggregatesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservationAggregates reservationAggregates, ProtocolMarshaller protocolMarshaller) {

        if (reservationAggregates == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservationAggregates.getUtilizationPercentage(), UTILIZATIONPERCENTAGE_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getUtilizationPercentageInUnits(), UTILIZATIONPERCENTAGEINUNITS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getPurchasedHours(), PURCHASEDHOURS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getPurchasedUnits(), PURCHASEDUNITS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getTotalActualHours(), TOTALACTUALHOURS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getTotalActualUnits(), TOTALACTUALUNITS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getUnusedHours(), UNUSEDHOURS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getUnusedUnits(), UNUSEDUNITS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getOnDemandCostOfRIHoursUsed(), ONDEMANDCOSTOFRIHOURSUSED_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getNetRISavings(), NETRISAVINGS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getTotalPotentialRISavings(), TOTALPOTENTIALRISAVINGS_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getAmortizedUpfrontFee(), AMORTIZEDUPFRONTFEE_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getAmortizedRecurringFee(), AMORTIZEDRECURRINGFEE_BINDING);
            protocolMarshaller.marshall(reservationAggregates.getTotalAmortizedFee(), TOTALAMORTIZEDFEE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
