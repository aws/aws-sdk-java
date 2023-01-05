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
 * LiveConnectorRTMPConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LiveConnectorRTMPConfigurationMarshaller {

    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();
    private static final MarshallingInfo<String> AUDIOCHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioChannels").build();
    private static final MarshallingInfo<String> AUDIOSAMPLERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioSampleRate").build();

    private static final LiveConnectorRTMPConfigurationMarshaller instance = new LiveConnectorRTMPConfigurationMarshaller();

    public static LiveConnectorRTMPConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LiveConnectorRTMPConfiguration liveConnectorRTMPConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (liveConnectorRTMPConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(liveConnectorRTMPConfiguration.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(liveConnectorRTMPConfiguration.getAudioChannels(), AUDIOCHANNELS_BINDING);
            protocolMarshaller.marshall(liveConnectorRTMPConfiguration.getAudioSampleRate(), AUDIOSAMPLERATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
