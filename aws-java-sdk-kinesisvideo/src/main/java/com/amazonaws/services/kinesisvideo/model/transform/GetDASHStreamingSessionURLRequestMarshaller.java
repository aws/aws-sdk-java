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
package com.amazonaws.services.kinesisvideo.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetDASHStreamingSessionURLRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetDASHStreamingSessionURLRequestMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<String> PLAYBACKMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlaybackMode").build();
    private static final MarshallingInfo<String> DISPLAYFRAGMENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayFragmentTimestamp").build();
    private static final MarshallingInfo<String> DISPLAYFRAGMENTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayFragmentNumber").build();
    private static final MarshallingInfo<StructuredPojo> DASHFRAGMENTSELECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DASHFragmentSelector").build();
    private static final MarshallingInfo<Integer> EXPIRES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Expires").build();
    private static final MarshallingInfo<Long> MAXMANIFESTFRAGMENTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxManifestFragmentResults").build();

    private static final GetDASHStreamingSessionURLRequestMarshaller instance = new GetDASHStreamingSessionURLRequestMarshaller();

    public static GetDASHStreamingSessionURLRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetDASHStreamingSessionURLRequest getDASHStreamingSessionURLRequest, ProtocolMarshaller protocolMarshaller) {

        if (getDASHStreamingSessionURLRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getPlaybackMode(), PLAYBACKMODE_BINDING);
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getDisplayFragmentTimestamp(), DISPLAYFRAGMENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getDisplayFragmentNumber(), DISPLAYFRAGMENTNUMBER_BINDING);
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getDASHFragmentSelector(), DASHFRAGMENTSELECTOR_BINDING);
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getExpires(), EXPIRES_BINDING);
            protocolMarshaller.marshall(getDASHStreamingSessionURLRequest.getMaxManifestFragmentResults(), MAXMANIFESTFRAGMENTRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
