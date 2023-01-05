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
package com.amazonaws.services.networkmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectPeerBgpConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectPeerBgpConfigurationMarshaller {

    private static final MarshallingInfo<Long> CORENETWORKASN_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreNetworkAsn").build();
    private static final MarshallingInfo<Long> PEERASN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PeerAsn").build();
    private static final MarshallingInfo<String> CORENETWORKADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreNetworkAddress").build();
    private static final MarshallingInfo<String> PEERADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeerAddress").build();

    private static final ConnectPeerBgpConfigurationMarshaller instance = new ConnectPeerBgpConfigurationMarshaller();

    public static ConnectPeerBgpConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectPeerBgpConfiguration connectPeerBgpConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (connectPeerBgpConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectPeerBgpConfiguration.getCoreNetworkAsn(), CORENETWORKASN_BINDING);
            protocolMarshaller.marshall(connectPeerBgpConfiguration.getPeerAsn(), PEERASN_BINDING);
            protocolMarshaller.marshall(connectPeerBgpConfiguration.getCoreNetworkAddress(), CORENETWORKADDRESS_BINDING);
            protocolMarshaller.marshall(connectPeerBgpConfiguration.getPeerAddress(), PEERADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
