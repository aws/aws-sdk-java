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
package com.amazonaws.services.fms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkAclEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkAclEntryMarshaller {

    private static final MarshallingInfo<StructuredPojo> ICMPTYPECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IcmpTypeCode").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocol").build();
    private static final MarshallingInfo<StructuredPojo> PORTRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PortRange").build();
    private static final MarshallingInfo<String> CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CidrBlock").build();
    private static final MarshallingInfo<String> IPV6CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ipv6CidrBlock").build();
    private static final MarshallingInfo<String> RULEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleAction").build();
    private static final MarshallingInfo<Boolean> EGRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Egress").build();

    private static final NetworkAclEntryMarshaller instance = new NetworkAclEntryMarshaller();

    public static NetworkAclEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkAclEntry networkAclEntry, ProtocolMarshaller protocolMarshaller) {

        if (networkAclEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkAclEntry.getIcmpTypeCode(), ICMPTYPECODE_BINDING);
            protocolMarshaller.marshall(networkAclEntry.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(networkAclEntry.getPortRange(), PORTRANGE_BINDING);
            protocolMarshaller.marshall(networkAclEntry.getCidrBlock(), CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(networkAclEntry.getIpv6CidrBlock(), IPV6CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(networkAclEntry.getRuleAction(), RULEACTION_BINDING);
            protocolMarshaller.marshall(networkAclEntry.getEgress(), EGRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
