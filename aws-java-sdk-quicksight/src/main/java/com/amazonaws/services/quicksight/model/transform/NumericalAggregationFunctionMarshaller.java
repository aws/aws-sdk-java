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
 * NumericalAggregationFunctionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NumericalAggregationFunctionMarshaller {

    private static final MarshallingInfo<String> SIMPLENUMERICALAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SimpleNumericalAggregation").build();
    private static final MarshallingInfo<StructuredPojo> PERCENTILEAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentileAggregation").build();

    private static final NumericalAggregationFunctionMarshaller instance = new NumericalAggregationFunctionMarshaller();

    public static NumericalAggregationFunctionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NumericalAggregationFunction numericalAggregationFunction, ProtocolMarshaller protocolMarshaller) {

        if (numericalAggregationFunction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(numericalAggregationFunction.getSimpleNumericalAggregation(), SIMPLENUMERICALAGGREGATION_BINDING);
            protocolMarshaller.marshall(numericalAggregationFunction.getPercentileAggregation(), PERCENTILEAGGREGATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
