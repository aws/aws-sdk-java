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
package com.amazonaws.services.frauddetector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrainingResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrainingResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATAVALIDATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataValidationMetrics").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingMetrics").build();
    private static final MarshallingInfo<StructuredPojo> VARIABLEIMPORTANCEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("variableImportanceMetrics").build();

    private static final TrainingResultMarshaller instance = new TrainingResultMarshaller();

    public static TrainingResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrainingResult trainingResult, ProtocolMarshaller protocolMarshaller) {

        if (trainingResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trainingResult.getDataValidationMetrics(), DATAVALIDATIONMETRICS_BINDING);
            protocolMarshaller.marshall(trainingResult.getTrainingMetrics(), TRAININGMETRICS_BINDING);
            protocolMarshaller.marshall(trainingResult.getVariableImportanceMetrics(), VARIABLEIMPORTANCEMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
