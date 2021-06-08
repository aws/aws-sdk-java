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
 * SnoozeAlarmActionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnoozeAlarmActionRequestMarshaller {

    private static final MarshallingInfo<String> REQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("requestId").build();
    private static final MarshallingInfo<String> ALARMMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("alarmModelName").build();
    private static final MarshallingInfo<String> KEYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("keyValue").build();
    private static final MarshallingInfo<String> NOTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("note").build();
    private static final MarshallingInfo<Integer> SNOOZEDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snoozeDuration").build();

    private static final SnoozeAlarmActionRequestMarshaller instance = new SnoozeAlarmActionRequestMarshaller();

    public static SnoozeAlarmActionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnoozeAlarmActionRequest snoozeAlarmActionRequest, ProtocolMarshaller protocolMarshaller) {

        if (snoozeAlarmActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snoozeAlarmActionRequest.getRequestId(), REQUESTID_BINDING);
            protocolMarshaller.marshall(snoozeAlarmActionRequest.getAlarmModelName(), ALARMMODELNAME_BINDING);
            protocolMarshaller.marshall(snoozeAlarmActionRequest.getKeyValue(), KEYVALUE_BINDING);
            protocolMarshaller.marshall(snoozeAlarmActionRequest.getNote(), NOTE_BINDING);
            protocolMarshaller.marshall(snoozeAlarmActionRequest.getSnoozeDuration(), SNOOZEDURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
