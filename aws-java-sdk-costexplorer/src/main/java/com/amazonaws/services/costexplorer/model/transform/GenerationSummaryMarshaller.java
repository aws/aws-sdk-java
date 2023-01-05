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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GenerationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GenerationSummaryMarshaller {

    private static final MarshallingInfo<String> RECOMMENDATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationId").build();
    private static final MarshallingInfo<String> GENERATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationStatus").build();
    private static final MarshallingInfo<String> GENERATIONSTARTEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationStartedTime").build();
    private static final MarshallingInfo<String> GENERATIONCOMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationCompletionTime").build();
    private static final MarshallingInfo<String> ESTIMATEDCOMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedCompletionTime").build();

    private static final GenerationSummaryMarshaller instance = new GenerationSummaryMarshaller();

    public static GenerationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GenerationSummary generationSummary, ProtocolMarshaller protocolMarshaller) {

        if (generationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generationSummary.getRecommendationId(), RECOMMENDATIONID_BINDING);
            protocolMarshaller.marshall(generationSummary.getGenerationStatus(), GENERATIONSTATUS_BINDING);
            protocolMarshaller.marshall(generationSummary.getGenerationStartedTime(), GENERATIONSTARTEDTIME_BINDING);
            protocolMarshaller.marshall(generationSummary.getGenerationCompletionTime(), GENERATIONCOMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(generationSummary.getEstimatedCompletionTime(), ESTIMATEDCOMPLETIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
