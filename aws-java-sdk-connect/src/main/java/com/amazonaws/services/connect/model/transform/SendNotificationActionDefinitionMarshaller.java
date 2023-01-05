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
 * SendNotificationActionDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendNotificationActionDefinitionMarshaller {

    private static final MarshallingInfo<String> DELIVERYMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryMethod").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Content").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentType").build();
    private static final MarshallingInfo<StructuredPojo> RECIPIENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Recipient").build();

    private static final SendNotificationActionDefinitionMarshaller instance = new SendNotificationActionDefinitionMarshaller();

    public static SendNotificationActionDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendNotificationActionDefinition sendNotificationActionDefinition, ProtocolMarshaller protocolMarshaller) {

        if (sendNotificationActionDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendNotificationActionDefinition.getDeliveryMethod(), DELIVERYMETHOD_BINDING);
            protocolMarshaller.marshall(sendNotificationActionDefinition.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(sendNotificationActionDefinition.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(sendNotificationActionDefinition.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(sendNotificationActionDefinition.getRecipient(), RECIPIENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
