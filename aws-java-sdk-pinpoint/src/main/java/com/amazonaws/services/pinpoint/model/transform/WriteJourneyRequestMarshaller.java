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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WriteJourneyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WriteJourneyRequestMarshaller {

    private static final MarshallingInfo<Map> ACTIVITIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Activities").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();
    private static final MarshallingInfo<StructuredPojo> LIMITS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Limits").build();
    private static final MarshallingInfo<Boolean> LOCALTIME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalTime").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> QUIETTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuietTime").build();
    private static final MarshallingInfo<String> REFRESHFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshFrequency").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedule").build();
    private static final MarshallingInfo<String> STARTACTIVITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartActivity").build();
    private static final MarshallingInfo<StructuredPojo> STARTCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartCondition").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<Boolean> WAITFORQUIETTIME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WaitForQuietTime").build();
    private static final MarshallingInfo<Boolean> REFRESHONSEGMENTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshOnSegmentUpdate").build();
    private static final MarshallingInfo<StructuredPojo> JOURNEYCHANNELSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JourneyChannelSettings").build();
    private static final MarshallingInfo<Boolean> SENDINGSCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SendingSchedule").build();
    private static final MarshallingInfo<StructuredPojo> OPENHOURS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenHours").build();
    private static final MarshallingInfo<StructuredPojo> CLOSEDDAYS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClosedDays").build();

    private static final WriteJourneyRequestMarshaller instance = new WriteJourneyRequestMarshaller();

    public static WriteJourneyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WriteJourneyRequest writeJourneyRequest, ProtocolMarshaller protocolMarshaller) {

        if (writeJourneyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(writeJourneyRequest.getActivities(), ACTIVITIES_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getLimits(), LIMITS_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getLocalTime(), LOCALTIME_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getQuietTime(), QUIETTIME_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getRefreshFrequency(), REFRESHFREQUENCY_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getStartActivity(), STARTACTIVITY_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getStartCondition(), STARTCONDITION_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getState(), STATE_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getWaitForQuietTime(), WAITFORQUIETTIME_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getRefreshOnSegmentUpdate(), REFRESHONSEGMENTUPDATE_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getJourneyChannelSettings(), JOURNEYCHANNELSETTINGS_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getSendingSchedule(), SENDINGSCHEDULE_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getOpenHours(), OPENHOURS_BINDING);
            protocolMarshaller.marshall(writeJourneyRequest.getClosedDays(), CLOSEDDAYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
