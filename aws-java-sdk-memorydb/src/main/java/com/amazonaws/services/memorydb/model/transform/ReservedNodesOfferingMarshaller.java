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
 * ReservedNodesOfferingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservedNodesOfferingMarshaller {

    private static final MarshallingInfo<String> RESERVEDNODESOFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedNodesOfferingId").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Duration").build();
    private static final MarshallingInfo<Double> FIXEDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FixedPrice").build();
    private static final MarshallingInfo<String> OFFERINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferingType").build();
    private static final MarshallingInfo<List> RECURRINGCHARGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecurringCharges").build();

    private static final ReservedNodesOfferingMarshaller instance = new ReservedNodesOfferingMarshaller();

    public static ReservedNodesOfferingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservedNodesOffering reservedNodesOffering, ProtocolMarshaller protocolMarshaller) {

        if (reservedNodesOffering == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservedNodesOffering.getReservedNodesOfferingId(), RESERVEDNODESOFFERINGID_BINDING);
            protocolMarshaller.marshall(reservedNodesOffering.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(reservedNodesOffering.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(reservedNodesOffering.getFixedPrice(), FIXEDPRICE_BINDING);
            protocolMarshaller.marshall(reservedNodesOffering.getOfferingType(), OFFERINGTYPE_BINDING);
            protocolMarshaller.marshall(reservedNodesOffering.getRecurringCharges(), RECURRINGCHARGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
