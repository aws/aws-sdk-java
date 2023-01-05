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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipeSourceSelfManagedKafkaParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeSourceSelfManagedKafkaParametersMarshaller {

    private static final MarshallingInfo<List> ADDITIONALBOOTSTRAPSERVERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalBootstrapServers").build();
    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();
    private static final MarshallingInfo<String> CONSUMERGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumerGroupID").build();
    private static final MarshallingInfo<StructuredPojo> CREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Credentials").build();
    private static final MarshallingInfo<Integer> MAXIMUMBATCHINGWINDOWINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumBatchingWindowInSeconds").build();
    private static final MarshallingInfo<String> SERVERROOTCACERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerRootCaCertificate").build();
    private static final MarshallingInfo<String> STARTINGPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingPosition").build();
    private static final MarshallingInfo<String> TOPICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TopicName").build();
    private static final MarshallingInfo<StructuredPojo> VPC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Vpc").build();

    private static final PipeSourceSelfManagedKafkaParametersMarshaller instance = new PipeSourceSelfManagedKafkaParametersMarshaller();

    public static PipeSourceSelfManagedKafkaParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeSourceSelfManagedKafkaParameters pipeSourceSelfManagedKafkaParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeSourceSelfManagedKafkaParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getAdditionalBootstrapServers(), ADDITIONALBOOTSTRAPSERVERS_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getBatchSize(), BATCHSIZE_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getConsumerGroupID(), CONSUMERGROUPID_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getCredentials(), CREDENTIALS_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getMaximumBatchingWindowInSeconds(), MAXIMUMBATCHINGWINDOWINSECONDS_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getServerRootCaCertificate(), SERVERROOTCACERTIFICATE_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getStartingPosition(), STARTINGPOSITION_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getTopicName(), TOPICNAME_BINDING);
            protocolMarshaller.marshall(pipeSourceSelfManagedKafkaParameters.getVpc(), VPC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
