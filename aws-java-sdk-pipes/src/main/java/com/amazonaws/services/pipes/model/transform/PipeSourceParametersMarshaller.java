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
 * PipeSourceParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeSourceParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTIVEMQBROKERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveMQBrokerParameters").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMODBSTREAMPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamoDBStreamParameters").build();
    private static final MarshallingInfo<StructuredPojo> FILTERCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterCriteria").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamParameters").build();
    private static final MarshallingInfo<StructuredPojo> MANAGEDSTREAMINGKAFKAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedStreamingKafkaParameters").build();
    private static final MarshallingInfo<StructuredPojo> RABBITMQBROKERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RabbitMQBrokerParameters").build();
    private static final MarshallingInfo<StructuredPojo> SELFMANAGEDKAFKAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelfManagedKafkaParameters").build();
    private static final MarshallingInfo<StructuredPojo> SQSQUEUEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqsQueueParameters").build();

    private static final PipeSourceParametersMarshaller instance = new PipeSourceParametersMarshaller();

    public static PipeSourceParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeSourceParameters pipeSourceParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeSourceParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeSourceParameters.getActiveMQBrokerParameters(), ACTIVEMQBROKERPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeSourceParameters.getDynamoDBStreamParameters(), DYNAMODBSTREAMPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeSourceParameters.getFilterCriteria(), FILTERCRITERIA_BINDING);
            protocolMarshaller.marshall(pipeSourceParameters.getKinesisStreamParameters(), KINESISSTREAMPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeSourceParameters.getManagedStreamingKafkaParameters(), MANAGEDSTREAMINGKAFKAPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeSourceParameters.getRabbitMQBrokerParameters(), RABBITMQBROKERPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeSourceParameters.getSelfManagedKafkaParameters(), SELFMANAGEDKAFKAPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeSourceParameters.getSqsQueueParameters(), SQSQUEUEPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
