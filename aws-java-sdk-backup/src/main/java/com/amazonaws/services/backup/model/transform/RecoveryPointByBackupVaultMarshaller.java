/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecoveryPointByBackupVaultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecoveryPointByBackupVaultMarshaller {

    private static final MarshallingInfo<String> RECOVERYPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryPointArn").build();
    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultName").build();
    private static final MarshallingInfo<String> BACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultArn").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> BACKUPSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupSizeInBytes").build();
    private static final MarshallingInfo<StructuredPojo> CALCULATEDLIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedLifecycle").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Lifecycle").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKeyArn").build();
    private static final MarshallingInfo<Boolean> ISENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsEncrypted").build();
    private static final MarshallingInfo<java.util.Date> LASTRESTORETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRestoreTime").timestampFormat("unixTimestamp").build();

    private static final RecoveryPointByBackupVaultMarshaller instance = new RecoveryPointByBackupVaultMarshaller();

    public static RecoveryPointByBackupVaultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecoveryPointByBackupVault recoveryPointByBackupVault, ProtocolMarshaller protocolMarshaller) {

        if (recoveryPointByBackupVault == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recoveryPointByBackupVault.getRecoveryPointArn(), RECOVERYPOINTARN_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getBackupVaultArn(), BACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getCompletionDate(), COMPLETIONDATE_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getBackupSizeInBytes(), BACKUPSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getCalculatedLifecycle(), CALCULATEDLIFECYCLE_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getLifecycle(), LIFECYCLE_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getEncryptionKeyArn(), ENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getIsEncrypted(), ISENCRYPTED_BINDING);
            protocolMarshaller.marshall(recoveryPointByBackupVault.getLastRestoreTime(), LASTRESTORETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
