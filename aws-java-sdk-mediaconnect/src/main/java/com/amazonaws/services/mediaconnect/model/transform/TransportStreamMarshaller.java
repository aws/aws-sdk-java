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
package com.amazonaws.services.mediaconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransportStreamMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransportStreamMarshaller {

    private static final MarshallingInfo<Integer> CHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channels").build();
    private static final MarshallingInfo<String> CODEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("codec").build();
    private static final MarshallingInfo<String> FRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("frameRate").build();
    private static final MarshallingInfo<StructuredPojo> FRAMERESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frameResolution").build();
    private static final MarshallingInfo<Integer> PID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pid").build();
    private static final MarshallingInfo<Integer> SAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleRate").build();
    private static final MarshallingInfo<Integer> SAMPLESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleSize").build();
    private static final MarshallingInfo<String> STREAMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamType").build();

    private static final TransportStreamMarshaller instance = new TransportStreamMarshaller();

    public static TransportStreamMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransportStream transportStream, ProtocolMarshaller protocolMarshaller) {

        if (transportStream == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transportStream.getChannels(), CHANNELS_BINDING);
            protocolMarshaller.marshall(transportStream.getCodec(), CODEC_BINDING);
            protocolMarshaller.marshall(transportStream.getFrameRate(), FRAMERATE_BINDING);
            protocolMarshaller.marshall(transportStream.getFrameResolution(), FRAMERESOLUTION_BINDING);
            protocolMarshaller.marshall(transportStream.getPid(), PID_BINDING);
            protocolMarshaller.marshall(transportStream.getSampleRate(), SAMPLERATE_BINDING);
            protocolMarshaller.marshall(transportStream.getSampleSize(), SAMPLESIZE_BINDING);
            protocolMarshaller.marshall(transportStream.getStreamType(), STREAMTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
