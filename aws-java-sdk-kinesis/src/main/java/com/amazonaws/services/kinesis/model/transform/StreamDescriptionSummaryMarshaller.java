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
 * StreamDescriptionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamDescriptionSummaryMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<String> STREAMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamStatus").build();
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
    private static final MarshallingInfo<Integer> OPENSHARDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OpenShardCount").build();
    private static final MarshallingInfo<Integer> CONSUMERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumerCount").build();

    private static final StreamDescriptionSummaryMarshaller instance = new StreamDescriptionSummaryMarshaller();

    public static StreamDescriptionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamDescriptionSummary streamDescriptionSummary, ProtocolMarshaller protocolMarshaller) {

        if (streamDescriptionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamDescriptionSummary.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getStreamStatus(), STREAMSTATUS_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getRetentionPeriodHours(), RETENTIONPERIODHOURS_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getStreamCreationTimestamp(), STREAMCREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getEnhancedMonitoring(), ENHANCEDMONITORING_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getEncryptionType(), ENCRYPTIONTYPE_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getKeyId(), KEYID_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getOpenShardCount(), OPENSHARDCOUNT_BINDING);
            protocolMarshaller.marshall(streamDescriptionSummary.getConsumerCount(), CONSUMERCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
