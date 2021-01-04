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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMeetingWithAttendeesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMeetingWithAttendeesRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> EXTERNALMEETINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalMeetingId").build();
    private static final MarshallingInfo<String> MEETINGHOSTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeetingHostId").build();
    private static final MarshallingInfo<String> MEDIAREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaRegion").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationsConfiguration").build();
    private static final MarshallingInfo<List> ATTENDEES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attendees").build();

    private static final CreateMeetingWithAttendeesRequestMarshaller instance = new CreateMeetingWithAttendeesRequestMarshaller();

    public static CreateMeetingWithAttendeesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMeetingWithAttendeesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMeetingWithAttendeesRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createMeetingWithAttendeesRequest.getExternalMeetingId(), EXTERNALMEETINGID_BINDING);
            protocolMarshaller.marshall(createMeetingWithAttendeesRequest.getMeetingHostId(), MEETINGHOSTID_BINDING);
            protocolMarshaller.marshall(createMeetingWithAttendeesRequest.getMediaRegion(), MEDIAREGION_BINDING);
            protocolMarshaller.marshall(createMeetingWithAttendeesRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createMeetingWithAttendeesRequest.getNotificationsConfiguration(), NOTIFICATIONSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createMeetingWithAttendeesRequest.getAttendees(), ATTENDEES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
