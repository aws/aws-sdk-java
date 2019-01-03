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
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentTargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentTargetMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTTARGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentTargetType").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCETARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceTarget").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDATARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaTarget").build();
    private static final MarshallingInfo<StructuredPojo> ECSTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecsTarget").build();

    private static final DeploymentTargetMarshaller instance = new DeploymentTargetMarshaller();

    public static DeploymentTargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentTarget deploymentTarget, ProtocolMarshaller protocolMarshaller) {

        if (deploymentTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentTarget.getDeploymentTargetType(), DEPLOYMENTTARGETTYPE_BINDING);
            protocolMarshaller.marshall(deploymentTarget.getInstanceTarget(), INSTANCETARGET_BINDING);
            protocolMarshaller.marshall(deploymentTarget.getLambdaTarget(), LAMBDATARGET_BINDING);
            protocolMarshaller.marshall(deploymentTarget.getEcsTarget(), ECSTARGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
