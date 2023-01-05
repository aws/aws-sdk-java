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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportClientBrandingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportClientBrandingRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<StructuredPojo> DEVICETYPEWINDOWS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeWindows").build();
    private static final MarshallingInfo<StructuredPojo> DEVICETYPEOSX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeOsx").build();
    private static final MarshallingInfo<StructuredPojo> DEVICETYPEANDROID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeAndroid").build();
    private static final MarshallingInfo<StructuredPojo> DEVICETYPEIOS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeIos").build();
    private static final MarshallingInfo<StructuredPojo> DEVICETYPELINUX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeLinux").build();
    private static final MarshallingInfo<StructuredPojo> DEVICETYPEWEB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeWeb").build();

    private static final ImportClientBrandingRequestMarshaller instance = new ImportClientBrandingRequestMarshaller();

    public static ImportClientBrandingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportClientBrandingRequest importClientBrandingRequest, ProtocolMarshaller protocolMarshaller) {

        if (importClientBrandingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importClientBrandingRequest.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(importClientBrandingRequest.getDeviceTypeWindows(), DEVICETYPEWINDOWS_BINDING);
            protocolMarshaller.marshall(importClientBrandingRequest.getDeviceTypeOsx(), DEVICETYPEOSX_BINDING);
            protocolMarshaller.marshall(importClientBrandingRequest.getDeviceTypeAndroid(), DEVICETYPEANDROID_BINDING);
            protocolMarshaller.marshall(importClientBrandingRequest.getDeviceTypeIos(), DEVICETYPEIOS_BINDING);
            protocolMarshaller.marshall(importClientBrandingRequest.getDeviceTypeLinux(), DEVICETYPELINUX_BINDING);
            protocolMarshaller.marshall(importClientBrandingRequest.getDeviceTypeWeb(), DEVICETYPEWEB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
