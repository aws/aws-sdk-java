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
 * UpdateFirewallRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFirewallRuleRequestMarshaller {

    private static final MarshallingInfo<String> FIREWALLRULEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallRuleGroupId").build();
    private static final MarshallingInfo<String> FIREWALLDOMAINLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallDomainListId").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> BLOCKRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockResponse").build();
    private static final MarshallingInfo<String> BLOCKOVERRIDEDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockOverrideDomain").build();
    private static final MarshallingInfo<String> BLOCKOVERRIDEDNSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockOverrideDnsType").build();
    private static final MarshallingInfo<Integer> BLOCKOVERRIDETTL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockOverrideTtl").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();

    private static final UpdateFirewallRuleRequestMarshaller instance = new UpdateFirewallRuleRequestMarshaller();

    public static UpdateFirewallRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFirewallRuleRequest updateFirewallRuleRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFirewallRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFirewallRuleRequest.getFirewallRuleGroupId(), FIREWALLRULEGROUPID_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getFirewallDomainListId(), FIREWALLDOMAINLISTID_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getBlockResponse(), BLOCKRESPONSE_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getBlockOverrideDomain(), BLOCKOVERRIDEDOMAIN_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getBlockOverrideDnsType(), BLOCKOVERRIDEDNSTYPE_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getBlockOverrideTtl(), BLOCKOVERRIDETTL_BINDING);
            protocolMarshaller.marshall(updateFirewallRuleRequest.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
