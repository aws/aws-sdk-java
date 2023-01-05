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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartConnectionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartConnectionRequestMarshaller {

    private static final MarshallingInfo<String> DEVICESERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceSerialNumber").build();
    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AssetId").build();
    private static final MarshallingInfo<String> CLIENTPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientPublicKey").build();
    private static final MarshallingInfo<Integer> NETWORKINTERFACEDEVICEINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceDeviceIndex").build();

    private static final StartConnectionRequestMarshaller instance = new StartConnectionRequestMarshaller();

    public static StartConnectionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartConnectionRequest startConnectionRequest, ProtocolMarshaller protocolMarshaller) {

        if (startConnectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startConnectionRequest.getDeviceSerialNumber(), DEVICESERIALNUMBER_BINDING);
            protocolMarshaller.marshall(startConnectionRequest.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(startConnectionRequest.getClientPublicKey(), CLIENTPUBLICKEY_BINDING);
            protocolMarshaller.marshall(startConnectionRequest.getNetworkInterfaceDeviceIndex(), NETWORKINTERFACEDEVICEINDEX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
