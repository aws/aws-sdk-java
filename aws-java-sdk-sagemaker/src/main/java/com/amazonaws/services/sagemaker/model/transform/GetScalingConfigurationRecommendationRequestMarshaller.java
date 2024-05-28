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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetScalingConfigurationRecommendationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetScalingConfigurationRecommendationRequestMarshaller {

    private static final MarshallingInfo<String> INFERENCERECOMMENDATIONSJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceRecommendationsJobName").build();
    private static final MarshallingInfo<String> RECOMMENDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationId").build();
    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<Integer> TARGETCPUUTILIZATIONPERCORE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetCpuUtilizationPerCore").build();
    private static final MarshallingInfo<StructuredPojo> SCALINGPOLICYOBJECTIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPolicyObjective").build();

    private static final GetScalingConfigurationRecommendationRequestMarshaller instance = new GetScalingConfigurationRecommendationRequestMarshaller();

    public static GetScalingConfigurationRecommendationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetScalingConfigurationRecommendationRequest getScalingConfigurationRecommendationRequest, ProtocolMarshaller protocolMarshaller) {

        if (getScalingConfigurationRecommendationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getScalingConfigurationRecommendationRequest.getInferenceRecommendationsJobName(),
                    INFERENCERECOMMENDATIONSJOBNAME_BINDING);
            protocolMarshaller.marshall(getScalingConfigurationRecommendationRequest.getRecommendationId(), RECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(getScalingConfigurationRecommendationRequest.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(getScalingConfigurationRecommendationRequest.getTargetCpuUtilizationPerCore(), TARGETCPUUTILIZATIONPERCORE_BINDING);
            protocolMarshaller.marshall(getScalingConfigurationRecommendationRequest.getScalingPolicyObjective(), SCALINGPOLICYOBJECTIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
