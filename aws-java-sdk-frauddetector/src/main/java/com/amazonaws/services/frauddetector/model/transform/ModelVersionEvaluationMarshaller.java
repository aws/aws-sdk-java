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
 * ModelVersionEvaluationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelVersionEvaluationMarshaller {

    private static final MarshallingInfo<String> OUTPUTVARIABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputVariableName").build();
    private static final MarshallingInfo<String> EVALUATIONSCORE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationScore").build();
    private static final MarshallingInfo<StructuredPojo> PREDICTIONEXPLANATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("predictionExplanations").build();

    private static final ModelVersionEvaluationMarshaller instance = new ModelVersionEvaluationMarshaller();

    public static ModelVersionEvaluationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelVersionEvaluation modelVersionEvaluation, ProtocolMarshaller protocolMarshaller) {

        if (modelVersionEvaluation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelVersionEvaluation.getOutputVariableName(), OUTPUTVARIABLENAME_BINDING);
            protocolMarshaller.marshall(modelVersionEvaluation.getEvaluationScore(), EVALUATIONSCORE_BINDING);
            protocolMarshaller.marshall(modelVersionEvaluation.getPredictionExplanations(), PREDICTIONEXPLANATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
