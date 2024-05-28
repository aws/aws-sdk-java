/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafka.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicationInfoDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationInfoDescriptionMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONSUMERGROUPREPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consumerGroupReplication").build();
    private static final MarshallingInfo<String> SOURCEKAFKACLUSTERALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceKafkaClusterAlias").build();
    private static final MarshallingInfo<String> TARGETCOMPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetCompressionType").build();
    private static final MarshallingInfo<String> TARGETKAFKACLUSTERALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetKafkaClusterAlias").build();
    private static final MarshallingInfo<StructuredPojo> TOPICREPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topicReplication").build();

    private static final ReplicationInfoDescriptionMarshaller instance = new ReplicationInfoDescriptionMarshaller();

    public static ReplicationInfoDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationInfoDescription replicationInfoDescription, ProtocolMarshaller protocolMarshaller) {

        if (replicationInfoDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationInfoDescription.getConsumerGroupReplication(), CONSUMERGROUPREPLICATION_BINDING);
            protocolMarshaller.marshall(replicationInfoDescription.getSourceKafkaClusterAlias(), SOURCEKAFKACLUSTERALIAS_BINDING);
            protocolMarshaller.marshall(replicationInfoDescription.getTargetCompressionType(), TARGETCOMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(replicationInfoDescription.getTargetKafkaClusterAlias(), TARGETKAFKACLUSTERALIAS_BINDING);
            protocolMarshaller.marshall(replicationInfoDescription.getTopicReplication(), TOPICREPLICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
