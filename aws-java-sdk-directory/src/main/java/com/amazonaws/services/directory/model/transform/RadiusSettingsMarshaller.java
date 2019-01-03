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
package com.amazonaws.services.directory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RadiusSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RadiusSettingsMarshaller {

    private static final MarshallingInfo<List> RADIUSSERVERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RadiusServers").build();
    private static final MarshallingInfo<Integer> RADIUSPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RadiusPort").build();
    private static final MarshallingInfo<Integer> RADIUSTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RadiusTimeout").build();
    private static final MarshallingInfo<Integer> RADIUSRETRIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RadiusRetries").build();
    private static final MarshallingInfo<String> SHAREDSECRET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedSecret").build();
    private static final MarshallingInfo<String> AUTHENTICATIONPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationProtocol").build();
    private static final MarshallingInfo<String> DISPLAYLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayLabel").build();
    private static final MarshallingInfo<Boolean> USESAMEUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseSameUsername").build();

    private static final RadiusSettingsMarshaller instance = new RadiusSettingsMarshaller();

    public static RadiusSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RadiusSettings radiusSettings, ProtocolMarshaller protocolMarshaller) {

        if (radiusSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(radiusSettings.getRadiusServers(), RADIUSSERVERS_BINDING);
            protocolMarshaller.marshall(radiusSettings.getRadiusPort(), RADIUSPORT_BINDING);
            protocolMarshaller.marshall(radiusSettings.getRadiusTimeout(), RADIUSTIMEOUT_BINDING);
            protocolMarshaller.marshall(radiusSettings.getRadiusRetries(), RADIUSRETRIES_BINDING);
            protocolMarshaller.marshall(radiusSettings.getSharedSecret(), SHAREDSECRET_BINDING);
            protocolMarshaller.marshall(radiusSettings.getAuthenticationProtocol(), AUTHENTICATIONPROTOCOL_BINDING);
            protocolMarshaller.marshall(radiusSettings.getDisplayLabel(), DISPLAYLABEL_BINDING);
            protocolMarshaller.marshall(radiusSettings.getUseSameUsername(), USESAMEUSERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
