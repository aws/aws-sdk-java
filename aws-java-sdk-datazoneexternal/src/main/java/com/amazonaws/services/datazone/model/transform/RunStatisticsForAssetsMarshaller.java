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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RunStatisticsForAssetsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RunStatisticsForAssetsMarshaller {

    private static final MarshallingInfo<Integer> ADDED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("added").build();
    private static final MarshallingInfo<Integer> FAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("failed").build();
    private static final MarshallingInfo<Integer> SKIPPED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("skipped").build();
    private static final MarshallingInfo<Integer> UNCHANGED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unchanged").build();
    private static final MarshallingInfo<Integer> UPDATED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updated").build();

    private static final RunStatisticsForAssetsMarshaller instance = new RunStatisticsForAssetsMarshaller();

    public static RunStatisticsForAssetsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RunStatisticsForAssets runStatisticsForAssets, ProtocolMarshaller protocolMarshaller) {

        if (runStatisticsForAssets == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(runStatisticsForAssets.getAdded(), ADDED_BINDING);
            protocolMarshaller.marshall(runStatisticsForAssets.getFailed(), FAILED_BINDING);
            protocolMarshaller.marshall(runStatisticsForAssets.getSkipped(), SKIPPED_BINDING);
            protocolMarshaller.marshall(runStatisticsForAssets.getUnchanged(), UNCHANGED_BINDING);
            protocolMarshaller.marshall(runStatisticsForAssets.getUpdated(), UPDATED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
