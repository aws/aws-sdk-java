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
package com.amazonaws.services.route53resolver.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53resolver.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFirewallRuleGroupAssociationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFirewallRuleGroupAssociationRequestMarshaller {

    private static final MarshallingInfo<String> FIREWALLRULEGROUPASSOCIATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallRuleGroupAssociationId").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> MUTATIONPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MutationProtection").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();

    private static final UpdateFirewallRuleGroupAssociationRequestMarshaller instance = new UpdateFirewallRuleGroupAssociationRequestMarshaller();

    public static UpdateFirewallRuleGroupAssociationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFirewallRuleGroupAssociationRequest updateFirewallRuleGroupAssociationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFirewallRuleGroupAssociationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFirewallRuleGroupAssociationRequest.getFirewallRuleGroupAssociationId(), FIREWALLRULEGROUPASSOCIATIONID_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleGroupAssociationRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleGroupAssociationRequest.getMutationProtection(), MUTATIONPROTECTION_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleGroupAssociationRequest.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
