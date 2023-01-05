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
package com.amazonaws.services.memorydb.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.memorydb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateClusterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateClusterRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIds").build();
    private static final MarshallingInfo<String> MAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceWindow").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicArn").build();
    private static final MarshallingInfo<String> SNSTOPICSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicStatus").build();
    private static final MarshallingInfo<String> PARAMETERGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterGroupName").build();
    private static final MarshallingInfo<String> SNAPSHOTWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotWindow").build();
    private static final MarshallingInfo<Integer> SNAPSHOTRETENTIONLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotRetentionLimit").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<StructuredPojo> REPLICACONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SHARDCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShardConfiguration").build();
    private static final MarshallingInfo<String> ACLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ACLName").build();

    private static final UpdateClusterRequestMarshaller instance = new UpdateClusterRequestMarshaller();

    public static UpdateClusterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateClusterRequest updateClusterRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateClusterRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getMaintenanceWindow(), MAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getSnsTopicStatus(), SNSTOPICSTATUS_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getParameterGroupName(), PARAMETERGROUPNAME_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getSnapshotWindow(), SNAPSHOTWINDOW_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getSnapshotRetentionLimit(), SNAPSHOTRETENTIONLIMIT_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getReplicaConfiguration(), REPLICACONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getShardConfiguration(), SHARDCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getACLName(), ACLNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
