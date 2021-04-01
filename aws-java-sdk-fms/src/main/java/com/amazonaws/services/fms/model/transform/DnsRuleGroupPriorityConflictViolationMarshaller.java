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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DnsRuleGroupPriorityConflictViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DnsRuleGroupPriorityConflictViolationMarshaller {

    private static final MarshallingInfo<String> VIOLATIONTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationTarget").build();
    private static final MarshallingInfo<String> VIOLATIONTARGETDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationTargetDescription").build();
    private static final MarshallingInfo<Integer> CONFLICTINGPRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConflictingPriority").build();
    private static final MarshallingInfo<String> CONFLICTINGPOLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConflictingPolicyId").build();
    private static final MarshallingInfo<List> UNAVAILABLEPRIORITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnavailablePriorities").build();

    private static final DnsRuleGroupPriorityConflictViolationMarshaller instance = new DnsRuleGroupPriorityConflictViolationMarshaller();

    public static DnsRuleGroupPriorityConflictViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DnsRuleGroupPriorityConflictViolation dnsRuleGroupPriorityConflictViolation, ProtocolMarshaller protocolMarshaller) {

        if (dnsRuleGroupPriorityConflictViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dnsRuleGroupPriorityConflictViolation.getViolationTarget(), VIOLATIONTARGET_BINDING);
            protocolMarshaller.marshall(dnsRuleGroupPriorityConflictViolation.getViolationTargetDescription(), VIOLATIONTARGETDESCRIPTION_BINDING);
            protocolMarshaller.marshall(dnsRuleGroupPriorityConflictViolation.getConflictingPriority(), CONFLICTINGPRIORITY_BINDING);
            protocolMarshaller.marshall(dnsRuleGroupPriorityConflictViolation.getConflictingPolicyId(), CONFLICTINGPOLICYID_BINDING);
            protocolMarshaller.marshall(dnsRuleGroupPriorityConflictViolation.getUnavailablePriorities(), UNAVAILABLEPRIORITIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
