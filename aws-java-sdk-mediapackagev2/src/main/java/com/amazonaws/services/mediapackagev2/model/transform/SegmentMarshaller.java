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
package com.amazonaws.services.mediapackagev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SegmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SegmentMarshaller {

    private static final MarshallingInfo<Integer> SEGMENTDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentDurationSeconds").build();
    private static final MarshallingInfo<String> SEGMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentName").build();
    private static final MarshallingInfo<Boolean> TSUSEAUDIORENDITIONGROUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TsUseAudioRenditionGroup").build();
    private static final MarshallingInfo<Boolean> INCLUDEIFRAMEONLYSTREAMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeIframeOnlyStreams").build();
    private static final MarshallingInfo<Boolean> TSINCLUDEDVBSUBTITLES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TsIncludeDvbSubtitles").build();
    private static final MarshallingInfo<StructuredPojo> SCTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Scte").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encryption").build();

    private static final SegmentMarshaller instance = new SegmentMarshaller();

    public static SegmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Segment segment, ProtocolMarshaller protocolMarshaller) {

        if (segment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(segment.getSegmentDurationSeconds(), SEGMENTDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(segment.getSegmentName(), SEGMENTNAME_BINDING);
            protocolMarshaller.marshall(segment.getTsUseAudioRenditionGroup(), TSUSEAUDIORENDITIONGROUP_BINDING);
            protocolMarshaller.marshall(segment.getIncludeIframeOnlyStreams(), INCLUDEIFRAMEONLYSTREAMS_BINDING);
            protocolMarshaller.marshall(segment.getTsIncludeDvbSubtitles(), TSINCLUDEDVBSUBTITLES_BINDING);
            protocolMarshaller.marshall(segment.getScte(), SCTE_BINDING);
            protocolMarshaller.marshall(segment.getEncryption(), ENCRYPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
