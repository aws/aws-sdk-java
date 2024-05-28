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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifecyclePolicyDetailExclusionRulesAmisLastLaunchedMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifecyclePolicyDetailExclusionRulesAmisLastLaunchedMarshaller {

    private static final MarshallingInfo<Integer> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("value").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unit").build();

    private static final LifecyclePolicyDetailExclusionRulesAmisLastLaunchedMarshaller instance = new LifecyclePolicyDetailExclusionRulesAmisLastLaunchedMarshaller();

    public static LifecyclePolicyDetailExclusionRulesAmisLastLaunchedMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifecyclePolicyDetailExclusionRulesAmisLastLaunched lifecyclePolicyDetailExclusionRulesAmisLastLaunched,
            ProtocolMarshaller protocolMarshaller) {

        if (lifecyclePolicyDetailExclusionRulesAmisLastLaunched == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifecyclePolicyDetailExclusionRulesAmisLastLaunched.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyDetailExclusionRulesAmisLastLaunched.getUnit(), UNIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
