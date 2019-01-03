/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HyperParameterTuningJobConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HyperParameterTuningJobConfigMarshaller {

    private static final MarshallingInfo<String> STRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Strategy").build();
    private static final MarshallingInfo<StructuredPojo> HYPERPARAMETERTUNINGJOBOBJECTIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobObjective").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCELIMITS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceLimits").build();
    private static final MarshallingInfo<StructuredPojo> PARAMETERRANGES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterRanges").build();
    private static final MarshallingInfo<String> TRAININGJOBEARLYSTOPPINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobEarlyStoppingType").build();

    private static final HyperParameterTuningJobConfigMarshaller instance = new HyperParameterTuningJobConfigMarshaller();

    public static HyperParameterTuningJobConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HyperParameterTuningJobConfig hyperParameterTuningJobConfig, ProtocolMarshaller protocolMarshaller) {

        if (hyperParameterTuningJobConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hyperParameterTuningJobConfig.getStrategy(), STRATEGY_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobConfig.getHyperParameterTuningJobObjective(), HYPERPARAMETERTUNINGJOBOBJECTIVE_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobConfig.getResourceLimits(), RESOURCELIMITS_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobConfig.getParameterRanges(), PARAMETERRANGES_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobConfig.getTrainingJobEarlyStoppingType(), TRAININGJOBEARLYSTOPPINGTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
