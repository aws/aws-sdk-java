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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrainingJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrainingJobMarshaller {

    private static final MarshallingInfo<String> TRAININGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobName").build();
    private static final MarshallingInfo<String> TRAININGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobArn").build();
    private static final MarshallingInfo<String> TUNINGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TuningJobArn").build();
    private static final MarshallingInfo<String> LABELINGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelingJobArn").build();
    private static final MarshallingInfo<StructuredPojo> MODELARTIFACTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelArtifacts").build();
    private static final MarshallingInfo<String> TRAININGJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobStatus").build();
    private static final MarshallingInfo<String> SECONDARYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryStatus").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<Map> HYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HyperParameters").build();
    private static final MarshallingInfo<StructuredPojo> ALGORITHMSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmSpecification").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<List> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceConfig").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<StructuredPojo> STOPPINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppingCondition").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRAININGSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TRAININGENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> SECONDARYSTATUSTRANSITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryStatusTransitions").build();
    private static final MarshallingInfo<List> FINALMETRICDATALIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinalMetricDataList").build();
    private static final MarshallingInfo<Boolean> ENABLENETWORKISOLATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableNetworkIsolation").build();
    private static final MarshallingInfo<Boolean> ENABLEINTERCONTAINERTRAFFICENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableInterContainerTrafficEncryption").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final TrainingJobMarshaller instance = new TrainingJobMarshaller();

    public static TrainingJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrainingJob trainingJob, ProtocolMarshaller protocolMarshaller) {

        if (trainingJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trainingJob.getTrainingJobName(), TRAININGJOBNAME_BINDING);
            protocolMarshaller.marshall(trainingJob.getTrainingJobArn(), TRAININGJOBARN_BINDING);
            protocolMarshaller.marshall(trainingJob.getTuningJobArn(), TUNINGJOBARN_BINDING);
            protocolMarshaller.marshall(trainingJob.getLabelingJobArn(), LABELINGJOBARN_BINDING);
            protocolMarshaller.marshall(trainingJob.getModelArtifacts(), MODELARTIFACTS_BINDING);
            protocolMarshaller.marshall(trainingJob.getTrainingJobStatus(), TRAININGJOBSTATUS_BINDING);
            protocolMarshaller.marshall(trainingJob.getSecondaryStatus(), SECONDARYSTATUS_BINDING);
            protocolMarshaller.marshall(trainingJob.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(trainingJob.getHyperParameters(), HYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(trainingJob.getAlgorithmSpecification(), ALGORITHMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(trainingJob.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(trainingJob.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(trainingJob.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(trainingJob.getResourceConfig(), RESOURCECONFIG_BINDING);
            protocolMarshaller.marshall(trainingJob.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(trainingJob.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(trainingJob.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(trainingJob.getTrainingStartTime(), TRAININGSTARTTIME_BINDING);
            protocolMarshaller.marshall(trainingJob.getTrainingEndTime(), TRAININGENDTIME_BINDING);
            protocolMarshaller.marshall(trainingJob.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(trainingJob.getSecondaryStatusTransitions(), SECONDARYSTATUSTRANSITIONS_BINDING);
            protocolMarshaller.marshall(trainingJob.getFinalMetricDataList(), FINALMETRICDATALIST_BINDING);
            protocolMarshaller.marshall(trainingJob.getEnableNetworkIsolation(), ENABLENETWORKISOLATION_BINDING);
            protocolMarshaller.marshall(trainingJob.getEnableInterContainerTrafficEncryption(), ENABLEINTERCONTAINERTRAFFICENCRYPTION_BINDING);
            protocolMarshaller.marshall(trainingJob.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
