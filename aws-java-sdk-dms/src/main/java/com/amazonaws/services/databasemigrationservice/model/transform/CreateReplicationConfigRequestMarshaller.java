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
 * CreateReplicationConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateReplicationConfigRequestMarshaller {

    private static final MarshallingInfo<String> REPLICATIONCONFIGIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationConfigIdentifier").build();
    private static final MarshallingInfo<String> SOURCEENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceEndpointArn").build();
    private static final MarshallingInfo<String> TARGETENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetEndpointArn").build();
    private static final MarshallingInfo<StructuredPojo> COMPUTECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeConfig").build();
    private static final MarshallingInfo<String> REPLICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationType").build();
    private static final MarshallingInfo<String> TABLEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableMappings").build();
    private static final MarshallingInfo<String> REPLICATIONSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationSettings").build();
    private static final MarshallingInfo<String> SUPPLEMENTALSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupplementalSettings").build();
    private static final MarshallingInfo<String> RESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceIdentifier").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateReplicationConfigRequestMarshaller instance = new CreateReplicationConfigRequestMarshaller();

    public static CreateReplicationConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateReplicationConfigRequest createReplicationConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (createReplicationConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createReplicationConfigRequest.getReplicationConfigIdentifier(), REPLICATIONCONFIGIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getSourceEndpointArn(), SOURCEENDPOINTARN_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getTargetEndpointArn(), TARGETENDPOINTARN_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getComputeConfig(), COMPUTECONFIG_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getReplicationType(), REPLICATIONTYPE_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getTableMappings(), TABLEMAPPINGS_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getReplicationSettings(), REPLICATIONSETTINGS_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getSupplementalSettings(), SUPPLEMENTALSETTINGS_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getResourceIdentifier(), RESOURCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createReplicationConfigRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
