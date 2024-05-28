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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafka.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConsumerGroupReplicationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConsumerGroupReplicationMarshaller {

    private static final MarshallingInfo<List> CONSUMERGROUPSTOEXCLUDE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consumerGroupsToExclude").build();
    private static final MarshallingInfo<List> CONSUMERGROUPSTOREPLICATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consumerGroupsToReplicate").build();
    private static final MarshallingInfo<Boolean> DETECTANDCOPYNEWCONSUMERGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectAndCopyNewConsumerGroups").build();
    private static final MarshallingInfo<Boolean> SYNCHRONISECONSUMERGROUPOFFSETS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("synchroniseConsumerGroupOffsets").build();

    private static final ConsumerGroupReplicationMarshaller instance = new ConsumerGroupReplicationMarshaller();

    public static ConsumerGroupReplicationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConsumerGroupReplication consumerGroupReplication, ProtocolMarshaller protocolMarshaller) {

        if (consumerGroupReplication == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(consumerGroupReplication.getConsumerGroupsToExclude(), CONSUMERGROUPSTOEXCLUDE_BINDING);
            protocolMarshaller.marshall(consumerGroupReplication.getConsumerGroupsToReplicate(), CONSUMERGROUPSTOREPLICATE_BINDING);
            protocolMarshaller.marshall(consumerGroupReplication.getDetectAndCopyNewConsumerGroups(), DETECTANDCOPYNEWCONSUMERGROUPS_BINDING);
            protocolMarshaller.marshall(consumerGroupReplication.getSynchroniseConsumerGroupOffsets(), SYNCHRONISECONSUMERGROUPOFFSETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
