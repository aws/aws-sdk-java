/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KafkaActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KafkaActionMarshaller {

    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationArn").build();
    private static final MarshallingInfo<String> TOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("topic").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<String> PARTITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("partition").build();
    private static final MarshallingInfo<Map> CLIENTPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientProperties").build();

    private static final KafkaActionMarshaller instance = new KafkaActionMarshaller();

    public static KafkaActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KafkaAction kafkaAction, ProtocolMarshaller protocolMarshaller) {

        if (kafkaAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kafkaAction.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(kafkaAction.getTopic(), TOPIC_BINDING);
            protocolMarshaller.marshall(kafkaAction.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(kafkaAction.getPartition(), PARTITION_BINDING);
            protocolMarshaller.marshall(kafkaAction.getClientProperties(), CLIENTPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
