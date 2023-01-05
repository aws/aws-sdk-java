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
package com.amazonaws.services.pipes.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipeSourceManagedStreamingKafkaParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeSourceManagedStreamingKafkaParametersMarshaller {

    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();
    private static final MarshallingInfo<String> CONSUMERGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumerGroupID").build();
    private static final MarshallingInfo<StructuredPojo> CREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Credentials").build();
    private static final MarshallingInfo<Integer> MAXIMUMBATCHINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumBatchingWindowInSeconds").build();
    private static final MarshallingInfo<String> STARTINGPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingPosition").build();
    private static final MarshallingInfo<String> TOPICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TopicName").build();

    private static final PipeSourceManagedStreamingKafkaParametersMarshaller instance = new PipeSourceManagedStreamingKafkaParametersMarshaller();

    public static PipeSourceManagedStreamingKafkaParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeSourceManagedStreamingKafkaParameters pipeSourceManagedStreamingKafkaParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeSourceManagedStreamingKafkaParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeSourceManagedStreamingKafkaParameters.getBatchSize(), BATCHSIZE_BINDING);
            protocolMarshaller.marshall(pipeSourceManagedStreamingKafkaParameters.getConsumerGroupID(), CONSUMERGROUPID_BINDING);
            protocolMarshaller.marshall(pipeSourceManagedStreamingKafkaParameters.getCredentials(), CREDENTIALS_BINDING);
            protocolMarshaller.marshall(pipeSourceManagedStreamingKafkaParameters.getMaximumBatchingWindowInSeconds(), MAXIMUMBATCHINGWINDOWINSECONDS_BINDING);
            protocolMarshaller.marshall(pipeSourceManagedStreamingKafkaParameters.getStartingPosition(), STARTINGPOSITION_BINDING);
            protocolMarshaller.marshall(pipeSourceManagedStreamingKafkaParameters.getTopicName(), TOPICNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
