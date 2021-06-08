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
package com.amazonaws.services.ioteventsdata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ioteventsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlarmSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlarmSummaryMarshaller {

    private static final MarshallingInfo<String> ALARMMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmModelName").build();
    private static final MarshallingInfo<String> ALARMMODELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmModelVersion").build();
    private static final MarshallingInfo<String> KEYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("keyValue").build();
    private static final MarshallingInfo<String> STATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stateName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdateTime").timestampFormat("unixTimestamp").build();

    private static final AlarmSummaryMarshaller instance = new AlarmSummaryMarshaller();

    public static AlarmSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AlarmSummary alarmSummary, ProtocolMarshaller protocolMarshaller) {

        if (alarmSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(alarmSummary.getAlarmModelName(), ALARMMODELNAME_BINDING);
            protocolMarshaller.marshall(alarmSummary.getAlarmModelVersion(), ALARMMODELVERSION_BINDING);
            protocolMarshaller.marshall(alarmSummary.getKeyValue(), KEYVALUE_BINDING);
            protocolMarshaller.marshall(alarmSummary.getStateName(), STATENAME_BINDING);
            protocolMarshaller.marshall(alarmSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(alarmSummary.getLastUpdateTime(), LASTUPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
