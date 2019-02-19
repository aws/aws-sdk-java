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
 * CreateMaintenanceWindowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMaintenanceWindowRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartDate").build();
    private static final MarshallingInfo<String> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EndDate").build();
    private static final MarshallingInfo<String> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Schedule").build();
    private static final MarshallingInfo<String> SCHEDULETIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleTimezone").build();
    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Duration").build();
    private static final MarshallingInfo<Integer> CUTOFF_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Cutoff").build();
    private static final MarshallingInfo<Boolean> ALLOWUNASSOCIATEDTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowUnassociatedTargets").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateMaintenanceWindowRequestMarshaller instance = new CreateMaintenanceWindowRequestMarshaller();

    public static CreateMaintenanceWindowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMaintenanceWindowRequest createMaintenanceWindowRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMaintenanceWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getEndDate(), ENDDATE_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getScheduleTimezone(), SCHEDULETIMEZONE_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getCutoff(), CUTOFF_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getAllowUnassociatedTargets(), ALLOWUNASSOCIATEDTARGETS_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createMaintenanceWindowRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
