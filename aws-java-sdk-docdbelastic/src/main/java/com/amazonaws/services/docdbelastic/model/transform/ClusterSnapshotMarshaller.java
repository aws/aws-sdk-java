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
package com.amazonaws.services.docdbelastic.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.docdbelastic.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClusterSnapshotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterSnapshotMarshaller {

    private static final MarshallingInfo<String> ADMINUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminUserName").build();
    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<String> CLUSTERCREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterCreationTime").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> SNAPSHOTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotArn").build();
    private static final MarshallingInfo<String> SNAPSHOTCREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotCreationTime").build();
    private static final MarshallingInfo<String> SNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetIds").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcSecurityGroupIds").build();

    private static final ClusterSnapshotMarshaller instance = new ClusterSnapshotMarshaller();

    public static ClusterSnapshotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterSnapshot clusterSnapshot, ProtocolMarshaller protocolMarshaller) {

        if (clusterSnapshot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterSnapshot.getAdminUserName(), ADMINUSERNAME_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getClusterCreationTime(), CLUSTERCREATIONTIME_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getSnapshotArn(), SNAPSHOTARN_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getSnapshotCreationTime(), SNAPSHOTCREATIONTIME_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getSnapshotName(), SNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(clusterSnapshot.getVpcSecurityGroupIds(), VPCSECURITYGROUPIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
