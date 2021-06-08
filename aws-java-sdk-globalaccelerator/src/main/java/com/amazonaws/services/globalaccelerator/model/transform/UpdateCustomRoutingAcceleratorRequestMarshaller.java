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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.globalaccelerator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateCustomRoutingAcceleratorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateCustomRoutingAcceleratorRequestMarshaller {

    private static final MarshallingInfo<String> ACCELERATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> IPADDRESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpAddressType").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();

    private static final UpdateCustomRoutingAcceleratorRequestMarshaller instance = new UpdateCustomRoutingAcceleratorRequestMarshaller();

    public static UpdateCustomRoutingAcceleratorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateCustomRoutingAcceleratorRequest updateCustomRoutingAcceleratorRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateCustomRoutingAcceleratorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateCustomRoutingAcceleratorRequest.getAcceleratorArn(), ACCELERATORARN_BINDING);
            protocolMarshaller.marshall(updateCustomRoutingAcceleratorRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateCustomRoutingAcceleratorRequest.getIpAddressType(), IPADDRESSTYPE_BINDING);
            protocolMarshaller.marshall(updateCustomRoutingAcceleratorRequest.getEnabled(), ENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
