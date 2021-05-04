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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2NetworkAclEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2NetworkAclEntryMarshaller {

    private static final MarshallingInfo<String> CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CidrBlock").build();
    private static final MarshallingInfo<Boolean> EGRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Egress").build();
    private static final MarshallingInfo<StructuredPojo> ICMPTYPECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IcmpTypeCode").build();
    private static final MarshallingInfo<String> IPV6CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ipv6CidrBlock").build();
    private static final MarshallingInfo<StructuredPojo> PORTRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PortRange").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocol").build();
    private static final MarshallingInfo<String> RULEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleAction").build();
    private static final MarshallingInfo<Integer> RULENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleNumber").build();

    private static final AwsEc2NetworkAclEntryMarshaller instance = new AwsEc2NetworkAclEntryMarshaller();

    public static AwsEc2NetworkAclEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2NetworkAclEntry awsEc2NetworkAclEntry, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2NetworkAclEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getCidrBlock(), CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getEgress(), EGRESS_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getIcmpTypeCode(), ICMPTYPECODE_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getIpv6CidrBlock(), IPV6CIDRBLOCK_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getPortRange(), PORTRANGE_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getRuleAction(), RULEACTION_BINDING);
            protocolMarshaller.marshall(awsEc2NetworkAclEntry.getRuleNumber(), RULENUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
