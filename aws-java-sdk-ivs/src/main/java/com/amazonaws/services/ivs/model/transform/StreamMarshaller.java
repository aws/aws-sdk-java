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
package com.amazonaws.services.ivs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamMarshaller {

    private static final MarshallingInfo<String> CHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channelArn").build();
    private static final MarshallingInfo<String> PLAYBACKURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("playbackUrl").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> HEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("health").build();
    private static final MarshallingInfo<Long> VIEWERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("viewerCount").build();

    private static final StreamMarshaller instance = new StreamMarshaller();

    public static StreamMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Stream stream, ProtocolMarshaller protocolMarshaller) {

        if (stream == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stream.getChannelArn(), CHANNELARN_BINDING);
            protocolMarshaller.marshall(stream.getPlaybackUrl(), PLAYBACKURL_BINDING);
            protocolMarshaller.marshall(stream.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(stream.getState(), STATE_BINDING);
            protocolMarshaller.marshall(stream.getHealth(), HEALTH_BINDING);
            protocolMarshaller.marshall(stream.getViewerCount(), VIEWERCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
