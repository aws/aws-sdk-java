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
 * AwsEcsServiceLoadBalancersDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsServiceLoadBalancersDetailsMarshaller {

    private static final MarshallingInfo<String> CONTAINERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerName").build();
    private static final MarshallingInfo<Integer> CONTAINERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerPort").build();
    private static final MarshallingInfo<String> LOADBALANCERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadBalancerName").build();
    private static final MarshallingInfo<String> TARGETGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetGroupArn").build();

    private static final AwsEcsServiceLoadBalancersDetailsMarshaller instance = new AwsEcsServiceLoadBalancersDetailsMarshaller();

    public static AwsEcsServiceLoadBalancersDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsServiceLoadBalancersDetails awsEcsServiceLoadBalancersDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsServiceLoadBalancersDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsServiceLoadBalancersDetails.getContainerName(), CONTAINERNAME_BINDING);
            protocolMarshaller.marshall(awsEcsServiceLoadBalancersDetails.getContainerPort(), CONTAINERPORT_BINDING);
            protocolMarshaller.marshall(awsEcsServiceLoadBalancersDetails.getLoadBalancerName(), LOADBALANCERNAME_BINDING);
            protocolMarshaller.marshall(awsEcsServiceLoadBalancersDetails.getTargetGroupArn(), TARGETGROUPARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
