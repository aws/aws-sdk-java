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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMaintenanceWindowTargetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMaintenanceWindowTargetRequestMarshaller {

    private static final MarshallingInfo<String> WINDOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WindowId").build();
    private static final MarshallingInfo<String> WINDOWTARGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowTargetId").build();
    private static final MarshallingInfo<List> TARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Targets").build();
    private static final MarshallingInfo<String> OWNERINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerInformation").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Boolean> REPLACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Replace").build();

    private static final UpdateMaintenanceWindowTargetRequestMarshaller instance = new UpdateMaintenanceWindowTargetRequestMarshaller();

    public static UpdateMaintenanceWindowTargetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMaintenanceWindowTargetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMaintenanceWindowTargetRequest.getWindowId(), WINDOWID_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTargetRequest.getWindowTargetId(), WINDOWTARGETID_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTargetRequest.getTargets(), TARGETS_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTargetRequest.getOwnerInformation(), OWNERINFORMATION_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTargetRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTargetRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateMaintenanceWindowTargetRequest.getReplace(), REPLACE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
