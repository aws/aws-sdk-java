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
package com.amazonaws.services.ivs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamSessionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamSessionMarshaller {

    private static final MarshallingInfo<StructuredPojo> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channel").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> INGESTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ingestConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> RECORDINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordingConfiguration").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STREAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("streamId").build();
    private static final MarshallingInfo<List> TRUNCATEDEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("truncatedEvents").build();

    private static final StreamSessionMarshaller instance = new StreamSessionMarshaller();

    public static StreamSessionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamSession streamSession, ProtocolMarshaller protocolMarshaller) {

        if (streamSession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamSession.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(streamSession.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(streamSession.getIngestConfiguration(), INGESTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(streamSession.getRecordingConfiguration(), RECORDINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(streamSession.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(streamSession.getStreamId(), STREAMID_BINDING);
            protocolMarshaller.marshall(streamSession.getTruncatedEvents(), TRUNCATEDEVENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
