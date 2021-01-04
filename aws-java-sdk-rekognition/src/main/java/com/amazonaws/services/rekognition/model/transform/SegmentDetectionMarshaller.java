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
package com.amazonaws.services.rekognition.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rekognition.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SegmentDetectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SegmentDetectionMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<Long> STARTTIMESTAMPMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimestampMillis").build();
    private static final MarshallingInfo<Long> ENDTIMESTAMPMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTimestampMillis").build();
    private static final MarshallingInfo<Long> DURATIONMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationMillis").build();
    private static final MarshallingInfo<String> STARTTIMECODESMPTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimecodeSMPTE").build();
    private static final MarshallingInfo<String> ENDTIMECODESMPTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTimecodeSMPTE").build();
    private static final MarshallingInfo<String> DURATIONSMPTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationSMPTE").build();
    private static final MarshallingInfo<StructuredPojo> TECHNICALCUESEGMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TechnicalCueSegment").build();
    private static final MarshallingInfo<StructuredPojo> SHOTSEGMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShotSegment").build();

    private static final SegmentDetectionMarshaller instance = new SegmentDetectionMarshaller();

    public static SegmentDetectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SegmentDetection segmentDetection, ProtocolMarshaller protocolMarshaller) {

        if (segmentDetection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(segmentDetection.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(segmentDetection.getStartTimestampMillis(), STARTTIMESTAMPMILLIS_BINDING);
            protocolMarshaller.marshall(segmentDetection.getEndTimestampMillis(), ENDTIMESTAMPMILLIS_BINDING);
            protocolMarshaller.marshall(segmentDetection.getDurationMillis(), DURATIONMILLIS_BINDING);
            protocolMarshaller.marshall(segmentDetection.getStartTimecodeSMPTE(), STARTTIMECODESMPTE_BINDING);
            protocolMarshaller.marshall(segmentDetection.getEndTimecodeSMPTE(), ENDTIMECODESMPTE_BINDING);
            protocolMarshaller.marshall(segmentDetection.getDurationSMPTE(), DURATIONSMPTE_BINDING);
            protocolMarshaller.marshall(segmentDetection.getTechnicalCueSegment(), TECHNICALCUESEGMENT_BINDING);
            protocolMarshaller.marshall(segmentDetection.getShotSegment(), SHOTSEGMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
