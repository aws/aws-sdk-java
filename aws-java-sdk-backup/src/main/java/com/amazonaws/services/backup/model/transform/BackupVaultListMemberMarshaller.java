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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackupVaultListMemberMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackupVaultListMemberMarshaller {

    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultName").build();
    private static final MarshallingInfo<String> BACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKeyArn").build();
    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId").build();
    private static final MarshallingInfo<Long> NUMBEROFRECOVERYPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfRecoveryPoints").build();
    private static final MarshallingInfo<Boolean> LOCKED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Locked").build();
    private static final MarshallingInfo<Long> MINRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinRetentionDays").build();
    private static final MarshallingInfo<Long> MAXRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRetentionDays").build();
    private static final MarshallingInfo<java.util.Date> LOCKDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LockDate").timestampFormat("unixTimestamp").build();

    private static final BackupVaultListMemberMarshaller instance = new BackupVaultListMemberMarshaller();

    public static BackupVaultListMemberMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackupVaultListMember backupVaultListMember, ProtocolMarshaller protocolMarshaller) {

        if (backupVaultListMember == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backupVaultListMember.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getBackupVaultArn(), BACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getEncryptionKeyArn(), ENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getNumberOfRecoveryPoints(), NUMBEROFRECOVERYPOINTS_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getLocked(), LOCKED_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getMinRetentionDays(), MINRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getMaxRetentionDays(), MAXRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(backupVaultListMember.getLockDate(), LOCKDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
