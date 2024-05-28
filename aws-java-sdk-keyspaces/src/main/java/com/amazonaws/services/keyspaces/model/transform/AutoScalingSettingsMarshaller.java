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
package com.amazonaws.services.keyspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.keyspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoScalingSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingSettingsMarshaller {

    private static final MarshallingInfo<Boolean> AUTOSCALINGDISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingDisabled").build();
    private static final MarshallingInfo<Long> MINIMUMUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("minimumUnits").build();
    private static final MarshallingInfo<Long> MAXIMUMUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maximumUnits").build();
    private static final MarshallingInfo<StructuredPojo> SCALINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingPolicy").build();

    private static final AutoScalingSettingsMarshaller instance = new AutoScalingSettingsMarshaller();

    public static AutoScalingSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingSettings autoScalingSettings, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingSettings.getAutoScalingDisabled(), AUTOSCALINGDISABLED_BINDING);
            protocolMarshaller.marshall(autoScalingSettings.getMinimumUnits(), MINIMUMUNITS_BINDING);
            protocolMarshaller.marshall(autoScalingSettings.getMaximumUnits(), MAXIMUMUNITS_BINDING);
            protocolMarshaller.marshall(autoScalingSettings.getScalingPolicy(), SCALINGPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
