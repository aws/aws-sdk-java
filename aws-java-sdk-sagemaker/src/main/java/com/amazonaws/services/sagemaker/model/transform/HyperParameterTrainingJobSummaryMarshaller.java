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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HyperParameterTrainingJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HyperParameterTrainingJobSummaryMarshaller {

    private static final MarshallingInfo<String> TRAININGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobName").build();
    private static final MarshallingInfo<String> TRAININGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobArn").build();
    private static final MarshallingInfo<String> TUNINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TuningJobName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRAININGSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRAININGENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TRAININGJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobStatus").build();
    private static final MarshallingInfo<Map> TUNEDHYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TunedHyperParameters").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> FINALHYPERPARAMETERTUNINGJOBOBJECTIVEMETRIC_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinalHyperParameterTuningJobObjectiveMetric")
            .build();
    private static final MarshallingInfo<String> OBJECTIVESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectiveStatus").build();

    private static final HyperParameterTrainingJobSummaryMarshaller instance = new HyperParameterTrainingJobSummaryMarshaller();

    public static HyperParameterTrainingJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HyperParameterTrainingJobSummary hyperParameterTrainingJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (hyperParameterTrainingJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getTrainingJobName(), TRAININGJOBNAME_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getTrainingJobArn(), TRAININGJOBARN_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getTuningJobName(), TUNINGJOBNAME_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getTrainingStartTime(), TRAININGSTARTTIME_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getTrainingEndTime(), TRAININGENDTIME_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getTrainingJobStatus(), TRAININGJOBSTATUS_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getTunedHyperParameters(), TUNEDHYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getFinalHyperParameterTuningJobObjectiveMetric(),
                    FINALHYPERPARAMETERTUNINGJOBOBJECTIVEMETRIC_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobSummary.getObjectiveStatus(), OBJECTIVESTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
