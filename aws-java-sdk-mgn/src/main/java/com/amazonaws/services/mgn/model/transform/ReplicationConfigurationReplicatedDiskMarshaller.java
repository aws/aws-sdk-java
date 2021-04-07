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
 * ReplicationConfigurationReplicatedDiskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationConfigurationReplicatedDiskMarshaller {

    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceName").build();
    private static final MarshallingInfo<Long> IOPS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iops").build();
    private static final MarshallingInfo<Boolean> ISBOOTDISK_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isBootDisk").build();
    private static final MarshallingInfo<String> STAGINGDISKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stagingDiskType").build();

    private static final ReplicationConfigurationReplicatedDiskMarshaller instance = new ReplicationConfigurationReplicatedDiskMarshaller();

    public static ReplicationConfigurationReplicatedDiskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationConfigurationReplicatedDisk replicationConfigurationReplicatedDisk, ProtocolMarshaller protocolMarshaller) {

        if (replicationConfigurationReplicatedDisk == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationConfigurationReplicatedDisk.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(replicationConfigurationReplicatedDisk.getIops(), IOPS_BINDING);
            protocolMarshaller.marshall(replicationConfigurationReplicatedDisk.getIsBootDisk(), ISBOOTDISK_BINDING);
            protocolMarshaller.marshall(replicationConfigurationReplicatedDisk.getStagingDiskType(), STAGINGDISKTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
