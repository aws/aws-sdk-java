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
 * FirewallPolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FirewallPolicyMarshaller {

    private static final MarshallingInfo<List> STATELESSRULEGROUPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessRuleGroupReferences").build();
    private static final MarshallingInfo<List> STATELESSDEFAULTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessDefaultActions").build();
    private static final MarshallingInfo<List> STATELESSFRAGMENTDEFAULTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessFragmentDefaultActions").build();
    private static final MarshallingInfo<List> STATELESSCUSTOMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessCustomActions").build();
    private static final MarshallingInfo<List> STATEFULRULEGROUPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatefulRuleGroupReferences").build();

    private static final FirewallPolicyMarshaller instance = new FirewallPolicyMarshaller();

    public static FirewallPolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FirewallPolicy firewallPolicy, ProtocolMarshaller protocolMarshaller) {

        if (firewallPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(firewallPolicy.getStatelessRuleGroupReferences(), STATELESSRULEGROUPREFERENCES_BINDING);
            protocolMarshaller.marshall(firewallPolicy.getStatelessDefaultActions(), STATELESSDEFAULTACTIONS_BINDING);
            protocolMarshaller.marshall(firewallPolicy.getStatelessFragmentDefaultActions(), STATELESSFRAGMENTDEFAULTACTIONS_BINDING);
            protocolMarshaller.marshall(firewallPolicy.getStatelessCustomActions(), STATELESSCUSTOMACTIONS_BINDING);
            protocolMarshaller.marshall(firewallPolicy.getStatefulRuleGroupReferences(), STATEFULRULEGROUPREFERENCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
