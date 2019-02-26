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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LinuxParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LinuxParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capabilities").build();
    private static final MarshallingInfo<List> DEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("devices").build();
    private static final MarshallingInfo<Boolean> INITPROCESSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initProcessEnabled").build();
    private static final MarshallingInfo<Integer> SHAREDMEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sharedMemorySize").build();
    private static final MarshallingInfo<List> TMPFS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tmpfs").build();

    private static final LinuxParametersMarshaller instance = new LinuxParametersMarshaller();

    public static LinuxParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LinuxParameters linuxParameters, ProtocolMarshaller protocolMarshaller) {

        if (linuxParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(linuxParameters.getCapabilities(), CAPABILITIES_BINDING);
            protocolMarshaller.marshall(linuxParameters.getDevices(), DEVICES_BINDING);
            protocolMarshaller.marshall(linuxParameters.getInitProcessEnabled(), INITPROCESSENABLED_BINDING);
            protocolMarshaller.marshall(linuxParameters.getSharedMemorySize(), SHAREDMEMORYSIZE_BINDING);
            protocolMarshaller.marshall(linuxParameters.getTmpfs(), TMPFS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
