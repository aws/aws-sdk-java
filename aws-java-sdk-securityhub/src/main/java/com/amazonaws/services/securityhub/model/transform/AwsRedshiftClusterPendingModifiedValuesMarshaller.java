/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsRedshiftClusterPendingModifiedValuesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRedshiftClusterPendingModifiedValuesMarshaller {

    private static final MarshallingInfo<Integer> AUTOMATEDSNAPSHOTRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutomatedSnapshotRetentionPeriod").build();
    private static final MarshallingInfo<String> CLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterIdentifier").build();
    private static final MarshallingInfo<String> CLUSTERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterType").build();
    private static final MarshallingInfo<String> CLUSTERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterVersion").build();
    private static final MarshallingInfo<String> ENCRYPTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionType").build();
    private static final MarshallingInfo<Boolean> ENHANCEDVPCROUTING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnhancedVpcRouting").build();
    private static final MarshallingInfo<String> MAINTENANCETRACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceTrackName").build();
    private static final MarshallingInfo<String> MASTERUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterUserPassword").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<Integer> NUMBEROFNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfNodes").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PubliclyAccessible").build();

    private static final AwsRedshiftClusterPendingModifiedValuesMarshaller instance = new AwsRedshiftClusterPendingModifiedValuesMarshaller();

    public static AwsRedshiftClusterPendingModifiedValuesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRedshiftClusterPendingModifiedValues awsRedshiftClusterPendingModifiedValues, ProtocolMarshaller protocolMarshaller) {

        if (awsRedshiftClusterPendingModifiedValues == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller
                    .marshall(awsRedshiftClusterPendingModifiedValues.getAutomatedSnapshotRetentionPeriod(), AUTOMATEDSNAPSHOTRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getClusterIdentifier(), CLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getClusterType(), CLUSTERTYPE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getClusterVersion(), CLUSTERVERSION_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getEncryptionType(), ENCRYPTIONTYPE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getEnhancedVpcRouting(), ENHANCEDVPCROUTING_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getMaintenanceTrackName(), MAINTENANCETRACKNAME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getMasterUserPassword(), MASTERUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getNumberOfNodes(), NUMBEROFNODES_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterPendingModifiedValues.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
