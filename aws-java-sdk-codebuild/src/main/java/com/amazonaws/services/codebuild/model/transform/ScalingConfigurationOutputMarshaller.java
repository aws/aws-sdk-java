/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScalingConfigurationOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScalingConfigurationOutputMarshaller {

    private static final MarshallingInfo<String> SCALINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingType").build();
    private static final MarshallingInfo<List> TARGETTRACKINGSCALINGCONFIGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetTrackingScalingConfigs").build();
    private static final MarshallingInfo<Integer> MAXCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxCapacity").build();
    private static final MarshallingInfo<Integer> DESIREDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredCapacity").build();

    private static final ScalingConfigurationOutputMarshaller instance = new ScalingConfigurationOutputMarshaller();

    public static ScalingConfigurationOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScalingConfigurationOutput scalingConfigurationOutput, ProtocolMarshaller protocolMarshaller) {

        if (scalingConfigurationOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scalingConfigurationOutput.getScalingType(), SCALINGTYPE_BINDING);
            protocolMarshaller.marshall(scalingConfigurationOutput.getTargetTrackingScalingConfigs(), TARGETTRACKINGSCALINGCONFIGS_BINDING);
            protocolMarshaller.marshall(scalingConfigurationOutput.getMaxCapacity(), MAXCAPACITY_BINDING);
            protocolMarshaller.marshall(scalingConfigurationOutput.getDesiredCapacity(), DESIREDCAPACITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
