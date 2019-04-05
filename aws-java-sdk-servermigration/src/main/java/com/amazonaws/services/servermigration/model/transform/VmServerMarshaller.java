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
package com.amazonaws.services.servermigration.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VmServerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VmServerMarshaller {

    private static final MarshallingInfo<StructuredPojo> VMSERVERADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vmServerAddress").build();
    private static final MarshallingInfo<String> VMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vmName").build();
    private static final MarshallingInfo<String> VMMANAGERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vmManagerName").build();
    private static final MarshallingInfo<String> VMMANAGERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vmManagerType").build();
    private static final MarshallingInfo<String> VMPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vmPath").build();

    private static final VmServerMarshaller instance = new VmServerMarshaller();

    public static VmServerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VmServer vmServer, ProtocolMarshaller protocolMarshaller) {

        if (vmServer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vmServer.getVmServerAddress(), VMSERVERADDRESS_BINDING);
            protocolMarshaller.marshall(vmServer.getVmName(), VMNAME_BINDING);
            protocolMarshaller.marshall(vmServer.getVmManagerName(), VMMANAGERNAME_BINDING);
            protocolMarshaller.marshall(vmServer.getVmManagerType(), VMMANAGERTYPE_BINDING);
            protocolMarshaller.marshall(vmServer.getVmPath(), VMPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
