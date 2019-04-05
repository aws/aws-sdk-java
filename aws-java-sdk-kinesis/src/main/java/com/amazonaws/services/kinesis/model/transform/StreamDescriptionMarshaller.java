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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesis.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamDescriptionMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<String> STREAMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamStatus").build();
    private static final MarshallingInfo<List> SHARDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Shards").build();
    private static final MarshallingInfo<Boolean> HASMORESHARDS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasMoreShards").build();
    private static final MarshallingInfo<Integer> RETENTIONPERIODHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetentionPeriodHours").build();
    private static final MarshallingInfo<java.util.Date> STREAMCREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamCreationTimestamp").timestampFormat("unixTimestampInMillis").build();
    private static final MarshallingInfo<List> ENHANCEDMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnhancedMonitoring").build();
    private static final MarshallingInfo<String> ENCRYPTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionType").build();
    private static final MarshallingInfo<String> KEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyId").build();

    private static final StreamDescriptionMarshaller instance = new StreamDescriptionMarshaller();

    public static StreamDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamDescription streamDescription, ProtocolMarshaller protocolMarshaller) {

        if (streamDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamDescription.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(streamDescription.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(streamDescription.getStreamStatus(), STREAMSTATUS_BINDING);
            protocolMarshaller.marshall(streamDescription.getShards(), SHARDS_BINDING);
            protocolMarshaller.marshall(streamDescription.getHasMoreShards(), HASMORESHARDS_BINDING);
            protocolMarshaller.marshall(streamDescription.getRetentionPeriodHours(), RETENTIONPERIODHOURS_BINDING);
            protocolMarshaller.marshall(streamDescription.getStreamCreationTimestamp(), STREAMCREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(streamDescription.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
            protocolMarshaller.marshall(streamDescription.getEncryptionType(), ENCRYPTIONTYPE_BINDING);
            protocolMarshaller.marshall(streamDescription.getKeyId(), KEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
