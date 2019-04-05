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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrderableReplicationInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrderableReplicationInstanceMarshaller {

    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceClass").build();
    private static final MarshallingInfo<String> STORAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageType").build();
    private static final MarshallingInfo<Integer> MINALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinAllocatedStorage").build();
    private static final MarshallingInfo<Integer> MAXALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAllocatedStorage").build();
    private static final MarshallingInfo<Integer> DEFAULTALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAllocatedStorage").build();
    private static final MarshallingInfo<Integer> INCLUDEDALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludedAllocatedStorage").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZones").build();

    private static final OrderableReplicationInstanceMarshaller instance = new OrderableReplicationInstanceMarshaller();

    public static OrderableReplicationInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrderableReplicationInstance orderableReplicationInstance, ProtocolMarshaller protocolMarshaller) {

        if (orderableReplicationInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(orderableReplicationInstance.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(orderableReplicationInstance.getReplicationInstanceClass(), REPLICATIONINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(orderableReplicationInstance.getStorageType(), STORAGETYPE_BINDING);
            protocolMarshaller.marshall(orderableReplicationInstance.getMinAllocatedStorage(), MINALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(orderableReplicationInstance.getMaxAllocatedStorage(), MAXALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(orderableReplicationInstance.getDefaultAllocatedStorage(), DEFAULTALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(orderableReplicationInstance.getIncludedAllocatedStorage(), INCLUDEDALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(orderableReplicationInstance.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
