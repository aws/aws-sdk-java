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
 * BlueGreenDeploymentConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BlueGreenDeploymentConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> TERMINATEBLUEINSTANCESONDEPLOYMENTSUCCESS_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terminateBlueInstancesOnDeploymentSuccess")
            .build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTREADYOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentReadyOption").build();
    private static final MarshallingInfo<StructuredPojo> GREENFLEETPROVISIONINGOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greenFleetProvisioningOption").build();

    private static final BlueGreenDeploymentConfigurationMarshaller instance = new BlueGreenDeploymentConfigurationMarshaller();

    public static BlueGreenDeploymentConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (blueGreenDeploymentConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(blueGreenDeploymentConfiguration.getTerminateBlueInstancesOnDeploymentSuccess(),
                    TERMINATEBLUEINSTANCESONDEPLOYMENTSUCCESS_BINDING);
            protocolMarshaller.marshall(blueGreenDeploymentConfiguration.getDeploymentReadyOption(), DEPLOYMENTREADYOPTION_BINDING);
            protocolMarshaller.marshall(blueGreenDeploymentConfiguration.getGreenFleetProvisioningOption(), GREENFLEETPROVISIONINGOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
