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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationJobInferenceBenchmarkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationJobInferenceBenchmarkMarshaller {

    private static final MarshallingInfo<StructuredPojo> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Metrics").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> MODELCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelConfiguration").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();

    private static final RecommendationJobInferenceBenchmarkMarshaller instance = new RecommendationJobInferenceBenchmarkMarshaller();

    public static RecommendationJobInferenceBenchmarkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationJobInferenceBenchmark recommendationJobInferenceBenchmark, ProtocolMarshaller protocolMarshaller) {

        if (recommendationJobInferenceBenchmark == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationJobInferenceBenchmark.getMetrics(), METRICS_BINDING);
            protocolMarshaller.marshall(recommendationJobInferenceBenchmark.getEndpointConfiguration(), ENDPOINTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(recommendationJobInferenceBenchmark.getModelConfiguration(), MODELCONFIGURATION_BINDING);
            protocolMarshaller.marshall(recommendationJobInferenceBenchmark.getFailureReason(), FAILUREREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
