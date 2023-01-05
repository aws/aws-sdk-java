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
 * ClusterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> PENDINGUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PendingUpdates").build();
    private static final MarshallingInfo<Integer> NUMBEROFSHARDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfShards").build();
    private static final MarshallingInfo<List> SHARDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Shards").build();
    private static final MarshallingInfo<String> AVAILABILITYMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityMode").build();
    private static final MarshallingInfo<StructuredPojo> CLUSTERENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterEndpoint").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> ENGINEPATCHVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnginePatchVersion").build();
    private static final MarshallingInfo<String> PARAMETERGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterGroupName").build();
    private static final MarshallingInfo<String> PARAMETERGROUPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterGroupStatus").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<String> SUBNETGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetGroupName").build();
    private static final MarshallingInfo<Boolean> TLSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSEnabled").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ARN").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicArn").build();
    private static final MarshallingInfo<String> SNSTOPICSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicStatus").build();
    private static final MarshallingInfo<Integer> SNAPSHOTRETENTIONLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotRetentionLimit").build();
    private static final MarshallingInfo<String> MAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceWindow").build();
    private static final MarshallingInfo<String> SNAPSHOTWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotWindow").build();
    private static final MarshallingInfo<String> ACLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ACLName").build();
    private static final MarshallingInfo<Boolean> AUTOMINORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMinorVersionUpgrade").build();
    private static final MarshallingInfo<String> DATATIERING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataTiering").build();

    private static final ClusterMarshaller instance = new ClusterMarshaller();

    public static ClusterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Cluster cluster, ProtocolMarshaller protocolMarshaller) {

        if (cluster == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cluster.getName(), NAME_BINDING);
            protocolMarshaller.marshall(cluster.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(cluster.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(cluster.getPendingUpdates(), PENDINGUPDATES_BINDING);
            protocolMarshaller.marshall(cluster.getNumberOfShards(), NUMBEROFSHARDS_BINDING);
            protocolMarshaller.marshall(cluster.getShards(), SHARDS_BINDING);
            protocolMarshaller.marshall(cluster.getAvailabilityMode(), AVAILABILITYMODE_BINDING);
            protocolMarshaller.marshall(cluster.getClusterEndpoint(), CLUSTERENDPOINT_BINDING);
            protocolMarshaller.marshall(cluster.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(cluster.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(cluster.getEnginePatchVersion(), ENGINEPATCHVERSION_BINDING);
            protocolMarshaller.marshall(cluster.getParameterGroupName(), PARAMETERGROUPNAME_BINDING);
            protocolMarshaller.marshall(cluster.getParameterGroupStatus(), PARAMETERGROUPSTATUS_BINDING);
            protocolMarshaller.marshall(cluster.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(cluster.getSubnetGroupName(), SUBNETGROUPNAME_BINDING);
            protocolMarshaller.marshall(cluster.getTLSEnabled(), TLSENABLED_BINDING);
            protocolMarshaller.marshall(cluster.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(cluster.getARN(), ARN_BINDING);
            protocolMarshaller.marshall(cluster.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(cluster.getSnsTopicStatus(), SNSTOPICSTATUS_BINDING);
            protocolMarshaller.marshall(cluster.getSnapshotRetentionLimit(), SNAPSHOTRETENTIONLIMIT_BINDING);
            protocolMarshaller.marshall(cluster.getMaintenanceWindow(), MAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(cluster.getSnapshotWindow(), SNAPSHOTWINDOW_BINDING);
            protocolMarshaller.marshall(cluster.getACLName(), ACLNAME_BINDING);
            protocolMarshaller.marshall(cluster.getAutoMinorVersionUpgrade(), AUTOMINORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(cluster.getDataTiering(), DATATIERING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
