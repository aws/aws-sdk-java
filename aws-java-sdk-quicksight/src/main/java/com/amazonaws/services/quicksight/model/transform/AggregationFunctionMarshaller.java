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
 * AggregationFunctionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AggregationFunctionMarshaller {

    private static final MarshallingInfo<StructuredPojo> NUMERICALAGGREGATIONFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumericalAggregationFunction").build();
    private static final MarshallingInfo<String> CATEGORICALAGGREGATIONFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoricalAggregationFunction").build();
    private static final MarshallingInfo<String> DATEAGGREGATIONFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateAggregationFunction").build();

    private static final AggregationFunctionMarshaller instance = new AggregationFunctionMarshaller();

    public static AggregationFunctionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AggregationFunction aggregationFunction, ProtocolMarshaller protocolMarshaller) {

        if (aggregationFunction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aggregationFunction.getNumericalAggregationFunction(), NUMERICALAGGREGATIONFUNCTION_BINDING);
            protocolMarshaller.marshall(aggregationFunction.getCategoricalAggregationFunction(), CATEGORICALAGGREGATIONFUNCTION_BINDING);
            protocolMarshaller.marshall(aggregationFunction.getDateAggregationFunction(), DATEAGGREGATIONFUNCTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
