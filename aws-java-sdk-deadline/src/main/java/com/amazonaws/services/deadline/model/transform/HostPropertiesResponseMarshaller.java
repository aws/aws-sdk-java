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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HostPropertiesResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HostPropertiesResponseMarshaller {

    private static final MarshallingInfo<String> EC2INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceArn").build();
    private static final MarshallingInfo<String> EC2INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceType").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostName").build();
    private static final MarshallingInfo<StructuredPojo> IPADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipAddresses").build();

    private static final HostPropertiesResponseMarshaller instance = new HostPropertiesResponseMarshaller();

    public static HostPropertiesResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HostPropertiesResponse hostPropertiesResponse, ProtocolMarshaller protocolMarshaller) {

        if (hostPropertiesResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hostPropertiesResponse.getEc2InstanceArn(), EC2INSTANCEARN_BINDING);
            protocolMarshaller.marshall(hostPropertiesResponse.getEc2InstanceType(), EC2INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(hostPropertiesResponse.getHostName(), HOSTNAME_BINDING);
            protocolMarshaller.marshall(hostPropertiesResponse.getIpAddresses(), IPADDRESSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
