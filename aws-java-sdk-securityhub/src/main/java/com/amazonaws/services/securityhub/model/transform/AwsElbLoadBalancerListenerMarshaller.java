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
 * AwsElbLoadBalancerListenerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElbLoadBalancerListenerMarshaller {

    private static final MarshallingInfo<Integer> INSTANCEPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstancePort").build();
    private static final MarshallingInfo<String> INSTANCEPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProtocol").build();
    private static final MarshallingInfo<Integer> LOADBALANCERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadBalancerPort").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocol").build();
    private static final MarshallingInfo<String> SSLCERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslCertificateId").build();

    private static final AwsElbLoadBalancerListenerMarshaller instance = new AwsElbLoadBalancerListenerMarshaller();

    public static AwsElbLoadBalancerListenerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElbLoadBalancerListener awsElbLoadBalancerListener, ProtocolMarshaller protocolMarshaller) {

        if (awsElbLoadBalancerListener == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElbLoadBalancerListener.getInstancePort(), INSTANCEPORT_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerListener.getInstanceProtocol(), INSTANCEPROTOCOL_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerListener.getLoadBalancerPort(), LOADBALANCERPORT_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerListener.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(awsElbLoadBalancerListener.getSslCertificateId(), SSLCERTIFICATEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
