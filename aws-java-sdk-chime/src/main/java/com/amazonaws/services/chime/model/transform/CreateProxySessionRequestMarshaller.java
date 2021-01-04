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
package com.amazonaws.services.chime.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateProxySessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateProxySessionRequestMarshaller {

    private static final MarshallingInfo<String> VOICECONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("voiceConnectorId").build();
    private static final MarshallingInfo<List> PARTICIPANTPHONENUMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantPhoneNumbers").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Integer> EXPIRYMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiryMinutes").build();
    private static final MarshallingInfo<List> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Capabilities").build();
    private static final MarshallingInfo<String> NUMBERSELECTIONBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberSelectionBehavior").build();
    private static final MarshallingInfo<String> GEOMATCHLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeoMatchLevel").build();
    private static final MarshallingInfo<StructuredPojo> GEOMATCHPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeoMatchParams").build();

    private static final CreateProxySessionRequestMarshaller instance = new CreateProxySessionRequestMarshaller();

    public static CreateProxySessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateProxySessionRequest createProxySessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createProxySessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createProxySessionRequest.getVoiceConnectorId(), VOICECONNECTORID_BINDING);
            protocolMarshaller.marshall(createProxySessionRequest.getParticipantPhoneNumbers(), PARTICIPANTPHONENUMBERS_BINDING);
            protocolMarshaller.marshall(createProxySessionRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createProxySessionRequest.getExpiryMinutes(), EXPIRYMINUTES_BINDING);
            protocolMarshaller.marshall(createProxySessionRequest.getCapabilities(), CAPABILITIES_BINDING);
            protocolMarshaller.marshall(createProxySessionRequest.getNumberSelectionBehavior(), NUMBERSELECTIONBEHAVIOR_BINDING);
            protocolMarshaller.marshall(createProxySessionRequest.getGeoMatchLevel(), GEOMATCHLEVEL_BINDING);
            protocolMarshaller.marshall(createProxySessionRequest.getGeoMatchParams(), GEOMATCHPARAMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
