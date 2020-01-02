/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkspaceAccessPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspaceAccessPropertiesMarshaller {

    private static final MarshallingInfo<String> DEVICETYPEWINDOWS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeWindows").build();
    private static final MarshallingInfo<String> DEVICETYPEOSX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeOsx").build();
    private static final MarshallingInfo<String> DEVICETYPEWEB_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeWeb").build();
    private static final MarshallingInfo<String> DEVICETYPEIOS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeIos").build();
    private static final MarshallingInfo<String> DEVICETYPEANDROID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeAndroid").build();
    private static final MarshallingInfo<String> DEVICETYPECHROMEOS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeChromeOs").build();
    private static final MarshallingInfo<String> DEVICETYPEZEROCLIENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeZeroClient").build();

    private static final WorkspaceAccessPropertiesMarshaller instance = new WorkspaceAccessPropertiesMarshaller();

    public static WorkspaceAccessPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkspaceAccessProperties workspaceAccessProperties, ProtocolMarshaller protocolMarshaller) {

        if (workspaceAccessProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspaceAccessProperties.getDeviceTypeWindows(), DEVICETYPEWINDOWS_BINDING);
            protocolMarshaller.marshall(workspaceAccessProperties.getDeviceTypeOsx(), DEVICETYPEOSX_BINDING);
            protocolMarshaller.marshall(workspaceAccessProperties.getDeviceTypeWeb(), DEVICETYPEWEB_BINDING);
            protocolMarshaller.marshall(workspaceAccessProperties.getDeviceTypeIos(), DEVICETYPEIOS_BINDING);
            protocolMarshaller.marshall(workspaceAccessProperties.getDeviceTypeAndroid(), DEVICETYPEANDROID_BINDING);
            protocolMarshaller.marshall(workspaceAccessProperties.getDeviceTypeChromeOs(), DEVICETYPECHROMEOS_BINDING);
            protocolMarshaller.marshall(workspaceAccessProperties.getDeviceTypeZeroClient(), DEVICETYPEZEROCLIENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
