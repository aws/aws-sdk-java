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
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BGPPeerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BGPPeerMarshaller {

    private static final MarshallingInfo<String> BGPPEERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bgpPeerId").build();
    private static final MarshallingInfo<Integer> ASN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("asn").build();
    private static final MarshallingInfo<String> AUTHKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authKey").build();
    private static final MarshallingInfo<String> ADDRESSFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addressFamily").build();
    private static final MarshallingInfo<String> AMAZONADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amazonAddress").build();
    private static final MarshallingInfo<String> CUSTOMERADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerAddress").build();
    private static final MarshallingInfo<String> BGPPEERSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bgpPeerState").build();
    private static final MarshallingInfo<String> BGPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bgpStatus").build();
    private static final MarshallingInfo<String> AWSDEVICEV2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsDeviceV2").build();

    private static final BGPPeerMarshaller instance = new BGPPeerMarshaller();

    public static BGPPeerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BGPPeer bGPPeer, ProtocolMarshaller protocolMarshaller) {

        if (bGPPeer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(bGPPeer.getBgpPeerId(), BGPPEERID_BINDING);
            protocolMarshaller.marshall(bGPPeer.getAsn(), ASN_BINDING);
            protocolMarshaller.marshall(bGPPeer.getAuthKey(), AUTHKEY_BINDING);
            protocolMarshaller.marshall(bGPPeer.getAddressFamily(), ADDRESSFAMILY_BINDING);
            protocolMarshaller.marshall(bGPPeer.getAmazonAddress(), AMAZONADDRESS_BINDING);
            protocolMarshaller.marshall(bGPPeer.getCustomerAddress(), CUSTOMERADDRESS_BINDING);
            protocolMarshaller.marshall(bGPPeer.getBgpPeerState(), BGPPEERSTATE_BINDING);
            protocolMarshaller.marshall(bGPPeer.getBgpStatus(), BGPSTATUS_BINDING);
            protocolMarshaller.marshall(bGPPeer.getAwsDeviceV2(), AWSDEVICEV2_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
