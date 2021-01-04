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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsElbLoadBalancerHealthCheckMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElbLoadBalancerHealthCheckMarshaller {

    private static final MarshallingInfo<Integer> HEALTHYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthyThreshold").build();
    private static final MarshallingInfo<Integer> INTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Interval").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Target").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<Integer> UNHEALTHYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnhealthyThreshold").build();

    private static final AwsElbLoadBalancerHealthCheckMarshaller instance = new AwsElbLoadBalancerHealthCheckMarshaller();

    public static AwsElbLoadBalancerHealthCheckMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElbLoadBalancerHealthCheck awsElbLoadBalancerHealthCheck, ProtocolMarshaller protocolMarshaller) {

        if (awsElbLoadBalancerHealthCheck == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElbLoadBalancerHealthCheck.getHealthyThreshold(), HEALTHYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerHealthCheck.getInterval(), INTERVAL_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerHealthCheck.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerHealthCheck.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerHealthCheck.getUnhealthyThreshold(), UNHEALTHYTHRESHOLD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
