/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetStreamingSessionStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetStreamingSessionStreamRequestMarshaller {

    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<String> STREAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("streamId").build();
    private static final MarshallingInfo<String> STUDIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("studioId").build();

    private static final GetStreamingSessionStreamRequestMarshaller instance = new GetStreamingSessionStreamRequestMarshaller();

    public static GetStreamingSessionStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetStreamingSessionStreamRequest getStreamingSessionStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (getStreamingSessionStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getStreamingSessionStreamRequest.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(getStreamingSessionStreamRequest.getStreamId(), STREAMID_BINDING);
            protocolMarshaller.marshall(getStreamingSessionStreamRequest.getStudioId(), STUDIOID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
