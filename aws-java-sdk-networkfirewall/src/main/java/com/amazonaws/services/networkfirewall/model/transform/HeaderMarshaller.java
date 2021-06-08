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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HeaderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HeaderMarshaller {

    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Protocol").build();
    private static final MarshallingInfo<String> SOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Source").build();
    private static final MarshallingInfo<String> SOURCEPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourcePort").build();
    private static final MarshallingInfo<String> DIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Direction").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();
    private static final MarshallingInfo<String> DESTINATIONPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPort").build();

    private static final HeaderMarshaller instance = new HeaderMarshaller();

    public static HeaderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Header header, ProtocolMarshaller protocolMarshaller) {

        if (header == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(header.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(header.getSource(), SOURCE_BINDING);
            protocolMarshaller.marshall(header.getSourcePort(), SOURCEPORT_BINDING);
            protocolMarshaller.marshall(header.getDirection(), DIRECTION_BINDING);
            protocolMarshaller.marshall(header.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(header.getDestinationPort(), DESTINATIONPORT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
