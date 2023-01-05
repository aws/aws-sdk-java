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
 * AwsBackupRecoveryPointCreatedByDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsBackupRecoveryPointCreatedByDetailsMarshaller {

    private static final MarshallingInfo<String> BACKUPPLANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanArn").build();
    private static final MarshallingInfo<String> BACKUPPLANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanId").build();
    private static final MarshallingInfo<String> BACKUPPLANVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupPlanVersion").build();
    private static final MarshallingInfo<String> BACKUPRULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupRuleId").build();

    private static final AwsBackupRecoveryPointCreatedByDetailsMarshaller instance = new AwsBackupRecoveryPointCreatedByDetailsMarshaller();

    public static AwsBackupRecoveryPointCreatedByDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsBackupRecoveryPointCreatedByDetails awsBackupRecoveryPointCreatedByDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsBackupRecoveryPointCreatedByDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsBackupRecoveryPointCreatedByDetails.getBackupPlanArn(), BACKUPPLANARN_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointCreatedByDetails.getBackupPlanId(), BACKUPPLANID_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointCreatedByDetails.getBackupPlanVersion(), BACKUPPLANVERSION_BINDING);
            protocolMarshaller.marshall(awsBackupRecoveryPointCreatedByDetails.getBackupRuleId(), BACKUPRULEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
