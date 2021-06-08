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
 * FirewallRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FirewallRuleMarshaller {

    private static final MarshallingInfo<String> FIREWALLRULEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallRuleGroupId").build();
    private static final MarshallingInfo<String> FIREWALLDOMAINLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallDomainListId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
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
    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId").build();
    private static final MarshallingInfo<String> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").build();
    private static final MarshallingInfo<String> MODIFICATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModificationTime").build();

    private static final FirewallRuleMarshaller instance = new FirewallRuleMarshaller();

    public static FirewallRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FirewallRule firewallRule, ProtocolMarshaller protocolMarshaller) {

        if (firewallRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(firewallRule.getFirewallRuleGroupId(), FIREWALLRULEGROUPID_BINDING);
            protocolMarshaller.marshall(firewallRule.getFirewallDomainListId(), FIREWALLDOMAINLISTID_BINDING);
            protocolMarshaller.marshall(firewallRule.getName(), NAME_BINDING);
            protocolMarshaller.marshall(firewallRule.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(firewallRule.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(firewallRule.getBlockResponse(), BLOCKRESPONSE_BINDING);
            protocolMarshaller.marshall(firewallRule.getBlockOverrideDomain(), BLOCKOVERRIDEDOMAIN_BINDING);
            protocolMarshaller.marshall(firewallRule.getBlockOverrideDnsType(), BLOCKOVERRIDEDNSTYPE_BINDING);
            protocolMarshaller.marshall(firewallRule.getBlockOverrideTtl(), BLOCKOVERRIDETTL_BINDING);
            protocolMarshaller.marshall(firewallRule.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(firewallRule.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(firewallRule.getModificationTime(), MODIFICATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
