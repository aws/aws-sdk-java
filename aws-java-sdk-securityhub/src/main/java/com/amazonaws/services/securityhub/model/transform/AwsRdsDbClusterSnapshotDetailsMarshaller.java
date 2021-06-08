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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRdsDbClusterSnapshotDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbClusterSnapshotDetailsMarshaller {

    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();
    private static final MarshallingInfo<String> SNAPSHOTCREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotCreateTime").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Engine").build();
    private static final MarshallingInfo<Integer> ALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedStorage").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> CLUSTERCREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterCreateTime").build();
    private static final MarshallingInfo<String> MASTERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterUsername").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> LICENSEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseModel").build();
    private static final MarshallingInfo<String> SNAPSHOTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotType").build();
    private static final MarshallingInfo<Integer> PERCENTPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentProgress").build();
    private static final MarshallingInfo<Boolean> STORAGEENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageEncrypted").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> DBCLUSTERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterIdentifier").build();
    private static final MarshallingInfo<String> DBCLUSTERSNAPSHOTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbClusterSnapshotIdentifier").build();
    private static final MarshallingInfo<Boolean> IAMDATABASEAUTHENTICATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamDatabaseAuthenticationEnabled").build();

    private static final AwsRdsDbClusterSnapshotDetailsMarshaller instance = new AwsRdsDbClusterSnapshotDetailsMarshaller();

    public static AwsRdsDbClusterSnapshotDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbClusterSnapshotDetails awsRdsDbClusterSnapshotDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbClusterSnapshotDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getSnapshotCreateTime(), SNAPSHOTCREATETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getAllocatedStorage(), ALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getClusterCreateTime(), CLUSTERCREATETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getMasterUsername(), MASTERUSERNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getLicenseModel(), LICENSEMODEL_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getSnapshotType(), SNAPSHOTTYPE_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getPercentProgress(), PERCENTPROGRESS_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getStorageEncrypted(), STORAGEENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getDbClusterIdentifier(), DBCLUSTERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getDbClusterSnapshotIdentifier(), DBCLUSTERSNAPSHOTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbClusterSnapshotDetails.getIamDatabaseAuthenticationEnabled(), IAMDATABASEAUTHENTICATIONENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
