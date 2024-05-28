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
 * ReplicatorSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicatorSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CURRENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentVersion").build();
    private static final MarshallingInfo<Boolean> ISREPLICATORREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isReplicatorReference").build();
    private static final MarshallingInfo<List> KAFKACLUSTERSSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kafkaClustersSummary").build();
    private static final MarshallingInfo<List> REPLICATIONINFOSUMMARYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationInfoSummaryList").build();
    private static final MarshallingInfo<String> REPLICATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicatorArn").build();
    private static final MarshallingInfo<String> REPLICATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicatorName").build();
    private static final MarshallingInfo<String> REPLICATORRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicatorResourceArn").build();
    private static final MarshallingInfo<String> REPLICATORSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicatorState").build();

    private static final ReplicatorSummaryMarshaller instance = new ReplicatorSummaryMarshaller();

    public static ReplicatorSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicatorSummary replicatorSummary, ProtocolMarshaller protocolMarshaller) {

        if (replicatorSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicatorSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getCurrentVersion(), CURRENTVERSION_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getIsReplicatorReference(), ISREPLICATORREFERENCE_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getKafkaClustersSummary(), KAFKACLUSTERSSUMMARY_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getReplicationInfoSummaryList(), REPLICATIONINFOSUMMARYLIST_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getReplicatorArn(), REPLICATORARN_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getReplicatorName(), REPLICATORNAME_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getReplicatorResourceArn(), REPLICATORRESOURCEARN_BINDING);
            protocolMarshaller.marshall(replicatorSummary.getReplicatorState(), REPLICATORSTATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
