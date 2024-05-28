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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationMarshaller {

    private static final MarshallingInfo<String> REPLICATIONCONFIGIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationConfigIdentifier").build();
    private static final MarshallingInfo<String> REPLICATIONCONFIGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationConfigArn").build();
    private static final MarshallingInfo<String> SOURCEENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceEndpointArn").build();
    private static final MarshallingInfo<String> TARGETENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetEndpointArn").build();
    private static final MarshallingInfo<String> REPLICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionData").build();
    private static final MarshallingInfo<String> STOPREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StopReason").build();
    private static final MarshallingInfo<List> FAILUREMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureMessages").build();
    private static final MarshallingInfo<StructuredPojo> REPLICATIONSTATS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationStats").build();
    private static final MarshallingInfo<String> STARTREPLICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartReplicationType").build();
    private static final MarshallingInfo<java.util.Date> CDCSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CDCSTARTPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStartPosition").build();
    private static final MarshallingInfo<String> CDCSTOPPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStopPosition").build();
    private static final MarshallingInfo<String> RECOVERYCHECKPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryCheckpoint").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONCREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationCreateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationUpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONLASTSTOPTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationLastStopTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONDEPROVISIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationDeprovisionTime").timestampFormat("unixTimestamp").build();

    private static final ReplicationMarshaller instance = new ReplicationMarshaller();

    public static ReplicationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Replication replication, ProtocolMarshaller protocolMarshaller) {

        if (replication == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replication.getReplicationConfigIdentifier(), REPLICATIONCONFIGIDENTIFIER_BINDING);
            protocolMarshaller.marshall(replication.getReplicationConfigArn(), REPLICATIONCONFIGARN_BINDING);
            protocolMarshaller.marshall(replication.getSourceEndpointArn(), SOURCEENDPOINTARN_BINDING);
            protocolMarshaller.marshall(replication.getTargetEndpointArn(), TARGETENDPOINTARN_BINDING);
            protocolMarshaller.marshall(replication.getReplicationType(), REPLICATIONTYPE_BINDING);
            protocolMarshaller.marshall(replication.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(replication.getProvisionData(), PROVISIONDATA_BINDING);
            protocolMarshaller.marshall(replication.getStopReason(), STOPREASON_BINDING);
            protocolMarshaller.marshall(replication.getFailureMessages(), FAILUREMESSAGES_BINDING);
            protocolMarshaller.marshall(replication.getReplicationStats(), REPLICATIONSTATS_BINDING);
            protocolMarshaller.marshall(replication.getStartReplicationType(), STARTREPLICATIONTYPE_BINDING);
            protocolMarshaller.marshall(replication.getCdcStartTime(), CDCSTARTTIME_BINDING);
            protocolMarshaller.marshall(replication.getCdcStartPosition(), CDCSTARTPOSITION_BINDING);
            protocolMarshaller.marshall(replication.getCdcStopPosition(), CDCSTOPPOSITION_BINDING);
            protocolMarshaller.marshall(replication.getRecoveryCheckpoint(), RECOVERYCHECKPOINT_BINDING);
            protocolMarshaller.marshall(replication.getReplicationCreateTime(), REPLICATIONCREATETIME_BINDING);
            protocolMarshaller.marshall(replication.getReplicationUpdateTime(), REPLICATIONUPDATETIME_BINDING);
            protocolMarshaller.marshall(replication.getReplicationLastStopTime(), REPLICATIONLASTSTOPTIME_BINDING);
            protocolMarshaller.marshall(replication.getReplicationDeprovisionTime(), REPLICATIONDEPROVISIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
