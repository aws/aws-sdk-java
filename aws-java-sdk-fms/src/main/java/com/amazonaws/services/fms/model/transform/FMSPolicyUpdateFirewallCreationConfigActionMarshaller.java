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
package com.amazonaws.services.fms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FMSPolicyUpdateFirewallCreationConfigActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FMSPolicyUpdateFirewallCreationConfigActionMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> FIREWALLCREATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallCreationConfig").build();

    private static final FMSPolicyUpdateFirewallCreationConfigActionMarshaller instance = new FMSPolicyUpdateFirewallCreationConfigActionMarshaller();

    public static FMSPolicyUpdateFirewallCreationConfigActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FMSPolicyUpdateFirewallCreationConfigAction fMSPolicyUpdateFirewallCreationConfigAction, ProtocolMarshaller protocolMarshaller) {

        if (fMSPolicyUpdateFirewallCreationConfigAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fMSPolicyUpdateFirewallCreationConfigAction.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(fMSPolicyUpdateFirewallCreationConfigAction.getFirewallCreationConfig(), FIREWALLCREATIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
