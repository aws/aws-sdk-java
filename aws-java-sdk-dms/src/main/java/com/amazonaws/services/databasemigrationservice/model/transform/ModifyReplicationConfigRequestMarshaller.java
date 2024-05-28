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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModifyReplicationConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModifyReplicationConfigRequestMarshaller {

    private static final MarshallingInfo<String> REPLICATIONCONFIGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationConfigArn").build();
    private static final MarshallingInfo<String> REPLICATIONCONFIGIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationConfigIdentifier").build();
    private static final MarshallingInfo<String> REPLICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationType").build();
    private static final MarshallingInfo<String> TABLEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableMappings").build();
    private static final MarshallingInfo<String> REPLICATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationSettings").build();
    private static final MarshallingInfo<String> SUPPLEMENTALSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupplementalSettings").build();
    private static final MarshallingInfo<StructuredPojo> COMPUTECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeConfig").build();
    private static final MarshallingInfo<String> SOURCEENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceEndpointArn").build();
    private static final MarshallingInfo<String> TARGETENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetEndpointArn").build();

    private static final ModifyReplicationConfigRequestMarshaller instance = new ModifyReplicationConfigRequestMarshaller();

    public static ModifyReplicationConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModifyReplicationConfigRequest modifyReplicationConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (modifyReplicationConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getReplicationConfigArn(), REPLICATIONCONFIGARN_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getReplicationConfigIdentifier(), REPLICATIONCONFIGIDENTIFIER_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getReplicationType(), REPLICATIONTYPE_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getTableMappings(), TABLEMAPPINGS_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getReplicationSettings(), REPLICATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getSupplementalSettings(), SUPPLEMENTALSETTINGS_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getComputeConfig(), COMPUTECONFIG_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getSourceEndpointArn(), SOURCEENDPOINTARN_BINDING);
            protocolMarshaller.marshall(modifyReplicationConfigRequest.getTargetEndpointArn(), TARGETENDPOINTARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
