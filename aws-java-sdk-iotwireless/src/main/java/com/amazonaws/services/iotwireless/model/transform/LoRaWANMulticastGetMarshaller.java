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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoRaWANMulticastGetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoRaWANMulticastGetMarshaller {

    private static final MarshallingInfo<String> RFREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RfRegion").build();
    private static final MarshallingInfo<String> DLCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DlClass").build();
    private static final MarshallingInfo<Integer> NUMBEROFDEVICESREQUESTED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDevicesRequested").build();
    private static final MarshallingInfo<Integer> NUMBEROFDEVICESINGROUP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDevicesInGroup").build();

    private static final LoRaWANMulticastGetMarshaller instance = new LoRaWANMulticastGetMarshaller();

    public static LoRaWANMulticastGetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoRaWANMulticastGet loRaWANMulticastGet, ProtocolMarshaller protocolMarshaller) {

        if (loRaWANMulticastGet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loRaWANMulticastGet.getRfRegion(), RFREGION_BINDING);
            protocolMarshaller.marshall(loRaWANMulticastGet.getDlClass(), DLCLASS_BINDING);
            protocolMarshaller.marshall(loRaWANMulticastGet.getNumberOfDevicesRequested(), NUMBEROFDEVICESREQUESTED_BINDING);
            protocolMarshaller.marshall(loRaWANMulticastGet.getNumberOfDevicesInGroup(), NUMBEROFDEVICESINGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
