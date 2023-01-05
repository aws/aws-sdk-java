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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceSelectionConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceSelectionConfigMarshaller {

    private static final MarshallingInfo<String> DEVICESUBSETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceSubsetType").build();
    private static final MarshallingInfo<Integer> PERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Percentage").build();
    private static final MarshallingInfo<List> DEVICENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceNames").build();
    private static final MarshallingInfo<String> DEVICENAMECONTAINS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceNameContains").build();

    private static final DeviceSelectionConfigMarshaller instance = new DeviceSelectionConfigMarshaller();

    public static DeviceSelectionConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceSelectionConfig deviceSelectionConfig, ProtocolMarshaller protocolMarshaller) {

        if (deviceSelectionConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceSelectionConfig.getDeviceSubsetType(), DEVICESUBSETTYPE_BINDING);
            protocolMarshaller.marshall(deviceSelectionConfig.getPercentage(), PERCENTAGE_BINDING);
            protocolMarshaller.marshall(deviceSelectionConfig.getDeviceNames(), DEVICENAMES_BINDING);
            protocolMarshaller.marshall(deviceSelectionConfig.getDeviceNameContains(), DEVICENAMECONTAINS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
