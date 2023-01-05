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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SegmentationDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SegmentationDescriptorMarshaller {

    private static final MarshallingInfo<Integer> SEGMENTNUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentNum").build();
    private static final MarshallingInfo<Integer> SEGMENTATIONEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentationEventId").build();
    private static final MarshallingInfo<Integer> SEGMENTATIONTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentationTypeId").build();
    private static final MarshallingInfo<String> SEGMENTATIONUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentationUpid").build();
    private static final MarshallingInfo<Integer> SEGMENTATIONUPIDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentationUpidType").build();
    private static final MarshallingInfo<Integer> SEGMENTSEXPECTED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentsExpected").build();
    private static final MarshallingInfo<Integer> SUBSEGMENTNUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubSegmentNum").build();
    private static final MarshallingInfo<Integer> SUBSEGMENTSEXPECTED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubSegmentsExpected").build();

    private static final SegmentationDescriptorMarshaller instance = new SegmentationDescriptorMarshaller();

    public static SegmentationDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SegmentationDescriptor segmentationDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (segmentationDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(segmentationDescriptor.getSegmentNum(), SEGMENTNUM_BINDING);
            protocolMarshaller.marshall(segmentationDescriptor.getSegmentationEventId(), SEGMENTATIONEVENTID_BINDING);
            protocolMarshaller.marshall(segmentationDescriptor.getSegmentationTypeId(), SEGMENTATIONTYPEID_BINDING);
            protocolMarshaller.marshall(segmentationDescriptor.getSegmentationUpid(), SEGMENTATIONUPID_BINDING);
            protocolMarshaller.marshall(segmentationDescriptor.getSegmentationUpidType(), SEGMENTATIONUPIDTYPE_BINDING);
            protocolMarshaller.marshall(segmentationDescriptor.getSegmentsExpected(), SEGMENTSEXPECTED_BINDING);
            protocolMarshaller.marshall(segmentationDescriptor.getSubSegmentNum(), SUBSEGMENTNUM_BINDING);
            protocolMarshaller.marshall(segmentationDescriptor.getSubSegmentsExpected(), SUBSEGMENTSEXPECTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
