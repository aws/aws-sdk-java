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
package com.amazonaws.services.outposts.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrderSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrderSummaryMarshaller {

    private static final MarshallingInfo<String> OUTPOSTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutpostId").build();
    private static final MarshallingInfo<String> ORDERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrderId").build();
    private static final MarshallingInfo<String> ORDERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrderType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Map> LINEITEMCOUNTSBYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LineItemCountsByStatus").build();
    private static final MarshallingInfo<java.util.Date> ORDERSUBMISSIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrderSubmissionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ORDERFULFILLEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrderFulfilledDate").timestampFormat("unixTimestamp").build();

    private static final OrderSummaryMarshaller instance = new OrderSummaryMarshaller();

    public static OrderSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrderSummary orderSummary, ProtocolMarshaller protocolMarshaller) {

        if (orderSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(orderSummary.getOutpostId(), OUTPOSTID_BINDING);
            protocolMarshaller.marshall(orderSummary.getOrderId(), ORDERID_BINDING);
            protocolMarshaller.marshall(orderSummary.getOrderType(), ORDERTYPE_BINDING);
            protocolMarshaller.marshall(orderSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(orderSummary.getLineItemCountsByStatus(), LINEITEMCOUNTSBYSTATUS_BINDING);
            protocolMarshaller.marshall(orderSummary.getOrderSubmissionDate(), ORDERSUBMISSIONDATE_BINDING);
            protocolMarshaller.marshall(orderSummary.getOrderFulfilledDate(), ORDERFULFILLEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
