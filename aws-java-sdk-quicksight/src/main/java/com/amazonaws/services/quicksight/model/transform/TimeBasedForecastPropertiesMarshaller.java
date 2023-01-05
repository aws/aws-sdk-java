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
 * TimeBasedForecastPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeBasedForecastPropertiesMarshaller {

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
    private static final MarshallingInfo<Integer> SEASONALITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Seasonality").build();

    private static final TimeBasedForecastPropertiesMarshaller instance = new TimeBasedForecastPropertiesMarshaller();

    public static TimeBasedForecastPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeBasedForecastProperties timeBasedForecastProperties, ProtocolMarshaller protocolMarshaller) {

        if (timeBasedForecastProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeBasedForecastProperties.getPeriodsForward(), PERIODSFORWARD_BINDING);
            protocolMarshaller.marshall(timeBasedForecastProperties.getPeriodsBackward(), PERIODSBACKWARD_BINDING);
            protocolMarshaller.marshall(timeBasedForecastProperties.getUpperBoundary(), UPPERBOUNDARY_BINDING);
            protocolMarshaller.marshall(timeBasedForecastProperties.getLowerBoundary(), LOWERBOUNDARY_BINDING);
            protocolMarshaller.marshall(timeBasedForecastProperties.getPredictionInterval(), PREDICTIONINTERVAL_BINDING);
            protocolMarshaller.marshall(timeBasedForecastProperties.getSeasonality(), SEASONALITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
