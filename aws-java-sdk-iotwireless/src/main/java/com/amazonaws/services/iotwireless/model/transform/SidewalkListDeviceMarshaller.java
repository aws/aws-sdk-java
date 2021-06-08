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
package com.amazonaws.services.iotwireless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SidewalkListDeviceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SidewalkListDeviceMarshaller {

    private static final MarshallingInfo<String> AMAZONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AmazonId").build();
    private static final MarshallingInfo<String> SIDEWALKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SidewalkId").build();
    private static final MarshallingInfo<String> SIDEWALKMANUFACTURINGSN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SidewalkManufacturingSn").build();
    private static final MarshallingInfo<List> DEVICECERTIFICATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceCertificates").build();

    private static final SidewalkListDeviceMarshaller instance = new SidewalkListDeviceMarshaller();

    public static SidewalkListDeviceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SidewalkListDevice sidewalkListDevice, ProtocolMarshaller protocolMarshaller) {

        if (sidewalkListDevice == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sidewalkListDevice.getAmazonId(), AMAZONID_BINDING);
            protocolMarshaller.marshall(sidewalkListDevice.getSidewalkId(), SIDEWALKID_BINDING);
            protocolMarshaller.marshall(sidewalkListDevice.getSidewalkManufacturingSn(), SIDEWALKMANUFACTURINGSN_BINDING);
            protocolMarshaller.marshall(sidewalkListDevice.getDeviceCertificates(), DEVICECERTIFICATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
