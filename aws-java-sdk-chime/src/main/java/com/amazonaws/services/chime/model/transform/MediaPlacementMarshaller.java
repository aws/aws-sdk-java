/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MediaPlacementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MediaPlacementMarshaller {

    private static final MarshallingInfo<String> AUDIOHOSTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioHostUrl").build();
    private static final MarshallingInfo<String> AUDIOFALLBACKURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioFallbackUrl").build();
    private static final MarshallingInfo<String> SCREENDATAURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScreenDataUrl").build();
    private static final MarshallingInfo<String> SCREENSHARINGURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScreenSharingUrl").build();
    private static final MarshallingInfo<String> SCREENVIEWINGURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScreenViewingUrl").build();
    private static final MarshallingInfo<String> SIGNALINGURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SignalingUrl").build();
    private static final MarshallingInfo<String> TURNCONTROLURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TurnControlUrl").build();

    private static final MediaPlacementMarshaller instance = new MediaPlacementMarshaller();

    public static MediaPlacementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MediaPlacement mediaPlacement, ProtocolMarshaller protocolMarshaller) {

        if (mediaPlacement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mediaPlacement.getAudioHostUrl(), AUDIOHOSTURL_BINDING);
            protocolMarshaller.marshall(mediaPlacement.getAudioFallbackUrl(), AUDIOFALLBACKURL_BINDING);
            protocolMarshaller.marshall(mediaPlacement.getScreenDataUrl(), SCREENDATAURL_BINDING);
            protocolMarshaller.marshall(mediaPlacement.getScreenSharingUrl(), SCREENSHARINGURL_BINDING);
            protocolMarshaller.marshall(mediaPlacement.getScreenViewingUrl(), SCREENVIEWINGURL_BINDING);
            protocolMarshaller.marshall(mediaPlacement.getSignalingUrl(), SIGNALINGURL_BINDING);
            protocolMarshaller.marshall(mediaPlacement.getTurnControlUrl(), TURNCONTROLURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
