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
package com.amazonaws.services.networkfirewall.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FirewallPolicyResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FirewallPolicyResponseMarshaller {

    private static final MarshallingInfo<String> FIREWALLPOLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyName").build();
    private static final MarshallingInfo<String> FIREWALLPOLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyArn").build();
    private static final MarshallingInfo<String> FIREWALLPOLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> FIREWALLPOLICYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyStatus").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final FirewallPolicyResponseMarshaller instance = new FirewallPolicyResponseMarshaller();

    public static FirewallPolicyResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FirewallPolicyResponse firewallPolicyResponse, ProtocolMarshaller protocolMarshaller) {

        if (firewallPolicyResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(firewallPolicyResponse.getFirewallPolicyName(), FIREWALLPOLICYNAME_BINDING);
            protocolMarshaller.marshall(firewallPolicyResponse.getFirewallPolicyArn(), FIREWALLPOLICYARN_BINDING);
            protocolMarshaller.marshall(firewallPolicyResponse.getFirewallPolicyId(), FIREWALLPOLICYID_BINDING);
            protocolMarshaller.marshall(firewallPolicyResponse.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(firewallPolicyResponse.getFirewallPolicyStatus(), FIREWALLPOLICYSTATUS_BINDING);
            protocolMarshaller.marshall(firewallPolicyResponse.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
