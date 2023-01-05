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
 * FirewallPolicyDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FirewallPolicyDetailsMarshaller {

    private static final MarshallingInfo<List> STATEFULRULEGROUPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatefulRuleGroupReferences").build();
    private static final MarshallingInfo<List> STATELESSCUSTOMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessCustomActions").build();
    private static final MarshallingInfo<List> STATELESSDEFAULTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessDefaultActions").build();
    private static final MarshallingInfo<List> STATELESSFRAGMENTDEFAULTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessFragmentDefaultActions").build();
    private static final MarshallingInfo<List> STATELESSRULEGROUPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessRuleGroupReferences").build();

    private static final FirewallPolicyDetailsMarshaller instance = new FirewallPolicyDetailsMarshaller();

    public static FirewallPolicyDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FirewallPolicyDetails firewallPolicyDetails, ProtocolMarshaller protocolMarshaller) {

        if (firewallPolicyDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(firewallPolicyDetails.getStatefulRuleGroupReferences(), STATEFULRULEGROUPREFERENCES_BINDING);
            protocolMarshaller.marshall(firewallPolicyDetails.getStatelessCustomActions(), STATELESSCUSTOMACTIONS_BINDING);
            protocolMarshaller.marshall(firewallPolicyDetails.getStatelessDefaultActions(), STATELESSDEFAULTACTIONS_BINDING);
            protocolMarshaller.marshall(firewallPolicyDetails.getStatelessFragmentDefaultActions(), STATELESSFRAGMENTDEFAULTACTIONS_BINDING);
            protocolMarshaller.marshall(firewallPolicyDetails.getStatelessRuleGroupReferences(), STATELESSRULEGROUPREFERENCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
