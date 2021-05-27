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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAlarmModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAlarmModelRequestMarshaller {

    private static final MarshallingInfo<String> ALARMMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmModelName").build();
    private static final MarshallingInfo<String> ALARMMODELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmModelDescription").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
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

    private static final CreateAlarmModelRequestMarshaller instance = new CreateAlarmModelRequestMarshaller();

    public static CreateAlarmModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAlarmModelRequest createAlarmModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAlarmModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAlarmModelRequest.getAlarmModelName(), ALARMMODELNAME_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getAlarmModelDescription(), ALARMMODELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getAlarmRule(), ALARMRULE_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getAlarmNotification(), ALARMNOTIFICATION_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getAlarmEventActions(), ALARMEVENTACTIONS_BINDING);
            protocolMarshaller.marshall(createAlarmModelRequest.getAlarmCapabilities(), ALARMCAPABILITIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
