/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkProfileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkProfileMarshaller {

    private static final MarshallingInfo<String> NETWORKPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkProfileArn").build();
    private static final MarshallingInfo<String> NETWORKPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkProfileName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> SSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ssid").build();
    private static final MarshallingInfo<String> SECURITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityType").build();
    private static final MarshallingInfo<String> EAPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EapMethod").build();
    private static final MarshallingInfo<String> CURRENTPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentPassword").build();
    private static final MarshallingInfo<String> NEXTPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextPassword").build();
    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityArn").build();
    private static final MarshallingInfo<List> TRUSTANCHORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TrustAnchors").build();

    private static final NetworkProfileMarshaller instance = new NetworkProfileMarshaller();

    public static NetworkProfileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkProfile networkProfile, ProtocolMarshaller protocolMarshaller) {

        if (networkProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkProfile.getNetworkProfileArn(), NETWORKPROFILEARN_BINDING);
            protocolMarshaller.marshall(networkProfile.getNetworkProfileName(), NETWORKPROFILENAME_BINDING);
            protocolMarshaller.marshall(networkProfile.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(networkProfile.getSsid(), SSID_BINDING);
            protocolMarshaller.marshall(networkProfile.getSecurityType(), SECURITYTYPE_BINDING);
            protocolMarshaller.marshall(networkProfile.getEapMethod(), EAPMETHOD_BINDING);
            protocolMarshaller.marshall(networkProfile.getCurrentPassword(), CURRENTPASSWORD_BINDING);
            protocolMarshaller.marshall(networkProfile.getNextPassword(), NEXTPASSWORD_BINDING);
            protocolMarshaller.marshall(networkProfile.getCertificateAuthorityArn(), CERTIFICATEAUTHORITYARN_BINDING);
            protocolMarshaller.marshall(networkProfile.getTrustAnchors(), TRUSTANCHORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
