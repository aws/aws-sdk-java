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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrainingSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrainingSpecificationMarshaller {

    private static final MarshallingInfo<String> TRAININGIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingImage").build();
    private static final MarshallingInfo<String> TRAININGIMAGEDIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingImageDigest").build();
    private static final MarshallingInfo<List> SUPPORTEDHYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedHyperParameters").build();
    private static final MarshallingInfo<List> SUPPORTEDTRAININGINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedTrainingInstanceTypes").build();
    private static final MarshallingInfo<Boolean> SUPPORTSDISTRIBUTEDTRAINING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportsDistributedTraining").build();
    private static final MarshallingInfo<List> METRICDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDefinitions").build();
    private static final MarshallingInfo<List> TRAININGCHANNELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingChannels").build();
    private static final MarshallingInfo<List> SUPPORTEDTUNINGJOBOBJECTIVEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedTuningJobObjectiveMetrics").build();

    private static final TrainingSpecificationMarshaller instance = new TrainingSpecificationMarshaller();

    public static TrainingSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrainingSpecification trainingSpecification, ProtocolMarshaller protocolMarshaller) {

        if (trainingSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trainingSpecification.getTrainingImage(), TRAININGIMAGE_BINDING);
            protocolMarshaller.marshall(trainingSpecification.getTrainingImageDigest(), TRAININGIMAGEDIGEST_BINDING);
            protocolMarshaller.marshall(trainingSpecification.getSupportedHyperParameters(), SUPPORTEDHYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(trainingSpecification.getSupportedTrainingInstanceTypes(), SUPPORTEDTRAININGINSTANCETYPES_BINDING);
            protocolMarshaller.marshall(trainingSpecification.getSupportsDistributedTraining(), SUPPORTSDISTRIBUTEDTRAINING_BINDING);
            protocolMarshaller.marshall(trainingSpecification.getMetricDefinitions(), METRICDEFINITIONS_BINDING);
            protocolMarshaller.marshall(trainingSpecification.getTrainingChannels(), TRAININGCHANNELS_BINDING);
            protocolMarshaller.marshall(trainingSpecification.getSupportedTuningJobObjectiveMetrics(), SUPPORTEDTUNINGJOBOBJECTIVEMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
