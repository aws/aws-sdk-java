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
 * AwsRdsDbSnapshotDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbSnapshotDetailsMarshaller {

    private static final MarshallingInfo<String> DBSNAPSHOTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSnapshotIdentifier").build();
    private static final MarshallingInfo<String> DBINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstanceIdentifier").build();
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
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> INSTANCECREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCreateTime").build();
    private static final MarshallingInfo<String> MASTERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterUsername").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> LICENSEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseModel").build();
    private static final MarshallingInfo<String> SNAPSHOTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotType").build();
    private static final MarshallingInfo<Integer> IOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Iops").build();
    private static final MarshallingInfo<String> OPTIONGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptionGroupName").build();
    private static final MarshallingInfo<Integer> PERCENTPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentProgress").build();
    private static final MarshallingInfo<String> SOURCEREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceRegion").build();
    private static final MarshallingInfo<String> SOURCEDBSNAPSHOTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceDbSnapshotIdentifier").build();
    private static final MarshallingInfo<String> STORAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageType").build();
    private static final MarshallingInfo<String> TDECREDENTIALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TdeCredentialArn").build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encrypted").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();
    private static final MarshallingInfo<Boolean> IAMDATABASEAUTHENTICATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamDatabaseAuthenticationEnabled").build();
    private static final MarshallingInfo<List> PROCESSORFEATURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessorFeatures").build();
    private static final MarshallingInfo<String> DBIRESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbiResourceId").build();

    private static final AwsRdsDbSnapshotDetailsMarshaller instance = new AwsRdsDbSnapshotDetailsMarshaller();

    public static AwsRdsDbSnapshotDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbSnapshotDetails awsRdsDbSnapshotDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbSnapshotDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getDbSnapshotIdentifier(), DBSNAPSHOTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getDbInstanceIdentifier(), DBINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getSnapshotCreateTime(), SNAPSHOTCREATETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getAllocatedStorage(), ALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getInstanceCreateTime(), INSTANCECREATETIME_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getMasterUsername(), MASTERUSERNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getLicenseModel(), LICENSEMODEL_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getSnapshotType(), SNAPSHOTTYPE_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getIops(), IOPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getOptionGroupName(), OPTIONGROUPNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getPercentProgress(), PERCENTPROGRESS_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getSourceRegion(), SOURCEREGION_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getSourceDbSnapshotIdentifier(), SOURCEDBSNAPSHOTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getStorageType(), STORAGETYPE_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getTdeCredentialArn(), TDECREDENTIALARN_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getIamDatabaseAuthenticationEnabled(), IAMDATABASEAUTHENTICATIONENABLED_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getProcessorFeatures(), PROCESSORFEATURES_BINDING);
            protocolMarshaller.marshall(awsRdsDbSnapshotDetails.getDbiResourceId(), DBIRESOURCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
