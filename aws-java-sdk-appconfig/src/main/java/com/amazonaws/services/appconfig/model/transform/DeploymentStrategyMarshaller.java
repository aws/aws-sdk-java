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
package com.amazonaws.services.appconfig.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appconfig.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentStrategyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentStrategyMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> DEPLOYMENTDURATIONINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentDurationInMinutes").build();
    private static final MarshallingInfo<String> GROWTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrowthType").build();
    private static final MarshallingInfo<Float> GROWTHFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrowthFactor").build();
    private static final MarshallingInfo<Integer> FINALBAKETIMEINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinalBakeTimeInMinutes").build();
    private static final MarshallingInfo<String> REPLICATETO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicateTo").build();

    private static final DeploymentStrategyMarshaller instance = new DeploymentStrategyMarshaller();

    public static DeploymentStrategyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentStrategy deploymentStrategy, ProtocolMarshaller protocolMarshaller) {

        if (deploymentStrategy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentStrategy.getId(), ID_BINDING);
            protocolMarshaller.marshall(deploymentStrategy.getName(), NAME_BINDING);
            protocolMarshaller.marshall(deploymentStrategy.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(deploymentStrategy.getDeploymentDurationInMinutes(), DEPLOYMENTDURATIONINMINUTES_BINDING);
            protocolMarshaller.marshall(deploymentStrategy.getGrowthType(), GROWTHTYPE_BINDING);
            protocolMarshaller.marshall(deploymentStrategy.getGrowthFactor(), GROWTHFACTOR_BINDING);
            protocolMarshaller.marshall(deploymentStrategy.getFinalBakeTimeInMinutes(), FINALBAKETIMEINMINUTES_BINDING);
            protocolMarshaller.marshall(deploymentStrategy.getReplicateTo(), REPLICATETO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
