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
package com.amazonaws.services.memorydb.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.memorydb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservedNodeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservedNodeMarshaller {

    private static final MarshallingInfo<String> RESERVATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservationId").build();
    private static final MarshallingInfo<String> RESERVEDNODESOFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedNodesOfferingId").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Duration").build();
    private static final MarshallingInfo<Double> FIXEDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FixedPrice").build();
    private static final MarshallingInfo<Integer> NODECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NodeCount").build();
    private static final MarshallingInfo<String> OFFERINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferingType").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<List> RECURRINGCHARGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecurringCharges").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ARN").build();

    private static final ReservedNodeMarshaller instance = new ReservedNodeMarshaller();

    public static ReservedNodeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservedNode reservedNode, ProtocolMarshaller protocolMarshaller) {

        if (reservedNode == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservedNode.getReservationId(), RESERVATIONID_BINDING);
            protocolMarshaller.marshall(reservedNode.getReservedNodesOfferingId(), RESERVEDNODESOFFERINGID_BINDING);
            protocolMarshaller.marshall(reservedNode.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(reservedNode.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(reservedNode.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(reservedNode.getFixedPrice(), FIXEDPRICE_BINDING);
            protocolMarshaller.marshall(reservedNode.getNodeCount(), NODECOUNT_BINDING);
            protocolMarshaller.marshall(reservedNode.getOfferingType(), OFFERINGTYPE_BINDING);
            protocolMarshaller.marshall(reservedNode.getState(), STATE_BINDING);
            protocolMarshaller.marshall(reservedNode.getRecurringCharges(), RECURRINGCHARGES_BINDING);
            protocolMarshaller.marshall(reservedNode.getARN(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
