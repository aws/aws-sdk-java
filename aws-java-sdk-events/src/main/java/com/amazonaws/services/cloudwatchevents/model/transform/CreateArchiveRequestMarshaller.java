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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateArchiveRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateArchiveRequestMarshaller {

    private static final MarshallingInfo<String> ARCHIVENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ArchiveName").build();
    private static final MarshallingInfo<String> EVENTSOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSourceArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> EVENTPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventPattern").build();
    private static final MarshallingInfo<Integer> RETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetentionDays").build();

    private static final CreateArchiveRequestMarshaller instance = new CreateArchiveRequestMarshaller();

    public static CreateArchiveRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateArchiveRequest createArchiveRequest, ProtocolMarshaller protocolMarshaller) {

        if (createArchiveRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createArchiveRequest.getArchiveName(), ARCHIVENAME_BINDING);
            protocolMarshaller.marshall(createArchiveRequest.getEventSourceArn(), EVENTSOURCEARN_BINDING);
            protocolMarshaller.marshall(createArchiveRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createArchiveRequest.getEventPattern(), EVENTPATTERN_BINDING);
            protocolMarshaller.marshall(createArchiveRequest.getRetentionDays(), RETENTIONDAYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
