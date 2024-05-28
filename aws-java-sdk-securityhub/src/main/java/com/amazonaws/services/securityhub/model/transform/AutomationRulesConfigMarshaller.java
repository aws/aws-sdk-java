/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutomationRulesConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomationRulesConfigMarshaller {

    private static final MarshallingInfo<String> RULEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleArn").build();
    private static final MarshallingInfo<String> RULESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleStatus").build();
    private static final MarshallingInfo<Integer> RULEORDER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleOrder").build();
    private static final MarshallingInfo<String> RULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Boolean> ISTERMINAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsTerminal").build();
    private static final MarshallingInfo<StructuredPojo> CRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Criteria").build();
    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Actions").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();

    private static final AutomationRulesConfigMarshaller instance = new AutomationRulesConfigMarshaller();

    public static AutomationRulesConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomationRulesConfig automationRulesConfig, ProtocolMarshaller protocolMarshaller) {

        if (automationRulesConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automationRulesConfig.getRuleArn(), RULEARN_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getRuleStatus(), RULESTATUS_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getRuleOrder(), RULEORDER_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getRuleName(), RULENAME_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getIsTerminal(), ISTERMINAL_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getCriteria(), CRITERIA_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(automationRulesConfig.getCreatedBy(), CREATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
