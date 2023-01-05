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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HyperParameterTuningJobSearchEntityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HyperParameterTuningJobSearchEntityMarshaller {

    private static final MarshallingInfo<String> HYPERPARAMETERTUNINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobName").build();
    private static final MarshallingInfo<String> HYPERPARAMETERTUNINGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobArn").build();
    private static final MarshallingInfo<StructuredPojo> HYPERPARAMETERTUNINGJOBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobConfig").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGJOBDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobDefinition").build();
    private static final MarshallingInfo<List> TRAININGJOBDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobDefinitions").build();
    private static final MarshallingInfo<String> HYPERPARAMETERTUNINGJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningJobStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> HYPERPARAMETERTUNINGENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HyperParameterTuningEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGJOBSTATUSCOUNTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobStatusCounters").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTIVESTATUSCOUNTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectiveStatusCounters").build();
    private static final MarshallingInfo<StructuredPojo> BESTTRAININGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BestTrainingJob").build();
    private static final MarshallingInfo<StructuredPojo> OVERALLBESTTRAININGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverallBestTrainingJob").build();
    private static final MarshallingInfo<StructuredPojo> WARMSTARTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WarmStartConfig").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final HyperParameterTuningJobSearchEntityMarshaller instance = new HyperParameterTuningJobSearchEntityMarshaller();

    public static HyperParameterTuningJobSearchEntityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HyperParameterTuningJobSearchEntity hyperParameterTuningJobSearchEntity, ProtocolMarshaller protocolMarshaller) {

        if (hyperParameterTuningJobSearchEntity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getHyperParameterTuningJobName(), HYPERPARAMETERTUNINGJOBNAME_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getHyperParameterTuningJobArn(), HYPERPARAMETERTUNINGJOBARN_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getHyperParameterTuningJobConfig(), HYPERPARAMETERTUNINGJOBCONFIG_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getTrainingJobDefinition(), TRAININGJOBDEFINITION_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getTrainingJobDefinitions(), TRAININGJOBDEFINITIONS_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getHyperParameterTuningJobStatus(), HYPERPARAMETERTUNINGJOBSTATUS_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getHyperParameterTuningEndTime(), HYPERPARAMETERTUNINGENDTIME_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getTrainingJobStatusCounters(), TRAININGJOBSTATUSCOUNTERS_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getObjectiveStatusCounters(), OBJECTIVESTATUSCOUNTERS_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getBestTrainingJob(), BESTTRAININGJOB_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getOverallBestTrainingJob(), OVERALLBESTTRAININGJOB_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getWarmStartConfig(), WARMSTARTCONFIG_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobSearchEntity.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
