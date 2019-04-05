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
 * CanarySettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CanarySettingsMarshaller {

    private static final MarshallingInfo<Double> PERCENTTRAFFIC_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("percentTraffic").build();
    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentId").build();
    private static final MarshallingInfo<Map> STAGEVARIABLEOVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stageVariableOverrides").build();
    private static final MarshallingInfo<Boolean> USESTAGECACHE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useStageCache").build();

    private static final CanarySettingsMarshaller instance = new CanarySettingsMarshaller();

    public static CanarySettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CanarySettings canarySettings, ProtocolMarshaller protocolMarshaller) {

        if (canarySettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(canarySettings.getPercentTraffic(), PERCENTTRAFFIC_BINDING);
            protocolMarshaller.marshall(canarySettings.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(canarySettings.getStageVariableOverrides(), STAGEVARIABLEOVERRIDES_BINDING);
            protocolMarshaller.marshall(canarySettings.getUseStageCache(), USESTAGECACHE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
