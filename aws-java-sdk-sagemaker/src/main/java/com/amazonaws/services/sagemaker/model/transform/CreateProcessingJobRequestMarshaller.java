/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateProcessingJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateProcessingJobRequestMarshaller {

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
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> EXPERIMENTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExperimentConfig").build();

    private static final CreateProcessingJobRequestMarshaller instance = new CreateProcessingJobRequestMarshaller();

    public static CreateProcessingJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateProcessingJobRequest createProcessingJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createProcessingJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createProcessingJobRequest.getProcessingInputs(), PROCESSINGINPUTS_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getProcessingOutputConfig(), PROCESSINGOUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getProcessingJobName(), PROCESSINGJOBNAME_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getProcessingResources(), PROCESSINGRESOURCES_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getAppSpecification(), APPSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getNetworkConfig(), NETWORKCONFIG_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createProcessingJobRequest.getExperimentConfig(), EXPERIMENTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
