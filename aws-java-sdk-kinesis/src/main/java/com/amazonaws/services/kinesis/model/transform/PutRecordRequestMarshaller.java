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
package com.amazonaws.services.kinesis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutRecordRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutRecordRequestMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> DATA_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Data").build();
    private static final MarshallingInfo<String> PARTITIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PartitionKey").build();
    private static final MarshallingInfo<String> EXPLICITHASHKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExplicitHashKey").build();
    private static final MarshallingInfo<String> SEQUENCENUMBERFORORDERING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SequenceNumberForOrdering").build();

    private static final PutRecordRequestMarshaller instance = new PutRecordRequestMarshaller();

    public static PutRecordRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutRecordRequest putRecordRequest, ProtocolMarshaller protocolMarshaller) {

        if (putRecordRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putRecordRequest.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(putRecordRequest.getData(), DATA_BINDING);
            protocolMarshaller.marshall(putRecordRequest.getPartitionKey(), PARTITIONKEY_BINDING);
            protocolMarshaller.marshall(putRecordRequest.getExplicitHashKey(), EXPLICITHASHKEY_BINDING);
            protocolMarshaller.marshall(putRecordRequest.getSequenceNumberForOrdering(), SEQUENCENUMBERFORORDERING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
