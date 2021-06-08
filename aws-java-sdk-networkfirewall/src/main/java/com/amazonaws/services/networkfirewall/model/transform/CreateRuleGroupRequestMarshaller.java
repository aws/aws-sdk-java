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
 * CreateRuleGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRuleGroupRequestMarshaller {

    private static final MarshallingInfo<String> RULEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupName").build();
    private static final MarshallingInfo<StructuredPojo> RULEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroup").build();
    private static final MarshallingInfo<String> RULES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rules").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Capacity").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();

    private static final CreateRuleGroupRequestMarshaller instance = new CreateRuleGroupRequestMarshaller();

    public static CreateRuleGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRuleGroupRequest createRuleGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRuleGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRuleGroupRequest.getRuleGroupName(), RULEGROUPNAME_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getRuleGroup(), RULEGROUP_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getRules(), RULES_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createRuleGroupRequest.getDryRun(), DRYRUN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
