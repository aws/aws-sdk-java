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
package com.amazonaws.services.kinesisvideo.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetHLSStreamingSessionURLRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetHLSStreamingSessionURLRequestMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<String> PLAYBACKMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlaybackMode").build();
    private static final MarshallingInfo<StructuredPojo> HLSFRAGMENTSELECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HLSFragmentSelector").build();
    private static final MarshallingInfo<String> CONTAINERFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerFormat").build();
    private static final MarshallingInfo<String> DISCONTINUITYMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiscontinuityMode").build();
    private static final MarshallingInfo<String> DISPLAYFRAGMENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayFragmentTimestamp").build();
    private static final MarshallingInfo<Integer> EXPIRES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Expires").build();
    private static final MarshallingInfo<Long> MAXMEDIAPLAYLISTFRAGMENTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxMediaPlaylistFragmentResults").build();

    private static final GetHLSStreamingSessionURLRequestMarshaller instance = new GetHLSStreamingSessionURLRequestMarshaller();

    public static GetHLSStreamingSessionURLRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetHLSStreamingSessionURLRequest getHLSStreamingSessionURLRequest, ProtocolMarshaller protocolMarshaller) {

        if (getHLSStreamingSessionURLRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getPlaybackMode(), PLAYBACKMODE_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getHLSFragmentSelector(), HLSFRAGMENTSELECTOR_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getContainerFormat(), CONTAINERFORMAT_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getDiscontinuityMode(), DISCONTINUITYMODE_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getDisplayFragmentTimestamp(), DISPLAYFRAGMENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getExpires(), EXPIRES_BINDING);
            protocolMarshaller.marshall(getHLSStreamingSessionURLRequest.getMaxMediaPlaylistFragmentResults(), MAXMEDIAPLAYLISTFRAGMENTRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
