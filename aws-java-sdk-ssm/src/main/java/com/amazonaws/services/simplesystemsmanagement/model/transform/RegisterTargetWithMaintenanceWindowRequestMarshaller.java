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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterTargetWithMaintenanceWindowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterTargetWithMaintenanceWindowRequestMarshaller {

    private static final MarshallingInfo<String> WINDOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WindowId").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<String> OWNERINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerInformation").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final RegisterTargetWithMaintenanceWindowRequestMarshaller instance = new RegisterTargetWithMaintenanceWindowRequestMarshaller();

    public static RegisterTargetWithMaintenanceWindowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerTargetWithMaintenanceWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerTargetWithMaintenanceWindowRequest.getWindowId(), WINDOWID_BINDING);
            protocolMarshaller.marshall(registerTargetWithMaintenanceWindowRequest.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(registerTargetWithMaintenanceWindowRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(registerTargetWithMaintenanceWindowRequest.getOwnerInformation(), OWNERINFORMATION_BINDING);
            protocolMarshaller.marshall(registerTargetWithMaintenanceWindowRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(registerTargetWithMaintenanceWindowRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(registerTargetWithMaintenanceWindowRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
