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
 * MeetingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MeetingMarshaller {

    private static final MarshallingInfo<String> MEETINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MeetingId").build();
    private static final MarshallingInfo<String> MEETINGHOSTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeetingHostId").build();
    private static final MarshallingInfo<String> EXTERNALMEETINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalMeetingId").build();
    private static final MarshallingInfo<String> MEDIAREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaRegion").build();
    private static final MarshallingInfo<StructuredPojo> MEDIAPLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaPlacement").build();
    private static final MarshallingInfo<StructuredPojo> MEETINGFEATURES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeetingFeatures").build();
    private static final MarshallingInfo<String> PRIMARYMEETINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryMeetingId").build();
    private static final MarshallingInfo<List> TENANTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TenantIds").build();
    private static final MarshallingInfo<String> MEETINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeetingArn").build();

    private static final MeetingMarshaller instance = new MeetingMarshaller();

    public static MeetingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Meeting meeting, ProtocolMarshaller protocolMarshaller) {

        if (meeting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(meeting.getMeetingId(), MEETINGID_BINDING);
            protocolMarshaller.marshall(meeting.getMeetingHostId(), MEETINGHOSTID_BINDING);
            protocolMarshaller.marshall(meeting.getExternalMeetingId(), EXTERNALMEETINGID_BINDING);
            protocolMarshaller.marshall(meeting.getMediaRegion(), MEDIAREGION_BINDING);
            protocolMarshaller.marshall(meeting.getMediaPlacement(), MEDIAPLACEMENT_BINDING);
            protocolMarshaller.marshall(meeting.getMeetingFeatures(), MEETINGFEATURES_BINDING);
            protocolMarshaller.marshall(meeting.getPrimaryMeetingId(), PRIMARYMEETINGID_BINDING);
            protocolMarshaller.marshall(meeting.getTenantIds(), TENANTIDS_BINDING);
            protocolMarshaller.marshall(meeting.getMeetingArn(), MEETINGARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
