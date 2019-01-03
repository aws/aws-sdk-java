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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMarshaller {

    private static final MarshallingInfo<Boolean> DISABLESCALEIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableScaleIn").build();
    private static final MarshallingInfo<Integer> SCALEINCOOLDOWN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScaleInCooldown").build();
    private static final MarshallingInfo<Integer> SCALEOUTCOOLDOWN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScaleOutCooldown").build();
    private static final MarshallingInfo<Double> TARGETVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetValue").build();

    private static final AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMarshaller instance = new AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMarshaller();

    public static AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingTargetTrackingScalingPolicyConfigurationDescription autoScalingTargetTrackingScalingPolicyConfigurationDescription,
            ProtocolMarshaller protocolMarshaller) {

        if (autoScalingTargetTrackingScalingPolicyConfigurationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingTargetTrackingScalingPolicyConfigurationDescription.getDisableScaleIn(), DISABLESCALEIN_BINDING);
            protocolMarshaller.marshall(autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleInCooldown(), SCALEINCOOLDOWN_BINDING);
            protocolMarshaller.marshall(autoScalingTargetTrackingScalingPolicyConfigurationDescription.getScaleOutCooldown(), SCALEOUTCOOLDOWN_BINDING);
            protocolMarshaller.marshall(autoScalingTargetTrackingScalingPolicyConfigurationDescription.getTargetValue(), TARGETVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
