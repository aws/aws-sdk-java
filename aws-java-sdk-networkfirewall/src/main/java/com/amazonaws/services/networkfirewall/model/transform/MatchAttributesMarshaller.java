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
 * MatchAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MatchAttributesMarshaller {

    private static final MarshallingInfo<List> SOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sources").build();
    private static final MarshallingInfo<List> DESTINATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Destinations").build();
    private static final MarshallingInfo<List> SOURCEPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourcePorts").build();
    private static final MarshallingInfo<List> DESTINATIONPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPorts").build();
    private static final MarshallingInfo<List> PROTOCOLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocols").build();
    private static final MarshallingInfo<List> TCPFLAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TCPFlags").build();

    private static final MatchAttributesMarshaller instance = new MatchAttributesMarshaller();

    public static MatchAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MatchAttributes matchAttributes, ProtocolMarshaller protocolMarshaller) {

        if (matchAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(matchAttributes.getSources(), SOURCES_BINDING);
            protocolMarshaller.marshall(matchAttributes.getDestinations(), DESTINATIONS_BINDING);
            protocolMarshaller.marshall(matchAttributes.getSourcePorts(), SOURCEPORTS_BINDING);
            protocolMarshaller.marshall(matchAttributes.getDestinationPorts(), DESTINATIONPORTS_BINDING);
            protocolMarshaller.marshall(matchAttributes.getProtocols(), PROTOCOLS_BINDING);
            protocolMarshaller.marshall(matchAttributes.getTCPFlags(), TCPFLAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
