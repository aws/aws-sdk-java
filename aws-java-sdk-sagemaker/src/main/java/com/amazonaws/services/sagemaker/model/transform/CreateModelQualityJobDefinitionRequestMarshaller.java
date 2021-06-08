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
 * CreateModelQualityJobDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateModelQualityJobDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> JOBDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobDefinitionName").build();
    private static final MarshallingInfo<StructuredPojo> MODELQUALITYBASELINECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelQualityBaselineConfig").build();
    private static final MarshallingInfo<StructuredPojo> MODELQUALITYAPPSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelQualityAppSpecification").build();
    private static final MarshallingInfo<StructuredPojo> MODELQUALITYJOBINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelQualityJobInput").build();
    private static final MarshallingInfo<StructuredPojo> MODELQUALITYJOBOUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelQualityJobOutputConfig").build();
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

    private static final CreateModelQualityJobDefinitionRequestMarshaller instance = new CreateModelQualityJobDefinitionRequestMarshaller();

    public static CreateModelQualityJobDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateModelQualityJobDefinitionRequest createModelQualityJobDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createModelQualityJobDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getJobDefinitionName(), JOBDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getModelQualityBaselineConfig(), MODELQUALITYBASELINECONFIG_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getModelQualityAppSpecification(), MODELQUALITYAPPSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getModelQualityJobInput(), MODELQUALITYJOBINPUT_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getModelQualityJobOutputConfig(), MODELQUALITYJOBOUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getJobResources(), JOBRESOURCES_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getNetworkConfig(), NETWORKCONFIG_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(createModelQualityJobDefinitionRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
