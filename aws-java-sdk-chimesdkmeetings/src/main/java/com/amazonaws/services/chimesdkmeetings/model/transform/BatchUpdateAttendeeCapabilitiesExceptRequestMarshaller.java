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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmeetings.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchUpdateAttendeeCapabilitiesExceptRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchUpdateAttendeeCapabilitiesExceptRequestMarshaller {

    private static final MarshallingInfo<String> MEETINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("MeetingId").build();
    private static final MarshallingInfo<List> EXCLUDEDATTENDEEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludedAttendeeIds").build();
    private static final MarshallingInfo<StructuredPojo> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Capabilities").build();

    private static final BatchUpdateAttendeeCapabilitiesExceptRequestMarshaller instance = new BatchUpdateAttendeeCapabilitiesExceptRequestMarshaller();

    public static BatchUpdateAttendeeCapabilitiesExceptRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchUpdateAttendeeCapabilitiesExceptRequest batchUpdateAttendeeCapabilitiesExceptRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchUpdateAttendeeCapabilitiesExceptRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchUpdateAttendeeCapabilitiesExceptRequest.getMeetingId(), MEETINGID_BINDING);
            protocolMarshaller.marshall(batchUpdateAttendeeCapabilitiesExceptRequest.getExcludedAttendeeIds(), EXCLUDEDATTENDEEIDS_BINDING);
            protocolMarshaller.marshall(batchUpdateAttendeeCapabilitiesExceptRequest.getCapabilities(), CAPABILITIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
