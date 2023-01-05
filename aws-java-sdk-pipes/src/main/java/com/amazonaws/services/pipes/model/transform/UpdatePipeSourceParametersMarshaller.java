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
 * UpdatePipeSourceParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePipeSourceParametersMarshaller {

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

    private static final UpdatePipeSourceParametersMarshaller instance = new UpdatePipeSourceParametersMarshaller();

    public static UpdatePipeSourceParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePipeSourceParameters updatePipeSourceParameters, ProtocolMarshaller protocolMarshaller) {

        if (updatePipeSourceParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePipeSourceParameters.getActiveMQBrokerParameters(), ACTIVEMQBROKERPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceParameters.getDynamoDBStreamParameters(), DYNAMODBSTREAMPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceParameters.getFilterCriteria(), FILTERCRITERIA_BINDING);
            protocolMarshaller.marshall(updatePipeSourceParameters.getKinesisStreamParameters(), KINESISSTREAMPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceParameters.getManagedStreamingKafkaParameters(), MANAGEDSTREAMINGKAFKAPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceParameters.getRabbitMQBrokerParameters(), RABBITMQBROKERPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceParameters.getSelfManagedKafkaParameters(), SELFMANAGEDKAFKAPARAMETERS_BINDING);
            protocolMarshaller.marshall(updatePipeSourceParameters.getSqsQueueParameters(), SQSQUEUEPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
