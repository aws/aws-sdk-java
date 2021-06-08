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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAutoScalingAutoScalingGroupDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAutoScalingAutoScalingGroupDetailsMarshaller {

    private static final MarshallingInfo<String> LAUNCHCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchConfigurationName").build();
    private static final MarshallingInfo<List> LOADBALANCERNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadBalancerNames").build();
    private static final MarshallingInfo<String> HEALTHCHECKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckType").build();
    private static final MarshallingInfo<Integer> HEALTHCHECKGRACEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthCheckGracePeriod").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").build();

    private static final AwsAutoScalingAutoScalingGroupDetailsMarshaller instance = new AwsAutoScalingAutoScalingGroupDetailsMarshaller();

    public static AwsAutoScalingAutoScalingGroupDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAutoScalingAutoScalingGroupDetails awsAutoScalingAutoScalingGroupDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAutoScalingAutoScalingGroupDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupDetails.getLaunchConfigurationName(), LAUNCHCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupDetails.getLoadBalancerNames(), LOADBALANCERNAMES_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupDetails.getHealthCheckType(), HEALTHCHECKTYPE_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupDetails.getHealthCheckGracePeriod(), HEALTHCHECKGRACEPERIOD_BINDING);
            protocolMarshaller.marshall(awsAutoScalingAutoScalingGroupDetails.getCreatedTime(), CREATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
