/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * NetworkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkMarshaller {

    private static final MarshallingInfo<String> DIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Direction").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocol").build();
    private static final MarshallingInfo<String> SOURCEIPV4_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceIpV4").build();
    private static final MarshallingInfo<String> SOURCEIPV6_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceIpV6").build();
    private static final MarshallingInfo<Integer> SOURCEPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourcePort").build();
    private static final MarshallingInfo<String> SOURCEDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceDomain").build();
    private static final MarshallingInfo<String> SOURCEMAC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceMac").build();
    private static final MarshallingInfo<String> DESTINATIONIPV4_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIpV4").build();
    private static final MarshallingInfo<String> DESTINATIONIPV6_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIpV6").build();
    private static final MarshallingInfo<Integer> DESTINATIONPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPort").build();
    private static final MarshallingInfo<String> DESTINATIONDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationDomain").build();

    private static final NetworkMarshaller instance = new NetworkMarshaller();

    public static NetworkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Network network, ProtocolMarshaller protocolMarshaller) {

        if (network == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(network.getDirection(), DIRECTION_BINDING);
            protocolMarshaller.marshall(network.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(network.getSourceIpV4(), SOURCEIPV4_BINDING);
            protocolMarshaller.marshall(network.getSourceIpV6(), SOURCEIPV6_BINDING);
            protocolMarshaller.marshall(network.getSourcePort(), SOURCEPORT_BINDING);
            protocolMarshaller.marshall(network.getSourceDomain(), SOURCEDOMAIN_BINDING);
            protocolMarshaller.marshall(network.getSourceMac(), SOURCEMAC_BINDING);
            protocolMarshaller.marshall(network.getDestinationIpV4(), DESTINATIONIPV4_BINDING);
            protocolMarshaller.marshall(network.getDestinationIpV6(), DESTINATIONIPV6_BINDING);
            protocolMarshaller.marshall(network.getDestinationPort(), DESTINATIONPORT_BINDING);
            protocolMarshaller.marshall(network.getDestinationDomain(), DESTINATIONDOMAIN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
