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
 * FirewallRuleGroupAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FirewallRuleGroupAssociationMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> FIREWALLRULEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirewallRuleGroupId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Integer> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> MUTATIONPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MutationProtection").build();
    private static final MarshallingInfo<String> MANAGEDOWNERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedOwnerName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<String> CREATORREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatorRequestId").build();
    private static final MarshallingInfo<String> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").build();
    private static final MarshallingInfo<String> MODIFICATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModificationTime").build();

    private static final FirewallRuleGroupAssociationMarshaller instance = new FirewallRuleGroupAssociationMarshaller();

    public static FirewallRuleGroupAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FirewallRuleGroupAssociation firewallRuleGroupAssociation, ProtocolMarshaller protocolMarshaller) {

        if (firewallRuleGroupAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getId(), ID_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getFirewallRuleGroupId(), FIREWALLRULEGROUPID_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getMutationProtection(), MUTATIONPROTECTION_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getManagedOwnerName(), MANAGEDOWNERNAME_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getCreatorRequestId(), CREATORREQUESTID_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(firewallRuleGroupAssociation.getModificationTime(), MODIFICATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
