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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputDeviceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputDeviceSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CONNECTIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionState").build();
    private static final MarshallingInfo<String> DEVICESETTINGSSYNCSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceSettingsSyncState").build();
    private static final MarshallingInfo<String> DEVICEUPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceUpdateStatus").build();
    private static final MarshallingInfo<StructuredPojo> HDDEVICESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hdDeviceSettings").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> MACADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("macAddress").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkSettings").build();
    private static final MarshallingInfo<String> SERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serialNumber").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<StructuredPojo> UHDDEVICESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uhdDeviceSettings").build();

    private static final InputDeviceSummaryMarshaller instance = new InputDeviceSummaryMarshaller();

    public static InputDeviceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputDeviceSummary inputDeviceSummary, ProtocolMarshaller protocolMarshaller) {

        if (inputDeviceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputDeviceSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getConnectionState(), CONNECTIONSTATE_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getDeviceSettingsSyncState(), DEVICESETTINGSSYNCSTATE_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getDeviceUpdateStatus(), DEVICEUPDATESTATUS_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getHdDeviceSettings(), HDDEVICESETTINGS_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getMacAddress(), MACADDRESS_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getNetworkSettings(), NETWORKSETTINGS_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getSerialNumber(), SERIALNUMBER_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(inputDeviceSummary.getUhdDeviceSettings(), UHDDEVICESETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
