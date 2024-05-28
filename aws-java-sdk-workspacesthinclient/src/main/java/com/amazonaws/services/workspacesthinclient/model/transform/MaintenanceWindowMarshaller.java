/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesthinclient.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesthinclient.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MaintenanceWindowMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MaintenanceWindowMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<Integer> STARTTIMEHOUR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimeHour").build();
    private static final MarshallingInfo<Integer> STARTTIMEMINUTE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimeMinute").build();
    private static final MarshallingInfo<Integer> ENDTIMEHOUR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTimeHour").build();
    private static final MarshallingInfo<Integer> ENDTIMEMINUTE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTimeMinute").build();
    private static final MarshallingInfo<List> DAYSOFTHEWEEK_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("daysOfTheWeek").build();
    private static final MarshallingInfo<String> APPLYTIMEOF_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applyTimeOf").build();

    private static final MaintenanceWindowMarshaller instance = new MaintenanceWindowMarshaller();

    public static MaintenanceWindowMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MaintenanceWindow maintenanceWindow, ProtocolMarshaller protocolMarshaller) {

        if (maintenanceWindow == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(maintenanceWindow.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(maintenanceWindow.getStartTimeHour(), STARTTIMEHOUR_BINDING);
            protocolMarshaller.marshall(maintenanceWindow.getStartTimeMinute(), STARTTIMEMINUTE_BINDING);
            protocolMarshaller.marshall(maintenanceWindow.getEndTimeHour(), ENDTIMEHOUR_BINDING);
            protocolMarshaller.marshall(maintenanceWindow.getEndTimeMinute(), ENDTIMEMINUTE_BINDING);
            protocolMarshaller.marshall(maintenanceWindow.getDaysOfTheWeek(), DAYSOFTHEWEEK_BINDING);
            protocolMarshaller.marshall(maintenanceWindow.getApplyTimeOf(), APPLYTIMEOF_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
