/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartWebRTCContactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartWebRTCContactRequestMarshaller {

    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> CONTACTFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactFlowId").build();
    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<StructuredPojo> ALLOWEDCAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedCapabilities").build();
    private static final MarshallingInfo<StructuredPojo> PARTICIPANTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantDetails").build();
    private static final MarshallingInfo<String> RELATEDCONTACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelatedContactId").build();
    private static final MarshallingInfo<Map> REFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("References").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final StartWebRTCContactRequestMarshaller instance = new StartWebRTCContactRequestMarshaller();

    public static StartWebRTCContactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartWebRTCContactRequest startWebRTCContactRequest, ProtocolMarshaller protocolMarshaller) {

        if (startWebRTCContactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startWebRTCContactRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getContactFlowId(), CONTACTFLOWID_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getAllowedCapabilities(), ALLOWEDCAPABILITIES_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getParticipantDetails(), PARTICIPANTDETAILS_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getRelatedContactId(), RELATEDCONTACTID_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getReferences(), REFERENCES_BINDING);
            protocolMarshaller.marshall(startWebRTCContactRequest.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
