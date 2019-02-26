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
 * PutMediaRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutMediaRequestMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("x-amzn-stream-name").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("x-amzn-stream-arn").build();
    private static final MarshallingInfo<String> FRAGMENTTIMECODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amzn-fragment-timecode-type").build();
    private static final MarshallingInfo<java.util.Date> PRODUCERSTARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amzn-producer-start-timestamp").timestampFormat("unknown").build();
    private static final MarshallingInfo<java.io.InputStream> PAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();

    private static final PutMediaRequestMarshaller instance = new PutMediaRequestMarshaller();

    public static PutMediaRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutMediaRequest putMediaRequest, ProtocolMarshaller protocolMarshaller) {

        if (putMediaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putMediaRequest.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(putMediaRequest.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(putMediaRequest.getFragmentTimecodeType(), FRAGMENTTIMECODETYPE_BINDING);
            protocolMarshaller.marshall(putMediaRequest.getProducerStartTimestamp(), PRODUCERSTARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(putMediaRequest.getPayload(), PAYLOAD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
