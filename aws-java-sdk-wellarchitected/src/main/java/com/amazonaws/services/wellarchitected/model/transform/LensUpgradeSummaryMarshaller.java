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
 * LensUpgradeSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LensUpgradeSummaryMarshaller {

    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadName").build();
    private static final MarshallingInfo<String> LENSALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensAlias").build();
    private static final MarshallingInfo<String> CURRENTLENSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentLensVersion").build();
    private static final MarshallingInfo<String> LATESTLENSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestLensVersion").build();

    private static final LensUpgradeSummaryMarshaller instance = new LensUpgradeSummaryMarshaller();

    public static LensUpgradeSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LensUpgradeSummary lensUpgradeSummary, ProtocolMarshaller protocolMarshaller) {

        if (lensUpgradeSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lensUpgradeSummary.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(lensUpgradeSummary.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(lensUpgradeSummary.getLensAlias(), LENSALIAS_BINDING);
            protocolMarshaller.marshall(lensUpgradeSummary.getCurrentLensVersion(), CURRENTLENSVERSION_BINDING);
            protocolMarshaller.marshall(lensUpgradeSummary.getLatestLensVersion(), LATESTLENSVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
