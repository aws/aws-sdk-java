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
 * SecurityGroupRuleDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SecurityGroupRuleDescriptionMarshaller {

    private static final MarshallingInfo<String> IPV4RANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IPV4Range").build();
    private static final MarshallingInfo<String> IPV6RANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IPV6Range").build();
    private static final MarshallingInfo<String> PREFIXLISTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrefixListId").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocol").build();
    private static final MarshallingInfo<Long> FROMPORT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FromPort").build();
    private static final MarshallingInfo<Long> TOPORT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ToPort").build();

    private static final SecurityGroupRuleDescriptionMarshaller instance = new SecurityGroupRuleDescriptionMarshaller();

    public static SecurityGroupRuleDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SecurityGroupRuleDescription securityGroupRuleDescription, ProtocolMarshaller protocolMarshaller) {

        if (securityGroupRuleDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(securityGroupRuleDescription.getIPV4Range(), IPV4RANGE_BINDING);
            protocolMarshaller.marshall(securityGroupRuleDescription.getIPV6Range(), IPV6RANGE_BINDING);
            protocolMarshaller.marshall(securityGroupRuleDescription.getPrefixListId(), PREFIXLISTID_BINDING);
            protocolMarshaller.marshall(securityGroupRuleDescription.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(securityGroupRuleDescription.getFromPort(), FROMPORT_BINDING);
            protocolMarshaller.marshall(securityGroupRuleDescription.getToPort(), TOPORT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
