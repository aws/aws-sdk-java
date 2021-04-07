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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataReplicationInfoReplicatedDiskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataReplicationInfoReplicatedDiskMarshaller {

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

    private static final DataReplicationInfoReplicatedDiskMarshaller instance = new DataReplicationInfoReplicatedDiskMarshaller();

    public static DataReplicationInfoReplicatedDiskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataReplicationInfoReplicatedDisk dataReplicationInfoReplicatedDisk, ProtocolMarshaller protocolMarshaller) {

        if (dataReplicationInfoReplicatedDisk == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataReplicationInfoReplicatedDisk.getBackloggedStorageBytes(), BACKLOGGEDSTORAGEBYTES_BINDING);
            protocolMarshaller.marshall(dataReplicationInfoReplicatedDisk.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(dataReplicationInfoReplicatedDisk.getReplicatedStorageBytes(), REPLICATEDSTORAGEBYTES_BINDING);
            protocolMarshaller.marshall(dataReplicationInfoReplicatedDisk.getRescannedStorageBytes(), RESCANNEDSTORAGEBYTES_BINDING);
            protocolMarshaller.marshall(dataReplicationInfoReplicatedDisk.getTotalStorageBytes(), TOTALSTORAGEBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
