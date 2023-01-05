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
 * CreateClusterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateClusterRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterName").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<String> PARAMETERGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterGroupName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> NUMSHARDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumShards").build();
    private static final MarshallingInfo<Integer> NUMREPLICASPERSHARD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumReplicasPerShard").build();
    private static final MarshallingInfo<String> SUBNETGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetGroupName").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIds").build();
    private static final MarshallingInfo<String> MAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceWindow").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicArn").build();
    private static final MarshallingInfo<Boolean> TLSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSEnabled").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<List> SNAPSHOTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SnapshotArns").build();
    private static final MarshallingInfo<String> SNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotName").build();
    private static final MarshallingInfo<Integer> SNAPSHOTRETENTIONLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotRetentionLimit").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> SNAPSHOTWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotWindow").build();
    private static final MarshallingInfo<String> ACLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ACLName").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<Boolean> AUTOMINORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMinorVersionUpgrade").build();
    private static final MarshallingInfo<Boolean> DATATIERING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataTiering").build();

    private static final CreateClusterRequestMarshaller instance = new CreateClusterRequestMarshaller();

    public static CreateClusterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateClusterRequest createClusterRequest, ProtocolMarshaller protocolMarshaller) {

        if (createClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createClusterRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getParameterGroupName(), PARAMETERGROUPNAME_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getNumShards(), NUMSHARDS_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getNumReplicasPerShard(), NUMREPLICASPERSHARD_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSubnetGroupName(), SUBNETGROUPNAME_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getMaintenanceWindow(), MAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getTLSEnabled(), TLSENABLED_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSnapshotArns(), SNAPSHOTARNS_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSnapshotName(), SNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSnapshotRetentionLimit(), SNAPSHOTRETENTIONLIMIT_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSnapshotWindow(), SNAPSHOTWINDOW_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getACLName(), ACLNAME_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getAutoMinorVersionUpgrade(), AUTOMINORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getDataTiering(), DATATIERING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
