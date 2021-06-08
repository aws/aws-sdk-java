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
 * AwsRdsDbPendingModifiedValuesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbPendingModifiedValuesMarshaller {

    private static final MarshallingInfo<String> DBINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstanceClass").build();
    private static final MarshallingInfo<Integer> ALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedStorage").build();
    private static final MarshallingInfo<String> MASTERUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterUserPassword").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<Integer> BACKUPRETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupRetentionPeriod").build();
    private static final MarshallingInfo<Boolean> MULTIAZ_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MultiAZ").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> LICENSEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseModel").build();
    private static final MarshallingInfo<Integer> IOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Iops").build();
    private static final MarshallingInfo<String> DBINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstanceIdentifier").build();
    private static final MarshallingInfo<String> STORAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageType").build();
    private static final MarshallingInfo<String> CACERTIFICATEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CaCertificateIdentifier").build();
    private static final MarshallingInfo<String> DBSUBNETGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSubnetGroupName").build();
    private static final MarshallingInfo<StructuredPojo> PENDINGCLOUDWATCHLOGSEXPORTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PendingCloudWatchLogsExports").build();
    private static final MarshallingInfo<List> PROCESSORFEATURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessorFeatures").build();

    private static final AwsRdsDbPendingModifiedValuesMarshaller instance = new AwsRdsDbPendingModifiedValuesMarshaller();

    public static AwsRdsDbPendingModifiedValuesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbPendingModifiedValues awsRdsDbPendingModifiedValues, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbPendingModifiedValues == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getDbInstanceClass(), DBINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getAllocatedStorage(), ALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getMasterUserPassword(), MASTERUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getBackupRetentionPeriod(), BACKUPRETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getMultiAZ(), MULTIAZ_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getLicenseModel(), LICENSEMODEL_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getIops(), IOPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getDbInstanceIdentifier(), DBINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getStorageType(), STORAGETYPE_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getCaCertificateIdentifier(), CACERTIFICATEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getDbSubnetGroupName(), DBSUBNETGROUPNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getPendingCloudWatchLogsExports(), PENDINGCLOUDWATCHLOGSEXPORTS_BINDING);
            protocolMarshaller.marshall(awsRdsDbPendingModifiedValues.getProcessorFeatures(), PROCESSORFEATURES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
