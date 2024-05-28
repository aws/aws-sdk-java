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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RefreshScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RefreshScheduleMarshaller {

    private static final MarshallingInfo<String> SCHEDULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleId").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULEFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleFrequency").build();
    private static final MarshallingInfo<java.util.Date> STARTAFTERDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartAfterDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REFRESHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshType").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();

    private static final RefreshScheduleMarshaller instance = new RefreshScheduleMarshaller();

    public static RefreshScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RefreshSchedule refreshSchedule, ProtocolMarshaller protocolMarshaller) {

        if (refreshSchedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(refreshSchedule.getScheduleId(), SCHEDULEID_BINDING);
            protocolMarshaller.marshall(refreshSchedule.getScheduleFrequency(), SCHEDULEFREQUENCY_BINDING);
            protocolMarshaller.marshall(refreshSchedule.getStartAfterDateTime(), STARTAFTERDATETIME_BINDING);
            protocolMarshaller.marshall(refreshSchedule.getRefreshType(), REFRESHTYPE_BINDING);
            protocolMarshaller.marshall(refreshSchedule.getArn(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
