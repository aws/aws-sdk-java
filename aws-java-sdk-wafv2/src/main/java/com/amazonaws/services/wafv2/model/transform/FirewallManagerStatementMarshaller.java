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
package com.amazonaws.services.wafv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FirewallManagerStatementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FirewallManagerStatementMarshaller {

    private static final MarshallingInfo<StructuredPojo> MANAGEDRULEGROUPSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedRuleGroupStatement").build();
    private static final MarshallingInfo<StructuredPojo> RULEGROUPREFERENCESTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupReferenceStatement").build();

    private static final FirewallManagerStatementMarshaller instance = new FirewallManagerStatementMarshaller();

    public static FirewallManagerStatementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FirewallManagerStatement firewallManagerStatement, ProtocolMarshaller protocolMarshaller) {

        if (firewallManagerStatement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(firewallManagerStatement.getManagedRuleGroupStatement(), MANAGEDRULEGROUPSTATEMENT_BINDING);
            protocolMarshaller.marshall(firewallManagerStatement.getRuleGroupReferenceStatement(), RULEGROUPREFERENCESTATEMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
