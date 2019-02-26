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
 * HyperParameterTrainingJobDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HyperParameterTrainingJobDefinitionMarshaller {

    private static final MarshallingInfo<Map> STATICHYPERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StaticHyperParameters").build();
    private static final MarshallingInfo<StructuredPojo> ALGORITHMSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmSpecification").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<List> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceConfig").build();
    private static final MarshallingInfo<StructuredPojo> STOPPINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StoppingCondition").build();
    private static final MarshallingInfo<Boolean> ENABLENETWORKISOLATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableNetworkIsolation").build();
    private static final MarshallingInfo<Boolean> ENABLEINTERCONTAINERTRAFFICENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableInterContainerTrafficEncryption").build();

    private static final HyperParameterTrainingJobDefinitionMarshaller instance = new HyperParameterTrainingJobDefinitionMarshaller();

    public static HyperParameterTrainingJobDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HyperParameterTrainingJobDefinition hyperParameterTrainingJobDefinition, ProtocolMarshaller protocolMarshaller) {

        if (hyperParameterTrainingJobDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getStaticHyperParameters(), STATICHYPERPARAMETERS_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getAlgorithmSpecification(), ALGORITHMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getResourceConfig(), RESOURCECONFIG_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getStoppingCondition(), STOPPINGCONDITION_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getEnableNetworkIsolation(), ENABLENETWORKISOLATION_BINDING);
            protocolMarshaller.marshall(hyperParameterTrainingJobDefinition.getEnableInterContainerTrafficEncryption(),
                    ENABLEINTERCONTAINERTRAFFICENCRYPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
