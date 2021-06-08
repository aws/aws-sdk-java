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
package com.amazonaws.services.iotevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAlarmModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAlarmModelRequestMarshaller {

    private static final MarshallingInfo<String> ALARMMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("alarmModelName").build();
    private static final MarshallingInfo<String> ALARMMODELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmModelDescription").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<Integer> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("severity").build();
    private static final MarshallingInfo<StructuredPojo> ALARMRULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmRule").build();
    private static final MarshallingInfo<StructuredPojo> ALARMNOTIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmNotification").build();
    private static final MarshallingInfo<StructuredPojo> ALARMEVENTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmEventActions").build();
    private static final MarshallingInfo<StructuredPojo> ALARMCAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmCapabilities").build();

    private static final UpdateAlarmModelRequestMarshaller instance = new UpdateAlarmModelRequestMarshaller();

    public static UpdateAlarmModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAlarmModelRequest updateAlarmModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAlarmModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAlarmModelRequest.getAlarmModelName(), ALARMMODELNAME_BINDING);
            protocolMarshaller.marshall(updateAlarmModelRequest.getAlarmModelDescription(), ALARMMODELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAlarmModelRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateAlarmModelRequest.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(updateAlarmModelRequest.getAlarmRule(), ALARMRULE_BINDING);
            protocolMarshaller.marshall(updateAlarmModelRequest.getAlarmNotification(), ALARMNOTIFICATION_BINDING);
            protocolMarshaller.marshall(updateAlarmModelRequest.getAlarmEventActions(), ALARMEVENTACTIONS_BINDING);
            protocolMarshaller.marshall(updateAlarmModelRequest.getAlarmCapabilities(), ALARMCAPABILITIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
