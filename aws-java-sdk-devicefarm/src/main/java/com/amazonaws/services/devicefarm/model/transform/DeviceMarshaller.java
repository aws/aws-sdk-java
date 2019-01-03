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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> MANUFACTURER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manufacturer").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("model").build();
    private static final MarshallingInfo<String> MODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelId").build();
    private static final MarshallingInfo<String> FORMFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("formFactor").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> OS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("os").build();
    private static final MarshallingInfo<StructuredPojo> CPU_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpu").build();
    private static final MarshallingInfo<StructuredPojo> RESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolution").build();
    private static final MarshallingInfo<Long> HEAPSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("heapSize").build();
    private static final MarshallingInfo<Long> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("image").build();
    private static final MarshallingInfo<String> CARRIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("carrier").build();
    private static final MarshallingInfo<String> RADIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("radio").build();
    private static final MarshallingInfo<Boolean> REMOTEACCESSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteAccessEnabled").build();
    private static final MarshallingInfo<Boolean> REMOTEDEBUGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteDebugEnabled").build();
    private static final MarshallingInfo<String> FLEETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fleetType").build();
    private static final MarshallingInfo<String> FLEETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fleetName").build();
    private static final MarshallingInfo<List> INSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instances").build();
    private static final MarshallingInfo<String> AVAILABILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availability").build();

    private static final DeviceMarshaller instance = new DeviceMarshaller();

    public static DeviceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Device device, ProtocolMarshaller protocolMarshaller) {

        if (device == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(device.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(device.getName(), NAME_BINDING);
            protocolMarshaller.marshall(device.getManufacturer(), MANUFACTURER_BINDING);
            protocolMarshaller.marshall(device.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(device.getModelId(), MODELID_BINDING);
            protocolMarshaller.marshall(device.getFormFactor(), FORMFACTOR_BINDING);
            protocolMarshaller.marshall(device.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(device.getOs(), OS_BINDING);
            protocolMarshaller.marshall(device.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(device.getResolution(), RESOLUTION_BINDING);
            protocolMarshaller.marshall(device.getHeapSize(), HEAPSIZE_BINDING);
            protocolMarshaller.marshall(device.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(device.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(device.getCarrier(), CARRIER_BINDING);
            protocolMarshaller.marshall(device.getRadio(), RADIO_BINDING);
            protocolMarshaller.marshall(device.getRemoteAccessEnabled(), REMOTEACCESSENABLED_BINDING);
            protocolMarshaller.marshall(device.getRemoteDebugEnabled(), REMOTEDEBUGENABLED_BINDING);
            protocolMarshaller.marshall(device.getFleetType(), FLEETTYPE_BINDING);
            protocolMarshaller.marshall(device.getFleetName(), FLEETNAME_BINDING);
            protocolMarshaller.marshall(device.getInstances(), INSTANCES_BINDING);
            protocolMarshaller.marshall(device.getAvailability(), AVAILABILITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
