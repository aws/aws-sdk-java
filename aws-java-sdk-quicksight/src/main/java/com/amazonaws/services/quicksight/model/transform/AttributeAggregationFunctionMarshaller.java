/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AttributeAggregationFunctionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttributeAggregationFunctionMarshaller {

    private static final MarshallingInfo<String> SIMPLEATTRIBUTEAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SimpleAttributeAggregation").build();
    private static final MarshallingInfo<String> VALUEFORMULTIPLEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueForMultipleValues").build();

    private static final AttributeAggregationFunctionMarshaller instance = new AttributeAggregationFunctionMarshaller();

    public static AttributeAggregationFunctionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AttributeAggregationFunction attributeAggregationFunction, ProtocolMarshaller protocolMarshaller) {

        if (attributeAggregationFunction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attributeAggregationFunction.getSimpleAttributeAggregation(), SIMPLEATTRIBUTEAGGREGATION_BINDING);
            protocolMarshaller.marshall(attributeAggregationFunction.getValueForMultipleValues(), VALUEFORMULTIPLEVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
