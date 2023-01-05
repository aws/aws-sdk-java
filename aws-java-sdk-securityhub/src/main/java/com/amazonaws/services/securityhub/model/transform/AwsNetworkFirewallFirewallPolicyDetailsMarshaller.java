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
 * AwsNetworkFirewallFirewallPolicyDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsNetworkFirewallFirewallPolicyDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIREWALLPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicy").build();
    private static final MarshallingInfo<String> FIREWALLPOLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyArn").build();
    private static final MarshallingInfo<String> FIREWALLPOLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyId").build();
    private static final MarshallingInfo<String> FIREWALLPOLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final AwsNetworkFirewallFirewallPolicyDetailsMarshaller instance = new AwsNetworkFirewallFirewallPolicyDetailsMarshaller();

    public static AwsNetworkFirewallFirewallPolicyDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsNetworkFirewallFirewallPolicyDetails awsNetworkFirewallFirewallPolicyDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsNetworkFirewallFirewallPolicyDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsNetworkFirewallFirewallPolicyDetails.getFirewallPolicy(), FIREWALLPOLICY_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallFirewallPolicyDetails.getFirewallPolicyArn(), FIREWALLPOLICYARN_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallFirewallPolicyDetails.getFirewallPolicyId(), FIREWALLPOLICYID_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallFirewallPolicyDetails.getFirewallPolicyName(), FIREWALLPOLICYNAME_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallFirewallPolicyDetails.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
