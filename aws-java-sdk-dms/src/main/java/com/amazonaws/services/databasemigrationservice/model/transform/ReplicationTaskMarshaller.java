/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplicationTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationTaskMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskIdentifier").build();
    private static final MarshallingInfo<String> SOURCEENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceEndpointArn").build();
    private static final MarshallingInfo<String> TARGETENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetEndpointArn").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceArn").build();
    private static final MarshallingInfo<String> MIGRATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationType").build();
    private static final MarshallingInfo<String> TABLEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableMappings").build();
    private static final MarshallingInfo<String> REPLICATIONTASKSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskSettings").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> LASTFAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastFailureMessage").build();
    private static final MarshallingInfo<String> STOPREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StopReason").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONTASKCREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskCreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REPLICATIONTASKSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CDCSTARTPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStartPosition").build();
    private static final MarshallingInfo<String> CDCSTOPPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStopPosition").build();
    private static final MarshallingInfo<String> RECOVERYCHECKPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryCheckpoint").build();
    private static final MarshallingInfo<String> REPLICATIONTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskArn").build();
    private static final MarshallingInfo<StructuredPojo> REPLICATIONTASKSTATS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskStats").build();

    private static final ReplicationTaskMarshaller instance = new ReplicationTaskMarshaller();

    public static ReplicationTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationTask replicationTask, ProtocolMarshaller protocolMarshaller) {

        if (replicationTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationTask.getReplicationTaskIdentifier(), REPLICATIONTASKIDENTIFIER_BINDING);
            protocolMarshaller.marshall(replicationTask.getSourceEndpointArn(), SOURCEENDPOINTARN_BINDING);
            protocolMarshaller.marshall(replicationTask.getTargetEndpointArn(), TARGETENDPOINTARN_BINDING);
            protocolMarshaller.marshall(replicationTask.getReplicationInstanceArn(), REPLICATIONINSTANCEARN_BINDING);
            protocolMarshaller.marshall(replicationTask.getMigrationType(), MIGRATIONTYPE_BINDING);
            protocolMarshaller.marshall(replicationTask.getTableMappings(), TABLEMAPPINGS_BINDING);
            protocolMarshaller.marshall(replicationTask.getReplicationTaskSettings(), REPLICATIONTASKSETTINGS_BINDING);
            protocolMarshaller.marshall(replicationTask.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(replicationTask.getLastFailureMessage(), LASTFAILUREMESSAGE_BINDING);
            protocolMarshaller.marshall(replicationTask.getStopReason(), STOPREASON_BINDING);
            protocolMarshaller.marshall(replicationTask.getReplicationTaskCreationDate(), REPLICATIONTASKCREATIONDATE_BINDING);
            protocolMarshaller.marshall(replicationTask.getReplicationTaskStartDate(), REPLICATIONTASKSTARTDATE_BINDING);
            protocolMarshaller.marshall(replicationTask.getCdcStartPosition(), CDCSTARTPOSITION_BINDING);
            protocolMarshaller.marshall(replicationTask.getCdcStopPosition(), CDCSTOPPOSITION_BINDING);
            protocolMarshaller.marshall(replicationTask.getRecoveryCheckpoint(), RECOVERYCHECKPOINT_BINDING);
            protocolMarshaller.marshall(replicationTask.getReplicationTaskArn(), REPLICATIONTASKARN_BINDING);
            protocolMarshaller.marshall(replicationTask.getReplicationTaskStats(), REPLICATIONTASKSTATS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
