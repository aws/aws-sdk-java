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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFirewallPolicyChangeProtectionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFirewallPolicyChangeProtectionRequestMarshaller {

    private static final MarshallingInfo<String> UPDATETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateToken").build();
    private static final MarshallingInfo<String> FIREWALLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallArn").build();
    private static final MarshallingInfo<String> FIREWALLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallName").build();
    private static final MarshallingInfo<Boolean> FIREWALLPOLICYCHANGEPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallPolicyChangeProtection").build();

    private static final UpdateFirewallPolicyChangeProtectionRequestMarshaller instance = new UpdateFirewallPolicyChangeProtectionRequestMarshaller();

    public static UpdateFirewallPolicyChangeProtectionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFirewallPolicyChangeProtectionRequest updateFirewallPolicyChangeProtectionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFirewallPolicyChangeProtectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFirewallPolicyChangeProtectionRequest.getUpdateToken(), UPDATETOKEN_BINDING);
            protocolMarshaller.marshall(updateFirewallPolicyChangeProtectionRequest.getFirewallArn(), FIREWALLARN_BINDING);
            protocolMarshaller.marshall(updateFirewallPolicyChangeProtectionRequest.getFirewallName(), FIREWALLNAME_BINDING);
            protocolMarshaller
                    .marshall(updateFirewallPolicyChangeProtectionRequest.getFirewallPolicyChangeProtection(), FIREWALLPOLICYCHANGEPROTECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
