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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsBackupRecoveryPointDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsBackupRecoveryPointDetailsMarshaller {

    private static final MarshallingInfo<Long> BACKUPSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupSizeInBytes").build();
    private static final MarshallingInfo<String> BACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultArn").build();
    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultName").build();
    private static final MarshallingInfo<StructuredPojo> CALCULATEDLIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedLifecycle").build();
    private static final MarshallingInfo<String> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKeyArn").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<Boolean> ISENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsEncrypted").build();
    private static final MarshallingInfo<String> LASTRESTORETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRestoreTime").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Lifecycle").build();
    private static final MarshallingInfo<String> RECOVERYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryPointArn").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> SOURCEBACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBackupVaultArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<String> STORAGECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageClass").build();

    private static final AwsBackupRecoveryPointDetailsMarshaller instance = new AwsBackupRecoveryPointDetailsMarshaller();

    public static AwsBackupRecoveryPointDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsBackupRecoveryPointDetails awsBackupRecoveryPointDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsBackupRecoveryPointDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getBackupSizeInBytes(), BACKUPSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getBackupVaultArn(), BACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getCalculatedLifecycle(), CALCULATEDLIFECYCLE_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getEncryptionKeyArn(), ENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getIsEncrypted(), ISENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getLastRestoreTime(), LASTRESTORETIME_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getLifecycle(), LIFECYCLE_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getRecoveryPointArn(), RECOVERYPOINTARN_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getSourceBackupVaultArn(), SOURCEBACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointDetails.getStorageClass(), STORAGECLASS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
