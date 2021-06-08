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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContactMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContactMarshaller {

    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailAddress").build();
    private static final MarshallingInfo<List> TOPICPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopicPreferences").build();
    private static final MarshallingInfo<List> TOPICDEFAULTPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopicDefaultPreferences").build();
    private static final MarshallingInfo<Boolean> UNSUBSCRIBEALL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnsubscribeAll").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTimestamp").timestampFormat("unixTimestamp").build();

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
            protocolMarshaller.marshall(contact.getEmailAddress(), EMAILADDRESS_BINDING);
            protocolMarshaller.marshall(contact.getTopicPreferences(), TOPICPREFERENCES_BINDING);
            protocolMarshaller.marshall(contact.getTopicDefaultPreferences(), TOPICDEFAULTPREFERENCES_BINDING);
            protocolMarshaller.marshall(contact.getUnsubscribeAll(), UNSUBSCRIBEALL_BINDING);
            protocolMarshaller.marshall(contact.getLastUpdatedTimestamp(), LASTUPDATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
