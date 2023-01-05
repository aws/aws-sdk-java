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
package com.amazonaws.services.pipes.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipeTargetParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipeTargetParametersMarshaller {

    private static final MarshallingInfo<StructuredPojo> BATCHJOBPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchJobParameters").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGSPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsParameters").build();
    private static final MarshallingInfo<StructuredPojo> ECSTASKPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EcsTaskParameters").build();
    private static final MarshallingInfo<StructuredPojo> EVENTBRIDGEEVENTBUSPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventBridgeEventBusParameters").build();
    private static final MarshallingInfo<StructuredPojo> HTTPPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpParameters").build();
    private static final MarshallingInfo<String> INPUTTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputTemplate").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamParameters").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaFunctionParameters").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTDATAPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftDataParameters").build();
    private static final MarshallingInfo<StructuredPojo> SAGEMAKERPIPELINEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SageMakerPipelineParameters").build();
    private static final MarshallingInfo<StructuredPojo> SQSQUEUEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqsQueueParameters").build();
    private static final MarshallingInfo<StructuredPojo> STEPFUNCTIONSTATEMACHINEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepFunctionStateMachineParameters").build();

    private static final PipeTargetParametersMarshaller instance = new PipeTargetParametersMarshaller();

    public static PipeTargetParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipeTargetParameters pipeTargetParameters, ProtocolMarshaller protocolMarshaller) {

        if (pipeTargetParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipeTargetParameters.getBatchJobParameters(), BATCHJOBPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getCloudWatchLogsParameters(), CLOUDWATCHLOGSPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getEcsTaskParameters(), ECSTASKPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getEventBridgeEventBusParameters(), EVENTBRIDGEEVENTBUSPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getHttpParameters(), HTTPPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getInputTemplate(), INPUTTEMPLATE_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getKinesisStreamParameters(), KINESISSTREAMPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getLambdaFunctionParameters(), LAMBDAFUNCTIONPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getRedshiftDataParameters(), REDSHIFTDATAPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getSageMakerPipelineParameters(), SAGEMAKERPIPELINEPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getSqsQueueParameters(), SQSQUEUEPARAMETERS_BINDING);
            protocolMarshaller.marshall(pipeTargetParameters.getStepFunctionStateMachineParameters(), STEPFUNCTIONSTATEMACHINEPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
