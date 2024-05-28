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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KinesisVideoStreamSourceRuntimeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KinesisVideoStreamSourceRuntimeConfigurationMarshaller {

    private static final MarshallingInfo<List> STREAMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Streams").build();
    private static final MarshallingInfo<String> MEDIAENCODING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaEncoding").build();
    private static final MarshallingInfo<Integer> MEDIASAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaSampleRate").build();

    private static final KinesisVideoStreamSourceRuntimeConfigurationMarshaller instance = new KinesisVideoStreamSourceRuntimeConfigurationMarshaller();

    public static KinesisVideoStreamSourceRuntimeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KinesisVideoStreamSourceRuntimeConfiguration kinesisVideoStreamSourceRuntimeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (kinesisVideoStreamSourceRuntimeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kinesisVideoStreamSourceRuntimeConfiguration.getStreams(), STREAMS_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamSourceRuntimeConfiguration.getMediaEncoding(), MEDIAENCODING_BINDING);
            protocolMarshaller.marshall(kinesisVideoStreamSourceRuntimeConfiguration.getMediaSampleRate(), MEDIASAMPLERATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
