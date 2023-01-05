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
package com.amazonaws.services.chimesdkmeetings.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmeetings.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAttendeeCapabilitiesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAttendeeCapabilitiesRequestMarshaller {

    private static final MarshallingInfo<String> MEETINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("MeetingId").build();
    private static final MarshallingInfo<String> ATTENDEEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AttendeeId").build();
    private static final MarshallingInfo<StructuredPojo> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Capabilities").build();

    private static final UpdateAttendeeCapabilitiesRequestMarshaller instance = new UpdateAttendeeCapabilitiesRequestMarshaller();

    public static UpdateAttendeeCapabilitiesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAttendeeCapabilitiesRequest updateAttendeeCapabilitiesRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAttendeeCapabilitiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAttendeeCapabilitiesRequest.getMeetingId(), MEETINGID_BINDING);
            protocolMarshaller.marshall(updateAttendeeCapabilitiesRequest.getAttendeeId(), ATTENDEEID_BINDING);
            protocolMarshaller.marshall(updateAttendeeCapabilitiesRequest.getCapabilities(), CAPABILITIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
