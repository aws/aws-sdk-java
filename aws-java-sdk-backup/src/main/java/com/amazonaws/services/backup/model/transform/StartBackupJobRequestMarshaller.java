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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartBackupJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartBackupJobRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupVaultName").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken").build();
    private static final MarshallingInfo<Long> STARTWINDOWMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartWindowMinutes").build();
    private static final MarshallingInfo<Long> COMPLETEWINDOWMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompleteWindowMinutes").build();
    private static final MarshallingInfo<StructuredPojo> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Lifecycle").build();
    private static final MarshallingInfo<Map> RECOVERYPOINTTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryPointTags").build();

    private static final StartBackupJobRequestMarshaller instance = new StartBackupJobRequestMarshaller();

    public static StartBackupJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartBackupJobRequest startBackupJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startBackupJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startBackupJobRequest.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(startBackupJobRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(startBackupJobRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(startBackupJobRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
            protocolMarshaller.marshall(startBackupJobRequest.getStartWindowMinutes(), STARTWINDOWMINUTES_BINDING);
            protocolMarshaller.marshall(startBackupJobRequest.getCompleteWindowMinutes(), COMPLETEWINDOWMINUTES_BINDING);
            protocolMarshaller.marshall(startBackupJobRequest.getLifecycle(), LIFECYCLE_BINDING);
            protocolMarshaller.marshall(startBackupJobRequest.getRecoveryPointTags(), RECOVERYPOINTTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
