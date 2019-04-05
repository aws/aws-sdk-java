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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WeeklyAutoScalingScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WeeklyAutoScalingScheduleMarshaller {

    private static final MarshallingInfo<Map> MONDAY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Monday").build();
    private static final MarshallingInfo<Map> TUESDAY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tuesday").build();
    private static final MarshallingInfo<Map> WEDNESDAY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Wednesday").build();
    private static final MarshallingInfo<Map> THURSDAY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Thursday").build();
    private static final MarshallingInfo<Map> FRIDAY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Friday").build();
    private static final MarshallingInfo<Map> SATURDAY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Saturday").build();
    private static final MarshallingInfo<Map> SUNDAY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sunday").build();

    private static final WeeklyAutoScalingScheduleMarshaller instance = new WeeklyAutoScalingScheduleMarshaller();

    public static WeeklyAutoScalingScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WeeklyAutoScalingSchedule weeklyAutoScalingSchedule, ProtocolMarshaller protocolMarshaller) {

        if (weeklyAutoScalingSchedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(weeklyAutoScalingSchedule.getMonday(), MONDAY_BINDING);
            protocolMarshaller.marshall(weeklyAutoScalingSchedule.getTuesday(), TUESDAY_BINDING);
            protocolMarshaller.marshall(weeklyAutoScalingSchedule.getWednesday(), WEDNESDAY_BINDING);
            protocolMarshaller.marshall(weeklyAutoScalingSchedule.getThursday(), THURSDAY_BINDING);
            protocolMarshaller.marshall(weeklyAutoScalingSchedule.getFriday(), FRIDAY_BINDING);
            protocolMarshaller.marshall(weeklyAutoScalingSchedule.getSaturday(), SATURDAY_BINDING);
            protocolMarshaller.marshall(weeklyAutoScalingSchedule.getSunday(), SUNDAY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
