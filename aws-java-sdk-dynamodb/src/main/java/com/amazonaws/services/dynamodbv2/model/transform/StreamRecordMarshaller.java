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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamRecordMarshaller {

    private static final MarshallingInfo<java.util.Date> APPROXIMATECREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApproximateCreationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> KEYS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Keys").build();
    private static final MarshallingInfo<Map> NEWIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NewImage").build();
    private static final MarshallingInfo<Map> OLDIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OldImage").build();
    private static final MarshallingInfo<String> SEQUENCENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SequenceNumber").build();
    private static final MarshallingInfo<Long> SIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SizeBytes").build();
    private static final MarshallingInfo<String> STREAMVIEWTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamViewType").build();

    private static final StreamRecordMarshaller instance = new StreamRecordMarshaller();

    public static StreamRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamRecord streamRecord, ProtocolMarshaller protocolMarshaller) {

        if (streamRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamRecord.getApproximateCreationDateTime(), APPROXIMATECREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(streamRecord.getKeys(), KEYS_BINDING);
            protocolMarshaller.marshall(streamRecord.getNewImage(), NEWIMAGE_BINDING);
            protocolMarshaller.marshall(streamRecord.getOldImage(), OLDIMAGE_BINDING);
            protocolMarshaller.marshall(streamRecord.getSequenceNumber(), SEQUENCENUMBER_BINDING);
            protocolMarshaller.marshall(streamRecord.getSizeBytes(), SIZEBYTES_BINDING);
            protocolMarshaller.marshall(streamRecord.getStreamViewType(), STREAMVIEWTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
