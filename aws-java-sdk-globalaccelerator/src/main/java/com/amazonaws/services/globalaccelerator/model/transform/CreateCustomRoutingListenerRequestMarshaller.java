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
package com.amazonaws.services.globalaccelerator.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.globalaccelerator.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCustomRoutingListenerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCustomRoutingListenerRequestMarshaller {

    private static final MarshallingInfo<String> ACCELERATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorArn").build();
    private static final MarshallingInfo<List> PORTRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PortRanges").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateCustomRoutingListenerRequestMarshaller instance = new CreateCustomRoutingListenerRequestMarshaller();

    public static CreateCustomRoutingListenerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCustomRoutingListenerRequest createCustomRoutingListenerRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCustomRoutingListenerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCustomRoutingListenerRequest.getAcceleratorArn(), ACCELERATORARN_BINDING);
            protocolMarshaller.marshall(createCustomRoutingListenerRequest.getPortRanges(), PORTRANGES_BINDING);
            protocolMarshaller.marshall(createCustomRoutingListenerRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
