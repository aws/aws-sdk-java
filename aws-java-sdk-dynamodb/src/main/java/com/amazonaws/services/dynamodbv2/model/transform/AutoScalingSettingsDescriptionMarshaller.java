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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoScalingSettingsDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingSettingsDescriptionMarshaller {

    private static final MarshallingInfo<Long> MINIMUMUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MinimumUnits").build();
    private static final MarshallingInfo<Long> MAXIMUMUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaximumUnits").build();
    private static final MarshallingInfo<Boolean> AUTOSCALINGDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingDisabled").build();
    private static final MarshallingInfo<String> AUTOSCALINGROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingRoleArn").build();
    private static final MarshallingInfo<List> SCALINGPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPolicies").build();

    private static final AutoScalingSettingsDescriptionMarshaller instance = new AutoScalingSettingsDescriptionMarshaller();

    public static AutoScalingSettingsDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingSettingsDescription autoScalingSettingsDescription, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingSettingsDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingSettingsDescription.getMinimumUnits(), MINIMUMUNITS_BINDING);
            protocolMarshaller.marshall(autoScalingSettingsDescription.getMaximumUnits(), MAXIMUMUNITS_BINDING);
            protocolMarshaller.marshall(autoScalingSettingsDescription.getAutoScalingDisabled(), AUTOSCALINGDISABLED_BINDING);
            protocolMarshaller.marshall(autoScalingSettingsDescription.getAutoScalingRoleArn(), AUTOSCALINGROLEARN_BINDING);
            protocolMarshaller.marshall(autoScalingSettingsDescription.getScalingPolicies(), SCALINGPOLICIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
