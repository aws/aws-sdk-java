/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.augmentedairuntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.augmentedairuntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HumanLoopActivationResultsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HumanLoopActivationResultsMarshaller {

    private static final MarshallingInfo<StructuredPojo> HUMANLOOPACTIVATIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLoopActivationReason").build();
    private static final MarshallingInfo<String> HUMANLOOPACTIVATIONCONDITIONSEVALUATIONRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLoopActivationConditionsEvaluationResults").build();

    private static final HumanLoopActivationResultsMarshaller instance = new HumanLoopActivationResultsMarshaller();

    public static HumanLoopActivationResultsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HumanLoopActivationResults humanLoopActivationResults, ProtocolMarshaller protocolMarshaller) {

        if (humanLoopActivationResults == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(humanLoopActivationResults.getHumanLoopActivationReason(), HUMANLOOPACTIVATIONREASON_BINDING);
            protocolMarshaller.marshall(humanLoopActivationResults.getHumanLoopActivationConditionsEvaluationResults(),
                    HUMANLOOPACTIVATIONCONDITIONSEVALUATIONRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
