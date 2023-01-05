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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsMarshaller {

    private static final MarshallingInfo<List> FLAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Flags").build();
    private static final MarshallingInfo<List> MASKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Masks").build();

    private static final RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsMarshaller instance = new RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsMarshaller();

    public static RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleGroupSourceStatelessRuleMatchAttributesTcpFlags ruleGroupSourceStatelessRuleMatchAttributesTcpFlags,
            ProtocolMarshaller protocolMarshaller) {

        if (ruleGroupSourceStatelessRuleMatchAttributesTcpFlags == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleGroupSourceStatelessRuleMatchAttributesTcpFlags.getFlags(), FLAGS_BINDING);
            protocolMarshaller.marshall(ruleGroupSourceStatelessRuleMatchAttributesTcpFlags.getMasks(), MASKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
