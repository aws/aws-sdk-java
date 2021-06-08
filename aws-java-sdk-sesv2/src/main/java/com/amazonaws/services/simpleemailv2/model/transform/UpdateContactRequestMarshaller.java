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
 * UpdateContactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateContactRequestMarshaller {

    private static final MarshallingInfo<String> CONTACTLISTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ContactListName").build();
    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("EmailAddress").build();
    private static final MarshallingInfo<List> TOPICPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopicPreferences").build();
    private static final MarshallingInfo<Boolean> UNSUBSCRIBEALL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnsubscribeAll").build();
    private static final MarshallingInfo<String> ATTRIBUTESDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributesData").build();

    private static final UpdateContactRequestMarshaller instance = new UpdateContactRequestMarshaller();

    public static UpdateContactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateContactRequest updateContactRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateContactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateContactRequest.getContactListName(), CONTACTLISTNAME_BINDING);
            protocolMarshaller.marshall(updateContactRequest.getEmailAddress(), EMAILADDRESS_BINDING);
            protocolMarshaller.marshall(updateContactRequest.getTopicPreferences(), TOPICPREFERENCES_BINDING);
            protocolMarshaller.marshall(updateContactRequest.getUnsubscribeAll(), UNSUBSCRIBEALL_BINDING);
            protocolMarshaller.marshall(updateContactRequest.getAttributesData(), ATTRIBUTESDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
