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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceSummaryMarshaller {

    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceName").build();
    private static final MarshallingInfo<String> DEVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DEVICEFLEETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceFleetName").build();
    private static final MarshallingInfo<String> IOTTHINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IotThingName").build();
    private static final MarshallingInfo<java.util.Date> REGISTRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LATESTHEARTBEAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestHeartbeat").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> MODELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Models").build();

    private static final DeviceSummaryMarshaller instance = new DeviceSummaryMarshaller();

    public static DeviceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceSummary deviceSummary, ProtocolMarshaller protocolMarshaller) {

        if (deviceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceSummary.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(deviceSummary.getDeviceArn(), DEVICEARN_BINDING);
            protocolMarshaller.marshall(deviceSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(deviceSummary.getDeviceFleetName(), DEVICEFLEETNAME_BINDING);
            protocolMarshaller.marshall(deviceSummary.getIotThingName(), IOTTHINGNAME_BINDING);
            protocolMarshaller.marshall(deviceSummary.getRegistrationTime(), REGISTRATIONTIME_BINDING);
            protocolMarshaller.marshall(deviceSummary.getLatestHeartbeat(), LATESTHEARTBEAT_BINDING);
            protocolMarshaller.marshall(deviceSummary.getModels(), MODELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
