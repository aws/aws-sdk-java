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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PipelineExecutionStepMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PipelineExecutionStepMetadataMarshaller {

    private static final MarshallingInfo<StructuredPojo> TRAININGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJob").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingJob").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFORMJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransformJob").build();
    private static final MarshallingInfo<StructuredPojo> TUNINGJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TuningJob").build();
    private static final MarshallingInfo<StructuredPojo> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Model").build();
    private static final MarshallingInfo<StructuredPojo> REGISTERMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisterModel").build();
    private static final MarshallingInfo<StructuredPojo> CONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Condition").build();
    private static final MarshallingInfo<StructuredPojo> CALLBACK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Callback").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Lambda").build();
    private static final MarshallingInfo<StructuredPojo> QUALITYCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualityCheck").build();
    private static final MarshallingInfo<StructuredPojo> CLARIFYCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClarifyCheck").build();
    private static final MarshallingInfo<StructuredPojo> EMR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EMR").build();
    private static final MarshallingInfo<StructuredPojo> FAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Fail").build();
    private static final MarshallingInfo<StructuredPojo> AUTOMLJOB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMLJob").build();

    private static final PipelineExecutionStepMetadataMarshaller instance = new PipelineExecutionStepMetadataMarshaller();

    public static PipelineExecutionStepMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PipelineExecutionStepMetadata pipelineExecutionStepMetadata, ProtocolMarshaller protocolMarshaller) {

        if (pipelineExecutionStepMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getTrainingJob(), TRAININGJOB_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getProcessingJob(), PROCESSINGJOB_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getTransformJob(), TRANSFORMJOB_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getTuningJob(), TUNINGJOB_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getRegisterModel(), REGISTERMODEL_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getCondition(), CONDITION_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getCallback(), CALLBACK_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getLambda(), LAMBDA_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getQualityCheck(), QUALITYCHECK_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getClarifyCheck(), CLARIFYCHECK_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getEMR(), EMR_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getFail(), FAIL_BINDING);
            protocolMarshaller.marshall(pipelineExecutionStepMetadata.getAutoMLJob(), AUTOMLJOB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
