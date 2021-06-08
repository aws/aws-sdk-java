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
package com.amazonaws.services.wellarchitected.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkloadShareMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkloadShareMarshaller {

    private static final MarshallingInfo<String> SHAREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ShareId").build();
    private static final MarshallingInfo<String> SHAREDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SharedBy").build();
    private static final MarshallingInfo<String> SHAREDWITH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedWith").build();
    private static final MarshallingInfo<String> PERMISSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadName").build();
    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadId").build();

    private static final WorkloadShareMarshaller instance = new WorkloadShareMarshaller();

    public static WorkloadShareMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkloadShare workloadShare, ProtocolMarshaller protocolMarshaller) {

        if (workloadShare == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workloadShare.getShareId(), SHAREID_BINDING);
            protocolMarshaller.marshall(workloadShare.getSharedBy(), SHAREDBY_BINDING);
            protocolMarshaller.marshall(workloadShare.getSharedWith(), SHAREDWITH_BINDING);
            protocolMarshaller.marshall(workloadShare.getPermissionType(), PERMISSIONTYPE_BINDING);
            protocolMarshaller.marshall(workloadShare.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workloadShare.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(workloadShare.getWorkloadId(), WORKLOADID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
