/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ProcessingJobMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProcessingJobMarshaller {

    private static final MarshallingInfo<List> PROCESSINGINPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingInputs").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingOutputConfig").build();
    private static final MarshallingInfo<String> PROCESSINGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingJobName").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingResources").build();
    private static final MarshallingInfo<StructuredPojo> STOPPINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppingCondition").build();
    private static final MarshallingInfo<StructuredPojo> APPSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppSpecification").build();
    private static final MarshallingInfo<Map> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<StructuredPojo> EXPERIMENTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExperimentConfig").build();
    private static final MarshallingInfo<String> PROCESSINGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingJobArn").build();
    private static final MarshallingInfo<String> PROCESSINGJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingJobStatus").build();
    private static final MarshallingInfo<String> EXITMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExitMessage").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<java.util.Date> PROCESSINGENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> PROCESSINGSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MONITORINGSCHEDULEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoringScheduleArn").build();
    private static final MarshallingInfo<String> AUTOMLJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMLJobArn").build();
    private static final MarshallingInfo<String> TRAININGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final ProcessingJobMarshaller instance = new ProcessingJobMarshaller();

    public static ProcessingJobMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProcessingJob processingJob, ProtocolMarshaller protocolMarshaller) {

        if (processingJob == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(processingJob.getProcessingInputs(), PROCESSINGINPUTS_BINDING);
            protocolMarshaller.marshall(processingJob.getProcessingOutputConfig(), PROCESSINGOUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(processingJob.getProcessingJobName(), PROCESSINGJOBNAME_BINDING);
            protocolMarshaller.marshall(processingJob.getProcessingResources(), PROCESSINGRESOURCES_BINDING);
            protocolMarshaller.marshall(processingJob.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(processingJob.getAppSpecification(), APPSPECIFICATION_BINDING);
            protocolMarshaller.marshall(processingJob.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(processingJob.getNetworkConfig(), NETWORKCONFIG_BINDING);
            protocolMarshaller.marshall(processingJob.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(processingJob.getExperimentConfig(), EXPERIMENTCONFIG_BINDING);
            protocolMarshaller.marshall(processingJob.getProcessingJobArn(), PROCESSINGJOBARN_BINDING);
            protocolMarshaller.marshall(processingJob.getProcessingJobStatus(), PROCESSINGJOBSTATUS_BINDING);
            protocolMarshaller.marshall(processingJob.getExitMessage(), EXITMESSAGE_BINDING);
            protocolMarshaller.marshall(processingJob.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(processingJob.getProcessingEndTime(), PROCESSINGENDTIME_BINDING);
            protocolMarshaller.marshall(processingJob.getProcessingStartTime(), PROCESSINGSTARTTIME_BINDING);
            protocolMarshaller.marshall(processingJob.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(processingJob.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(processingJob.getMonitoringScheduleArn(), MONITORINGSCHEDULEARN_BINDING);
            protocolMarshaller.marshall(processingJob.getAutoMLJobArn(), AUTOMLJOBARN_BINDING);
            protocolMarshaller.marshall(processingJob.getTrainingJobArn(), TRAININGJOBARN_BINDING);
            protocolMarshaller.marshall(processingJob.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
