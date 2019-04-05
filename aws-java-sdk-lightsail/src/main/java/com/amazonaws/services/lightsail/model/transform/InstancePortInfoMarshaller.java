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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstancePortInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstancePortInfoMarshaller {

    private static final MarshallingInfo<Integer> FROMPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromPort").build();
    private static final MarshallingInfo<Integer> TOPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("toPort").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<String> ACCESSFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessFrom").build();
    private static final MarshallingInfo<String> ACCESSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessType").build();
    private static final MarshallingInfo<String> COMMONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commonName").build();
    private static final MarshallingInfo<String> ACCESSDIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessDirection").build();

    private static final InstancePortInfoMarshaller instance = new InstancePortInfoMarshaller();

    public static InstancePortInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstancePortInfo instancePortInfo, ProtocolMarshaller protocolMarshaller) {

        if (instancePortInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instancePortInfo.getFromPort(), FROMPORT_BINDING);
            protocolMarshaller.marshall(instancePortInfo.getToPort(), TOPORT_BINDING);
            protocolMarshaller.marshall(instancePortInfo.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(instancePortInfo.getAccessFrom(), ACCESSFROM_BINDING);
            protocolMarshaller.marshall(instancePortInfo.getAccessType(), ACCESSTYPE_BINDING);
            protocolMarshaller.marshall(instancePortInfo.getCommonName(), COMMONNAME_BINDING);
            protocolMarshaller.marshall(instancePortInfo.getAccessDirection(), ACCESSDIRECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
