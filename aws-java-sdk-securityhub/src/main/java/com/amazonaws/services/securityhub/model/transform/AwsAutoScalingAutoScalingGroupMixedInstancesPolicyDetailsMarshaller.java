/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> INSTANCESDISTRIBUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstancesDistribution").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchTemplate").build();

    private static final AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsMarshaller instance = new AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsMarshaller();

    public static AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails.getInstancesDistribution(), INSTANCESDISTRIBUTION_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails.getLaunchTemplate(), LAUNCHTEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
