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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeregisterTargetFromMaintenanceWindowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeregisterTargetFromMaintenanceWindowRequestMarshaller {

    private static final MarshallingInfo<String> WINDOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WindowId").build();
    private static final MarshallingInfo<String> WINDOWTARGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowTargetId").build();
    private static final MarshallingInfo<Boolean> SAFE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Safe").build();

    private static final DeregisterTargetFromMaintenanceWindowRequestMarshaller instance = new DeregisterTargetFromMaintenanceWindowRequestMarshaller();

    public static DeregisterTargetFromMaintenanceWindowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest, ProtocolMarshaller protocolMarshaller) {

        if (deregisterTargetFromMaintenanceWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deregisterTargetFromMaintenanceWindowRequest.getWindowId(), WINDOWID_BINDING);
            protocolMarshaller.marshall(deregisterTargetFromMaintenanceWindowRequest.getWindowTargetId(), WINDOWTARGETID_BINDING);
            protocolMarshaller.marshall(deregisterTargetFromMaintenanceWindowRequest.getSafe(), SAFE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
