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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMeetingDialOutRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMeetingDialOutRequestMarshaller {

    private static final MarshallingInfo<String> MEETINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("meetingId").build();
    private static final MarshallingInfo<String> FROMPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromPhoneNumber").build();
    private static final MarshallingInfo<String> TOPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ToPhoneNumber").build();
    private static final MarshallingInfo<String> JOINTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JoinToken").build();

    private static final CreateMeetingDialOutRequestMarshaller instance = new CreateMeetingDialOutRequestMarshaller();

    public static CreateMeetingDialOutRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMeetingDialOutRequest createMeetingDialOutRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMeetingDialOutRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMeetingDialOutRequest.getMeetingId(), MEETINGID_BINDING);
            protocolMarshaller.marshall(createMeetingDialOutRequest.getFromPhoneNumber(), FROMPHONENUMBER_BINDING);
            protocolMarshaller.marshall(createMeetingDialOutRequest.getToPhoneNumber(), TOPHONENUMBER_BINDING);
            protocolMarshaller.marshall(createMeetingDialOutRequest.getJoinToken(), JOINTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
