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
package com.amazonaws.services.sqs.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sqs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendMessageBatchRequestEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendMessageBatchRequestEntryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> MESSAGEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageBody").build();
    private static final MarshallingInfo<Integer> DELAYSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DelaySeconds").build();
    private static final MarshallingInfo<Map> MESSAGEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageAttributes").build();
    private static final MarshallingInfo<Map> MESSAGESYSTEMATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageSystemAttributes").build();
    private static final MarshallingInfo<String> MESSAGEDEDUPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageDeduplicationId").build();
    private static final MarshallingInfo<String> MESSAGEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageGroupId").build();

    private static final SendMessageBatchRequestEntryMarshaller instance = new SendMessageBatchRequestEntryMarshaller();

    public static SendMessageBatchRequestEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendMessageBatchRequestEntry sendMessageBatchRequestEntry, ProtocolMarshaller protocolMarshaller) {

        if (sendMessageBatchRequestEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendMessageBatchRequestEntry.getId(), ID_BINDING);
            protocolMarshaller.marshall(sendMessageBatchRequestEntry.getMessageBody(), MESSAGEBODY_BINDING);
            protocolMarshaller.marshall(sendMessageBatchRequestEntry.getDelaySeconds(), DELAYSECONDS_BINDING);
            protocolMarshaller.marshall(sendMessageBatchRequestEntry.getMessageAttributes(), MESSAGEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(sendMessageBatchRequestEntry.getMessageSystemAttributes(), MESSAGESYSTEMATTRIBUTES_BINDING);
            protocolMarshaller.marshall(sendMessageBatchRequestEntry.getMessageDeduplicationId(), MESSAGEDEDUPLICATIONID_BINDING);
            protocolMarshaller.marshall(sendMessageBatchRequestEntry.getMessageGroupId(), MESSAGEGROUPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
