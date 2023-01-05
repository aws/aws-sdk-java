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
package com.amazonaws.services.kinesis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamSummaryMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<String> STREAMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamStatus").build();
    private static final MarshallingInfo<StructuredPojo> STREAMMODEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamModeDetails").build();
    private static final MarshallingInfo<java.util.Date> STREAMCREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamCreationTimestamp").timestampFormat("unixTimestampInMillis").build();

    private static final StreamSummaryMarshaller instance = new StreamSummaryMarshaller();

    public static StreamSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamSummary streamSummary, ProtocolMarshaller protocolMarshaller) {

        if (streamSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamSummary.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(streamSummary.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(streamSummary.getStreamStatus(), STREAMSTATUS_BINDING);
            protocolMarshaller.marshall(streamSummary.getStreamModeDetails(), STREAMMODEDETAILS_BINDING);
            protocolMarshaller.marshall(streamSummary.getStreamCreationTimestamp(), STREAMCREATIONTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
