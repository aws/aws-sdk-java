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
package com.amazonaws.services.drs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecoveryInstanceDataReplicationInfoReplicatedDiskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecoveryInstanceDataReplicationInfoReplicatedDiskMarshaller {

    private static final MarshallingInfo<Long> BACKLOGGEDSTORAGEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backloggedStorageBytes").build();
    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceName").build();
    private static final MarshallingInfo<Long> REPLICATEDSTORAGEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicatedStorageBytes").build();
    private static final MarshallingInfo<Long> RESCANNEDSTORAGEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rescannedStorageBytes").build();
    private static final MarshallingInfo<Long> TOTALSTORAGEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalStorageBytes").build();

    private static final RecoveryInstanceDataReplicationInfoReplicatedDiskMarshaller instance = new RecoveryInstanceDataReplicationInfoReplicatedDiskMarshaller();

    public static RecoveryInstanceDataReplicationInfoReplicatedDiskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecoveryInstanceDataReplicationInfoReplicatedDisk recoveryInstanceDataReplicationInfoReplicatedDisk,
            ProtocolMarshaller protocolMarshaller) {

        if (recoveryInstanceDataReplicationInfoReplicatedDisk == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recoveryInstanceDataReplicationInfoReplicatedDisk.getBackloggedStorageBytes(), BACKLOGGEDSTORAGEBYTES_BINDING);
            protocolMarshaller.marshall(recoveryInstanceDataReplicationInfoReplicatedDisk.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(recoveryInstanceDataReplicationInfoReplicatedDisk.getReplicatedStorageBytes(), REPLICATEDSTORAGEBYTES_BINDING);
            protocolMarshaller.marshall(recoveryInstanceDataReplicationInfoReplicatedDisk.getRescannedStorageBytes(), RESCANNEDSTORAGEBYTES_BINDING);
            protocolMarshaller.marshall(recoveryInstanceDataReplicationInfoReplicatedDisk.getTotalStorageBytes(), TOTALSTORAGEBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
