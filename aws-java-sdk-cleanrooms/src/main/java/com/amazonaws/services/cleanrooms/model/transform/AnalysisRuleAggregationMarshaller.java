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
package com.amazonaws.services.cleanrooms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnalysisRuleAggregationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnalysisRuleAggregationMarshaller {

    private static final MarshallingInfo<List> AGGREGATECOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregateColumns").build();
    private static final MarshallingInfo<List> JOINCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("joinColumns").build();
    private static final MarshallingInfo<String> JOINREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("joinRequired").build();
    private static final MarshallingInfo<List> ALLOWEDJOINOPERATORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedJoinOperators").build();
    private static final MarshallingInfo<List> DIMENSIONCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dimensionColumns").build();
    private static final MarshallingInfo<List> SCALARFUNCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalarFunctions").build();
    private static final MarshallingInfo<List> OUTPUTCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputConstraints").build();

    private static final AnalysisRuleAggregationMarshaller instance = new AnalysisRuleAggregationMarshaller();

    public static AnalysisRuleAggregationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AnalysisRuleAggregation analysisRuleAggregation, ProtocolMarshaller protocolMarshaller) {

        if (analysisRuleAggregation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(analysisRuleAggregation.getAggregateColumns(), AGGREGATECOLUMNS_BINDING);
            protocolMarshaller.marshall(analysisRuleAggregation.getJoinColumns(), JOINCOLUMNS_BINDING);
            protocolMarshaller.marshall(analysisRuleAggregation.getJoinRequired(), JOINREQUIRED_BINDING);
            protocolMarshaller.marshall(analysisRuleAggregation.getAllowedJoinOperators(), ALLOWEDJOINOPERATORS_BINDING);
            protocolMarshaller.marshall(analysisRuleAggregation.getDimensionColumns(), DIMENSIONCOLUMNS_BINDING);
            protocolMarshaller.marshall(analysisRuleAggregation.getScalarFunctions(), SCALARFUNCTIONS_BINDING);
            protocolMarshaller.marshall(analysisRuleAggregation.getOutputConstraints(), OUTPUTCONSTRAINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
