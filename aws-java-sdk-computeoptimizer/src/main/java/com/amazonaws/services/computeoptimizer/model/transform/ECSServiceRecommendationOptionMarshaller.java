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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ECSServiceRecommendationOptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ECSServiceRecommendationOptionMarshaller {

    private static final MarshallingInfo<Integer> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memory").build();
    private static final MarshallingInfo<Integer> CPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();
    private static final MarshallingInfo<StructuredPojo> SAVINGSOPPORTUNITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsOpportunity").build();
    private static final MarshallingInfo<List> PROJECTEDUTILIZATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectedUtilizationMetrics").build();
    private static final MarshallingInfo<List> CONTAINERRECOMMENDATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerRecommendations").build();

    private static final ECSServiceRecommendationOptionMarshaller instance = new ECSServiceRecommendationOptionMarshaller();

    public static ECSServiceRecommendationOptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ECSServiceRecommendationOption eCSServiceRecommendationOption, ProtocolMarshaller protocolMarshaller) {

        if (eCSServiceRecommendationOption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eCSServiceRecommendationOption.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendationOption.getCpu(), CPU_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendationOption.getSavingsOpportunity(), SAVINGSOPPORTUNITY_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendationOption.getProjectedUtilizationMetrics(), PROJECTEDUTILIZATIONMETRICS_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendationOption.getContainerRecommendations(), CONTAINERRECOMMENDATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
