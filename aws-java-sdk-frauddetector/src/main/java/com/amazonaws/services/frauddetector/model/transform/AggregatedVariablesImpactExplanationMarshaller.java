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
 * AggregatedVariablesImpactExplanationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AggregatedVariablesImpactExplanationMarshaller {

    private static final MarshallingInfo<List> EVENTVARIABLENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventVariableNames").build();
    private static final MarshallingInfo<String> RELATIVEIMPACT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relativeImpact").build();
    private static final MarshallingInfo<Float> LOGODDSIMPACT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logOddsImpact").build();

    private static final AggregatedVariablesImpactExplanationMarshaller instance = new AggregatedVariablesImpactExplanationMarshaller();

    public static AggregatedVariablesImpactExplanationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AggregatedVariablesImpactExplanation aggregatedVariablesImpactExplanation, ProtocolMarshaller protocolMarshaller) {

        if (aggregatedVariablesImpactExplanation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aggregatedVariablesImpactExplanation.getEventVariableNames(), EVENTVARIABLENAMES_BINDING);
            protocolMarshaller.marshall(aggregatedVariablesImpactExplanation.getRelativeImpact(), RELATIVEIMPACT_BINDING);
            protocolMarshaller.marshall(aggregatedVariablesImpactExplanation.getLogOddsImpact(), LOGODDSIMPACT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
