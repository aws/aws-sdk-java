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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateOrderRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateOrderRequestMarshaller {

    private static final MarshallingInfo<String> OUTPOSTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutpostIdentifier").build();
    private static final MarshallingInfo<List> LINEITEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LineItems").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaymentOption").build();
    private static final MarshallingInfo<String> PAYMENTTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaymentTerm").build();

    private static final CreateOrderRequestMarshaller instance = new CreateOrderRequestMarshaller();

    public static CreateOrderRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateOrderRequest createOrderRequest, ProtocolMarshaller protocolMarshaller) {

        if (createOrderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createOrderRequest.getOutpostIdentifier(), OUTPOSTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createOrderRequest.getLineItems(), LINEITEMS_BINDING);
            protocolMarshaller.marshall(createOrderRequest.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(createOrderRequest.getPaymentTerm(), PAYMENTTERM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
