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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ArtifactsConcatenationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ArtifactsConcatenationConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUDIO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Audio").build();
    private static final MarshallingInfo<StructuredPojo> VIDEO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Video").build();
    private static final MarshallingInfo<StructuredPojo> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Content").build();
    private static final MarshallingInfo<StructuredPojo> DATACHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataChannel").build();
    private static final MarshallingInfo<StructuredPojo> TRANSCRIPTIONMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TranscriptionMessages").build();
    private static final MarshallingInfo<StructuredPojo> MEETINGEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeetingEvents").build();
    private static final MarshallingInfo<StructuredPojo> COMPOSITEDVIDEO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompositedVideo").build();

    private static final ArtifactsConcatenationConfigurationMarshaller instance = new ArtifactsConcatenationConfigurationMarshaller();

    public static ArtifactsConcatenationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ArtifactsConcatenationConfiguration artifactsConcatenationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (artifactsConcatenationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(artifactsConcatenationConfiguration.getAudio(), AUDIO_BINDING);
            protocolMarshaller.marshall(artifactsConcatenationConfiguration.getVideo(), VIDEO_BINDING);
            protocolMarshaller.marshall(artifactsConcatenationConfiguration.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(artifactsConcatenationConfiguration.getDataChannel(), DATACHANNEL_BINDING);
            protocolMarshaller.marshall(artifactsConcatenationConfiguration.getTranscriptionMessages(), TRANSCRIPTIONMESSAGES_BINDING);
            protocolMarshaller.marshall(artifactsConcatenationConfiguration.getMeetingEvents(), MEETINGEVENTS_BINDING);
            protocolMarshaller.marshall(artifactsConcatenationConfiguration.getCompositedVideo(), COMPOSITEDVIDEO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
