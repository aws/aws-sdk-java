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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StopInferenceExperimentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StopInferenceExperimentRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Map> MODELVARIANTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelVariantActions").build();
    private static final MarshallingInfo<List> DESIREDMODELVARIANTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredModelVariants").build();
    private static final MarshallingInfo<String> DESIREDSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredState").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reason").build();

    private static final StopInferenceExperimentRequestMarshaller instance = new StopInferenceExperimentRequestMarshaller();

    public static StopInferenceExperimentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StopInferenceExperimentRequest stopInferenceExperimentRequest, ProtocolMarshaller protocolMarshaller) {

        if (stopInferenceExperimentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stopInferenceExperimentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(stopInferenceExperimentRequest.getModelVariantActions(), MODELVARIANTACTIONS_BINDING);
            protocolMarshaller.marshall(stopInferenceExperimentRequest.getDesiredModelVariants(), DESIREDMODELVARIANTS_BINDING);
            protocolMarshaller.marshall(stopInferenceExperimentRequest.getDesiredState(), DESIREDSTATE_BINDING);
            protocolMarshaller.marshall(stopInferenceExperimentRequest.getReason(), REASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
