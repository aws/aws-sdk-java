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
package com.amazonaws.services.private5g.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrderMarshaller {

    private static final MarshallingInfo<String> ACKNOWLEDGMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acknowledgmentStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> NETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkArn").build();
    private static final MarshallingInfo<String> NETWORKSITEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkSiteArn").build();
    private static final MarshallingInfo<String> ORDERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("orderArn").build();
    private static final MarshallingInfo<StructuredPojo> SHIPPINGADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shippingAddress").build();
    private static final MarshallingInfo<List> TRACKINGINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trackingInformation").build();

    private static final OrderMarshaller instance = new OrderMarshaller();

    public static OrderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Order order, ProtocolMarshaller protocolMarshaller) {

        if (order == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(order.getAcknowledgmentStatus(), ACKNOWLEDGMENTSTATUS_BINDING);
            protocolMarshaller.marshall(order.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(order.getNetworkArn(), NETWORKARN_BINDING);
            protocolMarshaller.marshall(order.getNetworkSiteArn(), NETWORKSITEARN_BINDING);
            protocolMarshaller.marshall(order.getOrderArn(), ORDERARN_BINDING);
            protocolMarshaller.marshall(order.getShippingAddress(), SHIPPINGADDRESS_BINDING);
            protocolMarshaller.marshall(order.getTrackingInformation(), TRACKINGINFORMATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
