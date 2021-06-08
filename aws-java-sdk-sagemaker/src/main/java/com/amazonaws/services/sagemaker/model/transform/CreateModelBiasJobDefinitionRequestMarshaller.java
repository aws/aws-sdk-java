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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateModelBiasJobDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateModelBiasJobDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> JOBDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobDefinitionName").build();
    private static final MarshallingInfo<StructuredPojo> MODELBIASBASELINECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelBiasBaselineConfig").build();
    private static final MarshallingInfo<StructuredPojo> MODELBIASAPPSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelBiasAppSpecification").build();
    private static final MarshallingInfo<StructuredPojo> MODELBIASJOBINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelBiasJobInput").build();
    private static final MarshallingInfo<StructuredPojo> MODELBIASJOBOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelBiasJobOutputConfig").build();
    private static final MarshallingInfo<StructuredPojo> JOBRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobResources").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkConfig").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<StructuredPojo> STOPPINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppingCondition").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateModelBiasJobDefinitionRequestMarshaller instance = new CreateModelBiasJobDefinitionRequestMarshaller();

    public static CreateModelBiasJobDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateModelBiasJobDefinitionRequest createModelBiasJobDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createModelBiasJobDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getJobDefinitionName(), JOBDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getModelBiasBaselineConfig(), MODELBIASBASELINECONFIG_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getModelBiasAppSpecification(), MODELBIASAPPSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getModelBiasJobInput(), MODELBIASJOBINPUT_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getModelBiasJobOutputConfig(), MODELBIASJOBOUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getJobResources(), JOBRESOURCES_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getNetworkConfig(), NETWORKCONFIG_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(createModelBiasJobDefinitionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
