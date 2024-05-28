/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RealTimeContactAnalysisSegmentTranscriptMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RealTimeContactAnalysisSegmentTranscriptMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> PARTICIPANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantId").build();
    private static final MarshallingInfo<String> PARTICIPANTROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantRole").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Content").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentType").build();
    private static final MarshallingInfo<StructuredPojo> TIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Time").build();
    private static final MarshallingInfo<StructuredPojo> REDACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Redaction").build();
    private static final MarshallingInfo<String> SENTIMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sentiment").build();

    private static final RealTimeContactAnalysisSegmentTranscriptMarshaller instance = new RealTimeContactAnalysisSegmentTranscriptMarshaller();

    public static RealTimeContactAnalysisSegmentTranscriptMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RealTimeContactAnalysisSegmentTranscript realTimeContactAnalysisSegmentTranscript, ProtocolMarshaller protocolMarshaller) {

        if (realTimeContactAnalysisSegmentTranscript == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getId(), ID_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getParticipantId(), PARTICIPANTID_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getParticipantRole(), PARTICIPANTROLE_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getTime(), TIME_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getRedaction(), REDACTION_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentTranscript.getSentiment(), SENTIMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
