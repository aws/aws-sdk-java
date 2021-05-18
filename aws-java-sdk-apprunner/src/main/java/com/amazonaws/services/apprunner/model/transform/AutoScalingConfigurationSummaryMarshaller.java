/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apprunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoScalingConfigurationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingConfigurationSummaryMarshaller {

    private static final MarshallingInfo<String> AUTOSCALINGCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingConfigurationArn").build();
    private static final MarshallingInfo<String> AUTOSCALINGCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingConfigurationName").build();
    private static final MarshallingInfo<Integer> AUTOSCALINGCONFIGURATIONREVISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingConfigurationRevision").build();

    private static final AutoScalingConfigurationSummaryMarshaller instance = new AutoScalingConfigurationSummaryMarshaller();

    public static AutoScalingConfigurationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingConfigurationSummary autoScalingConfigurationSummary, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingConfigurationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingConfigurationSummary.getAutoScalingConfigurationArn(), AUTOSCALINGCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(autoScalingConfigurationSummary.getAutoScalingConfigurationName(), AUTOSCALINGCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(autoScalingConfigurationSummary.getAutoScalingConfigurationRevision(), AUTOSCALINGCONFIGURATIONREVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
