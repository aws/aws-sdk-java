/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Scte35SegmentationDescriptorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Scte35SegmentationDescriptorMarshaller {

    private static final MarshallingInfo<StructuredPojo> DELIVERYRESTRICTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deliveryRestrictions").build();
    private static final MarshallingInfo<Integer> SEGMENTNUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentNum").build();
    private static final MarshallingInfo<String> SEGMENTATIONCANCELINDICATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationCancelIndicator").build();
    private static final MarshallingInfo<Long> SEGMENTATIONDURATION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationDuration").build();
    private static final MarshallingInfo<Long> SEGMENTATIONEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationEventId").build();
    private static final MarshallingInfo<Integer> SEGMENTATIONTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationTypeId").build();
    private static final MarshallingInfo<String> SEGMENTATIONUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationUpid").build();
    private static final MarshallingInfo<Integer> SEGMENTATIONUPIDTYPE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentationUpidType").build();
    private static final MarshallingInfo<Integer> SEGMENTSEXPECTED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentsExpected").build();
    private static final MarshallingInfo<Integer> SUBSEGMENTNUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subSegmentNum").build();
    private static final MarshallingInfo<Integer> SUBSEGMENTSEXPECTED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subSegmentsExpected").build();

    private static final Scte35SegmentationDescriptorMarshaller instance = new Scte35SegmentationDescriptorMarshaller();

    public static Scte35SegmentationDescriptorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Scte35SegmentationDescriptor scte35SegmentationDescriptor, ProtocolMarshaller protocolMarshaller) {

        if (scte35SegmentationDescriptor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getDeliveryRestrictions(), DELIVERYRESTRICTIONS_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentNum(), SEGMENTNUM_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentationCancelIndicator(), SEGMENTATIONCANCELINDICATOR_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentationDuration(), SEGMENTATIONDURATION_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentationEventId(), SEGMENTATIONEVENTID_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentationTypeId(), SEGMENTATIONTYPEID_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentationUpid(), SEGMENTATIONUPID_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentationUpidType(), SEGMENTATIONUPIDTYPE_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSegmentsExpected(), SEGMENTSEXPECTED_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSubSegmentNum(), SUBSEGMENTNUM_BINDING);
            protocolMarshaller.marshall(scte35SegmentationDescriptor.getSubSegmentsExpected(), SUBSEGMENTSEXPECTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
