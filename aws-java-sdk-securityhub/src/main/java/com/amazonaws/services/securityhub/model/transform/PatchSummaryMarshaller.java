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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PatchSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PatchSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<Integer> INSTALLEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstalledCount").build();
    private static final MarshallingInfo<Integer> MISSINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MissingCount").build();
    private static final MarshallingInfo<Integer> FAILEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedCount").build();
    private static final MarshallingInfo<Integer> INSTALLEDOTHERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstalledOtherCount").build();
    private static final MarshallingInfo<Integer> INSTALLEDREJECTEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstalledRejectedCount").build();
    private static final MarshallingInfo<Integer> INSTALLEDPENDINGREBOOT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstalledPendingReboot").build();
    private static final MarshallingInfo<String> OPERATIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationStartTime").build();
    private static final MarshallingInfo<String> OPERATIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationEndTime").build();
    private static final MarshallingInfo<String> REBOOTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RebootOption").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Operation").build();

    private static final PatchSummaryMarshaller instance = new PatchSummaryMarshaller();

    public static PatchSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PatchSummary patchSummary, ProtocolMarshaller protocolMarshaller) {

        if (patchSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(patchSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(patchSummary.getInstalledCount(), INSTALLEDCOUNT_BINDING);
            protocolMarshaller.marshall(patchSummary.getMissingCount(), MISSINGCOUNT_BINDING);
            protocolMarshaller.marshall(patchSummary.getFailedCount(), FAILEDCOUNT_BINDING);
            protocolMarshaller.marshall(patchSummary.getInstalledOtherCount(), INSTALLEDOTHERCOUNT_BINDING);
            protocolMarshaller.marshall(patchSummary.getInstalledRejectedCount(), INSTALLEDREJECTEDCOUNT_BINDING);
            protocolMarshaller.marshall(patchSummary.getInstalledPendingReboot(), INSTALLEDPENDINGREBOOT_BINDING);
            protocolMarshaller.marshall(patchSummary.getOperationStartTime(), OPERATIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(patchSummary.getOperationEndTime(), OPERATIONENDTIME_BINDING);
            protocolMarshaller.marshall(patchSummary.getRebootOption(), REBOOTOPTION_BINDING);
            protocolMarshaller.marshall(patchSummary.getOperation(), OPERATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
