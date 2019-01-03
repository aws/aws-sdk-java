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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstancePatchStateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstancePatchStateMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> PATCHGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PatchGroup").build();
    private static final MarshallingInfo<String> BASELINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineId").build();
    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotId").build();
    private static final MarshallingInfo<String> INSTALLOVERRIDELIST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstallOverrideList").build();
    private static final MarshallingInfo<String> OWNERINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerInformation").build();
    private static final MarshallingInfo<Integer> INSTALLEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstalledCount").build();
    private static final MarshallingInfo<Integer> INSTALLEDOTHERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstalledOtherCount").build();
    private static final MarshallingInfo<Integer> INSTALLEDREJECTEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstalledRejectedCount").build();
    private static final MarshallingInfo<Integer> MISSINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MissingCount").build();
    private static final MarshallingInfo<Integer> FAILEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedCount").build();
    private static final MarshallingInfo<Integer> NOTAPPLICABLECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotApplicableCount").build();
    private static final MarshallingInfo<java.util.Date> OPERATIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> OPERATIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Operation").build();

    private static final InstancePatchStateMarshaller instance = new InstancePatchStateMarshaller();

    public static InstancePatchStateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstancePatchState instancePatchState, ProtocolMarshaller protocolMarshaller) {

        if (instancePatchState == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instancePatchState.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(instancePatchState.getPatchGroup(), PATCHGROUP_BINDING);
            protocolMarshaller.marshall(instancePatchState.getBaselineId(), BASELINEID_BINDING);
            protocolMarshaller.marshall(instancePatchState.getSnapshotId(), SNAPSHOTID_BINDING);
            protocolMarshaller.marshall(instancePatchState.getInstallOverrideList(), INSTALLOVERRIDELIST_BINDING);
            protocolMarshaller.marshall(instancePatchState.getOwnerInformation(), OWNERINFORMATION_BINDING);
            protocolMarshaller.marshall(instancePatchState.getInstalledCount(), INSTALLEDCOUNT_BINDING);
            protocolMarshaller.marshall(instancePatchState.getInstalledOtherCount(), INSTALLEDOTHERCOUNT_BINDING);
            protocolMarshaller.marshall(instancePatchState.getInstalledRejectedCount(), INSTALLEDREJECTEDCOUNT_BINDING);
            protocolMarshaller.marshall(instancePatchState.getMissingCount(), MISSINGCOUNT_BINDING);
            protocolMarshaller.marshall(instancePatchState.getFailedCount(), FAILEDCOUNT_BINDING);
            protocolMarshaller.marshall(instancePatchState.getNotApplicableCount(), NOTAPPLICABLECOUNT_BINDING);
            protocolMarshaller.marshall(instancePatchState.getOperationStartTime(), OPERATIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(instancePatchState.getOperationEndTime(), OPERATIONENDTIME_BINDING);
            protocolMarshaller.marshall(instancePatchState.getOperation(), OPERATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
