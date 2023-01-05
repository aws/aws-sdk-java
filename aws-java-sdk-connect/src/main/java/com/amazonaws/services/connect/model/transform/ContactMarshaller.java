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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContactMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContactMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> INITIALCONTACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitialContactId").build();
    private static final MarshallingInfo<String> PREVIOUSCONTACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousContactId").build();
    private static final MarshallingInfo<String> INITIATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitiationMethod").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Channel").build();
    private static final MarshallingInfo<StructuredPojo> QUEUEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueueInfo").build();
    private static final MarshallingInfo<StructuredPojo> AGENTINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentInfo").build();
    private static final MarshallingInfo<java.util.Date> INITIATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitiationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DISCONNECTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisconnectTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> SCHEDULEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledTimestamp").timestampFormat("unixTimestamp").build();

    private static final ContactMarshaller instance = new ContactMarshaller();

    public static ContactMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Contact contact, ProtocolMarshaller protocolMarshaller) {

        if (contact == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(contact.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(contact.getId(), ID_BINDING);
            protocolMarshaller.marshall(contact.getInitialContactId(), INITIALCONTACTID_BINDING);
            protocolMarshaller.marshall(contact.getPreviousContactId(), PREVIOUSCONTACTID_BINDING);
            protocolMarshaller.marshall(contact.getInitiationMethod(), INITIATIONMETHOD_BINDING);
            protocolMarshaller.marshall(contact.getName(), NAME_BINDING);
            protocolMarshaller.marshall(contact.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(contact.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(contact.getQueueInfo(), QUEUEINFO_BINDING);
            protocolMarshaller.marshall(contact.getAgentInfo(), AGENTINFO_BINDING);
            protocolMarshaller.marshall(contact.getInitiationTimestamp(), INITIATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(contact.getDisconnectTimestamp(), DISCONNECTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(contact.getLastUpdateTimestamp(), LASTUPDATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(contact.getScheduledTimestamp(), SCHEDULEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
