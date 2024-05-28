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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsDmsReplicationTaskDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsDmsReplicationTaskDetailsMarshaller {

    private static final MarshallingInfo<String> CDCSTARTPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStartPosition").build();
    private static final MarshallingInfo<String> CDCSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStartTime").build();
    private static final MarshallingInfo<String> CDCSTOPPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStopPosition").build();
    private static final MarshallingInfo<String> MIGRATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationType").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> RESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceIdentifier").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceArn").build();
    private static final MarshallingInfo<String> REPLICATIONTASKIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskIdentifier").build();
    private static final MarshallingInfo<String> REPLICATIONTASKSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskSettings").build();
    private static final MarshallingInfo<String> SOURCEENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceEndpointArn").build();
    private static final MarshallingInfo<String> TABLEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableMappings").build();
    private static final MarshallingInfo<String> TARGETENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetEndpointArn").build();
    private static final MarshallingInfo<String> TASKDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TaskData").build();

    private static final AwsDmsReplicationTaskDetailsMarshaller instance = new AwsDmsReplicationTaskDetailsMarshaller();

    public static AwsDmsReplicationTaskDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsDmsReplicationTaskDetails awsDmsReplicationTaskDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsDmsReplicationTaskDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getCdcStartPosition(), CDCSTARTPOSITION_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getCdcStartTime(), CDCSTARTTIME_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getCdcStopPosition(), CDCSTOPPOSITION_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getMigrationType(), MIGRATIONTYPE_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getResourceIdentifier(), RESOURCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getReplicationInstanceArn(), REPLICATIONINSTANCEARN_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getReplicationTaskIdentifier(), REPLICATIONTASKIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getReplicationTaskSettings(), REPLICATIONTASKSETTINGS_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getSourceEndpointArn(), SOURCEENDPOINTARN_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getTableMappings(), TABLEMAPPINGS_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getTargetEndpointArn(), TARGETENDPOINTARN_BINDING);
            protocolMarshaller.marshall(awsDmsReplicationTaskDetails.getTaskData(), TASKDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
