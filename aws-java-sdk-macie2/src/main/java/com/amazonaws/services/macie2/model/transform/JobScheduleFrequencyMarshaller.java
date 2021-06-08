/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobScheduleFrequencyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobScheduleFrequencyMarshaller {

    private static final MarshallingInfo<StructuredPojo> DAILYSCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dailySchedule").build();
    private static final MarshallingInfo<StructuredPojo> MONTHLYSCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("monthlySchedule").build();
    private static final MarshallingInfo<StructuredPojo> WEEKLYSCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("weeklySchedule").build();

    private static final JobScheduleFrequencyMarshaller instance = new JobScheduleFrequencyMarshaller();

    public static JobScheduleFrequencyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobScheduleFrequency jobScheduleFrequency, ProtocolMarshaller protocolMarshaller) {

        if (jobScheduleFrequency == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobScheduleFrequency.getDailySchedule(), DAILYSCHEDULE_BINDING);
            protocolMarshaller.marshall(jobScheduleFrequency.getMonthlySchedule(), MONTHLYSCHEDULE_BINDING);
            protocolMarshaller.marshall(jobScheduleFrequency.getWeeklySchedule(), WEEKLYSCHEDULE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
