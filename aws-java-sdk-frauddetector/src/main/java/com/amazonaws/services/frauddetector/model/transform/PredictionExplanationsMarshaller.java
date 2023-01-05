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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PredictionExplanationsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PredictionExplanationsMarshaller {

    private static final MarshallingInfo<List> VARIABLEIMPACTEXPLANATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("variableImpactExplanations").build();
    private static final MarshallingInfo<List> AGGREGATEDVARIABLESIMPACTEXPLANATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregatedVariablesImpactExplanations").build();

    private static final PredictionExplanationsMarshaller instance = new PredictionExplanationsMarshaller();

    public static PredictionExplanationsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PredictionExplanations predictionExplanations, ProtocolMarshaller protocolMarshaller) {

        if (predictionExplanations == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(predictionExplanations.getVariableImpactExplanations(), VARIABLEIMPACTEXPLANATIONS_BINDING);
            protocolMarshaller.marshall(predictionExplanations.getAggregatedVariablesImpactExplanations(), AGGREGATEDVARIABLESIMPACTEXPLANATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
