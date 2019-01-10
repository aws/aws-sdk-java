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
 * CreateTrainingJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTrainingJobRequestMarshaller {

    private static final MarshallingInfo<String> TRAININGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobName").build();
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
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<Boolean> ENABLENETWORKISOLATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableNetworkIsolation").build();
    private static final MarshallingInfo<Boolean> ENABLEINTERCONTAINERTRAFFICENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableInterContainerTrafficEncryption").build();

    private static final CreateTrainingJobRequestMarshaller instance = new CreateTrainingJobRequestMarshaller();

    public static CreateTrainingJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTrainingJobRequest createTrainingJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTrainingJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTrainingJobRequest.getTrainingJobName(), TRAININGJOBNAME_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getHyperParameters(), HYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getAlgorithmSpecification(), ALGORITHMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getResourceConfig(), RESOURCECONFIG_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getEnableNetworkIsolation(), ENABLENETWORKISOLATION_BINDING);
            protocolMarshaller.marshall(createTrainingJobRequest.getEnableInterContainerTrafficEncryption(), ENABLEINTERCONTAINERTRAFFICENCRYPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
