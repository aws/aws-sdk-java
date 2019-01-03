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
package com.amazonaws.services.robomaker.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentLaunchConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentLaunchConfigMarshaller {

    private static final MarshallingInfo<String> PACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageName").build();
    private static final MarshallingInfo<String> PRELAUNCHFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preLaunchFile").build();
    private static final MarshallingInfo<String> LAUNCHFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchFile").build();
    private static final MarshallingInfo<String> POSTLAUNCHFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postLaunchFile").build();
    private static final MarshallingInfo<Map> ENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentVariables").build();

    private static final DeploymentLaunchConfigMarshaller instance = new DeploymentLaunchConfigMarshaller();

    public static DeploymentLaunchConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentLaunchConfig deploymentLaunchConfig, ProtocolMarshaller protocolMarshaller) {

        if (deploymentLaunchConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentLaunchConfig.getPackageName(), PACKAGENAME_BINDING);
            protocolMarshaller.marshall(deploymentLaunchConfig.getPreLaunchFile(), PRELAUNCHFILE_BINDING);
            protocolMarshaller.marshall(deploymentLaunchConfig.getLaunchFile(), LAUNCHFILE_BINDING);
            protocolMarshaller.marshall(deploymentLaunchConfig.getPostLaunchFile(), POSTLAUNCHFILE_BINDING);
            protocolMarshaller.marshall(deploymentLaunchConfig.getEnvironmentVariables(), ENVIRONMENTVARIABLES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
