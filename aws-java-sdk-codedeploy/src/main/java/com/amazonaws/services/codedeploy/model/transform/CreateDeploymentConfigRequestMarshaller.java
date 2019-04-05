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
 * CreateDeploymentConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDeploymentConfigRequestMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTCONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentConfigName").build();
    private static final MarshallingInfo<StructuredPojo> MINIMUMHEALTHYHOSTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minimumHealthyHosts").build();
    private static final MarshallingInfo<StructuredPojo> TRAFFICROUTINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trafficRoutingConfig").build();
    private static final MarshallingInfo<String> COMPUTEPLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computePlatform").build();

    private static final CreateDeploymentConfigRequestMarshaller instance = new CreateDeploymentConfigRequestMarshaller();

    public static CreateDeploymentConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDeploymentConfigRequest createDeploymentConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDeploymentConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDeploymentConfigRequest.getDeploymentConfigName(), DEPLOYMENTCONFIGNAME_BINDING);
            protocolMarshaller.marshall(createDeploymentConfigRequest.getMinimumHealthyHosts(), MINIMUMHEALTHYHOSTS_BINDING);
            protocolMarshaller.marshall(createDeploymentConfigRequest.getTrafficRoutingConfig(), TRAFFICROUTINGCONFIG_BINDING);
            protocolMarshaller.marshall(createDeploymentConfigRequest.getComputePlatform(), COMPUTEPLATFORM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
