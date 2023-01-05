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
 * ClusterConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterConfigurationMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> MAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceWindow").build();
    private static final MarshallingInfo<String> TOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TopicArn").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> PARAMETERGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterGroupName").build();
    private static final MarshallingInfo<String> SUBNETGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetGroupName").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<Integer> SNAPSHOTRETENTIONLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotRetentionLimit").build();
    private static final MarshallingInfo<String> SNAPSHOTWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotWindow").build();
    private static final MarshallingInfo<Integer> NUMSHARDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumShards").build();
    private static final MarshallingInfo<List> SHARDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Shards").build();

    private static final ClusterConfigurationMarshaller instance = new ClusterConfigurationMarshaller();

    public static ClusterConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterConfiguration clusterConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (clusterConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterConfiguration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getMaintenanceWindow(), MAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getTopicArn(), TOPICARN_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getParameterGroupName(), PARAMETERGROUPNAME_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getSubnetGroupName(), SUBNETGROUPNAME_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getSnapshotRetentionLimit(), SNAPSHOTRETENTIONLIMIT_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getSnapshotWindow(), SNAPSHOTWINDOW_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getNumShards(), NUMSHARDS_BINDING);
            protocolMarshaller.marshall(clusterConfiguration.getShards(), SHARDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
