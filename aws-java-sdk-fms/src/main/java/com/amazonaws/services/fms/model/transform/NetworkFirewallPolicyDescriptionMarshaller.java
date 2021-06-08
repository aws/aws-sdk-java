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
 * NetworkFirewallPolicyDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkFirewallPolicyDescriptionMarshaller {

    private static final MarshallingInfo<List> STATELESSRULEGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessRuleGroups").build();
    private static final MarshallingInfo<List> STATELESSDEFAULTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessDefaultActions").build();
    private static final MarshallingInfo<List> STATELESSFRAGMENTDEFAULTACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessFragmentDefaultActions").build();
    private static final MarshallingInfo<List> STATELESSCUSTOMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatelessCustomActions").build();
    private static final MarshallingInfo<List> STATEFULRULEGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatefulRuleGroups").build();

    private static final NetworkFirewallPolicyDescriptionMarshaller instance = new NetworkFirewallPolicyDescriptionMarshaller();

    public static NetworkFirewallPolicyDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkFirewallPolicyDescription networkFirewallPolicyDescription, ProtocolMarshaller protocolMarshaller) {

        if (networkFirewallPolicyDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkFirewallPolicyDescription.getStatelessRuleGroups(), STATELESSRULEGROUPS_BINDING);
            protocolMarshaller.marshall(networkFirewallPolicyDescription.getStatelessDefaultActions(), STATELESSDEFAULTACTIONS_BINDING);
            protocolMarshaller.marshall(networkFirewallPolicyDescription.getStatelessFragmentDefaultActions(), STATELESSFRAGMENTDEFAULTACTIONS_BINDING);
            protocolMarshaller.marshall(networkFirewallPolicyDescription.getStatelessCustomActions(), STATELESSCUSTOMACTIONS_BINDING);
            protocolMarshaller.marshall(networkFirewallPolicyDescription.getStatefulRuleGroups(), STATEFULRULEGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
