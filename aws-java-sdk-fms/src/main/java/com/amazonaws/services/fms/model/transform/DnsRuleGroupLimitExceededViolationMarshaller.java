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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DnsRuleGroupLimitExceededViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DnsRuleGroupLimitExceededViolationMarshaller {

    private static final MarshallingInfo<String> VIOLATIONTARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationTarget").build();
    private static final MarshallingInfo<String> VIOLATIONTARGETDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationTargetDescription").build();
    private static final MarshallingInfo<Integer> NUMBEROFRULEGROUPSALREADYASSOCIATED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfRuleGroupsAlreadyAssociated").build();

    private static final DnsRuleGroupLimitExceededViolationMarshaller instance = new DnsRuleGroupLimitExceededViolationMarshaller();

    public static DnsRuleGroupLimitExceededViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DnsRuleGroupLimitExceededViolation dnsRuleGroupLimitExceededViolation, ProtocolMarshaller protocolMarshaller) {

        if (dnsRuleGroupLimitExceededViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dnsRuleGroupLimitExceededViolation.getViolationTarget(), VIOLATIONTARGET_BINDING);
            protocolMarshaller.marshall(dnsRuleGroupLimitExceededViolation.getViolationTargetDescription(), VIOLATIONTARGETDESCRIPTION_BINDING);
            protocolMarshaller.marshall(dnsRuleGroupLimitExceededViolation.getNumberOfRuleGroupsAlreadyAssociated(),
                    NUMBEROFRULEGROUPSALREADYASSOCIATED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
