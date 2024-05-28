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
package com.amazonaws.services.datasync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CapacityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CapacityMarshaller {

    private static final MarshallingInfo<Long> USED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Used").build();
    private static final MarshallingInfo<Long> PROVISIONED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Provisioned").build();
    private static final MarshallingInfo<Long> LOGICALUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogicalUsed").build();
    private static final MarshallingInfo<Long> CLUSTERCLOUDSTORAGEUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterCloudStorageUsed").build();

    private static final CapacityMarshaller instance = new CapacityMarshaller();

    public static CapacityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Capacity capacity, ProtocolMarshaller protocolMarshaller) {

        if (capacity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(capacity.getUsed(), USED_BINDING);
            protocolMarshaller.marshall(capacity.getProvisioned(), PROVISIONED_BINDING);
            protocolMarshaller.marshall(capacity.getLogicalUsed(), LOGICALUSED_BINDING);
            protocolMarshaller.marshall(capacity.getClusterCloudStorageUsed(), CLUSTERCLOUDSTORAGEUSED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
