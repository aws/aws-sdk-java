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
package com.amazonaws.services.outposts.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectionDetailsMarshaller {

    private static final MarshallingInfo<String> CLIENTPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientPublicKey").build();
    private static final MarshallingInfo<String> SERVERPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerPublicKey").build();
    private static final MarshallingInfo<String> SERVERENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerEndpoint").build();
    private static final MarshallingInfo<String> CLIENTTUNNELADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientTunnelAddress").build();
    private static final MarshallingInfo<String> SERVERTUNNELADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerTunnelAddress").build();
    private static final MarshallingInfo<List> ALLOWEDIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AllowedIps").build();

    private static final ConnectionDetailsMarshaller instance = new ConnectionDetailsMarshaller();

    public static ConnectionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectionDetails connectionDetails, ProtocolMarshaller protocolMarshaller) {

        if (connectionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectionDetails.getClientPublicKey(), CLIENTPUBLICKEY_BINDING);
            protocolMarshaller.marshall(connectionDetails.getServerPublicKey(), SERVERPUBLICKEY_BINDING);
            protocolMarshaller.marshall(connectionDetails.getServerEndpoint(), SERVERENDPOINT_BINDING);
            protocolMarshaller.marshall(connectionDetails.getClientTunnelAddress(), CLIENTTUNNELADDRESS_BINDING);
            protocolMarshaller.marshall(connectionDetails.getServerTunnelAddress(), SERVERTUNNELADDRESS_BINDING);
            protocolMarshaller.marshall(connectionDetails.getAllowedIps(), ALLOWEDIPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
