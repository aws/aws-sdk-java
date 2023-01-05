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
 * AwsBackupBackupVaultDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsBackupBackupVaultDetailsMarshaller {

    private static final MarshallingInfo<String> BACKUPVAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultArn").build();
    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultName").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKeyArn").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Notifications").build();
    private static final MarshallingInfo<String> ACCESSPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessPolicy").build();

    private static final AwsBackupBackupVaultDetailsMarshaller instance = new AwsBackupBackupVaultDetailsMarshaller();

    public static AwsBackupBackupVaultDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsBackupBackupVaultDetails awsBackupBackupVaultDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsBackupBackupVaultDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsBackupBackupVaultDetails.getBackupVaultArn(), BACKUPVAULTARN_BINDING);
            protocolMarshaller.marshall(awsBackupBackupVaultDetails.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(awsBackupBackupVaultDetails.getEncryptionKeyArn(), ENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(awsBackupBackupVaultDetails.getNotifications(), NOTIFICATIONS_BINDING);
            protocolMarshaller.marshall(awsBackupBackupVaultDetails.getAccessPolicy(), ACCESSPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
