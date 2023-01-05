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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KafkaStreamingSourceOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KafkaStreamingSourceOptionsMarshaller {

    private static final MarshallingInfo<String> BOOTSTRAPSERVERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BootstrapServers").build();
    private static final MarshallingInfo<String> SECURITYPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityProtocol").build();
    private static final MarshallingInfo<String> CONNECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionName").build();
    private static final MarshallingInfo<String> TOPICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TopicName").build();
    private static final MarshallingInfo<String> ASSIGN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Assign").build();
    private static final MarshallingInfo<String> SUBSCRIBEPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscribePattern").build();
    private static final MarshallingInfo<String> CLASSIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Classification").build();
    private static final MarshallingInfo<String> DELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Delimiter").build();
    private static final MarshallingInfo<String> STARTINGOFFSETS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingOffsets").build();
    private static final MarshallingInfo<String> ENDINGOFFSETS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndingOffsets").build();
    private static final MarshallingInfo<Long> POLLTIMEOUTMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PollTimeoutMs").build();
    private static final MarshallingInfo<Integer> NUMRETRIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumRetries").build();
    private static final MarshallingInfo<Long> RETRYINTERVALMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryIntervalMs").build();
    private static final MarshallingInfo<Long> MAXOFFSETSPERTRIGGER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxOffsetsPerTrigger").build();
    private static final MarshallingInfo<Integer> MINPARTITIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinPartitions").build();

    private static final KafkaStreamingSourceOptionsMarshaller instance = new KafkaStreamingSourceOptionsMarshaller();

    public static KafkaStreamingSourceOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KafkaStreamingSourceOptions kafkaStreamingSourceOptions, ProtocolMarshaller protocolMarshaller) {

        if (kafkaStreamingSourceOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getBootstrapServers(), BOOTSTRAPSERVERS_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getSecurityProtocol(), SECURITYPROTOCOL_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getConnectionName(), CONNECTIONNAME_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getTopicName(), TOPICNAME_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getAssign(), ASSIGN_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getSubscribePattern(), SUBSCRIBEPATTERN_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getClassification(), CLASSIFICATION_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getDelimiter(), DELIMITER_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getStartingOffsets(), STARTINGOFFSETS_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getEndingOffsets(), ENDINGOFFSETS_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getPollTimeoutMs(), POLLTIMEOUTMS_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getNumRetries(), NUMRETRIES_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getRetryIntervalMs(), RETRYINTERVALMS_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getMaxOffsetsPerTrigger(), MAXOFFSETSPERTRIGGER_BINDING);
            protocolMarshaller.marshall(kafkaStreamingSourceOptions.getMinPartitions(), MINPARTITIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
