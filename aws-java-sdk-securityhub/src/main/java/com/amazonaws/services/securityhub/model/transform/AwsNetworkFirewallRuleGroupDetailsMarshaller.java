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
 * AwsNetworkFirewallRuleGroupDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsNetworkFirewallRuleGroupDetailsMarshaller {

    private static final MarshallingInfo<Integer> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Capacity").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> RULEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroup").build();
    private static final MarshallingInfo<String> RULEGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupArn").build();
    private static final MarshallingInfo<String> RULEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupId").build();
    private static final MarshallingInfo<String> RULEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupName").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final AwsNetworkFirewallRuleGroupDetailsMarshaller instance = new AwsNetworkFirewallRuleGroupDetailsMarshaller();

    public static AwsNetworkFirewallRuleGroupDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsNetworkFirewallRuleGroupDetails awsNetworkFirewallRuleGroupDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsNetworkFirewallRuleGroupDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsNetworkFirewallRuleGroupDetails.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallRuleGroupDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallRuleGroupDetails.getRuleGroup(), RULEGROUP_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallRuleGroupDetails.getRuleGroupArn(), RULEGROUPARN_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallRuleGroupDetails.getRuleGroupId(), RULEGROUPID_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallRuleGroupDetails.getRuleGroupName(), RULEGROUPNAME_BINDING);
            protocolMarshaller.marshall(awsNetworkFirewallRuleGroupDetails.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
