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
 * ProxySessionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProxySessionMarshaller {

    private static final MarshallingInfo<String> VOICECONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceConnectorId").build();
    private static final MarshallingInfo<String> PROXYSESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProxySessionId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Integer> EXPIRYMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiryMinutes").build();
    private static final MarshallingInfo<List> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Capabilities").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> ENDEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<List> PARTICIPANTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Participants").build();
    private static final MarshallingInfo<String> NUMBERSELECTIONBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberSelectionBehavior").build();
    private static final MarshallingInfo<String> GEOMATCHLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeoMatchLevel").build();
    private static final MarshallingInfo<StructuredPojo> GEOMATCHPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeoMatchParams").build();

    private static final ProxySessionMarshaller instance = new ProxySessionMarshaller();

    public static ProxySessionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProxySession proxySession, ProtocolMarshaller protocolMarshaller) {

        if (proxySession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(proxySession.getVoiceConnectorId(), VOICECONNECTORID_BINDING);
            protocolMarshaller.marshall(proxySession.getProxySessionId(), PROXYSESSIONID_BINDING);
            protocolMarshaller.marshall(proxySession.getName(), NAME_BINDING);
            protocolMarshaller.marshall(proxySession.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(proxySession.getExpiryMinutes(), EXPIRYMINUTES_BINDING);
            protocolMarshaller.marshall(proxySession.getCapabilities(), CAPABILITIES_BINDING);
            protocolMarshaller.marshall(proxySession.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(proxySession.getUpdatedTimestamp(), UPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(proxySession.getEndedTimestamp(), ENDEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(proxySession.getParticipants(), PARTICIPANTS_BINDING);
            protocolMarshaller.marshall(proxySession.getNumberSelectionBehavior(), NUMBERSELECTIONBEHAVIOR_BINDING);
            protocolMarshaller.marshall(proxySession.getGeoMatchLevel(), GEOMATCHLEVEL_BINDING);
            protocolMarshaller.marshall(proxySession.getGeoMatchParams(), GEOMATCHPARAMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
