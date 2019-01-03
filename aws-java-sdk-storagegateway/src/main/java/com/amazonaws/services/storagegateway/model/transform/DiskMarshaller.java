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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DiskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DiskMarshaller {

    private static final MarshallingInfo<String> DISKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DiskId").build();
    private static final MarshallingInfo<String> DISKPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DiskPath").build();
    private static final MarshallingInfo<String> DISKNODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DiskNode").build();
    private static final MarshallingInfo<String> DISKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskStatus").build();
    private static final MarshallingInfo<Long> DISKSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskSizeInBytes").build();
    private static final MarshallingInfo<String> DISKALLOCATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskAllocationType").build();
    private static final MarshallingInfo<String> DISKALLOCATIONRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskAllocationResource").build();
    private static final MarshallingInfo<List> DISKATTRIBUTELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiskAttributeList").build();

    private static final DiskMarshaller instance = new DiskMarshaller();

    public static DiskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Disk disk, ProtocolMarshaller protocolMarshaller) {

        if (disk == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disk.getDiskId(), DISKID_BINDING);
            protocolMarshaller.marshall(disk.getDiskPath(), DISKPATH_BINDING);
            protocolMarshaller.marshall(disk.getDiskNode(), DISKNODE_BINDING);
            protocolMarshaller.marshall(disk.getDiskStatus(), DISKSTATUS_BINDING);
            protocolMarshaller.marshall(disk.getDiskSizeInBytes(), DISKSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(disk.getDiskAllocationType(), DISKALLOCATIONTYPE_BINDING);
            protocolMarshaller.marshall(disk.getDiskAllocationResource(), DISKALLOCATIONRESOURCE_BINDING);
            protocolMarshaller.marshall(disk.getDiskAttributeList(), DISKATTRIBUTELIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
