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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53resolver.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociateFirewallRuleGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociateFirewallRuleGroupRequestMarshaller {

    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> FIREWALLRULEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallRuleGroupId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> MUTATIONPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MutationProtection").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final AssociateFirewallRuleGroupRequestMarshaller instance = new AssociateFirewallRuleGroupRequestMarshaller();

    public static AssociateFirewallRuleGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociateFirewallRuleGroupRequest associateFirewallRuleGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (associateFirewallRuleGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associateFirewallRuleGroupRequest.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(associateFirewallRuleGroupRequest.getFirewallRuleGroupId(), FIREWALLRULEGROUPID_BINDING);
            protocolMarshaller.marshall(associateFirewallRuleGroupRequest.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(associateFirewallRuleGroupRequest.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(associateFirewallRuleGroupRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(associateFirewallRuleGroupRequest.getMutationProtection(), MUTATIONPROTECTION_BINDING);
            protocolMarshaller.marshall(associateFirewallRuleGroupRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
