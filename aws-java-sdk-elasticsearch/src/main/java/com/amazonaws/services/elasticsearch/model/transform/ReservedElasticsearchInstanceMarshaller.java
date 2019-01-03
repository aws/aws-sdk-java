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
package com.amazonaws.services.elasticsearch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservedElasticsearchInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservedElasticsearchInstanceMarshaller {

    private static final MarshallingInfo<String> RESERVATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservationName").build();
    private static final MarshallingInfo<String> RESERVEDELASTICSEARCHINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedElasticsearchInstanceId").build();
    private static final MarshallingInfo<String> RESERVEDELASTICSEARCHINSTANCEOFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedElasticsearchInstanceOfferingId").build();
    private static final MarshallingInfo<String> ELASTICSEARCHINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchInstanceType").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Duration").build();
    private static final MarshallingInfo<Double> FIXEDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FixedPrice").build();
    private static final MarshallingInfo<Double> USAGEPRICE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsagePrice").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();
    private static final MarshallingInfo<Integer> ELASTICSEARCHINSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchInstanceCount").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaymentOption").build();
    private static final MarshallingInfo<List> RECURRINGCHARGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecurringCharges").build();

    private static final ReservedElasticsearchInstanceMarshaller instance = new ReservedElasticsearchInstanceMarshaller();

    public static ReservedElasticsearchInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservedElasticsearchInstance reservedElasticsearchInstance, ProtocolMarshaller protocolMarshaller) {

        if (reservedElasticsearchInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservedElasticsearchInstance.getReservationName(), RESERVATIONNAME_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getReservedElasticsearchInstanceId(), RESERVEDELASTICSEARCHINSTANCEID_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getReservedElasticsearchInstanceOfferingId(),
                    RESERVEDELASTICSEARCHINSTANCEOFFERINGID_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getElasticsearchInstanceType(), ELASTICSEARCHINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getFixedPrice(), FIXEDPRICE_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getUsagePrice(), USAGEPRICE_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getElasticsearchInstanceCount(), ELASTICSEARCHINSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getState(), STATE_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(reservedElasticsearchInstance.getRecurringCharges(), RECURRINGCHARGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
