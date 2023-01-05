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
package com.amazonaws.services.mediaconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MaintenanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MaintenanceMarshaller {

    private static final MarshallingInfo<String> MAINTENANCEDAY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maintenanceDay").build();
    private static final MarshallingInfo<String> MAINTENANCEDEADLINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maintenanceDeadline").build();
    private static final MarshallingInfo<String> MAINTENANCESCHEDULEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maintenanceScheduledDate").build();
    private static final MarshallingInfo<String> MAINTENANCESTARTHOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maintenanceStartHour").build();

    private static final MaintenanceMarshaller instance = new MaintenanceMarshaller();

    public static MaintenanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Maintenance maintenance, ProtocolMarshaller protocolMarshaller) {

        if (maintenance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(maintenance.getMaintenanceDay(), MAINTENANCEDAY_BINDING);
            protocolMarshaller.marshall(maintenance.getMaintenanceDeadline(), MAINTENANCEDEADLINE_BINDING);
            protocolMarshaller.marshall(maintenance.getMaintenanceScheduledDate(), MAINTENANCESCHEDULEDDATE_BINDING);
            protocolMarshaller.marshall(maintenance.getMaintenanceStartHour(), MAINTENANCESTARTHOUR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
