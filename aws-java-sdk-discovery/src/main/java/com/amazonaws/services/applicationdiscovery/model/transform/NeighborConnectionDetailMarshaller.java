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
package com.amazonaws.services.applicationdiscovery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NeighborConnectionDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NeighborConnectionDetailMarshaller {

    private static final MarshallingInfo<String> SOURCESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerId").build();
    private static final MarshallingInfo<String> DESTINATIONSERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationServerId").build();
    private static final MarshallingInfo<Integer> DESTINATIONPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationPort").build();
    private static final MarshallingInfo<String> TRANSPORTPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transportProtocol").build();
    private static final MarshallingInfo<Long> CONNECTIONSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionsCount").build();

    private static final NeighborConnectionDetailMarshaller instance = new NeighborConnectionDetailMarshaller();

    public static NeighborConnectionDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NeighborConnectionDetail neighborConnectionDetail, ProtocolMarshaller protocolMarshaller) {

        if (neighborConnectionDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(neighborConnectionDetail.getSourceServerId(), SOURCESERVERID_BINDING);
            protocolMarshaller.marshall(neighborConnectionDetail.getDestinationServerId(), DESTINATIONSERVERID_BINDING);
            protocolMarshaller.marshall(neighborConnectionDetail.getDestinationPort(), DESTINATIONPORT_BINDING);
            protocolMarshaller.marshall(neighborConnectionDetail.getTransportProtocol(), TRANSPORTPROTOCOL_BINDING);
            protocolMarshaller.marshall(neighborConnectionDetail.getConnectionsCount(), CONNECTIONSCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
