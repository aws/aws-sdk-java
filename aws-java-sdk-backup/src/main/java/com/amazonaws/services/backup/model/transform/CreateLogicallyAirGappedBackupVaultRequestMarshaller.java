/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateLogicallyAirGappedBackupVaultRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLogicallyAirGappedBackupVaultRequestMarshaller {

    private static final MarshallingInfo<String> BACKUPVAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("backupVaultName").build();
    private static final MarshallingInfo<Map> BACKUPVAULTTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BackupVaultTags").build();
    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId").build();
    private static final MarshallingInfo<Long> MINRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinRetentionDays").build();
    private static final MarshallingInfo<Long> MAXRETENTIONDAYS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRetentionDays").build();

    private static final CreateLogicallyAirGappedBackupVaultRequestMarshaller instance = new CreateLogicallyAirGappedBackupVaultRequestMarshaller();

    public static CreateLogicallyAirGappedBackupVaultRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLogicallyAirGappedBackupVaultRequest createLogicallyAirGappedBackupVaultRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLogicallyAirGappedBackupVaultRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLogicallyAirGappedBackupVaultRequest.getBackupVaultName(), BACKUPVAULTNAME_BINDING);
            protocolMarshaller.marshall(createLogicallyAirGappedBackupVaultRequest.getBackupVaultTags(), BACKUPVAULTTAGS_BINDING);
            protocolMarshaller.marshall(createLogicallyAirGappedBackupVaultRequest.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(createLogicallyAirGappedBackupVaultRequest.getMinRetentionDays(), MINRETENTIONDAYS_BINDING);
            protocolMarshaller.marshall(createLogicallyAirGappedBackupVaultRequest.getMaxRetentionDays(), MAXRETENTIONDAYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
