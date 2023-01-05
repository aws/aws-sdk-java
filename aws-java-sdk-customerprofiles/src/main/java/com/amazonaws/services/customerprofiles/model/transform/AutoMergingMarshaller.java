/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoMergingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoMergingMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<StructuredPojo> CONSOLIDATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Consolidation").build();
    private static final MarshallingInfo<StructuredPojo> CONFLICTRESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConflictResolution").build();
    private static final MarshallingInfo<Double> MINALLOWEDCONFIDENCESCOREFORMERGING_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinAllowedConfidenceScoreForMerging").build();

    private static final AutoMergingMarshaller instance = new AutoMergingMarshaller();

    public static AutoMergingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoMerging autoMerging, ProtocolMarshaller protocolMarshaller) {

        if (autoMerging == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoMerging.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(autoMerging.getConsolidation(), CONSOLIDATION_BINDING);
            protocolMarshaller.marshall(autoMerging.getConflictResolution(), CONFLICTRESOLUTION_BINDING);
            protocolMarshaller.marshall(autoMerging.getMinAllowedConfidenceScoreForMerging(), MINALLOWEDCONFIDENCESCOREFORMERGING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
