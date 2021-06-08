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
package com.amazonaws.services.connectcontactlens.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectcontactlens.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TranscriptMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TranscriptMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> PARTICIPANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantId").build();
    private static final MarshallingInfo<String> PARTICIPANTROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantRole").build();
    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Content").build();
    private static final MarshallingInfo<Integer> BEGINOFFSETMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BeginOffsetMillis").build();
    private static final MarshallingInfo<Integer> ENDOFFSETMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndOffsetMillis").build();
    private static final MarshallingInfo<String> SENTIMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sentiment").build();
    private static final MarshallingInfo<List> ISSUESDETECTED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssuesDetected").build();

    private static final TranscriptMarshaller instance = new TranscriptMarshaller();

    public static TranscriptMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Transcript transcript, ProtocolMarshaller protocolMarshaller) {

        if (transcript == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transcript.getId(), ID_BINDING);
            protocolMarshaller.marshall(transcript.getParticipantId(), PARTICIPANTID_BINDING);
            protocolMarshaller.marshall(transcript.getParticipantRole(), PARTICIPANTROLE_BINDING);
            protocolMarshaller.marshall(transcript.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(transcript.getBeginOffsetMillis(), BEGINOFFSETMILLIS_BINDING);
            protocolMarshaller.marshall(transcript.getEndOffsetMillis(), ENDOFFSETMILLIS_BINDING);
            protocolMarshaller.marshall(transcript.getSentiment(), SENTIMENT_BINDING);
            protocolMarshaller.marshall(transcript.getIssuesDetected(), ISSUESDETECTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
