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
package com.amazonaws.services.frauddetector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrainingResultV2Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrainingResultV2Marshaller {

    private static final MarshallingInfo<StructuredPojo> DATAVALIDATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataValidationMetrics").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGMETRICSV2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingMetricsV2").build();
    private static final MarshallingInfo<StructuredPojo> VARIABLEIMPORTANCEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("variableImportanceMetrics").build();
    private static final MarshallingInfo<StructuredPojo> AGGREGATEDVARIABLESIMPORTANCEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregatedVariablesImportanceMetrics").build();

    private static final TrainingResultV2Marshaller instance = new TrainingResultV2Marshaller();

    public static TrainingResultV2Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrainingResultV2 trainingResultV2, ProtocolMarshaller protocolMarshaller) {

        if (trainingResultV2 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trainingResultV2.getDataValidationMetrics(), DATAVALIDATIONMETRICS_BINDING);
            protocolMarshaller.marshall(trainingResultV2.getTrainingMetricsV2(), TRAININGMETRICSV2_BINDING);
            protocolMarshaller.marshall(trainingResultV2.getVariableImportanceMetrics(), VARIABLEIMPORTANCEMETRICS_BINDING);
            protocolMarshaller.marshall(trainingResultV2.getAggregatedVariablesImportanceMetrics(), AGGREGATEDVARIABLESIMPORTANCEMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
