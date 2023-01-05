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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ForecastComputationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ForecastComputationMarshaller {

    private static final MarshallingInfo<String> COMPUTATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputationId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> TIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Time").build();
    private static final MarshallingInfo<StructuredPojo> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Value").build();
    private static final MarshallingInfo<Integer> PERIODSFORWARD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeriodsForward").build();
    private static final MarshallingInfo<Integer> PERIODSBACKWARD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeriodsBackward").build();
    private static final MarshallingInfo<Double> UPPERBOUNDARY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpperBoundary").build();
    private static final MarshallingInfo<Double> LOWERBOUNDARY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LowerBoundary").build();
    private static final MarshallingInfo<Integer> PREDICTIONINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PredictionInterval").build();
    private static final MarshallingInfo<String> SEASONALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Seasonality").build();
    private static final MarshallingInfo<Integer> CUSTOMSEASONALITYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomSeasonalityValue").build();

    private static final ForecastComputationMarshaller instance = new ForecastComputationMarshaller();

    public static ForecastComputationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ForecastComputation forecastComputation, ProtocolMarshaller protocolMarshaller) {

        if (forecastComputation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(forecastComputation.getComputationId(), COMPUTATIONID_BINDING);
            protocolMarshaller.marshall(forecastComputation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(forecastComputation.getTime(), TIME_BINDING);
            protocolMarshaller.marshall(forecastComputation.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(forecastComputation.getPeriodsForward(), PERIODSFORWARD_BINDING);
            protocolMarshaller.marshall(forecastComputation.getPeriodsBackward(), PERIODSBACKWARD_BINDING);
            protocolMarshaller.marshall(forecastComputation.getUpperBoundary(), UPPERBOUNDARY_BINDING);
            protocolMarshaller.marshall(forecastComputation.getLowerBoundary(), LOWERBOUNDARY_BINDING);
            protocolMarshaller.marshall(forecastComputation.getPredictionInterval(), PREDICTIONINTERVAL_BINDING);
            protocolMarshaller.marshall(forecastComputation.getSeasonality(), SEASONALITY_BINDING);
            protocolMarshaller.marshall(forecastComputation.getCustomSeasonalityValue(), CUSTOMSEASONALITYVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
