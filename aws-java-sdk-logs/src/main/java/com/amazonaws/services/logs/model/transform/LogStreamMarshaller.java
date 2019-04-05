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
package com.amazonaws.services.logs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LogStreamMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LogStreamMarshaller {

    private static final MarshallingInfo<String> LOGSTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logStreamName").build();
    private static final MarshallingInfo<Long> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("creationTime").build();
    private static final MarshallingInfo<Long> FIRSTEVENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstEventTimestamp").build();
    private static final MarshallingInfo<Long> LASTEVENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastEventTimestamp").build();
    private static final MarshallingInfo<Long> LASTINGESTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastIngestionTime").build();
    private static final MarshallingInfo<String> UPLOADSEQUENCETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uploadSequenceToken").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<Long> STOREDBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("storedBytes").build();

    private static final LogStreamMarshaller instance = new LogStreamMarshaller();

    public static LogStreamMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LogStream logStream, ProtocolMarshaller protocolMarshaller) {

        if (logStream == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(logStream.getLogStreamName(), LOGSTREAMNAME_BINDING);
            protocolMarshaller.marshall(logStream.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(logStream.getFirstEventTimestamp(), FIRSTEVENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(logStream.getLastEventTimestamp(), LASTEVENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(logStream.getLastIngestionTime(), LASTINGESTIONTIME_BINDING);
            protocolMarshaller.marshall(logStream.getUploadSequenceToken(), UPLOADSEQUENCETOKEN_BINDING);
            protocolMarshaller.marshall(logStream.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(logStream.getStoredBytes(), STOREDBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
