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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentCanarySettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentCanarySettingsMarshaller {

    private static final MarshallingInfo<Double> PERCENTTRAFFIC_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("percentTraffic").build();
    private static final MarshallingInfo<Map> STAGEVARIABLEOVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stageVariableOverrides").build();
    private static final MarshallingInfo<Boolean> USESTAGECACHE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useStageCache").build();

    private static final DeploymentCanarySettingsMarshaller instance = new DeploymentCanarySettingsMarshaller();

    public static DeploymentCanarySettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentCanarySettings deploymentCanarySettings, ProtocolMarshaller protocolMarshaller) {

        if (deploymentCanarySettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentCanarySettings.getPercentTraffic(), PERCENTTRAFFIC_BINDING);
            protocolMarshaller.marshall(deploymentCanarySettings.getStageVariableOverrides(), STAGEVARIABLEOVERRIDES_BINDING);
            protocolMarshaller.marshall(deploymentCanarySettings.getUseStageCache(), USESTAGECACHE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
