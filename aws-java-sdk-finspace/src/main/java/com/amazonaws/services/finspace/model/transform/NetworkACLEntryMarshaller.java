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
package com.amazonaws.services.finspace.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkACLEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkACLEntryMarshaller {

    private static final MarshallingInfo<Integer> RULENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleNumber").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<String> RULEACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleAction").build();
    private static final MarshallingInfo<StructuredPojo> PORTRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portRange").build();
    private static final MarshallingInfo<StructuredPojo> ICMPTYPECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("icmpTypeCode").build();
    private static final MarshallingInfo<String> CIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cidrBlock").build();

    private static final NetworkACLEntryMarshaller instance = new NetworkACLEntryMarshaller();

    public static NetworkACLEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkACLEntry networkACLEntry, ProtocolMarshaller protocolMarshaller) {

        if (networkACLEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkACLEntry.getRuleNumber(), RULENUMBER_BINDING);
            protocolMarshaller.marshall(networkACLEntry.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(networkACLEntry.getRuleAction(), RULEACTION_BINDING);
            protocolMarshaller.marshall(networkACLEntry.getPortRange(), PORTRANGE_BINDING);
            protocolMarshaller.marshall(networkACLEntry.getIcmpTypeCode(), ICMPTYPECODE_BINDING);
            protocolMarshaller.marshall(networkACLEntry.getCidrBlock(), CIDRBLOCK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
