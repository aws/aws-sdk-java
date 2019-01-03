/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EntityRecognizerEvaluationMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntityRecognizerEvaluationMetricsMarshaller {

    private static final MarshallingInfo<Double> PRECISION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Precision").build();
    private static final MarshallingInfo<Double> RECALL_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Recall").build();
    private static final MarshallingInfo<Double> F1SCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("F1Score").build();

    private static final EntityRecognizerEvaluationMetricsMarshaller instance = new EntityRecognizerEvaluationMetricsMarshaller();

    public static EntityRecognizerEvaluationMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntityRecognizerEvaluationMetrics entityRecognizerEvaluationMetrics, ProtocolMarshaller protocolMarshaller) {

        if (entityRecognizerEvaluationMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entityRecognizerEvaluationMetrics.getPrecision(), PRECISION_BINDING);
            protocolMarshaller.marshall(entityRecognizerEvaluationMetrics.getRecall(), RECALL_BINDING);
            protocolMarshaller.marshall(entityRecognizerEvaluationMetrics.getF1Score(), F1SCORE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
