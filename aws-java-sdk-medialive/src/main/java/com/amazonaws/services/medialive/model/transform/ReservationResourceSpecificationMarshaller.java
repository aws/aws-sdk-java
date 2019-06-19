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
 * ReservationResourceSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservationResourceSpecificationMarshaller {

    private static final MarshallingInfo<String> CHANNELCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channelClass").build();
    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("codec").build();
    private static final MarshallingInfo<String> MAXIMUMBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumBitrate").build();
    private static final MarshallingInfo<String> MAXIMUMFRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumFramerate").build();
    private static final MarshallingInfo<String> RESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolution").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> SPECIALFEATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("specialFeature").build();
    private static final MarshallingInfo<String> VIDEOQUALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoQuality").build();

    private static final ReservationResourceSpecificationMarshaller instance = new ReservationResourceSpecificationMarshaller();

    public static ReservationResourceSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservationResourceSpecification reservationResourceSpecification, ProtocolMarshaller protocolMarshaller) {

        if (reservationResourceSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservationResourceSpecification.getChannelClass(), CHANNELCLASS_BINDING);
            protocolMarshaller.marshall(reservationResourceSpecification.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(reservationResourceSpecification.getMaximumBitrate(), MAXIMUMBITRATE_BINDING);
            protocolMarshaller.marshall(reservationResourceSpecification.getMaximumFramerate(), MAXIMUMFRAMERATE_BINDING);
            protocolMarshaller.marshall(reservationResourceSpecification.getResolution(), RESOLUTION_BINDING);
            protocolMarshaller.marshall(reservationResourceSpecification.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(reservationResourceSpecification.getSpecialFeature(), SPECIALFEATURE_BINDING);
            protocolMarshaller.marshall(reservationResourceSpecification.getVideoQuality(), VIDEOQUALITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
