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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipelineExecutionStepMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipelineExecutionStepMarshaller {

    private static final MarshallingInfo<String> STEPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StepName").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STEPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepStatus").build();
    private static final MarshallingInfo<StructuredPojo> CACHEHITRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CacheHitResult").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Metadata").build();

    private static final PipelineExecutionStepMarshaller instance = new PipelineExecutionStepMarshaller();

    public static PipelineExecutionStepMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipelineExecutionStep pipelineExecutionStep, ProtocolMarshaller protocolMarshaller) {

        if (pipelineExecutionStep == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipelineExecutionStep.getStepName(), STEPNAME_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStep.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStep.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStep.getStepStatus(), STEPSTATUS_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStep.getCacheHitResult(), CACHEHITRESULT_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStep.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStep.getMetadata(), METADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
